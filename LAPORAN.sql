create tablespace sistempuskesmass
datafile 'E:\ITATSS\Matkul\Semester4\Basis Data\Praktikum\sistem_puskesmass.dbf'
size 30M;
create user odilaa_06993
identified by odilaa
default tablespace sistempuskesmass
quota 30M on sistempuskesmass;
grant all privileges to odilaa_06993;
conn odilaa_06993/odilaa;
create table Pasien_06993
(
id_pasien  INTEGER not null,
nama_pasien        VARCHAR2(25),
umur_pasien        NUMBER(9),
No_telp            NUMBER(12),
TTL                DATE,
jenis_kelamin      VARCHAR2(20),
Alamat_Pasien      VARCHAR2(50),
constraint PK_pasien primary key (id_pasien)
);
create table Dokter_06993
(
id_dokter          INTEGER  not null,
nama_dokter        VARCHAR2(50),
spesialis          VARCHAR2(25),
TTL                DATE,
Jenis_kelamin      VARCHAR2(10),
constraint PK_dokter primary key (id_dokter)
);
create table Poli_06993
(
id_poli            INTEGER not null,
id_dokter          INTEGER,
nama_poli          VARCHAR2(20),
keterangan_poli    VARCHAR2(100),
constraint PK_poli primary key (id_poli),
constraint FK_dokter foreign key (id_dokter)
references Dokter_06993 (id_dokter)
);
create table Rekamedik_06993
(
no_rekamedik       INTEGER  not null,
id_pasien          INTEGER,
id_poli            INTEGER,
Berat_badan        VARCHAR(5),
Suhu_tubuh         VARCHAR(6),
keluhan            VARCHAR2(30),
Tinggi_badan       INTEGER,
tanggal_kedatangan DATE,
tekanan_darah      VARCHAR(10),
constraint PK_rekamedik primary key (no_rekamedik)
);

alter table Rekamedik_06993
add constraint FK_id_pasien foreign key (id_pasien)
references Pasien_06993 (id_pasien)
add constraint FK_id_poli foreign key (id_poli)
references Poli_06993 (id_poli);
set linesize 250;
create sequence no_rekamedik
minvalue   1
maxvalue   9999
start with 1
increment by 1
nocache;

select * from user_sequences;

SEQUENCE_NAME                   MIN_VALUE  MAX_VALUE INCREMENT_BY C O CACHE_SIZE LAST_NUMBER
------------------------------ ---------- ---------- ------------ - - ---------- -----------
NO_REKAMEDIK                            1       9999            1 N N         20           1

poli
alter table dokter_06993
rename column spesialis to "06993_spesialis";

desc dokter_06993
 Name                                                  Null?    Type
 ----------------------------------------------------- -------- ------------------------------------
 ID_DOKTER                                             NOT NULL NUMBER(38)
 NAMA_DOKTER                                                    VARCHAR2(50)
 06993_spesialis                                                VARCHAR2(25)
 TTL                                                            DATE
 JENIS_KELAMIN                                                  VARCHAR2(10)


alter table pasien_06993
add constraint No_telp unique (No_telp);
select count(*) from
USER_IND_COLUMNS cols
where cols.table_name='PASIEN_06993';

  COUNT(*)
----------
         2


alter table Rekamedik_06993 modify(Berat_badan NUMBER(5));

desc rekamedik_06993;
 Name                                                  Null?    Type
 ----------------------------------------------------- -------- -------------
 NO_REKAMEDIK                                          NOT NULL NUMBER(38)
 ID_PASIEN                                                      NUMBER(38)
 ID_POLI                                                        NUMBER(38)
 BERAT_BADAN                                                    NUMBER(5)
 SUHU_TUBUH                                                     VARCHAR2(6)
 KELUHAN                                                        VARCHAR2(30)
 TINGGI_BADAN                                                   NUMBER(38)
 TANGGAL_KEDATANGAN                                             DATE
 TEKANAN_DARAH                                                  VARCHAR2(10)
