package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedart3 extends GXProcedure
{
   public ppedart3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedart3.class ), "" );
   }

   public ppedart3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          long[] aP2 )
   {
      ppedart3.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        long[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             long[] aP2 ,
                             int[] aP3 )
   {
      ppedart3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedart3.this.A1798BarDibCli = aP1[0];
      this.aP1 = aP1;
      ppedart3.this.AV8Ancho = aP2[0];
      this.aP2 = aP2;
      ppedart3.this.AV9OGSCod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P037G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1798BarDibCli, Long.valueOf(AV8Ancho)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A132BarCodReo = P037G2_A132BarCodReo[0] ;
         n132BarCodReo = P037G2_n132BarCodReo[0] ;
         A130BarCodPar = P037G2_A130BarCodPar[0] ;
         n130BarCodPar = P037G2_n130BarCodPar[0] ;
         A7141OGSAnc = P037G2_A7141OGSAnc[0] ;
         n7141OGSAnc = P037G2_n7141OGSAnc[0] ;
         A7050OGSEst = P037G2_A7050OGSEst[0] ;
         n7050OGSEst = P037G2_n7050OGSEst[0] ;
         A129BarCod = P037G2_A129BarCod[0] ;
         n129BarCod = P037G2_n129BarCod[0] ;
         A7049OGSCod = P037G2_A7049OGSCod[0] ;
         if ( GXutil.strcmp(A7050OGSEst, httpContext.getMessage( "N", "")) == 0 )
         {
            AV9OGSCod = A7049OGSCod ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedart3.this.A396EmprCod;
      this.aP1[0] = ppedart3.this.A1798BarDibCli;
      this.aP2[0] = ppedart3.this.AV8Ancho;
      this.aP3[0] = ppedart3.this.AV9OGSCod;
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
      P037G2_A132BarCodReo = new byte[1] ;
      P037G2_n132BarCodReo = new boolean[] {false} ;
      P037G2_A130BarCodPar = new String[] {""} ;
      P037G2_n130BarCodPar = new boolean[] {false} ;
      P037G2_A396EmprCod = new String[] {""} ;
      P037G2_A7141OGSAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037G2_n7141OGSAnc = new boolean[] {false} ;
      P037G2_A1798BarDibCli = new String[] {""} ;
      P037G2_A7050OGSEst = new String[] {""} ;
      P037G2_n7050OGSEst = new boolean[] {false} ;
      P037G2_A129BarCod = new int[1] ;
      P037G2_n129BarCod = new boolean[] {false} ;
      P037G2_A7049OGSCod = new int[1] ;
      A130BarCodPar = "" ;
      A7141OGSAnc = DecimalUtil.ZERO ;
      A7050OGSEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedart3__default(),
         new Object[] {
             new Object[] {
            P037G2_A132BarCodReo, P037G2_n132BarCodReo, P037G2_A130BarCodPar, P037G2_n130BarCodPar, P037G2_A396EmprCod, P037G2_A7141OGSAnc, P037G2_n7141OGSAnc, P037G2_A1798BarDibCli, P037G2_A7050OGSEst, P037G2_n7050OGSEst,
            P037G2_A129BarCod, P037G2_n129BarCod, P037G2_A7049OGSCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV9OGSCod ;
   private int A129BarCod ;
   private int A7049OGSCod ;
   private long AV8Ancho ;
   private java.math.BigDecimal A7141OGSAnc ;
   private String A396EmprCod ;
   private String A1798BarDibCli ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A7050OGSEst ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n7141OGSAnc ;
   private boolean n7050OGSEst ;
   private boolean n129BarCod ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private long[] aP2 ;
   private IDataStoreProvider pr_default ;
   private byte[] P037G2_A132BarCodReo ;
   private boolean[] P037G2_n132BarCodReo ;
   private String[] P037G2_A130BarCodPar ;
   private boolean[] P037G2_n130BarCodPar ;
   private String[] P037G2_A396EmprCod ;
   private java.math.BigDecimal[] P037G2_A7141OGSAnc ;
   private boolean[] P037G2_n7141OGSAnc ;
   private String[] P037G2_A1798BarDibCli ;
   private String[] P037G2_A7050OGSEst ;
   private boolean[] P037G2_n7050OGSEst ;
   private int[] P037G2_A129BarCod ;
   private boolean[] P037G2_n129BarCod ;
   private int[] P037G2_A7049OGSCod ;
}

final  class ppedart3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P037G2", "SELECT T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.OGSAnc, T2.BarDibCli, T1.OGSEst, T1.BarCod, T1.OGSCod FROM (TXPShaGra T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T2.BarDibCli = ?) AND (T1.OGSAnc >= CAST(? / 100 AS NUMERIC(20,10))) ORDER BY T1.EmprCod, T1.OGSEst ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

