public class Procesion {
    private String nombreDeLaProcesion;
    
    private int numeroDePasos;
    
    private boolean procesionConMusica;
    public Procesion (String nombreProcesion,int numeroPasos) {
        this.nombreDeLaProcesion = nombreProcesion;
        this.numeroDePasos = numeroPasos;
        this.procesionConMusica = false;
    }
    
    public String getNombreDeLaProcesi�n (){
        return nombreDeLaProcesion;
    }
    
    public int getNumeroDePasos (){
        return numeroDePasos;
    }
    
    public boolean isProcesionConMusica (){
        return procesionConMusica;
    }
    
    public void setNombreDeLaProcesion (String nombreDeLaProcesion){
        this.nombreDeLaProcesion = nombreDeLaProcesion;
    }
    
    public void a�adirPasos (int Valor){
        int A�adirPasos = numeroDePasos + Valor;
    }
    
    public void hayMusica (){
        this.procesionConMusica = !this.procesionConMusica;
    }
}
