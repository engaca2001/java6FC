import java.util.ArrayList;
import java.util.List;

public class Ciudad {

    String nombre;
    String pais;

    List<String> usuarios = new ArrayList();

    public Ciudad(String nombre,Pais pais)
    {
        this.nombre = nombre;
        this.pais = pais.getPais();
        pais.getCiudades().add(nombre);

    }

    public String getCiudad()
    {
        return nombre;
    }

    public List<String> getUsuarios()
    {
        return usuarios;
    }
}
