package mediator112;

public interface IMediator {

    public void verzend(String bericht, FirstResponder firstResponder, String naam);
    public void responderToevoegen(FirstResponder firstResponder);
}
