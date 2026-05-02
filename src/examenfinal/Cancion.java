package examenfinal;
public class Cancion extends Multimedia {
    private String artista;

    public Cancion(String titulo, String duracion, String artista) {
        super(titulo, duracion);
        this.artista = artista;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo: " + getTitulo() + " - " + artista + " (" + getDuracion() + ")");
    }

    public String getArtista() {
        return artista;
    }
}