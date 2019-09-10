package service;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServeurRMI {

	public static void main(String[] args) {
		
		
		try {
			
			LocateRegistry.createRegistry(1099); //demmarer l'annuaire
			BanqueServiceImpl od = new BanqueServiceImpl();
			System.out.println(od.toString());
			Naming.rebind("BK", od); //publication de l'annuaire en creant dans l'annuaire une refference a la method
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
