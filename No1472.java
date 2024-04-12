// design-browser-history

// Using two stacks

class BrowserHistory {

    Stack<String> back;
    Stack<String> front;

    public BrowserHistory(String homepage) {
        back = new Stack<>();
        front = new Stack<>();
        back.push(homepage);
    }
    
    public void visit(String url) {
        back.push(url);
        while(!front.isEmpty()) front.pop();
    }
    
    public String back(int steps) {
        int i = 0;
        while((back.size() > 1) && i < steps) {
            front.push(back.pop());
            i++;
        }
        return back.peek();
    }
    
    public String forward(int steps) {
        int i = 0;
        while((front.size() >= 1) && i < steps) {
            back.push(front.pop());
            i++;
        }
        return back.peek();
    }
}

// Using an ArrayList

class BrowserHistory {

    List<String> history;
    int curr;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        curr = 0;
    }
    
    public void visit(String url) {
        curr++;
        if(curr < history.size()) {
            history.set(curr, url);
            while(history.size() > curr + 1) history.remove(history.size() - 1);
        } else {
            history.add(url);
        }
    }
    
    public String back(int steps) {
        curr = Math.max(0, curr - steps);
        return history.get(curr);
    }
    
    public String forward(int steps) {
        curr = Math.min(history.size() - 1, curr + steps);
        return history.get(curr);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */