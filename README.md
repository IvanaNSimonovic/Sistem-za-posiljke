Sistem za pošiljke
Napravite uslužni program za potrebe državne pošte koji omogućava unos pristiglih pisama a potom omogućava pregled u zavisnosti od
grada. Pismo realizovati kao klasu.

Pismo:
polja:
Pošiljalac [String: Ime Prezime]
Primalac [String: Ime Prezime]
Poštanski Broj [int]
Težinu (u gramima) [double]
Prioritetno [boolean]
metode:
cena( ) [double] : Metoda koja omogućava ispis cene zavisno od težine (težina data utabeli, gledamo samo kolone pismo i stopa
mase) i prioritetnog statusa (prioritet dodaje 46din na cenu)
toString( ) [String] : Metoda koja omogućava univerzalni ispis svake pošiljke u formatu: pošiljalac -> primalac :
poštanski broj, težina [prioritet] => cena
Ispis programa:
Dobrodošli u pametni sistem pošte!
------------------------------------
Unesite pristigla pisma:
[Pismo]
[Pismo]
...
kraj

Primer unosa:
Jovan Milićević Milica Jovanović 11000 50 0
Živorad Živković Srba Nikolić 16000 5000 0
Miloš Stamenković Marija Stanković 21000 20 1
Jovana Janković Petar Petrović 11000 20 1
kraj

Nastavak ispisa:
Pisma uspešno učitana!
------------------------------------
Unesite poštanski br. grada: [int]

Primer unosa:
11000

Nastavak ispisa:
Jovan Milićević -> Milica Jovanović : 11000, 50g => 35din
Jovana Janković -> Petar Petrović : 11000, 20g prioritetno => 69din
-----------------------------------------------------------------------
Unesite poštanski br. grada: [int]
