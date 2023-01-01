package font.alejandro.dam.m09.uf1.t03.model.service;

import font.alejandro.dam.m09.uf1.t03.model.domain.Libro;

public class LibroService {
    public String encriptaLibro(Libro libro) throws Exception
    {
        String resultado = null;

        validarDatos(libro);

        EncriptacionAESService encriptacionAESService = new EncriptacionAESService();

        StringBuilder sb = new StringBuilder();

        String IsbnEncriptado =  encriptacionAESService.encripta(libro.getISBN());
        sb.append("ISBN: ");
        sb.append(IsbnEncriptado);
        sb.append(" ");


        String TituloEncriptado =  encriptacionAESService.encripta(libro.getTitulo());
        sb.append("Titulo: ");
        sb.append(TituloEncriptado);
        sb.append(" ");


        String PrecioEncriptado =  encriptacionAESService.encripta(String.valueOf(libro.getPrecio()));
        sb.append("Precio: ");
        sb.append(PrecioEncriptado);
        sb.append(" ");


        resultado = sb.toString();

        return resultado;
    }

    private void validarDatos(Libro libro) throws Exception
    {
        if (libro == null
                || libro.getISBN() == null
                || libro.getTitulo() == null
                || libro.getISBN() == "")
        {
            throw new Exception("El ISBN no es válido");
        }
    }
}
