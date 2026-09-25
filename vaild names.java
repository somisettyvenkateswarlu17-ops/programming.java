import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean u=false,l=false,d=false;
        for(char c:s.toCharArray()) {
            if(Character.isUpperCase(c)) u=true;
            if(Character.isLowerCase(c)) l=true;
            if(Character.isDigit(c)) d=true;
        }
        System.out.println(s.length()>=6 && u && l && d ? "VALID" : "INVALID");
    }
}
