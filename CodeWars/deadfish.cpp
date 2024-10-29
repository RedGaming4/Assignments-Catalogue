
// Create a parser to interpret and execute the Deadfish language.

// Deadfish operates on a single value in memory, which is initially set to 0.

// It uses four single-character commands:

// i: Increment the value
// d: Decrement the value
// s: Square the value
// o: Output the value to a result array
// All other instructions are no-ops and have no effect.

// Examples
// Program "iiisdoso" should return numbers [8, 64].
// Program "iiisdosodddddiso" should return numbers [8, 64, 3600].


#include <vector>
#include <string_view>
#include <iostream>



std::vector<int> parse(std::string_view data) {
  std::vector<int> answer;
  int state = 0;
  int current;
  for (std::string_view::size_type i = 0; i < data.size(); i++) {
    current = data[i];
    switch(current) {
      case 'i':
        state++;
        break;
      case 'd':
        state--; 
        break;
      case 's':
        state *= state;
        break;
      case 'o':
        answer.push_back(state);
      default:
        break;
    }
   
  }
  
  return answer;
  
}