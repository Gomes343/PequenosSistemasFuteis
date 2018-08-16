package Tempo;

import java.util.Timer;
import java.util.TimerTask;

public class AgendarTarefa {
    Timer timer;
    
    public AgendarTarefa(int seconds){
        timer = new Timer();
        timer.schedule(new RemindTask(),seconds*1000);
    }
    
    class RemindTask extends TimerTask {
        //Método Run informa oque irá fazer!
        public void run(){
            //informe aqui dentro oque deverá acontecer após ser agendado.
            System.out.println("...Tarefa Realizada!...");
            timer.cancel();
        }
    }
    
    
    public static void main(String[]args){
        System.out.println("MAIN PARA TESTE DA CLASSE");
        
            new AgendarTarefa(60);
             
    }
    
    
}
