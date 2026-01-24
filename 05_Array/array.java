public class array{
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]); //prints all the values of each index one by one
        }
// another way to declare and initialize an array
      int value[]=new int []{1,2,3,4,5};
        for(int i=0;i<value.length;i++){
            System.out.println(value[i]);
        }  

        
//declaration and initialization separately
    int marks[]=new int[5]; //declaration of array with size 5
    marks[0]=90; //initialization of array elements
    marks[1]=85;
    marks[2]=88;
    marks[3]=92;
   // marks[4]=95;
    for(int i=0;i<marks.length;i++){
    System.out.println(marks[i]);
    }
  }
}