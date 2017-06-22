/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
	int start = 1;
	int end = n;
	while(start + 1 < end) {
	    int mid = (start + end) >>> 1;
	    if (!isBadVersion(mid)) {
		start = mid;
	    }else {
		end = mid;
	    }
	}

	if ((start == 1 && isBadVersion(start) ) || (start !=1 && isBadVersion(start) && !isBadVersion(start - 1))) {
	    return start;
	}else {
	    return end;
	}
    }
}
