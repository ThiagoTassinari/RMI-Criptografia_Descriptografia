package br.com.ceuma.criptografia;

import javax.swing.*;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;

public class ClienteCriptografia {

    public static void main(String[] args) {

        String A, resp ="";
        // Faz uma pergunta Sim = 0 ou Não = 1
        int option = JOptionPane.showConfirmDialog(null, "Sim = Criptografia" + "\nNão Descriptografia", "Escolha uma opção", 0);

        try {
            Criptografia cripto = (Criptografia) Naming.lookup("//localhost/" + "criptoService");
            if (option == 0) {
                A = JOptionPane.showInputDialog("Entre com o TEXTO. Sem acento");
                resp = cripto.criptografar(A);
            } else {
                A = JOptionPane.showInputDialog("Entre com o TEXTO. Sem acento");
                resp = cripto.descriptografar(A);
            }
        }
        catch (MalformedURLException murle) {
            System.out.println();
            System.out.println("MalformedURLException");
            System.out.println( murle );
        }
        catch (RemoteException re) {
            System.out.println();
            System.out.println("Remote Exception");
            System.out.println( re );
        }
        catch (NotBoundException nbe) {
            System.out.println();
            System.out.println("NotBoundException");
            System.out.println( nbe );
        }
        catch (java.lang.ArithmeticException ae) {
            System.out.println();
            System.out.println("java.lang.ArithmeticException");
            System.out.println(ae);
        }
        catch (java.lang.StringIndexOutOfBoundsException str) {
            System.out.println();
            System.out.println("java.lang.StringIndexOutOfBoundsException");
            System.out.println(str);
        }
        catch (java.lang.ArrayIndexOutOfBoundsException arr) {
            System.out.println();
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
            System.out.println(arr);
        }

        JTextArea outputArea = new JTextArea();
        outputArea.setText( resp );

//      Quando a classe ClienteCriptografia executa, ela faz uma pergunta sobre qual serviço quer realizar (criptografia ou descriptografia), o cliente escolhe, entra
//      com o texto e a classe faz uma chamada de método remoto especifico para o servidor.
        JOptionPane.showMessageDialog(null, outputArea, "Texto Criptografado", JOptionPane.INFORMATION_MESSAGE);
    }
}
