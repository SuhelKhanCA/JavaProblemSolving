// https://leetcode.com/problems/goal-parser-interpretation/

class GoalParser{
        public static String interpret(String command) {
        String str = "";
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i) != '(' && command.charAt(i) != ')'){
                str = str + String.valueOf(command.charAt(i));
            }
            if(i != command.length() && (command.charAt(i) == '(' && command.charAt(i+1) == ')')){
                str = str + "o";
            }
        }
        return str;
    }

    public static void main(String[] args){
        String command = "G()()()()(al)";
        System.out.println("Parsed command: "+ interpret(command));
    }
    
}