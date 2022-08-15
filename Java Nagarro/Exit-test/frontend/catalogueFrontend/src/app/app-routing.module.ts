import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';
import { SignupComponent } from './pages/signup/signup.component';
import { AdminpageComponent } from './pages/admin/adminpage/adminpage.component';
import { UserpageComponent } from './pages/user/userpage/userpage.component';
import { AdminGuard } from './services/admin.guard';
import { NormalGuard } from './services/normal.guard';
import { BuypageComponent } from './pages/buypage/buypage.component';



const routes: Routes = [
  { path: 'signup', component: SignupComponent },
  { path: 'login', component: LoginComponent },
  { path: '', component: HomeComponent },
  { path: 'admin', component: AdminpageComponent, canActivate: [AdminGuard] },
  { path: 'user', component: UserpageComponent, canActivate: [NormalGuard] },
  { path: 'user/buy', component: BuypageComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
