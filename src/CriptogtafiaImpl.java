public class CriptogtafiaImpl extends java.rmi.server.UnicastRemoteObject implements Criptografia {

    public CriptogtafiaImpl() throws java.rmi.RemoteException {
        super();
    }

//  Servidor criptografa uma entrada de texto emitido pelo cliente, e a devolva ao cliente em texto cifrado.
//  Esse método usa a criptografia simétrica com cifra de substituição de caracter, que substitui cada caracter por outro.
    public String criptografar(String a) throws  java.rmi.RemoteException {

        char charArray[];
        char charAux = ' ';     // Cria um vetor de char, sem definir o seu tamanho e cria uma variável char auxiliar
        String output = "Texto: " + a;
        int tam = a.length();
        charArray = new char[tam];
        output += "\n\nCriptografado: ";

//      Obtém a cadeia de caracteres e a coloca em um vetor de char com o mesmo tamanho da cadeia, separando cada caracter.
        a.getChars(0, tam, charArray, 0);

        for (int count = 0; count < charArray.length; count++)
        {
            if (charArray[count] == ' ')    charAux = ' ';
            if (charArray[count] == 'A' || charArray[count] == 'a') charAux = 'f';
            if (charArray[count] == 'B' || charArray[count] == 'b') charAux = 'j';
            if (charArray[count] == 'C' || charArray[count] == 'c') charAux = 'h';
            if (charArray[count] == 'D' || charArray[count] == 'd') charAux = 'r';
            if (charArray[count] == 'E' || charArray[count] == 'e') charAux = 'p';
            if (charArray[count] == 'F' || charArray[count] == 'f') charAux = 'l';
            if (charArray[count] == 'G' || charArray[count] == 'g') charAux = 'k';
            if (charArray[count] == 'H' || charArray[count] == 'h') charAux = 'z';
            if (charArray[count] == 'I' || charArray[count] == 'i') charAux = 's';
            if (charArray[count] == 'J' || charArray[count] == 'j') charAux = 'o';
            if (charArray[count] == 'K' || charArray[count] == 'k') charAux = 'u';
            if (charArray[count] == 'L' || charArray[count] == 'l') charAux = 'i';
            if (charArray[count] == 'M' || charArray[count] == 'm') charAux = 'b';
            if (charArray[count] == 'N' || charArray[count] == 'n') charAux = 'v';
            if (charArray[count] == 'O' || charArray[count] == 'o') charAux = 'm';
            if (charArray[count] == 'P' || charArray[count] == 'p') charAux = 'n';
            if (charArray[count] == 'Q' || charArray[count] == 'q') charAux = 'o';
            if (charArray[count] == 'R' || charArray[count] == 'r') charAux = 'c';
            if (charArray[count] == 'S' || charArray[count] == 's') charAux = 'x';
            if (charArray[count] == 'T' || charArray[count] == 't') charAux = 'a';
            if (charArray[count] == 'U' || charArray[count] == 'u') charAux = 'g';
            if (charArray[count] == 'V' || charArray[count] == 'v') charAux = 'q';
            if (charArray[count] == 'X' || charArray[count] == 'x') charAux = 'e';
            if (charArray[count] == 'Z' || charArray[count] == 'z') charAux = 't';

            charArray[count] = charAux;
            output += charArray[count];
        }
        return output;
    }

    public String descriptografar(String a) throws  java.rmi.RemoteException {

        char charArray[];   char charAux = ' ';
        String output = "Textp Criptografado: " + a;
        int tam = a.length();   charArray = new char[tam];
        output += "\n\nTexto Legível: ";

        a.getChars(0, tam, charArray, 0);

        for (int count = 0; count < charArray.length; count++) {
            if (charArray[count] == ' ')    charAux = ' ';
            if (charArray[count] == 'A' || charArray[count] == 'a') charAux = 's';
            if (charArray[count] == 'B' || charArray[count] == 'b') charAux = 'm';
            if (charArray[count] == 'C' || charArray[count] == 'c') charAux = 'q';
            if (charArray[count] == 'D' || charArray[count] == 'd') charAux = 't';
            if (charArray[count] == 'E' || charArray[count] == 'e') charAux = 'x';
            if (charArray[count] == 'F' || charArray[count] == 'f') charAux = 'a';
            if (charArray[count] == 'G' || charArray[count] == 'g') charAux = 'u';
            if (charArray[count] == 'H' || charArray[count] == 'h') charAux = 'c';
            if (charArray[count] == 'I' || charArray[count] == 'i') charAux = 'l';
            if (charArray[count] == 'J' || charArray[count] == 'j') charAux = 'b';
            if (charArray[count] == 'K' || charArray[count] == 'k') charAux = 'g';
            if (charArray[count] == 'L' || charArray[count] == 'l') charAux = 'f';
            if (charArray[count] == 'M' || charArray[count] == 'm') charAux = 'o';
            if (charArray[count] == 'N' || charArray[count] == 'n') charAux = 'p';
            if (charArray[count] == 'O' || charArray[count] == 'o') charAux = 'j';
            if (charArray[count] == 'P' || charArray[count] == 'p') charAux = 'e';
            if (charArray[count] == 'Q' || charArray[count] == 'q') charAux = 'v';
            if (charArray[count] == 'R' || charArray[count] == 'r') charAux = 'd';
            if (charArray[count] == 'S' || charArray[count] == 's') charAux = 'i';
            if (charArray[count] == 'T' || charArray[count] == 't') charAux = 'z';
            if (charArray[count] == 'U' || charArray[count] == 'u') charAux = 'k';
            if (charArray[count] == 'V' || charArray[count] == 'v') charAux = 'n';
            if (charArray[count] == 'X' || charArray[count] == 'x') charAux = 'r';
            if (charArray[count] == 'Z' || charArray[count] == 'z') charAux = 'h';

            charArray[count] = charAux;
            output += charArray[count];
        }
        return output;
    }
}