import { Component } from '@angular/core';
import { User } from '../User';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  user:User = new User("", "");
  message: string | undefined;


  getData():void {
    console.log(this.user);
   
    this.message = "Received username as " + this.user.username + " and password as" + this.user.password;

  } 

  
}
