import React, { Component } from 'react';
import Button from 'react-bootstrap/Button'; 
import axios from 'axios';
import Nav from 'react-bootstrap/Nav';
import '../Doctor/DocHome.css';

class DoctorsHome extends Component {

    constructor(props) {
        super(props);
        this.state = {
            doctor: [],
            updateClick: false,
            click: false
        }
    }
    
componentDidMount(){
    console.log(this.props.location.userData);
}
    
    doc = () => {
        this.setState({ click: true })
        axios.get('http://localhost:8080/bookmydoctorapp/patient/doctors')
            .then((resp) => {
                console.log(resp.data);
                this.setState({ doctor: resp.data.data })
                console.log(this.state.doctor);
            });
    }   

        
    myClick=()=>{this.props.history.push({
        pathname: '/doctor-profile',
        userData: this.props.location.userData
    });}



    proUpdate=()=>{
        this.props.history.push({
            pathname: '/edit-profile',
            userData: this.props.location.userData
        });
    }



    render() {    
        return (
            <div>
                
               
               
                <div className="navl">
                <Nav variant="pills" className="justify-content-center">
                    <Nav.Item>
                        <Nav.Link onClick={this.myClick}>Create Profile</Nav.Link>
                    </Nav.Item>
                    <Nav.Item>
                        <Nav.Link onClick={this.proUpdate}>Update</Nav.Link>
                    </Nav.Item>
                    
                  
                    <Nav.Item>
                        <Nav.Link href="/login">Logout</Nav.Link>
                    </Nav.Item>

                    </Nav>
                    </div>
               
            </div>
        );
    }
}

export default DoctorsHome;