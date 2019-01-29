insert into categorie(categorie) values ('Project');
insert into categorie(categorie) values ('Overhead');
insert into categorie(categorie) values ('Afwezigheid');

insert into rol(rol) values ('Medewerker');
insert into rol(rol) values ('Coordinator');
insert into rol(rol) values ('Afdelingshoofd');

insert into opdrachtgever(naam, organisatie) values('Arne Tiel Groenestage', 'Gemeente Groningen');
insert into opdrachtgever(naam, organisatie) values('Hans Julsing', 'Gemeente Groningen');
insert into opdrachtgever(naam, organisatie) values('Jan Klaasen', 'RijksUniversitei Groningen');
insert into opdrachtgever(naam, organisatie) values('Piet Puk', 'Provincie Groningen');

insert into afdeling(naam) values ('Onderzoek, Informatie en Statistiek');
insert into afdeling(naam) values ('Afdeling Inkomen');
insert into afdeling(naam) values ('Afdeling Werk');
insert into afdeling(naam) values ('Afdeling Monitoring en Informatie');
insert into afdeling(naam) values ('Sport050');

insert into medewerker values ('maamil1s', 'Millaard', 1.0, 'Maarten', null, 1);
insert into medewerker values ('erwrei1o', 'Reinders', 1.0, 'Erwin', null, 1);
insert into medewerker values ('arjheg1r', 'Hegge', 1.0, 'Arjan', null, 1);

insert into gebruiker values ('maarten.millaard@groningen.nl', 'welkom', 'maamil1s', 1);
insert into gebruiker values ('erwin.reinders@groningen.nl', 'welkom', 'erwrei1o', 1);
insert into gebruiker values ('arjan.hegge@groningen.nl', 'welkom', 'arjheg1r', 1);

insert into onderdeel(begindatum, einddatum, naam, afdeling_afdeling_id, categorie_categorie_id, opdrachtgever_opdrachtgever_id) values(now(), null, 'DMO indicatiewaarden', 4, 1, 1);
insert into onderdeel(begindatum, einddatum, naam, afdeling_afdeling_id, categorie_categorie_id, opdrachtgever_opdrachtgever_id) values(now(), '2019-12-31', 'eSuite Klachten', 4, 1, 2);
insert into onderdeel(begindatum, einddatum, naam, afdeling_afdeling_id, categorie_categorie_id, opdrachtgever_opdrachtgever_id) values('2018-07-01', '2018-12-31', 'eSuite Melsngen Openbare Ruimte', 4, 1, 3);
insert into onderdeel(begindatum, einddatum, naam, afdeling_afdeling_id, categorie_categorie_id, opdrachtgever_opdrachtgever_id) values('2019-01-01', null, 'WIJ WIZ-portaal', 4, 1, 4);
insert into onderdeel(begindatum, einddatum, naam, afdeling_afdeling_id, categorie_categorie_id, opdrachtgever_opdrachtgever_id) values('2018-11-01', null, 'Beschermd Wonen', 4, 1, 1);
insert into onderdeel(naam, categorie_categorie_id) values('Werkoverleg', 2);
insert into onderdeel(naam, categorie_categorie_id) values('Conferentie', 2);
insert into onderdeel(naam, categorie_categorie_id) values('Overig', 2);
insert into onderdeel(naam, categorie_categorie_id) values('Verlof', 3);
insert into onderdeel(naam, categorie_categorie_id) values('Ziekte', 3);
insert into onderdeel(naam, categorie_categorie_id) values('Opleiding/Vorming', 3);
