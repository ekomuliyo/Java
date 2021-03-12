package ekomuliyo.com.todolist.repository;

import ekomuliyo.com.todolist.entity.TodoList;

public interface TodoListRepository {

    TodoList[] getAll();

    void add(TodoList todoList);

    boolean remove(Integer number);

}
