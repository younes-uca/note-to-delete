package  ma.sir.pmp.dao.specification.history;

import ma.sir.pmp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.pmp.dao.criteria.history.ModuleHistoryCriteria;
import ma.sir.pmp.bean.history.ModuleHistory;


public class ModuleHistorySpecification extends AbstractHistorySpecification<ModuleHistoryCriteria, ModuleHistory> {

    public ModuleHistorySpecification(ModuleHistoryCriteria criteria) {
        super(criteria);
    }

    public ModuleHistorySpecification(ModuleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
