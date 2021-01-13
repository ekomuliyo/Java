package com.ekomuliyo.test.service;

import com.ekomuliyo.entity.TodoList;
import com.ekomuliyo.repository.TodoListRepository;
import com.ekomuliyo.repository.TodoListRepositoryImpl;
import com.ekomuliyo.service.TodoListService;
import com.ekomuliyo.service.TodoListServiceImpl;

public class TodoListServiceTest {

    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void tesShowTodoList() {
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();

        todoListRepository.data[0] = new TodoList("Belajar OOP Java");
        todoListRepository.data[1] = new TodoList("Belajar PHP");
        todoListRepository.data[2] = new TodoList("Belajar Golang");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java");
        todoListService.addTodoList("Belajar PHP");
        todoListService.addTodoList("Belajar Golang");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java");
        todoListService.addTodoList("Belajar PHP");
        todoListService.addTodoList("Belajar Golang");

        todoListService.showTodoList();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
    }

}
