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
    
    public void setNombreDeLaProcesion (String nuevoNombreProcesion){
        nombreDeLaProcesion = nuevoNombreProcesion;
    }
    
    public void añadirPasos (int Valor){
        numeroDePasos = numeroDePasos + Valor;
    }
    
    public void hayMusica (){
        procesionConMusica = !procesionConMusica;
    }
    
    public String getDatos(){
    String  conMusica;
    if(procesionConMusica){
        conMusica  = "Si";
    }
    else{
        conMusica = "No";
    }
    return "| Procesión: " + nombreDeLaProcesion + "| Número de Pasos:" + numeroDePasos + "| Lleva banda:" + conMusica;
    }
    
    public void imprimirDatos (){
    String  conMusica;
    if(procesionConMusica){
        conMusica  = "Si";
    } 
    else{
        conMusica = "No";
    }
    System.out.println ("| La procesión " + nombreDeLaProcesion + "| Número de Pasos: " + numeroDePasos + "| Lleva banda:" + conMusica);
    }
}
