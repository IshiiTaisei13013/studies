import java.util.ArrayList;

public class GenerickStack <E>{
    private List<E> taskList;

    public GenerickStack(){
        taskList = new ArrayList<>();
    }

    public boolean push(E task){
        return task.add(task);
    }

    public E pop(){
        if(taskList.isEmpty()){
            return null;
        }
        return taskList.remove(taskList.size()-1);
    }
}
