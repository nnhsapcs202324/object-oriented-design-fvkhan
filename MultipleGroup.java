import java.util.ArrayList;
public class MultipleGroup implements NumberGroup
{
    private ArrayList<NumberGroup> groupList;
    public MultipleGroup()
    {
        this.groupList = new ArrayList<NumberGroup>();
    }
    
    @Override
    public boolean contains(int num)
    {
        boolean contains = false;
        for (NumberGroup numberGroup : this.groupList)
        {
            if (numberGroup.contains(num) == true)
            {
                contains = true;
            }
        }
        return contains;
    }
}