import java.util.Scanner;

public class MainData {
    private String[] Name;
    private String[] FatherNames;
    private int[] IdNumber;
    private String[] department;
    public void display(){
        System.out.println("//////////////// Student Information //////////////");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name1 = sc.nextLine();

        System.out.println("Enter Father's Name: ");
        String father1 = sc.nextLine();

        System.out.println();
    }
}
