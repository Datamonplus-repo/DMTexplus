package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rfa0001e extends GXProcedure
{
   public rfa0001e( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rfa0001e.class ), "" );
   }

   public rfa0001e( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             byte aP6 ,
                             byte aP7 ,
                             byte aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String aP11 ,
                             String aP12 ,
                             String[] aP13 )
   {
      rfa0001e.this.aP14 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        byte aP6 ,
                        byte aP7 ,
                        byte aP8 ,
                        String aP9 ,
                        String aP10 ,
                        String aP11 ,
                        String aP12 ,
                        String[] aP13 ,
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             byte aP6 ,
                             byte aP7 ,
                             byte aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String aP11 ,
                             String aP12 ,
                             String[] aP13 ,
                             String[] aP14 )
   {
      rfa0001e.this.A396EmprCod = aP0;
      rfa0001e.this.AV8PCliCod = aP1;
      rfa0001e.this.AV9UCliCod = aP2;
      rfa0001e.this.AV10PFecha = aP3;
      rfa0001e.this.AV11UFecha = aP4;
      rfa0001e.this.AV25Prior = aP5;
      rfa0001e.this.AV28Tipo_alb = aP6;
      rfa0001e.this.AV73Sin_p_f = aP7;
      rfa0001e.this.AV72Sin_p_t = aP8;
      rfa0001e.this.AV77Op_p_f = aP9;
      rfa0001e.this.AV76Op_p_t = aP10;
      rfa0001e.this.AV91BarMaqEst1 = aP11;
      rfa0001e.this.AV92BarMaqEst2 = aP12;
      rfa0001e.this.aP13 = aP13;
      rfa0001e.this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV100ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV100ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV100ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV100ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV100ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV100ProgressIndicator.show();
      AV103CantidadRegistrosAProcesar = (short)(0) ;
      /* Optimized group. */
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV8PCliCod) ,
                                           Integer.valueOf(AV9UCliCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      /* Using cursor P076V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8PCliCod), Integer.valueOf(AV9UCliCod)});
      cV103CantidadRegistrosAProcesar = P076V2_AV103CantidadRegistrosAProcesar[0] ;
      pr_default.close(0);
      AV103CantidadRegistrosAProcesar = (short)(AV103CantidadRegistrosAProcesar+cV103CantidadRegistrosAProcesar*1) ;
      /* End optimized group. */
      if ( AV103CantidadRegistrosAProcesar == 0 )
      {
         AV103CantidadRegistrosAProcesar = (short)(1) ;
      }
      if ( GXutil.strcmp(AV25Prior, "0") == 0 )
      {
         AV26PPrior = "0" ;
         AV27UPrior = "0" ;
      }
      if ( GXutil.strcmp(AV25Prior, "1") == 0 )
      {
         AV26PPrior = "1" ;
         AV27UPrior = "1" ;
      }
      if ( GXutil.strcmp(AV25Prior, "2") == 0 )
      {
         AV26PPrior = "0" ;
         AV27UPrior = "1" ;
      }
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S151 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV98CellRow = 3 ;
      AV24TotInf = DecimalUtil.doubleToDec(0) ;
      AV63Tot_Kgs_g = DecimalUtil.doubleToDec(0) ;
      AV64Tot_Mts_g = DecimalUtil.doubleToDec(0) ;
      AV101CantidadRegistrosProcesados = (short)(0) ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV8PCliCod) ,
                                           Integer.valueOf(AV9UCliCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A10045CliAct ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P076V3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8PCliCod), Integer.valueOf(AV9UCliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10045CliAct = P076V3_A10045CliAct[0] ;
         A252CliCod = P076V3_A252CliCod[0] ;
         A279CliNom = P076V3_A279CliNom[0] ;
         AV17CliCod = A252CliCod ;
         AV18FlagCliCod = (byte)(0) ;
         AV21TotCli = DecimalUtil.doubleToDec(0) ;
         AV61Tot_kgs_cl = DecimalUtil.doubleToDec(0) ;
         AV62Tot_mts_cl = DecimalUtil.doubleToDec(0) ;
         AV32FlagHdr = 0 ;
         AV84Texto_c = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + " " + GXutil.trim( A279CliNom) ;
         pr_default.dynParam(2, new Object[]{ new Object[]{
                                              AV26PPrior ,
                                              AV27UPrior ,
                                              AV10PFecha ,
                                              AV11UFecha ,
                                              A39AlbProPri ,
                                              A34AlbProfch ,
                                              A1253EmprGuiRem ,
                                              A396EmprCod ,
                                              A5140AlbMarca ,
                                              Integer.valueOf(A1243GuiRemCli) ,
                                              Integer.valueOf(AV17CliCod) ,
                                              Byte.valueOf(A33AlbProEst) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.BYTE
                                              }
         });
         /* Using cursor P076V4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV17CliCod), AV26PPrior, AV27UPrior, AV10PFecha, AV11UFecha});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1253EmprGuiRem = P076V4_A1253EmprGuiRem[0] ;
            A3869AlbCliDes = P076V4_A3869AlbCliDes[0] ;
            A30AlbProCod = P076V4_A30AlbProCod[0] ;
            A5140AlbMarca = P076V4_A5140AlbMarca[0] ;
            A34AlbProfch = P076V4_A34AlbProfch[0] ;
            A33AlbProEst = P076V4_A33AlbProEst[0] ;
            A39AlbProPri = P076V4_A39AlbProPri[0] ;
            A1243GuiRemCli = P076V4_A1243GuiRemCli[0] ;
            /* Using cursor P076V5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A2839AlbProVal = P076V5_A2839AlbProVal[0] ;
               A1264BarPreMtr = P076V5_A1264BarPreMtr[0] ;
               A1263BarAlbMtrE = P076V5_A1263BarAlbMtrE[0] ;
               A1262BarPreKgm = P076V5_A1262BarPreKgm[0] ;
               A1261BarAlbKgmE = P076V5_A1261BarAlbKgmE[0] ;
               A5354AlbImpMan = P076V5_A5354AlbImpMan[0] ;
               A135BarColNom = P076V5_A135BarColNom[0] ;
               A136BarColNum = P076V5_A136BarColNum[0] ;
               A32AlbProEsp = P076V5_A32AlbProEsp[0] ;
               A217BarTipArt = P076V5_A217BarTipArt[0] ;
               n217BarTipArt = P076V5_n217BarTipArt[0] ;
               A212BarSer = P076V5_A212BarSer[0] ;
               A1652BarSerDsc = P076V5_A1652BarSerDsc[0] ;
               A218BarTipCol = P076V5_A218BarTipCol[0] ;
               A118BarAcaQui = P076V5_A118BarAcaQui[0] ;
               A40AlbProRec = P076V5_A40AlbProRec[0] ;
               A130BarCodPar = P076V5_A130BarCodPar[0] ;
               A132BarCodReo = P076V5_A132BarCodReo[0] ;
               A129BarCod = P076V5_A129BarCod[0] ;
               A135BarColNom = P076V5_A135BarColNom[0] ;
               A136BarColNum = P076V5_A136BarColNum[0] ;
               A217BarTipArt = P076V5_A217BarTipArt[0] ;
               n217BarTipArt = P076V5_n217BarTipArt[0] ;
               A212BarSer = P076V5_A212BarSer[0] ;
               A1652BarSerDsc = P076V5_A1652BarSerDsc[0] ;
               A218BarTipCol = P076V5_A218BarTipCol[0] ;
               A118BarAcaQui = P076V5_A118BarAcaQui[0] ;
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV19ImpLinea = GXutil.roundDecimal( A1261BarAlbKgmE.multiply(A1262BarPreKgm), 2).add(GXutil.roundDecimal( A1263BarAlbMtrE.multiply(A1264BarPreMtr), 2)) ;
               if ( A5354AlbImpMan.doubleValue() > 0 )
               {
                  AV19ImpLinea = A5354AlbImpMan ;
               }
               AV23Marca = " " ;
               if ( AV19ImpLinea.doubleValue() == 0 )
               {
                  AV23Marca = "<-" ;
               }
               AV30BarColNom = A135BarColNom ;
               AV31BarColNum = A136BarColNum ;
               AV33AlbProEspC = " " ;
               if ( A32AlbProEsp < 10 )
               {
                  if ( AV34FlagIdioma == 0 )
                  {
                     AV33AlbProEspC = httpContext.getMessage( "SIN CONFIRMAR", "") ;
                  }
                  else
                  {
                     AV33AlbProEspC = httpContext.getMessage( "SEM CONFIRMAR", "") ;
                  }
               }
               AV53PrecioK = A1262BarPreKgm ;
               AV54PrecioM = A1264BarPreMtr ;
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = A217BarTipArt ;
               GXv_char3[0] = AV55TipArtDsc ;
               new app.pbustad(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
               rfa0001e.this.A396EmprCod = GXv_char1[0] ;
               rfa0001e.this.A217BarTipArt = GXv_int2[0] ;
               rfa0001e.this.AV55TipArtDsc = GXv_char3[0] ;
               if ( ( ( AV19ImpLinea.doubleValue() == 0 ) && ( AV72Sin_p_t == 2 ) ) || ( AV72Sin_p_t == 1 ) )
               {
                  AV97ExcelDocument.Cells(AV98CellRow, 1, 1, 1).setText( AV84Texto_c );
                  AV97ExcelDocument.Cells(AV98CellRow, 2, 1, 1).setNumber( A30AlbProCod );
                  AV97ExcelDocument.Cells(AV98CellRow, 3, 1, 1).setText( A13696BarNHdr );
                  AV97ExcelDocument.Cells(AV98CellRow, 4, 1, 1).setText( A212BarSer );
                  AV97ExcelDocument.Cells(AV98CellRow, 5, 1, 1).setText( A1652BarSerDsc );
                  AV97ExcelDocument.Cells(AV98CellRow, 6, 1, 1).setText( AV55TipArtDsc );
                  AV97ExcelDocument.Cells(AV98CellRow, 7, 1, 1).setText( A135BarColNom );
                  AV97ExcelDocument.Cells(AV98CellRow, 8, 1, 1).setNumber( A136BarColNum );
                  AV97ExcelDocument.Cells(AV98CellRow, 9, 1, 1).setNumber( A218BarTipCol );
                  AV97ExcelDocument.Cells(AV98CellRow, 10, 1, 1).setText( A118BarAcaQui );
                  AV97ExcelDocument.Cells(AV98CellRow, 11, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A40AlbProRec)) );
                  AV97ExcelDocument.Cells(AV98CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1261BarAlbKgmE)) );
                  AV97ExcelDocument.Cells(AV98CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53PrecioK)) );
                  AV97ExcelDocument.Cells(AV98CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1263BarAlbMtrE)) );
                  AV97ExcelDocument.Cells(AV98CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54PrecioM)) );
                  AV97ExcelDocument.Cells(AV98CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV19ImpLinea)) );
                  AV97ExcelDocument.Cells(AV98CellRow, 17, 1, 1).setText( AV23Marca );
                  AV97ExcelDocument.Cells(AV98CellRow, 18, 1, 1).setText( AV33AlbProEspC );
                  AV97ExcelDocument.Cells(AV98CellRow, 19, 1, 1).setNumber( A32AlbProEsp );
                  AV97ExcelDocument.Cells(AV98CellRow, 20, 1, 1).setNumber( A3869AlbCliDes );
                  AV98CellRow = (int)(AV98CellRow+1) ;
                  AV61Tot_kgs_cl = AV61Tot_kgs_cl.add(A1261BarAlbKgmE) ;
                  AV62Tot_mts_cl = AV62Tot_mts_cl.add(A1263BarAlbMtrE) ;
                  AV21TotCli = AV21TotCli.add(AV19ImpLinea) ;
                  AV32FlagHdr = (int)(AV32FlagHdr+1) ;
               }
               AV20FlagAlbFas = (byte)(0) ;
               /* Using cursor P076V6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A457FasCod = P076V6_A457FasCod[0] ;
                  A1241GuiFasPKg = P076V6_A1241GuiFasPKg[0] ;
                  A1242GuiFasPMt = P076V6_A1242GuiFasPMt[0] ;
                  A1276FasMtr = P076V6_A1276FasMtr[0] ;
                  A1275FasKgm = P076V6_A1275FasKgm[0] ;
                  A460FasDsc = P076V6_A460FasDsc[0] ;
                  A1240GuiFasLin = P076V6_A1240GuiFasLin[0] ;
                  A460FasDsc = P076V6_A460FasDsc[0] ;
                  AV53PrecioK = A1241GuiFasPKg ;
                  AV54PrecioM = A1242GuiFasPMt ;
                  AV19ImpLinea = GXutil.roundDecimal( A1275FasKgm.multiply(A1241GuiFasPKg), 2).add(GXutil.roundDecimal( A1276FasMtr.multiply(A1242GuiFasPMt), 2)) ;
                  AV23Marca = " " ;
                  if ( AV19ImpLinea.doubleValue() == 0 )
                  {
                     AV23Marca = "<-" ;
                  }
                  if ( ( ( AV19ImpLinea.doubleValue() == 0 ) && ( AV73Sin_p_f == 2 ) ) || ( AV73Sin_p_f == 1 ) )
                  {
                     AV97ExcelDocument.Cells(AV98CellRow, 5, 1, 1).setText( A460FasDsc );
                     AV97ExcelDocument.Cells(AV98CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1275FasKgm)) );
                     AV97ExcelDocument.Cells(AV98CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV53PrecioK)) );
                     AV97ExcelDocument.Cells(AV98CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1276FasMtr)) );
                     AV97ExcelDocument.Cells(AV98CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV54PrecioM)) );
                     AV97ExcelDocument.Cells(AV98CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV19ImpLinea)) );
                     AV97ExcelDocument.Cells(AV98CellRow, 17, 1, 1).setText( AV23Marca );
                     AV98CellRow = (int)(AV98CellRow+1) ;
                     AV21TotCli = AV21TotCli.add(AV19ImpLinea) ;
                     AV32FlagHdr = (int)(AV32FlagHdr+1) ;
                     AV20FlagAlbFas = (byte)(1) ;
                  }
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               if ( AV20FlagAlbFas == 1 )
               {
                  AV98CellRow = (int)(AV98CellRow+1) ;
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV24TotInf = AV24TotInf.add(AV21TotCli) ;
         AV65Pre_kg = DecimalUtil.doubleToDec(0) ;
         if ( AV61Tot_kgs_cl.doubleValue() > 0 )
         {
            AV65Pre_kg = AV21TotCli.divide(AV61Tot_kgs_cl, 18, java.math.RoundingMode.DOWN) ;
         }
         AV66Pre_mt = DecimalUtil.doubleToDec(0) ;
         if ( AV62Tot_mts_cl.doubleValue() > 0 )
         {
            AV66Pre_mt = AV21TotCli.divide(AV62Tot_mts_cl, 18, java.math.RoundingMode.DOWN) ;
         }
         if ( AV32FlagHdr > 0 )
         {
            AV98CellRow = (int)(AV98CellRow+1) ;
            AV97ExcelDocument.Cells(AV98CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV61Tot_kgs_cl)) );
            AV97ExcelDocument.Cells(AV98CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65Pre_kg)) );
            AV97ExcelDocument.Cells(AV98CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV62Tot_mts_cl)) );
            AV97ExcelDocument.Cells(AV98CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66Pre_mt)) );
            AV97ExcelDocument.Cells(AV98CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV21TotCli)) );
            AV98CellRow = (int)(AV98CellRow+1) ;
         }
         AV63Tot_Kgs_g = AV63Tot_Kgs_g.add(AV61Tot_kgs_cl) ;
         AV64Tot_Mts_g = AV64Tot_Mts_g.add(AV62Tot_mts_cl) ;
         AV101CantidadRegistrosProcesados = (short)(AV101CantidadRegistrosProcesados+1) ;
         AV102Porcentaje = (short)((AV101CantidadRegistrosProcesados/ (double) (AV103CantidadRegistrosAProcesar))*100) ;
         AV100ProgressIndicator.setgxTv_SdtProgress_Value( AV102Porcentaje );
         AV100ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando.. Registro %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV101CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV103CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( GXutil.str( A252CliCod, 6, 0)), GXutil.trim( A279CliNom), "", "", "", "", ""));
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV100ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado.", ""));
      AV100ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV100ProgressIndicator.hide();
      AV65Pre_kg = DecimalUtil.doubleToDec(0) ;
      if ( AV63Tot_Kgs_g.doubleValue() > 0 )
      {
         AV65Pre_kg = AV24TotInf.divide(AV63Tot_Kgs_g, 18, java.math.RoundingMode.DOWN) ;
      }
      AV66Pre_mt = DecimalUtil.doubleToDec(0) ;
      if ( AV64Tot_Mts_g.doubleValue() > 0 )
      {
         AV66Pre_mt = AV24TotInf.divide(AV64Tot_Mts_g, 18, java.math.RoundingMode.DOWN) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TotInf)==0) )
      {
         AV98CellRow = (int)(AV98CellRow+1) ;
         AV97ExcelDocument.Cells(AV98CellRow, 12, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV63Tot_Kgs_g)) );
         AV97ExcelDocument.Cells(AV98CellRow, 13, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV65Pre_kg)) );
         AV97ExcelDocument.Cells(AV98CellRow, 14, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV64Tot_Mts_g)) );
         AV97ExcelDocument.Cells(AV98CellRow, 15, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV66Pre_mt)) );
         AV97ExcelDocument.Cells(AV98CellRow, 16, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24TotInf)) );
         AV98CellRow = (int)(AV98CellRow+1) ;
      }
   }

   public void S121( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV97ExcelDocument.Cells(1, 1, 1, 1).setText( AV26PPrior );
      AV97ExcelDocument.Cells(1, 2, 1, 1).setText( AV26PPrior );
      AV97ExcelDocument.Cells(1, 3, 1, 1).setText( AV76Op_p_t );
      AV97ExcelDocument.Cells(1, 4, 1, 1).setText( AV77Op_p_f );
      AV98CellRow = 2 ;
      AV99CellCol = 1 ;
      while ( AV99CellCol <= 50 )
      {
         AV97ExcelDocument.Cells(AV98CellRow, AV99CellCol, 1, 1).setBold( (short)(1) );
         AV97ExcelDocument.Cells(AV98CellRow, AV99CellCol, 1, 1).setColor( 11 );
         AV99CellCol = (int)(AV99CellCol+1) ;
      }
      AV97ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV97ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Nº Documento", "") );
      AV97ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Nº Hdr", "") );
      AV97ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV97ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV97ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "Composicion", "") );
      AV97ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV97ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "Numero", "") );
      AV97ExcelDocument.Cells(2, 9, 1, 1).setText( httpContext.getMessage( "TC", "") );
      AV97ExcelDocument.Cells(2, 10, 1, 1).setText( httpContext.getMessage( "Acabado", "") );
      AV97ExcelDocument.Cells(2, 11, 1, 1).setText( "%" );
      AV97ExcelDocument.Cells(2, 12, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV97ExcelDocument.Cells(2, 13, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV97ExcelDocument.Cells(2, 14, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV97ExcelDocument.Cells(2, 15, 1, 1).setText( httpContext.getMessage( "Precio", "") );
      AV97ExcelDocument.Cells(2, 16, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV97ExcelDocument.Cells(2, 17, 1, 1).setText( "" );
      AV97ExcelDocument.Cells(2, 18, 1, 1).setText( "" );
      AV97ExcelDocument.Cells(2, 19, 1, 1).setText( httpContext.getMessage( "Estado", "") );
      AV97ExcelDocument.Cells(2, 20, 1, 1).setText( httpContext.getMessage( "Cliente Destino", "") );
   }

   public void S131( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV96Random = (int)(GXutil.random( )*10000) ;
      AV94Filename = "DocumentosPendientesFacturarExport-" + GXutil.trim( GXutil.str( AV96Random, 8, 0)) + ".xlsx" ;
      AV97ExcelDocument.Open(AV94Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV97ExcelDocument.Clear();
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV97ExcelDocument.getErrCode() != 0 )
      {
         AV94Filename = "" ;
         AV95ErrorMessage = AV97ExcelDocument.getErrDescription() ;
         AV97ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   public void S151( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV97ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if (returnInSub) return;
      AV97ExcelDocument.Close();
   }

   protected void cleanup( )
   {
      this.aP13[0] = rfa0001e.this.AV94Filename;
      this.aP14[0] = rfa0001e.this.AV95ErrorMessage;
      CloseOpenCursors();
      AV97ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV94Filename = "" ;
      AV95ErrorMessage = "" ;
      AV100ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      P076V2_AV103CantidadRegistrosAProcesar = new short[1] ;
      AV26PPrior = "" ;
      AV27UPrior = "" ;
      AV24TotInf = DecimalUtil.ZERO ;
      AV63Tot_Kgs_g = DecimalUtil.ZERO ;
      AV64Tot_Mts_g = DecimalUtil.ZERO ;
      A10045CliAct = "" ;
      P076V3_A396EmprCod = new String[] {""} ;
      P076V3_A10045CliAct = new String[] {""} ;
      P076V3_A252CliCod = new int[1] ;
      P076V3_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      AV21TotCli = DecimalUtil.ZERO ;
      AV61Tot_kgs_cl = DecimalUtil.ZERO ;
      AV62Tot_mts_cl = DecimalUtil.ZERO ;
      AV84Texto_c = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A1253EmprGuiRem = "" ;
      A5140AlbMarca = "" ;
      P076V4_A1253EmprGuiRem = new String[] {""} ;
      P076V4_A3869AlbCliDes = new int[1] ;
      P076V4_A30AlbProCod = new long[1] ;
      P076V4_A5140AlbMarca = new String[] {""} ;
      P076V4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P076V4_A33AlbProEst = new byte[1] ;
      P076V4_A39AlbProPri = new String[] {""} ;
      P076V4_A1243GuiRemCli = new int[1] ;
      P076V4_A396EmprCod = new String[] {""} ;
      P076V5_A396EmprCod = new String[] {""} ;
      P076V5_A30AlbProCod = new long[1] ;
      P076V5_A2839AlbProVal = new String[] {""} ;
      P076V5_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076V5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076V5_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076V5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076V5_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076V5_A135BarColNom = new String[] {""} ;
      P076V5_A136BarColNum = new int[1] ;
      P076V5_A32AlbProEsp = new byte[1] ;
      P076V5_A217BarTipArt = new short[1] ;
      P076V5_n217BarTipArt = new boolean[] {false} ;
      P076V5_A212BarSer = new String[] {""} ;
      P076V5_A1652BarSerDsc = new String[] {""} ;
      P076V5_A218BarTipCol = new byte[1] ;
      P076V5_A118BarAcaQui = new String[] {""} ;
      P076V5_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076V5_A130BarCodPar = new String[] {""} ;
      P076V5_A132BarCodReo = new byte[1] ;
      P076V5_A129BarCod = new int[1] ;
      A2839AlbProVal = "" ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A118BarAcaQui = "" ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      AV19ImpLinea = DecimalUtil.ZERO ;
      AV23Marca = "" ;
      AV30BarColNom = "" ;
      AV33AlbProEspC = "" ;
      AV53PrecioK = DecimalUtil.ZERO ;
      AV54PrecioM = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new short[1] ;
      AV55TipArtDsc = "" ;
      GXv_char3 = new String[1] ;
      AV97ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      P076V6_A457FasCod = new String[] {""} ;
      P076V6_A396EmprCod = new String[] {""} ;
      P076V6_A30AlbProCod = new long[1] ;
      P076V6_A129BarCod = new int[1] ;
      P076V6_A132BarCodReo = new byte[1] ;
      P076V6_A130BarCodPar = new String[] {""} ;
      P076V6_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076V6_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076V6_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076V6_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P076V6_A460FasDsc = new String[] {""} ;
      P076V6_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A460FasDsc = "" ;
      AV65Pre_kg = DecimalUtil.ZERO ;
      AV66Pre_mt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rfa0001e__default(),
         new Object[] {
             new Object[] {
            P076V2_AV103CantidadRegistrosAProcesar
            }
            , new Object[] {
            P076V3_A396EmprCod, P076V3_A10045CliAct, P076V3_A252CliCod, P076V3_A279CliNom
            }
            , new Object[] {
            P076V4_A1253EmprGuiRem, P076V4_A3869AlbCliDes, P076V4_A30AlbProCod, P076V4_A5140AlbMarca, P076V4_A34AlbProfch, P076V4_A33AlbProEst, P076V4_A39AlbProPri, P076V4_A1243GuiRemCli, P076V4_A396EmprCod
            }
            , new Object[] {
            P076V5_A396EmprCod, P076V5_A30AlbProCod, P076V5_A2839AlbProVal, P076V5_A1264BarPreMtr, P076V5_A1263BarAlbMtrE, P076V5_A1262BarPreKgm, P076V5_A1261BarAlbKgmE, P076V5_A5354AlbImpMan, P076V5_A135BarColNom, P076V5_A136BarColNum,
            P076V5_A32AlbProEsp, P076V5_A217BarTipArt, P076V5_n217BarTipArt, P076V5_A212BarSer, P076V5_A1652BarSerDsc, P076V5_A218BarTipCol, P076V5_A118BarAcaQui, P076V5_A40AlbProRec, P076V5_A130BarCodPar, P076V5_A132BarCodReo,
            P076V5_A129BarCod
            }
            , new Object[] {
            P076V6_A457FasCod, P076V6_A396EmprCod, P076V6_A30AlbProCod, P076V6_A129BarCod, P076V6_A132BarCodReo, P076V6_A130BarCodPar, P076V6_A1241GuiFasPKg, P076V6_A1242GuiFasPMt, P076V6_A1276FasMtr, P076V6_A1275FasKgm,
            P076V6_A460FasDsc, P076V6_A1240GuiFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV28Tipo_alb ;
   private byte AV73Sin_p_f ;
   private byte AV72Sin_p_t ;
   private byte AV18FlagCliCod ;
   private byte A33AlbProEst ;
   private byte A32AlbProEsp ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte AV34FlagIdioma ;
   private byte AV20FlagAlbFas ;
   private short AV103CantidadRegistrosAProcesar ;
   private short cV103CantidadRegistrosAProcesar ;
   private short AV101CantidadRegistrosProcesados ;
   private short A217BarTipArt ;
   private short GXv_int2[] ;
   private short A1240GuiFasLin ;
   private short AV102Porcentaje ;
   private short Gx_err ;
   private int AV8PCliCod ;
   private int AV9UCliCod ;
   private int A252CliCod ;
   private int AV98CellRow ;
   private int AV17CliCod ;
   private int AV32FlagHdr ;
   private int A1243GuiRemCli ;
   private int A3869AlbCliDes ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int AV31BarColNum ;
   private int AV99CellCol ;
   private int AV96Random ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV24TotInf ;
   private java.math.BigDecimal AV63Tot_Kgs_g ;
   private java.math.BigDecimal AV64Tot_Mts_g ;
   private java.math.BigDecimal AV21TotCli ;
   private java.math.BigDecimal AV61Tot_kgs_cl ;
   private java.math.BigDecimal AV62Tot_mts_cl ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal AV19ImpLinea ;
   private java.math.BigDecimal AV53PrecioK ;
   private java.math.BigDecimal AV54PrecioM ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal AV65Pre_kg ;
   private java.math.BigDecimal AV66Pre_mt ;
   private String A396EmprCod ;
   private String AV25Prior ;
   private String AV77Op_p_f ;
   private String AV76Op_p_t ;
   private String AV91BarMaqEst1 ;
   private String AV92BarMaqEst2 ;
   private String scmdbuf ;
   private String AV26PPrior ;
   private String AV27UPrior ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String AV84Texto_c ;
   private String A39AlbProPri ;
   private String A1253EmprGuiRem ;
   private String A5140AlbMarca ;
   private String A2839AlbProVal ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A118BarAcaQui ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String AV23Marca ;
   private String AV30BarColNom ;
   private String AV33AlbProEspC ;
   private String GXv_char1[] ;
   private String AV55TipArtDsc ;
   private String GXv_char3[] ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private java.util.Date AV10PFecha ;
   private java.util.Date AV11UFecha ;
   private java.util.Date A34AlbProfch ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private String AV94Filename ;
   private String AV95ErrorMessage ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV100ProgressIndicator ;
   private String[] aP14 ;
   private String[] aP13 ;
   private IDataStoreProvider pr_default ;
   private short[] P076V2_AV103CantidadRegistrosAProcesar ;
   private String[] P076V3_A396EmprCod ;
   private String[] P076V3_A10045CliAct ;
   private int[] P076V3_A252CliCod ;
   private String[] P076V3_A279CliNom ;
   private String[] P076V4_A1253EmprGuiRem ;
   private int[] P076V4_A3869AlbCliDes ;
   private long[] P076V4_A30AlbProCod ;
   private String[] P076V4_A5140AlbMarca ;
   private java.util.Date[] P076V4_A34AlbProfch ;
   private byte[] P076V4_A33AlbProEst ;
   private String[] P076V4_A39AlbProPri ;
   private int[] P076V4_A1243GuiRemCli ;
   private String[] P076V4_A396EmprCod ;
   private String[] P076V5_A396EmprCod ;
   private long[] P076V5_A30AlbProCod ;
   private String[] P076V5_A2839AlbProVal ;
   private java.math.BigDecimal[] P076V5_A1264BarPreMtr ;
   private java.math.BigDecimal[] P076V5_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P076V5_A1262BarPreKgm ;
   private java.math.BigDecimal[] P076V5_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P076V5_A5354AlbImpMan ;
   private String[] P076V5_A135BarColNom ;
   private int[] P076V5_A136BarColNum ;
   private byte[] P076V5_A32AlbProEsp ;
   private short[] P076V5_A217BarTipArt ;
   private boolean[] P076V5_n217BarTipArt ;
   private String[] P076V5_A212BarSer ;
   private String[] P076V5_A1652BarSerDsc ;
   private byte[] P076V5_A218BarTipCol ;
   private String[] P076V5_A118BarAcaQui ;
   private java.math.BigDecimal[] P076V5_A40AlbProRec ;
   private String[] P076V5_A130BarCodPar ;
   private byte[] P076V5_A132BarCodReo ;
   private int[] P076V5_A129BarCod ;
   private String[] P076V6_A457FasCod ;
   private String[] P076V6_A396EmprCod ;
   private long[] P076V6_A30AlbProCod ;
   private int[] P076V6_A129BarCod ;
   private byte[] P076V6_A132BarCodReo ;
   private String[] P076V6_A130BarCodPar ;
   private java.math.BigDecimal[] P076V6_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P076V6_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P076V6_A1276FasMtr ;
   private java.math.BigDecimal[] P076V6_A1275FasKgm ;
   private String[] P076V6_A460FasDsc ;
   private short[] P076V6_A1240GuiFasLin ;
   private com.genexus.gxoffice.ExcelDoc AV97ExcelDocument ;
}

final  class rfa0001e__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P076V2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV8PCliCod ,
                                          int AV9UCliCod ,
                                          int A252CliCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[3];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCLIENT" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliAct = 'S')");
      if ( (0==AV8PCliCod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (0==AV9UCliCod) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P076V3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV8PCliCod ,
                                          int AV9UCliCod ,
                                          int A252CliCod ,
                                          String A10045CliAct ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[3];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliAct, CliCod, CliNom FROM TXPCLIENT" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliAct = 'S')");
      if ( ! (0==AV8PCliCod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV9UCliCod) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P076V4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV26PPrior ,
                                          String AV27UPrior ,
                                          java.util.Date AV10PFecha ,
                                          java.util.Date AV11UFecha ,
                                          String A39AlbProPri ,
                                          java.util.Date A34AlbProfch ,
                                          String A1253EmprGuiRem ,
                                          String A396EmprCod ,
                                          String A5140AlbMarca ,
                                          int A1243GuiRemCli ,
                                          int AV17CliCod ,
                                          byte A33AlbProEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[6];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprGuiRem, AlbCliDes, AlbProCod, AlbMarca, AlbProfch, AlbProEst, AlbProPri, GuiRemCli, EmprCod FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprGuiRem = ?)");
      addWhere(sWhereString, "(AlbMarca <> 'A')");
      addWhere(sWhereString, "(GuiRemCli = ?)");
      addWhere(sWhereString, "(AlbProEst = 1)");
      if ( ! (GXutil.strcmp("", AV26PPrior)==0) )
      {
         addWhere(sWhereString, "(AlbProPri >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27UPrior)==0) )
      {
         addWhere(sWhereString, "(AlbProPri <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10PFecha)) )
      {
         addWhere(sWhereString, "(AlbProfch >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV11UFecha)) )
      {
         addWhere(sWhereString, "(AlbProfch <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, GuiRemCli, AlbProCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P076V2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] );
            case 1 :
                  return conditional_P076V3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] );
            case 2 :
                  return conditional_P076V4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P076V2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P076V3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P076V4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P076V5", "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbProVal, T1.BarPreMtr, T1.BarAlbMtrE, T1.BarPreKgm, T1.BarAlbKgmE, T1.AlbImpMan, T2.BarColNom, T2.BarColNum, T1.AlbProEsp, T2.BarTipArt, T2.BarSer, T2.BarSerDsc, T2.BarTipCol, T2.BarAcaQui, T1.AlbProRec, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.AlbProCod = ?) AND (T1.AlbProVal = 'S') ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P076V6", "SELECT T1.FasCod, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasPKg, T1.GuiFasPMt, T1.FasMtr, T1.FasKgm, T2.FasDsc, T1.GuiFasLin FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 6);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,5);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(19);
               ((int[]) buf[20])[0] = rslt.getInt(20);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 28);
               ((short[]) buf[11])[0] = rslt.getShort(12);
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
                  stmt.setString(sIdx, (String)parms[3], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[4]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
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
      }
   }

}

