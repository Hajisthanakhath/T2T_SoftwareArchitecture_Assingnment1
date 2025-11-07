
// This class shows how to clone a Document and proves that modifying the clone

public class PrototypeDemo {

    public static void main(String[] args) {

        // Create the original document
        Document originalDoc = new Document(
                "Report",
                "This is the original document content."
        );

        // Clone the document
        Document clonedDoc = originalDoc.clone();

        // Modify the cloned document
        clonedDoc.setTitle("Cloned Report");
        clonedDoc.setContent("This content belongs to the cloned document.");

        // Print original document details
        System.out.println("Original Document:");
        System.out.println("Title: " + originalDoc.getTitle());
        System.out.println("Content: " + originalDoc.getContent());
        System.out.println();


        // Print cloned document details
        System.out.println("Cloned Document:");
        System.out.println("Title: " + clonedDoc.getTitle());
        System.out.println("Content: " + clonedDoc.getContent());
    }
}

