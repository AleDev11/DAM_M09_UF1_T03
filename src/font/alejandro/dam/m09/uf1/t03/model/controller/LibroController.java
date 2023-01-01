package font.alejandro.dam.m09.uf1.t03.model.controller;

import font.alejandro.dam.m09.uf1.t03.model.domain.Libro;
import font.alejandro.dam.m09.uf1.t03.model.service.LibroService;
import font.alejandro.dam.m09.uf1.t03.model.view.PedirDatosLibroView;
import font.alejandro.dam.m09.uf1.t03.model.view.UtilidadesSalidaView;

public class LibroController {
    public void encripta()
    {
        try
        {
            PedirDatosLibroView pedirDatosLibroView = new PedirDatosLibroView();
            Libro libro = pedirDatosLibroView.getLibro();

            LibroService libroService = new LibroService();
            String datosEncriptados = libroService.encriptaLibro(libro);

            UtilidadesSalidaView utilidadesSalidaView = new UtilidadesSalidaView();
            utilidadesSalidaView.show(datosEncriptados, false);

        }
        catch(Exception ex)
        {
            UtilidadesSalidaView utilidadesSalidaView = new UtilidadesSalidaView();
            utilidadesSalidaView.show(ex.getMessage(), true);
        }
    }
}
