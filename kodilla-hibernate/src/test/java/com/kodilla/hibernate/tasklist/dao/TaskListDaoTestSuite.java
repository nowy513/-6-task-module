package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        assertEquals(6, readTaskLists.size());


//        CleanUp
        int id = readTaskLists.get(0).getId();
        taskListDao.deleteById(id);
    }

}
