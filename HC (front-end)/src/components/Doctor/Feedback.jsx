import React, { Component } from 'react';
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';
import axios from 'axios';
import Alert from 'react-bootstrap/Alert';
import '../Doctor/for.css';

function Feedback(props){

  const handleSubmitClick = (e) => {
    
    e.preventDefault();
    
    let object = {};
    let formData=new FormData(e.target);
    formData.forEach((value,key)=>{
        object[key] = value;
        
    }
    );
    console.log(object);
    let json = JSON.stringify(object); 
    console.log(json); 

    const config = {     
        headers: { 'content-type' : "application/json" }
    }

    axios.post('http://localhost:8080/bookmydoctorapp/patient/rating', json,config).then((response)=>{
         console.log(response);
       })   
       .catch((error)=>{
         console.log(error);
      });
    }
    function hmn(){
      props.history.push('/doctors')
  }
  
  function thk(){
    document.getElementById('awake').style.display="block";
  setInterval(() => {
    props.history.push('/doctors');     
  }, 6000);

}

    return (
      <div className="container">

        <div>
        <div id="awake" className="cen" >
         <Alert variant="success">
             <h2 >Hey thank you for the valuable feedback😊
              <span className="float-right"><button onClick={()=>{document.getElementById('awake').style.display="none"}}>&times;</button></span>
              </h2> </Alert>
      </div>

        </div>


        <h2>Your feedback is very valuable for us</h2> <br />
        <Form onSubmit={handleSubmitClick}>
          <Form.Group controlId="exampleForm.ControlInput1">
            <Form.Label>Doctor Name</Form.Label>
            <Form.Control type="text" name="doctorName" placeholder="" />
          </Form.Group>
          <Form.Group controlId="exampleForm.ControlSelect2" >
            <Form.Label>Give doctor rating</Form.Label>
            <Form.Control as="select" name="rating" required multiple>
              <option>1</option>
              <option>2</option>
              <option>3</option>
              <option>4</option>
              <option>5</option>
            </Form.Control>
          </Form.Group>
          <Form.Group  controlId="exampleForm.ControlTextarea1" >
            <Form.Label>Feedback/Suggestions</Form.Label>
            <Form.Control as="textarea" rows={3} name="feedback"/>
          </Form.Group>
            <Button variant="success" type="submit" className="mr-3" onClick={thk} active>
            Submit</Button>
          <Button variant="danger" type="reset" onClick={hmn} active>
            Cancel</Button>
        </Form>
      </div>
    );
  }


export default Feedback;
