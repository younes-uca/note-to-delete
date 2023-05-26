package  ma.sir.pmp.dao.specification.history;

import ma.sir.pmp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.pmp.dao.criteria.history.ExamHistoryCriteria;
import ma.sir.pmp.bean.history.ExamHistory;


public class ExamHistorySpecification extends AbstractHistorySpecification<ExamHistoryCriteria, ExamHistory> {

    public ExamHistorySpecification(ExamHistoryCriteria criteria) {
        super(criteria);
    }

    public ExamHistorySpecification(ExamHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
