package ArraysAndStrings.Greedy;

public class IntervalGreedy {
/*

Sort intervals, then make the locally optimal decision using interval boundaries (usually the end point).
When you see:
✅ Intervals [start, end]
✅ Overlap
✅ Merge
✅ Meetings
✅ Scheduling
✅ Balloons
✅ Remove intervals
✅ Cover intervals
✅ Minimum arrows
✅ Maximum non-overlapping intervals

Universal Framework
1. Sort intervals
2. Initialize answer/state
3. Traverse intervals
4. Check overlap
5. Greedily update answer/state



| Problem                   | Sort           |
| ------------------------- | -------------- |
| Merge Intervals           | Start ↑        |
| Insert Interval           | Start ↑        |
| Non-overlapping Intervals | End ↑          |
| Minimum Arrows            | End ↑          |
| Activity Selection        | End ↑          |
| Meeting Rooms             | End ↑          |
| Remove Covered Intervals  | Start ↑, End ↓ |



Comparator Template Sheet

// Start Increasing
Arrays.sort(intervals,
    (a,b)->Integer.compare(a[0],b[0]));

// End Increasing
Arrays.sort(intervals,
    (a,b)->Integer.compare(a[1],b[1]));

// Start ↑ End ↑
Arrays.sort(intervals,(a,b)->{
    if(a[0]!=b[0])
        return Integer.compare(a[0],b[0]);
    return Integer.compare(a[1],b[1]);
});

// Start ↑ End ↓
Arrays.sort(intervals,(a,b)->{
    if(a[0]!=b[0])
        return Integer.compare(a[0],b[0]);
    return Integer.compare(b[1],a[1]);
});































*/    
    
}
