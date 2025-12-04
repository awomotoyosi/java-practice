package todo_manager;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Task {

    private  String taskName;

    private  LocalDateTime dueDate;

    private   boolean status;

    public static void main(String[] args) {
        TodoList todoList = new TodoList();


        Task task1 = new Task("Buy groceries", LocalDateTime.of(2025, 02, 22, 04, 10));
        Task task2 = new Task("Sleep", LocalDateTime.of(2025, 02, 22, 03, 10));

    todoList.addTask(task1);
        todoList.addTask(task2);
        task1.printTaskDetails();
        task2.printTaskDetails();
        task1.markAsComplete();
        todoList.findTask("Buy");
      //  todoList.removeTask(1);
        todoList.printItems();



    }

    public Task(String taskName,LocalDateTime dueDate ) {
        this.taskName = taskName;
        this.dueDate = dueDate;
        status= false;


    }

    public  String getTaskName() {
        return taskName;
    }

    public  LocalDateTime getDueDate() {
        return dueDate;
    }

    public  boolean isStatus() {
        return status;
    }

    public  void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public  void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public  void setStatus(boolean status) {
        this.status = status;
    }

public  void markAsComplete (){
        this.status =true;
        this.dueDate = dueDate.now();

    System.out.println( getTaskName()+ "todo_manager.Task is now complete" + " at" + getDueDate());

}


public  void printTaskDetails(){

    System.out.println(getTaskName());
    System.out.println(getDueDate());
    System.out.println(isStatus()?"Complete" : "Incomplete");

}


}



class TodoList{

   ArrayList<Task>  listOfTasks = new ArrayList<Task>();

   public   void addTask(Task task){

       listOfTasks.add(task);
   }



    public  int findTask(String taskname){

       for(Task task :listOfTasks ){
           if(task.getTaskName().equals(taskname)) {
               int flag = listOfTasks.indexOf(taskname);
               System.out.println("todo_manager.Task exists");

               return flag;
           }
       }
        System.out.println("todo_manager.Task doesn't exist");
        return 0;
    }

    public  void removeTask(int index){
       Task taskname = listOfTasks.get(index);
if (index>0 && index < listOfTasks.size() ){
    listOfTasks.remove(index);
    System.out.println(taskname.getTaskName()+" has been removed");


}
  else{
    System.out.println("todo_manager.Task can not be found");

}

    }


public void printItems(){


     if(listOfTasks.isEmpty()){

         System.out.println("No tasks in the list.");
     }
else{
         for(int i =0; i<listOfTasks.size();i++){

          listOfTasks.get(i).printTaskDetails();
             System.out.println("-------------------------------");

     }

 }
}

}