package bpmn.sample;

import org.drools.core.io.impl.ClassPathResource;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.manager.RuntimeEnvironment;
import org.kie.api.runtime.manager.RuntimeEnvironmentBuilder;

public class JbpmConfig {

	public RuntimeEnvironment runtimeEnvironment() {
		System.out.println("In produce Environment");
		
		RuntimeEnvironment environment = null;
		try {
		environment = RuntimeEnvironmentBuilder.Factory.get().newDefaultBuilder().addAsset(new ClassPathResource("Hello-world.bpmn2"), ResourceType.BPMN2).get();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return environment;
	}
	
	
}
