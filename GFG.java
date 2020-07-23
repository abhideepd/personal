// Java Program to find minimum K such that 
// every substring of length atleast K 
// contains some character c 

class GFG 
{ 
	
		
		// This function checks if there exists some 
		// character which appears in all K length 
		// substrings 
		static int check(String s, int K) 
		{ 
			// Iterate over all possible characters 
			for (int ch = 0; ch < 26; ch++) { 
				char c = (char)( 'a' + ch); 
		
				// stores the last occurrence 
				int last = -1; 
		
				// set answer as true; 
				boolean found = true; 
				for (int i = 0; i < K; i++) 
					if (s.charAt(i) == c) 
						last = i; 
		
				// No occurrence found of current 
				// character in first substring 
				// of length K 
				if (last == -1) 
					continue; 
		
				// Check for every last substring 
				// of length K where last occurr- 
				// ence exists in substring 
				for (int i = K; i < s.length(); i++) { 
					if (s.charAt(i) == c) 
						last = i; 
		
					// If last occ is not 
					// present in substring 
					if (last <= (i - K)) { 
						found = false; 
						break; 
					} 
				}
				// current character is K amazing 
				if (found) 
					return 1; 
			} 
			return 0; 
		} 
		
		// This function performs binary search over the 
		// answer to minimise it 
		static int binarySearch(String s) 
		{ 
			int low = 1, high = s.length(); 
			int ans=0; 
			while (low <= high) { 
				int mid = (high + low) >> 1; 
		
				// Check if answer is found try 
				// to minimise it 
				if (check(s, mid)==1) { 
					ans = mid; 
					high = mid - 1; 
				} 
				else
					low = mid + 1; 
			} 
			return ans; 
		} 
		
		// Driver Code to test above functions 
		public static void main(String args[]) 
		{ 
			String s = "abcde"; 
			System.out.println(binarySearch(s)); 
		
			s = "aaaa"; 
			System.out.println(binarySearch(s)); 
	
		} 

} 

// This article is contributed 
// by ihritik 
