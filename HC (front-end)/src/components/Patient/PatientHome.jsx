import React, { Component } from 'react';
import User from '../Patient/User.png';
import { withRouter } from 'react-router-dom';
import axios from 'axios';
import Pop from './PopUp';

class PatinetHome extends Component {
  constructor(props) {
    super(props);
    this.state = {
      companies: [],
      compClick: false
    }
  }

  handleOut = () => {
    localStorage.removeItem(this.props.location.userData.email);
    this.props.history.push('/login');
  }
  handleComp = () => {
    this.setState({ compClick: true });
    axios({
      method: 'get',
      url: 'http://localhost:8080/bookmydoctorapp/patient/doctors',
    }).then(response => {
      this.setState({ companies: response.data.data });
      console.log(this.state.doctors);
    }).catch(err => {
      console.log(err);
    })
  }
  render() {
    if (this.props.location.userData) {
      return (
        <div className="top">
          <div className="text-center bg-primary pb-4">
            <img src={User} className="responsive" alt="User" /><br /><hr /><br />
            <h1 className="text-light user">Hey {(this.props.location.userData.userName)}</h1>
          </div>
          <div className="text-center pt-4 pb-4">
            <button className="btn btn-outline-primary mr-3" onClick={this.handleComp}>Doctors</button>
            <button className="btn btn-outline-danger" onClick={this.handleOut}>Logout</button>
          </div>
          <div>
            {
              this.items = this.state.doctors.map(detail => {
                if (this.state.compClick) {
                  return (
                    <>
                      <div className=" col-md-4 offset-md-4 card card-body bg-dark text-light mt-5 mb-5">
                        <h2 className="text-center cname" key={detail.patientId}>{detail.patientName}</h2><hr />
                        <h4 className="text-muted text-center">Book Appointment</h4><hr />
                        <Pop key={detail.patId} cname={detail.patName}/>
                      </div>
                    </>
                  )
                } else {
                  return null;
                }
              })
            }
          </div>
        </div>
      );
    } else {
      return (
        <>
          <p className="text-center msg">WELCOME NEW USER</p>
        </>
      )
    }
  }
}

export default withRouter(PatinetHome);