/*
* generated by Xtext
*/
package org.example.domainmodel;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class DomainmodelUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.example.domainmodel.ui.internal.DomainmodelActivator.getInstance().getInjector("org.example.domainmodel.Domainmodel");
	}
	
}
