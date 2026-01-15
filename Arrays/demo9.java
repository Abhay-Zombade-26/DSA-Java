//Find all unique elements in an array (elements that appear only once(basic approach)).

package Arrays;

public class demo9 {

    public static void uniqueElements(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i != j & arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=-1){
                System.out.print(arr[i]+" ");
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={10,20,10,70,20,40};
        uniqueElements(arr);
      }
 }
