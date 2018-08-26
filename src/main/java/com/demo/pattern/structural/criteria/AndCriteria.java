package com.demo.pattern.structural.criteria;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class AndCriteria implements Criteria {

    private final Criteria criteria;
    private final Criteria otherCriteria;

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
