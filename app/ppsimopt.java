package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppsimopt extends GXProcedure
{
   public ppsimopt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppsimopt.class ), "" );
   }

   public ppsimopt( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           int[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.util.Date[] aP6 )
   {
      ppsimopt.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.util.Date[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.util.Date[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      ppsimopt.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppsimopt.this.AV45Barcod = aP1[0];
      this.aP1 = aP1;
      ppsimopt.this.AV46barcodreo = aP2[0];
      this.aP2 = aP2;
      ppsimopt.this.AV47Barcodpar = aP3[0];
      this.aP3 = aP3;
      ppsimopt.this.AV48barpie = aP4[0];
      this.aP4 = aP4;
      ppsimopt.this.AV49Tipartprod = aP5[0];
      this.aP5 = aP5;
      ppsimopt.this.AV52Barfecclip = aP6[0];
      this.aP6 = aP6;
      ppsimopt.this.AV53Sum_dias = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV77Jordada ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "JORNAD", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      ppsimopt.this.A396EmprCod = GXv_char2[0] ;
      ppsimopt.this.GXt_int1 = GXv_int4[0] ;
      AV77Jordada = (short)(GXt_int1) ;
      AV63BarFeccli = AV52Barfecclip ;
      AV54Maqcod = httpContext.getMessage( "LT", "") ;
      /* Execute user subroutine: 'MAQUIN' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV60Dias = AV49Tipartprod ;
      AV78Resto = DecimalUtil.doubleToDec(0) ;
      /* Execute user subroutine: 'CFECHA' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV61resto_p = AV78Resto ;
      AV53Sum_dias = AV53Sum_dias.add(AV60Dias) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      /* Using cursor P02Z22 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV54Maqcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P02Z22_A602MaqCod[0] ;
         A615MaqMinPro = P02Z22_A615MaqMinPro[0] ;
         n615MaqMinPro = P02Z22_n615MaqMinPro[0] ;
         A612MaqHorPro = P02Z22_A612MaqHorPro[0] ;
         n612MaqHorPro = P02Z22_n612MaqHorPro[0] ;
         AV55HorasProd = GXutil.concat( GXutil.str( A612MaqHorPro, 2, 0), GXutil.str( A615MaqMinPro, 2, 0), ".") ;
         AV56Horpro = CommonUtil.decimalVal( AV55HorasProd, ".") ;
         if ( AV56Horpro.doubleValue() == 0 )
         {
            AV56Horpro = DecimalUtil.stringToDec("24.00") ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S121( )
   {
      /* 'CFECHA' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CALENDARIO' */
      S131 ();
      if (returnInSub) return;
      AV64Dias_d = AV60Dias.add(AV78Resto) ;
      AV65Dias_e = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV64Dias_d))) ;
      if ( AV66Flag == 0 )
      {
         AV62Fecteo = GXutil.dadd(AV63BarFeccli,+(AV65Dias_e.intValue())) ;
         AV78Resto = AV64Dias_d.subtract(AV65Dias_e) ;
         AV63BarFeccli = AV62Fecteo ;
      }
      else
      {
         while ( AV64Dias_d.doubleValue() >= 1 )
         {
            AV68Dia = (byte)(AV68Dia+1) ;
            AV63BarFeccli = GXutil.dadd(AV63BarFeccli,+(1)) ;
            if ( AV67mes != GXutil.month( AV63BarFeccli) )
            {
               /* Execute user subroutine: 'CALENDARIO' */
               S131 ();
               if (returnInSub) return;
            }
            AV80Ndia = (byte)(AV68Dia*2) ;
            AV74Horas = (byte)(GXutil.lval( GXutil.substring( AV71HornPro, AV80Ndia, 2))) ;
            AV70Tot = DecimalUtil.doubleToDec(AV74Horas).divide(AV56Horpro, 18, java.math.RoundingMode.DOWN) ;
            if ( AV70Tot.doubleValue() > 1 )
            {
               AV70Tot = DecimalUtil.doubleToDec(1) ;
            }
            AV64Dias_d = AV64Dias_d.subtract((DecimalUtil.doubleToDec(1).subtract(AV70Tot))) ;
         }
         /* Execute user subroutine: 'FESTIVOS' */
         S141 ();
         if (returnInSub) return;
         AV63BarFeccli = AV72FPDf ;
         AV62Fecteo = AV63BarFeccli ;
         AV78Resto = AV64Dias_d ;
         AV63BarFeccli = AV62Fecteo ;
      }
   }

   public void S131( )
   {
      /* 'CALENDARIO' Routine */
      returnInSub = false ;
      AV69Anyo = (short)(GXutil.year( AV63BarFeccli)) ;
      AV67mes = (byte)(GXutil.month( AV63BarFeccli)) ;
      AV68Dia = (byte)(GXutil.day( AV63BarFeccli)) ;
      AV66Flag = (byte)(0) ;
      /* Using cursor P02Z23 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV54Maqcod, Short.valueOf(AV69Anyo), Byte.valueOf(AV67mes)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A614MaqMes = P02Z23_A614MaqMes[0] ;
         A599MaqAny = P02Z23_A599MaqAny[0] ;
         A602MaqCod = P02Z23_A602MaqCod[0] ;
         A610MaqHNPMes = P02Z23_A610MaqHNPMes[0] ;
         n610MaqHNPMes = P02Z23_n610MaqHNPMes[0] ;
         AV66Flag = (byte)(1) ;
         AV71HornPro = A610MaqHNPMes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'FESTIVOS' Routine */
      returnInSub = false ;
      AV72FPDf = AV63BarFeccli ;
      AV74Horas = (byte)(1) ;
      AV73FlagCal = (byte)(1) ;
      while ( ( AV74Horas != 0 ) && ( AV73FlagCal == 1 ) )
      {
         AV68Dia = (byte)(GXutil.day( AV72FPDf)) ;
         AV67mes = (byte)(GXutil.month( AV72FPDf)) ;
         AV69Anyo = (short)(GXutil.year( AV72FPDf)) ;
         AV73FlagCal = (byte)(0) ;
         AV74Horas = (byte)(0) ;
         /* Using cursor P02Z24 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV54Maqcod, Short.valueOf(AV69Anyo), Byte.valueOf(AV67mes)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A614MaqMes = P02Z24_A614MaqMes[0] ;
            A599MaqAny = P02Z24_A599MaqAny[0] ;
            A602MaqCod = P02Z24_A602MaqCod[0] ;
            A610MaqHNPMes = P02Z24_A610MaqHNPMes[0] ;
            n610MaqHNPMes = P02Z24_n610MaqHNPMes[0] ;
            AV73FlagCal = (byte)(1) ;
            AV75Inicio = (byte)((AV68Dia*2)) ;
            AV76HorCar = GXutil.substring( A610MaqHNPMes, AV75Inicio, 2) ;
            AV74Horas = (byte)(GXutil.lval( AV76HorCar)) ;
            if ( AV74Horas != 0 )
            {
               AV72FPDf = GXutil.dadd(AV72FPDf,+(1)) ;
            }
            if ( AV74Horas == 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppsimopt.this.A396EmprCod;
      this.aP1[0] = ppsimopt.this.AV45Barcod;
      this.aP2[0] = ppsimopt.this.AV46barcodreo;
      this.aP3[0] = ppsimopt.this.AV47Barcodpar;
      this.aP4[0] = ppsimopt.this.AV48barpie;
      this.aP5[0] = ppsimopt.this.AV49Tipartprod;
      this.aP6[0] = ppsimopt.this.AV52Barfecclip;
      this.aP7[0] = ppsimopt.this.AV53Sum_dias;
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
      AV63BarFeccli = GXutil.nullDate() ;
      AV54Maqcod = "" ;
      AV60Dias = DecimalUtil.ZERO ;
      AV78Resto = DecimalUtil.ZERO ;
      AV61resto_p = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02Z22_A396EmprCod = new String[] {""} ;
      P02Z22_A602MaqCod = new String[] {""} ;
      P02Z22_A615MaqMinPro = new byte[1] ;
      P02Z22_n615MaqMinPro = new boolean[] {false} ;
      P02Z22_A612MaqHorPro = new byte[1] ;
      P02Z22_n612MaqHorPro = new boolean[] {false} ;
      A602MaqCod = "" ;
      AV55HorasProd = "" ;
      AV56Horpro = DecimalUtil.ZERO ;
      AV64Dias_d = DecimalUtil.ZERO ;
      AV65Dias_e = DecimalUtil.ZERO ;
      AV62Fecteo = GXutil.nullDate() ;
      AV71HornPro = "" ;
      AV70Tot = DecimalUtil.ZERO ;
      AV72FPDf = GXutil.nullDate() ;
      P02Z23_A396EmprCod = new String[] {""} ;
      P02Z23_A614MaqMes = new byte[1] ;
      P02Z23_A599MaqAny = new short[1] ;
      P02Z23_A602MaqCod = new String[] {""} ;
      P02Z23_A610MaqHNPMes = new String[] {""} ;
      P02Z23_n610MaqHNPMes = new boolean[] {false} ;
      A610MaqHNPMes = "" ;
      P02Z24_A396EmprCod = new String[] {""} ;
      P02Z24_A614MaqMes = new byte[1] ;
      P02Z24_A599MaqAny = new short[1] ;
      P02Z24_A602MaqCod = new String[] {""} ;
      P02Z24_A610MaqHNPMes = new String[] {""} ;
      P02Z24_n610MaqHNPMes = new boolean[] {false} ;
      AV76HorCar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppsimopt__default(),
         new Object[] {
             new Object[] {
            P02Z22_A396EmprCod, P02Z22_A602MaqCod, P02Z22_A615MaqMinPro, P02Z22_n615MaqMinPro, P02Z22_A612MaqHorPro, P02Z22_n612MaqHorPro
            }
            , new Object[] {
            P02Z23_A396EmprCod, P02Z23_A614MaqMes, P02Z23_A599MaqAny, P02Z23_A602MaqCod, P02Z23_A610MaqHNPMes, P02Z23_n610MaqHNPMes
            }
            , new Object[] {
            P02Z24_A396EmprCod, P02Z24_A614MaqMes, P02Z24_A599MaqAny, P02Z24_A602MaqCod, P02Z24_A610MaqHNPMes, P02Z24_n610MaqHNPMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV46barcodreo ;
   private byte A615MaqMinPro ;
   private byte A612MaqHorPro ;
   private byte AV66Flag ;
   private byte AV68Dia ;
   private byte AV67mes ;
   private byte AV80Ndia ;
   private byte AV74Horas ;
   private byte A614MaqMes ;
   private byte AV73FlagCal ;
   private byte AV75Inicio ;
   private short AV77Jordada ;
   private short AV69Anyo ;
   private short A599MaqAny ;
   private short Gx_err ;
   private int AV45Barcod ;
   private int AV48barpie ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV49Tipartprod ;
   private java.math.BigDecimal AV53Sum_dias ;
   private java.math.BigDecimal AV60Dias ;
   private java.math.BigDecimal AV78Resto ;
   private java.math.BigDecimal AV61resto_p ;
   private java.math.BigDecimal AV56Horpro ;
   private java.math.BigDecimal AV64Dias_d ;
   private java.math.BigDecimal AV65Dias_e ;
   private java.math.BigDecimal AV70Tot ;
   private String A396EmprCod ;
   private String AV47Barcodpar ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV54Maqcod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String AV55HorasProd ;
   private String AV76HorCar ;
   private java.util.Date AV52Barfecclip ;
   private java.util.Date AV63BarFeccli ;
   private java.util.Date AV62Fecteo ;
   private java.util.Date AV72FPDf ;
   private boolean returnInSub ;
   private boolean n615MaqMinPro ;
   private boolean n612MaqHorPro ;
   private boolean n610MaqHNPMes ;
   private String AV71HornPro ;
   private String A610MaqHNPMes ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.util.Date[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P02Z22_A396EmprCod ;
   private String[] P02Z22_A602MaqCod ;
   private byte[] P02Z22_A615MaqMinPro ;
   private boolean[] P02Z22_n615MaqMinPro ;
   private byte[] P02Z22_A612MaqHorPro ;
   private boolean[] P02Z22_n612MaqHorPro ;
   private String[] P02Z23_A396EmprCod ;
   private byte[] P02Z23_A614MaqMes ;
   private short[] P02Z23_A599MaqAny ;
   private String[] P02Z23_A602MaqCod ;
   private String[] P02Z23_A610MaqHNPMes ;
   private boolean[] P02Z23_n610MaqHNPMes ;
   private String[] P02Z24_A396EmprCod ;
   private byte[] P02Z24_A614MaqMes ;
   private short[] P02Z24_A599MaqAny ;
   private String[] P02Z24_A602MaqCod ;
   private String[] P02Z24_A610MaqHNPMes ;
   private boolean[] P02Z24_n610MaqHNPMes ;
}

final  class ppsimopt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02Z22", "SELECT EmprCod, MaqCod, MaqMinPro, MaqHorPro FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02Z23", "SELECT EmprCod, MaqMes, MaqAny, MaqCod, MaqHNPMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02Z24", "SELECT EmprCod, MaqMes, MaqAny, MaqCod, MaqHNPMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
            case 2 :
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

