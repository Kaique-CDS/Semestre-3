package Torneio;

public class MainTorneio {
    public static void main(String[] args) {
        Torneio p1 = new Torneio("Garro", 6);
        Torneio p2 = new Torneio("Yuri", 14);
        Torneio p3 = new Torneio("Memphis", 35);

        p1.imprimeDados();
        p2.imprimeDados();
        p3.imprimeDados(); 
    }
}