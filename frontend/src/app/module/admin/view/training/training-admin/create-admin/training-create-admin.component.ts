import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {TrainingService} from 'src/app/controller/service/Training.service';
import {TrainingDto} from 'src/app/controller/model/Training.model';
import {TrainingCriteria} from 'src/app/controller/criteria/TrainingCriteria.model';
import {StudentDto} from 'src/app/controller/model/Student.model';
import {StudentService} from 'src/app/controller/service/Student.service';
@Component({
  selector: 'app-training-create-admin',
  templateUrl: './training-create-admin.component.html'
})
export class TrainingCreateAdminComponent extends AbstractCreateController<TrainingDto, TrainingCriteria, TrainingService>  implements OnInit {



   private _validTrainingCode = true;
   private _validTrainingLibelle = true;
    private _validStudentCin = true;
    private _validStudentFirstName = true;
    private _validStudentLastName = true;

    constructor( private trainingService: TrainingService , private studentService: StudentService) {
        super(trainingService);
    }

    ngOnInit(): void {
    this.student = new StudentDto();
    this.studentService.findAll().subscribe((data) => this.students = data);
}





    public setValidation(value: boolean){
        this.validTrainingCode = value;
        this.validTrainingLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateTrainingCode();
        this.validateTrainingLibelle();
    }

    public validateTrainingCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validTrainingCode = false;
        } else {
            this.validTrainingCode = true;
        }
    }
    public validateTrainingLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validTrainingLibelle = false;
        } else {
            this.validTrainingLibelle = true;
        }
    }



    get student(): StudentDto {
        return this.studentService.item;
    }
    set student(value: StudentDto) {
        this.studentService.item = value;
    }
    get students(): Array<StudentDto> {
        return this.studentService.items;
    }
    set students(value: Array<StudentDto>) {
        this.studentService.items = value;
    }
    get createStudentDialog(): boolean {
       return this.studentService.createDialog;
    }
    set createStudentDialog(value: boolean) {
        this.studentService.createDialog= value;
    }



    get validTrainingCode(): boolean {
        return this._validTrainingCode;
    }

    set validTrainingCode(value: boolean) {
         this._validTrainingCode = value;
    }
    get validTrainingLibelle(): boolean {
        return this._validTrainingLibelle;
    }

    set validTrainingLibelle(value: boolean) {
         this._validTrainingLibelle = value;
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


}
