
package examenfinal;

public abstract class Multimedia {
    private String titulo;
    private String duracion;

    public Multimedia(String titulo, String duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public abstract void reproducir();

    public String getTitulo() {
        return titulo;
    }

    public String getDuracion() {
        return duracion;
    }
}