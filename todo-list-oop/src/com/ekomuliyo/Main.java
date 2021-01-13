package com.ekomuliyo;

import com.ekomuliyo.repository.TodoListRepository;
import com.ekomuliyo.repository.TodoListRepositoryImpl;
import com.ekomuliyo.service.TodoListService;
import com.ekomuliyo.service.TodoListServiceImpl;
import com.ekomuliyo.view.TodoListView;


public class Main {

    public static void main(String[] args){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();
    }

}
