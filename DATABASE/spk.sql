/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     07/01/2020 08:52:20                          */
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
   PREFERENSI           decimal(65,9),
   primary key (ID_CALON)
);

