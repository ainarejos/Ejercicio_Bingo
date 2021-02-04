import java.util.ArrayList;

public class Bingo {
    //Atributos.
    public static int tamañoCartulinas=10;

    //Constructor.
    public Bingo(){};

    //Metodos.
    public void generarCartulinas(ArrayList<Integer> cartulina){
        while (cartulina.size()<tamañoCartulinas){
            int numero=(int)(Math.random()*99);
                if (comprovarRepetido(cartulina, numero)){
                cartulina.add(numero);
                }
            }
        }

    public boolean comprovarRepetido(ArrayList<Integer> cartulina, int numero){
        boolean comprovador=true;
        for (int i = 0; i <tamañoCartulinas ; i++) {
            if (i<0) {
                if (cartulina.get(i) == numero){
                    comprovador=false;
                }
            }
        }
        return comprovador;
    }

    public void comprobarNumero(int numero, ArrayList<Integer> cartulina){
        for (int i = 0; i <cartulina.size() ; i++) {
            if (cartulina.get(i) == numero){
                cartulina.remove(i);
            }
        }
    }

    public void Bingo(ArrayList<Integer> cartulina1, ArrayList<Integer> cartulina2){
        while (cartulina1.size()>0&&cartulina2.size()>0){
            int numero=(int)(Math.random()*99);
            comprobarNumero(numero,cartulina1);
            comprobarNumero(numero,cartulina2);
        }
        if (cartulina1.size()==0){
            System.out.println("Ha ganado la cartulina 1");
        }
        if (cartulina2.size()==0){
            System.out.println("Ha ganado la cartulina 2");
        }
    }
}


