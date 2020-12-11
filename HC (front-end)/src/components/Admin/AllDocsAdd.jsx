import React from 'react';
import { Component } from 'react';
import Table from 'react-bootstrap/Table';
import axios from 'axios';
import login from '../Login/Login';
import './viewalldoc.css';
import Nav from 'react-bootstrap/Nav';
import Button from 'react-bootstrap/Button'

class AllDocsAdd extends Component {

    constructor(props) {
        super(props);
        this.state = {
            doctor: [],
            click: false
        }
    }

    componentDidMount(){
        this.setState({ click: true })
        axios.get('http://localhost:8080/bookmydoctorapp/patient/doctors')
            .then((resp) => {
                console.log(resp.data);
                this.setState({ doctor: resp.data.data })
                console.log(this.state.doctor);
            });
    }

    myClick=()=>{
        alert("Delete request has been sent to backend-team ")
    }

    feed=()=>{
        this.props.history.push('/feedback')
    }
    
    home=()=>{
        this.props.history.push('/admin-home')
    }


    render() {
        <login click={this.doc} />
        return (
            <div >

                <div className="container felx">
                        <div className="w-100 mx-auto shadow p-5">
                    <Nav variant="tabs" defaultActiveKey="1">
                    <Nav.Item>
                        <Nav.Link eventKey="1" onClick={this.doc}>All Doctors</Nav.Link>
                    </Nav.Item>
                    <Nav.Item>
                        <Nav.Link onClick={this.home}>Back</Nav.Link>
                    </Nav.Item>
                    </Nav>
                
                   <Table className="table border shadow">
                            <thead className= "thead-dark">
                                <tr>
                                    <th>SL NO</th>
                                    <th>Doctor Name</th>
                                    <th>Specialization</th>

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
                                  
                                </tr>
                           ))  }   
                            </tbody>
                        </Table>
                        </div>
                        </div>
            </div>
            
        );
    }
}
export default AllDocsAdd;