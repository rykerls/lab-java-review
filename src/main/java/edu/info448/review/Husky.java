package edu.info448.review; //package declaration (needed)

public class Husky extends Dog implements Huggable {
    
    public void pullSled() {
        System.out.println("Pulling the sled.... bark!");
    }

    public void bark() {
        System.out.println("barks like a husky");
    }

    public void hug() {
        System.out.println("hug!");
    }
}
