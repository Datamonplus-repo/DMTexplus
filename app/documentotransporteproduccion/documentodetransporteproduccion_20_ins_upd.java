package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_20_ins_upd extends GXProcedure
{
   public documentodetransporteproduccion_20_ins_upd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_20_ins_upd.class ), "" );
   }

   public documentodetransporteproduccion_20_ins_upd( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        java.math.BigDecimal aP5 ,
                        short aP6 ,
                        short aP7 ,
                        java.math.BigDecimal aP8 ,
                        int aP9 ,
                        short aP10 ,
                        int aP11 ,
                        String aP12 ,
                        String aP13 ,
                        short aP14 ,
                        String aP15 ,
                        String aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             java.math.BigDecimal aP5 ,
                             short aP6 ,
                             short aP7 ,
                             java.math.BigDecimal aP8 ,
                             int aP9 ,
                             short aP10 ,
                             int aP11 ,
                             String aP12 ,
                             String aP13 ,
                             short aP14 ,
                             String aP15 ,
                             String aP16 )
   {
      documentodetransporteproduccion_20_ins_upd.this.AV8Emprcod = aP0;
      documentodetransporteproduccion_20_ins_upd.this.AV9AlbProcod = aP1;
      documentodetransporteproduccion_20_ins_upd.this.AV10barcod = aP2;
      documentodetransporteproduccion_20_ins_upd.this.AV11Barcodreo = aP3;
      documentodetransporteproduccion_20_ins_upd.this.AV12Barcodpar = aP4;
      documentodetransporteproduccion_20_ins_upd.this.AV13BarAlbKgmE = aP5;
      documentodetransporteproduccion_20_ins_upd.this.AV14AlbHdrAnc = aP6;
      documentodetransporteproduccion_20_ins_upd.this.AV15AlbHdrgm2 = aP7;
      documentodetransporteproduccion_20_ins_upd.this.AV16BarAlbMtrE = aP8;
      documentodetransporteproduccion_20_ins_upd.this.AV17BarAlbPie = aP9;
      documentodetransporteproduccion_20_ins_upd.this.AV18TubCod = aP10;
      documentodetransporteproduccion_20_ins_upd.this.AV19BarAlbTub = aP11;
      documentodetransporteproduccion_20_ins_upd.this.AV20AlbProVal = aP12;
      documentodetransporteproduccion_20_ins_upd.this.AV32AlbHdrObs = aP13;
      documentodetransporteproduccion_20_ins_upd.this.AV42Moda21 = aP14;
      documentodetransporteproduccion_20_ins_upd.this.AV43UsurCod = aP15;
      documentodetransporteproduccion_20_ins_upd.this.AV44Station = aP16;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV47lavanderiaprecio) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8Emprcod, httpContext.getMessage( "PVPPDA", ""), GXv_int2) ;
      documentodetransporteproduccion_20_ins_upd.this.GXt_int1 = GXv_int2[0] ;
      AV47lavanderiaprecio = GXt_int1 ;
      AV33albbar = (short)(0) ;
      AV41cambiomtskgs = (short)(0) ;
      AV50GXLvl6 = (byte)(0) ;
      /* Using cursor P0AGE2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Long.valueOf(AV9AlbProcod), Integer.valueOf(AV10barcod), Byte.valueOf(AV11Barcodreo), AV12Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0AGE2_A130BarCodPar[0] ;
         A132BarCodReo = P0AGE2_A132BarCodReo[0] ;
         A129BarCod = P0AGE2_A129BarCod[0] ;
         A30AlbProCod = P0AGE2_A30AlbProCod[0] ;
         A396EmprCod = P0AGE2_A396EmprCod[0] ;
         A1261BarAlbKgmE = P0AGE2_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P0AGE2_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P0AGE2_A1265BarAlbPie[0] ;
         A5253BarAcc = P0AGE2_A5253BarAcc[0] ;
         A361DisCod = P0AGE2_A361DisCod[0] ;
         A12195BarAlbUnd = P0AGE2_A12195BarAlbUnd[0] ;
         A12196BarPreUnd = P0AGE2_A12196BarPreUnd[0] ;
         A3271AlbHdrAnc = P0AGE2_A3271AlbHdrAnc[0] ;
         A5019AlbHdrgm2 = P0AGE2_A5019AlbHdrgm2[0] ;
         A2839AlbProVal = P0AGE2_A2839AlbProVal[0] ;
         A1266BarAlbTub = P0AGE2_A1266BarAlbTub[0] ;
         A1206TubCod = P0AGE2_A1206TubCod[0] ;
         n1206TubCod = P0AGE2_n1206TubCod[0] ;
         A2441AlbHdrObs = P0AGE2_A2441AlbHdrObs[0] ;
         A5253BarAcc = P0AGE2_A5253BarAcc[0] ;
         A361DisCod = P0AGE2_A361DisCod[0] ;
         AV50GXLvl6 = (byte)(1) ;
         if ( DecimalUtil.compareTo(A1261BarAlbKgmE, AV13BarAlbKgmE) != 0 )
         {
            AV41cambiomtskgs = (short)(1) ;
         }
         A1261BarAlbKgmE = AV13BarAlbKgmE ;
         if ( DecimalUtil.compareTo(A1263BarAlbMtrE, AV16BarAlbMtrE) != 0 )
         {
            AV41cambiomtskgs = (short)(1) ;
         }
         A1263BarAlbMtrE = AV16BarAlbMtrE ;
         A1265BarAlbPie = AV17BarAlbPie ;
         if ( AV47lavanderiaprecio == 1 )
         {
            AV45BarPreUnd = DecimalUtil.doubleToDec(0) ;
            if ( GXutil.strcmp(A5253BarAcc, "S") == 0 )
            {
               AV46Discod = A361DisCod ;
               /* Execute user subroutine: 'DISPOS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            A12195BarAlbUnd = AV17BarAlbPie ;
            A12196BarPreUnd = AV45BarPreUnd ;
         }
         A3271AlbHdrAnc = AV14AlbHdrAnc ;
         A5019AlbHdrgm2 = AV15AlbHdrgm2 ;
         A2839AlbProVal = AV20AlbProVal ;
         A1266BarAlbTub = AV19BarAlbTub ;
         A1206TubCod = AV18TubCod ;
         n1206TubCod = false ;
         A2441AlbHdrObs = AV32AlbHdrObs ;
         AV33albbar = (short)(1) ;
         /* Using cursor P0AGE3 */
         pr_default.execute(1, new Object[] {A1261BarAlbKgmE, A1263BarAlbMtrE, Integer.valueOf(A1265BarAlbPie), Integer.valueOf(A12195BarAlbUnd), A12196BarPreUnd, Short.valueOf(A3271AlbHdrAnc), Short.valueOf(A5019AlbHdrgm2), A2839AlbProVal, Integer.valueOf(A1266BarAlbTub), Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod), A2441AlbHdrObs, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV50GXLvl6 == 0 )
      {
         /* Using cursor P0AGE4 */
         pr_default.execute(2, new Object[] {AV8Emprcod, Integer.valueOf(AV10barcod), Byte.valueOf(AV11Barcodreo), AV12Barcodpar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A143BarDisNum = P0AGE4_A143BarDisNum[0] ;
            A4812BarEncCli = P0AGE4_A4812BarEncCli[0] ;
            A212BarSer = P0AGE4_A212BarSer[0] ;
            A1652BarSerDsc = P0AGE4_A1652BarSerDsc[0] ;
            A135BarColNom = P0AGE4_A135BarColNom[0] ;
            A136BarColNum = P0AGE4_A136BarColNum[0] ;
            A218BarTipCol = P0AGE4_A218BarTipCol[0] ;
            A252CliCod = P0AGE4_A252CliCod[0] ;
            n252CliCod = P0AGE4_n252CliCod[0] ;
            A1234BarNomCli = P0AGE4_A1234BarNomCli[0] ;
            A1235BarNumCli = P0AGE4_A1235BarNumCli[0] ;
            A217BarTipArt = P0AGE4_A217BarTipArt[0] ;
            n217BarTipArt = P0AGE4_n217BarTipArt[0] ;
            A130BarCodPar = P0AGE4_A130BarCodPar[0] ;
            A132BarCodReo = P0AGE4_A132BarCodReo[0] ;
            A129BarCod = P0AGE4_A129BarCod[0] ;
            A396EmprCod = P0AGE4_A396EmprCod[0] ;
            A5253BarAcc = P0AGE4_A5253BarAcc[0] ;
            A361DisCod = P0AGE4_A361DisCod[0] ;
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            GXv_decimal3[0] = AV36BarPreKgm ;
            GXv_decimal4[0] = AV37BarPremtr ;
            GXv_int2[0] = AV38AlbProEsp ;
            GXv_decimal5[0] = AV39AlbProRec ;
            GXv_char6[0] = AV40BarFasExt ;
            new app.pbuspre4(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal3, GXv_decimal4, GXv_int2, GXv_decimal5, GXv_char6) ;
            documentodetransporteproduccion_20_ins_upd.this.AV36BarPreKgm = GXv_decimal3[0] ;
            documentodetransporteproduccion_20_ins_upd.this.AV37BarPremtr = GXv_decimal4[0] ;
            documentodetransporteproduccion_20_ins_upd.this.AV38AlbProEsp = GXv_int2[0] ;
            documentodetransporteproduccion_20_ins_upd.this.AV39AlbProRec = GXv_decimal5[0] ;
            documentodetransporteproduccion_20_ins_upd.this.AV40BarFasExt = GXv_char6[0] ;
            AV45BarPreUnd = DecimalUtil.doubleToDec(0) ;
            if ( GXutil.strcmp(A5253BarAcc, "S") == 0 )
            {
               AV46Discod = A361DisCod ;
               /* Execute user subroutine: 'DISPOS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            /*
               INSERT RECORD ON TABLE TXPALBBAR

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            A396EmprCod = AV8Emprcod ;
            A30AlbProCod = AV9AlbProcod ;
            A129BarCod = AV10barcod ;
            A132BarCodReo = AV11Barcodreo ;
            A130BarCodPar = AV12Barcodpar ;
            A1261BarAlbKgmE = AV13BarAlbKgmE ;
            A1263BarAlbMtrE = AV16BarAlbMtrE ;
            A1265BarAlbPie = AV17BarAlbPie ;
            if ( AV47lavanderiaprecio == 1 )
            {
               A12195BarAlbUnd = AV17BarAlbPie ;
               A12196BarPreUnd = AV45BarPreUnd ;
            }
            A3271AlbHdrAnc = AV14AlbHdrAnc ;
            A5019AlbHdrgm2 = AV15AlbHdrgm2 ;
            A2839AlbProVal = AV20AlbProVal ;
            A1266BarAlbTub = AV19BarAlbTub ;
            A1206TubCod = AV18TubCod ;
            n1206TubCod = false ;
            A2441AlbHdrObs = AV32AlbHdrObs ;
            A4815AlbEncCli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
            A3391AlbSer = A212BarSer ;
            A8879AlbSerD = A1652BarSerDsc ;
            A3392AlbColNom = A135BarColNom ;
            A3393AlbColNum = A136BarColNum ;
            A3394AlbTipCol = A218BarTipCol ;
            A3886AlbCliCod = A252CliCod ;
            A12232AlbNomCli = A1234BarNomCli ;
            A12233AlbNumcli = A1235BarNumCli ;
            A12234AlbTipArt = A217BarTipArt ;
            A6467BarAlbPlas = (short)(0) ;
            A1248GuiFasULin = (short)(0) ;
            A2243BarKgsCli = DecimalUtil.doubleToDec(0) ;
            n2243BarKgsCli = false ;
            A40AlbProRec = DecimalUtil.doubleToDec(0) ;
            A2761AlbBarRec = DecimalUtil.doubleToDec(0) ;
            A2762AlbBarDto = DecimalUtil.doubleToDec(0) ;
            n2762AlbBarDto = false ;
            A32AlbProEsp = AV38AlbProEsp ;
            A40AlbProRec = DecimalUtil.doubleToDec(0) ;
            A1463BarAlbTip = " " ;
            n1463BarAlbTip = false ;
            A1462BarAlbTar = DecimalUtil.doubleToDec(0) ;
            n1462BarAlbTar = false ;
            A40AlbProRec = AV39AlbProRec ;
            A2398BarFasExt = AV40BarFasExt ;
            A1262BarPreKgm = AV36BarPreKgm ;
            A1264BarPreMtr = AV37BarPremtr ;
            /* Using cursor P0AGE5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A32AlbProEsp), A40AlbProRec, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod), A1261BarAlbKgmE, A1263BarAlbMtrE, Integer.valueOf(A1265BarAlbPie), Integer.valueOf(A1266BarAlbTub), Short.valueOf(A1248GuiFasULin), A1262BarPreKgm, A1264BarPreMtr, Boolean.valueOf(n1462BarAlbTar), A1462BarAlbTar, Boolean.valueOf(n1463BarAlbTip), A1463BarAlbTip, A2398BarFasExt, A2441AlbHdrObs, A2761AlbBarRec, Boolean.valueOf(n2762AlbBarDto), A2762AlbBarDto, A2839AlbProVal, Short.valueOf(A3271AlbHdrAnc), A3391AlbSer, A3392AlbColNom, Integer.valueOf(A3393AlbColNum), Byte.valueOf(A3394AlbTipCol), A4815AlbEncCli, Short.valueOf(A5019AlbHdrgm2), Short.valueOf(A6467BarAlbPlas), A8879AlbSerD, Boolean.valueOf(n2243BarKgsCli), A2243BarKgsCli, Integer.valueOf(A3886AlbCliCod), A12196BarPreUnd, Integer.valueOf(A12195BarAlbUnd), A12232AlbNomCli, Integer.valueOf(A12233AlbNumcli), Short.valueOf(A12234AlbTipArt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            if ( (pr_default.getStatus(3) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      if ( ( AV33albbar == 1 ) && ( AV41cambiomtskgs == 1 ) && ( AV42Moda21 == 1 ) )
      {
         GXv_char6[0] = AV8Emprcod ;
         GXv_int7[0] = AV9AlbProcod ;
         GXv_int8[0] = AV10barcod ;
         GXv_int2[0] = AV11Barcodreo ;
         GXv_char9[0] = AV12Barcodpar ;
         GXv_decimal5[0] = AV13BarAlbKgmE ;
         GXv_decimal4[0] = AV16BarAlbMtrE ;
         GXv_char10[0] = AV43UsurCod ;
         GXv_char11[0] = AV44Station ;
         new app.pupdmtsfs(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_int8, GXv_int2, GXv_char9, GXv_decimal5, GXv_decimal4, GXv_char10, GXv_char11) ;
         documentodetransporteproduccion_20_ins_upd.this.AV8Emprcod = GXv_char6[0] ;
         documentodetransporteproduccion_20_ins_upd.this.AV9AlbProcod = GXv_int7[0] ;
         documentodetransporteproduccion_20_ins_upd.this.AV10barcod = GXv_int8[0] ;
         documentodetransporteproduccion_20_ins_upd.this.AV11Barcodreo = GXv_int2[0] ;
         documentodetransporteproduccion_20_ins_upd.this.AV12Barcodpar = GXv_char9[0] ;
         documentodetransporteproduccion_20_ins_upd.this.AV13BarAlbKgmE = GXv_decimal5[0] ;
         documentodetransporteproduccion_20_ins_upd.this.AV16BarAlbMtrE = GXv_decimal4[0] ;
         documentodetransporteproduccion_20_ins_upd.this.AV43UsurCod = GXv_char10[0] ;
         documentodetransporteproduccion_20_ins_upd.this.AV44Station = GXv_char11[0] ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'DISPOS' Routine */
      returnInSub = false ;
      /* Using cursor P0AGE6 */
      pr_default.execute(4, new Object[] {AV8Emprcod, Integer.valueOf(AV46Discod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A361DisCod = P0AGE6_A361DisCod[0] ;
         A396EmprCod = P0AGE6_A396EmprCod[0] ;
         A14555DisPrePz = P0AGE6_A14555DisPrePz[0] ;
         AV45BarPreUnd = A14555DisPrePz ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.documentodetransporteproduccion_20_ins_upd");
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
      P0AGE2_A130BarCodPar = new String[] {""} ;
      P0AGE2_A132BarCodReo = new byte[1] ;
      P0AGE2_A129BarCod = new int[1] ;
      P0AGE2_A30AlbProCod = new long[1] ;
      P0AGE2_A396EmprCod = new String[] {""} ;
      P0AGE2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGE2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGE2_A1265BarAlbPie = new int[1] ;
      P0AGE2_A5253BarAcc = new String[] {""} ;
      P0AGE2_A361DisCod = new int[1] ;
      P0AGE2_A12195BarAlbUnd = new int[1] ;
      P0AGE2_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGE2_A3271AlbHdrAnc = new short[1] ;
      P0AGE2_A5019AlbHdrgm2 = new short[1] ;
      P0AGE2_A2839AlbProVal = new String[] {""} ;
      P0AGE2_A1266BarAlbTub = new int[1] ;
      P0AGE2_A1206TubCod = new short[1] ;
      P0AGE2_n1206TubCod = new boolean[] {false} ;
      P0AGE2_A2441AlbHdrObs = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A5253BarAcc = "" ;
      A12196BarPreUnd = DecimalUtil.ZERO ;
      A2839AlbProVal = "" ;
      A2441AlbHdrObs = "" ;
      AV45BarPreUnd = DecimalUtil.ZERO ;
      P0AGE4_A143BarDisNum = new String[] {""} ;
      P0AGE4_A4812BarEncCli = new String[] {""} ;
      P0AGE4_A212BarSer = new String[] {""} ;
      P0AGE4_A1652BarSerDsc = new String[] {""} ;
      P0AGE4_A135BarColNom = new String[] {""} ;
      P0AGE4_A136BarColNum = new int[1] ;
      P0AGE4_A218BarTipCol = new byte[1] ;
      P0AGE4_A252CliCod = new int[1] ;
      P0AGE4_n252CliCod = new boolean[] {false} ;
      P0AGE4_A1234BarNomCli = new String[] {""} ;
      P0AGE4_A1235BarNumCli = new int[1] ;
      P0AGE4_A217BarTipArt = new short[1] ;
      P0AGE4_n217BarTipArt = new boolean[] {false} ;
      P0AGE4_A130BarCodPar = new String[] {""} ;
      P0AGE4_A132BarCodReo = new byte[1] ;
      P0AGE4_A129BarCod = new int[1] ;
      P0AGE4_A396EmprCod = new String[] {""} ;
      P0AGE4_A5253BarAcc = new String[] {""} ;
      P0AGE4_A361DisCod = new int[1] ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      AV36BarPreKgm = DecimalUtil.ZERO ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      AV37BarPremtr = DecimalUtil.ZERO ;
      AV39AlbProRec = DecimalUtil.ZERO ;
      AV40BarFasExt = "" ;
      A4815AlbEncCli = "" ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A3392AlbColNom = "" ;
      A12232AlbNomCli = "" ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A2762AlbBarDto = DecimalUtil.ZERO ;
      A1463BarAlbTip = "" ;
      A1462BarAlbTar = DecimalUtil.ZERO ;
      A2398BarFasExt = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new long[1] ;
      GXv_int8 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      GXv_char10 = new String[1] ;
      GXv_char11 = new String[1] ;
      P0AGE6_A361DisCod = new int[1] ;
      P0AGE6_A396EmprCod = new String[] {""} ;
      P0AGE6_A14555DisPrePz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A14555DisPrePz = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_20_ins_upd__default(),
         new Object[] {
             new Object[] {
            P0AGE2_A130BarCodPar, P0AGE2_A132BarCodReo, P0AGE2_A129BarCod, P0AGE2_A30AlbProCod, P0AGE2_A396EmprCod, P0AGE2_A1261BarAlbKgmE, P0AGE2_A1263BarAlbMtrE, P0AGE2_A1265BarAlbPie, P0AGE2_A5253BarAcc, P0AGE2_A361DisCod,
            P0AGE2_A12195BarAlbUnd, P0AGE2_A12196BarPreUnd, P0AGE2_A3271AlbHdrAnc, P0AGE2_A5019AlbHdrgm2, P0AGE2_A2839AlbProVal, P0AGE2_A1266BarAlbTub, P0AGE2_A1206TubCod, P0AGE2_n1206TubCod, P0AGE2_A2441AlbHdrObs
            }
            , new Object[] {
            }
            , new Object[] {
            P0AGE4_A143BarDisNum, P0AGE4_A4812BarEncCli, P0AGE4_A212BarSer, P0AGE4_A1652BarSerDsc, P0AGE4_A135BarColNom, P0AGE4_A136BarColNum, P0AGE4_A218BarTipCol, P0AGE4_A252CliCod, P0AGE4_n252CliCod, P0AGE4_A1234BarNomCli,
            P0AGE4_A1235BarNumCli, P0AGE4_A217BarTipArt, P0AGE4_n217BarTipArt, P0AGE4_A130BarCodPar, P0AGE4_A132BarCodReo, P0AGE4_A129BarCod, P0AGE4_A396EmprCod, P0AGE4_A5253BarAcc, P0AGE4_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            P0AGE6_A361DisCod, P0AGE6_A396EmprCod, P0AGE6_A14555DisPrePz
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Barcodreo ;
   private byte GXt_int1 ;
   private byte AV50GXLvl6 ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte W132BarCodReo ;
   private byte AV38AlbProEsp ;
   private byte A3394AlbTipCol ;
   private byte A32AlbProEsp ;
   private byte GXv_int2[] ;
   private short AV14AlbHdrAnc ;
   private short AV15AlbHdrgm2 ;
   private short AV18TubCod ;
   private short AV42Moda21 ;
   private short AV47lavanderiaprecio ;
   private short AV33albbar ;
   private short AV41cambiomtskgs ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short A217BarTipArt ;
   private short A12234AlbTipArt ;
   private short A6467BarAlbPlas ;
   private short A1248GuiFasULin ;
   private short Gx_err ;
   private int AV10barcod ;
   private int AV17BarAlbPie ;
   private int AV19BarAlbTub ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int A361DisCod ;
   private int A12195BarAlbUnd ;
   private int A1266BarAlbTub ;
   private int AV46Discod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A1235BarNumCli ;
   private int W129BarCod ;
   private int GX_INS195 ;
   private int A3393AlbColNum ;
   private int A3886AlbCliCod ;
   private int A12233AlbNumcli ;
   private int GXv_int8[] ;
   private long AV9AlbProcod ;
   private long A30AlbProCod ;
   private long GXv_int7[] ;
   private java.math.BigDecimal AV13BarAlbKgmE ;
   private java.math.BigDecimal AV16BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A12196BarPreUnd ;
   private java.math.BigDecimal AV45BarPreUnd ;
   private java.math.BigDecimal AV36BarPreKgm ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private java.math.BigDecimal AV37BarPremtr ;
   private java.math.BigDecimal AV39AlbProRec ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A2762AlbBarDto ;
   private java.math.BigDecimal A1462BarAlbTar ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal A14555DisPrePz ;
   private String AV8Emprcod ;
   private String AV12Barcodpar ;
   private String AV20AlbProVal ;
   private String AV32AlbHdrObs ;
   private String AV43UsurCod ;
   private String AV44Station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A5253BarAcc ;
   private String A2839AlbProVal ;
   private String A2441AlbHdrObs ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String AV40BarFasExt ;
   private String A4815AlbEncCli ;
   private String A3391AlbSer ;
   private String A8879AlbSerD ;
   private String A3392AlbColNom ;
   private String A12232AlbNomCli ;
   private String A1463BarAlbTip ;
   private String A2398BarFasExt ;
   private String Gx_emsg ;
   private String GXv_char6[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private boolean n1206TubCod ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n2243BarKgsCli ;
   private boolean n2762AlbBarDto ;
   private boolean n1463BarAlbTip ;
   private boolean n1462BarAlbTar ;
   private IDataStoreProvider pr_default ;
   private String[] P0AGE2_A130BarCodPar ;
   private byte[] P0AGE2_A132BarCodReo ;
   private int[] P0AGE2_A129BarCod ;
   private long[] P0AGE2_A30AlbProCod ;
   private String[] P0AGE2_A396EmprCod ;
   private java.math.BigDecimal[] P0AGE2_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P0AGE2_A1263BarAlbMtrE ;
   private int[] P0AGE2_A1265BarAlbPie ;
   private String[] P0AGE2_A5253BarAcc ;
   private int[] P0AGE2_A361DisCod ;
   private int[] P0AGE2_A12195BarAlbUnd ;
   private java.math.BigDecimal[] P0AGE2_A12196BarPreUnd ;
   private short[] P0AGE2_A3271AlbHdrAnc ;
   private short[] P0AGE2_A5019AlbHdrgm2 ;
   private String[] P0AGE2_A2839AlbProVal ;
   private int[] P0AGE2_A1266BarAlbTub ;
   private short[] P0AGE2_A1206TubCod ;
   private boolean[] P0AGE2_n1206TubCod ;
   private String[] P0AGE2_A2441AlbHdrObs ;
   private String[] P0AGE4_A143BarDisNum ;
   private String[] P0AGE4_A4812BarEncCli ;
   private String[] P0AGE4_A212BarSer ;
   private String[] P0AGE4_A1652BarSerDsc ;
   private String[] P0AGE4_A135BarColNom ;
   private int[] P0AGE4_A136BarColNum ;
   private byte[] P0AGE4_A218BarTipCol ;
   private int[] P0AGE4_A252CliCod ;
   private boolean[] P0AGE4_n252CliCod ;
   private String[] P0AGE4_A1234BarNomCli ;
   private int[] P0AGE4_A1235BarNumCli ;
   private short[] P0AGE4_A217BarTipArt ;
   private boolean[] P0AGE4_n217BarTipArt ;
   private String[] P0AGE4_A130BarCodPar ;
   private byte[] P0AGE4_A132BarCodReo ;
   private int[] P0AGE4_A129BarCod ;
   private String[] P0AGE4_A396EmprCod ;
   private String[] P0AGE4_A5253BarAcc ;
   private int[] P0AGE4_A361DisCod ;
   private int[] P0AGE6_A361DisCod ;
   private String[] P0AGE6_A396EmprCod ;
   private java.math.BigDecimal[] P0AGE6_A14555DisPrePz ;
}

final  class documentodetransporteproduccion_20_ins_upd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGE2", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.EmprCod, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbPie, T2.BarAcc, T2.DisCod, T1.BarAlbUnd, T1.BarPreUnd, T1.AlbHdrAnc, T1.AlbHdrgm2, T1.AlbProVal, T1.BarAlbTub, T1.TubCod, T1.AlbHdrObs FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AGE3", "UPDATE TXPALBBAR SET BarAlbKgmE=?, BarAlbMtrE=?, BarAlbPie=?, BarAlbUnd=?, BarPreUnd=?, AlbHdrAnc=?, AlbHdrgm2=?, AlbProVal=?, BarAlbTub=?, TubCod=?, AlbHdrObs=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P0AGE4", "SELECT BarDisNum, BarEncCli, BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol, CliCod, BarNomCli, BarNumCli, BarTipArt, BarCodPar, BarCodReo, BarCod, EmprCod, BarAcc, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AGE5", "INSERT INTO TXPALBBAR(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbProEsp, AlbProRec, TubCod, BarAlbKgmE, BarAlbMtrE, BarAlbPie, BarAlbTub, GuiFasULin, BarPreKgm, BarPreMtr, BarAlbTar, BarAlbTip, BarFasExt, AlbHdrObs, AlbBarRec, AlbBarDto, AlbProVal, AlbHdrAnc, AlbSer, AlbColNom, AlbColNum, AlbTipCol, AlbEncCli, AlbHdrgm2, BarAlbPlas, AlbSerD, BarKgsCli, AlbCliCod, BarPreUnd, BarAlbUnd, AlbNomCli, AlbNumcli, AlbTipArt, AlbPConPie, BarAlbBul, BarAlbFor, BarAlbPN, AlbPrdULin, IntCod, BarAlbPbr, ManCod, BarFasExtD, BarAlbObs, BarAlbExt, BarAlbTin, AlbHdrUlin, AlbTipCon, CodCod, AlbPckUlin, TipAcaCod, AlbTipEnt, AlbImpMan, P_ForULin, PlasCod, AlbHdRUl, AlbObsM, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, AlbEncL, AlbEncA, AlbCald, AlbDf1, AlbDf2, AlbDf3, AlbMqTj, AlbDto, Et_UltNum, AlbMetULi, AlbCadEnc, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P0AGE6", "SELECT DisCod, EmprCod, DisPrePz FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(18, 60);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 3);
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[10]).shortValue());
               }
               stmt.setString(11, (String)parms[11], 60);
               stmt.setString(12, (String)parms[12], 3);
               stmt.setLong(13, ((Number) parms[13]).longValue());
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setByte(15, ((Number) parms[15]).byteValue());
               stmt.setString(16, (String)parms[16], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[8]).shortValue());
               }
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[10], 2);
               stmt.setInt(11, ((Number) parms[11]).intValue());
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setShort(13, ((Number) parms[13]).shortValue());
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[14], 5);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 5);
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[19], 1);
               }
               stmt.setString(18, (String)parms[20], 8);
               stmt.setString(19, (String)parms[21], 60);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[22], 2);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[24], 2);
               }
               stmt.setString(22, (String)parms[25], 1);
               stmt.setShort(23, ((Number) parms[26]).shortValue());
               stmt.setString(24, (String)parms[27], 16);
               stmt.setString(25, (String)parms[28], 13);
               stmt.setInt(26, ((Number) parms[29]).intValue());
               stmt.setByte(27, ((Number) parms[30]).byteValue());
               stmt.setString(28, (String)parms[31], 20);
               stmt.setShort(29, ((Number) parms[32]).shortValue());
               stmt.setShort(30, ((Number) parms[33]).shortValue());
               stmt.setString(31, (String)parms[34], 26);
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[36], 2);
               }
               stmt.setInt(33, ((Number) parms[37]).intValue());
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[38], 5);
               stmt.setInt(35, ((Number) parms[39]).intValue());
               stmt.setString(36, (String)parms[40], 13);
               stmt.setInt(37, ((Number) parms[41]).intValue());
               stmt.setShort(38, ((Number) parms[42]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

