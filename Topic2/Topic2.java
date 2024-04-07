import java.util.LinkedList;
import java.util.Queue;

public class Topic2 {
    public class Main {
        public static void main(String[] args) {
            Queue <String> miPrimeraCola = new LinkedList<>(); //String can be omitted
            miPrimeraCola.offer("Karen");
            miPrimeraCola.offer("Steve");
            miPrimeraCola.offer("Sandra");
            miPrimeraCola.offer("Juana");
            miPrimeraCola.offer("Marco");
    
            System.out.println(miPrimeraCola.peek()); //Imprime pero no elimina el primer dato
            miPrimeraCola.poll(); //Eliminar el primer dato
            miPrimeraCola.poll(); //Eliminar el primer dato
            System.out.println(miPrimeraCola);
            System.out.println(miPrimeraCola.isEmpty()); //Booleano si es vacio o no
            System.out.println(miPrimeraCola.size()); //Tamaño
            System.out.println(miPrimeraCola.contains("Sandra")); //Busca
            //Queue is a FIFO (First-In First-out) data Structure
    
        }
    }
    
}
