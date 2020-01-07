/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     07/01/2020 19:48:44                          */
/*==============================================================*/


drop table if exists BOBOT;

drop table if exists CALON;

/*==============================================================*/
/* Table: BOBOT                                                 */
/*==============================================================*/
create table BOBOT
(
   KODEBOBOT            varchar(30) not null,
   KRITERIA             varchar(100),
   BOBOT                int,
   primary key (KODEBOBOT)
);

/*==============================================================*/
/* Table: CALON                                                 */
/*==============================================================*/
create table CALON
(
   ID_CALON             varchar(50) not null,
   NOKTP                bigint,
   NAMA                 varchar(50),
   TANAH                int,
   LANTAI               varchar(50),
   DINDING              varchar(50),
   PEKERJAAN            varchar(50),
   PENGHASILAN          int,
   NTANAH               int,
   NLANTAI              int,
   NDINDING             int,
   NPEKERJAAN           int,
   NPENGHASILAN         int,
   NBTANAH              decimal(65,9),
   NBLANTAI             decimal(65,9),
   NBDINDING            decimal(65,9),
   NBPEKERJAAN          decimal(65,9),
   NBPENGHASILAN        decimal(65,9),
   JPTANAH              decimal(65,9),
   JPLANTAI             decimal(65,9),
   JPDINDING            decimal(65,9),
   JPPEKERJAAN          decimal(65,9),
   JPPENGHASILAN        decimal(65,9),
   JNTANAH              decimal(65,9),
   JNLANTAI             decimal(65,9),
   JNDINDING            decimal(65,9),
   JNPEKERJAAN          decimal(65,9),
   JNPENGHASILAN        decimal(65,9),
   PREFERENSI           decimal(65,9),
   primary key (ID_CALON)
);

