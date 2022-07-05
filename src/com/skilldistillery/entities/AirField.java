package com.skilldistillery.entities;

import java.util.List;

public class AirField {
	
	List<Jet> jets;


	public AirField(List<Jet> jet) {
		// TODO Auto-generated constructor stub
		jets = jet;
	}

	public List<Jet> getJets() {
		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}

	public void listFleet() {
		// TODO Auto-generated method stub
		for(Jet i: jets) {
			System.out.println(i);
		}
	}

	public void fly() {
		// TODO Auto-generated method stub
		for(Jet i : jets){
			//System.out.print(i + " ");
			i.fly();
		}
	}

	public void fastestJet() {
		Jet fastestJet = null;
		
		for(Jet i : jets) {
			if(fastestJet == null) {
				fastestJet = i;
			}
			
			else if(i.getSpeed() > fastestJet.getSpeed()) {
				fastestJet = i;
			}
		}
		System.out.println(fastestJet + " is the fastest airplane");
		
	}

	public void longestRange() {
		// TODO Auto-generated method stub
		Jet longestRange = null;
		
		for(Jet i : jets) {
			if(longestRange == null) {
				longestRange = i;
			}
			
			else if(i.getRange() > i.getRange()) {
				longestRange = i;
			}
		}
		System.out.println(longestRange + " is longest range");
	}

	public void cargo() {
		// TODO Auto-generated method stub
		for(Jet i : getJets()) {
			if(i instanceof CargoPlane) {
				((CargoPlane) i).loadCargo();
			}
		}
	}

	public void dogfight() {
		// TODO Auto-generated method stub
		for (Jet i : jets) {
			if(i instanceof FighterJet) {
				((FighterJet)i).fight();
			}
		}
	}

	public Jet removeJet(int n) {
		// TODO Auto-generated method stub
		System.out.println("Choose which line of jet would you like to remove");
		listFleet();
		Jet jetRemoved;
		jetRemoved = jets.remove(n);
		return jetRemoved;
	}


	public void PakingLot(Jet jet) {
		// TODO Auto-generated method stub
		jets.add(jet);
	}
	
}
