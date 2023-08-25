import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) throws Exception {
        Scanner x = new Scanner (System.in);
        System.out.println("Masukkan Celcius : ");
        double C = x.nextDouble();

        System.out.println("Pilih Opsi : ");
        System.out.println("Farenheit ");
        System.out.println("Kelvin ");
        System.out.println("Reamur ");

        int Opsi = x.nextInt();

        if (Opsi == 1){
            double F = (C * 9/5 ) + 32;
            System.out.println(C + "adalah " + F);
        }
        
        else if (Opsi == 2){
            double K = (C + 273);
            System.out.println(C + "adalah" + K);
        }
        
        else if (Opsi == 3){
            double R = (C * 4/5);
            System.out.println(C + "adalah" + R);
        }
        
        else{
            System.out.println ("opsi invalid");
        }    


    }
}
