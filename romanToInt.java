public class romanToInt {
        public int solution(String s) {
        //breakup string into values and then loop through values
        char[] characters = s.toCharArray();
        int result = 0;
        char prev = ' ';
        // My initial approach was:
        // if V(5), L(50), D(500) or M(1000) just add represantative value to total
        // if I(1), X(10) or C(100) check following number then apply rules
        // I if followed by V = 4, if followed by X = 9, if neither = 1
        // X if followed by L = 40, if followed  by C = 90, if neither = 10
        // C if followed by D = 400, if followed  by M = 900, if neither = 100
        // I later reversed that logic to come up with following solution,
        // However this is definitly not optimal at all
        for (char c : characters) {
            switch(c) {
                case 'V':
                    if(prev == 'I') {
                        result += 3;
                        break;
                    }
                    result += 5;
                    break;
                case 'L':
                    if(prev == 'X') {
                        result += 30;
                        break;
                    }
                    result += 50;
                    break;
                case 'D':
                    if(prev == 'C') {
                        result += 300;
                        break;
                    }                
                    result += 500;
                    break;
                case 'M':
                    if(prev == 'C') {
                        result += 800;
                        break;
                    }                
                    result += 1000;
                    break;
                case 'I':
                    prev = 'I';
                    result += 1;
                    break;
                case 'X':
                    if(prev == 'I') {
                        result += 8;
                        break;
                    }
                    prev = 'X';
                    result+=10;
                    break;
                case 'C':
                    if(prev == 'X') {
                        result += 80;
                        break;
                    }
                    prev = 'C';
                    result+=100;
                    break;                          
                default:
                    result += 0;     
            }          
        }
        return result;
    }
}