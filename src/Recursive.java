import java.util.Scanner;

public class Recursive {
    static void recursive(){
        Scanner input=new Scanner(System.in);
        System.out.print("Taban değerini giriniz :");
        int base= input.nextInt();
        System.out.print("Üs değerini giriniz :");
        int exponent= input.nextInt();
        int result=1;

        for (int i=1 ; i<=exponent ; i++){
            result*=base;
        }
        System.out.println("Üs işlemi = " +result);

    }


    public static void main(String[] args) {
        recursive();

    }
}
