class NamedCow extends Cow
{    
  private String myName;
  public NamedCow(String name)    
  {             
     myName = name;
  }     
  public NamedCow()    
  {            
     myName = "Bessie";
  }      
  public String getName(){return myName;}
}
