package mediator112;

import java.util.ArrayList;

public class Mediator implements IMediator {

    private ArrayList<Hulpverlener> hulpverleners;

    public Mediator() {

        hulpverleners = new ArrayList<Hulpverlener>();
    }

    public void responderToevoegen(Hulpverlener hulpverlener) {

        hulpverleners.add(hulpverlener);
    }

    public void verzend(String bericht, Hulpverlener hulp, String naam) {
        //door alle responders bladeren
        for(Hulpverlener hulpverlener : hulpverleners) {
            //niet naar de verzender zelf sturen
            if(hulpverlener != hulp) {
                // als *, dan naar allemaal sturen
                if (naam == "*") {
                    hulpverlener.ontvang(bericht);
                }
                //anders alleen sturen naar diegene waarvoor het bedoeld is
                else if (hulpverlener.getNaam() == naam) {
                    hulpverlener.ontvang(bericht);
                }
            }
        }
    }
}
