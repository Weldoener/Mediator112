package mediator112;

// De abstracte class waar de subclasses Ambulance, Politie, Brandweer en Thuisbezorgd van overerven
public abstract class Hulpverlener {

    private IMediator mediator;

    // naam attribuut heb ik toegevoegd om gericht berichten te kunnen sturen
    private String naam;

    public String getNaam() {
        return naam;
    }

    // Constructor
    public Hulpverlener(IMediator mediator, String naam) {
        this.naam = naam;
        this.mediator = mediator;
    }

    //verstuurd een bericht via de mediator
    public void verzend(String bericht, String naar) {

        mediator.verzend(bericht, this, naar);
    }

    // ontvang een bericht via de mediator
    public abstract void ontvang(String bericht);
}