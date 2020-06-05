package mediator112;

public class Thuisbezorgd extends Hulpverlener {

    public Thuisbezorgd(IMediator mediator, String naam) {

        super(mediator, naam);
    }

    public void ontvang(String bericht) {

        System.out.println("Thuisbezorgd.nl heeft het bericht -=:|   " + bericht + "   |:=- ontvangen\r\n");
    }
}