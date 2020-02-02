
public class Time
{
    private String sHour;
    private int iHour;
    private char indicator;
    public Time(String hr, String id)throws TimeClassException
    {
        sHour = hr;
        indicator = id.charAt(0);
        int ih = Integer.parseInt(hr.trim());
        id.toLowerCase().trim();
        setTimeMidnight();
        if((ih<0)||(ih>11) && !((id.equals("am"))||(id.equals("pm"))))
        {
          setTimeMidnight();
        }else{
         sHour = hr;
         iHour=ih;
         indicator=id.charAt(0);
        }
        setTimeMidnight();
        throw new TimeClassException ("error: invalid time");
    }
    private void setTimeMidnight()
    {
        sHour="00";
        iHour=0;
        indicator='a';
    }
    public String toString()
    {
       String s_indicator;
       if (indicator == 'a')
       {
           s_indicator="AM";
       
       }else{
       
           s_indicator="PM";
       }
       return (sHour + " " + s_indicator);
    }
}
