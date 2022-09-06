package com.example.todo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@Slf4j
public class TodoController {

    ToDoItem todo = new ToDoItem();
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/todos")
    public ArrayList<String> getTodos(){

        return todo.getTodos();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/todo/{todoid}")
    private String  deleteTodo(@PathVariable("todoid") int todoid) {
        return todo.removeItem(todoid);
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/todo")
    private String saveTodo(@RequestBody String books) {

        return todo.addTodo(books);
    }
}

