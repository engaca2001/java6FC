import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Impresion {

    public Impresion(User user) {


        String datosUser= "Nombre: " + user.getNombreCompleto() +"\n" +  "E-mail: " + user.getEmail() + "\n" +
                           "Teléfono: " + user.getTelefono() + "\n" + "Modalidad: " + user.getModalidad() + "\n" +
                           "Traslado: " + user.getTraslado() + "\n" + "País: " + user.getPais() + "\n" +
                           "Ciudad: " + user.getCiudad();
        Document document = new Document();
        try {
            String nombreCompleto = user.getNombreCompleto()+".pdf";
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(nombreCompleto));
            document.open();
            document.add(new Paragraph(datosUser));
            document.close();
            writer.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
