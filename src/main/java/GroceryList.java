import java.util.Arrays;
public class GroceryList {
    private String[] itemArray;

    public GroceryList(){
        itemArray= new String[10]; 
    }

    public GroceryList(int a){
        itemArray= new String[a];
    }

    public GroceryList(String[] a){
        itemArray = a;
    }

    

    public void add(String a){
        int startL = this.itemArray.length;
        String[] arr = new String[startL+1];
        for(int i =0; i<startL;i++){
            arr[i]=this.itemArray[i];
        }
        arr[startL]=a;
        this.itemArray = arr;
    }

    public void remove(String a){
        int startL = this.itemArray.length;
        String[] arr = new String[startL-1];

        for(int i = 0; i<this.itemArray.length;i++){
            if this.itemArray[] 
        }
        for(int i =0; i<startL;i++){
            arr[i]=this.itemArray[i];
        }
        
        this.itemArray = arr;
    }



    public String toString(){
        return "This Grocery List has: " + Arrays.toString(itemArray);
    }




}