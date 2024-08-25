import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a={1,45,56,9,5,6,8,1,3};
        int min=a[0];
        for(int i=0;i<a.length;i++) {
              if(a[i]<min){
                  min=a[i];
              }
        }
        System.out.println(min);

    }
}
