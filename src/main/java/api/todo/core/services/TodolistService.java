package api.todo.core.services;

import api.todo.core.models.entities.Todolist;
import api.todo.core.models.repositories.TodolistRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class TodolistService {

    @Autowired
    private TodolistRepository todolistRepository;

    public Todolist save(Todolist todolist){
        return todolistRepository.save(todolist);
    }

    public Iterable<Todolist> findAll(){
        return todolistRepository.findAll();
    }

    public Todolist findByID(Long id){
        Optional<Todolist> todolist = todolistRepository.findById(id);
        return todolist.orElse(null);
    }

    public void remove(Long id){
        todolistRepository.deleteById(id);
    }

}
