package  ma.sir.note.dao.specification.history;

import ma.sir.note.zynerator.specification.AbstractHistorySpecification;
import ma.sir.note.dao.criteria.history.ModuleGradeHistoryCriteria;
import ma.sir.note.bean.history.ModuleGradeHistory;


public class ModuleGradeHistorySpecification extends AbstractHistorySpecification<ModuleGradeHistoryCriteria, ModuleGradeHistory> {

    public ModuleGradeHistorySpecification(ModuleGradeHistoryCriteria criteria) {
        super(criteria);
    }

    public ModuleGradeHistorySpecification(ModuleGradeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
