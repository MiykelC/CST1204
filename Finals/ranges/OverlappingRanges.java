package Finals.ranges;


import java.util.ArrayList;

public class OverlappingRanges {

  /**
   * Returns the smallest integer that is present in the maximum number of
   * input ranges
   * 
   * @param startPoints
   *                    the list of starting points for the ranges
   * @param endPoints
   *                    the list of end points for the ranges
   * @return the smallest integer that is present in the maximum number of
   *         ranges
   * @throws NoOverlapException
   *                            when there is no overlap between any of the ranges
   */
  public static Integer maxOverlapInt(ArrayList<Integer> startPoints,
      ArrayList<Integer> endPoints) throws NoOverlapException {


  if (startPoints == null || endPoints == null ) {
    throw new IllegalArgumentException();
  }
  if (startPoints.isEmpty() || endPoints.isEmpty()) {
    throw new IllegalArgumentException();
  }
  if (startPoints.size() != endPoints.size()) {
    throw new IllegalArgumentException();
  }
  for (int i = 0; i < startPoints.size(); i++) {
   if (startPoints.get(i) > endPoints.get(i)) {
    throw new IllegalArgumentException();
   }
} int [] arr = new int[1000];
for (int i = 0; i < startPoints.size(); i++) {
  for (int j = startPoints.get(i); j < endPoints.get(i); j++) {
    arr[j]++;
  }
}
int max = 0;
int count = 0;
for (int i = 0; i < arr.length; i++) {
  if (arr[i] > max) {
    max = arr[i];
    count = i;
  }
}
if (max == 0) {
  throw new NoOverlapException();
}
return count;
      }
    }



      
  
