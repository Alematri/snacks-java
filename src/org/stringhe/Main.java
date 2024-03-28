public class Main {
    public static void main(String[] args) {
        // Array di stringhe
        String[] arrayDiStringhe = {"mi", "piace", "la", "nutella", "e", "il", "gelato", "con", "la", "panna"};

        // Ciclo for per trasformare tutti gli elementi in upper case
        for (int i = 0; i < arrayDiStringhe.length; i++) {
            arrayDiStringhe[i] = arrayDiStringhe[i].toUpperCase();
        }

        // Stampiamo l'array di stringhe trasformato in maiuscolo
        for (String str : arrayDiStringhe) {
            System.out.println(str);
        }
    }
}