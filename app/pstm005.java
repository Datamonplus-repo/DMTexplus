package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pstm005 extends GXProcedure
{
   public pstm005( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pstm005.class ), "" );
   }

   public pstm005( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 )
   {
      pstm005.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 )
   {
      pstm005.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pstm005.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pstm005.this.AV8LastFecha = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "pSTM005", "") );
      AV8LastFecha = GXutil.nullDate() ;
      /* Using cursor P00WK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3341CCStKULin = P00WK2_A3341CCStKULin[0] ;
         n3341CCStKULin = P00WK2_n3341CCStKULin[0] ;
         AV9ccstkulin = A3341CCStKULin ;
         /* Using cursor P00WK3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(AV9ccstkulin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3342CCStkLin = P00WK3_A3342CCStkLin[0] ;
            A3348CCStkFec = P00WK3_A3348CCStkFec[0] ;
            AV8LastFecha = A3348CCStkFec ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      Gx_msg = httpContext.getMessage( "pSTM005. ", "") + localUtil.dtoc( AV8LastFecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      System.out.println( Gx_msg );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pstm005.this.A396EmprCod;
      this.aP1[0] = pstm005.this.A719PrdNum;
      this.aP2[0] = pstm005.this.AV8LastFecha;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P00WK2_A396EmprCod = new String[] {""} ;
      P00WK2_A719PrdNum = new String[] {""} ;
      P00WK2_A3341CCStKULin = new long[1] ;
      P00WK2_n3341CCStKULin = new boolean[] {false} ;
      P00WK3_A396EmprCod = new String[] {""} ;
      P00WK3_A719PrdNum = new String[] {""} ;
      P00WK3_A3342CCStkLin = new long[1] ;
      P00WK3_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      A3348CCStkFec = GXutil.nullDate() ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pstm005__default(),
         new Object[] {
             new Object[] {
            P00WK2_A396EmprCod, P00WK2_A719PrdNum, P00WK2_A3341CCStKULin, P00WK2_n3341CCStKULin
            }
            , new Object[] {
            P00WK3_A396EmprCod, P00WK3_A719PrdNum, P00WK3_A3342CCStkLin, P00WK3_A3348CCStkFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A3341CCStKULin ;
   private long AV9ccstkulin ;
   private long A3342CCStkLin ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String Gx_msg ;
   private java.util.Date AV8LastFecha ;
   private java.util.Date A3348CCStkFec ;
   private boolean n3341CCStKULin ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00WK2_A396EmprCod ;
   private String[] P00WK2_A719PrdNum ;
   private long[] P00WK2_A3341CCStKULin ;
   private boolean[] P00WK2_n3341CCStKULin ;
   private String[] P00WK3_A396EmprCod ;
   private String[] P00WK3_A719PrdNum ;
   private long[] P00WK3_A3342CCStkLin ;
   private java.util.Date[] P00WK3_A3348CCStkFec ;
}

final  class pstm005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00WK2", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStKULin FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00WK3", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin, CCStkFec FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkLin = ? ORDER BY EmprCod, PrdNum, CCStkLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

