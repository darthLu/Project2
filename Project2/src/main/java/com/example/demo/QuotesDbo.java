package com.example.demo;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
//import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class QuotesDbo {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(Quotes quote){
        entityManager.merge(quote);

    }
    public Quotes getById(int id) {
        return entityManager.find(Quotes.class, id);
    }

    public void updateQuote(Quotes quote) {
        if(entityManager.contains(quote))
            entityManager.merge(quote);
        else
            create(quote);
    }

    public void deleteQuote(int id) {
        Quotes x = entityManager.find(Quotes.class, id);
        if(x != null)
            entityManager.remove(x);
    }
}
