package ekomuliyo.com.todolist.service;


import ekomuliyo.com.todolist.entity.TodoList;
import ekomuliyo.com.todolist.repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService{

    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        System.out.println("------TODOLIST------");

        TodoList[] model = todoListRepository.getAll();

        for (var todo : model) {
            System.out.println(todo.getId() + " : " + todo.getTodo());
        }
    }

    @Override
    public void addTodoList(String todo) {
        TodoList todoList = new TodoList(todo);
        todoListRepository.add(todoList);

        System.out.println("Sukses Menambahkan Todo List : " + todo);
    }

    @Override
    public void removeTodoList(Integer number) {
        boolean success = todoListRepository.remove(number);

        if (success) {
            System.out.println("Sukses Menghapus Todo Ke : " + number);
        }else {
            System.out.println("Gagal Menghapus Todo Ke : " + number);
        }
    }
}
