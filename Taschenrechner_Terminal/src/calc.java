import java.util.Scanner;

public class calc {

// Taschenrechner 1.0 aufm Knie: Syntax Übung

    public static double rechner (double a, double b, String operator){
        switch(operator){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                if (a == 0){
                    System.out.println("Fehler: Division durch Null ist nicht erlaubt.");
                    return Double.NaN;
                }
                return a/b;
            case "%":
                return a%b;
            case "^":
                return Math.pow(a,b);
            default:
                System.out.println("Ungültiger Opertor. Bitte + - * / % ^ nutzen");
                return Double.NaN;
        }
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Einfacher Taschenrechner\n");
    while(true){
        System.out.println("Erste Zahl");

        double zahl1 = scanner.nextDouble();
        System.out.println("wie Berechnen?");
        String operator = scanner.next();
        System.out.println("Zweite Zahl");
        double zahl2 = scanner.nextDouble();

        double ergebnis = rechner(zahl1, zahl2, operator);

        if(Double.NaN != ergebnis){
            System.out.println("Ergebnis: " + ergebnis);
        }
        System.out.println("noch einmal? j/n");
        String weiter = scanner.next();

        if(!weiter.equalsIgnoreCase("j")){
            System.out.println("Alles klar, bye.");
            break;
        }
    }
    }
}
