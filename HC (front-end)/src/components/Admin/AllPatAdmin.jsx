import React from 'react';
import { Component } from 'react';
import Table from 'react-bootstrap/Table';
import axios from 'axios';
// import login from '../Login/Login';
// import './viewalldoc.css';
import Nav from 'react-bootstrap/Nav';
import Button from 'react-bootstrap/Button';

class AllPatAdmin extends Component {
    constructor(props) {
        super(props);
        this.state = {
            patient: [],
            
        }

    }

 componentDidMount() {
        axios.get(' http://localhost:8080/bookmydoctorapp/admin/patients')
            .then((resp) => {
                console.log(resp.data);
                this.setState({ patient: resp.data.data })
                console.log(typeof (this.state.patient));
                console.log(this.state.patient);
            });
    }

    myClick=()=>{
        alert("Delete request is sent to back-end")
    }
    
    home=()=>{
                this.props.history.push('/admin')
    }
        
        

    render() {
        <login click={this.pati} />
        return (

            <div className="container">
            

              <h2>List of all Patients in Health-Care</h2>
              <br/>
              <Nav variant="tabs" defaultActiveKey="1">
                    <Nav.Item>
                        <Nav.Link eventKey="1"onClick={this.doc}>All Patients</Nav.Link>
                    </Nav.Item>
                    <Nav.Item>
                        <Nav.Link onClick={this.home}>Back</Nav.Link>
                    </Nav.Item>
                    </Nav>
              
                        <Table className="table border shadow">
                        <thead className= "thead-dark">
                           
                                <tr>
                                    <th>SL NO</th>
                                    <th>Patient Name</th>
                                    <th>Age</th>
                                    <th>Gender</th>
                                    <th>Email</th>
                                    <th>Contact No</th>
                                    <th>City</th>
                                    
                                </tr>
                            </thead>
                     <tbody>
                            {
                    this.state.patient.map((pati) => (
                                <tr>
                                    <td>
                                        {pati.patientId}
                                    </td>
                                    <td>
                                        {pati.patientName}
                                    </td>
                                    <td>
                                        {pati.patientAge}
                                    </td>
                                    <td>
                                        {pati.gender}
                                       </td>

                                    <td>
                                        {pati.patinetEmailId}
                                    </td>
                                    
                                    <td>
                                        {pati.patinetPhoneNumber}
                                    </td>
                                    <td>
                                        {pati.patinetPlace}
                                    </td>
                                    
                                </tr>

                    ))}
                            </tbody>


                        </Table>

            </div>
        );
    }
}

export default AllPatAdmin;