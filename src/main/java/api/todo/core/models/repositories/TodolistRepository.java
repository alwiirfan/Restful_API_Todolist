package api.todo.core.models.repositories;

import api.todo.core.models.entities.Todolist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TodolistRepository extends CrudRepository<Todolist, Long> {

    @Query("")
    public Todolist updateTodolist();

}
