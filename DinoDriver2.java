import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class DinoDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver2
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        //Dinosaur[] pop = new Dinosaur[25];
        List<Dinosaur> dinoPop = new ArrayList<Dinosaur>();
        
        for (int i=0; i<30; i++)
        {
            double rand = Math.random();
            if (rand < 0.33)
            {
                Dinosaur t = new TRex();
                dinoPop.add(t);
            }
            else if (rand < 0.67)
            {
                dinoPop.add(new Velo());
            }
            else
            {
                dinoPop.add(new Bronta());
            }
        }
        
        for (int i = 0; i < pop.length; i++)
        {
        double ran = Math.random();
        if(ran < 0.33)
            pop[i] = new TRex();
        else if (ran < 0.67)
            pop[i] = new Velo();
        else
            pop[i] = new Bronta();
        DinoDriver2.growUp(pop[i]);
        }
        /*
        for(int i=0; i<pop.length; i++)
        {
            int rand = (int)(Math.random())*pop.length;
            if (pop[i].attack(pop[rand])) {
                System.out.println(pop[i].toString());
        }
        }
        */
        for(int i = 0; i < 5; i++)
        {
            System.out.println("#### Round " + (i+1) + " ####");
            DinoDriver2.battleRound(pop);
        }
        
        for(Dinosaur d : pop )
        {
            if (d.getHealth() > 0)
                System.out.println(d);
        }
    }
    
    private static void battleRound(Dinosaur[] p)
    {
        
        int attWins = 0;
        int battles = 0;
        for ( Dinosaur d : p )
        {
            if(d.getHealth()>0)
            {
                
                int rand;
                do
                {
                    rand = (int)(Math.random()*p.size());
                    //System.out.println("Getting different defender");
                    
                }while(p.get(rand) == d || p.get(rand).getHealth() == 0);
                battles++;
                /*
                int rand = (int)(Math.random()*p.length);
                while(p[rand] == d || p[rand].getHealth() == 0)
                {
                    int ran = (int)(Math.random()*p.length);
                    System.out.println("Getting different defender");
                    if (p[rand] == d)
                        System.out.println("Def is attacker");
                    else
                        System.out.println("Def is dead");
                    battles++;
                    
                }
                */
                //boolean attackerWon = d.attack(p[rand]);
                
                if (d.attack(p.get(rand))) {
                    d.update(p.get(rand));
                    attWins++;
                }
                else
                    p[rand].update(d);
                
            }
            
        }
            System.out.println("** total battles " + battles + " & attacker wins " + attWins);

    }
    
    private static void growUp(Dinosaur d)
    {
        int rand = (int)(Math.random()*35);
        d.setBattleCount(rand);
        for(int i = 0; i < rand; i++)
            d.ageUp();
    }
    
    
    
}