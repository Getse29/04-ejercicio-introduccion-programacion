public class App {
    public static void main(String[] args) throws Exception {
        Trabajador t1 = new Trabajador("Juan", 25, "123456789", 1000);
        Cliente c1 = new Cliente("Pedro", 30, "987654321", 5000);

        t1.mostrar();
        c1.mostrar();
    }
}
