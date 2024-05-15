public class check_parenthesis {
        
        boolean isBalanced(String exp){
            DSA stk= new DSA(exp.length());
            String openingbarces="[{(";
            String closingbraces="]})";

            for(int i=0; i<exp.length(); i++){
                char bracket=exp.charAt(i);
                if(bracket=='[' || bracket=='{' || bracket=='('){
                    //confirmed opening bracket
                    stk.push(bracket);
                }
                else{
                    //confirmed closing bracket
                    int indx= closingbraces.indexOf(bracket);
                    char crossOpeningbracket=openingbarces.charAt(indx);
                    if(stk.isEmpty()){
                        return false;
                    }
                    else{
                        char stkchar=stk.pop();
                        if(stkchar!=crossOpeningbracket){
                            return false;
                        }
                    }
                }

            }
            if(!stk.isEmpty()){
                return false;
            }
            return true;

    }
    public static void main(String[] args) {
        check_parenthesis chk= new check_parenthesis();
        System.out.println(chk.isBalanced("{)}"));
    }
}
