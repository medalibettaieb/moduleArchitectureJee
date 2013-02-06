package tn.esprit.moduleArchitectureJee.calculette.services.impl;

import javax.ejb.Stateless;

import tn.esprit.moduleArchitectureJee.calculette.services.interfaces.CalculetteServicesLocal;
import tn.esprit.moduleArchitectureJee.calculette.services.interfaces.CalculetteServicesRemote;

/**
 * Session Bean implementation class CalculetteServices
 */
@Stateless
public class CalculetteServices implements CalculetteServicesRemote,
		CalculetteServicesLocal {

	/**
	 * Default constructor.
	 */
	public CalculetteServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(int a, int b) {

		return a + b;

	}

}
