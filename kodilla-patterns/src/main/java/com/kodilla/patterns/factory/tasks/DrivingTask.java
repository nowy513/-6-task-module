package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;
    private boolean taskExecute = true;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }


    @Override
    public String executeTask() {
        if (taskExecute){
            System.out.println("Drive " + using + " to " + where);
        }else System.out.println("The task was not completed");
        return null;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
       return taskExecute;
    }
}
