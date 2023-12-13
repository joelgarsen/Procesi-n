public class Procesion {
    private String nombreDeLaProcesion;
    
    private int numeroDePasos;
    
    private boolean procesionConMusica;
    public Procesion (String nombreProcesion,int numeroPasos) {
        nombreDeLaProcesion = nombreProcesion;
        numeroDePasos = numeroPasos;
        procesionConMusica = false;
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
        nombreDeLaProcesion = nombreDeLaProcesion;
    }
    
    public void añadirPasos (int Valor){
        int AñadirPasos = numeroDePasos + Valor;
    }
    
    public void hayMusica (){
        procesionConMusica = !procesionConMusica;
    }
    
    public String getDatos(){
        return "| Procesión: " + nombreDeLaProcesion + "| Número de Pasos:" + numeroDePasos + "| Lleva banda:" + procesionConMusica;
    }
    
    public void imprimirDatos (){
        System.out.println ("| La procesión " + nombreDeLaProcesion + "| Número de Pasos: " + numeroDePasos + "| Lleva banda: " + procesionConMusica);
    }
}
