
import java.util.Scanner;


public class main {
    public static void main(String[] args){

 //hipotenüs (a*a)+(b*b)=h(sqrt)
Scanner scanner = new Scanner(System.in);
int birinci_kenar;
int ikinci_kenar;

        System.out.println("Birinci Kenar :");
        birinci_kenar = scanner.nextInt();
       
        System.out.println("İkinci Kenar :");
        ikinci_kenar = scanner.nextInt();

        double h =Math.sqrt(birinci_kenar*birinci_kenar +ikinci_kenar*ikinci_kenar);
        System.out.println("Hipotenus :"+h);
}       
}
