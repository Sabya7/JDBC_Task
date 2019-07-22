package com.stackroute;



public class Main {
    public static void main(String[] args) {
        App app=new App();
        //app.getEmployeeDetailsByNameAndGender("Sabya","M");
        DatabaseMetadataDemo databaseMetadataDemo=new DatabaseMetadataDemo();
        //databaseMetadataDemo.metaDataDemo();
        JdbcBatchDemo jdbcBatchDemo=new JdbcBatchDemo();
        //jdbcBatchDemo.databaseBatchDemo();
        ResultSetMetadataDemo resultSetMetadata=new ResultSetMetadataDemo();
      //  resultSetMetadata.resultSetMetaData();
       // RowSetDemo rowSetDemo=new RowSetDemo();
       // rowSetDemo.jdbcRowSet();
        JdbcTransactionDemo transactionDemo=new JdbcTransactionDemo();
        transactionDemo.transactionDemo();
    }
}
