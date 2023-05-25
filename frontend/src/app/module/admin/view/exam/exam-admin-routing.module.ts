
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { ExamListAdminComponent } from './exam-admin/list-admin/exam-list-admin.component';
import { ExamGradeListAdminComponent } from './exam-grade-admin/list-admin/exam-grade-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'exam',
                            children: [
                                {
                                    path: 'list',
                                    component: ExamListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'exam-grade',
                            children: [
                                {
                                    path: 'list',
                                    component: ExamGradeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                    ]
                },
            ]
        ),
    ],
    exports: [RouterModule],
})
export class ExamAdminRoutingModule { }
