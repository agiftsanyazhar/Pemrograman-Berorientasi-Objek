package projectpopulasisapi;

public class Sapi {
    Sapi[] sapi;
    int tahun;
    int usia;
    int usiaAnak;
    int noUrut;
    int betina;
    int jantan;
    int total;
    boolean life;
    
    Sapi (int tahun, int betina, int jantan){
        this.tahun      = tahun;
        this.usia       = 0;
        this.usiaAnak   = 0;
        this.noUrut     = 1;
        this.betina     = betina;
        this.jantan     = jantan;
        this.sapi       = new Sapi [100];
        this.life       = true;
    }
    
    void setJumlahBetina (){
        this.betina = this.betina+1;
    }
    
    void setJumlahJantan (){
        this.jantan = this.jantan+1;
    }
    
    void setTotal (){
        this.total  = this.betina+this.jantan;
    }
    
    void setUrutan (){
        this.noUrut = this.noUrut+1;
    }
    
    void setUsia (){
        this.usia   = this.usia+1;
    }
    
    void setUsiaAnak (){
        this.usiaAnak   = this.usiaAnak+1;
    }
    
    boolean getLife(){
        return this.life;
    }
    
    int getJumlahBetina (){
        return this.betina;
    }
    
    int getJumlahJantan (){
        return this.jantan;
    }
    
    int getTotal (){
        return this.total;
    }
    
    int getUrutan (){
        return this.noUrut;
    }
    
    int getUsia (){
        return this.usia;
    }
    
    int getUsiaAnak (){
        return this.usiaAnak;
    }
    
    void melahirkan (){
        System.out.println("-----------------------");
        System.out.println("Sapi");
        System.out.println("-----------------------");
        
        for (int i=0; i<=this.tahun; i++){
            setTotal ();

            System.out.print("\n");
            System.out.println("=======================");
            System.out.println("Tahun " + i);
            System.out.println("=======================");
            System.out.println("Jumlah sapi betina  = " + getJumlahBetina ());
            System.out.println("Jumlah sapi jantan  = " + getJumlahJantan ());
            System.out.println("Total sapi          = " + getTotal ());
            
            setUsia ();
            
            int max     = 10;
            int min     = 1;
            int range   = max-min+1;
            int random  = (int)(Math.random()*range)+min;
            
//            System.out.println("Random  = " + random);

            if (getUsia ()<=1){
                if (this.betina !=0 && this.jantan !=0){
                    if (random%10 <= 4){
                        setJumlahBetina ();
                        setUsiaAnak ();
                    } else {
                        setJumlahJantan ();
                        setUsiaAnak ();
                    }
                } else {
                    System.out.println("Jumlah sapi betina  = " + getJumlahBetina ());
                    System.out.println("Jumlah sapi jantan  = " + getJumlahJantan ());
                    System.out.println("Total sapi          = " + getTotal ());
                }
            } if (getUsia() == 10){
                this.life   = false;
            }
        }
    }
    
    void kematian(){
        for (int i=0; i<sapi.size(); i++){
            if(sapi.get(i).isLive() == false){
                if(sapi.get(i).isSex() == true){
                    System.out.println("Kematian sapi betina nomor " + sapi.get(i).getNomor());
                    betina--;
                }else{
                    System.out.println("Kematian sapi jantan nomor " + sapi.get(i).getNomor());
                    jantan--;
                }
            }
        }
    }
}