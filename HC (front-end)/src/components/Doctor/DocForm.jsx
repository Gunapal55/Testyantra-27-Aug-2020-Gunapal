import {Form, Col, Button, InputGroup} from 'react-bootstrap';
import  React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../Doctor/for.css';
import axios from 'axios';

function DocForm(props) {
      
    const handleSubmitClick = (e) => {
      props.history.push('/Login'); 
      e.preventDefault();
      console.log("-----xxxxxxxxxx-------===============================================");
      console.log(props.location.userData);    
      console.log("===========xxxxxxxxxxxxxxxxxxxxxxxx===================================================");
       
      let object = {};
      let formData=new FormData(e.target);
      formData.forEach((value,key)=>{
          object[key] = value;
          
      }
      );
      object.user = props.location.userData
      console.log(object);
      let json = JSON.stringify(object); 
      console.log(json); 
console.log("------------===============================================");
console.log(props.location.userData);    
console.log("==============================================================");
      const config = {     
          headers: { 'content-type' : "application/json" }
      }

      axios.post('http://localhost:8080/bookmydoctorapp/doctor/register', json,config)
      .then((response)=>{
           console.log(response);
         })   
         .catch((error)=>{
           console.log(error);
        });
      }
      
      function click(){
        props.history.push('/doctors-home')
    }

    return (
      <div className="container">
      <div className="h1"><h1>Create your profile</h1></div> 
       <Form className="form" onSubmit={handleSubmitClick}>
       <Form.Group controlId="name">
         <Form.Label> Name</Form.Label>
         <Form.Control type="name" placeholder="Enter your name" name="doctorName" />
       </Form.Group>
       <Form.Group controlId="qualification">
         <Form.Label>Qualification</Form.Label>
         <Form.Control type="text" placeholder="Qualification" name="doctorQualification" />
       </Form.Group>
       <Form.Group controlId="specialisation">
         <Form.Label>Specialisation</Form.Label>
         <Form.Control type="text" placeholder="Specialisation" name="doctorSpeacilization" />
       </Form.Group>
       <Form.Group controlId="prcticing">
         <Form.Label>Practicing From</Form.Label>
         <Form.Control type="date" placeholder="Practicing From" name='praticefrom' />
       </Form.Group>
       <div className="btn">
       <Button type="submit" className="mr-3">Submit</Button>
       <Button type="submit" onClick={click}>Cancel</Button></div>
     </Form>
     </div>
   );
    }     

  export default DocForm;