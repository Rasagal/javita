package Mini_Proyecto_BD_BibliotecaLibros;

public class Libro {
    int id;
    String titulo;
    String autor;
    int anioPublicacion;
    String genero;
    boolean disponible;

    //Constructor con los parametros necesarios
    public Libro (int id, String titulo, String autor, int anioPublicacion, String genero, boolean disponible){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.disponible = disponible;
    }

    //Constructor vacío por si fuera necesario
    public Libro(){}

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
