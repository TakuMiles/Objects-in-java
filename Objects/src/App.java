import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Names login = new Names();
        scores adit_Scores = new scores(); 

        Scanner input = new Scanner(System.in);
        String code;

        do
        {
            System.out.println("please input your password");

            code = input.nextLine();
    
        }while(login.confimation(code) == "false");
        System.out.println("=====================");

        System.out.println("your scores");
        adit_Scores.Marks_View();
        

    }
}
