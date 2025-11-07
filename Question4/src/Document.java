
// Demonstrates the Prototype Pattern by implementing deep cloning.

public class Document implements Cloneable {

    private String title;
    private String content;

    // Constructor to create a new document
    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getter methods  to view data (optional, for displaying data)
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    // Setter methods (for modifying the clone in the demo)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Overriding clone() to create a deep copy
    @Override
    public Document clone() {
        try {
            // super.clone() returns a copy of the current object
            // Since we only have Strings (immutable), this acts like a deep copy
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }
}

