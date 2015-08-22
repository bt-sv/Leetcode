public boolean isUgly(int num) {
        if(num == 1) {
            return true;
        }
        if(num <= 0) {
            return false;
        }
        int temp = num;
        while(temp>0) {
            if(temp%2 == 0) {
                temp = temp/2;
            }
            else if(temp%3 == 0) {
                temp = temp/3;
            }
            else if(temp%5 == 0) {
                temp = temp/5;
            }
            else {
                if(temp == 1) {
                    return true;
                }
                else {
                    break;
                }
            }
        }
        return false;
    }
