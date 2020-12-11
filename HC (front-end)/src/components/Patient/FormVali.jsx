import {Form, Col, Button, InputGroup} from 'react-bootstrap';
import  React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../Patient/for.css';

function FormVali() {
    
    const [validated, setValidated] = useState(false);
  
    const handleSubmit = (event) => {
      const form = event.currentTarget;
      if (form.checkValidity() === false) {
        event.preventDefault();
        event.stopPropagation();
      }
  
      setValidated(true);
    };  
    return (
        <div className="cb">
            <h3 className="head">Patient Form</h3>
      <Form noValidate validated={validated} onSubmit={handleSubmit}>
        <Form.Row>
          <Form.Group as={Col} md="4" controlId="validationCustom01">
            <Form.Label>Name</Form.Label>
            <Form.Control
              required
              type="text"
              placeholder="Name"
            />
            <Form.Control.Feedback>Looks good!</Form.Control.Feedback>
          </Form.Group>
          <Form.Group as={Col} md="3" controlId="validationCustom02">
            <Form.Label>Age</Form.Label>
            <Form.Control
              required
              type="number"
              placeholder="Age"
              defaultValue=""
            />
            <Form.Control.Feedback></Form.Control.Feedback>
          </Form.Group>
          <Form.Group as={Col} md="5" controlId="validationCustomUsername">
            <Form.Label>EmailId</Form.Label>
            <InputGroup>
              <Form.Control
                type="email"
                placeholder="Email-ID"
                aria-describedby="inputGroupPrepend"
                required
              />
              <Form.Control.Feedback type="invalid">
                Please provide vaild email.
              </Form.Control.Feedback>
            </InputGroup>
          </Form.Group>
        </Form.Row>
        <Form.Row>
          <Form.Group as={Col} md="4" controlId="validationCustom03">
            <Form.Label>Location</Form.Label>
            <Form.Control type="text" placeholder="City/Town" required />
            <Form.Control.Feedback type="invalid">
              Please provide a valid city.
            </Form.Control.Feedback>
          </Form.Group>
          <Form.Group as={Col} md="4" controlId="validationCustom04">
            <Form.Label>State</Form.Label>
            <Form.Control type="text" placeholder="State" required />
            <Form.Control.Feedback type="invalid">
              Please provide a valid state.
            </Form.Control.Feedback>
          </Form.Group>
          <Form.Group as={Col} md="4" controlId="validationCustom05">
            <Form.Label>Pincode</Form.Label>
            <Form.Control type="number" placeholder="Pincode" />
            <Form.Control.Feedback type="invalid">
              Please provide a valid Pincode.
            </Form.Control.Feedback>
          </Form.Group>
        </Form.Row>
        <Form.Group>
        </Form.Group>
        <Button type="submit">Submit form</Button>
      </Form>
      </div>
    );
    }     

  export default FormVali;