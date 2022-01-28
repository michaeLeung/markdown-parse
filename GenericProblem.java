public class GenericProblem<T>
{
    private Object[] elements;
 
    public GenericProblem(T[] arr) { 
        this.elements = arr;
    }

    /** Remove and return the element at index
     * Shift all remaining elements to the left.
     * Replace the last element with null.
     * Assume index is in bounds.
     */
    public T removeIndex(int index){
        T toReturn = null;
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                toReturn = (T)elements[i];
            }
            // Shift the rest of the elements over to replace the one we are removing
            if (i >= index && i < elements.length-1) {
                elements[i] = elements[i+1];
            }
        }
        // Set the last element to null
        elements[elements.length - 1] = null;
        return toReturn;
    }  

    public void printArray() {
        for (Object item : elements) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] myInts = {1, 2, 3, 4, 5};
        GenericProblem<Integer> ref = new GenericProblem<Integer>(myInts);
        ref.printArray();
        ref.removeIndex(1);
        ref.printArray();
        ref.removeIndex(1);
        ref.printArray();
        for (int i = 0; i < myInts.length; i += 1){
            System.out.println(myInts[i]);
        }
        // CHECKPOINT 
    }
}
