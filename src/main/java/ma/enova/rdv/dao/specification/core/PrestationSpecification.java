package  ma.enova.rdv.dao.specification.core;




import ma.enova.rdv.zynerator.specification.AbstractSpecification;
import ma.enova.rdv.dao.criteria.core.PrestationCriteria;
import ma.enova.rdv.bean.core.Prestation;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PrestationSpecification extends AbstractSpecification<PrestationCriteria, Prestation> {

    public PrestationSpecification(PrestationCriteria criteria) {
        super(criteria);
    }

    public PrestationSpecification(PrestationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<Prestation> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria.getId(), criteria.getNotId(), criteria.getIdsIn(), criteria.getIdsNotIn());
             addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
             addPredicate("code", criteria.getCode(),criteria.getCodeLike());
             addPredicateInt("dureeEnMiniute", criteria.getDureeEnMiniute());
            addOrderAndFilter();
          }
        return getResult();
    }

}
