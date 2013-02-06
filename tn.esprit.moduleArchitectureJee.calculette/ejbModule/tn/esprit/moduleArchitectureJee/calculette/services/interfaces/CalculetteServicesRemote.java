package tn.esprit.moduleArchitectureJee.calculette.services.interfaces;

import javax.ejb.Remote;

@Remote
public interface CalculetteServicesRemote {
	public int add(int a, int b);
}
