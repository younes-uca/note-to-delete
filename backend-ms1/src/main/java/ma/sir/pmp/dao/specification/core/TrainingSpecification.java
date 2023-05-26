package  ma.sir.pmp.dao.specification.core;

import ma.sir.pmp.zynerator.specification.AbstractSpecification;
import ma.sir.pmp.dao.criteria.core.TrainingCriteria;
import ma.sir.pmp.bean.core.Training;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TrainingSpecification extends  AbstractSpecification<TrainingCriteria, Training>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateInt("duration", criteria.getDuration(), criteria.getDurationMin(), criteria.getDurationMax());
        addPredicateBigDecimal("trainingCost", criteria.getTrainingCost(), criteria.getTrainingCostMin(), criteria.getTrainingCostMax());
        addPredicateFk("student","id", criteria.getStudent()==null?null:criteria.getStudent().getId());
        addPredicateFk("student","id", criteria.getStudents());
    }

    public TrainingSpecification(TrainingCriteria criteria) {
        super(criteria);
    }

    public TrainingSpecification(TrainingCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
