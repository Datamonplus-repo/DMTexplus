package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psimcla extends GXProcedure
{
   public psimcla( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psimcla.class ), "" );
   }

   public psimcla( int remoteHandle ,
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
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             int[] aP14 ,
                             byte[] aP15 ,
                             byte[] aP16 )
   {
      psimcla.this.aP17 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
      return aP17[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        short[] aP12 ,
                        String[] aP13 ,
                        int[] aP14 ,
                        byte[] aP15 ,
                        byte[] aP16 ,
                        String[] aP17 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             int[] aP14 ,
                             byte[] aP15 ,
                             byte[] aP16 ,
                             String[] aP17 )
   {
      psimcla.this.AV75EmprCod = aP0[0];
      this.aP0 = aP0;
      psimcla.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      psimcla.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      psimcla.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      psimcla.this.AV52CliCod = aP4[0];
      this.aP4 = aP4;
      psimcla.this.AV68ArtCod = aP5[0];
      this.aP5 = aP5;
      psimcla.this.AV21TotKil = aP6[0];
      this.aP6 = aP6;
      psimcla.this.AV22PrdDesc = aP7[0];
      this.aP7 = aP7;
      psimcla.this.AV23Accion = aP8[0];
      this.aP8 = aP8;
      psimcla.this.AV67BarLinMaq = aP9[0];
      this.aP9 = aP9;
      psimcla.this.AV69Volumen = aP10[0];
      this.aP10 = aP10;
      psimcla.this.AV70MaqCod = aP11[0];
      this.aP11 = aP11;
      psimcla.this.AV71MatizForm = aP12[0];
      this.aP12 = aP12;
      psimcla.this.AV47ForColNom = aP13[0];
      this.aP13 = aP13;
      psimcla.this.AV48ForColNum = aP14[0];
      this.aP14 = aP14;
      psimcla.this.AV49TipColCod = aP15[0];
      this.aP15 = aP15;
      psimcla.this.AV73IntCodFor = aP16[0];
      this.aP16 = aP16;
      psimcla.this.AV106Procodi = aP17[0];
      this.aP17 = aP17;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV115Clavec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV75EmprCod, httpContext.getMessage( "CLAVEC", ""), GXv_int2) ;
      psimcla.this.GXt_int1 = GXv_int2[0] ;
      AV115Clavec = GXt_int1 ;
      AV24Opcion = GXutil.substring( AV16Clave, 1, 2) ;
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AF", "")) == 0 )
      {
         AV25Fibra = GXutil.substring( AV16Clave, 4, 3) ;
         AV23Accion = GXutil.substring( AV16Clave, 8, 1) ;
         /* Using cursor P00VT2 */
         pr_default.execute(0, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A65ArtCod = P00VT2_A65ArtCod[0] ;
            A252CliCod = P00VT2_A252CliCod[0] ;
            A396EmprCod = P00VT2_A396EmprCod[0] ;
            A107ArtTra3 = P00VT2_A107ArtTra3[0] ;
            n107ArtTra3 = P00VT2_n107ArtTra3[0] ;
            A106ArtTra2 = P00VT2_A106ArtTra2[0] ;
            n106ArtTra2 = P00VT2_n106ArtTra2[0] ;
            A105ArtTra1 = P00VT2_A105ArtTra1[0] ;
            n105ArtTra1 = P00VT2_n105ArtTra1[0] ;
            if ( ( GXutil.strcmp(A105ArtTra1, AV25Fibra) == 0 ) || ( GXutil.strcmp(A106ArtTra2, AV25Fibra) == 0 ) || ( GXutil.strcmp(A107ArtTra3, AV25Fibra) == 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "RB", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 10, 1) ;
         AV26RelBany = (byte)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV69Volumen).divide(AV21TotKil, 18, java.math.RoundingMode.DOWN)), 0))) ;
         AV27RelBanIni = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 4, 2))) ;
         AV28RelBanFin = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 7, 2))) ;
         if ( ( AV26RelBany >= AV27RelBanIni ) && ( AV26RelBany <= AV28RelBanFin ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AR", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 9, 1) ;
         AV29TipArt = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 4))) ;
         /* Using cursor P00VT3 */
         pr_default.execute(1, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod, Short.valueOf(AV29TipArt)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A829TipArtCod = P00VT3_A829TipArtCod[0] ;
            A65ArtCod = P00VT3_A65ArtCod[0] ;
            A252CliCod = P00VT3_A252CliCod[0] ;
            A396EmprCod = P00VT3_A396EmprCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "MQ", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
         AV30CodMaq = GXutil.substring( AV16Clave, 4, 6) ;
         if ( GXutil.like( AV70MaqCod , GXutil.padr( AV30CodMaq , 6 , "%"),  ' ' ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "MA", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 8, 1) ;
         AV31Matiz = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 3))) ;
         if ( AV71MatizForm == AV31Matiz )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TC", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 14, 1) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 3, 5) ;
         GXv_char3[0] = AV76Ini_5 ;
         GXv_char4[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char3, GXv_char4) ;
         psimcla.this.AV76Ini_5 = GXv_char3[0] ;
         psimcla.this.AV77Inip_5 = GXv_char4[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char4[0] = AV78Fin_5 ;
         GXv_char3[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         psimcla.this.AV78Fin_5 = GXv_char4[0] ;
         psimcla.this.AV81Finp_5 = GXv_char3[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         if ( AV115Clavec == 0 )
         {
            GXv_char4[0] = AV75EmprCod ;
            GXv_int5[0] = AV52CliCod ;
            GXv_char3[0] = AV68ArtCod ;
            GXv_char6[0] = AV47ForColNom ;
            GXv_int7[0] = AV48ForColNum ;
            GXv_int2[0] = AV49TipColCod ;
            GXv_int8[0] = AV35Familia ;
            GXv_decimal9[0] = AV36TotCol ;
            GXv_int10[0] = AV50FlagCol ;
            new app.pclaesp3(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char6, GXv_int7, GXv_int2, GXv_int8, GXv_decimal9, GXv_int10) ;
            psimcla.this.AV75EmprCod = GXv_char4[0] ;
            psimcla.this.AV52CliCod = GXv_int5[0] ;
            psimcla.this.AV68ArtCod = GXv_char3[0] ;
            psimcla.this.AV47ForColNom = GXv_char6[0] ;
            psimcla.this.AV48ForColNum = GXv_int7[0] ;
            psimcla.this.AV49TipColCod = GXv_int2[0] ;
            psimcla.this.AV35Familia = GXv_int8[0] ;
            psimcla.this.AV36TotCol = GXv_decimal9[0] ;
            psimcla.this.AV50FlagCol = GXv_int10[0] ;
         }
         else
         {
            GXv_char6[0] = AV75EmprCod ;
            GXv_int7[0] = AV52CliCod ;
            GXv_char4[0] = AV68ArtCod ;
            GXv_char3[0] = AV47ForColNom ;
            GXv_int5[0] = AV48ForColNum ;
            GXv_int10[0] = AV49TipColCod ;
            GXv_int8[0] = AV35Familia ;
            GXv_decimal9[0] = AV36TotCol ;
            GXv_int2[0] = AV50FlagCol ;
            GXv_decimal11[0] = AV21TotKil ;
            GXv_int12[0] = AV67BarLinMaq ;
            GXv_decimal13[0] = DecimalUtil.doubleToDec(AV69Volumen) ;
            GXv_char14[0] = AV70MaqCod ;
            GXv_char15[0] = AV106Procodi ;
            new app.pclaes3b(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char4, GXv_char3, GXv_int5, GXv_int10, GXv_int8, GXv_decimal9, GXv_int2, GXv_decimal11, GXv_int12, GXv_decimal13, GXv_char14, GXv_char15) ;
            psimcla.this.AV75EmprCod = GXv_char6[0] ;
            psimcla.this.AV52CliCod = GXv_int7[0] ;
            psimcla.this.AV68ArtCod = GXv_char4[0] ;
            psimcla.this.AV47ForColNom = GXv_char3[0] ;
            psimcla.this.AV48ForColNum = GXv_int5[0] ;
            psimcla.this.AV49TipColCod = GXv_int10[0] ;
            psimcla.this.AV35Familia = GXv_int8[0] ;
            psimcla.this.AV36TotCol = GXv_decimal9[0] ;
            psimcla.this.AV50FlagCol = GXv_int2[0] ;
            psimcla.this.AV21TotKil = GXv_decimal11[0] ;
            psimcla.this.AV67BarLinMaq = GXv_int12[0] ;
            psimcla.this.AV69Volumen = (int)(DecimalUtil.decToDouble(GXv_decimal13[0])) ;
            psimcla.this.AV70MaqCod = GXv_char14[0] ;
            psimcla.this.AV106Procodi = GXv_char15[0] ;
         }
         AV92TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV92TotCol2, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AC", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 14, 1) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 3, 5) ;
         GXv_char15[0] = AV76Ini_5 ;
         GXv_char14[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char15, GXv_char14) ;
         psimcla.this.AV76Ini_5 = GXv_char15[0] ;
         psimcla.this.AV77Inip_5 = GXv_char14[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char15[0] = AV78Fin_5 ;
         GXv_char14[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char15, GXv_char14) ;
         psimcla.this.AV78Fin_5 = GXv_char15[0] ;
         psimcla.this.AV81Finp_5 = GXv_char14[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV38Producto = GXutil.substring( AV22PrdDesc, 1, 6) ;
         AV15Descrip = AV38Producto ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         if ( AV115Clavec == 0 )
         {
            GXv_char15[0] = AV75EmprCod ;
            GXv_int7[0] = AV52CliCod ;
            GXv_char14[0] = AV68ArtCod ;
            GXv_char6[0] = AV47ForColNom ;
            GXv_int5[0] = AV48ForColNum ;
            GXv_int10[0] = AV49TipColCod ;
            GXv_char4[0] = AV38Producto ;
            GXv_decimal13[0] = AV36TotCol ;
            GXv_int8[0] = AV50FlagCol ;
            new app.pclaesp2(remoteHandle, context).execute( GXv_char15, GXv_int7, GXv_char14, GXv_char6, GXv_int5, GXv_int10, GXv_char4, GXv_decimal13, GXv_int8) ;
            psimcla.this.AV75EmprCod = GXv_char15[0] ;
            psimcla.this.AV52CliCod = GXv_int7[0] ;
            psimcla.this.AV68ArtCod = GXv_char14[0] ;
            psimcla.this.AV47ForColNom = GXv_char6[0] ;
            psimcla.this.AV48ForColNum = GXv_int5[0] ;
            psimcla.this.AV49TipColCod = GXv_int10[0] ;
            psimcla.this.AV38Producto = GXv_char4[0] ;
            psimcla.this.AV36TotCol = GXv_decimal13[0] ;
            psimcla.this.AV50FlagCol = GXv_int8[0] ;
         }
         else
         {
            GXv_char15[0] = AV75EmprCod ;
            GXv_int7[0] = AV52CliCod ;
            GXv_char14[0] = AV68ArtCod ;
            GXv_char6[0] = AV47ForColNom ;
            GXv_int5[0] = AV48ForColNum ;
            GXv_int10[0] = AV49TipColCod ;
            GXv_char4[0] = AV38Producto ;
            GXv_decimal13[0] = AV36TotCol ;
            GXv_int8[0] = AV50FlagCol ;
            GXv_decimal11[0] = AV21TotKil ;
            GXv_int12[0] = AV67BarLinMaq ;
            GXv_decimal9[0] = DecimalUtil.doubleToDec(AV69Volumen) ;
            GXv_char3[0] = AV70MaqCod ;
            GXv_char16[0] = AV106Procodi ;
            new app.pclaes2b(remoteHandle, context).execute( GXv_char15, GXv_int7, GXv_char14, GXv_char6, GXv_int5, GXv_int10, GXv_char4, GXv_decimal13, GXv_int8, GXv_decimal11, GXv_int12, GXv_decimal9, GXv_char3, GXv_char16) ;
            psimcla.this.AV75EmprCod = GXv_char15[0] ;
            psimcla.this.AV52CliCod = GXv_int7[0] ;
            psimcla.this.AV68ArtCod = GXv_char14[0] ;
            psimcla.this.AV47ForColNom = GXv_char6[0] ;
            psimcla.this.AV48ForColNum = GXv_int5[0] ;
            psimcla.this.AV49TipColCod = GXv_int10[0] ;
            psimcla.this.AV38Producto = GXv_char4[0] ;
            psimcla.this.AV36TotCol = GXv_decimal13[0] ;
            psimcla.this.AV50FlagCol = GXv_int8[0] ;
            psimcla.this.AV21TotKil = GXv_decimal11[0] ;
            psimcla.this.AV67BarLinMaq = GXv_int12[0] ;
            psimcla.this.AV69Volumen = (int)(DecimalUtil.decToDouble(GXv_decimal9[0])) ;
            psimcla.this.AV70MaqCod = GXv_char3[0] ;
            psimcla.this.AV106Procodi = GXv_char16[0] ;
         }
         AV92TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV92TotCol2, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "PR", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
         AV39Proceso = GXutil.substring( AV16Clave, 4, 6) ;
         AV40FlagPro = (byte)(0) ;
         GXt_char17 = AV66Station ;
         GXv_char16[0] = GXt_char17 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char16) ;
         psimcla.this.GXt_char17 = GXv_char16[0] ;
         AV66Station = GXt_char17 ;
         /* Using cursor P00VT4 */
         pr_default.execute(2, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod), AV39Proceso});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A764ProForCod = P00VT4_A764ProForCod[0] ;
            A831TipColCod = P00VT4_A831TipColCod[0] ;
            A483ForColNum = P00VT4_A483ForColNum[0] ;
            A482ForColNom = P00VT4_A482ForColNom[0] ;
            A494ForSer = P00VT4_A494ForSer[0] ;
            A252CliCod = P00VT4_A252CliCod[0] ;
            A396EmprCod = P00VT4_A396EmprCod[0] ;
            A1160ProForL = P00VT4_A1160ProForL[0] ;
            AV40FlagPro = (byte)(1) ;
            AV17PrdVal = (byte)(1) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "IT", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 7, 1) ;
         AV51IntCod = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 4, 2))) ;
         if ( AV73IntCodFor == AV51IntCod )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CL", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
         AV74CliCodCla = (int)(GXutil.lval( GXutil.substring( AV16Clave, 4, 6))) ;
         if ( AV52CliCod == AV74CliCodCla )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TN", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 14, 1) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 3, 5) ;
         GXv_char16[0] = AV76Ini_5 ;
         GXv_char15[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char16, GXv_char15) ;
         psimcla.this.AV76Ini_5 = GXv_char16[0] ;
         psimcla.this.AV77Inip_5 = GXv_char15[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char16[0] = AV78Fin_5 ;
         GXv_char15[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char16, GXv_char15) ;
         psimcla.this.AV78Fin_5 = GXv_char16[0] ;
         psimcla.this.AV81Finp_5 = GXv_char15[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         if ( AV115Clavec == 0 )
         {
            GXv_char16[0] = AV75EmprCod ;
            GXv_int7[0] = AV52CliCod ;
            GXv_char15[0] = AV68ArtCod ;
            GXv_char14[0] = AV47ForColNom ;
            GXv_int5[0] = AV48ForColNum ;
            GXv_int10[0] = AV49TipColCod ;
            GXv_int8[0] = AV35Familia ;
            GXv_decimal13[0] = AV36TotCol ;
            GXv_int2[0] = AV50FlagCol ;
            new app.pclaesp3(remoteHandle, context).execute( GXv_char16, GXv_int7, GXv_char15, GXv_char14, GXv_int5, GXv_int10, GXv_int8, GXv_decimal13, GXv_int2) ;
            psimcla.this.AV75EmprCod = GXv_char16[0] ;
            psimcla.this.AV52CliCod = GXv_int7[0] ;
            psimcla.this.AV68ArtCod = GXv_char15[0] ;
            psimcla.this.AV47ForColNom = GXv_char14[0] ;
            psimcla.this.AV48ForColNum = GXv_int5[0] ;
            psimcla.this.AV49TipColCod = GXv_int10[0] ;
            psimcla.this.AV35Familia = GXv_int8[0] ;
            psimcla.this.AV36TotCol = GXv_decimal13[0] ;
            psimcla.this.AV50FlagCol = GXv_int2[0] ;
         }
         else
         {
            GXv_char16[0] = AV75EmprCod ;
            GXv_int7[0] = AV52CliCod ;
            GXv_char15[0] = AV68ArtCod ;
            GXv_char14[0] = AV47ForColNom ;
            GXv_int5[0] = AV48ForColNum ;
            GXv_int10[0] = AV49TipColCod ;
            GXv_int8[0] = AV35Familia ;
            GXv_decimal13[0] = AV36TotCol ;
            GXv_int2[0] = AV50FlagCol ;
            GXv_decimal11[0] = AV21TotKil ;
            GXv_int12[0] = AV67BarLinMaq ;
            GXv_decimal9[0] = DecimalUtil.doubleToDec(AV69Volumen) ;
            GXv_char6[0] = AV70MaqCod ;
            GXv_char4[0] = AV106Procodi ;
            new app.pclaes3b(remoteHandle, context).execute( GXv_char16, GXv_int7, GXv_char15, GXv_char14, GXv_int5, GXv_int10, GXv_int8, GXv_decimal13, GXv_int2, GXv_decimal11, GXv_int12, GXv_decimal9, GXv_char6, GXv_char4) ;
            psimcla.this.AV75EmprCod = GXv_char16[0] ;
            psimcla.this.AV52CliCod = GXv_int7[0] ;
            psimcla.this.AV68ArtCod = GXv_char15[0] ;
            psimcla.this.AV47ForColNom = GXv_char14[0] ;
            psimcla.this.AV48ForColNum = GXv_int5[0] ;
            psimcla.this.AV49TipColCod = GXv_int10[0] ;
            psimcla.this.AV35Familia = GXv_int8[0] ;
            psimcla.this.AV36TotCol = GXv_decimal13[0] ;
            psimcla.this.AV50FlagCol = GXv_int2[0] ;
            psimcla.this.AV21TotKil = GXv_decimal11[0] ;
            psimcla.this.AV67BarLinMaq = GXv_int12[0] ;
            psimcla.this.AV69Volumen = (int)(DecimalUtil.decToDouble(GXv_decimal9[0])) ;
            psimcla.this.AV70MaqCod = GXv_char6[0] ;
            psimcla.this.AV106Procodi = GXv_char4[0] ;
         }
         AV84F_ok_sb = httpContext.getMessage( "N", "") ;
         AV85LenVar = (byte)(GXutil.len( GXutil.trim( AV68ArtCod))) ;
         AV86Pos_pu_n = (byte)(AV85LenVar-1) ;
         AV87Pos_pu = GXutil.substring( AV68ArtCod, AV86Pos_pu_n, 2) ;
         if ( GXutil.strcmp(AV87Pos_pu, httpContext.getMessage( "NM", "")) == 0 )
         {
            AV84F_ok_sb = httpContext.getMessage( "S", "") ;
         }
         AV92TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) && ( GXutil.strcmp(AV84F_ok_sb, httpContext.getMessage( "S", "")) == 0 ) )
         {
            if ( ( DecimalUtil.compareTo(AV92TotCol2, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TM", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 14, 1) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 3, 5) ;
         GXv_char16[0] = AV76Ini_5 ;
         GXv_char15[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char16, GXv_char15) ;
         psimcla.this.AV76Ini_5 = GXv_char16[0] ;
         psimcla.this.AV77Inip_5 = GXv_char15[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char16[0] = AV78Fin_5 ;
         GXv_char15[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char16, GXv_char15) ;
         psimcla.this.AV78Fin_5 = GXv_char16[0] ;
         psimcla.this.AV81Finp_5 = GXv_char15[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         if ( AV115Clavec == 0 )
         {
            GXv_char16[0] = AV75EmprCod ;
            GXv_int7[0] = AV52CliCod ;
            GXv_char15[0] = AV68ArtCod ;
            GXv_char14[0] = AV47ForColNom ;
            GXv_int5[0] = AV48ForColNum ;
            GXv_int10[0] = AV49TipColCod ;
            GXv_int8[0] = AV35Familia ;
            GXv_decimal13[0] = AV36TotCol ;
            GXv_int2[0] = AV50FlagCol ;
            new app.pclaesp3(remoteHandle, context).execute( GXv_char16, GXv_int7, GXv_char15, GXv_char14, GXv_int5, GXv_int10, GXv_int8, GXv_decimal13, GXv_int2) ;
            psimcla.this.AV75EmprCod = GXv_char16[0] ;
            psimcla.this.AV52CliCod = GXv_int7[0] ;
            psimcla.this.AV68ArtCod = GXv_char15[0] ;
            psimcla.this.AV47ForColNom = GXv_char14[0] ;
            psimcla.this.AV48ForColNum = GXv_int5[0] ;
            psimcla.this.AV49TipColCod = GXv_int10[0] ;
            psimcla.this.AV35Familia = GXv_int8[0] ;
            psimcla.this.AV36TotCol = GXv_decimal13[0] ;
            psimcla.this.AV50FlagCol = GXv_int2[0] ;
         }
         else
         {
            GXv_char16[0] = AV75EmprCod ;
            GXv_int7[0] = AV52CliCod ;
            GXv_char15[0] = AV68ArtCod ;
            GXv_char14[0] = AV47ForColNom ;
            GXv_int5[0] = AV48ForColNum ;
            GXv_int10[0] = AV49TipColCod ;
            GXv_int8[0] = AV35Familia ;
            GXv_decimal13[0] = AV36TotCol ;
            GXv_int2[0] = AV50FlagCol ;
            GXv_decimal11[0] = AV21TotKil ;
            GXv_int12[0] = AV67BarLinMaq ;
            GXv_decimal9[0] = DecimalUtil.doubleToDec(AV69Volumen) ;
            GXv_char6[0] = AV70MaqCod ;
            GXv_char4[0] = AV106Procodi ;
            new app.pclaes3b(remoteHandle, context).execute( GXv_char16, GXv_int7, GXv_char15, GXv_char14, GXv_int5, GXv_int10, GXv_int8, GXv_decimal13, GXv_int2, GXv_decimal11, GXv_int12, GXv_decimal9, GXv_char6, GXv_char4) ;
            psimcla.this.AV75EmprCod = GXv_char16[0] ;
            psimcla.this.AV52CliCod = GXv_int7[0] ;
            psimcla.this.AV68ArtCod = GXv_char15[0] ;
            psimcla.this.AV47ForColNom = GXv_char14[0] ;
            psimcla.this.AV48ForColNum = GXv_int5[0] ;
            psimcla.this.AV49TipColCod = GXv_int10[0] ;
            psimcla.this.AV35Familia = GXv_int8[0] ;
            psimcla.this.AV36TotCol = GXv_decimal13[0] ;
            psimcla.this.AV50FlagCol = GXv_int2[0] ;
            psimcla.this.AV21TotKil = GXv_decimal11[0] ;
            psimcla.this.AV67BarLinMaq = GXv_int12[0] ;
            psimcla.this.AV69Volumen = (int)(DecimalUtil.decToDouble(GXv_decimal9[0])) ;
            psimcla.this.AV70MaqCod = GXv_char6[0] ;
            psimcla.this.AV106Procodi = GXv_char4[0] ;
         }
         AV84F_ok_sb = httpContext.getMessage( "N", "") ;
         AV85LenVar = (byte)(GXutil.len( GXutil.trim( AV68ArtCod))) ;
         AV93Pos_u = GXutil.substring( AV68ArtCod, AV85LenVar, 1) ;
         AV86Pos_pu_n = (byte)(AV85LenVar-1) ;
         if ( GXutil.strcmp(AV93Pos_u, httpContext.getMessage( "M", "")) == 0 )
         {
            AV87Pos_pu = GXutil.substring( AV68ArtCod, AV86Pos_pu_n, 2) ;
            if ( GXutil.strcmp(AV87Pos_pu, httpContext.getMessage( "NM", "")) == 0 )
            {
               AV84F_ok_sb = httpContext.getMessage( "N", "") ;
            }
            else
            {
               AV84F_ok_sb = httpContext.getMessage( "S", "") ;
            }
         }
         AV92TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) && ( GXutil.strcmp(AV84F_ok_sb, httpContext.getMessage( "S", "")) == 0 ) )
         {
            if ( ( DecimalUtil.compareTo(AV92TotCol2, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "IF", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 10, 1) ;
         AV51IntCod = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 4, 2))) ;
         AV89Family = GXutil.substring( AV16Clave, 7, 2) ;
         AV83ForNumCol = 0 ;
         /* Using cursor P00VT5 */
         pr_default.execute(3, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A831TipColCod = P00VT5_A831TipColCod[0] ;
            A483ForColNum = P00VT5_A483ForColNum[0] ;
            A482ForColNom = P00VT5_A482ForColNom[0] ;
            A494ForSer = P00VT5_A494ForSer[0] ;
            A252CliCod = P00VT5_A252CliCod[0] ;
            A396EmprCod = P00VT5_A396EmprCod[0] ;
            A486ForNumCol = P00VT5_A486ForNumCol[0] ;
            AV83ForNumCol = A486ForNumCol ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         /* Execute user subroutine: 'COLORANTES' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV82Ok_intens = (byte)(0) ;
         if ( AV51IntCod == AV73IntCodFor )
         {
            AV82Ok_intens = (byte)(1) ;
         }
         if ( ( AV91Ok_family == 1 ) && ( AV82Ok_intens == 1 ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "MM", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
         AV31Matiz = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 3))) ;
         AV89Family = GXutil.substring( AV16Clave, 8, 2) ;
         AV95Ok_matiz = (byte)(0) ;
         if ( AV71MatizForm == AV31Matiz )
         {
            AV95Ok_matiz = (byte)(1) ;
         }
         /* Execute user subroutine: 'COLORANTES' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( GXutil.strcmp(AV94VAcc, httpContext.getMessage( "S", "")) == 0 ) && ( AV91Ok_family == 1 ) && ( AV95Ok_matiz == 1 ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C1", "")) == 0 )
      {
         AV96ArtCod_1 = GXutil.substring( AV16Clave, 4, 16) ;
         AV23Accion = GXutil.substring( AV16Clave, 21, 1) ;
         AV85LenVar = (byte)(GXutil.len( GXutil.trim( AV96ArtCod_1))) ;
         AV97ArtCod_2 = GXutil.substring( AV68ArtCod, 1, AV85LenVar) ;
         if ( GXutil.strcmp(AV96ArtCod_1, AV97ArtCod_2) == 0 )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C2", "")) == 0 )
      {
         AV98ColNom_1 = GXutil.substring( AV16Clave, 4, 13) ;
         AV23Accion = GXutil.substring( AV16Clave, 18, 1) ;
         AV85LenVar = (byte)(GXutil.len( GXutil.trim( AV98ColNom_1))) ;
         AV99ColNom_2 = GXutil.substring( AV47ForColNom, 1, AV85LenVar) ;
         if ( GXutil.strcmp(AV98ColNom_1, AV99ColNom_2) == 0 )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C3", "")) == 0 )
      {
         AV51IntCod = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 4, 2))) ;
         AV113Con_Ant = GXutil.substring( AV16Clave, 7, 1) ;
         AV23Accion = GXutil.substring( AV16Clave, 9, 1) ;
         if ( ( AV51IntCod == AV73IntCodFor ) && ( GXutil.strcmp(AV113Con_Ant, AV100BarAntp) == 0 ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CA", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         AV74CliCodCla = (int)(GXutil.lval( GXutil.substring( AV16Clave, 4, 6))) ;
         AV29TipArt = (short)(GXutil.lval( GXutil.substring( AV16Clave, 11, 4))) ;
         AV101TipArti = (short)(0) ;
         /* Using cursor P00VT6 */
         pr_default.execute(4, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod, Short.valueOf(AV29TipArt)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A829TipArtCod = P00VT6_A829TipArtCod[0] ;
            A65ArtCod = P00VT6_A65ArtCod[0] ;
            A252CliCod = P00VT6_A252CliCod[0] ;
            A396EmprCod = P00VT6_A396EmprCod[0] ;
            AV101TipArti = A829TipArtCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         if ( ( AV52CliCod == AV74CliCodCla ) && ( AV101TipArti == AV29TipArt ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "GM", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 7, 1) ;
         AV110Mq_grupo = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 4, 2))) ;
         /* Using cursor P00VT7 */
         pr_default.execute(5, new Object[] {Byte.valueOf(AV110Mq_grupo)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A6037Mq_Grupo = P00VT7_A6037Mq_Grupo[0] ;
            A602MaqCod = P00VT7_A602MaqCod[0] ;
            A396EmprCod = P00VT7_A396EmprCod[0] ;
            if ( GXutil.strcmp(AV70MaqCod, A602MaqCod) == 0 )
            {
               AV17PrdVal = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      if ( GXutil.strcmp(GXutil.substring( AV24Opcion, 1, 1), httpContext.getMessage( "B", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         AV114GruMaq = GXutil.substring( AV16Clave, 2, 4) + "%" ;
         AV107TotColMin = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 6, 2), ".").add(CommonUtil.decimalVal( GXutil.substring( AV16Clave, 8, 2), ".").divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)) ;
         AV108TotColMax = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 10, 2), ".").add(CommonUtil.decimalVal( GXutil.substring( AV16Clave, 12, 2), ".").divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)) ;
         AV109TipCol = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 14, 2))) ;
         Gx_msg = httpContext.getMessage( "Clave S", "") + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Grupo Maquinas : ", "") + AV114GruMaq + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Min Colorante : ", "") + GXutil.trim( GXutil.str( AV107TotColMin, 10, 2)) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Max Colorante : ", "") + GXutil.trim( GXutil.str( AV108TotColMax, 10, 2)) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Tipo Colorante : ", "") + GXutil.trim( GXutil.str( AV109TipCol, 10, 0)) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Datos Simulacion ", "") + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Maquina : ", "") + AV70MaqCod + GXutil.chr( (short)(13)) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         AV50FlagCol = (byte)(0) ;
         if ( GXutil.like( AV70MaqCod , GXutil.padr( AV114GruMaq , 6 , "%"),  ' ' ) )
         {
            if ( AV115Clavec == 0 )
            {
               GXv_char16[0] = AV75EmprCod ;
               GXv_int7[0] = AV52CliCod ;
               GXv_char15[0] = AV68ArtCod ;
               GXv_char14[0] = AV47ForColNom ;
               GXv_int5[0] = AV48ForColNum ;
               GXv_int10[0] = AV49TipColCod ;
               GXv_int8[0] = AV109TipCol ;
               GXv_decimal13[0] = AV36TotCol ;
               GXv_int2[0] = AV50FlagCol ;
               new app.pclaesp3(remoteHandle, context).execute( GXv_char16, GXv_int7, GXv_char15, GXv_char14, GXv_int5, GXv_int10, GXv_int8, GXv_decimal13, GXv_int2) ;
               psimcla.this.AV75EmprCod = GXv_char16[0] ;
               psimcla.this.AV52CliCod = GXv_int7[0] ;
               psimcla.this.AV68ArtCod = GXv_char15[0] ;
               psimcla.this.AV47ForColNom = GXv_char14[0] ;
               psimcla.this.AV48ForColNum = GXv_int5[0] ;
               psimcla.this.AV49TipColCod = GXv_int10[0] ;
               psimcla.this.AV109TipCol = GXv_int8[0] ;
               psimcla.this.AV36TotCol = GXv_decimal13[0] ;
               psimcla.this.AV50FlagCol = GXv_int2[0] ;
            }
            else
            {
               GXv_char16[0] = AV75EmprCod ;
               GXv_int7[0] = AV52CliCod ;
               GXv_char15[0] = AV68ArtCod ;
               GXv_char14[0] = AV47ForColNom ;
               GXv_int5[0] = AV48ForColNum ;
               GXv_int10[0] = AV49TipColCod ;
               GXv_int8[0] = AV109TipCol ;
               GXv_decimal13[0] = AV36TotCol ;
               GXv_int2[0] = AV50FlagCol ;
               GXv_decimal11[0] = AV21TotKil ;
               GXv_int12[0] = AV67BarLinMaq ;
               GXv_decimal9[0] = DecimalUtil.doubleToDec(AV69Volumen) ;
               GXv_char6[0] = AV70MaqCod ;
               GXv_char4[0] = AV106Procodi ;
               new app.pclaes3b(remoteHandle, context).execute( GXv_char16, GXv_int7, GXv_char15, GXv_char14, GXv_int5, GXv_int10, GXv_int8, GXv_decimal13, GXv_int2, GXv_decimal11, GXv_int12, GXv_decimal9, GXv_char6, GXv_char4) ;
               psimcla.this.AV75EmprCod = GXv_char16[0] ;
               psimcla.this.AV52CliCod = GXv_int7[0] ;
               psimcla.this.AV68ArtCod = GXv_char15[0] ;
               psimcla.this.AV47ForColNom = GXv_char14[0] ;
               psimcla.this.AV48ForColNum = GXv_int5[0] ;
               psimcla.this.AV49TipColCod = GXv_int10[0] ;
               psimcla.this.AV109TipCol = GXv_int8[0] ;
               psimcla.this.AV36TotCol = GXv_decimal13[0] ;
               psimcla.this.AV50FlagCol = GXv_int2[0] ;
               psimcla.this.AV21TotKil = GXv_decimal11[0] ;
               psimcla.this.AV67BarLinMaq = GXv_int12[0] ;
               psimcla.this.AV69Volumen = (int)(DecimalUtil.decToDouble(GXv_decimal9[0])) ;
               psimcla.this.AV70MaqCod = GXv_char6[0] ;
               psimcla.this.AV106Procodi = GXv_char4[0] ;
            }
            Gx_msg += httpContext.getMessage( "---> Compatible.", "") + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "- Cliente : ", "") + GXutil.trim( GXutil.str( AV52CliCod, 10, 0)) + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "- Articulo : ", "") + GXutil.trim( AV68ArtCod) + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "- Color : ", "") + GXutil.trim( AV47ForColNom) + "/" + GXutil.trim( GXutil.str( AV48ForColNum, 10, 0)) + ":" + GXutil.trim( GXutil.str( AV49TipColCod, 10, 0)) + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "- Salida : TipCol ", "") + GXutil.trim( GXutil.str( AV109TipCol, 10, 0)) + httpContext.getMessage( ",TotCol ", "") + GXutil.trim( GXutil.str( AV36TotCol, 10, 0)) + httpContext.getMessage( ",FlagCol ", "") + GXutil.trim( GXutil.str( AV50FlagCol, 10, 0)) + GXutil.chr( (short)(13)) ;
         }
         else
         {
            Gx_msg += httpContext.getMessage( "---> Incompatible.", "") + GXutil.chr( (short)(13)) ;
         }
         AV92TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV92TotCol2, AV107TotColMin) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV108TotColMax) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
         Gx_msg += httpContext.getMessage( "TotCol : ", "") + GXutil.trim( GXutil.str( AV92TotCol2, 10, 2)) + GXutil.chr( (short)(13)) ;
         Gx_msg += "------------------------" + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Resultado = ", "") + GXutil.trim( GXutil.str( AV17PrdVal, 10, 0)) ;
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "MC", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 15, 1) ;
         AV114GruMaq = GXutil.substring( AV16Clave, 3, 6) ;
         AV111ClasCod = (short)(GXutil.lval( GXutil.substring( AV16Clave, 9, 6))) ;
         AV50FlagCol = (byte)(0) ;
         if ( GXutil.like( AV70MaqCod , GXutil.padr( AV114GruMaq , 6 , "%"),  ' ' ) )
         {
            AV50FlagCol = (byte)(1) ;
         }
         /* Using cursor P00VT8 */
         pr_default.execute(6, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod, Byte.valueOf(AV50FlagCol)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A65ArtCod = P00VT8_A65ArtCod[0] ;
            A252CliCod = P00VT8_A252CliCod[0] ;
            A396EmprCod = P00VT8_A396EmprCod[0] ;
            A4295ClasCod = P00VT8_A4295ClasCod[0] ;
            n4295ClasCod = P00VT8_n4295ClasCod[0] ;
            if ( A4295ClasCod == AV111ClasCod )
            {
               AV17PrdVal = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TP", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 9, 1) ;
         AV111ClasCod = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 4))) ;
         /* Using cursor P00VT9 */
         pr_default.execute(7, new Object[] {AV75EmprCod, Short.valueOf(AV111ClasCod), AV68ArtCod});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A4295ClasCod = P00VT9_A4295ClasCod[0] ;
            n4295ClasCod = P00VT9_n4295ClasCod[0] ;
            A65ArtCod = P00VT9_A65ArtCod[0] ;
            A396EmprCod = P00VT9_A396EmprCod[0] ;
            A252CliCod = P00VT9_A252CliCod[0] ;
            AV17PrdVal = (byte)(1) ;
            pr_default.readNext(7);
         }
         pr_default.close(7);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CC", "")) == 0 )
      {
         AV102CliCodc = (int)(GXutil.lval( GXutil.substring( AV16Clave, 3, 6))) ;
         AV103Colnum = (int)(GXutil.lval( GXutil.substring( AV16Clave, 10, 6))) ;
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         if ( ( AV102CliCodc == AV52CliCod ) && ( AV48ForColNum == AV103Colnum ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "FS", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 13, 1) ;
         AV104Fascod = GXutil.substring( AV16Clave, 4, 8) ;
         if ( GXutil.strcmp(AV106Procodi, " ") == 0 )
         {
            GXv_char16[0] = AV75EmprCod ;
            GXv_int7[0] = AV52CliCod ;
            GXv_char15[0] = AV68ArtCod ;
            GXv_char14[0] = AV104Fascod ;
            GXv_int10[0] = AV17PrdVal ;
            new app.pbuscfs(remoteHandle, context).execute( GXv_char16, GXv_int7, GXv_char15, GXv_char14, GXv_int10) ;
            psimcla.this.AV75EmprCod = GXv_char16[0] ;
            psimcla.this.AV52CliCod = GXv_int7[0] ;
            psimcla.this.AV68ArtCod = GXv_char15[0] ;
            psimcla.this.AV104Fascod = GXv_char14[0] ;
            psimcla.this.AV17PrdVal = GXv_int10[0] ;
         }
         else
         {
            /* Using cursor P00VT10 */
            pr_default.execute(8, new Object[] {AV75EmprCod, AV106Procodi, AV104Fascod});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A457FasCod = P00VT10_A457FasCod[0] ;
               A758ProCod = P00VT10_A758ProCod[0] ;
               A396EmprCod = P00VT10_A396EmprCod[0] ;
               A774ProNumLin = P00VT10_A774ProNumLin[0] ;
               AV17PrdVal = (byte)(1) ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "ST", "")) == 0 )
      {
         AV80ColIni_5 = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 4, 4), ".").divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         AV79ColFin_5 = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 9, 4), ".").divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 14, 2))) ;
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         if ( GXutil.strcmp(AV68ArtCod, GXutil.substring( AV22PrdDesc, 1, 16)) == 0 )
         {
            AV17PrdVal = (byte)(1) ;
         }
         if ( AV17PrdVal == 1 )
         {
            AV17PrdVal = (byte)(0) ;
            AV36TotCol = DecimalUtil.doubleToDec(0) ;
            if ( AV115Clavec == 0 )
            {
               GXv_char16[0] = AV75EmprCod ;
               GXv_int7[0] = AV52CliCod ;
               GXv_char15[0] = AV68ArtCod ;
               GXv_char14[0] = AV47ForColNom ;
               GXv_int5[0] = AV48ForColNum ;
               GXv_int10[0] = AV49TipColCod ;
               GXv_int8[0] = AV35Familia ;
               GXv_decimal13[0] = AV36TotCol ;
               GXv_int2[0] = AV50FlagCol ;
               new app.pclaesp3(remoteHandle, context).execute( GXv_char16, GXv_int7, GXv_char15, GXv_char14, GXv_int5, GXv_int10, GXv_int8, GXv_decimal13, GXv_int2) ;
               psimcla.this.AV75EmprCod = GXv_char16[0] ;
               psimcla.this.AV52CliCod = GXv_int7[0] ;
               psimcla.this.AV68ArtCod = GXv_char15[0] ;
               psimcla.this.AV47ForColNom = GXv_char14[0] ;
               psimcla.this.AV48ForColNum = GXv_int5[0] ;
               psimcla.this.AV49TipColCod = GXv_int10[0] ;
               psimcla.this.AV35Familia = GXv_int8[0] ;
               psimcla.this.AV36TotCol = GXv_decimal13[0] ;
               psimcla.this.AV50FlagCol = GXv_int2[0] ;
            }
            else
            {
               GXv_char16[0] = AV75EmprCod ;
               GXv_int7[0] = AV52CliCod ;
               GXv_char15[0] = AV68ArtCod ;
               GXv_char14[0] = AV47ForColNom ;
               GXv_int5[0] = AV48ForColNum ;
               GXv_int10[0] = AV49TipColCod ;
               GXv_int8[0] = AV35Familia ;
               GXv_decimal13[0] = AV36TotCol ;
               GXv_int2[0] = AV50FlagCol ;
               GXv_decimal11[0] = AV21TotKil ;
               GXv_int12[0] = AV67BarLinMaq ;
               GXv_decimal9[0] = DecimalUtil.doubleToDec(AV69Volumen) ;
               GXv_char6[0] = AV70MaqCod ;
               GXv_char4[0] = AV106Procodi ;
               new app.pclaes3b(remoteHandle, context).execute( GXv_char16, GXv_int7, GXv_char15, GXv_char14, GXv_int5, GXv_int10, GXv_int8, GXv_decimal13, GXv_int2, GXv_decimal11, GXv_int12, GXv_decimal9, GXv_char6, GXv_char4) ;
               psimcla.this.AV75EmprCod = GXv_char16[0] ;
               psimcla.this.AV52CliCod = GXv_int7[0] ;
               psimcla.this.AV68ArtCod = GXv_char15[0] ;
               psimcla.this.AV47ForColNom = GXv_char14[0] ;
               psimcla.this.AV48ForColNum = GXv_int5[0] ;
               psimcla.this.AV49TipColCod = GXv_int10[0] ;
               psimcla.this.AV35Familia = GXv_int8[0] ;
               psimcla.this.AV36TotCol = GXv_decimal13[0] ;
               psimcla.this.AV50FlagCol = GXv_int2[0] ;
               psimcla.this.AV21TotKil = GXv_decimal11[0] ;
               psimcla.this.AV67BarLinMaq = GXv_int12[0] ;
               psimcla.this.AV69Volumen = (int)(DecimalUtil.decToDouble(GXv_decimal9[0])) ;
               psimcla.this.AV70MaqCod = GXv_char6[0] ;
               psimcla.this.AV106Procodi = GXv_char4[0] ;
            }
            AV92TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
            if ( ! (0==AV50FlagCol) )
            {
               if ( ( DecimalUtil.compareTo(AV92TotCol2, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV79ColFin_5) <= 0 ) )
               {
                  AV17PrdVal = (byte)(1) ;
               }
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TG", "")) == 0 )
      {
         AV80ColIni_5 = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 4, 5), ".") ;
         AV79ColFin_5 = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 9, 5), ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 14, 2))) ;
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         if ( AV115Clavec == 0 )
         {
            GXv_char16[0] = AV75EmprCod ;
            GXv_int7[0] = AV52CliCod ;
            GXv_char15[0] = AV68ArtCod ;
            GXv_char14[0] = AV47ForColNom ;
            GXv_int5[0] = AV48ForColNum ;
            GXv_int10[0] = AV49TipColCod ;
            GXv_int8[0] = AV35Familia ;
            GXv_decimal13[0] = AV36TotCol ;
            GXv_int2[0] = AV50FlagCol ;
            new app.pclaesp3(remoteHandle, context).execute( GXv_char16, GXv_int7, GXv_char15, GXv_char14, GXv_int5, GXv_int10, GXv_int8, GXv_decimal13, GXv_int2) ;
            psimcla.this.AV75EmprCod = GXv_char16[0] ;
            psimcla.this.AV52CliCod = GXv_int7[0] ;
            psimcla.this.AV68ArtCod = GXv_char15[0] ;
            psimcla.this.AV47ForColNom = GXv_char14[0] ;
            psimcla.this.AV48ForColNum = GXv_int5[0] ;
            psimcla.this.AV49TipColCod = GXv_int10[0] ;
            psimcla.this.AV35Familia = GXv_int8[0] ;
            psimcla.this.AV36TotCol = GXv_decimal13[0] ;
            psimcla.this.AV50FlagCol = GXv_int2[0] ;
         }
         else
         {
            GXv_char16[0] = AV75EmprCod ;
            GXv_int7[0] = AV52CliCod ;
            GXv_char15[0] = AV68ArtCod ;
            GXv_char14[0] = AV47ForColNom ;
            GXv_int5[0] = AV48ForColNum ;
            GXv_int10[0] = AV49TipColCod ;
            GXv_int8[0] = AV35Familia ;
            GXv_decimal13[0] = AV36TotCol ;
            GXv_int2[0] = AV50FlagCol ;
            GXv_decimal11[0] = AV21TotKil ;
            GXv_int12[0] = AV67BarLinMaq ;
            GXv_decimal9[0] = DecimalUtil.doubleToDec(AV69Volumen) ;
            GXv_char6[0] = AV70MaqCod ;
            GXv_char4[0] = AV106Procodi ;
            new app.pclaes3b(remoteHandle, context).execute( GXv_char16, GXv_int7, GXv_char15, GXv_char14, GXv_int5, GXv_int10, GXv_int8, GXv_decimal13, GXv_int2, GXv_decimal11, GXv_int12, GXv_decimal9, GXv_char6, GXv_char4) ;
            psimcla.this.AV75EmprCod = GXv_char16[0] ;
            psimcla.this.AV52CliCod = GXv_int7[0] ;
            psimcla.this.AV68ArtCod = GXv_char15[0] ;
            psimcla.this.AV47ForColNom = GXv_char14[0] ;
            psimcla.this.AV48ForColNum = GXv_int5[0] ;
            psimcla.this.AV49TipColCod = GXv_int10[0] ;
            psimcla.this.AV35Familia = GXv_int8[0] ;
            psimcla.this.AV36TotCol = GXv_decimal13[0] ;
            psimcla.this.AV50FlagCol = GXv_int2[0] ;
            psimcla.this.AV21TotKil = GXv_decimal11[0] ;
            psimcla.this.AV67BarLinMaq = GXv_int12[0] ;
            psimcla.this.AV69Volumen = (int)(DecimalUtil.decToDouble(GXv_decimal9[0])) ;
            psimcla.this.AV70MaqCod = GXv_char6[0] ;
            psimcla.this.AV106Procodi = GXv_char4[0] ;
         }
         AV92TotCol2 = AV21TotKil.multiply(AV36TotCol).multiply(DecimalUtil.doubleToDec(10)) ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV92TotCol2, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
         Gx_msg = httpContext.getMessage( "TG", "") + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Kilos : ", "") + GXutil.trim( GXutil.str( AV21TotKil, 10, 2)) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Familia : ", "") + GXutil.trim( GXutil.str( AV35Familia, 10, 0)) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "% Col : ", "") + GXutil.trim( GXutil.str( AV36TotCol, 10, 5)) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Gramos : ", "") + GXutil.trim( GXutil.str( AV92TotCol2, 10, 5)) ;
         Gx_msg += httpContext.getMessage( "Rango de acción : ", "") + GXutil.trim( GXutil.str( AV80ColIni_5, 10, 0)) + "," + GXutil.trim( GXutil.str( AV79ColFin_5, 10, 0)) + ")" + GXutil.chr( (short)(13)) ;
         Gx_msg += "-------------------------" + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Resultado ", "") + GXutil.trim( GXutil.str( AV17PrdVal, 10, 0)) ;
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AP", "")) == 0 )
      {
         AV66Station = context.getWorkstationId( remoteHandle) ;
         AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
         AV112PrdNum = GXutil.substring( AV16Clave, 4, 6) ;
         /* Using cursor P00VT11 */
         pr_default.execute(9, new Object[] {AV75EmprCod, AV66Station});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A910Workstat = P00VT11_A910Workstat[0] ;
            A396EmprCod = P00VT11_A396EmprCod[0] ;
            A719PrdNum = P00VT11_A719PrdNum[0] ;
            A887EscMLin = P00VT11_A887EscMLin[0] ;
            if ( GXutil.strcmp(A719PrdNum, AV112PrdNum) == 0 )
            {
               AV17PrdVal = (byte)(1) ;
            }
            pr_default.readNext(9);
         }
         pr_default.close(9);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CI", "")) == 0 )
      {
         AV111ClasCod = (short)(GXutil.lval( GXutil.substring( AV16Clave, 3, 4))) ;
         /* Using cursor P00VT12 */
         pr_default.execute(10, new Object[] {AV75EmprCod, Short.valueOf(AV111ClasCod), AV68ArtCod});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A4295ClasCod = P00VT12_A4295ClasCod[0] ;
            n4295ClasCod = P00VT12_n4295ClasCod[0] ;
            A65ArtCod = P00VT12_A65ArtCod[0] ;
            A396EmprCod = P00VT12_A396EmprCod[0] ;
            A252CliCod = P00VT12_A252CliCod[0] ;
            AV17PrdVal = (byte)(1) ;
            pr_default.readNext(10);
         }
         pr_default.close(10);
         if ( AV17PrdVal == 1 )
         {
            AV51IntCod = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 7, 2))) ;
            if ( AV73IntCodFor == AV51IntCod )
            {
               AV17PrdVal = (byte)(1) ;
            }
            else
            {
               AV17PrdVal = (byte)(0) ;
            }
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      AV91Ok_family = (byte)(0) ;
      /* Using cursor P00VT13 */
      pr_default.execute(11, new Object[] {AV75EmprCod, Integer.valueOf(AV83ForNumCol)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A486ForNumCol = P00VT13_A486ForNumCol[0] ;
         A396EmprCod = P00VT13_A396EmprCod[0] ;
         A719PrdNum = P00VT13_A719PrdNum[0] ;
         A309ColLin = P00VT13_A309ColLin[0] ;
         AV90Length = (byte)(GXutil.len( A719PrdNum)) ;
         if ( AV90Length > 5 )
         {
            if ( DecimalUtil.compareTo(CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 2), "."), CommonUtil.decimalVal( AV89Family, ".")) == 0 )
            {
               AV91Ok_family = (byte)(1) ;
            }
         }
         else
         {
            AV88FamiliaA = GXutil.substring( AV89Family, 1, 1) ;
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), AV88FamiliaA) == 0 )
            {
               AV91Ok_family = (byte)(1) ;
            }
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void S121( )
   {
      /* 'COLOR' Routine */
      returnInSub = false ;
      AV83ForNumCol = 0 ;
      /* Using cursor P00VT14 */
      pr_default.execute(12, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A831TipColCod = P00VT14_A831TipColCod[0] ;
         A483ForColNum = P00VT14_A483ForColNum[0] ;
         A482ForColNom = P00VT14_A482ForColNom[0] ;
         A494ForSer = P00VT14_A494ForSer[0] ;
         A252CliCod = P00VT14_A252CliCod[0] ;
         A396EmprCod = P00VT14_A396EmprCod[0] ;
         A583IntCod = P00VT14_A583IntCod[0] ;
         A626MatCod = P00VT14_A626MatCod[0] ;
         A486ForNumCol = P00VT14_A486ForNumCol[0] ;
         AV73IntCodFor = A583IntCod ;
         AV71MatizForm = A626MatCod ;
         AV83ForNumCol = A486ForNumCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   protected void cleanup( )
   {
      this.aP0[0] = psimcla.this.AV75EmprCod;
      this.aP1[0] = psimcla.this.AV15Descrip;
      this.aP2[0] = psimcla.this.AV16Clave;
      this.aP3[0] = psimcla.this.AV17PrdVal;
      this.aP4[0] = psimcla.this.AV52CliCod;
      this.aP5[0] = psimcla.this.AV68ArtCod;
      this.aP6[0] = psimcla.this.AV21TotKil;
      this.aP7[0] = psimcla.this.AV22PrdDesc;
      this.aP8[0] = psimcla.this.AV23Accion;
      this.aP9[0] = psimcla.this.AV67BarLinMaq;
      this.aP10[0] = psimcla.this.AV69Volumen;
      this.aP11[0] = psimcla.this.AV70MaqCod;
      this.aP12[0] = psimcla.this.AV71MatizForm;
      this.aP13[0] = psimcla.this.AV47ForColNom;
      this.aP14[0] = psimcla.this.AV48ForColNum;
      this.aP15[0] = psimcla.this.AV49TipColCod;
      this.aP16[0] = psimcla.this.AV73IntCodFor;
      this.aP17[0] = psimcla.this.AV106Procodi;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24Opcion = "" ;
      AV25Fibra = "" ;
      scmdbuf = "" ;
      P00VT2_A65ArtCod = new String[] {""} ;
      P00VT2_A252CliCod = new int[1] ;
      P00VT2_A396EmprCod = new String[] {""} ;
      P00VT2_A107ArtTra3 = new String[] {""} ;
      P00VT2_n107ArtTra3 = new boolean[] {false} ;
      P00VT2_A106ArtTra2 = new String[] {""} ;
      P00VT2_n106ArtTra2 = new boolean[] {false} ;
      P00VT2_A105ArtTra1 = new String[] {""} ;
      P00VT2_n105ArtTra1 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      A107ArtTra3 = "" ;
      A106ArtTra2 = "" ;
      A105ArtTra1 = "" ;
      P00VT3_A829TipArtCod = new short[1] ;
      P00VT3_A65ArtCod = new String[] {""} ;
      P00VT3_A252CliCod = new int[1] ;
      P00VT3_A396EmprCod = new String[] {""} ;
      AV30CodMaq = "" ;
      AV76Ini_5 = "" ;
      AV77Inip_5 = "" ;
      AV80ColIni_5 = DecimalUtil.ZERO ;
      AV78Fin_5 = "" ;
      AV81Finp_5 = "" ;
      AV79ColFin_5 = DecimalUtil.ZERO ;
      AV36TotCol = DecimalUtil.ZERO ;
      AV92TotCol2 = DecimalUtil.ZERO ;
      AV38Producto = "" ;
      GXv_char3 = new String[1] ;
      AV39Proceso = "" ;
      AV66Station = "" ;
      GXt_char17 = "" ;
      P00VT4_A764ProForCod = new String[] {""} ;
      P00VT4_A831TipColCod = new byte[1] ;
      P00VT4_A483ForColNum = new int[1] ;
      P00VT4_A482ForColNom = new String[] {""} ;
      P00VT4_A494ForSer = new String[] {""} ;
      P00VT4_A252CliCod = new int[1] ;
      P00VT4_A396EmprCod = new String[] {""} ;
      P00VT4_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      AV84F_ok_sb = "" ;
      AV87Pos_pu = "" ;
      AV93Pos_u = "" ;
      AV89Family = "" ;
      P00VT5_A831TipColCod = new byte[1] ;
      P00VT5_A483ForColNum = new int[1] ;
      P00VT5_A482ForColNom = new String[] {""} ;
      P00VT5_A494ForSer = new String[] {""} ;
      P00VT5_A252CliCod = new int[1] ;
      P00VT5_A396EmprCod = new String[] {""} ;
      P00VT5_A486ForNumCol = new int[1] ;
      AV94VAcc = "" ;
      AV96ArtCod_1 = "" ;
      AV97ArtCod_2 = "" ;
      AV98ColNom_1 = "" ;
      AV99ColNom_2 = "" ;
      AV113Con_Ant = "" ;
      AV100BarAntp = "" ;
      P00VT6_A829TipArtCod = new short[1] ;
      P00VT6_A65ArtCod = new String[] {""} ;
      P00VT6_A252CliCod = new int[1] ;
      P00VT6_A396EmprCod = new String[] {""} ;
      P00VT7_A6037Mq_Grupo = new byte[1] ;
      P00VT7_A602MaqCod = new String[] {""} ;
      P00VT7_A396EmprCod = new String[] {""} ;
      A602MaqCod = "" ;
      AV114GruMaq = "" ;
      AV107TotColMin = DecimalUtil.ZERO ;
      AV108TotColMax = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      P00VT8_A65ArtCod = new String[] {""} ;
      P00VT8_A252CliCod = new int[1] ;
      P00VT8_A396EmprCod = new String[] {""} ;
      P00VT8_A4295ClasCod = new short[1] ;
      P00VT8_n4295ClasCod = new boolean[] {false} ;
      P00VT9_A4295ClasCod = new short[1] ;
      P00VT9_n4295ClasCod = new boolean[] {false} ;
      P00VT9_A65ArtCod = new String[] {""} ;
      P00VT9_A396EmprCod = new String[] {""} ;
      P00VT9_A252CliCod = new int[1] ;
      AV104Fascod = "" ;
      P00VT10_A457FasCod = new String[] {""} ;
      P00VT10_A758ProCod = new String[] {""} ;
      P00VT10_A396EmprCod = new String[] {""} ;
      P00VT10_A774ProNumLin = new short[1] ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      GXv_char16 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char15 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_int8 = new byte[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int2 = new byte[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int12 = new short[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char6 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV112PrdNum = "" ;
      P00VT11_A910Workstat = new String[] {""} ;
      P00VT11_A396EmprCod = new String[] {""} ;
      P00VT11_A719PrdNum = new String[] {""} ;
      P00VT11_A887EscMLin = new int[1] ;
      A910Workstat = "" ;
      A719PrdNum = "" ;
      P00VT12_A4295ClasCod = new short[1] ;
      P00VT12_n4295ClasCod = new boolean[] {false} ;
      P00VT12_A65ArtCod = new String[] {""} ;
      P00VT12_A396EmprCod = new String[] {""} ;
      P00VT12_A252CliCod = new int[1] ;
      P00VT13_A486ForNumCol = new int[1] ;
      P00VT13_A396EmprCod = new String[] {""} ;
      P00VT13_A719PrdNum = new String[] {""} ;
      P00VT13_A309ColLin = new short[1] ;
      AV88FamiliaA = "" ;
      AV46ForSer = "" ;
      P00VT14_A831TipColCod = new byte[1] ;
      P00VT14_A483ForColNum = new int[1] ;
      P00VT14_A482ForColNom = new String[] {""} ;
      P00VT14_A494ForSer = new String[] {""} ;
      P00VT14_A252CliCod = new int[1] ;
      P00VT14_A396EmprCod = new String[] {""} ;
      P00VT14_A583IntCod = new byte[1] ;
      P00VT14_A626MatCod = new short[1] ;
      P00VT14_A486ForNumCol = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psimcla__default(),
         new Object[] {
             new Object[] {
            P00VT2_A65ArtCod, P00VT2_A252CliCod, P00VT2_A396EmprCod, P00VT2_A107ArtTra3, P00VT2_n107ArtTra3, P00VT2_A106ArtTra2, P00VT2_n106ArtTra2, P00VT2_A105ArtTra1, P00VT2_n105ArtTra1
            }
            , new Object[] {
            P00VT3_A829TipArtCod, P00VT3_A65ArtCod, P00VT3_A252CliCod, P00VT3_A396EmprCod
            }
            , new Object[] {
            P00VT4_A764ProForCod, P00VT4_A831TipColCod, P00VT4_A483ForColNum, P00VT4_A482ForColNom, P00VT4_A494ForSer, P00VT4_A252CliCod, P00VT4_A396EmprCod, P00VT4_A1160ProForL
            }
            , new Object[] {
            P00VT5_A831TipColCod, P00VT5_A483ForColNum, P00VT5_A482ForColNom, P00VT5_A494ForSer, P00VT5_A252CliCod, P00VT5_A396EmprCod, P00VT5_A486ForNumCol
            }
            , new Object[] {
            P00VT6_A829TipArtCod, P00VT6_A65ArtCod, P00VT6_A252CliCod, P00VT6_A396EmprCod
            }
            , new Object[] {
            P00VT7_A6037Mq_Grupo, P00VT7_A602MaqCod, P00VT7_A396EmprCod
            }
            , new Object[] {
            P00VT8_A65ArtCod, P00VT8_A252CliCod, P00VT8_A396EmprCod, P00VT8_A4295ClasCod, P00VT8_n4295ClasCod
            }
            , new Object[] {
            P00VT9_A4295ClasCod, P00VT9_n4295ClasCod, P00VT9_A65ArtCod, P00VT9_A396EmprCod, P00VT9_A252CliCod
            }
            , new Object[] {
            P00VT10_A457FasCod, P00VT10_A758ProCod, P00VT10_A396EmprCod, P00VT10_A774ProNumLin
            }
            , new Object[] {
            P00VT11_A910Workstat, P00VT11_A396EmprCod, P00VT11_A719PrdNum, P00VT11_A887EscMLin
            }
            , new Object[] {
            P00VT12_A4295ClasCod, P00VT12_n4295ClasCod, P00VT12_A65ArtCod, P00VT12_A396EmprCod, P00VT12_A252CliCod
            }
            , new Object[] {
            P00VT13_A486ForNumCol, P00VT13_A396EmprCod, P00VT13_A719PrdNum, P00VT13_A309ColLin
            }
            , new Object[] {
            P00VT14_A831TipColCod, P00VT14_A483ForColNum, P00VT14_A482ForColNom, P00VT14_A494ForSer, P00VT14_A252CliCod, P00VT14_A396EmprCod, P00VT14_A583IntCod, P00VT14_A626MatCod, P00VT14_A486ForNumCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV49TipColCod ;
   private byte AV73IntCodFor ;
   private byte AV115Clavec ;
   private byte GXt_int1 ;
   private byte AV26RelBany ;
   private byte AV27RelBanIni ;
   private byte AV28RelBanFin ;
   private byte AV35Familia ;
   private byte AV50FlagCol ;
   private byte AV40FlagPro ;
   private byte A831TipColCod ;
   private byte AV51IntCod ;
   private byte AV85LenVar ;
   private byte AV86Pos_pu_n ;
   private byte AV82Ok_intens ;
   private byte AV91Ok_family ;
   private byte AV95Ok_matiz ;
   private byte AV110Mq_grupo ;
   private byte A6037Mq_Grupo ;
   private byte AV109TipCol ;
   private byte GXv_int10[] ;
   private byte GXv_int8[] ;
   private byte GXv_int2[] ;
   private byte AV90Length ;
   private byte A583IntCod ;
   private short AV67BarLinMaq ;
   private short AV71MatizForm ;
   private short AV29TipArt ;
   private short A829TipArtCod ;
   private short AV31Matiz ;
   private short A1160ProForL ;
   private short AV101TipArti ;
   private short AV111ClasCod ;
   private short A4295ClasCod ;
   private short A774ProNumLin ;
   private short GXv_int12[] ;
   private short A309ColLin ;
   private short A626MatCod ;
   private short Gx_err ;
   private int AV52CliCod ;
   private int AV69Volumen ;
   private int AV48ForColNum ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV74CliCodCla ;
   private int AV83ForNumCol ;
   private int A486ForNumCol ;
   private int AV102CliCodc ;
   private int AV103Colnum ;
   private int GXv_int7[] ;
   private int GXv_int5[] ;
   private int A887EscMLin ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal AV80ColIni_5 ;
   private java.math.BigDecimal AV79ColFin_5 ;
   private java.math.BigDecimal AV36TotCol ;
   private java.math.BigDecimal AV92TotCol2 ;
   private java.math.BigDecimal AV107TotColMin ;
   private java.math.BigDecimal AV108TotColMax ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String AV75EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV68ArtCod ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV70MaqCod ;
   private String AV47ForColNom ;
   private String AV106Procodi ;
   private String AV24Opcion ;
   private String AV25Fibra ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String A107ArtTra3 ;
   private String A106ArtTra2 ;
   private String A105ArtTra1 ;
   private String AV30CodMaq ;
   private String AV76Ini_5 ;
   private String AV77Inip_5 ;
   private String AV78Fin_5 ;
   private String AV81Finp_5 ;
   private String AV38Producto ;
   private String GXv_char3[] ;
   private String AV39Proceso ;
   private String AV66Station ;
   private String GXt_char17 ;
   private String A764ProForCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String AV84F_ok_sb ;
   private String AV87Pos_pu ;
   private String AV93Pos_u ;
   private String AV89Family ;
   private String AV94VAcc ;
   private String AV96ArtCod_1 ;
   private String AV97ArtCod_2 ;
   private String AV98ColNom_1 ;
   private String AV99ColNom_2 ;
   private String AV113Con_Ant ;
   private String AV100BarAntp ;
   private String A602MaqCod ;
   private String AV114GruMaq ;
   private String Gx_msg ;
   private String AV104Fascod ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String GXv_char16[] ;
   private String GXv_char15[] ;
   private String GXv_char14[] ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private String AV112PrdNum ;
   private String A910Workstat ;
   private String A719PrdNum ;
   private String AV88FamiliaA ;
   private String AV46ForSer ;
   private boolean n107ArtTra3 ;
   private boolean n106ArtTra2 ;
   private boolean n105ArtTra1 ;
   private boolean returnInSub ;
   private boolean n4295ClasCod ;
   private String[] aP17 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private short[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private short[] aP12 ;
   private String[] aP13 ;
   private int[] aP14 ;
   private byte[] aP15 ;
   private byte[] aP16 ;
   private IDataStoreProvider pr_default ;
   private String[] P00VT2_A65ArtCod ;
   private int[] P00VT2_A252CliCod ;
   private String[] P00VT2_A396EmprCod ;
   private String[] P00VT2_A107ArtTra3 ;
   private boolean[] P00VT2_n107ArtTra3 ;
   private String[] P00VT2_A106ArtTra2 ;
   private boolean[] P00VT2_n106ArtTra2 ;
   private String[] P00VT2_A105ArtTra1 ;
   private boolean[] P00VT2_n105ArtTra1 ;
   private short[] P00VT3_A829TipArtCod ;
   private String[] P00VT3_A65ArtCod ;
   private int[] P00VT3_A252CliCod ;
   private String[] P00VT3_A396EmprCod ;
   private String[] P00VT4_A764ProForCod ;
   private byte[] P00VT4_A831TipColCod ;
   private int[] P00VT4_A483ForColNum ;
   private String[] P00VT4_A482ForColNom ;
   private String[] P00VT4_A494ForSer ;
   private int[] P00VT4_A252CliCod ;
   private String[] P00VT4_A396EmprCod ;
   private short[] P00VT4_A1160ProForL ;
   private byte[] P00VT5_A831TipColCod ;
   private int[] P00VT5_A483ForColNum ;
   private String[] P00VT5_A482ForColNom ;
   private String[] P00VT5_A494ForSer ;
   private int[] P00VT5_A252CliCod ;
   private String[] P00VT5_A396EmprCod ;
   private int[] P00VT5_A486ForNumCol ;
   private short[] P00VT6_A829TipArtCod ;
   private String[] P00VT6_A65ArtCod ;
   private int[] P00VT6_A252CliCod ;
   private String[] P00VT6_A396EmprCod ;
   private byte[] P00VT7_A6037Mq_Grupo ;
   private String[] P00VT7_A602MaqCod ;
   private String[] P00VT7_A396EmprCod ;
   private String[] P00VT8_A65ArtCod ;
   private int[] P00VT8_A252CliCod ;
   private String[] P00VT8_A396EmprCod ;
   private short[] P00VT8_A4295ClasCod ;
   private boolean[] P00VT8_n4295ClasCod ;
   private short[] P00VT9_A4295ClasCod ;
   private boolean[] P00VT9_n4295ClasCod ;
   private String[] P00VT9_A65ArtCod ;
   private String[] P00VT9_A396EmprCod ;
   private int[] P00VT9_A252CliCod ;
   private String[] P00VT10_A457FasCod ;
   private String[] P00VT10_A758ProCod ;
   private String[] P00VT10_A396EmprCod ;
   private short[] P00VT10_A774ProNumLin ;
   private String[] P00VT11_A910Workstat ;
   private String[] P00VT11_A396EmprCod ;
   private String[] P00VT11_A719PrdNum ;
   private int[] P00VT11_A887EscMLin ;
   private short[] P00VT12_A4295ClasCod ;
   private boolean[] P00VT12_n4295ClasCod ;
   private String[] P00VT12_A65ArtCod ;
   private String[] P00VT12_A396EmprCod ;
   private int[] P00VT12_A252CliCod ;
   private int[] P00VT13_A486ForNumCol ;
   private String[] P00VT13_A396EmprCod ;
   private String[] P00VT13_A719PrdNum ;
   private short[] P00VT13_A309ColLin ;
   private byte[] P00VT14_A831TipColCod ;
   private int[] P00VT14_A483ForColNum ;
   private String[] P00VT14_A482ForColNom ;
   private String[] P00VT14_A494ForSer ;
   private int[] P00VT14_A252CliCod ;
   private String[] P00VT14_A396EmprCod ;
   private byte[] P00VT14_A583IntCod ;
   private short[] P00VT14_A626MatCod ;
   private int[] P00VT14_A486ForNumCol ;
}

final  class psimcla__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00VT2", "SELECT ArtCod, CliCod, EmprCod, ArtTra3, ArtTra2, ArtTra1 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00VT3", "SELECT TipArtCod, ArtCod, CliCod, EmprCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (TipArtCod = ?) ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00VT4", "SELECT ProForCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ProForL FROM TXPLFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (ProForCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VT5", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00VT6", "SELECT TipArtCod, ArtCod, CliCod, EmprCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (TipArtCod = ?) ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00VT7", "SELECT Mq_Grupo, MaqCod, EmprCod FROM TXPMAQGR1 WHERE Mq_Grupo = ? ORDER BY EmprCod, Mq_Grupo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VT8", "SELECT ArtCod, CliCod, EmprCod, ClasCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? = 1) ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00VT9", "SELECT ClasCod, ArtCod, EmprCod, CliCod FROM TXPARTICU WHERE (EmprCod = ? and ClasCod = ?) AND (ArtCod = ?) ORDER BY EmprCod, ClasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VT10", "SELECT FasCod, ProCod, EmprCod, ProNumLin FROM TXPPROLIN WHERE (EmprCod = ? and ProCod = ?) AND (FasCod = ?) ORDER BY EmprCod, ProCod, ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VT11", "SELECT Workstat, EmprCod, PrdNum, EscMLin FROM TXPESCMAN WHERE EmprCod = ? and Workstat = ? ORDER BY EmprCod, Workstat, EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VT12", "SELECT ClasCod, ArtCod, EmprCod, CliCod FROM TXPARTICU WHERE (EmprCod = ? and ClasCod = ?) AND (ArtCod = ?) ORDER BY EmprCod, ClasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VT13", "SELECT ForNumCol, EmprCod, PrdNum, ColLin FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VT14", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCod, MatCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 12 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

