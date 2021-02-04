import java.util.ArrayList;

public class Bingo {
    //Atributos
    private ArrayList<Integer> Bingo= new ArrayList<>();
    private ArrayList<Integer> Cartulina1=new ArrayList<>();
    private ArrayList<Integer> Cartulina2=new ArrayList<>();

    public Bingo(){};

    public void generarCartulinas(){
        for (int i = 0; i <20 ; i++) {
            int numero=(int)(Math.random()*99);
            Cartulina1.add(numero);
            System.out.println(Cartulina1);
            }
        for (int i = 0; i <20 ; i++) {
            int numero2=(int)(Math.random()*99);
            Cartulina2.add(numero2);
        }
        }

    private boolean comprovarRepetido(ArrayList cartulina, int numero){
        boolean comprovador=true;
        for (int i = 0; i <20 ; i++) {
            if (cartulina.get(i) == numero){
                comprovador=false;
            }
        return comprovador;
        }
    }

    public void Bingo(){
        while (this.Cartulina1!=null||this.Cartulina2!=null){
            int numero=(int)(Math.random()*99);
            for (int i = 0; i <20 ; i++) {
                if (Cartulina1.get(i) == numero){
                    Cartulina1.remove(numero);
                }
                }
            for (int i = 0; i <20 ; i++) {
                if (Cartulina2.get(i)==numero){
                    Cartulina2.remove(numero);
            }
        }
    }
        if (Cartulina1==null){
            System.out.println("Ha ganado la carulina 1");
        } else if (Cartulina2==null){
            System.out.println("Ha ganado la cartulna 2");
        }
    }
}

