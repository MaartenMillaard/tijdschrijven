insert into categorieen(categorie) values ('Project');
insert into categorieen(categorie) values ('Overhead');
insert into categorieen(categorie) values ('Afwezigheid');

insert into rollen(rol) values ('Medewerker');
insert into rollen(rol) values ('Coordinator');
insert into rollen(rol) values ('Afdelingshoofd');

insert into opdrachtgevers(naam, organisatie) values('Arne Tiel Groenestage', 'Gemeente Groningen');
insert into opdrachtgevers(naam, organisatie) values('Hans Julsing', 'Gemeente Groningen');
insert into opdrachtgevers(naam, organisatie) values('Jan Klaasen', 'RijksUniversitei Groningen');
insert into opdrachtgevers(naam, organisatie) values('Piet Puk', 'Provincie Groningen');

insert into afdelingen(naam) values ('Onderzoek, Informatie en Statistiek');
insert into afdelingen(naam) values ('Afdeling Inkomen');
insert into afdelingen(naam) values ('Afdeling Werk');
insert into afdelingen(naam) values ('Afdeling Monitoring en Informatie');
insert into afdelingen(naam) values ('Sport050');

insert into medewerkers values ('maamil1s', 'Millaard', 1.0, 'Maarten', null, 1);
insert into medewerkers values ('erwrei1o', 'Reinders', 1.0, 'Erwin', null, 1);
insert into medewerkers values ('arjheg1r', 'Hegge', 1.0, 'Arjan', null, 1);

insert into gebruikers(`emailadres`, `wachtwoord`, `medewerkercode`, `rol_id`) values ('maarten.millaard@groningen.nl', 'welkom', 'maamil1s', 1);
insert into gebruikers(`emailadres`, `wachtwoord`, `medewerkercode`, `rol_id`) values ('erwin.reinders@groningen.nl', 'welkom', 'erwrei1o', 1);
insert into gebruikers(`emailadres`, `wachtwoord`, `medewerkercode`, `rol_id`) values ('arjan.hegge@groningen.nl', 'welkom', 'arjheg1r', 1);

insert into onderdelen(begindatum, einddatum, naam, afdeling_Id, categorie_Id, opdrachtgever_Id) values(now(), null, 'DMO indicatiewaarden', 4, 1, 1);
insert into onderdelen(begindatum, einddatum, naam, afdeling_Id, categorie_Id, opdrachtgever_Id) values(now(), '2019-12-31', 'eSuite Klachten', 4, 1, 2);
insert into onderdelen(begindatum, einddatum, naam, afdeling_Id, categorie_Id, opdrachtgever_Id) values('2018-07-01', '2018-12-31', 'eSuite Melsngen Openbare Ruimte', 4, 1, 3);
insert into onderdelen(begindatum, einddatum, naam, afdeling_Id, categorie_Id, opdrachtgever_Id) values('2019-01-01', null, 'WIJ WIZ-portaal', 4, 1, 4);
insert into onderdelen(begindatum, einddatum, naam, afdeling_Id, categorie_Id, opdrachtgever_Id) values('2018-11-01', null, 'Beschermd Wonen', 4, 1, 1);
insert into onderdelen(naam, categorie_Id) values('Werkoverleg', 2);
insert into onderdelen(naam, categorie_Id) values('Conferentie', 2);
insert into onderdelen(naam, categorie_Id) values('Overig', 2);
insert into onderdelen(naam, categorie_Id) values('Verlof', 3);
insert into onderdelen(naam, categorie_Id) values('Ziekte', 3);
insert into onderdelen(naam, categorie_Id) values('Opleiding/Vorming', 3);
