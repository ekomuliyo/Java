package com.ekomuliyo.test.view;

import com.ekomuliyo.repository.TodoListRepository;
import com.ekomuliyo.repository.TodoListRepositoryImpl;
import com.ekomuliyo.service.TodoListService;
import com.ekomuliyo.service.TodoListServiceImpl;
import com.ekomuliyo.view.TodoListView;

public class TodoListViewTest {

    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar Java");
        todoListService.addTodoList("Belajar PHP");
        todoListService.addTodoList("Belajar Golang");

        todoListView.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.addTodoList();
        todoListService.showTodoList();

        todoListView.addTodoList();
        todoListService.showTodoList();

        todoListView.addTodoList();
        todoListService.showTodoList();

    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar Java");
        todoListService.addTodoList("Belajar PHP");
        todoListService.addTodoList("Belajar Golang");

        todoListService.showTodoList();

        todoListView.removeTodoList();

        todoListService.showTodoList();

    }

}
