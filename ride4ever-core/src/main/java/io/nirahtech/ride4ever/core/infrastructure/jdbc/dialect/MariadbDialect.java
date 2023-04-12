package io.nirahtech.ride4ever.core.infrastructure.jdbc.dialect;

import org.hibernate.dialect.MySQL5Dialect;

/**
 * Class that represents a Mariadb Dialect for JPA/Hibernate transactions.
 * 
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public class MariadbDialect extends MySQL5Dialect {

    @Override
    public String getTableTypeString() {  
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";  
    }  
}
