# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table container (
  id                        bigint not null,
  name                      varchar(255),
  uuid                      varchar(255),
  constraint pk_container primary key (id))
;

create table image (
  id                        bigint not null,
  name                      varchar(255),
  uuid                      varchar(255),
  constraint pk_image primary key (id))
;

create table image_container (
  id                        bigint not null,
  image_id                  bigint,
  container_id              bigint,
  constraint pk_image_container primary key (id))
;

create table user_webservice_config (
  id                        bigint not null,
  constraint pk_user_webservice_config primary key (id))
;

create table webapp (
  id                        bigint not null,
  name                      varchar(255),
  webapp_type               integer,
  constraint ck_webapp_webapp_type check (webapp_type in (0)),
  constraint pk_webapp primary key (id))
;

create table webapp_container (
  id                        bigint not null,
  webapp_id                 bigint,
  container_id              bigint,
  constraint pk_webapp_container primary key (id))
;

create sequence container_seq;

create sequence image_seq;

create sequence image_container_seq;

create sequence user_webservice_config_seq;

create sequence webapp_seq;

create sequence webapp_container_seq;

alter table image_container add constraint fk_image_container_image_1 foreign key (image_id) references image (id) on delete restrict on update restrict;
create index ix_image_container_image_1 on image_container (image_id);
alter table image_container add constraint fk_image_container_container_2 foreign key (container_id) references container (id) on delete restrict on update restrict;
create index ix_image_container_container_2 on image_container (container_id);
alter table webapp_container add constraint fk_webapp_container_webapp_3 foreign key (webapp_id) references webapp (id) on delete restrict on update restrict;
create index ix_webapp_container_webapp_3 on webapp_container (webapp_id);
alter table webapp_container add constraint fk_webapp_container_container_4 foreign key (container_id) references container (id) on delete restrict on update restrict;
create index ix_webapp_container_container_4 on webapp_container (container_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists container;

drop table if exists image;

drop table if exists image_container;

drop table if exists user_webservice_config;

drop table if exists webapp;

drop table if exists webapp_container;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists container_seq;

drop sequence if exists image_seq;

drop sequence if exists image_container_seq;

drop sequence if exists user_webservice_config_seq;

drop sequence if exists webapp_seq;

drop sequence if exists webapp_container_seq;

