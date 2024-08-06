import java.util.Scanner;
 class Main{
   public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     int no=input.nextInt();
     int addu=0;
     for(int i=1;i<no;i++){
       if(no%i==0){
         addu += i;
       }
     }
     System.out.println(addu);
    if(addu==no){
     System.out.println("perfect no");
    }else{
     System.out.println("Not a perfect no");
    }
     input.close();
   }
 }  
