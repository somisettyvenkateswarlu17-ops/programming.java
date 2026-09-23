import java.util.Scanner;
public class Sol{
  public static void main(String[] arr){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    if(n>=0){
      System.out.println("Whole number");
    }else {
      System.out.println("Natural number");
    }
  }
}
