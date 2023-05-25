import {DiplomaCriteria} from './DiplomaCriteria.model';
import {PaymentCriteria} from './PaymentCriteria.model';
import {SemesterAverageCriteria} from './SemesterAverageCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class StudentCriteria  extends   BaseCriteria  {

    public id: number;
    public cin: string;
    public cinLike: string;
    public firstName: string;
    public firstNameLike: string;
    public lastName: string;
    public lastNameLike: string;
    public email: string;
    public emailLike: string;
    public phoneNumber: string;
    public phoneNumberLike: string;
    public address: string;
    public addressLike: string;
    public registrationDate: Date;
    public registrationDateFrom: Date;
    public registrationDateTo: Date;
    public graduated: null | boolean;
  public diploma: DiplomaCriteria ;
  public diplomas: Array<DiplomaCriteria> ;
      public semestersAverages: Array<SemesterAverageCriteria>;
      public payments: Array<PaymentCriteria>;

}
