package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclatc extends GXProcedure
{
   public pclatc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclatc.class ), "" );
   }

   public pclatc( int remoteHandle ,
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
                             byte[] aP16 ,
                             String[] aP17 ,
                             short[] aP18 ,
                             short[] aP19 ,
                             String[] aP20 )
   {
      pclatc.this.aP21 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21);
      return aP21[0];
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
                        String[] aP17 ,
                        short[] aP18 ,
                        short[] aP19 ,
                        String[] aP20 ,
                        String[] aP21 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21);
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
                             String[] aP17 ,
                             short[] aP18 ,
                             short[] aP19 ,
                             String[] aP20 ,
                             String[] aP21 )
   {
      pclatc.this.AV75EmprCod = aP0[0];
      this.aP0 = aP0;
      pclatc.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclatc.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclatc.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclatc.this.AV52CliCod = aP4[0];
      this.aP4 = aP4;
      pclatc.this.AV68ArtCod = aP5[0];
      this.aP5 = aP5;
      pclatc.this.AV21TotKil = aP6[0];
      this.aP6 = aP6;
      pclatc.this.AV22PrdDesc = aP7[0];
      this.aP7 = aP7;
      pclatc.this.AV23Accion = aP8[0];
      this.aP8 = aP8;
      pclatc.this.AV67BarLinMaq = aP9[0];
      this.aP9 = aP9;
      pclatc.this.AV69Volumen = aP10[0];
      this.aP10 = aP10;
      pclatc.this.AV70MaqCod = aP11[0];
      this.aP11 = aP11;
      pclatc.this.AV71MatizForm = aP12[0];
      this.aP12 = aP12;
      pclatc.this.AV47ForColNom = aP13[0];
      this.aP13 = aP13;
      pclatc.this.AV48ForColNum = aP14[0];
      this.aP14 = aP14;
      pclatc.this.AV49TipColCod = aP15[0];
      this.aP15 = aP15;
      pclatc.this.AV73IntCodFor = aP16[0];
      this.aP16 = aP16;
      pclatc.this.AV106BarAntp = aP17[0];
      this.aP17 = aP17;
      pclatc.this.AV102TipArtFor = aP18[0];
      this.aP18 = aP18;
      pclatc.this.AV104Tipo_pza = aP19[0];
      this.aP19 = aP19;
      pclatc.this.AV105BarAcc = aP20[0];
      this.aP20 = aP20;
      pclatc.this.AV107BarAntpT = aP21[0];
      this.aP21 = aP21;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Opcion = GXutil.substring( AV16Clave, 1, 2) ;
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AF", "")) == 0 )
      {
         AV25Fibra = GXutil.substring( AV16Clave, 4, 3) ;
         AV23Accion = GXutil.substring( AV16Clave, 8, 1) ;
         /* Using cursor P01OR2 */
         pr_default.execute(0, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A65ArtCod = P01OR2_A65ArtCod[0] ;
            A252CliCod = P01OR2_A252CliCod[0] ;
            A396EmprCod = P01OR2_A396EmprCod[0] ;
            A107ArtTra3 = P01OR2_A107ArtTra3[0] ;
            n107ArtTra3 = P01OR2_n107ArtTra3[0] ;
            A106ArtTra2 = P01OR2_A106ArtTra2[0] ;
            n106ArtTra2 = P01OR2_n106ArtTra2[0] ;
            A105ArtTra1 = P01OR2_A105ArtTra1[0] ;
            n105ArtTra1 = P01OR2_n105ArtTra1[0] ;
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
         /* Using cursor P01OR3 */
         pr_default.execute(1, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod, Short.valueOf(AV29TipArt)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A829TipArtCod = P01OR3_A829TipArtCod[0] ;
            A65ArtCod = P01OR3_A65ArtCod[0] ;
            A252CliCod = P01OR3_A252CliCod[0] ;
            A396EmprCod = P01OR3_A396EmprCod[0] ;
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
         if ( GXutil.strcmp(AV70MaqCod, AV30CodMaq) == 0 )
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
         GXv_char1[0] = AV76Ini_5 ;
         GXv_char2[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char1, GXv_char2) ;
         pclatc.this.AV76Ini_5 = GXv_char1[0] ;
         pclatc.this.AV77Inip_5 = GXv_char2[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char2[0] = AV78Fin_5 ;
         GXv_char1[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char2, GXv_char1) ;
         pclatc.this.AV78Fin_5 = GXv_char2[0] ;
         pclatc.this.AV81Finp_5 = GXv_char1[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char2[0] = AV75EmprCod ;
         GXv_int3[0] = AV52CliCod ;
         GXv_char1[0] = AV68ArtCod ;
         GXv_char4[0] = AV47ForColNom ;
         GXv_int5[0] = AV48ForColNum ;
         GXv_int6[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int9[0] = AV50FlagCol ;
         new app.pclaesp3(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char1, GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_decimal8, GXv_int9) ;
         pclatc.this.AV75EmprCod = GXv_char2[0] ;
         pclatc.this.AV52CliCod = GXv_int3[0] ;
         pclatc.this.AV68ArtCod = GXv_char1[0] ;
         pclatc.this.AV47ForColNom = GXv_char4[0] ;
         pclatc.this.AV48ForColNum = GXv_int5[0] ;
         pclatc.this.AV49TipColCod = GXv_int6[0] ;
         pclatc.this.AV35Familia = GXv_int7[0] ;
         pclatc.this.AV36TotCol = GXv_decimal8[0] ;
         pclatc.this.AV50FlagCol = GXv_int9[0] ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV36TotCol, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV36TotCol, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AC", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 14, 1) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 3, 5) ;
         GXv_char4[0] = AV76Ini_5 ;
         GXv_char2[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char4, GXv_char2) ;
         pclatc.this.AV76Ini_5 = GXv_char4[0] ;
         pclatc.this.AV77Inip_5 = GXv_char2[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char4[0] = AV78Fin_5 ;
         GXv_char2[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char4, GXv_char2) ;
         pclatc.this.AV78Fin_5 = GXv_char4[0] ;
         pclatc.this.AV81Finp_5 = GXv_char2[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV38Producto = GXutil.substring( AV22PrdDesc, 1, 6) ;
         AV15Descrip = AV38Producto ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char4[0] = AV75EmprCod ;
         GXv_int5[0] = AV52CliCod ;
         GXv_char2[0] = AV68ArtCod ;
         GXv_char1[0] = AV47ForColNom ;
         GXv_int3[0] = AV48ForColNum ;
         GXv_int9[0] = AV49TipColCod ;
         GXv_char10[0] = AV38Producto ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int7[0] = AV50FlagCol ;
         new app.pclaesp2(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char2, GXv_char1, GXv_int3, GXv_int9, GXv_char10, GXv_decimal8, GXv_int7) ;
         pclatc.this.AV75EmprCod = GXv_char4[0] ;
         pclatc.this.AV52CliCod = GXv_int5[0] ;
         pclatc.this.AV68ArtCod = GXv_char2[0] ;
         pclatc.this.AV47ForColNom = GXv_char1[0] ;
         pclatc.this.AV48ForColNum = GXv_int3[0] ;
         pclatc.this.AV49TipColCod = GXv_int9[0] ;
         pclatc.this.AV38Producto = GXv_char10[0] ;
         pclatc.this.AV36TotCol = GXv_decimal8[0] ;
         pclatc.this.AV50FlagCol = GXv_int7[0] ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV36TotCol, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV36TotCol, AV79ColFin_5) <= 0 ) )
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
         GXt_char11 = AV66Station ;
         GXv_char10[0] = GXt_char11 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char10) ;
         pclatc.this.GXt_char11 = GXv_char10[0] ;
         AV66Station = GXt_char11 ;
         /* Using cursor P01OR4 */
         pr_default.execute(2, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod), AV39Proceso});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A764ProForCod = P01OR4_A764ProForCod[0] ;
            A831TipColCod = P01OR4_A831TipColCod[0] ;
            A483ForColNum = P01OR4_A483ForColNum[0] ;
            A482ForColNom = P01OR4_A482ForColNom[0] ;
            A494ForSer = P01OR4_A494ForSer[0] ;
            A252CliCod = P01OR4_A252CliCod[0] ;
            A396EmprCod = P01OR4_A396EmprCod[0] ;
            A1160ProForL = P01OR4_A1160ProForL[0] ;
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
         GXv_char10[0] = AV76Ini_5 ;
         GXv_char4[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char10, GXv_char4) ;
         pclatc.this.AV76Ini_5 = GXv_char10[0] ;
         pclatc.this.AV77Inip_5 = GXv_char4[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char10[0] = AV78Fin_5 ;
         GXv_char4[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char10, GXv_char4) ;
         pclatc.this.AV78Fin_5 = GXv_char10[0] ;
         pclatc.this.AV81Finp_5 = GXv_char4[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char10[0] = AV75EmprCod ;
         GXv_int5[0] = AV52CliCod ;
         GXv_char4[0] = AV68ArtCod ;
         GXv_char2[0] = AV47ForColNom ;
         GXv_int3[0] = AV48ForColNum ;
         GXv_int9[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int6[0] = AV50FlagCol ;
         new app.pclaesp3(remoteHandle, context).execute( GXv_char10, GXv_int5, GXv_char4, GXv_char2, GXv_int3, GXv_int9, GXv_int7, GXv_decimal8, GXv_int6) ;
         pclatc.this.AV75EmprCod = GXv_char10[0] ;
         pclatc.this.AV52CliCod = GXv_int5[0] ;
         pclatc.this.AV68ArtCod = GXv_char4[0] ;
         pclatc.this.AV47ForColNom = GXv_char2[0] ;
         pclatc.this.AV48ForColNum = GXv_int3[0] ;
         pclatc.this.AV49TipColCod = GXv_int9[0] ;
         pclatc.this.AV35Familia = GXv_int7[0] ;
         pclatc.this.AV36TotCol = GXv_decimal8[0] ;
         pclatc.this.AV50FlagCol = GXv_int6[0] ;
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
         GXv_char10[0] = AV76Ini_5 ;
         GXv_char4[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char10, GXv_char4) ;
         pclatc.this.AV76Ini_5 = GXv_char10[0] ;
         pclatc.this.AV77Inip_5 = GXv_char4[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char10[0] = AV78Fin_5 ;
         GXv_char4[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char10, GXv_char4) ;
         pclatc.this.AV78Fin_5 = GXv_char10[0] ;
         pclatc.this.AV81Finp_5 = GXv_char4[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char10[0] = AV75EmprCod ;
         GXv_int5[0] = AV52CliCod ;
         GXv_char4[0] = AV68ArtCod ;
         GXv_char2[0] = AV47ForColNom ;
         GXv_int3[0] = AV48ForColNum ;
         GXv_int9[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int6[0] = AV50FlagCol ;
         new app.pclaesp3(remoteHandle, context).execute( GXv_char10, GXv_int5, GXv_char4, GXv_char2, GXv_int3, GXv_int9, GXv_int7, GXv_decimal8, GXv_int6) ;
         pclatc.this.AV75EmprCod = GXv_char10[0] ;
         pclatc.this.AV52CliCod = GXv_int5[0] ;
         pclatc.this.AV68ArtCod = GXv_char4[0] ;
         pclatc.this.AV47ForColNom = GXv_char2[0] ;
         pclatc.this.AV48ForColNum = GXv_int3[0] ;
         pclatc.this.AV49TipColCod = GXv_int9[0] ;
         pclatc.this.AV35Familia = GXv_int7[0] ;
         pclatc.this.AV36TotCol = GXv_decimal8[0] ;
         pclatc.this.AV50FlagCol = GXv_int6[0] ;
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
         /* Using cursor P01OR5 */
         pr_default.execute(3, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A831TipColCod = P01OR5_A831TipColCod[0] ;
            A483ForColNum = P01OR5_A483ForColNum[0] ;
            A482ForColNom = P01OR5_A482ForColNom[0] ;
            A494ForSer = P01OR5_A494ForSer[0] ;
            A252CliCod = P01OR5_A252CliCod[0] ;
            A396EmprCod = P01OR5_A396EmprCod[0] ;
            A486ForNumCol = P01OR5_A486ForNumCol[0] ;
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
         AV83ForNumCol = 0 ;
         /* Using cursor P01OR6 */
         pr_default.execute(4, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A831TipColCod = P01OR6_A831TipColCod[0] ;
            A483ForColNum = P01OR6_A483ForColNum[0] ;
            A482ForColNom = P01OR6_A482ForColNom[0] ;
            A494ForSer = P01OR6_A494ForSer[0] ;
            A252CliCod = P01OR6_A252CliCod[0] ;
            A396EmprCod = P01OR6_A396EmprCod[0] ;
            A486ForNumCol = P01OR6_A486ForNumCol[0] ;
            AV83ForNumCol = A486ForNumCol ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         /* Execute user subroutine: 'COLORANTES' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( GXutil.strcmp(AV105BarAcc, httpContext.getMessage( "S", "")) == 0 ) && ( AV91Ok_family == 1 ) && ( AV95Ok_matiz == 1 ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C1", "")) == 0 )
      {
         AV96Artcod_1 = GXutil.substring( AV16Clave, 4, 16) ;
         AV23Accion = GXutil.substring( AV16Clave, 21, 1) ;
         AV85LenVar = (byte)(GXutil.len( GXutil.trim( AV96Artcod_1))) ;
         AV97ArtCod_2 = GXutil.substring( AV68ArtCod, 1, AV85LenVar) ;
         if ( GXutil.strcmp(GXutil.trim( AV96Artcod_1), GXutil.trim( AV97ArtCod_2)) == 0 )
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
         AV100Con_Ant = GXutil.substring( AV16Clave, 7, 1) ;
         AV108AntpT = GXutil.substring( AV16Clave, 9, 1) ;
         AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
         if ( ( AV51IntCod == AV73IntCodFor ) && ( GXutil.strcmp(AV100Con_Ant, AV106BarAntp) == 0 ) && ( GXutil.strcmp(AV108AntpT, AV107BarAntpT) == 0 ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C4", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 23, 1) ;
         AV31Matiz = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 3))) ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 8, 2))) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 11, 5) ;
         GXv_char10[0] = AV76Ini_5 ;
         GXv_char4[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char10, GXv_char4) ;
         pclatc.this.AV76Ini_5 = GXv_char10[0] ;
         pclatc.this.AV77Inip_5 = GXv_char4[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 17, 5) ;
         GXv_char10[0] = AV78Fin_5 ;
         GXv_char4[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char10, GXv_char4) ;
         pclatc.this.AV78Fin_5 = GXv_char10[0] ;
         pclatc.this.AV81Finp_5 = GXv_char4[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char10[0] = AV75EmprCod ;
         GXv_int5[0] = AV52CliCod ;
         GXv_char4[0] = AV68ArtCod ;
         GXv_char2[0] = AV47ForColNom ;
         GXv_int3[0] = AV48ForColNum ;
         GXv_int9[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int6[0] = AV50FlagCol ;
         new app.pclaesp3(remoteHandle, context).execute( GXv_char10, GXv_int5, GXv_char4, GXv_char2, GXv_int3, GXv_int9, GXv_int7, GXv_decimal8, GXv_int6) ;
         pclatc.this.AV75EmprCod = GXv_char10[0] ;
         pclatc.this.AV52CliCod = GXv_int5[0] ;
         pclatc.this.AV68ArtCod = GXv_char4[0] ;
         pclatc.this.AV47ForColNom = GXv_char2[0] ;
         pclatc.this.AV48ForColNum = GXv_int3[0] ;
         pclatc.this.AV49TipColCod = GXv_int9[0] ;
         pclatc.this.AV35Familia = GXv_int7[0] ;
         pclatc.this.AV36TotCol = GXv_decimal8[0] ;
         pclatc.this.AV50FlagCol = GXv_int6[0] ;
         AV92TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) && ( AV31Matiz == AV71MatizForm ) && ( GXutil.strcmp(AV105BarAcc, httpContext.getMessage( "S", "")) == 0 ) )
         {
            if ( ( DecimalUtil.compareTo(AV92TotCol2, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C5", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 28, 1) ;
         AV31Matiz = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 3))) ;
         AV29TipArt = (short)(GXutil.lval( GXutil.substring( AV16Clave, 8, 4))) ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 13, 2))) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 16, 5) ;
         GXv_char10[0] = AV76Ini_5 ;
         GXv_char4[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char10, GXv_char4) ;
         pclatc.this.AV76Ini_5 = GXv_char10[0] ;
         pclatc.this.AV77Inip_5 = GXv_char4[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 12, 5) ;
         GXv_char10[0] = AV78Fin_5 ;
         GXv_char4[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char10, GXv_char4) ;
         pclatc.this.AV78Fin_5 = GXv_char10[0] ;
         pclatc.this.AV81Finp_5 = GXv_char4[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char10[0] = AV75EmprCod ;
         GXv_int5[0] = AV52CliCod ;
         GXv_char4[0] = AV68ArtCod ;
         GXv_char2[0] = AV47ForColNom ;
         GXv_int3[0] = AV48ForColNum ;
         GXv_int9[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int6[0] = AV50FlagCol ;
         new app.pclaesp3(remoteHandle, context).execute( GXv_char10, GXv_int5, GXv_char4, GXv_char2, GXv_int3, GXv_int9, GXv_int7, GXv_decimal8, GXv_int6) ;
         pclatc.this.AV75EmprCod = GXv_char10[0] ;
         pclatc.this.AV52CliCod = GXv_int5[0] ;
         pclatc.this.AV68ArtCod = GXv_char4[0] ;
         pclatc.this.AV47ForColNom = GXv_char2[0] ;
         pclatc.this.AV48ForColNum = GXv_int3[0] ;
         pclatc.this.AV49TipColCod = GXv_int9[0] ;
         pclatc.this.AV35Familia = GXv_int7[0] ;
         pclatc.this.AV36TotCol = GXv_decimal8[0] ;
         pclatc.this.AV50FlagCol = GXv_int6[0] ;
         AV92TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) && ( AV31Matiz == AV71MatizForm ) && ( AV29TipArt == AV102TipArtFor ) && ( GXutil.strcmp(AV105BarAcc, httpContext.getMessage( "S", "")) == 0 ) )
         {
            if ( ( DecimalUtil.compareTo(AV92TotCol2, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C6", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 24, 1) ;
         AV29TipArt = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 4))) ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 9, 2))) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 12, 5) ;
         GXv_char10[0] = AV76Ini_5 ;
         GXv_char4[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char10, GXv_char4) ;
         pclatc.this.AV76Ini_5 = GXv_char10[0] ;
         pclatc.this.AV77Inip_5 = GXv_char4[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 18, 5) ;
         GXv_char10[0] = AV78Fin_5 ;
         GXv_char4[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char10, GXv_char4) ;
         pclatc.this.AV78Fin_5 = GXv_char10[0] ;
         pclatc.this.AV81Finp_5 = GXv_char4[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char10[0] = AV75EmprCod ;
         GXv_int5[0] = AV52CliCod ;
         GXv_char4[0] = AV68ArtCod ;
         GXv_char2[0] = AV47ForColNom ;
         GXv_int3[0] = AV48ForColNum ;
         GXv_int9[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int6[0] = AV50FlagCol ;
         new app.pclaesp3(remoteHandle, context).execute( GXv_char10, GXv_int5, GXv_char4, GXv_char2, GXv_int3, GXv_int9, GXv_int7, GXv_decimal8, GXv_int6) ;
         pclatc.this.AV75EmprCod = GXv_char10[0] ;
         pclatc.this.AV52CliCod = GXv_int5[0] ;
         pclatc.this.AV68ArtCod = GXv_char4[0] ;
         pclatc.this.AV47ForColNom = GXv_char2[0] ;
         pclatc.this.AV48ForColNum = GXv_int3[0] ;
         pclatc.this.AV49TipColCod = GXv_int9[0] ;
         pclatc.this.AV35Familia = GXv_int7[0] ;
         pclatc.this.AV36TotCol = GXv_decimal8[0] ;
         pclatc.this.AV50FlagCol = GXv_int6[0] ;
         AV92TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) && ( AV29TipArt == AV102TipArtFor ) )
         {
            if ( ( DecimalUtil.compareTo(AV92TotCol2, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C7", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 29, 1) ;
         AV29TipArt = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 4))) ;
         AV103Tip_pz = (short)(GXutil.lval( GXutil.substring( AV16Clave, 9, 4))) ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 14, 2))) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 17, 5) ;
         GXv_char10[0] = AV76Ini_5 ;
         GXv_char4[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char10, GXv_char4) ;
         pclatc.this.AV76Ini_5 = GXv_char10[0] ;
         pclatc.this.AV77Inip_5 = GXv_char4[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 23, 5) ;
         GXv_char10[0] = AV78Fin_5 ;
         GXv_char4[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char10, GXv_char4) ;
         pclatc.this.AV78Fin_5 = GXv_char10[0] ;
         pclatc.this.AV81Finp_5 = GXv_char4[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char10[0] = AV75EmprCod ;
         GXv_int5[0] = AV52CliCod ;
         GXv_char4[0] = AV68ArtCod ;
         GXv_char2[0] = AV47ForColNom ;
         GXv_int3[0] = AV48ForColNum ;
         GXv_int9[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int6[0] = AV50FlagCol ;
         new app.pclaesp3(remoteHandle, context).execute( GXv_char10, GXv_int5, GXv_char4, GXv_char2, GXv_int3, GXv_int9, GXv_int7, GXv_decimal8, GXv_int6) ;
         pclatc.this.AV75EmprCod = GXv_char10[0] ;
         pclatc.this.AV52CliCod = GXv_int5[0] ;
         pclatc.this.AV68ArtCod = GXv_char4[0] ;
         pclatc.this.AV47ForColNom = GXv_char2[0] ;
         pclatc.this.AV48ForColNum = GXv_int3[0] ;
         pclatc.this.AV49TipColCod = GXv_int9[0] ;
         pclatc.this.AV35Familia = GXv_int7[0] ;
         pclatc.this.AV36TotCol = GXv_decimal8[0] ;
         pclatc.this.AV50FlagCol = GXv_int6[0] ;
         AV92TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) && ( AV29TipArt == AV102TipArtFor ) && ( AV103Tip_pz == AV104Tipo_pza ) )
         {
            if ( ( DecimalUtil.compareTo(AV92TotCol2, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C8", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 13, 1) ;
         AV109ProCod = GXutil.substring( AV16Clave, 4, 8) ;
         AV17PrdVal = (byte)(0) ;
         /* Using cursor P01OR7 */
         pr_default.execute(5, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod, AV109ProCod});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A758ProCod = P01OR7_A758ProCod[0] ;
            A65ArtCod = P01OR7_A65ArtCod[0] ;
            A252CliCod = P01OR7_A252CliCod[0] ;
            A396EmprCod = P01OR7_A396EmprCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C9", "")) == 0 )
      {
         GXv_char10[0] = AV75EmprCod ;
         GXv_char4[0] = AV15Descrip ;
         GXv_char2[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int5[0] = AV52CliCod ;
         GXv_char1[0] = AV68ArtCod ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char12[0] = AV22PrdDesc ;
         GXv_char13[0] = AV23Accion ;
         GXv_int14[0] = AV67BarLinMaq ;
         GXv_int3[0] = AV69Volumen ;
         GXv_char15[0] = AV70MaqCod ;
         GXv_int16[0] = AV71MatizForm ;
         GXv_char17[0] = AV47ForColNom ;
         GXv_int18[0] = AV48ForColNum ;
         GXv_int7[0] = AV49TipColCod ;
         GXv_int6[0] = AV73IntCodFor ;
         GXv_char19[0] = AV106BarAntp ;
         GXv_int20[0] = AV102TipArtFor ;
         GXv_int21[0] = AV104Tipo_pza ;
         GXv_char22[0] = AV105BarAcc ;
         GXv_char23[0] = AV107BarAntpT ;
         new app.pclatc9(remoteHandle, context).execute( GXv_char10, GXv_char4, GXv_char2, GXv_int9, GXv_int5, GXv_char1, GXv_decimal8, GXv_char12, GXv_char13, GXv_int14, GXv_int3, GXv_char15, GXv_int16, GXv_char17, GXv_int18, GXv_int7, GXv_int6, GXv_char19, GXv_int20, GXv_int21, GXv_char22, GXv_char23) ;
         pclatc.this.AV75EmprCod = GXv_char10[0] ;
         pclatc.this.AV15Descrip = GXv_char4[0] ;
         pclatc.this.AV16Clave = GXv_char2[0] ;
         pclatc.this.AV17PrdVal = GXv_int9[0] ;
         pclatc.this.AV52CliCod = GXv_int5[0] ;
         pclatc.this.AV68ArtCod = GXv_char1[0] ;
         pclatc.this.AV21TotKil = GXv_decimal8[0] ;
         pclatc.this.AV22PrdDesc = GXv_char12[0] ;
         pclatc.this.AV23Accion = GXv_char13[0] ;
         pclatc.this.AV67BarLinMaq = GXv_int14[0] ;
         pclatc.this.AV69Volumen = GXv_int3[0] ;
         pclatc.this.AV70MaqCod = GXv_char15[0] ;
         pclatc.this.AV71MatizForm = GXv_int16[0] ;
         pclatc.this.AV47ForColNom = GXv_char17[0] ;
         pclatc.this.AV48ForColNum = GXv_int18[0] ;
         pclatc.this.AV49TipColCod = GXv_int7[0] ;
         pclatc.this.AV73IntCodFor = GXv_int6[0] ;
         pclatc.this.AV106BarAntp = GXv_char19[0] ;
         pclatc.this.AV102TipArtFor = GXv_int20[0] ;
         pclatc.this.AV104Tipo_pza = GXv_int21[0] ;
         pclatc.this.AV105BarAcc = GXv_char22[0] ;
         pclatc.this.AV107BarAntpT = GXv_char23[0] ;
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C10", "")) == 0 )
      {
         GXv_char23[0] = AV75EmprCod ;
         GXv_char22[0] = AV15Descrip ;
         GXv_char19[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int18[0] = AV52CliCod ;
         GXv_char17[0] = AV68ArtCod ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char15[0] = AV22PrdDesc ;
         GXv_char13[0] = AV23Accion ;
         GXv_int21[0] = AV67BarLinMaq ;
         GXv_int5[0] = AV69Volumen ;
         GXv_char12[0] = AV70MaqCod ;
         GXv_int20[0] = AV71MatizForm ;
         GXv_char10[0] = AV47ForColNom ;
         GXv_int3[0] = AV48ForColNum ;
         GXv_int7[0] = AV49TipColCod ;
         GXv_int6[0] = AV73IntCodFor ;
         GXv_char4[0] = AV106BarAntp ;
         GXv_int16[0] = AV102TipArtFor ;
         GXv_int14[0] = AV104Tipo_pza ;
         GXv_char2[0] = AV105BarAcc ;
         GXv_char1[0] = AV107BarAntpT ;
         new app.pclatc10(remoteHandle, context).execute( GXv_char23, GXv_char22, GXv_char19, GXv_int9, GXv_int18, GXv_char17, GXv_decimal8, GXv_char15, GXv_char13, GXv_int21, GXv_int5, GXv_char12, GXv_int20, GXv_char10, GXv_int3, GXv_int7, GXv_int6, GXv_char4, GXv_int16, GXv_int14, GXv_char2, GXv_char1) ;
         pclatc.this.AV75EmprCod = GXv_char23[0] ;
         pclatc.this.AV15Descrip = GXv_char22[0] ;
         pclatc.this.AV16Clave = GXv_char19[0] ;
         pclatc.this.AV17PrdVal = GXv_int9[0] ;
         pclatc.this.AV52CliCod = GXv_int18[0] ;
         pclatc.this.AV68ArtCod = GXv_char17[0] ;
         pclatc.this.AV21TotKil = GXv_decimal8[0] ;
         pclatc.this.AV22PrdDesc = GXv_char15[0] ;
         pclatc.this.AV23Accion = GXv_char13[0] ;
         pclatc.this.AV67BarLinMaq = GXv_int21[0] ;
         pclatc.this.AV69Volumen = GXv_int5[0] ;
         pclatc.this.AV70MaqCod = GXv_char12[0] ;
         pclatc.this.AV71MatizForm = GXv_int20[0] ;
         pclatc.this.AV47ForColNom = GXv_char10[0] ;
         pclatc.this.AV48ForColNum = GXv_int3[0] ;
         pclatc.this.AV49TipColCod = GXv_int7[0] ;
         pclatc.this.AV73IntCodFor = GXv_int6[0] ;
         pclatc.this.AV106BarAntp = GXv_char4[0] ;
         pclatc.this.AV102TipArtFor = GXv_int16[0] ;
         pclatc.this.AV104Tipo_pza = GXv_int14[0] ;
         pclatc.this.AV105BarAcc = GXv_char2[0] ;
         pclatc.this.AV107BarAntpT = GXv_char1[0] ;
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "C11", "")) == 0 )
      {
         GXv_char23[0] = AV75EmprCod ;
         GXv_char22[0] = AV15Descrip ;
         GXv_char19[0] = AV16Clave ;
         GXv_int9[0] = AV17PrdVal ;
         GXv_int18[0] = AV52CliCod ;
         GXv_char17[0] = AV68ArtCod ;
         GXv_decimal8[0] = AV21TotKil ;
         GXv_char15[0] = AV22PrdDesc ;
         GXv_char13[0] = AV23Accion ;
         GXv_int21[0] = AV67BarLinMaq ;
         GXv_int5[0] = AV69Volumen ;
         GXv_char12[0] = AV70MaqCod ;
         GXv_int20[0] = AV71MatizForm ;
         GXv_char10[0] = AV47ForColNom ;
         GXv_int3[0] = AV48ForColNum ;
         GXv_int7[0] = AV49TipColCod ;
         GXv_int6[0] = AV73IntCodFor ;
         GXv_char4[0] = AV106BarAntp ;
         GXv_int16[0] = AV102TipArtFor ;
         GXv_int14[0] = AV104Tipo_pza ;
         GXv_char2[0] = AV105BarAcc ;
         GXv_char1[0] = AV107BarAntpT ;
         new app.pclatc11(remoteHandle, context).execute( GXv_char23, GXv_char22, GXv_char19, GXv_int9, GXv_int18, GXv_char17, GXv_decimal8, GXv_char15, GXv_char13, GXv_int21, GXv_int5, GXv_char12, GXv_int20, GXv_char10, GXv_int3, GXv_int7, GXv_int6, GXv_char4, GXv_int16, GXv_int14, GXv_char2, GXv_char1) ;
         pclatc.this.AV75EmprCod = GXv_char23[0] ;
         pclatc.this.AV15Descrip = GXv_char22[0] ;
         pclatc.this.AV16Clave = GXv_char19[0] ;
         pclatc.this.AV17PrdVal = GXv_int9[0] ;
         pclatc.this.AV52CliCod = GXv_int18[0] ;
         pclatc.this.AV68ArtCod = GXv_char17[0] ;
         pclatc.this.AV21TotKil = GXv_decimal8[0] ;
         pclatc.this.AV22PrdDesc = GXv_char15[0] ;
         pclatc.this.AV23Accion = GXv_char13[0] ;
         pclatc.this.AV67BarLinMaq = GXv_int21[0] ;
         pclatc.this.AV69Volumen = GXv_int5[0] ;
         pclatc.this.AV70MaqCod = GXv_char12[0] ;
         pclatc.this.AV71MatizForm = GXv_int20[0] ;
         pclatc.this.AV47ForColNom = GXv_char10[0] ;
         pclatc.this.AV48ForColNum = GXv_int3[0] ;
         pclatc.this.AV49TipColCod = GXv_int7[0] ;
         pclatc.this.AV73IntCodFor = GXv_int6[0] ;
         pclatc.this.AV106BarAntp = GXv_char4[0] ;
         pclatc.this.AV102TipArtFor = GXv_int16[0] ;
         pclatc.this.AV104Tipo_pza = GXv_int14[0] ;
         pclatc.this.AV105BarAcc = GXv_char2[0] ;
         pclatc.this.AV107BarAntpT = GXv_char1[0] ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      AV91Ok_family = (byte)(0) ;
      /* Using cursor P01OR8 */
      pr_default.execute(6, new Object[] {AV75EmprCod, Integer.valueOf(AV83ForNumCol)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A486ForNumCol = P01OR8_A486ForNumCol[0] ;
         A396EmprCod = P01OR8_A396EmprCod[0] ;
         A719PrdNum = P01OR8_A719PrdNum[0] ;
         A309ColLin = P01OR8_A309ColLin[0] ;
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
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclatc.this.AV75EmprCod;
      this.aP1[0] = pclatc.this.AV15Descrip;
      this.aP2[0] = pclatc.this.AV16Clave;
      this.aP3[0] = pclatc.this.AV17PrdVal;
      this.aP4[0] = pclatc.this.AV52CliCod;
      this.aP5[0] = pclatc.this.AV68ArtCod;
      this.aP6[0] = pclatc.this.AV21TotKil;
      this.aP7[0] = pclatc.this.AV22PrdDesc;
      this.aP8[0] = pclatc.this.AV23Accion;
      this.aP9[0] = pclatc.this.AV67BarLinMaq;
      this.aP10[0] = pclatc.this.AV69Volumen;
      this.aP11[0] = pclatc.this.AV70MaqCod;
      this.aP12[0] = pclatc.this.AV71MatizForm;
      this.aP13[0] = pclatc.this.AV47ForColNom;
      this.aP14[0] = pclatc.this.AV48ForColNum;
      this.aP15[0] = pclatc.this.AV49TipColCod;
      this.aP16[0] = pclatc.this.AV73IntCodFor;
      this.aP17[0] = pclatc.this.AV106BarAntp;
      this.aP18[0] = pclatc.this.AV102TipArtFor;
      this.aP19[0] = pclatc.this.AV104Tipo_pza;
      this.aP20[0] = pclatc.this.AV105BarAcc;
      this.aP21[0] = pclatc.this.AV107BarAntpT;
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
      P01OR2_A65ArtCod = new String[] {""} ;
      P01OR2_A252CliCod = new int[1] ;
      P01OR2_A396EmprCod = new String[] {""} ;
      P01OR2_A107ArtTra3 = new String[] {""} ;
      P01OR2_n107ArtTra3 = new boolean[] {false} ;
      P01OR2_A106ArtTra2 = new String[] {""} ;
      P01OR2_n106ArtTra2 = new boolean[] {false} ;
      P01OR2_A105ArtTra1 = new String[] {""} ;
      P01OR2_n105ArtTra1 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      A107ArtTra3 = "" ;
      A106ArtTra2 = "" ;
      A105ArtTra1 = "" ;
      P01OR3_A829TipArtCod = new short[1] ;
      P01OR3_A65ArtCod = new String[] {""} ;
      P01OR3_A252CliCod = new int[1] ;
      P01OR3_A396EmprCod = new String[] {""} ;
      AV30CodMaq = "" ;
      AV76Ini_5 = "" ;
      AV77Inip_5 = "" ;
      AV80ColIni_5 = DecimalUtil.ZERO ;
      AV78Fin_5 = "" ;
      AV81Finp_5 = "" ;
      AV79ColFin_5 = DecimalUtil.ZERO ;
      AV36TotCol = DecimalUtil.ZERO ;
      AV38Producto = "" ;
      AV39Proceso = "" ;
      AV66Station = "" ;
      GXt_char11 = "" ;
      P01OR4_A764ProForCod = new String[] {""} ;
      P01OR4_A831TipColCod = new byte[1] ;
      P01OR4_A483ForColNum = new int[1] ;
      P01OR4_A482ForColNom = new String[] {""} ;
      P01OR4_A494ForSer = new String[] {""} ;
      P01OR4_A252CliCod = new int[1] ;
      P01OR4_A396EmprCod = new String[] {""} ;
      P01OR4_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      AV84F_ok_sb = "" ;
      AV87Pos_pu = "" ;
      AV92TotCol2 = DecimalUtil.ZERO ;
      AV93Pos_u = "" ;
      AV89Family = "" ;
      P01OR5_A831TipColCod = new byte[1] ;
      P01OR5_A483ForColNum = new int[1] ;
      P01OR5_A482ForColNom = new String[] {""} ;
      P01OR5_A494ForSer = new String[] {""} ;
      P01OR5_A252CliCod = new int[1] ;
      P01OR5_A396EmprCod = new String[] {""} ;
      P01OR5_A486ForNumCol = new int[1] ;
      P01OR6_A831TipColCod = new byte[1] ;
      P01OR6_A483ForColNum = new int[1] ;
      P01OR6_A482ForColNom = new String[] {""} ;
      P01OR6_A494ForSer = new String[] {""} ;
      P01OR6_A252CliCod = new int[1] ;
      P01OR6_A396EmprCod = new String[] {""} ;
      P01OR6_A486ForNumCol = new int[1] ;
      AV96Artcod_1 = "" ;
      AV97ArtCod_2 = "" ;
      AV98ColNom_1 = "" ;
      AV99ColNom_2 = "" ;
      AV100Con_Ant = "" ;
      AV108AntpT = "" ;
      AV109ProCod = "" ;
      P01OR7_A758ProCod = new String[] {""} ;
      P01OR7_A65ArtCod = new String[] {""} ;
      P01OR7_A252CliCod = new int[1] ;
      P01OR7_A396EmprCod = new String[] {""} ;
      A758ProCod = "" ;
      GXv_char23 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int18 = new int[1] ;
      GXv_char17 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char15 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int21 = new short[1] ;
      GXv_int5 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_int20 = new short[1] ;
      GXv_char10 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int16 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      P01OR8_A486ForNumCol = new int[1] ;
      P01OR8_A396EmprCod = new String[] {""} ;
      P01OR8_A719PrdNum = new String[] {""} ;
      P01OR8_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      AV88FamiliaA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclatc__default(),
         new Object[] {
             new Object[] {
            P01OR2_A65ArtCod, P01OR2_A252CliCod, P01OR2_A396EmprCod, P01OR2_A107ArtTra3, P01OR2_n107ArtTra3, P01OR2_A106ArtTra2, P01OR2_n106ArtTra2, P01OR2_A105ArtTra1, P01OR2_n105ArtTra1
            }
            , new Object[] {
            P01OR3_A829TipArtCod, P01OR3_A65ArtCod, P01OR3_A252CliCod, P01OR3_A396EmprCod
            }
            , new Object[] {
            P01OR4_A764ProForCod, P01OR4_A831TipColCod, P01OR4_A483ForColNum, P01OR4_A482ForColNom, P01OR4_A494ForSer, P01OR4_A252CliCod, P01OR4_A396EmprCod, P01OR4_A1160ProForL
            }
            , new Object[] {
            P01OR5_A831TipColCod, P01OR5_A483ForColNum, P01OR5_A482ForColNom, P01OR5_A494ForSer, P01OR5_A252CliCod, P01OR5_A396EmprCod, P01OR5_A486ForNumCol
            }
            , new Object[] {
            P01OR6_A831TipColCod, P01OR6_A483ForColNum, P01OR6_A482ForColNom, P01OR6_A494ForSer, P01OR6_A252CliCod, P01OR6_A396EmprCod, P01OR6_A486ForNumCol
            }
            , new Object[] {
            P01OR7_A758ProCod, P01OR7_A65ArtCod, P01OR7_A252CliCod, P01OR7_A396EmprCod
            }
            , new Object[] {
            P01OR8_A486ForNumCol, P01OR8_A396EmprCod, P01OR8_A719PrdNum, P01OR8_A309ColLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV49TipColCod ;
   private byte AV73IntCodFor ;
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
   private byte GXv_int9[] ;
   private byte GXv_int7[] ;
   private byte GXv_int6[] ;
   private byte AV90Length ;
   private short AV67BarLinMaq ;
   private short AV71MatizForm ;
   private short AV102TipArtFor ;
   private short AV104Tipo_pza ;
   private short AV29TipArt ;
   private short A829TipArtCod ;
   private short AV31Matiz ;
   private short A1160ProForL ;
   private short AV103Tip_pz ;
   private short GXv_int21[] ;
   private short GXv_int20[] ;
   private short GXv_int16[] ;
   private short GXv_int14[] ;
   private short A309ColLin ;
   private short Gx_err ;
   private int AV52CliCod ;
   private int AV69Volumen ;
   private int AV48ForColNum ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV74CliCodCla ;
   private int AV83ForNumCol ;
   private int A486ForNumCol ;
   private int GXv_int18[] ;
   private int GXv_int5[] ;
   private int GXv_int3[] ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal AV80ColIni_5 ;
   private java.math.BigDecimal AV79ColFin_5 ;
   private java.math.BigDecimal AV36TotCol ;
   private java.math.BigDecimal AV92TotCol2 ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String AV75EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV68ArtCod ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV70MaqCod ;
   private String AV47ForColNom ;
   private String AV106BarAntp ;
   private String AV105BarAcc ;
   private String AV107BarAntpT ;
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
   private String AV39Proceso ;
   private String AV66Station ;
   private String GXt_char11 ;
   private String A764ProForCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String AV84F_ok_sb ;
   private String AV87Pos_pu ;
   private String AV93Pos_u ;
   private String AV89Family ;
   private String AV96Artcod_1 ;
   private String AV97ArtCod_2 ;
   private String AV98ColNom_1 ;
   private String AV99ColNom_2 ;
   private String AV100Con_Ant ;
   private String AV108AntpT ;
   private String AV109ProCod ;
   private String A758ProCod ;
   private String GXv_char23[] ;
   private String GXv_char22[] ;
   private String GXv_char19[] ;
   private String GXv_char17[] ;
   private String GXv_char15[] ;
   private String GXv_char13[] ;
   private String GXv_char12[] ;
   private String GXv_char10[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String A719PrdNum ;
   private String AV88FamiliaA ;
   private boolean n107ArtTra3 ;
   private boolean n106ArtTra2 ;
   private boolean n105ArtTra1 ;
   private boolean returnInSub ;
   private String[] aP21 ;
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
   private String[] aP17 ;
   private short[] aP18 ;
   private short[] aP19 ;
   private String[] aP20 ;
   private IDataStoreProvider pr_default ;
   private String[] P01OR2_A65ArtCod ;
   private int[] P01OR2_A252CliCod ;
   private String[] P01OR2_A396EmprCod ;
   private String[] P01OR2_A107ArtTra3 ;
   private boolean[] P01OR2_n107ArtTra3 ;
   private String[] P01OR2_A106ArtTra2 ;
   private boolean[] P01OR2_n106ArtTra2 ;
   private String[] P01OR2_A105ArtTra1 ;
   private boolean[] P01OR2_n105ArtTra1 ;
   private short[] P01OR3_A829TipArtCod ;
   private String[] P01OR3_A65ArtCod ;
   private int[] P01OR3_A252CliCod ;
   private String[] P01OR3_A396EmprCod ;
   private String[] P01OR4_A764ProForCod ;
   private byte[] P01OR4_A831TipColCod ;
   private int[] P01OR4_A483ForColNum ;
   private String[] P01OR4_A482ForColNom ;
   private String[] P01OR4_A494ForSer ;
   private int[] P01OR4_A252CliCod ;
   private String[] P01OR4_A396EmprCod ;
   private short[] P01OR4_A1160ProForL ;
   private byte[] P01OR5_A831TipColCod ;
   private int[] P01OR5_A483ForColNum ;
   private String[] P01OR5_A482ForColNom ;
   private String[] P01OR5_A494ForSer ;
   private int[] P01OR5_A252CliCod ;
   private String[] P01OR5_A396EmprCod ;
   private int[] P01OR5_A486ForNumCol ;
   private byte[] P01OR6_A831TipColCod ;
   private int[] P01OR6_A483ForColNum ;
   private String[] P01OR6_A482ForColNom ;
   private String[] P01OR6_A494ForSer ;
   private int[] P01OR6_A252CliCod ;
   private String[] P01OR6_A396EmprCod ;
   private int[] P01OR6_A486ForNumCol ;
   private String[] P01OR7_A758ProCod ;
   private String[] P01OR7_A65ArtCod ;
   private int[] P01OR7_A252CliCod ;
   private String[] P01OR7_A396EmprCod ;
   private int[] P01OR8_A486ForNumCol ;
   private String[] P01OR8_A396EmprCod ;
   private String[] P01OR8_A719PrdNum ;
   private short[] P01OR8_A309ColLin ;
}

final  class pclatc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01OR2", "SELECT ArtCod, CliCod, EmprCod, ArtTra3, ArtTra2, ArtTra1 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01OR3", "SELECT TipArtCod, ArtCod, CliCod, EmprCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (TipArtCod = ?) ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01OR4", "SELECT ProForCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ProForL FROM TXPLFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (ProForCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01OR5", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01OR6", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01OR7", "SELECT ProCod, ArtCod, CliCod, EmprCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01OR8", "SELECT ForNumCol, EmprCod, PrdNum, ColLin FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

