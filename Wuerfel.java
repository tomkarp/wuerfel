public class Wuerfel
{
    private int augen;
    private int max;
    
    public Wuerfel(int maximum) {
        maximum = max;
    }
    
    public void werfen() {
        if (max <= 0) {
            augen = 0;
        }
        else {
            augen = new java.util.Random().nextInt(max) + 1;
        }
    }
    
    public int getAugen() {
        return augen;
    }
}

