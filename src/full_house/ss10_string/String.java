package full_house.ss10_string;

public class String {
    public static void main(java.lang.String[] args) {
        // Có 3 cách khởi tạo String :
        java.lang.String str1 = "Hello!";
        java.lang.String str2 = new java.lang.String("Hello!");
        java.lang.String str3 = new java.lang.String(new char[] {'H','e','l','l','o','!'});
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // 1. Các phương thức để xử lý String :
        /*
        +String.charAt(int index) :char -> ký tự tại vị trí thứ index của String
        Ex: "Hello".charAt(2) -> return 'l'

        +String.length() : int -> Độ dài của String
        Ex: "Hello".length() -> return 5

        +String.substring(int beginIndex) :String -> chuỗi con được cắt ra, chuỗi này bắt đầu tại vị trí beginIndex và kết thúc tại endIndex-1 (bé hơn endIndex)
        Ex: "Hello".substring(2,3) -> return "l"
            "01234".substring(1,4) -> return "123"

        +String.contains(CharSequence s ) : boolean ->True nếu String có chứa chuỗi được truyền vào
        Ex: "Hello".contains("el") -> True
            "Hello".contains("elo") -> False

        +String.split(String regex) : String[] -> 1 mảng các chuỗi được tách ra bởi các regex ở giữa
        Ex : "I am iron Man".split(" ") -> return String[] {"I","am","Iron","Man"}

        +String.equals(Object another) : boolean -> True nếu String hiện tại bằng chính xác với String được đưa vào (Object ở đây nghĩa là có thể đưa vào bất kì giá trị gì,nhưng nếu không phải String thì sẽ là false)
        Ex:String str1 = "Hello";
        str1.equals("Hello") -> TRUE
        str1.equals("Helo") -> FALSE
        str1.equals(123) -> FALSE

        +String.equalsIgnoreCase(String another) :Boolean -> TRUE nếu String hiện tại bằng chính xác với String được đưa vào (phương thức sẽ bỏ qua các ký tự in hoa)
        Ex:  String str1 = "HeLlo";
        str1.equalsIgnoreCase("hello") -> TRUE

        +String.indexOf(int ch) : int -> Vị trí đầu tiên của int(hoặc char) truyền vào trong String
        Ex:"Hello".indexOf('l') -> return 2
        "Hello".indexOf(108) -> return 2

        +String toLowerCase()
        +String toUpperCase()
        -> String trả về string khi đã viết thường / viết hoa tất cả chữ cái (phương thức này không thay đổi String ban đầu)
        Ex: "HeLlo".toLowerCase() -> "hello"
            "HeLlo".toUpperCase() -> "HELLO"

        +String.trim() : Xóa khoảng trắng đầu và cuối trong String

        // 2.Các phương thức xử lý char:
        +Character.isDigit(char ch)
        +Character.isLetter(char ch)
        +Character.isUpperCase(char ch)
        +Character.isLowerCase(char ch)
         : boolean -> True nếu ký tự ch được đưa vào tương ứng với số (digit),là chữ cái (letter),là chữ cái in hoa(upper),là chữ cái in thường(lower) hoặc những phương thức khác
        Ex:Character.isDigit('1') -> TRUE
           Character.isDigit('a') -> FALSE
           Character.isLetter('a') -> TRUE
           Character.isLetter(':') -> FALSE
           Character.isLowerCase('a') -> TRUE

         +Character.toUpperCase(char ch)
         +Character.toLowerCase(char ch)
         :char -> trả về ký tự ch khi viết hoa hoặc viết thường .Nếu ch không phải chữ cái ,trả về chính nó
         Ex: Character.toUpperCase('a') -> 'A'
             Character.toLowerCase('A') -> 'a'
             Character.toLowerCase(':') -> ':'
             Character.toLowerCase('a') -> 'a'


        * */

    }
}
