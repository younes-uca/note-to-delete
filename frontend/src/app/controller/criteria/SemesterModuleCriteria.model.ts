import {ModuleCriteria} from './ModuleCriteria.model';
import {SemesterCriteria} from './SemesterCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class SemesterModuleCriteria  extends   BaseCriteria  {

    public id: number;
  public module: ModuleCriteria ;
  public modules: Array<ModuleCriteria> ;
  public semester: SemesterCriteria ;
  public semesters: Array<SemesterCriteria> ;

}
