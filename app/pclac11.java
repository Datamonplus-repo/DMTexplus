package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclac11 extends GXProcedure
{
   public pclac11( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclac11.class ), "" );
   }

   public pclac11( int remoteHandle ,
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
      pclac11.this.aP12 = new String[] {""};
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
      pclac11.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclac11.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclac11.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclac11.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclac11.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclac11.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclac11.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclac11.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclac11.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclac11.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclac11.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclac11.this.AV114Opi = aP11[0];
      this.aP11 = aP11;
      pclac11.this.AV115barfactin = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV111F_Reccol = (byte)(0) ;
      GXv_int1[0] = AV111F_Reccol ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RECCOL", ""), GXv_int1) ;
      pclac11.this.AV111F_Reccol = GXv_int1[0] ;
      AV116Fase_nt = (byte)(0) ;
      /* Using cursor P01TP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P01TP2_A2804RecLinMaq[0] ;
         A130BarCodPar = P01TP2_A130BarCodPar[0] ;
         A132BarCodReo = P01TP2_A132BarCodReo[0] ;
         A129BarCod = P01TP2_A129BarCod[0] ;
         A5408RecLinCol = P01TP2_A5408RecLinCol[0] ;
         AV116Fase_nt = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV23Accion = GXutil.substring( AV16Clave, 22, 1) ;
      AV80Ini_5 = GXutil.substring( AV16Clave, 5, 5) ;
      GXv_char2[0] = AV80Ini_5 ;
      GXv_char3[0] = AV83Inip_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char2, GXv_char3) ;
      pclac11.this.AV80Ini_5 = GXv_char2[0] ;
      pclac11.this.AV83Inip_5 = GXv_char3[0] ;
      AV82ColIni_5 = CommonUtil.decimalVal( AV83Inip_5, ".") ;
      AV81Fin_5 = GXutil.substring( AV16Clave, 11, 5) ;
      GXv_char3[0] = AV81Fin_5 ;
      GXv_char2[0] = AV90Finp_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char3, GXv_char2) ;
      pclac11.this.AV81Fin_5 = GXv_char3[0] ;
      pclac11.this.AV90Finp_5 = GXv_char2[0] ;
      AV84ColFin_5 = CommonUtil.decimalVal( AV90Finp_5, ".") ;
      AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 23, 2))) ;
      AV52CliCod = (int)(GXutil.lval( GXutil.substring( AV16Clave, 17, 6))) ;
      AV36TotCol = DecimalUtil.doubleToDec(0) ;
      AV118MaqCod = GXutil.rtrim( GXutil.substring( AV16Clave, 25, 6)) ;
      AV119Colorteca = GXutil.substring( AV16Clave, 4, 1) ;
      if ( ( ( GXutil.strcmp(AV119Colorteca, httpContext.getMessage( "S", "")) != 0 ) ) && ( ( ( AV111F_Reccol == 1 ) && ( AV114Opi == 0 ) ) || ( ( AV111F_Reccol == 1 ) && ( AV116Fase_nt == 1 ) ) ) )
      {
         /* Using cursor P01TP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P01TP3_A130BarCodPar[0] ;
            A132BarCodReo = P01TP3_A132BarCodReo[0] ;
            A129BarCod = P01TP3_A129BarCod[0] ;
            A252CliCod = P01TP3_A252CliCod[0] ;
            n252CliCod = P01TP3_n252CliCod[0] ;
            AV113CliCod_i = A252CliCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = AV18BarCod ;
         GXv_int1[0] = AV19BarCodReo ;
         GXv_char2[0] = AV20BarCodPar ;
         GXv_int5[0] = AV67BarLinMaq ;
         GXv_int6[0] = AV35Familia ;
         GXv_decimal7[0] = AV36TotCol ;
         GXv_int8[0] = AV50FlagCol ;
         new app.pclaesp4(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int1, GXv_char2, GXv_int5, GXv_int6, GXv_decimal7, GXv_int8) ;
         pclac11.this.A396EmprCod = GXv_char3[0] ;
         pclac11.this.AV18BarCod = GXv_int4[0] ;
         pclac11.this.AV19BarCodReo = GXv_int1[0] ;
         pclac11.this.AV20BarCodPar = GXv_char2[0] ;
         pclac11.this.AV67BarLinMaq = GXv_int5[0] ;
         pclac11.this.AV35Familia = GXv_int6[0] ;
         pclac11.this.AV36TotCol = GXv_decimal7[0] ;
         pclac11.this.AV50FlagCol = GXv_int8[0] ;
      }
      else
      {
         /* Using cursor P01TP4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A130BarCodPar = P01TP4_A130BarCodPar[0] ;
            A132BarCodReo = P01TP4_A132BarCodReo[0] ;
            A129BarCod = P01TP4_A129BarCod[0] ;
            A252CliCod = P01TP4_A252CliCod[0] ;
            n252CliCod = P01TP4_n252CliCod[0] ;
            A212BarSer = P01TP4_A212BarSer[0] ;
            A135BarColNom = P01TP4_A135BarColNom[0] ;
            A136BarColNum = P01TP4_A136BarColNum[0] ;
            A218BarTipCol = P01TP4_A218BarTipCol[0] ;
            AV113CliCod_i = A252CliCod ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char2[0] = A212BarSer ;
            GXv_char9[0] = A135BarColNom ;
            GXv_int10[0] = A136BarColNum ;
            GXv_int8[0] = A218BarTipCol ;
            GXv_int6[0] = AV35Familia ;
            GXv_decimal7[0] = AV36TotCol ;
            GXv_int1[0] = AV50FlagCol ;
            new app.pclaesp3(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char2, GXv_char9, GXv_int10, GXv_int8, GXv_int6, GXv_decimal7, GXv_int1) ;
            pclac11.this.A396EmprCod = GXv_char3[0] ;
            pclac11.this.A252CliCod = GXv_int4[0] ;
            pclac11.this.A212BarSer = GXv_char2[0] ;
            pclac11.this.A135BarColNom = GXv_char9[0] ;
            pclac11.this.A136BarColNum = GXv_int10[0] ;
            pclac11.this.A218BarTipCol = GXv_int8[0] ;
            pclac11.this.AV35Familia = GXv_int6[0] ;
            pclac11.this.AV36TotCol = GXv_decimal7[0] ;
            pclac11.this.AV50FlagCol = GXv_int1[0] ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      AV117FMaq = (byte)(0) ;
      if ( (GXutil.strcmp("", AV118MaqCod)==0) )
      {
         AV117FMaq = (byte)(1) ;
      }
      else
      {
         /* Using cursor P01TP5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A2804RecLinMaq = P01TP5_A2804RecLinMaq[0] ;
            A130BarCodPar = P01TP5_A130BarCodPar[0] ;
            A132BarCodReo = P01TP5_A132BarCodReo[0] ;
            A129BarCod = P01TP5_A129BarCod[0] ;
            A602MaqCod = P01TP5_A602MaqCod[0] ;
            if ( GXutil.like( A602MaqCod , GXutil.padr( AV118MaqCod , 6 , "%"),  ' ' ) )
            {
               AV117FMaq = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      AV75TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
      if ( ! (0==AV50FlagCol) )
      {
         if ( ( DecimalUtil.compareTo(AV75TotCol2, AV82ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV75TotCol2, AV84ColFin_5) <= 0 ) && ( AV52CliCod == AV113CliCod_i ) && ( AV117FMaq == 1 ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclac11.this.A396EmprCod;
      this.aP1[0] = pclac11.this.AV15Descrip;
      this.aP2[0] = pclac11.this.AV16Clave;
      this.aP3[0] = pclac11.this.AV17PrdVal;
      this.aP4[0] = pclac11.this.AV18BarCod;
      this.aP5[0] = pclac11.this.AV19BarCodReo;
      this.aP6[0] = pclac11.this.AV20BarCodPar;
      this.aP7[0] = pclac11.this.AV21TotKil;
      this.aP8[0] = pclac11.this.AV22PrdDesc;
      this.aP9[0] = pclac11.this.AV23Accion;
      this.aP10[0] = pclac11.this.AV67BarLinMaq;
      this.aP11[0] = pclac11.this.AV114Opi;
      this.aP12[0] = pclac11.this.AV115barfactin;
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
      P01TP2_A396EmprCod = new String[] {""} ;
      P01TP2_A2804RecLinMaq = new short[1] ;
      P01TP2_A130BarCodPar = new String[] {""} ;
      P01TP2_A132BarCodReo = new byte[1] ;
      P01TP2_A129BarCod = new int[1] ;
      P01TP2_A5408RecLinCol = new short[1] ;
      A130BarCodPar = "" ;
      AV80Ini_5 = "" ;
      AV83Inip_5 = "" ;
      AV82ColIni_5 = DecimalUtil.ZERO ;
      AV81Fin_5 = "" ;
      AV90Finp_5 = "" ;
      AV84ColFin_5 = DecimalUtil.ZERO ;
      AV36TotCol = DecimalUtil.ZERO ;
      AV118MaqCod = "" ;
      AV119Colorteca = "" ;
      P01TP3_A396EmprCod = new String[] {""} ;
      P01TP3_A130BarCodPar = new String[] {""} ;
      P01TP3_A132BarCodReo = new byte[1] ;
      P01TP3_A129BarCod = new int[1] ;
      P01TP3_A252CliCod = new int[1] ;
      P01TP3_n252CliCod = new boolean[] {false} ;
      GXv_int5 = new short[1] ;
      P01TP4_A396EmprCod = new String[] {""} ;
      P01TP4_A130BarCodPar = new String[] {""} ;
      P01TP4_A132BarCodReo = new byte[1] ;
      P01TP4_A129BarCod = new int[1] ;
      P01TP4_A252CliCod = new int[1] ;
      P01TP4_n252CliCod = new boolean[] {false} ;
      P01TP4_A212BarSer = new String[] {""} ;
      P01TP4_A135BarColNom = new String[] {""} ;
      P01TP4_A136BarColNum = new int[1] ;
      P01TP4_A218BarTipCol = new byte[1] ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int1 = new byte[1] ;
      P01TP5_A396EmprCod = new String[] {""} ;
      P01TP5_A2804RecLinMaq = new short[1] ;
      P01TP5_A130BarCodPar = new String[] {""} ;
      P01TP5_A132BarCodReo = new byte[1] ;
      P01TP5_A129BarCod = new int[1] ;
      P01TP5_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      AV75TotCol2 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclac11__default(),
         new Object[] {
             new Object[] {
            P01TP2_A396EmprCod, P01TP2_A2804RecLinMaq, P01TP2_A130BarCodPar, P01TP2_A132BarCodReo, P01TP2_A129BarCod, P01TP2_A5408RecLinCol
            }
            , new Object[] {
            P01TP3_A396EmprCod, P01TP3_A130BarCodPar, P01TP3_A132BarCodReo, P01TP3_A129BarCod, P01TP3_A252CliCod, P01TP3_n252CliCod
            }
            , new Object[] {
            P01TP4_A396EmprCod, P01TP4_A130BarCodPar, P01TP4_A132BarCodReo, P01TP4_A129BarCod, P01TP4_A252CliCod, P01TP4_n252CliCod, P01TP4_A212BarSer, P01TP4_A135BarColNom, P01TP4_A136BarColNum, P01TP4_A218BarTipCol
            }
            , new Object[] {
            P01TP5_A396EmprCod, P01TP5_A2804RecLinMaq, P01TP5_A130BarCodPar, P01TP5_A132BarCodReo, P01TP5_A129BarCod, P01TP5_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV114Opi ;
   private byte AV111F_Reccol ;
   private byte AV116Fase_nt ;
   private byte A132BarCodReo ;
   private byte AV35Familia ;
   private byte AV50FlagCol ;
   private byte A218BarTipCol ;
   private byte GXv_int8[] ;
   private byte GXv_int6[] ;
   private byte GXv_int1[] ;
   private byte AV117FMaq ;
   private short AV67BarLinMaq ;
   private short A2804RecLinMaq ;
   private short A5408RecLinCol ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private int AV52CliCod ;
   private int A252CliCod ;
   private int AV113CliCod_i ;
   private int A136BarColNum ;
   private int GXv_int4[] ;
   private int GXv_int10[] ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal AV82ColIni_5 ;
   private java.math.BigDecimal AV84ColFin_5 ;
   private java.math.BigDecimal AV36TotCol ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV75TotCol2 ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV115barfactin ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV80Ini_5 ;
   private String AV83Inip_5 ;
   private String AV81Fin_5 ;
   private String AV90Finp_5 ;
   private String AV118MaqCod ;
   private String AV119Colorteca ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String A602MaqCod ;
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
   private String[] P01TP2_A396EmprCod ;
   private short[] P01TP2_A2804RecLinMaq ;
   private String[] P01TP2_A130BarCodPar ;
   private byte[] P01TP2_A132BarCodReo ;
   private int[] P01TP2_A129BarCod ;
   private short[] P01TP2_A5408RecLinCol ;
   private String[] P01TP3_A396EmprCod ;
   private String[] P01TP3_A130BarCodPar ;
   private byte[] P01TP3_A132BarCodReo ;
   private int[] P01TP3_A129BarCod ;
   private int[] P01TP3_A252CliCod ;
   private boolean[] P01TP3_n252CliCod ;
   private String[] P01TP4_A396EmprCod ;
   private String[] P01TP4_A130BarCodPar ;
   private byte[] P01TP4_A132BarCodReo ;
   private int[] P01TP4_A129BarCod ;
   private int[] P01TP4_A252CliCod ;
   private boolean[] P01TP4_n252CliCod ;
   private String[] P01TP4_A212BarSer ;
   private String[] P01TP4_A135BarColNom ;
   private int[] P01TP4_A136BarColNum ;
   private byte[] P01TP4_A218BarTipCol ;
   private String[] P01TP5_A396EmprCod ;
   private short[] P01TP5_A2804RecLinMaq ;
   private String[] P01TP5_A130BarCodPar ;
   private byte[] P01TP5_A132BarCodReo ;
   private int[] P01TP5_A129BarCod ;
   private String[] P01TP5_A602MaqCod ;
}

final  class pclac11__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01TP2", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01TP3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01TP4", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01TP5", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 2 :
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
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

