package SistemaPedidosXCozinha;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteRecepção {
    static String className;
    
    public void CatchNome(){
        className = this.getClass().getSimpleName();
    }
    
    ClienteRecepção(){
        CatchNome();
    }
    
    public static void main(String[]args){
        
        ClienteRecepção c = new ClienteRecepção();
        
        System.out.println(className);
        
        try {

            Socket cliente = new Socket("127.0.0.1", 12345);
     
            System.out.println("O cliente Recepção se conectou ao Servidor!");
     
        } catch (IOException ex) {
            Logger.getLogger(ClienteRecepção.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao tentar se conectar com o Servidor"+ex);
        }
        
        
        
        
        
        
        

    }
}
