create table if not exists sensors (
                         id bigint not null auto_increment,
                         description varchar(255),
                         location varchar(255),
                         model varchar(255),
                         name varchar(255),
                         range_from integer,
                         range_to integer,
                         type_id bigint,
                         unit_id bigint,
                         primary key (id)
) engine=MyISAM;

create table if not exists types (
                       id bigint not null auto_increment,
                       type_name varchar(255),
                       primary key (id)
) engine=MyISAM;

create table if not exists units (
                       id bigint not null auto_increment,
                       unit_name varchar(255),
                       primary key (id)
) engine=MyISAM;
