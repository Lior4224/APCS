public class Test {
//     // public static boolean endOther(String a, String b) {
//     //     a = a.toLowerCase();
//     //     b = b.toLowerCase();
//     //     if (a.length() > b.length()) {
//     //         return(a.substring(a.length()-b.length(), a.length()).equals (b)); 
//     //     }
//     //     else {
//     //         return (b.substring(b.length()-a.length(), b.length()).equals (a)); 
//     //     }
//     // }
//     public static boolean xyzThere(String str) {
//         // boolean output = true;
//                     //ATTEMPT 1: all are correct except xyz.abc and other tests
//     //     if (str.length() <= 3) {
//     //         for (int i = 0; i < str.length()-3; i++) {

//     //             if ((str.substring(i+1, i+4)).equals ("xyz")) {
//     //                 if (i == 0 || (str.substring(i, i+1)).equals (".")) {
//     //                     output = false;
//     //                 }
//     //                 else {
//     //                     output = true;
//     //                 }
//     //             }
//     //             else {
//     //                 output = false;
//     //             }
//     //         }
//     //     }
//     //     else {
//     //         output = false;
//     //     }
//     //     return output;
//     // }
//                 //ATTEMPT 2: all are correct except abcxy
//     // if (str.length() >= 3) {
//     //     for (int i = 0; i < str.length()-2; i++) {
          
//     //       if ((str.substring(i, i+3)).equals ("xyz")) {
//     //         if (i == 0 || !(str.substring(i-1, i)).equals (".")) {
//     //          output = true;
//     //        }
//     //        else {
//     //           output = false;
//     //        }
//     //       }
//     //     //   else {
//     //     //   output = false;
//     //     // }
//     //     }
//     //   }
//     //   else {
//     //     output = false;
//     //   }
//     //   return output;
//     // }
//                 //ATTEMPT 3: searched up on internet, works for all cases but uses str.charAt
//         for(int i=0; i < str.length()-2; i++) {
//           if(str.substring(i,i+3).equals("xyz")) {
//             if(i==0) {
//             return true;
//             }
//             else if(str.charAt(i-1) != '.') {
//               return true;
//             }
//           }
//         }
//         return false;
//       }
//     public static void main( String[] args ) {
//         System.out.println(xyzThere("xy"));
//         // System.out.println(endOther("HiaBC", "abc"));
//     } 
// }

//       //         if (((str.substring(i, i+3)).equals ("xyz")) || 
//         //         (((str.substring(i+1, i+4)).equals ("xyz"))) 
//         //         && !((str.substring(i, i+1)).equals ("."))) {
//         //             output = true;
//         //         }
//         //         else {
//         //             output = false;
//         //         }
//         //     }
//         // }
//         // else {
//         //     output = false;
public static boolean xyzThere(String str) {
for(int i=0; i < str.length()-2; i++) {
  if(str.substring(i,i+3).equals("xyz")) {
    if(i==0) {
    return true;
    }
    else if(!(str.substring(i-1, i).equals ("."))) {
      return true;
    }
  }
}
return false;
}
public static void main(String[] args) {
  System.out.println(xyzThere("abc.xyz"));
}
        }