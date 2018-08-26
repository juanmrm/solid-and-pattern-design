package com.demo.pattern.structural.criteria;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
public class OrCriteria implements Criteria {

    private final Criteria criteria;
    private final Criteria otherCriteria;

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return Stream.concat(criteria.meetCriteria(persons).stream(), otherCriteria.meetCriteria(persons).stream())
                .distinct()
                .collect(Collectors.toList());
    }
}
