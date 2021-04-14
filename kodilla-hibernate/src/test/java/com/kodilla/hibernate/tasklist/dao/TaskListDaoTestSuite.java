package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "To do List";

    @Test
    void  testFindByListName(){
//        Given
        TaskList taskList = new TaskList("Do shopping", LISTNAME );
        taskListDao.save(taskList);
        String listName = taskList.getListName();

//      When
        List<TaskList> readTaskLists = taskListDao.findByListName(listName);

//        Then
        assertEquals(1, readTaskLists.size());


//        CleanUp
        int id = readTaskLists.get(0).getId();
        taskListDao.deleteById(id);
    }

    @Test
    void testTaskListDaoSaveWithTasks(){
//        Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Task: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "To do Tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

//        When
        taskListDao.save(taskList);
        int id = taskList.getId();

//        Then
        assertNotEquals(0, id);

//        CleanUp
        taskListDao.deleteById(id);
    }

}
