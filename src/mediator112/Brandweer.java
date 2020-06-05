package mediator112;

public class Brandweer extends Hulpverlener {

    public Brandweer(IMediator mediator, String naam) {

        super(mediator, naam);
    }

    public void ontvang(String bericht) {

        System.out.println("Brandweer heeft het bericht -=:|   " + bericht + "   |:=- ontvangen\r\n");
    }
}