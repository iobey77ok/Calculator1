import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String Task) {
        tasks.add(Task);
        System.out.println("You have added new task: " + Task);
    }

    public void removeTask(int index){
        if (index >= 0 && index < tasks.size()){
            String removeTask = tasks.remove(index);
            System.out.println("You have deleted task: "+ removeTask);
        } else {
            System.out.println("Invalid index, please type again");
        }
    }

    public void displayTask(){
        System.out.println("----------------------------");
        System.out.println("Your To-Do List for today:");
        for (int i = 0; i < tasks.size(); i++){
            System.out.println((i+1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args){
        ToDoList myList = new ToDoList();
        Scanner obj = new Scanner(System.in);
        String choiceNumber;

        do {
            System.out.println("Options: [1] Add Task [2] Remove Task [3] Display Tasks [4] Exit");
            System.out.print("Please Choose your option: ");
            choiceNumber = obj.nextLine();

        } while (!choiceNumber.equals("4"));


        /* myList.addTask("Finish homework");
        myList.addTask("Go grocery shopping");
        myList.addTask("Call a friend");
        myList.displayTask(); */
    }
}