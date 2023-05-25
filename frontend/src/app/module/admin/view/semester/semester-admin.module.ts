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
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {PanelModule} from 'primeng/panel';
import {InputNumberModule} from 'primeng/inputnumber';
import {BadgeModule} from 'primeng/badge';
import { MultiSelectModule } from 'primeng/multiselect';
import {TranslateModule} from '@ngx-translate/core';
import {FileUploadModule} from "primeng/fileupload";

import { SemesterCreateAdminComponent } from './semester-admin/create-admin/semester-create-admin.component';
import { SemesterEditAdminComponent } from './semester-admin/edit-admin/semester-edit-admin.component';
import { SemesterViewAdminComponent } from './semester-admin/view-admin/semester-view-admin.component';
import { SemesterListAdminComponent } from './semester-admin/list-admin/semester-list-admin.component';
import { ModuleCreateAdminComponent } from './module-admin/create-admin/module-create-admin.component';
import { ModuleEditAdminComponent } from './module-admin/edit-admin/module-edit-admin.component';
import { ModuleViewAdminComponent } from './module-admin/view-admin/module-view-admin.component';
import { ModuleListAdminComponent } from './module-admin/list-admin/module-list-admin.component';

import { PasswordModule } from 'primeng/password';
import { InputTextModule } from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {TabViewModule} from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MessageModule } from 'primeng/message';
import {MessagesModule} from 'primeng/messages';
import {PaginatorModule} from 'primeng/paginator';



@NgModule({
  declarations: [

    SemesterCreateAdminComponent,
    SemesterListAdminComponent,
    SemesterViewAdminComponent,
    SemesterEditAdminComponent,
    ModuleCreateAdminComponent,
    ModuleListAdminComponent,
    ModuleViewAdminComponent,
    ModuleEditAdminComponent,
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
    PaginatorModule,
    TranslateModule,
    FileUploadModule,
  ],
  exports: [
  SemesterCreateAdminComponent,
  SemesterListAdminComponent,
  SemesterViewAdminComponent,
  SemesterEditAdminComponent,
  ModuleCreateAdminComponent,
  ModuleListAdminComponent,
  ModuleViewAdminComponent,
  ModuleEditAdminComponent,
  ],
  entryComponents: [],
})
export class SemesterAdminModule { }