package Code;

public class LeapYear 
{
    private int year;
    public int getYear() 
	{
        return year;
    }
    public void setYear(int year) 
	{
        this.year = year;
    }
public boolean isLeapYear(int year)
{
  if (year % 4 != 0) 
  {
    return false;
  }
  else if (year % 100 == 0)
  {
    return false;
  }
  else if (year % 400 == 0)
  {
    return true;
  }
  else
  {
    return true;
  }
}
}