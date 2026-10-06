package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcladi0 extends GXProcedure
{
   public pcladi0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcladi0.class ), "" );
   }

   public pcladi0( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 ,
                            byte[] aP3 ,
                            int[] aP4 ,
                            byte[] aP5 ,
                            String[] aP6 ,
                            java.math.BigDecimal[] aP7 ,
                            String[] aP8 ,
                            String[] aP9 )
   {
      pcladi0.this.aP10 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
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
                        short[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
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
                             short[] aP10 )
   {
      pcladi0.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcladi0.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pcladi0.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pcladi0.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pcladi0.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pcladi0.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pcladi0.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pcladi0.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pcladi0.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pcladi0.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pcladi0.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
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
      pcladi0.this.AV111F_Reccol = GXv_int1[0] ;
      AV115Fase_nt = (byte)(0) ;
      /* Using cursor P02UX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P02UX2_A2804RecLinMaq[0] ;
         A130BarCodPar = P02UX2_A130BarCodPar[0] ;
         A132BarCodReo = P02UX2_A132BarCodReo[0] ;
         A129BarCod = P02UX2_A129BarCod[0] ;
         A5408RecLinCol = P02UX2_A5408RecLinCol[0] ;
         AV115Fase_nt = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P02UX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2804RecLinMaq = P02UX3_A2804RecLinMaq[0] ;
         A130BarCodPar = P02UX3_A130BarCodPar[0] ;
         A132BarCodReo = P02UX3_A132BarCodReo[0] ;
         A129BarCod = P02UX3_A129BarCod[0] ;
         /* Using cursor P02UX4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A2804RecLinMaq = P02UX4_A2804RecLinMaq[0] ;
            A130BarCodPar = P02UX4_A130BarCodPar[0] ;
            A132BarCodReo = P02UX4_A132BarCodReo[0] ;
            A129BarCod = P02UX4_A129BarCod[0] ;
            A4695RecVolPrf = P02UX4_A4695RecVolPrf[0] ;
            A1273RecLinPro = P02UX4_A1273RecLinPro[0] ;
            AV26RelBany = (byte)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(A4695RecVolPrf).divide(AV21TotKil, 18, java.math.RoundingMode.DOWN)), 0))) ;
            AV124RecVolPrf = A4695RecVolPrf ;
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
      AV122Displa = " " ;
      /* Using cursor P02UX5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P02UX5_A130BarCodPar[0] ;
         A132BarCodReo = P02UX5_A132BarCodReo[0] ;
         A129BarCod = P02UX5_A129BarCod[0] ;
         A3030BarPlf = P02UX5_A3030BarPlf[0] ;
         A212BarSer = P02UX5_A212BarSer[0] ;
         AV122Displa = A3030BarPlf ;
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
      AV80Ini_5 = GXutil.substring( AV16Clave, 5, 5) ;
      GXv_char2[0] = AV80Ini_5 ;
      GXv_char3[0] = AV83Inip_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char2, GXv_char3) ;
      pcladi0.this.AV80Ini_5 = GXv_char2[0] ;
      pcladi0.this.AV83Inip_5 = GXv_char3[0] ;
      AV82ColIni_5 = CommonUtil.decimalVal( AV83Inip_5, ".") ;
      AV81Fin_5 = GXutil.substring( AV16Clave, 10, 5) ;
      GXv_char3[0] = AV81Fin_5 ;
      GXv_char2[0] = AV90Finp_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char3, GXv_char2) ;
      pcladi0.this.AV81Fin_5 = GXv_char3[0] ;
      pcladi0.this.AV90Finp_5 = GXv_char2[0] ;
      AV84ColFin_5 = CommonUtil.decimalVal( AV90Finp_5, ".") ;
      AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
      AV27RelBanIni = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 18, 2))) ;
      AV28RelBanFin = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 20, 2))) ;
      AV120Amostras = GXutil.substring( AV16Clave, 23, 1) ;
      AV121Mercerizar = GXutil.substring( AV16Clave, 25, 1) ;
      AV126UsaForm = GXutil.substring( AV16Clave, 26, 1) ;
      AV118Colorteca = GXutil.substring( AV16Clave, 27, 1) ;
      AV119Formula = GXutil.substring( AV16Clave, 28, 2) ;
      AV23Accion = GXutil.substring( AV16Clave, 30, 1) ;
      AV36TotCol = DecimalUtil.doubleToDec(0) ;
      if ( ( ( GXutil.strcmp(AV118Colorteca, httpContext.getMessage( "S", "")) != 0 ) ) && ( ( ( AV111F_Reccol == 1 ) && ( AV113Opi == 0 ) ) || ( ( AV111F_Reccol == 1 ) && ( AV115Fase_nt == 1 ) ) ) )
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
         pcladi0.this.A396EmprCod = GXv_char3[0] ;
         pcladi0.this.AV18BarCod = GXv_int4[0] ;
         pcladi0.this.AV19BarCodReo = GXv_int1[0] ;
         pcladi0.this.AV20BarCodPar = GXv_char2[0] ;
         pcladi0.this.AV67BarLinMaq = GXv_int5[0] ;
         pcladi0.this.AV35Familia = GXv_int6[0] ;
         pcladi0.this.AV36TotCol = GXv_decimal7[0] ;
         pcladi0.this.AV50FlagCol = GXv_int8[0] ;
      }
      else
      {
         /* Using cursor P02UX6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A130BarCodPar = P02UX6_A130BarCodPar[0] ;
            A132BarCodReo = P02UX6_A132BarCodReo[0] ;
            A129BarCod = P02UX6_A129BarCod[0] ;
            A252CliCod = P02UX6_A252CliCod[0] ;
            n252CliCod = P02UX6_n252CliCod[0] ;
            A212BarSer = P02UX6_A212BarSer[0] ;
            A135BarColNom = P02UX6_A135BarColNom[0] ;
            A136BarColNum = P02UX6_A136BarColNum[0] ;
            A218BarTipCol = P02UX6_A218BarTipCol[0] ;
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
            pcladi0.this.A396EmprCod = GXv_char3[0] ;
            pcladi0.this.A252CliCod = GXv_int4[0] ;
            pcladi0.this.A212BarSer = GXv_char2[0] ;
            pcladi0.this.A135BarColNom = GXv_char9[0] ;
            pcladi0.this.A136BarColNum = GXv_int10[0] ;
            pcladi0.this.A218BarTipCol = GXv_int8[0] ;
            pcladi0.this.AV35Familia = GXv_int6[0] ;
            pcladi0.this.AV36TotCol = GXv_decimal7[0] ;
            pcladi0.this.AV50FlagCol = GXv_int1[0] ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
      AV75TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
      AV17PrdVal = (byte)(0) ;
      if ( ! (0==AV50FlagCol) )
      {
         if ( ( DecimalUtil.compareTo(AV75TotCol2, AV82ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV75TotCol2, AV84ColFin_5) <= 0 ) && ( AV26RelBany >= AV27RelBanIni ) && ( AV26RelBany <= AV28RelBanFin ) && ( ( GXutil.strcmp(AV121Mercerizar, AV123Mercer) == 0 ) || ( GXutil.strcmp(AV121Mercerizar, "*") == 0 ) ) && ( ( GXutil.strcmp(AV122Displa, AV120Amostras) == 0 ) || ( GXutil.strcmp(AV120Amostras, "*") == 0 ) ) )
         {
            if ( GXutil.strcmp(AV126UsaForm, httpContext.getMessage( "S", "")) == 0 )
            {
               AV50FlagCol = (byte)(0) ;
               GXv_char9[0] = AV119Formula ;
               GXv_decimal7[0] = AV75TotCol2 ;
               GXv_int5[0] = AV26RelBany ;
               GXv_int10[0] = AV124RecVolPrf ;
               GXv_decimal11[0] = AV21TotKil ;
               GXv_decimal12[0] = AV125Valor ;
               GXv_int8[0] = AV50FlagCol ;
               new app.pvalfor(remoteHandle, context).execute( GXv_char9, GXv_decimal7, GXv_int5, GXv_int10, GXv_decimal11, GXv_decimal12, GXv_int8) ;
               pcladi0.this.AV119Formula = GXv_char9[0] ;
               pcladi0.this.AV75TotCol2 = GXv_decimal7[0] ;
               pcladi0.this.AV26RelBany = (byte)((byte)(GXv_int5[0])) ;
               pcladi0.this.AV124RecVolPrf = GXv_int10[0] ;
               pcladi0.this.AV21TotKil = GXv_decimal11[0] ;
               pcladi0.this.AV125Valor = GXv_decimal12[0] ;
               pcladi0.this.AV50FlagCol = GXv_int8[0] ;
               if ( AV50FlagCol == 1 )
               {
                  AV21TotKil = GXutil.roundDecimal( AV125Valor, 3) ;
                  AV17PrdVal = (byte)(2) ;
               }
            }
            else
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcladi0.this.A396EmprCod;
      this.aP1[0] = pcladi0.this.AV15Descrip;
      this.aP2[0] = pcladi0.this.AV16Clave;
      this.aP3[0] = pcladi0.this.AV17PrdVal;
      this.aP4[0] = pcladi0.this.AV18BarCod;
      this.aP5[0] = pcladi0.this.AV19BarCodReo;
      this.aP6[0] = pcladi0.this.AV20BarCodPar;
      this.aP7[0] = pcladi0.this.AV21TotKil;
      this.aP8[0] = pcladi0.this.AV22PrdDesc;
      this.aP9[0] = pcladi0.this.AV23Accion;
      this.aP10[0] = pcladi0.this.AV67BarLinMaq;
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
      P02UX2_A396EmprCod = new String[] {""} ;
      P02UX2_A2804RecLinMaq = new short[1] ;
      P02UX2_A130BarCodPar = new String[] {""} ;
      P02UX2_A132BarCodReo = new byte[1] ;
      P02UX2_A129BarCod = new int[1] ;
      P02UX2_A5408RecLinCol = new short[1] ;
      A130BarCodPar = "" ;
      P02UX3_A396EmprCod = new String[] {""} ;
      P02UX3_A2804RecLinMaq = new short[1] ;
      P02UX3_A130BarCodPar = new String[] {""} ;
      P02UX3_A132BarCodReo = new byte[1] ;
      P02UX3_A129BarCod = new int[1] ;
      P02UX4_A396EmprCod = new String[] {""} ;
      P02UX4_A2804RecLinMaq = new short[1] ;
      P02UX4_A130BarCodPar = new String[] {""} ;
      P02UX4_A132BarCodReo = new byte[1] ;
      P02UX4_A129BarCod = new int[1] ;
      P02UX4_A4695RecVolPrf = new int[1] ;
      P02UX4_A1273RecLinPro = new byte[1] ;
      AV122Displa = "" ;
      P02UX5_A396EmprCod = new String[] {""} ;
      P02UX5_A130BarCodPar = new String[] {""} ;
      P02UX5_A132BarCodReo = new byte[1] ;
      P02UX5_A129BarCod = new int[1] ;
      P02UX5_A3030BarPlf = new String[] {""} ;
      P02UX5_A212BarSer = new String[] {""} ;
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
      AV120Amostras = "" ;
      AV121Mercerizar = "" ;
      AV126UsaForm = "" ;
      AV118Colorteca = "" ;
      AV119Formula = "" ;
      AV36TotCol = DecimalUtil.ZERO ;
      P02UX6_A396EmprCod = new String[] {""} ;
      P02UX6_A130BarCodPar = new String[] {""} ;
      P02UX6_A132BarCodReo = new byte[1] ;
      P02UX6_A129BarCod = new int[1] ;
      P02UX6_A252CliCod = new int[1] ;
      P02UX6_n252CliCod = new boolean[] {false} ;
      P02UX6_A212BarSer = new String[] {""} ;
      P02UX6_A135BarColNom = new String[] {""} ;
      P02UX6_A136BarColNum = new int[1] ;
      P02UX6_A218BarTipCol = new byte[1] ;
      A135BarColNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int1 = new byte[1] ;
      AV75TotCol2 = DecimalUtil.ZERO ;
      GXv_char9 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int5 = new short[1] ;
      GXv_int10 = new int[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      AV125Valor = DecimalUtil.ZERO ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcladi0__default(),
         new Object[] {
             new Object[] {
            P02UX2_A396EmprCod, P02UX2_A2804RecLinMaq, P02UX2_A130BarCodPar, P02UX2_A132BarCodReo, P02UX2_A129BarCod, P02UX2_A5408RecLinCol
            }
            , new Object[] {
            P02UX3_A396EmprCod, P02UX3_A2804RecLinMaq, P02UX3_A130BarCodPar, P02UX3_A132BarCodReo, P02UX3_A129BarCod
            }
            , new Object[] {
            P02UX4_A396EmprCod, P02UX4_A2804RecLinMaq, P02UX4_A130BarCodPar, P02UX4_A132BarCodReo, P02UX4_A129BarCod, P02UX4_A4695RecVolPrf, P02UX4_A1273RecLinPro
            }
            , new Object[] {
            P02UX5_A396EmprCod, P02UX5_A130BarCodPar, P02UX5_A132BarCodReo, P02UX5_A129BarCod, P02UX5_A3030BarPlf, P02UX5_A212BarSer
            }
            , new Object[] {
            P02UX6_A396EmprCod, P02UX6_A130BarCodPar, P02UX6_A132BarCodReo, P02UX6_A129BarCod, P02UX6_A252CliCod, P02UX6_n252CliCod, P02UX6_A212BarSer, P02UX6_A135BarColNom, P02UX6_A136BarColNum, P02UX6_A218BarTipCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV111F_Reccol ;
   private byte AV115Fase_nt ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV26RelBany ;
   private byte AV85LenVar ;
   private byte AV89Pos_pu_n ;
   private byte AV35Familia ;
   private byte AV27RelBanIni ;
   private byte AV28RelBanFin ;
   private byte AV113Opi ;
   private byte AV50FlagCol ;
   private byte A218BarTipCol ;
   private byte GXv_int6[] ;
   private byte GXv_int1[] ;
   private byte GXv_int8[] ;
   private short AV67BarLinMaq ;
   private short A2804RecLinMaq ;
   private short A5408RecLinCol ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private int A4695RecVolPrf ;
   private int AV124RecVolPrf ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int GXv_int4[] ;
   private int GXv_int10[] ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal AV82ColIni_5 ;
   private java.math.BigDecimal AV84ColFin_5 ;
   private java.math.BigDecimal AV36TotCol ;
   private java.math.BigDecimal AV75TotCol2 ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV125Valor ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV122Displa ;
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
   private String AV120Amostras ;
   private String AV121Mercerizar ;
   private String AV126UsaForm ;
   private String AV118Colorteca ;
   private String AV119Formula ;
   private String A135BarColNom ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private boolean n252CliCod ;
   private short[] aP10 ;
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
   private IDataStoreProvider pr_default ;
   private String[] P02UX2_A396EmprCod ;
   private short[] P02UX2_A2804RecLinMaq ;
   private String[] P02UX2_A130BarCodPar ;
   private byte[] P02UX2_A132BarCodReo ;
   private int[] P02UX2_A129BarCod ;
   private short[] P02UX2_A5408RecLinCol ;
   private String[] P02UX3_A396EmprCod ;
   private short[] P02UX3_A2804RecLinMaq ;
   private String[] P02UX3_A130BarCodPar ;
   private byte[] P02UX3_A132BarCodReo ;
   private int[] P02UX3_A129BarCod ;
   private String[] P02UX4_A396EmprCod ;
   private short[] P02UX4_A2804RecLinMaq ;
   private String[] P02UX4_A130BarCodPar ;
   private byte[] P02UX4_A132BarCodReo ;
   private int[] P02UX4_A129BarCod ;
   private int[] P02UX4_A4695RecVolPrf ;
   private byte[] P02UX4_A1273RecLinPro ;
   private String[] P02UX5_A396EmprCod ;
   private String[] P02UX5_A130BarCodPar ;
   private byte[] P02UX5_A132BarCodReo ;
   private int[] P02UX5_A129BarCod ;
   private String[] P02UX5_A3030BarPlf ;
   private String[] P02UX5_A212BarSer ;
   private String[] P02UX6_A396EmprCod ;
   private String[] P02UX6_A130BarCodPar ;
   private byte[] P02UX6_A132BarCodReo ;
   private int[] P02UX6_A129BarCod ;
   private int[] P02UX6_A252CliCod ;
   private boolean[] P02UX6_n252CliCod ;
   private String[] P02UX6_A212BarSer ;
   private String[] P02UX6_A135BarColNom ;
   private int[] P02UX6_A136BarColNum ;
   private byte[] P02UX6_A218BarTipCol ;
}

final  class pcladi0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02UX2", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02UX3", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02UX4", "SELECT * FROM (SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecVolPrf, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02UX5", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarPlf, BarSer FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02UX6", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

