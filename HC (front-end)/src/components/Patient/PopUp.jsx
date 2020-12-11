import React, { useState } from 'react';
import Popup from 'reactjs-popup';
import 'reactjs-popup/dist/index.css';
import {Button} from 'react-bootstrap';


function PopUp(props) {


    return (
        <Popup trigger={<button className="btn btn-outline-success"> Book</button>} position="right center">
            <>
                <div className="card card-body bg-light">
                    
                        <h3>Book from {props.dname}</h3><hr />
                        <input type="text" id="time" placeholder="Enter your time"/>
                </div>
                        <Button>Book Now</Button>
            </>
        </Popup>
    )
}
export default PopUp;