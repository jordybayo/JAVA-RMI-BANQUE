package client;

import java.rmi.Naming;

import client.IBanqueRemote;

public class ClientRMI {

	public static void main(String[] args) {
		try {
			IBanqueRemote stub =(IBanqueRemote)Naming.lookup("BK");
			
			System.out.println(stub.conversion(78));
			System.out.println(stub.getServerDate());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
