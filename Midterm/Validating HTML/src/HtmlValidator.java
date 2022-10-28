
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * This is the HtmlValidator class.
 * You should implement this class.
 */
public class HtmlValidator {
    Queue<HtmlTag> tagsQueue;

    public HtmlValidator() {
        tagsQueue = new LinkedList<>();
    }

    public HtmlValidator(Queue<HtmlTag> tags) { // f[A, B]b
        if (tags == null)
            throw new IllegalArgumentException();
        tagsQueue = new LinkedList<>();
        Queue<HtmlTag> tempQueue = new LinkedList<>();
        for (HtmlTag x : tags) { // A
            tempQueue.add(x); // f[B, A]b
        }
        for (HtmlTag x : tempQueue) { // A
            tagsQueue.add(x); // f[A, B]b
        }
    }

    public void addTag(HtmlTag tag) {
        if (tag == null)
            throw new IllegalArgumentException("");
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

    public void removeAll(String element) {
        for (HtmlTag x : tagsQueue) {
            if (x.getElement().equals(element)) {
                tagsQueue.remove(x); 
            }
        }
    }

    public void validate() {
        Stack<HtmlTag> TempStack = new Stack<>();
        int indentation = 0;
        for (HtmlTag aTag : tagsQueue) {
            if (!aTag.isSelfClosing()) {

                if (aTag.isOpenTag()) {
                    // print the indentation
                    for (int i = 0; i < indentation; i++)
                        System.out.print(" ");
                    System.out.println(aTag.toString());

                    // you should push it onto a stack and increase your indentation.
                    TempStack.push(aTag);
                    indentation += 4;
                } else {
                    // print the indentation
                    for (int i = 0; i < indentation - 4; i++)
                        System.out.print(" ");
                    System.out.println(aTag.toString());
                    TempStack.pop();
                    indentation -= 4;
                }
            }
        }   
        // check if the stack is not empty, print ERROR unclosed tag:
        if (!TempStack.isEmpty()) {
            while (!TempStack.isEmpty()) {
                System.out.println("ERROR unclosed tag:" + TempStack.pop());
            }
        } 
    }
}