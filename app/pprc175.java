package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc175 extends GXProcedure
{
   public pprc175( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc175.class ), "" );
   }

   public pprc175( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pprc175.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 )
   {
      pprc175.this.AV10EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc175.this.AV15Prdnum = aP1[0];
      this.aP1 = aP1;
      pprc175.this.AV16TotCant = aP2[0];
      this.aP2 = aP2;
      pprc175.this.AV17TotCantPesada = aP3[0];
      this.aP3 = aP3;
      pprc175.this.AV13Prdcanpen = aP4[0];
      this.aP4 = aP4;
      pprc175.this.AV11Obs = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16TotCant = DecimalUtil.doubleToDec(0) ;
      AV17TotCantPesada = DecimalUtil.doubleToDec(0) ;
      AV9cpedid = (byte)(0) ;
      AV11Obs = " " ;
      /* Using cursor P05PD2 */
      pr_default.execute(0, new Object[] {AV10EmprCod, AV15Prdnum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P05PD2_A719PrdNum[0] ;
         n719PrdNum = P05PD2_n719PrdNum[0] ;
         A396EmprCod = P05PD2_A396EmprCod[0] ;
         A686PrdCant = P05PD2_A686PrdCant[0] ;
         A707PrdFacCon = P05PD2_A707PrdFacCon[0] ;
         A4577RecPesFec = P05PD2_A4577RecPesFec[0] ;
         A129BarCod = P05PD2_A129BarCod[0] ;
         A132BarCodReo = P05PD2_A132BarCodReo[0] ;
         A130BarCodPar = P05PD2_A130BarCodPar[0] ;
         A2804RecLinMaq = P05PD2_A2804RecLinMaq[0] ;
         A1273RecLinPro = P05PD2_A1273RecLinPro[0] ;
         A811RecLin = P05PD2_A811RecLin[0] ;
         A707PrdFacCon = P05PD2_A707PrdFacCon[0] ;
         AV14Prdcant = A686PrdCant ;
         AV8Cant = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         AV16TotCant = AV16TotCant.add(AV8Cant) ;
         AV17TotCantPesada = AV17TotCantPesada.add(((!GXutil.dateCompare(GXutil.nullDate(), A4577RecPesFec) ? AV8Cant : DecimalUtil.doubleToDec(0)))) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV13Prdcanpen = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05PD3 */
      pr_default.execute(1, new Object[] {AV10EmprCod, AV15Prdnum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A719PrdNum = P05PD3_A719PrdNum[0] ;
         n719PrdNum = P05PD3_n719PrdNum[0] ;
         A396EmprCod = P05PD3_A396EmprCod[0] ;
         A658PedCod = P05PD3_A658PedCod[0] ;
         A657PedCanEnt = P05PD3_A657PedCanEnt[0] ;
         A669PedUni = P05PD3_A669PedUni[0] ;
         A659PedCum = P05PD3_A659PedCum[0] ;
         AV12Pedcod = A658PedCod ;
         /* Execute user subroutine: 'CPEDID' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV11Obs = ((AV9cpedid==0) ? httpContext.getMessage( "Linea Pedido SIN CPEDID", "") : "") ;
         if ( AV9cpedid == 1 )
         {
            AV13Prdcanpen = AV13Prdcanpen.add((((GXutil.strcmp(A659PedCum, httpContext.getMessage( "N", ""))==0) ? (A669PedUni.subtract(A657PedCanEnt)) : DecimalUtil.doubleToDec(0)))) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'CPEDID' Routine */
      returnInSub = false ;
      AV9cpedid = (byte)(0) ;
      /* Using cursor P05PD4 */
      pr_default.execute(2, new Object[] {AV10EmprCod, Integer.valueOf(AV12Pedcod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A658PedCod = P05PD4_A658PedCod[0] ;
         A396EmprCod = P05PD4_A396EmprCod[0] ;
         AV9cpedid = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc175.this.AV10EmprCod;
      this.aP1[0] = pprc175.this.AV15Prdnum;
      this.aP2[0] = pprc175.this.AV16TotCant;
      this.aP3[0] = pprc175.this.AV17TotCantPesada;
      this.aP4[0] = pprc175.this.AV13Prdcanpen;
      this.aP5[0] = pprc175.this.AV11Obs;
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
      P05PD2_A719PrdNum = new String[] {""} ;
      P05PD2_n719PrdNum = new boolean[] {false} ;
      P05PD2_A396EmprCod = new String[] {""} ;
      P05PD2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PD2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PD2_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05PD2_A129BarCod = new int[1] ;
      P05PD2_A132BarCodReo = new byte[1] ;
      P05PD2_A130BarCodPar = new String[] {""} ;
      P05PD2_A2804RecLinMaq = new short[1] ;
      P05PD2_A1273RecLinPro = new byte[1] ;
      P05PD2_A811RecLin = new short[1] ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A130BarCodPar = "" ;
      AV14Prdcant = DecimalUtil.ZERO ;
      AV8Cant = DecimalUtil.ZERO ;
      P05PD3_A719PrdNum = new String[] {""} ;
      P05PD3_n719PrdNum = new boolean[] {false} ;
      P05PD3_A396EmprCod = new String[] {""} ;
      P05PD3_A658PedCod = new int[1] ;
      P05PD3_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PD3_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05PD3_A659PedCum = new String[] {""} ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      A659PedCum = "" ;
      P05PD4_A658PedCod = new int[1] ;
      P05PD4_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc175__default(),
         new Object[] {
             new Object[] {
            P05PD2_A719PrdNum, P05PD2_n719PrdNum, P05PD2_A396EmprCod, P05PD2_A686PrdCant, P05PD2_A707PrdFacCon, P05PD2_A4577RecPesFec, P05PD2_A129BarCod, P05PD2_A132BarCodReo, P05PD2_A130BarCodPar, P05PD2_A2804RecLinMaq,
            P05PD2_A1273RecLinPro, P05PD2_A811RecLin
            }
            , new Object[] {
            P05PD3_A719PrdNum, P05PD3_A396EmprCod, P05PD3_A658PedCod, P05PD3_A657PedCanEnt, P05PD3_A669PedUni, P05PD3_A659PedCum
            }
            , new Object[] {
            P05PD4_A658PedCod, P05PD4_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9cpedid ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A658PedCod ;
   private int AV12Pedcod ;
   private java.math.BigDecimal AV16TotCant ;
   private java.math.BigDecimal AV17TotCantPesada ;
   private java.math.BigDecimal AV13Prdcanpen ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal AV14Prdcant ;
   private java.math.BigDecimal AV8Cant ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A669PedUni ;
   private String AV10EmprCod ;
   private String AV15Prdnum ;
   private String AV11Obs ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A659PedCum ;
   private java.util.Date A4577RecPesFec ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05PD2_A719PrdNum ;
   private boolean[] P05PD2_n719PrdNum ;
   private String[] P05PD2_A396EmprCod ;
   private java.math.BigDecimal[] P05PD2_A686PrdCant ;
   private java.math.BigDecimal[] P05PD2_A707PrdFacCon ;
   private java.util.Date[] P05PD2_A4577RecPesFec ;
   private int[] P05PD2_A129BarCod ;
   private byte[] P05PD2_A132BarCodReo ;
   private String[] P05PD2_A130BarCodPar ;
   private short[] P05PD2_A2804RecLinMaq ;
   private byte[] P05PD2_A1273RecLinPro ;
   private short[] P05PD2_A811RecLin ;
   private String[] P05PD3_A719PrdNum ;
   private boolean[] P05PD3_n719PrdNum ;
   private String[] P05PD3_A396EmprCod ;
   private int[] P05PD3_A658PedCod ;
   private java.math.BigDecimal[] P05PD3_A657PedCanEnt ;
   private java.math.BigDecimal[] P05PD3_A669PedUni ;
   private String[] P05PD3_A659PedCum ;
   private int[] P05PD4_A658PedCod ;
   private String[] P05PD4_A396EmprCod ;
}

final  class pprc175__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05PD2", "SELECT T1.PrdNum, T1.EmprCod, T1.PrdCant, T2.PrdFacCon, T1.RecPesFec, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05PD3", "SELECT PrdNum, EmprCod, PedCod, PedCanEnt, PedUni, PedCum FROM TXPLPEDID WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05PD4", "SELECT PedCod, EmprCod FROM TXPCPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

