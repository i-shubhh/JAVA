public class LightDistance {
    public static void main(String[] args)
    {
        long speedoflight = 300000000L;
        long days = 1000L;
        long hours = 24L;
        long minutes = 60L;
        long seconds = 60L;

        long distance = speedoflight * days * hours * minutes * seconds;
        System.out.println("The distance light travels in 1000 days is '" + distance + " meters.");

    }

}