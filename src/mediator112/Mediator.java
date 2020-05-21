package mediator112;

import java.util.ArrayList;

public class Mediator implements IMediator {

    private ArrayList<FirstResponder> responders;

    public Mediator() {

        responders = new ArrayList<FirstResponder>();
    }

    public void responderToevoegen(FirstResponder firstResponder) {

        responders.add(firstResponder);
    }

    public void verzend(String bericht, FirstResponder originator, String naam) {
        //door alle responders bladeren
        for(FirstResponder firstResponder : responders) {
            //niet naar de verzender zelf sturen
            if(firstResponder != originator) {
                // als *, dan naar allemaal sturen
                if (naam == "*") {
                    firstResponder.ontvang(bericht);
                }
                //anders alleen sturen naar diegene waarvoor het bedoeld is
                else if (firstResponder.getNaam() == naam) {
                    firstResponder.ontvang(bericht);
                }
            }
        }
    }
}
