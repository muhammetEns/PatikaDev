import java.util.ArrayList;


public class ListeClass <t>{

    private final static int  cap = 10,  emptyCapa=0;
    private int capacity;
    transient Object[] arr ;



    @SuppressWarnings("unchecked")
    public ListeClass() {
        arr = (t[]) new Object[cap];
        System.out.println("10 caplık array oluştu");
        capacity = cap ;
    }

    @SuppressWarnings("unchecked")
    public ListeClass(int capacity) {
        this.capacity = capacity;
        if (capacity>0){
            arr = (t[]) new Object[cap];
            System.out.println(capacity + " lik olustu");
        }else if(capacity ==0){
            arr = (t[]) new Object[emptyCapa];
            System.out.println(capacity + " lik olustu");
        }else{
            throw new ArithmeticException("Geçersiz kapasite") ;
        }

    }

    public int size(){
        int Size =0;
         for (int i =0 ; i<capacity ;i++ ){
             if(arr[i] == null){
                 return  Size ;
             }
             Size++ ;
         }
         return Size ;
    }

    public int getCapacity(){
        return capacity ;
    }
    @SuppressWarnings("unchecked")
    public void add(t data){
        if (size() ==10){
            capacity=capacity*2 ;
            t[] arr1 = (t[]) new Object[capacity];
            arr1 = (t[]) arr;
            arr = (t[]) new Object[capacity];
            for(int i =0; i<arr1.length; i++){
                if (arr1[i] == null){
                    continue;
                }
                arr[i] = arr1[i] ;
            }

        }
        arr[size()] = data ;


    }

    public t get(int index){
        try{
            return (t) arr[index];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("geçersiz array indexi !!");
            return null ;
        }

    }

    public void remove(int index){

        if (index<0 || index>capacity){
            System.out.println("null");
        }else{
            for (int i =(index) ;i<size() ; i++ ){

                arr[i] = arr[i+1] ;

            }
        }



    }

    public void set(int index, t data){

        if (index<0 || index>capacity){
            System.out.println("null");
        }else{
            arr[index] = data ;
        }


    }

    public String toString(){
        String temp ="" ;
        for (int i = 0 ; i<capacity ; i++){
            if (arr[i] == null){
                return temp ;
            }
            temp =  (temp+(String)(arr[i] + "\n")) ;
        }
        return "" ;
    }

    public int indexOf(t data1){

        for (int i = 0 ; i<size() +1 ; i++){
              if(arr[i] == data1){
                  return i ;
              }

        }


        return -1;
    }

    public boolean isEmpty(){
        return arr[0] ==null ;
    }

    public void clear(){
        for (int i = 0 ; i<size() ; i++){
            if (arr[i] ==null){
                return;
            }else{
                arr[i] = null ;
            }
        }
    }

    @SuppressWarnings("unchecked")

    public ArrayList subList(int start,int finish){
        ArrayList<t> aList=new ArrayList<>(); ;
        t temp1 ;
        for (int i = start ; i<finish+1 ; i++){
            temp1 = (t)arr[i] ;
            aList.add(temp1) ;
        }

        return aList ;
    }

    public boolean contains(t data){
        for (int i = 0 ; i<size()  ; i++){
            if(arr[i] == data){
                return true ;
            }
        }
        return false ;
    }

}
