package mediator112;

public class Main {
    public static void main(String[] args) {

        // een frisse, fruitige nieuwe mediator aanmaken
        IMediator mediator = new Mediator();

        // Hulpverlener objecten creëren waarin de mediator wordt geinjecteerd en de naam van de hulpverlener
        Ambulance ambulance = new Ambulance(mediator, "Ambulance");
        Politie politie = new Politie(mediator, "Politie");
        Brandweer brandweer = new Brandweer(mediator, "Brandweer");
        Thuisbezorgd thuisbezorgd = new Thuisbezorgd(mediator, "Thuisbezorgd");

        // de voorgaande hulpverleners worden toegevoegd aan het lijstje van de mediator
        mediator.responderToevoegen(ambulance);
        mediator.responderToevoegen(politie);
        mediator.responderToevoegen(brandweer);
        mediator.responderToevoegen(thuisbezorgd);

        // Stuur een bericht naar 1 hulpverlener of met een * naar allemaal
        ambulance.verzend("Politie nodig op adres Dukaatstraat 11 in Eindhoven!!", "Politie");

        politie.verzend("CapiCapi Ambulance, politie is onderweg!", "Ambulance");

        brandweer.verzend("Aan Politie: Wij zijn ook onderweg!", "Politie");

        brandweer.verzend("Aan Ambulance: Zit er iemand klem?", "Ambulance");

        ambulance.verzend("Ja Brandweer, er zit iemand klem. Graag spoed!", "Brandweer");

        politie.verzend("Wij zijn er!!", "*");

        thuisbezorgd.verzend("Iets te drinken erbij?", "*");

    }
}
