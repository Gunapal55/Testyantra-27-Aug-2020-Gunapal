import axios from 'axios';
import React, { Component } from 'react';
import '../Admin/AddAdmin.css';
import Button from 'react-bootstrap/Button'


class BlockUser extends Component{
    constructor(props) {
        super(props);
        this.state = {
            udata: {},
            errorCheck: false
        }
    }
    userFunc = (ev) => {
        ev.preventDefault();
        let val = document.getElementById('Q').value;
        console.log(val);
        axios({
            method: 'get',
            url: `http://localhost:8080/bookmydoctorapp/admin/user?email=${val}`
        }).then(resp => {
            if (!resp.data.error) {
                document.getElementById('ele').style.display="none"
                document.getElementById('up').style.display="block"
                this.setState({ udata: resp.data.data});
                // this.setState({ user: resp.data.data.user });
                console.log(resp);
            } else {
                document.getElementById('ele').innerText="No User Found";
                this.setState({ errorCheck: true });
            }
        })


    }
    submitHandler = (e) => {
        e.preventDefault();

        let object = {
            userId: this.state.udata.userId,
            email: document.getElementById('mail').value,
            name: this.state.udata.name,
            password:document.getElementById('pwd').value,
            phone: document.getElementById('phno').value,
            role:this.state.udata.role,
            status:"Inactive"
          
        };
        let json = JSON.stringify(object);
        console.log(json);
        const config = {
            headers: {
                "content-type": "application/json",
            },
        };
        axios
            .put("http://localhost:8080/bookmydoctorapp/admin/user-data", json, config)
            .then((response) => {
                console.log(response);
            })
            .catch((error) => {
                console.log(error);
            });

        document.getElementById('up').style.display = "none";
        document.getElementById('result').style.display = "block";
    }
    render() {
        return (
            <>
                <div className="col-md-4 offset-md-4 mt-5 mb-5 card card-body text-center res" id="result">
                    <span><strong>{this.state.udata.email}</strong></span> blocked Successfully
                </div>
                <div className="col-md-4 offset-md-4 mt-5 mb-5 blkform text-center" id="ele">
                    <form onSubmit={this.userFunc}>
                        <input type="text" id="Q" placeholder="Enter User email" required className="bx" />
                        <Button variant="dark" type="submit" >Search</Button>

                    </form> 
                </div>
                {
                    !this.state.errorCheck && <div id="up" className="blkform mt-5 mb-5 card card-body col-md-6 offset-md-3">
                        <form name="myForm" onSubmit={this.submitHandler}>
                            <h3 className="mb-5 text-muted text-center mt-5">Block User</h3>

                            
                           
                            <div className="form-group">
                                <label>Email </label>
                                <input
                                    type="email"
                                    name="email"
                                    id="mail"
                                    value={this.state.udata.email}
                                    className="form-control"
                                    placeholder="Enter User Email"
                                />
                            </div>

                            <div className="form-group">
                                <label>Password</label>
                                <input
                                    type="password"
                                    className="form-control"
                                    name="password"
                                    id="pwd"
                                    value={this.state.udata.password}
                                    placeholder="Enter user password"
                                />
                            </div>

                            <div className="form-group">
                                <label>Phone Number </label>
                                <input
                                    type="number"
                                    name="phone"
                                    id="phno"
                                    value={this.state.udata.phone}
                                    className="form-control"
                                    placeholder="Enter user phone number"
                                />
                            </div>

                            <div>
                                <button className="btn btn-primary mt-4 subtn" type="submit">Block</button>
                            </div>
                        </form>
                    </div>
                }

            </>
        );
    }
}
export default BlockUser;