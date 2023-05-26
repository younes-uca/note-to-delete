import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {StudentService} from 'src/app/controller/service/Student.service';
import {StudentDto} from 'src/app/controller/model/Student.model';
import {StudentCriteria} from 'src/app/controller/criteria/StudentCriteria.model';

import {SemesterDto} from 'src/app/controller/model/Semester.model';
import {SemesterService} from 'src/app/controller/service/Semester.service';
import {SemesterAverageDto} from 'src/app/controller/model/SemesterAverage.model';
import {SemesterAverageService} from 'src/app/controller/service/SemesterAverage.service';
import {TrainingDto} from 'src/app/controller/model/Training.model';
import {TrainingService} from 'src/app/controller/service/Training.service';
import {PaymentDto} from 'src/app/controller/model/Payment.model';
import {PaymentService} from 'src/app/controller/service/Payment.service';
import {DiplomaDto} from 'src/app/controller/model/Diploma.model';
import {DiplomaService} from 'src/app/controller/service/Diploma.service';
@Component({
  selector: 'app-student-view-admin',
  templateUrl: './student-view-admin.component.html'
})
export class StudentViewAdminComponent extends AbstractViewController<StudentDto, StudentCriteria, StudentService> implements OnInit {

    semestersAverages = new SemesterAverageDto();
    semestersAveragess: Array<SemesterAverageDto> = [];
    payments = new PaymentDto();
    paymentss: Array<PaymentDto> = [];

    constructor(private studentService: StudentService, private semesterService: SemesterService, private semesterAverageService: SemesterAverageService, private trainingService: TrainingService, private paymentService: PaymentService, private diplomaService: DiplomaService){
        super(studentService);
    }

    ngOnInit(): void {
        this.semestersAverages.semester = new SemesterDto();
        this.semesterService.findAll().subscribe((data) => this.semesters = data);
        this.payments.training = new TrainingDto();
        this.trainingService.findAll().subscribe((data) => this.trainings = data);
        this.payments.semester = new SemesterDto();
        this.semesterService.findAll().subscribe((data) => this.semesters = data);
        this.diploma = new DiplomaDto();
        this.diplomaService.findAll().subscribe((data) => this.diplomas = data);
    }


    get diploma(): DiplomaDto {
       return this.diplomaService.item;
    }
    set diploma(value: DiplomaDto) {
        this.diplomaService.item = value;
    }
    get diplomas():Array<DiplomaDto> {
       return this.diplomaService.items;
    }
    set diplomas(value: Array<DiplomaDto>) {
        this.diplomaService.items = value;
    }
    get training(): TrainingDto {
       return this.trainingService.item;
    }
    set training(value: TrainingDto) {
        this.trainingService.item = value;
    }
    get trainings():Array<TrainingDto> {
       return this.trainingService.items;
    }
    set trainings(value: Array<TrainingDto>) {
        this.trainingService.items = value;
    }
    get semester(): SemesterDto {
       return this.semesterService.item;
    }
    set semester(value: SemesterDto) {
        this.semesterService.item = value;
    }
    get semesters():Array<SemesterDto> {
       return this.semesterService.items;
    }
    set semesters(value: Array<SemesterDto>) {
        this.semesterService.items = value;
    }


}
