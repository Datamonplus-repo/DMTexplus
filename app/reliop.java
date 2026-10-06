package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class reliop extends GXReport
{
   public reliop( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reliop.class ), "" );
   }

   public reliop( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      reliop.this.aP2 = new String[] {""};
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
      reliop.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      reliop.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      reliop.this.Gx_out = aP2[0];
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "OPELIO", "", 2, 1, 256, 5040, 7200, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("FORMATO OP") ;
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
         reliop.this.A396EmprCod = GXv_char1[0] ;
         reliop.this.AV11EmprNom = GXv_char2[0] ;
         reliop.this.AV34usurcod = GXv_char3[0] ;
         GXv_int4[0] = AV22F_colors ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLORS", ""), GXv_int4) ;
         reliop.this.AV22F_colors = GXv_int4[0] ;
         GXt_char5 = AV56Litp ;
         GXv_char3[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "ENCLAV01", ""), (byte)(99), GXv_char3) ;
         reliop.this.GXt_char5 = GXv_char3[0] ;
         AV56Litp = GXt_char5 ;
         /* Using cursor P07S42 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07S42_A407EmprNom[0] ;
            n407EmprNom = P07S42_n407EmprNom[0] ;
            AV11EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07S44 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A252CliCod = P07S44_A252CliCod[0] ;
            A966PartCod = P07S44_A966PartCod[0] ;
            n966PartCod = P07S44_n966PartCod[0] ;
            A970ProceCod = P07S44_A970ProceCod[0] ;
            n970ProceCod = P07S44_n970ProceCod[0] ;
            A5290DisTipCor = P07S44_A5290DisTipCor[0] ;
            A352DisArtTip = P07S44_A352DisArtTip[0] ;
            A4471DisCruEnr = P07S44_A4471DisCruEnr[0] ;
            A2835DisPle2 = P07S44_A2835DisPle2[0] ;
            A2926DisPla = P07S44_A2926DisPla[0] ;
            A4479DisAcaMar = P07S44_A4479DisAcaMar[0] ;
            A2009DisTipDis = P07S44_A2009DisTipDis[0] ;
            n2009DisTipDis = P07S44_n2009DisTipDis[0] ;
            A5366DisAntp = P07S44_A5366DisAntp[0] ;
            A5405DisAntpT = P07S44_A5405DisAntpT[0] ;
            A5252DisAcc = P07S44_A5252DisAcc[0] ;
            A4813DisEncCli = P07S44_A4813DisEncCli[0] ;
            A5350DisObsAnc = P07S44_A5350DisObsAnc[0] ;
            A362DisColNom = P07S44_A362DisColNom[0] ;
            n362DisColNom = P07S44_n362DisColNom[0] ;
            A340DisArtMat = P07S44_A340DisArtMat[0] ;
            A339DisArtLar = P07S44_A339DisArtLar[0] ;
            A335DisArtCod = P07S44_A335DisArtCod[0] ;
            A360DisCliNum = P07S44_A360DisCliNum[0] ;
            A279CliNom = P07S44_A279CliNom[0] ;
            A4617DisHorReg = P07S44_A4617DisHorReg[0] ;
            n4617DisHorReg = P07S44_n4617DisHorReg[0] ;
            A369DisFec = P07S44_A369DisFec[0] ;
            A379DisPie = P07S44_A379DisPie[0] ;
            n379DisPie = P07S44_n379DisPie[0] ;
            A365DisDes = P07S44_A365DisDes[0] ;
            A279CliNom = P07S44_A279CliNom[0] ;
            A970ProceCod = P07S44_A970ProceCod[0] ;
            n970ProceCod = P07S44_n970ProceCod[0] ;
            A379DisPie = P07S44_A379DisPie[0] ;
            n379DisPie = P07S44_n379DisPie[0] ;
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
            /* Using cursor P07S45 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A44AlbRecCod = P07S45_A44AlbRecCod[0] ;
               /* Using cursor P07S46 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A4596AlbRDefCod = P07S46_A4596AlbRDefCod[0] ;
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
            /* Using cursor P07S47 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A4295ClasCod = P07S47_A4295ClasCod[0] ;
               n4295ClasCod = P07S47_n4295ClasCod[0] ;
               A4296ClasDsc = P07S47_A4296ClasDsc[0] ;
               n4296ClasDsc = P07S47_n4296ClasDsc[0] ;
               A50AlbRLoc = P07S47_A50AlbRLoc[0] ;
               A595Kilos = P07S47_A595Kilos[0] ;
               A44AlbRecCod = P07S47_A44AlbRecCod[0] ;
               A4290AlbPmPPza = P07S47_A4290AlbPmPPza[0] ;
               A58AlbRUniEnt = P07S47_A58AlbRUniEnt[0] ;
               A4295ClasCod = P07S47_A4295ClasCod[0] ;
               n4295ClasCod = P07S47_n4295ClasCod[0] ;
               A50AlbRLoc = P07S47_A50AlbRLoc[0] ;
               A4290AlbPmPPza = P07S47_A4290AlbPmPPza[0] ;
               A58AlbRUniEnt = P07S47_A58AlbRUniEnt[0] ;
               A4296ClasDsc = P07S47_A4296ClasDsc[0] ;
               n4296ClasDsc = P07S47_n4296ClasDsc[0] ;
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
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Using cursor P07S48 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A758ProCod = P07S48_A758ProCod[0] ;
               A846UltFasLin = P07S48_A846UltFasLin[0] ;
               A4628ProDsc2 = P07S48_A4628ProDsc2[0] ;
               A4628ProDsc2 = P07S48_A4628ProDsc2[0] ;
               AV10ProcDsc2 = GXutil.substring( A4628ProDsc2, 1, 70) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
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
            AV44i = (short)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV58Tab_df[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV57Tab_fs[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P07S49 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A368DisFasLin = P07S49_A368DisFasLin[0] ;
               A758ProCod = P07S49_A758ProCod[0] ;
               A4642FasDsc2 = P07S49_A4642FasDsc2[0] ;
               n4642FasDsc2 = P07S49_n4642FasDsc2[0] ;
               A457FasCod = P07S49_A457FasCod[0] ;
               A460FasDsc = P07S49_A460FasDsc[0] ;
               A4642FasDsc2 = P07S49_A4642FasDsc2[0] ;
               n4642FasDsc2 = P07S49_n4642FasDsc2[0] ;
               A460FasDsc = P07S49_A460FasDsc[0] ;
               AV16FasDsc2_2 = GXutil.substring( A4642FasDsc2, 1, 45) ;
               /* Using cursor P07S410 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A764ProForCod = P07S410_A764ProForCod[0] ;
                  A766ProForDsc = P07S410_A766ProForDsc[0] ;
                  A5377DisQuiLin = P07S410_A5377DisQuiLin[0] ;
                  A766ProForDsc = P07S410_A766ProForDsc[0] ;
                  AV16FasDsc2_2 = A766ProForDsc ;
                  pr_default.readNext(7);
               }
               pr_default.close(7);
               AV46Procod = A758ProCod ;
               AV47barordlin = A368DisFasLin ;
               /* Execute user subroutine: 'PROLIN' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  pr_default.close(6);
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
               AV57Tab_fs[AV44i-1] = A457FasCod ;
               AV58Tab_df[AV44i-1] = A460FasDsc ;
               AV44i = (short)(AV44i+1) ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            GXt_char5 = AV25TipArtDsc ;
            GXv_char3[0] = GXt_char5 ;
            new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A352DisArtTip, GXv_char3) ;
            reliop.this.GXt_char5 = GXv_char3[0] ;
            AV25TipArtDsc = GXt_char5 ;
            h7S40( false, 326) ;
            getPrinter().GxDrawRect(234, Gx_line+172, 397, Gx_line+189, 1, 0, 0, 0, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MANUFACTURAS", ""), 16, Gx_line+19, 160, Gx_line+43, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ELIOT S.A.S", ""), 36, Gx_line+44, 129, Gx_line+68, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Hdrcdb, "")), 185, Gx_line+20, 363, Gx_line+44, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Hdr, "")), 234, Gx_line+46, 338, Gx_line+67, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "O.P.", ""), 201, Gx_line+48, 224, Gx_line+66, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(5, Gx_line+6, 400, Gx_line+82, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha Entrada:", ""), 10, Gx_line+94, 67, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A369DisFec, "99/99/99"), 73, Gx_line+94, 116, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 125, Gx_line+94, 147, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A4617DisHorReg, "99:99:99"), 151, Gx_line+94, 194, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 203, Gx_line+94, 234, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 240, Gx_line+94, 397, Gx_line+108, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Remision Cliente:", ""), 10, Gx_line+119, 80, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A360DisCliNum, "")), 83, Gx_line+119, 126, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Prenda:", ""), 131, Gx_line+119, 181, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A335DisArtCod, "")), 183, Gx_line+120, 259, Gx_line+130, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Genero:", ""), 267, Gx_line+119, 300, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TipArtDsc, "")), 303, Gx_line+119, 398, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Confec.:", ""), 10, Gx_line+150, 43, Gx_line+164, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Procenom, "")), 45, Gx_line+150, 150, Gx_line+164, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N Ens/Corte:", ""), 157, Gx_line+150, 208, Gx_line+164, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A339DisArtLar, "")), 210, Gx_line+150, 263, Gx_line+164, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Precinto:", ""), 10, Gx_line+178, 46, Gx_line+192, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A340DisArtMat, "")), 50, Gx_line+178, 134, Gx_line+192, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color:", ""), 136, Gx_line+178, 160, Gx_line+192, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A362DisColNom, "")), 164, Gx_line+178, 233, Gx_line+192, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(5, Gx_line+81, 400, Gx_line+112, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(199, Gx_line+81, 199, Gx_line+111, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(5, Gx_line+111, 400, Gx_line+143, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(127, Gx_line+111, 127, Gx_line+143, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(5, Gx_line+143, 400, Gx_line+173, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(153, Gx_line+143, 153, Gx_line+173, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(5, Gx_line+172, 235, Gx_line+202, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Tab_fs[1-1], "")), 240, Gx_line+196, 272, Gx_line+210, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Tab_fs[2-1], "")), 240, Gx_line+211, 272, Gx_line+225, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Tab_fs[3-1], "")), 240, Gx_line+227, 272, Gx_line+241, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Tab_fs[4-1], "")), 240, Gx_line+243, 272, Gx_line+257, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Tab_fs[5-1], "")), 240, Gx_line+258, 272, Gx_line+272, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Tab_fs[6-1], "")), 240, Gx_line+274, 272, Gx_line+288, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Tab_df[1-1], "")), 276, Gx_line+196, 381, Gx_line+210, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Tab_df[2-1], "")), 276, Gx_line+211, 381, Gx_line+225, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Tab_df[3-1], "")), 276, Gx_line+227, 381, Gx_line+241, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Tab_df[4-1], "")), 276, Gx_line+243, 381, Gx_line+257, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Tab_df[5-1], "")), 276, Gx_line+258, 381, Gx_line+272, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Tab_df[6-1], "")), 276, Gx_line+274, 381, Gx_line+288, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Procesos:", ""), 266, Gx_line+174, 306, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(5, Gx_line+201, 235, Gx_line+243, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(5, Gx_line+242, 235, Gx_line+285, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(5, Gx_line+283, 235, Gx_line+325, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Unidades:", ""), 24, Gx_line+208, 81, Gx_line+226, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8Piezas_e), "ZZZ9")), 99, Gx_line+204, 154, Gx_line+229, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peso (Kgs):", ""), 24, Gx_line+255, 86, Gx_line+273, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV9Kilos_e, "ZZZZZ9.99")), 99, Gx_line+251, 222, Gx_line+276, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15ALbRloc_4, "")), 98, Gx_line+292, 153, Gx_line+317, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ubicacion:", ""), 23, Gx_line+296, 81, Gx_line+314, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Emitido por:", ""), 240, Gx_line+306, 288, Gx_line+320, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5350DisObsAnc, "")), 288, Gx_line+307, 393, Gx_line+321, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(234, Gx_line+172, 400, Gx_line+325, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4813DisEncCli, "")), 292, Gx_line+150, 397, Gx_line+164, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "NRef.:", ""), 266, Gx_line+150, 291, Gx_line+164, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+326) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV54Inicio_ob = (byte)(0) ;
         /* Using cursor P07S411 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV50Barcod), Byte.valueOf(AV51Barcodreo), AV49Barcodpar});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A7247Aud_Hdrp = P07S411_A7247Aud_Hdrp[0] ;
            A7246Aud_Hdrr = P07S411_A7246Aud_Hdrr[0] ;
            A7245Aud_Hdr = P07S411_A7245Aud_Hdr[0] ;
            A7253Aud_Obs = P07S411_A7253Aud_Obs[0] ;
            n7253Aud_Obs = P07S411_n7253Aud_Obs[0] ;
            A7249Aud_Lin = P07S411_A7249Aud_Lin[0] ;
            AV43Nlin = (short)(GXutil.gxmlines( A7253Aud_Obs, (short)(60))) ;
            AV53t = (short)(1) ;
            while ( AV53t <= AV43Nlin )
            {
               AV52Obs_a = GXutil.gxgetmli( A7253Aud_Obs, AV53t, (short)(60)) ;
               if ( AV54Inicio_ob == 0 )
               {
                  AV54Inicio_ob = (byte)(1) ;
               }
               AV53t = (short)(AV53t+1) ;
            }
            pr_default.readNext(8);
         }
         pr_default.close(8);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7S40( true, 0) ;
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
      /* Using cursor P07S412 */
      pr_default.execute(9, new Object[] {A396EmprCod, AV46Procod, Short.valueOf(AV47barordlin)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A774ProNumLin = P07S412_A774ProNumLin[0] ;
         A758ProCod = P07S412_A758ProCod[0] ;
         A5735ProFasNot = P07S412_A5735ProFasNot[0] ;
         n5735ProFasNot = P07S412_n5735ProFasNot[0] ;
         if ( ! (GXutil.strcmp("", A5735ProFasNot)==0) )
         {
            AV43Nlin = (short)(GXutil.gxmlines( A5735ProFasNot, (short)(60))) ;
            AV44i = (short)(1) ;
            while ( AV44i <= AV43Nlin )
            {
               AV45Obs = GXutil.gxgetmli( A5735ProFasNot, AV44i, (short)(60)) ;
               AV44i = (short)(AV44i+1) ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'CONF' Routine */
      returnInSub = false ;
      AV21Procenom = GXutil.space( (short)(30)) ;
      AV20Procecod = (short)(0) ;
      /* Using cursor P07S413 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV19AlbRecCod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A44AlbRecCod = P07S413_A44AlbRecCod[0] ;
         A970ProceCod = P07S413_A970ProceCod[0] ;
         n970ProceCod = P07S413_n970ProceCod[0] ;
         A971ProceNom = P07S413_A971ProceNom[0] ;
         n971ProceNom = P07S413_n971ProceNom[0] ;
         A971ProceNom = P07S413_A971ProceNom[0] ;
         n971ProceNom = P07S413_n971ProceNom[0] ;
         AV20Procecod = A970ProceCod ;
         AV21Procenom = GXutil.substring( A971ProceNom, 1, 20) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV25TipArtDsc = "" ;
      /* Using cursor P07S414 */
      pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(AV27TipARtCod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A829TipArtCod = P07S414_A829TipArtCod[0] ;
         A830TipArtDsc = P07S414_A830TipArtDsc[0] ;
         n830TipArtDsc = P07S414_n830TipArtDsc[0] ;
         AV25TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV31BarEstreo = (byte)(0) ;
      AV49Barcodpar = " " ;
      AV36baraudobs = " " ;
      AV38Hdr = " " ;
      /* Using cursor P07S415 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV32Discod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A148BarEstReo = P07S415_A148BarEstReo[0] ;
         A130BarCodPar = P07S415_A130BarCodPar[0] ;
         A129BarCod = P07S415_A129BarCod[0] ;
         A132BarCodReo = P07S415_A132BarCodReo[0] ;
         A4845BarAudObs = P07S415_A4845BarAudObs[0] ;
         n4845BarAudObs = P07S415_n4845BarAudObs[0] ;
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

   public void h7S40( boolean bFoot ,
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
      this.aP0[0] = reliop.this.A396EmprCod;
      this.aP1[0] = reliop.this.A361DisCod;
      this.aP2[0] = reliop.this.Gx_out;
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
      /* Using cursor P07S416 */
      pr_default.execute(13, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         X595Kilos = P07S416_A595Kilos[0] ;
      }
      pr_default.close(13);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor P07S417 */
      pr_default.execute(14, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         X382DisPieKil = P07S417_A382DisPieKil[0] ;
      }
      pr_default.close(14);
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
      scmdbuf = "" ;
      P07S42_A396EmprCod = new String[] {""} ;
      P07S42_A407EmprNom = new String[] {""} ;
      P07S42_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      P07S44_A252CliCod = new int[1] ;
      P07S44_A966PartCod = new String[] {""} ;
      P07S44_n966PartCod = new boolean[] {false} ;
      P07S44_A396EmprCod = new String[] {""} ;
      P07S44_A361DisCod = new int[1] ;
      P07S44_A970ProceCod = new short[1] ;
      P07S44_n970ProceCod = new boolean[] {false} ;
      P07S44_A5290DisTipCor = new String[] {""} ;
      P07S44_A352DisArtTip = new short[1] ;
      P07S44_A4471DisCruEnr = new String[] {""} ;
      P07S44_A2835DisPle2 = new String[] {""} ;
      P07S44_A2926DisPla = new String[] {""} ;
      P07S44_A4479DisAcaMar = new String[] {""} ;
      P07S44_A2009DisTipDis = new String[] {""} ;
      P07S44_n2009DisTipDis = new boolean[] {false} ;
      P07S44_A5366DisAntp = new String[] {""} ;
      P07S44_A5405DisAntpT = new String[] {""} ;
      P07S44_A5252DisAcc = new String[] {""} ;
      P07S44_A4813DisEncCli = new String[] {""} ;
      P07S44_A5350DisObsAnc = new String[] {""} ;
      P07S44_A362DisColNom = new String[] {""} ;
      P07S44_n362DisColNom = new boolean[] {false} ;
      P07S44_A340DisArtMat = new String[] {""} ;
      P07S44_A339DisArtLar = new String[] {""} ;
      P07S44_A335DisArtCod = new String[] {""} ;
      P07S44_A360DisCliNum = new String[] {""} ;
      P07S44_A279CliNom = new String[] {""} ;
      P07S44_A4617DisHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      P07S44_n4617DisHorReg = new boolean[] {false} ;
      P07S44_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07S44_A379DisPie = new short[1] ;
      P07S44_n379DisPie = new boolean[] {false} ;
      P07S44_A365DisDes = new String[] {""} ;
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
      A4813DisEncCli = "" ;
      A5350DisObsAnc = "" ;
      A362DisColNom = "" ;
      A340DisArtMat = "" ;
      A339DisArtLar = "" ;
      A335DisArtCod = "" ;
      A360DisCliNum = "" ;
      A279CliNom = "" ;
      A4617DisHorReg = GXutil.resetTime( GXutil.nullDate() );
      A369DisFec = GXutil.nullDate() ;
      A365DisDes = "" ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      P07S45_A396EmprCod = new String[] {""} ;
      P07S45_A361DisCod = new int[1] ;
      P07S45_A44AlbRecCod = new int[1] ;
      P07S46_A396EmprCod = new String[] {""} ;
      P07S46_A44AlbRecCod = new int[1] ;
      P07S46_A4596AlbRDefCod = new short[1] ;
      AV29Tipo_e = "" ;
      AV33Tipo_p = "" ;
      AV42Texto_mf = "" ;
      AV48Disdishcod = "" ;
      AV9Kilos_e = DecimalUtil.ZERO ;
      AV28Muestras_i = "" ;
      P07S47_A4295ClasCod = new short[1] ;
      P07S47_n4295ClasCod = new boolean[] {false} ;
      P07S47_A396EmprCod = new String[] {""} ;
      P07S47_A361DisCod = new int[1] ;
      P07S47_A4296ClasDsc = new String[] {""} ;
      P07S47_n4296ClasDsc = new boolean[] {false} ;
      P07S47_A50AlbRLoc = new String[] {""} ;
      P07S47_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07S47_A44AlbRecCod = new int[1] ;
      P07S47_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07S47_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4296ClasDsc = "" ;
      A50AlbRLoc = "" ;
      A595Kilos = DecimalUtil.ZERO ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      AV12ClasDsc = "" ;
      AV15ALbRloc_4 = "" ;
      AV17Kilos_p = DecimalUtil.ZERO ;
      P07S48_A758ProCod = new String[] {""} ;
      P07S48_A396EmprCod = new String[] {""} ;
      P07S48_A361DisCod = new int[1] ;
      P07S48_A846UltFasLin = new short[1] ;
      P07S48_A4628ProDsc2 = new String[] {""} ;
      A758ProCod = "" ;
      A4628ProDsc2 = "" ;
      AV10ProcDsc2 = "" ;
      AV23Var_1 = "" ;
      AV24Var_2 = "" ;
      AV58Tab_df = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV58Tab_df[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV57Tab_fs = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV57Tab_fs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P07S49_A396EmprCod = new String[] {""} ;
      P07S49_A361DisCod = new int[1] ;
      P07S49_A368DisFasLin = new short[1] ;
      P07S49_A758ProCod = new String[] {""} ;
      P07S49_A4642FasDsc2 = new String[] {""} ;
      P07S49_n4642FasDsc2 = new boolean[] {false} ;
      P07S49_A457FasCod = new String[] {""} ;
      P07S49_A460FasDsc = new String[] {""} ;
      A4642FasDsc2 = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV16FasDsc2_2 = "" ;
      P07S410_A764ProForCod = new String[] {""} ;
      P07S410_A396EmprCod = new String[] {""} ;
      P07S410_A361DisCod = new int[1] ;
      P07S410_A758ProCod = new String[] {""} ;
      P07S410_A368DisFasLin = new short[1] ;
      P07S410_A766ProForDsc = new String[] {""} ;
      P07S410_A5377DisQuiLin = new short[1] ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      AV46Procod = "" ;
      AV25TipArtDsc = "" ;
      GXt_char5 = "" ;
      GXv_char3 = new String[1] ;
      AV37Hdrcdb = "" ;
      AV38Hdr = "" ;
      AV21Procenom = "" ;
      AV49Barcodpar = "" ;
      P07S411_A396EmprCod = new String[] {""} ;
      P07S411_A7247Aud_Hdrp = new String[] {""} ;
      P07S411_A7246Aud_Hdrr = new byte[1] ;
      P07S411_A7245Aud_Hdr = new int[1] ;
      P07S411_A7253Aud_Obs = new String[] {""} ;
      P07S411_n7253Aud_Obs = new boolean[] {false} ;
      P07S411_A7249Aud_Lin = new int[1] ;
      A7247Aud_Hdrp = "" ;
      A7253Aud_Obs = "" ;
      AV52Obs_a = "" ;
      P07S412_A396EmprCod = new String[] {""} ;
      P07S412_A774ProNumLin = new short[1] ;
      P07S412_A758ProCod = new String[] {""} ;
      P07S412_A5735ProFasNot = new String[] {""} ;
      P07S412_n5735ProFasNot = new boolean[] {false} ;
      A5735ProFasNot = "" ;
      AV45Obs = "" ;
      P07S413_A396EmprCod = new String[] {""} ;
      P07S413_A44AlbRecCod = new int[1] ;
      P07S413_A970ProceCod = new short[1] ;
      P07S413_n970ProceCod = new boolean[] {false} ;
      P07S413_A971ProceNom = new String[] {""} ;
      P07S413_n971ProceNom = new boolean[] {false} ;
      A971ProceNom = "" ;
      P07S414_A396EmprCod = new String[] {""} ;
      P07S414_A829TipArtCod = new short[1] ;
      P07S414_A830TipArtDsc = new String[] {""} ;
      P07S414_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      AV36baraudobs = "" ;
      P07S415_A396EmprCod = new String[] {""} ;
      P07S415_A361DisCod = new int[1] ;
      P07S415_A148BarEstReo = new byte[1] ;
      P07S415_A130BarCodPar = new String[] {""} ;
      P07S415_A129BarCod = new int[1] ;
      P07S415_A132BarCodReo = new byte[1] ;
      P07S415_A4845BarAudObs = new String[] {""} ;
      P07S415_n4845BarAudObs = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A4845BarAudObs = "" ;
      AV39Ceros8 = "" ;
      AV40BarCod_a = "" ;
      X595Kilos = DecimalUtil.ZERO ;
      P07S416_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      P07S417_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.reliop__default(),
         new Object[] {
             new Object[] {
            P07S42_A396EmprCod, P07S42_A407EmprNom, P07S42_n407EmprNom
            }
            , new Object[] {
            P07S44_A252CliCod, P07S44_A966PartCod, P07S44_n966PartCod, P07S44_A396EmprCod, P07S44_A361DisCod, P07S44_A970ProceCod, P07S44_n970ProceCod, P07S44_A5290DisTipCor, P07S44_A352DisArtTip, P07S44_A4471DisCruEnr,
            P07S44_A2835DisPle2, P07S44_A2926DisPla, P07S44_A4479DisAcaMar, P07S44_A2009DisTipDis, P07S44_n2009DisTipDis, P07S44_A5366DisAntp, P07S44_A5405DisAntpT, P07S44_A5252DisAcc, P07S44_A4813DisEncCli, P07S44_A5350DisObsAnc,
            P07S44_A362DisColNom, P07S44_n362DisColNom, P07S44_A340DisArtMat, P07S44_A339DisArtLar, P07S44_A335DisArtCod, P07S44_A360DisCliNum, P07S44_A279CliNom, P07S44_A4617DisHorReg, P07S44_n4617DisHorReg, P07S44_A369DisFec,
            P07S44_A379DisPie, P07S44_n379DisPie, P07S44_A365DisDes
            }
            , new Object[] {
            P07S45_A396EmprCod, P07S45_A361DisCod, P07S45_A44AlbRecCod
            }
            , new Object[] {
            P07S46_A396EmprCod, P07S46_A44AlbRecCod, P07S46_A4596AlbRDefCod
            }
            , new Object[] {
            P07S47_A4295ClasCod, P07S47_n4295ClasCod, P07S47_A396EmprCod, P07S47_A361DisCod, P07S47_A4296ClasDsc, P07S47_n4296ClasDsc, P07S47_A50AlbRLoc, P07S47_A595Kilos, P07S47_A44AlbRecCod, P07S47_A4290AlbPmPPza,
            P07S47_A58AlbRUniEnt
            }
            , new Object[] {
            P07S48_A758ProCod, P07S48_A396EmprCod, P07S48_A361DisCod, P07S48_A846UltFasLin, P07S48_A4628ProDsc2
            }
            , new Object[] {
            P07S49_A396EmprCod, P07S49_A361DisCod, P07S49_A368DisFasLin, P07S49_A758ProCod, P07S49_A4642FasDsc2, P07S49_n4642FasDsc2, P07S49_A457FasCod, P07S49_A460FasDsc
            }
            , new Object[] {
            P07S410_A764ProForCod, P07S410_A396EmprCod, P07S410_A361DisCod, P07S410_A758ProCod, P07S410_A368DisFasLin, P07S410_A766ProForDsc, P07S410_A5377DisQuiLin
            }
            , new Object[] {
            P07S411_A396EmprCod, P07S411_A7247Aud_Hdrp, P07S411_A7246Aud_Hdrr, P07S411_A7245Aud_Hdr, P07S411_A7253Aud_Obs, P07S411_n7253Aud_Obs, P07S411_A7249Aud_Lin
            }
            , new Object[] {
            P07S412_A396EmprCod, P07S412_A774ProNumLin, P07S412_A758ProCod, P07S412_A5735ProFasNot, P07S412_n5735ProFasNot
            }
            , new Object[] {
            P07S413_A396EmprCod, P07S413_A44AlbRecCod, P07S413_A970ProceCod, P07S413_n970ProceCod, P07S413_A971ProceNom, P07S413_n971ProceNom
            }
            , new Object[] {
            P07S414_A396EmprCod, P07S414_A829TipArtCod, P07S414_A830TipArtDsc, P07S414_n830TipArtDsc
            }
            , new Object[] {
            P07S415_A396EmprCod, P07S415_A361DisCod, P07S415_A148BarEstReo, P07S415_A130BarCodPar, P07S415_A129BarCod, P07S415_A132BarCodReo, P07S415_A4845BarAudObs, P07S415_n4845BarAudObs
            }
            , new Object[] {
            P07S416_A595Kilos
            }
            , new Object[] {
            P07S417_A382DisPieKil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV22F_colors ;
   private byte GXv_int4[] ;
   private byte AV30Enc_e ;
   private byte AV31BarEstreo ;
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
   private short AV44i ;
   private short A368DisFasLin ;
   private short A5377DisQuiLin ;
   private short AV47barordlin ;
   private short AV43Nlin ;
   private short AV53t ;
   private short A774ProNumLin ;
   private short A829TipArtCod ;
   private short AV41LenVar ;
   private short Gx_err ;
   private int A361DisCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int AV32Discod ;
   private int A4291AlbPzaEst ;
   private int AV18RecCod ;
   private int AV19AlbRecCod ;
   private int GX_I ;
   private int Gx_OldLine ;
   private int AV50Barcod ;
   private int A7245Aud_Hdr ;
   private int A7249Aud_Lin ;
   private int A129BarCod ;
   private int E361DisCod ;
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
   private String A4813DisEncCli ;
   private String A5350DisObsAnc ;
   private String A362DisColNom ;
   private String A340DisArtMat ;
   private String A339DisArtLar ;
   private String A335DisArtCod ;
   private String A360DisCliNum ;
   private String A279CliNom ;
   private String A365DisDes ;
   private String AV29Tipo_e ;
   private String AV33Tipo_p ;
   private String AV42Texto_mf ;
   private String AV48Disdishcod ;
   private String AV28Muestras_i ;
   private String A4296ClasDsc ;
   private String A50AlbRLoc ;
   private String AV12ClasDsc ;
   private String AV15ALbRloc_4 ;
   private String A758ProCod ;
   private String A4628ProDsc2 ;
   private String AV10ProcDsc2 ;
   private String AV23Var_1 ;
   private String AV24Var_2 ;
   private String AV58Tab_df[] ;
   private String AV57Tab_fs[] ;
   private String A4642FasDsc2 ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV16FasDsc2_2 ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String AV46Procod ;
   private String AV25TipArtDsc ;
   private String GXt_char5 ;
   private String GXv_char3[] ;
   private String AV37Hdrcdb ;
   private String AV38Hdr ;
   private String AV21Procenom ;
   private String AV49Barcodpar ;
   private String A7247Aud_Hdrp ;
   private String AV52Obs_a ;
   private String AV45Obs ;
   private String A971ProceNom ;
   private String A830TipArtDsc ;
   private String AV36baraudobs ;
   private String A130BarCodPar ;
   private String AV39Ceros8 ;
   private String AV40BarCod_a ;
   private String E396EmprCod ;
   private java.util.Date A4617DisHorReg ;
   private java.util.Date A369DisFec ;
   private boolean n407EmprNom ;
   private boolean n966PartCod ;
   private boolean n970ProceCod ;
   private boolean n2009DisTipDis ;
   private boolean n362DisColNom ;
   private boolean n4617DisHorReg ;
   private boolean n379DisPie ;
   private boolean returnInSub ;
   private boolean n4295ClasCod ;
   private boolean n4296ClasDsc ;
   private boolean n4642FasDsc2 ;
   private boolean n7253Aud_Obs ;
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
   private String[] P07S42_A396EmprCod ;
   private String[] P07S42_A407EmprNom ;
   private boolean[] P07S42_n407EmprNom ;
   private int[] P07S44_A252CliCod ;
   private String[] P07S44_A966PartCod ;
   private boolean[] P07S44_n966PartCod ;
   private String[] P07S44_A396EmprCod ;
   private int[] P07S44_A361DisCod ;
   private short[] P07S44_A970ProceCod ;
   private boolean[] P07S44_n970ProceCod ;
   private String[] P07S44_A5290DisTipCor ;
   private short[] P07S44_A352DisArtTip ;
   private String[] P07S44_A4471DisCruEnr ;
   private String[] P07S44_A2835DisPle2 ;
   private String[] P07S44_A2926DisPla ;
   private String[] P07S44_A4479DisAcaMar ;
   private String[] P07S44_A2009DisTipDis ;
   private boolean[] P07S44_n2009DisTipDis ;
   private String[] P07S44_A5366DisAntp ;
   private String[] P07S44_A5405DisAntpT ;
   private String[] P07S44_A5252DisAcc ;
   private String[] P07S44_A4813DisEncCli ;
   private String[] P07S44_A5350DisObsAnc ;
   private String[] P07S44_A362DisColNom ;
   private boolean[] P07S44_n362DisColNom ;
   private String[] P07S44_A340DisArtMat ;
   private String[] P07S44_A339DisArtLar ;
   private String[] P07S44_A335DisArtCod ;
   private String[] P07S44_A360DisCliNum ;
   private String[] P07S44_A279CliNom ;
   private java.util.Date[] P07S44_A4617DisHorReg ;
   private boolean[] P07S44_n4617DisHorReg ;
   private java.util.Date[] P07S44_A369DisFec ;
   private short[] P07S44_A379DisPie ;
   private boolean[] P07S44_n379DisPie ;
   private String[] P07S44_A365DisDes ;
   private String[] P07S45_A396EmprCod ;
   private int[] P07S45_A361DisCod ;
   private int[] P07S45_A44AlbRecCod ;
   private String[] P07S46_A396EmprCod ;
   private int[] P07S46_A44AlbRecCod ;
   private short[] P07S46_A4596AlbRDefCod ;
   private short[] P07S47_A4295ClasCod ;
   private boolean[] P07S47_n4295ClasCod ;
   private String[] P07S47_A396EmprCod ;
   private int[] P07S47_A361DisCod ;
   private String[] P07S47_A4296ClasDsc ;
   private boolean[] P07S47_n4296ClasDsc ;
   private String[] P07S47_A50AlbRLoc ;
   private java.math.BigDecimal[] P07S47_A595Kilos ;
   private int[] P07S47_A44AlbRecCod ;
   private java.math.BigDecimal[] P07S47_A4290AlbPmPPza ;
   private java.math.BigDecimal[] P07S47_A58AlbRUniEnt ;
   private String[] P07S48_A758ProCod ;
   private String[] P07S48_A396EmprCod ;
   private int[] P07S48_A361DisCod ;
   private short[] P07S48_A846UltFasLin ;
   private String[] P07S48_A4628ProDsc2 ;
   private String[] P07S49_A396EmprCod ;
   private int[] P07S49_A361DisCod ;
   private short[] P07S49_A368DisFasLin ;
   private String[] P07S49_A758ProCod ;
   private String[] P07S49_A4642FasDsc2 ;
   private boolean[] P07S49_n4642FasDsc2 ;
   private String[] P07S49_A457FasCod ;
   private String[] P07S49_A460FasDsc ;
   private String[] P07S410_A764ProForCod ;
   private String[] P07S410_A396EmprCod ;
   private int[] P07S410_A361DisCod ;
   private String[] P07S410_A758ProCod ;
   private short[] P07S410_A368DisFasLin ;
   private String[] P07S410_A766ProForDsc ;
   private short[] P07S410_A5377DisQuiLin ;
   private String[] P07S411_A396EmprCod ;
   private String[] P07S411_A7247Aud_Hdrp ;
   private byte[] P07S411_A7246Aud_Hdrr ;
   private int[] P07S411_A7245Aud_Hdr ;
   private String[] P07S411_A7253Aud_Obs ;
   private boolean[] P07S411_n7253Aud_Obs ;
   private int[] P07S411_A7249Aud_Lin ;
   private String[] P07S412_A396EmprCod ;
   private short[] P07S412_A774ProNumLin ;
   private String[] P07S412_A758ProCod ;
   private String[] P07S412_A5735ProFasNot ;
   private boolean[] P07S412_n5735ProFasNot ;
   private String[] P07S413_A396EmprCod ;
   private int[] P07S413_A44AlbRecCod ;
   private short[] P07S413_A970ProceCod ;
   private boolean[] P07S413_n970ProceCod ;
   private String[] P07S413_A971ProceNom ;
   private boolean[] P07S413_n971ProceNom ;
   private String[] P07S414_A396EmprCod ;
   private short[] P07S414_A829TipArtCod ;
   private String[] P07S414_A830TipArtDsc ;
   private boolean[] P07S414_n830TipArtDsc ;
   private String[] P07S415_A396EmprCod ;
   private int[] P07S415_A361DisCod ;
   private byte[] P07S415_A148BarEstReo ;
   private String[] P07S415_A130BarCodPar ;
   private int[] P07S415_A129BarCod ;
   private byte[] P07S415_A132BarCodReo ;
   private String[] P07S415_A4845BarAudObs ;
   private boolean[] P07S415_n4845BarAudObs ;
   private java.math.BigDecimal[] P07S416_A595Kilos ;
   private java.math.BigDecimal[] P07S417_A382DisPieKil ;
}

final  class reliop__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07S42", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07S44", "SELECT T1.CliCod, T1.PartCod, T1.EmprCod, T1.DisCod, T3.ProceCod, T1.DisTipCor, T1.DisArtTip, T1.DisCruEnr, T1.DisPle2, T1.DisPla, T1.DisAcaMar, T1.DisTipDis, T1.DisAntp, T1.DisAntpT, T1.DisAcc, T1.DisEncCli, T1.DisObsAnc, T1.DisColNom, T1.DisArtMat, T1.DisArtLar, T1.DisArtCod, T1.DisCliNum, T2.CliNom, T1.DisHorReg, T1.DisFec, COALESCE( T4.DisPie, 0) AS DisPie, T1.DisDes FROM (((TXPDISPOS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPCPARTI T3 ON T3.EmprCod = T1.EmprCod AND T3.PartCod = T1.PartCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(Piezas) AS DisPie, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T4 ON T4.EmprCod = T1.EmprCod AND T4.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07S45", "SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07S46", "SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07S47", "SELECT T2.ClasCod, T1.EmprCod, T1.DisCod, T3.ClasDsc, T2.AlbRLoc, T1.Kilos, T1.AlbRecCod, T2.AlbPmPPza, T2.AlbRUniEnt FROM ((TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) LEFT JOIN TXPCLAPEN T3 ON T3.EmprCod = T1.EmprCod AND T3.ClasCod = T2.ClasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07S48", "SELECT T1.ProCod, T1.EmprCod, T1.DisCod, T1.UltFasLin, T2.ProDsc2 FROM (TXPDISLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07S49", "SELECT T1.EmprCod, T1.DisCod, T1.DisFasLin, T1.ProCod, T2.FasDsc2, T1.FasCod, T2.FasDsc FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07S410", "SELECT T1.ProForCod, T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T2.ProForDsc, T1.DisQuiLin FROM (TXPDISQUI T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T1.DisQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07S411", "SELECT EmprCod, Aud_Hdrp, Aud_Hdrr, Aud_Hdr, Aud_Obs, Aud_Lin FROM TXPAUDOP1 WHERE EmprCod = ? and Aud_Hdr = ? and Aud_Hdrr = ? and Aud_Hdrp = ? ORDER BY EmprCod, Aud_Hdr, Aud_Hdrr, Aud_Hdrp, Aud_Lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07S412", "SELECT EmprCod, ProNumLin, ProCod, ProFasNot FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07S413", "SELECT T1.EmprCod, T1.AlbRecCod, T1.ProceCod, T2.ProceNom FROM (TXPALBREC T1 LEFT JOIN TXPPROCED T2 ON T2.EmprCod = T1.EmprCod AND T2.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07S414", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07S415", "SELECT EmprCod, DisCod, BarEstReo, BarCodPar, BarCod, BarCodReo, BarAudObs FROM TXPBARCAD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07S416", "SELECT SUM(Kilos) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07S417", "SELECT SUM(DisPieKil) AS GXC1 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 2);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((String[]) buf[17])[0] = rslt.getString(15, 1);
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((String[]) buf[19])[0] = rslt.getString(17, 20);
               ((String[]) buf[20])[0] = rslt.getString(18, 13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(19, 16);
               ((String[]) buf[23])[0] = rslt.getString(20, 10);
               ((String[]) buf[24])[0] = rslt.getString(21, 16);
               ((String[]) buf[25])[0] = rslt.getString(22, 8);
               ((String[]) buf[26])[0] = rslt.getString(23, 30);
               ((java.util.Date[]) buf[27])[0] = GXutil.resetDate(rslt.getGXDateTime(24));
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(25);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(27, 1);
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
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 28);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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

