package  ma.sir.pmp.dao.specification.history;

import ma.sir.pmp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.pmp.dao.criteria.history.ExamGradeHistoryCriteria;
import ma.sir.pmp.bean.history.ExamGradeHistory;


public class ExamGradeHistorySpecification extends AbstractHistorySpecification<ExamGradeHistoryCriteria, ExamGradeHistory> {

    public ExamGradeHistorySpecification(ExamGradeHistoryCriteria criteria) {
        super(criteria);
    }

    public ExamGradeHistorySpecification(ExamGradeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
