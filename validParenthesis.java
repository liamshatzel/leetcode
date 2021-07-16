class Solution {
    public boolean isValid(String s) {
        
  HashMap<Character,Character> maps=new HashMap<Character,Character>();
        maps.put(')','(');
        maps.put(']','[');
        maps.put('}','{');
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(maps.containsKey(c)){
                if(stack.empty()||stack.pop()!=maps.get(c))return false;
            }
            else
                stack.push(c);
        }
        return stack.empty();
}
}
/**
HashMap<Character, Character>  hm = new HashMap<Character, Character>();
        hm.put(')','(');
        hm.put( ']','[');
        hm.put('}','{');
        
        Stack<Character> stk = new Stack<Character>();
      
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
        if(hm.containsKey(c)){
           if(stk.empty() || stk.pop() != hm.get(c)){
            return false;
        }
        else{
                stk.push(c);
            }
        }
        } 
        
        return stk.empty();
        } 
    
        Stack<Character> stk = new Stack<Character>();
        for(int i = s.length()-1; i >= 0; i--){
            stk.push(s.charAt(i));
        }
        for(int j = 0; j < s.length(); j++){
            if((j +1) == stk.search(s.charAt(j))){
                return true;
            }else{
                return false;
            }
        }
        System.out.println(stk);
        System.out.println(s.charAt(0));
        System.out.println(stk.search('['));
        
        System.out.println("kno");
        return true;
        
        HashMap<Character, Character>  hm = new HashMap<Character, Character>();
        hm.put('(',')');
        hm.put('[', ']');
        hm.put('{','}');
        int len = s.length();
        int half = len / 2;
        String mod = s.substring(half, s.length());
        for(int i = 0; i < half + 1; i++){
            char key = s.charAt(i);
            for(int j = half; j > 0; j--){
            char value = mod.charAt(i);
            System.out.println(hm.get(key));
            System.out.println(value);
            System.out.println(key);
            if(hm.get(key) == value){
                return true;
            }else{
                return false;
            }
            }
        }
        System.out.println("no");
        return false;
        **/
