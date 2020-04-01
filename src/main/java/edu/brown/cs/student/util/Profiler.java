package edu.brown.cs.student.util;

public final class Profiler {

    // Represents the singleton instance of this class. Set after the first 
    // call to getInstance.    
    private static Profiler _instance;
    private long _start;
    private long _stop;

    private Profiler() {
        _start = Long.MIN_VALUE;
        _stop = Long.MIN_VALUE;
    }

    public static Profiler getInstance() {
        if (_instance == null) {
            _instance = new Profiler();
        }

        return _instance;
    }

    public void startProfiling() {
        _stop = Long.MIN_VALUE;
        _start = System.currentTimeMillis();
    }

    public void stopProfiling() {
        if (_start == Long.MIN_VALUE) {
            System.err.println("ERROR: You've stopped profiling before you've started. Did you mean to do this?");
        }
        _stop = System.currentTimeMillis();
    }

    public long getProfiledTime() {
        if (_start == Long.MIN_VALUE || _stop == Long.MIN_VALUE) {
            System.err.println("ERROR: You either didn't start, or didn't stop, profiling.");
        }
        long diff = _stop - _start;
        _start = Long.MIN_VALUE;
        _stop = Long.MIN_VALUE;
        return diff;
    }
}