import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {ModuleService} from 'src/app/controller/service/Module.service';
import {ModuleDto} from 'src/app/controller/model/Module.model';
import {ModuleCriteria} from 'src/app/controller/criteria/ModuleCriteria.model';
@Component({
  selector: 'app-module-create-admin',
  templateUrl: './module-create-admin.component.html'
})
export class ModuleCreateAdminComponent extends AbstractCreateController<ModuleDto, ModuleCriteria, ModuleService>  implements OnInit {



   private _validModuleCode = true;
   private _validModuleLibelle = true;

    constructor( private moduleService: ModuleService ) {
        super(moduleService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validModuleCode = value;
        this.validModuleLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateModuleCode();
        this.validateModuleLibelle();
    }

    public validateModuleCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validModuleCode = false;
        } else {
            this.validModuleCode = true;
        }
    }
    public validateModuleLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validModuleLibelle = false;
        } else {
            this.validModuleLibelle = true;
        }
    }






    get validModuleCode(): boolean {
        return this._validModuleCode;
    }

    set validModuleCode(value: boolean) {
         this._validModuleCode = value;
    }
    get validModuleLibelle(): boolean {
        return this._validModuleLibelle;
    }

    set validModuleLibelle(value: boolean) {
         this._validModuleLibelle = value;
    }



}
