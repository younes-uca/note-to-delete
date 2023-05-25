package  ma.sir.note.dao.specification.history;

import ma.sir.note.zynerator.specification.AbstractHistorySpecification;
import ma.sir.note.dao.criteria.history.SemesterModuleHistoryCriteria;
import ma.sir.note.bean.history.SemesterModuleHistory;


public class SemesterModuleHistorySpecification extends AbstractHistorySpecification<SemesterModuleHistoryCriteria, SemesterModuleHistory> {

    public SemesterModuleHistorySpecification(SemesterModuleHistoryCriteria criteria) {
        super(criteria);
    }

    public SemesterModuleHistorySpecification(SemesterModuleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
