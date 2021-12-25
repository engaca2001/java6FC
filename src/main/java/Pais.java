import java.util.ArrayList;
import java.util.List;

public class Pais {

    private String nombre;

    List<String> usuarios = new ArrayList();
    List<String> ciudades = new ArrayList();

    public Pais(String nombre) {
        this.nombre = nombre;

    }

    public String getPais()
    {
        return nombre;
    }

    public List<String> getUsuarios()
    {
        return usuarios;
    }

    public List<String> getCiudades()
    {
        return ciudades;
    }


}
