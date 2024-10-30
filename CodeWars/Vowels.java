// Return the number (count) of vowels in the given string.

// We will consider a, e, i, o, u as vowels for this Kata (but not y).

// The input string will only consist of lower case letters and/or spaces.




public class Vowels {

  public static int getCount(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      //char ch = str.charAt(i); // we know what character we are at
      switch(str.charAt(i)) { // refactored after seeing Reddragone9 use of switch cases
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          count++;
          //break; no need for break
          
      }
    }
    
    return count;
  }

}


// unfactored code.

// public class Vowels {

//   public static int getCount(String str) {
//     int count = 0;
//     for (int i = 0; i < str.length(); i++) {
//       char ch = str.charAt(i); // we know what character we are at
//       switch(ch) {
//         case 'a':
//         case 'e':
//         case 'i':
//         case 'o':
//         case 'u':
//           count++;
//           break;
          
//       }
//     }
    
//     return count;
//   }

// }