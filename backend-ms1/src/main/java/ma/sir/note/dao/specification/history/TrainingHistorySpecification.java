package  ma.sir.note.dao.specification.history;

import ma.sir.note.zynerator.specification.AbstractHistorySpecification;
import ma.sir.note.dao.criteria.history.TrainingHistoryCriteria;
import ma.sir.note.bean.history.TrainingHistory;


public class TrainingHistorySpecification extends AbstractHistorySpecification<TrainingHistoryCriteria, TrainingHistory> {

    public TrainingHistorySpecification(TrainingHistoryCriteria criteria) {
        super(criteria);
    }

    public TrainingHistorySpecification(TrainingHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
