package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pretar extends GXProcedure
{
   public pretar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pretar.class ), "" );
   }

   public pretar( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        java.util.Date aP1 ,
                                                                        java.util.Date aP2 ,
                                                                        long aP3 ,
                                                                        long aP4 ,
                                                                        int aP5 ,
                                                                        int aP6 ,
                                                                        String aP7 )
   {
      pretar.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        long aP3 ,
                        long aP4 ,
                        int aP5 ,
                        int aP6 ,
                        String aP7 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             long aP3 ,
                             long aP4 ,
                             int aP5 ,
                             int aP6 ,
                             String aP7 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP8 )
   {
      pretar.this.AV12EmprCod = aP0;
      pretar.this.AV26PFecha = aP1;
      pretar.this.AV27Ufecha = aP2;
      pretar.this.AV60AlbProcod1 = aP3;
      pretar.this.AV61AlbProcod2 = aP4;
      pretar.this.AV65CliCod1 = aP5;
      pretar.this.AV66CliCod2 = aP6;
      pretar.this.AV28Opcion = aP7;
      pretar.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV75messages.clear();
      GXv_char1[0] = AV12EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "PMLHDR", "") ;
      GXv_int3[0] = AV63ValPml ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      pretar.this.AV12EmprCod = GXv_char1[0] ;
      pretar.this.AV63ValPml = GXv_int3[0] ;
      GXv_char2[0] = AV12EmprCod ;
      GXv_char1[0] = httpContext.getMessage( "PML500", "") ;
      GXv_int3[0] = AV64Pml500 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char1, GXv_int3) ;
      pretar.this.AV12EmprCod = GXv_char2[0] ;
      pretar.this.AV64Pml500 = GXv_int3[0] ;
      AV71ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV71ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV71ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV71ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV71ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso 1...", ""));
      AV71ProgressIndicator.show();
      AV69CantidadRegistrosAProcesar = (short)(0) ;
      /* Optimized group. */
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV65CliCod1) ,
                                           Integer.valueOf(AV66CliCod2) ,
                                           Long.valueOf(AV60AlbProcod1) ,
                                           Long.valueOf(AV61AlbProcod2) ,
                                           AV26PFecha ,
                                           AV27Ufecha ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A34AlbProfch ,
                                           AV12EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      /* Using cursor P01332 */
      pr_default.execute(0, new Object[] {AV12EmprCod, Integer.valueOf(AV65CliCod1), Integer.valueOf(AV66CliCod2), Long.valueOf(AV60AlbProcod1), Long.valueOf(AV61AlbProcod2), AV26PFecha, AV27Ufecha});
      cV69CantidadRegistrosAProcesar = P01332_AV69CantidadRegistrosAProcesar[0] ;
      pr_default.close(0);
      AV69CantidadRegistrosAProcesar = (short)(AV69CantidadRegistrosAProcesar+cV69CantidadRegistrosAProcesar*1) ;
      /* End optimized group. */
      if ( AV69CantidadRegistrosAProcesar == 0 )
      {
         AV69CantidadRegistrosAProcesar = (short)(1) ;
      }
      AV68CantidadRegistrosProcesados = (short)(0) ;
      AV8PrecioT = (byte)(0) ;
      AV9PrecioI = (byte)(0) ;
      AV10PrecioS = (byte)(0) ;
      AV11PrecioF = (byte)(0) ;
      AV23PreDef = httpContext.getMessage( "N", "") ;
      AV21PreKgm = DecimalUtil.doubleToDec(0) ;
      AV22PreMts = DecimalUtil.doubleToDec(0) ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV65CliCod1) ,
                                           Integer.valueOf(AV66CliCod2) ,
                                           Long.valueOf(AV60AlbProcod1) ,
                                           Long.valueOf(AV61AlbProcod2) ,
                                           AV26PFecha ,
                                           AV27Ufecha ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A34AlbProfch ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           A39AlbProPri ,
                                           AV12EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P01333 */
      pr_default.execute(1, new Object[] {AV12EmprCod, Integer.valueOf(AV65CliCod1), Integer.valueOf(AV66CliCod2), Long.valueOf(AV60AlbProcod1), Long.valueOf(AV61AlbProcod2), AV26PFecha, AV27Ufecha});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1253EmprGuiRem = P01333_A1253EmprGuiRem[0] ;
         A396EmprCod = P01333_A396EmprCod[0] ;
         A30AlbProCod = P01333_A30AlbProCod[0] ;
         A39AlbProPri = P01333_A39AlbProPri[0] ;
         A33AlbProEst = P01333_A33AlbProEst[0] ;
         A34AlbProfch = P01333_A34AlbProfch[0] ;
         A1243GuiRemCli = P01333_A1243GuiRemCli[0] ;
         A1244GuiRemCln = P01333_A1244GuiRemCln[0] ;
         A1244GuiRemCln = P01333_A1244GuiRemCln[0] ;
         AV67Guiremcli = A1243GuiRemCli ;
         AV73GuiRemCln = A1244GuiRemCln ;
         /* Using cursor P01334 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1261BarAlbKgmE = P01334_A1261BarAlbKgmE[0] ;
            A129BarCod = P01334_A129BarCod[0] ;
            A132BarCodReo = P01334_A132BarCodReo[0] ;
            A130BarCodPar = P01334_A130BarCodPar[0] ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int4[0] = A30AlbProCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int5[0] = A132BarCodReo ;
            GXv_char1[0] = A130BarCodPar ;
            new app.pcopfas(remoteHandle, context).execute( GXv_char2, GXv_int4, GXv_int3, GXv_int5, GXv_char1) ;
            pretar.this.A396EmprCod = GXv_char2[0] ;
            pretar.this.A30AlbProCod = GXv_int4[0] ;
            pretar.this.A129BarCod = GXv_int3[0] ;
            pretar.this.A132BarCodReo = GXv_int5[0] ;
            pretar.this.A130BarCodPar = GXv_char1[0] ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int4[0] = A30AlbProCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int5[0] = A132BarCodReo ;
            GXv_char1[0] = A130BarCodPar ;
            new app.pfas618(remoteHandle, context).execute( GXv_char2, GXv_int4, GXv_int3, GXv_int5, GXv_char1) ;
            pretar.this.A396EmprCod = GXv_char2[0] ;
            pretar.this.A30AlbProCod = GXv_int4[0] ;
            pretar.this.A129BarCod = GXv_int3[0] ;
            pretar.this.A132BarCodReo = GXv_int5[0] ;
            pretar.this.A130BarCodPar = GXv_char1[0] ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV68CantidadRegistrosProcesados = (short)(AV68CantidadRegistrosProcesados+1) ;
         AV70Porcentaje = (short)((AV68CantidadRegistrosProcesados/ (double) (AV69CantidadRegistrosAProcesar))*100) ;
         AV71ProgressIndicator.setgxTv_SdtProgress_Value( AV70Porcentaje );
         AV71ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando Proceso 1 Creacion ALBFAS, Control Fase 618. Registro %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV68CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV69CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( GXutil.str( AV67Guiremcli, 6, 0)), GXutil.trim( AV73GuiRemCln), "", "", "", "", ""));
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV71ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado.", ""));
      AV71ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV71ProgressIndicator.hide();
      AV71ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV71ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV71ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV71ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV71ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso 2...", ""));
      AV71ProgressIndicator.show();
      AV68CantidadRegistrosProcesados = (short)(0) ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV65CliCod1) ,
                                           Integer.valueOf(AV66CliCod2) ,
                                           Long.valueOf(AV60AlbProcod1) ,
                                           Long.valueOf(AV61AlbProcod2) ,
                                           AV26PFecha ,
                                           AV27Ufecha ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A34AlbProfch ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           A39AlbProPri ,
                                           AV12EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P01335 */
      pr_default.execute(3, new Object[] {AV12EmprCod, Integer.valueOf(AV65CliCod1), Integer.valueOf(AV66CliCod2), Long.valueOf(AV60AlbProcod1), Long.valueOf(AV61AlbProcod2), AV26PFecha, AV27Ufecha});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A1253EmprGuiRem = P01335_A1253EmprGuiRem[0] ;
         A396EmprCod = P01335_A396EmprCod[0] ;
         A30AlbProCod = P01335_A30AlbProCod[0] ;
         A39AlbProPri = P01335_A39AlbProPri[0] ;
         A33AlbProEst = P01335_A33AlbProEst[0] ;
         A34AlbProfch = P01335_A34AlbProfch[0] ;
         A1243GuiRemCli = P01335_A1243GuiRemCli[0] ;
         A1244GuiRemCln = P01335_A1244GuiRemCln[0] ;
         A1244GuiRemCln = P01335_A1244GuiRemCln[0] ;
         AV67Guiremcli = A1243GuiRemCli ;
         AV73GuiRemCln = A1244GuiRemCln ;
         /* Using cursor P01336 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A130BarCodPar = P01336_A130BarCodPar[0] ;
            A132BarCodReo = P01336_A132BarCodReo[0] ;
            A129BarCod = P01336_A129BarCod[0] ;
            A2839AlbProVal = P01336_A2839AlbProVal[0] ;
            A1261BarAlbKgmE = P01336_A1261BarAlbKgmE[0] ;
            A1263BarAlbMtrE = P01336_A1263BarAlbMtrE[0] ;
            A32AlbProEsp = P01336_A32AlbProEsp[0] ;
            A1262BarPreKgm = P01336_A1262BarPreKgm[0] ;
            A1264BarPreMtr = P01336_A1264BarPreMtr[0] ;
            A2761AlbBarRec = P01336_A2761AlbBarRec[0] ;
            A5354AlbImpMan = P01336_A5354AlbImpMan[0] ;
            /* Using cursor P01337 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            A252CliCod = P01337_A252CliCod[0] ;
            n252CliCod = P01337_n252CliCod[0] ;
            A5253BarAcc = P01337_A5253BarAcc[0] ;
            A212BarSer = P01337_A212BarSer[0] ;
            A135BarColNom = P01337_A135BarColNom[0] ;
            A136BarColNum = P01337_A136BarColNum[0] ;
            A218BarTipCol = P01337_A218BarTipCol[0] ;
            A228BarUniMed = P01337_A228BarUniMed[0] ;
            A361DisCod = P01337_A361DisCod[0] ;
            A2010BarTipDis = P01337_A2010BarTipDis[0] ;
            /* Using cursor P01339 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            if ( (pr_default.getStatus(6) != 101) )
            {
               A184BarMtr = P01339_A184BarMtr[0] ;
               A166BarKgm = P01339_A166BarKgm[0] ;
            }
            else
            {
               A184BarMtr = DecimalUtil.doubleToDec(0) ;
               A166BarKgm = DecimalUtil.doubleToDec(0) ;
            }
            AV12EmprCod = A396EmprCod ;
            AV13CliCod = A252CliCod ;
            AV14BarSer = A212BarSer ;
            AV15BarColNom = A135BarColNom ;
            AV16BarColNum = A136BarColNum ;
            AV17TipColCod = A218BarTipCol ;
            if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               AV19LimUni = GXutil.roundDecimal( A184BarMtr, 0) ;
               AV20UniMed = httpContext.getMessage( "M", "") ;
            }
            else
            {
               AV19LimUni = GXutil.roundDecimal( A166BarKgm, 0) ;
               AV20UniMed = httpContext.getMessage( "K", "") ;
            }
            AV54DisCod = A361DisCod ;
            /* Execute user subroutine: 'DISPOS' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(5);
               pr_default.close(4);
               pr_default.close(3);
               pr_default.close(3);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV21PreKgm = DecimalUtil.doubleToDec(0) ;
            AV22PreMts = DecimalUtil.doubleToDec(0) ;
            AV24PorRec = DecimalUtil.doubleToDec(0) ;
            AV29FasCod = GXutil.space( (short)(8)) ;
            AV49FasDsc = GXutil.space( (short)(28)) ;
            /* Execute user subroutine: 'CFORMU' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(5);
               pr_default.close(4);
               pr_default.close(3);
               pr_default.close(3);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( ( GXutil.strcmp(A5253BarAcc, httpContext.getMessage( "S", "")) == 0 ) || ( ( GXutil.strcmp(A2010BarTipDis, "L") == 0 ) ) )
            {
               AV21PreKgm = AV55DisPreKgm ;
               AV22PreMts = AV56DisPreMtr ;
               AV77PrePca = AV76DisPrePz ;
            }
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int5[0] = A132BarCodReo ;
            GXv_char1[0] = A130BarCodPar ;
            GXv_decimal6[0] = AV57AlbImpMan ;
            GXv_char7[0] = AV58Fase618 ;
            new app.pbusf618(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int5, GXv_char1, GXv_decimal6, GXv_char7) ;
            pretar.this.A396EmprCod = GXv_char2[0] ;
            pretar.this.A129BarCod = GXv_int3[0] ;
            pretar.this.A132BarCodReo = GXv_int5[0] ;
            pretar.this.A130BarCodPar = GXv_char1[0] ;
            pretar.this.AV57AlbImpMan = GXv_decimal6[0] ;
            pretar.this.AV58Fase618 = GXv_char7[0] ;
            if ( ( ( GXutil.strcmp(A2010BarTipDis, "L") != 0 ) && ( AV21PreKgm.doubleValue() == 0 ) && ( AV22PreMts.doubleValue() == 0 ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) && ( AV57AlbImpMan.doubleValue() == 0 ) ) || ( ( GXutil.strcmp(A2010BarTipDis, "L") == 0 ) && ( AV77PrePca.doubleValue() == 0 ) ) )
            {
               AV74message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
               AV74message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "ALBBAR", "") );
               AV74message.setgxTv_SdtMessages_Message_Description( GXutil.padl( GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)), (short)(10), "0")+GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 8, 0)), (short)(8), "0")+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar );
               AV75messages.add(AV74message, 0);
            }
            AV62Pml = (int)(((A1263BarAlbMtrE.doubleValue()==0) ? 0 : (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( A1261BarAlbKgmE.multiply(DecimalUtil.doubleToDec(1000)).divide(A1263BarAlbMtrE, 18, java.math.RoundingMode.DOWN), 0))))) ;
            AV11PrecioF = (byte)(0) ;
            AV32FlagAlbFas = (byte)(0) ;
            /* Using cursor P013310 */
            pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A457FasCod = P013310_A457FasCod[0] ;
               A1241GuiFasPKg = P013310_A1241GuiFasPKg[0] ;
               A1242GuiFasPMt = P013310_A1242GuiFasPMt[0] ;
               A1240GuiFasLin = P013310_A1240GuiFasLin[0] ;
               AV29FasCod = A457FasCod ;
               /* Execute user subroutine: 'PREFAS' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(7);
                  pr_default.close(6);
                  pr_default.close(5);
                  pr_default.close(4);
                  pr_default.close(3);
                  pr_default.close(3);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV59Precio_Acc == 0 )
               {
                  AV30FasPreMtr = DecimalUtil.doubleToDec(0) ;
                  AV31FasPreKgm = DecimalUtil.doubleToDec(0) ;
                  AV32FlagAlbFas = (byte)(1) ;
                  GXv_char7[0] = A396EmprCod ;
                  GXv_int3[0] = A252CliCod ;
                  GXv_char2[0] = AV29FasCod ;
                  GXv_char1[0] = AV49FasDsc ;
                  GXv_decimal6[0] = AV31FasPreKgm ;
                  GXv_decimal8[0] = AV30FasPreMtr ;
                  GXv_int9[0] = AV62Pml ;
                  GXv_int10[0] = AV63ValPml ;
                  GXv_char11[0] = A5253BarAcc ;
                  GXv_int12[0] = AV64Pml500 ;
                  new app.ppreser(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_char2, GXv_char1, GXv_decimal6, GXv_decimal8, GXv_int9, GXv_int10, GXv_char11, GXv_int12) ;
                  pretar.this.A396EmprCod = GXv_char7[0] ;
                  pretar.this.A252CliCod = GXv_int3[0] ;
                  pretar.this.AV29FasCod = GXv_char2[0] ;
                  pretar.this.AV49FasDsc = GXv_char1[0] ;
                  pretar.this.AV31FasPreKgm = GXv_decimal6[0] ;
                  pretar.this.AV30FasPreMtr = GXv_decimal8[0] ;
                  pretar.this.AV62Pml = GXv_int9[0] ;
                  pretar.this.AV63ValPml = GXv_int10[0] ;
                  pretar.this.A5253BarAcc = GXv_char11[0] ;
                  pretar.this.AV64Pml500 = GXv_int12[0] ;
                  if ( ( AV31FasPreKgm.doubleValue() == 0 ) && ( AV30FasPreMtr.doubleValue() == 0 ) )
                  {
                     AV11PrecioF = (byte)(0) ;
                  }
                  else
                  {
                     AV11PrecioF = (byte)(1) ;
                  }
                  A1241GuiFasPKg = AV31FasPreKgm ;
                  A1242GuiFasPMt = AV30FasPreMtr ;
                  if ( ( AV32FlagAlbFas == 1 ) && ( AV11PrecioF == 0 ) )
                  {
                     AV74message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                     AV74message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "ALBFAS", "") );
                     AV74message.setgxTv_SdtMessages_Message_Description( GXutil.padl( GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)), (short)(10), "0")+GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 8, 0)), (short)(8), "0")+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar+GXutil.padl( GXutil.trim( GXutil.str( A1240GuiFasLin, 4, 0)), (short)(4), "0") );
                     AV75messages.add(AV74message, 0);
                  }
               }
               /* Using cursor P013311 */
               pr_default.execute(8, new Object[] {A1241GuiFasPKg, A1242GuiFasPMt, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
               pr_default.readNext(7);
            }
            pr_default.close(7);
            if ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "N", "")) == 0 )
            {
               A32AlbProEsp = (byte)(10) ;
               A1262BarPreKgm = DecimalUtil.doubleToDec(0) ;
               A1264BarPreMtr = DecimalUtil.doubleToDec(0) ;
               A2761AlbBarRec = DecimalUtil.doubleToDec(0) ;
            }
            if ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 )
            {
               A32AlbProEsp = (byte)(0) ;
               A1262BarPreKgm = AV21PreKgm ;
               A1264BarPreMtr = AV22PreMts ;
               A2761AlbBarRec = AV24PorRec ;
               if ( ( AV21PreKgm.doubleValue() == 0 ) && ( AV22PreMts.doubleValue() == 0 ) )
               {
                  A32AlbProEsp = (byte)(0) ;
               }
               else
               {
                  A32AlbProEsp = (byte)(10) ;
               }
               if ( GXutil.strcmp(AV58Fase618, httpContext.getMessage( "S", "")) == 0 )
               {
                  A1262BarPreKgm = DecimalUtil.doubleToDec(0) ;
                  A1264BarPreMtr = DecimalUtil.doubleToDec(0) ;
                  A2761AlbBarRec = DecimalUtil.doubleToDec(0) ;
                  A32AlbProEsp = (byte)(10) ;
                  A5354AlbImpMan = AV57AlbImpMan ;
               }
            }
            /* Using cursor P013312 */
            pr_default.execute(9, new Object[] {Byte.valueOf(A32AlbProEsp), A1262BarPreKgm, A1264BarPreMtr, A2761AlbBarRec, A5354AlbImpMan, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            pr_default.readNext(4);
         }
         pr_default.close(4);
         pr_default.close(5);
         pr_default.close(6);
         AV68CantidadRegistrosProcesados = (short)(AV68CantidadRegistrosProcesados+1) ;
         AV70Porcentaje = (short)((AV68CantidadRegistrosProcesados/ (double) (AV69CantidadRegistrosAProcesar))*100) ;
         AV71ProgressIndicator.setgxTv_SdtProgress_Value( AV70Porcentaje );
         AV71ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando Proceso 2. Actualizacion ALBBAR, ALBFAS. Registro %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV68CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV69CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( AV73GuiRemCln), GXutil.trim( AV73GuiRemCln), "", "", "", "", ""));
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV71ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado.", ""));
      AV71ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV71ProgressIndicator.hide();
      cleanup();
   }

   public void S111( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      /* Using cursor P013313 */
      pr_default.execute(10, new Object[] {AV12EmprCod, Integer.valueOf(AV13CliCod), AV14BarSer, AV15BarColNom, Integer.valueOf(AV16BarColNum), Byte.valueOf(AV17TipColCod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A831TipColCod = P013313_A831TipColCod[0] ;
         A483ForColNum = P013313_A483ForColNum[0] ;
         A482ForColNom = P013313_A482ForColNom[0] ;
         A494ForSer = P013313_A494ForSer[0] ;
         A252CliCod = P013313_A252CliCod[0] ;
         n252CliCod = P013313_n252CliCod[0] ;
         A396EmprCod = P013313_A396EmprCod[0] ;
         A583IntCod = P013313_A583IntCod[0] ;
         A493ForPreMtr = P013313_A493ForPreMtr[0] ;
         n493ForPreMtr = P013313_n493ForPreMtr[0] ;
         A492ForPreKgm = P013313_A492ForPreKgm[0] ;
         n492ForPreKgm = P013313_n492ForPreKgm[0] ;
         A491ForPreDef = P013313_A491ForPreDef[0] ;
         n491ForPreDef = P013313_n491ForPreDef[0] ;
         AV18IntCod = A583IntCod ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A492ForPreKgm)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A493ForPreMtr)==0) )
         {
            AV21PreKgm = A492ForPreKgm ;
            AV22PreMts = A493ForPreMtr ;
            if ( GXutil.strcmp(A491ForPreDef, httpContext.getMessage( "S", "")) == 0 )
            {
               AV23PreDef = httpContext.getMessage( "S", "") ;
            }
            else
            {
               AV23PreDef = httpContext.getMessage( "N", "") ;
            }
            AV8PrecioT = (byte)(1) ;
            AV10PrecioS = (byte)(1) ;
            AV9PrecioI = (byte)(1) ;
         }
         /* Using cursor P013314 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A1521RecValFin = P013314_A1521RecValFin[0] ;
            n1521RecValFin = P013314_n1521RecValFin[0] ;
            A1520RecValIni = P013314_A1520RecValIni[0] ;
            n1520RecValIni = P013314_n1520RecValIni[0] ;
            A1522RecCanRec = P013314_A1522RecCanRec[0] ;
            n1522RecCanRec = P013314_n1522RecCanRec[0] ;
            A1519RecCorLin = P013314_A1519RecCorLin[0] ;
            if ( ( ( AV19LimUni.doubleValue() >= A1520RecValIni ) && ( AV19LimUni.doubleValue() <= A1521RecValFin ) ) || ( ( AV19LimUni.doubleValue() >= A1520RecValIni ) && (0==A1521RecValFin) ) )
            {
               AV24PorRec = A1522RecCanRec ;
               if ( GXutil.strcmp(AV20UniMed, httpContext.getMessage( "K", "")) == 0 )
               {
                  AV21PreKgm = AV21PreKgm.add(((AV21PreKgm.multiply(A1522RecCanRec)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
               }
               else
               {
                  AV22PreMts = AV22PreMts.add(((AV22PreMts.multiply(A1522RecCanRec)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(11);
         }
         pr_default.close(11);
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV21PreKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV22PreMts)==0) )
         {
            /* Execute user subroutine: 'ARTICU' */
            S128 ();
            if ( returnInSub )
            {
               pr_default.close(10);
               returnInSub = true;
               if (true) return;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S128( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      /* Using cursor P013315 */
      pr_default.execute(12, new Object[] {AV12EmprCod, Integer.valueOf(AV13CliCod), AV14BarSer});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A65ArtCod = P013315_A65ArtCod[0] ;
         A252CliCod = P013315_A252CliCod[0] ;
         n252CliCod = P013315_n252CliCod[0] ;
         A396EmprCod = P013315_A396EmprCod[0] ;
         A93ArtPreMtr = P013315_A93ArtPreMtr[0] ;
         n93ArtPreMtr = P013315_n93ArtPreMtr[0] ;
         A92ArtPreKgm = P013315_A92ArtPreKgm[0] ;
         n92ArtPreKgm = P013315_n92ArtPreKgm[0] ;
         A91ArtPreDef = P013315_A91ArtPreDef[0] ;
         n91ArtPreDef = P013315_n91ArtPreDef[0] ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A92ArtPreKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A93ArtPreMtr)==0) )
         {
            AV10PrecioS = (byte)(1) ;
         }
         else
         {
            AV21PreKgm = A92ArtPreKgm ;
            AV22PreMts = A93ArtPreMtr ;
            if ( GXutil.strcmp(A91ArtPreDef, httpContext.getMessage( "S", "")) == 0 )
            {
               AV23PreDef = httpContext.getMessage( "S", "") ;
            }
            else
            {
               AV23PreDef = httpContext.getMessage( "N", "") ;
            }
            AV10PrecioS = (byte)(1) ;
            AV9PrecioI = (byte)(1) ;
         }
         AV9PrecioI = (byte)(1) ;
         /* Using cursor P013316 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(AV17TipColCod), Byte.valueOf(AV18IntCod)});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A583IntCod = P013316_A583IntCod[0] ;
            A831TipColCod = P013316_A831TipColCod[0] ;
            A586IntPreKgm = P013316_A586IntPreKgm[0] ;
            n586IntPreKgm = P013316_n586IntPreKgm[0] ;
            A587IntPreMtr = P013316_A587IntPreMtr[0] ;
            n587IntPreMtr = P013316_n587IntPreMtr[0] ;
            A585IntPreDef = P013316_A585IntPreDef[0] ;
            n585IntPreDef = P013316_n585IntPreDef[0] ;
            AV21PreKgm = AV21PreKgm.add(A586IntPreKgm) ;
            AV22PreMts = AV22PreMts.add(A587IntPreMtr) ;
            if ( GXutil.strcmp(A585IntPreDef, httpContext.getMessage( "S", "")) == 0 )
            {
               AV23PreDef = httpContext.getMessage( "S", "") ;
            }
            else
            {
               AV23PreDef = httpContext.getMessage( "N", "") ;
            }
            AV9PrecioI = (byte)(1) ;
            AV10PrecioS = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(13);
         /* Using cursor P013317 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, AV19LimUni});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A596LimUni = P013317_A596LimUni[0] ;
            n596LimUni = P013317_n596LimUni[0] ;
            A675PorRec = P013317_A675PorRec[0] ;
            n675PorRec = P013317_n675PorRec[0] ;
            A598LinRec = P013317_A598LinRec[0] ;
            AV24PorRec = A675PorRec ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(14);
         }
         pr_default.close(14);
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24PorRec)==0) )
         {
            AV22PreMts = AV22PreMts.add(GXutil.roundDecimal( AV22PreMts.multiply(AV24PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0)) ;
            AV21PreKgm = AV21PreKgm.add(GXutil.roundDecimal( AV21PreKgm.multiply(AV24PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0)) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S131( )
   {
      /* 'DISPOS' Routine */
      returnInSub = false ;
      AV55DisPreKgm = DecimalUtil.doubleToDec(0) ;
      AV56DisPreMtr = DecimalUtil.doubleToDec(0) ;
      AV76DisPrePz = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P013318 */
      pr_default.execute(15, new Object[] {AV12EmprCod, Integer.valueOf(AV54DisCod)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A361DisCod = P013318_A361DisCod[0] ;
         A396EmprCod = P013318_A396EmprCod[0] ;
         A388DisPreKgm = P013318_A388DisPreKgm[0] ;
         A389DisPreMtr = P013318_A389DisPreMtr[0] ;
         A14555DisPrePz = P013318_A14555DisPrePz[0] ;
         AV55DisPreKgm = A388DisPreKgm ;
         AV56DisPreMtr = A389DisPreMtr ;
         AV76DisPrePz = A14555DisPrePz ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void S141( )
   {
      /* 'PREFAS' Routine */
      returnInSub = false ;
      AV59Precio_Acc = (byte)(0) ;
      /* Using cursor P013319 */
      pr_default.execute(16, new Object[] {AV12EmprCod, Integer.valueOf(AV13CliCod), AV29FasCod});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A457FasCod = P013319_A457FasCod[0] ;
         A252CliCod = P013319_A252CliCod[0] ;
         n252CliCod = P013319_n252CliCod[0] ;
         A396EmprCod = P013319_A396EmprCod[0] ;
         A10882FasPreU = P013319_A10882FasPreU[0] ;
         n10882FasPreU = P013319_n10882FasPreU[0] ;
         AV59Precio_Acc = A10882FasPreU ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
   }

   protected void cleanup( )
   {
      this.aP8[0] = pretar.this.AV75messages;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pretar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV75messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV71ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      P01332_AV69CantidadRegistrosAProcesar = new short[1] ;
      AV23PreDef = "" ;
      AV21PreKgm = DecimalUtil.ZERO ;
      AV22PreMts = DecimalUtil.ZERO ;
      A39AlbProPri = "" ;
      A396EmprCod = "" ;
      P01333_A1253EmprGuiRem = new String[] {""} ;
      P01333_A396EmprCod = new String[] {""} ;
      P01333_A30AlbProCod = new long[1] ;
      P01333_A39AlbProPri = new String[] {""} ;
      P01333_A33AlbProEst = new byte[1] ;
      P01333_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P01333_A1243GuiRemCli = new int[1] ;
      P01333_A1244GuiRemCln = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A1244GuiRemCln = "" ;
      AV73GuiRemCln = "" ;
      P01334_A396EmprCod = new String[] {""} ;
      P01334_A30AlbProCod = new long[1] ;
      P01334_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01334_A129BarCod = new int[1] ;
      P01334_A132BarCodReo = new byte[1] ;
      P01334_A130BarCodPar = new String[] {""} ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      GXv_int4 = new long[1] ;
      P01335_A1253EmprGuiRem = new String[] {""} ;
      P01335_A396EmprCod = new String[] {""} ;
      P01335_A30AlbProCod = new long[1] ;
      P01335_A39AlbProPri = new String[] {""} ;
      P01335_A33AlbProEst = new byte[1] ;
      P01335_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P01335_A1243GuiRemCli = new int[1] ;
      P01335_A1244GuiRemCln = new String[] {""} ;
      P01336_A396EmprCod = new String[] {""} ;
      P01336_A30AlbProCod = new long[1] ;
      P01336_A130BarCodPar = new String[] {""} ;
      P01336_A132BarCodReo = new byte[1] ;
      P01336_A129BarCod = new int[1] ;
      P01336_A2839AlbProVal = new String[] {""} ;
      P01336_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01336_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01336_A32AlbProEsp = new byte[1] ;
      P01336_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01336_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01336_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01336_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2839AlbProVal = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      P01337_A252CliCod = new int[1] ;
      P01337_n252CliCod = new boolean[] {false} ;
      P01337_A5253BarAcc = new String[] {""} ;
      P01337_A212BarSer = new String[] {""} ;
      P01337_A135BarColNom = new String[] {""} ;
      P01337_A136BarColNum = new int[1] ;
      P01337_A218BarTipCol = new byte[1] ;
      P01337_A228BarUniMed = new String[] {""} ;
      P01337_A361DisCod = new int[1] ;
      P01337_A2010BarTipDis = new String[] {""} ;
      A5253BarAcc = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A228BarUniMed = "" ;
      A2010BarTipDis = "" ;
      P01339_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01339_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV14BarSer = "" ;
      AV15BarColNom = "" ;
      AV19LimUni = DecimalUtil.ZERO ;
      AV20UniMed = "" ;
      AV24PorRec = DecimalUtil.ZERO ;
      AV29FasCod = "" ;
      AV49FasDsc = "" ;
      AV55DisPreKgm = DecimalUtil.ZERO ;
      AV56DisPreMtr = DecimalUtil.ZERO ;
      AV77PrePca = DecimalUtil.ZERO ;
      AV76DisPrePz = DecimalUtil.ZERO ;
      GXv_int5 = new byte[1] ;
      AV57AlbImpMan = DecimalUtil.ZERO ;
      AV58Fase618 = "" ;
      AV74message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      P013310_A396EmprCod = new String[] {""} ;
      P013310_A30AlbProCod = new long[1] ;
      P013310_A129BarCod = new int[1] ;
      P013310_A132BarCodReo = new byte[1] ;
      P013310_A130BarCodPar = new String[] {""} ;
      P013310_A457FasCod = new String[] {""} ;
      P013310_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P013310_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P013310_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      AV30FasPreMtr = DecimalUtil.ZERO ;
      AV31FasPreKgm = DecimalUtil.ZERO ;
      GXv_char7 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int9 = new int[1] ;
      GXv_int10 = new int[1] ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new int[1] ;
      P013313_A831TipColCod = new byte[1] ;
      P013313_A483ForColNum = new int[1] ;
      P013313_A482ForColNom = new String[] {""} ;
      P013313_A494ForSer = new String[] {""} ;
      P013313_A252CliCod = new int[1] ;
      P013313_n252CliCod = new boolean[] {false} ;
      P013313_A396EmprCod = new String[] {""} ;
      P013313_A583IntCod = new byte[1] ;
      P013313_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P013313_n493ForPreMtr = new boolean[] {false} ;
      P013313_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P013313_n492ForPreKgm = new boolean[] {false} ;
      P013313_A491ForPreDef = new String[] {""} ;
      P013313_n491ForPreDef = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
      P013314_A396EmprCod = new String[] {""} ;
      P013314_A252CliCod = new int[1] ;
      P013314_n252CliCod = new boolean[] {false} ;
      P013314_A494ForSer = new String[] {""} ;
      P013314_A482ForColNom = new String[] {""} ;
      P013314_A483ForColNum = new int[1] ;
      P013314_A831TipColCod = new byte[1] ;
      P013314_A1521RecValFin = new int[1] ;
      P013314_n1521RecValFin = new boolean[] {false} ;
      P013314_A1520RecValIni = new int[1] ;
      P013314_n1520RecValIni = new boolean[] {false} ;
      P013314_A1522RecCanRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P013314_n1522RecCanRec = new boolean[] {false} ;
      P013314_A1519RecCorLin = new byte[1] ;
      A1522RecCanRec = DecimalUtil.ZERO ;
      P013315_A65ArtCod = new String[] {""} ;
      P013315_A252CliCod = new int[1] ;
      P013315_n252CliCod = new boolean[] {false} ;
      P013315_A396EmprCod = new String[] {""} ;
      P013315_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P013315_n93ArtPreMtr = new boolean[] {false} ;
      P013315_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P013315_n92ArtPreKgm = new boolean[] {false} ;
      P013315_A91ArtPreDef = new String[] {""} ;
      P013315_n91ArtPreDef = new boolean[] {false} ;
      A65ArtCod = "" ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      A91ArtPreDef = "" ;
      P013316_A396EmprCod = new String[] {""} ;
      P013316_A252CliCod = new int[1] ;
      P013316_n252CliCod = new boolean[] {false} ;
      P013316_A65ArtCod = new String[] {""} ;
      P013316_A583IntCod = new byte[1] ;
      P013316_A831TipColCod = new byte[1] ;
      P013316_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P013316_n586IntPreKgm = new boolean[] {false} ;
      P013316_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P013316_n587IntPreMtr = new boolean[] {false} ;
      P013316_A585IntPreDef = new String[] {""} ;
      P013316_n585IntPreDef = new boolean[] {false} ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A585IntPreDef = "" ;
      P013317_A396EmprCod = new String[] {""} ;
      P013317_A252CliCod = new int[1] ;
      P013317_n252CliCod = new boolean[] {false} ;
      P013317_A65ArtCod = new String[] {""} ;
      P013317_A596LimUni = new int[1] ;
      P013317_n596LimUni = new boolean[] {false} ;
      P013317_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P013317_n675PorRec = new boolean[] {false} ;
      P013317_A598LinRec = new byte[1] ;
      A675PorRec = DecimalUtil.ZERO ;
      P013318_A361DisCod = new int[1] ;
      P013318_A396EmprCod = new String[] {""} ;
      P013318_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P013318_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P013318_A14555DisPrePz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      A14555DisPrePz = DecimalUtil.ZERO ;
      P013319_A457FasCod = new String[] {""} ;
      P013319_A252CliCod = new int[1] ;
      P013319_n252CliCod = new boolean[] {false} ;
      P013319_A396EmprCod = new String[] {""} ;
      P013319_A10882FasPreU = new byte[1] ;
      P013319_n10882FasPreU = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pretar__default(),
         new Object[] {
             new Object[] {
            P01332_AV69CantidadRegistrosAProcesar
            }
            , new Object[] {
            P01333_A1253EmprGuiRem, P01333_A396EmprCod, P01333_A30AlbProCod, P01333_A39AlbProPri, P01333_A33AlbProEst, P01333_A34AlbProfch, P01333_A1243GuiRemCli, P01333_A1244GuiRemCln
            }
            , new Object[] {
            P01334_A396EmprCod, P01334_A30AlbProCod, P01334_A1261BarAlbKgmE, P01334_A129BarCod, P01334_A132BarCodReo, P01334_A130BarCodPar
            }
            , new Object[] {
            P01335_A1253EmprGuiRem, P01335_A396EmprCod, P01335_A30AlbProCod, P01335_A39AlbProPri, P01335_A33AlbProEst, P01335_A34AlbProfch, P01335_A1243GuiRemCli, P01335_A1244GuiRemCln
            }
            , new Object[] {
            P01336_A396EmprCod, P01336_A30AlbProCod, P01336_A130BarCodPar, P01336_A132BarCodReo, P01336_A129BarCod, P01336_A2839AlbProVal, P01336_A1261BarAlbKgmE, P01336_A1263BarAlbMtrE, P01336_A32AlbProEsp, P01336_A1262BarPreKgm,
            P01336_A1264BarPreMtr, P01336_A2761AlbBarRec, P01336_A5354AlbImpMan
            }
            , new Object[] {
            P01337_A252CliCod, P01337_n252CliCod, P01337_A5253BarAcc, P01337_A212BarSer, P01337_A135BarColNom, P01337_A136BarColNum, P01337_A218BarTipCol, P01337_A228BarUniMed, P01337_A361DisCod, P01337_A2010BarTipDis
            }
            , new Object[] {
            P01339_A184BarMtr, P01339_A166BarKgm
            }
            , new Object[] {
            P013310_A396EmprCod, P013310_A30AlbProCod, P013310_A129BarCod, P013310_A132BarCodReo, P013310_A130BarCodPar, P013310_A457FasCod, P013310_A1241GuiFasPKg, P013310_A1242GuiFasPMt, P013310_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P013313_A831TipColCod, P013313_A483ForColNum, P013313_A482ForColNom, P013313_A494ForSer, P013313_A252CliCod, P013313_A396EmprCod, P013313_A583IntCod, P013313_A493ForPreMtr, P013313_n493ForPreMtr, P013313_A492ForPreKgm,
            P013313_n492ForPreKgm, P013313_A491ForPreDef, P013313_n491ForPreDef
            }
            , new Object[] {
            P013314_A396EmprCod, P013314_A252CliCod, P013314_A494ForSer, P013314_A482ForColNom, P013314_A483ForColNum, P013314_A831TipColCod, P013314_A1521RecValFin, P013314_n1521RecValFin, P013314_A1520RecValIni, P013314_n1520RecValIni,
            P013314_A1522RecCanRec, P013314_n1522RecCanRec, P013314_A1519RecCorLin
            }
            , new Object[] {
            P013315_A65ArtCod, P013315_A252CliCod, P013315_A396EmprCod, P013315_A93ArtPreMtr, P013315_n93ArtPreMtr, P013315_A92ArtPreKgm, P013315_n92ArtPreKgm, P013315_A91ArtPreDef, P013315_n91ArtPreDef
            }
            , new Object[] {
            P013316_A396EmprCod, P013316_A252CliCod, P013316_A65ArtCod, P013316_A583IntCod, P013316_A831TipColCod, P013316_A586IntPreKgm, P013316_n586IntPreKgm, P013316_A587IntPreMtr, P013316_n587IntPreMtr, P013316_A585IntPreDef,
            P013316_n585IntPreDef
            }
            , new Object[] {
            P013317_A396EmprCod, P013317_A252CliCod, P013317_A65ArtCod, P013317_A596LimUni, P013317_n596LimUni, P013317_A675PorRec, P013317_n675PorRec, P013317_A598LinRec
            }
            , new Object[] {
            P013318_A361DisCod, P013318_A396EmprCod, P013318_A388DisPreKgm, P013318_A389DisPreMtr, P013318_A14555DisPrePz
            }
            , new Object[] {
            P013319_A457FasCod, P013319_A252CliCod, P013319_A396EmprCod, P013319_A10882FasPreU, P013319_n10882FasPreU
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8PrecioT ;
   private byte AV9PrecioI ;
   private byte AV10PrecioS ;
   private byte AV11PrecioF ;
   private byte A33AlbProEst ;
   private byte A132BarCodReo ;
   private byte A32AlbProEsp ;
   private byte A218BarTipCol ;
   private byte AV17TipColCod ;
   private byte GXv_int5[] ;
   private byte AV32FlagAlbFas ;
   private byte AV59Precio_Acc ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV18IntCod ;
   private byte A1519RecCorLin ;
   private byte A598LinRec ;
   private byte A10882FasPreU ;
   private short AV69CantidadRegistrosAProcesar ;
   private short cV69CantidadRegistrosAProcesar ;
   private short AV68CantidadRegistrosProcesados ;
   private short AV70Porcentaje ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int AV65CliCod1 ;
   private int AV66CliCod2 ;
   private int AV63ValPml ;
   private int AV64Pml500 ;
   private int A1243GuiRemCli ;
   private int AV67Guiremcli ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A361DisCod ;
   private int AV13CliCod ;
   private int AV16BarColNum ;
   private int AV54DisCod ;
   private int AV62Pml ;
   private int GXv_int3[] ;
   private int GXv_int9[] ;
   private int GXv_int10[] ;
   private int GXv_int12[] ;
   private int A483ForColNum ;
   private int A1521RecValFin ;
   private int A1520RecValIni ;
   private int A596LimUni ;
   private long AV60AlbProcod1 ;
   private long AV61AlbProcod2 ;
   private long A30AlbProCod ;
   private long GXv_int4[] ;
   private java.math.BigDecimal AV21PreKgm ;
   private java.math.BigDecimal AV22PreMts ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV19LimUni ;
   private java.math.BigDecimal AV24PorRec ;
   private java.math.BigDecimal AV55DisPreKgm ;
   private java.math.BigDecimal AV56DisPreMtr ;
   private java.math.BigDecimal AV77PrePca ;
   private java.math.BigDecimal AV76DisPrePz ;
   private java.math.BigDecimal AV57AlbImpMan ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal AV30FasPreMtr ;
   private java.math.BigDecimal AV31FasPreKgm ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal A493ForPreMtr ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal A1522RecCanRec ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private java.math.BigDecimal A92ArtPreKgm ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal A587IntPreMtr ;
   private java.math.BigDecimal A675PorRec ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal A14555DisPrePz ;
   private String AV12EmprCod ;
   private String AV28Opcion ;
   private String scmdbuf ;
   private String AV23PreDef ;
   private String A39AlbProPri ;
   private String A396EmprCod ;
   private String A1253EmprGuiRem ;
   private String A1244GuiRemCln ;
   private String AV73GuiRemCln ;
   private String A130BarCodPar ;
   private String A2839AlbProVal ;
   private String A5253BarAcc ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A228BarUniMed ;
   private String A2010BarTipDis ;
   private String AV14BarSer ;
   private String AV15BarColNom ;
   private String AV20UniMed ;
   private String AV29FasCod ;
   private String AV49FasDsc ;
   private String AV58Fase618 ;
   private String A457FasCod ;
   private String GXv_char7[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char11[] ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A491ForPreDef ;
   private String A65ArtCod ;
   private String A91ArtPreDef ;
   private String A585IntPreDef ;
   private java.util.Date AV26PFecha ;
   private java.util.Date AV27Ufecha ;
   private java.util.Date A34AlbProfch ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n493ForPreMtr ;
   private boolean n492ForPreKgm ;
   private boolean n491ForPreDef ;
   private boolean n1521RecValFin ;
   private boolean n1520RecValIni ;
   private boolean n1522RecCanRec ;
   private boolean n93ArtPreMtr ;
   private boolean n92ArtPreKgm ;
   private boolean n91ArtPreDef ;
   private boolean n586IntPreKgm ;
   private boolean n587IntPreMtr ;
   private boolean n585IntPreDef ;
   private boolean n596LimUni ;
   private boolean n675PorRec ;
   private boolean n10882FasPreU ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV71ProgressIndicator ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P01332_AV69CantidadRegistrosAProcesar ;
   private String[] P01333_A1253EmprGuiRem ;
   private String[] P01333_A396EmprCod ;
   private long[] P01333_A30AlbProCod ;
   private String[] P01333_A39AlbProPri ;
   private byte[] P01333_A33AlbProEst ;
   private java.util.Date[] P01333_A34AlbProfch ;
   private int[] P01333_A1243GuiRemCli ;
   private String[] P01333_A1244GuiRemCln ;
   private String[] P01334_A396EmprCod ;
   private long[] P01334_A30AlbProCod ;
   private java.math.BigDecimal[] P01334_A1261BarAlbKgmE ;
   private int[] P01334_A129BarCod ;
   private byte[] P01334_A132BarCodReo ;
   private String[] P01334_A130BarCodPar ;
   private String[] P01335_A1253EmprGuiRem ;
   private String[] P01335_A396EmprCod ;
   private long[] P01335_A30AlbProCod ;
   private String[] P01335_A39AlbProPri ;
   private byte[] P01335_A33AlbProEst ;
   private java.util.Date[] P01335_A34AlbProfch ;
   private int[] P01335_A1243GuiRemCli ;
   private String[] P01335_A1244GuiRemCln ;
   private String[] P01336_A396EmprCod ;
   private long[] P01336_A30AlbProCod ;
   private String[] P01336_A130BarCodPar ;
   private byte[] P01336_A132BarCodReo ;
   private int[] P01336_A129BarCod ;
   private String[] P01336_A2839AlbProVal ;
   private java.math.BigDecimal[] P01336_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P01336_A1263BarAlbMtrE ;
   private byte[] P01336_A32AlbProEsp ;
   private java.math.BigDecimal[] P01336_A1262BarPreKgm ;
   private java.math.BigDecimal[] P01336_A1264BarPreMtr ;
   private java.math.BigDecimal[] P01336_A2761AlbBarRec ;
   private java.math.BigDecimal[] P01336_A5354AlbImpMan ;
   private int[] P01337_A252CliCod ;
   private boolean[] P01337_n252CliCod ;
   private String[] P01337_A5253BarAcc ;
   private String[] P01337_A212BarSer ;
   private String[] P01337_A135BarColNom ;
   private int[] P01337_A136BarColNum ;
   private byte[] P01337_A218BarTipCol ;
   private String[] P01337_A228BarUniMed ;
   private int[] P01337_A361DisCod ;
   private String[] P01337_A2010BarTipDis ;
   private java.math.BigDecimal[] P01339_A184BarMtr ;
   private java.math.BigDecimal[] P01339_A166BarKgm ;
   private String[] P013310_A396EmprCod ;
   private long[] P013310_A30AlbProCod ;
   private int[] P013310_A129BarCod ;
   private byte[] P013310_A132BarCodReo ;
   private String[] P013310_A130BarCodPar ;
   private String[] P013310_A457FasCod ;
   private java.math.BigDecimal[] P013310_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P013310_A1242GuiFasPMt ;
   private short[] P013310_A1240GuiFasLin ;
   private byte[] P013313_A831TipColCod ;
   private int[] P013313_A483ForColNum ;
   private String[] P013313_A482ForColNom ;
   private String[] P013313_A494ForSer ;
   private int[] P013313_A252CliCod ;
   private boolean[] P013313_n252CliCod ;
   private String[] P013313_A396EmprCod ;
   private byte[] P013313_A583IntCod ;
   private java.math.BigDecimal[] P013313_A493ForPreMtr ;
   private boolean[] P013313_n493ForPreMtr ;
   private java.math.BigDecimal[] P013313_A492ForPreKgm ;
   private boolean[] P013313_n492ForPreKgm ;
   private String[] P013313_A491ForPreDef ;
   private boolean[] P013313_n491ForPreDef ;
   private String[] P013314_A396EmprCod ;
   private int[] P013314_A252CliCod ;
   private boolean[] P013314_n252CliCod ;
   private String[] P013314_A494ForSer ;
   private String[] P013314_A482ForColNom ;
   private int[] P013314_A483ForColNum ;
   private byte[] P013314_A831TipColCod ;
   private int[] P013314_A1521RecValFin ;
   private boolean[] P013314_n1521RecValFin ;
   private int[] P013314_A1520RecValIni ;
   private boolean[] P013314_n1520RecValIni ;
   private java.math.BigDecimal[] P013314_A1522RecCanRec ;
   private boolean[] P013314_n1522RecCanRec ;
   private byte[] P013314_A1519RecCorLin ;
   private String[] P013315_A65ArtCod ;
   private int[] P013315_A252CliCod ;
   private boolean[] P013315_n252CliCod ;
   private String[] P013315_A396EmprCod ;
   private java.math.BigDecimal[] P013315_A93ArtPreMtr ;
   private boolean[] P013315_n93ArtPreMtr ;
   private java.math.BigDecimal[] P013315_A92ArtPreKgm ;
   private boolean[] P013315_n92ArtPreKgm ;
   private String[] P013315_A91ArtPreDef ;
   private boolean[] P013315_n91ArtPreDef ;
   private String[] P013316_A396EmprCod ;
   private int[] P013316_A252CliCod ;
   private boolean[] P013316_n252CliCod ;
   private String[] P013316_A65ArtCod ;
   private byte[] P013316_A583IntCod ;
   private byte[] P013316_A831TipColCod ;
   private java.math.BigDecimal[] P013316_A586IntPreKgm ;
   private boolean[] P013316_n586IntPreKgm ;
   private java.math.BigDecimal[] P013316_A587IntPreMtr ;
   private boolean[] P013316_n587IntPreMtr ;
   private String[] P013316_A585IntPreDef ;
   private boolean[] P013316_n585IntPreDef ;
   private String[] P013317_A396EmprCod ;
   private int[] P013317_A252CliCod ;
   private boolean[] P013317_n252CliCod ;
   private String[] P013317_A65ArtCod ;
   private int[] P013317_A596LimUni ;
   private boolean[] P013317_n596LimUni ;
   private java.math.BigDecimal[] P013317_A675PorRec ;
   private boolean[] P013317_n675PorRec ;
   private byte[] P013317_A598LinRec ;
   private int[] P013318_A361DisCod ;
   private String[] P013318_A396EmprCod ;
   private java.math.BigDecimal[] P013318_A388DisPreKgm ;
   private java.math.BigDecimal[] P013318_A389DisPreMtr ;
   private java.math.BigDecimal[] P013318_A14555DisPrePz ;
   private String[] P013319_A457FasCod ;
   private int[] P013319_A252CliCod ;
   private boolean[] P013319_n252CliCod ;
   private String[] P013319_A396EmprCod ;
   private byte[] P013319_A10882FasPreU ;
   private boolean[] P013319_n10882FasPreU ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV75messages ;
   private com.genexus.SdtMessages_Message AV74message ;
}

final  class pretar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P01332( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV65CliCod1 ,
                                          int AV66CliCod2 ,
                                          long AV60AlbProcod1 ,
                                          long AV61AlbProcod2 ,
                                          java.util.Date AV26PFecha ,
                                          java.util.Date AV27Ufecha ,
                                          int A1243GuiRemCli ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          String AV12EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[7];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbProEst < 2)");
      addWhere(sWhereString, "(AlbProPri = '1')");
      if ( ! (0==AV65CliCod1) )
      {
         addWhere(sWhereString, "(GuiRemCli >= ?)");
      }
      else
      {
         GXv_int13[1] = (byte)(1) ;
      }
      if ( ! (0==AV66CliCod2) )
      {
         addWhere(sWhereString, "(GuiRemCli <= ?)");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( ! (0==AV60AlbProcod1) )
      {
         addWhere(sWhereString, "(AlbProCod >= ?)");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( ! (0==AV61AlbProcod2) )
      {
         addWhere(sWhereString, "(AlbProCod <= ?)");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26PFecha)) )
      {
         addWhere(sWhereString, "(AlbProfch >= ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27Ufecha)) )
      {
         addWhere(sWhereString, "(AlbProfch <= ?)");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_P01333( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV65CliCod1 ,
                                          int AV66CliCod2 ,
                                          long AV60AlbProcod1 ,
                                          long AV61AlbProcod2 ,
                                          java.util.Date AV26PFecha ,
                                          java.util.Date AV27Ufecha ,
                                          int A1243GuiRemCli ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          byte A33AlbProEst ,
                                          String A39AlbProPri ,
                                          String AV12EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[7];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProCod, T1.AlbProPri, T1.AlbProEst, T1.AlbProfch, T1.GuiRemCli AS GuiRemCli, T2.CliNom AS GuiRemCln FROM (TXPCALPRD" ;
      scmdbuf += " T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProEst < 2)");
      addWhere(sWhereString, "(T1.AlbProPri = '1')");
      if ( ! (0==AV65CliCod1) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int15[1] = (byte)(1) ;
      }
      if ( ! (0==AV66CliCod2) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( ! (0==AV60AlbProcod1) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( ! (0==AV61AlbProcod2) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26PFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27Ufecha)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.GuiRemCli, T1.AlbProCod, T1.AlbProfch, T1.AlbProEst" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_P01335( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV65CliCod1 ,
                                          int AV66CliCod2 ,
                                          long AV60AlbProcod1 ,
                                          long AV61AlbProcod2 ,
                                          java.util.Date AV26PFecha ,
                                          java.util.Date AV27Ufecha ,
                                          int A1243GuiRemCli ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          byte A33AlbProEst ,
                                          String A39AlbProPri ,
                                          String AV12EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[7];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProCod, T1.AlbProPri, T1.AlbProEst, T1.AlbProfch, T1.GuiRemCli AS GuiRemCli, T2.CliNom AS GuiRemCln FROM (TXPCALPRD" ;
      scmdbuf += " T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProEst < 2)");
      addWhere(sWhereString, "(T1.AlbProPri = '1')");
      if ( ! (0==AV65CliCod1) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! (0==AV66CliCod2) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (0==AV60AlbProcod1) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (0==AV61AlbProcod2) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26PFecha)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27Ufecha)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.GuiRemCli, T1.AlbProCod, T1.AlbProfch, T1.AlbProEst" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P01332(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).longValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] );
            case 1 :
                  return conditional_P01333(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).longValue() , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 3 :
                  return conditional_P01335(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).longValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).longValue() , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01332", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01333", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01334", "SELECT EmprCod, AlbProCod, BarAlbKgmE, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01335", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01336", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, AlbProVal, BarAlbKgmE, BarAlbMtrE, AlbProEsp, BarPreKgm, BarPreMtr, AlbBarRec, AlbImpMan FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ?) AND (EmprCod = ? and AlbProCod = ?) ORDER BY EmprCod, AlbProCod  FOR UPDATE OF AlbProEsp, BarPreKgm, BarPreMtr, AlbBarRec, AlbImpMan NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01337", "SELECT CliCod, BarAcc, BarSer, BarColNom, BarColNum, BarTipCol, BarUniMed, DisCod, BarTipDis FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01339", "SELECT COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarKgm, 0) AS BarKgm FROM (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P013310", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasCod, GuiFasPKg, GuiFasPMt, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar  FOR UPDATE OF GuiFasPKg, GuiFasPMt NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P013311", "UPDATE TXPALBFAS SET GuiFasPKg=?, GuiFasPMt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P013312", "UPDATE TXPALBBAR SET AlbProEsp=?, BarPreKgm=?, BarPreMtr=?, AlbBarRec=?, AlbImpMan=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P013313", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCod, ForPreMtr, ForPreKgm, ForPreDef FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P013314", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecValFin, RecValIni, RecCanRec, RecCorLin FROM TXPRECCOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, RecCorLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P013315", "SELECT ArtCod, CliCod, EmprCod, ArtPreMtr, ArtPreKgm, ArtPreDef FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P013316", "SELECT EmprCod, CliCod, ArtCod, IntCod, TipColCod, IntPreKgm, IntPreMtr, IntPreDef FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P013317", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LimUni, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod, LinRec) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P013318", "SELECT DisCod, EmprCod, DisPreKgm, DisPreMtr, DisPrePz FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P013319", "SELECT FasCod, CliCod, EmprCod, FasPreU FROM TXPPREFAS WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 10 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 13);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

