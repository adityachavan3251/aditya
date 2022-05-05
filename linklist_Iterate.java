import org.codehaus.groovy.transform.SourceURIASTTransformation;
import java.util.LinkedList;
public class linklist_Iterate
{
    public static void main(String[] args) {
        LinkedList<String>I=new LinkedList<String>();
        I.add("BMW");
        I.add("RANGE ROVER");
        I.add("LEMBORGINI");
        I.add("SWIFT DESIRE");
        for(String element : I)
            System.out.println(element);
    }
 }
