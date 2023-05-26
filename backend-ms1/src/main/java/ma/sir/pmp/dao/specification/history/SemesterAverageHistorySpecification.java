package  ma.sir.pmp.dao.specification.history;

import ma.sir.pmp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.pmp.dao.criteria.history.SemesterAverageHistoryCriteria;
import ma.sir.pmp.bean.history.SemesterAverageHistory;


public class SemesterAverageHistorySpecification extends AbstractHistorySpecification<SemesterAverageHistoryCriteria, SemesterAverageHistory> {

    public SemesterAverageHistorySpecification(SemesterAverageHistoryCriteria criteria) {
        super(criteria);
    }

    public SemesterAverageHistorySpecification(SemesterAverageHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
