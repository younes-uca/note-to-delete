import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {StudentService} from 'src/app/controller/service/Student.service';
import {StudentDto} from 'src/app/controller/model/Student.model';
import {StudentCriteria} from 'src/app/controller/criteria/StudentCriteria.model';
import {DiplomaDto} from 'src/app/controller/model/Diploma.model';
import {DiplomaService} from 'src/app/controller/service/Diploma.service';
import {SemesterDto} from 'src/app/controller/model/Semester.model';
import {SemesterService} from 'src/app/controller/service/Semester.service';
import {SemesterAverageDto} from 'src/app/controller/model/SemesterAverage.model';
import {SemesterAverageService} from 'src/app/controller/service/SemesterAverage.service';
import {TrainingDto} from 'src/app/controller/model/Training.model';
import {TrainingService} from 'src/app/controller/service/Training.service';
import {PaymentDto} from 'src/app/controller/model/Payment.model';
import {PaymentService} from 'src/app/controller/service/Payment.service';
@Component({
  selector: 'app-student-create-admin',
  templateUrl: './student-create-admin.component.html'
})
export class StudentCreateAdminComponent extends AbstractCreateController<StudentDto, StudentCriteria, StudentService>  implements OnInit {

    private _semestersAveragesElement = new SemesterAverageDto();
    private _paymentsElement = new PaymentDto();


   private _validStudentCin = true;
   private _validStudentFirstName = true;
   private _validStudentLastName = true;

    constructor( private studentService: StudentService , private diplomaService: DiplomaService, private semesterService: SemesterService, private semesterAverageService: SemesterAverageService, private trainingService: TrainingService, private paymentService: PaymentService) {
        super(studentService);
    }

    ngOnInit(): void {
        this.semestersAveragesElement.semester = new SemesterDto();
        this.semesterService.findAll().subscribe((data) => this.semesters = data);
        this.paymentsElement.training = new TrainingDto();
        this.trainingService.findAll().subscribe((data) => this.trainings = data);
        this.paymentsElement.semester = new SemesterDto();
        this.semesterService.findAll().subscribe((data) => this.semesters = data);
    this.diploma = new DiplomaDto();
    this.diplomaService.findAll().subscribe((data) => this.diplomas = data);
}



    validateSemestersAverages(){
        this.errorMessages = new Array();
    }
    validatePayments(){
        this.errorMessages = new Array();
    }


    public setValidation(value: boolean){
        this.validStudentCin = value;
        this.validStudentFirstName = value;
        this.validStudentLastName = value;
    }

    public addSemestersAverages() {
        if( this.item.semestersAverages == null )
            this.item.semestersAverages = new Array<SemesterAverageDto>();
       this.validateSemestersAverages();
       if (this.errorMessages.length === 0) {
              this.item.semestersAverages.push({... this.semestersAveragesElement});
              this.semestersAveragesElement = new SemesterAverageDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs',detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
       }
    }


    public deleteSemesterAverage(p: SemesterAverageDto) {
        this.item.semestersAverages.forEach((element, index) => {
            if (element === p) { this.item.semestersAverages.splice(index, 1); }
        });
    }

    public editSemesterAverage(p: SemesterAverageDto) {
        this.semestersAveragesElement = {... p};
        this.activeTab = 0;
    }
    public addPayments() {
        if( this.item.payments == null )
            this.item.payments = new Array<PaymentDto>();
       this.validatePayments();
       if (this.errorMessages.length === 0) {
              this.item.payments.push({... this.paymentsElement});
              this.paymentsElement = new PaymentDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs',detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
       }
    }


    public deletePayment(p: PaymentDto) {
        this.item.payments.forEach((element, index) => {
            if (element === p) { this.item.payments.splice(index, 1); }
        });
    }

    public editPayment(p: PaymentDto) {
        this.paymentsElement = {... p};
        this.activeTab = 0;
    }


    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateStudentCin();
        this.validateStudentFirstName();
        this.validateStudentLastName();
    }

    public validateStudentCin(){
        if (this.stringUtilService.isEmpty(this.item.cin)) {
        this.errorMessages.push('Cin non valide');
        this.validStudentCin = false;
        } else {
            this.validStudentCin = true;
        }
    }
    public validateStudentFirstName(){
        if (this.stringUtilService.isEmpty(this.item.firstName)) {
        this.errorMessages.push('First name non valide');
        this.validStudentFirstName = false;
        } else {
            this.validStudentFirstName = true;
        }
    }
    public validateStudentLastName(){
        if (this.stringUtilService.isEmpty(this.item.lastName)) {
        this.errorMessages.push('Last name non valide');
        this.validStudentLastName = false;
        } else {
            this.validStudentLastName = true;
        }
    }


    public async openCreateDiploma(diploma: string) {
    const isPermistted = await this.roleService.isPermitted('Diploma', 'add');
    if(isPermistted) {
         this.diploma = new DiplomaDto();
         this.createDiplomaDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }

    get diploma(): DiplomaDto {
        return this.diplomaService.item;
    }
    set diploma(value: DiplomaDto) {
        this.diplomaService.item = value;
    }
    get diplomas(): Array<DiplomaDto> {
        return this.diplomaService.items;
    }
    set diplomas(value: Array<DiplomaDto>) {
        this.diplomaService.items = value;
    }
    get createDiplomaDialog(): boolean {
       return this.diplomaService.createDialog;
    }
    set createDiplomaDialog(value: boolean) {
        this.diplomaService.createDialog= value;
    }
    get training(): TrainingDto {
        return this.trainingService.item;
    }
    set training(value: TrainingDto) {
        this.trainingService.item = value;
    }
    get trainings(): Array<TrainingDto> {
        return this.trainingService.items;
    }
    set trainings(value: Array<TrainingDto>) {
        this.trainingService.items = value;
    }
    get createTrainingDialog(): boolean {
       return this.trainingService.createDialog;
    }
    set createTrainingDialog(value: boolean) {
        this.trainingService.createDialog= value;
    }
    get semester(): SemesterDto {
        return this.semesterService.item;
    }
    set semester(value: SemesterDto) {
        this.semesterService.item = value;
    }
    get semesters(): Array<SemesterDto> {
        return this.semesterService.items;
    }
    set semesters(value: Array<SemesterDto>) {
        this.semesterService.items = value;
    }
    get createSemesterDialog(): boolean {
       return this.semesterService.createDialog;
    }
    set createSemesterDialog(value: boolean) {
        this.semesterService.createDialog= value;
    }



    get validStudentCin(): boolean {
        return this._validStudentCin;
    }

    set validStudentCin(value: boolean) {
         this._validStudentCin = value;
    }
    get validStudentFirstName(): boolean {
        return this._validStudentFirstName;
    }

    set validStudentFirstName(value: boolean) {
         this._validStudentFirstName = value;
    }
    get validStudentLastName(): boolean {
        return this._validStudentLastName;
    }

    set validStudentLastName(value: boolean) {
         this._validStudentLastName = value;
    }


    get semestersAveragesElement(): SemesterAverageDto {
        if( this._semestersAveragesElement == null )
            this._semestersAveragesElement = new SemesterAverageDto();
        return this._semestersAveragesElement;
    }

    set semestersAveragesElement(value: SemesterAverageDto) {
        this._semestersAveragesElement = value;
    }
    get paymentsElement(): PaymentDto {
        if( this._paymentsElement == null )
            this._paymentsElement = new PaymentDto();
        return this._paymentsElement;
    }

    set paymentsElement(value: PaymentDto) {
        this._paymentsElement = value;
    }

}
