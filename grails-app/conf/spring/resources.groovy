import groovy.sql.Sql

beans = {
    sql(Sql, ref('dataSource')) { bean ->
        bean.destroyMethod = 'close'
    }
}