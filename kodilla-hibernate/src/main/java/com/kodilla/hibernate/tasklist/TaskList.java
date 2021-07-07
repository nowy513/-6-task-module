package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;
<<<<<<< HEAD
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "TASKLIST")
public class TaskList {
=======

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="TASKLISTS")
public class TaskList {

>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    private int id;
    private String listName;
    private String description;
    private List<Task> tasks = new ArrayList<>();

<<<<<<< HEAD

    public TaskList() {

=======
    public TaskList() {
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }
<<<<<<< HEAD
    @Id
    @GeneratedValue
    @NonNull
    @Column(name ="ID", unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }
=======

    @Id
    @NotNull
    @GeneratedValue
    @Column(name="ID", unique=true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name="LISTNAME")
    public String getListName() {
        return listName;
    }

>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

<<<<<<< HEAD
    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @OneToMany(
            targetEntity = Task.class,
            mappedBy = "taskList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
=======
    @OneToMany(
            targetEntity = Task.class,
            mappedBy = "taskList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Task> getTasks() {
        return tasks;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setListName(String listName) {
        this.listName = listName;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setTasks(List<Task> tasks) {
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
        this.tasks = tasks;
    }
}