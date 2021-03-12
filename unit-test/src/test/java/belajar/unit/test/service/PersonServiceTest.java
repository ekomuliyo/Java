package belajar.unit.test.service;

import belajar.unit.test.data.Person;
import belajar.unit.test.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setup() {
        personService = new PersonService(personRepository);
    }

    @Test
    void testNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("Not Found");
        });
    }

    @Test
    void testGetPersonSuccess() {
        // menambah behavior ke mock object
        Mockito.when(personRepository.selectById("Eko"))
                .thenReturn(new Person("Eko", "Muliyo"));

        var person = personService.get("Eko");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("Eko", person.getId());
        Assertions.assertEquals("Muliyo", person.getName());

    }

    @Test
    void testCreateSuccess() {
        var person = personService.register("Eko");
        Assertions.assertNotNull(person);
        Assertions.assertNotNull(person.getId());
        Assertions.assertEquals("Eko", person.getName());

        Mockito.verify(personRepository, Mockito.times(1))
                .insert(new Person(person.getId(), "Eko"));

    }



}
