import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /**
         * Es tracta de crear un generador de passwords. L'usuari ha d'indicar la mida del password i
         * el programa ha de generar i mostrar per pantalla el password corresponent. El password pot contenir:
         * minúscules, majúscules, números i aquests símbols:
         * ('!','@','#','$','%','^','&','*','(',')','{','}','[',']','=','<','>')
         *
         * Hay que subirlo a GitHub y pasar el enlace al mentor por Discord.
         * Buena suerte!
         */

        List<String> letras = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9);
        List<Character> characters = List.of('!','@','#','$','%','^','&','*','(',')','{','}','[',']','=','<','>');

        int length = 0;
        System.out.print("Introduce la longitud: ");
        length = scanner.nextInt();

        StringBuilder password = new StringBuilder();

        for(int i=0; i<length; i++){
            switch (randomNumber()){
                case 1:
                    password.append(letras.get(randomNumberInRange(letras)));
                    break;
                case 2:
                    password.append(letras.get(randomNumberInRange(letras)).toUpperCase());
                    break;
                case 3:
                    password.append(numeros.get(randomNumberInRange(numeros)));
                    break;
                case 4:
                    password.append(characters.get(randomNumberInRange(characters)));
                    break;
            }
        }
        System.out.println(password);


    }

    static int randomNumber(){
        return (int)(Math.random()*4)+1;
    }

    static int randomNumberInRange(List list){
        int range = list.size()-1;
        return (int)(Math.random()*range)+1;
    }
}
