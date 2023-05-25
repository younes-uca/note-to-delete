package  ma.sir.note.dao.specification.history;

import ma.sir.note.zynerator.specification.AbstractHistorySpecification;
import ma.sir.note.dao.criteria.history.SemesterAverageHistoryCriteria;
import ma.sir.note.bean.history.SemesterAverageHistory;


public class SemesterAverageHistorySpecification extends AbstractHistorySpecification<SemesterAverageHistoryCriteria, SemesterAverageHistory> {

    public SemesterAverageHistorySpecification(SemesterAverageHistoryCriteria criteria) {
        super(criteria);
    }

    public SemesterAverageHistorySpecification(SemesterAverageHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
