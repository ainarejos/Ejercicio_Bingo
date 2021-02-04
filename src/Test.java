import java.util.ArrayList;

public class Test {
    //Atributos
    private static ArrayList<Integer> Cartulina1=new ArrayList<>();
    private static ArrayList<Integer> Cartulina2=new ArrayList<>();

    //Main.
    public static void main(String[] args) {
        long Start, End , Time;
        Start=System.currentTimeMillis();
        Bingo Bingo=new Bingo();
        Bingo.generarCartulinas(Cartulina1);
        Bingo.generarCartulinas(Cartulina2);
        Bingo.Bingo(Cartulina1, Cartulina2);
        End=System.currentTimeMillis();
        Time=End-Start;
        System.out.println("Tiempo de ejecución: " + Time);
    }
}
