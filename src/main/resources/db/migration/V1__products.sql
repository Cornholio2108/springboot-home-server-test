create table product (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar (255) NULL DEFAULT NULL,
  price DOUBLE DEFAULT 0,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;