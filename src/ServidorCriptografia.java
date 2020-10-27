import java.rmi.Naming;

public class ServidorCriptografia {

    public ServidorCriptografia() {
        try {
            Criptografia obj = new CriptogtafiaImpl();
//          Chama o método static rebind da classe Naming (pacote java.rmi) para vincular (bind) o objeto remoto obj de ServidorCriptografia
//          ao rmiregistry e atribuir o nome //localhost/criptoService ao objeto remoto.
            Naming.rebind("//localhost/criptoService", obj);
        }
        catch(Exception e) {
            System.out.println("Erro: " + e);
        }
    }

    public static void main(String[] args) {
        new ServidorCriptografia();
    }
}
