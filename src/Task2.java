import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        System.out.println("what's ur number?");
        String text = in.nextLine();
        int number = Integer.parseInt(text);

        if(number > 0){
            if((number + 3) % 10 == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        } else{
            if(number == 0){
                System.out.println("No");
            }else{
                if ((number - 3) % 10 == 0){
                    System.out.println("Yes");
                }
            }
        }
    }
}
