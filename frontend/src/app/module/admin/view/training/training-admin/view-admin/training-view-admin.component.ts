import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {TrainingService} from 'src/app/controller/service/Training.service';
import {TrainingDto} from 'src/app/controller/model/Training.model';
import {TrainingCriteria} from 'src/app/controller/criteria/TrainingCriteria.model';

import {StudentDto} from 'src/app/controller/model/Student.model';
import {StudentService} from 'src/app/controller/service/Student.service';
@Component({
  selector: 'app-training-view-admin',
  templateUrl: './training-view-admin.component.html'
})
export class TrainingViewAdminComponent extends AbstractViewController<TrainingDto, TrainingCriteria, TrainingService> implements OnInit {


    constructor(private trainingService: TrainingService, private studentService: StudentService){
        super(trainingService);
    }

    ngOnInit(): void {
        this.student = new StudentDto();
        this.studentService.findAll().subscribe((data) => this.students = data);
    }


    get student(): StudentDto {
       return this.studentService.item;
    }
    set student(value: StudentDto) {
        this.studentService.item = value;
    }
    get students():Array<StudentDto> {
       return this.studentService.items;
    }
    set students(value: Array<StudentDto>) {
        this.studentService.items = value;
    }


}
