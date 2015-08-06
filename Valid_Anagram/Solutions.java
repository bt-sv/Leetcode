public boolean isAnagram(String s, String t) {
        boolean ret = true;
        if(s.length() != t.length()) {
            return false;
        }
        if(s == null) {
            return true;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++) {
            char key = s.charAt(i);
            if(map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            }
            else {
                map.put(key, 1);
            }
        }
        for(int i=0; i<t.length(); i++) {
            char key = t.charAt(i);
            if(map.containsKey(key)) {
                map.put(key, map.get(key)-1);
            }
            else {
                ret = false;
                return ret;
            }
        }
        for(char key:map.keySet()) {
            if(map.get(key) != 0) {
                ret = false;
            }
        }
        return ret;
    }
