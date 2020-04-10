public class EventRadiation extends EventAbstract {
    private int radiation;

    public EventRadiation(Object source, String location, int level, int radiation) {
        super(source,location,level);
        if( radiation>=1 && radiation<=100){
            this.radiation=radiation;
        } else {
            throw new ExceptionInInitializerError();
        }
    }
}