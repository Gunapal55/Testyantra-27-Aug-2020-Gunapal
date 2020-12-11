import Jumbotron from 'react-bootstrap/Jumbotron';
import Button from 'react-bootstrap/Button';

import Carousel from 'react-bootstrap/Carousel';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../Navbar/footer.css';
import {Link} from 'react-router-dom';

 
  function Footerhc(){

return(
  <>
  <hr/>
<footer >
  <div className="foot">
<footer className="page-footer font-small mdb-color pt-4">
      <div className="container text-center text-md-left">
         <div className="row text-center text-md-left mt-3 pb-3">
         <div className="col-md-4 col-lg-4 col-xl-4 mx-auto mt-4">
         <h6 class="text-uppercase mb-4 font-weight-bold">Health Tips</h6>
        <p align="justify"> Lorem, ipsum dolor sit amet consectetur adipisicing elit. Consequuntur nulla quam consequatur fugiat necessitatibus tenetur, neque eius amet sapiente impedit veniam molestiae doloribus, ipsam nobis nihil harum doloremque incidunt fugit!</p>
           </div>
           <hr className="w-100 clearfix d-md-none"></hr>
           <div className="col-md-2 col-lg-2 col-xl-2 mx-auto mt-3">
           <h6 className="text-uppercase mb-4 font-weight-bold">Terms</h6>
           <p align="justify">
          <a href="/terms">About us</a><br/>
          <a href="!#">Privacy Policy</a> <br/>
          <a href="/health">Userfull blogs</a>
          
        </p>
      </div>
      <hr className="w-100 clearfix d-md-none"></hr>
      <div className="col-md-4 col-lg-3 col-xl-3 mx-auto mt-3">
        <h6 className="text-uppercase mb-4 font-weight-bold">Contact Us</h6>
        <p >
          <i className="fas fa-home mr-3"></i> #11th floor,RR Nagar Bangalore, Karnataka</p>
        <p>
          <i className="fas fa-envelope mr-3"></i>Healthcare@gmail.com</p>
        <p>
          <i className="fas fa-phone mr-3"></i> +91-887726230</p>
         
      </div>
           </div> 
         <hr>
         </hr> 
         <div className="row d-flex align-items-center">
         <div className="col-md-7 col-lg-8">
         <p className="text-center text-md-left">© 2020 Copyright:
          <a href="/">
            <strong> Helathcare.com</strong>
          </a>
        </p>
      </div>
      <div className="col-md-5 col-lg-4 ml-lg-0">
      <div className="text-center text-md-right">
          <ul className="list-unstyled list-inline">
            <li className="list-inline-item">
              {/* <a className="btn-floating btn-sm rgba-white-slight mx-1">
                <i className="fab fa-facebook-f"></i>
              </a> */}
            </li>
            <li className="list-inline-item">
              {/* <a className="btn-floating btn-sm rgba-white-slight mx-1">
                <i className="fab fa-twitter"></i>
              </a> */}
            </li>
            <li className="list-inline-item">
              {/* <a className="btn-floatinglocal btn-sm rgba-white-slight mx-1">
                <i className="fab fa-google-plus-g"></i>
              </a> */}
            </li>
            <li className="list-inline-item">
              {/* <a className="btn-floating btn-sm rgba-white-slight mx-1">
                <i className="fab fa-linkedin-in"></i>
              </a> */}
            </li>
          </ul>
        </div>
        </div>
           </div> 
      </div>
      </footer>
      </div>
  </footer>
  </>

  
    );
}

export default Footerhc;