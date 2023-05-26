import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

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
  selector: 'app-semester-view-admin',
  templateUrl: './semester-view-admin.component.html'
})
export class SemesterViewAdminComponent extends AbstractViewController<SemesterDto, SemesterCriteria, SemesterService> implements OnInit {

    semesterModules = new SemesterModuleDto();
    semesterModuless: Array<SemesterModuleDto> = [];

    constructor(private semesterService: SemesterService, private moduleService: ModuleService, private trainingService: TrainingService, private semesterModuleService: SemesterModuleService){
        super(semesterService);
    }

    ngOnInit(): void {
        this.semesterModules.module = new ModuleDto();
        this.moduleService.findAll().subscribe((data) => this.modules = data);
        this.training = new TrainingDto();
        this.trainingService.findAll().subscribe((data) => this.trainings = data);
    }


    get module(): ModuleDto {
       return this.moduleService.item;
    }
    set module(value: ModuleDto) {
        this.moduleService.item = value;
    }
    get modules():Array<ModuleDto> {
       return this.moduleService.items;
    }
    set modules(value: Array<ModuleDto>) {
        this.moduleService.items = value;
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


}
