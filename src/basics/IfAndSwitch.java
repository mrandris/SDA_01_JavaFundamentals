package basics;

public class IfAndSwitch {
    public static void main(String[] args) {

        // if - else if - else if .... else
        int age = 18;
        if (age < 18) {
            System.out.println ("Esti minor");
        } else if (age > 100) {
            System.out.println ("Esti centenar");
        } else {
            System.out.println ("Esti major");
        }
        if (age < 0) {
            System.out.println ("Nu te-ai nascut inca");
        } else {
            System.out.println ("Te-ai nascut");
        }

        // switch - case
        int customers = 10;
        switch (customers) {
            case 0:
                System.out.println ("N-ai clienti");
                break;
            case 1:
                System.out.println ("Ai un client");
                break;
            case 10:
                System.out.println ("Ai 10 clienti");
                break;
            case 100:
                System.out.println ("Ai 100 clienti");
                break;
            default:
                System.out.println ("Fara numar");
        }

        // switch-case with if-else-if...
        if (customers == 0) {
            System.out.println ("N-ai clienti");
        } else if (customers == 1) {
            System.out.println ("Ai un client");
        } else if (customers == 10) {
            System.out.println ("Ai 10 clienti");
        } else if (customers == 100) {
            System.out.println ("Ai 100 clienti");
        } else {
            System.out.println ("Fara numar");
        }
    }
}

