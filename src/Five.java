import java.util.Scanner;

public class Five {

    static void five(){
        Scanner input=new Scanner(System.in);
        System.out.print("sayı :");
        int number=input.nextInt();

        int LastNUmber=0;


        for (int i = number; i >= -4; i -= 5) {
            System.out.print(" "+i);
            LastNUmber=i;
        }

        // Sayıdan başlayarak 5'er artan değerleri ekrana yazdırma
        for (int i = LastNUmber+5; i <= number; i += 5) {
            System.out.print(" "+i);
        }



    }





    public static void main(String[] args) {
        five();
    }
}
