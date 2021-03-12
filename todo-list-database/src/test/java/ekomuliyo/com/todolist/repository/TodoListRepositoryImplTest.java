package ekomuliyo.com.todolist.repository;

import com.zaxxer.hikari.HikariDataSource;
import ekomuliyo.com.todolist.entity.TodoList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ekomuliyo.com.todolist.util.DatabaseUtil;


public class TodoListRepositoryImplTest {

    private HikariDataSource dataSource;

    private TodoListRepository todoListRepository;

    @BeforeEach
    void setUp() {
        dataSource = DatabaseUtil.getDataSource();
        todoListRepository = new TodoListRepositoryImpl(dataSource);
    }

    @Test
    void testAdd() {
        TodoList todoList = new TodoList();
        todoList.setTodo("Budi");

        todoListRepository.add(todoList);
    }

    @Test
    void testRemove() {
        System.out.println(todoListRepository.remove(1));
        System.out.println(todoListRepository.remove(2));
        System.out.println(todoListRepository.remove(3));
        System.out.println(todoListRepository.remove(4));
    }

    @Test
    void testGetAll() {

        todoListRepository.add(new TodoList("Eko"));
        todoListRepository.add(new TodoList("Budi"));
        todoListRepository.add(new TodoList("Santoso"));

        TodoList[] todoLists = todoListRepository.getAll();
        for (var todo : todoLists) {
            System.out.println(todo.getId() + " : " + todo.getTodo());
        }
    }

    @AfterEach
    void tearDown() {
        dataSource.close();
    }

}
