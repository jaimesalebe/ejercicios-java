import java.time.LocalDate;
import java.time.LocalTime;

public class Cliente {

    double id;
    String nombre;
    int edad;
    LocalDate fechaNacimiento;
    String DNI;

    public Cliente () {
        id = Math.random();
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String mostrar() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                ", DNI='" + DNI + '\'' +
                '}';
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        }
        return false;
    }
}
