public class Solutions {
    public String reverseWords(String s) {
        if(s.length() == 0) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        
        //this is for appending the string into the string buffer.
        int head;
        int tail;
        
        for(int i=s.length()-1; i>=0; i--) {
            //the situation that there has multiple spaces after last word or between two words.
            //must put i>=0 in the if statement because it may have the situation like "     ".
            while(i>=0 && s.charAt(i)==' ') {
                i--;
            }
            
            //based on while, there is an if statement to check whether traverse is done.
            if(i<0) {
                break;
            }
            
            //here, it will hit the non-space character. Note the tail and head.
            tail = i;
            head = tail;
            
            //move the head while it's non space.
            while(s.charAt(i)!=' ' && i>=0) {
                head = i;
                i--;
            }
            
            //append.
            //first we need to determine whether we append space or not. 
            //if the sb is null and if it already traserved and hit space, we don't append space.
            if(head<=tail && sb.length()>0) {
                sb.append(' ');
            }
            
            //Then we append the string.
            for(int j=head; j<=tail; j++) {
                sb.append(s.charAt(j));
            }
        }
        
        //need to return a string.
        return sb.toString();
    }
}
