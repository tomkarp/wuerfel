public class Wuerfel
{
    private int augen;
    private int max;
    
    public Wuerfel(int maximum) {
        maximum = max;
    }
    
    public void werfen() {
        augen = new java.util.Random().nextInt(max);
    }
    
    public int getAugen() {
        return augen;
    }
}
