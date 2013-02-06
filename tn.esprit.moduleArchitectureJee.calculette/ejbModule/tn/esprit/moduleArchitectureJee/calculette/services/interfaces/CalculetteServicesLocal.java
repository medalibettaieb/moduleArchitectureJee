package tn.esprit.moduleArchitectureJee.calculette.services.interfaces;

import javax.ejb.Local;

@Local
public interface CalculetteServicesLocal {

	public int add(int a, int b);

}
