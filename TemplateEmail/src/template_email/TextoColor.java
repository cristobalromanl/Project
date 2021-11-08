package template_email;

public enum TextoColor {

    GRAY("\u001B[1m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    BLUE("\u001B[34m");
    
    

    private final String color;

    private TextoColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }

}
