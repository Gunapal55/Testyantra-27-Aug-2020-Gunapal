

import React, { Component } from 'react';
import Button from 'react-bootstrap/Button';
import Nav from 'react-bootstrap/Nav';

class AdminHome extends Component {

    myClick=()=>{
        this.props.history.push('/add-admin')
    }
        

    proUpdate = () => {
        this.props.history.push('/edit-profile')
    }

    allPat = () => {
        this.props.history.push('/view-patients')
    }


   view = () => {
        this.props.history.push('/viewall-doctors')
    }


    blk = () => {
        this.props.history.push('/admin-user')
    }


    render() {
        return (
            <div>
                <h1>Welcome to admin page</h1> <p>
                </p>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Modi iste deserunt magni, sunt neque possimus, iure temporibus id tenetur aliquam quae sed natus! Suscipit dolorem aliquam, voluptatem nostrum temporibus at.</p>
              
              
                <Nav variant="pills" className="justify-content-center">
                    <Nav.Item>
                        <Nav.Link onClick={this.myClick}>Add Admin</Nav.Link>
                    </Nav.Item>
                    <Nav.Item>
                        <Nav.Link onClick={this.view}>View All Doctros</Nav.Link>
                    </Nav.Item>
                    
                    <Nav.Item>
                        <Nav.Link onClick={this.blk}>Block</Nav.Link>
                    </Nav.Item>
                    
                    <Nav.Item>
                        <Nav.Link onClick={this.allPat}>View All Patients</Nav.Link>
                    </Nav.Item>
                    
                    <Nav.Item>
                        <Nav.Link href="/login">Logout</Nav.Link>
                    </Nav.Item>

                    </Nav>
            </div>
        );
    }
}


export default AdminHome;