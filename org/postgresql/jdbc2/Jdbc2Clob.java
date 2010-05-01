/*-------------------------------------------------------------------------
*
* Copyright (c) 2004-2005, PostgreSQL Global Development Group
*
* IDENTIFICATION
*   $PostgreSQL: pgjdbc/org/postgresql/jdbc2/Jdbc2Clob.java,v 1.4 2005/01/11 08:25:46 jurka Exp $
*
*-------------------------------------------------------------------------
*/
package org.postgresql.jdbc2;


public class Jdbc2Clob extends AbstractJdbc2Clob implements java.sql.Clob
{

    public Jdbc2Clob(org.postgresql.PGConnection conn, long oid) throws java.sql.SQLException
    {
        super(conn, oid);
    }

}