import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Es tracta de crear un generador de passwords. L'usuari ha d'indicar la mida del password i
     * el programa ha de generar i mostrar per pantalla el password corresponent. El password pot contenir:
     * minúscules, majúscules, números i aquests símbols:
     * ('!','@','#','$','%','^','&','*','(',')','{','}','[',']','=','<','>')
     *
     * Hay que subirlo a GitHub y pasar el enlace al mentor por Discord.
     * Buena suerte!
     */
    static Scanner scanner = new Scanner(System.in);
    static List<String> todo = List.of(
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
            "1","2","3","4","5","6","7","8","9",
            "!","@","#","$","%","^","&","*","(",")","{","}","[","]","=","<",">"
    );

    public static void main(String[] args) {

        StringBuilder password = new StringBuilder();
        System.out.print("Introduce la longitud: ");
        int length = scanner.nextInt();

        for(int i=0; i<length; i++){
            password.append(todo.get(randomNumberRangeListSize()));
        }
        System.out.println("Your password: " + password);

    }

    static int randomNumberRangeListSize(){
        int range = todo.size()-1;
        return (int)(Math.random()*range)+1;
    }
}
