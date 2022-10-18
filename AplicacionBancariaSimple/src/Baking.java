import java.util.Scanner;

public class Baking {
    static int saldo;

    public Baking(int saldo) {
        this.saldo = saldo;
    }

    public static int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public static void showMenu(){
        System.out.println("Bienvenido a iBank");
        System.out.println("Seleccione la opcion deseada: \n");

        int response = 0;
        do {
            System.out.println("1. Verificar el Saldo Disponible");
            System.out.println("2. Depositar Dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    response = 0;
                    verificarSaldo();
                    break;

                case 2:
                    response = 0;
                    depositar();
                    break;

                case 3:
                    response = 0;
                    retirar();
                    break;
                case 0:
                    System.out.println("Gracias por visitarnos!");
                    break;
                default:
                    System.out.println("Seleccione una opcion disponible dentro del menu\n");
            }
        } while (response != 0);
    }
    public static void verificarSaldo(){
        System.out.println("Su saldo actual es de: " + getSaldo() + "\n" +
                "\n");
        showMenu();
    }
    public static void depositar(){
        System.out.println("\n");
        System.out.println("Introduzca el dinero...");
        Scanner sc = new Scanner(System.in);
        saldo += Integer.valueOf(sc.nextLine());
        System.out.println("SALDO FINAL: " + getSaldo() + "\n\n");

        showMenu();
    }
    public static void retirar(){
        int retiro;
        System.out.println("\n");
        System.out.println("¿Cuanto dinero quiere retirar?");
        Scanner sc = new Scanner(System.in);
        retiro = Integer.valueOf(sc.nextLine());
        if (getSaldo() < retiro){
            System.out.println("Fondos insuficientes \n\n");
        } else {
            saldo -= retiro;
            System.out.println("*Reciba el dinero* Saldo actual " + getSaldo() + "\n\n");
        }
        showMenu();
    }
}
