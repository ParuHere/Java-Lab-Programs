public class WrongAge extends Exception{
    String str;
    WrongAge(String s){str = s;}

    @Override
    public String toString() {
        return (str);
    }
}