import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ShowresultComponent } from './components/showresult/showresult.component';
import { TeacherComponent } from './components/teacher/teacher.component';
import { HeaderComponent } from './components/header/header.component';
import { BodyComponent } from './components/body/body.component';
import { LoginpageComponent } from './components/loginpage/loginpage.component';

const routes: Routes = [
  { path: 'teacher', component: TeacherComponent },
  { path: 'showresult', component: ShowresultComponent },
  { path: 'loginpage', component: LoginpageComponent },
  { path: '', component: BodyComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [TeacherComponent, ShowresultComponent, HeaderComponent, BodyComponent, LoginpageComponent]
