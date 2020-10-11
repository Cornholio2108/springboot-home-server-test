create table shoppinglist (
  shoppinglist_id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar (255) NULL DEFAULT NULL,
  creation_date timestamp null default null,
  modification_date timestamp null default null,
  price DOUBLE DEFAULT 0,
PRIMARY KEY (`shoppinglist_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

create table shoppinglist_item (
  item_id bigint(20) NOT NULL AUTO_INCREMENT,
  shoppinglist_id bigint(20) NULL DEFAULT NULL,
  name varchar (255) NULL DEFAULT NULL,
  description varchar (1000) NULL DEFAULT NULL,
  scan_number varchar (255) NULL DEFAULT NULL,
  shop varchar (255) NULL DEFAULT NULL,
  creation_date timestamp null default null,
  modification_date timestamp null default null,
  price DOUBLE DEFAULT 0,
PRIMARY KEY (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;