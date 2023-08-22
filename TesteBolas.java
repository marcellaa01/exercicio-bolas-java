public class TesteBolas {
    public static void main(String[] args) {
        Pedra pedregulho = new Pedra();
        pedregulho.lancar();
       
        BolaDeBoliche columbia = new BolaDeBoliche ("Ebonite internacional");
        columbia.lancar();
        columbia.quicar();

        BolaDeFutebol macare = new BolaDeFutebol("Penalty");
        macare.lancar();
        macare.quicar();
    }
}