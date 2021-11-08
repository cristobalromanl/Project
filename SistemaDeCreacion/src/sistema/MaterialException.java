package sistema;

import java.util.ArrayList;

public class MaterialException extends RuntimeException {

    private final ArrayList<MaterialFaltante> materiales;

    public MaterialException(ArrayList<MaterialFaltante> materiales) {
        this.materiales = materiales;
    }

    public ArrayList<MaterialFaltante> getMateriales() {
        return materiales;
    }

}
