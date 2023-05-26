import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {SemesterService} from 'src/app/controller/service/Semester.service';
import {SemesterDto} from 'src/app/controller/model/Semester.model';
import {SemesterCriteria} from 'src/app/controller/criteria/SemesterCriteria.model';
import {ModuleDto} from 'src/app/controller/model/Module.model';
import {ModuleService} from 'src/app/controller/service/Module.service';
import {TrainingDto} from 'src/app/controller/model/Training.model';
import {TrainingService} from 'src/app/controller/service/Training.service';
import {SemesterModuleDto} from 'src/app/controller/model/SemesterModule.model';
import {SemesterModuleService} from 'src/app/controller/service/SemesterModule.service';
@Component({
  selector: 'app-semester-create-admin',
  templateUrl: './semester-create-admin.component.html'
})
export class SemesterCreateAdminComponent extends AbstractCreateController<SemesterDto, SemesterCriteria, SemesterService>  implements OnInit {

    private _semesterModulesElement = new SemesterModuleDto();


   private _validSemesterCode = true;
   private _validSemesterLibelle = true;
    private _validTrainingCode = true;
    private _validTrainingLibelle = true;
    private _semesterModules: Array<SemesterModuleDto> = [];

    constructor( private semesterService: SemesterService , private moduleService: ModuleService, private trainingService: TrainingService, private semesterModuleService: SemesterModuleService) {
        super(semesterService);
    }

    ngOnInit(): void {
        this.moduleService.findAll().subscribe(data => this.prepareSemesterModules(data));
        this.semesterModulesElement.module = new ModuleDto();
        this.moduleService.findAll().subscribe((data) => this.modules = data);
    this.training = new TrainingDto();
    this.trainingService.findAll().subscribe((data) => this.trainings = data);
}


     prepareSemesterModules(modules: Array<ModuleDto>): void{
        if( modules != null){
                modules.forEach(e => {
                const semesterModule = new SemesterModuleDto();
                semesterModule.module = e;
                this.semesterModules.push(semesterModule);
            });
        }
    }



    public setValidation(value: boolean){
        this.validSemesterCode = value;
        this.validSemesterLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateSemesterCode();
        this.validateSemesterLibelle();
    }

    public validateSemesterCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validSemesterCode = false;
        } else {
            this.validSemesterCode = true;
        }
    }
    public validateSemesterLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validSemesterLibelle = false;
        } else {
            this.validSemesterLibelle = true;
        }
    }


    public async openCreateModule(module: string) {
    const isPermistted = await this.roleService.isPermitted('Module', 'add');
    if(isPermistted) {
         this.module = new ModuleDto();
         this.createModuleDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }

    get module(): ModuleDto {
        return this.moduleService.item;
    }
    set module(value: ModuleDto) {
        this.moduleService.item = value;
    }
    get modules(): Array<ModuleDto> {
        return this.moduleService.items;
    }
    set modules(value: Array<ModuleDto>) {
        this.moduleService.items = value;
    }
    get createModuleDialog(): boolean {
       return this.moduleService.createDialog;
    }
    set createModuleDialog(value: boolean) {
        this.moduleService.createDialog= value;
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

    get semesterModules(): Array<SemesterModuleDto> {
        if( this._semesterModules == null )
            this._semesterModules = new Array();
        return this._semesterModules;
    }

    set semesterModules(value: Array<SemesterModuleDto>) {
        this._semesterModules = value;
    }


    get validSemesterCode(): boolean {
        return this._validSemesterCode;
    }

    set validSemesterCode(value: boolean) {
         this._validSemesterCode = value;
    }
    get validSemesterLibelle(): boolean {
        return this._validSemesterLibelle;
    }

    set validSemesterLibelle(value: boolean) {
         this._validSemesterLibelle = value;
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

    get semesterModulesElement(): SemesterModuleDto {
        if( this._semesterModulesElement == null )
            this._semesterModulesElement = new SemesterModuleDto();
        return this._semesterModulesElement;
    }

    set semesterModulesElement(value: SemesterModuleDto) {
        this._semesterModulesElement = value;
    }

}
