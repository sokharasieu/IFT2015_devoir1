public class App {
    public static void main(String[] args) throws Exception {
        // 2.1 checker
        if (Palindrome.checker("radar") != true){
            System.out.println("2.1 'checker' function wrong output with input 'radar'");
            return;
        }
        if (Palindrome.checker("rede") != false){
            System.out.println("2.1 'checker' function wrong output with input 'rede'");
            return;
        }

        // 2.2 checker_recursive
        if (Palindrome.checker_recursive("radar") != true){
            System.out.println("2.2 'checker_recursive' function wrong output with input 'radar'");
            return;
        }
        if (Palindrome.checker_recursive("rede") != false){
            System.out.println("2.2 'checker_recursive' function wrong output with input 'rede'");
            return;
        }

        // 2.3 reverse
        if (!Palindrome.reverse("qwer").equals("rewq")){
            System.out.println("2.3 'reverse' function wrong output with input 'qwer'");
            return;
        }

        // 2.4 transforme_palindrome
        if (!Palindrome.transforme_palindrome("qwere").equals("qwereerewq")){
            System.out.println("2.4 'transforme_palindrome' function wrong output with input 'qwere'");
            return;
        }

        // 2.5 transforme_palindrome_compacte
        if (!Palindrome.transforme_palindrome_compacte("qwere").equals("qwerewq")){
            System.out.println("2.5 'transforme_palindrome_compacte' function wrong output with input 'qwere'");
            return;
        }

        System.out.println("All tests successfully passed!");
    }
}
