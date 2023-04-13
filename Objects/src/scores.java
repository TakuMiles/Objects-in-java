import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class scores {
    private String[] collection_Names = {"Chemistry", "Math", "English"};
    private List <List<Integer>> Marks = new ArrayList<List<Integer>>();
    
    scores()
    {
        Marks.add(Arrays.asList(10, 42, 33));
        Marks.add(Arrays.asList(45, 25, 34));

    }

    public int marks_input(List <Integer> x)
    {
        //x.size() is less than 4
        Marks.add(x);
        return 0;
    }
    public void Marks_View()
    {
        System.out.println("THESE ARE MARKED OUT OF:\t50");
        System.out.println("===================================================");

        for(List<Integer> row: Marks)
        {
            for(int i = 0; i < row.size(); i++)
                System.out.print(collection_Names[i] + "\t" + row.get(i) + "\t");
            System.out.println();
        }

    }
}
