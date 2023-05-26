package  ma.sir.pmp.dao.specification.history;

import ma.sir.pmp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.pmp.dao.criteria.history.SemesterModuleHistoryCriteria;
import ma.sir.pmp.bean.history.SemesterModuleHistory;


public class SemesterModuleHistorySpecification extends AbstractHistorySpecification<SemesterModuleHistoryCriteria, SemesterModuleHistory> {

    public SemesterModuleHistorySpecification(SemesterModuleHistoryCriteria criteria) {
        super(criteria);
    }

    public SemesterModuleHistorySpecification(SemesterModuleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
