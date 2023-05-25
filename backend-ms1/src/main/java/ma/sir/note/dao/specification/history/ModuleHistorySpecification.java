package  ma.sir.note.dao.specification.history;

import ma.sir.note.zynerator.specification.AbstractHistorySpecification;
import ma.sir.note.dao.criteria.history.ModuleHistoryCriteria;
import ma.sir.note.bean.history.ModuleHistory;


public class ModuleHistorySpecification extends AbstractHistorySpecification<ModuleHistoryCriteria, ModuleHistory> {

    public ModuleHistorySpecification(ModuleHistoryCriteria criteria) {
        super(criteria);
    }

    public ModuleHistorySpecification(ModuleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
