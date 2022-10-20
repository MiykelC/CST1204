
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * This is the HtmlValidator class.
 * You should implement this class.
 */
public class HtmlValidator {
    
    Queue<HtmlTag> aQueue;
    
    public HtmlValidator(){
        Queue<HtmlTag> aQueue = new PriorityQueue();
    }
    public HtmlValidator(Queue<HtmlTag> tags){
        for(HtmlTag x : tags){
        aQueue.add(x);
        }
    }
    public void addTag(HtmlTag tag){
        aQueue.add(tag);
    }
    public void removeAll(String element){
        for (HtmlTag x: aQueue){
        if(x.getElement() == element)
        aQueue.remove(x);
        }
    }
    public char[] getTags() {
        return null;
    }
    public void validate() {
    }
}
