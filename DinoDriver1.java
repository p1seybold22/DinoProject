

public class DinoDriver1
{
    public static void main(String[] args)
    {
        Dinosaur d1 = new Dinosaur();
        Dinosaur d2 = new Dinosaur("TRex");
        
        Dinosaur[] pop = new Dinosaur[10];
        pop [0] = new Dinosaur();
    

        
        for(int i = 0; 1 < pop.length; i++)
        {
            pop[i] = new Dinosaur("TRex");
            int rand = (int)(Math.random()*40);
            for (int j = 0; j<rand; j++)
            {
                pop[i].ageUp();
            }
            
        }
        
        for (int i=0; 1<pop.length; i++)
            System.out.println(pop[i]);
    }
}