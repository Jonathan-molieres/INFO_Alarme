import java.util.ArrayList;

public class CapteurFeu implements EventListener {
    ArrayList<EventAbstract> events;
    public CapteurFeu(){
        events= new ArrayList<EventAbstract>();
    }

    public ArrayList<EventAbstract> getEvents() {
        return this.events;
    }

    @Override
    public void newData(EventAbstract t) {
        if(t instanceof EventFeu) {
            events.add(t);
            System.out.println("Ajout d'un event");
        }else{
            throw new ExceptionInInitializerError();
        }
    }
    public void generateEvent(String location, int level){
        events.add(new EventFeu(this,location,level));
    }
}
