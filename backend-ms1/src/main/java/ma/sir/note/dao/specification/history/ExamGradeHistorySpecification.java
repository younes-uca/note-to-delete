package  ma.sir.note.dao.specification.history;

import ma.sir.note.zynerator.specification.AbstractHistorySpecification;
import ma.sir.note.dao.criteria.history.ExamGradeHistoryCriteria;
import ma.sir.note.bean.history.ExamGradeHistory;


public class ExamGradeHistorySpecification extends AbstractHistorySpecification<ExamGradeHistoryCriteria, ExamGradeHistory> {

    public ExamGradeHistorySpecification(ExamGradeHistoryCriteria criteria) {
        super(criteria);
    }

    public ExamGradeHistorySpecification(ExamGradeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
