import 'bootstrap/dist/css/bootstrap.min.css';
import React, { Component } from 'react';
import {Nav, Navbar} from 'react-bootstrap';
import './navi.css';
import Welcome from '../Welcome/Welcome';
import Register from '../Register/Register';
import login from '../Login/Login';
import logo from './HCHd.png';
import { BrowserRouter as Router, Route} from "react-router-dom";
import patienthome from '../Dashboard/PatDashboard';
import admin from '../Admin/AdminHome';
import doctor from '../Doctor/DocForm';
import Login from '../Login/Login';
import Footerhc from './Footerhc';
import Health from './Health';
import Terms from './Terms';
import doctors from '../Doctor/ListOfDoctors';
import Patient from '../Patient/PatientHome';
import addPatient from '../Patient/PatientForm';
import Feedback from '../Doctor/Feedback';
import DocForm from '../Doctor/DocForm';
import UpdateDoc from '../Doctor/UpdateDoc';
import DoctorsHome from '../Doctor/DoctorsHome';
import AddHome from '../Admin/AdminHome';
import AddAdmin from '../Admin/AddAdmin';
import AllDocsAdd from '../Admin/AllDocsAdd';
import AllPatAdmin from '../Admin/AllPatAdmin';
import BlockUser from '../Admin/BlockUser';

let isLogged = false;

class Navbarhc extends React.Component{
  constructor(props) {
    super(props);
    this.state = {
        isLoggedIn: false
    }
}

  loginCheck=()=>{
    this.setState({isLoggedIn:true})
}

  
render() {
  return(
      <div>
       <div> 
        <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
        <Navbar.Brand NavLink href='/'><img src={logo}  NavLink href='/' height="" width="120px" alt="logo"/></Navbar.Brand>
        <Navbar.Toggle aria-controls="responsive-navbar-nav" />
        <Navbar.Collapse id="responsive-navbar-nav">
          <Nav className="mr-auto">
            <Nav.Link href="/health" >Health-tips</Nav.Link>
            <Nav.Link href="/terms" >About us</Nav.Link>
          </Nav>
          <Nav>
           {
             !this.state.isLoggedIn && <Nav.Link href="/login" eventKey={2}> 
             <button>SignIn</button>
            </Nav.Link>
           }
          </Nav>
        </Navbar.Collapse>
      </Navbar>
</div>
<Router>
<Route path='/' exact component={Welcome} />
<Route path="/login" render={()=><Login loginCheck={this.loginCheck} />} />
<Route path='/register' exact component={Register} />
<Route path='/patienthome' exact component={patienthome}/>
<Route path='/doctor' exact component={doctor} />
<Route path='/admin' exact component={admin} />
<Route path='/terms' exact component={Terms}/>
<Route path='/health' exact component={Health}/>
<Route path='/welcome-patient' exact component={Health}/>
<Route path='/welcome-doctor' exact component={Health}/>
<Route path='/doctors' exact component={doctors}/>
<Route path='/patient' exact component={Patient}/>
<Route path='/feedback' exact component={Feedback}/>
<Route path='/addpatient' exact component={addPatient}/>
<Route path='/doctor-profile' exact component={DocForm}/>
<Route path='/admin-home' exact component={AddHome}/>
<Route path='/add-admin' exact component={AddAdmin}/>
<Route path='/viewall-doctors' exact component={AllDocsAdd}/>
<Route path='/edit-profile' exact component={UpdateDoc}/>
<Route path='/doctors-home' exact component={DoctorsHome}/>
<Route path='/view-patients' exact component={AllPatAdmin}/>
<Route path='/admin-user' exact component={BlockUser}/>
<Footerhc/>  
</Router>
    
</div>
  
    );
}
}
export default Navbarhc;