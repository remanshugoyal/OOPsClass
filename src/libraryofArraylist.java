class myarraylist{
    Integer arr[];
    int size;
    int capacity;


     public myarraylist(){
         size=0;
         capacity=10;
         arr=new Integer[capacity];
     }
     public myarraylist(int capacity){
         size=0;
         this.capacity=capacity;
         arr=new Integer[capacity];

     }
     public void add(Integer ele){
         if(size==capacity){

         }
         else {
             arr[size] = ele;
             size++;
         }
     }
     public int get(Integer index){
         return arr[index];
     }
     public int remove(){

         size--;
         int res=arr[size];
         return res;
     }
     public void display(){
         for(int i=0;i<size;i++){
             System.out.println(arr[i]);
         }
     }
}





public class libraryofArraylist {
    public static void main(String[] args) {
        myarraylist ml=new myarraylist();
        ml.add(1);
        ml.add(10);
        ml.add(45);
        ml.remove();
        ml.display();
    }
}
