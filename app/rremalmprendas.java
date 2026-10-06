package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rremalmprendas extends GXReport
{
   public rremalmprendas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rremalmprendas.class ), "" );
   }

   public rremalmprendas( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      rremalmprendas.this.aP2 = new String[] {""};
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
      rremalmprendas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rremalmprendas.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      rremalmprendas.this.Gx_out = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Remision Almacen Prendas") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P07R12 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07R12_A407EmprNom[0] ;
            n407EmprNom = P07R12_n407EmprNom[0] ;
            A404EmprDir = P07R12_A404EmprDir[0] ;
            n404EmprDir = P07R12_n404EmprDir[0] ;
            A408EmprPob = P07R12_A408EmprPob[0] ;
            n408EmprPob = P07R12_n408EmprPob[0] ;
            A409EmprTel = P07R12_A409EmprTel[0] ;
            n409EmprTel = P07R12_n409EmprTel[0] ;
            A405EmprFax = P07R12_A405EmprFax[0] ;
            n405EmprFax = P07R12_n405EmprFax[0] ;
            A395EmprCif = P07R12_A395EmprCif[0] ;
            n395EmprCif = P07R12_n395EmprCif[0] ;
            AV8EmprNom = A407EmprNom ;
            AV11EmprDir = A404EmprDir ;
            AV12EmprPob = A408EmprPob ;
            AV13EmprTel = A409EmprTel ;
            AV14EmprFax = A405EmprFax ;
            AV10EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07R13 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A252CliCod = P07R13_A252CliCod[0] ;
            A6263AlbRTartC = P07R13_A6263AlbRTartC[0] ;
            n6263AlbRTartC = P07R13_n6263AlbRTartC[0] ;
            A840TrnCod = P07R13_A840TrnCod[0] ;
            n840TrnCod = P07R13_n840TrnCod[0] ;
            A970ProceCod = P07R13_A970ProceCod[0] ;
            n970ProceCod = P07R13_n970ProceCod[0] ;
            A1211TipEntCod = P07R13_A1211TipEntCod[0] ;
            n1211TipEntCod = P07R13_n1211TipEntCod[0] ;
            A11361Cod_mta = P07R13_A11361Cod_mta[0] ;
            n11361Cod_mta = P07R13_n11361Cod_mta[0] ;
            A6178AlbrUsu = P07R13_A6178AlbrUsu[0] ;
            A841TrnNom = P07R13_A841TrnNom[0] ;
            n841TrnNom = P07R13_n841TrnNom[0] ;
            A279CliNom = P07R13_A279CliNom[0] ;
            A260CliDom = P07R13_A260CliDom[0] ;
            A278CliNif = P07R13_A278CliNif[0] ;
            A303CliTel1 = P07R13_A303CliTel1[0] ;
            A971ProceNom = P07R13_A971ProceNom[0] ;
            n971ProceNom = P07R13_n971ProceNom[0] ;
            A994ProceDom = P07R13_A994ProceDom[0] ;
            n994ProceDom = P07R13_n994ProceDom[0] ;
            A990ProceTel1 = P07R13_A990ProceTel1[0] ;
            n990ProceTel1 = P07R13_n990ProceTel1[0] ;
            A6264AlbRTartD = P07R13_A6264AlbRTartD[0] ;
            n6264AlbRTartD = P07R13_n6264AlbRTartD[0] ;
            A5806AlbREnt2 = P07R13_A5806AlbREnt2[0] ;
            A11362Dsc_mta = P07R13_A11362Dsc_mta[0] ;
            n11362Dsc_mta = P07R13_n11362Dsc_mta[0] ;
            A8025AlbOpsC = P07R13_A8025AlbOpsC[0] ;
            A3613AlbRefDsc = P07R13_A3613AlbRefDsc[0] ;
            A45AlbRef = P07R13_A45AlbRef[0] ;
            A46AlbREnt = P07R13_A46AlbREnt[0] ;
            A6182AlbrNF = P07R13_A6182AlbrNF[0] ;
            A6179AlbrHor = P07R13_A6179AlbrHor[0] ;
            A49AlbRFen = P07R13_A49AlbRFen[0] ;
            A58AlbRUniEnt = P07R13_A58AlbRUniEnt[0] ;
            A4290AlbPmPPza = P07R13_A4290AlbPmPPza[0] ;
            A52AlbRPieEnt = P07R13_A52AlbRPieEnt[0] ;
            A1212TipEntNom = P07R13_A1212TipEntNom[0] ;
            n1212TipEntNom = P07R13_n1212TipEntNom[0] ;
            A50AlbRLoc = P07R13_A50AlbRLoc[0] ;
            A279CliNom = P07R13_A279CliNom[0] ;
            A260CliDom = P07R13_A260CliDom[0] ;
            A278CliNif = P07R13_A278CliNif[0] ;
            A303CliTel1 = P07R13_A303CliTel1[0] ;
            A6264AlbRTartD = P07R13_A6264AlbRTartD[0] ;
            n6264AlbRTartD = P07R13_n6264AlbRTartD[0] ;
            A841TrnNom = P07R13_A841TrnNom[0] ;
            n841TrnNom = P07R13_n841TrnNom[0] ;
            A971ProceNom = P07R13_A971ProceNom[0] ;
            n971ProceNom = P07R13_n971ProceNom[0] ;
            A994ProceDom = P07R13_A994ProceDom[0] ;
            n994ProceDom = P07R13_n994ProceDom[0] ;
            A990ProceTel1 = P07R13_A990ProceTel1[0] ;
            n990ProceTel1 = P07R13_n990ProceTel1[0] ;
            A1212TipEntNom = P07R13_A1212TipEntNom[0] ;
            n1212TipEntNom = P07R13_n1212TipEntNom[0] ;
            A11362Dsc_mta = P07R13_A11362Dsc_mta[0] ;
            n11362Dsc_mta = P07R13_n11362Dsc_mta[0] ;
            AV30AlbrUsu = A6178AlbrUsu ;
            /* Using cursor P07R14 */
            pr_default.execute(2, new Object[] {AV30AlbrUsu});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A850UsurCod = P07R14_A850UsurCod[0] ;
               A854UsurNom = P07R14_A854UsurNom[0] ;
               n854UsurNom = P07R14_n854UsurNom[0] ;
               AV25usurnom = A854UsurNom ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            AV31i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 5 )
            {
               AV24vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P07R15 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A1300AlbRObs = P07R15_A1300AlbRObs[0] ;
               A1299AlbRLin = P07R15_A1299AlbRLin[0] ;
               if ( AV31i > 5 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV24vObs[AV31i-1] = A1300AlbRObs ;
               AV31i = (byte)(AV31i+1) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV16TrnNom = A841TrnNom ;
            AV18CliNom = A279CliNom ;
            AV20CliDom = A260CliDom ;
            AV19CliNif = A278CliNif ;
            AV21Clitel1 = A303CliTel1 ;
            AV17Procenom = A971ProceNom ;
            AV22Procedom = A994ProceDom ;
            AV23Procetel1 = A990ProceTel1 ;
            AV27DesArt = GXutil.substring( A6264AlbRTartD, 1, 15) ;
            AV28Ref10 = GXutil.substring( A5806AlbREnt2, 1, 10) ;
            AV26Dsc_mta = GXutil.substring( A11362Dsc_mta, 1, 10) ;
            AV29Marq = GXutil.substring( A8025AlbOpsC, 1, 15) ;
            h7R10( false, 336) ;
            getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "NIT.", ""), 379, Gx_line+75, 415, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10EmprCif, "")), 423, Gx_line+75, 549, Gx_line+99, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PBX:", ""), 381, Gx_line+18, 406, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FAX:", ""), 381, Gx_line+34, 406, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11EmprDir, "")), 381, Gx_line+1, 564, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12EmprPob, "")), 381, Gx_line+50, 578, Gx_line+65, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13EmprTel, "")), 413, Gx_line+18, 492, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14EmprFax, "")), 410, Gx_line+34, 489, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+109, 795, Gx_line+109, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 518, Gx_line+176, 571, Gx_line+194, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 518, Gx_line+153, 577, Gx_line+171, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA:", ""), 452, Gx_line+177, 502, Gx_line+194, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "REMISION DE MERCANCIA", ""), 453, Gx_line+125, 710, Gx_line+148, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº:", ""), 453, Gx_line+150, 484, Gx_line+175, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "HORA:", ""), 452, Gx_line+196, 496, Gx_line+213, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TRANSPORTADOR:", ""), 453, Gx_line+225, 579, Gx_line+242, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16TrnNom, "")), 584, Gx_line+225, 773, Gx_line+243, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Procenom, "")), 155, Gx_line+222, 344, Gx_line+240, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18CliNom, "")), 22, Gx_line+149, 211, Gx_line+167, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19CliNif, "@!")), 59, Gx_line+202, 185, Gx_line+220, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "NIT:", ""), 22, Gx_line+202, 48, Gx_line+219, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DESPACHADO A:", ""), 22, Gx_line+125, 133, Gx_line+142, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CONFECCIONISTA:", ""), 22, Gx_line+222, 146, Gx_line+239, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20CliDom, "")), 22, Gx_line+167, 236, Gx_line+185, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Clitel1, "")), 59, Gx_line+184, 154, Gx_line+202, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PBX:", ""), 22, Gx_line+184, 55, Gx_line+201, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Procedom, "")), 155, Gx_line+240, 369, Gx_line+258, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Procetel1, "")), 155, Gx_line+256, 278, Gx_line+274, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A6179AlbrHor, "99:99:99"), 518, Gx_line+196, 571, Gx_line+214, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Muestra", ""), 7, Gx_line+313, 85, Gx_line+329, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Referencia", ""), 211, Gx_line+313, 277, Gx_line+329, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Genero", ""), 95, Gx_line+313, 139, Gx_line+329, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Marquilla", ""), 292, Gx_line+313, 347, Gx_line+329, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Entrada", ""), 408, Gx_line+313, 483, Gx_line+329, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Prendas", ""), 598, Gx_line+313, 649, Gx_line+329, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peso1P", ""), 656, Gx_line+313, 703, Gx_line+329, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 743, Gx_line+313, 774, Gx_line+329, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+331, 84, Gx_line+331, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(95, Gx_line+331, 204, Gx_line+331, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(211, Gx_line+331, 284, Gx_line+331, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(292, Gx_line+331, 401, Gx_line+331, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(408, Gx_line+331, 590, Gx_line+331, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(604, Gx_line+331, 648, Gx_line+331, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(656, Gx_line+331, 700, Gx_line+331, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(707, Gx_line+331, 773, Gx_line+331, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "e95d4880-1250-4436-b742-adb6276c675d", "", context.getHttpContext().getTheme( )), 7, Gx_line+1, 341, Gx_line+98) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6182AlbrNF, "@!")), 719, Gx_line+153, 727, Gx_line+170, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Muestras?", ""), 653, Gx_line+153, 718, Gx_line+169, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Remito:", ""), 418, Gx_line+273, 464, Gx_line+289, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 476, Gx_line+273, 535, Gx_line+290, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo:", ""), 418, Gx_line+256, 468, Gx_line+272, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 476, Gx_line+256, 594, Gx_line+273, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 600, Gx_line+256, 791, Gx_line+273, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+336) ;
            h7R10( false, 126) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Dsc_mta, "")), 7, Gx_line+0, 81, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+25, 795, Gx_line+128, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Ref10, "")), 211, Gx_line+0, 285, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Marq, "")), 292, Gx_line+1, 402, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27DesArt, "")), 95, Gx_line+0, 205, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1212TipEntNom, "")), 408, Gx_line+0, 591, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 604, Gx_line+0, 649, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4290AlbPmPPza, "Z9.999")), 656, Gx_line+0, 701, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 707, Gx_line+0, 774, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+126) ;
            h7R10( false, 141) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones:", ""), 18, Gx_line+15, 99, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24vObs[1-1], "")), 101, Gx_line+15, 362, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24vObs[2-1], "")), 101, Gx_line+29, 362, Gx_line+45, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario:", ""), 58, Gx_line+73, 101, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25usurnom, "")), 106, Gx_line+73, 289, Gx_line+89, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transportador:", ""), 315, Gx_line+73, 391, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recibido por:", ""), 455, Gx_line+73, 522, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 679, Gx_line+73, 714, Gx_line+88, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+58, 795, Gx_line+103, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(309, Gx_line+58, 309, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(450, Gx_line+58, 450, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(643, Gx_line+58, 643, Gx_line+103, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Página", ""), 705, Gx_line+116, 739, Gx_line+131, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 751, Gx_line+116, 790, Gx_line+132, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Localizacion:", ""), 634, Gx_line+15, 701, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 707, Gx_line+14, 771, Gx_line+32, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+141) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7R10( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7R10( boolean bFoot ,
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
      this.aP0[0] = rremalmprendas.this.A396EmprCod;
      this.aP1[0] = rremalmprendas.this.A44AlbRecCod;
      this.aP2[0] = rremalmprendas.this.Gx_out;
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
      P07R12_A396EmprCod = new String[] {""} ;
      P07R12_A407EmprNom = new String[] {""} ;
      P07R12_n407EmprNom = new boolean[] {false} ;
      P07R12_A404EmprDir = new String[] {""} ;
      P07R12_n404EmprDir = new boolean[] {false} ;
      P07R12_A408EmprPob = new String[] {""} ;
      P07R12_n408EmprPob = new boolean[] {false} ;
      P07R12_A409EmprTel = new String[] {""} ;
      P07R12_n409EmprTel = new boolean[] {false} ;
      P07R12_A405EmprFax = new String[] {""} ;
      P07R12_n405EmprFax = new boolean[] {false} ;
      P07R12_A395EmprCif = new String[] {""} ;
      P07R12_n395EmprCif = new boolean[] {false} ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A408EmprPob = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A395EmprCif = "" ;
      AV8EmprNom = "" ;
      AV11EmprDir = "" ;
      AV12EmprPob = "" ;
      AV13EmprTel = "" ;
      AV14EmprFax = "" ;
      AV10EmprCif = "" ;
      P07R13_A252CliCod = new int[1] ;
      P07R13_A6263AlbRTartC = new short[1] ;
      P07R13_n6263AlbRTartC = new boolean[] {false} ;
      P07R13_A840TrnCod = new short[1] ;
      P07R13_n840TrnCod = new boolean[] {false} ;
      P07R13_A970ProceCod = new short[1] ;
      P07R13_n970ProceCod = new boolean[] {false} ;
      P07R13_A1211TipEntCod = new short[1] ;
      P07R13_n1211TipEntCod = new boolean[] {false} ;
      P07R13_A11361Cod_mta = new short[1] ;
      P07R13_n11361Cod_mta = new boolean[] {false} ;
      P07R13_A396EmprCod = new String[] {""} ;
      P07R13_A44AlbRecCod = new int[1] ;
      P07R13_A6178AlbrUsu = new String[] {""} ;
      P07R13_A841TrnNom = new String[] {""} ;
      P07R13_n841TrnNom = new boolean[] {false} ;
      P07R13_A279CliNom = new String[] {""} ;
      P07R13_A260CliDom = new String[] {""} ;
      P07R13_A278CliNif = new String[] {""} ;
      P07R13_A303CliTel1 = new String[] {""} ;
      P07R13_A971ProceNom = new String[] {""} ;
      P07R13_n971ProceNom = new boolean[] {false} ;
      P07R13_A994ProceDom = new String[] {""} ;
      P07R13_n994ProceDom = new boolean[] {false} ;
      P07R13_A990ProceTel1 = new String[] {""} ;
      P07R13_n990ProceTel1 = new boolean[] {false} ;
      P07R13_A6264AlbRTartD = new String[] {""} ;
      P07R13_n6264AlbRTartD = new boolean[] {false} ;
      P07R13_A5806AlbREnt2 = new String[] {""} ;
      P07R13_A11362Dsc_mta = new String[] {""} ;
      P07R13_n11362Dsc_mta = new boolean[] {false} ;
      P07R13_A8025AlbOpsC = new String[] {""} ;
      P07R13_A3613AlbRefDsc = new String[] {""} ;
      P07R13_A45AlbRef = new String[] {""} ;
      P07R13_A46AlbREnt = new String[] {""} ;
      P07R13_A6182AlbrNF = new String[] {""} ;
      P07R13_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P07R13_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P07R13_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07R13_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07R13_A52AlbRPieEnt = new int[1] ;
      P07R13_A1212TipEntNom = new String[] {""} ;
      P07R13_n1212TipEntNom = new boolean[] {false} ;
      P07R13_A50AlbRLoc = new String[] {""} ;
      A6178AlbrUsu = "" ;
      A841TrnNom = "" ;
      A279CliNom = "" ;
      A260CliDom = "" ;
      A278CliNif = "" ;
      A303CliTel1 = "" ;
      A971ProceNom = "" ;
      A994ProceDom = "" ;
      A990ProceTel1 = "" ;
      A6264AlbRTartD = "" ;
      A5806AlbREnt2 = "" ;
      A11362Dsc_mta = "" ;
      A8025AlbOpsC = "" ;
      A3613AlbRefDsc = "" ;
      A45AlbRef = "" ;
      A46AlbREnt = "" ;
      A6182AlbrNF = "" ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      A49AlbRFen = GXutil.nullDate() ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      A1212TipEntNom = "" ;
      A50AlbRLoc = "" ;
      AV30AlbrUsu = "" ;
      P07R14_A850UsurCod = new String[] {""} ;
      P07R14_A854UsurNom = new String[] {""} ;
      P07R14_n854UsurNom = new boolean[] {false} ;
      A850UsurCod = "" ;
      A854UsurNom = "" ;
      AV25usurnom = "" ;
      AV24vObs = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV24vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P07R15_A396EmprCod = new String[] {""} ;
      P07R15_A44AlbRecCod = new int[1] ;
      P07R15_A1300AlbRObs = new String[] {""} ;
      P07R15_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      AV16TrnNom = "" ;
      AV18CliNom = "" ;
      AV20CliDom = "" ;
      AV19CliNif = "" ;
      AV21Clitel1 = "" ;
      AV17Procenom = "" ;
      AV22Procedom = "" ;
      AV23Procetel1 = "" ;
      AV27DesArt = "" ;
      AV28Ref10 = "" ;
      AV26Dsc_mta = "" ;
      AV29Marq = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rremalmprendas__default(),
         new Object[] {
             new Object[] {
            P07R12_A396EmprCod, P07R12_A407EmprNom, P07R12_n407EmprNom, P07R12_A404EmprDir, P07R12_n404EmprDir, P07R12_A408EmprPob, P07R12_n408EmprPob, P07R12_A409EmprTel, P07R12_n409EmprTel, P07R12_A405EmprFax,
            P07R12_n405EmprFax, P07R12_A395EmprCif, P07R12_n395EmprCif
            }
            , new Object[] {
            P07R13_A252CliCod, P07R13_A6263AlbRTartC, P07R13_n6263AlbRTartC, P07R13_A840TrnCod, P07R13_n840TrnCod, P07R13_A970ProceCod, P07R13_n970ProceCod, P07R13_A1211TipEntCod, P07R13_n1211TipEntCod, P07R13_A11361Cod_mta,
            P07R13_n11361Cod_mta, P07R13_A396EmprCod, P07R13_A44AlbRecCod, P07R13_A6178AlbrUsu, P07R13_A841TrnNom, P07R13_n841TrnNom, P07R13_A279CliNom, P07R13_A260CliDom, P07R13_A278CliNif, P07R13_A303CliTel1,
            P07R13_A971ProceNom, P07R13_n971ProceNom, P07R13_A994ProceDom, P07R13_n994ProceDom, P07R13_A990ProceTel1, P07R13_n990ProceTel1, P07R13_A6264AlbRTartD, P07R13_n6264AlbRTartD, P07R13_A5806AlbREnt2, P07R13_A11362Dsc_mta,
            P07R13_n11362Dsc_mta, P07R13_A8025AlbOpsC, P07R13_A3613AlbRefDsc, P07R13_A45AlbRef, P07R13_A46AlbREnt, P07R13_A6182AlbrNF, P07R13_A6179AlbrHor, P07R13_A49AlbRFen, P07R13_A58AlbRUniEnt, P07R13_A4290AlbPmPPza,
            P07R13_A52AlbRPieEnt, P07R13_A1212TipEntNom, P07R13_n1212TipEntNom, P07R13_A50AlbRLoc
            }
            , new Object[] {
            P07R14_A850UsurCod, P07R14_A854UsurNom, P07R14_n854UsurNom
            }
            , new Object[] {
            P07R15_A396EmprCod, P07R15_A44AlbRecCod, P07R15_A1300AlbRObs, P07R15_A1299AlbRLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV31i ;
   private byte A1299AlbRLin ;
   private short A6263AlbRTartC ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short A11361Cod_mta ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int GX_I ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A4290AlbPmPPza ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A408EmprPob ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A395EmprCif ;
   private String AV8EmprNom ;
   private String AV11EmprDir ;
   private String AV12EmprPob ;
   private String AV13EmprTel ;
   private String AV14EmprFax ;
   private String AV10EmprCif ;
   private String A6178AlbrUsu ;
   private String A841TrnNom ;
   private String A279CliNom ;
   private String A260CliDom ;
   private String A278CliNif ;
   private String A303CliTel1 ;
   private String A971ProceNom ;
   private String A994ProceDom ;
   private String A990ProceTel1 ;
   private String A6264AlbRTartD ;
   private String A5806AlbREnt2 ;
   private String A11362Dsc_mta ;
   private String A8025AlbOpsC ;
   private String A3613AlbRefDsc ;
   private String A45AlbRef ;
   private String A46AlbREnt ;
   private String A6182AlbrNF ;
   private String A1212TipEntNom ;
   private String A50AlbRLoc ;
   private String AV30AlbrUsu ;
   private String A850UsurCod ;
   private String A854UsurNom ;
   private String AV25usurnom ;
   private String AV24vObs[] ;
   private String A1300AlbRObs ;
   private String AV16TrnNom ;
   private String AV18CliNom ;
   private String AV20CliDom ;
   private String AV19CliNif ;
   private String AV21Clitel1 ;
   private String AV17Procenom ;
   private String AV22Procedom ;
   private String AV23Procetel1 ;
   private String AV27DesArt ;
   private String AV28Ref10 ;
   private String AV26Dsc_mta ;
   private String AV29Marq ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date A49AlbRFen ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n408EmprPob ;
   private boolean n409EmprTel ;
   private boolean n405EmprFax ;
   private boolean n395EmprCif ;
   private boolean n6263AlbRTartC ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean n11361Cod_mta ;
   private boolean n841TrnNom ;
   private boolean n971ProceNom ;
   private boolean n994ProceDom ;
   private boolean n990ProceTel1 ;
   private boolean n6264AlbRTartD ;
   private boolean n11362Dsc_mta ;
   private boolean n1212TipEntNom ;
   private boolean n854UsurNom ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P07R12_A396EmprCod ;
   private String[] P07R12_A407EmprNom ;
   private boolean[] P07R12_n407EmprNom ;
   private String[] P07R12_A404EmprDir ;
   private boolean[] P07R12_n404EmprDir ;
   private String[] P07R12_A408EmprPob ;
   private boolean[] P07R12_n408EmprPob ;
   private String[] P07R12_A409EmprTel ;
   private boolean[] P07R12_n409EmprTel ;
   private String[] P07R12_A405EmprFax ;
   private boolean[] P07R12_n405EmprFax ;
   private String[] P07R12_A395EmprCif ;
   private boolean[] P07R12_n395EmprCif ;
   private int[] P07R13_A252CliCod ;
   private short[] P07R13_A6263AlbRTartC ;
   private boolean[] P07R13_n6263AlbRTartC ;
   private short[] P07R13_A840TrnCod ;
   private boolean[] P07R13_n840TrnCod ;
   private short[] P07R13_A970ProceCod ;
   private boolean[] P07R13_n970ProceCod ;
   private short[] P07R13_A1211TipEntCod ;
   private boolean[] P07R13_n1211TipEntCod ;
   private short[] P07R13_A11361Cod_mta ;
   private boolean[] P07R13_n11361Cod_mta ;
   private String[] P07R13_A396EmprCod ;
   private int[] P07R13_A44AlbRecCod ;
   private String[] P07R13_A6178AlbrUsu ;
   private String[] P07R13_A841TrnNom ;
   private boolean[] P07R13_n841TrnNom ;
   private String[] P07R13_A279CliNom ;
   private String[] P07R13_A260CliDom ;
   private String[] P07R13_A278CliNif ;
   private String[] P07R13_A303CliTel1 ;
   private String[] P07R13_A971ProceNom ;
   private boolean[] P07R13_n971ProceNom ;
   private String[] P07R13_A994ProceDom ;
   private boolean[] P07R13_n994ProceDom ;
   private String[] P07R13_A990ProceTel1 ;
   private boolean[] P07R13_n990ProceTel1 ;
   private String[] P07R13_A6264AlbRTartD ;
   private boolean[] P07R13_n6264AlbRTartD ;
   private String[] P07R13_A5806AlbREnt2 ;
   private String[] P07R13_A11362Dsc_mta ;
   private boolean[] P07R13_n11362Dsc_mta ;
   private String[] P07R13_A8025AlbOpsC ;
   private String[] P07R13_A3613AlbRefDsc ;
   private String[] P07R13_A45AlbRef ;
   private String[] P07R13_A46AlbREnt ;
   private String[] P07R13_A6182AlbrNF ;
   private java.util.Date[] P07R13_A6179AlbrHor ;
   private java.util.Date[] P07R13_A49AlbRFen ;
   private java.math.BigDecimal[] P07R13_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P07R13_A4290AlbPmPPza ;
   private int[] P07R13_A52AlbRPieEnt ;
   private String[] P07R13_A1212TipEntNom ;
   private boolean[] P07R13_n1212TipEntNom ;
   private String[] P07R13_A50AlbRLoc ;
   private String[] P07R14_A850UsurCod ;
   private String[] P07R14_A854UsurNom ;
   private boolean[] P07R14_n854UsurNom ;
   private String[] P07R15_A396EmprCod ;
   private int[] P07R15_A44AlbRecCod ;
   private String[] P07R15_A1300AlbRObs ;
   private byte[] P07R15_A1299AlbRLin ;
}

final  class rremalmprendas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07R12", "SELECT EmprCod, EmprNom, EmprDir, EmprPob, EmprTel, EmprFax, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07R13", "SELECT T1.CliCod, T1.AlbRTartC AS AlbRTartC, T1.TrnCod, T1.ProceCod, T1.TipEntCod, T1.Cod_mta, T1.EmprCod, T1.AlbRecCod, T1.AlbrUsu, T4.TrnNom, T2.CliNom, T2.CliDom, T2.CliNif, T2.CliTel1, T5.ProceNom, T5.ProceDom, T5.ProceTel1, T3.TipArtDsc AS AlbRTartD, T1.AlbREnt2, T7.Dsc_mta, T1.AlbOpsC, T1.AlbRefDsc, T1.AlbRef, T1.AlbREnt, T1.AlbrNF, T1.AlbrHor, T1.AlbRFen, T1.AlbRUniEnt, T1.AlbPmPPza, T1.AlbRPieEnt, T6.TipEntNom, T1.AlbRLoc FROM ((((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod AND T5.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD T6 ON T6.EmprCod = T1.EmprCod AND T6.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTIPMTA T7 ON T7.EmprCod = T1.EmprCod AND T7.Cod_mta = T1.Cod_mta) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07R14", "SELECT UsurCod, UsurNom FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07R15", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 10);
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 30);
               ((String[]) buf[17])[0] = rslt.getString(12, 34);
               ((String[]) buf[18])[0] = rslt.getString(13, 20);
               ((String[]) buf[19])[0] = rslt.getString(14, 15);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 34);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 9);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(19, 20);
               ((String[]) buf[29])[0] = rslt.getString(20, 60);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(21, 30);
               ((String[]) buf[32])[0] = rslt.getString(22, 26);
               ((String[]) buf[33])[0] = rslt.getString(23, 16);
               ((String[]) buf[34])[0] = rslt.getString(24, 8);
               ((String[]) buf[35])[0] = rslt.getString(25, 1);
               ((java.util.Date[]) buf[36])[0] = GXutil.resetDate(rslt.getGXDateTime(26));
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDate(27);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(28,2);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(29,3);
               ((int[]) buf[40])[0] = rslt.getInt(30);
               ((String[]) buf[41])[0] = rslt.getString(31, 25);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(32, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 35);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

