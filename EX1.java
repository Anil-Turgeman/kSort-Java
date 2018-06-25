public static void kSort(int[] a, int k){
		int[] minarr = new int[a.length];
		int min, max;
		int l = a.length-1;
		for (int i = 0; i < k; i++) {
			min = a[0];
			max = a[0];
			for (int j = 1; j < a.length; j++) {
				if (min > a[j]) {
					min = a[j];
				}
				if (max < a[j])
					max = a[j];
			}
			for (int j = 0 ; j<a.length; j++) {
				if (a[j] == max) {
					minarr[l] = a[j];
					l--;
					a[j] = min-1;
				}
			}
		}
    
		for(int t = 0; t < a.length; t++){//Printing loop
			a[t] = minarr[t];
			System.out.print(a[t]+", ");
		}
		System.out.println();
	}
