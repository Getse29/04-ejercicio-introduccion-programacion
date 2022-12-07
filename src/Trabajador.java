public class Trabajador extends Persona {
  int salario;

  public Trabajador(String nombre, int edad, String telefono, int salario) {
    this.nombre = nombre;
    this.edad = edad;
    this.telefono = telefono;
    this.salario = salario;
  }

  public void mostrar() {
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Edad: " + this.edad);
    System.out.println("Telefono: " + this.telefono);
    System.out.println("Salario: " + this.salario);
  }
}
