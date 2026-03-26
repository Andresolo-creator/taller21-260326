public class ListaEnlazada {
    Nodo cabeza;
    public void insertar(int valor){
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null){
            cabeza = nuevo;    
        }else{
            Nodo temp = cabeza;
            while (temp.siguiente != null ){
                temp= temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }
    public int suma (){
        int total= 0;
        Nodo temp = cabeza;
        while (temp != null){
            total = total + temp.valor;
            temp = temp.siguiente; 
        }
        return total;
    }
}
