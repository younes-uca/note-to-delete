import {Component, OnInit} from '@angular/core';
import {TrainingService} from 'src/app/controller/service/Training.service';
import {TrainingDto} from 'src/app/controller/model/Training.model';
import {TrainingCriteria} from 'src/app/controller/criteria/TrainingCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { StudentService } from 'src/app/controller/service/Student.service';

import {StudentDto} from 'src/app/controller/model/Student.model';


@Component({
  selector: 'app-training-list-admin',
  templateUrl: './training-list-admin.component.html'
})
export class TrainingListAdminComponent extends AbstractListController<TrainingDto, TrainingCriteria, TrainingService>  implements OnInit {

    fileName = 'Training';

    students :Array<StudentDto>;
  
    constructor(trainingService: TrainingService, private studentService: StudentService) {
        super(trainingService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadStudent();
    }

    public async loadTrainings(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Training', 'list');
        isPermistted ? this.service.findAll().subscribe(trainings => this.items = trainings,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
            {field: 'duration', header: 'Duration'},
            {field: 'trainingCost', header: 'Training cost'},
            {field: 'student?.cin', header: 'Student'},
        ];
    }


    public async loadStudent(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Training', 'list');
        isPermistted ? this.studentService.findAllOptimized().subscribe(students => this.students = students,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: TrainingDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Libelle': e.libelle ,
                 'Duration': e.duration ,
                 'Training cost': e.trainingCost ,
                'Student': e.student?.cin ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
            'Duration Min': this.criteria.durationMin ? this.criteria.durationMin : environment.emptyForExport ,
            'Duration Max': this.criteria.durationMax ? this.criteria.durationMax : environment.emptyForExport ,
            'Training cost Min': this.criteria.trainingCostMin ? this.criteria.trainingCostMin : environment.emptyForExport ,
            'Training cost Max': this.criteria.trainingCostMax ? this.criteria.trainingCostMax : environment.emptyForExport ,
        //'Student': this.criteria.student?.cin ? this.criteria.student?.cin : environment.emptyForExport ,
        }];
      }
}
