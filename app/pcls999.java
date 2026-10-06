package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls999 extends GXProcedure
{
   public pcls999( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls999.class ), "" );
   }

   public pcls999( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 ,
                                     String[] aP4 ,
                                     byte[] aP5 ,
                                     short[] aP6 ,
                                     short[] aP7 ,
                                     String[] aP8 ,
                                     String[] aP9 ,
                                     String[] aP10 ,
                                     java.util.Date[] aP11 ,
                                     byte[] aP12 ,
                                     String[] aP13 ,
                                     int[] aP14 ,
                                     String[] aP15 ,
                                     String[] aP16 )
   {
      pcls999.this.aP17 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
      return aP17[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        short[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        java.util.Date[] aP11 ,
                        byte[] aP12 ,
                        String[] aP13 ,
                        int[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 ,
                        java.util.Date[] aP17 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             short[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             java.util.Date[] aP11 ,
                             byte[] aP12 ,
                             String[] aP13 ,
                             int[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             java.util.Date[] aP17 )
   {
      pcls999.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls999.this.AV76BarCod = aP1[0];
      this.aP1 = aP1;
      pcls999.this.AV78BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcls999.this.AV77BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcls999.this.AV95CieCerAny = aP4[0];
      this.aP4 = aP4;
      pcls999.this.AV98Consumos = aP5[0];
      this.aP5 = aP5;
      pcls999.this.AV72Anyadi = aP6[0];
      this.aP6 = aP6;
      pcls999.this.AV135RecLinMaq = aP7[0];
      this.aP7 = aP7;
      pcls999.this.AV124MaqCod = aP8[0];
      this.aP8 = aP8;
      pcls999.this.AV148Tipo = aP9[0];
      this.aP9 = aP9;
      pcls999.this.AV96CierreAM = aP10[0];
      this.aP10 = aP10;
      pcls999.this.AV92Ca_diahora = aP11[0];
      this.aP11 = aP11;
      pcls999.this.AV93Cc_almcod = aP12[0];
      this.aP12 = aP12;
      pcls999.this.AV131Productosconsumos = aP13[0];
      this.aP13 = aP13;
      pcls999.this.AV118j = aP14[0];
      this.aP14 = aP14;
      pcls999.this.AV151UsurCod = aP15[0];
      this.aP15 = aP15;
      pcls999.this.AV144Station = aP16[0];
      this.aP16 = aP16;
      pcls999.this.AV107FechCierre = aP17[0];
      this.aP17 = aP17;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV130PrdRect = "" ;
      /* Using cursor P05642 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV76BarCod), Byte.valueOf(AV78BarCodReo), AV77BarCodPar, Short.valueOf(AV135RecLinMaq), Byte.valueOf(AV102CtrlRec)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P05642_A719PrdNum[0] ;
         n719PrdNum = P05642_n719PrdNum[0] ;
         A727PrdRec = P05642_A727PrdRec[0] ;
         A2804RecLinMaq = P05642_A2804RecLinMaq[0] ;
         A130BarCodPar = P05642_A130BarCodPar[0] ;
         A132BarCodReo = P05642_A132BarCodReo[0] ;
         A129BarCod = P05642_A129BarCod[0] ;
         A811RecLin = P05642_A811RecLin[0] ;
         A1273RecLinPro = P05642_A1273RecLinPro[0] ;
         A727PrdRec = P05642_A727PrdRec[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Hay productos en recuento y el control está activo. No se puede cerrar la receta¡¡¡", ""));
            AV130PrdRect = httpContext.getMessage( "S", "") ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV130PrdRect, httpContext.getMessage( "S", "")) == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV116FlagLR = (byte)(0) ;
      AV137RecNumInt = 0 ;
      /* Using cursor P05643 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV76BarCod), Byte.valueOf(AV78BarCodReo), AV77BarCodPar, Short.valueOf(AV135RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2804RecLinMaq = P05643_A2804RecLinMaq[0] ;
         A130BarCodPar = P05643_A130BarCodPar[0] ;
         A132BarCodReo = P05643_A132BarCodReo[0] ;
         A129BarCod = P05643_A129BarCod[0] ;
         A5109RecNumInt = P05643_A5109RecNumInt[0] ;
         A120BarAgrEst = P05643_A120BarAgrEst[0] ;
         A120BarAgrEst = P05643_A120BarAgrEst[0] ;
         AV137RecNumInt = A5109RecNumInt ;
         AV74BarAgrest = A120BarAgrEst ;
         Gx_msg = httpContext.getMessage( "Hdr= ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         /* Using cursor P05644 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1273RecLinPro = P05644_A1273RecLinPro[0] ;
            AV116FlagLR = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV116FlagLR == 1 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = AV76BarCod ;
         GXv_int3[0] = AV78BarCodReo ;
         GXv_char4[0] = AV77BarCodPar ;
         GXv_int5[0] = AV135RecLinMaq ;
         GXv_decimal6[0] = AV101CosPro ;
         GXv_decimal7[0] = AV100CosAny ;
         new app.pcls008(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_decimal6, GXv_decimal7) ;
         pcls999.this.A396EmprCod = GXv_char1[0] ;
         pcls999.this.AV76BarCod = GXv_int2[0] ;
         pcls999.this.AV78BarCodReo = GXv_int3[0] ;
         pcls999.this.AV77BarCodPar = GXv_char4[0] ;
         pcls999.this.AV135RecLinMaq = GXv_int5[0] ;
         pcls999.this.AV101CosPro = GXv_decimal6[0] ;
         pcls999.this.AV100CosAny = GXv_decimal7[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int2[0] = AV76BarCod ;
         GXv_int3[0] = AV78BarCodReo ;
         GXv_char1[0] = AV77BarCodPar ;
         GXv_int5[0] = AV135RecLinMaq ;
         GXv_decimal7[0] = AV89BarCosPD ;
         GXv_decimal6[0] = AV81BarCosAD ;
         GXv_decimal8[0] = AV79BarCosAA ;
         GXv_decimal9[0] = AV87BarCosPA ;
         GXv_decimal10[0] = AV85BarCosCol ;
         GXv_decimal11[0] = AV83BarCosAnc ;
         new app.pcls108(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int3, GXv_char1, GXv_int5, GXv_decimal7, GXv_decimal6, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11) ;
         pcls999.this.A396EmprCod = GXv_char4[0] ;
         pcls999.this.AV76BarCod = GXv_int2[0] ;
         pcls999.this.AV78BarCodReo = GXv_int3[0] ;
         pcls999.this.AV77BarCodPar = GXv_char1[0] ;
         pcls999.this.AV135RecLinMaq = GXv_int5[0] ;
         pcls999.this.AV89BarCosPD = GXv_decimal7[0] ;
         pcls999.this.AV81BarCosAD = GXv_decimal6[0] ;
         pcls999.this.AV79BarCosAA = GXv_decimal8[0] ;
         pcls999.this.AV87BarCosPA = GXv_decimal9[0] ;
         pcls999.this.AV85BarCosCol = GXv_decimal10[0] ;
         pcls999.this.AV83BarCosAnc = GXv_decimal11[0] ;
         AV117inc_obs = httpContext.getMessage( "Rutina PCLs008. Realizada", "") + GXutil.newLine( ) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int2[0] = AV76BarCod ;
         GXv_int3[0] = AV78BarCodReo ;
         GXv_char1[0] = AV77BarCodPar ;
         GXv_int5[0] = AV135RecLinMaq ;
         GXv_decimal11[0] = AV89BarCosPD ;
         GXv_decimal10[0] = AV81BarCosAD ;
         GXv_decimal9[0] = AV79BarCosAA ;
         GXv_decimal8[0] = AV87BarCosPA ;
         GXv_decimal7[0] = AV85BarCosCol ;
         GXv_decimal6[0] = AV83BarCosAnc ;
         GXv_date12[0] = AV107FechCierre ;
         new app.pcls010(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int3, GXv_char1, GXv_int5, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_decimal8, GXv_decimal7, GXv_decimal6, GXv_date12) ;
         pcls999.this.A396EmprCod = GXv_char4[0] ;
         pcls999.this.AV76BarCod = GXv_int2[0] ;
         pcls999.this.AV78BarCodReo = GXv_int3[0] ;
         pcls999.this.AV77BarCodPar = GXv_char1[0] ;
         pcls999.this.AV135RecLinMaq = GXv_int5[0] ;
         pcls999.this.AV89BarCosPD = GXv_decimal11[0] ;
         pcls999.this.AV81BarCosAD = GXv_decimal10[0] ;
         pcls999.this.AV79BarCosAA = GXv_decimal9[0] ;
         pcls999.this.AV87BarCosPA = GXv_decimal8[0] ;
         pcls999.this.AV85BarCosCol = GXv_decimal7[0] ;
         pcls999.this.AV83BarCosAnc = GXv_decimal6[0] ;
         pcls999.this.AV107FechCierre = GXv_date12[0] ;
         AV117inc_obs += httpContext.getMessage( "Rutina PCLs010.Historicos Recetas. Realizada", "") + GXutil.newLine( ) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int2[0] = AV76BarCod ;
         GXv_int3[0] = AV78BarCodReo ;
         GXv_char1[0] = AV77BarCodPar ;
         GXv_char13[0] = AV95CieCerAny ;
         GXv_int14[0] = AV98Consumos ;
         GXv_int5[0] = AV72Anyadi ;
         GXv_int15[0] = AV135RecLinMaq ;
         GXv_char16[0] = AV124MaqCod ;
         GXv_char17[0] = AV148Tipo ;
         GXv_char18[0] = AV96CierreAM ;
         GXv_dtime19[0] = AV92Ca_diahora ;
         GXv_int20[0] = AV93Cc_almcod ;
         GXv_decimal11[0] = AV101CosPro ;
         GXv_decimal10[0] = AV100CosAny ;
         GXv_int21[0] = AV98Consumos ;
         GXv_decimal9[0] = AV89BarCosPD ;
         GXv_decimal8[0] = AV81BarCosAD ;
         GXv_decimal7[0] = AV79BarCosAA ;
         GXv_decimal6[0] = AV87BarCosPA ;
         GXv_decimal22[0] = AV85BarCosCol ;
         GXv_decimal23[0] = AV83BarCosAnc ;
         GXv_char24[0] = Gx_msg ;
         GXv_date12[0] = AV107FechCierre ;
         new app.pcls011(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int3, GXv_char1, GXv_char13, GXv_int14, GXv_int5, GXv_int15, GXv_char16, GXv_char17, GXv_char18, GXv_dtime19, GXv_int20, GXv_decimal11, GXv_decimal10, GXv_int21, GXv_decimal9, GXv_decimal8, GXv_decimal7, GXv_decimal6, GXv_decimal22, GXv_decimal23, GXv_char24, GXv_date12) ;
         pcls999.this.A396EmprCod = GXv_char4[0] ;
         pcls999.this.AV76BarCod = GXv_int2[0] ;
         pcls999.this.AV78BarCodReo = GXv_int3[0] ;
         pcls999.this.AV77BarCodPar = GXv_char1[0] ;
         pcls999.this.AV95CieCerAny = GXv_char13[0] ;
         pcls999.this.AV98Consumos = GXv_int14[0] ;
         pcls999.this.AV72Anyadi = GXv_int5[0] ;
         pcls999.this.AV135RecLinMaq = GXv_int15[0] ;
         pcls999.this.AV124MaqCod = GXv_char16[0] ;
         pcls999.this.AV148Tipo = GXv_char17[0] ;
         pcls999.this.AV96CierreAM = GXv_char18[0] ;
         pcls999.this.AV92Ca_diahora = GXv_dtime19[0] ;
         pcls999.this.AV93Cc_almcod = GXv_int20[0] ;
         pcls999.this.AV101CosPro = GXv_decimal11[0] ;
         pcls999.this.AV100CosAny = GXv_decimal10[0] ;
         pcls999.this.AV98Consumos = GXv_int21[0] ;
         pcls999.this.AV89BarCosPD = GXv_decimal9[0] ;
         pcls999.this.AV81BarCosAD = GXv_decimal8[0] ;
         pcls999.this.AV79BarCosAA = GXv_decimal7[0] ;
         pcls999.this.AV87BarCosPA = GXv_decimal6[0] ;
         pcls999.this.AV85BarCosCol = GXv_decimal22[0] ;
         pcls999.this.AV83BarCosAnc = GXv_decimal23[0] ;
         pcls999.this.Gx_msg = GXv_char24[0] ;
         pcls999.this.AV107FechCierre = GXv_date12[0] ;
         AV117inc_obs += httpContext.getMessage( "Rutina PCLs011.Tabla LCONTI y Costes HDR. Realizada", "") + GXutil.newLine( ) ;
         if ( GXutil.strcmp(AV74BarAgrest, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char24[0] = A396EmprCod ;
            GXv_int2[0] = AV76BarCod ;
            GXv_int21[0] = AV78BarCodReo ;
            GXv_char18[0] = AV77BarCodPar ;
            GXv_char17[0] = AV95CieCerAny ;
            GXv_int20[0] = AV98Consumos ;
            GXv_int15[0] = AV72Anyadi ;
            GXv_int5[0] = AV135RecLinMaq ;
            GXv_char16[0] = AV124MaqCod ;
            GXv_char13[0] = AV148Tipo ;
            GXv_char4[0] = AV96CierreAM ;
            GXv_dtime19[0] = AV92Ca_diahora ;
            GXv_int14[0] = AV93Cc_almcod ;
            GXv_decimal23[0] = AV101CosPro ;
            GXv_decimal22[0] = AV100CosAny ;
            GXv_int3[0] = AV98Consumos ;
            GXv_decimal11[0] = AV89BarCosPD ;
            GXv_decimal10[0] = AV81BarCosAD ;
            GXv_decimal9[0] = AV79BarCosAA ;
            GXv_decimal8[0] = AV87BarCosPA ;
            GXv_decimal7[0] = AV85BarCosCol ;
            GXv_decimal6[0] = AV83BarCosAnc ;
            GXv_char1[0] = Gx_msg ;
            GXv_date12[0] = AV107FechCierre ;
            new app.pcls014(remoteHandle, context).execute( GXv_char24, GXv_int2, GXv_int21, GXv_char18, GXv_char17, GXv_int20, GXv_int15, GXv_int5, GXv_char16, GXv_char13, GXv_char4, GXv_dtime19, GXv_int14, GXv_decimal23, GXv_decimal22, GXv_int3, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_decimal8, GXv_decimal7, GXv_decimal6, GXv_char1, GXv_date12) ;
            pcls999.this.A396EmprCod = GXv_char24[0] ;
            pcls999.this.AV76BarCod = GXv_int2[0] ;
            pcls999.this.AV78BarCodReo = GXv_int21[0] ;
            pcls999.this.AV77BarCodPar = GXv_char18[0] ;
            pcls999.this.AV95CieCerAny = GXv_char17[0] ;
            pcls999.this.AV98Consumos = GXv_int20[0] ;
            pcls999.this.AV72Anyadi = GXv_int15[0] ;
            pcls999.this.AV135RecLinMaq = GXv_int5[0] ;
            pcls999.this.AV124MaqCod = GXv_char16[0] ;
            pcls999.this.AV148Tipo = GXv_char13[0] ;
            pcls999.this.AV96CierreAM = GXv_char4[0] ;
            pcls999.this.AV92Ca_diahora = GXv_dtime19[0] ;
            pcls999.this.AV93Cc_almcod = GXv_int14[0] ;
            pcls999.this.AV101CosPro = GXv_decimal23[0] ;
            pcls999.this.AV100CosAny = GXv_decimal22[0] ;
            pcls999.this.AV98Consumos = GXv_int3[0] ;
            pcls999.this.AV89BarCosPD = GXv_decimal11[0] ;
            pcls999.this.AV81BarCosAD = GXv_decimal10[0] ;
            pcls999.this.AV79BarCosAA = GXv_decimal9[0] ;
            pcls999.this.AV87BarCosPA = GXv_decimal8[0] ;
            pcls999.this.AV85BarCosCol = GXv_decimal7[0] ;
            pcls999.this.AV83BarCosAnc = GXv_decimal6[0] ;
            pcls999.this.Gx_msg = GXv_char1[0] ;
            pcls999.this.AV107FechCierre = GXv_date12[0] ;
            AV117inc_obs += httpContext.getMessage( "Rutina PCLs014.Hdrs Agrs.Tabla LCONTI,Costes HDR. Realizada", "") + GXutil.newLine( ) ;
         }
         if ( GXutil.strcmp(AV96CierreAM, httpContext.getMessage( "A", "")) == 0 )
         {
            GXv_char24[0] = A396EmprCod ;
            GXv_int2[0] = AV76BarCod ;
            GXv_int21[0] = AV78BarCodReo ;
            GXv_char18[0] = AV77BarCodPar ;
            GXv_int15[0] = AV135RecLinMaq ;
            GXv_char17[0] = AV151UsurCod ;
            GXv_dtime19[0] = AV92Ca_diahora ;
            GXv_int20[0] = AV93Cc_almcod ;
            GXv_date12[0] = AV107FechCierre ;
            new app.pcls019(remoteHandle, context).execute( GXv_char24, GXv_int2, GXv_int21, GXv_char18, GXv_int15, GXv_char17, GXv_dtime19, GXv_int20, GXv_date12) ;
            pcls999.this.A396EmprCod = GXv_char24[0] ;
            pcls999.this.AV76BarCod = GXv_int2[0] ;
            pcls999.this.AV78BarCodReo = GXv_int21[0] ;
            pcls999.this.AV77BarCodPar = GXv_char18[0] ;
            pcls999.this.AV135RecLinMaq = GXv_int15[0] ;
            pcls999.this.AV151UsurCod = GXv_char17[0] ;
            pcls999.this.AV92Ca_diahora = GXv_dtime19[0] ;
            pcls999.this.AV93Cc_almcod = GXv_int20[0] ;
            pcls999.this.AV107FechCierre = GXv_date12[0] ;
            AV117inc_obs += httpContext.getMessage( "Rutina PCLs019. Opcion Aut.Tabla CCSTKS, CCALM. Realizada", "") + GXutil.newLine( ) ;
         }
         else
         {
            GXv_char24[0] = A396EmprCod ;
            GXv_int2[0] = AV76BarCod ;
            GXv_int21[0] = AV78BarCodReo ;
            GXv_char18[0] = AV77BarCodPar ;
            GXv_int15[0] = AV135RecLinMaq ;
            GXv_char17[0] = AV151UsurCod ;
            GXv_dtime19[0] = AV92Ca_diahora ;
            GXv_int20[0] = AV93Cc_almcod ;
            GXv_char16[0] = httpContext.getMessage( "T", "") ;
            GXv_date12[0] = AV107FechCierre ;
            new app.pcls020(remoteHandle, context).execute( GXv_char24, GXv_int2, GXv_int21, GXv_char18, GXv_int15, GXv_char17, GXv_dtime19, GXv_int20, GXv_char16, GXv_date12) ;
            pcls999.this.A396EmprCod = GXv_char24[0] ;
            pcls999.this.AV76BarCod = GXv_int2[0] ;
            pcls999.this.AV78BarCodReo = GXv_int21[0] ;
            pcls999.this.AV77BarCodPar = GXv_char18[0] ;
            pcls999.this.AV135RecLinMaq = GXv_int15[0] ;
            pcls999.this.AV151UsurCod = GXv_char17[0] ;
            pcls999.this.AV92Ca_diahora = GXv_dtime19[0] ;
            pcls999.this.AV93Cc_almcod = GXv_int20[0] ;
            pcls999.this.AV107FechCierre = GXv_date12[0] ;
            AV117inc_obs += httpContext.getMessage( "Rutina PCLs020. Opcion Man.Tabla CCSTKS, CCALM. Realizada", "") + GXutil.newLine( ) ;
         }
         GXv_char24[0] = A396EmprCod ;
         GXv_int2[0] = AV76BarCod ;
         GXv_int21[0] = AV78BarCodReo ;
         GXv_char18[0] = AV77BarCodPar ;
         GXv_decimal23[0] = AV101CosPro ;
         GXv_decimal22[0] = AV100CosAny ;
         GXv_int20[0] = AV98Consumos ;
         GXv_int15[0] = AV135RecLinMaq ;
         GXv_char17[0] = AV148Tipo ;
         new app.pcls000(remoteHandle, context).execute( GXv_char24, GXv_int2, GXv_int21, GXv_char18, GXv_decimal23, GXv_decimal22, GXv_int20, GXv_int15, GXv_char17) ;
         pcls999.this.A396EmprCod = GXv_char24[0] ;
         pcls999.this.AV76BarCod = GXv_int2[0] ;
         pcls999.this.AV78BarCodReo = GXv_int21[0] ;
         pcls999.this.AV77BarCodPar = GXv_char18[0] ;
         pcls999.this.AV101CosPro = GXv_decimal23[0] ;
         pcls999.this.AV100CosAny = GXv_decimal22[0] ;
         pcls999.this.AV98Consumos = GXv_int20[0] ;
         pcls999.this.AV135RecLinMaq = GXv_int15[0] ;
         pcls999.this.AV148Tipo = GXv_char17[0] ;
         AV117inc_obs += httpContext.getMessage( "Rutina PCLs000. Existencias Productos, Reservas. Realizada", "") + GXutil.newLine( ) ;
         GXv_char24[0] = A396EmprCod ;
         GXv_int2[0] = AV76BarCod ;
         GXv_int21[0] = AV78BarCodReo ;
         GXv_char18[0] = AV77BarCodPar ;
         GXv_int15[0] = AV135RecLinMaq ;
         GXv_int25[0] = AV118j ;
         GXv_char17[0] = AV131Productosconsumos ;
         new app.recetasdeacabados.pprc43(remoteHandle, context).execute( GXv_char24, GXv_int2, GXv_int21, GXv_char18, GXv_int15, GXv_int25, GXv_char17) ;
         pcls999.this.A396EmprCod = GXv_char24[0] ;
         pcls999.this.AV76BarCod = GXv_int2[0] ;
         pcls999.this.AV78BarCodReo = GXv_int21[0] ;
         pcls999.this.AV77BarCodPar = GXv_char18[0] ;
         pcls999.this.AV135RecLinMaq = GXv_int15[0] ;
         pcls999.this.AV118j = GXv_int25[0] ;
         pcls999.this.AV131Productosconsumos = GXv_char17[0] ;
         GXv_char24[0] = A396EmprCod ;
         GXv_int25[0] = AV76BarCod ;
         GXv_int21[0] = AV78BarCodReo ;
         GXv_char18[0] = AV77BarCodPar ;
         GXv_int15[0] = AV135RecLinMaq ;
         new app.pcls021(remoteHandle, context).execute( GXv_char24, GXv_int25, GXv_int21, GXv_char18, GXv_int15) ;
         pcls999.this.A396EmprCod = GXv_char24[0] ;
         pcls999.this.AV76BarCod = GXv_int25[0] ;
         pcls999.this.AV78BarCodReo = GXv_int21[0] ;
         pcls999.this.AV77BarCodPar = GXv_char18[0] ;
         pcls999.this.AV135RecLinMaq = GXv_int15[0] ;
         AV117inc_obs += httpContext.getMessage( "Rutina PCLs021. Eliminacion Tablas Recmaq,Crecet,Lrecet. Realizada", "") + GXutil.newLine( ) ;
         new app.pcommit(remoteHandle, context).execute( ) ;
         AV117inc_obs += httpContext.getMessage( "Fin Cierre Receta Tinte, ", "") + localUtil.dtoc( AV107FechCierre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
         AV117inc_obs += httpContext.getMessage( "Hdr        = ", "") + GXutil.str( AV76BarCod, 8, 0) + "-" + GXutil.str( AV78BarCodReo, 1, 0) + AV77BarCodPar + " #          = " + GXutil.str( AV135RecLinMaq, 4, 0) + GXutil.newLine( ) ;
         AV117inc_obs += httpContext.getMessage( "N Interno  = ", "") + GXutil.str( AV137RecNumInt, 8, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV160Pgmname, AV151UsurCod, AV144Station, AV117inc_obs, AV76BarCod, AV78BarCodReo, AV77BarCodPar) ;
         GXv_char24[0] = A396EmprCod ;
         GXv_int25[0] = AV76BarCod ;
         GXv_int21[0] = AV78BarCodReo ;
         GXv_char18[0] = AV77BarCodPar ;
         GXv_int15[0] = AV135RecLinMaq ;
         GXv_char17[0] = AV151UsurCod ;
         GXv_char16[0] = AV144Station ;
         new app.psit4to5(remoteHandle, context).execute( GXv_char24, GXv_int25, GXv_int21, GXv_char18, GXv_int15, GXv_char17, GXv_char16) ;
         pcls999.this.A396EmprCod = GXv_char24[0] ;
         pcls999.this.AV76BarCod = GXv_int25[0] ;
         pcls999.this.AV78BarCodReo = GXv_int21[0] ;
         pcls999.this.AV77BarCodPar = GXv_char18[0] ;
         pcls999.this.AV135RecLinMaq = GXv_int15[0] ;
         pcls999.this.AV151UsurCod = GXv_char17[0] ;
         pcls999.this.AV144Station = GXv_char16[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls999.this.A396EmprCod;
      this.aP1[0] = pcls999.this.AV76BarCod;
      this.aP2[0] = pcls999.this.AV78BarCodReo;
      this.aP3[0] = pcls999.this.AV77BarCodPar;
      this.aP4[0] = pcls999.this.AV95CieCerAny;
      this.aP5[0] = pcls999.this.AV98Consumos;
      this.aP6[0] = pcls999.this.AV72Anyadi;
      this.aP7[0] = pcls999.this.AV135RecLinMaq;
      this.aP8[0] = pcls999.this.AV124MaqCod;
      this.aP9[0] = pcls999.this.AV148Tipo;
      this.aP10[0] = pcls999.this.AV96CierreAM;
      this.aP11[0] = pcls999.this.AV92Ca_diahora;
      this.aP12[0] = pcls999.this.AV93Cc_almcod;
      this.aP13[0] = pcls999.this.AV131Productosconsumos;
      this.aP14[0] = pcls999.this.AV118j;
      this.aP15[0] = pcls999.this.AV151UsurCod;
      this.aP16[0] = pcls999.this.AV144Station;
      this.aP17[0] = pcls999.this.AV107FechCierre;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV130PrdRect = "" ;
      scmdbuf = "" ;
      P05642_A719PrdNum = new String[] {""} ;
      P05642_n719PrdNum = new boolean[] {false} ;
      P05642_A396EmprCod = new String[] {""} ;
      P05642_A727PrdRec = new String[] {""} ;
      P05642_A2804RecLinMaq = new short[1] ;
      P05642_A130BarCodPar = new String[] {""} ;
      P05642_A132BarCodReo = new byte[1] ;
      P05642_A129BarCod = new int[1] ;
      P05642_A811RecLin = new short[1] ;
      P05642_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      A727PrdRec = "" ;
      A130BarCodPar = "" ;
      P05643_A396EmprCod = new String[] {""} ;
      P05643_A2804RecLinMaq = new short[1] ;
      P05643_A130BarCodPar = new String[] {""} ;
      P05643_A132BarCodReo = new byte[1] ;
      P05643_A129BarCod = new int[1] ;
      P05643_A5109RecNumInt = new int[1] ;
      P05643_A120BarAgrEst = new String[] {""} ;
      A120BarAgrEst = "" ;
      AV74BarAgrest = "" ;
      Gx_msg = "" ;
      P05644_A396EmprCod = new String[] {""} ;
      P05644_A129BarCod = new int[1] ;
      P05644_A132BarCodReo = new byte[1] ;
      P05644_A130BarCodPar = new String[] {""} ;
      P05644_A2804RecLinMaq = new short[1] ;
      P05644_A1273RecLinPro = new byte[1] ;
      AV101CosPro = DecimalUtil.ZERO ;
      AV100CosAny = DecimalUtil.ZERO ;
      AV89BarCosPD = DecimalUtil.ZERO ;
      AV81BarCosAD = DecimalUtil.ZERO ;
      AV79BarCosAA = DecimalUtil.ZERO ;
      AV87BarCosPA = DecimalUtil.ZERO ;
      AV85BarCosCol = DecimalUtil.ZERO ;
      AV83BarCosAnc = DecimalUtil.ZERO ;
      AV117inc_obs = "" ;
      GXv_int5 = new short[1] ;
      GXv_char13 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int14 = new byte[1] ;
      GXv_int3 = new byte[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      GXv_dtime19 = new java.util.Date[1] ;
      GXv_date12 = new java.util.Date[1] ;
      GXv_decimal23 = new java.math.BigDecimal[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_int20 = new byte[1] ;
      GXv_int2 = new int[1] ;
      AV160Pgmname = "" ;
      GXv_char24 = new String[1] ;
      GXv_int25 = new int[1] ;
      GXv_int21 = new byte[1] ;
      GXv_char18 = new String[1] ;
      GXv_int15 = new short[1] ;
      GXv_char17 = new String[1] ;
      GXv_char16 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls999__default(),
         new Object[] {
             new Object[] {
            P05642_A719PrdNum, P05642_n719PrdNum, P05642_A396EmprCod, P05642_A727PrdRec, P05642_A2804RecLinMaq, P05642_A130BarCodPar, P05642_A132BarCodReo, P05642_A129BarCod, P05642_A811RecLin, P05642_A1273RecLinPro
            }
            , new Object[] {
            P05643_A396EmprCod, P05643_A2804RecLinMaq, P05643_A130BarCodPar, P05643_A132BarCodReo, P05643_A129BarCod, P05643_A5109RecNumInt, P05643_A120BarAgrEst
            }
            , new Object[] {
            P05644_A396EmprCod, P05644_A129BarCod, P05644_A132BarCodReo, P05644_A130BarCodPar, P05644_A2804RecLinMaq, P05644_A1273RecLinPro
            }
         }
      );
      AV160Pgmname = "PCLs999" ;
      /* GeneXus formulas. */
      AV160Pgmname = "PCLs999" ;
      Gx_err = (short)(0) ;
   }

   private byte AV78BarCodReo ;
   private byte AV98Consumos ;
   private byte AV93Cc_almcod ;
   private byte AV102CtrlRec ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV116FlagLR ;
   private byte GXv_int14[] ;
   private byte GXv_int3[] ;
   private byte GXv_int20[] ;
   private byte GXv_int21[] ;
   private short AV72Anyadi ;
   private short AV135RecLinMaq ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short GXv_int5[] ;
   private short GXv_int15[] ;
   private short Gx_err ;
   private int AV76BarCod ;
   private int AV118j ;
   private int A129BarCod ;
   private int AV137RecNumInt ;
   private int A5109RecNumInt ;
   private int GXv_int2[] ;
   private int GXv_int25[] ;
   private java.math.BigDecimal AV101CosPro ;
   private java.math.BigDecimal AV100CosAny ;
   private java.math.BigDecimal AV89BarCosPD ;
   private java.math.BigDecimal AV81BarCosAD ;
   private java.math.BigDecimal AV79BarCosAA ;
   private java.math.BigDecimal AV87BarCosPA ;
   private java.math.BigDecimal AV85BarCosCol ;
   private java.math.BigDecimal AV83BarCosAnc ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal23[] ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private String A396EmprCod ;
   private String AV77BarCodPar ;
   private String AV95CieCerAny ;
   private String AV124MaqCod ;
   private String AV148Tipo ;
   private String AV96CierreAM ;
   private String AV151UsurCod ;
   private String AV144Station ;
   private String AV130PrdRect ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A727PrdRec ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String AV74BarAgrest ;
   private String Gx_msg ;
   private String GXv_char13[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String AV160Pgmname ;
   private String GXv_char24[] ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char16[] ;
   private java.util.Date AV92Ca_diahora ;
   private java.util.Date GXv_dtime19[] ;
   private java.util.Date AV107FechCierre ;
   private java.util.Date GXv_date12[] ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private String AV131Productosconsumos ;
   private String AV117inc_obs ;
   private java.util.Date[] aP17 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private short[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private java.util.Date[] aP11 ;
   private byte[] aP12 ;
   private String[] aP13 ;
   private int[] aP14 ;
   private String[] aP15 ;
   private String[] aP16 ;
   private IDataStoreProvider pr_default ;
   private String[] P05642_A719PrdNum ;
   private boolean[] P05642_n719PrdNum ;
   private String[] P05642_A396EmprCod ;
   private String[] P05642_A727PrdRec ;
   private short[] P05642_A2804RecLinMaq ;
   private String[] P05642_A130BarCodPar ;
   private byte[] P05642_A132BarCodReo ;
   private int[] P05642_A129BarCod ;
   private short[] P05642_A811RecLin ;
   private byte[] P05642_A1273RecLinPro ;
   private String[] P05643_A396EmprCod ;
   private short[] P05643_A2804RecLinMaq ;
   private String[] P05643_A130BarCodPar ;
   private byte[] P05643_A132BarCodReo ;
   private int[] P05643_A129BarCod ;
   private int[] P05643_A5109RecNumInt ;
   private String[] P05643_A120BarAgrEst ;
   private String[] P05644_A396EmprCod ;
   private int[] P05644_A129BarCod ;
   private byte[] P05644_A132BarCodReo ;
   private String[] P05644_A130BarCodPar ;
   private short[] P05644_A2804RecLinMaq ;
   private byte[] P05644_A1273RecLinPro ;
}

final  class pcls999__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05642", "SELECT T1.PrdNum, T1.EmprCod, T2.PrdRec, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecLin, T1.RecLinPro FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (? = 1) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05643", "SELECT T1.EmprCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecNumInt, T2.BarAgrEst FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05644", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setByte(6, ((Number) parms[5]).byteValue());
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
      }
   }

}

