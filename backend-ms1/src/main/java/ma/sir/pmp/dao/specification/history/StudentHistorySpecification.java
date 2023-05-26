package  ma.sir.pmp.dao.specification.history;

import ma.sir.pmp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.pmp.dao.criteria.history.StudentHistoryCriteria;
import ma.sir.pmp.bean.history.StudentHistory;


public class StudentHistorySpecification extends AbstractHistorySpecification<StudentHistoryCriteria, StudentHistory> {

    public StudentHistorySpecification(StudentHistoryCriteria criteria) {
        super(criteria);
    }

    public StudentHistorySpecification(StudentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
