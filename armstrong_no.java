import java.util.Scanner;
import java.util.ArrayList;
class Main{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    String no=input.nextLine();
    int len=no.length();
    int armNo=0;
    for(int i=0;i<len;i++){
      int newNo=Character.getNumericValue(no.charAt(i));
      armNo+=   Math.pow(newNo,len);
    }
    System.out.println(armNo);
    input.close();
  }
}
