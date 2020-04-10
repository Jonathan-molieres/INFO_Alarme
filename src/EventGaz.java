
public class EventGaz extends EventAbstract {
    private String typeGaz ;
    public EventGaz(Object source,String location,int level,String typeGaz) {
        super(source,location,level);
        this.typeGaz=typeGaz;
    }
}
