import {ModuleDto} from './Module.model';
import {SemesterDto} from './Semester.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class SemesterModuleDto  extends BaseDto{

    public id: number;
    public module: ModuleDto ;
    public semester: SemesterDto ;

}
