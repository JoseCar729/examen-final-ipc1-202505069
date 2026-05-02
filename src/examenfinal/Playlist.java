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
            System.out.println(c.getTitulo() + " - " + c.getArtista()+ " (" + c.getDuracion() + ")");
            temp = temp.getSiguiente();
        }
    }

    public int getTamaño() {
        return tamaño;
    }
    
    public Cancion siguiente() {
        if (actual == null || actual.getSiguiente() == null) {
            return null;
        }

        actual = actual.getSiguiente();
        actual.getDato().reproducir();
        return actual.getDato();
    }
    
    public Cancion anterior() {
        if (actual == null || actual.getAnterior() == null) {
            return null;
        }

        actual = actual.getAnterior();
        actual.getDato().reproducir();
        return actual.getDato();
    }
    
   public void eliminarActual() {
        if (actual == null) return;

        Cancion eliminada = actual.getDato();
        System.out.println(eliminada.getTitulo() + " eliminada de la playlist");

        if (cabeza == cola) {
            cabeza = cola = actual = null;
        }

        else if (actual == cabeza) {
            cabeza = cabeza.getSiguiente();
            cabeza.setAnterior(null);
            actual = cabeza;
        }

        else if (actual == cola) {
            cola = cola.getAnterior();
            cola.setSiguiente(null);
            actual = cola;
        }

        else {
            NodoDoble anterior = actual.getAnterior();
            NodoDoble siguiente = actual.getSiguiente();

            anterior.setSiguiente(siguiente);
            siguiente.setAnterior(anterior);

            actual = siguiente;
        }

        tamaño--;
    }
}  