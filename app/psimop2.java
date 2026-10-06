package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psimop2 extends GXProcedure
{
   public psimop2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psimop2.class ), "" );
   }

   public psimop2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           java.math.BigDecimal[] aP1 ,
                                           java.util.Date[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.util.Date[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           int[] aP8 ,
                                           java.math.BigDecimal[] aP9 )
   {
      psimop2.this.aP10 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        java.math.BigDecimal[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.util.Date[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             java.math.BigDecimal[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.util.Date[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 )
   {
      psimop2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psimop2.this.AV27TipArtProd = aP1[0];
      this.aP1 = aP1;
      psimop2.this.AV17BarFecCli = aP2[0];
      this.aP2 = aP2;
      psimop2.this.AV8MaqCod = aP3[0];
      this.aP3 = aP3;
      psimop2.this.AV12NUM_OPE = aP4[0];
      this.aP4 = aP4;
      psimop2.this.AV33FasTpp = aP5[0];
      this.aP5 = aP5;
      psimop2.this.AV23Fecteo = aP6[0];
      this.aP6 = aP6;
      psimop2.this.AV19Resto = aP7[0];
      this.aP7 = aP7;
      psimop2.this.AV13BarPie = aP8[0];
      this.aP8 = aP8;
      psimop2.this.AV25Min_r = aP9[0];
      this.aP9 = aP9;
      psimop2.this.AV20Dias = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV26Jordada ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "JORNAD", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      psimop2.this.A396EmprCod = GXv_char2[0] ;
      psimop2.this.GXt_int1 = GXv_int4[0] ;
      AV26Jordada = (short)(GXt_int1) ;
      /* Using cursor P02R82 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P02R82_A602MaqCod[0] ;
         A615MaqMinPro = P02R82_A615MaqMinPro[0] ;
         n615MaqMinPro = P02R82_n615MaqMinPro[0] ;
         A612MaqHorPro = P02R82_A612MaqHorPro[0] ;
         n612MaqHorPro = P02R82_n612MaqHorPro[0] ;
         AV10HorasProd = GXutil.concat( GXutil.str( A612MaqHorPro, 2, 0), GXutil.str( A615MaqMinPro, 2, 0), ".") ;
         AV9HorPro = CommonUtil.decimalVal( AV10HorasProd, ".") ;
         if ( AV9HorPro.doubleValue() == 0 )
         {
            AV9HorPro = DecimalUtil.stringToDec("24.00") ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV25Min_r = DecimalUtil.doubleToDec(0) ;
      if ( AV27TipArtProd.doubleValue() > 0 )
      {
         AV25Min_r = AV33FasTpp.multiply(DecimalUtil.doubleToDec(AV13BarPie)).divide((AV27TipArtProd), 18, java.math.RoundingMode.DOWN) ;
      }
      AV20Dias = DecimalUtil.doubleToDec(0) ;
      if ( (AV12NUM_OPE.multiply(DecimalUtil.doubleToDec(AV26Jordada))).doubleValue() > 0 )
      {
         AV20Dias = AV25Min_r.divide((AV12NUM_OPE.multiply(DecimalUtil.doubleToDec(AV26Jordada))), 18, java.math.RoundingMode.DOWN) ;
      }
      /* Execute user subroutine: 'CFECHA' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CFECHA' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CALENDARIO' */
      S121 ();
      if (returnInSub) return;
      AV21Dias_d = AV20Dias.add(AV19Resto) ;
      AV22Dias_e = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV21Dias_d))) ;
      if ( AV18Flag == 0 )
      {
         AV23Fecteo = GXutil.dadd(AV17BarFecCli,+(AV22Dias_e.intValue())) ;
         AV19Resto = AV21Dias_d.subtract(AV22Dias_e) ;
         AV17BarFecCli = AV23Fecteo ;
      }
      else
      {
         while ( AV20Dias.doubleValue() >= 1 )
         {
            AV16Dia = (byte)(AV16Dia+1) ;
            AV17BarFecCli = GXutil.dadd(AV17BarFecCli,+(1)) ;
            if ( AV15Mes != GXutil.month( AV17BarFecCli) )
            {
               /* Execute user subroutine: 'CALENDARIO' */
               S121 ();
               if (returnInSub) return;
            }
            AV24NDia = (byte)(AV16Dia*2) ;
            AV32Horas = (byte)(GXutil.lval( GXutil.substring( AV30HorNPro, AV24NDia, 2))) ;
            AV29Tot = DecimalUtil.doubleToDec(AV32Horas).divide(AV9HorPro, 18, java.math.RoundingMode.DOWN) ;
            if ( AV29Tot.doubleValue() > 1 )
            {
               AV29Tot = DecimalUtil.doubleToDec(1) ;
            }
            AV21Dias_d = AV21Dias_d.subtract((DecimalUtil.doubleToDec(1).subtract(AV29Tot))) ;
         }
         AV23Fecteo = AV17BarFecCli ;
         AV19Resto = AV21Dias_d ;
         AV17BarFecCli = AV23Fecteo ;
      }
   }

   public void S121( )
   {
      /* 'CALENDARIO' Routine */
      returnInSub = false ;
      AV14Anyo = (short)(GXutil.year( AV17BarFecCli)) ;
      if ( AV14Anyo >= 2000 )
      {
         AV14Anyo = (short)(AV14Anyo-2000) ;
      }
      else
      {
         AV14Anyo = (short)(AV14Anyo-1900) ;
      }
      AV15Mes = (byte)(GXutil.month( AV17BarFecCli)) ;
      AV16Dia = (byte)(GXutil.day( AV17BarFecCli)) ;
      AV18Flag = (byte)(0) ;
      /* Using cursor P02R83 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV8MaqCod, Short.valueOf(AV14Anyo), Byte.valueOf(AV15Mes)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A614MaqMes = P02R83_A614MaqMes[0] ;
         A599MaqAny = P02R83_A599MaqAny[0] ;
         A602MaqCod = P02R83_A602MaqCod[0] ;
         A610MaqHNPMes = P02R83_A610MaqHNPMes[0] ;
         n610MaqHNPMes = P02R83_n610MaqHNPMes[0] ;
         AV18Flag = (byte)(1) ;
         AV30HorNPro = A610MaqHNPMes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = psimop2.this.A396EmprCod;
      this.aP1[0] = psimop2.this.AV27TipArtProd;
      this.aP2[0] = psimop2.this.AV17BarFecCli;
      this.aP3[0] = psimop2.this.AV8MaqCod;
      this.aP4[0] = psimop2.this.AV12NUM_OPE;
      this.aP5[0] = psimop2.this.AV33FasTpp;
      this.aP6[0] = psimop2.this.AV23Fecteo;
      this.aP7[0] = psimop2.this.AV19Resto;
      this.aP8[0] = psimop2.this.AV13BarPie;
      this.aP9[0] = psimop2.this.AV25Min_r;
      this.aP10[0] = psimop2.this.AV20Dias;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      scmdbuf = "" ;
      P02R82_A396EmprCod = new String[] {""} ;
      P02R82_A602MaqCod = new String[] {""} ;
      P02R82_A615MaqMinPro = new byte[1] ;
      P02R82_n615MaqMinPro = new boolean[] {false} ;
      P02R82_A612MaqHorPro = new byte[1] ;
      P02R82_n612MaqHorPro = new boolean[] {false} ;
      A602MaqCod = "" ;
      AV10HorasProd = "" ;
      AV9HorPro = DecimalUtil.ZERO ;
      AV21Dias_d = DecimalUtil.ZERO ;
      AV22Dias_e = DecimalUtil.ZERO ;
      AV30HorNPro = "" ;
      AV29Tot = DecimalUtil.ZERO ;
      P02R83_A396EmprCod = new String[] {""} ;
      P02R83_A614MaqMes = new byte[1] ;
      P02R83_A599MaqAny = new short[1] ;
      P02R83_A602MaqCod = new String[] {""} ;
      P02R83_A610MaqHNPMes = new String[] {""} ;
      P02R83_n610MaqHNPMes = new boolean[] {false} ;
      A610MaqHNPMes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psimop2__default(),
         new Object[] {
             new Object[] {
            P02R82_A396EmprCod, P02R82_A602MaqCod, P02R82_A615MaqMinPro, P02R82_n615MaqMinPro, P02R82_A612MaqHorPro, P02R82_n612MaqHorPro
            }
            , new Object[] {
            P02R83_A396EmprCod, P02R83_A614MaqMes, P02R83_A599MaqAny, P02R83_A602MaqCod, P02R83_A610MaqHNPMes, P02R83_n610MaqHNPMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A615MaqMinPro ;
   private byte A612MaqHorPro ;
   private byte AV18Flag ;
   private byte AV16Dia ;
   private byte AV15Mes ;
   private byte AV24NDia ;
   private byte AV32Horas ;
   private byte A614MaqMes ;
   private short AV26Jordada ;
   private short AV14Anyo ;
   private short A599MaqAny ;
   private short Gx_err ;
   private int AV13BarPie ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV27TipArtProd ;
   private java.math.BigDecimal AV12NUM_OPE ;
   private java.math.BigDecimal AV33FasTpp ;
   private java.math.BigDecimal AV19Resto ;
   private java.math.BigDecimal AV25Min_r ;
   private java.math.BigDecimal AV20Dias ;
   private java.math.BigDecimal AV9HorPro ;
   private java.math.BigDecimal AV21Dias_d ;
   private java.math.BigDecimal AV22Dias_e ;
   private java.math.BigDecimal AV29Tot ;
   private String A396EmprCod ;
   private String AV8MaqCod ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String AV10HorasProd ;
   private java.util.Date AV17BarFecCli ;
   private java.util.Date AV23Fecteo ;
   private boolean n615MaqMinPro ;
   private boolean n612MaqHorPro ;
   private boolean returnInSub ;
   private boolean n610MaqHNPMes ;
   private String AV30HorNPro ;
   private String A610MaqHNPMes ;
   private java.math.BigDecimal[] aP10 ;
   private String[] aP0 ;
   private java.math.BigDecimal[] aP1 ;
   private java.util.Date[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.util.Date[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P02R82_A396EmprCod ;
   private String[] P02R82_A602MaqCod ;
   private byte[] P02R82_A615MaqMinPro ;
   private boolean[] P02R82_n615MaqMinPro ;
   private byte[] P02R82_A612MaqHorPro ;
   private boolean[] P02R82_n612MaqHorPro ;
   private String[] P02R83_A396EmprCod ;
   private byte[] P02R83_A614MaqMes ;
   private short[] P02R83_A599MaqAny ;
   private String[] P02R83_A602MaqCod ;
   private String[] P02R83_A610MaqHNPMes ;
   private boolean[] P02R83_n610MaqHNPMes ;
}

final  class psimop2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02R82", "SELECT EmprCod, MaqCod, MaqMinPro, MaqHorPro FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02R83", "SELECT EmprCod, MaqMes, MaqAny, MaqCod, MaqHNPMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

