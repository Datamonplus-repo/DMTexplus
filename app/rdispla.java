package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rdispla extends GXReport
{
   public rdispla( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rdispla.class ), "" );
   }

   public rdispla( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      rdispla.this.aP2 = new String[] {""};
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
      rdispla.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rdispla.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      rdispla.this.Gx_out = aP2[0];
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
         rdispla.this.A396EmprCod = GXv_char1[0] ;
         rdispla.this.AV11EmprNom = GXv_char2[0] ;
         rdispla.this.AV34usurcod = GXv_char3[0] ;
         GXv_int4[0] = AV22F_colors ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLORS", ""), GXv_int4) ;
         rdispla.this.AV22F_colors = GXv_int4[0] ;
         GXt_char5 = AV56Litp ;
         GXv_char3[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ENCLAV01", ""), (byte)(99), GXv_char3) ;
         rdispla.this.GXt_char5 = GXv_char3[0] ;
         AV56Litp = GXt_char5 ;
         /* Using cursor P07R22 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07R22_A407EmprNom[0] ;
            n407EmprNom = P07R22_n407EmprNom[0] ;
            AV11EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P07R24 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A966PartCod = P07R24_A966PartCod[0] ;
            n966PartCod = P07R24_n966PartCod[0] ;
            A970ProceCod = P07R24_A970ProceCod[0] ;
            n970ProceCod = P07R24_n970ProceCod[0] ;
            A5290DisTipCor = P07R24_A5290DisTipCor[0] ;
            A352DisArtTip = P07R24_A352DisArtTip[0] ;
            A4471DisCruEnr = P07R24_A4471DisCruEnr[0] ;
            A2835DisPle2 = P07R24_A2835DisPle2[0] ;
            A2926DisPla = P07R24_A2926DisPla[0] ;
            A4479DisAcaMar = P07R24_A4479DisAcaMar[0] ;
            A340DisArtMat = P07R24_A340DisArtMat[0] ;
            A1052DisObs = P07R24_A1052DisObs[0] ;
            A4813DisEncCli = P07R24_A4813DisEncCli[0] ;
            A5349DisObsGrm = P07R24_A5349DisObsGrm[0] ;
            A5350DisObsAnc = P07R24_A5350DisObsAnc[0] ;
            A337DisArtDsc = P07R24_A337DisArtDsc[0] ;
            A390DisTipCol = P07R24_A390DisTipCol[0] ;
            n390DisTipCol = P07R24_n390DisTipCol[0] ;
            A363DisColNum = P07R24_A363DisColNum[0] ;
            n363DisColNum = P07R24_n363DisColNum[0] ;
            A362DisColNom = P07R24_A362DisColNom[0] ;
            n362DisColNom = P07R24_n362DisColNom[0] ;
            A335DisArtCod = P07R24_A335DisArtCod[0] ;
            A279CliNom = P07R24_A279CliNom[0] ;
            A252CliCod = P07R24_A252CliCod[0] ;
            A4614DisMdlCod = P07R24_A4614DisMdlCod[0] ;
            A4617DisHorReg = P07R24_A4617DisHorReg[0] ;
            n4617DisHorReg = P07R24_n4617DisHorReg[0] ;
            A369DisFec = P07R24_A369DisFec[0] ;
            A360DisCliNum = P07R24_A360DisCliNum[0] ;
            A379DisPie = P07R24_A379DisPie[0] ;
            n379DisPie = P07R24_n379DisPie[0] ;
            A365DisDes = P07R24_A365DisDes[0] ;
            A279CliNom = P07R24_A279CliNom[0] ;
            A970ProceCod = P07R24_A970ProceCod[0] ;
            n970ProceCod = P07R24_n970ProceCod[0] ;
            A379DisPie = P07R24_A379DisPie[0] ;
            n379DisPie = P07R24_n379DisPie[0] ;
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
            /* Using cursor P07R25 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A44AlbRecCod = P07R25_A44AlbRecCod[0] ;
               /* Using cursor P07R26 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A4596AlbRDefCod = P07R26_A4596AlbRDefCod[0] ;
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
            S121 ();
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
            h7R20( false, 55) ;
            getPrinter().GxDrawRect(13, Gx_line+17, 705, Gx_line+51, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Relacion Entradas en Almacen", ""), 13, Gx_line+2, 205, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Prenda", ""), 179, Gx_line+33, 251, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Loc.", ""), 277, Gx_line+33, 303, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mod./Ref.", ""), 332, Gx_line+33, 387, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tam.", ""), 413, Gx_line+33, 442, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 458, Gx_line+33, 488, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Prendas", ""), 509, Gx_line+33, 560, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recep.", ""), 583, Gx_line+33, 625, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 598, Gx_line+21, 612, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(271, Gx_line+17, 271, Gx_line+56, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(307, Gx_line+17, 307, Gx_line+56, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(409, Gx_line+17, 409, Gx_line+56, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(445, Gx_line+17, 445, Gx_line+56, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(503, Gx_line+17, 503, Gx_line+56, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(13, Gx_line+50, 13, Gx_line+55, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(703, Gx_line+50, 703, Gx_line+55, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Remision", ""), 14, Gx_line+33, 70, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(154, Gx_line+17, 154, Gx_line+56, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(641, Gx_line+17, 641, Gx_line+56, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Reo?", ""), 649, Gx_line+31, 680, Gx_line+47, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(78, Gx_line+17, 78, Gx_line+56, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 95, Gx_line+32, 131, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(566, Gx_line+17, 566, Gx_line+56, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+55) ;
            /* Using cursor P07R27 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A4295ClasCod = P07R27_A4295ClasCod[0] ;
               n4295ClasCod = P07R27_n4295ClasCod[0] ;
               A4296ClasDsc = P07R27_A4296ClasDsc[0] ;
               n4296ClasDsc = P07R27_n4296ClasDsc[0] ;
               A50AlbRLoc = P07R27_A50AlbRLoc[0] ;
               A595Kilos = P07R27_A595Kilos[0] ;
               A44AlbRecCod = P07R27_A44AlbRecCod[0] ;
               A49AlbRFen = P07R27_A49AlbRFen[0] ;
               A55AlbRReo = P07R27_A55AlbRReo[0] ;
               A46AlbREnt = P07R27_A46AlbREnt[0] ;
               A673Piezas = P07R27_A673Piezas[0] ;
               A4601AlbRTam = P07R27_A4601AlbRTam[0] ;
               A4602AlbRMdlCod = P07R27_A4602AlbRMdlCod[0] ;
               A4290AlbPmPPza = P07R27_A4290AlbPmPPza[0] ;
               A58AlbRUniEnt = P07R27_A58AlbRUniEnt[0] ;
               A4295ClasCod = P07R27_A4295ClasCod[0] ;
               n4295ClasCod = P07R27_n4295ClasCod[0] ;
               A50AlbRLoc = P07R27_A50AlbRLoc[0] ;
               A49AlbRFen = P07R27_A49AlbRFen[0] ;
               A55AlbRReo = P07R27_A55AlbRReo[0] ;
               A46AlbREnt = P07R27_A46AlbREnt[0] ;
               A4601AlbRTam = P07R27_A4601AlbRTam[0] ;
               A4602AlbRMdlCod = P07R27_A4602AlbRMdlCod[0] ;
               A4290AlbPmPPza = P07R27_A4290AlbPmPPza[0] ;
               A58AlbRUniEnt = P07R27_A58AlbRUniEnt[0] ;
               A4296ClasDsc = P07R27_A4296ClasDsc[0] ;
               n4296ClasDsc = P07R27_n4296ClasDsc[0] ;
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
               S111 ();
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
               h7R20( false, 20) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4602AlbRMdlCod, "")), 311, Gx_line+0, 407, Gx_line+17, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15ALbRloc_4, "")), 275, Gx_line+0, 305, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12ClasDsc, "")), 158, Gx_line+0, 268, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4601AlbRTam, "")), 414, Gx_line+0, 444, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Kilos_p, "ZZZ9.99")), 449, Gx_line+0, 501, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18RecCod), "ZZZZZZ9")), 575, Gx_line+0, 627, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9")), 520, Gx_line+0, 565, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(271, Gx_line+0, 271, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(409, Gx_line+0, 409, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(445, Gx_line+0, 445, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(307, Gx_line+0, 307, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(503, Gx_line+0, 503, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(703, Gx_line+0, 703, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(13, Gx_line+0, 13, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(13, Gx_line+17, 705, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(13, Gx_line+16, 13, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 17, Gx_line+0, 76, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(154, Gx_line+0, 154, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A55AlbRReo, "@!")), 653, Gx_line+0, 669, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(641, Gx_line+0, 641, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(703, Gx_line+16, 703, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(78, Gx_line+0, 78, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 80, Gx_line+0, 139, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(566, Gx_line+0, 566, Gx_line+20, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
               if ( AV20Procecod > 0 )
               {
                  h7R20( false, 21) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Procenom, "")), 168, Gx_line+1, 388, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Confeccionador", ""), 70, Gx_line+1, 162, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(13, Gx_line+0, 13, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(703, Gx_line+0, 703, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(13, Gx_line+17, 705, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(78, Gx_line+17, 78, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(154, Gx_line+17, 154, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(409, Gx_line+17, 409, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(445, Gx_line+17, 445, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(503, Gx_line+17, 503, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(566, Gx_line+17, 566, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(271, Gx_line+17, 271, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(641, Gx_line+17, 641, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(307, Gx_line+17, 307, Gx_line+21, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+21) ;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            h7R20( false, 3) ;
            getPrinter().GxDrawLine(13, Gx_line+0, 705, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+3) ;
            AV14FlagObs = (byte)(0) ;
            /* Using cursor P07R28 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A377DisObsTxt = P07R28_A377DisObsTxt[0] ;
               A376DisObsLin = P07R28_A376DisObsLin[0] ;
               if ( AV14FlagObs == 0 )
               {
                  AV14FlagObs = (byte)(1) ;
                  h7R20( false, 21) ;
                  getPrinter().GxDrawRect(13, Gx_line+0, 705, Gx_line+17, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 51, Gx_line+1, 142, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+21) ;
               }
               h7R20( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A377DisObsTxt, "")), 51, Gx_line+0, 490, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            h7R20( false, 31) ;
            getPrinter().GxDrawRect(13, Gx_line+2, 705, Gx_line+28, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "RUTA DE PROCESOS", ""), 294, Gx_line+8, 423, Gx_line+23, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+31) ;
            /* Using cursor P07R29 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A368DisFasLin = P07R29_A368DisFasLin[0] ;
               A758ProCod = P07R29_A758ProCod[0] ;
               A460FasDsc = P07R29_A460FasDsc[0] ;
               A457FasCod = P07R29_A457FasCod[0] ;
               A460FasDsc = P07R29_A460FasDsc[0] ;
               h7R20( false, 28) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9")), 38, Gx_line+0, 77, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 81, Gx_line+0, 157, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 163, Gx_line+0, 427, Gx_line+19, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(13, Gx_line+22, 705, Gx_line+22, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+28) ;
               /* Using cursor P07R210 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A7919Dta_Ordl = P07R210_A7919Dta_Ordl[0] ;
                  A7925Dta_ForRb = P07R210_A7925Dta_ForRb[0] ;
                  n7925Dta_ForRb = P07R210_n7925Dta_ForRb[0] ;
                  A7926Dta_ForPhx = P07R210_A7926Dta_ForPhx[0] ;
                  n7926Dta_ForPhx = P07R210_n7926Dta_ForPhx[0] ;
                  A7927Dta_ForPhn = P07R210_A7927Dta_ForPhn[0] ;
                  n7927Dta_ForPhn = P07R210_n7927Dta_ForPhn[0] ;
                  A7924Dta_ForTmx = P07R210_A7924Dta_ForTmx[0] ;
                  n7924Dta_ForTmx = P07R210_n7924Dta_ForTmx[0] ;
                  A7923Dta_Fortie = P07R210_A7923Dta_Fortie[0] ;
                  n7923Dta_Fortie = P07R210_n7923Dta_Fortie[0] ;
                  A7920Dta_CPQ = P07R210_A7920Dta_CPQ[0] ;
                  n7920Dta_CPQ = P07R210_n7920Dta_CPQ[0] ;
                  GXt_char5 = A7921Dta_DPQ ;
                  GXv_char3[0] = A396EmprCod ;
                  GXv_char2[0] = A7920Dta_CPQ ;
                  GXv_char1[0] = GXt_char5 ;
                  new app.ppreqd3(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
                  rdispla.this.A396EmprCod = GXv_char3[0] ;
                  rdispla.this.A7920Dta_CPQ = GXv_char2[0] ;
                  rdispla.this.GXt_char5 = GXv_char1[0] ;
                  A7921Dta_DPQ = GXt_char5 ;
                  AV57Dsc = GXutil.substring( A7921Dta_DPQ, 1, 30) ;
                  h7R20( false, 22) ;
                  getPrinter().GxDrawRect(13, Gx_line+0, 705, Gx_line+22, 1, 0, 0, 0, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7920Dta_CPQ, "")), 27, Gx_line+3, 97, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Dsc, "")), 91, Gx_line+3, 248, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7923Dta_Fortie), "ZZZ9")), 306, Gx_line+3, 336, Gx_line+20, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7924Dta_ForTmx), "ZZZ9")), 369, Gx_line+3, 399, Gx_line+20, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A7927Dta_ForPhn, "Z9.99")), 477, Gx_line+3, 514, Gx_line+20, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A7926Dta_ForPhx, "Z9.99")), 571, Gx_line+3, 608, Gx_line+20, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A7925Dta_ForRb, "ZZZ9.99")), 640, Gx_line+3, 692, Gx_line+20, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "min", ""), 338, Gx_line+4, 361, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ºC", ""), 400, Gx_line+4, 414, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ph min:", ""), 427, Gx_line+4, 471, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ph max:", ""), 521, Gx_line+4, 567, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Rb:", ""), 621, Gx_line+4, 640, Gx_line+19, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+22) ;
                  /* Using cursor P07R211 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl)});
                  while ( (pr_default.getStatus(8) != 101) )
                  {
                     A490ForPrdUMe = P07R211_A490ForPrdUMe[0] ;
                     n490ForPrdUMe = P07R211_n490ForPrdUMe[0] ;
                     A488ForPrdDsc = P07R211_A488ForPrdDsc[0] ;
                     n488ForPrdDsc = P07R211_n488ForPrdDsc[0] ;
                     A7932Dta_Forcan = P07R211_A7932Dta_Forcan[0] ;
                     n7932Dta_Forcan = P07R211_n7932Dta_Forcan[0] ;
                     A7929Dta_ForLin = P07R211_A7929Dta_ForLin[0] ;
                     A7930Dta_Prdnum = P07R211_A7930Dta_Prdnum[0] ;
                     n7930Dta_Prdnum = P07R211_n7930Dta_Prdnum[0] ;
                     A488ForPrdDsc = P07R211_A488ForPrdDsc[0] ;
                     n488ForPrdDsc = P07R211_n488ForPrdDsc[0] ;
                     GXt_char5 = A7931Dta_PrdNom ;
                     GXv_char3[0] = A396EmprCod ;
                     GXv_char2[0] = A7930Dta_Prdnum ;
                     GXv_char1[0] = GXt_char5 ;
                     new app.pprddsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
                     rdispla.this.A396EmprCod = GXv_char3[0] ;
                     rdispla.this.A7930Dta_Prdnum = GXv_char2[0] ;
                     rdispla.this.GXt_char5 = GXv_char1[0] ;
                     A7931Dta_PrdNom = GXt_char5 ;
                     h7R20( false, 19) ;
                     getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7930Dta_Prdnum, "")), 30, Gx_line+1, 75, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7931Dta_PrdNom, "")), 80, Gx_line+1, 271, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A7932Dta_Forcan, "ZZZZZ9.99999")), 280, Gx_line+1, 369, Gx_line+19, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 374, Gx_line+1, 411, Gx_line+19, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+19) ;
                     pr_default.readNext(8);
                  }
                  pr_default.close(8);
                  pr_default.readNext(7);
               }
               pr_default.close(7);
               AV58DisPartxt = " " ;
               /* Using cursor P07R212 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
               while ( (pr_default.getStatus(9) != 101) )
               {
                  A3687DisParTxt = P07R212_A3687DisParTxt[0] ;
                  A1665ParFasDsc = P07R212_A1665ParFasDsc[0] ;
                  n1665ParFasDsc = P07R212_n1665ParFasDsc[0] ;
                  A3685DisParVal = P07R212_A3685DisParVal[0] ;
                  A1664ParFasCod = P07R212_A1664ParFasCod[0] ;
                  A1665ParFasDsc = P07R212_A1665ParFasDsc[0] ;
                  n1665ParFasDsc = P07R212_n1665ParFasDsc[0] ;
                  if ( A1664ParFasCod == 9999 )
                  {
                     AV58DisPartxt = A3687DisParTxt ;
                     AV43Nlin = (short)(GXutil.gxmlines( AV58DisPartxt, (short)(55))) ;
                     if ( AV43Nlin > 0 )
                     {
                        AV59ObsFs = GXutil.gxgetmli( AV58DisPartxt, (short)(1), (short)(55)) ;
                        h7R20( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59ObsFs, "")), 30, Gx_line+0, 432, Gx_line+17, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                  }
                  else
                  {
                     h7R20( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3685DisParVal, "")), 30, Gx_line+0, 89, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1665ParFasDsc, "")), 93, Gx_line+0, 313, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  pr_default.readNext(9);
               }
               pr_default.close(9);
               pr_default.readNext(6);
            }
            pr_default.close(6);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         h7R20( false, 31) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Impresion", ""), 15, Gx_line+7, 114, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 126, Gx_line+7, 185, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario Impresion", ""), 511, Gx_line+7, 620, Gx_line+23, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34usurcod, "@!")), 641, Gx_line+7, 700, Gx_line+24, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(13, Gx_line+2, 705, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+31) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7R20( true, 0) ;
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
      /* 'CONF' Routine */
      returnInSub = false ;
      AV21Procenom = GXutil.space( (short)(30)) ;
      AV20Procecod = (short)(0) ;
      /* Using cursor P07R213 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV19AlbRecCod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A44AlbRecCod = P07R213_A44AlbRecCod[0] ;
         A970ProceCod = P07R213_A970ProceCod[0] ;
         n970ProceCod = P07R213_n970ProceCod[0] ;
         A971ProceNom = P07R213_A971ProceNom[0] ;
         n971ProceNom = P07R213_n971ProceNom[0] ;
         A971ProceNom = P07R213_A971ProceNom[0] ;
         n971ProceNom = P07R213_n971ProceNom[0] ;
         AV20Procecod = A970ProceCod ;
         AV21Procenom = A971ProceNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV25TipArtDsc = "" ;
      /* Using cursor P07R214 */
      pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(AV27TipARtCod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A829TipArtCod = P07R214_A829TipArtCod[0] ;
         A830TipArtDsc = P07R214_A830TipArtDsc[0] ;
         n830TipArtDsc = P07R214_n830TipArtDsc[0] ;
         AV25TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV31BarEstreo = (byte)(0) ;
      AV49Barcodpar = " " ;
      AV36baraudobs = " " ;
      AV38Hdr = " " ;
      /* Using cursor P07R215 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV32Discod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A148BarEstReo = P07R215_A148BarEstReo[0] ;
         A130BarCodPar = P07R215_A130BarCodPar[0] ;
         A129BarCod = P07R215_A129BarCod[0] ;
         A132BarCodReo = P07R215_A132BarCodReo[0] ;
         A4845BarAudObs = P07R215_A4845BarAudObs[0] ;
         n4845BarAudObs = P07R215_n4845BarAudObs[0] ;
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
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void h7R20( boolean bFoot ,
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
               getPrinter().GxDrawRect(13, Gx_line+60, 277, Gx_line+82, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Disp. Interna", ""), 20, Gx_line+38, 111, Gx_line+54, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), 113, Gx_line+38, 172, Gx_line+55, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Remision Cliente", ""), 25, Gx_line+134, 125, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A360DisCliNum, "")), 129, Gx_line+134, 188, Gx_line+151, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 25, Gx_line+171, 72, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 20, Gx_line+90, 56, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A369DisFec, "99/99/99"), 69, Gx_line+90, 128, Gx_line+107, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 149, Gx_line+90, 178, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A4617DisHorReg, "99:99:99"), 193, Gx_line+90, 252, Gx_line+107, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Entrada", ""), 123, Gx_line+64, 170, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(13, Gx_line+81, 277, Gx_line+113, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Modelo", ""), 25, Gx_line+189, 69, Gx_line+205, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4614DisMdlCod, "")), 129, Gx_line+189, 225, Gx_line+206, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11EmprNom, "")), 13, Gx_line+0, 233, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(13, Gx_line+29, 277, Gx_line+61, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(13, Gx_line+113, 705, Gx_line+236, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 611, Gx_line+95, 653, Gx_line+111, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 661, Gx_line+95, 706, Gx_line+112, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 129, Gx_line+117, 174, Gx_line+134, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 193, Gx_line+117, 413, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+117, 67, Gx_line+133, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A335DisArtCod, "")), 129, Gx_line+171, 247, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 25, Gx_line+207, 57, Gx_line+223, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A362DisColNom, "")), 129, Gx_line+207, 225, Gx_line+224, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9")), 235, Gx_line+207, 280, Gx_line+224, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9")), 285, Gx_line+207, 301, Gx_line+224, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TipArtDsc, "")), 445, Gx_line+171, 665, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), 250, Gx_line+171, 441, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Muestras_i, "")), 292, Gx_line+38, 439, Gx_line+55, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Emitido por", ""), 292, Gx_line+63, 360, Gx_line+79, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5350DisObsAnc, "")), 383, Gx_line+63, 530, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5349DisObsGrm, "")), 383, Gx_line+86, 530, Gx_line+103, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Modificado por", ""), 292, Gx_line+90, 381, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Referencia", ""), 274, Gx_line+189, 340, Gx_line+205, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Disdishcod, "")), 356, Gx_line+189, 503, Gx_line+206, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Contrato", ""), 25, Gx_line+152, 77, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4813DisEncCli, "")), 129, Gx_line+152, 276, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Tipo_p, "")), 292, Gx_line+7, 397, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1052DisObs, "")), 445, Gx_line+117, 665, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36baraudobs, "")), 200, Gx_line+134, 688, Gx_line+150, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Hdrcdb, "")), 579, Gx_line+13, 705, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Hdr, "")), 613, Gx_line+36, 706, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.P.", ""), 579, Gx_line+39, 606, Gx_line+56, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Texto_mf, "")), 490, Gx_line+206, 699, Gx_line+226, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A340DisArtMat, "")), 445, Gx_line+152, 563, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Litp, "")), 377, Gx_line+152, 441, Gx_line+170, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+238) ;
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
      this.aP0[0] = rdispla.this.A396EmprCod;
      this.aP1[0] = rdispla.this.A361DisCod;
      this.aP2[0] = rdispla.this.Gx_out;
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
      /* Using cursor P07R216 */
      pr_default.execute(13, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         X595Kilos = P07R216_A595Kilos[0] ;
      }
      pr_default.close(13);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P07R217 */
      pr_default.execute(14, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         X382DisPieKil = P07R217_A382DisPieKil[0] ;
      }
      pr_default.close(14);
      return X382DisPieKil ;
   }

   public void initialize( )
   {
      AV35Station = "" ;
      AV11EmprNom = "" ;
      AV34usurcod = "" ;
      GXv_int4 = new byte[1] ;
      AV56Litp = "" ;
      scmdbuf = "" ;
      P07R22_A396EmprCod = new String[] {""} ;
      P07R22_A407EmprNom = new String[] {""} ;
      P07R22_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      P07R24_A966PartCod = new String[] {""} ;
      P07R24_n966PartCod = new boolean[] {false} ;
      P07R24_A396EmprCod = new String[] {""} ;
      P07R24_A361DisCod = new int[1] ;
      P07R24_A970ProceCod = new short[1] ;
      P07R24_n970ProceCod = new boolean[] {false} ;
      P07R24_A5290DisTipCor = new String[] {""} ;
      P07R24_A352DisArtTip = new short[1] ;
      P07R24_A4471DisCruEnr = new String[] {""} ;
      P07R24_A2835DisPle2 = new String[] {""} ;
      P07R24_A2926DisPla = new String[] {""} ;
      P07R24_A4479DisAcaMar = new String[] {""} ;
      P07R24_A340DisArtMat = new String[] {""} ;
      P07R24_A1052DisObs = new String[] {""} ;
      P07R24_A4813DisEncCli = new String[] {""} ;
      P07R24_A5349DisObsGrm = new String[] {""} ;
      P07R24_A5350DisObsAnc = new String[] {""} ;
      P07R24_A337DisArtDsc = new String[] {""} ;
      P07R24_A390DisTipCol = new byte[1] ;
      P07R24_n390DisTipCol = new boolean[] {false} ;
      P07R24_A363DisColNum = new int[1] ;
      P07R24_n363DisColNum = new boolean[] {false} ;
      P07R24_A362DisColNom = new String[] {""} ;
      P07R24_n362DisColNom = new boolean[] {false} ;
      P07R24_A335DisArtCod = new String[] {""} ;
      P07R24_A279CliNom = new String[] {""} ;
      P07R24_A252CliCod = new int[1] ;
      P07R24_A4614DisMdlCod = new String[] {""} ;
      P07R24_A4617DisHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      P07R24_n4617DisHorReg = new boolean[] {false} ;
      P07R24_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07R24_A360DisCliNum = new String[] {""} ;
      P07R24_A379DisPie = new short[1] ;
      P07R24_n379DisPie = new boolean[] {false} ;
      P07R24_A365DisDes = new String[] {""} ;
      A966PartCod = "" ;
      A5290DisTipCor = "" ;
      A4471DisCruEnr = "" ;
      A2835DisPle2 = "" ;
      A2926DisPla = "" ;
      A4479DisAcaMar = "" ;
      A340DisArtMat = "" ;
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
      P07R25_A396EmprCod = new String[] {""} ;
      P07R25_A361DisCod = new int[1] ;
      P07R25_A44AlbRecCod = new int[1] ;
      P07R26_A396EmprCod = new String[] {""} ;
      P07R26_A44AlbRecCod = new int[1] ;
      P07R26_A4596AlbRDefCod = new short[1] ;
      AV29Tipo_e = "" ;
      AV33Tipo_p = "" ;
      AV42Texto_mf = "" ;
      AV48Disdishcod = "" ;
      AV9Kilos_e = DecimalUtil.ZERO ;
      AV28Muestras_i = "" ;
      P07R27_A4295ClasCod = new short[1] ;
      P07R27_n4295ClasCod = new boolean[] {false} ;
      P07R27_A396EmprCod = new String[] {""} ;
      P07R27_A361DisCod = new int[1] ;
      P07R27_A4296ClasDsc = new String[] {""} ;
      P07R27_n4296ClasDsc = new boolean[] {false} ;
      P07R27_A50AlbRLoc = new String[] {""} ;
      P07R27_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07R27_A44AlbRecCod = new int[1] ;
      P07R27_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P07R27_A55AlbRReo = new String[] {""} ;
      P07R27_A46AlbREnt = new String[] {""} ;
      P07R27_A673Piezas = new int[1] ;
      P07R27_A4601AlbRTam = new String[] {""} ;
      P07R27_A4602AlbRMdlCod = new String[] {""} ;
      P07R27_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07R27_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4296ClasDsc = "" ;
      A50AlbRLoc = "" ;
      A595Kilos = DecimalUtil.ZERO ;
      A49AlbRFen = GXutil.nullDate() ;
      A55AlbRReo = "" ;
      A46AlbREnt = "" ;
      A4601AlbRTam = "" ;
      A4602AlbRMdlCod = "" ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      AV12ClasDsc = "" ;
      AV15ALbRloc_4 = "" ;
      AV17Kilos_p = DecimalUtil.ZERO ;
      AV21Procenom = "" ;
      P07R28_A396EmprCod = new String[] {""} ;
      P07R28_A361DisCod = new int[1] ;
      P07R28_A377DisObsTxt = new String[] {""} ;
      P07R28_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      P07R29_A396EmprCod = new String[] {""} ;
      P07R29_A361DisCod = new int[1] ;
      P07R29_A368DisFasLin = new short[1] ;
      P07R29_A758ProCod = new String[] {""} ;
      P07R29_A460FasDsc = new String[] {""} ;
      P07R29_A457FasCod = new String[] {""} ;
      A758ProCod = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      P07R210_A361DisCod = new int[1] ;
      P07R210_A758ProCod = new String[] {""} ;
      P07R210_A368DisFasLin = new short[1] ;
      P07R210_A7919Dta_Ordl = new short[1] ;
      P07R210_A7925Dta_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07R210_n7925Dta_ForRb = new boolean[] {false} ;
      P07R210_A7926Dta_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07R210_n7926Dta_ForPhx = new boolean[] {false} ;
      P07R210_A7927Dta_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07R210_n7927Dta_ForPhn = new boolean[] {false} ;
      P07R210_A7924Dta_ForTmx = new short[1] ;
      P07R210_n7924Dta_ForTmx = new boolean[] {false} ;
      P07R210_A7923Dta_Fortie = new short[1] ;
      P07R210_n7923Dta_Fortie = new boolean[] {false} ;
      P07R210_A396EmprCod = new String[] {""} ;
      P07R210_A7920Dta_CPQ = new String[] {""} ;
      P07R210_n7920Dta_CPQ = new boolean[] {false} ;
      A7925Dta_ForRb = DecimalUtil.ZERO ;
      A7926Dta_ForPhx = DecimalUtil.ZERO ;
      A7927Dta_ForPhn = DecimalUtil.ZERO ;
      A7920Dta_CPQ = "" ;
      A7921Dta_DPQ = "" ;
      AV57Dsc = "" ;
      P07R211_A490ForPrdUMe = new byte[1] ;
      P07R211_n490ForPrdUMe = new boolean[] {false} ;
      P07R211_A361DisCod = new int[1] ;
      P07R211_A758ProCod = new String[] {""} ;
      P07R211_A368DisFasLin = new short[1] ;
      P07R211_A7919Dta_Ordl = new short[1] ;
      P07R211_A488ForPrdDsc = new String[] {""} ;
      P07R211_n488ForPrdDsc = new boolean[] {false} ;
      P07R211_A7932Dta_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07R211_n7932Dta_Forcan = new boolean[] {false} ;
      P07R211_A7929Dta_ForLin = new short[1] ;
      P07R211_A396EmprCod = new String[] {""} ;
      P07R211_A7930Dta_Prdnum = new String[] {""} ;
      P07R211_n7930Dta_Prdnum = new boolean[] {false} ;
      A488ForPrdDsc = "" ;
      A7932Dta_Forcan = DecimalUtil.ZERO ;
      A7930Dta_Prdnum = "" ;
      A7931Dta_PrdNom = "" ;
      GXt_char5 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      AV58DisPartxt = "" ;
      P07R212_A3687DisParTxt = new String[] {""} ;
      P07R212_A396EmprCod = new String[] {""} ;
      P07R212_A361DisCod = new int[1] ;
      P07R212_A758ProCod = new String[] {""} ;
      P07R212_A368DisFasLin = new short[1] ;
      P07R212_A1665ParFasDsc = new String[] {""} ;
      P07R212_n1665ParFasDsc = new boolean[] {false} ;
      P07R212_A3685DisParVal = new String[] {""} ;
      P07R212_A1664ParFasCod = new short[1] ;
      A3687DisParTxt = "" ;
      A1665ParFasDsc = "" ;
      A3685DisParVal = "" ;
      AV59ObsFs = "" ;
      Gx_date = GXutil.nullDate() ;
      P07R213_A396EmprCod = new String[] {""} ;
      P07R213_A44AlbRecCod = new int[1] ;
      P07R213_A970ProceCod = new short[1] ;
      P07R213_n970ProceCod = new boolean[] {false} ;
      P07R213_A971ProceNom = new String[] {""} ;
      P07R213_n971ProceNom = new boolean[] {false} ;
      A971ProceNom = "" ;
      AV25TipArtDsc = "" ;
      P07R214_A396EmprCod = new String[] {""} ;
      P07R214_A829TipArtCod = new short[1] ;
      P07R214_A830TipArtDsc = new String[] {""} ;
      P07R214_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      AV49Barcodpar = "" ;
      AV36baraudobs = "" ;
      AV38Hdr = "" ;
      P07R215_A396EmprCod = new String[] {""} ;
      P07R215_A361DisCod = new int[1] ;
      P07R215_A148BarEstReo = new byte[1] ;
      P07R215_A130BarCodPar = new String[] {""} ;
      P07R215_A129BarCod = new int[1] ;
      P07R215_A132BarCodReo = new byte[1] ;
      P07R215_A4845BarAudObs = new String[] {""} ;
      P07R215_n4845BarAudObs = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A4845BarAudObs = "" ;
      AV39Ceros8 = "" ;
      AV40BarCod_a = "" ;
      AV37Hdrcdb = "" ;
      X595Kilos = DecimalUtil.ZERO ;
      P07R216_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P07R217_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rdispla__default(),
         new Object[] {
             new Object[] {
            P07R22_A396EmprCod, P07R22_A407EmprNom, P07R22_n407EmprNom
            }
            , new Object[] {
            P07R24_A966PartCod, P07R24_n966PartCod, P07R24_A396EmprCod, P07R24_A361DisCod, P07R24_A970ProceCod, P07R24_n970ProceCod, P07R24_A5290DisTipCor, P07R24_A352DisArtTip, P07R24_A4471DisCruEnr, P07R24_A2835DisPle2,
            P07R24_A2926DisPla, P07R24_A4479DisAcaMar, P07R24_A340DisArtMat, P07R24_A1052DisObs, P07R24_A4813DisEncCli, P07R24_A5349DisObsGrm, P07R24_A5350DisObsAnc, P07R24_A337DisArtDsc, P07R24_A390DisTipCol, P07R24_n390DisTipCol,
            P07R24_A363DisColNum, P07R24_n363DisColNum, P07R24_A362DisColNom, P07R24_n362DisColNom, P07R24_A335DisArtCod, P07R24_A279CliNom, P07R24_A252CliCod, P07R24_A4614DisMdlCod, P07R24_A4617DisHorReg, P07R24_n4617DisHorReg,
            P07R24_A369DisFec, P07R24_A360DisCliNum, P07R24_A379DisPie, P07R24_n379DisPie, P07R24_A365DisDes
            }
            , new Object[] {
            P07R25_A396EmprCod, P07R25_A361DisCod, P07R25_A44AlbRecCod
            }
            , new Object[] {
            P07R26_A396EmprCod, P07R26_A44AlbRecCod, P07R26_A4596AlbRDefCod
            }
            , new Object[] {
            P07R27_A4295ClasCod, P07R27_n4295ClasCod, P07R27_A396EmprCod, P07R27_A361DisCod, P07R27_A4296ClasDsc, P07R27_n4296ClasDsc, P07R27_A50AlbRLoc, P07R27_A595Kilos, P07R27_A44AlbRecCod, P07R27_A49AlbRFen,
            P07R27_A55AlbRReo, P07R27_A46AlbREnt, P07R27_A673Piezas, P07R27_A4601AlbRTam, P07R27_A4602AlbRMdlCod, P07R27_A4290AlbPmPPza, P07R27_A58AlbRUniEnt
            }
            , new Object[] {
            P07R28_A396EmprCod, P07R28_A361DisCod, P07R28_A377DisObsTxt, P07R28_A376DisObsLin
            }
            , new Object[] {
            P07R29_A396EmprCod, P07R29_A361DisCod, P07R29_A368DisFasLin, P07R29_A758ProCod, P07R29_A460FasDsc, P07R29_A457FasCod
            }
            , new Object[] {
            P07R210_A361DisCod, P07R210_A758ProCod, P07R210_A368DisFasLin, P07R210_A7919Dta_Ordl, P07R210_A7925Dta_ForRb, P07R210_n7925Dta_ForRb, P07R210_A7926Dta_ForPhx, P07R210_n7926Dta_ForPhx, P07R210_A7927Dta_ForPhn, P07R210_n7927Dta_ForPhn,
            P07R210_A7924Dta_ForTmx, P07R210_n7924Dta_ForTmx, P07R210_A7923Dta_Fortie, P07R210_n7923Dta_Fortie, P07R210_A396EmprCod, P07R210_A7920Dta_CPQ, P07R210_n7920Dta_CPQ
            }
            , new Object[] {
            P07R211_A490ForPrdUMe, P07R211_n490ForPrdUMe, P07R211_A361DisCod, P07R211_A758ProCod, P07R211_A368DisFasLin, P07R211_A7919Dta_Ordl, P07R211_A488ForPrdDsc, P07R211_n488ForPrdDsc, P07R211_A7932Dta_Forcan, P07R211_n7932Dta_Forcan,
            P07R211_A7929Dta_ForLin, P07R211_A396EmprCod, P07R211_A7930Dta_Prdnum, P07R211_n7930Dta_Prdnum
            }
            , new Object[] {
            P07R212_A3687DisParTxt, P07R212_A396EmprCod, P07R212_A361DisCod, P07R212_A758ProCod, P07R212_A368DisFasLin, P07R212_A1665ParFasDsc, P07R212_n1665ParFasDsc, P07R212_A3685DisParVal, P07R212_A1664ParFasCod
            }
            , new Object[] {
            P07R213_A396EmprCod, P07R213_A44AlbRecCod, P07R213_A970ProceCod, P07R213_n970ProceCod, P07R213_A971ProceNom, P07R213_n971ProceNom
            }
            , new Object[] {
            P07R214_A396EmprCod, P07R214_A829TipArtCod, P07R214_A830TipArtDsc, P07R214_n830TipArtDsc
            }
            , new Object[] {
            P07R215_A396EmprCod, P07R215_A361DisCod, P07R215_A148BarEstReo, P07R215_A130BarCodPar, P07R215_A129BarCod, P07R215_A132BarCodReo, P07R215_A4845BarAudObs, P07R215_n4845BarAudObs
            }
            , new Object[] {
            P07R216_A595Kilos
            }
            , new Object[] {
            P07R217_A382DisPieKil
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
   private byte AV14FlagObs ;
   private byte A376DisObsLin ;
   private byte A490ForPrdUMe ;
   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private byte AV51Barcodreo ;
   private short A970ProceCod ;
   private short A352DisArtTip ;
   private short A379DisPie ;
   private short A4596AlbRDefCod ;
   private short AV27TipARtCod ;
   private short AV8Piezas_e ;
   private short A4295ClasCod ;
   private short AV13PzasEstim ;
   private short AV20Procecod ;
   private short A368DisFasLin ;
   private short A7919Dta_Ordl ;
   private short A7924Dta_ForTmx ;
   private short A7923Dta_Fortie ;
   private short A7929Dta_ForLin ;
   private short A1664ParFasCod ;
   private short AV43Nlin ;
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
   private int A673Piezas ;
   private int A4291AlbPzaEst ;
   private int AV18RecCod ;
   private int AV19AlbRecCod ;
   private int A129BarCod ;
   private int AV50Barcod ;
   private int E361DisCod ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal AV9Kilos_e ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A4290AlbPmPPza ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV17Kilos_p ;
   private java.math.BigDecimal A7925Dta_ForRb ;
   private java.math.BigDecimal A7926Dta_ForPhx ;
   private java.math.BigDecimal A7927Dta_ForPhn ;
   private java.math.BigDecimal A7932Dta_Forcan ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String AV35Station ;
   private String AV11EmprNom ;
   private String AV34usurcod ;
   private String AV56Litp ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A966PartCod ;
   private String A5290DisTipCor ;
   private String A4471DisCruEnr ;
   private String A2835DisPle2 ;
   private String A2926DisPla ;
   private String A4479DisAcaMar ;
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
   private String A4601AlbRTam ;
   private String A4602AlbRMdlCod ;
   private String AV12ClasDsc ;
   private String AV15ALbRloc_4 ;
   private String AV21Procenom ;
   private String A377DisObsTxt ;
   private String A758ProCod ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A7920Dta_CPQ ;
   private String A7921Dta_DPQ ;
   private String AV57Dsc ;
   private String A488ForPrdDsc ;
   private String A7930Dta_Prdnum ;
   private String A7931Dta_PrdNom ;
   private String GXt_char5 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String A1665ParFasDsc ;
   private String A3685DisParVal ;
   private String AV59ObsFs ;
   private String A971ProceNom ;
   private String AV25TipArtDsc ;
   private String A830TipArtDsc ;
   private String AV49Barcodpar ;
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
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n966PartCod ;
   private boolean n970ProceCod ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n4617DisHorReg ;
   private boolean n379DisPie ;
   private boolean returnInSub ;
   private boolean n4295ClasCod ;
   private boolean n4296ClasDsc ;
   private boolean n7925Dta_ForRb ;
   private boolean n7926Dta_ForPhx ;
   private boolean n7927Dta_ForPhn ;
   private boolean n7924Dta_ForTmx ;
   private boolean n7923Dta_Fortie ;
   private boolean n7920Dta_CPQ ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean n7932Dta_Forcan ;
   private boolean n7930Dta_Prdnum ;
   private boolean n1665ParFasDsc ;
   private boolean n971ProceNom ;
   private boolean n830TipArtDsc ;
   private boolean n4845BarAudObs ;
   private String AV58DisPartxt ;
   private String A3687DisParTxt ;
   private String A4845BarAudObs ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P07R22_A396EmprCod ;
   private String[] P07R22_A407EmprNom ;
   private boolean[] P07R22_n407EmprNom ;
   private String[] P07R24_A966PartCod ;
   private boolean[] P07R24_n966PartCod ;
   private String[] P07R24_A396EmprCod ;
   private int[] P07R24_A361DisCod ;
   private short[] P07R24_A970ProceCod ;
   private boolean[] P07R24_n970ProceCod ;
   private String[] P07R24_A5290DisTipCor ;
   private short[] P07R24_A352DisArtTip ;
   private String[] P07R24_A4471DisCruEnr ;
   private String[] P07R24_A2835DisPle2 ;
   private String[] P07R24_A2926DisPla ;
   private String[] P07R24_A4479DisAcaMar ;
   private String[] P07R24_A340DisArtMat ;
   private String[] P07R24_A1052DisObs ;
   private String[] P07R24_A4813DisEncCli ;
   private String[] P07R24_A5349DisObsGrm ;
   private String[] P07R24_A5350DisObsAnc ;
   private String[] P07R24_A337DisArtDsc ;
   private byte[] P07R24_A390DisTipCol ;
   private boolean[] P07R24_n390DisTipCol ;
   private int[] P07R24_A363DisColNum ;
   private boolean[] P07R24_n363DisColNum ;
   private String[] P07R24_A362DisColNom ;
   private boolean[] P07R24_n362DisColNom ;
   private String[] P07R24_A335DisArtCod ;
   private String[] P07R24_A279CliNom ;
   private int[] P07R24_A252CliCod ;
   private String[] P07R24_A4614DisMdlCod ;
   private java.util.Date[] P07R24_A4617DisHorReg ;
   private boolean[] P07R24_n4617DisHorReg ;
   private java.util.Date[] P07R24_A369DisFec ;
   private String[] P07R24_A360DisCliNum ;
   private short[] P07R24_A379DisPie ;
   private boolean[] P07R24_n379DisPie ;
   private String[] P07R24_A365DisDes ;
   private String[] P07R25_A396EmprCod ;
   private int[] P07R25_A361DisCod ;
   private int[] P07R25_A44AlbRecCod ;
   private String[] P07R26_A396EmprCod ;
   private int[] P07R26_A44AlbRecCod ;
   private short[] P07R26_A4596AlbRDefCod ;
   private short[] P07R27_A4295ClasCod ;
   private boolean[] P07R27_n4295ClasCod ;
   private String[] P07R27_A396EmprCod ;
   private int[] P07R27_A361DisCod ;
   private String[] P07R27_A4296ClasDsc ;
   private boolean[] P07R27_n4296ClasDsc ;
   private String[] P07R27_A50AlbRLoc ;
   private java.math.BigDecimal[] P07R27_A595Kilos ;
   private int[] P07R27_A44AlbRecCod ;
   private java.util.Date[] P07R27_A49AlbRFen ;
   private String[] P07R27_A55AlbRReo ;
   private String[] P07R27_A46AlbREnt ;
   private int[] P07R27_A673Piezas ;
   private String[] P07R27_A4601AlbRTam ;
   private String[] P07R27_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] P07R27_A4290AlbPmPPza ;
   private java.math.BigDecimal[] P07R27_A58AlbRUniEnt ;
   private String[] P07R28_A396EmprCod ;
   private int[] P07R28_A361DisCod ;
   private String[] P07R28_A377DisObsTxt ;
   private byte[] P07R28_A376DisObsLin ;
   private String[] P07R29_A396EmprCod ;
   private int[] P07R29_A361DisCod ;
   private short[] P07R29_A368DisFasLin ;
   private String[] P07R29_A758ProCod ;
   private String[] P07R29_A460FasDsc ;
   private String[] P07R29_A457FasCod ;
   private int[] P07R210_A361DisCod ;
   private String[] P07R210_A758ProCod ;
   private short[] P07R210_A368DisFasLin ;
   private short[] P07R210_A7919Dta_Ordl ;
   private java.math.BigDecimal[] P07R210_A7925Dta_ForRb ;
   private boolean[] P07R210_n7925Dta_ForRb ;
   private java.math.BigDecimal[] P07R210_A7926Dta_ForPhx ;
   private boolean[] P07R210_n7926Dta_ForPhx ;
   private java.math.BigDecimal[] P07R210_A7927Dta_ForPhn ;
   private boolean[] P07R210_n7927Dta_ForPhn ;
   private short[] P07R210_A7924Dta_ForTmx ;
   private boolean[] P07R210_n7924Dta_ForTmx ;
   private short[] P07R210_A7923Dta_Fortie ;
   private boolean[] P07R210_n7923Dta_Fortie ;
   private String[] P07R210_A396EmprCod ;
   private String[] P07R210_A7920Dta_CPQ ;
   private boolean[] P07R210_n7920Dta_CPQ ;
   private byte[] P07R211_A490ForPrdUMe ;
   private boolean[] P07R211_n490ForPrdUMe ;
   private int[] P07R211_A361DisCod ;
   private String[] P07R211_A758ProCod ;
   private short[] P07R211_A368DisFasLin ;
   private short[] P07R211_A7919Dta_Ordl ;
   private String[] P07R211_A488ForPrdDsc ;
   private boolean[] P07R211_n488ForPrdDsc ;
   private java.math.BigDecimal[] P07R211_A7932Dta_Forcan ;
   private boolean[] P07R211_n7932Dta_Forcan ;
   private short[] P07R211_A7929Dta_ForLin ;
   private String[] P07R211_A396EmprCod ;
   private String[] P07R211_A7930Dta_Prdnum ;
   private boolean[] P07R211_n7930Dta_Prdnum ;
   private String[] P07R212_A3687DisParTxt ;
   private String[] P07R212_A396EmprCod ;
   private int[] P07R212_A361DisCod ;
   private String[] P07R212_A758ProCod ;
   private short[] P07R212_A368DisFasLin ;
   private String[] P07R212_A1665ParFasDsc ;
   private boolean[] P07R212_n1665ParFasDsc ;
   private String[] P07R212_A3685DisParVal ;
   private short[] P07R212_A1664ParFasCod ;
   private String[] P07R213_A396EmprCod ;
   private int[] P07R213_A44AlbRecCod ;
   private short[] P07R213_A970ProceCod ;
   private boolean[] P07R213_n970ProceCod ;
   private String[] P07R213_A971ProceNom ;
   private boolean[] P07R213_n971ProceNom ;
   private String[] P07R214_A396EmprCod ;
   private short[] P07R214_A829TipArtCod ;
   private String[] P07R214_A830TipArtDsc ;
   private boolean[] P07R214_n830TipArtDsc ;
   private String[] P07R215_A396EmprCod ;
   private int[] P07R215_A361DisCod ;
   private byte[] P07R215_A148BarEstReo ;
   private String[] P07R215_A130BarCodPar ;
   private int[] P07R215_A129BarCod ;
   private byte[] P07R215_A132BarCodReo ;
   private String[] P07R215_A4845BarAudObs ;
   private boolean[] P07R215_n4845BarAudObs ;
   private java.math.BigDecimal[] P07R216_A595Kilos ;
   private java.math.BigDecimal[] P07R217_A382DisPieKil ;
}

final  class rdispla__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07R22", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07R24", "SELECT T1.PartCod, T1.EmprCod, T1.DisCod, T3.ProceCod, T1.DisTipCor, T1.DisArtTip, T1.DisCruEnr, T1.DisPle2, T1.DisPla, T1.DisAcaMar, T1.DisArtMat, T1.DisObs, T1.DisEncCli, T1.DisObsGrm, T1.DisObsAnc, T1.DisArtDsc, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisMdlCod, T1.DisHorReg, T1.DisFec, T1.DisCliNum, COALESCE( T4.DisPie, 0) AS DisPie, T1.DisDes FROM (((TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPCPARTI T3 ON T3.EmprCod = T1.EmprCod AND T3.PartCod = T1.PartCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(Piezas) AS DisPie, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07R25", "SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07R26", "SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07R27", "SELECT T2.ClasCod, T1.EmprCod, T1.DisCod, T3.ClasDsc, T2.AlbRLoc, T1.Kilos, T1.AlbRecCod, T2.AlbRFen, T2.AlbRReo, T2.AlbREnt, T1.Piezas, T2.AlbRTam, T2.AlbRMdlCod, T2.AlbPmPPza, T2.AlbRUniEnt FROM ((TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLAPEN T3 ON T3.EmprCod = T1.EmprCod AND T3.ClasCod = T2.ClasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07R28", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07R29", "SELECT T1.EmprCod, T1.DisCod, T1.DisFasLin, T1.ProCod, T2.FasDsc, T1.FasCod FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07R210", "SELECT DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_ForRb, Dta_ForPhx, Dta_ForPhn, Dta_ForTmx, Dta_Fortie, EmprCod, Dta_CPQ FROM TXPDT004 WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07R211", "SELECT T1.ForPrdUMe, T1.DisCod, T1.ProCod, T1.DisFasLin, T1.Dta_Ordl, T2.ForPrdDsc, T1.Dta_Forcan, T1.Dta_ForLin, T1.EmprCod, T1.Dta_Prdnum FROM (TXPDT0041 T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? and T1.Dta_Ordl = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T1.Dta_Ordl, T1.Dta_ForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07R212", "SELECT T1.DisParTxt, T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T2.ParFasDsc, T1.DisParVal, T1.ParFasCod FROM (TXPDISPAR T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.ParFasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T1.ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07R213", "SELECT T1.EmprCod, T1.AlbRecCod, T1.ProceCod, T2.ProceNom FROM (TXPALBREC T1 LEFT JOIN TXPPROCED T2 ON T2.EmprCod = T1.EmprCod AND T2.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07R214", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07R215", "SELECT EmprCod, DisCod, BarEstReo, BarCodPar, BarCod, BarCodReo, BarAudObs FROM TXPBARCAD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07R216", "SELECT SUM(Kilos) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07R217", "SELECT SUM(DisPieKil) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[12])[0] = rslt.getString(11, 16);
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               ((String[]) buf[14])[0] = rslt.getString(13, 20);
               ((String[]) buf[15])[0] = rslt.getString(14, 20);
               ((String[]) buf[16])[0] = rslt.getString(15, 20);
               ((String[]) buf[17])[0] = rslt.getString(16, 26);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(20, 16);
               ((String[]) buf[25])[0] = rslt.getString(21, 30);
               ((int[]) buf[26])[0] = rslt.getInt(22);
               ((String[]) buf[27])[0] = rslt.getString(23, 13);
               ((java.util.Date[]) buf[28])[0] = GXutil.resetDate(rslt.getGXDateTime(24));
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 8);
               ((short[]) buf[32])[0] = rslt.getShort(27);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(28, 1);
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
               ((String[]) buf[4])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 2);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 4);
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 3);
               ((String[]) buf[15])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 8 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               ((String[]) buf[12])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 14 :
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

