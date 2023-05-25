package  ma.sir.note.dao.specification.history;

import ma.sir.note.zynerator.specification.AbstractHistorySpecification;
import ma.sir.note.dao.criteria.history.SemesterHistoryCriteria;
import ma.sir.note.bean.history.SemesterHistory;


public class SemesterHistorySpecification extends AbstractHistorySpecification<SemesterHistoryCriteria, SemesterHistory> {

    public SemesterHistorySpecification(SemesterHistoryCriteria criteria) {
        super(criteria);
    }

    public SemesterHistorySpecification(SemesterHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
