package fr.mycompany;

import org.springframework.core.KotlinDetector;

public class ThisClassMakesMojoCrash extends KotlinDetector
{
	public ThisClassMakesMojoCrash()
	{
		System.out.println("ThisClassMakesMojoCrash, kotlin present = " + KotlinDetector.isKotlinPresent());
	}
}
