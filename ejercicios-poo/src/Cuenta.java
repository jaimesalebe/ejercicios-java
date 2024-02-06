import java.util.Scanner;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta () {

    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCuenta() {
        return this.cantidad;
    }

    public void setCuenta(double cuenta) {
        this.cantidad =cuenta;
    }

    public void mostrar() {
        System.out.println("Titular de la cuenta: " + titular);
        System.out.println("Cantidad: $" + cantidad);
    }

    public void ingresar(float cantidadIntroducida) {
        if (cantidadIntroducida > 0){
            cantidad += cantidadIntroducida;
        }
    }

    public void retirar(float cantidadRetirar) {
        cantidad -= cantidadRetirar;
    }
}
