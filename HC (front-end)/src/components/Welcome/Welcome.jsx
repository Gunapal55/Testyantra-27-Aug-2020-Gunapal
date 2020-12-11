// import React, { Component } from 'react';
import Jumbotron from 'react-bootstrap/Jumbotron';
import Button from 'react-bootstrap/Button';
import 'bootstrap/dist/css/bootstrap.min.css';
import Carousel from 'react-bootstrap/Carousel'
import {Nav, Navbar, NavDropdown} from 'react-bootstrap';
import './welcss.css';
import img1 from '../Welcome/doc2.png';
import img2 from '../Welcome/doc-tech.jpeg';
import img3 from '../Welcome/doc-pat.jpg';
// import logo from './hlogo.';


function Welcome(){
return(
<div>
  <div>
<Carousel >
  <Carousel.Item interval={3000}>
    <div className='sz'>
    <img 
      className="d-block w-100"
      src={img1}
      alt="First slide"
    />
    </div>
    <Carousel.Caption>
      <h3 className="h3">Welcome to HealthCare</h3>
      <p>Book online doctors and find the nearest one for your problems
          Lorem ipsum dolor sit amet consectetur, adipisicing elit. Expedita harum mollitia, dicta dolorum rem, quisquam suscipit doloribus impedit voluptas ipsam voluptate autem odio,
           corporis ipsum? Neque facere quidem autem similique?
      </p>
    </Carousel.Caption>
  </Carousel.Item>
  <Carousel.Item interval={3000} >
  <div className='sz'>
    <img
      className="d-block w-100"
      src={img2}
      alt="Third slide"
    />
    </div>
    <Carousel.Caption>
      <h3>Health care is always here for Help</h3>
      <p>Lorem ipsum dolor sit amet,Lorem ipsum dolor sit amet consectetur adipisicing elit. Rem quidem earum, quod asperiores numquam officia nihil suscipit quaerat eos consectet
          ur facilis nemo veniam nobis natus enim. Nostrum fuga sed ab. consectetur adipiscing elit.</p>
    </Carousel.Caption>
  </Carousel.Item>
  <Carousel.Item >
  <div className='sz'>
    <img
      className="d-block w-100"
      src={img3}
      alt="Third slide"
    />
    </div>
    <Carousel.Caption>
      <h3>About us</h3>
      <p>Praesent Lorem ipsum dolor sit amet consectetur adipisicing elit. Laudantium nostrum at natus vitae facilis aut provident ad! Nam hic velit dolores
           sequi eum iure quam ratione voluptas, esse, praesentium ab. commodo cursus magna, vel scelerisque nisl consectetur.</p>
    </Carousel.Caption>
  </Carousel.Item>
</Carousel>
</div>
<div>
<Jumbotron>
<h1>Welcome to Health Care</h1>
<p>
</p>

<h3>This is application which helps you to interact with doctor and get appoinments ASAP</h3>
       <br/>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Nam laboriosam, minus enim aut modi odio sint impedit repudiandae,
             similique omnis ad consequuntur ea nisi libero saepe incidunt aperiam quam hic!</p>
    <br/>
<p>
  
  <div className="btn">
  <Button variant="primary" className="mr-3" href="/register">Register Now</Button>
  
</div>
</p>
</Jumbotron>
</div>

</div>
)
}
export default Welcome;