import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ResultModel } from 'models/results-model';
import { DataShareService } from '../../services/data-share.service';
import { ResultService} from '../../services/results.service';

@Component({
  selector: 'app-showresult',
  templateUrl: './showresult.component.html',
  styleUrls: ['./showresult.component.css']
})
export class ShowresultComponent implements OnInit {

  
  roll = Number(this.dataserve.getData());  
  constructor(private router: Router, private dataserve:DataShareService, private http : HttpClient) {
    // showResult()
  }

  record : ResultModel = new ResultModel();
  api : ResultService = new ResultService(this.http);
  ngOnInit(): void {
    console.log(this.roll)
    this.showResult(this.roll)
  }

  showResult(roll: any){
    this.api.getResult(roll)
    .subscribe(res=>{
      console.log(res);
      this.record.roll = res.roll;
      this.record.name = res.name;
      this.record.dob = res.dob;
      this.record.score = res.score;

    
    })
    console.log(this.record)
  }

}
