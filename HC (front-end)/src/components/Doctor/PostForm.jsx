import axios from 'axios';
import React from 'react';

export default class PatientForm extends React.Component{

state={
    name:'',
   password:'',
};

handleChange = event=>{
    this.setState({name: event.target.value});
    this.setState({password:event.target.value})
};


handleSubmit = event=>{
    event.preventDefault();
     
    const user ={
        name: this.state.name,
        password: this.state.password,
    };



axios.post('https://jsonplaceholder.typicode.com/users',{user}).then(res =>{
        console.log(res);
        console.log(res.data);
    });
};

render(){
return(
    <form onSubmit={this.handleSubmit}>
        <label>
            User Name:
            <input type="text" name="name" onChange={this.handleChange}/>
        </label>
        <label>
           Password:
            <input type="password" name="pwd" onChange={this.handleChange}/>
        </label>
        <button type='submit'>submit</button>
    </form>


)

}




}