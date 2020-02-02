class Farm  
{     
  private Animal[] aBunchOfAnimals = new Animal[3];    
  public Farm()     
  {       
    aBunchOfAnimals[0] = new Cow("cow","moo");           
    aBunchOfAnimals[1] = new Chick("chick","cluck");       
    aBunchOfAnimals[2] = new Pig("pig","oink");    
  }         
  public void animalSounds()    
  {       
    for (int nI=0; nI < aBunchOfAnimals.length; nI++)      
    {          
     System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
    }    
  } 
}