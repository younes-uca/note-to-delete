package  ma.sir.pmp.dao.specification.history;

import ma.sir.pmp.zynerator.specification.AbstractHistorySpecification;
import ma.sir.pmp.dao.criteria.history.TrainingHistoryCriteria;
import ma.sir.pmp.bean.history.TrainingHistory;


public class TrainingHistorySpecification extends AbstractHistorySpecification<TrainingHistoryCriteria, TrainingHistory> {

    public TrainingHistorySpecification(TrainingHistoryCriteria criteria) {
        super(criteria);
    }

    public TrainingHistorySpecification(TrainingHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
