package com.demo.pattern.structural.criteria;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}