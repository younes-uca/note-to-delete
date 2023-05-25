import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {ModuleService} from 'src/app/controller/service/Module.service';
import {ModuleDto} from 'src/app/controller/model/Module.model';
import {ModuleCriteria} from 'src/app/controller/criteria/ModuleCriteria.model';

@Component({
  selector: 'app-module-view-admin',
  templateUrl: './module-view-admin.component.html'
})
export class ModuleViewAdminComponent extends AbstractViewController<ModuleDto, ModuleCriteria, ModuleService> implements OnInit {


    constructor(private moduleService: ModuleService){
        super(moduleService);
    }

    ngOnInit(): void {
    }




}
