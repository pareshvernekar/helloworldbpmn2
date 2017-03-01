package bpmn.sample.service;


import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.manager.RuntimeEngine;
import org.kie.api.runtime.manager.RuntimeManager;
import org.kie.internal.runtime.manager.context.EmptyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HelloWorldService {
	
	
	private RuntimeManager ppiManager;
	
	public RuntimeManager getPpiManager() {
		return ppiManager;
	}

	public void setPpiManager(RuntimeManager ppiManager) {
		this.ppiManager = ppiManager;
	}

	public void process() {
		RuntimeEngine engine = ppiManager.getRuntimeEngine(EmptyContext.get());
		KieSession session = engine.getKieSession();
				session.startProcess("bpmn2.sample.hello-world");
		//runtimeEnvironment.
		System.out.println("After START PPROCESS");
	}

	
	
}
