class linkedListItem {
    private int data; 
    private linkedListItem next;

    public linkedListItem (int i) {
        data = i;
        next = null;
    }

    public int getData () {
        return data;
    }

    public linkedListItem getNext () {
        return next;
    }

    public void addToTail (linkedListItem n) {
        if (next = null) {
            next = n;
        } else {
            next.addToTail(n);
        }
    }
    public int remove () {
        int temp = data;
        data = next.getData;
        next = next.getNext;
        return temp;
    }

    public int getN (int n) {
        if (n = 1) {
            return data;
        } else {
            return next.getN(n-1);
        }
    }

    public int getLen () {
        if (next = null) {
            return 1;
        } else {
            return 1 + next.getLen;
        }
    }
}

class main {
    public static boolean detectCycle(linkedListItem x) {
        fast = x.getNext.getNext;
        slow = x;
        while (fast != null) {
            if (fast == slow) {
                return true;
            } else {
                if (fast.next = null) {
                    return false;
                } else {
                    slow = slow.getNext;
                    fast = fast.getNext.getNext;
                }
            }
        }
        return false;
    }
}