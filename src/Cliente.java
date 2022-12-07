public class Cliente extends Persona {
  int credito;

  public Cliente(String nombre, int edad, String telefono, int credito) {
    this.nombre = nombre;
    this.edad = edad;
    this.telefono = telefono;
    this.credito = credito;
  }

  public void mostrar() {
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Edad: " + this.edad);
    System.out.println("Telefono: " + this.telefono);
    System.out.println("Credito: " + this.credito);
  }
}
