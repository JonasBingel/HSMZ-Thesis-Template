# HSMZ Thesis Template

Dieses Repository enthält eine LaTeX-Vorlage, die für Exposés, Hausarbeiten und Abschlussarbeiten an der Hochschule Mainz genutzt werden kann. Die Vorlage erfüllt alle formalen Anforderungen, die im [Leitfaden der HS Mainz zur Anfertigung wissenschaftlicher Arbeiten (2020)](https://www.hs-mainz.de/studium/services/wirtschaft/pruefungsmanagement/downloads/) gelistet werden. 

Entstanden ist diese Vorlage im Rahmen meiner eigenen Bachelorarbeit und soll nun anderen Studierenden Zeit sparen und die Nutzung von LaTeX vereinfachen. Beispiele von fertigen Dokumenten, die meine Vorlage verwenden, bieten die folgenden Repositories:

- [ThesisHSMZ-RLTicTacToe-Expose](https://github.com/JonasBingel/ThesisHSMZ-RLTicTacToe-Expose) Repository des Exposé zu meiner Bachelorarbeit
- [ThesisHSMZ-RLTicTacToe](https://github.com/JonasBingel/ThesisHSMZ-RLTicTacToe) Repository meiner Bachelorarbeit

Hinweis: Das Logo der Hochschule Mainz kann zentral in `Metadaten.tex` ausgetauscht werden, sodass auch Studierende anderer Hochschulen die Vorlage gerne verwenden können.

## Features der Vorlage

Die folgende Auflistung enthält einige der wichtigsten Features, die meine Vorlage bietet:

- Leichter Wechsel zwischen Struktur für das Exposé und Abschlussarbeit/Hausarbeit
- Zentrale Anpassbarkeit von Metadaten (Name, Matrikelnummer, Titel, Betreuer etc.)
- [Leitfaden zur Anfertigung von Abschlusarbeiten der Hochschule Mainz (2020)](https://www.hs-mainz.de/studium/services/wirtschaft/pruefungsmanagement/downloads/) wird eingehalten
    - Titelseite mit allen geforderten Angaben
    - Schriftbild und Ränder
    - Formale Ordnung und Reihenfolge
    - Seitennummerierung
    - Vorlage für eidesstattliche Erklärung und Sperrvermerk der Hochschule Mainz
    - Anhang mit Anhangsverzeichnis und fortlaufender römischer Nummerierung
- Verzeichnisse für
    - Abbildungen
    - Tabellen
    - Abkürzungen
    - Symbole
    - Formeln
    - Algorithmen
    - Listing (Quellcode)
- Literaturverzeichnis mit BibLaTeX und Voreinstellungen für IEEE und APA
- Listing zur Darstellung von Quellcode (über mehrere Seiten) mittels `minted`
- Darstellung von Algorithmen mittels `algorithm2e`
- Referenzieren von Gleitumgebungen mittels `Varioref` und `Cleverref`
- Verwalten von Kommentaren und offenen Punkten mittels `todonotes`
- Pakete zum Erstellen guter wissenschaftlicher Tabellen (über mehrere Seiten)
- Automatisch generierte PDF-Bookmarks für die einzelnen Abschnitte

## Anleitung zur Verwendung

Voraussetzung für die Nutzung dieser Vorlage ist ein grundlegendes Verständnis von LaTeX.
Einen guten Einstieg in LaTeX bietet beispielsweise dieses [Tutorial von Overleaf](https://www.overleaf.com/learn/latex/Tutorials).

1. Repository als Zip herunterladen und in favorisierten LaTeX-Editor einbinden
2. In der Datei 00_Allgemein/Metadaten.tex die Metadaten aktualisieren (Name, Matrikelnummer, Titel etc.)
3. Entsprechend der Verwendung eine Hauptdatei wählen 
    1. Bei einem Expose ist `Expose.tex` zu verwenden und `Arbeit.tex` zu löschen
    2. Bei einer Haus-/Bachelor-/Masterarbeit ist `Arbeit.tex` zu verwenden und `Expose.tex` zu löschen
4. Die gewählte Hauptdatei durchlesen und ggf. benötigte Abschnitte einblenden (z.B. Sperrvermerk)
5. Zugehörige Datei im Verzeichnis 02_Textteil ansehen und losschreiben 🙂

## Struktur der Vorlage

Dieser Abschnitt bietet einen Überblick der Struktur der Vorlage und erklärt den Zweck der einzelnen Dateien. In den Dateien selbst ist jeweils ein Kommentar enthalten, der konkretere Informationen und Hinweise bietet.

`Expose.tex` Haupdatei für ein Expose, die dem LaTeX-Kompiler übergeben wird

`Arbeit.tex` Haupdatei für eine Arbeit, die dem LaTeX-Kompiler übergeben wird

Verzeichnis `00_Allgemein` enthält alle Dateien, die zur Konfiguration von TeX und der Vorlage verwendet werden

- `Befehle.tex` Definition von Custom-Anweisungen
- `Metadaten.tex` Metadaten zur Arbeit, Autor, Betreuer und Hochschule (inkl. Logo)
- `Nomenklatur.tex` Nomenklatur, d.h. verwendete Symbole in der Arbeit (Symbolverzeichnis)
- `Packages.tex` LaTeX-Packages und deren Konfiguration
- `ToDo.tex` Eine To-do-Liste sowie allgemeine To-dos, die mittels Package `todonotes` erstellt werden

Verzeichnis `01_Vortext` enthält alle Dateien/Seiten, die dem eigentlichen Textteil vorangestellt sind

- `01_Sperrvermerk.tex` Optionaler Sperrvermerk, der die erste Seite bildet
- `02_Titelseite.tex` Titelseite des Exposes bzw. der Arbeit
- `03_Erklaerung.tex` Eidesstattliche Erklärung
- `04_ManagementSummary.tex` Management Summary (Abstract) zur Arbeit
- `05_Verzeichnisse.tex` Konfiguration der Verzeichnisse, die angezeigt werden sollen und deren Reihenfolge
- `06_Abkuerzungen.tex` Abkürzungen, die in der Arbeit genutzt und im Abkürzungsverzeichnis gelistet werden

Verzeichnis `02_Texttteil` enthält den eigentlichen Inhalt der Arbeit

- `00_Inhalt_Expose.tex` Vorlage für ein Expose
- `00_Inhalt_Arbeit.tex` Haupdatei der zu erstellenden Arbeit (enthält Beispiele zur Nutzung der Features der Vorlage)

Verzeichnis `03_Nachtext` enthält alle Dateien, die den Anhang der Arbeit bilden 

- `01_Anhang.tex` definiert den Anhang und bindet ggf. weitere Seiten ein

Verzeichnis `04_Artefakte` enthält alle Artefakte, die in der Arbeit verwendet werden. Zur besseren Übersichtlichkeit gibt es Unterverzeichnisse für die einzelnen Artefaktarten.

## Nutzungshinweise

Die Nutzung der Vorlage ist und bleibt vollkommen kostenfrei.

Im PDF-Export eurer Arbeit mus selbstverständlich nicht auf diese Voralge verwiesen werden. Meine Bitte ist jedoch in eurem LaTeX-Quellcode auf diese Vorlage zu verweisen, sodass andere sie ebenfalls nutzen können.

In jedem Fall würde ich mich jedoch sehr freuen, wenn

- ihr diesem Repository einen ⭐ gebt und
- ein Issue öffnet mit dem Label `Use-Case` und kurz beschreibt wofür ihr die Vorlage genutzt habt bzw. worum es in eurer Arbeit geht! Falls ihr eure Arbeit  veröffentlicht habt, könnt ihr sie gerne verlinken.

Wer mich unterstützen möchte, kann mir auch gerne einen [virtuellen Kaffe ausgeben](https://ko-fi.com/jonasbingel) - dies ist selbstverständlich vollkommen optional! :)

## Verbesserungen

Verbesserungsvorschläge können gerne als Issue oder Pull-Request eingereicht werden.

## Empfehlungen zur Verwendung

Beim Schreiben meiner eigenen Bachelorarbeit mit dieser LaTeX-Vorlage waren insbesondere zwei Anwendungen sehr hilfreich, die ich daher hier kurz empfehlen möchte:

- Overleaf - Online LaTeX-Editor, der es euch erspart LaTeX lokal zu installieren und Pakete zu verwalten
- Zotero mit dem Add-On “Better BibTeX for Zotero” - Verwaltung der Literatur und Export als BibLaTeX-Datei, um das Literaturverzeichnis einfach zu erstellen

## Kurzanleitung Nutzung in Overleaf

Wenn ihr Overleaf als LaTeX-Editor verwenden möchtet, könnt ihr folgende Anleitung verwenden, um direkt loszuschreiben: 

1. Dieses Repository als Zip-Datei herunterladen
2. Overleaf-Account anlegen
3. In Overleaf mittels `New Project` ein neues Projekt anlegen und und anschließend bei `Upload Project` die heruntergeladene Zip-Datei auswählen

![Overleaf New Project](https://imgur.com/W0XkLiT.png)
    
4. In den Einstellungen des Projekts bei der Option `Main document` entweder `Arbeit.tex` oder `Expose.tex` wählen und die andere Datei löschen


![Overleaf - Choose File](https://imgur.com/ybWe0rj.png)   
5. Projekt rekompilieren und losschreiben 🙂


