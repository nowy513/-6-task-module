package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
<<<<<<< HEAD
import org.springframework.data.jdbc.repository.query.Query;
=======
import org.springframework.data.jpa.repository.Query;
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {

    List<Task> findByDuration(int duration);

    @Query
    List<Task> retrieveLongTasks();

    @Query
    List<Task> retrieveShortTasks();

<<<<<<< HEAD
    @Query
    List<Task> retrieveTasksWithEnoughTime();
=======
    @Query(nativeQuery = true)
    List<Task> retrieveTasksWithEnoughTime();

>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
}