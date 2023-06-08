import java.util.Scanner;

public class RecursiveAsal {
    static void prime(){
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number=input.nextInt();

        int divisor=0;

        for (int i=1; i<=number;i++){
            if (number%i==0){
                divisor++;
            }
        }
        if (divisor>2) {
            System.out.println(number+" Asal sayı değildir");
        }else{
            System.out.println(number+" Asal sayıdır");
        }


    }




    public static void main(String[] args) {
            prime();
    }
}
