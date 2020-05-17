import {Component, Input, OnInit} from '@angular/core';
import { AuthenticationService} from "../service/authentication.service";
import { Router } from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit
{
  username=''
  password=''
  @Input() error: string | null


  constructor() { }

  ngOnInit(): void {
  }

  checkLogin()
  {

  }

}
