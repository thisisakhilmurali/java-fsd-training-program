package demointerface;

public class Main {
    public static void main(String[] arg) {

        Sim sim1 = new Vi();
        sim1.call();
        sim1.internet();

        Sim sim2 = new Airtel();
        sim2.call();
        sim2.internet();

        Sim sim3 = new Jio();
        sim3.call();
        sim3.internet();

    }
}
