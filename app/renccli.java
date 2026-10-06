package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class renccli extends GXReport
{
   public renccli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( renccli.class ), "" );
   }

   public renccli( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      renccli.this.aP2 = new String[] {""};
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
      renccli.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      renccli.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      renccli.this.Gx_out = aP2[0];
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF ", "", 2, 1, 256, 11909, 8395, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("ENCOMENDA CLIENTE, FICHA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_int1[0] = AV22F_colors ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLORS", ""), GXv_int1) ;
         renccli.this.AV22F_colors = GXv_int1[0] ;
         GXt_int2 = AV29Ibatex ;
         GXv_int1[0] = GXt_int2 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IBATEX", ""), GXv_int1) ;
         renccli.this.GXt_int2 = GXv_int1[0] ;
         AV29Ibatex = GXt_int2 ;
         /* Using cursor P06R12 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06R12_A407EmprNom[0] ;
            n407EmprNom = P06R12_n407EmprNom[0] ;
            AV11EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P06R14 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A966PartCod = P06R14_A966PartCod[0] ;
            n966PartCod = P06R14_n966PartCod[0] ;
            A970ProceCod = P06R14_A970ProceCod[0] ;
            n970ProceCod = P06R14_n970ProceCod[0] ;
            A363DisColNum = P06R14_A363DisColNum[0] ;
            n363DisColNum = P06R14_n363DisColNum[0] ;
            A2743DisNumTex1 = P06R14_A2743DisNumTex1[0] ;
            A5366DisAntp = P06R14_A5366DisAntp[0] ;
            A5405DisAntpT = P06R14_A5405DisAntpT[0] ;
            A5252DisAcc = P06R14_A5252DisAcc[0] ;
            A339DisArtLar = P06R14_A339DisArtLar[0] ;
            A340DisArtMat = P06R14_A340DisArtMat[0] ;
            A2009DisTipDis = P06R14_A2009DisTipDis[0] ;
            n2009DisTipDis = P06R14_n2009DisTipDis[0] ;
            A4813DisEncCli = P06R14_A4813DisEncCli[0] ;
            A4720DisDishCod = P06R14_A4720DisDishCod[0] ;
            A4616DisHorEnt = P06R14_A4616DisHorEnt[0] ;
            n4616DisHorEnt = P06R14_n4616DisHorEnt[0] ;
            A371DisFecEnt = P06R14_A371DisFecEnt[0] ;
            A5349DisObsGrm = P06R14_A5349DisObsGrm[0] ;
            A5350DisObsAnc = P06R14_A5350DisObsAnc[0] ;
            A2832DisKgsLot = P06R14_A2832DisKgsLot[0] ;
            A4293DisNPzas = P06R14_A4293DisNPzas[0] ;
            n4293DisNPzas = P06R14_n4293DisNPzas[0] ;
            A335DisArtCod = P06R14_A335DisArtCod[0] ;
            A279CliNom = P06R14_A279CliNom[0] ;
            A252CliCod = P06R14_A252CliCod[0] ;
            A4614DisMdlCod = P06R14_A4614DisMdlCod[0] ;
            A4617DisHorReg = P06R14_A4617DisHorReg[0] ;
            n4617DisHorReg = P06R14_n4617DisHorReg[0] ;
            A369DisFec = P06R14_A369DisFec[0] ;
            A337DisArtDsc = P06R14_A337DisArtDsc[0] ;
            A360DisCliNum = P06R14_A360DisCliNum[0] ;
            A1196DisNumCli = P06R14_A1196DisNumCli[0] ;
            A1195DisNomCli = P06R14_A1195DisNomCli[0] ;
            A390DisTipCol = P06R14_A390DisTipCol[0] ;
            n390DisTipCol = P06R14_n390DisTipCol[0] ;
            A362DisColNom = P06R14_A362DisColNom[0] ;
            n362DisColNom = P06R14_n362DisColNom[0] ;
            A379DisPie = P06R14_A379DisPie[0] ;
            n379DisPie = P06R14_n379DisPie[0] ;
            A365DisDes = P06R14_A365DisDes[0] ;
            A279CliNom = P06R14_A279CliNom[0] ;
            A970ProceCod = P06R14_A970ProceCod[0] ;
            n970ProceCod = P06R14_n970ProceCod[0] ;
            A379DisPie = P06R14_A379DisPie[0] ;
            n379DisPie = P06R14_n379DisPie[0] ;
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
            AV25Enc_e = (byte)(0) ;
            /* Using cursor P06R15 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A44AlbRecCod = P06R15_A44AlbRecCod[0] ;
               /* Using cursor P06R16 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A4596AlbRDefCod = P06R16_A4596AlbRDefCod[0] ;
                  AV25Enc_e = (byte)(1) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV26Tipo_e = "" ;
            if ( AV25Enc_e == 1 )
            {
               AV26Tipo_e = httpContext.getMessage( "Reprocessado EXTERNO", "") ;
            }
            AV27Discod = A361DisCod ;
            /* Execute user subroutine: 'BARCAD' */
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
            if ( AV28BarEstreo == 1 )
            {
               AV26Tipo_e = httpContext.getMessage( "Reprocessado INTERNO", "") ;
            }
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A335DisArtCod ;
            GXv_char6[0] = A362DisColNom ;
            GXv_int7[0] = A363DisColNum ;
            GXv_int1[0] = A390DisTipCol ;
            GXv_char8[0] = AV33Intdscf ;
            new app.pfintfact(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_char6, GXv_int7, GXv_int1, GXv_char8) ;
            renccli.this.A396EmprCod = GXv_char3[0] ;
            renccli.this.A252CliCod = GXv_int4[0] ;
            renccli.this.A335DisArtCod = GXv_char5[0] ;
            renccli.this.A362DisColNom = GXv_char6[0] ;
            renccli.this.A363DisColNum = GXv_int7[0] ;
            renccli.this.A390DisTipCol = GXv_int1[0] ;
            renccli.this.AV33Intdscf = GXv_char8[0] ;
            if ( A2743DisNumTex1 == 1 )
            {
               AV34Urgente = httpContext.getMessage( "SUPER-URGENTE", "") ;
            }
            else if ( A2743DisNumTex1 == 2 )
            {
               AV34Urgente = httpContext.getMessage( "URGENTE", "") ;
            }
            else if ( A2743DisNumTex1 == 3 )
            {
               AV34Urgente = httpContext.getMessage( "SEMI-URGENTE", "") ;
            }
            else if ( A2743DisNumTex1 == 4 )
            {
               AV34Urgente = httpContext.getMessage( "NORMAL", "") ;
            }
            else
            {
               AV34Urgente = httpContext.getMessage( "NORMAL", "") ;
            }
            AV8Piezas_e = A379DisPie ;
            AV9Kilos_e = A381DisPieKgm ;
            h6R10( false, 74) ;
            getPrinter().GxDrawRect(7, Gx_line+35, 551, Gx_line+69, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Relaçao Entradas Armazem", ""), 7, Gx_line+10, 180, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Peças", ""), 96, Gx_line+52, 163, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Loc.", ""), 194, Gx_line+52, 220, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mod./Ref.", ""), 249, Gx_line+52, 304, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tam.", ""), 329, Gx_line+52, 358, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quilos", ""), 375, Gx_line+52, 414, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pças", ""), 458, Gx_line+40, 489, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pças", ""), 426, Gx_line+52, 457, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Est.", ""), 463, Gx_line+52, 486, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recep.", ""), 500, Gx_line+52, 542, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 515, Gx_line+40, 529, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(188, Gx_line+35, 188, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(224, Gx_line+35, 224, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(326, Gx_line+35, 326, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(361, Gx_line+35, 361, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(420, Gx_line+35, 420, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(455, Gx_line+35, 455, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(492, Gx_line+35, 492, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+69, 7, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(550, Gx_line+69, 550, Gx_line+74, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Guia", ""), 18, Gx_line+52, 61, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(71, Gx_line+35, 71, Gx_line+74, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+74) ;
            /* Using cursor P06R17 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A4295ClasCod = P06R17_A4295ClasCod[0] ;
               n4295ClasCod = P06R17_n4295ClasCod[0] ;
               A4296ClasDsc = P06R17_A4296ClasDsc[0] ;
               n4296ClasDsc = P06R17_n4296ClasDsc[0] ;
               A50AlbRLoc = P06R17_A50AlbRLoc[0] ;
               A595Kilos = P06R17_A595Kilos[0] ;
               A44AlbRecCod = P06R17_A44AlbRecCod[0] ;
               A46AlbREnt = P06R17_A46AlbREnt[0] ;
               A673Piezas = P06R17_A673Piezas[0] ;
               A4601AlbRTam = P06R17_A4601AlbRTam[0] ;
               A4602AlbRMdlCod = P06R17_A4602AlbRMdlCod[0] ;
               A4290AlbPmPPza = P06R17_A4290AlbPmPPza[0] ;
               A58AlbRUniEnt = P06R17_A58AlbRUniEnt[0] ;
               A4295ClasCod = P06R17_A4295ClasCod[0] ;
               n4295ClasCod = P06R17_n4295ClasCod[0] ;
               A50AlbRLoc = P06R17_A50AlbRLoc[0] ;
               A46AlbREnt = P06R17_A46AlbREnt[0] ;
               A4601AlbRTam = P06R17_A4601AlbRTam[0] ;
               A4602AlbRMdlCod = P06R17_A4602AlbRMdlCod[0] ;
               A4290AlbPmPPza = P06R17_A4290AlbPmPPza[0] ;
               A58AlbRUniEnt = P06R17_A58AlbRUniEnt[0] ;
               A4296ClasDsc = P06R17_A4296ClasDsc[0] ;
               n4296ClasDsc = P06R17_n4296ClasDsc[0] ;
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
               h6R10( false, 20) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4602AlbRMdlCod, "")), 228, Gx_line+0, 324, Gx_line+17, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15ALbRloc_4, "")), 192, Gx_line+0, 222, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12ClasDsc, "")), 74, Gx_line+0, 184, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4601AlbRTam, "")), 329, Gx_line+0, 359, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Kilos_p, "ZZZ9.99")), 366, Gx_line+0, 418, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18RecCod), "ZZZZZZ9")), 495, Gx_line+0, 547, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9")), 423, Gx_line+0, 468, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13PzasEstim), "ZZZ9")), 459, Gx_line+0, 489, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(188, Gx_line+0, 188, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(326, Gx_line+0, 326, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(361, Gx_line+0, 361, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(224, Gx_line+0, 224, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(455, Gx_line+0, 455, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(420, Gx_line+0, 420, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(492, Gx_line+0, 492, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(550, Gx_line+0, 550, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+0, 7, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+17, 551, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+16, 7, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 9, Gx_line+0, 68, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(71, Gx_line+0, 71, Gx_line+20, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(550, Gx_line+16, 550, Gx_line+20, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
               if ( AV20Procecod > 0 )
               {
                  h6R10( false, 21) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Procenom, "")), 168, Gx_line+1, 388, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Confeccionador", ""), 70, Gx_line+1, 162, Gx_line+16, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+0, 7, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(550, Gx_line+0, 550, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+17, 551, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(71, Gx_line+17, 71, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(188, Gx_line+17, 188, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(326, Gx_line+17, 326, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(361, Gx_line+17, 361, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(420, Gx_line+17, 420, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(455, Gx_line+17, 455, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(492, Gx_line+17, 492, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(224, Gx_line+17, 224, Gx_line+21, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+21) ;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            h6R10( false, 3) ;
            getPrinter().GxDrawLine(7, Gx_line+0, 551, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+3) ;
            AV14FlagObs = (byte)(0) ;
            /* Using cursor P06R18 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A377DisObsTxt = P06R18_A377DisObsTxt[0] ;
               A376DisObsLin = P06R18_A376DisObsLin[0] ;
               if ( AV14FlagObs == 0 )
               {
                  AV14FlagObs = (byte)(1) ;
                  h6R10( false, 21) ;
                  getPrinter().GxDrawRect(7, Gx_line+0, 551, Gx_line+17, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observaçoes", ""), 51, Gx_line+1, 131, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+21) ;
               }
               h6R10( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A377DisObsTxt, "")), 51, Gx_line+0, 490, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            /* Using cursor P06R19 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A846UltFasLin = P06R19_A846UltFasLin[0] ;
               A4628ProDsc2 = P06R19_A4628ProDsc2[0] ;
               A758ProCod = P06R19_A758ProCod[0] ;
               A4628ProDsc2 = P06R19_A4628ProDsc2[0] ;
               AV10ProcDsc2 = GXutil.substring( A4628ProDsc2, 1, 70) ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            AV23Var_1 = GXutil.space( (short)(15)) ;
            AV24Var_2 = GXutil.space( (short)(25)) ;
            if ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "T", "")) == 0 )
            {
               AV23Var_1 = httpContext.getMessage( "Antipiling? ", "") + A5366DisAntp ;
               if ( GXutil.strcmp(A5366DisAntp, httpContext.getMessage( "S", "")) == 0 )
               {
                  if ( GXutil.strcmp(A5405DisAntpT, httpContext.getMessage( "F", "")) == 0 )
                  {
                     AV23Var_1 = httpContext.getMessage( "Antipiling? ", "") + A5366DisAntp + " " + httpContext.getMessage( "Forçado", "") ;
                  }
                  if ( GXutil.strcmp(A5405DisAntpT, httpContext.getMessage( "R", "")) == 0 )
                  {
                     AV23Var_1 = httpContext.getMessage( "Antipiling? ", "") + A5366DisAntp + " " + httpContext.getMessage( "Reduzido", "") ;
                  }
                  if ( GXutil.strcmp(A5405DisAntpT, httpContext.getMessage( "N", "")) == 0 )
                  {
                     AV23Var_1 = httpContext.getMessage( "Antipiling? ", "") + A5366DisAntp + " " + httpContext.getMessage( "Normal", "") ;
                  }
               }
               AV24Var_2 = httpContext.getMessage( "Accessorios Metalicos? ", "") + A5252DisAcc ;
            }
            h6R10( false, 141) ;
            getPrinter().GxDrawRect(7, Gx_line+106, 551, Gx_line+137, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Processo", ""), 32, Gx_line+65, 88, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10ProcDsc2, "")), 32, Gx_line+81, 471, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Operaçoes", ""), 246, Gx_line+115, 313, Gx_line+131, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+59, 551, Gx_line+107, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Var_1, "")), 16, Gx_line+1, 225, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Var_2, "")), 348, Gx_line+2, 557, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lavagem Cliente", ""), 15, Gx_line+36, 113, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A340DisArtMat, "")), 119, Gx_line+36, 237, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lacre", ""), 274, Gx_line+36, 307, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A339DisArtLar, "")), 315, Gx_line+36, 389, Gx_line+53, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+141) ;
            /* Using cursor P06R110 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A2009DisTipDis = P06R110_A2009DisTipDis[0] ;
               n2009DisTipDis = P06R110_n2009DisTipDis[0] ;
               A758ProCod = P06R110_A758ProCod[0] ;
               A2009DisTipDis = P06R110_A2009DisTipDis[0] ;
               n2009DisTipDis = P06R110_n2009DisTipDis[0] ;
               AV30Procod = A758ProCod ;
               /* Using cursor P06R111 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A457FasCod = P06R111_A457FasCod[0] ;
                  A3697FasApr = P06R111_A3697FasApr[0] ;
                  A4642FasDsc2 = P06R111_A4642FasDsc2[0] ;
                  n4642FasDsc2 = P06R111_n4642FasDsc2[0] ;
                  A5368FasGral = P06R111_A5368FasGral[0] ;
                  n5368FasGral = P06R111_n5368FasGral[0] ;
                  A6011FasTip = P06R111_A6011FasTip[0] ;
                  n6011FasTip = P06R111_n6011FasTip[0] ;
                  A460FasDsc = P06R111_A460FasDsc[0] ;
                  A368DisFasLin = P06R111_A368DisFasLin[0] ;
                  A4642FasDsc2 = P06R111_A4642FasDsc2[0] ;
                  n4642FasDsc2 = P06R111_n4642FasDsc2[0] ;
                  A5368FasGral = P06R111_A5368FasGral[0] ;
                  n5368FasGral = P06R111_n5368FasGral[0] ;
                  A6011FasTip = P06R111_A6011FasTip[0] ;
                  n6011FasTip = P06R111_n6011FasTip[0] ;
                  A460FasDsc = P06R111_A460FasDsc[0] ;
                  AV31DisFasLin = A368DisFasLin ;
                  if ( ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "L", "")) == 0 ) && ( AV29Ibatex == 0 ) )
                  {
                     AV16FasDsc2_2 = GXutil.substring( A4642FasDsc2, 1, 44) ;
                  }
                  else
                  {
                     AV16FasDsc2_2 = "" ;
                  }
                  if ( GXutil.strcmp(A5368FasGral, httpContext.getMessage( "S", "")) == 0 )
                  {
                     /* Execute user subroutine: 'DISQUI' */
                     S131 ();
                     if ( returnInSub )
                     {
                        pr_default.close(8);
                        pr_default.close(8);
                        pr_default.close(7);
                        pr_default.close(7);
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
                  }
                  h6R10( false, 16) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 21, Gx_line+0, 226, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16FasDsc2_2, "")), 230, Gx_line+0, 552, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6011FasTip, "")), 7, Gx_line+0, 15, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
                  pr_default.readNext(8);
               }
               pr_default.close(8);
               pr_default.readNext(7);
            }
            pr_default.close(7);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6R10( true, 0) ;
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
      /* Using cursor P06R112 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV19AlbRecCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A44AlbRecCod = P06R112_A44AlbRecCod[0] ;
         A970ProceCod = P06R112_A970ProceCod[0] ;
         n970ProceCod = P06R112_n970ProceCod[0] ;
         A971ProceNom = P06R112_A971ProceNom[0] ;
         n971ProceNom = P06R112_n971ProceNom[0] ;
         A971ProceNom = P06R112_A971ProceNom[0] ;
         n971ProceNom = P06R112_n971ProceNom[0] ;
         AV20Procecod = A970ProceCod ;
         AV21Procenom = A971ProceNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV28BarEstreo = (byte)(0) ;
      /* Using cursor P06R113 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV27Discod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A148BarEstReo = P06R113_A148BarEstReo[0] ;
         A129BarCod = P06R113_A129BarCod[0] ;
         A132BarCodReo = P06R113_A132BarCodReo[0] ;
         A130BarCodPar = P06R113_A130BarCodPar[0] ;
         AV28BarEstreo = A148BarEstReo ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'DISQUI' Routine */
      returnInSub = false ;
      AV32Num_p = (short)(0) ;
      /* Using cursor P06R114 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV27Discod), AV30Procod, Short.valueOf(AV31DisFasLin)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A368DisFasLin = P06R114_A368DisFasLin[0] ;
         A758ProCod = P06R114_A758ProCod[0] ;
         A4715ProForDsc2 = P06R114_A4715ProForDsc2[0] ;
         A766ProForDsc = P06R114_A766ProForDsc[0] ;
         A764ProForCod = P06R114_A764ProForCod[0] ;
         A5489DisQuiDsc = P06R114_A5489DisQuiDsc[0] ;
         A5377DisQuiLin = P06R114_A5377DisQuiLin[0] ;
         A4715ProForDsc2 = P06R114_A4715ProForDsc2[0] ;
         A766ProForDsc = P06R114_A766ProForDsc[0] ;
         AV16FasDsc2_2 = A4715ProForDsc2 ;
         if ( AV29Ibatex == 1 )
         {
            AV16FasDsc2_2 = A766ProForDsc ;
            if ( (GXutil.strcmp("", A764ProForCod)==0) )
            {
               AV16FasDsc2_2 = A5489DisQuiDsc ;
            }
         }
         AV32Num_p = (short)(AV32Num_p+1) ;
         pr_default.readNext(11);
      }
      pr_default.close(11);
      if ( AV32Num_p > 1 )
      {
         AV16FasDsc2_2 = httpContext.getMessage( "Há mais de um processo químico¡", "") ;
      }
   }

   public void h6R10( boolean bFoot ,
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
               if ( ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "L", "")) == 0 ) && ( AV29Ibatex == 0 ) )
               {
                  getPrinter().GxDrawRect(7, Gx_line+76, 271, Gx_line+98, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº Enc. Interna", ""), 15, Gx_line+53, 100, Gx_line+69, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), 107, Gx_line+50, 200, Gx_line+74, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Enc. Cliente", ""), 25, Gx_line+148, 95, Gx_line+164, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A360DisCliNum, "")), 110, Gx_line+148, 169, Gx_line+166, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 25, Gx_line+168, 58, Gx_line+184, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), 110, Gx_line+167, 382, Gx_line+187, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 27, Gx_line+105, 55, Gx_line+121, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A369DisFec, "99/99/99"), 64, Gx_line+105, 123, Gx_line+123, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 144, Gx_line+105, 173, Gx_line+121, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4617DisHorReg, "99:99:99"), 188, Gx_line+105, 247, Gx_line+123, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrada", ""), 118, Gx_line+79, 165, Gx_line+95, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(8, Gx_line+97, 272, Gx_line+124, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Modelo", ""), 25, Gx_line+186, 68, Gx_line+202, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4614DisMdlCod, "")), 110, Gx_line+186, 206, Gx_line+204, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11EmprNom, "")), 7, Gx_line+16, 227, Gx_line+36, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+45, 271, Gx_line+77, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+123, 554, Gx_line+209, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 457, Gx_line+266, 499, Gx_line+282, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 510, Gx_line+265, 555, Gx_line+283, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 110, Gx_line+129, 155, Gx_line+147, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 178, Gx_line+126, 523, Gx_line+150, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+129, 67, Gx_line+145, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A335DisArtCod, "")), 383, Gx_line+167, 551, Gx_line+187, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Tipo_e, "")), 450, Gx_line+17, 555, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+209, 352, Gx_line+235, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 200, Gx_line+238, 237, Gx_line+254, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8Piezas_e), "ZZZ9")), 204, Gx_line+263, 234, Gx_line+281, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 285, Gx_line+238, 316, Gx_line+254, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9Kilos_e, "ZZZZZ9.99")), 249, Gx_line+261, 344, Gx_line+281, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+258, 352, Gx_line+283, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4293DisNPzas), "ZZZZZ9")), 16, Gx_line+263, 61, Gx_line+281, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2832DisKgsLot, "ZZZZZ9.99")), 74, Gx_line+261, 169, Gx_line+281, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 48, Gx_line+215, 90, Gx_line+231, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Armazem", ""), 231, Gx_line+214, 289, Gx_line+230, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 19, Gx_line+240, 56, Gx_line+256, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 105, Gx_line+240, 136, Gx_line+256, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+234, 352, Gx_line+259, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(174, Gx_line+209, 174, Gx_line+282, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Emissao", ""), 348, Gx_line+79, 400, Gx_line+95, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5350DisObsAnc, "")), 408, Gx_line+79, 555, Gx_line+96, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Alteraçao", ""), 342, Gx_line+105, 400, Gx_line+121, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5349DisObsGrm, "")), 408, Gx_line+105, 555, Gx_line+122, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(351, Gx_line+208, 554, Gx_line+262, 1, 128, 128, 128, 1, 128, 128, 128, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrega", ""), 433, Gx_line+202, 480, Gx_line+218, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 357, Gx_line+238, 385, Gx_line+254, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A371DisFecEnt, "99/99/99"), 390, Gx_line+238, 449, Gx_line+255, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 456, Gx_line+238, 485, Gx_line+254, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4616DisHorEnt, "99:99:99"), 493, Gx_line+238, 552, Gx_line+255, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Referencia", ""), 224, Gx_line+186, 288, Gx_line+202, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4720DisDishCod, "")), 292, Gx_line+186, 381, Gx_line+204, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "OP", ""), 196, Gx_line+148, 215, Gx_line+164, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4813DisEncCli, "")), 227, Gx_line+148, 374, Gx_line+166, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Urgencia", ""), 346, Gx_line+47, 400, Gx_line+63, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Urgente, "")), 407, Gx_line+46, 556, Gx_line+65, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+288) ;
               }
               if ( ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "T", "")) == 0 ) || ( ( GXutil.strcmp(A2009DisTipDis, httpContext.getMessage( "L", "")) == 0 ) && ( AV29Ibatex == 1 ) ) )
               {
                  getPrinter().GxDrawRect(7, Gx_line+70, 271, Gx_line+92, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº Enc. Interna", ""), 19, Gx_line+47, 104, Gx_line+63, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), 111, Gx_line+44, 204, Gx_line+68, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A360DisCliNum, "")), 115, Gx_line+142, 174, Gx_line+160, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 29, Gx_line+160, 62, Gx_line+176, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), 115, Gx_line+159, 387, Gx_line+179, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 31, Gx_line+99, 59, Gx_line+115, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A369DisFec, "99/99/99"), 68, Gx_line+99, 127, Gx_line+117, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 148, Gx_line+99, 177, Gx_line+115, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4617DisHorReg, "99:99:99"), 192, Gx_line+99, 251, Gx_line+117, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrada", ""), 122, Gx_line+73, 169, Gx_line+89, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+91, 271, Gx_line+118, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Modelo", ""), 29, Gx_line+180, 72, Gx_line+196, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4614DisMdlCod, "")), 115, Gx_line+180, 211, Gx_line+198, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11EmprNom, "")), 7, Gx_line+9, 227, Gx_line+29, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+39, 271, Gx_line+71, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+117, 558, Gx_line+244, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 459, Gx_line+301, 501, Gx_line+317, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 513, Gx_line+300, 558, Gx_line+318, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 115, Gx_line+123, 160, Gx_line+141, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 178, Gx_line+120, 523, Gx_line+144, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 29, Gx_line+123, 71, Gx_line+139, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A335DisArtCod, "")), 388, Gx_line+160, 556, Gx_line+180, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Tipo_e, "")), 454, Gx_line+10, 559, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(6, Gx_line+242, 351, Gx_line+265, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 202, Gx_line+267, 239, Gx_line+283, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8Piezas_e), "ZZZ9")), 206, Gx_line+292, 236, Gx_line+310, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 288, Gx_line+267, 319, Gx_line+283, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9Kilos_e, "ZZZZZ9.99")), 251, Gx_line+291, 346, Gx_line+311, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+288, 352, Gx_line+313, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4293DisNPzas), "ZZZZZ9")), 18, Gx_line+292, 63, Gx_line+310, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2832DisKgsLot, "ZZZZZ9.99")), 76, Gx_line+291, 171, Gx_line+311, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 50, Gx_line+244, 92, Gx_line+260, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Armazem", ""), 233, Gx_line+243, 291, Gx_line+259, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 21, Gx_line+269, 58, Gx_line+285, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 107, Gx_line+269, 138, Gx_line+285, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+264, 352, Gx_line+289, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(176, Gx_line+239, 176, Gx_line+312, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Côr", ""), 29, Gx_line+201, 51, Gx_line+217, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A362DisColNom, "")), 115, Gx_line+198, 265, Gx_line+222, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9")), 272, Gx_line+201, 288, Gx_line+219, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Côr Cliente", ""), 29, Gx_line+223, 95, Gx_line+239, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1195DisNomCli, "")), 115, Gx_line+223, 211, Gx_line+241, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1196DisNumCli), "ZZZZZ9")), 216, Gx_line+223, 261, Gx_line+241, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Emissao", ""), 348, Gx_line+70, 400, Gx_line+86, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Alteraçao", ""), 342, Gx_line+96, 400, Gx_line+112, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5349DisObsGrm, "")), 413, Gx_line+96, 560, Gx_line+113, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5350DisObsAnc, "")), 413, Gx_line+70, 560, Gx_line+87, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(352, Gx_line+243, 558, Gx_line+297, 1, 128, 128, 128, 1, 128, 128, 128, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrega", ""), 433, Gx_line+236, 480, Gx_line+252, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 357, Gx_line+272, 385, Gx_line+288, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A371DisFecEnt, "99/99/99"), 390, Gx_line+272, 449, Gx_line+289, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 456, Gx_line+272, 485, Gx_line+288, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4616DisHorEnt, "99:99:99"), 493, Gx_line+272, 552, Gx_line+289, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Intdscf, "")), 314, Gx_line+201, 534, Gx_line+218, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Referencia", ""), 242, Gx_line+180, 306, Gx_line+196, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4720DisDishCod, "")), 309, Gx_line+180, 398, Gx_line+198, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Enc. Cliente", ""), 29, Gx_line+142, 99, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "OP", ""), 220, Gx_line+142, 239, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4813DisEncCli, "")), 251, Gx_line+142, 398, Gx_line+160, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Urgencia", ""), 348, Gx_line+42, 402, Gx_line+58, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Urgente, "")), 413, Gx_line+41, 562, Gx_line+60, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+318) ;
               }
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
      this.aP0[0] = renccli.this.A396EmprCod;
      this.aP1[0] = renccli.this.A361DisCod;
      this.aP2[0] = renccli.this.Gx_out;
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
      /* Using cursor P06R115 */
      pr_default.execute(12, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         X595Kilos = P06R115_A595Kilos[0] ;
      }
      pr_default.close(12);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P06R116 */
      pr_default.execute(13, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         X382DisPieKil = P06R116_A382DisPieKil[0] ;
      }
      pr_default.close(13);
      return X382DisPieKil ;
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      P06R12_A396EmprCod = new String[] {""} ;
      P06R12_A407EmprNom = new String[] {""} ;
      P06R12_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV11EmprNom = "" ;
      P06R14_A966PartCod = new String[] {""} ;
      P06R14_n966PartCod = new boolean[] {false} ;
      P06R14_A396EmprCod = new String[] {""} ;
      P06R14_A361DisCod = new int[1] ;
      P06R14_A970ProceCod = new short[1] ;
      P06R14_n970ProceCod = new boolean[] {false} ;
      P06R14_A363DisColNum = new int[1] ;
      P06R14_n363DisColNum = new boolean[] {false} ;
      P06R14_A2743DisNumTex1 = new byte[1] ;
      P06R14_A5366DisAntp = new String[] {""} ;
      P06R14_A5405DisAntpT = new String[] {""} ;
      P06R14_A5252DisAcc = new String[] {""} ;
      P06R14_A339DisArtLar = new String[] {""} ;
      P06R14_A340DisArtMat = new String[] {""} ;
      P06R14_A2009DisTipDis = new String[] {""} ;
      P06R14_n2009DisTipDis = new boolean[] {false} ;
      P06R14_A4813DisEncCli = new String[] {""} ;
      P06R14_A4720DisDishCod = new String[] {""} ;
      P06R14_A4616DisHorEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P06R14_n4616DisHorEnt = new boolean[] {false} ;
      P06R14_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P06R14_A5349DisObsGrm = new String[] {""} ;
      P06R14_A5350DisObsAnc = new String[] {""} ;
      P06R14_A2832DisKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06R14_A4293DisNPzas = new int[1] ;
      P06R14_n4293DisNPzas = new boolean[] {false} ;
      P06R14_A335DisArtCod = new String[] {""} ;
      P06R14_A279CliNom = new String[] {""} ;
      P06R14_A252CliCod = new int[1] ;
      P06R14_A4614DisMdlCod = new String[] {""} ;
      P06R14_A4617DisHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      P06R14_n4617DisHorReg = new boolean[] {false} ;
      P06R14_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P06R14_A337DisArtDsc = new String[] {""} ;
      P06R14_A360DisCliNum = new String[] {""} ;
      P06R14_A1196DisNumCli = new int[1] ;
      P06R14_A1195DisNomCli = new String[] {""} ;
      P06R14_A390DisTipCol = new byte[1] ;
      P06R14_n390DisTipCol = new boolean[] {false} ;
      P06R14_A362DisColNom = new String[] {""} ;
      P06R14_n362DisColNom = new boolean[] {false} ;
      P06R14_A379DisPie = new short[1] ;
      P06R14_n379DisPie = new boolean[] {false} ;
      P06R14_A365DisDes = new String[] {""} ;
      A966PartCod = "" ;
      A5366DisAntp = "" ;
      A5405DisAntpT = "" ;
      A5252DisAcc = "" ;
      A339DisArtLar = "" ;
      A340DisArtMat = "" ;
      A2009DisTipDis = "" ;
      A4813DisEncCli = "" ;
      A4720DisDishCod = "" ;
      A4616DisHorEnt = GXutil.resetTime( GXutil.nullDate() );
      A371DisFecEnt = GXutil.nullDate() ;
      A5349DisObsGrm = "" ;
      A5350DisObsAnc = "" ;
      A2832DisKgsLot = DecimalUtil.ZERO ;
      A335DisArtCod = "" ;
      A279CliNom = "" ;
      A4614DisMdlCod = "" ;
      A4617DisHorReg = GXutil.resetTime( GXutil.nullDate() );
      A369DisFec = GXutil.nullDate() ;
      A337DisArtDsc = "" ;
      A360DisCliNum = "" ;
      A1195DisNomCli = "" ;
      A362DisColNom = "" ;
      A365DisDes = "" ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      P06R15_A396EmprCod = new String[] {""} ;
      P06R15_A361DisCod = new int[1] ;
      P06R15_A44AlbRecCod = new int[1] ;
      P06R16_A396EmprCod = new String[] {""} ;
      P06R16_A44AlbRecCod = new int[1] ;
      P06R16_A4596AlbRDefCod = new short[1] ;
      AV26Tipo_e = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int1 = new byte[1] ;
      AV33Intdscf = "" ;
      GXv_char8 = new String[1] ;
      AV34Urgente = "" ;
      AV9Kilos_e = DecimalUtil.ZERO ;
      P06R17_A4295ClasCod = new short[1] ;
      P06R17_n4295ClasCod = new boolean[] {false} ;
      P06R17_A396EmprCod = new String[] {""} ;
      P06R17_A361DisCod = new int[1] ;
      P06R17_A4296ClasDsc = new String[] {""} ;
      P06R17_n4296ClasDsc = new boolean[] {false} ;
      P06R17_A50AlbRLoc = new String[] {""} ;
      P06R17_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06R17_A44AlbRecCod = new int[1] ;
      P06R17_A46AlbREnt = new String[] {""} ;
      P06R17_A673Piezas = new int[1] ;
      P06R17_A4601AlbRTam = new String[] {""} ;
      P06R17_A4602AlbRMdlCod = new String[] {""} ;
      P06R17_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06R17_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4296ClasDsc = "" ;
      A50AlbRLoc = "" ;
      A595Kilos = DecimalUtil.ZERO ;
      A46AlbREnt = "" ;
      A4601AlbRTam = "" ;
      A4602AlbRMdlCod = "" ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      AV12ClasDsc = "" ;
      AV15ALbRloc_4 = "" ;
      AV17Kilos_p = DecimalUtil.ZERO ;
      AV21Procenom = "" ;
      P06R18_A396EmprCod = new String[] {""} ;
      P06R18_A361DisCod = new int[1] ;
      P06R18_A377DisObsTxt = new String[] {""} ;
      P06R18_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      P06R19_A396EmprCod = new String[] {""} ;
      P06R19_A361DisCod = new int[1] ;
      P06R19_A846UltFasLin = new short[1] ;
      P06R19_A4628ProDsc2 = new String[] {""} ;
      P06R19_A758ProCod = new String[] {""} ;
      A4628ProDsc2 = "" ;
      A758ProCod = "" ;
      AV10ProcDsc2 = "" ;
      AV23Var_1 = "" ;
      AV24Var_2 = "" ;
      P06R110_A396EmprCod = new String[] {""} ;
      P06R110_A361DisCod = new int[1] ;
      P06R110_A2009DisTipDis = new String[] {""} ;
      P06R110_n2009DisTipDis = new boolean[] {false} ;
      P06R110_A758ProCod = new String[] {""} ;
      AV30Procod = "" ;
      P06R111_A457FasCod = new String[] {""} ;
      P06R111_A396EmprCod = new String[] {""} ;
      P06R111_A361DisCod = new int[1] ;
      P06R111_A758ProCod = new String[] {""} ;
      P06R111_A3697FasApr = new String[] {""} ;
      P06R111_A4642FasDsc2 = new String[] {""} ;
      P06R111_n4642FasDsc2 = new boolean[] {false} ;
      P06R111_A5368FasGral = new String[] {""} ;
      P06R111_n5368FasGral = new boolean[] {false} ;
      P06R111_A6011FasTip = new String[] {""} ;
      P06R111_n6011FasTip = new boolean[] {false} ;
      P06R111_A460FasDsc = new String[] {""} ;
      P06R111_A368DisFasLin = new short[1] ;
      A457FasCod = "" ;
      A3697FasApr = "" ;
      A4642FasDsc2 = "" ;
      A5368FasGral = "" ;
      A6011FasTip = "" ;
      A460FasDsc = "" ;
      AV16FasDsc2_2 = "" ;
      P06R112_A396EmprCod = new String[] {""} ;
      P06R112_A44AlbRecCod = new int[1] ;
      P06R112_A970ProceCod = new short[1] ;
      P06R112_n970ProceCod = new boolean[] {false} ;
      P06R112_A971ProceNom = new String[] {""} ;
      P06R112_n971ProceNom = new boolean[] {false} ;
      A971ProceNom = "" ;
      P06R113_A396EmprCod = new String[] {""} ;
      P06R113_A361DisCod = new int[1] ;
      P06R113_A148BarEstReo = new byte[1] ;
      P06R113_A129BarCod = new int[1] ;
      P06R113_A132BarCodReo = new byte[1] ;
      P06R113_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      P06R114_A396EmprCod = new String[] {""} ;
      P06R114_A368DisFasLin = new short[1] ;
      P06R114_A758ProCod = new String[] {""} ;
      P06R114_A361DisCod = new int[1] ;
      P06R114_A4715ProForDsc2 = new String[] {""} ;
      P06R114_A766ProForDsc = new String[] {""} ;
      P06R114_A764ProForCod = new String[] {""} ;
      P06R114_A5489DisQuiDsc = new String[] {""} ;
      P06R114_A5377DisQuiLin = new short[1] ;
      A4715ProForDsc2 = "" ;
      A766ProForDsc = "" ;
      A764ProForCod = "" ;
      A5489DisQuiDsc = "" ;
      X595Kilos = DecimalUtil.ZERO ;
      P06R115_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P06R116_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.renccli__default(),
         new Object[] {
             new Object[] {
            P06R12_A396EmprCod, P06R12_A407EmprNom, P06R12_n407EmprNom
            }
            , new Object[] {
            P06R14_A966PartCod, P06R14_n966PartCod, P06R14_A396EmprCod, P06R14_A361DisCod, P06R14_A970ProceCod, P06R14_n970ProceCod, P06R14_A363DisColNum, P06R14_n363DisColNum, P06R14_A2743DisNumTex1, P06R14_A5366DisAntp,
            P06R14_A5405DisAntpT, P06R14_A5252DisAcc, P06R14_A339DisArtLar, P06R14_A340DisArtMat, P06R14_A2009DisTipDis, P06R14_n2009DisTipDis, P06R14_A4813DisEncCli, P06R14_A4720DisDishCod, P06R14_A4616DisHorEnt, P06R14_n4616DisHorEnt,
            P06R14_A371DisFecEnt, P06R14_A5349DisObsGrm, P06R14_A5350DisObsAnc, P06R14_A2832DisKgsLot, P06R14_A4293DisNPzas, P06R14_n4293DisNPzas, P06R14_A335DisArtCod, P06R14_A279CliNom, P06R14_A252CliCod, P06R14_A4614DisMdlCod,
            P06R14_A4617DisHorReg, P06R14_n4617DisHorReg, P06R14_A369DisFec, P06R14_A337DisArtDsc, P06R14_A360DisCliNum, P06R14_A1196DisNumCli, P06R14_A1195DisNomCli, P06R14_A390DisTipCol, P06R14_n390DisTipCol, P06R14_A362DisColNom,
            P06R14_n362DisColNom, P06R14_A379DisPie, P06R14_n379DisPie, P06R14_A365DisDes
            }
            , new Object[] {
            P06R15_A396EmprCod, P06R15_A361DisCod, P06R15_A44AlbRecCod
            }
            , new Object[] {
            P06R16_A396EmprCod, P06R16_A44AlbRecCod, P06R16_A4596AlbRDefCod
            }
            , new Object[] {
            P06R17_A4295ClasCod, P06R17_n4295ClasCod, P06R17_A396EmprCod, P06R17_A361DisCod, P06R17_A4296ClasDsc, P06R17_n4296ClasDsc, P06R17_A50AlbRLoc, P06R17_A595Kilos, P06R17_A44AlbRecCod, P06R17_A46AlbREnt,
            P06R17_A673Piezas, P06R17_A4601AlbRTam, P06R17_A4602AlbRMdlCod, P06R17_A4290AlbPmPPza, P06R17_A58AlbRUniEnt
            }
            , new Object[] {
            P06R18_A396EmprCod, P06R18_A361DisCod, P06R18_A377DisObsTxt, P06R18_A376DisObsLin
            }
            , new Object[] {
            P06R19_A396EmprCod, P06R19_A361DisCod, P06R19_A846UltFasLin, P06R19_A4628ProDsc2, P06R19_A758ProCod
            }
            , new Object[] {
            P06R110_A396EmprCod, P06R110_A361DisCod, P06R110_A2009DisTipDis, P06R110_n2009DisTipDis, P06R110_A758ProCod
            }
            , new Object[] {
            P06R111_A457FasCod, P06R111_A396EmprCod, P06R111_A361DisCod, P06R111_A758ProCod, P06R111_A3697FasApr, P06R111_A4642FasDsc2, P06R111_n4642FasDsc2, P06R111_A5368FasGral, P06R111_n5368FasGral, P06R111_A6011FasTip,
            P06R111_n6011FasTip, P06R111_A460FasDsc, P06R111_A368DisFasLin
            }
            , new Object[] {
            P06R112_A396EmprCod, P06R112_A44AlbRecCod, P06R112_A970ProceCod, P06R112_n970ProceCod, P06R112_A971ProceNom, P06R112_n971ProceNom
            }
            , new Object[] {
            P06R113_A396EmprCod, P06R113_A361DisCod, P06R113_A148BarEstReo, P06R113_A129BarCod, P06R113_A132BarCodReo, P06R113_A130BarCodPar
            }
            , new Object[] {
            P06R114_A396EmprCod, P06R114_A368DisFasLin, P06R114_A758ProCod, P06R114_A361DisCod, P06R114_A4715ProForDsc2, P06R114_A766ProForDsc, P06R114_A764ProForCod, P06R114_A5489DisQuiDsc, P06R114_A5377DisQuiLin
            }
            , new Object[] {
            P06R115_A595Kilos
            }
            , new Object[] {
            P06R116_A382DisPieKil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV22F_colors ;
   private byte AV29Ibatex ;
   private byte GXt_int2 ;
   private byte A2743DisNumTex1 ;
   private byte A390DisTipCol ;
   private byte AV25Enc_e ;
   private byte AV28BarEstreo ;
   private byte GXv_int1[] ;
   private byte AV14FlagObs ;
   private byte A376DisObsLin ;
   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private short A970ProceCod ;
   private short A379DisPie ;
   private short A4596AlbRDefCod ;
   private short AV8Piezas_e ;
   private short A4295ClasCod ;
   private short AV13PzasEstim ;
   private short AV20Procecod ;
   private short A846UltFasLin ;
   private short A368DisFasLin ;
   private short AV31DisFasLin ;
   private short AV32Num_p ;
   private short A5377DisQuiLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A363DisColNum ;
   private int A4293DisNPzas ;
   private int A252CliCod ;
   private int A1196DisNumCli ;
   private int A44AlbRecCod ;
   private int AV27Discod ;
   private int GXv_int4[] ;
   private int GXv_int7[] ;
   private int Gx_OldLine ;
   private int A673Piezas ;
   private int A4291AlbPzaEst ;
   private int AV18RecCod ;
   private int AV19AlbRecCod ;
   private int A129BarCod ;
   private int E361DisCod ;
   private java.math.BigDecimal A2832DisKgsLot ;
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
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV11EmprNom ;
   private String A966PartCod ;
   private String A5366DisAntp ;
   private String A5405DisAntpT ;
   private String A5252DisAcc ;
   private String A339DisArtLar ;
   private String A340DisArtMat ;
   private String A2009DisTipDis ;
   private String A4813DisEncCli ;
   private String A4720DisDishCod ;
   private String A5349DisObsGrm ;
   private String A5350DisObsAnc ;
   private String A335DisArtCod ;
   private String A279CliNom ;
   private String A4614DisMdlCod ;
   private String A337DisArtDsc ;
   private String A360DisCliNum ;
   private String A1195DisNomCli ;
   private String A362DisColNom ;
   private String A365DisDes ;
   private String AV26Tipo_e ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String AV33Intdscf ;
   private String GXv_char8[] ;
   private String AV34Urgente ;
   private String A4296ClasDsc ;
   private String A50AlbRLoc ;
   private String A46AlbREnt ;
   private String A4601AlbRTam ;
   private String A4602AlbRMdlCod ;
   private String AV12ClasDsc ;
   private String AV15ALbRloc_4 ;
   private String AV21Procenom ;
   private String A377DisObsTxt ;
   private String A4628ProDsc2 ;
   private String A758ProCod ;
   private String AV10ProcDsc2 ;
   private String AV23Var_1 ;
   private String AV24Var_2 ;
   private String AV30Procod ;
   private String A457FasCod ;
   private String A3697FasApr ;
   private String A4642FasDsc2 ;
   private String A5368FasGral ;
   private String A6011FasTip ;
   private String A460FasDsc ;
   private String AV16FasDsc2_2 ;
   private String A971ProceNom ;
   private String A130BarCodPar ;
   private String A4715ProForDsc2 ;
   private String A766ProForDsc ;
   private String A764ProForCod ;
   private String A5489DisQuiDsc ;
   private String E396EmprCod ;
   private java.util.Date A4616DisHorEnt ;
   private java.util.Date A4617DisHorReg ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date A369DisFec ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n966PartCod ;
   private boolean n970ProceCod ;
   private boolean n363DisColNum ;
   private boolean n2009DisTipDis ;
   private boolean n4616DisHorEnt ;
   private boolean n4293DisNPzas ;
   private boolean n4617DisHorReg ;
   private boolean n390DisTipCol ;
   private boolean n362DisColNom ;
   private boolean n379DisPie ;
   private boolean returnInSub ;
   private boolean n4295ClasCod ;
   private boolean n4296ClasDsc ;
   private boolean n4642FasDsc2 ;
   private boolean n5368FasGral ;
   private boolean n6011FasTip ;
   private boolean n971ProceNom ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P06R12_A396EmprCod ;
   private String[] P06R12_A407EmprNom ;
   private boolean[] P06R12_n407EmprNom ;
   private String[] P06R14_A966PartCod ;
   private boolean[] P06R14_n966PartCod ;
   private String[] P06R14_A396EmprCod ;
   private int[] P06R14_A361DisCod ;
   private short[] P06R14_A970ProceCod ;
   private boolean[] P06R14_n970ProceCod ;
   private int[] P06R14_A363DisColNum ;
   private boolean[] P06R14_n363DisColNum ;
   private byte[] P06R14_A2743DisNumTex1 ;
   private String[] P06R14_A5366DisAntp ;
   private String[] P06R14_A5405DisAntpT ;
   private String[] P06R14_A5252DisAcc ;
   private String[] P06R14_A339DisArtLar ;
   private String[] P06R14_A340DisArtMat ;
   private String[] P06R14_A2009DisTipDis ;
   private boolean[] P06R14_n2009DisTipDis ;
   private String[] P06R14_A4813DisEncCli ;
   private String[] P06R14_A4720DisDishCod ;
   private java.util.Date[] P06R14_A4616DisHorEnt ;
   private boolean[] P06R14_n4616DisHorEnt ;
   private java.util.Date[] P06R14_A371DisFecEnt ;
   private String[] P06R14_A5349DisObsGrm ;
   private String[] P06R14_A5350DisObsAnc ;
   private java.math.BigDecimal[] P06R14_A2832DisKgsLot ;
   private int[] P06R14_A4293DisNPzas ;
   private boolean[] P06R14_n4293DisNPzas ;
   private String[] P06R14_A335DisArtCod ;
   private String[] P06R14_A279CliNom ;
   private int[] P06R14_A252CliCod ;
   private String[] P06R14_A4614DisMdlCod ;
   private java.util.Date[] P06R14_A4617DisHorReg ;
   private boolean[] P06R14_n4617DisHorReg ;
   private java.util.Date[] P06R14_A369DisFec ;
   private String[] P06R14_A337DisArtDsc ;
   private String[] P06R14_A360DisCliNum ;
   private int[] P06R14_A1196DisNumCli ;
   private String[] P06R14_A1195DisNomCli ;
   private byte[] P06R14_A390DisTipCol ;
   private boolean[] P06R14_n390DisTipCol ;
   private String[] P06R14_A362DisColNom ;
   private boolean[] P06R14_n362DisColNom ;
   private short[] P06R14_A379DisPie ;
   private boolean[] P06R14_n379DisPie ;
   private String[] P06R14_A365DisDes ;
   private String[] P06R15_A396EmprCod ;
   private int[] P06R15_A361DisCod ;
   private int[] P06R15_A44AlbRecCod ;
   private String[] P06R16_A396EmprCod ;
   private int[] P06R16_A44AlbRecCod ;
   private short[] P06R16_A4596AlbRDefCod ;
   private short[] P06R17_A4295ClasCod ;
   private boolean[] P06R17_n4295ClasCod ;
   private String[] P06R17_A396EmprCod ;
   private int[] P06R17_A361DisCod ;
   private String[] P06R17_A4296ClasDsc ;
   private boolean[] P06R17_n4296ClasDsc ;
   private String[] P06R17_A50AlbRLoc ;
   private java.math.BigDecimal[] P06R17_A595Kilos ;
   private int[] P06R17_A44AlbRecCod ;
   private String[] P06R17_A46AlbREnt ;
   private int[] P06R17_A673Piezas ;
   private String[] P06R17_A4601AlbRTam ;
   private String[] P06R17_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] P06R17_A4290AlbPmPPza ;
   private java.math.BigDecimal[] P06R17_A58AlbRUniEnt ;
   private String[] P06R18_A396EmprCod ;
   private int[] P06R18_A361DisCod ;
   private String[] P06R18_A377DisObsTxt ;
   private byte[] P06R18_A376DisObsLin ;
   private String[] P06R19_A396EmprCod ;
   private int[] P06R19_A361DisCod ;
   private short[] P06R19_A846UltFasLin ;
   private String[] P06R19_A4628ProDsc2 ;
   private String[] P06R19_A758ProCod ;
   private String[] P06R110_A396EmprCod ;
   private int[] P06R110_A361DisCod ;
   private String[] P06R110_A2009DisTipDis ;
   private boolean[] P06R110_n2009DisTipDis ;
   private String[] P06R110_A758ProCod ;
   private String[] P06R111_A457FasCod ;
   private String[] P06R111_A396EmprCod ;
   private int[] P06R111_A361DisCod ;
   private String[] P06R111_A758ProCod ;
   private String[] P06R111_A3697FasApr ;
   private String[] P06R111_A4642FasDsc2 ;
   private boolean[] P06R111_n4642FasDsc2 ;
   private String[] P06R111_A5368FasGral ;
   private boolean[] P06R111_n5368FasGral ;
   private String[] P06R111_A6011FasTip ;
   private boolean[] P06R111_n6011FasTip ;
   private String[] P06R111_A460FasDsc ;
   private short[] P06R111_A368DisFasLin ;
   private String[] P06R112_A396EmprCod ;
   private int[] P06R112_A44AlbRecCod ;
   private short[] P06R112_A970ProceCod ;
   private boolean[] P06R112_n970ProceCod ;
   private String[] P06R112_A971ProceNom ;
   private boolean[] P06R112_n971ProceNom ;
   private String[] P06R113_A396EmprCod ;
   private int[] P06R113_A361DisCod ;
   private byte[] P06R113_A148BarEstReo ;
   private int[] P06R113_A129BarCod ;
   private byte[] P06R113_A132BarCodReo ;
   private String[] P06R113_A130BarCodPar ;
   private String[] P06R114_A396EmprCod ;
   private short[] P06R114_A368DisFasLin ;
   private String[] P06R114_A758ProCod ;
   private int[] P06R114_A361DisCod ;
   private String[] P06R114_A4715ProForDsc2 ;
   private String[] P06R114_A766ProForDsc ;
   private String[] P06R114_A764ProForCod ;
   private String[] P06R114_A5489DisQuiDsc ;
   private short[] P06R114_A5377DisQuiLin ;
   private java.math.BigDecimal[] P06R115_A595Kilos ;
   private java.math.BigDecimal[] P06R116_A382DisPieKil ;
}

final  class renccli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06R12", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06R14", "SELECT T1.PartCod, T1.EmprCod, T1.DisCod, T3.ProceCod, T1.DisColNum, T1.DisNumTex1, T1.DisAntp, T1.DisAntpT, T1.DisAcc, T1.DisArtLar, T1.DisArtMat, T1.DisTipDis, T1.DisEncCli, T1.DisDishCod, T1.DisHorEnt, T1.DisFecEnt, T1.DisObsGrm, T1.DisObsAnc, T1.DisKgsLot, T1.DisNPzas, T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisMdlCod, T1.DisHorReg, T1.DisFec, T1.DisArtDsc, T1.DisCliNum, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol, T1.DisColNom, COALESCE( T4.DisPie, 0) AS DisPie, T1.DisDes FROM (((TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPCPARTI T3 ON T3.EmprCod = T1.EmprCod AND T3.PartCod = T1.PartCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(Piezas) AS DisPie, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06R15", "SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R16", "SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R17", "SELECT T2.ClasCod, T1.EmprCod, T1.DisCod, T3.ClasDsc, T2.AlbRLoc, T1.Kilos, T1.AlbRecCod, T2.AlbREnt, T1.Piezas, T2.AlbRTam, T2.AlbRMdlCod, T2.AlbPmPPza, T2.AlbRUniEnt FROM ((TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLAPEN T3 ON T3.EmprCod = T1.EmprCod AND T3.ClasCod = T2.ClasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R18", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R19", "SELECT T1.EmprCod, T1.DisCod, T1.UltFasLin, T2.ProDsc2, T1.ProCod FROM (TXPDISLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R110", "SELECT T1.EmprCod, T1.DisCod, T2.DisTipDis, T1.ProCod FROM (TXPDISLIN T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R111", "SELECT T1.FasCod, T1.EmprCod, T1.DisCod, T1.ProCod, T1.FasApr, T2.FasDsc2, T2.FasGral, T2.FasTip, T2.FasDsc, T1.DisFasLin FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R112", "SELECT T1.EmprCod, T1.AlbRecCod, T1.ProceCod, T2.ProceNom FROM (TXPALBREC T1 LEFT JOIN TXPPROCED T2 ON T2.EmprCod = T1.EmprCod AND T2.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06R113", "SELECT EmprCod, DisCod, BarEstReo, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R114", "SELECT T1.EmprCod, T1.DisFasLin, T1.ProCod, T1.DisCod, T2.ProForDsc2, T2.ProForDsc, T1.ProForCod, T1.DisQuiDsc, T1.DisQuiLin FROM (TXPDISQUI T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T1.DisQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06R115", "SELECT SUM(Kilos) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06R116", "SELECT SUM(DisPieKil) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((String[]) buf[12])[0] = rslt.getString(10, 10);
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 20);
               ((String[]) buf[17])[0] = rslt.getString(14, 12);
               ((java.util.Date[]) buf[18])[0] = GXutil.resetDate(rslt.getGXDateTime(15));
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((String[]) buf[21])[0] = rslt.getString(17, 20);
               ((String[]) buf[22])[0] = rslt.getString(18, 20);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(19,2);
               ((int[]) buf[24])[0] = rslt.getInt(20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(21, 16);
               ((String[]) buf[27])[0] = rslt.getString(22, 30);
               ((int[]) buf[28])[0] = rslt.getInt(23);
               ((String[]) buf[29])[0] = rslt.getString(24, 13);
               ((java.util.Date[]) buf[30])[0] = GXutil.resetDate(rslt.getGXDateTime(25));
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(26);
               ((String[]) buf[33])[0] = rslt.getString(27, 26);
               ((String[]) buf[34])[0] = rslt.getString(28, 8);
               ((int[]) buf[35])[0] = rslt.getInt(29);
               ((String[]) buf[36])[0] = rslt.getString(30, 13);
               ((byte[]) buf[37])[0] = rslt.getByte(31);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(32, 13);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(33);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(34, 1);
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
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 4);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
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
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 28);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 12 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 13 :
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
               stmt.setString(3, (String)parms[2], 8);
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

