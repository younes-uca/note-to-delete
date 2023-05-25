package  ma.sir.note.dao.specification.history;

import ma.sir.note.zynerator.specification.AbstractHistorySpecification;
import ma.sir.note.dao.criteria.history.StudentHistoryCriteria;
import ma.sir.note.bean.history.StudentHistory;


public class StudentHistorySpecification extends AbstractHistorySpecification<StudentHistoryCriteria, StudentHistory> {

    public StudentHistorySpecification(StudentHistoryCriteria criteria) {
        super(criteria);
    }

    public StudentHistorySpecification(StudentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
