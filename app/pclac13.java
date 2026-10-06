package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclac13 extends GXProcedure
{
   public pclac13( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclac13.class ), "" );
   }

   public pclac13( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 ,
                           byte[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 ,
                           String[] aP6 ,
                           java.math.BigDecimal[] aP7 ,
                           String[] aP8 ,
                           String[] aP9 ,
                           short[] aP10 )
   {
      pclac13.this.aP11 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
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
                        byte[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
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
                             byte[] aP11 )
   {
      pclac13.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclac13.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclac13.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclac13.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclac13.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclac13.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclac13.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclac13.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclac13.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclac13.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclac13.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclac13.this.AV114Opi = aP11[0];
      this.aP11 = aP11;
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
      pclac13.this.AV111F_Reccol = GXv_int1[0] ;
      AV121Fase_nt = (byte)(0) ;
      /* Using cursor P02ET2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P02ET2_A2804RecLinMaq[0] ;
         A130BarCodPar = P02ET2_A130BarCodPar[0] ;
         A132BarCodReo = P02ET2_A132BarCodReo[0] ;
         A129BarCod = P02ET2_A129BarCod[0] ;
         A5408RecLinCol = P02ET2_A5408RecLinCol[0] ;
         AV121Fase_nt = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P02ET3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2804RecLinMaq = P02ET3_A2804RecLinMaq[0] ;
         A130BarCodPar = P02ET3_A130BarCodPar[0] ;
         A132BarCodReo = P02ET3_A132BarCodReo[0] ;
         A129BarCod = P02ET3_A129BarCod[0] ;
         A602MaqCod = P02ET3_A602MaqCod[0] ;
         AV120MaqCodR = A602MaqCod ;
         /* Using cursor P02ET4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A2804RecLinMaq = P02ET4_A2804RecLinMaq[0] ;
            A130BarCodPar = P02ET4_A130BarCodPar[0] ;
            A132BarCodReo = P02ET4_A132BarCodReo[0] ;
            A129BarCod = P02ET4_A129BarCod[0] ;
            A4695RecVolPrf = P02ET4_A4695RecVolPrf[0] ;
            A1273RecLinPro = P02ET4_A1273RecLinPro[0] ;
            AV26RelBany = (byte)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(A4695RecVolPrf).divide(AV21TotKil, 18, java.math.RoundingMode.DOWN)), 0))) ;
            AV125RecVolPrf = A4695RecVolPrf ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV26RelBany > 99 )
      {
         AV26RelBany = (byte)(99) ;
      }
      AV118DisPla = " " ;
      /* Using cursor P02ET5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P02ET5_A130BarCodPar[0] ;
         A132BarCodReo = P02ET5_A132BarCodReo[0] ;
         A129BarCod = P02ET5_A129BarCod[0] ;
         A3030BarPlf = P02ET5_A3030BarPlf[0] ;
         A212BarSer = P02ET5_A212BarSer[0] ;
         AV118DisPla = A3030BarPlf ;
         AV79BarSer = A212BarSer ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV85LenVar = (byte)(GXutil.len( GXutil.trim( AV79BarSer))) ;
      AV86Pos_u = GXutil.substring( AV79BarSer, AV85LenVar, 1) ;
      AV89Pos_pu_n = (byte)(AV85LenVar-1) ;
      AV87Pos_pu = GXutil.substring( AV79BarSer, AV89Pos_pu_n, 2) ;
      if ( GXutil.strcmp(AV87Pos_pu, httpContext.getMessage( "NM", "")) == 0 )
      {
         AV123Mercer = httpContext.getMessage( "N", "") ;
      }
      if ( ( GXutil.strcmp(AV86Pos_u, httpContext.getMessage( "M", "")) == 0 ) && ( GXutil.strcmp(AV87Pos_pu, httpContext.getMessage( "NM", "")) != 0 ) )
      {
         AV123Mercer = httpContext.getMessage( "S", "") ;
      }
      AV23Accion = GXutil.substring( AV16Clave, 30, 1) ;
      AV80Ini_5 = GXutil.substring( AV16Clave, 5, 5) ;
      GXv_char2[0] = AV80Ini_5 ;
      GXv_char3[0] = AV83Inip_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char2, GXv_char3) ;
      pclac13.this.AV80Ini_5 = GXv_char2[0] ;
      pclac13.this.AV83Inip_5 = GXv_char3[0] ;
      AV82ColIni_5 = CommonUtil.decimalVal( AV83Inip_5, ".") ;
      AV81Fin_5 = GXutil.substring( AV16Clave, 10, 5) ;
      GXv_char3[0] = AV81Fin_5 ;
      GXv_char2[0] = AV90Finp_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char3, GXv_char2) ;
      pclac13.this.AV81Fin_5 = GXv_char3[0] ;
      pclac13.this.AV90Finp_5 = GXv_char2[0] ;
      AV84ColFin_5 = CommonUtil.decimalVal( AV90Finp_5, ".") ;
      AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
      AV27RelBanIni = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 18, 2))) ;
      AV28RelBanFin = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 20, 2))) ;
      AV117Amostras = GXutil.substring( AV16Clave, 22, 1) ;
      AV116MaqCod = GXutil.trim( GXutil.substring( AV16Clave, 23, 6)) ;
      AV122Mercerizar = GXutil.substring( AV16Clave, 29, 1) ;
      AV124Colorteca = GXutil.substring( AV16Clave, 4, 1) ;
      AV36TotCol = DecimalUtil.doubleToDec(0) ;
      if ( ( ( GXutil.strcmp(AV124Colorteca, httpContext.getMessage( "S", "")) != 0 ) ) && ( ( ( AV111F_Reccol == 1 ) && ( AV114Opi == 0 ) ) || ( ( AV111F_Reccol == 1 ) && ( AV121Fase_nt == 1 ) ) ) )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = AV18BarCod ;
         GXv_int1[0] = AV19BarCodReo ;
         GXv_char2[0] = AV20BarCodPar ;
         GXv_int5[0] = AV67BarLinMaq ;
         GXv_int6[0] = AV35Familia ;
         GXv_decimal7[0] = AV36TotCol ;
         GXv_int8[0] = AV50FlagCol ;
         new app.pclaesp4(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int1, GXv_char2, GXv_int5, GXv_int6, GXv_decimal7, GXv_int8) ;
         pclac13.this.A396EmprCod = GXv_char3[0] ;
         pclac13.this.AV18BarCod = GXv_int4[0] ;
         pclac13.this.AV19BarCodReo = GXv_int1[0] ;
         pclac13.this.AV20BarCodPar = GXv_char2[0] ;
         pclac13.this.AV67BarLinMaq = GXv_int5[0] ;
         pclac13.this.AV35Familia = GXv_int6[0] ;
         pclac13.this.AV36TotCol = GXv_decimal7[0] ;
         pclac13.this.AV50FlagCol = GXv_int8[0] ;
      }
      else
      {
         /* Using cursor P02ET6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A130BarCodPar = P02ET6_A130BarCodPar[0] ;
            A132BarCodReo = P02ET6_A132BarCodReo[0] ;
            A129BarCod = P02ET6_A129BarCod[0] ;
            A252CliCod = P02ET6_A252CliCod[0] ;
            n252CliCod = P02ET6_n252CliCod[0] ;
            A212BarSer = P02ET6_A212BarSer[0] ;
            A135BarColNom = P02ET6_A135BarColNom[0] ;
            A136BarColNum = P02ET6_A136BarColNum[0] ;
            A218BarTipCol = P02ET6_A218BarTipCol[0] ;
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
            pclac13.this.A396EmprCod = GXv_char3[0] ;
            pclac13.this.A252CliCod = GXv_int4[0] ;
            pclac13.this.A212BarSer = GXv_char2[0] ;
            pclac13.this.A135BarColNom = GXv_char9[0] ;
            pclac13.this.A136BarColNum = GXv_int10[0] ;
            pclac13.this.A218BarTipCol = GXv_int8[0] ;
            pclac13.this.AV35Familia = GXv_int6[0] ;
            pclac13.this.AV36TotCol = GXv_decimal7[0] ;
            pclac13.this.AV50FlagCol = GXv_int1[0] ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
      AV75TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
      if ( ! (0==AV50FlagCol) )
      {
         if ( ( DecimalUtil.compareTo(AV75TotCol2, AV82ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV75TotCol2, AV84ColFin_5) <= 0 ) && ( AV26RelBany >= AV27RelBanIni ) && ( AV26RelBany <= AV28RelBanFin ) && ( ( GXutil.strcmp(AV122Mercerizar, AV123Mercer) == 0 ) || ( GXutil.strcmp(AV122Mercerizar, "*") == 0 ) ) )
         {
            if ( ( ( GXutil.like( AV120MaqCodR , GXutil.padr( AV116MaqCod , 6 , "%"),  ' ' ) && ! (GXutil.strcmp("", AV116MaqCod)==0) ) || (GXutil.strcmp("", AV116MaqCod)==0) ) )
            {
               if ( ( ( GXutil.strcmp(AV118DisPla, AV117Amostras) == 0 ) && ! (GXutil.strcmp("", AV117Amostras)==0) ) || ( GXutil.strcmp(AV117Amostras, GXutil.space( (short)(1))) == 0 ) )
               {
                  Gx_msg = httpContext.getMessage( "&FlagCol =", "") + GXutil.str( AV50FlagCol, 1, 0) + GXutil.newLine( ) + httpContext.getMessage( "&ColIni_5=", "") + GXutil.str( AV82ColIni_5, 5, 2) + GXutil.newLine( ) + httpContext.getMessage( "&ColfIN_5=", "") + GXutil.str( AV84ColFin_5, 5, 2) + GXutil.newLine( ) + httpContext.getMessage( "&TotCol2 =", "") + GXutil.str( AV75TotCol2, 8, 2) + GXutil.newLine( ) + httpContext.getMessage( "&MaqCod  =", "") + AV116MaqCod + GXutil.newLine( ) + httpContext.getMessage( "&MaqCodR =", "") + AV120MaqCodR + GXutil.newLine( ) + httpContext.getMessage( "&DisPla  =", "") + AV118DisPla + GXutil.newLine( ) + httpContext.getMessage( "&Amostras=", "") + AV117Amostras + GXutil.newLine( ) + httpContext.getMessage( "&RelBanIni=", "") + GXutil.str( AV27RelBanIni, 2, 0) + GXutil.newLine( ) + httpContext.getMessage( "&RelBanFIN=", "") + GXutil.str( AV28RelBanFin, 2, 0) + GXutil.newLine( ) + httpContext.getMessage( "&RelBany =", "") + GXutil.str( AV26RelBany, 2, 0) + GXutil.newLine( ) + httpContext.getMessage( "&Mercerizar=", "") + AV122Mercerizar + GXutil.newLine( ) + httpContext.getMessage( "&Mercer    =", "") + AV123Mercer + GXutil.newLine( ) + httpContext.getMessage( "TotalKilos =", "") + GXutil.str( AV21TotKil, 10, 4) + GXutil.newLine( ) + httpContext.getMessage( "Volume =", "") + GXutil.str( AV125RecVolPrf, 10, 4) + GXutil.newLine( ) ;
                  AV17PrdVal = (byte)(1) ;
               }
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclac13.this.A396EmprCod;
      this.aP1[0] = pclac13.this.AV15Descrip;
      this.aP2[0] = pclac13.this.AV16Clave;
      this.aP3[0] = pclac13.this.AV17PrdVal;
      this.aP4[0] = pclac13.this.AV18BarCod;
      this.aP5[0] = pclac13.this.AV19BarCodReo;
      this.aP6[0] = pclac13.this.AV20BarCodPar;
      this.aP7[0] = pclac13.this.AV21TotKil;
      this.aP8[0] = pclac13.this.AV22PrdDesc;
      this.aP9[0] = pclac13.this.AV23Accion;
      this.aP10[0] = pclac13.this.AV67BarLinMaq;
      this.aP11[0] = pclac13.this.AV114Opi;
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
      P02ET2_A396EmprCod = new String[] {""} ;
      P02ET2_A2804RecLinMaq = new short[1] ;
      P02ET2_A130BarCodPar = new String[] {""} ;
      P02ET2_A132BarCodReo = new byte[1] ;
      P02ET2_A129BarCod = new int[1] ;
      P02ET2_A5408RecLinCol = new short[1] ;
      A130BarCodPar = "" ;
      P02ET3_A396EmprCod = new String[] {""} ;
      P02ET3_A2804RecLinMaq = new short[1] ;
      P02ET3_A130BarCodPar = new String[] {""} ;
      P02ET3_A132BarCodReo = new byte[1] ;
      P02ET3_A129BarCod = new int[1] ;
      P02ET3_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      AV120MaqCodR = "" ;
      P02ET4_A396EmprCod = new String[] {""} ;
      P02ET4_A2804RecLinMaq = new short[1] ;
      P02ET4_A130BarCodPar = new String[] {""} ;
      P02ET4_A132BarCodReo = new byte[1] ;
      P02ET4_A129BarCod = new int[1] ;
      P02ET4_A4695RecVolPrf = new int[1] ;
      P02ET4_A1273RecLinPro = new byte[1] ;
      AV118DisPla = "" ;
      P02ET5_A396EmprCod = new String[] {""} ;
      P02ET5_A130BarCodPar = new String[] {""} ;
      P02ET5_A132BarCodReo = new byte[1] ;
      P02ET5_A129BarCod = new int[1] ;
      P02ET5_A3030BarPlf = new String[] {""} ;
      P02ET5_A212BarSer = new String[] {""} ;
      A3030BarPlf = "" ;
      A212BarSer = "" ;
      AV79BarSer = "" ;
      AV86Pos_u = "" ;
      AV87Pos_pu = "" ;
      AV123Mercer = "" ;
      AV80Ini_5 = "" ;
      AV83Inip_5 = "" ;
      AV82ColIni_5 = DecimalUtil.ZERO ;
      AV81Fin_5 = "" ;
      AV90Finp_5 = "" ;
      AV84ColFin_5 = DecimalUtil.ZERO ;
      AV117Amostras = "" ;
      AV116MaqCod = "" ;
      AV122Mercerizar = "" ;
      AV124Colorteca = "" ;
      AV36TotCol = DecimalUtil.ZERO ;
      GXv_int5 = new short[1] ;
      P02ET6_A396EmprCod = new String[] {""} ;
      P02ET6_A130BarCodPar = new String[] {""} ;
      P02ET6_A132BarCodReo = new byte[1] ;
      P02ET6_A129BarCod = new int[1] ;
      P02ET6_A252CliCod = new int[1] ;
      P02ET6_n252CliCod = new boolean[] {false} ;
      P02ET6_A212BarSer = new String[] {""} ;
      P02ET6_A135BarColNom = new String[] {""} ;
      P02ET6_A136BarColNum = new int[1] ;
      P02ET6_A218BarTipCol = new byte[1] ;
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
      AV75TotCol2 = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclac13__default(),
         new Object[] {
             new Object[] {
            P02ET2_A396EmprCod, P02ET2_A2804RecLinMaq, P02ET2_A130BarCodPar, P02ET2_A132BarCodReo, P02ET2_A129BarCod, P02ET2_A5408RecLinCol
            }
            , new Object[] {
            P02ET3_A396EmprCod, P02ET3_A2804RecLinMaq, P02ET3_A130BarCodPar, P02ET3_A132BarCodReo, P02ET3_A129BarCod, P02ET3_A602MaqCod
            }
            , new Object[] {
            P02ET4_A396EmprCod, P02ET4_A2804RecLinMaq, P02ET4_A130BarCodPar, P02ET4_A132BarCodReo, P02ET4_A129BarCod, P02ET4_A4695RecVolPrf, P02ET4_A1273RecLinPro
            }
            , new Object[] {
            P02ET5_A396EmprCod, P02ET5_A130BarCodPar, P02ET5_A132BarCodReo, P02ET5_A129BarCod, P02ET5_A3030BarPlf, P02ET5_A212BarSer
            }
            , new Object[] {
            P02ET6_A396EmprCod, P02ET6_A130BarCodPar, P02ET6_A132BarCodReo, P02ET6_A129BarCod, P02ET6_A252CliCod, P02ET6_n252CliCod, P02ET6_A212BarSer, P02ET6_A135BarColNom, P02ET6_A136BarColNum, P02ET6_A218BarTipCol
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
   private byte AV121Fase_nt ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV26RelBany ;
   private byte AV85LenVar ;
   private byte AV89Pos_pu_n ;
   private byte AV35Familia ;
   private byte AV27RelBanIni ;
   private byte AV28RelBanFin ;
   private byte AV50FlagCol ;
   private byte A218BarTipCol ;
   private byte GXv_int8[] ;
   private byte GXv_int6[] ;
   private byte GXv_int1[] ;
   private short AV67BarLinMaq ;
   private short A2804RecLinMaq ;
   private short A5408RecLinCol ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private int A4695RecVolPrf ;
   private int AV125RecVolPrf ;
   private int A252CliCod ;
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
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String AV120MaqCodR ;
   private String AV118DisPla ;
   private String A3030BarPlf ;
   private String A212BarSer ;
   private String AV79BarSer ;
   private String AV86Pos_u ;
   private String AV87Pos_pu ;
   private String AV123Mercer ;
   private String AV80Ini_5 ;
   private String AV83Inip_5 ;
   private String AV81Fin_5 ;
   private String AV90Finp_5 ;
   private String AV117Amostras ;
   private String AV116MaqCod ;
   private String AV122Mercerizar ;
   private String AV124Colorteca ;
   private String A135BarColNom ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String Gx_msg ;
   private boolean n252CliCod ;
   private byte[] aP11 ;
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
   private IDataStoreProvider pr_default ;
   private String[] P02ET2_A396EmprCod ;
   private short[] P02ET2_A2804RecLinMaq ;
   private String[] P02ET2_A130BarCodPar ;
   private byte[] P02ET2_A132BarCodReo ;
   private int[] P02ET2_A129BarCod ;
   private short[] P02ET2_A5408RecLinCol ;
   private String[] P02ET3_A396EmprCod ;
   private short[] P02ET3_A2804RecLinMaq ;
   private String[] P02ET3_A130BarCodPar ;
   private byte[] P02ET3_A132BarCodReo ;
   private int[] P02ET3_A129BarCod ;
   private String[] P02ET3_A602MaqCod ;
   private String[] P02ET4_A396EmprCod ;
   private short[] P02ET4_A2804RecLinMaq ;
   private String[] P02ET4_A130BarCodPar ;
   private byte[] P02ET4_A132BarCodReo ;
   private int[] P02ET4_A129BarCod ;
   private int[] P02ET4_A4695RecVolPrf ;
   private byte[] P02ET4_A1273RecLinPro ;
   private String[] P02ET5_A396EmprCod ;
   private String[] P02ET5_A130BarCodPar ;
   private byte[] P02ET5_A132BarCodReo ;
   private int[] P02ET5_A129BarCod ;
   private String[] P02ET5_A3030BarPlf ;
   private String[] P02ET5_A212BarSer ;
   private String[] P02ET6_A396EmprCod ;
   private String[] P02ET6_A130BarCodPar ;
   private byte[] P02ET6_A132BarCodReo ;
   private int[] P02ET6_A129BarCod ;
   private int[] P02ET6_A252CliCod ;
   private boolean[] P02ET6_n252CliCod ;
   private String[] P02ET6_A212BarSer ;
   private String[] P02ET6_A135BarColNom ;
   private int[] P02ET6_A136BarColNum ;
   private byte[] P02ET6_A218BarTipCol ;
}

final  class pclac13__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02ET2", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02ET3", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02ET4", "SELECT * FROM (SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecVolPrf, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02ET5", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarPlf, BarSer FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02ET6", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               return;
            case 4 :
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

