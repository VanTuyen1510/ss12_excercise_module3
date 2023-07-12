package test_week5_full_house;

public class BracketPair {
    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b * (s – c)";
        System.out.println(bracketPair(str));

    }

    public static boolean bracketPair(String str) {
        // Stack -> First In Last Out
        // list = {5, 4, 10, 2, 1} -> số 5 lấy ra cuối cùng

        // str = " (hello [my name] is {thanh}) "
        // 1.stack = { '(' , '[' } => Stack 1 khi lấy ra không thể bỏ vô lại nữa
        // 2.stack = { '(' , '{' }
        // 3.stack = {} => str rỗng thì đúng ,return true

        char[] brackets = new char[100];
        int bracketsIndex = -1;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if(a == '(' || a == '[' || a == '{'){
                brackets[++bracketsIndex] = a;
            }else if(a == ')'){
                if(brackets[bracketsIndex] == '(') //Kiểm tra vị trí cuối cùng của brackets
                {
                    bracketsIndex--;
                }else {
                    return false;
                }
            }else if(a == ']'){
                if(brackets[bracketsIndex] == '['){
                    bracketsIndex-- ;
                }else {
                    return false;
                }
            }else if(a == '}'){
                if(brackets[bracketsIndex] == '{'){
                    bracketsIndex--;
                }else {
                    return false;
                }
            }
        }
        if(bracketsIndex >= 0){
            return false;
        }
        return true;

//
//        char[] brackets = new char[100];
//        int bracketsIndex = -1;
//        for (int i = 0; i < str.length(); i++) {
//            char a = str.charAt(i);
//            if (a == '(' || a == '[' || a == '{') {
//                brackets[++bracketsIndex] = a;
//            } else if (a == ')' || a == ']' || a == '}') {
//                if (checkPair(brackets[bracketsIndex], a)) {
//                    bracketsIndex--;
//                } else {
//                    return false;
//                }
//
//            }
//        }
//            if (bracketsIndex >= 0)
//                return false;
//
//            return true;
//        }
//
//
//
//
//    static boolean checkPair(char start, char end) {
//        if (start == '(' && end == ')') return true;
//        if (start == '[' && end == ']') return true;
//        if (start == '{' && end == '}') return true;
//        return false;
    }
}

