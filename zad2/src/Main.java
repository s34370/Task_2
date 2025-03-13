import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Witamy w muzeum! Proszę podać dzień tygodnia.");
        String dzn = sc.nextLine();

        System.out.println("Proszę podać wiek.");
        int wiek = sc.nextInt();

        System.out.println("Czy jesteś mieszkańcem Warszawy? (true/false)");
        boolean WWa = sc.nextBoolean();

        double cena = 40.0;
        double discount = 100.0;

        if (wiek<10 || Objects.equals(dzn, "czwartek")){
            discount = 0;
        }
        if (wiek>=10 && wiek <=18){
            discount = 50;
        }
        if (WWa == true && discount > 0){
            discount = discount - 10;
        }
        String discountinfo = 100 - discount + "%";
        if (discount == 0) discountinfo = ("Bilet darmowy :)");
        
        System.out.println("Mieszkaniec Warszawy: " +WWa + ", " + wiek + " lat, Dzień tygodnia: " +dzn + ", Cena biletu: " +cena*discount/100 + "zł, Zniżka: " +discountinfo);

    }

    }
