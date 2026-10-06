package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pafealb extends GXProcedure
{
   public pafealb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pafealb.class ), "" );
   }

   public pafealb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     long[] aP3 )
   {
      pafealb.this.aP4 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        long[] aP3 ,
                        java.util.Date[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             long[] aP3 ,
                             java.util.Date[] aP4 )
   {
      pafealb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pafealb.this.AV15NumFac = aP1[0];
      this.aP1 = aP1;
      pafealb.this.AV16AlbTip = aP2[0];
      this.aP2 = aP2;
      pafealb.this.AV17PALB = aP3[0];
      this.aP3 = aP3;
      pafealb.this.AV65FacHor = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV33FlagGav ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GAVIM", ""), GXv_int1) ;
      pafealb.this.AV33FlagGav = GXv_int1[0] ;
      GXv_int1[0] = AV35FlagFacPro ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACPRO", ""), GXv_int1) ;
      pafealb.this.AV35FlagFacPro = GXv_int1[0] ;
      GXv_int1[0] = AV36Guasch ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GUASCH", ""), GXv_int1) ;
      pafealb.this.AV36Guasch = GXv_int1[0] ;
      AV30FlagEst = (byte)(0) ;
      GXv_int1[0] = AV30FlagEst ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTAMP", ""), GXv_int1) ;
      pafealb.this.AV30FlagEst = GXv_int1[0] ;
      GXv_int1[0] = AV51FlagBonAlb ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BONALB", ""), GXv_int1) ;
      pafealb.this.AV51FlagBonAlb = GXv_int1[0] ;
      GXv_int1[0] = AV54FlagPorRec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PORREC", ""), GXv_int1) ;
      pafealb.this.AV54FlagPorRec = GXv_int1[0] ;
      GXt_int2 = AV64Moda21 ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int1) ;
      pafealb.this.GXt_int2 = GXv_int1[0] ;
      AV64Moda21 = GXt_int2 ;
      GXt_int2 = AV68termilenio ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TERMIL", ""), GXv_int1) ;
      pafealb.this.GXt_int2 = GXv_int1[0] ;
      AV68termilenio = GXt_int2 ;
      AV63Msg_fra = httpContext.getMessage( "Atencion. Factura actual supera máximo numero de lineas = 999", "") ;
      /* Using cursor P00572 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15NumFac)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A430FacCod = P00572_A430FacCod[0] ;
         A12523FacTpFra = P00572_A12523FacTpFra[0] ;
         AV69FacTpFra = A12523FacTpFra ;
         /* Using cursor P00573 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A446FacLin = P00573_A446FacLin[0] ;
            AV18NumLin = A446FacLin ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV16AlbTip == 1 )
      {
         /* Using cursor P00574 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(AV17PALB)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A30AlbProCod = P00574_A30AlbProCod[0] ;
            A1243GuiRemCli = P00574_A1243GuiRemCli[0] ;
            A5041AlbProTBo = P00574_A5041AlbProTBo[0] ;
            n5041AlbProTBo = P00574_n5041AlbProTBo[0] ;
            A5040AlbProBon = P00574_A5040AlbProBon[0] ;
            n5040AlbProBon = P00574_n5040AlbProBon[0] ;
            A33AlbProEst = P00574_A33AlbProEst[0] ;
            A1782AlbProEso = P00574_A1782AlbProEso[0] ;
            AV43CliCod = A1243GuiRemCli ;
            AV49BonToP = GXutil.substring( A5041AlbProTBo, 2, 1) ;
            AV48AlbProBon = A5040AlbProBon ;
            AV50TotAlb = (short)(0) ;
            /* Execute user subroutine: 'CLIENTE' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P00576 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A1208TubPre = P00576_A1208TubPre[0] ;
               n1208TubPre = P00576_n1208TubPre[0] ;
               A1266BarAlbTub = P00576_A1266BarAlbTub[0] ;
               A1207TubNom = P00576_A1207TubNom[0] ;
               n1207TubNom = P00576_n1207TubNom[0] ;
               A212BarSer = P00576_A212BarSer[0] ;
               A1262BarPreKgm = P00576_A1262BarPreKgm[0] ;
               A1264BarPreMtr = P00576_A1264BarPreMtr[0] ;
               A40AlbProRec = P00576_A40AlbProRec[0] ;
               A136BarColNum = P00576_A136BarColNum[0] ;
               A135BarColNom = P00576_A135BarColNom[0] ;
               A143BarDisNum = P00576_A143BarDisNum[0] ;
               A2242AlbSec = P00576_A2242AlbSec[0] ;
               A2761AlbBarRec = P00576_A2761AlbBarRec[0] ;
               A218BarTipCol = P00576_A218BarTipCol[0] ;
               A1234BarNomCli = P00576_A1234BarNomCli[0] ;
               A1235BarNumCli = P00576_A1235BarNumCli[0] ;
               A5354AlbImpMan = P00576_A5354AlbImpMan[0] ;
               A2762AlbBarDto = P00576_A2762AlbBarDto[0] ;
               n2762AlbBarDto = P00576_n2762AlbBarDto[0] ;
               A1261BarAlbKgmE = P00576_A1261BarAlbKgmE[0] ;
               A252CliCod = P00576_A252CliCod[0] ;
               n252CliCod = P00576_n252CliCod[0] ;
               A4466BarAcaAnh = P00576_A4466BarAcaAnh[0] ;
               A1263BarAlbMtrE = P00576_A1263BarAlbMtrE[0] ;
               A1503BarPart = P00576_A1503BarPart[0] ;
               A4812BarEncCli = P00576_A4812BarEncCli[0] ;
               A130BarCodPar = P00576_A130BarCodPar[0] ;
               A132BarCodReo = P00576_A132BarCodReo[0] ;
               A129BarCod = P00576_A129BarCod[0] ;
               A1798BarDibCli = P00576_A1798BarDibCli[0] ;
               A1206TubCod = P00576_A1206TubCod[0] ;
               n1206TubCod = P00576_n1206TubCod[0] ;
               A6466PlasCod = P00576_A6466PlasCod[0] ;
               n6466PlasCod = P00576_n6466PlasCod[0] ;
               A6467BarAlbPlas = P00576_A6467BarAlbPlas[0] ;
               A166BarKgm = P00576_A166BarKgm[0] ;
               A184BarMtr = P00576_A184BarMtr[0] ;
               A212BarSer = P00576_A212BarSer[0] ;
               A136BarColNum = P00576_A136BarColNum[0] ;
               A135BarColNom = P00576_A135BarColNom[0] ;
               A143BarDisNum = P00576_A143BarDisNum[0] ;
               A218BarTipCol = P00576_A218BarTipCol[0] ;
               A1234BarNomCli = P00576_A1234BarNomCli[0] ;
               A1235BarNumCli = P00576_A1235BarNumCli[0] ;
               A252CliCod = P00576_A252CliCod[0] ;
               n252CliCod = P00576_n252CliCod[0] ;
               A4466BarAcaAnh = P00576_A4466BarAcaAnh[0] ;
               A1503BarPart = P00576_A1503BarPart[0] ;
               A4812BarEncCli = P00576_A4812BarEncCli[0] ;
               A1798BarDibCli = P00576_A1798BarDibCli[0] ;
               A1208TubPre = P00576_A1208TubPre[0] ;
               n1208TubPre = P00576_n1208TubPre[0] ;
               A1207TubNom = P00576_A1207TubNom[0] ;
               n1207TubNom = P00576_n1207TubNom[0] ;
               A166BarKgm = P00576_A166BarKgm[0] ;
               A184BarMtr = P00576_A184BarMtr[0] ;
               A2242AlbSec = P00576_A2242AlbSec[0] ;
               AV37AlbProCod = A30AlbProCod ;
               AV42BarSer = A212BarSer ;
               AV38BarCod = A129BarCod ;
               AV39BarCodReo = A132BarCodReo ;
               AV40BarCodPar = A130BarCodPar ;
               /* Using cursor P00577 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A761ProFasLin = P00577_A761ProFasLin[0] ;
                  n761ProFasLin = P00577_n761ProFasLin[0] ;
                  A758ProCod = P00577_A758ProCod[0] ;
                  n758ProCod = P00577_n758ProCod[0] ;
                  AV66Procod = A758ProCod ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               AV74Lalprd = (byte)(0) ;
               AV72BarKgm = DecimalUtil.doubleToDec(0) ;
               AV73BarMtr = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P00578 */
               pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A27AlbPKilEnt = P00578_A27AlbPKilEnt[0] ;
                  A200BarPieCod = P00578_A200BarPieCod[0] ;
                  AV75BarPiecod = A200BarPieCod ;
                  /* Execute user subroutine: 'BARPIE' */
                  S141 ();
                  if ( returnInSub )
                  {
                     pr_default.close(5);
                     pr_default.close(3);
                     pr_default.close(3);
                     pr_default.close(3);
                     pr_default.close(3);
                     pr_default.close(3);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV72BarKgm = AV72BarKgm.add(AV70barPiekil) ;
                  AV73BarMtr = AV73BarMtr.add(AV71barpiemet) ;
                  AV74Lalprd = (byte)(1) ;
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               AV72BarKgm = ((AV74Lalprd==0) ? A166BarKgm : AV72BarKgm) ;
               AV73BarMtr = ((AV74Lalprd==0) ? A184BarMtr : AV73BarMtr) ;
               AV18NumLin = (int)(AV18NumLin+1) ;
               if ( AV18NumLin > 999 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               /* Execute user subroutine: 'OBSFAC' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(3);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( ! (GXutil.strcmp("", AV41ArtObsFac)==0) )
               {
                  /*
                     INSERT RECORD ON TABLE TXPLFAVEN

                  */
                  A430FacCod = AV15NumFac ;
                  A446FacLin = AV18NumLin ;
                  A454FacSer = httpContext.getMessage( "Observ.", "") ;
                  A428FacAlbTip = (byte)(2) ;
                  A427FacAlbCod = A30AlbProCod ;
                  A432FacDsc = AV41ArtObsFac ;
                  A1498FacDisNum = AV25BarDisNum ;
                  A3303FacNPart = A1503BarPart ;
                  A4814FacEncCli = A4812BarEncCli ;
                  A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                  A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                  A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                  A3397FacFasCod = " " ;
                  /* Using cursor P00579 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A1498FacDisNum, Short.valueOf(A3303FacNPart), A3397FacFasCod, A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  /* End Insert */
                  GXt_decimal3 = DecimalUtil.doubleToDec(AV50TotAlb) ;
                  GXv_char4[0] = A396EmprCod ;
                  GXv_int5[0] = AV15NumFac ;
                  GXv_int6[0] = AV18NumLin ;
                  GXv_decimal7[0] = GXt_decimal3 ;
                  new app.pfacimli(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_decimal7) ;
                  pafealb.this.A396EmprCod = GXv_char4[0] ;
                  pafealb.this.AV15NumFac = GXv_int5[0] ;
                  pafealb.this.AV18NumLin = GXv_int6[0] ;
                  pafealb.this.GXt_decimal3 = GXv_decimal7[0] ;
                  AV50TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV50TotAlb).add((GXt_decimal3)))) ;
                  AV18NumLin = (int)(AV18NumLin+1) ;
               }
               if ( AV18NumLin > 999 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               if ( (0==AV30FlagEst) )
               {
                  AV23LenSer = (byte)(GXutil.len( A212BarSer)) ;
                  AV24LenColNom = (byte)(GXutil.len( A135BarColNom)) ;
                  if ( AV35FlagFacPro == 1 )
                  {
                     /* Execute user subroutine: 'PROCESO' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(3);
                        pr_default.close(3);
                        pr_default.close(3);
                        pr_default.close(3);
                        pr_default.close(3);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  else
                  {
                     /*
                        INSERT RECORD ON TABLE TXPLFAVEN

                     */
                     A430FacCod = AV15NumFac ;
                     A446FacLin = AV18NumLin ;
                     A427FacAlbCod = A30AlbProCod ;
                     A1294FacBarCod = A129BarCod ;
                     A1295FacBarReo = A132BarCodReo ;
                     A1296FacBarPar = A130BarCodPar ;
                     A428FacAlbTip = (byte)(1) ;
                     A454FacSer = A212BarSer ;
                     A448FacPreKgs = A1262BarPreKgm ;
                     A449FacPreMts = A1264BarPreMtr ;
                     A451FacRec = A40AlbProRec ;
                     A432FacDsc = GXutil.substring( A212BarSer, 1, AV23LenSer) + "/" + GXutil.substring( A135BarColNom, 1, AV24LenColNom) + "-" + GXutil.str( A136BarColNum, 6, 0) ;
                     A1498FacDisNum = A143BarDisNum ;
                     A3097FacTipPro = A2242AlbSec ;
                     if ( AV33FlagGav == 1 )
                     {
                        A3303FacNPart = A1503BarPart ;
                     }
                     else
                     {
                        if ( AV54FlagPorRec == 1 )
                        {
                           A3897FacKgsA = A2761AlbBarRec ;
                        }
                     }
                     A3397FacFasCod = " " ;
                     A4814FacEncCli = A4812BarEncCli ;
                     A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                     A3878FacColNom = A135BarColNom ;
                     A3879FocColNum = A136BarColNum ;
                     A3880FacTipColC = A218BarTipCol ;
                     A3881FacNomCol = A1234BarNomCli ;
                     A3882FacNumCol = A1235BarNumCli ;
                     A5353FacImpMan = A5354AlbImpMan ;
                     A5355FacImpMin = AV57CliImpMin ;
                     A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                     if ( AV64Moda21 == 1 )
                     {
                        A451FacRec = DecimalUtil.doubleToDec(0) ;
                        A3898FacPreKgsA = DecimalUtil.doubleToDec(0) ;
                        A3897FacKgsA = DecimalUtil.doubleToDec(0) ;
                        if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2762AlbBarDto)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2761AlbBarRec)==0) )
                        {
                           A5050FacBonLi = A2762AlbBarDto ;
                           A451FacRec = A2761AlbBarRec ;
                           A3898FacPreKgsA = (A1261BarAlbKgmE.multiply(A1262BarPreKgm).multiply(A2761AlbBarRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)).subtract((A1261BarAlbKgmE.multiply(A1262BarPreKgm).multiply(A2762AlbBarDto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                           A3897FacKgsA = DecimalUtil.doubleToDec(1) ;
                        }
                     }
                     A3884FacProCod = AV66Procod ;
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int6[0] = A252CliCod ;
                     GXv_char8[0] = A212BarSer ;
                     GXv_char9[0] = A135BarColNom ;
                     GXv_int5[0] = A136BarColNum ;
                     GXv_int1[0] = A218BarTipCol ;
                     GXv_int10[0] = AV67intcod ;
                     GXv_char11[0] = "" ;
                     new app.pbusin3(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char8, GXv_char9, GXv_int5, GXv_int1, GXv_int10, GXv_char11) ;
                     pafealb.this.A396EmprCod = GXv_char4[0] ;
                     pafealb.this.A252CliCod = GXv_int6[0] ;
                     pafealb.this.A212BarSer = GXv_char8[0] ;
                     pafealb.this.A135BarColNom = GXv_char9[0] ;
                     pafealb.this.A136BarColNum = GXv_int5[0] ;
                     pafealb.this.A218BarTipCol = GXv_int1[0] ;
                     pafealb.this.AV67intcod = GXv_int10[0] ;
                     A12693FacInt = AV67intcod ;
                     A12906FacCadEnc = A4466BarAcaAnh ;
                     A444FacKgs = ((AV68termilenio==0) ? A1261BarAlbKgmE : ((GXutil.strcmp(AV69FacTpFra, httpContext.getMessage( "S", ""))!=0) ? A1261BarAlbKgmE : AV72BarKgm)) ;
                     A447FacMts = ((AV68termilenio==0) ? A1263BarAlbMtrE : ((GXutil.strcmp(AV69FacTpFra, httpContext.getMessage( "S", ""))!=0) ? A1263BarAlbMtrE : AV73BarMtr)) ;
                     /* Using cursor P005710 */
                     pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, A3097FacTipPro, Short.valueOf(A3303FacNPart), A3397FacFasCod, A3878FacColNom, Integer.valueOf(A3879FocColNum), Byte.valueOf(A3880FacTipColC), A3881FacNomCol, Integer.valueOf(A3882FacNumCol), A3884FacProCod, A3898FacPreKgsA, A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin, A3897FacKgsA, Byte.valueOf(A12693FacInt), Short.valueOf(A12906FacCadEnc)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                     if ( (pr_default.getStatus(7) == 1) )
                     {
                        Gx_err = (short)(1) ;
                        Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                     }
                     else
                     {
                        Gx_err = (short)(0) ;
                        Gx_emsg = "" ;
                     }
                     /* End Insert */
                     GXt_decimal3 = DecimalUtil.doubleToDec(AV50TotAlb) ;
                     GXv_char11[0] = A396EmprCod ;
                     GXv_int6[0] = AV15NumFac ;
                     GXv_int5[0] = AV18NumLin ;
                     GXv_decimal7[0] = GXt_decimal3 ;
                     new app.pfacimli(remoteHandle, context).execute( GXv_char11, GXv_int6, GXv_int5, GXv_decimal7) ;
                     pafealb.this.A396EmprCod = GXv_char11[0] ;
                     pafealb.this.AV15NumFac = GXv_int6[0] ;
                     pafealb.this.AV18NumLin = GXv_int5[0] ;
                     pafealb.this.GXt_decimal3 = GXv_decimal7[0] ;
                     AV50TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV50TotAlb).add((GXt_decimal3)))) ;
                     if ( ( AV51FlagBonAlb == 1 ) && ( GXutil.strcmp(AV49BonToP, httpContext.getMessage( "P", "")) == 0 ) && ( A2762AlbBarDto.doubleValue() != 0 ) )
                     {
                        AV18NumLin = (int)(AV18NumLin+1) ;
                        if ( AV18NumLin > 999 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                        /*
                           INSERT RECORD ON TABLE TXPLFAVEN

                        */
                        A430FacCod = AV15NumFac ;
                        A446FacLin = AV18NumLin ;
                        A427FacAlbCod = A30AlbProCod ;
                        A1294FacBarCod = A129BarCod ;
                        A1295FacBarReo = A132BarCodReo ;
                        A1296FacBarPar = A130BarCodPar ;
                        A428FacAlbTip = (byte)(1) ;
                        A454FacSer = httpContext.getMessage( "BONIFICACION", "") ;
                        A448FacPreKgs = GXutil.roundDecimal( (A1261BarAlbKgmE.multiply(A1262BarPreKgm).multiply(A2762AlbBarDto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2).multiply(DecimalUtil.doubleToDec((-1))) ;
                        A449FacPreMts = GXutil.roundDecimal( (A1263BarAlbMtrE.multiply(A1264BarPreMtr).multiply(A2762AlbBarDto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2).multiply(DecimalUtil.doubleToDec((-1))) ;
                        A444FacKgs = DecimalUtil.doubleToDec(1) ;
                        A447FacMts = DecimalUtil.doubleToDec(1) ;
                        A1498FacDisNum = AV25BarDisNum ;
                        A3303FacNPart = A1503BarPart ;
                        A3397FacFasCod = httpContext.getMessage( "BONIFPAR", "") ;
                        A4814FacEncCli = A4812BarEncCli ;
                        A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                        /* Using cursor P005711 */
                        pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), A3397FacFasCod, A4814FacEncCli, A5050FacBonLi});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                        if ( (pr_default.getStatus(8) == 1) )
                        {
                           Gx_err = (short)(1) ;
                           Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                        }
                        else
                        {
                           Gx_err = (short)(0) ;
                           Gx_emsg = "" ;
                        }
                        /* End Insert */
                        GXt_decimal3 = DecimalUtil.doubleToDec(AV50TotAlb) ;
                        GXv_char11[0] = A396EmprCod ;
                        GXv_int6[0] = AV15NumFac ;
                        GXv_int5[0] = AV18NumLin ;
                        GXv_decimal7[0] = GXt_decimal3 ;
                        new app.pfacimli(remoteHandle, context).execute( GXv_char11, GXv_int6, GXv_int5, GXv_decimal7) ;
                        pafealb.this.A396EmprCod = GXv_char11[0] ;
                        pafealb.this.AV15NumFac = GXv_int6[0] ;
                        pafealb.this.AV18NumLin = GXv_int5[0] ;
                        pafealb.this.GXt_decimal3 = GXv_decimal7[0] ;
                        AV50TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV50TotAlb).add((GXt_decimal3)))) ;
                     }
                  }
               }
               else
               {
                  AV26LenDib = (byte)(GXutil.len( A1798BarDibCli)) ;
                  AV29BarDibCli = A1798BarDibCli ;
                  /* Using cursor P005712 */
                  pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  while ( (pr_default.getStatus(9) != 101) )
                  {
                     A212BarSer = P005712_A212BarSer[0] ;
                     A1536AlbEComPre = P005712_A1536AlbEComPre[0] ;
                     n1536AlbEComPre = P005712_n1536AlbEComPre[0] ;
                     A1533AlbEComM = P005712_A1533AlbEComM[0] ;
                     n1533AlbEComM = P005712_n1533AlbEComM[0] ;
                     A1056DisComCod = P005712_A1056DisComCod[0] ;
                     A1032FonCod = P005712_A1032FonCod[0] ;
                     A4812BarEncCli = P005712_A4812BarEncCli[0] ;
                     A2524DisComLin = P005712_A2524DisComLin[0] ;
                     A212BarSer = P005712_A212BarSer[0] ;
                     A4812BarEncCli = P005712_A4812BarEncCli[0] ;
                     AV18NumLin = (int)(AV18NumLin+1) ;
                     if ( AV18NumLin > 999 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                     AV27LenFon = (byte)(GXutil.len( A1032FonCod)) ;
                     AV28LenCom = (byte)(GXutil.len( A1056DisComCod)) ;
                     /*
                        INSERT RECORD ON TABLE TXPLFAVEN

                     */
                     A430FacCod = AV15NumFac ;
                     A446FacLin = AV18NumLin ;
                     A427FacAlbCod = A30AlbProCod ;
                     A1294FacBarCod = A129BarCod ;
                     A1295FacBarReo = A132BarCodReo ;
                     A1296FacBarPar = A130BarCodPar ;
                     A428FacAlbTip = (byte)(1) ;
                     A454FacSer = A212BarSer ;
                     A448FacPreKgs = DecimalUtil.ZERO ;
                     A449FacPreMts = A1536AlbEComPre ;
                     A444FacKgs = DecimalUtil.ZERO ;
                     A447FacMts = A1533AlbEComM ;
                     A451FacRec = DecimalUtil.ZERO ;
                     A432FacDsc = GXutil.substring( A1032FonCod, 1, AV27LenFon) + "/" + GXutil.substring( A1056DisComCod, 1, AV28LenCom) + "/" + GXutil.substring( AV29BarDibCli, 1, AV26LenDib) ;
                     A3397FacFasCod = " " ;
                     A1498FacDisNum = AV25BarDisNum ;
                     A4814FacEncCli = A4812BarEncCli ;
                     A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                     A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                     A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                     /* Using cursor P005713 */
                     pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, A3397FacFasCod, A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                     if ( (pr_default.getStatus(10) == 1) )
                     {
                        Gx_err = (short)(1) ;
                        Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                     }
                     else
                     {
                        Gx_err = (short)(0) ;
                        Gx_emsg = "" ;
                     }
                     /* End Insert */
                     GXt_decimal3 = DecimalUtil.doubleToDec(AV50TotAlb) ;
                     GXv_char11[0] = A396EmprCod ;
                     GXv_int6[0] = AV15NumFac ;
                     GXv_int5[0] = AV18NumLin ;
                     GXv_decimal7[0] = GXt_decimal3 ;
                     new app.pfacimli(remoteHandle, context).execute( GXv_char11, GXv_int6, GXv_int5, GXv_decimal7) ;
                     pafealb.this.A396EmprCod = GXv_char11[0] ;
                     pafealb.this.AV15NumFac = GXv_int6[0] ;
                     pafealb.this.AV18NumLin = GXv_int5[0] ;
                     pafealb.this.GXt_decimal3 = GXv_decimal7[0] ;
                     AV50TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV50TotAlb).add((GXt_decimal3)))) ;
                     pr_default.readNext(9);
                  }
                  pr_default.close(9);
               }
               if ( ! (0==A1266BarAlbTub) && ! (0==A1206TubCod) )
               {
                  AV18NumLin = (int)(AV18NumLin+1) ;
                  if ( AV18NumLin > 999 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  /*
                     INSERT RECORD ON TABLE TXPLFAVEN

                  */
                  A430FacCod = AV15NumFac ;
                  A446FacLin = AV18NumLin ;
                  A427FacAlbCod = A30AlbProCod ;
                  A1294FacBarCod = A129BarCod ;
                  A1295FacBarReo = A132BarCodReo ;
                  A1296FacBarPar = A130BarCodPar ;
                  A428FacAlbTip = (byte)(1) ;
                  A454FacSer = httpContext.getMessage( "Tubos", "") ;
                  A448FacPreKgs = A1208TubPre ;
                  A449FacPreMts = DecimalUtil.ZERO ;
                  A444FacKgs = DecimalUtil.doubleToDec(A1266BarAlbTub) ;
                  A447FacMts = DecimalUtil.ZERO ;
                  A451FacRec = DecimalUtil.ZERO ;
                  A432FacDsc = A1207TubNom ;
                  A1498FacDisNum = AV25BarDisNum ;
                  A3303FacNPart = A1503BarPart ;
                  A3397FacFasCod = " " ;
                  A4814FacEncCli = A4812BarEncCli ;
                  A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                  A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                  A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                  /* Using cursor P005714 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), A3397FacFasCod, A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                  if ( (pr_default.getStatus(11) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  /* End Insert */
                  GXt_decimal3 = DecimalUtil.doubleToDec(AV50TotAlb) ;
                  GXv_char11[0] = A396EmprCod ;
                  GXv_int6[0] = AV15NumFac ;
                  GXv_int5[0] = AV18NumLin ;
                  GXv_decimal7[0] = GXt_decimal3 ;
                  new app.pfacimli(remoteHandle, context).execute( GXv_char11, GXv_int6, GXv_int5, GXv_decimal7) ;
                  pafealb.this.A396EmprCod = GXv_char11[0] ;
                  pafealb.this.AV15NumFac = GXv_int6[0] ;
                  pafealb.this.AV18NumLin = GXv_int5[0] ;
                  pafealb.this.GXt_decimal3 = GXv_decimal7[0] ;
                  AV50TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV50TotAlb).add((GXt_decimal3)))) ;
               }
               if ( ! (0==A6467BarAlbPlas) && ! (0==A6466PlasCod) )
               {
                  GXv_char11[0] = A396EmprCod ;
                  GXv_int12[0] = A30AlbProCod ;
                  GXv_int6[0] = A129BarCod ;
                  GXv_int10[0] = A132BarCodReo ;
                  GXv_char9[0] = A130BarCodPar ;
                  GXv_int5[0] = AV15NumFac ;
                  GXv_int13[0] = AV18NumLin ;
                  GXv_char8[0] = " " ;
                  GXv_int1[0] = AV31FlagSal ;
                  GXv_int14[0] = (short)(0) ;
                  GXv_int15[0] = AV43CliCod ;
                  new app.facturacion.pfacau15(remoteHandle, context).execute( GXv_char11, GXv_int12, GXv_int6, GXv_int10, GXv_char9, GXv_int5, GXv_int13, GXv_char8, GXv_int1, GXv_int14, GXv_int15) ;
                  pafealb.this.A396EmprCod = GXv_char11[0] ;
                  pafealb.this.A30AlbProCod = GXv_int12[0] ;
                  pafealb.this.A129BarCod = GXv_int6[0] ;
                  pafealb.this.A132BarCodReo = GXv_int10[0] ;
                  pafealb.this.A130BarCodPar = GXv_char9[0] ;
                  pafealb.this.AV15NumFac = GXv_int5[0] ;
                  pafealb.this.AV18NumLin = GXv_int13[0] ;
                  pafealb.this.AV31FlagSal = GXv_int1[0] ;
                  pafealb.this.AV43CliCod = GXv_int15[0] ;
               }
               /* Using cursor P005715 */
               pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(12) != 101) )
               {
                  A212BarSer = P005715_A212BarSer[0] ;
                  A460FasDsc = P005715_A460FasDsc[0] ;
                  A457FasCod = P005715_A457FasCod[0] ;
                  A143BarDisNum = P005715_A143BarDisNum[0] ;
                  A1458BarAlbBul = P005715_A1458BarAlbBul[0] ;
                  A1503BarPart = P005715_A1503BarPart[0] ;
                  A2242AlbSec = P005715_A2242AlbSec[0] ;
                  A4812BarEncCli = P005715_A4812BarEncCli[0] ;
                  A7752GuiFasRec = P005715_A7752GuiFasRec[0] ;
                  n7752GuiFasRec = P005715_n7752GuiFasRec[0] ;
                  A7751GuiFasDto = P005715_A7751GuiFasDto[0] ;
                  n7751GuiFasDto = P005715_n7751GuiFasDto[0] ;
                  A1276FasMtr = P005715_A1276FasMtr[0] ;
                  A1275FasKgm = P005715_A1275FasKgm[0] ;
                  A1241GuiFasPKg = P005715_A1241GuiFasPKg[0] ;
                  A1242GuiFasPMt = P005715_A1242GuiFasPMt[0] ;
                  A1240GuiFasLin = P005715_A1240GuiFasLin[0] ;
                  A460FasDsc = P005715_A460FasDsc[0] ;
                  A2242AlbSec = P005715_A2242AlbSec[0] ;
                  A212BarSer = P005715_A212BarSer[0] ;
                  A143BarDisNum = P005715_A143BarDisNum[0] ;
                  A1503BarPart = P005715_A1503BarPart[0] ;
                  A4812BarEncCli = P005715_A4812BarEncCli[0] ;
                  A1458BarAlbBul = P005715_A1458BarAlbBul[0] ;
                  AV18NumLin = (int)(AV18NumLin+1) ;
                  if ( AV18NumLin > 999 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV19Metros = A1276FasMtr ;
                  AV20Kilos = A1275FasKgm ;
                  AV21PrecioKg = A1241GuiFasPKg ;
                  AV22PrecioMt = A1242GuiFasPMt ;
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19Metros)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV22PrecioMt)==0) )
                  {
                     AV22PrecioMt = DecimalUtil.ZERO ;
                  }
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20Kilos)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV21PrecioKg)==0) )
                  {
                     AV21PrecioKg = DecimalUtil.ZERO ;
                  }
                  if ( AV60Magosa == 1 )
                  {
                     AV21PrecioKg = DecimalUtil.doubleToDec(0) ;
                     AV22PrecioMt = DecimalUtil.doubleToDec(0) ;
                  }
                  /*
                     INSERT RECORD ON TABLE TXPLFAVEN

                  */
                  A430FacCod = AV15NumFac ;
                  A446FacLin = AV18NumLin ;
                  A427FacAlbCod = A30AlbProCod ;
                  A1294FacBarCod = A129BarCod ;
                  A1295FacBarReo = A132BarCodReo ;
                  A1296FacBarPar = A130BarCodPar ;
                  A428FacAlbTip = (byte)(1) ;
                  A454FacSer = A212BarSer ;
                  A448FacPreKgs = AV21PrecioKg ;
                  A449FacPreMts = AV22PrecioMt ;
                  A444FacKgs = AV20Kilos ;
                  A447FacMts = AV19Metros ;
                  A432FacDsc = A460FasDsc ;
                  if ( AV34FlagJime == 1 )
                  {
                     A1498FacDisNum = A457FasCod ;
                  }
                  else
                  {
                     if ( (0==AV31FlagSal) )
                     {
                        A1498FacDisNum = A143BarDisNum ;
                     }
                     else
                     {
                        A1498FacDisNum = GXutil.str( A1458BarAlbBul, 4, 0) ;
                     }
                  }
                  A3397FacFasCod = A457FasCod ;
                  A3303FacNPart = A1503BarPart ;
                  if ( ( AV45Texknit == 1 ) || ( AV52Martex == 1 ) )
                  {
                     A3097FacTipPro = httpContext.getMessage( "F", "") ;
                  }
                  else
                  {
                     A3097FacTipPro = A2242AlbSec ;
                  }
                  A4814FacEncCli = A4812BarEncCli ;
                  A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                  A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                  A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                  A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                  if ( AV64Moda21 == 1 )
                  {
                     A451FacRec = DecimalUtil.doubleToDec(0) ;
                     A3898FacPreKgsA = DecimalUtil.doubleToDec(0) ;
                     A3897FacKgsA = DecimalUtil.doubleToDec(0) ;
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A7751GuiFasDto)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A7752GuiFasRec)==0) )
                     {
                        A451FacRec = A7752GuiFasRec ;
                        A5050FacBonLi = A7751GuiFasDto ;
                        A3898FacPreKgsA = ((AV21PrecioKg.multiply(AV20Kilos).multiply(A7752GuiFasRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)).subtract((AV21PrecioKg.multiply(AV20Kilos).multiply(A7751GuiFasDto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)))).add(((AV22PrecioMt.multiply(AV19Metros).multiply(A7752GuiFasRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)).subtract((AV22PrecioMt.multiply(AV19Metros).multiply(A7751GuiFasDto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))) ;
                        A3897FacKgsA = DecimalUtil.doubleToDec(1) ;
                     }
                  }
                  /* Using cursor P005716 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, A3097FacTipPro, Short.valueOf(A3303FacNPart), A3397FacFasCod, A3898FacPreKgsA, A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin, A3897FacKgsA});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                  if ( (pr_default.getStatus(13) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  /* End Insert */
                  GXt_decimal3 = DecimalUtil.doubleToDec(AV50TotAlb) ;
                  GXv_char11[0] = A396EmprCod ;
                  GXv_int15[0] = AV15NumFac ;
                  GXv_int13[0] = AV18NumLin ;
                  GXv_decimal7[0] = GXt_decimal3 ;
                  new app.pfacimli(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_int13, GXv_decimal7) ;
                  pafealb.this.A396EmprCod = GXv_char11[0] ;
                  pafealb.this.AV15NumFac = GXv_int15[0] ;
                  pafealb.this.AV18NumLin = GXv_int13[0] ;
                  pafealb.this.GXt_decimal3 = GXv_decimal7[0] ;
                  AV50TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV50TotAlb).add((GXt_decimal3)))) ;
                  pr_default.readNext(12);
               }
               pr_default.close(12);
               if ( (0==AV35FlagFacPro) )
               {
                  /* Execute user subroutine: 'PROCESO' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(3);
                     pr_default.close(3);
                     pr_default.close(3);
                     pr_default.close(3);
                     pr_default.close(3);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
               /* Using cursor P005717 */
               pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(14) != 101) )
               {
                  A212BarSer = P005717_A212BarSer[0] ;
                  A2765AlbHdrTxt = P005717_A2765AlbHdrTxt[0] ;
                  A143BarDisNum = P005717_A143BarDisNum[0] ;
                  A1503BarPart = P005717_A1503BarPart[0] ;
                  A4812BarEncCli = P005717_A4812BarEncCli[0] ;
                  A2770ALbHdrMts = P005717_A2770ALbHdrMts[0] ;
                  A2768AlbHdrKgs = P005717_A2768AlbHdrKgs[0] ;
                  A2767AlbHdrPKg = P005717_A2767AlbHdrPKg[0] ;
                  A2769AlbHdrPMt = P005717_A2769AlbHdrPMt[0] ;
                  A2764AlbHdrLin = P005717_A2764AlbHdrLin[0] ;
                  A212BarSer = P005717_A212BarSer[0] ;
                  A143BarDisNum = P005717_A143BarDisNum[0] ;
                  A1503BarPart = P005717_A1503BarPart[0] ;
                  A4812BarEncCli = P005717_A4812BarEncCli[0] ;
                  AV18NumLin = (int)(AV18NumLin+1) ;
                  if ( AV18NumLin > 999 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
                  AV19Metros = A2770ALbHdrMts ;
                  AV20Kilos = A2768AlbHdrKgs ;
                  AV21PrecioKg = A2767AlbHdrPKg ;
                  AV22PrecioMt = A2769AlbHdrPMt ;
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19Metros)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV22PrecioMt)==0) )
                  {
                     AV22PrecioMt = DecimalUtil.ZERO ;
                  }
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20Kilos)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV21PrecioKg)==0) )
                  {
                     AV21PrecioKg = DecimalUtil.ZERO ;
                  }
                  /*
                     INSERT RECORD ON TABLE TXPLFAVEN

                  */
                  A430FacCod = AV15NumFac ;
                  A446FacLin = AV18NumLin ;
                  A427FacAlbCod = A30AlbProCod ;
                  A1294FacBarCod = A129BarCod ;
                  A1295FacBarReo = A132BarCodReo ;
                  A1296FacBarPar = A130BarCodPar ;
                  A428FacAlbTip = (byte)(1) ;
                  A454FacSer = A212BarSer ;
                  A448FacPreKgs = AV21PrecioKg ;
                  A449FacPreMts = AV22PrecioMt ;
                  A444FacKgs = AV20Kilos ;
                  A447FacMts = AV19Metros ;
                  A432FacDsc = A2765AlbHdrTxt ;
                  A1498FacDisNum = A143BarDisNum ;
                  A3303FacNPart = A1503BarPart ;
                  A4814FacEncCli = A4812BarEncCli ;
                  A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                  A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                  A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                  A3397FacFasCod = httpContext.getMessage( "ZZZZZZZZ", "") ;
                  /* Using cursor P005718 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), A3397FacFasCod, A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                  if ( (pr_default.getStatus(15) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  /* End Insert */
                  GXt_decimal3 = DecimalUtil.doubleToDec(AV50TotAlb) ;
                  GXv_char11[0] = A396EmprCod ;
                  GXv_int15[0] = AV15NumFac ;
                  GXv_int13[0] = AV18NumLin ;
                  GXv_decimal7[0] = GXt_decimal3 ;
                  new app.pfacimli(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_int13, GXv_decimal7) ;
                  pafealb.this.A396EmprCod = GXv_char11[0] ;
                  pafealb.this.AV15NumFac = GXv_int15[0] ;
                  pafealb.this.AV18NumLin = GXv_int13[0] ;
                  pafealb.this.GXt_decimal3 = GXv_decimal7[0] ;
                  AV50TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV50TotAlb).add((GXt_decimal3)))) ;
                  pr_default.readNext(14);
               }
               pr_default.close(14);
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( ( AV51FlagBonAlb == 1 ) && ( GXutil.strcmp(AV49BonToP, httpContext.getMessage( "T", "")) == 0 ) )
            {
               AV18NumLin = (int)(AV18NumLin+1) ;
               if ( AV18NumLin < 1000 )
               {
                  /*
                     INSERT RECORD ON TABLE TXPLFAVEN

                  */
                  A430FacCod = AV15NumFac ;
                  A446FacLin = AV18NumLin ;
                  A427FacAlbCod = A30AlbProCod ;
                  A1294FacBarCod = 99999999 ;
                  A1295FacBarReo = (byte)(0) ;
                  A1296FacBarPar = " " ;
                  A428FacAlbTip = (byte)(1) ;
                  A454FacSer = httpContext.getMessage( "BONIFICACION", "") ;
                  A448FacPreKgs = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV50TotAlb).multiply(AV48AlbProBon).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2).multiply(DecimalUtil.doubleToDec((-1))) ;
                  A449FacPreMts = DecimalUtil.doubleToDec(0) ;
                  A444FacKgs = DecimalUtil.doubleToDec(1) ;
                  A447FacMts = DecimalUtil.doubleToDec(0) ;
                  if ( AV45Texknit == 1 )
                  {
                     A432FacDsc = httpContext.getMessage( "Bonificació ", "") + GXutil.trim( GXutil.str( AV48AlbProBon, 6, 2)) + "%" ;
                  }
                  A3397FacFasCod = httpContext.getMessage( "BONIFTOT", "") ;
                  A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                  A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                  A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                  /* Using cursor P005719 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A3397FacFasCod, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                  if ( (pr_default.getStatus(16) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  /* End Insert */
               }
            }
            if ( AV18NumLin > 999 )
            {
               httpContext.GX_msglist.addItem(AV63Msg_fra);
            }
            A33AlbProEst = (byte)(2) ;
            A1782AlbProEso = (byte)(2) ;
            /* Using cursor P005720 */
            pr_default.execute(17, new Object[] {Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      if ( AV16AlbTip == 2 )
      {
         /* Using cursor P005721 */
         pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(AV17PALB)});
         while ( (pr_default.getStatus(18) != 101) )
         {
            A14AlbComCod = P005721_A14AlbComCod[0] ;
            A16AlbComEst = P005721_A16AlbComEst[0] ;
            A1783AlbComEso = P005721_A1783AlbComEso[0] ;
            /* Using cursor P005722 */
            pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
            while ( (pr_default.getStatus(19) != 101) )
            {
               A15AlbComDsc = P005722_A15AlbComDsc[0] ;
               A13AlbComCnt = P005722_A13AlbComCnt[0] ;
               A21AlbComPre = P005722_A21AlbComPre[0] ;
               A3094AlbCSec = P005722_A3094AlbCSec[0] ;
               A20AlbComLin = P005722_A20AlbComLin[0] ;
               A3094AlbCSec = P005722_A3094AlbCSec[0] ;
               AV18NumLin = (int)(AV18NumLin+1) ;
               if ( AV18NumLin > 999 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               /*
                  INSERT RECORD ON TABLE TXPLFAVEN

               */
               A430FacCod = AV15NumFac ;
               A446FacLin = AV18NumLin ;
               A427FacAlbCod = A14AlbComCod ;
               A428FacAlbTip = (byte)(2) ;
               A432FacDsc = A15AlbComDsc ;
               if ( AV47Tintex == 0 )
               {
                  A447FacMts = A13AlbComCnt ;
                  A449FacPreMts = A21AlbComPre ;
               }
               else
               {
                  A444FacKgs = A13AlbComCnt ;
                  A448FacPreKgs = A21AlbComPre ;
               }
               A3397FacFasCod = " " ;
               A3097FacTipPro = A3094AlbCSec ;
               A454FacSer = httpContext.getMessage( "COMERCIAL", "") ;
               if ( AV36Guasch == 1 )
               {
                  GXt_char16 = A454FacSer ;
                  GXv_char11[0] = A396EmprCod ;
                  GXv_char9[0] = A3094AlbCSec ;
                  GXv_char8[0] = GXt_char16 ;
                  new app.pbusccon(remoteHandle, context).execute( GXv_char11, GXv_char9, GXv_char8) ;
                  pafealb.this.A396EmprCod = GXv_char11[0] ;
                  pafealb.this.A3094AlbCSec = GXv_char9[0] ;
                  pafealb.this.GXt_char16 = GXv_char8[0] ;
                  A454FacSer = GXt_char16 ;
                  A3097FacTipPro = A3094AlbCSec ;
               }
               if ( AV44FlagHss == 1 )
               {
                  A454FacSer = httpContext.getMessage( "VENTAS VARIAS", "") ;
                  A3303FacNPart = A20AlbComLin ;
               }
               A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P005723 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A3097FacTipPro, Short.valueOf(A3303FacNPart), A3397FacFasCod, A5050FacBonLi});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
               if ( (pr_default.getStatus(20) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               /* End Insert */
               pr_default.readNext(19);
            }
            pr_default.close(19);
            if ( AV18NumLin > 999 )
            {
               httpContext.GX_msglist.addItem(AV63Msg_fra);
            }
            A16AlbComEst = (byte)(2) ;
            A1783AlbComEso = (byte)(2) ;
            /* Using cursor P005724 */
            pr_default.execute(21, new Object[] {Byte.valueOf(A16AlbComEst), Byte.valueOf(A1783AlbComEso), A396EmprCod, Integer.valueOf(A14AlbComCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(18);
      }
      /* Using cursor P005725 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(AV15NumFac)});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A430FacCod = P005725_A430FacCod[0] ;
         A445FacLiC = P005725_A445FacLiC[0] ;
         if ( AV18NumLin > 999999 )
         {
            A445FacLiC = 999999 ;
         }
         else
         {
            A445FacLiC = AV18NumLin ;
         }
         /* Using cursor P005726 */
         pr_default.execute(23, new Object[] {Integer.valueOf(A445FacLiC), A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(22);
      new app.pcalvto(remoteHandle, context).execute( A396EmprCod, AV15NumFac) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'PROCESO' Routine */
      returnInSub = false ;
      /* Using cursor P005727 */
      pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(AV37AlbProCod), Integer.valueOf(AV38BarCod), Byte.valueOf(AV39BarCodReo), AV40BarCodPar});
      while ( (pr_default.getStatus(24) != 101) )
      {
         A30AlbProCod = P005727_A30AlbProCod[0] ;
         A129BarCod = P005727_A129BarCod[0] ;
         A132BarCodReo = P005727_A132BarCodReo[0] ;
         A130BarCodPar = P005727_A130BarCodPar[0] ;
         A212BarSer = P005727_A212BarSer[0] ;
         A759ProDsc = P005727_A759ProDsc[0] ;
         A1458BarAlbBul = P005727_A1458BarAlbBul[0] ;
         A1503BarPart = P005727_A1503BarPart[0] ;
         A758ProCod = P005727_A758ProCod[0] ;
         n758ProCod = P005727_n758ProCod[0] ;
         A135BarColNom = P005727_A135BarColNom[0] ;
         A136BarColNum = P005727_A136BarColNum[0] ;
         A864BarPes = P005727_A864BarPes[0] ;
         A4812BarEncCli = P005727_A4812BarEncCli[0] ;
         A1472PrdMtr = P005727_A1472PrdMtr[0] ;
         n1472PrdMtr = P005727_n1472PrdMtr[0] ;
         A1471PrdKgm = P005727_A1471PrdKgm[0] ;
         n1471PrdKgm = P005727_n1471PrdKgm[0] ;
         A1469AlbPrdPKg = P005727_A1469AlbPrdPKg[0] ;
         n1469AlbPrdPKg = P005727_n1469AlbPrdPKg[0] ;
         A1470AlbPrdPMt = P005727_A1470AlbPrdPMt[0] ;
         n1470AlbPrdPMt = P005727_n1470AlbPrdPMt[0] ;
         A4333ProPorRec = P005727_A4333ProPorRec[0] ;
         n4333ProPorRec = P005727_n4333ProPorRec[0] ;
         A4332ProPreRec = P005727_A4332ProPreRec[0] ;
         n4332ProPreRec = P005727_n4332ProPreRec[0] ;
         A1468AlbPrdLin = P005727_A1468AlbPrdLin[0] ;
         A212BarSer = P005727_A212BarSer[0] ;
         A1503BarPart = P005727_A1503BarPart[0] ;
         A135BarColNom = P005727_A135BarColNom[0] ;
         A136BarColNum = P005727_A136BarColNum[0] ;
         A864BarPes = P005727_A864BarPes[0] ;
         A4812BarEncCli = P005727_A4812BarEncCli[0] ;
         A759ProDsc = P005727_A759ProDsc[0] ;
         A1458BarAlbBul = P005727_A1458BarAlbBul[0] ;
         AV18NumLin = (int)(AV18NumLin+1) ;
         if ( AV18NumLin > 999 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV19Metros = A1472PrdMtr ;
         AV20Kilos = A1471PrdKgm ;
         AV21PrecioKg = A1469AlbPrdPKg ;
         AV22PrecioMt = A1470AlbPrdPMt ;
         AV55ProPorRec = A4333ProPorRec ;
         AV56ProPreRec = A4332ProPreRec ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19Metros)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV22PrecioMt)==0) )
         {
            AV22PrecioMt = DecimalUtil.ZERO ;
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20Kilos)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV21PrecioKg)==0) )
         {
            AV21PrecioKg = DecimalUtil.ZERO ;
         }
         /*
            INSERT RECORD ON TABLE TXPLFAVEN

         */
         A430FacCod = AV15NumFac ;
         A446FacLin = AV18NumLin ;
         A427FacAlbCod = A30AlbProCod ;
         A1294FacBarCod = A129BarCod ;
         A1295FacBarReo = A132BarCodReo ;
         A1296FacBarPar = A130BarCodPar ;
         A428FacAlbTip = (byte)(1) ;
         A454FacSer = A212BarSer ;
         A448FacPreKgs = AV21PrecioKg ;
         A449FacPreMts = AV22PrecioMt ;
         A444FacKgs = AV20Kilos ;
         A447FacMts = AV19Metros ;
         A432FacDsc = A759ProDsc ;
         A1498FacDisNum = AV25BarDisNum ;
         if ( AV31FlagSal == 1 )
         {
            A1498FacDisNum = GXutil.str( A1458BarAlbBul, 4, 0) ;
         }
         A3303FacNPart = A1503BarPart ;
         A3397FacFasCod = A758ProCod ;
         if ( AV36Guasch == 1 )
         {
            A3884FacProCod = A758ProCod ;
            A3881FacNomCol = A135BarColNom ;
            A3882FacNumCol = A136BarColNum ;
            A3303FacNPart = A864BarPes ;
            A451FacRec = AV56ProPreRec ;
            A3897FacKgsA = AV55ProPorRec ;
         }
         if ( ( AV45Texknit == 1 ) || ( AV52Martex == 1 ) )
         {
            A3097FacTipPro = httpContext.getMessage( "P", "") ;
         }
         A4814FacEncCli = A4812BarEncCli ;
         A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
         A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
         A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P005728 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, A3097FacTipPro, Short.valueOf(A3303FacNPart), A3397FacFasCod, A3881FacNomCol, Integer.valueOf(A3882FacNumCol), A3884FacProCod, A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin, A3897FacKgsA});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
         if ( (pr_default.getStatus(25) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         GXt_decimal3 = DecimalUtil.doubleToDec(AV50TotAlb) ;
         GXv_char11[0] = A396EmprCod ;
         GXv_int15[0] = AV15NumFac ;
         GXv_int13[0] = AV18NumLin ;
         GXv_decimal7[0] = GXt_decimal3 ;
         new app.pfacimli(remoteHandle, context).execute( GXv_char11, GXv_int15, GXv_int13, GXv_decimal7) ;
         pafealb.this.A396EmprCod = GXv_char11[0] ;
         pafealb.this.AV15NumFac = GXv_int15[0] ;
         pafealb.this.AV18NumLin = GXv_int13[0] ;
         pafealb.this.GXt_decimal3 = GXv_decimal7[0] ;
         AV50TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV50TotAlb).add((GXt_decimal3)))) ;
         pr_default.readNext(24);
      }
      pr_default.close(24);
   }

   public void S121( )
   {
      /* 'OBSFAC' Routine */
      returnInSub = false ;
      AV41ArtObsFac = "" ;
      /* Using cursor P005729 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(AV43CliCod), AV42BarSer});
      while ( (pr_default.getStatus(26) != 101) )
      {
         A65ArtCod = P005729_A65ArtCod[0] ;
         A252CliCod = P005729_A252CliCod[0] ;
         n252CliCod = P005729_n252CliCod[0] ;
         A90ArtObsFac = P005729_A90ArtObsFac[0] ;
         n90ArtObsFac = P005729_n90ArtObsFac[0] ;
         AV41ArtObsFac = A90ArtObsFac ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(26);
   }

   public void S131( )
   {
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      AV57CliImpMin = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P005730 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(AV43CliCod)});
      while ( (pr_default.getStatus(27) != 101) )
      {
         A252CliCod = P005730_A252CliCod[0] ;
         n252CliCod = P005730_n252CliCod[0] ;
         A2028CliImpMin = P005730_A2028CliImpMin[0] ;
         n2028CliImpMin = P005730_n2028CliImpMin[0] ;
         AV57CliImpMin = A2028CliImpMin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(27);
   }

   public void S141( )
   {
      /* 'BARPIE' Routine */
      returnInSub = false ;
      AV70barPiekil = DecimalUtil.doubleToDec(0) ;
      AV71barpiemet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P005731 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(AV38BarCod), Byte.valueOf(AV39BarCodReo), AV40BarCodPar, AV75BarPiecod});
      while ( (pr_default.getStatus(28) != 101) )
      {
         A200BarPieCod = P005731_A200BarPieCod[0] ;
         A130BarCodPar = P005731_A130BarCodPar[0] ;
         A132BarCodReo = P005731_A132BarCodReo[0] ;
         A129BarCod = P005731_A129BarCod[0] ;
         A203BarPieKil = P005731_A203BarPieKil[0] ;
         A205BarPieMet = P005731_A205BarPieMet[0] ;
         AV70barPiekil = A203BarPieKil ;
         AV71barpiemet = A205BarPieMet ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(28);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pafealb.this.A396EmprCod;
      this.aP1[0] = pafealb.this.AV15NumFac;
      this.aP2[0] = pafealb.this.AV16AlbTip;
      this.aP3[0] = pafealb.this.AV17PALB;
      this.aP4[0] = pafealb.this.AV65FacHor;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pafealb");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV63Msg_fra = "" ;
      scmdbuf = "" ;
      P00572_A396EmprCod = new String[] {""} ;
      P00572_A430FacCod = new int[1] ;
      P00572_A12523FacTpFra = new String[] {""} ;
      A12523FacTpFra = "" ;
      AV69FacTpFra = "" ;
      P00573_A396EmprCod = new String[] {""} ;
      P00573_A430FacCod = new int[1] ;
      P00573_A446FacLin = new int[1] ;
      P00574_A396EmprCod = new String[] {""} ;
      P00574_A30AlbProCod = new long[1] ;
      P00574_A1243GuiRemCli = new int[1] ;
      P00574_A5041AlbProTBo = new String[] {""} ;
      P00574_n5041AlbProTBo = new boolean[] {false} ;
      P00574_A5040AlbProBon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00574_n5040AlbProBon = new boolean[] {false} ;
      P00574_A33AlbProEst = new byte[1] ;
      P00574_A1782AlbProEso = new byte[1] ;
      A5041AlbProTBo = "" ;
      A5040AlbProBon = DecimalUtil.ZERO ;
      AV49BonToP = "" ;
      AV48AlbProBon = DecimalUtil.ZERO ;
      P00576_A396EmprCod = new String[] {""} ;
      P00576_A30AlbProCod = new long[1] ;
      P00576_A1208TubPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00576_n1208TubPre = new boolean[] {false} ;
      P00576_A1266BarAlbTub = new int[1] ;
      P00576_A1207TubNom = new String[] {""} ;
      P00576_n1207TubNom = new boolean[] {false} ;
      P00576_A212BarSer = new String[] {""} ;
      P00576_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00576_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00576_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00576_A136BarColNum = new int[1] ;
      P00576_A135BarColNom = new String[] {""} ;
      P00576_A143BarDisNum = new String[] {""} ;
      P00576_A2242AlbSec = new String[] {""} ;
      P00576_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00576_A218BarTipCol = new byte[1] ;
      P00576_A1234BarNomCli = new String[] {""} ;
      P00576_A1235BarNumCli = new int[1] ;
      P00576_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00576_A2762AlbBarDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00576_n2762AlbBarDto = new boolean[] {false} ;
      P00576_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00576_A252CliCod = new int[1] ;
      P00576_n252CliCod = new boolean[] {false} ;
      P00576_A4466BarAcaAnh = new short[1] ;
      P00576_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00576_A1503BarPart = new short[1] ;
      P00576_A4812BarEncCli = new String[] {""} ;
      P00576_A130BarCodPar = new String[] {""} ;
      P00576_A132BarCodReo = new byte[1] ;
      P00576_A129BarCod = new int[1] ;
      P00576_A1798BarDibCli = new String[] {""} ;
      P00576_A1206TubCod = new short[1] ;
      P00576_n1206TubCod = new boolean[] {false} ;
      P00576_A6466PlasCod = new short[1] ;
      P00576_n6466PlasCod = new boolean[] {false} ;
      P00576_A6467BarAlbPlas = new short[1] ;
      P00576_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00576_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1208TubPre = DecimalUtil.ZERO ;
      A1207TubNom = "" ;
      A212BarSer = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A135BarColNom = "" ;
      A143BarDisNum = "" ;
      A2242AlbSec = "" ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A2762AlbBarDto = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A4812BarEncCli = "" ;
      A130BarCodPar = "" ;
      A1798BarDibCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV42BarSer = "" ;
      AV40BarCodPar = "" ;
      P00577_A396EmprCod = new String[] {""} ;
      P00577_A129BarCod = new int[1] ;
      P00577_A132BarCodReo = new byte[1] ;
      P00577_A130BarCodPar = new String[] {""} ;
      P00577_A761ProFasLin = new short[1] ;
      P00577_n761ProFasLin = new boolean[] {false} ;
      P00577_A758ProCod = new String[] {""} ;
      P00577_n758ProCod = new boolean[] {false} ;
      A758ProCod = "" ;
      AV66Procod = "" ;
      AV72BarKgm = DecimalUtil.ZERO ;
      AV73BarMtr = DecimalUtil.ZERO ;
      P00578_A396EmprCod = new String[] {""} ;
      P00578_A30AlbProCod = new long[1] ;
      P00578_A129BarCod = new int[1] ;
      P00578_A132BarCodReo = new byte[1] ;
      P00578_A130BarCodPar = new String[] {""} ;
      P00578_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00578_A200BarPieCod = new String[] {""} ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV75BarPiecod = "" ;
      AV70barPiekil = DecimalUtil.ZERO ;
      AV71barpiemet = DecimalUtil.ZERO ;
      AV41ArtObsFac = "" ;
      A454FacSer = "" ;
      A432FacDsc = "" ;
      A1498FacDisNum = "" ;
      AV25BarDisNum = "" ;
      A4814FacEncCli = "" ;
      A5050FacBonLi = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A3397FacFasCod = "" ;
      Gx_emsg = "" ;
      A1296FacBarPar = "" ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A451FacRec = DecimalUtil.ZERO ;
      A3097FacTipPro = "" ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A3878FacColNom = "" ;
      A3881FacNomCol = "" ;
      AV57CliImpMin = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A3884FacProCod = "" ;
      GXv_char4 = new String[1] ;
      A444FacKgs = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      AV29BarDibCli = "" ;
      P005712_A396EmprCod = new String[] {""} ;
      P005712_A30AlbProCod = new long[1] ;
      P005712_A129BarCod = new int[1] ;
      P005712_A132BarCodReo = new byte[1] ;
      P005712_A130BarCodPar = new String[] {""} ;
      P005712_A212BarSer = new String[] {""} ;
      P005712_A1536AlbEComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005712_n1536AlbEComPre = new boolean[] {false} ;
      P005712_A1533AlbEComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005712_n1533AlbEComM = new boolean[] {false} ;
      P005712_A1056DisComCod = new String[] {""} ;
      P005712_A1032FonCod = new String[] {""} ;
      P005712_A4812BarEncCli = new String[] {""} ;
      P005712_A2524DisComLin = new byte[1] ;
      A1536AlbEComPre = DecimalUtil.ZERO ;
      A1533AlbEComM = DecimalUtil.ZERO ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      GXv_int12 = new long[1] ;
      GXv_int6 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_int5 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_int14 = new short[1] ;
      P005715_A396EmprCod = new String[] {""} ;
      P005715_A30AlbProCod = new long[1] ;
      P005715_A129BarCod = new int[1] ;
      P005715_A132BarCodReo = new byte[1] ;
      P005715_A130BarCodPar = new String[] {""} ;
      P005715_A212BarSer = new String[] {""} ;
      P005715_A460FasDsc = new String[] {""} ;
      P005715_A457FasCod = new String[] {""} ;
      P005715_A143BarDisNum = new String[] {""} ;
      P005715_A1458BarAlbBul = new short[1] ;
      P005715_A1503BarPart = new short[1] ;
      P005715_A2242AlbSec = new String[] {""} ;
      P005715_A4812BarEncCli = new String[] {""} ;
      P005715_A7752GuiFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005715_n7752GuiFasRec = new boolean[] {false} ;
      P005715_A7751GuiFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005715_n7751GuiFasDto = new boolean[] {false} ;
      P005715_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005715_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005715_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005715_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005715_A1240GuiFasLin = new short[1] ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A7752GuiFasRec = DecimalUtil.ZERO ;
      A7751GuiFasDto = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      AV19Metros = DecimalUtil.ZERO ;
      AV20Kilos = DecimalUtil.ZERO ;
      AV21PrecioKg = DecimalUtil.ZERO ;
      AV22PrecioMt = DecimalUtil.ZERO ;
      P005717_A396EmprCod = new String[] {""} ;
      P005717_A30AlbProCod = new long[1] ;
      P005717_A129BarCod = new int[1] ;
      P005717_A132BarCodReo = new byte[1] ;
      P005717_A130BarCodPar = new String[] {""} ;
      P005717_A212BarSer = new String[] {""} ;
      P005717_A2765AlbHdrTxt = new String[] {""} ;
      P005717_A143BarDisNum = new String[] {""} ;
      P005717_A1503BarPart = new short[1] ;
      P005717_A4812BarEncCli = new String[] {""} ;
      P005717_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005717_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005717_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005717_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005717_A2764AlbHdrLin = new short[1] ;
      A2765AlbHdrTxt = "" ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      P005721_A396EmprCod = new String[] {""} ;
      P005721_A14AlbComCod = new int[1] ;
      P005721_A16AlbComEst = new byte[1] ;
      P005721_A1783AlbComEso = new byte[1] ;
      P005722_A396EmprCod = new String[] {""} ;
      P005722_A14AlbComCod = new int[1] ;
      P005722_A15AlbComDsc = new String[] {""} ;
      P005722_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005722_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005722_A3094AlbCSec = new String[] {""} ;
      P005722_A20AlbComLin = new short[1] ;
      A15AlbComDsc = "" ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A21AlbComPre = DecimalUtil.ZERO ;
      A3094AlbCSec = "" ;
      GXt_char16 = "" ;
      GXv_char9 = new String[1] ;
      GXv_char8 = new String[1] ;
      P005725_A396EmprCod = new String[] {""} ;
      P005725_A430FacCod = new int[1] ;
      P005725_A445FacLiC = new int[1] ;
      P005727_A396EmprCod = new String[] {""} ;
      P005727_A30AlbProCod = new long[1] ;
      P005727_A129BarCod = new int[1] ;
      P005727_A132BarCodReo = new byte[1] ;
      P005727_A130BarCodPar = new String[] {""} ;
      P005727_A212BarSer = new String[] {""} ;
      P005727_A759ProDsc = new String[] {""} ;
      P005727_A1458BarAlbBul = new short[1] ;
      P005727_A1503BarPart = new short[1] ;
      P005727_A758ProCod = new String[] {""} ;
      P005727_n758ProCod = new boolean[] {false} ;
      P005727_A135BarColNom = new String[] {""} ;
      P005727_A136BarColNum = new int[1] ;
      P005727_A864BarPes = new short[1] ;
      P005727_A4812BarEncCli = new String[] {""} ;
      P005727_A1472PrdMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005727_n1472PrdMtr = new boolean[] {false} ;
      P005727_A1471PrdKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005727_n1471PrdKgm = new boolean[] {false} ;
      P005727_A1469AlbPrdPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005727_n1469AlbPrdPKg = new boolean[] {false} ;
      P005727_A1470AlbPrdPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005727_n1470AlbPrdPMt = new boolean[] {false} ;
      P005727_A4333ProPorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005727_n4333ProPorRec = new boolean[] {false} ;
      P005727_A4332ProPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005727_n4332ProPreRec = new boolean[] {false} ;
      P005727_A1468AlbPrdLin = new short[1] ;
      A759ProDsc = "" ;
      A1472PrdMtr = DecimalUtil.ZERO ;
      A1471PrdKgm = DecimalUtil.ZERO ;
      A1469AlbPrdPKg = DecimalUtil.ZERO ;
      A1470AlbPrdPMt = DecimalUtil.ZERO ;
      A4333ProPorRec = DecimalUtil.ZERO ;
      A4332ProPreRec = DecimalUtil.ZERO ;
      AV55ProPorRec = DecimalUtil.ZERO ;
      AV56ProPreRec = DecimalUtil.ZERO ;
      GXt_decimal3 = DecimalUtil.ZERO ;
      GXv_char11 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_int13 = new int[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      P005729_A396EmprCod = new String[] {""} ;
      P005729_A65ArtCod = new String[] {""} ;
      P005729_A252CliCod = new int[1] ;
      P005729_n252CliCod = new boolean[] {false} ;
      P005729_A90ArtObsFac = new String[] {""} ;
      P005729_n90ArtObsFac = new boolean[] {false} ;
      A65ArtCod = "" ;
      A90ArtObsFac = "" ;
      P005730_A396EmprCod = new String[] {""} ;
      P005730_A252CliCod = new int[1] ;
      P005730_n252CliCod = new boolean[] {false} ;
      P005730_A2028CliImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005730_n2028CliImpMin = new boolean[] {false} ;
      A2028CliImpMin = DecimalUtil.ZERO ;
      P005731_A396EmprCod = new String[] {""} ;
      P005731_A200BarPieCod = new String[] {""} ;
      P005731_A130BarCodPar = new String[] {""} ;
      P005731_A132BarCodReo = new byte[1] ;
      P005731_A129BarCod = new int[1] ;
      P005731_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005731_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pafealb__default(),
         new Object[] {
             new Object[] {
            P00572_A396EmprCod, P00572_A430FacCod, P00572_A12523FacTpFra
            }
            , new Object[] {
            P00573_A396EmprCod, P00573_A430FacCod, P00573_A446FacLin
            }
            , new Object[] {
            P00574_A396EmprCod, P00574_A30AlbProCod, P00574_A1243GuiRemCli, P00574_A5041AlbProTBo, P00574_n5041AlbProTBo, P00574_A5040AlbProBon, P00574_n5040AlbProBon, P00574_A33AlbProEst, P00574_A1782AlbProEso
            }
            , new Object[] {
            P00576_A396EmprCod, P00576_A30AlbProCod, P00576_A1208TubPre, P00576_n1208TubPre, P00576_A1266BarAlbTub, P00576_A1207TubNom, P00576_n1207TubNom, P00576_A212BarSer, P00576_A1262BarPreKgm, P00576_A1264BarPreMtr,
            P00576_A40AlbProRec, P00576_A136BarColNum, P00576_A135BarColNom, P00576_A143BarDisNum, P00576_A2242AlbSec, P00576_A2761AlbBarRec, P00576_A218BarTipCol, P00576_A1234BarNomCli, P00576_A1235BarNumCli, P00576_A5354AlbImpMan,
            P00576_A2762AlbBarDto, P00576_n2762AlbBarDto, P00576_A1261BarAlbKgmE, P00576_A252CliCod, P00576_n252CliCod, P00576_A4466BarAcaAnh, P00576_A1263BarAlbMtrE, P00576_A1503BarPart, P00576_A4812BarEncCli, P00576_A130BarCodPar,
            P00576_A132BarCodReo, P00576_A129BarCod, P00576_A1798BarDibCli, P00576_A1206TubCod, P00576_n1206TubCod, P00576_A6466PlasCod, P00576_n6466PlasCod, P00576_A6467BarAlbPlas, P00576_A166BarKgm, P00576_A184BarMtr
            }
            , new Object[] {
            P00577_A396EmprCod, P00577_A129BarCod, P00577_A132BarCodReo, P00577_A130BarCodPar, P00577_A761ProFasLin, P00577_n761ProFasLin, P00577_A758ProCod
            }
            , new Object[] {
            P00578_A396EmprCod, P00578_A30AlbProCod, P00578_A129BarCod, P00578_A132BarCodReo, P00578_A130BarCodPar, P00578_A27AlbPKilEnt, P00578_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P005712_A396EmprCod, P005712_A30AlbProCod, P005712_A129BarCod, P005712_A132BarCodReo, P005712_A130BarCodPar, P005712_A212BarSer, P005712_A1536AlbEComPre, P005712_n1536AlbEComPre, P005712_A1533AlbEComM, P005712_n1533AlbEComM,
            P005712_A1056DisComCod, P005712_A1032FonCod, P005712_A4812BarEncCli, P005712_A2524DisComLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P005715_A396EmprCod, P005715_A30AlbProCod, P005715_A129BarCod, P005715_A132BarCodReo, P005715_A130BarCodPar, P005715_A212BarSer, P005715_A460FasDsc, P005715_A457FasCod, P005715_A143BarDisNum, P005715_A1458BarAlbBul,
            P005715_A1503BarPart, P005715_A2242AlbSec, P005715_A4812BarEncCli, P005715_A7752GuiFasRec, P005715_n7752GuiFasRec, P005715_A7751GuiFasDto, P005715_n7751GuiFasDto, P005715_A1276FasMtr, P005715_A1275FasKgm, P005715_A1241GuiFasPKg,
            P005715_A1242GuiFasPMt, P005715_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P005717_A396EmprCod, P005717_A30AlbProCod, P005717_A129BarCod, P005717_A132BarCodReo, P005717_A130BarCodPar, P005717_A212BarSer, P005717_A2765AlbHdrTxt, P005717_A143BarDisNum, P005717_A1503BarPart, P005717_A4812BarEncCli,
            P005717_A2770ALbHdrMts, P005717_A2768AlbHdrKgs, P005717_A2767AlbHdrPKg, P005717_A2769AlbHdrPMt, P005717_A2764AlbHdrLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P005721_A396EmprCod, P005721_A14AlbComCod, P005721_A16AlbComEst, P005721_A1783AlbComEso
            }
            , new Object[] {
            P005722_A396EmprCod, P005722_A14AlbComCod, P005722_A15AlbComDsc, P005722_A13AlbComCnt, P005722_A21AlbComPre, P005722_A3094AlbCSec, P005722_A20AlbComLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P005725_A396EmprCod, P005725_A430FacCod, P005725_A445FacLiC
            }
            , new Object[] {
            }
            , new Object[] {
            P005727_A396EmprCod, P005727_A30AlbProCod, P005727_A129BarCod, P005727_A132BarCodReo, P005727_A130BarCodPar, P005727_A212BarSer, P005727_A759ProDsc, P005727_A1458BarAlbBul, P005727_A1503BarPart, P005727_A758ProCod,
            P005727_n758ProCod, P005727_A135BarColNom, P005727_A136BarColNum, P005727_A864BarPes, P005727_A4812BarEncCli, P005727_A1472PrdMtr, P005727_n1472PrdMtr, P005727_A1471PrdKgm, P005727_n1471PrdKgm, P005727_A1469AlbPrdPKg,
            P005727_n1469AlbPrdPKg, P005727_A1470AlbPrdPMt, P005727_n1470AlbPrdPMt, P005727_A4333ProPorRec, P005727_n4333ProPorRec, P005727_A4332ProPreRec, P005727_n4332ProPreRec, P005727_A1468AlbPrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            P005729_A396EmprCod, P005729_A65ArtCod, P005729_A252CliCod, P005729_A90ArtObsFac, P005729_n90ArtObsFac
            }
            , new Object[] {
            P005730_A396EmprCod, P005730_A252CliCod, P005730_A2028CliImpMin, P005730_n2028CliImpMin
            }
            , new Object[] {
            P005731_A396EmprCod, P005731_A200BarPieCod, P005731_A130BarCodPar, P005731_A132BarCodReo, P005731_A129BarCod, P005731_A203BarPieKil, P005731_A205BarPieMet
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16AlbTip ;
   private byte AV33FlagGav ;
   private byte AV35FlagFacPro ;
   private byte AV36Guasch ;
   private byte AV30FlagEst ;
   private byte AV51FlagBonAlb ;
   private byte AV54FlagPorRec ;
   private byte AV64Moda21 ;
   private byte AV68termilenio ;
   private byte GXt_int2 ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte AV39BarCodReo ;
   private byte AV74Lalprd ;
   private byte A428FacAlbTip ;
   private byte AV23LenSer ;
   private byte AV24LenColNom ;
   private byte A1295FacBarReo ;
   private byte A3880FacTipColC ;
   private byte AV67intcod ;
   private byte A12693FacInt ;
   private byte AV26LenDib ;
   private byte A2524DisComLin ;
   private byte AV27LenFon ;
   private byte AV28LenCom ;
   private byte GXv_int10[] ;
   private byte AV31FlagSal ;
   private byte GXv_int1[] ;
   private byte AV60Magosa ;
   private byte AV34FlagJime ;
   private byte AV45Texknit ;
   private byte AV52Martex ;
   private byte A16AlbComEst ;
   private byte A1783AlbComEso ;
   private byte AV47Tintex ;
   private byte AV44FlagHss ;
   private short AV50TotAlb ;
   private short A4466BarAcaAnh ;
   private short A1503BarPart ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short A761ProFasLin ;
   private short A3303FacNPart ;
   private short Gx_err ;
   private short A12906FacCadEnc ;
   private short GXv_int14[] ;
   private short A1458BarAlbBul ;
   private short A1240GuiFasLin ;
   private short A2764AlbHdrLin ;
   private short A20AlbComLin ;
   private short A864BarPes ;
   private short A1468AlbPrdLin ;
   private int AV15NumFac ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int AV18NumLin ;
   private int A1243GuiRemCli ;
   private int AV43CliCod ;
   private int A1266BarAlbTub ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV38BarCod ;
   private int GX_INS44 ;
   private int A1294FacBarCod ;
   private int A3879FocColNum ;
   private int A3882FacNumCol ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private int A14AlbComCod ;
   private int A445FacLiC ;
   private int GXv_int15[] ;
   private int GXv_int13[] ;
   private long AV17PALB ;
   private long A30AlbProCod ;
   private long AV37AlbProCod ;
   private long A427FacAlbCod ;
   private long GXv_int12[] ;
   private java.math.BigDecimal A5040AlbProBon ;
   private java.math.BigDecimal AV48AlbProBon ;
   private java.math.BigDecimal A1208TubPre ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A2762AlbBarDto ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV72BarKgm ;
   private java.math.BigDecimal AV73BarMtr ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal AV70barPiekil ;
   private java.math.BigDecimal AV71barpiemet ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A451FacRec ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal AV57CliImpMin ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A1536AlbEComPre ;
   private java.math.BigDecimal A1533AlbEComM ;
   private java.math.BigDecimal A7752GuiFasRec ;
   private java.math.BigDecimal A7751GuiFasDto ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal AV19Metros ;
   private java.math.BigDecimal AV20Kilos ;
   private java.math.BigDecimal AV21PrecioKg ;
   private java.math.BigDecimal AV22PrecioMt ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private java.math.BigDecimal A2767AlbHdrPKg ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal A21AlbComPre ;
   private java.math.BigDecimal A1472PrdMtr ;
   private java.math.BigDecimal A1471PrdKgm ;
   private java.math.BigDecimal A1469AlbPrdPKg ;
   private java.math.BigDecimal A1470AlbPrdPMt ;
   private java.math.BigDecimal A4333ProPorRec ;
   private java.math.BigDecimal A4332ProPreRec ;
   private java.math.BigDecimal AV55ProPorRec ;
   private java.math.BigDecimal AV56ProPreRec ;
   private java.math.BigDecimal GXt_decimal3 ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal A2028CliImpMin ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private String A396EmprCod ;
   private String AV63Msg_fra ;
   private String scmdbuf ;
   private String A12523FacTpFra ;
   private String AV69FacTpFra ;
   private String A5041AlbProTBo ;
   private String AV49BonToP ;
   private String A1207TubNom ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A143BarDisNum ;
   private String A2242AlbSec ;
   private String A1234BarNomCli ;
   private String A4812BarEncCli ;
   private String A130BarCodPar ;
   private String A1798BarDibCli ;
   private String AV42BarSer ;
   private String AV40BarCodPar ;
   private String A758ProCod ;
   private String AV66Procod ;
   private String A200BarPieCod ;
   private String AV75BarPiecod ;
   private String AV41ArtObsFac ;
   private String A454FacSer ;
   private String A432FacDsc ;
   private String A1498FacDisNum ;
   private String AV25BarDisNum ;
   private String A4814FacEncCli ;
   private String A3397FacFasCod ;
   private String Gx_emsg ;
   private String A1296FacBarPar ;
   private String A3097FacTipPro ;
   private String A3878FacColNom ;
   private String A3881FacNomCol ;
   private String A3884FacProCod ;
   private String GXv_char4[] ;
   private String AV29BarDibCli ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A2765AlbHdrTxt ;
   private String A15AlbComDsc ;
   private String A3094AlbCSec ;
   private String GXt_char16 ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String A759ProDsc ;
   private String GXv_char11[] ;
   private String A65ArtCod ;
   private String A90ArtObsFac ;
   private java.util.Date AV65FacHor ;
   private boolean n5041AlbProTBo ;
   private boolean n5040AlbProBon ;
   private boolean returnInSub ;
   private boolean n1208TubPre ;
   private boolean n1207TubNom ;
   private boolean n2762AlbBarDto ;
   private boolean n252CliCod ;
   private boolean n1206TubCod ;
   private boolean n6466PlasCod ;
   private boolean n761ProFasLin ;
   private boolean n758ProCod ;
   private boolean n1536AlbEComPre ;
   private boolean n1533AlbEComM ;
   private boolean n7752GuiFasRec ;
   private boolean n7751GuiFasDto ;
   private boolean n1472PrdMtr ;
   private boolean n1471PrdKgm ;
   private boolean n1469AlbPrdPKg ;
   private boolean n1470AlbPrdPMt ;
   private boolean n4333ProPorRec ;
   private boolean n4332ProPreRec ;
   private boolean n90ArtObsFac ;
   private boolean n2028CliImpMin ;
   private java.util.Date[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private long[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00572_A396EmprCod ;
   private int[] P00572_A430FacCod ;
   private String[] P00572_A12523FacTpFra ;
   private String[] P00573_A396EmprCod ;
   private int[] P00573_A430FacCod ;
   private int[] P00573_A446FacLin ;
   private String[] P00574_A396EmprCod ;
   private long[] P00574_A30AlbProCod ;
   private int[] P00574_A1243GuiRemCli ;
   private String[] P00574_A5041AlbProTBo ;
   private boolean[] P00574_n5041AlbProTBo ;
   private java.math.BigDecimal[] P00574_A5040AlbProBon ;
   private boolean[] P00574_n5040AlbProBon ;
   private byte[] P00574_A33AlbProEst ;
   private byte[] P00574_A1782AlbProEso ;
   private String[] P00576_A396EmprCod ;
   private long[] P00576_A30AlbProCod ;
   private java.math.BigDecimal[] P00576_A1208TubPre ;
   private boolean[] P00576_n1208TubPre ;
   private int[] P00576_A1266BarAlbTub ;
   private String[] P00576_A1207TubNom ;
   private boolean[] P00576_n1207TubNom ;
   private String[] P00576_A212BarSer ;
   private java.math.BigDecimal[] P00576_A1262BarPreKgm ;
   private java.math.BigDecimal[] P00576_A1264BarPreMtr ;
   private java.math.BigDecimal[] P00576_A40AlbProRec ;
   private int[] P00576_A136BarColNum ;
   private String[] P00576_A135BarColNom ;
   private String[] P00576_A143BarDisNum ;
   private String[] P00576_A2242AlbSec ;
   private java.math.BigDecimal[] P00576_A2761AlbBarRec ;
   private byte[] P00576_A218BarTipCol ;
   private String[] P00576_A1234BarNomCli ;
   private int[] P00576_A1235BarNumCli ;
   private java.math.BigDecimal[] P00576_A5354AlbImpMan ;
   private java.math.BigDecimal[] P00576_A2762AlbBarDto ;
   private boolean[] P00576_n2762AlbBarDto ;
   private java.math.BigDecimal[] P00576_A1261BarAlbKgmE ;
   private int[] P00576_A252CliCod ;
   private boolean[] P00576_n252CliCod ;
   private short[] P00576_A4466BarAcaAnh ;
   private java.math.BigDecimal[] P00576_A1263BarAlbMtrE ;
   private short[] P00576_A1503BarPart ;
   private String[] P00576_A4812BarEncCli ;
   private String[] P00576_A130BarCodPar ;
   private byte[] P00576_A132BarCodReo ;
   private int[] P00576_A129BarCod ;
   private String[] P00576_A1798BarDibCli ;
   private short[] P00576_A1206TubCod ;
   private boolean[] P00576_n1206TubCod ;
   private short[] P00576_A6466PlasCod ;
   private boolean[] P00576_n6466PlasCod ;
   private short[] P00576_A6467BarAlbPlas ;
   private java.math.BigDecimal[] P00576_A166BarKgm ;
   private java.math.BigDecimal[] P00576_A184BarMtr ;
   private String[] P00577_A396EmprCod ;
   private int[] P00577_A129BarCod ;
   private byte[] P00577_A132BarCodReo ;
   private String[] P00577_A130BarCodPar ;
   private short[] P00577_A761ProFasLin ;
   private boolean[] P00577_n761ProFasLin ;
   private String[] P00577_A758ProCod ;
   private boolean[] P00577_n758ProCod ;
   private String[] P00578_A396EmprCod ;
   private long[] P00578_A30AlbProCod ;
   private int[] P00578_A129BarCod ;
   private byte[] P00578_A132BarCodReo ;
   private String[] P00578_A130BarCodPar ;
   private java.math.BigDecimal[] P00578_A27AlbPKilEnt ;
   private String[] P00578_A200BarPieCod ;
   private String[] P005712_A396EmprCod ;
   private long[] P005712_A30AlbProCod ;
   private int[] P005712_A129BarCod ;
   private byte[] P005712_A132BarCodReo ;
   private String[] P005712_A130BarCodPar ;
   private String[] P005712_A212BarSer ;
   private java.math.BigDecimal[] P005712_A1536AlbEComPre ;
   private boolean[] P005712_n1536AlbEComPre ;
   private java.math.BigDecimal[] P005712_A1533AlbEComM ;
   private boolean[] P005712_n1533AlbEComM ;
   private String[] P005712_A1056DisComCod ;
   private String[] P005712_A1032FonCod ;
   private String[] P005712_A4812BarEncCli ;
   private byte[] P005712_A2524DisComLin ;
   private String[] P005715_A396EmprCod ;
   private long[] P005715_A30AlbProCod ;
   private int[] P005715_A129BarCod ;
   private byte[] P005715_A132BarCodReo ;
   private String[] P005715_A130BarCodPar ;
   private String[] P005715_A212BarSer ;
   private String[] P005715_A460FasDsc ;
   private String[] P005715_A457FasCod ;
   private String[] P005715_A143BarDisNum ;
   private short[] P005715_A1458BarAlbBul ;
   private short[] P005715_A1503BarPart ;
   private String[] P005715_A2242AlbSec ;
   private String[] P005715_A4812BarEncCli ;
   private java.math.BigDecimal[] P005715_A7752GuiFasRec ;
   private boolean[] P005715_n7752GuiFasRec ;
   private java.math.BigDecimal[] P005715_A7751GuiFasDto ;
   private boolean[] P005715_n7751GuiFasDto ;
   private java.math.BigDecimal[] P005715_A1276FasMtr ;
   private java.math.BigDecimal[] P005715_A1275FasKgm ;
   private java.math.BigDecimal[] P005715_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P005715_A1242GuiFasPMt ;
   private short[] P005715_A1240GuiFasLin ;
   private String[] P005717_A396EmprCod ;
   private long[] P005717_A30AlbProCod ;
   private int[] P005717_A129BarCod ;
   private byte[] P005717_A132BarCodReo ;
   private String[] P005717_A130BarCodPar ;
   private String[] P005717_A212BarSer ;
   private String[] P005717_A2765AlbHdrTxt ;
   private String[] P005717_A143BarDisNum ;
   private short[] P005717_A1503BarPart ;
   private String[] P005717_A4812BarEncCli ;
   private java.math.BigDecimal[] P005717_A2770ALbHdrMts ;
   private java.math.BigDecimal[] P005717_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] P005717_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] P005717_A2769AlbHdrPMt ;
   private short[] P005717_A2764AlbHdrLin ;
   private String[] P005721_A396EmprCod ;
   private int[] P005721_A14AlbComCod ;
   private byte[] P005721_A16AlbComEst ;
   private byte[] P005721_A1783AlbComEso ;
   private String[] P005722_A396EmprCod ;
   private int[] P005722_A14AlbComCod ;
   private String[] P005722_A15AlbComDsc ;
   private java.math.BigDecimal[] P005722_A13AlbComCnt ;
   private java.math.BigDecimal[] P005722_A21AlbComPre ;
   private String[] P005722_A3094AlbCSec ;
   private short[] P005722_A20AlbComLin ;
   private String[] P005725_A396EmprCod ;
   private int[] P005725_A430FacCod ;
   private int[] P005725_A445FacLiC ;
   private String[] P005727_A396EmprCod ;
   private long[] P005727_A30AlbProCod ;
   private int[] P005727_A129BarCod ;
   private byte[] P005727_A132BarCodReo ;
   private String[] P005727_A130BarCodPar ;
   private String[] P005727_A212BarSer ;
   private String[] P005727_A759ProDsc ;
   private short[] P005727_A1458BarAlbBul ;
   private short[] P005727_A1503BarPart ;
   private String[] P005727_A758ProCod ;
   private boolean[] P005727_n758ProCod ;
   private String[] P005727_A135BarColNom ;
   private int[] P005727_A136BarColNum ;
   private short[] P005727_A864BarPes ;
   private String[] P005727_A4812BarEncCli ;
   private java.math.BigDecimal[] P005727_A1472PrdMtr ;
   private boolean[] P005727_n1472PrdMtr ;
   private java.math.BigDecimal[] P005727_A1471PrdKgm ;
   private boolean[] P005727_n1471PrdKgm ;
   private java.math.BigDecimal[] P005727_A1469AlbPrdPKg ;
   private boolean[] P005727_n1469AlbPrdPKg ;
   private java.math.BigDecimal[] P005727_A1470AlbPrdPMt ;
   private boolean[] P005727_n1470AlbPrdPMt ;
   private java.math.BigDecimal[] P005727_A4333ProPorRec ;
   private boolean[] P005727_n4333ProPorRec ;
   private java.math.BigDecimal[] P005727_A4332ProPreRec ;
   private boolean[] P005727_n4332ProPreRec ;
   private short[] P005727_A1468AlbPrdLin ;
   private String[] P005729_A396EmprCod ;
   private String[] P005729_A65ArtCod ;
   private int[] P005729_A252CliCod ;
   private boolean[] P005729_n252CliCod ;
   private String[] P005729_A90ArtObsFac ;
   private boolean[] P005729_n90ArtObsFac ;
   private String[] P005730_A396EmprCod ;
   private int[] P005730_A252CliCod ;
   private boolean[] P005730_n252CliCod ;
   private java.math.BigDecimal[] P005730_A2028CliImpMin ;
   private boolean[] P005730_n2028CliImpMin ;
   private String[] P005731_A396EmprCod ;
   private String[] P005731_A200BarPieCod ;
   private String[] P005731_A130BarCodPar ;
   private byte[] P005731_A132BarCodReo ;
   private int[] P005731_A129BarCod ;
   private java.math.BigDecimal[] P005731_A203BarPieKil ;
   private java.math.BigDecimal[] P005731_A205BarPieMet ;
}

final  class pafealb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00572", "SELECT EmprCod, FacCod, FacTpFra FROM TXPCFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00573", "SELECT EmprCod, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00574", "SELECT EmprCod, AlbProCod, GuiRemCli, AlbProTBo, AlbProBon, AlbProEst, AlbProEso FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00576", "SELECT T1.EmprCod, T1.AlbProCod, T3.TubPre, T1.BarAlbTub, T3.TubNom, T2.BarSer, T1.BarPreKgm, T1.BarPreMtr, T1.AlbProRec, T2.BarColNum, T2.BarColNom, T2.BarDisNum, T5.AlbSec, T1.AlbBarRec, T2.BarTipCol, T2.BarNomCli, T2.BarNumCli, T1.AlbImpMan, T1.AlbBarDto, T1.BarAlbKgmE, T2.CliCod, T2.BarAcaAnh, T1.BarAlbMtrE, T2.BarPart, T2.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDibCli, T1.TubCod, T1.PlasCod, T1.BarAlbPlas, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T4.BarMtr, 0) AS BarMtr FROM ((((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTUBOS T3 ON T3.EmprCod = T1.EmprCod AND T3.TubCod = T1.TubCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T5 ON T5.EmprCod = T1.EmprCod AND T5.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00577", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00578", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPKilEnt, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00579", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacDisNum, FacNPart, FacFasCod, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P005710", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacTipPro, FacNPart, FacFasCod, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacPreKgsA, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacKgsA, FacInt, FacCadEnc, FacCliCod, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacFecAlb, FacUnds, FacPreUnd, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P005711", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacMts, FacPreMts, FacKgs, FacPreKgs, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacFasCod, FacEncCli, FacBonLi, FacDsc, FacRec, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacImpMan, FacImpMin, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new ForEachCursor("P005712", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarSer, T1.AlbEComPre, T1.AlbEComM, T1.DisComCod, T1.FonCod, T2.BarEncCli, T1.DisComLin FROM (TXPALBEST T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComCod, T1.FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P005713", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacFasCod, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacTipPro, FacNPart, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P005714", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacFasCod, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new ForEachCursor("P005715", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T4.BarSer, T2.FasDsc, T1.FasCod, T4.BarDisNum, T5.BarAlbBul, T4.BarPart, T3.AlbSec, T4.BarEncCli, T1.GuiFasRec, T1.GuiFasDto, T1.FasMtr, T1.FasKgm, T1.GuiFasPKg, T1.GuiFasPMt, T1.GuiFasLin FROM ((((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) INNER JOIN TXPBARCAD T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) INNER JOIN TXPALBBAR T5 ON T5.EmprCod = T1.EmprCod AND T5.AlbProCod = T1.AlbProCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P005716", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacTipPro, FacNPart, FacFasCod, FacPreKgsA, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacKgsA, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new ForEachCursor("P005717", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarSer, T1.AlbHdrTxt, T2.BarDisNum, T2.BarPart, T2.BarEncCli, T1.ALbHdrMts, T1.AlbHdrKgs, T1.AlbHdrPKg, T1.AlbHdrPMt, T1.AlbHdrLin FROM (TXPALBTXT T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P005718", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacFasCod, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacRec, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P005719", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacBarCod, FacBarReo, FacBarPar, FacFasCod, FacBonLi, FacImpMan, FacImpMin, FacRec, FacDisNum, FacTipPro, FacNPart, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacPreKgsA, FacDsc2, FacEncCli, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P005720", "UPDATE TXPCALPRD SET AlbProEst=?, AlbProEso=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P005721", "SELECT EmprCod, AlbComCod, AlbComEst, AlbComEso FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P005722", "SELECT T1.EmprCod, T1.AlbComCod, T1.AlbComDsc, T1.AlbComCnt, T1.AlbComPre, T2.AlbCSec, T1.AlbComLin FROM (TXPLALCOM T1 INNER JOIN TXPCALCOM T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbComCod = T1.AlbComCod) WHERE T1.EmprCod = ? and T1.AlbComCod = ? ORDER BY T1.EmprCod, T1.AlbComCod, T1.AlbComLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P005723", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacTipPro, FacNPart, FacFasCod, FacBonLi, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacPreKgsA, FacDsc2, FacEncCli, FacDishCod, FacTipArt, FacImpMan, FacImpMin, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P005724", "UPDATE TXPCALCOM SET AlbComEst=?, AlbComEso=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new ForEachCursor("P005725", "SELECT EmprCod, FacCod, FacLiC FROM TXPCFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P005726", "UPDATE TXPCFAVEN SET FacLiC=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new ForEachCursor("P005727", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarSer, T3.ProDsc, T4.BarAlbBul, T2.BarPart, T1.ProCod, T2.BarColNom, T2.BarColNum, T2.BarPes, T2.BarEncCli, T1.PrdMtr, T1.PrdKgm, T1.AlbPrdPKg, T1.AlbPrdPMt, T1.ProPorRec, T1.ProPreRec, T1.AlbPrdLin FROM (((TXPALBPRD T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER JOIN TXPALBBAR T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbProCod = T1.AlbProCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbPrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P005728", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacTipPro, FacNPart, FacFasCod, FacNomCol, FacNumCol, FacProCod, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacKgsA, FacColNom, FocColNum, FacTipColC, FacCliCod, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new ForEachCursor("P005729", "SELECT EmprCod, ArtCod, CliCod, ArtObsFac FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P005730", "SELECT EmprCod, CliCod, CliImpMin FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P005731", "SELECT EmprCod, BarPieCod, BarCodPar, BarCodReo, BarCod, BarPieKil, BarPieMet FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 8);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 13);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((int[]) buf[23])[0] = rslt.getInt(21);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(22);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(23,2);
               ((short[]) buf[27])[0] = rslt.getShort(24);
               ((String[]) buf[28])[0] = rslt.getString(25, 20);
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(27);
               ((int[]) buf[31])[0] = rslt.getInt(28);
               ((String[]) buf[32])[0] = rslt.getString(29, 16);
               ((short[]) buf[33])[0] = rslt.getShort(30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(31);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(32);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(33,2);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(34,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 12);
               ((String[]) buf[11])[0] = rslt.getString(10, 12);
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,5);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,5);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(18,5);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(21);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 20);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setString(19, (String)parms[18], 8);
               stmt.setString(20, (String)parms[19], 13);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setString(23, (String)parms[22], 13);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setString(25, (String)parms[24], 8);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[25], 5);
               stmt.setString(27, (String)parms[26], 20);
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[27], 2);
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[28], 2);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[29], 2);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 2);
               stmt.setByte(32, ((Number) parms[31]).byteValue());
               stmt.setShort(33, ((Number) parms[32]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 5);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setString(14, (String)parms[13], 8);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 20);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 8);
               stmt.setString(18, (String)parms[17], 20);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 2);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 2);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setString(18, (String)parms[17], 8);
               stmt.setString(19, (String)parms[18], 20);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 2);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setString(19, (String)parms[18], 8);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 5);
               stmt.setString(21, (String)parms[20], 20);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 2);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 2);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[24], 2);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 8);
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 8);
               stmt.setString(18, (String)parms[17], 20);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 2);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 2);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 8);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 2);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               return;
            case 17 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 8);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 2);
               return;
            case 21 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setString(19, (String)parms[18], 8);
               stmt.setString(20, (String)parms[19], 13);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setString(22, (String)parms[21], 8);
               stmt.setString(23, (String)parms[22], 20);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 2);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[24], 2);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[25], 2);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[26], 2);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
      }
   }

}

