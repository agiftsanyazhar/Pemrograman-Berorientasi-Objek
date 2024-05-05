package projectpopulasisapi;

import java.util.*;

public class PROJECTPOPULASISAPI {
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);
        
        ArrayList <Sapi> sapi           = new ArrayList <>();
        ArrayList <Serigala> serigala   = new ArrayList <>();
        
        System.out.print("Masukan tahun             : ");
        int tahun               = input.nextInt();
        System.out.print("Masukan sapi betina       : ");
        int sapiBetina          = input.nextInt();
        System.out.print("Masukan sapi jantan       : ");
        int sapiJantan          = input.nextInt();
        System.out.print("Masukan serigala betina   : ");
        int serigalaBetina      = input.nextInt();
        System.out.print("Masukan serigala jantan   : ");
        int serigalaJantan      = input.nextInt();
        
        sapi        = new Sapi(tahun, sapiBetina, sapiJantan);
        serigala    = new Serigala(tahun, serigalaBetina, serigalaJantan);
        
        sapi.melahirkan();
        sapi.kematian();
        serigala.melahirkan();
        serigala.makan();
    }
}