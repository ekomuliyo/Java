package ekomuliyo.com.todolist;

import com.zaxxer.hikari.HikariDataSource;
import ekomuliyo.com.todolist.repository.TodoListRepository;
import ekomuliyo.com.todolist.repository.TodoListRepositoryImpl;
import ekomuliyo.com.todolist.service.TodoListService;
import ekomuliyo.com.todolist.service.TodoListServiceImpl;
import ekomuliyo.com.todolist.util.DatabaseUtil;
import ekomuliyo.com.todolist.view.TodoListView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        HikariDataSource dataSource = DatabaseUtil.getDataSource();

        TodoListRepository todoListRepository = new TodoListRepositoryImpl(dataSource);
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();
    }
}
