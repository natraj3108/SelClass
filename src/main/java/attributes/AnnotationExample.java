package attributes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationExample implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		if(testMethod.getName().equalsIgnoreCase("createLead")){
			annotation.setInvocationCount(2);
		}else if(testMethod.getName().equalsIgnoreCase("editLead")){
			annotation.setEnabled(false);
		} 
		
		
		
		
		
		
		
		
	}

}
