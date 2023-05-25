package  ma.sir.note.dao.specification.history;

import ma.sir.note.zynerator.specification.AbstractHistorySpecification;
import ma.sir.note.dao.criteria.history.ExamHistoryCriteria;
import ma.sir.note.bean.history.ExamHistory;


public class ExamHistorySpecification extends AbstractHistorySpecification<ExamHistoryCriteria, ExamHistory> {

    public ExamHistorySpecification(ExamHistoryCriteria criteria) {
        super(criteria);
    }

    public ExamHistorySpecification(ExamHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
