public class Main {
    public static void main(String[] argv) {

        CapteurGaz gaz = new CapteurGaz();
        EventGaz e=new EventGaz(gaz,"ggg",2,"h2o");
        gaz.newData(e);
        System.out.println(e);
    }
}
