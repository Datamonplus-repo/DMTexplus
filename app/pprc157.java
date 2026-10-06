package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc157 extends GXProcedure
{
   public pprc157( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc157.class ), "" );
   }

   public pprc157( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           java.math.BigDecimal[] aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 )
   {
      pprc157.this.aP8 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 )
   {
      pprc157.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc157.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pprc157.this.AV8Existencias = aP2[0];
      this.aP2 = aP2;
      pprc157.this.AV9Reservas = aP3[0];
      this.aP3 = aP3;
      pprc157.this.AV10Pendiente = aP4[0];
      this.aP4 = aP4;
      pprc157.this.AV11compras = aP5[0];
      this.aP5 = aP5;
      pprc157.this.AV12Consumos = aP6[0];
      this.aP6 = aP6;
      pprc157.this.AV14ValorExistencias = aP7[0];
      this.aP7 = aP7;
      pprc157.this.AV15PrdAltFac = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Existencias = DecimalUtil.doubleToDec(0) ;
      AV9Reservas = DecimalUtil.doubleToDec(0) ;
      AV10Pendiente = DecimalUtil.doubleToDec(0) ;
      AV11compras = DecimalUtil.doubleToDec(0) ;
      AV12Consumos = DecimalUtil.doubleToDec(0) ;
      AV14ValorExistencias = DecimalUtil.doubleToDec(0) ;
      AV15PrdAltFac = ((AV15PrdAltFac.doubleValue()==0) ? DecimalUtil.doubleToDec(1) : AV15PrdAltFac) ;
      /* Using cursor P05O82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A704PrdExiAlm = P05O82_A704PrdExiAlm[0] ;
         A685PrdCanRes = P05O82_A685PrdCanRes[0] ;
         A684PrdCanPen = P05O82_A684PrdCanPen[0] ;
         A724PrdPreAct = P05O82_A724PrdPreAct[0] ;
         AV8Existencias = A704PrdExiAlm.multiply(AV15PrdAltFac) ;
         AV9Reservas = A685PrdCanRes.multiply(AV15PrdAltFac) ;
         AV10Pendiente = A684PrdCanPen.multiply(AV15PrdAltFac) ;
         AV14ValorExistencias = AV8Existencias.multiply(A724PrdPreAct) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P05O83 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A415EntFecEnt = P05O83_A415EntFecEnt[0] ;
         A418EntUniEnt = P05O83_A418EntUniEnt[0] ;
         A597LinEnt = P05O83_A597LinEnt[0] ;
         if ( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(GXutil.today( ))) )
         {
            AV11compras = AV11compras.add(A418EntUniEnt) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P05O84 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4492HreBarCod = P05O84_A4492HreBarCod[0] ;
         A4493HreBarReo = P05O84_A4493HreBarReo[0] ;
         A4494HreBarPar = P05O84_A4494HreBarPar[0] ;
         A4495HreNumCie = P05O84_A4495HreNumCie[0] ;
         A4529HreFecTin = P05O84_A4529HreFecTin[0] ;
         n4529HreFecTin = P05O84_n4529HreFecTin[0] ;
         A4563HrePrdCant = P05O84_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P05O84_n4563HrePrdCant[0] ;
         A4545HreLinMaq = P05O84_A4545HreLinMaq[0] ;
         A4550HreLinPro = P05O84_A4550HreLinPro[0] ;
         A4557HreRecLin = P05O84_A4557HreRecLin[0] ;
         A4529HreFecTin = P05O84_A4529HreFecTin[0] ;
         n4529HreFecTin = P05O84_n4529HreFecTin[0] ;
         if ( GXutil.dateCompare(GXutil.resetTime(A4529HreFecTin), GXutil.resetTime(GXutil.today( ))) )
         {
            AV12Consumos = AV12Consumos.add(A4563HrePrdCant) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc157.this.A396EmprCod;
      this.aP1[0] = pprc157.this.A719PrdNum;
      this.aP2[0] = pprc157.this.AV8Existencias;
      this.aP3[0] = pprc157.this.AV9Reservas;
      this.aP4[0] = pprc157.this.AV10Pendiente;
      this.aP5[0] = pprc157.this.AV11compras;
      this.aP6[0] = pprc157.this.AV12Consumos;
      this.aP7[0] = pprc157.this.AV14ValorExistencias;
      this.aP8[0] = pprc157.this.AV15PrdAltFac;
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
      P05O82_A396EmprCod = new String[] {""} ;
      P05O82_A719PrdNum = new String[] {""} ;
      P05O82_n719PrdNum = new boolean[] {false} ;
      P05O82_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05O82_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05O82_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05O82_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      P05O83_A396EmprCod = new String[] {""} ;
      P05O83_A719PrdNum = new String[] {""} ;
      P05O83_n719PrdNum = new boolean[] {false} ;
      P05O83_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P05O83_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05O83_A597LinEnt = new short[1] ;
      A415EntFecEnt = GXutil.nullDate() ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      P05O84_A4492HreBarCod = new int[1] ;
      P05O84_A4493HreBarReo = new byte[1] ;
      P05O84_A4494HreBarPar = new String[] {""} ;
      P05O84_A4495HreNumCie = new byte[1] ;
      P05O84_A396EmprCod = new String[] {""} ;
      P05O84_A719PrdNum = new String[] {""} ;
      P05O84_n719PrdNum = new boolean[] {false} ;
      P05O84_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P05O84_n4529HreFecTin = new boolean[] {false} ;
      P05O84_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05O84_n4563HrePrdCant = new boolean[] {false} ;
      P05O84_A4545HreLinMaq = new short[1] ;
      P05O84_A4550HreLinPro = new byte[1] ;
      P05O84_A4557HreRecLin = new short[1] ;
      A4494HreBarPar = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc157__default(),
         new Object[] {
             new Object[] {
            P05O82_A396EmprCod, P05O82_A719PrdNum, P05O82_A704PrdExiAlm, P05O82_A685PrdCanRes, P05O82_A684PrdCanPen, P05O82_A724PrdPreAct
            }
            , new Object[] {
            P05O83_A396EmprCod, P05O83_A719PrdNum, P05O83_A415EntFecEnt, P05O83_A418EntUniEnt, P05O83_A597LinEnt
            }
            , new Object[] {
            P05O84_A4492HreBarCod, P05O84_A4493HreBarReo, P05O84_A4494HreBarPar, P05O84_A4495HreNumCie, P05O84_A396EmprCod, P05O84_A719PrdNum, P05O84_n719PrdNum, P05O84_A4529HreFecTin, P05O84_n4529HreFecTin, P05O84_A4563HrePrdCant,
            P05O84_n4563HrePrdCant, P05O84_A4545HreLinMaq, P05O84_A4550HreLinPro, P05O84_A4557HreRecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short A597LinEnt ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int A4492HreBarCod ;
   private java.math.BigDecimal AV8Existencias ;
   private java.math.BigDecimal AV9Reservas ;
   private java.math.BigDecimal AV10Pendiente ;
   private java.math.BigDecimal AV11compras ;
   private java.math.BigDecimal AV12Consumos ;
   private java.math.BigDecimal AV14ValorExistencias ;
   private java.math.BigDecimal AV15PrdAltFac ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String A4494HreBarPar ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date A4529HreFecTin ;
   private boolean n719PrdNum ;
   private boolean n4529HreFecTin ;
   private boolean n4563HrePrdCant ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P05O82_A396EmprCod ;
   private String[] P05O82_A719PrdNum ;
   private boolean[] P05O82_n719PrdNum ;
   private java.math.BigDecimal[] P05O82_A704PrdExiAlm ;
   private java.math.BigDecimal[] P05O82_A685PrdCanRes ;
   private java.math.BigDecimal[] P05O82_A684PrdCanPen ;
   private java.math.BigDecimal[] P05O82_A724PrdPreAct ;
   private String[] P05O83_A396EmprCod ;
   private String[] P05O83_A719PrdNum ;
   private boolean[] P05O83_n719PrdNum ;
   private java.util.Date[] P05O83_A415EntFecEnt ;
   private java.math.BigDecimal[] P05O83_A418EntUniEnt ;
   private short[] P05O83_A597LinEnt ;
   private int[] P05O84_A4492HreBarCod ;
   private byte[] P05O84_A4493HreBarReo ;
   private String[] P05O84_A4494HreBarPar ;
   private byte[] P05O84_A4495HreNumCie ;
   private String[] P05O84_A396EmprCod ;
   private String[] P05O84_A719PrdNum ;
   private boolean[] P05O84_n719PrdNum ;
   private java.util.Date[] P05O84_A4529HreFecTin ;
   private boolean[] P05O84_n4529HreFecTin ;
   private java.math.BigDecimal[] P05O84_A4563HrePrdCant ;
   private boolean[] P05O84_n4563HrePrdCant ;
   private short[] P05O84_A4545HreLinMaq ;
   private byte[] P05O84_A4550HreLinPro ;
   private short[] P05O84_A4557HreRecLin ;
}

final  class pprc157__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05O82", "SELECT EmprCod, PrdNum, PrdExiAlm, PrdCanRes, PrdCanPen, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05O83", "SELECT EmprCod, PrdNum, EntFecEnt, EntUniEnt, LinEnt FROM TXPENTALM WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, EntFecEnt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05O84", "SELECT T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.EmprCod, T1.PrdNum, T2.HreFecTin, T1.HrePrdCant, T1.HreLinMaq, T1.HreLinPro, T1.HreRecLin FROM (TXPHISLRE T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum, T2.HreFecTin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((short[]) buf[13])[0] = rslt.getShort(11);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
   }

}

