public class Procesion {
    private String nombreDeLaProcesion;
    
    private int numeroDePasos;
    
    private boolean procesionConMusica;
    public Procesion (String nombreProcesion,int numeroPasos) {
        this.nombreDeLaProcesion = nombreProcesion;
        this.numeroDePasos = numeroPasos;
        this.procesionConMusica = false;
    }
    
    public String getNombreDeLaProcesión (){
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
    
    public void añadirPasos (int Valor){
        int AñadirPasos = numeroDePasos + Valor;
    }
    
    public void hayMusica (){
        this.procesionConMusica = !this.procesionConMusica;
    }
}
