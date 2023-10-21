import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name \n");
        String name = scanner.nextLine();
        student.setName(name);

        System.out.println("Please enter your department \n");
        String department = scanner.nextLine();
        student.setDepartment(department);

        System.out.println("Please enter your level \n");
        String level = scanner.nextLine();
        student.setLevel(level);


        System.out.println("Please enter your age \n");
        int age = scanner.nextInt();
        student.setAge(age);


        System.out.println("Your full name is"+  student.getName());
        System.out.println("Your department is"+  student.getDepartment());
        System.out.println("Your level is" +  student.getLevel());
        System.out.println("Your age is" +  student.getAge());



























































































        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}