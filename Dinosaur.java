/**
 * Write a description of class Dinosaur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public abstract class Dinosaur
{
    // instance variables - replace the example below with your own
    private String type;
    private int age;
    private String gender;
    private int health; //0-100
    private int wins;
    private int battleCount;
    private static int population;
    

    /**
     * Constructor for objects of class Dinosaur
     */
    public Dinosaur()
    {
        // initialise instance variables
        this.type = "Dino";
        this.age = 0;
        double ge = Math.random();
        if (ge>0.5) {
            this.gender = "M";
        }
        else {
            this.gender = "F";
        }
        this.health = 10;
        this.wins = 0;
        this.battleCount = 0;
        Dinosaur.population++;
       
    }

    public Dinosaur(String t)
    {
        this.type = t;
        this.age = 0;
        this.health = 10;
        double gen = Math.random();
        if (gen>0.5) {
            this.gender = "M";
        }
        else {
            this.gender = "F";
        }
    }
    
    public String getType()
    {
        return this.type;
    }
    
    public String getGender()
    {
        return this.gender;
    }
    
    public int getHealth()
    {
        return this.health;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public int getWins()
    {
        return this.wins;
    }
    
    public int getBattleCount()
    {
        return this.battleCount;
    }
    
    private static int getPop()
    {
        return population;
    }
    
    public static int getPopulation()
    {
        return Dinosaur.population;
    }
    
    public void setType(String t)
    {
        this.type = t;
    }
    
    public void setGender(String g)
    {
        this.type = g;
    }
    
    public void setAge(int aa)
    {
        this.age = aa;
    }
    
    public void setHealth(int bb)
    {
        this.health = bb;
    }
    
    public void setWins(int cc)
    {
        this.wins = cc;
    }
    
    public void setBattleCount(int dd)
    {
        this.battleCount = dd;
    }
    
    public static void setPopulation(int p)
    {
        Dinosaur.population = p;
    }
    
    public boolean equals(Dinosaur d)
    {
        if (this.age == d.getAge())
        {
            if (this.type.equals(d.getType()))
            {
                int healthDiff = this.health - d.getHealth();
                if (Math.abs(healthDiff) < 10)
                    return true;
            }
        }
        
        return false;
        
    }
    
    public double getBattleFactor(Dinosaur other)
    {
        double healthFact = 0;
        double battlePercent;
        double expFact = 0;
        healthFact = (this.health / 100.0) * 0.67;
        
        if (this.battleCount + other.getBattleCount() > 0)
        {
             battlePercent = (double)this.battleCount / 
             (this.battleCount + other.getBattleCount());
             expFact = battlePercent * 0.33;
        }
        return healthFact + expFact;
    }

    public void update(Dinosaur loser)
    {
        
        loser.setHealth(loser.getHealth()-20);
        this.setHealth(this.getHealth()-5);
        this.battleCount++;
        this.wins++;
        loser.setBattleCount(loser.getBattleCount()+1);
        if (loser.getHealth() < 0)
            loser.setHealth(0);
    }
    
    public abstract boolean attack(Dinosaur other);
    
    
    public void ageUp()
    {
        if (this.health>0)
        {
            this.age++;
        
            if (this.age<10)
            {
                this.health = this.health + 10;
            }
            else if (this.age>=25 && this.age <=30)
            {
                this.health = this.health - 5;
            }
            else if (this.age>30)
            {
                this.health = this.health - 10;
            }
        
        }
    }
    
    
    public String toString()
    {
        String answer = this.type + " " + this.age + " " + this.health + " " + this.gender;
        return answer;
        
    }
}
