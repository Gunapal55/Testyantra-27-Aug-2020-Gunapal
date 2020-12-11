import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import {Nav, Navbar, NavDropdown} from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import './navi.css';
// import DocForm from './components/Doctor/DocForm';
import { BrowserRouter as Router, Route} from "react-router-dom";
import logo from './HCHd.png';
import DocForm from '../Doctor/DocForm';

function DocNav(){

return(

  <Navbar collapseOnSelect expand="lg" bg="success" variant="dark">
  <Navbar.Brand NavLink href='/'><img src={logo}  NavLink href='/' height="60px" width="160px" alt="logo"/></Navbar.Brand>
  <Navbar.Toggle aria-controls="responsive-navbar-nav" />
  <Navbar.Collapse id="responsive-navbar-nav">
    <Nav className="mr-auto">
      <Nav.Link href="/PatientForm">View Appointments</Nav.Link>
      <Nav.Link NavLink to="/DocForm" >Profile</Nav.Link>
      <NavDropdown title="More" id="collasible-nav-dropdown">
        <NavDropdown.Item href="#action/3.1">View Feedbacks</NavDropdown.Item>
        <NavDropdown.Item href="#action/3.2">Update Profile</NavDropdown.Item>
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


export default DocNav;
