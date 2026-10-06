package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp004 extends GXProcedure
{
   public pdyrp004( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp004.class ), "" );
   }

   public pdyrp004( int remoteHandle ,
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
      pdyrp004.this.aP10 = new short[] {0};
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
      pdyrp004.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp004.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pdyrp004.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pdyrp004.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pdyrp004.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pdyrp004.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pdyrp004.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pdyrp004.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pdyrp004.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pdyrp004.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pdyrp004.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV130ClaveC ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLAVEC", ""), GXv_int2) ;
      pdyrp004.this.GXt_int1 = GXv_int2[0] ;
      AV130ClaveC = GXt_int1 ;
      AV24Opcion = GXutil.substring( AV16Clave, 1, 2) ;
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AP", "")) == 0 )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = AV15Descrip ;
         GXv_char5[0] = AV16Clave ;
         GXv_int2[0] = AV17PrdVal ;
         GXv_int6[0] = AV18BarCod ;
         GXv_int7[0] = AV19BarCodReo ;
         GXv_char8[0] = AV20BarCodPar ;
         GXv_decimal9[0] = AV21TotKil ;
         GXv_char10[0] = AV22PrdDesc ;
         GXv_char11[0] = AV23Accion ;
         GXv_int12[0] = AV67BarLinMaq ;
         new app.pdyrp005(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_int2, GXv_int6, GXv_int7, GXv_char8, GXv_decimal9, GXv_char10, GXv_char11, GXv_int12) ;
         pdyrp004.this.A396EmprCod = GXv_char3[0] ;
         pdyrp004.this.AV15Descrip = GXv_char4[0] ;
         pdyrp004.this.AV16Clave = GXv_char5[0] ;
         pdyrp004.this.AV17PrdVal = GXv_int2[0] ;
         pdyrp004.this.AV18BarCod = GXv_int6[0] ;
         pdyrp004.this.AV19BarCodReo = GXv_int7[0] ;
         pdyrp004.this.AV20BarCodPar = GXv_char8[0] ;
         pdyrp004.this.AV21TotKil = GXv_decimal9[0] ;
         pdyrp004.this.AV22PrdDesc = GXv_char10[0] ;
         pdyrp004.this.AV23Accion = GXv_char11[0] ;
         pdyrp004.this.AV67BarLinMaq = GXv_int12[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CK", "")) == 0 ) || ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CT", "")) == 0 ) || ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "H1", "")) == 0 ) )
      {
         GXv_char11[0] = A396EmprCod ;
         GXv_char10[0] = AV15Descrip ;
         GXv_char8[0] = AV16Clave ;
         GXv_int7[0] = AV17PrdVal ;
         GXv_int6[0] = AV18BarCod ;
         GXv_int2[0] = AV19BarCodReo ;
         GXv_char5[0] = AV20BarCodPar ;
         GXv_decimal9[0] = AV21TotKil ;
         GXv_char4[0] = AV22PrdDesc ;
         GXv_char3[0] = AV23Accion ;
         GXv_int12[0] = AV67BarLinMaq ;
         new app.pdyrp006(remoteHandle, context).execute( GXv_char11, GXv_char10, GXv_char8, GXv_int7, GXv_int6, GXv_int2, GXv_char5, GXv_decimal9, GXv_char4, GXv_char3, GXv_int12) ;
         pdyrp004.this.A396EmprCod = GXv_char11[0] ;
         pdyrp004.this.AV15Descrip = GXv_char10[0] ;
         pdyrp004.this.AV16Clave = GXv_char8[0] ;
         pdyrp004.this.AV17PrdVal = GXv_int7[0] ;
         pdyrp004.this.AV18BarCod = GXv_int6[0] ;
         pdyrp004.this.AV19BarCodReo = GXv_int2[0] ;
         pdyrp004.this.AV20BarCodPar = GXv_char5[0] ;
         pdyrp004.this.AV21TotKil = GXv_decimal9[0] ;
         pdyrp004.this.AV22PrdDesc = GXv_char4[0] ;
         pdyrp004.this.AV23Accion = GXv_char3[0] ;
         pdyrp004.this.AV67BarLinMaq = GXv_int12[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AF", "")) == 0 )
      {
         AV25Fibra = GXutil.substring( AV16Clave, 4, 3) ;
         AV23Accion = GXutil.substring( AV16Clave, 8, 1) ;
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( GXutil.strcmp(AV110BarTra1, AV25Fibra) == 0 ) || ( GXutil.strcmp(AV111BarTra2, AV25Fibra) == 0 ) || ( GXutil.strcmp(AV112BarTra3, AV25Fibra) == 0 ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "RB", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 10, 1) ;
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
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
         /* Using cursor P098R2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV29TipArt)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A217BarTipArt = P098R2_A217BarTipArt[0] ;
            n217BarTipArt = P098R2_n217BarTipArt[0] ;
            A130BarCodPar = P098R2_A130BarCodPar[0] ;
            A132BarCodReo = P098R2_A132BarCodReo[0] ;
            A129BarCod = P098R2_A129BarCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "MQ", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
         AV30CodMaq = GXutil.substring( AV16Clave, 4, 6) ;
         lV30CodMaq = GXutil.padr( GXutil.rtrim( AV30CodMaq), 6, "%") ;
         /* Using cursor P098R3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, lV30CodMaq});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A180BarMaqCod = P098R3_A180BarMaqCod[0] ;
            A130BarCodPar = P098R3_A130BarCodPar[0] ;
            A132BarCodReo = P098R3_A132BarCodReo[0] ;
            A129BarCod = P098R3_A129BarCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "MA", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 8, 1) ;
         AV31Matiz = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 3))) ;
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'MATIZ' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV17PrdVal = AV100Ok_matiz ;
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TC", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 14, 1) ;
         AV82Ini_5 = GXutil.substring( AV16Clave, 3, 5) ;
         GXv_char11[0] = AV82Ini_5 ;
         GXv_char10[0] = AV85Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char11, GXv_char10) ;
         pdyrp004.this.AV82Ini_5 = GXv_char11[0] ;
         pdyrp004.this.AV85Inip_5 = GXv_char10[0] ;
         AV84ColIni_5 = CommonUtil.decimalVal( AV85Inip_5, ".") ;
         AV83Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char11[0] = AV83Fin_5 ;
         GXv_char10[0] = AV92Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char11, GXv_char10) ;
         pdyrp004.this.AV83Fin_5 = GXv_char11[0] ;
         pdyrp004.this.AV92Finp_5 = GXv_char10[0] ;
         AV86ColFin_5 = CommonUtil.decimalVal( AV92Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV130ClaveC == 1 )
         {
            GXv_char11[0] = A396EmprCod ;
            GXv_int6[0] = AV41BarCliCod ;
            GXv_char10[0] = AV46ForSer ;
            GXv_char8[0] = AV47ForColNom ;
            GXv_int13[0] = AV48ForColNum ;
            GXv_int7[0] = AV49TipColCod ;
            GXv_int2[0] = AV35Familia ;
            GXv_decimal9[0] = AV36TotCol ;
            GXv_int14[0] = AV50FlagCol ;
            GXv_int15[0] = AV18BarCod ;
            GXv_int16[0] = AV19BarCodReo ;
            GXv_char5[0] = AV20BarCodPar ;
            GXv_decimal17[0] = AV21TotKil ;
            GXv_int12[0] = AV67BarLinMaq ;
            new app.pdyrp007(remoteHandle, context).execute( GXv_char11, GXv_int6, GXv_char10, GXv_char8, GXv_int13, GXv_int7, GXv_int2, GXv_decimal9, GXv_int14, GXv_int15, GXv_int16, GXv_char5, GXv_decimal17, GXv_int12) ;
            pdyrp004.this.A396EmprCod = GXv_char11[0] ;
            pdyrp004.this.AV41BarCliCod = GXv_int6[0] ;
            pdyrp004.this.AV46ForSer = GXv_char10[0] ;
            pdyrp004.this.AV47ForColNom = GXv_char8[0] ;
            pdyrp004.this.AV48ForColNum = GXv_int13[0] ;
            pdyrp004.this.AV49TipColCod = GXv_int7[0] ;
            pdyrp004.this.AV35Familia = GXv_int2[0] ;
            pdyrp004.this.AV36TotCol = GXv_decimal9[0] ;
            pdyrp004.this.AV50FlagCol = GXv_int14[0] ;
            pdyrp004.this.AV18BarCod = GXv_int15[0] ;
            pdyrp004.this.AV19BarCodReo = GXv_int16[0] ;
            pdyrp004.this.AV20BarCodPar = GXv_char5[0] ;
            pdyrp004.this.AV21TotKil = GXv_decimal17[0] ;
            pdyrp004.this.AV67BarLinMaq = GXv_int12[0] ;
         }
         else
         {
            GXv_char11[0] = A396EmprCod ;
            GXv_int15[0] = AV41BarCliCod ;
            GXv_char10[0] = AV46ForSer ;
            GXv_char8[0] = AV47ForColNom ;
            GXv_int13[0] = AV48ForColNum ;
            GXv_int16[0] = AV49TipColCod ;
            GXv_int14[0] = AV35Familia ;
            GXv_decimal17[0] = AV36TotCol ;
            GXv_int7[0] = AV50FlagCol ;
            new app.pdyrp008(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_char10, GXv_char8, GXv_int13, GXv_int16, GXv_int14, GXv_decimal17, GXv_int7) ;
            pdyrp004.this.A396EmprCod = GXv_char11[0] ;
            pdyrp004.this.AV41BarCliCod = GXv_int15[0] ;
            pdyrp004.this.AV46ForSer = GXv_char10[0] ;
            pdyrp004.this.AV47ForColNom = GXv_char8[0] ;
            pdyrp004.this.AV48ForColNum = GXv_int13[0] ;
            pdyrp004.this.AV49TipColCod = GXv_int16[0] ;
            pdyrp004.this.AV35Familia = GXv_int14[0] ;
            pdyrp004.this.AV36TotCol = GXv_decimal17[0] ;
            pdyrp004.this.AV50FlagCol = GXv_int7[0] ;
         }
         AV77TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV77TotCol2, AV84ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV77TotCol2, AV86ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "AC", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 14, 1) ;
         AV82Ini_5 = GXutil.substring( AV16Clave, 3, 5) ;
         GXv_char11[0] = AV82Ini_5 ;
         GXv_char10[0] = AV85Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char11, GXv_char10) ;
         pdyrp004.this.AV82Ini_5 = GXv_char11[0] ;
         pdyrp004.this.AV85Inip_5 = GXv_char10[0] ;
         AV84ColIni_5 = CommonUtil.decimalVal( AV85Inip_5, ".") ;
         AV83Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char11[0] = AV83Fin_5 ;
         GXv_char10[0] = AV92Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char11, GXv_char10) ;
         pdyrp004.this.AV83Fin_5 = GXv_char11[0] ;
         pdyrp004.this.AV92Finp_5 = GXv_char10[0] ;
         AV86ColFin_5 = CommonUtil.decimalVal( AV92Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         AV38Producto = GXutil.substring( AV22PrdDesc, 1, 6) ;
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_char11[0] = A396EmprCod ;
         GXv_int15[0] = AV41BarCliCod ;
         GXv_char10[0] = AV46ForSer ;
         GXv_char8[0] = AV47ForColNom ;
         GXv_int13[0] = AV48ForColNum ;
         GXv_int16[0] = AV49TipColCod ;
         GXv_char5[0] = AV38Producto ;
         GXv_decimal17[0] = AV36TotCol ;
         GXv_int14[0] = AV50FlagCol ;
         new app.pdyrp009(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_char10, GXv_char8, GXv_int13, GXv_int16, GXv_char5, GXv_decimal17, GXv_int14) ;
         pdyrp004.this.A396EmprCod = GXv_char11[0] ;
         pdyrp004.this.AV41BarCliCod = GXv_int15[0] ;
         pdyrp004.this.AV46ForSer = GXv_char10[0] ;
         pdyrp004.this.AV47ForColNom = GXv_char8[0] ;
         pdyrp004.this.AV48ForColNum = GXv_int13[0] ;
         pdyrp004.this.AV49TipColCod = GXv_int16[0] ;
         pdyrp004.this.AV38Producto = GXv_char5[0] ;
         pdyrp004.this.AV36TotCol = GXv_decimal17[0] ;
         pdyrp004.this.AV50FlagCol = GXv_int14[0] ;
         AV77TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV77TotCol2, AV84ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV77TotCol2, AV86ColFin_5) <= 0 ) )
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
         AV66Station = context.getWorkstationId( remoteHandle) ;
         /* Using cursor P098R4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV66Station, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A2794BarLinMaq = P098R4_A2794BarLinMaq[0] ;
            A130BarCodPar = P098R4_A130BarCodPar[0] ;
            A132BarCodReo = P098R4_A132BarCodReo[0] ;
            A129BarCod = P098R4_A129BarCod[0] ;
            A2792TermiCod = P098R4_A2792TermiCod[0] ;
            A207BarPrfCod = P098R4_A207BarPrfCod[0] ;
            n207BarPrfCod = P098R4_n207BarPrfCod[0] ;
            A1255BarPrfLin = P098R4_A1255BarPrfLin[0] ;
            AV40FlagPro = (byte)(1) ;
            if ( GXutil.strcmp(A207BarPrfCod, AV39Proceso) == 0 )
            {
               AV17PrdVal = (byte)(1) ;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( AV40FlagPro == 0 )
         {
            /* Execute user subroutine: 'BARCAD' */
            S161 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'LFORMU' */
            S131 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "IT", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 7, 1) ;
         AV51IntCod = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 4, 2))) ;
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'INTENS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV17PrdVal = AV97Ok_intens ;
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CL", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
         AV52CliCod = (int)(GXutil.lval( GXutil.substring( AV16Clave, 4, 6))) ;
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV41BarCliCod == AV52CliCod )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "A", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 14, 1) ;
         AV82Ini_5 = GXutil.substring( AV16Clave, 4, 5) ;
         GXv_char11[0] = AV82Ini_5 ;
         GXv_char10[0] = AV85Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char11, GXv_char10) ;
         pdyrp004.this.AV82Ini_5 = GXv_char11[0] ;
         pdyrp004.this.AV85Inip_5 = GXv_char10[0] ;
         AV84ColIni_5 = CommonUtil.decimalVal( AV85Inip_5, ".") ;
         AV83Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
         GXv_char11[0] = AV83Fin_5 ;
         GXv_char10[0] = AV92Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char11, GXv_char10) ;
         pdyrp004.this.AV83Fin_5 = GXv_char11[0] ;
         pdyrp004.this.AV92Finp_5 = GXv_char10[0] ;
         AV86ColFin_5 = CommonUtil.decimalVal( AV92Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
         AV27RelBanIni = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 2, 2))) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV130ClaveC == 1 )
         {
            GXv_char11[0] = A396EmprCod ;
            GXv_int15[0] = AV41BarCliCod ;
            GXv_char10[0] = AV46ForSer ;
            GXv_char8[0] = AV47ForColNom ;
            GXv_int13[0] = AV48ForColNum ;
            GXv_int16[0] = AV49TipColCod ;
            GXv_int14[0] = AV35Familia ;
            GXv_decimal17[0] = AV36TotCol ;
            GXv_int7[0] = AV50FlagCol ;
            GXv_int6[0] = AV18BarCod ;
            GXv_int2[0] = AV19BarCodReo ;
            GXv_char5[0] = AV20BarCodPar ;
            GXv_decimal9[0] = AV21TotKil ;
            GXv_int12[0] = AV67BarLinMaq ;
            new app.pdyrp007(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_char10, GXv_char8, GXv_int13, GXv_int16, GXv_int14, GXv_decimal17, GXv_int7, GXv_int6, GXv_int2, GXv_char5, GXv_decimal9, GXv_int12) ;
            pdyrp004.this.A396EmprCod = GXv_char11[0] ;
            pdyrp004.this.AV41BarCliCod = GXv_int15[0] ;
            pdyrp004.this.AV46ForSer = GXv_char10[0] ;
            pdyrp004.this.AV47ForColNom = GXv_char8[0] ;
            pdyrp004.this.AV48ForColNum = GXv_int13[0] ;
            pdyrp004.this.AV49TipColCod = GXv_int16[0] ;
            pdyrp004.this.AV35Familia = GXv_int14[0] ;
            pdyrp004.this.AV36TotCol = GXv_decimal17[0] ;
            pdyrp004.this.AV50FlagCol = GXv_int7[0] ;
            pdyrp004.this.AV18BarCod = GXv_int6[0] ;
            pdyrp004.this.AV19BarCodReo = GXv_int2[0] ;
            pdyrp004.this.AV20BarCodPar = GXv_char5[0] ;
            pdyrp004.this.AV21TotKil = GXv_decimal9[0] ;
            pdyrp004.this.AV67BarLinMaq = GXv_int12[0] ;
         }
         else
         {
            GXv_char11[0] = A396EmprCod ;
            GXv_int15[0] = AV41BarCliCod ;
            GXv_char10[0] = AV46ForSer ;
            GXv_char8[0] = AV47ForColNom ;
            GXv_int13[0] = AV48ForColNum ;
            GXv_int16[0] = AV49TipColCod ;
            GXv_int14[0] = AV35Familia ;
            GXv_decimal17[0] = AV36TotCol ;
            GXv_int7[0] = AV50FlagCol ;
            new app.pdyrp008(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_char10, GXv_char8, GXv_int13, GXv_int16, GXv_int14, GXv_decimal17, GXv_int7) ;
            pdyrp004.this.A396EmprCod = GXv_char11[0] ;
            pdyrp004.this.AV41BarCliCod = GXv_int15[0] ;
            pdyrp004.this.AV46ForSer = GXv_char10[0] ;
            pdyrp004.this.AV47ForColNom = GXv_char8[0] ;
            pdyrp004.this.AV48ForColNum = GXv_int13[0] ;
            pdyrp004.this.AV49TipColCod = GXv_int16[0] ;
            pdyrp004.this.AV35Familia = GXv_int14[0] ;
            pdyrp004.this.AV36TotCol = GXv_decimal17[0] ;
            pdyrp004.this.AV50FlagCol = GXv_int7[0] ;
         }
         AV77TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV77TotCol2, AV84ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV77TotCol2, AV86ColFin_5) <= 0 ) && ( AV26RelBany == AV27RelBanIni ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CA", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         AV52CliCod = (int)(GXutil.lval( GXutil.substring( AV16Clave, 4, 6))) ;
         AV29TipArt = (short)(GXutil.lval( GXutil.substring( AV16Clave, 11, 4))) ;
         /* Using cursor P098R5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV29TipArt), Integer.valueOf(AV52CliCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A252CliCod = P098R5_A252CliCod[0] ;
            n252CliCod = P098R5_n252CliCod[0] ;
            A217BarTipArt = P098R5_A217BarTipArt[0] ;
            n217BarTipArt = P098R5_n217BarTipArt[0] ;
            A130BarCodPar = P098R5_A130BarCodPar[0] ;
            A132BarCodReo = P098R5_A132BarCodReo[0] ;
            A129BarCod = P098R5_A129BarCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "GM", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 7, 1) ;
         AV103Mq_grupo = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 4, 2))) ;
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P098R6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(AV103Mq_grupo)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A6037Mq_Grupo = P098R6_A6037Mq_Grupo[0] ;
            A602MaqCod = P098R6_A602MaqCod[0] ;
            if ( GXutil.strcmp(AV105BarMaqCod, A602MaqCod) == 0 )
            {
               AV17PrdVal = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      if ( GXutil.strcmp(GXutil.substring( AV24Opcion, 1, 1), httpContext.getMessage( "B", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         AV114GruMaq = GXutil.substring( AV16Clave, 2, 4) ;
         AV115TotColMin = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 6, 2), ".").add(CommonUtil.decimalVal( GXutil.substring( AV16Clave, 8, 2), ".").divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)) ;
         AV116TotColMax = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 10, 2), ".").add(CommonUtil.decimalVal( GXutil.substring( AV16Clave, 12, 2), ".").divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)) ;
         AV113TipCol = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 14, 2))) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         AV50FlagCol = (byte)(0) ;
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.like( AV105BarMaqCod , GXutil.padr( AV114GruMaq , 6 , "%"),  ' ' ) )
         {
            if ( AV130ClaveC == 1 )
            {
               GXv_char11[0] = A396EmprCod ;
               GXv_int15[0] = AV41BarCliCod ;
               GXv_char10[0] = AV46ForSer ;
               GXv_char8[0] = AV47ForColNom ;
               GXv_int13[0] = AV48ForColNum ;
               GXv_int16[0] = AV49TipColCod ;
               GXv_int14[0] = AV113TipCol ;
               GXv_decimal17[0] = AV36TotCol ;
               GXv_int7[0] = AV50FlagCol ;
               GXv_int6[0] = AV18BarCod ;
               GXv_int2[0] = AV19BarCodReo ;
               GXv_char5[0] = AV20BarCodPar ;
               GXv_decimal9[0] = AV21TotKil ;
               GXv_int12[0] = AV67BarLinMaq ;
               new app.pdyrp007(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_char10, GXv_char8, GXv_int13, GXv_int16, GXv_int14, GXv_decimal17, GXv_int7, GXv_int6, GXv_int2, GXv_char5, GXv_decimal9, GXv_int12) ;
               pdyrp004.this.A396EmprCod = GXv_char11[0] ;
               pdyrp004.this.AV41BarCliCod = GXv_int15[0] ;
               pdyrp004.this.AV46ForSer = GXv_char10[0] ;
               pdyrp004.this.AV47ForColNom = GXv_char8[0] ;
               pdyrp004.this.AV48ForColNum = GXv_int13[0] ;
               pdyrp004.this.AV49TipColCod = GXv_int16[0] ;
               pdyrp004.this.AV113TipCol = GXv_int14[0] ;
               pdyrp004.this.AV36TotCol = GXv_decimal17[0] ;
               pdyrp004.this.AV50FlagCol = GXv_int7[0] ;
               pdyrp004.this.AV18BarCod = GXv_int6[0] ;
               pdyrp004.this.AV19BarCodReo = GXv_int2[0] ;
               pdyrp004.this.AV20BarCodPar = GXv_char5[0] ;
               pdyrp004.this.AV21TotKil = GXv_decimal9[0] ;
               pdyrp004.this.AV67BarLinMaq = GXv_int12[0] ;
            }
            else
            {
               GXv_char11[0] = A396EmprCod ;
               GXv_int15[0] = AV41BarCliCod ;
               GXv_char10[0] = AV46ForSer ;
               GXv_char8[0] = AV47ForColNom ;
               GXv_int13[0] = AV48ForColNum ;
               GXv_int16[0] = AV49TipColCod ;
               GXv_int14[0] = AV113TipCol ;
               GXv_decimal17[0] = AV36TotCol ;
               GXv_int7[0] = AV50FlagCol ;
               new app.pdyrp008(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_char10, GXv_char8, GXv_int13, GXv_int16, GXv_int14, GXv_decimal17, GXv_int7) ;
               pdyrp004.this.A396EmprCod = GXv_char11[0] ;
               pdyrp004.this.AV41BarCliCod = GXv_int15[0] ;
               pdyrp004.this.AV46ForSer = GXv_char10[0] ;
               pdyrp004.this.AV47ForColNom = GXv_char8[0] ;
               pdyrp004.this.AV48ForColNum = GXv_int13[0] ;
               pdyrp004.this.AV49TipColCod = GXv_int16[0] ;
               pdyrp004.this.AV113TipCol = GXv_int14[0] ;
               pdyrp004.this.AV36TotCol = GXv_decimal17[0] ;
               pdyrp004.this.AV50FlagCol = GXv_int7[0] ;
            }
         }
         AV77TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV77TotCol2, AV115TotColMin) >= 0 ) && ( DecimalUtil.compareTo(AV77TotCol2, AV116TotColMax) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "MC", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 15, 1) ;
         AV114GruMaq = GXutil.substring( AV16Clave, 3, 6) ;
         AV80ClasCod = (short)(GXutil.lval( GXutil.substring( AV16Clave, 9, 6))) ;
         AV50FlagCol = (byte)(0) ;
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.like( AV105BarMaqCod , GXutil.padr( AV114GruMaq , 6 , "%"),  ' ' ) )
         {
            AV81BarSer = AV46ForSer ;
            AV52CliCod = AV41BarCliCod ;
            AV50FlagCol = (byte)(1) ;
            Gx_msg += AV105BarMaqCod + httpContext.getMessage( " like ", "") + AV114GruMaq + GXutil.newLine( ) ;
         }
         else
         {
            Gx_msg += AV105BarMaqCod + httpContext.getMessage( " not like ", "") + AV114GruMaq + GXutil.newLine( ) ;
         }
         /* Using cursor P098R7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV52CliCod), AV81BarSer, Byte.valueOf(AV50FlagCol)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A65ArtCod = P098R7_A65ArtCod[0] ;
            A252CliCod = P098R7_A252CliCod[0] ;
            n252CliCod = P098R7_n252CliCod[0] ;
            A4295ClasCod = P098R7_A4295ClasCod[0] ;
            n4295ClasCod = P098R7_n4295ClasCod[0] ;
            if ( A4295ClasCod == AV80ClasCod )
            {
               AV17PrdVal = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "PH", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 9, 1) ;
         AV109ProceCod = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 4))) ;
         AV147GXLvl239 = (byte)(0) ;
         /* Using cursor P098R8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV109ProceCod)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A361DisCod = P098R8_A361DisCod[0] ;
            A966PartCod = P098R8_A966PartCod[0] ;
            n966PartCod = P098R8_n966PartCod[0] ;
            A252CliCod = P098R8_A252CliCod[0] ;
            n252CliCod = P098R8_n252CliCod[0] ;
            A970ProceCod = P098R8_A970ProceCod[0] ;
            n970ProceCod = P098R8_n970ProceCod[0] ;
            A130BarCodPar = P098R8_A130BarCodPar[0] ;
            A132BarCodReo = P098R8_A132BarCodReo[0] ;
            A129BarCod = P098R8_A129BarCod[0] ;
            A966PartCod = P098R8_A966PartCod[0] ;
            n966PartCod = P098R8_n966PartCod[0] ;
            A970ProceCod = P098R8_A970ProceCod[0] ;
            n970ProceCod = P098R8_n970ProceCod[0] ;
            AV147GXLvl239 = (byte)(1) ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
         if ( AV147GXLvl239 == 0 )
         {
            /* Using cursor P098R9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV109ProceCod)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A970ProceCod = P098R9_A970ProceCod[0] ;
               n970ProceCod = P098R9_n970ProceCod[0] ;
               A130BarCodPar = P098R9_A130BarCodPar[0] ;
               A132BarCodReo = P098R9_A132BarCodReo[0] ;
               A129BarCod = P098R9_A129BarCod[0] ;
               A44AlbRecCod = P098R9_A44AlbRecCod[0] ;
               A200BarPieCod = P098R9_A200BarPieCod[0] ;
               A970ProceCod = P098R9_A970ProceCod[0] ;
               n970ProceCod = P098R9_n970ProceCod[0] ;
               AV17PrdVal = (byte)(1) ;
               pr_default.readNext(7);
            }
            pr_default.close(7);
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TP", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 9, 1) ;
         AV80ClasCod = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 4))) ;
         /* Using cursor P098R10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A130BarCodPar = P098R10_A130BarCodPar[0] ;
            A132BarCodReo = P098R10_A132BarCodReo[0] ;
            A129BarCod = P098R10_A129BarCod[0] ;
            A212BarSer = P098R10_A212BarSer[0] ;
            A252CliCod = P098R10_A252CliCod[0] ;
            n252CliCod = P098R10_n252CliCod[0] ;
            AV81BarSer = A212BarSer ;
            AV52CliCod = A252CliCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
         /* Using cursor P098R11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV52CliCod), AV81BarSer, Short.valueOf(AV80ClasCod)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A4295ClasCod = P098R11_A4295ClasCod[0] ;
            n4295ClasCod = P098R11_n4295ClasCod[0] ;
            A65ArtCod = P098R11_A65ArtCod[0] ;
            A252CliCod = P098R11_A252CliCod[0] ;
            n252CliCod = P098R11_n252CliCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CC", "")) == 0 )
      {
         AV52CliCod = (int)(GXutil.lval( GXutil.substring( AV16Clave, 3, 6))) ;
         AV119ColNum = (int)(GXutil.lval( GXutil.substring( AV16Clave, 10, 6))) ;
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         /* Using cursor P098R12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A130BarCodPar = P098R12_A130BarCodPar[0] ;
            A132BarCodReo = P098R12_A132BarCodReo[0] ;
            A129BarCod = P098R12_A129BarCod[0] ;
            A761ProFasLin = P098R12_A761ProFasLin[0] ;
            n761ProFasLin = P098R12_n761ProFasLin[0] ;
            A136BarColNum = P098R12_A136BarColNum[0] ;
            A252CliCod = P098R12_A252CliCod[0] ;
            n252CliCod = P098R12_n252CliCod[0] ;
            A758ProCod = P098R12_A758ProCod[0] ;
            A136BarColNum = P098R12_A136BarColNum[0] ;
            A252CliCod = P098R12_A252CliCod[0] ;
            n252CliCod = P098R12_n252CliCod[0] ;
            if ( ( A252CliCod == AV52CliCod ) && ( A136BarColNum == AV119ColNum ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
            pr_default.readNext(10);
         }
         pr_default.close(10);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "FM", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         AV120Fascod = GXutil.substring( AV16Clave, 4, 8) ;
         AV31Matiz = (short)(GXutil.lval( GXutil.substring( AV16Clave, 12, 3))) ;
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'MATIZ' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV123Ok_fase = (byte)(0) ;
         /* Using cursor P098R13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, AV120Fascod});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A457FasCod = P098R13_A457FasCod[0] ;
            A130BarCodPar = P098R13_A130BarCodPar[0] ;
            A132BarCodReo = P098R13_A132BarCodReo[0] ;
            A129BarCod = P098R13_A129BarCod[0] ;
            A194BarOrdLin = P098R13_A194BarOrdLin[0] ;
            A758ProCod = P098R13_A758ProCod[0] ;
            AV123Ok_fase = (byte)(1) ;
            pr_default.readNext(11);
         }
         pr_default.close(11);
         if ( ( ( AV123Ok_fase == 1 ) && ( AV100Ok_matiz == 1 ) ) || ( ( AV123Ok_fase == 1 ) && ( AV31Matiz == 999 ) ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "QA", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
         AV122Proforcod = GXutil.substring( AV16Clave, 4, 6) ;
         /* Using cursor P098R14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, AV122Proforcod});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A118BarAcaQui = P098R14_A118BarAcaQui[0] ;
            A130BarCodPar = P098R14_A130BarCodPar[0] ;
            A132BarCodReo = P098R14_A132BarCodReo[0] ;
            A129BarCod = P098R14_A129BarCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(12);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "FS", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 13, 1) ;
         AV120Fascod = GXutil.substring( AV16Clave, 4, 8) ;
         /* Using cursor P098R15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, AV120Fascod});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A457FasCod = P098R15_A457FasCod[0] ;
            A130BarCodPar = P098R15_A130BarCodPar[0] ;
            A132BarCodReo = P098R15_A132BarCodReo[0] ;
            A129BarCod = P098R15_A129BarCod[0] ;
            A194BarOrdLin = P098R15_A194BarOrdLin[0] ;
            A758ProCod = P098R15_A758ProCod[0] ;
            AV17PrdVal = (byte)(1) ;
            pr_default.readNext(13);
         }
         pr_default.close(13);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TT", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 9, 1) ;
         AV80ClasCod = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 4))) ;
         /* Using cursor P098R16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A130BarCodPar = P098R16_A130BarCodPar[0] ;
            A132BarCodReo = P098R16_A132BarCodReo[0] ;
            A129BarCod = P098R16_A129BarCod[0] ;
            A212BarSer = P098R16_A212BarSer[0] ;
            A252CliCod = P098R16_A252CliCod[0] ;
            n252CliCod = P098R16_n252CliCod[0] ;
            A120BarAgrEst = P098R16_A120BarAgrEst[0] ;
            AV126Artcod = A212BarSer ;
            AV127Clicodf = A252CliCod ;
            /* Execute user subroutine: 'ARTICU' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(14);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Execute user subroutine: 'BARAGR' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(14);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(14);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CR", "")) == 0 )
      {
         AV129CruCod = (int)(GXutil.lval( GXutil.substring( AV16Clave, 4, 6))) ;
         AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
         /* Using cursor P098R17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Integer.valueOf(AV129CruCod)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A361DisCod = P098R17_A361DisCod[0] ;
            A966PartCod = P098R17_A966PartCod[0] ;
            n966PartCod = P098R17_n966PartCod[0] ;
            A252CliCod = P098R17_A252CliCod[0] ;
            n252CliCod = P098R17_n252CliCod[0] ;
            A5874CruCod = P098R17_A5874CruCod[0] ;
            n5874CruCod = P098R17_n5874CruCod[0] ;
            A130BarCodPar = P098R17_A130BarCodPar[0] ;
            A132BarCodReo = P098R17_A132BarCodReo[0] ;
            A129BarCod = P098R17_A129BarCod[0] ;
            A966PartCod = P098R17_A966PartCod[0] ;
            n966PartCod = P098R17_n966PartCod[0] ;
            A5874CruCod = P098R17_A5874CruCod[0] ;
            n5874CruCod = P098R17_n5874CruCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(15);
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "DT", "")) == 0 )
      {
         AV157Barclides = (int)(GXutil.lval( GXutil.substring( AV22PrdDesc, 1, 6))) ;
         AV84ColIni_5 = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 4, 4), ".").divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         AV86ColFin_5 = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 9, 4), ".").divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 14, 2))) ;
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         /* Using cursor P098R18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Integer.valueOf(AV157Barclides)});
         while ( (pr_default.getStatus(16) != 101) )
         {
            A2311BarCliDes = P098R18_A2311BarCliDes[0] ;
            A130BarCodPar = P098R18_A130BarCodPar[0] ;
            A132BarCodReo = P098R18_A132BarCodReo[0] ;
            A129BarCod = P098R18_A129BarCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(16);
         if ( AV17PrdVal == 1 )
         {
            AV17PrdVal = (byte)(0) ;
            AV36TotCol = DecimalUtil.doubleToDec(0) ;
            /* Execute user subroutine: 'BARCAD' */
            S161 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV130ClaveC == 1 )
            {
               GXv_char11[0] = A396EmprCod ;
               GXv_int15[0] = AV41BarCliCod ;
               GXv_char10[0] = AV46ForSer ;
               GXv_char8[0] = AV47ForColNom ;
               GXv_int13[0] = AV48ForColNum ;
               GXv_int16[0] = AV49TipColCod ;
               GXv_int14[0] = AV35Familia ;
               GXv_decimal17[0] = AV36TotCol ;
               GXv_int7[0] = AV50FlagCol ;
               GXv_int6[0] = AV18BarCod ;
               GXv_int2[0] = AV19BarCodReo ;
               GXv_char5[0] = AV20BarCodPar ;
               GXv_decimal9[0] = AV21TotKil ;
               GXv_int12[0] = AV67BarLinMaq ;
               new app.pdyrp007(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_char10, GXv_char8, GXv_int13, GXv_int16, GXv_int14, GXv_decimal17, GXv_int7, GXv_int6, GXv_int2, GXv_char5, GXv_decimal9, GXv_int12) ;
               pdyrp004.this.A396EmprCod = GXv_char11[0] ;
               pdyrp004.this.AV41BarCliCod = GXv_int15[0] ;
               pdyrp004.this.AV46ForSer = GXv_char10[0] ;
               pdyrp004.this.AV47ForColNom = GXv_char8[0] ;
               pdyrp004.this.AV48ForColNum = GXv_int13[0] ;
               pdyrp004.this.AV49TipColCod = GXv_int16[0] ;
               pdyrp004.this.AV35Familia = GXv_int14[0] ;
               pdyrp004.this.AV36TotCol = GXv_decimal17[0] ;
               pdyrp004.this.AV50FlagCol = GXv_int7[0] ;
               pdyrp004.this.AV18BarCod = GXv_int6[0] ;
               pdyrp004.this.AV19BarCodReo = GXv_int2[0] ;
               pdyrp004.this.AV20BarCodPar = GXv_char5[0] ;
               pdyrp004.this.AV21TotKil = GXv_decimal9[0] ;
               pdyrp004.this.AV67BarLinMaq = GXv_int12[0] ;
            }
            else
            {
               GXv_char11[0] = A396EmprCod ;
               GXv_int15[0] = AV41BarCliCod ;
               GXv_char10[0] = AV46ForSer ;
               GXv_char8[0] = AV47ForColNom ;
               GXv_int13[0] = AV48ForColNum ;
               GXv_int16[0] = AV49TipColCod ;
               GXv_int14[0] = AV35Familia ;
               GXv_decimal17[0] = AV36TotCol ;
               GXv_int7[0] = AV50FlagCol ;
               new app.pdyrp008(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_char10, GXv_char8, GXv_int13, GXv_int16, GXv_int14, GXv_decimal17, GXv_int7) ;
               pdyrp004.this.A396EmprCod = GXv_char11[0] ;
               pdyrp004.this.AV41BarCliCod = GXv_int15[0] ;
               pdyrp004.this.AV46ForSer = GXv_char10[0] ;
               pdyrp004.this.AV47ForColNom = GXv_char8[0] ;
               pdyrp004.this.AV48ForColNum = GXv_int13[0] ;
               pdyrp004.this.AV49TipColCod = GXv_int16[0] ;
               pdyrp004.this.AV35Familia = GXv_int14[0] ;
               pdyrp004.this.AV36TotCol = GXv_decimal17[0] ;
               pdyrp004.this.AV50FlagCol = GXv_int7[0] ;
            }
            AV77TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
            if ( ! (0==AV50FlagCol) )
            {
               if ( ( DecimalUtil.compareTo(AV77TotCol2, AV84ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV77TotCol2, AV86ColFin_5) <= 0 ) )
               {
                  AV17PrdVal = (byte)(1) ;
               }
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "ST", "")) == 0 )
      {
         AV81BarSer = GXutil.substring( AV22PrdDesc, 1, 16) ;
         AV84ColIni_5 = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 4, 4), ".").divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         AV86ColFin_5 = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 9, 4), ".").divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 14, 2))) ;
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         /* Using cursor P098R19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, AV81BarSer});
         while ( (pr_default.getStatus(17) != 101) )
         {
            A212BarSer = P098R19_A212BarSer[0] ;
            A130BarCodPar = P098R19_A130BarCodPar[0] ;
            A132BarCodReo = P098R19_A132BarCodReo[0] ;
            A129BarCod = P098R19_A129BarCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(17);
         if ( AV17PrdVal == 1 )
         {
            AV17PrdVal = (byte)(0) ;
            AV36TotCol = DecimalUtil.doubleToDec(0) ;
            /* Execute user subroutine: 'BARCAD' */
            S161 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV130ClaveC == 1 )
            {
               GXv_char11[0] = A396EmprCod ;
               GXv_int15[0] = AV41BarCliCod ;
               GXv_char10[0] = AV46ForSer ;
               GXv_char8[0] = AV47ForColNom ;
               GXv_int13[0] = AV48ForColNum ;
               GXv_int16[0] = AV49TipColCod ;
               GXv_int14[0] = AV35Familia ;
               GXv_decimal17[0] = AV36TotCol ;
               GXv_int7[0] = AV50FlagCol ;
               GXv_int6[0] = AV18BarCod ;
               GXv_int2[0] = AV19BarCodReo ;
               GXv_char5[0] = AV20BarCodPar ;
               GXv_decimal9[0] = AV21TotKil ;
               GXv_int12[0] = AV67BarLinMaq ;
               new app.pdyrp007(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_char10, GXv_char8, GXv_int13, GXv_int16, GXv_int14, GXv_decimal17, GXv_int7, GXv_int6, GXv_int2, GXv_char5, GXv_decimal9, GXv_int12) ;
               pdyrp004.this.A396EmprCod = GXv_char11[0] ;
               pdyrp004.this.AV41BarCliCod = GXv_int15[0] ;
               pdyrp004.this.AV46ForSer = GXv_char10[0] ;
               pdyrp004.this.AV47ForColNom = GXv_char8[0] ;
               pdyrp004.this.AV48ForColNum = GXv_int13[0] ;
               pdyrp004.this.AV49TipColCod = GXv_int16[0] ;
               pdyrp004.this.AV35Familia = GXv_int14[0] ;
               pdyrp004.this.AV36TotCol = GXv_decimal17[0] ;
               pdyrp004.this.AV50FlagCol = GXv_int7[0] ;
               pdyrp004.this.AV18BarCod = GXv_int6[0] ;
               pdyrp004.this.AV19BarCodReo = GXv_int2[0] ;
               pdyrp004.this.AV20BarCodPar = GXv_char5[0] ;
               pdyrp004.this.AV21TotKil = GXv_decimal9[0] ;
               pdyrp004.this.AV67BarLinMaq = GXv_int12[0] ;
            }
            else
            {
               GXv_char11[0] = A396EmprCod ;
               GXv_int15[0] = AV41BarCliCod ;
               GXv_char10[0] = AV46ForSer ;
               GXv_char8[0] = AV47ForColNom ;
               GXv_int13[0] = AV48ForColNum ;
               GXv_int16[0] = AV49TipColCod ;
               GXv_int14[0] = AV35Familia ;
               GXv_decimal17[0] = AV36TotCol ;
               GXv_int7[0] = AV50FlagCol ;
               new app.pdyrp008(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_char10, GXv_char8, GXv_int13, GXv_int16, GXv_int14, GXv_decimal17, GXv_int7) ;
               pdyrp004.this.A396EmprCod = GXv_char11[0] ;
               pdyrp004.this.AV41BarCliCod = GXv_int15[0] ;
               pdyrp004.this.AV46ForSer = GXv_char10[0] ;
               pdyrp004.this.AV47ForColNom = GXv_char8[0] ;
               pdyrp004.this.AV48ForColNum = GXv_int13[0] ;
               pdyrp004.this.AV49TipColCod = GXv_int16[0] ;
               pdyrp004.this.AV35Familia = GXv_int14[0] ;
               pdyrp004.this.AV36TotCol = GXv_decimal17[0] ;
               pdyrp004.this.AV50FlagCol = GXv_int7[0] ;
            }
            AV77TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
            if ( ! (0==AV50FlagCol) )
            {
               if ( ( DecimalUtil.compareTo(AV77TotCol2, AV84ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV77TotCol2, AV86ColFin_5) <= 0 ) )
               {
                  AV17PrdVal = (byte)(1) ;
               }
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "TG", "")) == 0 )
      {
         AV84ColIni_5 = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 4, 5), ".") ;
         AV86ColFin_5 = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 9, 5), ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 14, 2))) ;
         AV23Accion = GXutil.substring( AV16Clave, 16, 1) ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV130ClaveC == 1 )
         {
            GXv_char11[0] = A396EmprCod ;
            GXv_int15[0] = AV41BarCliCod ;
            GXv_char10[0] = AV46ForSer ;
            GXv_char8[0] = AV47ForColNom ;
            GXv_int13[0] = AV48ForColNum ;
            GXv_int16[0] = AV49TipColCod ;
            GXv_int14[0] = AV35Familia ;
            GXv_decimal17[0] = AV36TotCol ;
            GXv_int7[0] = AV50FlagCol ;
            GXv_int6[0] = AV18BarCod ;
            GXv_int2[0] = AV19BarCodReo ;
            GXv_char5[0] = AV20BarCodPar ;
            GXv_decimal9[0] = AV21TotKil ;
            GXv_int12[0] = AV67BarLinMaq ;
            new app.pdyrp007(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_char10, GXv_char8, GXv_int13, GXv_int16, GXv_int14, GXv_decimal17, GXv_int7, GXv_int6, GXv_int2, GXv_char5, GXv_decimal9, GXv_int12) ;
            pdyrp004.this.A396EmprCod = GXv_char11[0] ;
            pdyrp004.this.AV41BarCliCod = GXv_int15[0] ;
            pdyrp004.this.AV46ForSer = GXv_char10[0] ;
            pdyrp004.this.AV47ForColNom = GXv_char8[0] ;
            pdyrp004.this.AV48ForColNum = GXv_int13[0] ;
            pdyrp004.this.AV49TipColCod = GXv_int16[0] ;
            pdyrp004.this.AV35Familia = GXv_int14[0] ;
            pdyrp004.this.AV36TotCol = GXv_decimal17[0] ;
            pdyrp004.this.AV50FlagCol = GXv_int7[0] ;
            pdyrp004.this.AV18BarCod = GXv_int6[0] ;
            pdyrp004.this.AV19BarCodReo = GXv_int2[0] ;
            pdyrp004.this.AV20BarCodPar = GXv_char5[0] ;
            pdyrp004.this.AV21TotKil = GXv_decimal9[0] ;
            pdyrp004.this.AV67BarLinMaq = GXv_int12[0] ;
         }
         else
         {
            GXv_char11[0] = A396EmprCod ;
            GXv_int15[0] = AV41BarCliCod ;
            GXv_char10[0] = AV46ForSer ;
            GXv_char8[0] = AV47ForColNom ;
            GXv_int13[0] = AV48ForColNum ;
            GXv_int16[0] = AV49TipColCod ;
            GXv_int14[0] = AV35Familia ;
            GXv_decimal17[0] = AV36TotCol ;
            GXv_int7[0] = AV50FlagCol ;
            new app.pdyrp008(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_char10, GXv_char8, GXv_int13, GXv_int16, GXv_int14, GXv_decimal17, GXv_int7) ;
            pdyrp004.this.A396EmprCod = GXv_char11[0] ;
            pdyrp004.this.AV41BarCliCod = GXv_int15[0] ;
            pdyrp004.this.AV46ForSer = GXv_char10[0] ;
            pdyrp004.this.AV47ForColNom = GXv_char8[0] ;
            pdyrp004.this.AV48ForColNum = GXv_int13[0] ;
            pdyrp004.this.AV49TipColCod = GXv_int16[0] ;
            pdyrp004.this.AV35Familia = GXv_int14[0] ;
            pdyrp004.this.AV36TotCol = GXv_decimal17[0] ;
            pdyrp004.this.AV50FlagCol = GXv_int7[0] ;
         }
         AV77TotCol2 = AV21TotKil.multiply(AV36TotCol).multiply(DecimalUtil.doubleToDec(10)) ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV77TotCol2, AV84ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV77TotCol2, AV86ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CI", "")) == 0 )
      {
         AV80ClasCod = (short)(GXutil.lval( GXutil.substring( AV16Clave, 3, 4))) ;
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P098R20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(AV52CliCod), AV81BarSer, Short.valueOf(AV80ClasCod)});
         while ( (pr_default.getStatus(18) != 101) )
         {
            A4295ClasCod = P098R20_A4295ClasCod[0] ;
            n4295ClasCod = P098R20_n4295ClasCod[0] ;
            A65ArtCod = P098R20_A65ArtCod[0] ;
            A252CliCod = P098R20_A252CliCod[0] ;
            n252CliCod = P098R20_n252CliCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(18);
         if ( AV17PrdVal == 1 )
         {
            AV51IntCod = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 7, 2))) ;
            /* Execute user subroutine: 'INTENS' */
            S151 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV17PrdVal = AV97Ok_intens ;
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "G2", "")) == 0 )
      {
         /* Execute user subroutine: 'BARCAD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV23Accion = GXutil.substring( AV16Clave, 13, 1) ;
         AV136grm2ini = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 4))) ;
         AV137grm2fin = (short)(GXutil.lval( GXutil.substring( AV16Clave, 9, 4))) ;
         AV23Accion = GXutil.substring( AV16Clave, 13, 1) ;
         if ( ( AV135BarGraaca >= AV136grm2ini ) && ( AV135BarGraaca <= AV137grm2fin ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      /* Using cursor P098R21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(AV127Clicodf), AV126Artcod, Short.valueOf(AV80ClasCod)});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A4295ClasCod = P098R21_A4295ClasCod[0] ;
         n4295ClasCod = P098R21_n4295ClasCod[0] ;
         A65ArtCod = P098R21_A65ArtCod[0] ;
         A252CliCod = P098R21_A252CliCod[0] ;
         n252CliCod = P098R21_n252CliCod[0] ;
         AV17PrdVal = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(19);
   }

   public void S121( )
   {
      /* 'BARAGR' Routine */
      returnInSub = false ;
      /* Using cursor P098R22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A130BarCodPar = P098R22_A130BarCodPar[0] ;
         A132BarCodReo = P098R22_A132BarCodReo[0] ;
         A129BarCod = P098R22_A129BarCod[0] ;
         A1245BarAgrSer = P098R22_A1245BarAgrSer[0] ;
         A1508CliCodAgr = P098R22_A1508CliCodAgr[0] ;
         A119BarAgrCod = P098R22_A119BarAgrCod[0] ;
         A124BarAgrReo = P098R22_A124BarAgrReo[0] ;
         A122BarAgrPar = P098R22_A122BarAgrPar[0] ;
         AV126Artcod = A1245BarAgrSer ;
         AV127Clicodf = A1508CliCodAgr ;
         /* Execute user subroutine: 'ARTICU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(20);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(20);
      }
      pr_default.close(20);
   }

   public void S131( )
   {
      /* 'LFORMU' Routine */
      returnInSub = false ;
      AV17PrdVal = (byte)(0) ;
      /* Using cursor P098R23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod)});
      while ( (pr_default.getStatus(21) != 101) )
      {
         A831TipColCod = P098R23_A831TipColCod[0] ;
         A483ForColNum = P098R23_A483ForColNum[0] ;
         A482ForColNom = P098R23_A482ForColNom[0] ;
         A494ForSer = P098R23_A494ForSer[0] ;
         A252CliCod = P098R23_A252CliCod[0] ;
         n252CliCod = P098R23_n252CliCod[0] ;
         A764ProForCod = P098R23_A764ProForCod[0] ;
         A1160ProForL = P098R23_A1160ProForL[0] ;
         if ( GXutil.strcmp(A764ProForCod, AV39Proceso) == 0 )
         {
            AV17PrdVal = (byte)(1) ;
         }
         pr_default.readNext(21);
      }
      pr_default.close(21);
   }

   public void S141( )
   {
      /* 'MATIZ' Routine */
      returnInSub = false ;
      AV100Ok_matiz = (byte)(0) ;
      /* Using cursor P098R24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod), Short.valueOf(AV31Matiz)});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A626MatCod = P098R24_A626MatCod[0] ;
         A831TipColCod = P098R24_A831TipColCod[0] ;
         A483ForColNum = P098R24_A483ForColNum[0] ;
         A482ForColNom = P098R24_A482ForColNom[0] ;
         A494ForSer = P098R24_A494ForSer[0] ;
         A252CliCod = P098R24_A252CliCod[0] ;
         n252CliCod = P098R24_n252CliCod[0] ;
         AV100Ok_matiz = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(22);
   }

   public void S151( )
   {
      /* 'INTENS' Routine */
      returnInSub = false ;
      AV97Ok_intens = (byte)(0) ;
      /* Using cursor P098R25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod), Byte.valueOf(AV51IntCod)});
      while ( (pr_default.getStatus(23) != 101) )
      {
         A583IntCod = P098R25_A583IntCod[0] ;
         A831TipColCod = P098R25_A831TipColCod[0] ;
         A483ForColNum = P098R25_A483ForColNum[0] ;
         A482ForColNom = P098R25_A482ForColNom[0] ;
         A494ForSer = P098R25_A494ForSer[0] ;
         A252CliCod = P098R25_A252CliCod[0] ;
         n252CliCod = P098R25_n252CliCod[0] ;
         AV97Ok_intens = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(23);
   }

   public void S161( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV99BarAcc = GXutil.space( (short)(1)) ;
      AV41BarCliCod = 0 ;
      AV46ForSer = "" ;
      AV47ForColNom = "" ;
      AV48ForColNum = 0 ;
      AV49TipColCod = (byte)(0) ;
      AV110BarTra1 = "" ;
      AV111BarTra2 = "" ;
      AV112BarTra3 = "" ;
      AV72Color13_1 = "" ;
      AV76BarSer34 = "" ;
      AV26RelBany = (byte)(0) ;
      AV105BarMaqCod = "" ;
      /* Using cursor P098R26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
      while ( (pr_default.getStatus(24) != 101) )
      {
         A130BarCodPar = P098R26_A130BarCodPar[0] ;
         A132BarCodReo = P098R26_A132BarCodReo[0] ;
         A129BarCod = P098R26_A129BarCod[0] ;
         A252CliCod = P098R26_A252CliCod[0] ;
         n252CliCod = P098R26_n252CliCod[0] ;
         A212BarSer = P098R26_A212BarSer[0] ;
         A135BarColNom = P098R26_A135BarColNom[0] ;
         A136BarColNum = P098R26_A136BarColNum[0] ;
         A218BarTipCol = P098R26_A218BarTipCol[0] ;
         A221BarTra1 = P098R26_A221BarTra1[0] ;
         A222BarTra2 = P098R26_A222BarTra2[0] ;
         A223BarTra3 = P098R26_A223BarTra3[0] ;
         A236BarVolMaq = P098R26_A236BarVolMaq[0] ;
         A5253BarAcc = P098R26_A5253BarAcc[0] ;
         A180BarMaqCod = P098R26_A180BarMaqCod[0] ;
         A1909BarGraAca = P098R26_A1909BarGraAca[0] ;
         AV41BarCliCod = A252CliCod ;
         AV46ForSer = A212BarSer ;
         AV47ForColNom = A135BarColNom ;
         AV48ForColNum = A136BarColNum ;
         AV49TipColCod = A218BarTipCol ;
         AV110BarTra1 = A221BarTra1 ;
         AV111BarTra2 = A222BarTra2 ;
         AV112BarTra3 = A223BarTra3 ;
         AV72Color13_1 = GXutil.substring( A135BarColNom, 13, 1) ;
         AV76BarSer34 = GXutil.substring( A212BarSer, 3, 2) ;
         AV26RelBany = (byte)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(A236BarVolMaq).divide(AV21TotKil, 18, java.math.RoundingMode.DOWN)), 0))) ;
         if ( AV26RelBany > 99 )
         {
            AV26RelBany = (byte)(99) ;
         }
         AV99BarAcc = A5253BarAcc ;
         AV105BarMaqCod = A180BarMaqCod ;
         AV135BarGraaca = A1909BarGraAca ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(24);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp004.this.A396EmprCod;
      this.aP1[0] = pdyrp004.this.AV15Descrip;
      this.aP2[0] = pdyrp004.this.AV16Clave;
      this.aP3[0] = pdyrp004.this.AV17PrdVal;
      this.aP4[0] = pdyrp004.this.AV18BarCod;
      this.aP5[0] = pdyrp004.this.AV19BarCodReo;
      this.aP6[0] = pdyrp004.this.AV20BarCodPar;
      this.aP7[0] = pdyrp004.this.AV21TotKil;
      this.aP8[0] = pdyrp004.this.AV22PrdDesc;
      this.aP9[0] = pdyrp004.this.AV23Accion;
      this.aP10[0] = pdyrp004.this.AV67BarLinMaq;
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
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV25Fibra = "" ;
      AV110BarTra1 = "" ;
      AV111BarTra2 = "" ;
      AV112BarTra3 = "" ;
      scmdbuf = "" ;
      P098R2_A396EmprCod = new String[] {""} ;
      P098R2_A217BarTipArt = new short[1] ;
      P098R2_n217BarTipArt = new boolean[] {false} ;
      P098R2_A130BarCodPar = new String[] {""} ;
      P098R2_A132BarCodReo = new byte[1] ;
      P098R2_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      AV30CodMaq = "" ;
      lV30CodMaq = "" ;
      P098R3_A396EmprCod = new String[] {""} ;
      P098R3_A180BarMaqCod = new String[] {""} ;
      P098R3_A130BarCodPar = new String[] {""} ;
      P098R3_A132BarCodReo = new byte[1] ;
      P098R3_A129BarCod = new int[1] ;
      A180BarMaqCod = "" ;
      AV82Ini_5 = "" ;
      AV85Inip_5 = "" ;
      AV84ColIni_5 = DecimalUtil.ZERO ;
      AV83Fin_5 = "" ;
      AV92Finp_5 = "" ;
      AV86ColFin_5 = DecimalUtil.ZERO ;
      AV36TotCol = DecimalUtil.ZERO ;
      AV46ForSer = "" ;
      AV47ForColNom = "" ;
      AV77TotCol2 = DecimalUtil.ZERO ;
      AV38Producto = "" ;
      AV39Proceso = "" ;
      AV66Station = "" ;
      P098R4_A396EmprCod = new String[] {""} ;
      P098R4_A2794BarLinMaq = new short[1] ;
      P098R4_A130BarCodPar = new String[] {""} ;
      P098R4_A132BarCodReo = new byte[1] ;
      P098R4_A129BarCod = new int[1] ;
      P098R4_A2792TermiCod = new String[] {""} ;
      P098R4_A207BarPrfCod = new String[] {""} ;
      P098R4_n207BarPrfCod = new boolean[] {false} ;
      P098R4_A1255BarPrfLin = new short[1] ;
      A2792TermiCod = "" ;
      A207BarPrfCod = "" ;
      P098R5_A396EmprCod = new String[] {""} ;
      P098R5_A252CliCod = new int[1] ;
      P098R5_n252CliCod = new boolean[] {false} ;
      P098R5_A217BarTipArt = new short[1] ;
      P098R5_n217BarTipArt = new boolean[] {false} ;
      P098R5_A130BarCodPar = new String[] {""} ;
      P098R5_A132BarCodReo = new byte[1] ;
      P098R5_A129BarCod = new int[1] ;
      P098R6_A396EmprCod = new String[] {""} ;
      P098R6_A6037Mq_Grupo = new byte[1] ;
      P098R6_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      AV105BarMaqCod = "" ;
      AV114GruMaq = "" ;
      AV115TotColMin = DecimalUtil.ZERO ;
      AV116TotColMax = DecimalUtil.ZERO ;
      AV81BarSer = "" ;
      Gx_msg = "" ;
      P098R7_A396EmprCod = new String[] {""} ;
      P098R7_A65ArtCod = new String[] {""} ;
      P098R7_A252CliCod = new int[1] ;
      P098R7_n252CliCod = new boolean[] {false} ;
      P098R7_A4295ClasCod = new short[1] ;
      P098R7_n4295ClasCod = new boolean[] {false} ;
      A65ArtCod = "" ;
      P098R8_A361DisCod = new int[1] ;
      P098R8_A966PartCod = new String[] {""} ;
      P098R8_n966PartCod = new boolean[] {false} ;
      P098R8_A252CliCod = new int[1] ;
      P098R8_n252CliCod = new boolean[] {false} ;
      P098R8_A396EmprCod = new String[] {""} ;
      P098R8_A970ProceCod = new short[1] ;
      P098R8_n970ProceCod = new boolean[] {false} ;
      P098R8_A130BarCodPar = new String[] {""} ;
      P098R8_A132BarCodReo = new byte[1] ;
      P098R8_A129BarCod = new int[1] ;
      A966PartCod = "" ;
      P098R9_A396EmprCod = new String[] {""} ;
      P098R9_A970ProceCod = new short[1] ;
      P098R9_n970ProceCod = new boolean[] {false} ;
      P098R9_A130BarCodPar = new String[] {""} ;
      P098R9_A132BarCodReo = new byte[1] ;
      P098R9_A129BarCod = new int[1] ;
      P098R9_A44AlbRecCod = new int[1] ;
      P098R9_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      P098R10_A396EmprCod = new String[] {""} ;
      P098R10_A130BarCodPar = new String[] {""} ;
      P098R10_A132BarCodReo = new byte[1] ;
      P098R10_A129BarCod = new int[1] ;
      P098R10_A212BarSer = new String[] {""} ;
      P098R10_A252CliCod = new int[1] ;
      P098R10_n252CliCod = new boolean[] {false} ;
      A212BarSer = "" ;
      P098R11_A396EmprCod = new String[] {""} ;
      P098R11_A4295ClasCod = new short[1] ;
      P098R11_n4295ClasCod = new boolean[] {false} ;
      P098R11_A65ArtCod = new String[] {""} ;
      P098R11_A252CliCod = new int[1] ;
      P098R11_n252CliCod = new boolean[] {false} ;
      P098R12_A396EmprCod = new String[] {""} ;
      P098R12_A130BarCodPar = new String[] {""} ;
      P098R12_A132BarCodReo = new byte[1] ;
      P098R12_A129BarCod = new int[1] ;
      P098R12_A761ProFasLin = new short[1] ;
      P098R12_n761ProFasLin = new boolean[] {false} ;
      P098R12_A136BarColNum = new int[1] ;
      P098R12_A252CliCod = new int[1] ;
      P098R12_n252CliCod = new boolean[] {false} ;
      P098R12_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV120Fascod = "" ;
      P098R13_A396EmprCod = new String[] {""} ;
      P098R13_A457FasCod = new String[] {""} ;
      P098R13_A130BarCodPar = new String[] {""} ;
      P098R13_A132BarCodReo = new byte[1] ;
      P098R13_A129BarCod = new int[1] ;
      P098R13_A194BarOrdLin = new short[1] ;
      P098R13_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      AV122Proforcod = "" ;
      P098R14_A396EmprCod = new String[] {""} ;
      P098R14_A118BarAcaQui = new String[] {""} ;
      P098R14_A130BarCodPar = new String[] {""} ;
      P098R14_A132BarCodReo = new byte[1] ;
      P098R14_A129BarCod = new int[1] ;
      A118BarAcaQui = "" ;
      P098R15_A396EmprCod = new String[] {""} ;
      P098R15_A457FasCod = new String[] {""} ;
      P098R15_A130BarCodPar = new String[] {""} ;
      P098R15_A132BarCodReo = new byte[1] ;
      P098R15_A129BarCod = new int[1] ;
      P098R15_A194BarOrdLin = new short[1] ;
      P098R15_A758ProCod = new String[] {""} ;
      P098R16_A396EmprCod = new String[] {""} ;
      P098R16_A130BarCodPar = new String[] {""} ;
      P098R16_A132BarCodReo = new byte[1] ;
      P098R16_A129BarCod = new int[1] ;
      P098R16_A212BarSer = new String[] {""} ;
      P098R16_A252CliCod = new int[1] ;
      P098R16_n252CliCod = new boolean[] {false} ;
      P098R16_A120BarAgrEst = new String[] {""} ;
      A120BarAgrEst = "" ;
      AV126Artcod = "" ;
      P098R17_A361DisCod = new int[1] ;
      P098R17_A966PartCod = new String[] {""} ;
      P098R17_n966PartCod = new boolean[] {false} ;
      P098R17_A252CliCod = new int[1] ;
      P098R17_n252CliCod = new boolean[] {false} ;
      P098R17_A396EmprCod = new String[] {""} ;
      P098R17_A5874CruCod = new int[1] ;
      P098R17_n5874CruCod = new boolean[] {false} ;
      P098R17_A130BarCodPar = new String[] {""} ;
      P098R17_A132BarCodReo = new byte[1] ;
      P098R17_A129BarCod = new int[1] ;
      P098R18_A396EmprCod = new String[] {""} ;
      P098R18_A2311BarCliDes = new int[1] ;
      P098R18_A130BarCodPar = new String[] {""} ;
      P098R18_A132BarCodReo = new byte[1] ;
      P098R18_A129BarCod = new int[1] ;
      P098R19_A396EmprCod = new String[] {""} ;
      P098R19_A212BarSer = new String[] {""} ;
      P098R19_A130BarCodPar = new String[] {""} ;
      P098R19_A132BarCodReo = new byte[1] ;
      P098R19_A129BarCod = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int12 = new short[1] ;
      GXv_char11 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_char10 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int16 = new byte[1] ;
      GXv_int14 = new byte[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_int7 = new byte[1] ;
      P098R20_A396EmprCod = new String[] {""} ;
      P098R20_A4295ClasCod = new short[1] ;
      P098R20_n4295ClasCod = new boolean[] {false} ;
      P098R20_A65ArtCod = new String[] {""} ;
      P098R20_A252CliCod = new int[1] ;
      P098R20_n252CliCod = new boolean[] {false} ;
      P098R21_A396EmprCod = new String[] {""} ;
      P098R21_A4295ClasCod = new short[1] ;
      P098R21_n4295ClasCod = new boolean[] {false} ;
      P098R21_A65ArtCod = new String[] {""} ;
      P098R21_A252CliCod = new int[1] ;
      P098R21_n252CliCod = new boolean[] {false} ;
      P098R22_A396EmprCod = new String[] {""} ;
      P098R22_A130BarCodPar = new String[] {""} ;
      P098R22_A132BarCodReo = new byte[1] ;
      P098R22_A129BarCod = new int[1] ;
      P098R22_A1245BarAgrSer = new String[] {""} ;
      P098R22_A1508CliCodAgr = new int[1] ;
      P098R22_A119BarAgrCod = new int[1] ;
      P098R22_A124BarAgrReo = new byte[1] ;
      P098R22_A122BarAgrPar = new String[] {""} ;
      A1245BarAgrSer = "" ;
      A122BarAgrPar = "" ;
      P098R23_A396EmprCod = new String[] {""} ;
      P098R23_A831TipColCod = new byte[1] ;
      P098R23_A483ForColNum = new int[1] ;
      P098R23_A482ForColNom = new String[] {""} ;
      P098R23_A494ForSer = new String[] {""} ;
      P098R23_A252CliCod = new int[1] ;
      P098R23_n252CliCod = new boolean[] {false} ;
      P098R23_A764ProForCod = new String[] {""} ;
      P098R23_A1160ProForL = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A764ProForCod = "" ;
      P098R24_A396EmprCod = new String[] {""} ;
      P098R24_A626MatCod = new short[1] ;
      P098R24_A831TipColCod = new byte[1] ;
      P098R24_A483ForColNum = new int[1] ;
      P098R24_A482ForColNom = new String[] {""} ;
      P098R24_A494ForSer = new String[] {""} ;
      P098R24_A252CliCod = new int[1] ;
      P098R24_n252CliCod = new boolean[] {false} ;
      P098R25_A396EmprCod = new String[] {""} ;
      P098R25_A583IntCod = new byte[1] ;
      P098R25_A831TipColCod = new byte[1] ;
      P098R25_A483ForColNum = new int[1] ;
      P098R25_A482ForColNom = new String[] {""} ;
      P098R25_A494ForSer = new String[] {""} ;
      P098R25_A252CliCod = new int[1] ;
      P098R25_n252CliCod = new boolean[] {false} ;
      AV99BarAcc = "" ;
      AV72Color13_1 = "" ;
      AV76BarSer34 = "" ;
      P098R26_A396EmprCod = new String[] {""} ;
      P098R26_A130BarCodPar = new String[] {""} ;
      P098R26_A132BarCodReo = new byte[1] ;
      P098R26_A129BarCod = new int[1] ;
      P098R26_A252CliCod = new int[1] ;
      P098R26_n252CliCod = new boolean[] {false} ;
      P098R26_A212BarSer = new String[] {""} ;
      P098R26_A135BarColNom = new String[] {""} ;
      P098R26_A136BarColNum = new int[1] ;
      P098R26_A218BarTipCol = new byte[1] ;
      P098R26_A221BarTra1 = new String[] {""} ;
      P098R26_A222BarTra2 = new String[] {""} ;
      P098R26_A223BarTra3 = new String[] {""} ;
      P098R26_A236BarVolMaq = new int[1] ;
      P098R26_A5253BarAcc = new String[] {""} ;
      P098R26_A180BarMaqCod = new String[] {""} ;
      P098R26_A1909BarGraAca = new short[1] ;
      A135BarColNom = "" ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A5253BarAcc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp004__default(),
         new Object[] {
             new Object[] {
            P098R2_A396EmprCod, P098R2_A217BarTipArt, P098R2_n217BarTipArt, P098R2_A130BarCodPar, P098R2_A132BarCodReo, P098R2_A129BarCod
            }
            , new Object[] {
            P098R3_A396EmprCod, P098R3_A180BarMaqCod, P098R3_A130BarCodPar, P098R3_A132BarCodReo, P098R3_A129BarCod
            }
            , new Object[] {
            P098R4_A396EmprCod, P098R4_A2794BarLinMaq, P098R4_A130BarCodPar, P098R4_A132BarCodReo, P098R4_A129BarCod, P098R4_A2792TermiCod, P098R4_A207BarPrfCod, P098R4_n207BarPrfCod, P098R4_A1255BarPrfLin
            }
            , new Object[] {
            P098R5_A396EmprCod, P098R5_A252CliCod, P098R5_n252CliCod, P098R5_A217BarTipArt, P098R5_n217BarTipArt, P098R5_A130BarCodPar, P098R5_A132BarCodReo, P098R5_A129BarCod
            }
            , new Object[] {
            P098R6_A396EmprCod, P098R6_A6037Mq_Grupo, P098R6_A602MaqCod
            }
            , new Object[] {
            P098R7_A396EmprCod, P098R7_A65ArtCod, P098R7_A252CliCod, P098R7_A4295ClasCod, P098R7_n4295ClasCod
            }
            , new Object[] {
            P098R8_A361DisCod, P098R8_A966PartCod, P098R8_n966PartCod, P098R8_A252CliCod, P098R8_n252CliCod, P098R8_A396EmprCod, P098R8_A970ProceCod, P098R8_n970ProceCod, P098R8_A130BarCodPar, P098R8_A132BarCodReo,
            P098R8_A129BarCod
            }
            , new Object[] {
            P098R9_A396EmprCod, P098R9_A970ProceCod, P098R9_n970ProceCod, P098R9_A130BarCodPar, P098R9_A132BarCodReo, P098R9_A129BarCod, P098R9_A44AlbRecCod, P098R9_A200BarPieCod
            }
            , new Object[] {
            P098R10_A396EmprCod, P098R10_A130BarCodPar, P098R10_A132BarCodReo, P098R10_A129BarCod, P098R10_A212BarSer, P098R10_A252CliCod, P098R10_n252CliCod
            }
            , new Object[] {
            P098R11_A396EmprCod, P098R11_A4295ClasCod, P098R11_n4295ClasCod, P098R11_A65ArtCod, P098R11_A252CliCod
            }
            , new Object[] {
            P098R12_A396EmprCod, P098R12_A130BarCodPar, P098R12_A132BarCodReo, P098R12_A129BarCod, P098R12_A761ProFasLin, P098R12_n761ProFasLin, P098R12_A136BarColNum, P098R12_A252CliCod, P098R12_n252CliCod, P098R12_A758ProCod
            }
            , new Object[] {
            P098R13_A396EmprCod, P098R13_A457FasCod, P098R13_A130BarCodPar, P098R13_A132BarCodReo, P098R13_A129BarCod, P098R13_A194BarOrdLin, P098R13_A758ProCod
            }
            , new Object[] {
            P098R14_A396EmprCod, P098R14_A118BarAcaQui, P098R14_A130BarCodPar, P098R14_A132BarCodReo, P098R14_A129BarCod
            }
            , new Object[] {
            P098R15_A396EmprCod, P098R15_A457FasCod, P098R15_A130BarCodPar, P098R15_A132BarCodReo, P098R15_A129BarCod, P098R15_A194BarOrdLin, P098R15_A758ProCod
            }
            , new Object[] {
            P098R16_A396EmprCod, P098R16_A130BarCodPar, P098R16_A132BarCodReo, P098R16_A129BarCod, P098R16_A212BarSer, P098R16_A252CliCod, P098R16_n252CliCod, P098R16_A120BarAgrEst
            }
            , new Object[] {
            P098R17_A361DisCod, P098R17_A966PartCod, P098R17_n966PartCod, P098R17_A252CliCod, P098R17_n252CliCod, P098R17_A396EmprCod, P098R17_A5874CruCod, P098R17_n5874CruCod, P098R17_A130BarCodPar, P098R17_A132BarCodReo,
            P098R17_A129BarCod
            }
            , new Object[] {
            P098R18_A396EmprCod, P098R18_A2311BarCliDes, P098R18_A130BarCodPar, P098R18_A132BarCodReo, P098R18_A129BarCod
            }
            , new Object[] {
            P098R19_A396EmprCod, P098R19_A212BarSer, P098R19_A130BarCodPar, P098R19_A132BarCodReo, P098R19_A129BarCod
            }
            , new Object[] {
            P098R20_A396EmprCod, P098R20_A4295ClasCod, P098R20_n4295ClasCod, P098R20_A65ArtCod, P098R20_A252CliCod
            }
            , new Object[] {
            P098R21_A396EmprCod, P098R21_A4295ClasCod, P098R21_n4295ClasCod, P098R21_A65ArtCod, P098R21_A252CliCod
            }
            , new Object[] {
            P098R22_A396EmprCod, P098R22_A130BarCodPar, P098R22_A132BarCodReo, P098R22_A129BarCod, P098R22_A1245BarAgrSer, P098R22_A1508CliCodAgr, P098R22_A119BarAgrCod, P098R22_A124BarAgrReo, P098R22_A122BarAgrPar
            }
            , new Object[] {
            P098R23_A396EmprCod, P098R23_A831TipColCod, P098R23_A483ForColNum, P098R23_A482ForColNom, P098R23_A494ForSer, P098R23_A252CliCod, P098R23_A764ProForCod, P098R23_A1160ProForL
            }
            , new Object[] {
            P098R24_A396EmprCod, P098R24_A626MatCod, P098R24_A831TipColCod, P098R24_A483ForColNum, P098R24_A482ForColNom, P098R24_A494ForSer, P098R24_A252CliCod
            }
            , new Object[] {
            P098R25_A396EmprCod, P098R25_A583IntCod, P098R25_A831TipColCod, P098R25_A483ForColNum, P098R25_A482ForColNom, P098R25_A494ForSer, P098R25_A252CliCod
            }
            , new Object[] {
            P098R26_A396EmprCod, P098R26_A130BarCodPar, P098R26_A132BarCodReo, P098R26_A129BarCod, P098R26_A252CliCod, P098R26_n252CliCod, P098R26_A212BarSer, P098R26_A135BarColNom, P098R26_A136BarColNum, P098R26_A218BarTipCol,
            P098R26_A221BarTra1, P098R26_A222BarTra2, P098R26_A223BarTra3, P098R26_A236BarVolMaq, P098R26_A5253BarAcc, P098R26_A180BarMaqCod, P098R26_A1909BarGraAca
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV130ClaveC ;
   private byte GXt_int1 ;
   private byte AV27RelBanIni ;
   private byte AV28RelBanFin ;
   private byte AV26RelBany ;
   private byte A132BarCodReo ;
   private byte AV100Ok_matiz ;
   private byte AV35Familia ;
   private byte AV49TipColCod ;
   private byte AV50FlagCol ;
   private byte AV40FlagPro ;
   private byte AV51IntCod ;
   private byte AV97Ok_intens ;
   private byte AV103Mq_grupo ;
   private byte A6037Mq_Grupo ;
   private byte AV113TipCol ;
   private byte AV147GXLvl239 ;
   private byte AV123Ok_fase ;
   private byte GXv_int2[] ;
   private byte GXv_int16[] ;
   private byte GXv_int14[] ;
   private byte GXv_int7[] ;
   private byte A124BarAgrReo ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A218BarTipCol ;
   private short AV67BarLinMaq ;
   private short AV29TipArt ;
   private short A217BarTipArt ;
   private short AV31Matiz ;
   private short A2794BarLinMaq ;
   private short A1255BarPrfLin ;
   private short AV80ClasCod ;
   private short A4295ClasCod ;
   private short AV109ProceCod ;
   private short A970ProceCod ;
   private short A761ProFasLin ;
   private short A194BarOrdLin ;
   private short GXv_int12[] ;
   private short AV136grm2ini ;
   private short AV137grm2fin ;
   private short AV135BarGraaca ;
   private short A1160ProForL ;
   private short A626MatCod ;
   private short A1909BarGraAca ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private int AV41BarCliCod ;
   private int AV48ForColNum ;
   private int AV52CliCod ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int AV119ColNum ;
   private int A136BarColNum ;
   private int AV127Clicodf ;
   private int AV129CruCod ;
   private int A5874CruCod ;
   private int AV157Barclides ;
   private int A2311BarCliDes ;
   private int GXv_int6[] ;
   private int GXv_int15[] ;
   private int GXv_int13[] ;
   private int A1508CliCodAgr ;
   private int A119BarAgrCod ;
   private int A483ForColNum ;
   private int A236BarVolMaq ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal AV84ColIni_5 ;
   private java.math.BigDecimal AV86ColFin_5 ;
   private java.math.BigDecimal AV36TotCol ;
   private java.math.BigDecimal AV77TotCol2 ;
   private java.math.BigDecimal AV115TotColMin ;
   private java.math.BigDecimal AV116TotColMax ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV24Opcion ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV25Fibra ;
   private String AV110BarTra1 ;
   private String AV111BarTra2 ;
   private String AV112BarTra3 ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV30CodMaq ;
   private String lV30CodMaq ;
   private String A180BarMaqCod ;
   private String AV82Ini_5 ;
   private String AV85Inip_5 ;
   private String AV83Fin_5 ;
   private String AV92Finp_5 ;
   private String AV46ForSer ;
   private String AV47ForColNom ;
   private String AV38Producto ;
   private String AV39Proceso ;
   private String AV66Station ;
   private String A2792TermiCod ;
   private String A207BarPrfCod ;
   private String A602MaqCod ;
   private String AV105BarMaqCod ;
   private String AV114GruMaq ;
   private String AV81BarSer ;
   private String Gx_msg ;
   private String A65ArtCod ;
   private String A966PartCod ;
   private String A200BarPieCod ;
   private String A212BarSer ;
   private String A758ProCod ;
   private String AV120Fascod ;
   private String A457FasCod ;
   private String AV122Proforcod ;
   private String A118BarAcaQui ;
   private String A120BarAgrEst ;
   private String AV126Artcod ;
   private String GXv_char5[] ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char8[] ;
   private String A1245BarAgrSer ;
   private String A122BarAgrPar ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A764ProForCod ;
   private String AV99BarAcc ;
   private String AV72Color13_1 ;
   private String AV76BarSer34 ;
   private String A135BarColNom ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A5253BarAcc ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n207BarPrfCod ;
   private boolean n252CliCod ;
   private boolean n4295ClasCod ;
   private boolean n966PartCod ;
   private boolean n970ProceCod ;
   private boolean n761ProFasLin ;
   private boolean n5874CruCod ;
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
   private String[] P098R2_A396EmprCod ;
   private short[] P098R2_A217BarTipArt ;
   private boolean[] P098R2_n217BarTipArt ;
   private String[] P098R2_A130BarCodPar ;
   private byte[] P098R2_A132BarCodReo ;
   private int[] P098R2_A129BarCod ;
   private String[] P098R3_A396EmprCod ;
   private String[] P098R3_A180BarMaqCod ;
   private String[] P098R3_A130BarCodPar ;
   private byte[] P098R3_A132BarCodReo ;
   private int[] P098R3_A129BarCod ;
   private String[] P098R4_A396EmprCod ;
   private short[] P098R4_A2794BarLinMaq ;
   private String[] P098R4_A130BarCodPar ;
   private byte[] P098R4_A132BarCodReo ;
   private int[] P098R4_A129BarCod ;
   private String[] P098R4_A2792TermiCod ;
   private String[] P098R4_A207BarPrfCod ;
   private boolean[] P098R4_n207BarPrfCod ;
   private short[] P098R4_A1255BarPrfLin ;
   private String[] P098R5_A396EmprCod ;
   private int[] P098R5_A252CliCod ;
   private boolean[] P098R5_n252CliCod ;
   private short[] P098R5_A217BarTipArt ;
   private boolean[] P098R5_n217BarTipArt ;
   private String[] P098R5_A130BarCodPar ;
   private byte[] P098R5_A132BarCodReo ;
   private int[] P098R5_A129BarCod ;
   private String[] P098R6_A396EmprCod ;
   private byte[] P098R6_A6037Mq_Grupo ;
   private String[] P098R6_A602MaqCod ;
   private String[] P098R7_A396EmprCod ;
   private String[] P098R7_A65ArtCod ;
   private int[] P098R7_A252CliCod ;
   private boolean[] P098R7_n252CliCod ;
   private short[] P098R7_A4295ClasCod ;
   private boolean[] P098R7_n4295ClasCod ;
   private int[] P098R8_A361DisCod ;
   private String[] P098R8_A966PartCod ;
   private boolean[] P098R8_n966PartCod ;
   private int[] P098R8_A252CliCod ;
   private boolean[] P098R8_n252CliCod ;
   private String[] P098R8_A396EmprCod ;
   private short[] P098R8_A970ProceCod ;
   private boolean[] P098R8_n970ProceCod ;
   private String[] P098R8_A130BarCodPar ;
   private byte[] P098R8_A132BarCodReo ;
   private int[] P098R8_A129BarCod ;
   private String[] P098R9_A396EmprCod ;
   private short[] P098R9_A970ProceCod ;
   private boolean[] P098R9_n970ProceCod ;
   private String[] P098R9_A130BarCodPar ;
   private byte[] P098R9_A132BarCodReo ;
   private int[] P098R9_A129BarCod ;
   private int[] P098R9_A44AlbRecCod ;
   private String[] P098R9_A200BarPieCod ;
   private String[] P098R10_A396EmprCod ;
   private String[] P098R10_A130BarCodPar ;
   private byte[] P098R10_A132BarCodReo ;
   private int[] P098R10_A129BarCod ;
   private String[] P098R10_A212BarSer ;
   private int[] P098R10_A252CliCod ;
   private boolean[] P098R10_n252CliCod ;
   private String[] P098R11_A396EmprCod ;
   private short[] P098R11_A4295ClasCod ;
   private boolean[] P098R11_n4295ClasCod ;
   private String[] P098R11_A65ArtCod ;
   private int[] P098R11_A252CliCod ;
   private boolean[] P098R11_n252CliCod ;
   private String[] P098R12_A396EmprCod ;
   private String[] P098R12_A130BarCodPar ;
   private byte[] P098R12_A132BarCodReo ;
   private int[] P098R12_A129BarCod ;
   private short[] P098R12_A761ProFasLin ;
   private boolean[] P098R12_n761ProFasLin ;
   private int[] P098R12_A136BarColNum ;
   private int[] P098R12_A252CliCod ;
   private boolean[] P098R12_n252CliCod ;
   private String[] P098R12_A758ProCod ;
   private String[] P098R13_A396EmprCod ;
   private String[] P098R13_A457FasCod ;
   private String[] P098R13_A130BarCodPar ;
   private byte[] P098R13_A132BarCodReo ;
   private int[] P098R13_A129BarCod ;
   private short[] P098R13_A194BarOrdLin ;
   private String[] P098R13_A758ProCod ;
   private String[] P098R14_A396EmprCod ;
   private String[] P098R14_A118BarAcaQui ;
   private String[] P098R14_A130BarCodPar ;
   private byte[] P098R14_A132BarCodReo ;
   private int[] P098R14_A129BarCod ;
   private String[] P098R15_A396EmprCod ;
   private String[] P098R15_A457FasCod ;
   private String[] P098R15_A130BarCodPar ;
   private byte[] P098R15_A132BarCodReo ;
   private int[] P098R15_A129BarCod ;
   private short[] P098R15_A194BarOrdLin ;
   private String[] P098R15_A758ProCod ;
   private String[] P098R16_A396EmprCod ;
   private String[] P098R16_A130BarCodPar ;
   private byte[] P098R16_A132BarCodReo ;
   private int[] P098R16_A129BarCod ;
   private String[] P098R16_A212BarSer ;
   private int[] P098R16_A252CliCod ;
   private boolean[] P098R16_n252CliCod ;
   private String[] P098R16_A120BarAgrEst ;
   private int[] P098R17_A361DisCod ;
   private String[] P098R17_A966PartCod ;
   private boolean[] P098R17_n966PartCod ;
   private int[] P098R17_A252CliCod ;
   private boolean[] P098R17_n252CliCod ;
   private String[] P098R17_A396EmprCod ;
   private int[] P098R17_A5874CruCod ;
   private boolean[] P098R17_n5874CruCod ;
   private String[] P098R17_A130BarCodPar ;
   private byte[] P098R17_A132BarCodReo ;
   private int[] P098R17_A129BarCod ;
   private String[] P098R18_A396EmprCod ;
   private int[] P098R18_A2311BarCliDes ;
   private String[] P098R18_A130BarCodPar ;
   private byte[] P098R18_A132BarCodReo ;
   private int[] P098R18_A129BarCod ;
   private String[] P098R19_A396EmprCod ;
   private String[] P098R19_A212BarSer ;
   private String[] P098R19_A130BarCodPar ;
   private byte[] P098R19_A132BarCodReo ;
   private int[] P098R19_A129BarCod ;
   private String[] P098R20_A396EmprCod ;
   private short[] P098R20_A4295ClasCod ;
   private boolean[] P098R20_n4295ClasCod ;
   private String[] P098R20_A65ArtCod ;
   private int[] P098R20_A252CliCod ;
   private boolean[] P098R20_n252CliCod ;
   private String[] P098R21_A396EmprCod ;
   private short[] P098R21_A4295ClasCod ;
   private boolean[] P098R21_n4295ClasCod ;
   private String[] P098R21_A65ArtCod ;
   private int[] P098R21_A252CliCod ;
   private boolean[] P098R21_n252CliCod ;
   private String[] P098R22_A396EmprCod ;
   private String[] P098R22_A130BarCodPar ;
   private byte[] P098R22_A132BarCodReo ;
   private int[] P098R22_A129BarCod ;
   private String[] P098R22_A1245BarAgrSer ;
   private int[] P098R22_A1508CliCodAgr ;
   private int[] P098R22_A119BarAgrCod ;
   private byte[] P098R22_A124BarAgrReo ;
   private String[] P098R22_A122BarAgrPar ;
   private String[] P098R23_A396EmprCod ;
   private byte[] P098R23_A831TipColCod ;
   private int[] P098R23_A483ForColNum ;
   private String[] P098R23_A482ForColNom ;
   private String[] P098R23_A494ForSer ;
   private int[] P098R23_A252CliCod ;
   private boolean[] P098R23_n252CliCod ;
   private String[] P098R23_A764ProForCod ;
   private short[] P098R23_A1160ProForL ;
   private String[] P098R24_A396EmprCod ;
   private short[] P098R24_A626MatCod ;
   private byte[] P098R24_A831TipColCod ;
   private int[] P098R24_A483ForColNum ;
   private String[] P098R24_A482ForColNom ;
   private String[] P098R24_A494ForSer ;
   private int[] P098R24_A252CliCod ;
   private boolean[] P098R24_n252CliCod ;
   private String[] P098R25_A396EmprCod ;
   private byte[] P098R25_A583IntCod ;
   private byte[] P098R25_A831TipColCod ;
   private int[] P098R25_A483ForColNum ;
   private String[] P098R25_A482ForColNom ;
   private String[] P098R25_A494ForSer ;
   private int[] P098R25_A252CliCod ;
   private boolean[] P098R25_n252CliCod ;
   private String[] P098R26_A396EmprCod ;
   private String[] P098R26_A130BarCodPar ;
   private byte[] P098R26_A132BarCodReo ;
   private int[] P098R26_A129BarCod ;
   private int[] P098R26_A252CliCod ;
   private boolean[] P098R26_n252CliCod ;
   private String[] P098R26_A212BarSer ;
   private String[] P098R26_A135BarColNom ;
   private int[] P098R26_A136BarColNum ;
   private byte[] P098R26_A218BarTipCol ;
   private String[] P098R26_A221BarTra1 ;
   private String[] P098R26_A222BarTra2 ;
   private String[] P098R26_A223BarTra3 ;
   private int[] P098R26_A236BarVolMaq ;
   private String[] P098R26_A5253BarAcc ;
   private String[] P098R26_A180BarMaqCod ;
   private short[] P098R26_A1909BarGraAca ;
}

final  class pdyrp004__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P098R2", "SELECT EmprCod, BarTipArt, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarTipArt = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R3", "SELECT EmprCod, BarMaqCod, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarMaqCod like ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R4", "SELECT EmprCod, BarLinMaq, BarCodPar, BarCodReo, BarCod, TermiCod, BarPrfCod, BarPrfLin FROM TXPBARPR2 WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098R5", "SELECT EmprCod, CliCod, BarTipArt, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarTipArt = ?) AND (CliCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R6", "SELECT EmprCod, Mq_Grupo, MaqCod FROM TXPMAQGR1 WHERE EmprCod = ? and Mq_Grupo = ? ORDER BY EmprCod, Mq_Grupo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098R7", "SELECT EmprCod, ArtCod, CliCod, ClasCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? = 1) ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R8", "SELECT T1.DisCod, T2.PartCod, T1.CliCod, T1.EmprCod, T3.ProceCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPCPARTI T3 ON T3.EmprCod = T1.EmprCod AND T3.PartCod = T2.PartCod AND T3.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T3.ProceCod = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R9", "SELECT T1.EmprCod, T2.ProceCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbRecCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T2.ProceCod = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098R10", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSer, CliCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R11", "SELECT EmprCod, ClasCod, ArtCod, CliCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (ClasCod = ?) ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R12", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.ProFasLin, T2.BarColNum, T2.CliCod, T1.ProCod FROM (TXPBARPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098R13", "SELECT EmprCod, FasCod, BarCodPar, BarCodReo, BarCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098R14", "SELECT EmprCod, BarAcaQui, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarAcaQui = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R15", "SELECT EmprCod, FasCod, BarCodPar, BarCodReo, BarCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098R16", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSer, CliCod, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R17", "SELECT T1.DisCod, T2.PartCod, T1.CliCod, T1.EmprCod, T3.CruCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPCPARTI T3 ON T3.EmprCod = T1.EmprCod AND T3.PartCod = T2.PartCod AND T3.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T3.CruCod = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R18", "SELECT EmprCod, BarCliDes, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarCliDes = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R19", "SELECT EmprCod, BarSer, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarSer = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R20", "SELECT EmprCod, ClasCod, ArtCod, CliCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (ClasCod = ?) ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R21", "SELECT EmprCod, ClasCod, ArtCod, CliCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (ClasCod = ?) ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R22", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAgrSer, CliCodAgr, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098R23", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ProForCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P098R24", "SELECT EmprCod, MatCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (MatCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R25", "SELECT EmprCod, IntCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (IntCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P098R26", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarTra1, BarTra2, BarTra3, BarVolMaq, BarAcc, BarMaqCod, BarGraAca FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 24 :
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
               ((String[]) buf[10])[0] = rslt.getString(10, 4);
               ((String[]) buf[11])[0] = rslt.getString(11, 4);
               ((String[]) buf[12])[0] = rslt.getString(12, 4);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 6);
               ((short[]) buf[16])[0] = rslt.getShort(16);
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
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 16);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

