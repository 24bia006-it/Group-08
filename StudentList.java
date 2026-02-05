import java.util.Scanner;
public class StudentList{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> students=new ArrayList<>();
        int choice;
        System.out.println("Student List Manager");
    
        do{
            //Display menu
            System.out.println("\n---menu---");
            Sysem.out.println("1.Add a Student");
            Sysem.out.println("2.Remove a Student");
            Sysem.out.println("3.View all a Student");
            Sysem.out.println("4.Search for a Student");
            Sysem.out.println("5.Count total Student");
            Sysem.out.println("6.Exit");
            Sysem.out.println("\nEnter your choice(1-6):");
            
            choice= Scanner.nextInt();
            Scanner.nextLine();//clear buffer
            switch (choice){
                case 1:
                    //Add student
                    System.out.print("enter student name:");
                    String nametoadd= Scanner.nextLine();
                    students.add(nametoadd);
                    System.out.println(nametoadd+"added successfully!");
                    break;
                case 2:
                    //remove student
                    if (students.isempty()){
                        System.out.println("no students to remove!");
                    } else{
                        System.out.print("enter student name to remove:");
                        String nametoremove=Scanner.nextLine();
                        if(students.remove(nametoremove)){
                            System.out.println(nametoremove+"removed successfully!");
                        }
                        }
            }
        