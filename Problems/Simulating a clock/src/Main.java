class Clock {

    public int hours = 12;
    public int minutes = 0;

    public void next() {
        // implement me
        minutes += 1;

        if(minutes >= 60) {
            minutes = 0;
            hours++;
            if(hours > 12) hours = 1;
        }
    }
}