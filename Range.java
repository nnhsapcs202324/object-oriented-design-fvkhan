import java.util.ArrayList;
public class Range implements NumberGroup
{
    private int min;
    private int max;
    private ArrayList<Integer> range;
    public Range(int min, int max)
    {
        this.min = min;
        this.max = max;
        this.range = new ArrayList<Integer>();
        for (int i = min; i < range.size() + 1; i++)
        {
            range.add(i);
        }
    }
    
    @Override
    public boolean contains(int num)
    {
        boolean contain = false;
        for (int i : this.range)
        {
            if (i == num)
            {
                contain = true;
            }
        }
        return contain;
    }
}