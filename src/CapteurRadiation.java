import java.util.ArrayList;

public class CapteurRadiation implements EventListener {
    ArrayList<EventAbstract> events;
    public CapteurRadiation(){
        events= new ArrayList<EventAbstract>();
    }

    public ArrayList<EventAbstract> getEvents() {
        return this.events;
    }

    @Override
    public void newData(EventAbstract t) {
        if(t instanceof EventRadiation) {
            events.add(t);
            System.out.println("Ajout d'un event");
        }else{
            throw new ExceptionInInitializerError();
        }

    }
}
