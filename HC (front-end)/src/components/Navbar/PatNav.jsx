import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import {Nav, Navbar, NavDropdown} from 'react-bootstrap';
import './navi.css';
import logo from './HCHd.png';

function PatNav(){

return(
  
  <Navbar collapseOnSelect expand="lg" bg="primary" variant="dark">
  <Navbar.Brand NavLink href='/'><img src={logo}  NavLink href='/' height="30px" width="30px" alt="logo"/> Health-Care</Navbar.Brand>
  <Navbar.Toggle aria-controls="responsive-navbar-nav" />
  <Navbar.Collapse id="responsive-navbar-nav">
    <Nav className="mr-auto">
      <Nav.Link href="/PatientForm">Quick Appointment</Nav.Link>
      <Nav.Link href="/DocForms" >Doctors</Nav.Link>
      <NavDropdown title="More" id="collasible-nav-dropdown">
        <NavDropdown.Item href="#action/3.1">Give Feedback</NavDropdown.Item>
        <NavDropdown.Item href="#action/3.2">Update Profile</NavDropdown.Item>
        <NavDropdown.Item href="#action/3.3">View Appointments</NavDropdown.Item>
      </NavDropdown>
    </Nav>
    <Nav>
      <Nav.Link eventKey={2} href='/Log'>
        Logout
      </Nav.Link>
    </Nav>
  </Navbar.Collapse>
</Navbar>

);
}


export default PatNav;
