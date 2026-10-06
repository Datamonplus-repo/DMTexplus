package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppkmtot extends GXProcedure
{
   public ppkmtot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppkmtot.class ), "" );
   }

   public ppkmtot( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           byte aP2 ,
                                           String aP3 )
   {
      ppkmtot.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      ppkmtot.this.A396EmprCod = aP0;
      ppkmtot.this.A129BarCod = aP1;
      ppkmtot.this.A132BarCodReo = aP2;
      ppkmtot.this.A130BarCodPar = aP3;
      ppkmtot.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TotK = DecimalUtil.doubleToDec(0) ;
      AV9TotM = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P03DZ3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A166BarKgm = P03DZ3_A166BarKgm[0] ;
         A184BarMtr = P03DZ3_A184BarMtr[0] ;
         A166BarKgm = P03DZ3_A166BarKgm[0] ;
         A184BarMtr = P03DZ3_A184BarMtr[0] ;
         AV8TotK = A166BarKgm ;
         AV9TotM = A184BarMtr ;
         /* Optimized group. */
         /* Using cursor P03DZ4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         c590KgmAgr = P03DZ4_A590KgmAgr[0] ;
         c869MtrAgr = P03DZ4_A869MtrAgr[0] ;
         pr_default.close(1);
         AV8TotK = AV8TotK.add(c590KgmAgr) ;
         AV9TotM = AV9TotM.add(c869MtrAgr) ;
         /* End optimized group. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = ppkmtot.this.AV8TotK;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8TotK = DecimalUtil.ZERO ;
      AV9TotM = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P03DZ3_A396EmprCod = new String[] {""} ;
      P03DZ3_A129BarCod = new int[1] ;
      P03DZ3_A132BarCodReo = new byte[1] ;
      P03DZ3_A130BarCodPar = new String[] {""} ;
      P03DZ3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03DZ3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      c590KgmAgr = DecimalUtil.ZERO ;
      c869MtrAgr = DecimalUtil.ZERO ;
      P03DZ4_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03DZ4_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.ppkmtot__default(),
         new Object[] {
             new Object[] {
            P03DZ3_A396EmprCod, P03DZ3_A129BarCod, P03DZ3_A132BarCodReo, P03DZ3_A130BarCodPar, P03DZ3_A166BarKgm, P03DZ3_A184BarMtr
            }
            , new Object[] {
            P03DZ4_A590KgmAgr, P03DZ4_A869MtrAgr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV8TotK ;
   private java.math.BigDecimal AV9TotM ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal c590KgmAgr ;
   private java.math.BigDecimal c869MtrAgr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P03DZ3_A396EmprCod ;
   private int[] P03DZ3_A129BarCod ;
   private byte[] P03DZ3_A132BarCodReo ;
   private String[] P03DZ3_A130BarCodPar ;
   private java.math.BigDecimal[] P03DZ3_A166BarKgm ;
   private java.math.BigDecimal[] P03DZ3_A184BarMtr ;
   private java.math.BigDecimal[] P03DZ4_A590KgmAgr ;
   private java.math.BigDecimal[] P03DZ4_A869MtrAgr ;
}

final  class ppkmtot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03DZ3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03DZ4", "SELECT SUM(KgmAgr), SUM(MtrAgr) FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

