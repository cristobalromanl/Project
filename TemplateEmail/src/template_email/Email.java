package template_email;

public class Email extends BaseEmail {

    private String de;
    private String para;
    private String asunto;
    private String contenido;
    private String firma;

    public Email(String de, String para, String asunto, String contenido, String firma) {
        this.de = de;
        this.para = para;
        this.asunto = asunto;
        this.contenido = contenido;
        this.firma = firma;
    }

    @Override
    public TextoFormato de() {
        return new TextoFormato(de, TextoColor.BLUE);
    }

    @Override
    public TextoFormato para() {
        return new TextoFormato(para, TextoColor.BLUE);
    }

    @Override
    public TextoFormato asunto() {
         return new TextoFormato(asunto, TextoColor.RED);
    }

    @Override
    public TextoFormato contenido() {
        return new TextoFormato(contenido, TextoColor.BLACK); 
    }

    @Override
    public TextoFormato firma() {
        return new TextoFormato(firma, TextoColor.GRAY);
    }

}
