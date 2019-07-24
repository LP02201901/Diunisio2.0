import java.util.ArrayList;

//Clase que almacenará funciones y procedimientos
public class ClaseValor extends Valor {
    public ArrayList<String> lista_atrb = new ArrayList<>();
    public ArrayList<String> lista_metd = new ArrayList<>();
    public ConstructorValor constructor = new ConstructorValor(null);
    public String modificadoracceso;
    public String tipo;
    public String nombre;
    public DiunisioParser.BloqueContext bloque;

    //Constructor
    public ClaseValor(Object value){
        super(value);
    }
}
