package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();

                Dog[] pups = Dog.createPuppies(3);
                System.out.println(Arrays.toString(pups));

                Husky husky = new Husky();
                husky.pullSled();
                husky.bark();


                //This breaks my code for the later exercises, so it's commented out.
                //                ArrayList<Huggable> hugList = new ArrayList<Huggable>(); //a list of huggable things
               // hugList.add(new Husky()); //a Husky is Huggable
                // hugList.add(new TeddyBear()); //so are Teddybears!

                //enhanced for loop ("foreach" loop)
                //read: "for each Huggable in the hugList"
                // for(Huggabble thing : hugList) {
                   // thing.hug();
                // }
            
                // This line makes the build fail
                // Animal an = new Animal();
                //

                GiftBox<Husky> gb = new GiftBox<Husky>(husky);
	}
}
