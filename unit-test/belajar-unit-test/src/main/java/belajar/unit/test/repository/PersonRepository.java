package belajar.unit.test.repository;

import belajar.unit.test.data.Person;

public interface PersonRepository {

    Person selectById(String id);

    void insert(Person person);

}
