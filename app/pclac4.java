package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclac4 extends GXProcedure
{
   public pclac4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclac4.class ), "" );
   }

   public pclac4( int remoteHandle ,
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
      pclac4.this.aP12 = new String[] {""};
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
      pclac4.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclac4.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclac4.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclac4.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclac4.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclac4.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclac4.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclac4.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclac4.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclac4.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclac4.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclac4.this.AV114Opi = aP11[0];
      this.aP11 = aP11;
      pclac4.this.AV115Barfactin = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV111F_reccol = (byte)(0) ;
      GXv_int1[0] = AV111F_reccol ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RECCOL", ""), GXv_int1) ;
      pclac4.this.AV111F_reccol = GXv_int1[0] ;
      AV23Accion = GXutil.substring( AV16Clave, 23, 1) ;
      AV31Matiz = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 3))) ;
      AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 8, 2))) ;
      AV80Ini_5 = GXutil.substring( AV16Clave, 11, 5) ;
      GXv_char2[0] = AV80Ini_5 ;
      GXv_char3[0] = AV83Inip_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char2, GXv_char3) ;
      pclac4.this.AV80Ini_5 = GXv_char2[0] ;
      pclac4.this.AV83Inip_5 = GXv_char3[0] ;
      AV82ColIni_5 = CommonUtil.decimalVal( AV83Inip_5, ".") ;
      AV81Fin_5 = GXutil.substring( AV16Clave, 17, 5) ;
      GXv_char3[0] = AV81Fin_5 ;
      GXv_char2[0] = AV90Finp_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char3, GXv_char2) ;
      pclac4.this.AV81Fin_5 = GXv_char3[0] ;
      pclac4.this.AV90Finp_5 = GXv_char2[0] ;
      AV84ColFin_5 = CommonUtil.decimalVal( AV90Finp_5, ".") ;
      AV36TotCol = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01QD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01QD2_A130BarCodPar[0] ;
         A132BarCodReo = P01QD2_A132BarCodReo[0] ;
         A129BarCod = P01QD2_A129BarCod[0] ;
         A252CliCod = P01QD2_A252CliCod[0] ;
         n252CliCod = P01QD2_n252CliCod[0] ;
         A212BarSer = P01QD2_A212BarSer[0] ;
         A135BarColNom = P01QD2_A135BarColNom[0] ;
         A136BarColNum = P01QD2_A136BarColNum[0] ;
         A218BarTipCol = P01QD2_A218BarTipCol[0] ;
         A5253BarAcc = P01QD2_A5253BarAcc[0] ;
         AV52CliCod = A252CliCod ;
         AV79BarSer = A212BarSer ;
         AV47ForColNom = A135BarColNom ;
         AV48ForColNum = A136BarColNum ;
         AV49TipColCod = A218BarTipCol ;
         AV97BarAcc = A5253BarAcc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( AV111F_reccol == 0 ) || ( ( AV111F_reccol == 1 ) && ( AV114Opi == 1 ) ) || ( ( AV111F_reccol == 1 ) && ( GXutil.strcmp(AV115Barfactin, httpContext.getMessage( "N", "")) == 0 ) ) )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = AV52CliCod ;
         GXv_char2[0] = AV79BarSer ;
         GXv_char5[0] = AV47ForColNom ;
         GXv_int6[0] = AV48ForColNum ;
         GXv_int1[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int9[0] = AV50FlagCol ;
         new app.pclaesp3(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char2, GXv_char5, GXv_int6, GXv_int1, GXv_int7, GXv_decimal8, GXv_int9) ;
         pclac4.this.A396EmprCod = GXv_char3[0] ;
         pclac4.this.AV52CliCod = GXv_int4[0] ;
         pclac4.this.AV79BarSer = GXv_char2[0] ;
         pclac4.this.AV47ForColNom = GXv_char5[0] ;
         pclac4.this.AV48ForColNum = GXv_int6[0] ;
         pclac4.this.AV49TipColCod = GXv_int1[0] ;
         pclac4.this.AV35Familia = GXv_int7[0] ;
         pclac4.this.AV36TotCol = GXv_decimal8[0] ;
         pclac4.this.AV50FlagCol = GXv_int9[0] ;
      }
      else
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int6[0] = AV18BarCod ;
         GXv_int9[0] = AV19BarCodReo ;
         GXv_char3[0] = AV20BarCodPar ;
         GXv_int10[0] = AV67BarLinMaq ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int1[0] = AV50FlagCol ;
         new app.pclaesp4(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_int9, GXv_char3, GXv_int10, GXv_int7, GXv_decimal8, GXv_int1) ;
         pclac4.this.A396EmprCod = GXv_char5[0] ;
         pclac4.this.AV18BarCod = GXv_int6[0] ;
         pclac4.this.AV19BarCodReo = GXv_int9[0] ;
         pclac4.this.AV20BarCodPar = GXv_char3[0] ;
         pclac4.this.AV67BarLinMaq = GXv_int10[0] ;
         pclac4.this.AV35Familia = GXv_int7[0] ;
         pclac4.this.AV36TotCol = GXv_decimal8[0] ;
         pclac4.this.AV50FlagCol = GXv_int1[0] ;
      }
      /* Execute user subroutine: 'MATIZ' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV75TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
      if ( ! (0==AV50FlagCol) && ( AV98Ok_matiz == 1 ) && ( GXutil.strcmp(AV97BarAcc, httpContext.getMessage( "S", "")) == 0 ) )
      {
         if ( ( DecimalUtil.compareTo(AV75TotCol2, AV82ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV75TotCol2, AV84ColFin_5) <= 0 ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'MATIZ' Routine */
      returnInSub = false ;
      AV98Ok_matiz = (byte)(0) ;
      if ( AV111F_reccol == 0 )
      {
         /* Using cursor P01QD3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV52CliCod), AV79BarSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod), Short.valueOf(AV31Matiz)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A626MatCod = P01QD3_A626MatCod[0] ;
            A831TipColCod = P01QD3_A831TipColCod[0] ;
            A483ForColNum = P01QD3_A483ForColNum[0] ;
            A482ForColNom = P01QD3_A482ForColNom[0] ;
            A494ForSer = P01QD3_A494ForSer[0] ;
            A252CliCod = P01QD3_A252CliCod[0] ;
            n252CliCod = P01QD3_n252CliCod[0] ;
            AV98Ok_matiz = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         /* Using cursor P01QD4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A2804RecLinMaq = P01QD4_A2804RecLinMaq[0] ;
            A130BarCodPar = P01QD4_A130BarCodPar[0] ;
            A132BarCodReo = P01QD4_A132BarCodReo[0] ;
            A129BarCod = P01QD4_A129BarCod[0] ;
            A5413RecMatCol = P01QD4_A5413RecMatCol[0] ;
            n5413RecMatCol = P01QD4_n5413RecMatCol[0] ;
            if ( AV31Matiz == A5413RecMatCol )
            {
               AV98Ok_matiz = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclac4.this.A396EmprCod;
      this.aP1[0] = pclac4.this.AV15Descrip;
      this.aP2[0] = pclac4.this.AV16Clave;
      this.aP3[0] = pclac4.this.AV17PrdVal;
      this.aP4[0] = pclac4.this.AV18BarCod;
      this.aP5[0] = pclac4.this.AV19BarCodReo;
      this.aP6[0] = pclac4.this.AV20BarCodPar;
      this.aP7[0] = pclac4.this.AV21TotKil;
      this.aP8[0] = pclac4.this.AV22PrdDesc;
      this.aP9[0] = pclac4.this.AV23Accion;
      this.aP10[0] = pclac4.this.AV67BarLinMaq;
      this.aP11[0] = pclac4.this.AV114Opi;
      this.aP12[0] = pclac4.this.AV115Barfactin;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV80Ini_5 = "" ;
      AV83Inip_5 = "" ;
      AV82ColIni_5 = DecimalUtil.ZERO ;
      AV81Fin_5 = "" ;
      AV90Finp_5 = "" ;
      AV84ColFin_5 = DecimalUtil.ZERO ;
      AV36TotCol = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01QD2_A396EmprCod = new String[] {""} ;
      P01QD2_A130BarCodPar = new String[] {""} ;
      P01QD2_A132BarCodReo = new byte[1] ;
      P01QD2_A129BarCod = new int[1] ;
      P01QD2_A252CliCod = new int[1] ;
      P01QD2_n252CliCod = new boolean[] {false} ;
      P01QD2_A212BarSer = new String[] {""} ;
      P01QD2_A135BarColNom = new String[] {""} ;
      P01QD2_A136BarColNum = new int[1] ;
      P01QD2_A218BarTipCol = new byte[1] ;
      P01QD2_A5253BarAcc = new String[] {""} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A5253BarAcc = "" ;
      AV79BarSer = "" ;
      AV47ForColNom = "" ;
      AV97BarAcc = "" ;
      GXv_int4 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int7 = new byte[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int1 = new byte[1] ;
      AV75TotCol2 = DecimalUtil.ZERO ;
      P01QD3_A396EmprCod = new String[] {""} ;
      P01QD3_A626MatCod = new short[1] ;
      P01QD3_A831TipColCod = new byte[1] ;
      P01QD3_A483ForColNum = new int[1] ;
      P01QD3_A482ForColNom = new String[] {""} ;
      P01QD3_A494ForSer = new String[] {""} ;
      P01QD3_A252CliCod = new int[1] ;
      P01QD3_n252CliCod = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P01QD4_A396EmprCod = new String[] {""} ;
      P01QD4_A2804RecLinMaq = new short[1] ;
      P01QD4_A130BarCodPar = new String[] {""} ;
      P01QD4_A132BarCodReo = new byte[1] ;
      P01QD4_A129BarCod = new int[1] ;
      P01QD4_A5413RecMatCol = new short[1] ;
      P01QD4_n5413RecMatCol = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclac4__default(),
         new Object[] {
             new Object[] {
            P01QD2_A396EmprCod, P01QD2_A130BarCodPar, P01QD2_A132BarCodReo, P01QD2_A129BarCod, P01QD2_A252CliCod, P01QD2_n252CliCod, P01QD2_A212BarSer, P01QD2_A135BarColNom, P01QD2_A136BarColNum, P01QD2_A218BarTipCol,
            P01QD2_A5253BarAcc
            }
            , new Object[] {
            P01QD3_A396EmprCod, P01QD3_A626MatCod, P01QD3_A831TipColCod, P01QD3_A483ForColNum, P01QD3_A482ForColNom, P01QD3_A494ForSer, P01QD3_A252CliCod
            }
            , new Object[] {
            P01QD4_A396EmprCod, P01QD4_A2804RecLinMaq, P01QD4_A130BarCodPar, P01QD4_A132BarCodReo, P01QD4_A129BarCod, P01QD4_A5413RecMatCol, P01QD4_n5413RecMatCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV114Opi ;
   private byte AV111F_reccol ;
   private byte AV35Familia ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV49TipColCod ;
   private byte AV50FlagCol ;
   private byte GXv_int9[] ;
   private byte GXv_int7[] ;
   private byte GXv_int1[] ;
   private byte AV98Ok_matiz ;
   private byte A831TipColCod ;
   private short AV67BarLinMaq ;
   private short AV31Matiz ;
   private short GXv_int10[] ;
   private short A626MatCod ;
   private short A2804RecLinMaq ;
   private short A5413RecMatCol ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV52CliCod ;
   private int AV48ForColNum ;
   private int GXv_int4[] ;
   private int GXv_int6[] ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal AV82ColIni_5 ;
   private java.math.BigDecimal AV84ColFin_5 ;
   private java.math.BigDecimal AV36TotCol ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV75TotCol2 ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV115Barfactin ;
   private String AV80Ini_5 ;
   private String AV83Inip_5 ;
   private String AV81Fin_5 ;
   private String AV90Finp_5 ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A5253BarAcc ;
   private String AV79BarSer ;
   private String AV47ForColNom ;
   private String AV97BarAcc ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n5413RecMatCol ;
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
   private String[] P01QD2_A396EmprCod ;
   private String[] P01QD2_A130BarCodPar ;
   private byte[] P01QD2_A132BarCodReo ;
   private int[] P01QD2_A129BarCod ;
   private int[] P01QD2_A252CliCod ;
   private boolean[] P01QD2_n252CliCod ;
   private String[] P01QD2_A212BarSer ;
   private String[] P01QD2_A135BarColNom ;
   private int[] P01QD2_A136BarColNum ;
   private byte[] P01QD2_A218BarTipCol ;
   private String[] P01QD2_A5253BarAcc ;
   private String[] P01QD3_A396EmprCod ;
   private short[] P01QD3_A626MatCod ;
   private byte[] P01QD3_A831TipColCod ;
   private int[] P01QD3_A483ForColNum ;
   private String[] P01QD3_A482ForColNom ;
   private String[] P01QD3_A494ForSer ;
   private int[] P01QD3_A252CliCod ;
   private boolean[] P01QD3_n252CliCod ;
   private String[] P01QD4_A396EmprCod ;
   private short[] P01QD4_A2804RecLinMaq ;
   private String[] P01QD4_A130BarCodPar ;
   private byte[] P01QD4_A132BarCodReo ;
   private int[] P01QD4_A129BarCod ;
   private short[] P01QD4_A5413RecMatCol ;
   private boolean[] P01QD4_n5413RecMatCol ;
}

final  class pclac4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01QD2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarAcc FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01QD3", "SELECT EmprCod, MatCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (MatCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01QD4", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecMatCol FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

