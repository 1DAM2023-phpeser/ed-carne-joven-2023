// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Oferta oferta = new Oferta();
        oferta.setCode("1");
        oferta.setName("Descuento transporte");
        oferta.setPorcetaje(40.00);
        oferta.setStartD("01/08/2023");
        oferta.setEndD("30/11/2023");

        Usuario usuario = new Usuario();
        usuario.setDni("0123456789X");
        usuario.setName("Pepito Grillo");
        usuario.setEmail("pepgrillo@gmail.com");

        UsoDescuento usoDescuento = new UsoDescuento();
        usoDescuento.setCode("2");
        usoDescuento.setDate("02/08/2023");
        usoDescuento.setDescuento(oferta);
        usoDescuento.setUsuario(usuario);
    }
}