public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Persona estudiante = new Persona();
        estudiante.id = 1;
        estudiante.nombre = "JoE";
        estudiante.apellido = "Espilo";
        estudiante.edad = 20;
        estudiante.saludar();
    }
}
