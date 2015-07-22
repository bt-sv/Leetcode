public Class Solutions {
    //using 2 HashMaps
    public boolean isIsomorphic(String s, String t) {
        //Suppose s and t has same length.
        
        //Create 2 HashMaps
        HashMap<Character, Character> map1 = new HashMap<Character, Character>();
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();
        char c1;
        char c2;
        
        for(int i=0; i<s.length(); i++) {
            c1 = s.charAt(i);
            c2 = t.charAt(i);
            
            //If failed to find value based on the key, return false.
            if(map1.containsKey(c1)) {
                if(map1.get(c1) != c2) {
                    return false;
                }
            }
            if(map2.containsKey(c2)) {
                if(map1.get(c2) != c1) {
                    return false;
                }
            }
            
            //if there is no key saved in HashMap, put the key and value in.
            map1.put(c1, c2);
            map2.put(c2, c1);
    }
    return true;
}




