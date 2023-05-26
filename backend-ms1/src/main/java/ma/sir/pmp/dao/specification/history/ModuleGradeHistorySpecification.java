package  ma.sir.pmp.dao.specification.history;

import ma.sir.pmp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.pmp.dao.criteria.history.ModuleGradeHistoryCriteria;
import ma.sir.pmp.bean.history.ModuleGradeHistory;


public class ModuleGradeHistorySpecification extends AbstractHistorySpecification<ModuleGradeHistoryCriteria, ModuleGradeHistory> {

    public ModuleGradeHistorySpecification(ModuleGradeHistoryCriteria criteria) {
        super(criteria);
    }

    public ModuleGradeHistorySpecification(ModuleGradeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
