/**
 * Created by Lenovo on 7/30/2018.
 */
public class SandwichFilling
{
    private String filling;
    private int calories;
    public SandwichFilling(String fill, int cal)
    {
        filling = fill;
        calories = cal;
    }
    public String getSandwichFilling()
    {
        return filling;
    }
    public int getCalories()
    {
        return calories;
    }
}
