public class Procesion {
    private String nombreDeLaProcesion;
    
    private int numeroDePasos;
    
    private boolean procesionConMusica;
    public Procesion (String nombreProcesion,int numeroPasos) {
        nombreDeLaProcesion = nombreProcesion;
        numeroDePasos = numeroPasos;
        procesionConMusica = false;
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
        nombreDeLaProcesion = nombreDeLaProcesion;
    }
    
    public void a�adirPasos (int Valor){
        int A�adirPasos = numeroDePasos + Valor;
    }
    
    public void hayMusica (){
        procesionConMusica = !procesionConMusica;
    }
    
    public String getDatos(){
        return "| Procesi�n: " + nombreDeLaProcesion + "| N�mero de Pasos:" + numeroDePasos + "| Lleva banda:" + procesionConMusica;
    }
    
    public void imprimirDatos (){
        System.out.println ("| La procesi�n " + nombreDeLaProcesion + "| N�mero de Pasos: " + numeroDePasos + "| Lleva banda: " + procesionConMusica);
    }
}
