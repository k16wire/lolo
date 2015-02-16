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

create table user (
  id                        bigint not null,
  name                      varchar(255),
  constraint pk_user primary key (id))
;

create table user_webservice (
  id                        bigint not null,
  user_id                   bigint,
  webservice_id             bigint,
  user_webservice_config_id bigint,
  user_webservice_policy_id bigint,
  constraint pk_user_webservice primary key (id))
;

create table user_webservice_config (
  id                        bigint not null,
  constraint pk_user_webservice_config primary key (id))
;

create table user_webservice_policy (
  id                        bigint not null,
  policy_type               integer,
  constraint ck_user_webservice_policy_policy_type check (policy_type in (0,1)),
  constraint pk_user_webservice_policy primary key (id))
;

create table webservice (
  id                        bigint not null,
  name                      varchar(255),
  service_type              integer,
  constraint ck_webservice_service_type check (service_type in (0)),
  constraint pk_webservice primary key (id))
;

create table webservice_container (
  id                        bigint not null,
  webservice_id             bigint,
  container_id              bigint,
  constraint pk_webservice_container primary key (id))
;

create sequence container_seq;

create sequence image_seq;

create sequence image_container_seq;

create sequence user_seq;

create sequence user_webservice_seq;

create sequence user_webservice_config_seq;

create sequence user_webservice_policy_seq;

create sequence webservice_seq;

create sequence webservice_container_seq;

alter table image_container add constraint fk_image_container_image_1 foreign key (image_id) references image (id) on delete restrict on update restrict;
create index ix_image_container_image_1 on image_container (image_id);
alter table image_container add constraint fk_image_container_container_2 foreign key (container_id) references container (id) on delete restrict on update restrict;
create index ix_image_container_container_2 on image_container (container_id);
alter table user_webservice add constraint fk_user_webservice_user_3 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_user_webservice_user_3 on user_webservice (user_id);
alter table user_webservice add constraint fk_user_webservice_webservice_4 foreign key (webservice_id) references webservice (id) on delete restrict on update restrict;
create index ix_user_webservice_webservice_4 on user_webservice (webservice_id);
alter table user_webservice add constraint fk_user_webservice_userWebserv_5 foreign key (user_webservice_config_id) references user_webservice_config (id) on delete restrict on update restrict;
create index ix_user_webservice_userWebserv_5 on user_webservice (user_webservice_config_id);
alter table user_webservice add constraint fk_user_webservice_userWebserv_6 foreign key (user_webservice_policy_id) references user_webservice_policy (id) on delete restrict on update restrict;
create index ix_user_webservice_userWebserv_6 on user_webservice (user_webservice_policy_id);
alter table webservice_container add constraint fk_webservice_container_webser_7 foreign key (webservice_id) references webservice (id) on delete restrict on update restrict;
create index ix_webservice_container_webser_7 on webservice_container (webservice_id);
alter table webservice_container add constraint fk_webservice_container_contai_8 foreign key (container_id) references container (id) on delete restrict on update restrict;
create index ix_webservice_container_contai_8 on webservice_container (container_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists container;

drop table if exists image;

drop table if exists image_container;

drop table if exists user;

drop table if exists user_webservice;

drop table if exists user_webservice_config;

drop table if exists user_webservice_policy;

drop table if exists webservice;

drop table if exists webservice_container;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists container_seq;

drop sequence if exists image_seq;

drop sequence if exists image_container_seq;

drop sequence if exists user_seq;

drop sequence if exists user_webservice_seq;

drop sequence if exists user_webservice_config_seq;

drop sequence if exists user_webservice_policy_seq;

drop sequence if exists webservice_seq;

drop sequence if exists webservice_container_seq;

