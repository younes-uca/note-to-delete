import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {ToastModule} from 'primeng/toast';
import {ToolbarModule} from 'primeng/toolbar';
import {TableModule} from 'primeng/table';
import {DropdownModule} from 'primeng/dropdown';
import {InputSwitchModule} from 'primeng/inputswitch';
import {InputTextareaModule} from 'primeng/inputtextarea';

import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { DialogModule } from 'primeng/dialog';
import { LoginAdminComponent } from './login-admin/login-admin.component';
import { RegisterAdminComponent } from './register-admin/register-admin.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {PanelModule} from 'primeng/panel';
import {InputNumberModule} from 'primeng/inputnumber';
import {BadgeModule} from 'primeng/badge';
import { MultiSelectModule } from 'primeng/multiselect';
import { ExamAdminModule } from './view/exam/exam-admin.module';
import { ExamAdminRoutingModule } from './view/exam/exam-admin-routing.module';
import { ModulegradeAdminModule } from './view/modulegrade/modulegrade-admin.module';
import { ModulegradeAdminRoutingModule } from './view/modulegrade/modulegrade-admin-routing.module';
import { SemesteraverageAdminModule } from './view/semesteraverage/semesteraverage-admin.module';
import { SemesteraverageAdminRoutingModule } from './view/semesteraverage/semesteraverage-admin-routing.module';
import { StudentAdminModule } from './view/student/student-admin.module';
import { StudentAdminRoutingModule } from './view/student/student-admin-routing.module';
import { SemesterAdminModule } from './view/semester/semester-admin.module';
import { SemesterAdminRoutingModule } from './view/semester/semester-admin-routing.module';
import { TrainingAdminModule } from './view/training/training-admin.module';
import { TrainingAdminRoutingModule } from './view/training/training-admin-routing.module';
import { PaymentAdminModule } from './view/payment/payment-admin.module';
import { PaymentAdminRoutingModule } from './view/payment/payment-admin-routing.module';


import { PasswordModule } from 'primeng/password';
import { InputTextModule } from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {TabViewModule} from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MessageModule } from 'primeng/message';
import {MessagesModule} from 'primeng/messages';


@NgModule({
  declarations: [
   LoginAdminComponent,
   RegisterAdminComponent
  ],
  imports: [
    CommonModule,
    ToastModule,
    ToolbarModule,
    TableModule,
    ConfirmDialogModule,
    DialogModule,
    PasswordModule,
    InputTextModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    SplitButtonModule,
    BrowserAnimationsModule,
    DropdownModule,
    TabViewModule,
    InputSwitchModule,
    InputTextareaModule,
    CalendarModule,
    PanelModule,
    MessageModule,
    MessagesModule,
    InputNumberModule,
    BadgeModule,
    MultiSelectModule,
  ExamAdminModule,
  ExamAdminRoutingModule,
  ModulegradeAdminModule,
  ModulegradeAdminRoutingModule,
  SemesteraverageAdminModule,
  SemesteraverageAdminRoutingModule,
  StudentAdminModule,
  StudentAdminRoutingModule,
  SemesterAdminModule,
  SemesterAdminRoutingModule,
  TrainingAdminModule,
  TrainingAdminRoutingModule,
  PaymentAdminModule,
  PaymentAdminRoutingModule,
  ],
  exports: [
  LoginAdminComponent,
  RegisterAdminComponent,

    ExamAdminModule,
    ModulegradeAdminModule,
    SemesteraverageAdminModule,
    StudentAdminModule,
    SemesterAdminModule,
    TrainingAdminModule,
    PaymentAdminModule,
  ],
  entryComponents: [],
})
export class AdminModule { }
