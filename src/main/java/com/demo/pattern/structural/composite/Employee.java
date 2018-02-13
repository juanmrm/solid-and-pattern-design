package com.demo.pattern.structural.composite;

import java.util.List;

public interface Employee {

    void add(Employee em);

    void remove(Employee em);

    List<Employee> getSubordinates();
}
