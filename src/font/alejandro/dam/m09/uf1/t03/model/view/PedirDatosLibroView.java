package font.alejandro.dam.m09.uf1.t03.model.view;

import font.alejandro.dam.m09.uf1.t03.model.domain.Libro;

public class PedirDatosLibroView {
    public Libro getLibro()
    {
        Libro libro = new Libro();

        UtilidadesPeticionView upv = new UtilidadesPeticionView();
        libro.setISBN(upv.getString("Introduce el ISBN del libro"));
        libro.setTitulo(upv.getString("Introduce el título del libro"));
        libro.setPrecio(upv.getFloat("Introduce el precio del libro"));

        return libro;
    }
}
