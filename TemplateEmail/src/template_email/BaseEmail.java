package template_email;

public abstract class BaseEmail {

    public BaseEmail() {

    }

    public void imprimirCartaNormal() {

        TextoFormato de = de();
        TextoFormato para = para();
        TextoFormato asunto = asunto();
        TextoFormato contenido = contenido();
        TextoFormato firma = firma();

        System.out.println("De: " + de.getColor() + de.getTexto() + TextoColor.BLACK);
        System.out.println("Para: " + de.getColor() + para.getTexto());
        System.out.println("*******************************");
        System.out.println(TextoColor.BLACK + "Asunto: " + asunto.getColor() + asunto().getTexto());
        System.out.println("*******************************");
        

        System.out.println("Contenido: ");
        TextoFormato texto = contenido();
        String finalText = "";

        for (int i = 0; i < texto.getTexto().length(); i += 40)
            if (i + 40 < texto.getTexto().length())
                finalText += texto.getColor() + texto.getTexto().substring(i, i + 40) + "\n";
            else
                finalText += texto.getColor() + texto.getTexto().substring(i);

        System.out.println(finalText);
        System.out.println("*******************************");
        System.out.println(firma.getColor() + firma.getTexto());
    }
    
    public void imprimirCartaResumen()
    {
        TextoFormato de = de();
        TextoFormato asunto = asunto();
       
        System.out.println("*******************************");
        System.out.println("De: "+ de.getColor() + de.getTexto());
        System.out.println(TextoColor.BLACK +"Asunto: "+ asunto.getColor() + asunto.getTexto());
        System.out.println("Contenido:");
        
        TextoFormato texto = contenido();
        String finalText = "";
        
        for (int i = 0; i < texto.getTexto().length() && i < 80; i += 40)
            if (i + 40 < texto.getTexto().length())
                finalText += texto.getColor() + texto.getTexto().substring(i, i + 40) + "\n";
            else
                finalText += texto.getColor() + texto.getTexto().substring(i);

        finalText+="...";
        
        System.out.println(finalText);
        System.out.println("*******************************");
    }

    public abstract TextoFormato de();

    public abstract TextoFormato para();

    public abstract TextoFormato asunto();

    public abstract TextoFormato contenido();

    public abstract TextoFormato firma();

}
