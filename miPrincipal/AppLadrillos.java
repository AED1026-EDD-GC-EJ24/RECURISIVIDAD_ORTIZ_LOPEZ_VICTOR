package miPrincipal;
public class AppLadrillos {
    public static void menu(){
        //Solucion iterativa
        /*for(int i=0;i<10;i++){
            dibujarHilera();
        }
        */
        //Solucion recursiva
        dibujarPared();
    }
    public static void dibujarPared(){
        dibujarPared();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    public static void dibujarHilera(){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
}