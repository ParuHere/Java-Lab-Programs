public class Son extends Father {
    int f1,s1;
    Son(int f,int s)
    {
        super(f);
        s1 = s;
        try
        {
            if(s1 >= f) {
                throw new NotPossible("Son's Age cant be greater then Father's age");
            }
        }
        catch(NotPossible e)
        {
            System.out.println(e);
        }
    }
}
