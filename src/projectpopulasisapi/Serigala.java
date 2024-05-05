package projectpopulasisapi;

public class Serigala extends Sapi{
    Serigala[] serigala;
    boolean makan;
    
    Serigala (int tahun, int betina, int jantan){
        super(tahun, betina, jantan);
        this.serigala       = new Serigala [100];
        this.makan          = true;
    }
    
    boolean getMakan(){
        return this.makan;
    }
    
    void switchMakan(){
        this.makan  = true;
    }
    
    @Override
    void setJumlahBetina (){
        this.betina  = this.betina+2;
    }
    
    @Override
    void melahirkan (){
        System.out.print("\n\n\n");
        System.out.println("-----------------------");
        System.out.println("Serigala");
        System.out.println("-----------------------");
        
        for (int i=0; i<=this.tahun; i++){
            setTotal ();

            System.out.print("\n");
            System.out.println("=======================");
            System.out.println("Tahun " + i);
            System.out.println("=======================");
            System.out.println("Jumlah serigala betina  = " + getJumlahBetina ());
            System.out.println("Jumlah serigala jantan  = " + getJumlahJantan ());
            System.out.println("Total serigala          = " + getTotal ());
            
            setUsia ();

            if (getUsia ()<=3){
                if (this.betina !=0 && this.jantan !=0){
                    setJumlahBetina ();
                    setUsiaAnak ();
                    setJumlahJantan ();
                    setUsiaAnak ();
                } else {
                    System.out.println("Jumlah serigala betina  = " + getJumlahBetina ());
                    System.out.println("Jumlah serigala jantan  = " + getJumlahJantan ());
                    System.out.println("Total serigala          = " + getTotal ());
                }
            }
        }
        
        for (int i=0;i<this.tahun;i++){
            if (serigala[i].getMakan () == false){
                serigala[i].getLife();
                System.out.println("Serigala mati jahat yang ke- "+(i+1));
            }
        }
    }
    
    public void makan(){
        int bayi    = 0;               
        for(int i=0; i<sapi.size(); i++){
            if(sapi.get(i).getUsia() == 0){
                bayi++;
            }
        }

        int induk   = 0;
        for(int j=0; j<serigala.size(); j++){
            if(serigala.get(j).akanMakan() == true){
                induk++;
            }
        }
        
        int indukharusmakan = induk-(induk%2);
        int dimakan = indukharusmakan/2;
        while (bayi<dimakan){
            indukharusmakan = indukharusmakan-2;
            dimakan = dimakan-1;                       
        }                   
        int induktidakmakan = induk - indukharusmakan;

        System.out.print("\n");
        System.out.println("Jumlah induk serigala               = "+ induk);
        System.out.println("Jumlah anak sapi                    = "+ bayi);
        System.out.println("Jumlah induk yang tidak bisa makan  = "+ induktidakmakan);
        System.out.print("\n");

        for (int k=0; k<dimakan; k++){
            if(sapi.get(sapi.size()-1).isSex()==true){
                sapi.remove(sapi.size()-1);
                System.out.println("2 induk serigala memakan bayi sapi no " + sapi.get(sapi.size()-1).getNomor());
                betina--;
            } else{
                sapi.remove(sapi.size()-1);
                System.out.println("2 induk serigala memakan bayi sapi no " + sapi.get(sapi.size()-1).getNomor());
                jantan--;   
            }
        }

        for (int l=0; l<indukharusmakan*3; l++){
            if(serigala.get(serigala.size()-1).isSex()==true){
                serigala.remove(serigala.size()-1);
                System.out.println("kematian anak serigala nomor " + serigala.get(serigala.size()-1).getNomor());
                betinas--;
            } else{
                serigala.remove(serigala.size()-1);
                System.out.println("Kematian anak serigala nomor " + serigala.get(serigala.size()-1).getNomor());
                jantans--;    
            }
        }
    }  
}