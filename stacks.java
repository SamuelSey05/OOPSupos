class Stack {
    private int val; 
    private Stack beneath;

    public Stack getBeneath () {
        return beneath;
    }
    public Stack (int x) {
        val = x;
        beneath = null;
    }

    public void push (int x) {
        Stack temp = this;
        val = x;
        beneath = temp;
    }

    public int peek () {
        return val;
    }

    public int pop () {
        int temp = val;
        val = beneath.peek;
        beneath = beneath.getBeneath();
        return temp;
    }

    public int len () {
        if (beneath = null) {
            return 1;
        } else {
            return 1 + beneath.len;
        }
    }
}