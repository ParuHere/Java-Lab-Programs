public class NotPossible extends Exception{
    String str;
    NotPossible(String s){str = s;}

    @Override
    public String toString() {
        return (str);
    }
}