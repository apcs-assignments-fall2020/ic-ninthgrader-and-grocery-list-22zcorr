import java.util.Arrays;
public class GroceryList {
    private String[] itemArray;

    public GroceryList(){
        itemArray= new String[10]; 
    } 

    public void add(String a){
        boolean complete = false;
        int startL = this.itemArray.length;
        for(int i =0; i<startL;i++){
            if(!complete && (itemArray[i]==(null))){
                itemArray[i]=a;
                complete = true;
            }
        }
        if (complete){
            System.out.println(this);
        }else{
            System.out.println("Grocery List full, remove an item first before adding new ones.");
        }
    
    }

    public void remove(String a){
        boolean complete = false;
        boolean nullFound = false;
        int startL = this.itemArray.length;
        for(int i =0; i<startL;i++){
            if(!complete && (itemArray[i].equals(a))){
                itemArray[i]=null;
                complete = true;
            }
        }
        if (complete){
            for(int j =0; j<startL-1;j++){
            if((itemArray[j]==null)||nullFound){
                itemArray[j]=itemArray[j+1];
                nullFound=true;
                }
            }
        System.out.println(this);
        }else{
            System.out.println("Item not found. (If this seems incorrect, check capitalization and spelling!)");
        }
    
    }

    /*public void remove(String a){
        int startL = this.itemArray.length;
        String[] arr = new String[startL-1];

        for(int i = 0; i<this.itemArray.length;i++){
            if this.itemArray[] 
        }
        for(int i =0; i<startL;i++){
            arr[i]=this.itemArray[i];
        }
        
        this.itemArray = arr;
    }*/



    public String toString(){
        return "Right now, this Grocery List has: " + Arrays.toString(itemArray);
    }




}