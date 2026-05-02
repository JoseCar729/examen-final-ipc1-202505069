package examenfinal;
public class Playlist {
    private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    private int tamaño;

    public Playlist() {
        cabeza = null;
        cola = null;
        actual = null;
        tamaño = 0;
    }

    public void agregarCancion(Cancion c) {
        NodoDoble nuevo = new NodoDoble(c);

        if (cabeza == null) {
            cabeza = cola = actual = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }

        tamaño++;
    }

   public void mostrarPlaylist() {
        NodoDoble temp = cabeza;

        System.out.println("Playlist actual:");

        while (temp != null) {
            Cancion c = temp.getDato();
            System.out.println(c.getTitulo() + " - " + c.getArtista());
            temp = temp.getSiguiente();
        }
    }

    public int getTamaño() {
        return tamaño;
    }
}