package SistemaPedidosXCozinha;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    ServerSocket servidor;
    
    public static void main(String[]args) throws IOException{
        
        ServerSocket servidor = new ServerSocket(12345);
     
        System.out.println("Porta 12345 aberta! Aguardando conexão...");

        Socket clienteRecepção = servidor.accept();
        
        Socket clienteCozinha = servidor.accept();
                
     
        System.out.println("Nova conexão com o cliente " + clienteRecepção.getInetAddress().getHostAddress());
        System.out.println("Esse socket ficará aberto até que o cliente se desconecte");
        
    }
    
    public void FecharServidor() throws IOException{
        servidor.close();
    }
    
}
