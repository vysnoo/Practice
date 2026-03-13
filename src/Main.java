import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main extends Object{

    public static void main(String... args) {
        //LocalDate
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(input,dtf);
        System.out.println(date);
    }
}

enum Day{
    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}






