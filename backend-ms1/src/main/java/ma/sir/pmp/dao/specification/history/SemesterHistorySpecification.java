package  ma.sir.pmp.dao.specification.history;

import ma.sir.pmp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.pmp.dao.criteria.history.SemesterHistoryCriteria;
import ma.sir.pmp.bean.history.SemesterHistory;


public class SemesterHistorySpecification extends AbstractHistorySpecification<SemesterHistoryCriteria, SemesterHistory> {

    public SemesterHistorySpecification(SemesterHistoryCriteria criteria) {
        super(criteria);
    }

    public SemesterHistorySpecification(SemesterHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
