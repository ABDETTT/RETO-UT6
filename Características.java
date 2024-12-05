public class Características {
    private String [] ArrayCaracterísticas = {"Color", "Transmisión", "Motorización"};
    private String [] ColoresDisponibles = {"Rojo", "Negro", "Azul", "Amarillo", "Blanco"};
    private String [] TransmisiónDisponibles = {"Manual", "Automática"};
    private String [] MotorizaciónDisponible = {"Gasolina", "Gasoil", "Hibrido", "Electrico"};
    private String [] ArrayCaracterísticasSelec = new String[ArrayCaracterísticas.length];

    protected void solicitarCaracterísticas(){
        int n=0;
        for(int i=0; i<ArrayCaracterísticas.length; i++){
            System.out.println("Elige un "+ArrayCaracterísticas[i]);
            n=i;
            if(n==0){
                for(int u=0; u<ColoresDisponibles.length; u++){
                    System.out.println(u+1+". "+ColoresDisponibles[u]);
                    System.out.println("Selecciona una opcion: "+ArrayCaracterísticasSelec[i]);
                }
            }else if(n==1){

            }else if(){
                
            }
            
        }
    }

}
