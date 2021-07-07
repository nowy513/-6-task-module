package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;
<<<<<<< HEAD
import org.springframework.lang.NonNull;

import javax.persistence.*;
=======

import javax.persistence.*;
import javax.validation.constraints.NotNull;
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
import java.util.Date;

@NamedQueries({
        @NamedQuery(
                name = "Task.retrieveLongTasks",
                query = "FROM Task WHERE duration > 10"
        ),
        @NamedQuery(
                name = "Task.retrieveShortTasks",
                query = "FROM Task WHERE duration <= 10"
<<<<<<< HEAD
        ),
        @NamedQuery(
                name = "Task.retrieveTasksWithDurationLongerThan",
                query = "FROM Task WHERE duration > :DURATION"
=======
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
        )
})
@NamedNativeQuery(
        name = "Task.retrieveTasksWithEnoughTime",
        query = "SELECT * FROM TASKS" +
                " WHERE DATEDIFF(DATE_ADD(CREATED, INTERVAL DURATION DAY), NOW()) > 5",
        resultClass = Task.class
)
<<<<<<< HEAD

@Entity
@Table(name = "TASKS")
public final class Task {
=======
@Entity
@Table(name = "TASKS")
public final class Task {

>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    private int id;
    private String description;
    private Date created;
    private int duration;
    private TaskFinancialDetails taskFinancialDetails;
    private TaskList taskList;

    public Task() {
<<<<<<< HEAD

=======
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    }

    public Task(String description, int duration) {
        this.description = description;
<<<<<<< HEAD
        this.duration = duration;
        this.created = new Date();
    }
    @Id
    @GeneratedValue
    @NonNull
    @Column(name ="ID", unique = true)
    public int getId() {
        return id;
    }
=======
        this.created = new Date();
        this.duration = duration;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }
<<<<<<< HEAD
    @NonNull
=======

    @NotNull
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    @Column(name = "CREATED")
    public Date getCreated() {
        return created;
    }
<<<<<<< HEAD
=======

>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }

<<<<<<< HEAD
    private void setId(int id) {
        this.id = id;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
=======
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "TASKS_FINANCIALS_ID")
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }
<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name = "TASKLIST_ID")
=======

    @ManyToOne
    @JoinColumn(name = "TASKLISTS_ID")
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
<<<<<<< HEAD
=======

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
}