package ss21_Bingel_Aufg1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashMap;

public class Daten {
	private HashSet<PartnerAngebot> alleTransportmittelangebote;
	private HashSet<PartnerSuche> alleSuchen;
	private HashMap<String, LinkedList<PartnerAngebot>> positionZuAngeboten;

	public Daten() {
		this.alleSuchen = new HashSet<>();
		this.alleTransportmittelangebote = new HashSet<>();
		this.positionZuAngeboten = new HashMap<>();
	}

	public void aufnehmenPartner(Partner aufzunehmenderPartner) {
		if (aufzunehmenderPartner instanceof PartnerAngebot) {
			// Typecast ist unproblematisch, da zuvor mit instanceof geprueft
			PartnerAngebot aufzunehmendesPartnerAngebot = (PartnerAngebot) aufzunehmenderPartner;
			this.alleTransportmittelangebote.add(aufzunehmendesPartnerAngebot);

			String standortdesAngebots = aufzunehmendesPartnerAngebot.getPosition();
			LinkedList<PartnerAngebot> angeboteZuStandort = this.positionZuAngeboten.get(standortdesAngebots);
			if (angeboteZuStandort == null) {
				angeboteZuStandort = new LinkedList<>();
			}
			angeboteZuStandort.add(aufzunehmendesPartnerAngebot);
			this.positionZuAngeboten.put(standortdesAngebots, angeboteZuStandort);
		} else {
			this.alleSuchen.add((PartnerSuche) aufzunehmenderPartner);
		}
	}

	public PartnerAngebot vermittlePartnerSuche(PartnerSuche suchenderPartner) {
		PartnerAngebot ermitteltesAngebot = null;
		this.alleSuchen.remove(suchenderPartner);

		String position = suchenderPartner.getPosition();
		LinkedList<PartnerAngebot> passendeAngebote = this.positionZuAngeboten.get(position);
		if (!(passendeAngebote == null)) {
			if (!passendeAngebote.isEmpty()) {
				ermitteltesAngebot = passendeAngebote.removeFirst();
				this.alleTransportmittelangebote.remove(ermitteltesAngebot);
			}
		}

		return ermitteltesAngebot;

	}

	private static String erstelleStringAusHashSet(HashSet<? extends Partner> partnerHashset, String bezeichnung) {
		String rueckgabeHashset = bezeichnung;
		if (!partnerHashset.isEmpty()) {
			boolean ersteIteration = true;
			for (Partner partner : partnerHashset) {
				if (ersteIteration) {
					rueckgabeHashset += partner.toString();
					ersteIteration = false;
				} else {
					rueckgabeHashset += ", " + partner.toString();
				}
			}
		} else {
			rueckgabeHashset += "leer";
		}
		return rueckgabeHashset;
	}

	private String transportmittelProPosition() {
		String rueckgabeZuordnung = "Anzahl Transportmittel an den Standorten: {";
		boolean ersteIteration = true;

		for (String position : this.positionZuAngeboten.keySet()) {
			if (!this.positionZuAngeboten.get(position).isEmpty()) {
				if (ersteIteration) {
					rueckgabeZuordnung += position + "=" + this.positionZuAngeboten.get(position).size();
					ersteIteration = false;
				} else {
					rueckgabeZuordnung += ", " + position + "=" + this.positionZuAngeboten.get(position).size();
				}
			}
		}
		rueckgabeZuordnung += "}";
		return rueckgabeZuordnung;

	}

	public HashSet<PartnerSuche> getAlleSuchen() {
		return alleSuchen;
	}

	public HashMap<String, LinkedList<PartnerAngebot>> getPositionZuAngeboten() {
		return positionZuAngeboten;
	}

	public String getalleAngeboteString() {
		return Daten.erstelleStringAusHashSet(alleTransportmittelangebote, "");
	}

	public String alleSuchenString() {
		return Daten.erstelleStringAusHashSet(this.alleSuchen, "Alle Suchen: ");
	}

	public String alleAngeboteString() {
		return Daten.erstelleStringAusHashSet(this.alleTransportmittelangebote, "Alle Angebote: ");
	}

	public String getTransportmittelProPosition() {
		return this.transportmittelProPosition();
	}

	@Override
	public String toString() {
		return this.alleSuchenString() + System.lineSeparator() + this.alleAngeboteString() + System.lineSeparator()
				+ this.transportmittelProPosition() + System.lineSeparator();
	}

}
