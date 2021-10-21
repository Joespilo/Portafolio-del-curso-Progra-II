public class Usuario extends Entidad implements Imprimible {
    public String apellido;
    public String correo;
    public String telefono;
    public Rol rolDeUsuario;
    private int id;    
    public Usuario (int ID){
        this.id = ID;
    }
    public int getid(){return this.id;}
    @Override
    public String imprimir() {
        return "NOMBRE DEL USUARIO " + this.nombre + " " + this.apellido;
    }
}
