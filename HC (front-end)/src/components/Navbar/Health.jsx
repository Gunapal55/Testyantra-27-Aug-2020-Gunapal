import React from 'react';
import Card from 'react-bootstrap/Card';

// import './App.scss';
import 'bootstrap/dist/css/bootstrap.min.css';
import {  CardDeck } from 'react-bootstrap';
function Health() {
  return (
    <div>
        
      <CardDeck  className="img">
        <Card>
          <Card.Img   variant="top" />
          <Card.Body>
            <Card.Title> Eat a healthy diet</Card.Title>
            <Card.Text>
              Eat a combination of different foods, including fruit, vegetables, legumes, nuts and whole grains. Adults should eat at least five portions (400g) of fruit and vegetables per day. You can improve your intake of fruits and vegetables by always including veggies in your meal; eating fresh fruit and vegetables as snacks; eating a variety of fruits and vegetables; and eating them in season. By eating healthy, you will reduce your risk of malnutrition and noncommunicable diseases (NCDs) such as diabetes, heart disease, stroke and cancer.

      </Card.Text>
          </Card.Body>

        </Card>
        <Card>
          <Card.Img variant="top" />
          <Card.Body>
            <Card.Title className="txt">Consume less salt and sugar</Card.Title>
            <Card.Text>
              Filipinos consume twice the recommended amount of sodium, putting them at risk of high blood pressure, which in turn increases the risk of heart disease and stroke. Most people get their sodium through salt. Reduce your salt intake to 5g per day, equivalent to about one teaspoon. It’s easier to do this by limiting the amount of salt, soy sauce, fish sauce and other high-sodium condiments when preparing meals; removing salt, seasonings and condiments from your meal table; avoiding salty snacks; and choosing low-sodium products.
  {' '}
            </Card.Text>
          </Card.Body>
          
        </Card>
        <Card>
          <Card.Img variant="top"  />
          <Card.Body>
            <Card.Title>Measuring Your Heart Rate</Card.Title>
            <Card.Text>
              Your heart rate can be taken with a heart rate monitor or manually at any spot on the body at which an artery is close to the surface and a pulse can be felt. The most common places to manually measure heart rate are the neck (carotid artery)and the wrist (radial artery). You should always use your fingers to take a pulse, not your thumb, because you can sometimes feel your own pulse through your thumb.
      </Card.Text>
          </Card.Body>
        
        </Card>
      </CardDeck>

    </div>

  )
}
export default Health;