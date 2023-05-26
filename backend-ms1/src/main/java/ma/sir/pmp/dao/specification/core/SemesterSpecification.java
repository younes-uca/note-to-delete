package  ma.sir.pmp.dao.specification.core;

import ma.sir.pmp.zynerator.specification.AbstractSpecification;
import ma.sir.pmp.dao.criteria.core.SemesterCriteria;
import ma.sir.pmp.bean.core.Semester;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SemesterSpecification extends  AbstractSpecification<SemesterCriteria, Semester>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("startDate", criteria.getStartDate(), criteria.getStartDateFrom(), criteria.getStartDateTo());
        addPredicate("endDate", criteria.getEndDate(), criteria.getEndDateFrom(), criteria.getEndDateTo());
        addPredicateFk("training","id", criteria.getTraining()==null?null:criteria.getTraining().getId());
        addPredicateFk("training","id", criteria.getTrainings());
        addPredicateFk("training","code", criteria.getTraining()==null?null:criteria.getTraining().getCode());
    }

    public SemesterSpecification(SemesterCriteria criteria) {
        super(criteria);
    }

    public SemesterSpecification(SemesterCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
