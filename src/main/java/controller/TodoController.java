package controller;

import model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.Todorepository;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    Todorepository todorepository;

    @GetMapping("/findall")
    public List<Todo> findAll() {
        return this.todorepository.findAll();
    }
}
