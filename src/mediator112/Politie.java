package mediator112;

public class Politie extends Hulpverlener {

    public Politie(IMediator mediator, String naam) {

        super(mediator, naam);
    }

    public void ontvang(String bericht) {

        System.out.println("Politie heeft het bericht -=:|   " + bericht + "   |:=- ontvangen");
    }
}