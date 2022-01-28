public class PatternCollection extends UserInput {

    static void pattern1(int count)
    {
        for (int row=0;row<count;row++)
        {
            for (int col=1;col<=row;col++)
            {
                System.out.print(itemDisplay);
            }
            System.out.println();
        }

    }
    static void pattern2(int count)
    {
        for(int row=0;row<=count;row++)
        {
            for (int col=count;col>=row;col--)
            {
                System.out.print(itemDisplay);
            }
            System.out.println();


        }
    }
}
