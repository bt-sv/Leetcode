public int nthUglyNumber(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        //List<Integer> list = new ArrayList<Integer>();
        int[] list = new int[n];
        list[0] = 1;
        int t2 = 0;
        int t3 = 0;
        int t5 = 0;
        for(int i=1; i<n; i++) {
            list[i] = min(list[t2]*2, list[t3]*3, list[t5]*5);
            if(list[i] == list[t2]*2) {
                t2++;
            }
            if(list[i] == list[t3]*3) {
                t3++;
            }
            if(list[i] == list[t5]*5) {
                t5++;
            }
        }
        return list[n-1];
    }
    
    private int min(int i, int j, int k) {
		// TODO Auto-generated method stub
		int min = 0;
		if(i<j) {
			if(i>k) {
				min = k;
			}
			else {
				min = i;
			}
		}
		else {
			if(j>k) {
				min = k;
			}
			else {
				min = j;
			}
		}
		return min;
	}
