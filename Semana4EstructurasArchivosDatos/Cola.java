public class Cola {
    Colas inicio, fin;
    int tama;
        public Cola (){
            inicio=fin=null;
            tama=0;
        }
        public boolean vacia(){
            return inicio==null;
        }
        public void insertar(int ele){
            Colas nuevo = new Colas(ele);
            if (vacia()){
                inicio = nuevo;
            }
            else{
                fin.siguiente = nuevo;
            }
            fin = nuevo;
            tama++;
        }


}
