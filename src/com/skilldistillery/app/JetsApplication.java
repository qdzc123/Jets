package com.skilldistillery.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.skilldistillery.entities.AirField;
import com.skilldistillery.entities.CargoPlane;
import com.skilldistillery.entities.FighterJet;
import com.skilldistillery.entities.Jet;

public class JetsApplication {
	
	private AirField airfield;
	private Scanner sc;
	
	public static void main(String[] args) {
		
		JetsApplication j = new JetsApplication();
		j.sc = new Scanner(System.in);
		j.run();
		
	}

	
	public JetsApplication() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void run() {
		List<Jet> jet = readFile();
		airfield = new AirField(jet);
				
		while(true) {
			menu();
			chooseOption();
		}
	}

	
	public void menu() {
		System.out.println("1. List Fleet ");
		System.out.println("2. Fly all jets ");
		System.out.println("3. View fastest jet ");
		System.out.println("4. View jet with longest range ");
		System.out.println("5. Load all cargo jets ");
		System.out.println("6. Dogfight");
		System.out.println("7. Add a jet to Fleet ");
		System.out.println("8. Remove a jet from Fleet ");
		System.out.println("9. Quit ");
		System.out.println("Choice: ");
	}
	
	public void chooseOption() {
		int selection = sc.nextInt();
		
		switch(selection) {
			case 1:
				airfield.listFleet();
				break;
			case 2:
				airfield.fly();
				break;
			case 3:
				airfield.fastestJet();
				break;
			case 4:
				airfield.longestRange();
				break;
			case 5:
				System.out.println("Below are cargo");
				airfield.cargo();
				break;
			case 6:
				System.out.println("Below Jets go to dogfight");
				airfield.dogfight();
				
				break;
			case 7:
				addJet();
				
				break;
			case 8:
				System.out.println("Choose which line of jet would you like to remove");
				airfield.listFleet();
				int n = sc.nextInt() - 1;
				airfield.removeJet(n);
				break;
			case 9:
				System.out.println("End of Program");
				System.exit(0);
				break;
		}
	}
	

	private void addJet() {
		
		String type = "";
		
		// TODO Auto-generated method stub
			System.out.println("Choose between 1 and 2 for type. 1 is for Fighter and 2 is for Carrier");
			int selection = sc.nextInt();
			
			if(selection == 1) {
				type = "Fighter";
				//firecreate(type);;
			}
			
			else if(selection == 2) {
				type = "Carrier";
				//cargocreate(type);
			}
		
			System.out.println("Enter the model: ");
			String model = sc.next();
			System.out.print("Enter the speed: ");
			double speed = sc.nextDouble();
			System.out.print("Enter the range: ");
			int range = sc.nextInt();
			System.out.print("Enter the price: ");
			long price = sc.nextLong();
			
			if(type.equals("Carrier")){
				CargoPlane parkingJet = new CargoPlane (type, model, speed, range, price);
				airfield.PakingLot(parkingJet);
			}
			
			if(type.equals("Fighter")){
				FighterJet parkingJet = new FighterJet (type, model, speed, range, price);
				airfield.PakingLot(parkingJet);
			}
			
		
	}

	




	public List<Jet> readFile() {
		
			List<Jet> listOfJet = new ArrayList<>();
			
			
			try(BufferedReader br = new BufferedReader(new FileReader("jets.txt"))){
				
				String line;

				while((line = br.readLine()) != null) {
				
					String[] part = line.split(", ");
					
					String type = part[0];
					String model = part[1];
					int speedMPH = Integer.parseInt(part[2]);
					int range = Integer.parseInt(part[3]);
					long price = Long.parseLong(part[4]);
					
					if(type.equals("Fighter")){
						FighterJet fighter = new FighterJet (type, model, speedMPH, range, price);
						listOfJet.add(fighter);
					}
					
					if(type.equals("Carrier")){
						CargoPlane carrier = new CargoPlane (type, model, speedMPH, range, price);
						listOfJet.add(carrier);
					}
					
				}

			} catch (IOException e) {
				System.err.println("Could not find file");
			}
		

			return listOfJet;
	}
	
	
}