import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup} from '@angular/forms';
import { ResultModel } from 'models/results-model';
import { ResultService} from '../../services/results.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-teacher',
  templateUrl: './teacher.component.html',
  styleUrls: ['./teacher.component.css']
})
export class TeacherComponent implements OnInit {

  constructor(private formbuilder : FormBuilder, private http : HttpClient, private router: Router) { }

  formValue !: FormGroup
  showAdd !: boolean
  showUpdate !: boolean
  record : ResultModel = new ResultModel();
  api : ResultService = new ResultService(this.http);
  result !: any

  ngOnInit(): void {
    this.formValue = this.formbuilder.group({
      roll : [''],
      name : [''],
      dob : [''],
      score : ['']
    })
    this.getAllResults();
  }

  print(){
    console.log(this.formValue.value)

  }

  clickAddRecord(){
    this.formValue.reset(); 
    this.showAdd = true;
    this.showUpdate = false;
  }

  postRecord(){
    this.record.roll = this.formValue.value.roll;
    this.record.name = this.formValue.value.name;
    this.record.dob = this.formValue.value.dob;
    this.record.score = this.formValue.value.score;

    this.api.postResult(this.record)
    .subscribe(res=>{
      if(res.roll){
      // console.log(res);
        alert("Data Added Successfully")
        let modal = document.getElementById('cancel')
        modal?.click();
        this.formValue.reset();
        this.getAllResults();
        // console.log(res.message)
        // console.log(res)
      }else{
        alert("Something Went Wrong")
      }
    },
    err =>{
      alert("Something Went Wrong")
    })
  }

  getAllResults(){
    this.api.getResults()
    .subscribe(res=>{
      this.result = res;
    })
  }

  deleteRecord(roll : number){
    this.api.deleteResult(roll)
    .subscribe(res=>{
      this.getAllResults();
      alert("Record Deleted Successfully");
    })
  }

  onEdit(row :any){
    this.showAdd = false;
    this.showUpdate = true;

    this.record.roll = row.roll;

    // this.formValue.controls['roll'].setValue(row.roll);
    this.formValue.controls['name'].setValue(row.name);
    this.formValue.controls['dob'].setValue(row.dob);
    this.formValue.controls['score'].setValue(row.score);
  }

  updateRecord(){
    this.record.name = this.formValue.value.name;
    this.record.dob = this.formValue.value.dob;
    this.record.score = this.formValue.value.score;

    this.api.updateResult(this.record, this.record.roll)
    .subscribe(res=>{
      if(res.roll){
        // console.log(res);
        alert("Data Updated Successfully")
        let modal = document.getElementById('cancel')
        modal?.click();
        this.formValue.reset();
        this.getAllResults();
        // console.log(res)
      }else{
        alert("Something Went Wrong")
      }  
    },
    err =>{
      alert("Something Went Wrong")
    })

  }

  
}
