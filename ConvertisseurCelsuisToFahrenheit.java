import java.util.Scanner;

public class ConvertisseurCelsuisToFahrenheit {
    public static void main(String[] args) {

        // tant que l'utilisateur ne tape pas Q on continue

        char fin = ' ';
        char rep = ' ';
        Scanner stop = new Scanner(System.in);

        // tanque que le choix utilisateur différent de "q", recommencer
        do {
            // taper 1 pour C vers F et 2 pour F vers C

            char celsuisChoice = 'a';
            char fahrenheitChoice = 'b';
            double temperature = 0;

            System.out.println("Que voulez vous faire ? convertir Celsuis vers Fahrenheit ou Fahrenheit vers Celsuis");
            System.out.println("Convertir Celsuis vers Fahrenheit  tapez : a");
            System.out.println("convertir Fahrenheit vers Celsuis tapez : b");
            System.out.println("tapez q pour quitter le programme");

            rep = stop.nextLine().charAt(0);

            switch (rep) {
                case 'a':
                    // conversion Celsuis vers Fahrenheit
                    double tempCelsuis;
                    Scanner choiceCelsuis = new Scanner(System.in);
                    System.out.println("Entrez une valeur à convertir");
                    tempCelsuis = choiceCelsuis.nextFloat();

                    double degreCelsuis = tempCelsuis;
                    double resF = (degreCelsuis * 1.8 + 32);
                    System.out.println(resF);
                    System.out.println(tempCelsuis + "degrés celsuis font " + resF + "Fahrenheit");

                    break;

                case 'b':
                    // conversion Fahrenheit vers Celsuis

                    double tempFahrenheit;
                    Scanner choiceFahrenheit = new Scanner(System.in);
                    System.out.println("Entrez une valeur à convertir");

                    tempCelsuis = choiceFahrenheit.nextFloat();

                    double degrefahrenheit = tempCelsuis;
                    double resC = (degrefahrenheit - 32) * 5 / 9;
                    System.out.println(tempCelsuis + " degrés Fahrenheit font " + resC + "celsuis");
                    break;

            }

        } while (rep != 'q');

    }
}

/*
 * 
 * // conversion celsuis vers Fahrenheit
 * double degreCelsuis= 29;
 * double resF = (degreCelsuis*1.8+32);
 * System.out.println(resF);
 * 
 * // conversion Fahrenheit vers Celsuis
 * double degrefahrenheit = 69;
 * double resC = (degrefahrenheit - 32)*5/9;
 * System.out.println(resC);
 * 
 */