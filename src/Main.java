import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input String");
        String input=sc.nextLine();
        if(AlphaCheck.check(input)){
            System.out.println("input String contains all the alphabets");
        }
        else {
            System.out.println("input String doesn't contains all the alphabets");
        }
    }

}
