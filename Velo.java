
/**
 * Write a description of class Velo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Velo extends Dinosaur
{
    // instance variables - replace the example below with your own
    private int numEaten;

    /**
     * Constructor for objects of class Velo
     */
    public Velo()
    {
        // initialise instance variables
        super("Velo");
        this.numEaten = 0;
    }

    public boolean attack(Dinosaur other)
    {
        boolean result = false;
        if (other.getType().equals("TRex")) {
            if (Math.random()<0.4)
                return result;
        }
        else if (other.getType().equals("Velo")) {
            if (Math.random()<0.5)
                return result;
        }
        else if (other.getType().equals("Bronta")) {
            if (Math.random()<0.7)
                return result;
        }
        return result;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        if (this.getAge() == 0)
            return super.toString();
        else
            return this.getType() + " " + this.getHealth();
    }
}
