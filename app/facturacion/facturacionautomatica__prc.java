package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class facturacionautomatica__prc extends GXProcedure
{
   public facturacionautomatica__prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( facturacionautomatica__prc.class ), "" );
   }

   public facturacionautomatica__prc( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String aP0 ,
                                                                        int aP1 ,
                                                                        int aP2 ,
                                                                        byte aP3 ,
                                                                        String aP4 ,
                                                                        long aP5 ,
                                                                        long aP6 ,
                                                                        java.util.Date aP7 ,
                                                                        java.util.Date aP8 ,
                                                                        String aP9 ,
                                                                        java.util.Date aP10 ,
                                                                        java.util.Date aP11 ,
                                                                        String aP12 ,
                                                                        String aP13 ,
                                                                        String[] aP14 )
   {
      facturacionautomatica__prc.this.aP15 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        long aP5 ,
                        long aP6 ,
                        java.util.Date aP7 ,
                        java.util.Date aP8 ,
                        String aP9 ,
                        java.util.Date aP10 ,
                        java.util.Date aP11 ,
                        String aP12 ,
                        String aP13 ,
                        String[] aP14 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             long aP5 ,
                             long aP6 ,
                             java.util.Date aP7 ,
                             java.util.Date aP8 ,
                             String aP9 ,
                             java.util.Date aP10 ,
                             java.util.Date aP11 ,
                             String aP12 ,
                             String aP13 ,
                             String[] aP14 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP15 )
   {
      facturacionautomatica__prc.this.AV8Emprcod = aP0;
      facturacionautomatica__prc.this.AV14PCLI = aP1;
      facturacionautomatica__prc.this.AV15UCLI2 = aP2;
      facturacionautomatica__prc.this.AV16PerFac = aP3;
      facturacionautomatica__prc.this.AV18TipAlb = aP4;
      facturacionautomatica__prc.this.AV9PALB = aP5;
      facturacionautomatica__prc.this.AV10UALB2 = aP6;
      facturacionautomatica__prc.this.AV11PAlbFch = aP7;
      facturacionautomatica__prc.this.AV12UFecha2 = aP8;
      facturacionautomatica__prc.this.AV13PRIO = aP9;
      facturacionautomatica__prc.this.AV23FacFch = aP10;
      facturacionautomatica__prc.this.AV25FacHor = aP11;
      facturacionautomatica__prc.this.AV21TipProd = aP12;
      facturacionautomatica__prc.this.AV24FacSerNum = aP13;
      facturacionautomatica__prc.this.aP14 = aP14;
      facturacionautomatica__prc.this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV22FlagCLIDES) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8Emprcod, httpContext.getMessage( "CLIDES", ""), GXv_int2) ;
      facturacionautomatica__prc.this.GXt_int1 = GXv_int2[0] ;
      AV22FlagCLIDES = GXt_int1 ;
      AV27ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV27ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV27ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV27ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV27ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV27ProgressIndicator.show();
      AV28CantidadRegistrosAProcesar = (short)(0) ;
      /* Optimized group. */
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV14PCLI) ,
                                           Integer.valueOf(AV15UCLI2) ,
                                           Integer.valueOf(A252CliCod) ,
                                           AV8Emprcod ,
                                           Byte.valueOf(AV16PerFac) ,
                                           AV13PRIO } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09YN2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Byte.valueOf(AV16PerFac), AV13PRIO, Integer.valueOf(AV14PCLI), Integer.valueOf(AV15UCLI2)});
      cV28CantidadRegistrosAProcesar = P09YN2_AV28CantidadRegistrosAProcesar[0] ;
      pr_default.close(0);
      AV28CantidadRegistrosAProcesar = (short)(AV28CantidadRegistrosAProcesar+cV28CantidadRegistrosAProcesar*1) ;
      /* End optimized group. */
      if ( AV28CantidadRegistrosAProcesar == 0 )
      {
         AV28CantidadRegistrosAProcesar = (short)(1) ;
      }
      AV29CantidadRegistrosProcesados = (short)(0) ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV14PCLI) ,
                                           Integer.valueOf(AV15UCLI2) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A294CliPerFac) ,
                                           Byte.valueOf(AV16PerFac) ,
                                           A297CliPri ,
                                           AV13PRIO ,
                                           A10045CliAct ,
                                           AV8Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09YN3 */
      pr_default.execute(1, new Object[] {AV8Emprcod, Byte.valueOf(AV16PerFac), AV13PRIO, Integer.valueOf(AV14PCLI), Integer.valueOf(AV15UCLI2)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10045CliAct = P09YN3_A10045CliAct[0] ;
         A294CliPerFac = P09YN3_A294CliPerFac[0] ;
         A297CliPri = P09YN3_A297CliPri[0] ;
         A252CliCod = P09YN3_A252CliCod[0] ;
         A396EmprCod = P09YN3_A396EmprCod[0] ;
         A250CliAlbAgr = P09YN3_A250CliAlbAgr[0] ;
         A279CliNom = P09YN3_A279CliNom[0] ;
         A10045CliAct = P09YN3_A10045CliAct[0] ;
         A294CliPerFac = P09YN3_A294CliPerFac[0] ;
         A250CliAlbAgr = P09YN3_A250CliAlbAgr[0] ;
         A279CliNom = P09YN3_A279CliNom[0] ;
         AV20TotalPend = DecimalUtil.ZERO ;
         AV17CliCod = A252CliCod ;
         AV19CliAlbAgr = A250CliAlbAgr ;
         /* Execute user subroutine: 'FACTURAR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV29CantidadRegistrosProcesados = (short)(AV29CantidadRegistrosProcesados+1) ;
         AV31Porcentaje = DecimalUtil.doubleToDec((AV29CantidadRegistrosProcesados/ (double) (AV28CantidadRegistrosAProcesar))*100) ;
         AV27ProgressIndicator.setgxTv_SdtProgress_Value( (int)(DecimalUtil.decToDouble(AV31Porcentaje)) );
         AV27ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV29CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV28CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( GXutil.str( A252CliCod, 6, 0)), GXutil.trim( A279CliNom), "", "", "", "", ""));
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV27ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado.", ""));
      AV27ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV27ProgressIndicator.hide();
      cleanup();
   }

   public void S111( )
   {
      /* 'FACTURAR' Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(AV18TipAlb, "1") == 0 ) || (GXutil.strcmp("", AV18TipAlb)==0) )
      {
         pr_default.dynParam(2, new Object[]{ new Object[]{
                                              Long.valueOf(AV9PALB) ,
                                              Long.valueOf(AV10UALB2) ,
                                              AV11PAlbFch ,
                                              AV12UFecha2 ,
                                              Long.valueOf(A30AlbProCod) ,
                                              A34AlbProfch ,
                                              A5140AlbMarca ,
                                              Byte.valueOf(A33AlbProEst) ,
                                              A39AlbProPri ,
                                              AV13PRIO ,
                                              AV8Emprcod ,
                                              Integer.valueOf(AV17CliCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A1243GuiRemCli) } ,
                                              new int[]{
                                              TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         /* Using cursor P09YN4 */
         pr_default.execute(2, new Object[] {AV8Emprcod, Integer.valueOf(AV17CliCod), AV13PRIO, Long.valueOf(AV9PALB), Long.valueOf(AV10UALB2), AV11PAlbFch, AV12UFecha2});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A30AlbProCod = P09YN4_A30AlbProCod[0] ;
            A396EmprCod = P09YN4_A396EmprCod[0] ;
            A3915EmpNumDec = P09YN4_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P09YN4_n3915EmpNumDec[0] ;
            A5140AlbMarca = P09YN4_A5140AlbMarca[0] ;
            A39AlbProPri = P09YN4_A39AlbProPri[0] ;
            A33AlbProEst = P09YN4_A33AlbProEst[0] ;
            A34AlbProfch = P09YN4_A34AlbProfch[0] ;
            A1243GuiRemCli = P09YN4_A1243GuiRemCli[0] ;
            A3915EmpNumDec = P09YN4_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P09YN4_n3915EmpNumDec[0] ;
            /* Using cursor P09YN5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A1206TubCod = P09YN5_A1206TubCod[0] ;
               n1206TubCod = P09YN5_n1206TubCod[0] ;
               A130BarCodPar = P09YN5_A130BarCodPar[0] ;
               A132BarCodReo = P09YN5_A132BarCodReo[0] ;
               A129BarCod = P09YN5_A129BarCod[0] ;
               A12195BarAlbUnd = P09YN5_A12195BarAlbUnd[0] ;
               A12196BarPreUnd = P09YN5_A12196BarPreUnd[0] ;
               A1263BarAlbMtrE = P09YN5_A1263BarAlbMtrE[0] ;
               A1264BarPreMtr = P09YN5_A1264BarPreMtr[0] ;
               A1261BarAlbKgmE = P09YN5_A1261BarAlbKgmE[0] ;
               A1262BarPreKgm = P09YN5_A1262BarPreKgm[0] ;
               A5354AlbImpMan = P09YN5_A5354AlbImpMan[0] ;
               A1208TubPre = P09YN5_A1208TubPre[0] ;
               n1208TubPre = P09YN5_n1208TubPre[0] ;
               A1266BarAlbTub = P09YN5_A1266BarAlbTub[0] ;
               A1208TubPre = P09YN5_A1208TubPre[0] ;
               n1208TubPre = P09YN5_n1208TubPre[0] ;
               if ( A3915EmpNumDec == 2 )
               {
                  A1281TubImp = GXutil.roundDecimal( A1208TubPre.multiply(DecimalUtil.doubleToDec(A1266BarAlbTub)), 2) ;
               }
               else
               {
                  if ( A3915EmpNumDec == 0 )
                  {
                     A1281TubImp = GXutil.roundDecimal( A1208TubPre.multiply(DecimalUtil.doubleToDec(A1266BarAlbTub)), 0) ;
                  }
                  else
                  {
                     A1281TubImp = DecimalUtil.doubleToDec(0) ;
                  }
               }
               AV20TotalPend = AV20TotalPend.add(A1281TubImp).add(GXutil.roundDecimal( (A1262BarPreKgm.multiply(A1261BarAlbKgmE)).add((A1264BarPreMtr.multiply(A1263BarAlbMtrE))).add((A12196BarPreUnd.multiply(DecimalUtil.doubleToDec(A12195BarAlbUnd)))), 2)) ;
               if ( A5354AlbImpMan.doubleValue() > 0 )
               {
                  AV20TotalPend = AV20TotalPend.add(A5354AlbImpMan) ;
               }
               /* Using cursor P09YN6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A1242GuiFasPMt = P09YN6_A1242GuiFasPMt[0] ;
                  A1276FasMtr = P09YN6_A1276FasMtr[0] ;
                  A1241GuiFasPKg = P09YN6_A1241GuiFasPKg[0] ;
                  A1275FasKgm = P09YN6_A1275FasKgm[0] ;
                  A1240GuiFasLin = P09YN6_A1240GuiFasLin[0] ;
                  AV20TotalPend = AV20TotalPend.add(GXutil.roundDecimal( (A1275FasKgm.multiply(A1241GuiFasPKg)).add((A1276FasMtr.multiply(A1242GuiFasPMt))), 2)) ;
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               /* Using cursor P09YN7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A1470AlbPrdPMt = P09YN7_A1470AlbPrdPMt[0] ;
                  n1470AlbPrdPMt = P09YN7_n1470AlbPrdPMt[0] ;
                  A1472PrdMtr = P09YN7_A1472PrdMtr[0] ;
                  n1472PrdMtr = P09YN7_n1472PrdMtr[0] ;
                  A1469AlbPrdPKg = P09YN7_A1469AlbPrdPKg[0] ;
                  n1469AlbPrdPKg = P09YN7_n1469AlbPrdPKg[0] ;
                  A1471PrdKgm = P09YN7_A1471PrdKgm[0] ;
                  n1471PrdKgm = P09YN7_n1471PrdKgm[0] ;
                  A1468AlbPrdLin = P09YN7_A1468AlbPrdLin[0] ;
                  AV20TotalPend = AV20TotalPend.add(GXutil.roundDecimal( (A1471PrdKgm.multiply(A1469AlbPrdPKg)).add((A1472PrdMtr.multiply(A1470AlbPrdPMt))), 2)) ;
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               pr_default.readNext(3);
            }
            pr_default.close(3);
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      if ( ( GXutil.strcmp(AV18TipAlb, "2") == 0 ) || (GXutil.strcmp("", AV18TipAlb)==0) )
      {
         pr_default.dynParam(6, new Object[]{ new Object[]{
                                              Long.valueOf(AV9PALB) ,
                                              Long.valueOf(AV10UALB2) ,
                                              AV11PAlbFch ,
                                              AV12UFecha2 ,
                                              Integer.valueOf(A14AlbComCod) ,
                                              A17AlbComFch ,
                                              A10738AlbComSt ,
                                              Byte.valueOf(A16AlbComEst) ,
                                              A22AlbComPri ,
                                              AV13PRIO ,
                                              AV8Emprcod ,
                                              Integer.valueOf(AV17CliCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) } ,
                                              new int[]{
                                              TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         /* Using cursor P09YN9 */
         pr_default.execute(6, new Object[] {AV8Emprcod, Integer.valueOf(AV17CliCod), AV13PRIO, Long.valueOf(AV9PALB), Long.valueOf(AV10UALB2), AV11PAlbFch, AV12UFecha2});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A10738AlbComSt = P09YN9_A10738AlbComSt[0] ;
            A22AlbComPri = P09YN9_A22AlbComPri[0] ;
            A16AlbComEst = P09YN9_A16AlbComEst[0] ;
            A17AlbComFch = P09YN9_A17AlbComFch[0] ;
            A14AlbComCod = P09YN9_A14AlbComCod[0] ;
            A252CliCod = P09YN9_A252CliCod[0] ;
            A396EmprCod = P09YN9_A396EmprCod[0] ;
            A18AlbComImp = P09YN9_A18AlbComImp[0] ;
            n18AlbComImp = P09YN9_n18AlbComImp[0] ;
            A18AlbComImp = P09YN9_A18AlbComImp[0] ;
            n18AlbComImp = P09YN9_n18AlbComImp[0] ;
            AV20TotalPend = AV20TotalPend.add(A18AlbComImp) ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
      }
      AV26CliFac = AV17CliCod ;
      if ( GXutil.strcmp(AV19CliAlbAgr, httpContext.getMessage( "N", "")) == 0 )
      {
         if ( AV20TotalPend.doubleValue() > 0 )
         {
            GXv_char3[0] = AV8Emprcod ;
            GXv_int4[0] = AV17CliCod ;
            GXv_date5[0] = AV11PAlbFch ;
            GXv_date6[0] = AV12UFecha2 ;
            GXv_int7[0] = AV9PALB ;
            GXv_int8[0] = AV10UALB2 ;
            GXv_char9[0] = AV13PRIO ;
            GXv_date10[0] = AV23FacFch ;
            GXv_char11[0] = AV24FacSerNum ;
            GXv_int12[0] = AV26CliFac ;
            GXv_char13[0] = AV21TipProd ;
            GXv_char14[0] = AV18TipAlb ;
            GXv_dtime15[0] = AV25FacHor ;
            new app.facturacion.pfacaut1(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_date5, GXv_date6, GXv_int7, GXv_int8, GXv_char9, GXv_date10, GXv_char11, GXv_int12, GXv_char13, GXv_char14, GXv_dtime15) ;
            facturacionautomatica__prc.this.AV8Emprcod = GXv_char3[0] ;
            facturacionautomatica__prc.this.AV17CliCod = GXv_int4[0] ;
            facturacionautomatica__prc.this.AV11PAlbFch = GXv_date5[0] ;
            facturacionautomatica__prc.this.AV12UFecha2 = GXv_date6[0] ;
            facturacionautomatica__prc.this.AV9PALB = GXv_int7[0] ;
            facturacionautomatica__prc.this.AV10UALB2 = GXv_int8[0] ;
            facturacionautomatica__prc.this.AV13PRIO = GXv_char9[0] ;
            facturacionautomatica__prc.this.AV23FacFch = GXv_date10[0] ;
            facturacionautomatica__prc.this.AV24FacSerNum = GXv_char11[0] ;
            facturacionautomatica__prc.this.AV26CliFac = GXv_int12[0] ;
            facturacionautomatica__prc.this.AV21TipProd = GXv_char13[0] ;
            facturacionautomatica__prc.this.AV18TipAlb = GXv_char14[0] ;
            facturacionautomatica__prc.this.AV25FacHor = GXv_dtime15[0] ;
         }
      }
      else
      {
         if ( ( DecimalUtil.compareTo(AV20TotalPend, AV30MinFact) >= 0 ) && ( AV20TotalPend.doubleValue() > 0 ) )
         {
            GXv_char14[0] = AV8Emprcod ;
            GXv_int12[0] = AV17CliCod ;
            GXv_date10[0] = AV11PAlbFch ;
            GXv_date6[0] = AV12UFecha2 ;
            GXv_int8[0] = AV9PALB ;
            GXv_int7[0] = AV10UALB2 ;
            GXv_char13[0] = AV13PRIO ;
            GXv_date5[0] = AV23FacFch ;
            GXv_char11[0] = AV24FacSerNum ;
            GXv_int4[0] = AV26CliFac ;
            GXv_char9[0] = AV21TipProd ;
            GXv_char3[0] = AV18TipAlb ;
            GXv_dtime15[0] = AV25FacHor ;
            GXv_char16[0] = AV32Mensajes ;
            GXv_objcol_SdtMessages_Message17[0] = AV33Messages ;
            new app.facturacion.pfacautn(remoteHandle, context).execute( GXv_char14, GXv_int12, GXv_date10, GXv_date6, GXv_int8, GXv_int7, GXv_char13, GXv_date5, GXv_char11, GXv_int4, GXv_char9, GXv_char3, GXv_dtime15, GXv_char16, GXv_objcol_SdtMessages_Message17) ;
            facturacionautomatica__prc.this.AV8Emprcod = GXv_char14[0] ;
            facturacionautomatica__prc.this.AV17CliCod = GXv_int12[0] ;
            facturacionautomatica__prc.this.AV11PAlbFch = GXv_date10[0] ;
            facturacionautomatica__prc.this.AV12UFecha2 = GXv_date6[0] ;
            facturacionautomatica__prc.this.AV9PALB = GXv_int8[0] ;
            facturacionautomatica__prc.this.AV10UALB2 = GXv_int7[0] ;
            facturacionautomatica__prc.this.AV13PRIO = GXv_char13[0] ;
            facturacionautomatica__prc.this.AV23FacFch = GXv_date5[0] ;
            facturacionautomatica__prc.this.AV24FacSerNum = GXv_char11[0] ;
            facturacionautomatica__prc.this.AV26CliFac = GXv_int4[0] ;
            facturacionautomatica__prc.this.AV21TipProd = GXv_char9[0] ;
            facturacionautomatica__prc.this.AV18TipAlb = GXv_char3[0] ;
            facturacionautomatica__prc.this.AV25FacHor = GXv_dtime15[0] ;
            facturacionautomatica__prc.this.AV32Mensajes = GXv_char16[0] ;
            AV33Messages = GXv_objcol_SdtMessages_Message17[0] ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP14[0] = facturacionautomatica__prc.this.AV32Mensajes;
      this.aP15[0] = facturacionautomatica__prc.this.AV33Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32Mensajes = "" ;
      AV33Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_int2 = new byte[1] ;
      AV27ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      P09YN2_AV28CantidadRegistrosAProcesar = new short[1] ;
      A297CliPri = "" ;
      A10045CliAct = "" ;
      A396EmprCod = "" ;
      P09YN3_A10045CliAct = new String[] {""} ;
      P09YN3_A294CliPerFac = new byte[1] ;
      P09YN3_A297CliPri = new String[] {""} ;
      P09YN3_A252CliCod = new int[1] ;
      P09YN3_A396EmprCod = new String[] {""} ;
      P09YN3_A250CliAlbAgr = new String[] {""} ;
      P09YN3_A279CliNom = new String[] {""} ;
      A250CliAlbAgr = "" ;
      A279CliNom = "" ;
      AV20TotalPend = DecimalUtil.ZERO ;
      AV19CliAlbAgr = "" ;
      AV31Porcentaje = DecimalUtil.ZERO ;
      A34AlbProfch = GXutil.nullDate() ;
      A5140AlbMarca = "" ;
      A39AlbProPri = "" ;
      P09YN4_A30AlbProCod = new long[1] ;
      P09YN4_A396EmprCod = new String[] {""} ;
      P09YN4_A3915EmpNumDec = new byte[1] ;
      P09YN4_n3915EmpNumDec = new boolean[] {false} ;
      P09YN4_A5140AlbMarca = new String[] {""} ;
      P09YN4_A39AlbProPri = new String[] {""} ;
      P09YN4_A33AlbProEst = new byte[1] ;
      P09YN4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P09YN4_A1243GuiRemCli = new int[1] ;
      P09YN5_A1206TubCod = new short[1] ;
      P09YN5_n1206TubCod = new boolean[] {false} ;
      P09YN5_A396EmprCod = new String[] {""} ;
      P09YN5_A30AlbProCod = new long[1] ;
      P09YN5_A130BarCodPar = new String[] {""} ;
      P09YN5_A132BarCodReo = new byte[1] ;
      P09YN5_A129BarCod = new int[1] ;
      P09YN5_A12195BarAlbUnd = new int[1] ;
      P09YN5_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN5_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN5_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN5_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN5_A1208TubPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN5_n1208TubPre = new boolean[] {false} ;
      P09YN5_A1266BarAlbTub = new int[1] ;
      A130BarCodPar = "" ;
      A12196BarPreUnd = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A1208TubPre = DecimalUtil.ZERO ;
      A1281TubImp = DecimalUtil.ZERO ;
      P09YN6_A396EmprCod = new String[] {""} ;
      P09YN6_A30AlbProCod = new long[1] ;
      P09YN6_A129BarCod = new int[1] ;
      P09YN6_A132BarCodReo = new byte[1] ;
      P09YN6_A130BarCodPar = new String[] {""} ;
      P09YN6_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN6_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN6_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN6_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN6_A1240GuiFasLin = new short[1] ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      P09YN7_A396EmprCod = new String[] {""} ;
      P09YN7_A30AlbProCod = new long[1] ;
      P09YN7_A129BarCod = new int[1] ;
      P09YN7_A132BarCodReo = new byte[1] ;
      P09YN7_A130BarCodPar = new String[] {""} ;
      P09YN7_A1470AlbPrdPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN7_n1470AlbPrdPMt = new boolean[] {false} ;
      P09YN7_A1472PrdMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN7_n1472PrdMtr = new boolean[] {false} ;
      P09YN7_A1469AlbPrdPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN7_n1469AlbPrdPKg = new boolean[] {false} ;
      P09YN7_A1471PrdKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN7_n1471PrdKgm = new boolean[] {false} ;
      P09YN7_A1468AlbPrdLin = new short[1] ;
      A1470AlbPrdPMt = DecimalUtil.ZERO ;
      A1472PrdMtr = DecimalUtil.ZERO ;
      A1469AlbPrdPKg = DecimalUtil.ZERO ;
      A1471PrdKgm = DecimalUtil.ZERO ;
      A17AlbComFch = GXutil.nullDate() ;
      A10738AlbComSt = "" ;
      A22AlbComPri = "" ;
      P09YN9_A10738AlbComSt = new String[] {""} ;
      P09YN9_A22AlbComPri = new String[] {""} ;
      P09YN9_A16AlbComEst = new byte[1] ;
      P09YN9_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09YN9_A14AlbComCod = new int[1] ;
      P09YN9_A252CliCod = new int[1] ;
      P09YN9_A396EmprCod = new String[] {""} ;
      P09YN9_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YN9_n18AlbComImp = new boolean[] {false} ;
      A18AlbComImp = DecimalUtil.ZERO ;
      AV30MinFact = DecimalUtil.ZERO ;
      GXv_char14 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_int8 = new long[1] ;
      GXv_int7 = new long[1] ;
      GXv_char13 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_char11 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char9 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_dtime15 = new java.util.Date[1] ;
      GXv_char16 = new String[1] ;
      GXv_objcol_SdtMessages_Message17 = new GXBaseCollection[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.facturacionautomatica__prc__default(),
         new Object[] {
             new Object[] {
            P09YN2_AV28CantidadRegistrosAProcesar
            }
            , new Object[] {
            P09YN3_A10045CliAct, P09YN3_A294CliPerFac, P09YN3_A297CliPri, P09YN3_A252CliCod, P09YN3_A396EmprCod, P09YN3_A250CliAlbAgr, P09YN3_A279CliNom
            }
            , new Object[] {
            P09YN4_A30AlbProCod, P09YN4_A396EmprCod, P09YN4_A3915EmpNumDec, P09YN4_n3915EmpNumDec, P09YN4_A5140AlbMarca, P09YN4_A39AlbProPri, P09YN4_A33AlbProEst, P09YN4_A34AlbProfch, P09YN4_A1243GuiRemCli
            }
            , new Object[] {
            P09YN5_A1206TubCod, P09YN5_n1206TubCod, P09YN5_A396EmprCod, P09YN5_A30AlbProCod, P09YN5_A130BarCodPar, P09YN5_A132BarCodReo, P09YN5_A129BarCod, P09YN5_A12195BarAlbUnd, P09YN5_A12196BarPreUnd, P09YN5_A1263BarAlbMtrE,
            P09YN5_A1264BarPreMtr, P09YN5_A1261BarAlbKgmE, P09YN5_A1262BarPreKgm, P09YN5_A5354AlbImpMan, P09YN5_A1208TubPre, P09YN5_n1208TubPre, P09YN5_A1266BarAlbTub
            }
            , new Object[] {
            P09YN6_A396EmprCod, P09YN6_A30AlbProCod, P09YN6_A129BarCod, P09YN6_A132BarCodReo, P09YN6_A130BarCodPar, P09YN6_A1242GuiFasPMt, P09YN6_A1276FasMtr, P09YN6_A1241GuiFasPKg, P09YN6_A1275FasKgm, P09YN6_A1240GuiFasLin
            }
            , new Object[] {
            P09YN7_A396EmprCod, P09YN7_A30AlbProCod, P09YN7_A129BarCod, P09YN7_A132BarCodReo, P09YN7_A130BarCodPar, P09YN7_A1470AlbPrdPMt, P09YN7_n1470AlbPrdPMt, P09YN7_A1472PrdMtr, P09YN7_n1472PrdMtr, P09YN7_A1469AlbPrdPKg,
            P09YN7_n1469AlbPrdPKg, P09YN7_A1471PrdKgm, P09YN7_n1471PrdKgm, P09YN7_A1468AlbPrdLin
            }
            , new Object[] {
            P09YN9_A10738AlbComSt, P09YN9_A22AlbComPri, P09YN9_A16AlbComEst, P09YN9_A17AlbComFch, P09YN9_A14AlbComCod, P09YN9_A252CliCod, P09YN9_A396EmprCod, P09YN9_A18AlbComImp, P09YN9_n18AlbComImp
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16PerFac ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A294CliPerFac ;
   private byte A33AlbProEst ;
   private byte A3915EmpNumDec ;
   private byte A132BarCodReo ;
   private byte A16AlbComEst ;
   private short AV22FlagCLIDES ;
   private short AV28CantidadRegistrosAProcesar ;
   private short cV28CantidadRegistrosAProcesar ;
   private short AV29CantidadRegistrosProcesados ;
   private short A1206TubCod ;
   private short A1240GuiFasLin ;
   private short A1468AlbPrdLin ;
   private short Gx_err ;
   private int AV14PCLI ;
   private int AV15UCLI2 ;
   private int A252CliCod ;
   private int AV17CliCod ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private int A12195BarAlbUnd ;
   private int A1266BarAlbTub ;
   private int A14AlbComCod ;
   private int AV26CliFac ;
   private int GXv_int12[] ;
   private int GXv_int4[] ;
   private long AV9PALB ;
   private long AV10UALB2 ;
   private long A30AlbProCod ;
   private long GXv_int8[] ;
   private long GXv_int7[] ;
   private java.math.BigDecimal AV20TotalPend ;
   private java.math.BigDecimal AV31Porcentaje ;
   private java.math.BigDecimal A12196BarPreUnd ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A1208TubPre ;
   private java.math.BigDecimal A1281TubImp ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1470AlbPrdPMt ;
   private java.math.BigDecimal A1472PrdMtr ;
   private java.math.BigDecimal A1469AlbPrdPKg ;
   private java.math.BigDecimal A1471PrdKgm ;
   private java.math.BigDecimal A18AlbComImp ;
   private java.math.BigDecimal AV30MinFact ;
   private String AV8Emprcod ;
   private String AV18TipAlb ;
   private String AV13PRIO ;
   private String AV21TipProd ;
   private String AV24FacSerNum ;
   private String scmdbuf ;
   private String A297CliPri ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private String A250CliAlbAgr ;
   private String A279CliNom ;
   private String AV19CliAlbAgr ;
   private String A5140AlbMarca ;
   private String A39AlbProPri ;
   private String A130BarCodPar ;
   private String A10738AlbComSt ;
   private String A22AlbComPri ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String GXv_char9[] ;
   private String GXv_char3[] ;
   private String GXv_char16[] ;
   private java.util.Date AV25FacHor ;
   private java.util.Date GXv_dtime15[] ;
   private java.util.Date AV11PAlbFch ;
   private java.util.Date AV12UFecha2 ;
   private java.util.Date AV23FacFch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date GXv_date6[] ;
   private java.util.Date GXv_date5[] ;
   private boolean returnInSub ;
   private boolean n3915EmpNumDec ;
   private boolean n1206TubCod ;
   private boolean n1208TubPre ;
   private boolean n1470AlbPrdPMt ;
   private boolean n1472PrdMtr ;
   private boolean n1469AlbPrdPKg ;
   private boolean n1471PrdKgm ;
   private boolean n18AlbComImp ;
   private String AV32Mensajes ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV27ProgressIndicator ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP15 ;
   private String[] aP14 ;
   private IDataStoreProvider pr_default ;
   private short[] P09YN2_AV28CantidadRegistrosAProcesar ;
   private String[] P09YN3_A10045CliAct ;
   private byte[] P09YN3_A294CliPerFac ;
   private String[] P09YN3_A297CliPri ;
   private int[] P09YN3_A252CliCod ;
   private String[] P09YN3_A396EmprCod ;
   private String[] P09YN3_A250CliAlbAgr ;
   private String[] P09YN3_A279CliNom ;
   private long[] P09YN4_A30AlbProCod ;
   private String[] P09YN4_A396EmprCod ;
   private byte[] P09YN4_A3915EmpNumDec ;
   private boolean[] P09YN4_n3915EmpNumDec ;
   private String[] P09YN4_A5140AlbMarca ;
   private String[] P09YN4_A39AlbProPri ;
   private byte[] P09YN4_A33AlbProEst ;
   private java.util.Date[] P09YN4_A34AlbProfch ;
   private int[] P09YN4_A1243GuiRemCli ;
   private short[] P09YN5_A1206TubCod ;
   private boolean[] P09YN5_n1206TubCod ;
   private String[] P09YN5_A396EmprCod ;
   private long[] P09YN5_A30AlbProCod ;
   private String[] P09YN5_A130BarCodPar ;
   private byte[] P09YN5_A132BarCodReo ;
   private int[] P09YN5_A129BarCod ;
   private int[] P09YN5_A12195BarAlbUnd ;
   private java.math.BigDecimal[] P09YN5_A12196BarPreUnd ;
   private java.math.BigDecimal[] P09YN5_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P09YN5_A1264BarPreMtr ;
   private java.math.BigDecimal[] P09YN5_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P09YN5_A1262BarPreKgm ;
   private java.math.BigDecimal[] P09YN5_A5354AlbImpMan ;
   private java.math.BigDecimal[] P09YN5_A1208TubPre ;
   private boolean[] P09YN5_n1208TubPre ;
   private int[] P09YN5_A1266BarAlbTub ;
   private String[] P09YN6_A396EmprCod ;
   private long[] P09YN6_A30AlbProCod ;
   private int[] P09YN6_A129BarCod ;
   private byte[] P09YN6_A132BarCodReo ;
   private String[] P09YN6_A130BarCodPar ;
   private java.math.BigDecimal[] P09YN6_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P09YN6_A1276FasMtr ;
   private java.math.BigDecimal[] P09YN6_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P09YN6_A1275FasKgm ;
   private short[] P09YN6_A1240GuiFasLin ;
   private String[] P09YN7_A396EmprCod ;
   private long[] P09YN7_A30AlbProCod ;
   private int[] P09YN7_A129BarCod ;
   private byte[] P09YN7_A132BarCodReo ;
   private String[] P09YN7_A130BarCodPar ;
   private java.math.BigDecimal[] P09YN7_A1470AlbPrdPMt ;
   private boolean[] P09YN7_n1470AlbPrdPMt ;
   private java.math.BigDecimal[] P09YN7_A1472PrdMtr ;
   private boolean[] P09YN7_n1472PrdMtr ;
   private java.math.BigDecimal[] P09YN7_A1469AlbPrdPKg ;
   private boolean[] P09YN7_n1469AlbPrdPKg ;
   private java.math.BigDecimal[] P09YN7_A1471PrdKgm ;
   private boolean[] P09YN7_n1471PrdKgm ;
   private short[] P09YN7_A1468AlbPrdLin ;
   private String[] P09YN9_A10738AlbComSt ;
   private String[] P09YN9_A22AlbComPri ;
   private byte[] P09YN9_A16AlbComEst ;
   private java.util.Date[] P09YN9_A17AlbComFch ;
   private int[] P09YN9_A14AlbComCod ;
   private int[] P09YN9_A252CliCod ;
   private String[] P09YN9_A396EmprCod ;
   private java.math.BigDecimal[] P09YN9_A18AlbComImp ;
   private boolean[] P09YN9_n18AlbComImp ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV33Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message17[] ;
}

final  class facturacionautomatica__prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09YN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV14PCLI ,
                                          int AV15UCLI2 ,
                                          int A252CliCod ,
                                          String AV8Emprcod ,
                                          byte AV16PerFac ,
                                          String AV13PRIO )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[5];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCLIFPG T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.CliPerFac <= ?)");
      addWhere(sWhereString, "(T1.CliPri = ?)");
      addWhere(sWhereString, "(T2.CliAct = 'S')");
      if ( ! (0==AV14PCLI) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( ! (0==AV15UCLI2) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_P09YN3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV14PCLI ,
                                          int AV15UCLI2 ,
                                          int A252CliCod ,
                                          byte A294CliPerFac ,
                                          byte AV16PerFac ,
                                          String A297CliPri ,
                                          String AV13PRIO ,
                                          String A10045CliAct ,
                                          String AV8Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[5];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T2.CliAct, T2.CliPerFac, T1.CliPri, T1.CliCod, T1.EmprCod, T2.CliAlbAgr, T2.CliNom FROM (TXPCLIFPG T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.CliPerFac <= ?)");
      addWhere(sWhereString, "(T1.CliPri = ?)");
      addWhere(sWhereString, "(T2.CliAct = 'S')");
      if ( ! (0==AV14PCLI) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( ! (0==AV15UCLI2) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.CliPri" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P09YN4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV9PALB ,
                                          long AV10UALB2 ,
                                          java.util.Date AV11PAlbFch ,
                                          java.util.Date AV12UFecha2 ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          String A5140AlbMarca ,
                                          byte A33AlbProEst ,
                                          String A39AlbProPri ,
                                          String AV13PRIO ,
                                          String AV8Emprcod ,
                                          int AV17CliCod ,
                                          String A396EmprCod ,
                                          int A1243GuiRemCli )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[7];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T1.EmprCod, T2.EmpNumDec, T1.AlbMarca, T1.AlbProPri, T1.AlbProEst, T1.AlbProfch, T1.GuiRemCli FROM (TXPCALPRD T1 INNER JOIN TXPEMPRES T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.GuiRemCli = ?)");
      addWhere(sWhereString, "(T1.AlbMarca <> 'A')");
      addWhere(sWhereString, "(T1.AlbProEst = 1)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV9PALB) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( ! (0==AV10UALB2) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV11PAlbFch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12UFecha2)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.GuiRemCli, T1.AlbProCod" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_P09YN9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV9PALB ,
                                          long AV10UALB2 ,
                                          java.util.Date AV11PAlbFch ,
                                          java.util.Date AV12UFecha2 ,
                                          int A14AlbComCod ,
                                          java.util.Date A17AlbComFch ,
                                          String A10738AlbComSt ,
                                          byte A16AlbComEst ,
                                          String A22AlbComPri ,
                                          String AV13PRIO ,
                                          String AV8Emprcod ,
                                          int AV17CliCod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[7];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T1.AlbComSt, T1.AlbComPri, T1.AlbComEst, T1.AlbComFch, T1.AlbComCod, T1.CliCod, T1.EmprCod, COALESCE( T2.AlbComImp, 0) AS AlbComImp FROM (TXPCALCOM T1 LEFT" ;
      scmdbuf += " JOIN (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.AlbComCod = T1.AlbComCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.AlbComSt <> 'A')");
      addWhere(sWhereString, "(T1.AlbComEst = 1)");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! (0==AV9PALB) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int24[3] = (byte)(1) ;
      }
      if ( ! (0==AV10UALB2) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int24[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV11PAlbFch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int24[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12UFecha2)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int24[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod" ;
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
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
                  return conditional_P09YN2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] );
            case 1 :
                  return conditional_P09YN3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 2 :
                  return conditional_P09YN4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() );
            case 6 :
                  return conditional_P09YN9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09YN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YN3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YN4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YN5", "SELECT T1.TubCod, T1.EmprCod, T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarAlbUnd, T1.BarPreUnd, T1.BarAlbMtrE, T1.BarPreMtr, T1.BarAlbKgmE, T1.BarPreKgm, T1.AlbImpMan, T2.TubPre, T1.BarAlbTub FROM (TXPALBBAR T1 LEFT JOIN TXPTUBOS T2 ON T2.EmprCod = T1.EmprCod AND T2.TubCod = T1.TubCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YN6", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasPMt, FasMtr, GuiFasPKg, FasKgm, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YN7", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdPMt, PrdMtr, AlbPrdPKg, PrdKgm, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YN9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(15);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[6]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[6]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               return;
            case 2 :
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
                  stmt.setString(sIdx, (String)parms[9], 1);
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
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
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
                  stmt.setString(sIdx, (String)parms[9], 1);
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
      }
   }

}

