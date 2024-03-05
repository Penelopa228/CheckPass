import java.util.Scanner;


/*The program to check the password strength.
A password is considered reliable if it contains lowercase and uppercase Latin letters, numbers, and its length is at least 8 characters.*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите пароль:");
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        boolean lang = false;
        boolean smallLet = false;
        boolean bigLet = false;
        boolean number = false;
        char[] chars = pass.toCharArray();
        if(pass.length()>=8) {
        for (char c : chars) {
            if (Character.isUpperCase(c)){
                bigLet=true;
            }
            if (Character.isLowerCase(c)){
                smallLet=true;
            }
            if (Character.isDigit(c)){
                number=true;
            }
            if(c <= 'z' && c >= 'a' || c <= 'Z' && c >= 'Z')
            {
                lang=true;
            }
        }}
       if(lang&&smallLet&&bigLet&&number){
System.out.println("Введенный пароль корректный");}
       else{
           System.out.println("Ошибка! Введенный пароль некорректный");
       }
    }
}