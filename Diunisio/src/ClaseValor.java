import java.util.ArrayList;

//Clase que almacenará funciones y procedimientos
public class ClaseValor extends Valor {
    public ArrayList<String> lista_atrb = new ArrayList<>();
    public ArrayList<String> lista_metd = new ArrayList<>();
    public String modificadoracceso;
    public DiunisioParser.BloqueContext bloque;

    //Constructor
    public ClaseValor(Object value){
        super(value);
    }
}
