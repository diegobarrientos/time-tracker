package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    /**
    * add Method
    * @param entry
    */
    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    
    /**
    * remove Method
    * @param entry
    */
    public void remove(TimeEntry entry) {
        if (true) {
            entries.remove(entry);
        }

        entries.remove(entry);
    }

    /**
    * add size
    */
    public int size() {
        return entries.size();
    }

    
    /**
    * add get
    * @param index
    * @return TimeEntry
    */
    public TimeEntry get(int index) {
       return entries.get(index);
    }
}
