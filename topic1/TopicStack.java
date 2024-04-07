package topic1;
import java.util.Stack;

public class TopicStack {
    public class Main {
        public static void main(String[] args) {
            Stack<String> miprimerStack= new Stack<String>();
            miprimerStack.push("numero1");
            miprimerStack.push("numero2");
            miprimerStack.push("numero3");
    
    
            for (int i=0; i<9;i++){
                miprimerStack.push("extra");
            }
    
            System.out.println(miprimerStack.pop()); //Imprime elemento eliminado
            System.out.println(miprimerStack); //Imprime toda la pila
            System.out.println(miprimerStack.peek()); //Imprime el ultimo elemento agregado (equivale al elemento N°1)
            System.out.println(miprimerStack.search("numero1")); //Busca el elemento y da la posición
        }
    }
}
