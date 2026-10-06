package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class puniagre extends GXProcedure
{
   public puniagre( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( puniagre.class ), "" );
   }

   public puniagre( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           int[] aP4 )
   {
      puniagre.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      puniagre.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      puniagre.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      puniagre.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      puniagre.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      puniagre.this.AV9CliCod = aP4[0];
      this.aP4 = aP4;
      puniagre.this.AV8TotUni = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03893 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(AV9CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P03893_A252CliCod[0] ;
         n252CliCod = P03893_n252CliCod[0] ;
         A184BarMtr = P03893_A184BarMtr[0] ;
         n184BarMtr = P03893_n184BarMtr[0] ;
         A184BarMtr = P03893_A184BarMtr[0] ;
         n184BarMtr = P03893_n184BarMtr[0] ;
         AV8TotUni = AV8TotUni.add(A184BarMtr) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = puniagre.this.A396EmprCod;
      this.aP1[0] = puniagre.this.A129BarCod;
      this.aP2[0] = puniagre.this.A132BarCodReo;
      this.aP3[0] = puniagre.this.A130BarCodPar;
      this.aP4[0] = puniagre.this.AV9CliCod;
      this.aP5[0] = puniagre.this.AV8TotUni;
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
      P03893_A396EmprCod = new String[] {""} ;
      P03893_A129BarCod = new int[1] ;
      P03893_A132BarCodReo = new byte[1] ;
      P03893_A130BarCodPar = new String[] {""} ;
      P03893_A252CliCod = new int[1] ;
      P03893_n252CliCod = new boolean[] {false} ;
      P03893_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03893_n184BarMtr = new boolean[] {false} ;
      A184BarMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.puniagre__default(),
         new Object[] {
             new Object[] {
            P03893_A396EmprCod, P03893_A129BarCod, P03893_A132BarCodReo, P03893_A130BarCodPar, P03893_A252CliCod, P03893_n252CliCod, P03893_A184BarMtr, P03893_n184BarMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9CliCod ;
   private int A252CliCod ;
   private java.math.BigDecimal AV8TotUni ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private boolean n252CliCod ;
   private boolean n184BarMtr ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P03893_A396EmprCod ;
   private int[] P03893_A129BarCod ;
   private byte[] P03893_A132BarCodReo ;
   private String[] P03893_A130BarCodPar ;
   private int[] P03893_A252CliCod ;
   private boolean[] P03893_n252CliCod ;
   private java.math.BigDecimal[] P03893_A184BarMtr ;
   private boolean[] P03893_n184BarMtr ;
}

final  class puniagre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03893", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.CliCod, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.CliCod = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

