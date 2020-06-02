package mediator112;

public interface IMediator {

    public void verzend(String bericht, Hulpverlener hulpverlener, String naam);
    public void responderToevoegen(Hulpverlener hulpverlener);
}
