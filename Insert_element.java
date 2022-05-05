    import java.util.ArrayList;
    import java.util.List;
    public class Insert_element {
    public static void main (String[] args){
        List<String> E=new ArrayList<String>();
        E.add("RED");
        E.add("BLUE");
        E.add("black");
        E.add("white");
        E.add("green");
        System.out.println(E);
        E.add(0,"golden");
        E.add(4,"silver");
        System.out.println(E);

    }
}
