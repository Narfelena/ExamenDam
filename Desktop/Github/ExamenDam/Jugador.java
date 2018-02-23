
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    private String jugador;
    private String jugador2;
    private int puntos;

    /**
     * Constructor for objects of class Jugador
     */
    public Jugador()
    {
        this.jugador = jugador;
        this.jugador2 = jugador2;
    }

    public void HacerMovimiento()
    {
        System.out.println("");
    }
    
    public void Resultado()
    {
        if(puntos == 1){
            System.out.println("Jugador 1 gana la partida");
        }
        else if(puntos == 2){
            System.out.println("Jugador 2 gana la partida");
        }
        else{
            System.out.println("Tablas");
        }
    }
}
