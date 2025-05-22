package com.example;

interface Connection {
}

class PostgresConnection implements Connection {
    // Postgres connection implementation
}

class CassandraConnection implements Connection {
    // Cassandra connection implementation
}


// Factory class
class DatabaseConnectionFactory {
    // Factory method
    public static Connection getConnection(String dbType) {
        if (dbType.equals("postgresql")) {
            // URL
            // username
            // password
            PostgresConnection pc = new PostgresConnection();
            return pc; // Upcasting ( postgresConnection is a Connection )
        } else if (dbType.equals("cassandra")) {
            return new CassandraConnection();
        } else {
            throw new IllegalArgumentException("Unsupported database type: " + dbType);
        }
    }
}


public class FactoryMethodPattern {

    public static void main(String[] args) {


        //-----------------------------------------
        // team-1 : module
        //-----------------------------------------

        String dbType = "postgresql"; // | cassandra ( external input )

        // Use the factory method to get the connection
        Connection connection1 = DatabaseConnectionFactory.getConnection(dbType);


        //-----------------------------------------
        // team-2 : module
        //-----------------------------------------

        dbType = "cassandra"; // | postgres ( external input )
        // Use the factory method to get the connection
        Connection connection2 = DatabaseConnectionFactory.getConnection(dbType);

    }

}
