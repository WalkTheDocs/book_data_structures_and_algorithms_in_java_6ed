package book_data_structures_and_algorithms_in_java_6ed.ch2_object_oriented_design.Reinforcement;

/**
 * Describe a component from a text-editor GUI and the methods that it
 * encapsulates.
 * 
 * ... something like this interface.
 */
public interface R3 {
    // Deletion
    public void clear();
    public void delete();

    // Save and save-state.
    public void save();
    public boolean getIsSaved();

    // open and close files.
    public void open();
    public void close();
    
    // Exit the gui.
    public void quit();
}
