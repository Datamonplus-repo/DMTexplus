package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens041 extends GXProcedure
{
   public pens041( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens041.class ), "" );
   }

   public pens041( int remoteHandle ,
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
                             int[] aP17 )
   {
      pens041.this.aP18 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
      return aP18[0];
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
                        int[] aP17 ,
                        String[] aP18 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
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
                             int[] aP17 ,
                             String[] aP18 )
   {
      pens041.this.AV75EmprCod = aP0[0];
      this.aP0 = aP0;
      pens041.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pens041.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pens041.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pens041.this.AV52CliCod = aP4[0];
      this.aP4 = aP4;
      pens041.this.AV68ArtCod = aP5[0];
      this.aP5 = aP5;
      pens041.this.AV21TotKil = aP6[0];
      this.aP6 = aP6;
      pens041.this.AV22PrdDesc = aP7[0];
      this.aP7 = aP7;
      pens041.this.AV23Accion = aP8[0];
      this.aP8 = aP8;
      pens041.this.AV67BarLinMaq = aP9[0];
      this.aP9 = aP9;
      pens041.this.AV69Volumen = aP10[0];
      this.aP10 = aP10;
      pens041.this.AV70MaqCod = aP11[0];
      this.aP11 = aP11;
      pens041.this.AV71MatizForm = aP12[0];
      this.aP12 = aP12;
      pens041.this.AV47ForColNom = aP13[0];
      this.aP13 = aP13;
      pens041.this.AV48ForColNum = aP14[0];
      this.aP14 = aP14;
      pens041.this.AV49TipColCod = aP15[0];
      this.aP15 = aP15;
      pens041.this.AV73IntCodFor = aP16[0];
      this.aP16 = aP16;
      pens041.this.AV102Lb_numero = aP17[0];
      this.aP17 = aP17;
      pens041.this.AV103Lb_Opcion = aP18[0];
      this.aP18 = aP18;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Opcion = GXutil.substring( AV16Clave, 1, 2) ;
      GXt_int1 = AV107ClaveC ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLAVEC", ""), GXv_int2) ;
      pens041.this.GXt_int1 = GXv_int2[0] ;
      AV107ClaveC = GXt_int1 ;
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AF", "")) == 0 )
      {
         AV25Fibra = GXutil.substring( AV16Clave, 4, 3) ;
         AV23Accion = GXutil.substring( AV16Clave, 8, 1) ;
         /* Using cursor P029O2 */
         pr_default.execute(0, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A65ArtCod = P029O2_A65ArtCod[0] ;
            A252CliCod = P029O2_A252CliCod[0] ;
            A396EmprCod = P029O2_A396EmprCod[0] ;
            A107ArtTra3 = P029O2_A107ArtTra3[0] ;
            n107ArtTra3 = P029O2_n107ArtTra3[0] ;
            A106ArtTra2 = P029O2_A106ArtTra2[0] ;
            n106ArtTra2 = P029O2_n106ArtTra2[0] ;
            A105ArtTra1 = P029O2_A105ArtTra1[0] ;
            n105ArtTra1 = P029O2_n105ArtTra1[0] ;
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
         /* Using cursor P029O3 */
         pr_default.execute(1, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod, Short.valueOf(AV29TipArt)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A829TipArtCod = P029O3_A829TipArtCod[0] ;
            A65ArtCod = P029O3_A65ArtCod[0] ;
            A252CliCod = P029O3_A252CliCod[0] ;
            A396EmprCod = P029O3_A396EmprCod[0] ;
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
         pens041.this.AV76Ini_5 = GXv_char3[0] ;
         pens041.this.AV77Inip_5 = GXv_char4[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char4[0] = AV78Fin_5 ;
         GXv_char3[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         pens041.this.AV78Fin_5 = GXv_char4[0] ;
         pens041.this.AV81Finp_5 = GXv_char3[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char4[0] = AV75EmprCod ;
         GXv_int5[0] = AV102Lb_numero ;
         GXv_char3[0] = AV103Lb_Opcion ;
         GXv_int2[0] = AV35Familia ;
         GXv_decimal6[0] = AV36TotCol ;
         GXv_int7[0] = AV50FlagCol ;
         new app.pens040(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_int2, GXv_decimal6, GXv_int7) ;
         pens041.this.AV75EmprCod = GXv_char4[0] ;
         pens041.this.AV102Lb_numero = GXv_int5[0] ;
         pens041.this.AV103Lb_Opcion = GXv_char3[0] ;
         pens041.this.AV35Familia = GXv_int2[0] ;
         pens041.this.AV36TotCol = GXv_decimal6[0] ;
         pens041.this.AV50FlagCol = GXv_int7[0] ;
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
         GXv_char4[0] = AV76Ini_5 ;
         GXv_char3[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         pens041.this.AV76Ini_5 = GXv_char4[0] ;
         pens041.this.AV77Inip_5 = GXv_char3[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char4[0] = AV78Fin_5 ;
         GXv_char3[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         pens041.this.AV78Fin_5 = GXv_char4[0] ;
         pens041.this.AV81Finp_5 = GXv_char3[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV38Producto = GXutil.substring( AV22PrdDesc, 1, 6) ;
         AV15Descrip = AV38Producto ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char4[0] = AV75EmprCod ;
         GXv_int5[0] = AV102Lb_numero ;
         GXv_char3[0] = AV103Lb_Opcion ;
         GXv_char8[0] = AV38Producto ;
         GXv_decimal6[0] = AV36TotCol ;
         GXv_int7[0] = AV50FlagCol ;
         new app.pens042(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char8, GXv_decimal6, GXv_int7) ;
         pens041.this.AV75EmprCod = GXv_char4[0] ;
         pens041.this.AV102Lb_numero = GXv_int5[0] ;
         pens041.this.AV103Lb_Opcion = GXv_char3[0] ;
         pens041.this.AV38Producto = GXv_char8[0] ;
         pens041.this.AV36TotCol = GXv_decimal6[0] ;
         pens041.this.AV50FlagCol = GXv_int7[0] ;
         AV92TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( AV92TotCol2.doubleValue() == 0 )
            {
               AV17PrdVal = (byte)(2) ;
            }
            else
            {
               if ( ( DecimalUtil.compareTo(AV92TotCol2, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV79ColFin_5) <= 0 ) )
               {
                  AV17PrdVal = (byte)(1) ;
               }
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "PR", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
         AV39Proceso = GXutil.substring( AV16Clave, 4, 6) ;
         AV40FlagPro = (byte)(0) ;
         AV66Station = context.getWorkstationId( remoteHandle) ;
         /* Using cursor P029O4 */
         pr_default.execute(2, new Object[] {AV75EmprCod, Integer.valueOf(AV102Lb_numero), AV39Proceso});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A5553Lb_ForCod = P029O4_A5553Lb_ForCod[0] ;
            A5532Lb_numero = P029O4_A5532Lb_numero[0] ;
            A396EmprCod = P029O4_A396EmprCod[0] ;
            A5551Lb_lineaPq = P029O4_A5551Lb_lineaPq[0] ;
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
         GXv_char8[0] = AV76Ini_5 ;
         GXv_char4[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char8, GXv_char4) ;
         pens041.this.AV76Ini_5 = GXv_char8[0] ;
         pens041.this.AV77Inip_5 = GXv_char4[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char8[0] = AV78Fin_5 ;
         GXv_char4[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char8, GXv_char4) ;
         pens041.this.AV78Fin_5 = GXv_char8[0] ;
         pens041.this.AV81Finp_5 = GXv_char4[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char8[0] = AV75EmprCod ;
         GXv_int5[0] = AV102Lb_numero ;
         GXv_char4[0] = AV103Lb_Opcion ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal6[0] = AV36TotCol ;
         GXv_int2[0] = AV50FlagCol ;
         new app.pens040(remoteHandle, context).execute( GXv_char8, GXv_int5, GXv_char4, GXv_int7, GXv_decimal6, GXv_int2) ;
         pens041.this.AV75EmprCod = GXv_char8[0] ;
         pens041.this.AV102Lb_numero = GXv_int5[0] ;
         pens041.this.AV103Lb_Opcion = GXv_char4[0] ;
         pens041.this.AV35Familia = GXv_int7[0] ;
         pens041.this.AV36TotCol = GXv_decimal6[0] ;
         pens041.this.AV50FlagCol = GXv_int2[0] ;
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
         GXv_char8[0] = AV76Ini_5 ;
         GXv_char4[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char8, GXv_char4) ;
         pens041.this.AV76Ini_5 = GXv_char8[0] ;
         pens041.this.AV77Inip_5 = GXv_char4[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char8[0] = AV78Fin_5 ;
         GXv_char4[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char8, GXv_char4) ;
         pens041.this.AV78Fin_5 = GXv_char8[0] ;
         pens041.this.AV81Finp_5 = GXv_char4[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char8[0] = AV75EmprCod ;
         GXv_int5[0] = AV102Lb_numero ;
         GXv_char4[0] = AV103Lb_Opcion ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal6[0] = AV36TotCol ;
         GXv_int2[0] = AV50FlagCol ;
         new app.pens040(remoteHandle, context).execute( GXv_char8, GXv_int5, GXv_char4, GXv_int7, GXv_decimal6, GXv_int2) ;
         pens041.this.AV75EmprCod = GXv_char8[0] ;
         pens041.this.AV102Lb_numero = GXv_int5[0] ;
         pens041.this.AV103Lb_Opcion = GXv_char4[0] ;
         pens041.this.AV35Familia = GXv_int7[0] ;
         pens041.this.AV36TotCol = GXv_decimal6[0] ;
         pens041.this.AV50FlagCol = GXv_int2[0] ;
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
         /* Using cursor P029O5 */
         pr_default.execute(3, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A831TipColCod = P029O5_A831TipColCod[0] ;
            n831TipColCod = P029O5_n831TipColCod[0] ;
            A483ForColNum = P029O5_A483ForColNum[0] ;
            A482ForColNom = P029O5_A482ForColNom[0] ;
            A494ForSer = P029O5_A494ForSer[0] ;
            A252CliCod = P029O5_A252CliCod[0] ;
            A396EmprCod = P029O5_A396EmprCod[0] ;
            A486ForNumCol = P029O5_A486ForNumCol[0] ;
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
         AV104Con_Ant = GXutil.substring( AV16Clave, 7, 1) ;
         AV23Accion = GXutil.substring( AV16Clave, 9, 1) ;
         if ( ( AV51IntCod == AV73IntCodFor ) && ( GXutil.strcmp(AV104Con_Ant, AV100BarAntp) == 0 ) )
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
         /* Using cursor P029O6 */
         pr_default.execute(4, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod, Short.valueOf(AV29TipArt)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A829TipArtCod = P029O6_A829TipArtCod[0] ;
            A65ArtCod = P029O6_A65ArtCod[0] ;
            A252CliCod = P029O6_A252CliCod[0] ;
            A396EmprCod = P029O6_A396EmprCod[0] ;
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
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TP", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 9, 1) ;
         AV106Clascod = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 4))) ;
         /* Using cursor P029O7 */
         pr_default.execute(5, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV68ArtCod});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A65ArtCod = P029O7_A65ArtCod[0] ;
            A252CliCod = P029O7_A252CliCod[0] ;
            A396EmprCod = P029O7_A396EmprCod[0] ;
            A4295ClasCod = P029O7_A4295ClasCod[0] ;
            n4295ClasCod = P029O7_n4295ClasCod[0] ;
            if ( A4295ClasCod == AV106Clascod )
            {
               AV17PrdVal = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "A", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 14, 1) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 4, 5) ;
         GXv_char8[0] = AV76Ini_5 ;
         GXv_char4[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char8, GXv_char4) ;
         pens041.this.AV76Ini_5 = GXv_char8[0] ;
         pens041.this.AV77Inip_5 = GXv_char4[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char8[0] = AV78Fin_5 ;
         GXv_char4[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char8, GXv_char4) ;
         pens041.this.AV78Fin_5 = GXv_char8[0] ;
         pens041.this.AV81Finp_5 = GXv_char4[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
         AV27RelBanIni = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 2, 2))) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char8[0] = AV75EmprCod ;
         GXv_int5[0] = AV52CliCod ;
         GXv_char4[0] = AV68ArtCod ;
         GXv_char3[0] = AV47ForColNom ;
         GXv_int9[0] = AV48ForColNum ;
         GXv_int7[0] = AV49TipColCod ;
         GXv_int2[0] = AV35Familia ;
         GXv_decimal6[0] = AV36TotCol ;
         GXv_int10[0] = AV50FlagCol ;
         GXv_int11[0] = AV102Lb_numero ;
         GXv_char12[0] = AV103Lb_Opcion ;
         new app.pclaesp7(remoteHandle, context).execute( GXv_char8, GXv_int5, GXv_char4, GXv_char3, GXv_int9, GXv_int7, GXv_int2, GXv_decimal6, GXv_int10, GXv_int11, GXv_char12) ;
         pens041.this.AV75EmprCod = GXv_char8[0] ;
         pens041.this.AV52CliCod = GXv_int5[0] ;
         pens041.this.AV68ArtCod = GXv_char4[0] ;
         pens041.this.AV47ForColNom = GXv_char3[0] ;
         pens041.this.AV48ForColNum = GXv_int9[0] ;
         pens041.this.AV49TipColCod = GXv_int7[0] ;
         pens041.this.AV35Familia = GXv_int2[0] ;
         pens041.this.AV36TotCol = GXv_decimal6[0] ;
         pens041.this.AV50FlagCol = GXv_int10[0] ;
         pens041.this.AV102Lb_numero = GXv_int11[0] ;
         pens041.this.AV103Lb_Opcion = GXv_char12[0] ;
         AV92TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV92TotCol2, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV79ColFin_5) <= 0 ) && ( AV26RelBany == AV27RelBanIni ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CC", "")) == 0 )
      {
         AV74CliCodCla = (int)(GXutil.lval( GXutil.substring( AV16Clave, 3, 6))) ;
         AV108ColNum = (int)(GXutil.lval( GXutil.substring( AV16Clave, 10, 6))) ;
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         /* Using cursor P029O8 */
         pr_default.execute(6, new Object[] {AV75EmprCod, Integer.valueOf(AV102Lb_numero)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A5532Lb_numero = P029O8_A5532Lb_numero[0] ;
            A396EmprCod = P029O8_A396EmprCod[0] ;
            A5537Lb_ColNum = P029O8_A5537Lb_ColNum[0] ;
            A252CliCod = P029O8_A252CliCod[0] ;
            if ( ( A252CliCod == AV74CliCodCla ) && ( A5537Lb_ColNum == AV108ColNum ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "ST", "")) == 0 )
      {
         AV110Barser = GXutil.substring( AV22PrdDesc, 1, 16) ;
         AV80ColIni_5 = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 4, 4), ".").divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         AV79ColFin_5 = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 9, 4), ".").divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 14, 2))) ;
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         /* Using cursor P029O9 */
         pr_default.execute(7, new Object[] {AV75EmprCod, Integer.valueOf(AV102Lb_numero)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A5532Lb_numero = P029O9_A5532Lb_numero[0] ;
            A396EmprCod = P029O9_A396EmprCod[0] ;
            A5533Lb_ArtCod = P029O9_A5533Lb_ArtCod[0] ;
            if ( GXutil.strcmp(A5533Lb_ArtCod, AV110Barser) == 0 )
            {
               AV17PrdVal = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
         if ( AV17PrdVal == 1 )
         {
            AV17PrdVal = (byte)(0) ;
            AV36TotCol = DecimalUtil.doubleToDec(0) ;
            GXv_char12[0] = AV75EmprCod ;
            GXv_int11[0] = AV52CliCod ;
            GXv_char8[0] = AV68ArtCod ;
            GXv_char4[0] = AV47ForColNom ;
            GXv_int9[0] = AV48ForColNum ;
            GXv_int10[0] = AV49TipColCod ;
            GXv_int7[0] = AV35Familia ;
            GXv_decimal6[0] = AV36TotCol ;
            GXv_int2[0] = AV50FlagCol ;
            GXv_int5[0] = AV102Lb_numero ;
            GXv_char3[0] = AV103Lb_Opcion ;
            new app.pclaesp7(remoteHandle, context).execute( GXv_char12, GXv_int11, GXv_char8, GXv_char4, GXv_int9, GXv_int10, GXv_int7, GXv_decimal6, GXv_int2, GXv_int5, GXv_char3) ;
            pens041.this.AV75EmprCod = GXv_char12[0] ;
            pens041.this.AV52CliCod = GXv_int11[0] ;
            pens041.this.AV68ArtCod = GXv_char8[0] ;
            pens041.this.AV47ForColNom = GXv_char4[0] ;
            pens041.this.AV48ForColNum = GXv_int9[0] ;
            pens041.this.AV49TipColCod = GXv_int10[0] ;
            pens041.this.AV35Familia = GXv_int7[0] ;
            pens041.this.AV36TotCol = GXv_decimal6[0] ;
            pens041.this.AV50FlagCol = GXv_int2[0] ;
            pens041.this.AV102Lb_numero = GXv_int5[0] ;
            pens041.this.AV103Lb_Opcion = GXv_char3[0] ;
            AV92TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
            if ( ! (0==AV50FlagCol) )
            {
               if ( ( DecimalUtil.compareTo(AV92TotCol2, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV79ColFin_5) <= 0 ) && ( AV26RelBany == AV27RelBanIni ) )
               {
                  AV17PrdVal = (byte)(1) ;
               }
               else
               {
                  AV17PrdVal = (byte)(0) ;
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
         GXv_char12[0] = AV75EmprCod ;
         GXv_int11[0] = AV52CliCod ;
         GXv_char8[0] = AV68ArtCod ;
         GXv_char4[0] = AV47ForColNom ;
         GXv_int9[0] = AV48ForColNum ;
         GXv_int10[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal6[0] = AV36TotCol ;
         GXv_int2[0] = AV50FlagCol ;
         GXv_int5[0] = AV102Lb_numero ;
         GXv_char3[0] = AV103Lb_Opcion ;
         new app.pclaesp7(remoteHandle, context).execute( GXv_char12, GXv_int11, GXv_char8, GXv_char4, GXv_int9, GXv_int10, GXv_int7, GXv_decimal6, GXv_int2, GXv_int5, GXv_char3) ;
         pens041.this.AV75EmprCod = GXv_char12[0] ;
         pens041.this.AV52CliCod = GXv_int11[0] ;
         pens041.this.AV68ArtCod = GXv_char8[0] ;
         pens041.this.AV47ForColNom = GXv_char4[0] ;
         pens041.this.AV48ForColNum = GXv_int9[0] ;
         pens041.this.AV49TipColCod = GXv_int10[0] ;
         pens041.this.AV35Familia = GXv_int7[0] ;
         pens041.this.AV36TotCol = GXv_decimal6[0] ;
         pens041.this.AV50FlagCol = GXv_int2[0] ;
         pens041.this.AV102Lb_numero = GXv_int5[0] ;
         pens041.this.AV103Lb_Opcion = GXv_char3[0] ;
         AV92TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV92TotCol2, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV92TotCol2, AV79ColFin_5) <= 0 ) && ( AV26RelBany == AV27RelBanIni ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CI", "")) == 0 )
      {
         AV106Clascod = (short)(GXutil.lval( GXutil.substring( AV16Clave, 3, 4))) ;
         /* Using cursor P029O10 */
         pr_default.execute(8, new Object[] {AV75EmprCod, Integer.valueOf(AV52CliCod), AV110Barser});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A65ArtCod = P029O10_A65ArtCod[0] ;
            A252CliCod = P029O10_A252CliCod[0] ;
            A396EmprCod = P029O10_A396EmprCod[0] ;
            A4295ClasCod = P029O10_A4295ClasCod[0] ;
            n4295ClasCod = P029O10_n4295ClasCod[0] ;
            if ( A4295ClasCod == AV106Clascod )
            {
               AV17PrdVal = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
         AV73IntCodFor = (byte)(0) ;
         /* Using cursor P029O11 */
         pr_default.execute(9, new Object[] {AV75EmprCod, Integer.valueOf(AV102Lb_numero)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A5532Lb_numero = P029O11_A5532Lb_numero[0] ;
            A396EmprCod = P029O11_A396EmprCod[0] ;
            A583IntCod = P029O11_A583IntCod[0] ;
            n583IntCod = P029O11_n583IntCod[0] ;
            AV73IntCodFor = A583IntCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
         if ( AV17PrdVal == 1 )
         {
            AV51IntCod = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 7, 2))) ;
            if ( AV51IntCod == AV73IntCodFor )
            {
               AV17PrdVal = (byte)(1) ;
            }
            else
            {
               AV17PrdVal = (byte)(0) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CT", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 7, 1) ;
         AV112BarTipcol = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 4, 2))) ;
         AV111Tc = (byte)(0) ;
         /* Using cursor P029O12 */
         pr_default.execute(10, new Object[] {AV75EmprCod, Integer.valueOf(AV102Lb_numero)});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A5532Lb_numero = P029O12_A5532Lb_numero[0] ;
            A396EmprCod = P029O12_A396EmprCod[0] ;
            A831TipColCod = P029O12_A831TipColCod[0] ;
            n831TipColCod = P029O12_n831TipColCod[0] ;
            AV111Tc = A831TipColCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(10);
         if ( AV111Tc == AV112BarTipcol )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "DA", "")) == 0 )
      {
         AV38Producto = GXutil.substring( AV22PrdDesc, 1, 6) ;
         AV23Accion = GXutil.substring( AV16Clave, 22, 1) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 4, 8) ;
         GXv_char12[0] = AV76Ini_5 ;
         GXv_char8[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char12, GXv_char8) ;
         pens041.this.AV76Ini_5 = GXv_char12[0] ;
         pens041.this.AV77Inip_5 = GXv_char8[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 13, 8) ;
         GXv_char12[0] = AV78Fin_5 ;
         GXv_char8[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char12, GXv_char8) ;
         pens041.this.AV78Fin_5 = GXv_char12[0] ;
         pens041.this.AV81Finp_5 = GXv_char8[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV15Descrip = AV38Producto ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         AV35Familia = (byte)(0) ;
         GXv_char12[0] = AV75EmprCod ;
         GXv_int11[0] = AV102Lb_numero ;
         GXv_char8[0] = AV103Lb_Opcion ;
         GXv_char4[0] = AV38Producto ;
         GXv_decimal6[0] = AV36TotCol ;
         GXv_int10[0] = AV50FlagCol ;
         new app.pens042(remoteHandle, context).execute( GXv_char12, GXv_int11, GXv_char8, GXv_char4, GXv_decimal6, GXv_int10) ;
         pens041.this.AV75EmprCod = GXv_char12[0] ;
         pens041.this.AV102Lb_numero = GXv_int11[0] ;
         pens041.this.AV103Lb_Opcion = GXv_char8[0] ;
         pens041.this.AV38Producto = GXv_char4[0] ;
         pens041.this.AV36TotCol = GXv_decimal6[0] ;
         pens041.this.AV50FlagCol = GXv_int10[0] ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV36TotCol, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV36TotCol, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
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
      /* Using cursor P029O13 */
      pr_default.execute(11, new Object[] {AV75EmprCod, Integer.valueOf(AV83ForNumCol)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A486ForNumCol = P029O13_A486ForNumCol[0] ;
         A396EmprCod = P029O13_A396EmprCod[0] ;
         A719PrdNum = P029O13_A719PrdNum[0] ;
         A309ColLin = P029O13_A309ColLin[0] ;
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
      /* Using cursor P029O14 */
      pr_default.execute(12, new Object[] {Integer.valueOf(AV52CliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A831TipColCod = P029O14_A831TipColCod[0] ;
         n831TipColCod = P029O14_n831TipColCod[0] ;
         A483ForColNum = P029O14_A483ForColNum[0] ;
         A482ForColNom = P029O14_A482ForColNom[0] ;
         A494ForSer = P029O14_A494ForSer[0] ;
         A252CliCod = P029O14_A252CliCod[0] ;
         A583IntCod = P029O14_A583IntCod[0] ;
         n583IntCod = P029O14_n583IntCod[0] ;
         A626MatCod = P029O14_A626MatCod[0] ;
         A486ForNumCol = P029O14_A486ForNumCol[0] ;
         A396EmprCod = P029O14_A396EmprCod[0] ;
         AV73IntCodFor = A583IntCod ;
         AV71MatizForm = A626MatCod ;
         AV83ForNumCol = A486ForNumCol ;
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens041.this.AV75EmprCod;
      this.aP1[0] = pens041.this.AV15Descrip;
      this.aP2[0] = pens041.this.AV16Clave;
      this.aP3[0] = pens041.this.AV17PrdVal;
      this.aP4[0] = pens041.this.AV52CliCod;
      this.aP5[0] = pens041.this.AV68ArtCod;
      this.aP6[0] = pens041.this.AV21TotKil;
      this.aP7[0] = pens041.this.AV22PrdDesc;
      this.aP8[0] = pens041.this.AV23Accion;
      this.aP9[0] = pens041.this.AV67BarLinMaq;
      this.aP10[0] = pens041.this.AV69Volumen;
      this.aP11[0] = pens041.this.AV70MaqCod;
      this.aP12[0] = pens041.this.AV71MatizForm;
      this.aP13[0] = pens041.this.AV47ForColNom;
      this.aP14[0] = pens041.this.AV48ForColNum;
      this.aP15[0] = pens041.this.AV49TipColCod;
      this.aP16[0] = pens041.this.AV73IntCodFor;
      this.aP17[0] = pens041.this.AV102Lb_numero;
      this.aP18[0] = pens041.this.AV103Lb_Opcion;
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
      A396EmprCod = "" ;
      AV25Fibra = "" ;
      scmdbuf = "" ;
      P029O2_A65ArtCod = new String[] {""} ;
      P029O2_A252CliCod = new int[1] ;
      P029O2_A396EmprCod = new String[] {""} ;
      P029O2_A107ArtTra3 = new String[] {""} ;
      P029O2_n107ArtTra3 = new boolean[] {false} ;
      P029O2_A106ArtTra2 = new String[] {""} ;
      P029O2_n106ArtTra2 = new boolean[] {false} ;
      P029O2_A105ArtTra1 = new String[] {""} ;
      P029O2_n105ArtTra1 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A107ArtTra3 = "" ;
      A106ArtTra2 = "" ;
      A105ArtTra1 = "" ;
      P029O3_A829TipArtCod = new short[1] ;
      P029O3_A65ArtCod = new String[] {""} ;
      P029O3_A252CliCod = new int[1] ;
      P029O3_A396EmprCod = new String[] {""} ;
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
      AV39Proceso = "" ;
      AV66Station = "" ;
      P029O4_A5553Lb_ForCod = new String[] {""} ;
      P029O4_A5532Lb_numero = new int[1] ;
      P029O4_A396EmprCod = new String[] {""} ;
      P029O4_A5551Lb_lineaPq = new short[1] ;
      A5553Lb_ForCod = "" ;
      AV84F_ok_sb = "" ;
      AV87Pos_pu = "" ;
      AV93Pos_u = "" ;
      AV89Family = "" ;
      P029O5_A831TipColCod = new byte[1] ;
      P029O5_n831TipColCod = new boolean[] {false} ;
      P029O5_A483ForColNum = new int[1] ;
      P029O5_A482ForColNom = new String[] {""} ;
      P029O5_A494ForSer = new String[] {""} ;
      P029O5_A252CliCod = new int[1] ;
      P029O5_A396EmprCod = new String[] {""} ;
      P029O5_A486ForNumCol = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      AV94VAcc = "" ;
      AV96ArtCod_1 = "" ;
      AV97ArtCod_2 = "" ;
      AV98ColNom_1 = "" ;
      AV99ColNom_2 = "" ;
      AV104Con_Ant = "" ;
      AV100BarAntp = "" ;
      P029O6_A829TipArtCod = new short[1] ;
      P029O6_A65ArtCod = new String[] {""} ;
      P029O6_A252CliCod = new int[1] ;
      P029O6_A396EmprCod = new String[] {""} ;
      P029O7_A65ArtCod = new String[] {""} ;
      P029O7_A252CliCod = new int[1] ;
      P029O7_A396EmprCod = new String[] {""} ;
      P029O7_A4295ClasCod = new short[1] ;
      P029O7_n4295ClasCod = new boolean[] {false} ;
      P029O8_A5532Lb_numero = new int[1] ;
      P029O8_A396EmprCod = new String[] {""} ;
      P029O8_A5537Lb_ColNum = new int[1] ;
      P029O8_A252CliCod = new int[1] ;
      AV110Barser = "" ;
      P029O9_A5532Lb_numero = new int[1] ;
      P029O9_A396EmprCod = new String[] {""} ;
      P029O9_A5533Lb_ArtCod = new String[] {""} ;
      A5533Lb_ArtCod = "" ;
      GXv_int9 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      P029O10_A65ArtCod = new String[] {""} ;
      P029O10_A252CliCod = new int[1] ;
      P029O10_A396EmprCod = new String[] {""} ;
      P029O10_A4295ClasCod = new short[1] ;
      P029O10_n4295ClasCod = new boolean[] {false} ;
      P029O11_A5532Lb_numero = new int[1] ;
      P029O11_A396EmprCod = new String[] {""} ;
      P029O11_A583IntCod = new byte[1] ;
      P029O11_n583IntCod = new boolean[] {false} ;
      P029O12_A5532Lb_numero = new int[1] ;
      P029O12_A396EmprCod = new String[] {""} ;
      P029O12_A831TipColCod = new byte[1] ;
      P029O12_n831TipColCod = new boolean[] {false} ;
      GXv_char12 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int10 = new byte[1] ;
      P029O13_A486ForNumCol = new int[1] ;
      P029O13_A396EmprCod = new String[] {""} ;
      P029O13_A719PrdNum = new String[] {""} ;
      P029O13_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      AV88FamiliaA = "" ;
      AV46ForSer = "" ;
      P029O14_A831TipColCod = new byte[1] ;
      P029O14_n831TipColCod = new boolean[] {false} ;
      P029O14_A483ForColNum = new int[1] ;
      P029O14_A482ForColNom = new String[] {""} ;
      P029O14_A494ForSer = new String[] {""} ;
      P029O14_A252CliCod = new int[1] ;
      P029O14_A583IntCod = new byte[1] ;
      P029O14_n583IntCod = new boolean[] {false} ;
      P029O14_A626MatCod = new short[1] ;
      P029O14_A486ForNumCol = new int[1] ;
      P029O14_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pens041__default(),
         new Object[] {
             new Object[] {
            P029O2_A65ArtCod, P029O2_A252CliCod, P029O2_A396EmprCod, P029O2_A107ArtTra3, P029O2_n107ArtTra3, P029O2_A106ArtTra2, P029O2_n106ArtTra2, P029O2_A105ArtTra1, P029O2_n105ArtTra1
            }
            , new Object[] {
            P029O3_A829TipArtCod, P029O3_A65ArtCod, P029O3_A252CliCod, P029O3_A396EmprCod
            }
            , new Object[] {
            P029O4_A5553Lb_ForCod, P029O4_A5532Lb_numero, P029O4_A396EmprCod, P029O4_A5551Lb_lineaPq
            }
            , new Object[] {
            P029O5_A831TipColCod, P029O5_A483ForColNum, P029O5_A482ForColNom, P029O5_A494ForSer, P029O5_A252CliCod, P029O5_A396EmprCod, P029O5_A486ForNumCol
            }
            , new Object[] {
            P029O6_A829TipArtCod, P029O6_A65ArtCod, P029O6_A252CliCod, P029O6_A396EmprCod
            }
            , new Object[] {
            P029O7_A65ArtCod, P029O7_A252CliCod, P029O7_A396EmprCod, P029O7_A4295ClasCod, P029O7_n4295ClasCod
            }
            , new Object[] {
            P029O8_A5532Lb_numero, P029O8_A396EmprCod, P029O8_A5537Lb_ColNum, P029O8_A252CliCod
            }
            , new Object[] {
            P029O9_A5532Lb_numero, P029O9_A396EmprCod, P029O9_A5533Lb_ArtCod
            }
            , new Object[] {
            P029O10_A65ArtCod, P029O10_A252CliCod, P029O10_A396EmprCod, P029O10_A4295ClasCod, P029O10_n4295ClasCod
            }
            , new Object[] {
            P029O11_A5532Lb_numero, P029O11_A396EmprCod, P029O11_A583IntCod, P029O11_n583IntCod
            }
            , new Object[] {
            P029O12_A5532Lb_numero, P029O12_A396EmprCod, P029O12_A831TipColCod, P029O12_n831TipColCod
            }
            , new Object[] {
            P029O13_A486ForNumCol, P029O13_A396EmprCod, P029O13_A719PrdNum, P029O13_A309ColLin
            }
            , new Object[] {
            P029O14_A831TipColCod, P029O14_A483ForColNum, P029O14_A482ForColNom, P029O14_A494ForSer, P029O14_A252CliCod, P029O14_A583IntCod, P029O14_A626MatCod, P029O14_A486ForNumCol, P029O14_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV49TipColCod ;
   private byte AV73IntCodFor ;
   private byte AV107ClaveC ;
   private byte GXt_int1 ;
   private byte AV26RelBany ;
   private byte AV27RelBanIni ;
   private byte AV28RelBanFin ;
   private byte AV35Familia ;
   private byte AV50FlagCol ;
   private byte AV40FlagPro ;
   private byte AV51IntCod ;
   private byte AV85LenVar ;
   private byte AV86Pos_pu_n ;
   private byte A831TipColCod ;
   private byte AV82Ok_intens ;
   private byte AV91Ok_family ;
   private byte AV95Ok_matiz ;
   private byte GXv_int7[] ;
   private byte GXv_int2[] ;
   private byte A583IntCod ;
   private byte AV112BarTipcol ;
   private byte AV111Tc ;
   private byte GXv_int10[] ;
   private byte AV90Length ;
   private short AV67BarLinMaq ;
   private short AV71MatizForm ;
   private short AV29TipArt ;
   private short A829TipArtCod ;
   private short AV31Matiz ;
   private short A5551Lb_lineaPq ;
   private short AV101TipArti ;
   private short AV106Clascod ;
   private short A4295ClasCod ;
   private short A309ColLin ;
   private short A626MatCod ;
   private short Gx_err ;
   private int AV52CliCod ;
   private int AV69Volumen ;
   private int AV48ForColNum ;
   private int AV102Lb_numero ;
   private int A252CliCod ;
   private int A5532Lb_numero ;
   private int AV74CliCodCla ;
   private int AV83ForNumCol ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV108ColNum ;
   private int A5537Lb_ColNum ;
   private int GXv_int9[] ;
   private int GXv_int5[] ;
   private int GXv_int11[] ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal AV80ColIni_5 ;
   private java.math.BigDecimal AV79ColFin_5 ;
   private java.math.BigDecimal AV36TotCol ;
   private java.math.BigDecimal AV92TotCol2 ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String AV75EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV68ArtCod ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV70MaqCod ;
   private String AV47ForColNom ;
   private String AV103Lb_Opcion ;
   private String AV24Opcion ;
   private String A396EmprCod ;
   private String AV25Fibra ;
   private String scmdbuf ;
   private String A65ArtCod ;
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
   private String A5553Lb_ForCod ;
   private String AV84F_ok_sb ;
   private String AV87Pos_pu ;
   private String AV93Pos_u ;
   private String AV89Family ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String AV94VAcc ;
   private String AV96ArtCod_1 ;
   private String AV97ArtCod_2 ;
   private String AV98ColNom_1 ;
   private String AV99ColNom_2 ;
   private String AV104Con_Ant ;
   private String AV100BarAntp ;
   private String AV110Barser ;
   private String A5533Lb_ArtCod ;
   private String GXv_char3[] ;
   private String GXv_char12[] ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String A719PrdNum ;
   private String AV88FamiliaA ;
   private String AV46ForSer ;
   private boolean n107ArtTra3 ;
   private boolean n106ArtTra2 ;
   private boolean n105ArtTra1 ;
   private boolean n831TipColCod ;
   private boolean returnInSub ;
   private boolean n4295ClasCod ;
   private boolean n583IntCod ;
   private String[] aP18 ;
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
   private int[] aP17 ;
   private IDataStoreProvider pr_default ;
   private String[] P029O2_A65ArtCod ;
   private int[] P029O2_A252CliCod ;
   private String[] P029O2_A396EmprCod ;
   private String[] P029O2_A107ArtTra3 ;
   private boolean[] P029O2_n107ArtTra3 ;
   private String[] P029O2_A106ArtTra2 ;
   private boolean[] P029O2_n106ArtTra2 ;
   private String[] P029O2_A105ArtTra1 ;
   private boolean[] P029O2_n105ArtTra1 ;
   private short[] P029O3_A829TipArtCod ;
   private String[] P029O3_A65ArtCod ;
   private int[] P029O3_A252CliCod ;
   private String[] P029O3_A396EmprCod ;
   private String[] P029O4_A5553Lb_ForCod ;
   private int[] P029O4_A5532Lb_numero ;
   private String[] P029O4_A396EmprCod ;
   private short[] P029O4_A5551Lb_lineaPq ;
   private byte[] P029O5_A831TipColCod ;
   private boolean[] P029O5_n831TipColCod ;
   private int[] P029O5_A483ForColNum ;
   private String[] P029O5_A482ForColNom ;
   private String[] P029O5_A494ForSer ;
   private int[] P029O5_A252CliCod ;
   private String[] P029O5_A396EmprCod ;
   private int[] P029O5_A486ForNumCol ;
   private short[] P029O6_A829TipArtCod ;
   private String[] P029O6_A65ArtCod ;
   private int[] P029O6_A252CliCod ;
   private String[] P029O6_A396EmprCod ;
   private String[] P029O7_A65ArtCod ;
   private int[] P029O7_A252CliCod ;
   private String[] P029O7_A396EmprCod ;
   private short[] P029O7_A4295ClasCod ;
   private boolean[] P029O7_n4295ClasCod ;
   private int[] P029O8_A5532Lb_numero ;
   private String[] P029O8_A396EmprCod ;
   private int[] P029O8_A5537Lb_ColNum ;
   private int[] P029O8_A252CliCod ;
   private int[] P029O9_A5532Lb_numero ;
   private String[] P029O9_A396EmprCod ;
   private String[] P029O9_A5533Lb_ArtCod ;
   private String[] P029O10_A65ArtCod ;
   private int[] P029O10_A252CliCod ;
   private String[] P029O10_A396EmprCod ;
   private short[] P029O10_A4295ClasCod ;
   private boolean[] P029O10_n4295ClasCod ;
   private int[] P029O11_A5532Lb_numero ;
   private String[] P029O11_A396EmprCod ;
   private byte[] P029O11_A583IntCod ;
   private boolean[] P029O11_n583IntCod ;
   private int[] P029O12_A5532Lb_numero ;
   private String[] P029O12_A396EmprCod ;
   private byte[] P029O12_A831TipColCod ;
   private boolean[] P029O12_n831TipColCod ;
   private int[] P029O13_A486ForNumCol ;
   private String[] P029O13_A396EmprCod ;
   private String[] P029O13_A719PrdNum ;
   private short[] P029O13_A309ColLin ;
   private byte[] P029O14_A831TipColCod ;
   private boolean[] P029O14_n831TipColCod ;
   private int[] P029O14_A483ForColNum ;
   private String[] P029O14_A482ForColNom ;
   private String[] P029O14_A494ForSer ;
   private int[] P029O14_A252CliCod ;
   private byte[] P029O14_A583IntCod ;
   private boolean[] P029O14_n583IntCod ;
   private short[] P029O14_A626MatCod ;
   private int[] P029O14_A486ForNumCol ;
   private String[] P029O14_A396EmprCod ;
}

final  class pens041__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P029O2", "SELECT ArtCod, CliCod, EmprCod, ArtTra3, ArtTra2, ArtTra1 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029O3", "SELECT TipArtCod, ArtCod, CliCod, EmprCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (TipArtCod = ?) ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029O4", "SELECT Lb_ForCod, Lb_numero, EmprCod, Lb_lineaPq FROM TXPENS000 WHERE (EmprCod = ? and Lb_numero = ?) AND (Lb_ForCod = ?) ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P029O5", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029O6", "SELECT TipArtCod, ArtCod, CliCod, EmprCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (TipArtCod = ?) ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029O7", "SELECT ArtCod, CliCod, EmprCod, ClasCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029O8", "SELECT Lb_numero, EmprCod, Lb_ColNum, CliCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029O9", "SELECT Lb_numero, EmprCod, Lb_ArtCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029O10", "SELECT ArtCod, CliCod, EmprCod, ClasCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029O11", "SELECT Lb_numero, EmprCod, IntCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029O12", "SELECT Lb_numero, EmprCod, TipColCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P029O13", "SELECT ForNumCol, EmprCod, PrdNum, ColLin FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P029O14", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, IntCod, MatCod, ForNumCol, EmprCod FROM TXPCFORMU WHERE (CliCod = ?) AND (ForSer = ?) AND (ForColNom = ?) AND (ForColNum = ?) AND (TipColCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
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
               stmt.setString(3, (String)parms[2], 6);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

