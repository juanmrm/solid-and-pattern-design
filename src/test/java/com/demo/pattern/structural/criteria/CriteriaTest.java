package com.demo.pattern.structural.criteria;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CriteriaTest {

    @Test
    public void andCriteria () {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria single = new CriteriaSingle();
        Criteria singleAndMale = new AndCriteria(single, male);

        List<Person> result = singleAndMale.meetCriteria(persons);
        assertFalse(result.isEmpty());
        assertEquals(3, result.size());
    }

    @Test
    public void orCriteria () {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria single = new CriteriaSingle();
        Criteria female = new CriteriaFemale();
        Criteria singleOrFemale = new OrCriteria(single, female);

        List<Person> result = singleOrFemale.meetCriteria(persons);
        assertFalse(result.isEmpty());
        assertEquals(5, result.size());
    }

}
