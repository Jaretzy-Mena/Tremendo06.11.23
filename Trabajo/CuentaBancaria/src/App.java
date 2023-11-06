import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a cuenta bancaria");
        Scanner lector=new Scanner(System.in);
        Cuenta Tremendo = new Cuenta();

        System.out.println("Ingrese su nombre");
        String nombre=lector.nextLine();
        Tremendo.setNombre(nombre);

        System.out.println("Ingrese su email");
        String email=lector.nextLine();
        Tremendo.setEmail(email);

        System.out.println("Ingrese su numero de telefono");
        int telefono=lector.nextInt();
        Tremendo.setTelefono(telefono);

        System.out.println("Ingrese su numero de cuenta");
        int ID=lector.nextInt();
        Tremendo.setID(ID);

        System.out.println("Su cuenta ya consta de 10,000 dolares");
        System.out.println("Desea 1.ingresar o 2.sacar?");
        int menu= lector.nextInt();

        switch (menu) {
            case 1->{
                CaseUNO();

            }
        
            case 2->{
                CaseDOS();
            }

            default->{
                System.out.println("Elección invalida");
            }
        }

        lector.close();
            
    }

    public static void CaseUNO(){
        Scanner lector= new Scanner(System.in);
        Cuenta Tremendo=new Cuenta();
        double saldo;
        System.out.println("Ingrese el monto que desea agregar");
        saldo=lector.nextDouble();
        Tremendo.setSaldo(saldo);

        if(saldo<=0){
            System.out.print(";;;;;;;;;;;;;;;;;;;;;;;;");
            System.out.println("Disculpe el valor no debe ser menor que cero");
            Salida();
        }
        Tremendo.setSaldo(saldo);
        lector.close();
    }
    
    public static void CaseDOS(){
        Scanner lector= new Scanner(System.in);
        Cuenta Tremendo=new Cuenta();
        double saldo;
        System.out.println("Ingrese el monto que desea sacar");
        saldo=lector.nextDouble();
        if(saldo<=0||saldo>=10000){
            System.out.print(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
            System.out.println("Disculpe el valor no debe ser menor que cero ni menor que la cantidad que posee la cuenta");
            Salida();
        }
        Tremendo.setSaldo(saldo);
        lector.close();
    }

    public static void Movimiento(){
        Cuenta Tremendo=new Cuenta();
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println("Número de cuenta: "+Tremendo.getID());    
        System.out.println("Saldo: "+(10000+Tremendo.getSaldo()));
    }

    public static void otroMovimiento(){
        Cuenta Tremendo=new Cuenta();
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println("Número de cuenta: "+Tremendo.getID());    
        System.out.println("Saldo: "+(10000-Tremendo.getSaldo()));

    }

    public static void Salida(){
        System.out.println("Adio");
    }

}
