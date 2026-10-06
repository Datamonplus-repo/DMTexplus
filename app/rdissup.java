package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rdissup extends GXReport
{
   public rdissup( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rdissup.class ), "" );
   }

   public rdissup( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      rdissup.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      rdissup.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rdissup.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      rdissup.this.Gx_out = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF ", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("PEDIDO CLIENTE") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         AV35Station = context.getWorkstationId( remoteHandle) ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = AV11EmprNom ;
         GXv_char3[0] = AV34usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV35Station, GXv_char1, GXv_char2, GXv_char3) ;
         rdissup.this.A396EmprCod = GXv_char1[0] ;
         rdissup.this.AV11EmprNom = GXv_char2[0] ;
         rdissup.this.AV34usurcod = GXv_char3[0] ;
         GXv_int4[0] = AV22F_colors ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLORS", ""), GXv_int4) ;
         rdissup.this.AV22F_colors = GXv_int4[0] ;
         GXt_char5 = AV56Litp ;
         GXv_char3[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ENCLAV01", ""), (byte)(99), GXv_char3) ;
         rdissup.this.GXt_char5 = GXv_char3[0] ;
         AV56Litp = GXt_char5 ;
         /* Using cursor P077W2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P077W2_A407EmprNom[0] ;
            n407EmprNom = P077W2_n407EmprNom[0] ;
            AV11EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P077W4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A966PartCod = P077W4_A966PartCod[0] ;
            n966PartCod = P077W4_n966PartCod[0] ;
            A970ProceCod = P077W4_A970ProceCod[0] ;
            n970ProceCod = P077W4_n970ProceCod[0] ;
            A5290DisTipCor = P077W4_A5290DisTipCor[0] ;
            A352DisArtTip = P077W4_A352DisArtTip[0] ;
            A4471DisCruEnr = P077W4_A4471DisCruEnr[0] ;
            A2835DisPle2 = P077W4_A2835DisPle2[0] ;
            A2926DisPla = P077W4_A2926DisPla[0] ;
            A4479DisAcaMar = P077W4_A4479DisAcaMar[0] ;
            A2009DisTipDis = P077W4_A2009DisTipDis[0] ;
            n2009DisTipDis = P077W4_n2009DisTipDis[0] ;
            A5366DisAntp = P077W4_A5366DisAntp[0] ;
            A5405DisAntpT = P077W4_A5405DisAntpT[0] ;
            A5252DisAcc = P077W4_A5252DisAcc[0] ;
            A339DisArtLar = P077W4_A339DisArtLar[0] ;
            A340DisArtMat = P077W4_A340DisArtMat[0] ;
            A2833DisMtrLot = P077W4_A2833DisMtrLot[0] ;
            A1052DisObs = P077W4_A1052DisObs[0] ;
            A4813DisEncCli = P077W4_A4813DisEncCli[0] ;
            A5349DisObsGrm = P077W4_A5349DisObsGrm[0] ;
            A5350DisObsAnc = P077W4_A5350DisObsAnc[0] ;
            A337DisArtDsc = P077W4_A337DisArtDsc[0] ;
            A390DisTipCol = P077W4_A390DisTipCol[0] ;
            n390DisTipCol = P077W4_n390DisTipCol[0] ;
            A363DisColNum = P077W4_A363DisColNum[0] ;
            n363DisColNum = P077W4_n363DisColNum[0] ;
            A362DisColNom = P077W4_A362DisColNom[0] ;
            n362DisColNom = P077W4_n362DisColNom[0] ;
            A335DisArtCod = P077W4_A335DisArtCod[0] ;
            A279CliNom = P077W4_A279CliNom[0] ;
            A252CliCod = P077W4_A252CliCod[0] ;
            A4614DisMdlCod = P077W4_A4614DisMdlCod[0] ;
            A4617DisHorReg = P077W4_A4617DisHorReg[0] ;
            n4617DisHorReg = P077W4_n4617DisHorReg[0] ;
            A369DisFec = P077W4_A369DisFec[0] ;
            A360DisCliNum = P077W4_A360DisCliNum[0] ;
            A379DisPie = P077W4_A379DisPie[0] ;
            n379DisPie = P077W4_n379DisPie[0] ;
            A365DisDes = P077W4_A365DisDes[0] ;
            A279CliNom = P077W4_A279CliNom[0] ;
            A970ProceCod = P077W4_A970ProceCod[0] ;
            n970ProceCod = P077W4_n970ProceCod[0] ;
            A379DisPie = P077W4_A379DisPie[0] ;
            n379DisPie = P077W4_n379DisPie[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
            }
            else
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
               }
               else
               {
                  A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
               }
            }
            AV30Enc_e = (byte)(0) ;
            /* Using cursor P077W5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A44AlbRecCod = P077W5_A44AlbRecCod[0] ;
               /* Using cursor P077W6 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A4596AlbRDefCod = P077W6_A4596AlbRDefCod[0] ;
                  AV30Enc_e = (byte)(1) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV29Tipo_e = "" ;
            if ( AV30Enc_e == 1 )
            {
               AV29Tipo_e = httpContext.getMessage( "Reproceso EXTERNO", "") ;
            }
            AV32Discod = A361DisCod ;
            /* Execute user subroutine: 'BARCAD' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV31BarEstreo == 1 )
            {
               AV29Tipo_e = httpContext.getMessage( "Reproceso INTERNO", "") ;
            }
            if ( GXutil.strcmp(A5290DisTipCor, httpContext.getMessage( "S", "")) == 0 )
            {
               AV33Tipo_p = httpContext.getMessage( "Pedido COMPLETO", "") ;
            }
            else
            {
               AV33Tipo_p = httpContext.getMessage( "Pedido INCOMPLETO", "") ;
            }
            AV27TipARtCod = A352DisArtTip ;
            /* Execute user subroutine: 'TIPART' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV42Texto_mf = "" ;
            if ( GXutil.strcmp(A4471DisCruEnr, httpContext.getMessage( "S", "")) == 0 )
            {
               AV42Texto_mf = httpContext.getMessage( "MUESTRA FISICA", "") ;
            }
            AV48Disdishcod = GXutil.substring( A2835DisPle2, 1, 20) ;
            AV8Piezas_e = A379DisPie ;
            AV9Kilos_e = A381DisPieKgm ;
            AV28Muestras_i = "" ;
            if ( GXutil.strcmp(A2926DisPla, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( GXutil.strcmp(A4479DisAcaMar, httpContext.getMessage( "U", "")) == 0 )
               {
                  AV28Muestras_i = httpContext.getMessage( "MUESTRAS UNITARIAS", "") ;
               }
               else
               {
                  AV28Muestras_i = httpContext.getMessage( "MUESTRAS VENDEDOR", "") ;
               }
            }
            h77W0( false, 74) ;
            getPrinter().GxDrawRect(7, Gx_line+35, 686, Gx_line+69, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Relacion Entradas en Almacen", ""), 7, Gx_line+10, 199, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Prenda", ""), 176, Gx_line+52, 248, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Loc.", ""), 274, Gx_line+52, 300, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mod./Ref.", ""), 329, Gx_line+52, 384, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 428, Gx_line+52, 458, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Undas", ""), 479, Gx_line+52, 518, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recep.", ""), 580, Gx_line+52, 622, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 595, Gx_line+40, 609, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(268, Gx_line+35, 268, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(304, Gx_line+35, 304, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(406, Gx_line+35, 406, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(474, Gx_line+35, 474, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+69, 7, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(685, Gx_line+69, 685, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Remision", ""), 10, Gx_line+52, 66, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(151, Gx_line+35, 151, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(638, Gx_line+35, 638, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Reo?", ""), 646, Gx_line+50, 677, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(75, Gx_line+35, 75, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 92, Gx_line+51, 128, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(523, Gx_line+35, 523, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(573, Gx_line+35, 573, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Undas", ""), 530, Gx_line+39, 569, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 534, Gx_line+52, 563, Gx_line+68, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+74) ;
            /* Using cursor P077W7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A4295ClasCod = P077W7_A4295ClasCod[0] ;
               n4295ClasCod = P077W7_n4295ClasCod[0] ;
               A44AlbRecCod = P077W7_A44AlbRecCod[0] ;
               A4296ClasDsc = P077W7_A4296ClasDsc[0] ;
               n4296ClasDsc = P077W7_n4296ClasDsc[0] ;
               A50AlbRLoc = P077W7_A50AlbRLoc[0] ;
               A595Kilos = P077W7_A595Kilos[0] ;
               A52AlbRPieEnt = P077W7_A52AlbRPieEnt[0] ;
               A49AlbRFen = P077W7_A49AlbRFen[0] ;
               A55AlbRReo = P077W7_A55AlbRReo[0] ;
               A46AlbREnt = P077W7_A46AlbREnt[0] ;
               A673Piezas = P077W7_A673Piezas[0] ;
               A4602AlbRMdlCod = P077W7_A4602AlbRMdlCod[0] ;
               A4290AlbPmPPza = P077W7_A4290AlbPmPPza[0] ;
               A58AlbRUniEnt = P077W7_A58AlbRUniEnt[0] ;
               A4295ClasCod = P077W7_A4295ClasCod[0] ;
               n4295ClasCod = P077W7_n4295ClasCod[0] ;
               A50AlbRLoc = P077W7_A50AlbRLoc[0] ;
               A52AlbRPieEnt = P077W7_A52AlbRPieEnt[0] ;
               A49AlbRFen = P077W7_A49AlbRFen[0] ;
               A55AlbRReo = P077W7_A55AlbRReo[0] ;
               A46AlbREnt = P077W7_A46AlbREnt[0] ;
               A4602AlbRMdlCod = P077W7_A4602AlbRMdlCod[0] ;
               A4290AlbPmPPza = P077W7_A4290AlbPmPPza[0] ;
               A58AlbRUniEnt = P077W7_A58AlbRUniEnt[0] ;
               A4296ClasDsc = P077W7_A4296ClasDsc[0] ;
               n4296ClasDsc = P077W7_n4296ClasDsc[0] ;
               if ( A4290AlbPmPPza.doubleValue() > 0 )
               {
                  A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
               }
               else
               {
                  A4291AlbPzaEst = 0 ;
               }
               AV13PzasEstim = (short)(A4291AlbPzaEst) ;
               AV12ClasDsc = GXutil.substring( A4296ClasDsc, 1, 15) ;
               AV15ALbRloc_4 = GXutil.substring( A50AlbRLoc, 1, 4) ;
               AV17Kilos_p = A595Kilos ;
               AV18RecCod = A44AlbRecCod ;
               AV20Procecod = A970ProceCod ;
               AV19AlbRecCod = A44AlbRecCod ;
               /* Execute user subroutine: 'CONF' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               h77W0( false, 20) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4602AlbRMdlCod, "")), 308, Gx_line+0, 404, Gx_line+17, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15ALbRloc_4, "")), 272, Gx_line+0, 302, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12ClasDsc, "")), 154, Gx_line+0, 264, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Kilos_p, "ZZZ9.99")), 417, Gx_line+1, 469, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18RecCod), "ZZZZZZ9")), 575, Gx_line+0, 627, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9")), 484, Gx_line+0, 529, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(268, Gx_line+0, 268, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(406, Gx_line+0, 406, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(304, Gx_line+0, 304, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(474, Gx_line+0, 474, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(685, Gx_line+0, 685, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+0, 7, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+17, 686, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+16, 7, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 9, Gx_line+0, 68, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(151, Gx_line+0, 151, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A55AlbRReo, "@!")), 653, Gx_line+0, 669, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(638, Gx_line+0, 638, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(685, Gx_line+16, 685, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(75, Gx_line+0, 75, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 80, Gx_line+0, 139, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(523, Gx_line+0, 523, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(573, Gx_line+0, 573, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 527, Gx_line+0, 572, Gx_line+17, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
               AV57siobs = (byte)(0) ;
               /* Using cursor P077W8 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A1300AlbRObs = P077W8_A1300AlbRObs[0] ;
                  A1299AlbRLin = P077W8_A1299AlbRLin[0] ;
                  h77W0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 118, Gx_line+1, 557, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+0, 7, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(685, Gx_line+0, 685, Gx_line+17, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV57siobs = (byte)(1) ;
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               if ( AV57siobs == 1 )
               {
                  h77W0( false, 5) ;
                  getPrinter().GxDrawLine(7, Gx_line+5, 686, Gx_line+5, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+0, 7, Gx_line+6, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(685, Gx_line+0, 685, Gx_line+6, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+5) ;
               }
               if ( AV20Procecod > 0 )
               {
                  h77W0( false, 21) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Procenom, "")), 168, Gx_line+1, 388, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Confeccionador", ""), 70, Gx_line+1, 162, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+0, 7, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(685, Gx_line+0, 685, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+17, 686, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(75, Gx_line+17, 75, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(151, Gx_line+17, 151, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(406, Gx_line+17, 406, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(442, Gx_line+17, 442, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(500, Gx_line+17, 500, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(535, Gx_line+17, 535, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(572, Gx_line+17, 572, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(268, Gx_line+17, 268, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(638, Gx_line+17, 638, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(304, Gx_line+17, 304, Gx_line+21, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+21) ;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            h77W0( false, 3) ;
            getPrinter().GxDrawLine(7, Gx_line+0, 686, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+3) ;
            AV14FlagObs = (byte)(0) ;
            /* Using cursor P077W9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A377DisObsTxt = P077W9_A377DisObsTxt[0] ;
               A376DisObsLin = P077W9_A376DisObsLin[0] ;
               if ( AV14FlagObs == 0 )
               {
                  AV14FlagObs = (byte)(1) ;
                  h77W0( false, 21) ;
                  getPrinter().GxDrawRect(7, Gx_line+0, 686, Gx_line+17, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 51, Gx_line+1, 142, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+21) ;
               }
               h77W0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A377DisObsTxt, "")), 51, Gx_line+0, 490, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            /* Using cursor P077W10 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A758ProCod = P077W10_A758ProCod[0] ;
               A846UltFasLin = P077W10_A846UltFasLin[0] ;
               A4628ProDsc2 = P077W10_A4628ProDsc2[0] ;
               A4628ProDsc2 = P077W10_A4628ProDsc2[0] ;
               AV10ProcDsc2 = GXutil.substring( A4628ProDsc2, 1, 70) ;
               pr_default.readNext(7);
            }
            pr_default.close(7);
            AV23Var_1 = GXutil.space( (short)(15)) ;
            AV24Var_2 = GXutil.space( (short)(25)) ;
            if ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "T", "")) == 0 )
            {
               AV23Var_1 = httpContext.getMessage( "Antipiling? ", "") + A5366DisAntp ;
               if ( GXutil.strcmp(A5366DisAntp, httpContext.getMessage( "S", "")) == 0 )
               {
                  if ( GXutil.strcmp(A5405DisAntpT, httpContext.getMessage( "F", "")) == 0 )
                  {
                     AV23Var_1 = httpContext.getMessage( "Antipiling? ", "") + A5366DisAntp + " " + httpContext.getMessage( "Forzado", "") ;
                  }
                  if ( GXutil.strcmp(A5405DisAntpT, httpContext.getMessage( "R", "")) == 0 )
                  {
                     AV23Var_1 = httpContext.getMessage( "Antipiling? ", "") + A5366DisAntp + " " + httpContext.getMessage( "Reducido", "") ;
                  }
                  if ( GXutil.strcmp(A5405DisAntpT, httpContext.getMessage( "N", "")) == 0 )
                  {
                     AV23Var_1 = httpContext.getMessage( "Antipiling? ", "") + A5366DisAntp + " " + httpContext.getMessage( "Normal", "") ;
                  }
               }
               AV24Var_2 = httpContext.getMessage( "Accessorios Metalicos? ", "") + A5252DisAcc ;
            }
            h77W0( false, 109) ;
            getPrinter().GxDrawRect(7, Gx_line+75, 626, Gx_line+106, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 32, Gx_line+28, 83, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10ProcDsc2, "")), 32, Gx_line+44, 543, Gx_line+61, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Operaciones", ""), 246, Gx_line+83, 323, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+28, 626, Gx_line+76, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Var_1, "")), 13, Gx_line+5, 170, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Var_2, "")), 369, Gx_line+5, 526, Gx_line+22, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+109) ;
            /* Using cursor P077W11 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A368DisFasLin = P077W11_A368DisFasLin[0] ;
               A758ProCod = P077W11_A758ProCod[0] ;
               A4642FasDsc2 = P077W11_A4642FasDsc2[0] ;
               n4642FasDsc2 = P077W11_n4642FasDsc2[0] ;
               A457FasCod = P077W11_A457FasCod[0] ;
               A460FasDsc = P077W11_A460FasDsc[0] ;
               A4642FasDsc2 = P077W11_A4642FasDsc2[0] ;
               n4642FasDsc2 = P077W11_n4642FasDsc2[0] ;
               A460FasDsc = P077W11_A460FasDsc[0] ;
               AV16FasDsc2_2 = GXutil.substring( A4642FasDsc2, 1, 45) ;
               /* Using cursor P077W12 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
               while ( (pr_default.getStatus(9) != 101) )
               {
                  A764ProForCod = P077W12_A764ProForCod[0] ;
                  A766ProForDsc = P077W12_A766ProForDsc[0] ;
                  A5377DisQuiLin = P077W12_A5377DisQuiLin[0] ;
                  A766ProForDsc = P077W12_A766ProForDsc[0] ;
                  AV16FasDsc2_2 = A766ProForDsc ;
                  pr_default.readNext(9);
               }
               pr_default.close(9);
               AV46Procod = A758ProCod ;
               AV47barordlin = A368DisFasLin ;
               h77W0( false, 16) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 89, Gx_line+0, 294, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16FasDsc2_2, "")), 297, Gx_line+0, 626, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 23, Gx_line+0, 82, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
               /* Execute user subroutine: 'PROLIN' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(8);
                  pr_default.close(8);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               pr_default.readNext(8);
            }
            pr_default.close(8);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         AV54Inicio_ob = (byte)(0) ;
         /* Using cursor P077W13 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV50Barcod), Byte.valueOf(AV51Barcodreo), AV49Barcodpar});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A7247Aud_Hdrp = P077W13_A7247Aud_Hdrp[0] ;
            A7246Aud_Hdrr = P077W13_A7246Aud_Hdrr[0] ;
            A7245Aud_Hdr = P077W13_A7245Aud_Hdr[0] ;
            A7253Aud_Obs = P077W13_A7253Aud_Obs[0] ;
            n7253Aud_Obs = P077W13_n7253Aud_Obs[0] ;
            A7251Aud_Tip = P077W13_A7251Aud_Tip[0] ;
            n7251Aud_Tip = P077W13_n7251Aud_Tip[0] ;
            A7252Aud_Fec = P077W13_A7252Aud_Fec[0] ;
            n7252Aud_Fec = P077W13_n7252Aud_Fec[0] ;
            A7250Aud_Usur = P077W13_A7250Aud_Usur[0] ;
            n7250Aud_Usur = P077W13_n7250Aud_Usur[0] ;
            A7249Aud_Lin = P077W13_A7249Aud_Lin[0] ;
            AV43Nlin = (short)(GXutil.gxmlines( A7253Aud_Obs, (short)(60))) ;
            AV53t = (short)(1) ;
            while ( AV53t <= AV43Nlin )
            {
               AV52Obs_a = GXutil.gxgetmli( A7253Aud_Obs, AV53t, (short)(60)) ;
               if ( AV54Inicio_ob == 0 )
               {
                  AV54Inicio_ob = (byte)(1) ;
                  h77W0( false, 31) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Linea", ""), 15, Gx_line+11, 48, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Operador", ""), 65, Gx_line+11, 122, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 130, Gx_line+11, 166, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(15, Gx_line+28, 59, Gx_line+28, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(65, Gx_line+28, 123, Gx_line+28, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(130, Gx_line+28, 188, Gx_line+28, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(203, Gx_line+28, 218, Gx_line+28, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 226, Gx_line+11, 317, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(226, Gx_line+28, 664, Gx_line+28, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+31) ;
               }
               if ( AV53t == 1 )
               {
                  h77W0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7249Aud_Lin), "ZZZZZ9")), 15, Gx_line+0, 60, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7250Aud_Usur, "@!")), 65, Gx_line+0, 124, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A7252Aud_Fec, "99/99/99"), 130, Gx_line+1, 189, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Obs_a, "")), 226, Gx_line+1, 665, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7251Aud_Tip, "")), 203, Gx_line+0, 219, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               else
               {
                  h77W0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Obs_a, "")), 226, Gx_line+0, 665, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               AV53t = (short)(AV53t+1) ;
            }
            pr_default.readNext(10);
         }
         pr_default.close(10);
         h77W0( false, 31) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Impresion", ""), 15, Gx_line+7, 114, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 126, Gx_line+7, 185, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario Impresion", ""), 357, Gx_line+7, 466, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34usurcod, "@!")), 486, Gx_line+7, 545, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(7, Gx_line+2, 551, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+31) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h77W0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'PROLIN' Routine */
      returnInSub = false ;
      /* Using cursor P077W14 */
      pr_default.execute(11, new Object[] {A396EmprCod, AV46Procod, Short.valueOf(AV47barordlin)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A774ProNumLin = P077W14_A774ProNumLin[0] ;
         A758ProCod = P077W14_A758ProCod[0] ;
         A5735ProFasNot = P077W14_A5735ProFasNot[0] ;
         n5735ProFasNot = P077W14_n5735ProFasNot[0] ;
         if ( ! (GXutil.strcmp("", A5735ProFasNot)==0) )
         {
            AV43Nlin = (short)(GXutil.gxmlines( A5735ProFasNot, (short)(60))) ;
            AV44i = (short)(1) ;
            while ( AV44i <= AV43Nlin )
            {
               AV45Obs = GXutil.gxgetmli( A5735ProFasNot, AV44i, (short)(60)) ;
               h77W0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Obs, "")), 89, Gx_line+0, 528, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV44i = (short)(AV44i+1) ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'CONF' Routine */
      returnInSub = false ;
      AV21Procenom = GXutil.space( (short)(30)) ;
      AV20Procecod = (short)(0) ;
      /* Using cursor P077W15 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV19AlbRecCod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A44AlbRecCod = P077W15_A44AlbRecCod[0] ;
         A970ProceCod = P077W15_A970ProceCod[0] ;
         n970ProceCod = P077W15_n970ProceCod[0] ;
         A971ProceNom = P077W15_A971ProceNom[0] ;
         n971ProceNom = P077W15_n971ProceNom[0] ;
         A971ProceNom = P077W15_A971ProceNom[0] ;
         n971ProceNom = P077W15_n971ProceNom[0] ;
         AV20Procecod = A970ProceCod ;
         AV21Procenom = A971ProceNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV25TipArtDsc = "" ;
      /* Using cursor P077W16 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(AV27TipARtCod)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A829TipArtCod = P077W16_A829TipArtCod[0] ;
         A830TipArtDsc = P077W16_A830TipArtDsc[0] ;
         n830TipArtDsc = P077W16_n830TipArtDsc[0] ;
         AV25TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV31BarEstreo = (byte)(0) ;
      AV49Barcodpar = " " ;
      AV36baraudobs = " " ;
      AV38Hdr = " " ;
      /* Using cursor P077W17 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV32Discod)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A148BarEstReo = P077W17_A148BarEstReo[0] ;
         A130BarCodPar = P077W17_A130BarCodPar[0] ;
         A129BarCod = P077W17_A129BarCod[0] ;
         A132BarCodReo = P077W17_A132BarCodReo[0] ;
         A4845BarAudObs = P077W17_A4845BarAudObs[0] ;
         n4845BarAudObs = P077W17_n4845BarAudObs[0] ;
         AV31BarEstreo = A148BarEstReo ;
         AV49Barcodpar = A130BarCodPar ;
         AV50Barcod = A129BarCod ;
         AV51Barcodreo = A132BarCodReo ;
         AV36baraudobs = GXutil.substring( A4845BarAudObs, 1, 60) ;
         AV38Hdr = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + " " + A130BarCodPar ;
         AV39Ceros8 = "00000000" ;
         AV40BarCod_a = GXutil.str( A129BarCod, 8, 0) ;
         AV40BarCod_a = GXutil.ltrim( GXutil.rtrim( AV40BarCod_a)) ;
         AV41LenVar = (short)(GXutil.len( AV40BarCod_a)) ;
         AV41LenVar = (short)(8-AV41LenVar) ;
         AV40BarCod_a = GXutil.substring( AV39Ceros8, 1, AV41LenVar) + AV40BarCod_a ;
         AV37Hdrcdb = "*" + AV40BarCod_a + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   public void h77W0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if ( GxHdr3 )
            {
               getPrinter().GxDrawRect(13, Gx_line+234, 277, Gx_line+260, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(13, Gx_line+60, 277, Gx_line+82, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Disp. Interna", ""), 20, Gx_line+38, 111, Gx_line+54, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), 113, Gx_line+38, 172, Gx_line+55, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Remision Cliente", ""), 20, Gx_line+134, 120, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A360DisCliNum, "")), 161, Gx_line+134, 220, Gx_line+151, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 20, Gx_line+171, 67, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 20, Gx_line+90, 56, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A369DisFec, "99/99/99"), 69, Gx_line+90, 128, Gx_line+107, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 149, Gx_line+90, 178, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A4617DisHorReg, "99:99:99"), 193, Gx_line+90, 252, Gx_line+107, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Entrada", ""), 123, Gx_line+64, 170, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(14, Gx_line+81, 278, Gx_line+113, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Orden Servicio Cliente", ""), 20, Gx_line+189, 152, Gx_line+205, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4614DisMdlCod, "")), 161, Gx_line+189, 257, Gx_line+206, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Prendas", ""), 158, Gx_line+265, 209, Gx_line+281, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8Piezas_e), "ZZZ9")), 163, Gx_line+288, 193, Gx_line+305, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 225, Gx_line+265, 256, Gx_line+281, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9Kilos_e, "ZZZZZ9.99")), 207, Gx_line+288, 274, Gx_line+305, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11EmprNom, "")), 13, Gx_line+0, 233, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(152, Gx_line+283, 276, Gx_line+308, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(13, Gx_line+29, 277, Gx_line+61, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(13, Gx_line+113, 705, Gx_line+236, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 605, Gx_line+291, 647, Gx_line+307, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 655, Gx_line+291, 700, Gx_line+308, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tamaño LOTE", ""), 42, Gx_line+241, 124, Gx_line+257, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Almacen", ""), 190, Gx_line+241, 243, Gx_line+257, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 161, Gx_line+117, 206, Gx_line+134, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 225, Gx_line+117, 445, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 20, Gx_line+117, 62, Gx_line+133, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A335DisArtCod, "")), 161, Gx_line+171, 279, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(152, Gx_line+259, 276, Gx_line+284, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(152, Gx_line+234, 152, Gx_line+307, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 20, Gx_line+207, 52, Gx_line+223, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A362DisColNom, "")), 161, Gx_line+207, 257, Gx_line+224, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9")), 271, Gx_line+207, 316, Gx_line+224, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9")), 321, Gx_line+207, 337, Gx_line+224, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TipArtDsc, "")), 480, Gx_line+171, 700, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), 285, Gx_line+171, 476, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Muestras_i, "")), 292, Gx_line+38, 439, Gx_line+55, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Emitido por", ""), 292, Gx_line+63, 360, Gx_line+79, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5350DisObsAnc, "")), 383, Gx_line+63, 530, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5349DisObsGrm, "")), 383, Gx_line+86, 530, Gx_line+103, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Modificado por", ""), 292, Gx_line+90, 381, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Referencia Cliente", ""), 20, Gx_line+152, 129, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4813DisEncCli, "")), 161, Gx_line+152, 308, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Tipo_p, "")), 292, Gx_line+7, 397, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1052DisObs, "")), 476, Gx_line+117, 696, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36baraudobs, "")), 225, Gx_line+134, 695, Gx_line+150, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Hdrcdb, "")), 579, Gx_line+13, 705, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Hdr, "")), 613, Gx_line+36, 706, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.P.", ""), 579, Gx_line+39, 606, Gx_line+56, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Texto_mf, "")), 490, Gx_line+206, 699, Gx_line+226, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2833DisMtrLot, "ZZZZZ9.99")), 36, Gx_line+274, 131, Gx_line+294, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(13, Gx_line+258, 154, Gx_line+308, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A340DisArtMat, "")), 384, Gx_line+152, 502, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Litp, "")), 317, Gx_line+152, 381, Gx_line+170, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "OP Cliente", ""), 552, Gx_line+152, 614, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A339DisArtLar, "")), 617, Gx_line+152, 691, Gx_line+169, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+313) ;
            }
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   protected void cleanup( )
   {
      this.aP0[0] = rdissup.this.A396EmprCod;
      this.aP1[0] = rdissup.this.A361DisCod;
      this.aP2[0] = rdissup.this.Gx_out;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor P077W18 */
      pr_default.execute(15, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         X595Kilos = P077W18_A595Kilos[0] ;
      }
      pr_default.close(15);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P077W19 */
      pr_default.execute(16, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         X382DisPieKil = P077W19_A382DisPieKil[0] ;
      }
      pr_default.close(16);
      return X382DisPieKil ;
   }

   public void initialize( )
   {
      AV35Station = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV34usurcod = "" ;
      GXv_int4 = new byte[1] ;
      AV56Litp = "" ;
      GXt_char5 = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P077W2_A396EmprCod = new String[] {""} ;
      P077W2_A407EmprNom = new String[] {""} ;
      P077W2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      P077W4_A966PartCod = new String[] {""} ;
      P077W4_n966PartCod = new boolean[] {false} ;
      P077W4_A396EmprCod = new String[] {""} ;
      P077W4_A361DisCod = new int[1] ;
      P077W4_A970ProceCod = new short[1] ;
      P077W4_n970ProceCod = new boolean[] {false} ;
      P077W4_A5290DisTipCor = new String[] {""} ;
      P077W4_A352DisArtTip = new short[1] ;
      P077W4_A4471DisCruEnr = new String[] {""} ;
      P077W4_A2835DisPle2 = new String[] {""} ;
      P077W4_A2926DisPla = new String[] {""} ;
      P077W4_A4479DisAcaMar = new String[] {""} ;
      P077W4_A2009DisTipDis = new String[] {""} ;
      P077W4_n2009DisTipDis = new boolean[] {false} ;
      P077W4_A5366DisAntp = new String[] {""} ;
      P077W4_A5405DisAntpT = new String[] {""} ;
      P077W4_A5252DisAcc = new String[] {""} ;
      P077W4_A339DisArtLar = new String[] {""} ;
      P077W4_A340DisArtMat = new String[] {""} ;
      P077W4_A2833DisMtrLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077W4_A1052DisObs = new String[] {""} ;
      P077W4_A4813DisEncCli = new String[] {""} ;
      P077W4_A5349DisObsGrm = new String[] {""} ;
      P077W4_A5350DisObsAnc = new String[] {""} ;
      P077W4_A337DisArtDsc = new String[] {""} ;
      P077W4_A390DisTipCol = new byte[1] ;
      P077W4_n390DisTipCol = new boolean[] {false} ;
      P077W4_A363DisColNum = new int[1] ;
      P077W4_n363DisColNum = new boolean[] {false} ;
      P077W4_A362DisColNom = new String[] {""} ;
      P077W4_n362DisColNom = new boolean[] {false} ;
      P077W4_A335DisArtCod = new String[] {""} ;
      P077W4_A279CliNom = new String[] {""} ;
      P077W4_A252CliCod = new int[1] ;
      P077W4_A4614DisMdlCod = new String[] {""} ;
      P077W4_A4617DisHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      P077W4_n4617DisHorReg = new boolean[] {false} ;
      P077W4_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P077W4_A360DisCliNum = new String[] {""} ;
      P077W4_A379DisPie = new short[1] ;
      P077W4_n379DisPie = new boolean[] {false} ;
      P077W4_A365DisDes = new String[] {""} ;
      A966PartCod = "" ;
      A5290DisTipCor = "" ;
      A4471DisCruEnr = "" ;
      A2835DisPle2 = "" ;
      A2926DisPla = "" ;
      A4479DisAcaMar = "" ;
      A2009DisTipDis = "" ;
      A5366DisAntp = "" ;
      A5405DisAntpT = "" ;
      A5252DisAcc = "" ;
      A339DisArtLar = "" ;
      A340DisArtMat = "" ;
      A2833DisMtrLot = DecimalUtil.ZERO ;
      A1052DisObs = "" ;
      A4813DisEncCli = "" ;
      A5349DisObsGrm = "" ;
      A5350DisObsAnc = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A335DisArtCod = "" ;
      A279CliNom = "" ;
      A4614DisMdlCod = "" ;
      A4617DisHorReg = GXutil.resetTime( GXutil.nullDate() );
      A369DisFec = GXutil.nullDate() ;
      A360DisCliNum = "" ;
      A365DisDes = "" ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      P077W5_A396EmprCod = new String[] {""} ;
      P077W5_A361DisCod = new int[1] ;
      P077W5_A44AlbRecCod = new int[1] ;
      P077W6_A396EmprCod = new String[] {""} ;
      P077W6_A44AlbRecCod = new int[1] ;
      P077W6_A4596AlbRDefCod = new short[1] ;
      AV29Tipo_e = "" ;
      AV33Tipo_p = "" ;
      AV42Texto_mf = "" ;
      AV48Disdishcod = "" ;
      AV9Kilos_e = DecimalUtil.ZERO ;
      AV28Muestras_i = "" ;
      P077W7_A4295ClasCod = new short[1] ;
      P077W7_n4295ClasCod = new boolean[] {false} ;
      P077W7_A396EmprCod = new String[] {""} ;
      P077W7_A361DisCod = new int[1] ;
      P077W7_A44AlbRecCod = new int[1] ;
      P077W7_A4296ClasDsc = new String[] {""} ;
      P077W7_n4296ClasDsc = new boolean[] {false} ;
      P077W7_A50AlbRLoc = new String[] {""} ;
      P077W7_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077W7_A52AlbRPieEnt = new int[1] ;
      P077W7_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P077W7_A55AlbRReo = new String[] {""} ;
      P077W7_A46AlbREnt = new String[] {""} ;
      P077W7_A673Piezas = new int[1] ;
      P077W7_A4602AlbRMdlCod = new String[] {""} ;
      P077W7_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P077W7_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4296ClasDsc = "" ;
      A50AlbRLoc = "" ;
      A595Kilos = DecimalUtil.ZERO ;
      A49AlbRFen = GXutil.nullDate() ;
      A55AlbRReo = "" ;
      A46AlbREnt = "" ;
      A4602AlbRMdlCod = "" ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      AV12ClasDsc = "" ;
      AV15ALbRloc_4 = "" ;
      AV17Kilos_p = DecimalUtil.ZERO ;
      P077W8_A396EmprCod = new String[] {""} ;
      P077W8_A44AlbRecCod = new int[1] ;
      P077W8_A1300AlbRObs = new String[] {""} ;
      P077W8_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      AV21Procenom = "" ;
      P077W9_A396EmprCod = new String[] {""} ;
      P077W9_A361DisCod = new int[1] ;
      P077W9_A377DisObsTxt = new String[] {""} ;
      P077W9_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      P077W10_A758ProCod = new String[] {""} ;
      P077W10_A396EmprCod = new String[] {""} ;
      P077W10_A361DisCod = new int[1] ;
      P077W10_A846UltFasLin = new short[1] ;
      P077W10_A4628ProDsc2 = new String[] {""} ;
      A758ProCod = "" ;
      A4628ProDsc2 = "" ;
      AV10ProcDsc2 = "" ;
      AV23Var_1 = "" ;
      AV24Var_2 = "" ;
      P077W11_A396EmprCod = new String[] {""} ;
      P077W11_A361DisCod = new int[1] ;
      P077W11_A368DisFasLin = new short[1] ;
      P077W11_A758ProCod = new String[] {""} ;
      P077W11_A4642FasDsc2 = new String[] {""} ;
      P077W11_n4642FasDsc2 = new boolean[] {false} ;
      P077W11_A457FasCod = new String[] {""} ;
      P077W11_A460FasDsc = new String[] {""} ;
      A4642FasDsc2 = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV16FasDsc2_2 = "" ;
      P077W12_A764ProForCod = new String[] {""} ;
      P077W12_A396EmprCod = new String[] {""} ;
      P077W12_A361DisCod = new int[1] ;
      P077W12_A758ProCod = new String[] {""} ;
      P077W12_A368DisFasLin = new short[1] ;
      P077W12_A766ProForDsc = new String[] {""} ;
      P077W12_A5377DisQuiLin = new short[1] ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      AV46Procod = "" ;
      AV49Barcodpar = "" ;
      P077W13_A396EmprCod = new String[] {""} ;
      P077W13_A7247Aud_Hdrp = new String[] {""} ;
      P077W13_A7246Aud_Hdrr = new byte[1] ;
      P077W13_A7245Aud_Hdr = new int[1] ;
      P077W13_A7253Aud_Obs = new String[] {""} ;
      P077W13_n7253Aud_Obs = new boolean[] {false} ;
      P077W13_A7251Aud_Tip = new String[] {""} ;
      P077W13_n7251Aud_Tip = new boolean[] {false} ;
      P077W13_A7252Aud_Fec = new java.util.Date[] {GXutil.nullDate()} ;
      P077W13_n7252Aud_Fec = new boolean[] {false} ;
      P077W13_A7250Aud_Usur = new String[] {""} ;
      P077W13_n7250Aud_Usur = new boolean[] {false} ;
      P077W13_A7249Aud_Lin = new int[1] ;
      A7247Aud_Hdrp = "" ;
      A7253Aud_Obs = "" ;
      A7251Aud_Tip = "" ;
      A7252Aud_Fec = GXutil.nullDate() ;
      A7250Aud_Usur = "" ;
      AV52Obs_a = "" ;
      Gx_date = GXutil.nullDate() ;
      P077W14_A396EmprCod = new String[] {""} ;
      P077W14_A774ProNumLin = new short[1] ;
      P077W14_A758ProCod = new String[] {""} ;
      P077W14_A5735ProFasNot = new String[] {""} ;
      P077W14_n5735ProFasNot = new boolean[] {false} ;
      A5735ProFasNot = "" ;
      AV45Obs = "" ;
      P077W15_A396EmprCod = new String[] {""} ;
      P077W15_A44AlbRecCod = new int[1] ;
      P077W15_A970ProceCod = new short[1] ;
      P077W15_n970ProceCod = new boolean[] {false} ;
      P077W15_A971ProceNom = new String[] {""} ;
      P077W15_n971ProceNom = new boolean[] {false} ;
      A971ProceNom = "" ;
      AV25TipArtDsc = "" ;
      P077W16_A396EmprCod = new String[] {""} ;
      P077W16_A829TipArtCod = new short[1] ;
      P077W16_A830TipArtDsc = new String[] {""} ;
      P077W16_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      AV36baraudobs = "" ;
      AV38Hdr = "" ;
      P077W17_A396EmprCod = new String[] {""} ;
      P077W17_A361DisCod = new int[1] ;
      P077W17_A148BarEstReo = new byte[1] ;
      P077W17_A130BarCodPar = new String[] {""} ;
      P077W17_A129BarCod = new int[1] ;
      P077W17_A132BarCodReo = new byte[1] ;
      P077W17_A4845BarAudObs = new String[] {""} ;
      P077W17_n4845BarAudObs = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A4845BarAudObs = "" ;
      AV39Ceros8 = "" ;
      AV40BarCod_a = "" ;
      AV37Hdrcdb = "" ;
      X595Kilos = DecimalUtil.ZERO ;
      P077W18_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P077W19_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rdissup__default(),
         new Object[] {
             new Object[] {
            P077W2_A396EmprCod, P077W2_A407EmprNom, P077W2_n407EmprNom
            }
            , new Object[] {
            P077W4_A966PartCod, P077W4_n966PartCod, P077W4_A396EmprCod, P077W4_A361DisCod, P077W4_A970ProceCod, P077W4_n970ProceCod, P077W4_A5290DisTipCor, P077W4_A352DisArtTip, P077W4_A4471DisCruEnr, P077W4_A2835DisPle2,
            P077W4_A2926DisPla, P077W4_A4479DisAcaMar, P077W4_A2009DisTipDis, P077W4_n2009DisTipDis, P077W4_A5366DisAntp, P077W4_A5405DisAntpT, P077W4_A5252DisAcc, P077W4_A339DisArtLar, P077W4_A340DisArtMat, P077W4_A2833DisMtrLot,
            P077W4_A1052DisObs, P077W4_A4813DisEncCli, P077W4_A5349DisObsGrm, P077W4_A5350DisObsAnc, P077W4_A337DisArtDsc, P077W4_A390DisTipCol, P077W4_n390DisTipCol, P077W4_A363DisColNum, P077W4_n363DisColNum, P077W4_A362DisColNom,
            P077W4_n362DisColNom, P077W4_A335DisArtCod, P077W4_A279CliNom, P077W4_A252CliCod, P077W4_A4614DisMdlCod, P077W4_A4617DisHorReg, P077W4_n4617DisHorReg, P077W4_A369DisFec, P077W4_A360DisCliNum, P077W4_A379DisPie,
            P077W4_n379DisPie, P077W4_A365DisDes
            }
            , new Object[] {
            P077W5_A396EmprCod, P077W5_A361DisCod, P077W5_A44AlbRecCod
            }
            , new Object[] {
            P077W6_A396EmprCod, P077W6_A44AlbRecCod, P077W6_A4596AlbRDefCod
            }
            , new Object[] {
            P077W7_A4295ClasCod, P077W7_n4295ClasCod, P077W7_A396EmprCod, P077W7_A361DisCod, P077W7_A44AlbRecCod, P077W7_A4296ClasDsc, P077W7_n4296ClasDsc, P077W7_A50AlbRLoc, P077W7_A595Kilos, P077W7_A52AlbRPieEnt,
            P077W7_A49AlbRFen, P077W7_A55AlbRReo, P077W7_A46AlbREnt, P077W7_A673Piezas, P077W7_A4602AlbRMdlCod, P077W7_A4290AlbPmPPza, P077W7_A58AlbRUniEnt
            }
            , new Object[] {
            P077W8_A396EmprCod, P077W8_A44AlbRecCod, P077W8_A1300AlbRObs, P077W8_A1299AlbRLin
            }
            , new Object[] {
            P077W9_A396EmprCod, P077W9_A361DisCod, P077W9_A377DisObsTxt, P077W9_A376DisObsLin
            }
            , new Object[] {
            P077W10_A758ProCod, P077W10_A396EmprCod, P077W10_A361DisCod, P077W10_A846UltFasLin, P077W10_A4628ProDsc2
            }
            , new Object[] {
            P077W11_A396EmprCod, P077W11_A361DisCod, P077W11_A368DisFasLin, P077W11_A758ProCod, P077W11_A4642FasDsc2, P077W11_n4642FasDsc2, P077W11_A457FasCod, P077W11_A460FasDsc
            }
            , new Object[] {
            P077W12_A764ProForCod, P077W12_A396EmprCod, P077W12_A361DisCod, P077W12_A758ProCod, P077W12_A368DisFasLin, P077W12_A766ProForDsc, P077W12_A5377DisQuiLin
            }
            , new Object[] {
            P077W13_A396EmprCod, P077W13_A7247Aud_Hdrp, P077W13_A7246Aud_Hdrr, P077W13_A7245Aud_Hdr, P077W13_A7253Aud_Obs, P077W13_n7253Aud_Obs, P077W13_A7251Aud_Tip, P077W13_n7251Aud_Tip, P077W13_A7252Aud_Fec, P077W13_n7252Aud_Fec,
            P077W13_A7250Aud_Usur, P077W13_n7250Aud_Usur, P077W13_A7249Aud_Lin
            }
            , new Object[] {
            P077W14_A396EmprCod, P077W14_A774ProNumLin, P077W14_A758ProCod, P077W14_A5735ProFasNot, P077W14_n5735ProFasNot
            }
            , new Object[] {
            P077W15_A396EmprCod, P077W15_A44AlbRecCod, P077W15_A970ProceCod, P077W15_n970ProceCod, P077W15_A971ProceNom, P077W15_n971ProceNom
            }
            , new Object[] {
            P077W16_A396EmprCod, P077W16_A829TipArtCod, P077W16_A830TipArtDsc, P077W16_n830TipArtDsc
            }
            , new Object[] {
            P077W17_A396EmprCod, P077W17_A361DisCod, P077W17_A148BarEstReo, P077W17_A130BarCodPar, P077W17_A129BarCod, P077W17_A132BarCodReo, P077W17_A4845BarAudObs, P077W17_n4845BarAudObs
            }
            , new Object[] {
            P077W18_A595Kilos
            }
            , new Object[] {
            P077W19_A382DisPieKil
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV22F_colors ;
   private byte GXv_int4[] ;
   private byte A390DisTipCol ;
   private byte AV30Enc_e ;
   private byte AV31BarEstreo ;
   private byte AV57siobs ;
   private byte A1299AlbRLin ;
   private byte AV14FlagObs ;
   private byte A376DisObsLin ;
   private byte AV54Inicio_ob ;
   private byte AV51Barcodreo ;
   private byte A7246Aud_Hdrr ;
   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private short A970ProceCod ;
   private short A352DisArtTip ;
   private short A379DisPie ;
   private short A4596AlbRDefCod ;
   private short AV27TipARtCod ;
   private short AV8Piezas_e ;
   private short A4295ClasCod ;
   private short AV13PzasEstim ;
   private short AV20Procecod ;
   private short A846UltFasLin ;
   private short A368DisFasLin ;
   private short A5377DisQuiLin ;
   private short AV47barordlin ;
   private short AV43Nlin ;
   private short AV53t ;
   private short A774ProNumLin ;
   private short AV44i ;
   private short A829TipArtCod ;
   private short AV41LenVar ;
   private short Gx_err ;
   private int A361DisCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A363DisColNum ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int AV32Discod ;
   private int Gx_OldLine ;
   private int A52AlbRPieEnt ;
   private int A673Piezas ;
   private int A4291AlbPzaEst ;
   private int AV18RecCod ;
   private int AV19AlbRecCod ;
   private int AV50Barcod ;
   private int A7245Aud_Hdr ;
   private int A7249Aud_Lin ;
   private int A129BarCod ;
   private int E361DisCod ;
   private java.math.BigDecimal A2833DisMtrLot ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal AV9Kilos_e ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A4290AlbPmPPza ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV17Kilos_p ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String AV35Station ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String AV34usurcod ;
   private String AV56Litp ;
   private String GXt_char5 ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A966PartCod ;
   private String A5290DisTipCor ;
   private String A4471DisCruEnr ;
   private String A2835DisPle2 ;
   private String A2926DisPla ;
   private String A4479DisAcaMar ;
   private String A2009DisTipDis ;
   private String A5366DisAntp ;
   private String A5405DisAntpT ;
   private String A5252DisAcc ;
   private String A339DisArtLar ;
   private String A340DisArtMat ;
   private String A1052DisObs ;
   private String A4813DisEncCli ;
   private String A5349DisObsGrm ;
   private String A5350DisObsAnc ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A335DisArtCod ;
   private String A279CliNom ;
   private String A4614DisMdlCod ;
   private String A360DisCliNum ;
   private String A365DisDes ;
   private String AV29Tipo_e ;
   private String AV33Tipo_p ;
   private String AV42Texto_mf ;
   private String AV48Disdishcod ;
   private String AV28Muestras_i ;
   private String A4296ClasDsc ;
   private String A50AlbRLoc ;
   private String A55AlbRReo ;
   private String A46AlbREnt ;
   private String A4602AlbRMdlCod ;
   private String AV12ClasDsc ;
   private String AV15ALbRloc_4 ;
   private String A1300AlbRObs ;
   private String AV21Procenom ;
   private String A377DisObsTxt ;
   private String A758ProCod ;
   private String A4628ProDsc2 ;
   private String AV10ProcDsc2 ;
   private String AV23Var_1 ;
   private String AV24Var_2 ;
   private String A4642FasDsc2 ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV16FasDsc2_2 ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String AV46Procod ;
   private String AV49Barcodpar ;
   private String A7247Aud_Hdrp ;
   private String A7251Aud_Tip ;
   private String A7250Aud_Usur ;
   private String AV52Obs_a ;
   private String AV45Obs ;
   private String A971ProceNom ;
   private String AV25TipArtDsc ;
   private String A830TipArtDsc ;
   private String AV36baraudobs ;
   private String AV38Hdr ;
   private String A130BarCodPar ;
   private String AV39Ceros8 ;
   private String AV40BarCod_a ;
   private String AV37Hdrcdb ;
   private String E396EmprCod ;
   private java.util.Date A4617DisHorReg ;
   private java.util.Date A369DisFec ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A7252Aud_Fec ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n966PartCod ;
   private boolean n970ProceCod ;
   private boolean n2009DisTipDis ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n4617DisHorReg ;
   private boolean n379DisPie ;
   private boolean returnInSub ;
   private boolean n4295ClasCod ;
   private boolean n4296ClasDsc ;
   private boolean n4642FasDsc2 ;
   private boolean n7253Aud_Obs ;
   private boolean n7251Aud_Tip ;
   private boolean n7252Aud_Fec ;
   private boolean n7250Aud_Usur ;
   private boolean n5735ProFasNot ;
   private boolean n971ProceNom ;
   private boolean n830TipArtDsc ;
   private boolean n4845BarAudObs ;
   private String A7253Aud_Obs ;
   private String A5735ProFasNot ;
   private String A4845BarAudObs ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P077W2_A396EmprCod ;
   private String[] P077W2_A407EmprNom ;
   private boolean[] P077W2_n407EmprNom ;
   private String[] P077W4_A966PartCod ;
   private boolean[] P077W4_n966PartCod ;
   private String[] P077W4_A396EmprCod ;
   private int[] P077W4_A361DisCod ;
   private short[] P077W4_A970ProceCod ;
   private boolean[] P077W4_n970ProceCod ;
   private String[] P077W4_A5290DisTipCor ;
   private short[] P077W4_A352DisArtTip ;
   private String[] P077W4_A4471DisCruEnr ;
   private String[] P077W4_A2835DisPle2 ;
   private String[] P077W4_A2926DisPla ;
   private String[] P077W4_A4479DisAcaMar ;
   private String[] P077W4_A2009DisTipDis ;
   private boolean[] P077W4_n2009DisTipDis ;
   private String[] P077W4_A5366DisAntp ;
   private String[] P077W4_A5405DisAntpT ;
   private String[] P077W4_A5252DisAcc ;
   private String[] P077W4_A339DisArtLar ;
   private String[] P077W4_A340DisArtMat ;
   private java.math.BigDecimal[] P077W4_A2833DisMtrLot ;
   private String[] P077W4_A1052DisObs ;
   private String[] P077W4_A4813DisEncCli ;
   private String[] P077W4_A5349DisObsGrm ;
   private String[] P077W4_A5350DisObsAnc ;
   private String[] P077W4_A337DisArtDsc ;
   private byte[] P077W4_A390DisTipCol ;
   private boolean[] P077W4_n390DisTipCol ;
   private int[] P077W4_A363DisColNum ;
   private boolean[] P077W4_n363DisColNum ;
   private String[] P077W4_A362DisColNom ;
   private boolean[] P077W4_n362DisColNom ;
   private String[] P077W4_A335DisArtCod ;
   private String[] P077W4_A279CliNom ;
   private int[] P077W4_A252CliCod ;
   private String[] P077W4_A4614DisMdlCod ;
   private java.util.Date[] P077W4_A4617DisHorReg ;
   private boolean[] P077W4_n4617DisHorReg ;
   private java.util.Date[] P077W4_A369DisFec ;
   private String[] P077W4_A360DisCliNum ;
   private short[] P077W4_A379DisPie ;
   private boolean[] P077W4_n379DisPie ;
   private String[] P077W4_A365DisDes ;
   private String[] P077W5_A396EmprCod ;
   private int[] P077W5_A361DisCod ;
   private int[] P077W5_A44AlbRecCod ;
   private String[] P077W6_A396EmprCod ;
   private int[] P077W6_A44AlbRecCod ;
   private short[] P077W6_A4596AlbRDefCod ;
   private short[] P077W7_A4295ClasCod ;
   private boolean[] P077W7_n4295ClasCod ;
   private String[] P077W7_A396EmprCod ;
   private int[] P077W7_A361DisCod ;
   private int[] P077W7_A44AlbRecCod ;
   private String[] P077W7_A4296ClasDsc ;
   private boolean[] P077W7_n4296ClasDsc ;
   private String[] P077W7_A50AlbRLoc ;
   private java.math.BigDecimal[] P077W7_A595Kilos ;
   private int[] P077W7_A52AlbRPieEnt ;
   private java.util.Date[] P077W7_A49AlbRFen ;
   private String[] P077W7_A55AlbRReo ;
   private String[] P077W7_A46AlbREnt ;
   private int[] P077W7_A673Piezas ;
   private String[] P077W7_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] P077W7_A4290AlbPmPPza ;
   private java.math.BigDecimal[] P077W7_A58AlbRUniEnt ;
   private String[] P077W8_A396EmprCod ;
   private int[] P077W8_A44AlbRecCod ;
   private String[] P077W8_A1300AlbRObs ;
   private byte[] P077W8_A1299AlbRLin ;
   private String[] P077W9_A396EmprCod ;
   private int[] P077W9_A361DisCod ;
   private String[] P077W9_A377DisObsTxt ;
   private byte[] P077W9_A376DisObsLin ;
   private String[] P077W10_A758ProCod ;
   private String[] P077W10_A396EmprCod ;
   private int[] P077W10_A361DisCod ;
   private short[] P077W10_A846UltFasLin ;
   private String[] P077W10_A4628ProDsc2 ;
   private String[] P077W11_A396EmprCod ;
   private int[] P077W11_A361DisCod ;
   private short[] P077W11_A368DisFasLin ;
   private String[] P077W11_A758ProCod ;
   private String[] P077W11_A4642FasDsc2 ;
   private boolean[] P077W11_n4642FasDsc2 ;
   private String[] P077W11_A457FasCod ;
   private String[] P077W11_A460FasDsc ;
   private String[] P077W12_A764ProForCod ;
   private String[] P077W12_A396EmprCod ;
   private int[] P077W12_A361DisCod ;
   private String[] P077W12_A758ProCod ;
   private short[] P077W12_A368DisFasLin ;
   private String[] P077W12_A766ProForDsc ;
   private short[] P077W12_A5377DisQuiLin ;
   private String[] P077W13_A396EmprCod ;
   private String[] P077W13_A7247Aud_Hdrp ;
   private byte[] P077W13_A7246Aud_Hdrr ;
   private int[] P077W13_A7245Aud_Hdr ;
   private String[] P077W13_A7253Aud_Obs ;
   private boolean[] P077W13_n7253Aud_Obs ;
   private String[] P077W13_A7251Aud_Tip ;
   private boolean[] P077W13_n7251Aud_Tip ;
   private java.util.Date[] P077W13_A7252Aud_Fec ;
   private boolean[] P077W13_n7252Aud_Fec ;
   private String[] P077W13_A7250Aud_Usur ;
   private boolean[] P077W13_n7250Aud_Usur ;
   private int[] P077W13_A7249Aud_Lin ;
   private String[] P077W14_A396EmprCod ;
   private short[] P077W14_A774ProNumLin ;
   private String[] P077W14_A758ProCod ;
   private String[] P077W14_A5735ProFasNot ;
   private boolean[] P077W14_n5735ProFasNot ;
   private String[] P077W15_A396EmprCod ;
   private int[] P077W15_A44AlbRecCod ;
   private short[] P077W15_A970ProceCod ;
   private boolean[] P077W15_n970ProceCod ;
   private String[] P077W15_A971ProceNom ;
   private boolean[] P077W15_n971ProceNom ;
   private String[] P077W16_A396EmprCod ;
   private short[] P077W16_A829TipArtCod ;
   private String[] P077W16_A830TipArtDsc ;
   private boolean[] P077W16_n830TipArtDsc ;
   private String[] P077W17_A396EmprCod ;
   private int[] P077W17_A361DisCod ;
   private byte[] P077W17_A148BarEstReo ;
   private String[] P077W17_A130BarCodPar ;
   private int[] P077W17_A129BarCod ;
   private byte[] P077W17_A132BarCodReo ;
   private String[] P077W17_A4845BarAudObs ;
   private boolean[] P077W17_n4845BarAudObs ;
   private java.math.BigDecimal[] P077W18_A595Kilos ;
   private java.math.BigDecimal[] P077W19_A382DisPieKil ;
}

final  class rdissup__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P077W2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077W4", "SELECT T1.PartCod, T1.EmprCod, T1.DisCod, T3.ProceCod, T1.DisTipCor, T1.DisArtTip, T1.DisCruEnr, T1.DisPle2, T1.DisPla, T1.DisAcaMar, T1.DisTipDis, T1.DisAntp, T1.DisAntpT, T1.DisAcc, T1.DisArtLar, T1.DisArtMat, T1.DisMtrLot, T1.DisObs, T1.DisEncCli, T1.DisObsGrm, T1.DisObsAnc, T1.DisArtDsc, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisMdlCod, T1.DisHorReg, T1.DisFec, T1.DisCliNum, COALESCE( T4.DisPie, 0) AS DisPie, T1.DisDes FROM (((TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPCPARTI T3 ON T3.EmprCod = T1.EmprCod AND T3.PartCod = T1.PartCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(Piezas) AS DisPie, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077W5", "SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077W6", "SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077W7", "SELECT T2.ClasCod, T1.EmprCod, T1.DisCod, T1.AlbRecCod, T3.ClasDsc, T2.AlbRLoc, T1.Kilos, T2.AlbRPieEnt, T2.AlbRFen, T2.AlbRReo, T2.AlbREnt, T1.Piezas, T2.AlbRMdlCod, T2.AlbPmPPza, T2.AlbRUniEnt FROM ((TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLAPEN T3 ON T3.EmprCod = T1.EmprCod AND T3.ClasCod = T2.ClasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077W8", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077W9", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077W10", "SELECT T1.ProCod, T1.EmprCod, T1.DisCod, T1.UltFasLin, T2.ProDsc2 FROM (TXPDISLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077W11", "SELECT T1.EmprCod, T1.DisCod, T1.DisFasLin, T1.ProCod, T2.FasDsc2, T1.FasCod, T2.FasDsc FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077W12", "SELECT T1.ProForCod, T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T2.ProForDsc, T1.DisQuiLin FROM (TXPDISQUI T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T1.DisQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077W13", "SELECT EmprCod, Aud_Hdrp, Aud_Hdrr, Aud_Hdr, Aud_Obs, Aud_Tip, Aud_Fec, Aud_Usur, Aud_Lin FROM TXPAUDOP1 WHERE EmprCod = ? and Aud_Hdr = ? and Aud_Hdrr = ? and Aud_Hdrp = ? ORDER BY EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_Lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077W14", "SELECT EmprCod, ProNumLin, ProCod, ProFasNot FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077W15", "SELECT T1.EmprCod, T1.AlbRecCod, T1.ProceCod, T2.ProceNom FROM (TXPALBREC T1 LEFT JOIN TXPPROCED T2 ON T2.EmprCod = T1.EmprCod AND T2.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077W16", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077W17", "SELECT EmprCod, DisCod, BarEstReo, BarCodPar, BarCod, BarCodReo, BarAudObs FROM TXPBARCAD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P077W18", "SELECT SUM(Kilos) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P077W19", "SELECT SUM(DisPieKil) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 2);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((String[]) buf[17])[0] = rslt.getString(15, 10);
               ((String[]) buf[18])[0] = rslt.getString(16, 16);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[20])[0] = rslt.getString(18, 30);
               ((String[]) buf[21])[0] = rslt.getString(19, 20);
               ((String[]) buf[22])[0] = rslt.getString(20, 20);
               ((String[]) buf[23])[0] = rslt.getString(21, 20);
               ((String[]) buf[24])[0] = rslt.getString(22, 26);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(25, 13);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(26, 16);
               ((String[]) buf[32])[0] = rslt.getString(27, 30);
               ((int[]) buf[33])[0] = rslt.getInt(28);
               ((String[]) buf[34])[0] = rslt.getString(29, 13);
               ((java.util.Date[]) buf[35])[0] = GXutil.resetDate(rslt.getGXDateTime(30));
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDate(31);
               ((String[]) buf[38])[0] = rslt.getString(32, 8);
               ((short[]) buf[39])[0] = rslt.getShort(33);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(34, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 2);
               ((String[]) buf[12])[0] = rslt.getString(11, 8);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 13);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 28);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(9);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

