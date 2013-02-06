package tn.esprit.moduleArchitectureJee.calculetteClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.moduleArchitectureJee.calculette.services.interfaces.CalculetteServicesRemote;

public class TestAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context;
		try {
			context = new InitialContext();
			CalculetteServicesRemote calculetteServicesRemote = (CalculetteServicesRemote) context
					.lookup("tn.esprit.moduleArchitectureJee.calculette/CalculetteServices!tn.esprit.moduleArchitectureJee.calculette.services.interfaces.CalculetteServicesRemote");

			int a = 1;
			int b = 0;
			calculetteServicesRemote.add(a, b);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
