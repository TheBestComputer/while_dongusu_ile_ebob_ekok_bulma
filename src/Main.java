
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a, b;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci sayiyi giriniz : ");
        a = scanner.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        b = scanner.nextInt();
        double ebob, ekok;
        ebob = b;
        while(ebob > 1){
            ebob--;
            if((a % ebob) == 0 && (b % ebob) == 0){
                break;
            }
        }
        ekok = (a*b) / ebob;
        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok);
    }
}
