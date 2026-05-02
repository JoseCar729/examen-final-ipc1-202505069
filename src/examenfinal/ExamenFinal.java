
package examenfinal;

public class ExamenFinal {

    public static void main(String[] args) {
        Cancion can1 = new Cancion("Contra el suelo", "4:10", "La Tona");
        Cancion can2 = new Cancion("Aire", "1:80", "Bohemia Suburbana");
        Cancion can3 = new Cancion("Atado", "2:00", "elClubo");

        can1.reproducir();
        can2.reproducir();
        can3.reproducir();
        
        Playlist playlist = new Playlist();

        playlist.agregarCancion(can1);
        playlist.agregarCancion(can2);
        playlist.agregarCancion(can3);

        System.out.println("\nPlayList Inicial");
        playlist.mostrarPlaylist();

        System.out.println("\nSiguiente");
        playlist.siguiente();

        System.out.println("\nSiguiente");
        playlist.siguiente();  

        System.out.println("\nAnterior");
        playlist.anterior();  

        System.out.println("\nEliminar Actual");
        playlist.eliminarActual(); 

        System.out.println("\nPlayList Final");
        playlist.mostrarPlaylist();
    }
}
