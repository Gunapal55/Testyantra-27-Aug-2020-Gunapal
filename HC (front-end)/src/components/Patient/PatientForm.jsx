import React, { Component } from 'react';
import { Button, Form, Row, Col } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import axios from 'axios';
import '../Patient/for.css';

export default function PatientForm(props){
  
  const handleSubmitClick = (e) => {
    // props.history.push('/doctors');  
    e.preventDefault();

    let object = {};
    let formData=new FormData(e.target);
    formData.forEach((value,key)=>{
        object[key] = value;
        
    } 
    );

    console.log("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    console.log(props.location.userData);
        console.log("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    

    
    object.user=props.location.userData;
    // console.log(object);

    // let data = JSON.stringify(object); 
    console.log(JSON.stringify(object)); 


    const config = {     

        headers: { 'content-type' : "application/json" }
    }

    axios.post('http://localhost:8080/bookmydoctorapp/patient/register',JSON.stringify(object),config).then((response)=>{
         console.log(response);
       })   
       .catch((error)=>{
         console.log(error);
      });
    }

  function hm(){
      // props.history.push('/doctors')
  }
  
        return (

<div className="col-md-4 offset-4 card card-body mt-5">
                
<form onSubmit={handleSubmitClick} className="cd">
    <h3 className="ml-5 pl-4">Appointment Form</h3>

    <div className="form-group">
        <label>Name</label>
        <input type="text" className="form-control" name="patientName" placeholder="Enter your name"  required/>
    </div>
 
    <div className="form-group">
        <label>Age</label>
        <input type="number" className="form-control" name="patientAge" placeholder="Enter your age"  required/>
    </div>

    <div className="form-group">
      <label className="mr-3">Gender</label>
        <input type="radio" id="male" value="Male" name="gender" className="mr-2" checked/>
          <label htmlFor="male" className="mr-4">Male</label> 
        <input type="radio" id="female" value="Female" name="gender" className="mr-2"/>
        <label htmlFor="female"> Female</label>
    </div>

    <div className="form-group">
        <label>Symptoms (optional)</label>
        <textarea  className="form-control" name="patinetPhoneNumber" placeholder="Describe your symptoms here..." />
    </div>

 <div className="form-group"> 

        <Form.Group  controlId="formGridCity">
          <Form.Label>City</Form.Label>
          <Form.Control as="select" name="patinetPlace"  reauired>
            <option>Bangalore</option>
            <option>Mumbai</option>
            <option>Delhi</option>
            <option>Chennai</option>
            <option>Hyderabad</option>
          </Form.Control>
        </Form.Group>
</div>
<div className="form-group"> 

<Form.Group  controlId="formGridCity">
  <Form.Label>Choose Time-Slot</Form.Label>
  <Form.Control as="select" name="patinetPlace"  reauired>
    <option>Morning 7-11am</option>
    <option>Noon 12-4pm</option>
    <option>Evening 5-9pm</option>
  </Form.Control>
</Form.Group>
</div>


<div>
    <Button variant="outline-primary" type="submit" className="mr-3" >Book Now</Button>
     <Button variant="btn" type= "reset" >Cancel</Button>{' '}
 
 </div>
</form>
</div>

        );
      
    }  