/* Practicing some problem releated to time complexity. */

package Time_Space_complexity;

// public class demo2{
//     public static void main(String[] args) {
//         int ans=0;
//         for(int i=1;i<=n;i*=2){
//           for(int j=1;j<=i;j++){
//             ans++;
//           }
//         }
//     }
// }

/*
calculate the time complexity

i iteration   i         j          j iteration 
1             1        1-1            1
2             2        1-2            2
3             4        1-4            4
4             8        1-8            8
:             :         :             :
k             2^k      1-2^k          2^k

then we take the GP(Geometric progrataion)=a(r^n -1)/r-1.
so., 1+2+4+8+16........2^k.
1(2^k-1)/2-1=> 2^log2n-1... so for after ignoring lower degree terms finally we got the time complexity is:-
Time complexity:=>O(n).

*/