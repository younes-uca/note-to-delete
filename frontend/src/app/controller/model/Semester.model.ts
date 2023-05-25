import {TrainingDto} from './Training.model';
import {SemesterModuleDto} from './SemesterModule.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class SemesterDto  extends BaseDto{

    public id: number;
    public code: string;
    public libelle: string;
   public startDate: Date;
   public endDate: Date;
    public startDateMax: string ;
    public startDateMin: string ;
    public endDateMax: string ;
    public endDateMin: string ;
    public training: TrainingDto ;
     public semesterModules: Array<SemesterModuleDto>;

}
