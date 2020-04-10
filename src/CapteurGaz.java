import java.util.ArrayList;

public class CapteurGaz implements EventListener {
    ArrayList<EventAbstract> events;
    public CapteurGaz(){
        events= new ArrayList<EventAbstract>();
    }

    public ArrayList<EventAbstract> getEvents() {
        return this.events;
    }

    @Override
    public void newData(EventAbstract t) {
        if(t instanceof EventGaz) {
            events.add(t);
            System.out.println("Ajout d'un event");
        }else{
            throw new ExceptionInInitializerError();
        }

    }
}
