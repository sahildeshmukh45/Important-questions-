import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    String str=input.nextLine();
    String newStr=input.nextLine();
    str=str.toLowerCase();
    newStr=newStr.toLowerCase();
    char tempArray[]=str.toCharArray();
    char tempArray1[]=newStr.toCharArray();
    Arrays.sort(tempArray);
    Arrays.sort(tempArray1);
    if(Arrays.equals(tempArray,tempArray1)){
      System.out.println("String is Anagram");
    }else{
      System.out.println("String is not anagram");
    }
    input.close();
  }
}
