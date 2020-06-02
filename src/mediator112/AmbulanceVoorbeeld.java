package mediator112;

// Dit voorbeeld is uitsluitend om aan te tonen wat een mediator pattern oplost.
// Deze code wordt niet uitgevoerd door het programma

public class AmbulanceVoorbeeld  {

    String _naam;
    Brandweer _brandweer;
    Politie _politie;
    Thuisbezorgd _thuisbezorgd;

    public AmbulanceVoorbeeld(String naam,
                              Brandweer brandweer,
                              Politie politie,
                              Thuisbezorgd thuisbezorgd) {

        _naam = naam;
        _brandweer = brandweer;
        _politie = politie;
        _thuisbezorgd = thuisbezorgd;

    }



    public void ontvang(String bericht) {
        System.out.println("Ambulance heeft het bericht -=:|   " + bericht + "   |:=- ontvangen");
    }
}
