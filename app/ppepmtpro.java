package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppepmtpro extends GXProcedure
{
   public ppepmtpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppepmtpro.class ), "" );
   }

   public ppepmtpro( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           long[] aP1 )
   {
      ppepmtpro.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      ppepmtpro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppepmtpro.this.AV8PePCod = aP1[0];
      this.aP1 = aP1;
      ppepmtpro.this.AV9PepMtPr = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9PepMtPr = DecimalUtil.doubleToDec(0) ;
      AV11AEUROP = (byte)(0) ;
      GXv_int1[0] = AV11AEUROP ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AEUROP", ""), GXv_int1) ;
      ppepmtpro.this.AV11AEUROP = GXv_int1[0] ;
      if ( AV11AEUROP == 1 )
      {
         /* Using cursor P00TJ3 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV8PePCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A129BarCod = P00TJ3_A129BarCod[0] ;
            A132BarCodReo = P00TJ3_A132BarCodReo[0] ;
            A130BarCodPar = P00TJ3_A130BarCodPar[0] ;
            A2826BarNumLot = P00TJ3_A2826BarNumLot[0] ;
            A3746BarNPed = P00TJ3_A3746BarNPed[0] ;
            A184BarMtr = P00TJ3_A184BarMtr[0] ;
            n184BarMtr = P00TJ3_n184BarMtr[0] ;
            A184BarMtr = P00TJ3_A184BarMtr[0] ;
            n184BarMtr = P00TJ3_n184BarMtr[0] ;
            AV9PepMtPr = AV9PepMtPr.add(A184BarMtr) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else
      {
         AV10BarNPed = GXutil.str( AV8PePCod, 12, 0) ;
         /* Using cursor P00TJ5 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV10BarNPed});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A129BarCod = P00TJ5_A129BarCod[0] ;
            A132BarCodReo = P00TJ5_A132BarCodReo[0] ;
            A130BarCodPar = P00TJ5_A130BarCodPar[0] ;
            A3746BarNPed = P00TJ5_A3746BarNPed[0] ;
            A2826BarNumLot = P00TJ5_A2826BarNumLot[0] ;
            A184BarMtr = P00TJ5_A184BarMtr[0] ;
            n184BarMtr = P00TJ5_n184BarMtr[0] ;
            A184BarMtr = P00TJ5_A184BarMtr[0] ;
            n184BarMtr = P00TJ5_n184BarMtr[0] ;
            AV9PepMtPr = AV9PepMtPr.add(A184BarMtr) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppepmtpro.this.A396EmprCod;
      this.aP1[0] = ppepmtpro.this.AV8PePCod;
      this.aP2[0] = ppepmtpro.this.AV9PepMtPr;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00TJ3_A129BarCod = new int[1] ;
      P00TJ3_A132BarCodReo = new byte[1] ;
      P00TJ3_A130BarCodPar = new String[] {""} ;
      P00TJ3_A396EmprCod = new String[] {""} ;
      P00TJ3_A2826BarNumLot = new int[1] ;
      P00TJ3_A3746BarNPed = new String[] {""} ;
      P00TJ3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00TJ3_n184BarMtr = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A3746BarNPed = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV10BarNPed = "" ;
      P00TJ5_A129BarCod = new int[1] ;
      P00TJ5_A132BarCodReo = new byte[1] ;
      P00TJ5_A130BarCodPar = new String[] {""} ;
      P00TJ5_A396EmprCod = new String[] {""} ;
      P00TJ5_A3746BarNPed = new String[] {""} ;
      P00TJ5_A2826BarNumLot = new int[1] ;
      P00TJ5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00TJ5_n184BarMtr = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppepmtpro__default(),
         new Object[] {
             new Object[] {
            P00TJ3_A129BarCod, P00TJ3_A132BarCodReo, P00TJ3_A130BarCodPar, P00TJ3_A396EmprCod, P00TJ3_A2826BarNumLot, P00TJ3_A3746BarNPed, P00TJ3_A184BarMtr, P00TJ3_n184BarMtr
            }
            , new Object[] {
            P00TJ5_A129BarCod, P00TJ5_A132BarCodReo, P00TJ5_A130BarCodPar, P00TJ5_A396EmprCod, P00TJ5_A3746BarNPed, P00TJ5_A2826BarNumLot, P00TJ5_A184BarMtr, P00TJ5_n184BarMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11AEUROP ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A2826BarNumLot ;
   private long AV8PePCod ;
   private java.math.BigDecimal AV9PepMtPr ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A3746BarNPed ;
   private String AV10BarNPed ;
   private boolean n184BarMtr ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private int[] P00TJ3_A129BarCod ;
   private byte[] P00TJ3_A132BarCodReo ;
   private String[] P00TJ3_A130BarCodPar ;
   private String[] P00TJ3_A396EmprCod ;
   private int[] P00TJ3_A2826BarNumLot ;
   private String[] P00TJ3_A3746BarNPed ;
   private java.math.BigDecimal[] P00TJ3_A184BarMtr ;
   private boolean[] P00TJ3_n184BarMtr ;
   private int[] P00TJ5_A129BarCod ;
   private byte[] P00TJ5_A132BarCodReo ;
   private String[] P00TJ5_A130BarCodPar ;
   private String[] P00TJ5_A396EmprCod ;
   private String[] P00TJ5_A3746BarNPed ;
   private int[] P00TJ5_A2826BarNumLot ;
   private java.math.BigDecimal[] P00TJ5_A184BarMtr ;
   private boolean[] P00TJ5_n184BarMtr ;
}

final  class ppepmtpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00TJ3", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.BarNumLot, T1.BarNPed, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.BarNumLot = ?) ORDER BY T1.EmprCod, T1.BarNPed ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00TJ5", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.BarNPed, T1.BarNumLot, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.BarNPed = ?) ORDER BY T1.EmprCod, T1.BarNumLot ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 20);
               return;
      }
   }

}

