package com.example.todo;

import java.util.ArrayList;

public class ToDoItem {
    ArrayList<String> todo = new ArrayList<String>();

    public ArrayList<String> getTodos() {

        return todo;
    }
    public ArrayList<String> getTodo() {

        return todo;
    }
    public void setTodo(ArrayList<String> todo) {

        this.todo = todo;
    }
    public String addTodo(String item){
        todo.add(item);
        return item + " added";
    }
    public  String removeItem(int id){
        todo.remove(id);

        return "removed " + id;
    }
}
