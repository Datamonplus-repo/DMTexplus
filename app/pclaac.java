package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaac extends GXProcedure
{
   public pclaac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaac.class ), "" );
   }

   public pclaac( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             byte[] aP11 )
   {
      pclaac.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 ,
                        byte[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             byte[] aP11 ,
                             String[] aP12 )
   {
      pclaac.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaac.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclaac.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclaac.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclaac.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclaac.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclaac.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclaac.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclaac.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclaac.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclaac.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclaac.this.AV114Opi = aP11[0];
      this.aP11 = aP11;
      pclaac.this.AV115Barfactin = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV113F_Reccol = (byte)(0) ;
      GXv_int1[0] = AV113F_Reccol ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RECCOL", ""), GXv_int1) ;
      pclaac.this.AV113F_Reccol = GXv_int1[0] ;
      AV116Fase_nt = (byte)(0) ;
      /* Using cursor P01Q32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P01Q32_A2804RecLinMaq[0] ;
         A130BarCodPar = P01Q32_A130BarCodPar[0] ;
         A132BarCodReo = P01Q32_A132BarCodReo[0] ;
         A129BarCod = P01Q32_A129BarCod[0] ;
         A5408RecLinCol = P01Q32_A5408RecLinCol[0] ;
         AV116Fase_nt = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV23Accion = GXutil.substring( AV16Clave, 14, 1) ;
      AV82Ini_5 = GXutil.substring( AV16Clave, 3, 5) ;
      GXv_char2[0] = AV82Ini_5 ;
      GXv_char3[0] = AV85Inip_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char2, GXv_char3) ;
      pclaac.this.AV82Ini_5 = GXv_char2[0] ;
      pclaac.this.AV85Inip_5 = GXv_char3[0] ;
      AV84ColIni_5 = CommonUtil.decimalVal( AV85Inip_5, ".") ;
      AV83Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
      GXv_char3[0] = AV83Fin_5 ;
      GXv_char2[0] = AV92Finp_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char3, GXv_char2) ;
      pclaac.this.AV83Fin_5 = GXv_char3[0] ;
      pclaac.this.AV92Finp_5 = GXv_char2[0] ;
      AV86ColFin_5 = CommonUtil.decimalVal( AV92Finp_5, ".") ;
      AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
      AV36TotCol = DecimalUtil.doubleToDec(0) ;
      AV38Producto = GXutil.substring( AV22PrdDesc, 1, 6) ;
      if ( ( ( AV113F_Reccol == 1 ) && ( AV114Opi == 0 ) ) || ( ( AV113F_Reccol == 1 ) && ( AV116Fase_nt == 1 ) ) )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = AV18BarCod ;
         GXv_int1[0] = AV19BarCodReo ;
         GXv_char2[0] = AV20BarCodPar ;
         GXv_int5[0] = AV67BarLinMaq ;
         GXv_char6[0] = AV38Producto ;
         GXv_decimal7[0] = AV36TotCol ;
         GXv_int8[0] = AV50FlagCol ;
         new app.pclaesp5(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int1, GXv_char2, GXv_int5, GXv_char6, GXv_decimal7, GXv_int8) ;
         pclaac.this.A396EmprCod = GXv_char3[0] ;
         pclaac.this.AV18BarCod = GXv_int4[0] ;
         pclaac.this.AV19BarCodReo = GXv_int1[0] ;
         pclaac.this.AV20BarCodPar = GXv_char2[0] ;
         pclaac.this.AV67BarLinMaq = GXv_int5[0] ;
         pclaac.this.AV38Producto = GXv_char6[0] ;
         pclaac.this.AV36TotCol = GXv_decimal7[0] ;
         pclaac.this.AV50FlagCol = GXv_int8[0] ;
      }
      else
      {
         /* Using cursor P01Q33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P01Q33_A130BarCodPar[0] ;
            A132BarCodReo = P01Q33_A132BarCodReo[0] ;
            A129BarCod = P01Q33_A129BarCod[0] ;
            A252CliCod = P01Q33_A252CliCod[0] ;
            n252CliCod = P01Q33_n252CliCod[0] ;
            A212BarSer = P01Q33_A212BarSer[0] ;
            A135BarColNom = P01Q33_A135BarColNom[0] ;
            A136BarColNum = P01Q33_A136BarColNum[0] ;
            A218BarTipCol = P01Q33_A218BarTipCol[0] ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char3[0] = A212BarSer ;
            GXv_char2[0] = A135BarColNom ;
            GXv_int9[0] = A136BarColNum ;
            GXv_int8[0] = A218BarTipCol ;
            GXv_char10[0] = AV38Producto ;
            GXv_decimal7[0] = AV36TotCol ;
            GXv_int1[0] = AV50FlagCol ;
            new app.pclaesp2(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_char3, GXv_char2, GXv_int9, GXv_int8, GXv_char10, GXv_decimal7, GXv_int1) ;
            pclaac.this.A396EmprCod = GXv_char6[0] ;
            pclaac.this.A252CliCod = GXv_int4[0] ;
            pclaac.this.A212BarSer = GXv_char3[0] ;
            pclaac.this.A135BarColNom = GXv_char2[0] ;
            pclaac.this.A136BarColNum = GXv_int9[0] ;
            pclaac.this.A218BarTipCol = GXv_int8[0] ;
            pclaac.this.AV38Producto = GXv_char10[0] ;
            pclaac.this.AV36TotCol = GXv_decimal7[0] ;
            pclaac.this.AV50FlagCol = GXv_int1[0] ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      AV77TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
      if ( ! (0==AV50FlagCol) )
      {
         if ( ( DecimalUtil.compareTo(AV77TotCol2, AV84ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV77TotCol2, AV86ColFin_5) <= 0 ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaac.this.A396EmprCod;
      this.aP1[0] = pclaac.this.AV15Descrip;
      this.aP2[0] = pclaac.this.AV16Clave;
      this.aP3[0] = pclaac.this.AV17PrdVal;
      this.aP4[0] = pclaac.this.AV18BarCod;
      this.aP5[0] = pclaac.this.AV19BarCodReo;
      this.aP6[0] = pclaac.this.AV20BarCodPar;
      this.aP7[0] = pclaac.this.AV21TotKil;
      this.aP8[0] = pclaac.this.AV22PrdDesc;
      this.aP9[0] = pclaac.this.AV23Accion;
      this.aP10[0] = pclaac.this.AV67BarLinMaq;
      this.aP11[0] = pclaac.this.AV114Opi;
      this.aP12[0] = pclaac.this.AV115Barfactin;
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
      P01Q32_A396EmprCod = new String[] {""} ;
      P01Q32_A2804RecLinMaq = new short[1] ;
      P01Q32_A130BarCodPar = new String[] {""} ;
      P01Q32_A132BarCodReo = new byte[1] ;
      P01Q32_A129BarCod = new int[1] ;
      P01Q32_A5408RecLinCol = new short[1] ;
      A130BarCodPar = "" ;
      AV82Ini_5 = "" ;
      AV85Inip_5 = "" ;
      AV84ColIni_5 = DecimalUtil.ZERO ;
      AV83Fin_5 = "" ;
      AV92Finp_5 = "" ;
      AV86ColFin_5 = DecimalUtil.ZERO ;
      AV36TotCol = DecimalUtil.ZERO ;
      AV38Producto = "" ;
      GXv_int5 = new short[1] ;
      P01Q33_A396EmprCod = new String[] {""} ;
      P01Q33_A130BarCodPar = new String[] {""} ;
      P01Q33_A132BarCodReo = new byte[1] ;
      P01Q33_A129BarCod = new int[1] ;
      P01Q33_A252CliCod = new int[1] ;
      P01Q33_n252CliCod = new boolean[] {false} ;
      P01Q33_A212BarSer = new String[] {""} ;
      P01Q33_A135BarColNom = new String[] {""} ;
      P01Q33_A136BarColNum = new int[1] ;
      P01Q33_A218BarTipCol = new byte[1] ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      GXv_char6 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char10 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int1 = new byte[1] ;
      AV77TotCol2 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaac__default(),
         new Object[] {
             new Object[] {
            P01Q32_A396EmprCod, P01Q32_A2804RecLinMaq, P01Q32_A130BarCodPar, P01Q32_A132BarCodReo, P01Q32_A129BarCod, P01Q32_A5408RecLinCol
            }
            , new Object[] {
            P01Q33_A396EmprCod, P01Q33_A130BarCodPar, P01Q33_A132BarCodReo, P01Q33_A129BarCod, P01Q33_A252CliCod, P01Q33_n252CliCod, P01Q33_A212BarSer, P01Q33_A135BarColNom, P01Q33_A136BarColNum, P01Q33_A218BarTipCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV114Opi ;
   private byte AV113F_Reccol ;
   private byte AV116Fase_nt ;
   private byte A132BarCodReo ;
   private byte AV35Familia ;
   private byte AV50FlagCol ;
   private byte A218BarTipCol ;
   private byte GXv_int8[] ;
   private byte GXv_int1[] ;
   private short AV67BarLinMaq ;
   private short A2804RecLinMaq ;
   private short A5408RecLinCol ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int GXv_int4[] ;
   private int GXv_int9[] ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal AV84ColIni_5 ;
   private java.math.BigDecimal AV86ColFin_5 ;
   private java.math.BigDecimal AV36TotCol ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV77TotCol2 ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV115Barfactin ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV82Ini_5 ;
   private String AV85Inip_5 ;
   private String AV83Fin_5 ;
   private String AV92Finp_5 ;
   private String AV38Producto ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String GXv_char6[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char10[] ;
   private boolean n252CliCod ;
   private String[] aP12 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private short[] aP10 ;
   private byte[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P01Q32_A396EmprCod ;
   private short[] P01Q32_A2804RecLinMaq ;
   private String[] P01Q32_A130BarCodPar ;
   private byte[] P01Q32_A132BarCodReo ;
   private int[] P01Q32_A129BarCod ;
   private short[] P01Q32_A5408RecLinCol ;
   private String[] P01Q33_A396EmprCod ;
   private String[] P01Q33_A130BarCodPar ;
   private byte[] P01Q33_A132BarCodReo ;
   private int[] P01Q33_A129BarCod ;
   private int[] P01Q33_A252CliCod ;
   private boolean[] P01Q33_n252CliCod ;
   private String[] P01Q33_A212BarSer ;
   private String[] P01Q33_A135BarColNom ;
   private int[] P01Q33_A136BarColNum ;
   private byte[] P01Q33_A218BarTipCol ;
}

final  class pclaac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01Q32", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01Q33", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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

