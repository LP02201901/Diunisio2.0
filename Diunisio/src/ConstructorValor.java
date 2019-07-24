import java.util.ArrayList;

//Clase que almacenará funciones y procedimientos
public class ConstructorValor extends Valor {
    public ArrayList<String> parametros = new ArrayList<>();
    public String tipo;
    public DiunisioParser.BloqueContext bloque;
    public String nombre;

    //Constructor
    public ConstructorValor(Object value){
        super(value);
    }
}
