import java.util.HashMap;


public abstract class StateMachine {
	public abstract void transition(String action);
    String stare_curenta;
    String stare_urmatoare;
    HashMap<String,HashMap<String, String>> table;
}
