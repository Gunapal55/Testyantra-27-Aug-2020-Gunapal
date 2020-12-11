import React from 'react';
import { Component } from 'react';
import Table from 'react-bootstrap/Table';
import axios from 'axios';
import login from '../Login/Login';
import './patient.css';
import Nav from 'react-bootstrap/Nav';
import Button from 'react-bootstrap/Button';

class ListOfDoctor extends Component {
    constructor(props) {
        super(props);
        this.state = {
            doctor: [],
            click: false
        }
    }
componentDidMount(){
    console.log("User data below=================================================");
    console.log(this.props.location.userData);
    console.log("User data above=================================================");
    this.setState({ click: true })
        axios.get('http://localhost:8080/bookmydoctorapp/patient/doctors')
            .then((resp) => {
                console.log(resp.data);
                this.setState({ doctor: resp.data.data })
                console.log(this.state.doctor);
            });
    
}
    myClick=()=>{
        this.props.history.push({
            pathname:'/addpatient', 
            userData: this.props.location.userData
          })
    }

    feed=()=>{
        this.props.history.push('/feedback')
    }


    render() {
        <login click={this.doc} />
        return (
           
            <div >

            <Nav variant="tabs" activeKey="1" className="justify-content-center">
            <Nav.Item>
                <Nav.Link eventKey="1">All Doctors</Nav.Link>
            </Nav.Item>
            <Nav.Item>
                <Nav.Link onClick={this.feed}>Give Feedback</Nav.Link>
            </Nav.Item>
            <Nav.Item>
                <Nav.Link href="/login">Logout</Nav.Link>
            </Nav.Item>
            </Nav>
        
                <div className="container felx">
                <div className="w-100 mx-auto shadow p-5">
           <Table className="table border shadow">
                    <thead className= "thead-dark">
                        <tr>
                            <th>SL NO</th>
                            <th>Doctor Name</th>
                            <th>Specialization</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                 {   this.state.doctor.map((doc) => (
                        <tr> 
                            <td>
                                {doc.doctorId}
                            </td>
                            <td>
                                {doc.doctorName}
                            </td>
                            <td>
                                {doc.doctorSpeacilization}
                            </td>
                            <td>
                            <Button variant="success" onClick={this.myClick}>Book Appointment</Button>
                            </td>
                          
                        </tr>
                   ))  }   
                    </tbody>
                </Table>
                </div>
                </div>
    </div>
  

           

                // {
                //     this.state.doctor.map((doc) => (
                //         <div className="container">
                //              <div className="w-100 mx-auto shadow p-5">
                //         <Table striped bordered hover>
                //             <thead>
                //                 <tr>
                //                     <th>SL NO</th>
                //                     <th>Doctor Name</th>
                //                     <th>Specialization</th>
                //                     <th>Action</th>
                //                 </tr>
                //             </thead>
                //             <tbody>
                //                 <tr>
                //                     <td>
                //                         {doc.doctorId}
                //                     </td>
                //                     <td>
                //                         {doc.doctorName}
                //                     </td>
                //                     <td>
                //                         {doc.doctorSpeacilization}
                                      
                //                     </td>
                //                   <td>  <Button variant="success" onClick={this.myClick}>Book Appointment</Button></td>

                //                 </tr>

                //             </tbody>

                //         </Table>
                //         </div>
                //         </div>
                        
                 
        );
    }
}
export default ListOfDoctor;