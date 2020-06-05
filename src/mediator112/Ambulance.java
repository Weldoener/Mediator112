package mediator112;

public class Ambulance extends Hulpverlener {

    public Ambulance(IMediator mediator, String naam) {
        super(mediator, naam);
    }

    public void ontvang(String bericht) {
        System.out.println("Ambulance heeft het bericht -=:|   " + bericht + "   |:=- ontvangen\r\n");
    }
}
