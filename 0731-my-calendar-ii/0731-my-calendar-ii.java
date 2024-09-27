class MyCalendarTwo {
    List<Event> bookings;
    List<Event> overlap;

    static class Event{
        int start;
        int end;
        public Event (int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public MyCalendarTwo() {
        bookings = new ArrayList<>();
        overlap = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(Event e : overlap){
            if(isOverlap(e, start, end))
                return false;
        }

        for(Event e : bookings){
            if(isOverlap(e, start, end)){
                overlap.add(getOverlapEvent(e, start, end));
            }
        }

        bookings.add(new Event(start, end));
        return true;
    }

    public boolean isOverlap(Event e, int start, int end){
        return Math.max(e.start, start) < Math.min(e.end, end);
    }

    public Event getOverlapEvent(Event e, int start, int end){
        return new Event(Math.max(e.start, start), Math.min(e.end, end));
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */