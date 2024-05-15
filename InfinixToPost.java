public class InfinixToPost {

    int precendence(char ch){
        if (ch=='^'){
            return 3;
        }
        if(ch=='*' || ch=='/'){
            return 2;
        }
        if(ch=='+'|| ch=='-'){
            return 1;
        }
        return -1;
    }

    String convertPostfix(String exp){
        DSA stk= new DSA(exp.length());
        String postfix="";
        for(int i=0; i<exp.length();i++){
            char ch= exp.charAt(i);
            if(precendence(ch)>0){
                //operator
                while (!stk.isEmpty() && precendence(ch)<=precendence(stk.peek())){
                    postfix+=stk.pop();
                }
                stk.push(ch);
            }
            else if(ch=='('){
                stk.push(ch);
            }
            else if(ch==')'){
                char x=stk.pop();
                while (x!='(') {
                    postfix+=x;
                    x=stk.pop();
                }
            }
            else{
                postfix+=ch;
            }
        }
        while (stk.isEmpty()){
            postfix+=stk.pop();
        }
        System.out.println(postfix);
        

        return postfix;
    }
}
