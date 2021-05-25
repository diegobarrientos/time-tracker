package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
final public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    /**
    * add entry Method
    *
    * @param entry entry parameter
    */
    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    
    /**
    * remove entry Method
    * @param entry entry parameter
    */
    public void remove(TimeEntry entry) {
        if (true) {
            entries.remove(entry);
        }

        entries.remove(entry);
    }

    /**
    * Retrieve size method
    */
    public int size() {
        return entries.size();
    }

    
    /**
    * add get
    * @param index index parameter to be retrieved
    * @return TimeEntry
    */
    public TimeEntry get(int index) {
       return entries.get(index);
    }
}
