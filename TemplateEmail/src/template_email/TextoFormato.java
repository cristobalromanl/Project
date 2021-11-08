package template_email;

public class TextoFormato {

    private final String texto;
    private final TextoColor color;

    public TextoFormato(String texto) {
        this(texto, TextoColor.BLACK);
    }

    public TextoFormato(String texto, TextoColor color) {
        this.texto = texto;
        this.color = color;
    }

    public String getTexto() {
        return texto;
    }

    public TextoColor getColor() {
        return color;
    }

}
