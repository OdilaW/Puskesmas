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
references Poli_06993 (id_poli)  ON DELETE CASCADE;

create sequence no_rekamedik
minvalue   1
maxvalue   9999
start with 1
increment by 1
nocache;

insert all
into Pasien_06993(id_pasien, nama_pasien, umur_pasien, No_telp, TTL, jenis_kelamin, Alamat_Pasien) values (8, 'Jingga', '20', '112345679', to_date('09/02/2000','dd/mm/yyyy'), 'prempuan', 'sidosermo')
into Pasien_06993(id_pasien, nama_pasien, umur_pasien, No_telp, TTL, jenis_kelamin, Alamat_Pasien) values (9, 'cilla', '22', '223456789', to_date('10/11/1998','dd/mm/yyyy'), 'prempuan', 'hawai')
into pasien_06993(id_pasien, nama_pasien, umur_pasien, No_telp, TTL, jenis_kelamin, Alamat_Pasien) values (10, 'amelia', '21', '334567891', to_date('02/10/1999','dd/mm/yyyy'), 'prempuan', 'demak')
into pasien_06993(id_pasien, nama_pasien, umur_pasien, No_telp, TTL, jenis_kelamin, Alamat_Pasien) values (11, 'galuh', '24', '445678912', to_date('10/04/1996','dd/mm/yyyy'), 'laki_laki', 'austria')
into pasien_06993(id_pasien, nama_pasien, umur_pasien, No_telp, TTL, jenis_kelamin, Alamat_Pasien) values (12, 'gading', '25', '556789123', to_date('15/07/1995','dd/mm/yyyy'), 'laki_laki', 'ketajen')
select 1 from dual;

insert all
into dokter_06993 (id_dokter, nama_dokter, spesialis, TTL, Jenis_kelamin) values (11, 'carolus', 'dokter gigi', to_date('13/02/1990','dd/mm/yyyy'), 'laki_laki')
into dokter_06993 (id_dokter, nama_dokter, spesialis, TTL, Jenis_kelamin) values (12, 'andrean', 'dokter anak', to_date('14/02/1991','dd/mm/yyyy'), 'laki_laki')
into dokter_06993 (id_dokter, nama_dokter, spesialis, TTL, Jenis_kelamin) values (13, 'anastasisa', 'dokter jantung', to_date('19/05/1986','dd/mm/yyyy'), 'prempuan')
into dokter_06993 (id_dokter, nama_dokter, spesialis, TTL, Jenis_kelamin) values (14, 'julia', 'dokter mata', to_date('09/09/1988','dd/mm/yyyy'), 'Prempuan')
into dokter_06993 (id_dokter, nama_dokter, spesialis, TTL, Jenis_kelamin) values (15, 'jaki', 'dokter tulang', to_date('02/07/1988','dd/mm/yyyy'), 'laki_laki')
select 1 from dual;

insert all
into Poli_06993 (id_poli, id_dokter, nama_poli, keterangan_poli) values (11, 11, 'poli gigi', 'mengobati sakit gigi')
into Poli_06993 (id_poli, id_dokter, nama_poli, keterangan_poli) values (12, 12, 'poli anak', 'mengobati sakit pada anak anak dan ibu hamil')
into Poli_06993 (id_poli, id_dokter, nama_poli, keterangan_poli) values (13, 13, 'poli jantung', 'mengobati sakit pada jantung')
into Poli_06993 (id_poli, id_dokter, nama_poli, keterangan_poli) values (14, 14, 'poli mata', 'mengobati sakit pada mata')
into Poli_06993 (id_poli, id_dokter, nama_poli, keterangan_poli) values (15, 15, 'poli tulang', 'mengobati sakit pada tulang')
select 1 from dual;

insert into Rekamedik_06993 (no_rekamedik, id_pasien, id_poli, Berat_badan, Suhu_tubuh, keluhan, Tinggi_badan, tanggal_kedatangan, tekanan_darah) values (no_rekamedik.nextval, 8, 11, '45', '35 C', 'gigi berlubang', 160, to_date('07/05/2018','dd/mm/yyyy'), '80per120');
insert into rekamedik_06993 (no_rekamedik, id_pasien, id_poli, Berat_badan, Suhu_tubuh, keluhan, Tinggi_badan, tanggal_kedatangan, tekanan_darah) values (no_rekamedik.nextval, 9, 12, '45', '38 C', 'demam pada anak', 150, to_date('08/09/2018','dd/mm/yyyy'), '90per120');
insert into rekamedik_06993 (no_rekamedik, id_pasien, id_poli, Berat_badan, Suhu_tubuh, keluhan, Tinggi_badan, tanggal_kedatangan, tekanan_darah) values (no_rekamedik.nextval, 10, 13, '50', '38 C', 'jantung berdebar', 165, to_date('08/08/2018','dd/mm/yyyy'), '70per110');
insert into rekamedik_06993 (no_rekamedik, id_pasien, id_poli, Berat_badan, Suhu_tubuh, keluhan, Tinggi_badan, tanggal_kedatangan, tekanan_darah) values (no_rekamedik.nextval, 11, 14, '70', '37 C', 'meta merah', 180, to_date('18/09/2018','dd/mm/yyyy'), '75per110');
insert into rekamedik_06993 (no_rekamedik, id_pasien, id_poli, Berat_badan, Suhu_tubuh, keluhan, Tinggi_badan, tanggal_kedatangan, tekanan_darah) values (no_rekamedik.nextval, 12, 15, '65', '37 C', 'tulang kering patah', 175, to_date('19/05/2018','dd/mm/yyyy'), '85per110');


CREATE OR REPLACE VIEW REKAMEDIKFUL AS 
SELECT REKAMEDIK_06993.NO_REKAMEDIK, REKAMEDIK_06993.ID_PASIEN AS ID_FROM_PASIEN, 
REKAMEDIK_06993.ID_POLI AS ID_FROM_POLI, REKAMEDIK_06993.BERAT_BADAN, 
REKAMEDIK_06993.SUHU_TUBUH, REKAMEDIK_06993.KELUHAN, REKAMEDIK_06993.TINGGI_BADAN ,
REKAMEDIK_06993.TANGGAL_KEDATANGAN,REKAMEDIK_06993.TEKANAN_DARAH, POLI_06993.*, 
PASIEN_06993.* FROM REKAMEDIK_06993 JOIN POLI_06993 
ON REKAMEDIK_06993.ID_POLI = POLI_06993.ID_POLI JOIN PASIEN_06993 
ON REKAMEDIK_06993.ID_PASIEN = PASIEN_06993.ID_PASIEN

