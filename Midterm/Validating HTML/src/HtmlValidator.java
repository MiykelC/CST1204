
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;



/*
 * This is the HtmlValidator class.
 * You should implement this class.
 */
public class HtmlValidator {
    Queue<HtmlTag> tagsQueue;

    public HtmlValidator() {
        tagsQueue = new PriorityQueue<>();
    }

    public HtmlValidator(Queue<HtmlTag> tags) {
        if(tags == null) {
            throw new IllegalArgumentException();
        }
        tagsQueue = new LinkedList<>();
        Queue<HtmlTag> tempQueue = new LinkedList<>();
        for (HtmlTag x : tags) {
            tempQueue.add(x);
        }
        for (HtmlTag x : tags) {
            tagsQueue.add(x);
        }
    }

    public void addTag(HtmlTag tag) {
        if(tag == null) {
            throw new IllegalArgumentException();
        }
        tagsQueue.add(tag);
    }

    public Queue<HtmlTag> getTags() {
        Queue<HtmlTag> result = new LinkedList<>();
        Queue<HtmlTag> tempQueue = new LinkedList<>();

        for (HtmlTag x : tagsQueue) {
            tempQueue.add(x);
        }
        for (HtmlTag x : tempQueue) {
            result.add(x);
        }
        return result;
    }

    public void removeAll(String element ){
        for(HtmlTag x: tagsQueue){
            if(x.getElement().toString().equals(element)){
                tagsQueue.remove(x);
            }
        }
      
    }
    public void validate(){
        Stack<HtmlTag> TempStack = new Stack<>();
        int indentation = 0;
        for (HtmlTag aTag: tagsQueue){
            if(!aTag.isSelfClosing()){
                for(int i= 0; i<indentation; i++){
                    System.out.print(" ");
                }
                if(aTag.isOpenTag()){
                    TempStack.push(aTag);
                   indentation += 4;
                }
                else {
                    for(int i= 0; i<indentation -4; i++)
                        System.out.print(" ");
                    System.out.println(aTag.toString());
                    TempStack.pop();
                    indentation -= 4;
                }
            }
            if(TempStack.isEmpty())
            {
                while(!TempStack.isEmpty()){
                    System.out.println("Error unclosed tag:" + TempStack.pop());
                }
            }
  
        }
    }
}
   