public class Material {
    public short puntosDurabilidad;
    public short rareza;
    public String nombre;
    public Material (short valor1,String valor2){
    }
    public Material(short valor1,String valor2,short valor3){
    }
    public short getDurabilidad(){
        return puntosDurabilidad;
    }
    public String getNombre(){
        return nombre;
    }
    public short getRareza(){
        return 0;
    }
}
