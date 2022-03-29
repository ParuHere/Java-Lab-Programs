public class Father {
    int a1;
    Father(int a)
    {
        a1 = a;
        try
        {
            if(a1 < 0)
            {
                throw new WrongAge("Age cannot be less than 0");
            }
        }
        catch(WrongAge e)
        {
            System.out.println(e);
        }

    }

}
