/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        SearchUtil searchUtil = new SearchUtil();
        
        int array[] = {10, 20, 30, 40};
        int elementX = 20;
        int elementY = 30;

        int x = searchUtil.search(array, elementX);
        int y = searchUtil.search(array, elementY);

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}

class SearchUtil{
    
    public int search(int a[], int element){
        return search(a, element, 0);
    }

    public int search(int a[], int element, int intial){
        for (int i = intial; i < a.length; i++) {
            if(a[i] == element){
                return i;
            }
        }
        return -1;
    }
}