package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rialbreg extends GXReport
{
   public rialbreg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rialbreg.class ), "" );
   }

   public rialbreg( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      rialbreg.this.aP2 = new String[] {""};
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
      rialbreg.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rialbreg.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      rialbreg.this.Gx_out = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 3 ;
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
         getPrinter().GxSetDocName("ALBARAN RECEPCION-PZAS/GRAFIC") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*3)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV22Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN097", ""), (byte)(99), GXv_char2) ;
         rialbreg.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit12 = GXt_char1 ;
         GXt_char1 = AV23Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rialbreg.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit15 = GXt_char1 ;
         AV23Lit15 = GXutil.trim( AV23Lit15) + httpContext.getMessage( "-Hora", "") ;
         GXt_char1 = AV24Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1229_", ""), (byte)(99), GXv_char2) ;
         rialbreg.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit17 = GXt_char1 ;
         AV24Lit17 = httpContext.getMessage( "Nº ", "") + GXutil.trim( AV24Lit17) ;
         GXt_int3 = AV10ReferPza ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PZAREF", ""), GXv_int4) ;
         rialbreg.this.GXt_int3 = GXv_int4[0] ;
         AV10ReferPza = GXt_int3 ;
         AV12Refer = httpContext.getMessage( "Referencia", "") ;
         GXt_char1 = AV20Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN435_", ""), (byte)(99), GXv_char2) ;
         rialbreg.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit1 = GXt_char1 ;
         GXt_int3 = AV30Termilenio ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TERMIL", ""), GXv_int4) ;
         rialbreg.this.GXt_int3 = GXv_int4[0] ;
         AV30Termilenio = GXt_int3 ;
         AV13AlbRUniEnt = DecimalUtil.doubleToDec(0) ;
         AV14AlbRUniUti = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P06O62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A56AlbRUni = P06O62_A56AlbRUni[0] ;
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               AV15AlbRUni = httpContext.getMessage( "M", "") ;
               /* Optimized group. */
               /* Using cursor P06O63 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               c2157AlbRecMtr = P06O63_A2157AlbRecMtr[0] ;
               c2158AlbRecMtrU = P06O63_A2158AlbRecMtrU[0] ;
               pr_default.close(1);
               AV13AlbRUniEnt = AV13AlbRUniEnt.add(c2157AlbRecMtr) ;
               AV14AlbRUniUti = AV14AlbRUniUti.add(c2158AlbRecMtrU) ;
               /* End optimized group. */
            }
            else
            {
               AV15AlbRUni = httpContext.getMessage( "K", "") ;
               /* Optimized group. */
               /* Using cursor P06O64 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               c2155AlbRecKgm = P06O64_A2155AlbRecKgm[0] ;
               c2156AlbRecKgmU = P06O64_A2156AlbRecKgmU[0] ;
               pr_default.close(2);
               AV13AlbRUniEnt = AV13AlbRUniEnt.add(c2155AlbRecKgm) ;
               AV14AlbRUniUti = AV14AlbRUniUti.add(c2156AlbRecKgmU) ;
               /* End optimized group. */
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06O65 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A5806AlbREnt2 = P06O65_A5806AlbREnt2[0] ;
            A46AlbREnt = P06O65_A46AlbREnt[0] ;
            A3613AlbRefDsc = P06O65_A3613AlbRefDsc[0] ;
            A407EmprNom = P06O65_A407EmprNom[0] ;
            n407EmprNom = P06O65_n407EmprNom[0] ;
            A60AlbRUniUti = P06O65_A60AlbRUniUti[0] ;
            A841TrnNom = P06O65_A841TrnNom[0] ;
            n841TrnNom = P06O65_n841TrnNom[0] ;
            A56AlbRUni = P06O65_A56AlbRUni[0] ;
            A971ProceNom = P06O65_A971ProceNom[0] ;
            n971ProceNom = P06O65_n971ProceNom[0] ;
            A279CliNom = P06O65_A279CliNom[0] ;
            A52AlbRPieEnt = P06O65_A52AlbRPieEnt[0] ;
            A840TrnCod = P06O65_A840TrnCod[0] ;
            n840TrnCod = P06O65_n840TrnCod[0] ;
            A970ProceCod = P06O65_A970ProceCod[0] ;
            n970ProceCod = P06O65_n970ProceCod[0] ;
            A252CliCod = P06O65_A252CliCod[0] ;
            A58AlbRUniEnt = P06O65_A58AlbRUniEnt[0] ;
            A55AlbRReo = P06O65_A55AlbRReo[0] ;
            A54AlbRPieUti = P06O65_A54AlbRPieUti[0] ;
            A50AlbRLoc = P06O65_A50AlbRLoc[0] ;
            A49AlbRFen = P06O65_A49AlbRFen[0] ;
            A48AlbRFecUlt = P06O65_A48AlbRFecUlt[0] ;
            A47AlbREst = P06O65_A47AlbREst[0] ;
            A45AlbRef = P06O65_A45AlbRef[0] ;
            A1291AlbRDes = P06O65_A1291AlbRDes[0] ;
            A407EmprNom = P06O65_A407EmprNom[0] ;
            n407EmprNom = P06O65_n407EmprNom[0] ;
            A279CliNom = P06O65_A279CliNom[0] ;
            A841TrnNom = P06O65_A841TrnNom[0] ;
            n841TrnNom = P06O65_n841TrnNom[0] ;
            A971ProceNom = P06O65_A971ProceNom[0] ;
            n971ProceNom = P06O65_n971ProceNom[0] ;
            AV19AlbREnt2 = A5806AlbREnt2 ;
            if ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 )
            {
               AV19AlbREnt2 = A46AlbREnt ;
            }
            h6O60( false, 313) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), 335, Gx_line+173, 482, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 131, Gx_line+64, 190, Gx_line+81, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 131, Gx_line+95, 249, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19AlbREnt2, "")), 366, Gx_line+64, 513, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A47AlbREst), "9")), 483, Gx_line+250, 491, Gx_line+267, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A48AlbRFecUlt, "99/99/99"), 389, Gx_line+266, 448, Gx_line+283, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 389, Gx_line+250, 448, Gx_line+267, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 131, Gx_line+173, 205, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")), 319, Gx_line+266, 364, Gx_line+283, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A55AlbRReo, "@!")), 583, Gx_line+173, 599, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 204, Gx_line+250, 271, Gx_line+267, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 335, Gx_line+95, 380, Gx_line+112, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9")), 131, Gx_line+146, 161, Gx_line+163, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), 131, Gx_line+126, 161, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Destino :", ""), 263, Gx_line+174, 317, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.Recepcion   :", ""), 15, Gx_line+65, 110, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Referencia    :", ""), 15, Gx_line+96, 101, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 469, Gx_line+219, 511, Gx_line+233, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha  :", ""), 518, Gx_line+65, 568, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Localización  :", ""), 15, Gx_line+174, 102, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PIEZAS", ""), 316, Gx_line+219, 363, Gx_line+233, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 319, Gx_line+250, 364, Gx_line+267, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Reoperado :", ""), 496, Gx_line+174, 570, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transportista :", ""), 15, Gx_line+127, 101, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente :", ""), 263, Gx_line+96, 313, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Procedencia   :", ""), 15, Gx_line+147, 107, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Entrado   :", ""), 102, Gx_line+252, 166, Gx_line+266, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 401, Gx_line+95, 621, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 583, Gx_line+16, 642, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 583, Gx_line+0, 642, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha : ", ""), 518, Gx_line+0, 568, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora  :", ""), 518, Gx_line+16, 560, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ALBARAN DE RECEPCION", ""), 255, Gx_line+16, 415, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A971ProceNom, "")), 182, Gx_line+146, 402, Gx_line+163, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Utilizado :", ""), 102, Gx_line+268, 162, Gx_line+282, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CANTIDAD", ""), 203, Gx_line+219, 270, Gx_line+233, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A56AlbRUni, "@!")), 284, Gx_line+250, 292, Gx_line+267, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 182, Gx_line+126, 402, Gx_line+143, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")), 204, Gx_line+266, 271, Gx_line+283, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA", ""), 389, Gx_line+219, 432, Gx_line+233, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 591, Gx_line+64, 650, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 7, Gx_line+0, 227, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(255, Gx_line+34, 415, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(204, Gx_line+238, 270, Gx_line+238, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(389, Gx_line+238, 447, Gx_line+238, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(316, Gx_line+238, 363, Gx_line+238, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(469, Gx_line+238, 515, Gx_line+238, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(15, Gx_line+202, 667, Gx_line+300, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit1, "")), 257, Gx_line+65, 352, Gx_line+80, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 131, Gx_line+110, 322, Gx_line+127, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+313) ;
            AV9Observ = (byte)(0) ;
            /* Using cursor P06O66 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A1300AlbRObs = P06O66_A1300AlbRObs[0] ;
               A1299AlbRLin = P06O66_A1299AlbRLin[0] ;
               if ( AV9Observ == 0 )
               {
                  h6O60( false, 16) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observaciones :", ""), 13, Gx_line+0, 110, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 139, Gx_line+0, 578, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
               }
               else
               {
                  h6O60( false, 16) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 139, Gx_line+0, 578, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
               }
               AV9Observ = (byte)(1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            if ( AV9Observ == 1 )
            {
               h6O60( false, 11) ;
               getPrinter().GxDrawLine(13, Gx_line+7, 667, Gx_line+7, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+11) ;
            }
            AV8vEntre = httpContext.getMessage( "N", "") ;
            /* Using cursor P06O67 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A2157AlbRecMtr = P06O67_A2157AlbRecMtr[0] ;
               A2155AlbRecKgm = P06O67_A2155AlbRecKgm[0] ;
               A2159AlbRecPie = P06O67_A2159AlbRecPie[0] ;
               AV8vEntre = httpContext.getMessage( "S", "") ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            if ( GXutil.strcmp(AV8vEntre, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( (0==AV10ReferPza) )
               {
                  h6O60( false, 27) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "PIEZA", ""), 22, Gx_line+0, 61, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 109, Gx_line+0, 148, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 233, Gx_line+0, 286, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Utilizados", ""), 321, Gx_line+0, 379, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "KILOS:", ""), 175, Gx_line+0, 218, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "METROS:", ""), 423, Gx_line+0, 482, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 489, Gx_line+0, 542, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Utilizados", ""), 569, Gx_line+0, 627, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(13, Gx_line+20, 667, Gx_line+20, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+27) ;
               }
               else
               {
                  h6O60( false, 46) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "PIEZA", ""), 21, Gx_line+23, 60, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 108, Gx_line+23, 147, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 179, Gx_line+23, 232, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Utilizados", ""), 260, Gx_line+23, 318, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "K I L OS ", ""), 223, Gx_line+0, 278, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "M E T R O S", ""), 373, Gx_line+0, 449, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 347, Gx_line+23, 400, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Utilizados", ""), 426, Gx_line+23, 484, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(11, Gx_line+43, 665, Gx_line+43, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(338, Gx_line+14, 485, Gx_line+14, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(172, Gx_line+14, 319, Gx_line+14, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Refer, "")), 509, Gx_line+23, 585, Gx_line+38, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+46) ;
               }
               AV18Tot_mtse = DecimalUtil.doubleToDec(0) ;
               AV17Tkgse = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P06O68 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A2159AlbRecPie = P06O68_A2159AlbRecPie[0] ;
                  A2158AlbRecMtrU = P06O68_A2158AlbRecMtrU[0] ;
                  A2157AlbRecMtr = P06O68_A2157AlbRecMtr[0] ;
                  A2156AlbRecKgmU = P06O68_A2156AlbRecKgmU[0] ;
                  A2155AlbRecKgm = P06O68_A2155AlbRecKgm[0] ;
                  A2154AlbRecAnh = P06O68_A2154AlbRecAnh[0] ;
                  A3731AlbRecIdPz = P06O68_A3731AlbRecIdPz[0] ;
                  if ( (0==AV10ReferPza) )
                  {
                     h6O60( false, 16) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2154AlbRecAnh), "ZZ9")), 117, Gx_line+0, 140, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99")), 226, Gx_line+0, 293, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99")), 328, Gx_line+0, 395, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99")), 481, Gx_line+0, 548, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99")), 576, Gx_line+0, 643, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2159AlbRecPie, "")), 22, Gx_line+0, 89, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+16) ;
                  }
                  else
                  {
                     h6O60( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2154AlbRecAnh), "ZZ9")), 117, Gx_line+0, 140, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99")), 167, Gx_line+0, 234, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99")), 253, Gx_line+0, 320, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99")), 334, Gx_line+0, 401, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99")), 419, Gx_line+0, 486, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2159AlbRecPie, "")), 21, Gx_line+0, 88, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3731AlbRecIdPz, "")), 511, Gx_line+1, 621, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  AV17Tkgse = AV17Tkgse.add(A2155AlbRecKgm) ;
                  AV18Tot_mtse = AV18Tot_mtse.add(A2157AlbRecMtr) ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               h6O60( false, 27) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Tkgse, "ZZZZZZ9.99")), 219, Gx_line+11, 293, Gx_line+28, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Tot_mtse, "ZZZZZZ9.99")), 474, Gx_line+11, 548, Gx_line+28, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+27) ;
            }
            if ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 )
            {
               AV21ALbReccod = A44AlbRecCod ;
               /* Execute user subroutine: 'RECLAMACIONES' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(3);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            h6O60( false, 34) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Elaborado____________", ""), 23, Gx_line+16, 171, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recibido______________", ""), 419, Gx_line+11, 574, Gx_line+25, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+34) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6O60( true, 0) ;
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
      /* 'RECLAMACIONES' Routine */
      returnInSub = false ;
      /* Using cursor P06O69 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV21ALbReccod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A5206Nr_albrecc = P06O69_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P06O69_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P06O69_A5198Nr_codigo[0] ;
         A5224Nr_barpara = P06O69_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P06O69_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P06O69_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P06O69_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P06O69_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P06O69_n5222Nr_barcoda[0] ;
         A12235Nr_NAlb = P06O69_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P06O69_n12235Nr_NAlb[0] ;
         A5210Nr_barcod = P06O69_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P06O69_n5210Nr_barcod[0] ;
         A5216Nr_fecreg = P06O69_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P06O69_n5216Nr_fecreg[0] ;
         AV25Barcolnom = " " ;
         AV26Barcolnum = 0 ;
         AV27ALbprocod = 0 ;
         AV28Kgs = DecimalUtil.doubleToDec(0) ;
         AV29Mts = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P06O610 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n5222Nr_barcoda), Integer.valueOf(A5222Nr_barcoda), Boolean.valueOf(n5223Nr_barreoa), Byte.valueOf(A5223Nr_barreoa), Boolean.valueOf(n5224Nr_barpara), A5224Nr_barpara});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A129BarCod = P06O610_A129BarCod[0] ;
            A132BarCodReo = P06O610_A132BarCodReo[0] ;
            A130BarCodPar = P06O610_A130BarCodPar[0] ;
            A135BarColNom = P06O610_A135BarColNom[0] ;
            A136BarColNum = P06O610_A136BarColNum[0] ;
            A30AlbProCod = P06O610_A30AlbProCod[0] ;
            A1261BarAlbKgmE = P06O610_A1261BarAlbKgmE[0] ;
            A1263BarAlbMtrE = P06O610_A1263BarAlbMtrE[0] ;
            A135BarColNom = P06O610_A135BarColNom[0] ;
            A136BarColNum = P06O610_A136BarColNum[0] ;
            AV25Barcolnom = A135BarColNom ;
            AV26Barcolnum = A136BarColNum ;
            AV27ALbprocod = A30AlbProCod ;
            AV28Kgs = A1261BarAlbKgmE ;
            AV29Mts = A1263BarAlbMtrE ;
            pr_default.readNext(8);
         }
         pr_default.close(8);
         AV27ALbprocod = ((AV30Termilenio==1) ? A12235Nr_NAlb : AV27ALbprocod) ;
         h6O60( false, 148) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( A5216Nr_fecreg, "99/99/99 99:99:99"), 164, Gx_line+48, 289, Gx_line+65, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5222Nr_barcoda), "ZZZZZZZ9")), 163, Gx_line+16, 222, Gx_line+33, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5224Nr_barpara, "")), 243, Gx_line+16, 251, Gx_line+33, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5223Nr_barreoa), "9")), 228, Gx_line+16, 236, Gx_line+33, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit12, "")), 31, Gx_line+16, 157, Gx_line+33, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit15, "")), 32, Gx_line+49, 158, Gx_line+66, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit17, "")), 32, Gx_line+66, 158, Gx_line+83, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5210Nr_barcod), "ZZZZZZZ9")), 164, Gx_line+65, 223, Gx_line+82, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5223Nr_barreoa), "9")), 229, Gx_line+65, 237, Gx_line+82, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5224Nr_barpara, "")), 244, Gx_line+65, 252, Gx_line+82, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 80, Gx_line+125, 122, Gx_line+139, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 130, Gx_line+125, 201, Gx_line+139, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(80, Gx_line+142, 122, Gx_line+142, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(130, Gx_line+142, 349, Gx_line+142, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(15, Gx_line+4, 667, Gx_line+126, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Reclamacion:", ""), 496, Gx_line+16, 591, Gx_line+30, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5198Nr_codigo), "ZZZZZZZ9")), 602, Gx_line+15, 661, Gx_line+32, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Remito:", ""), 495, Gx_line+47, 554, Gx_line+61, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27ALbprocod), "ZZZZZZZZZ9")), 560, Gx_line+47, 634, Gx_line+64, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(483, Gx_line+31, 666, Gx_line+126, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28Kgs, "ZZZZZ9.99")), 568, Gx_line+75, 635, Gx_line+92, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29Mts, "ZZZZZ9.99")), 568, Gx_line+91, 635, Gx_line+108, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kilos:", ""), 521, Gx_line+75, 554, Gx_line+89, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Metros:", ""), 509, Gx_line+91, 554, Gx_line+105, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Barcolnom, "")), 165, Gx_line+31, 261, Gx_line+48, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26Barcolnum), "ZZZZZ9")), 265, Gx_line+31, 310, Gx_line+48, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color:", ""), 32, Gx_line+32, 67, Gx_line+46, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+148) ;
         /* Using cursor P06O611 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A834TipDefDsc = P06O611_A834TipDefDsc[0] ;
            n834TipDefDsc = P06O611_n834TipDefDsc[0] ;
            A833TipDefCod = P06O611_A833TipDefCod[0] ;
            A834TipDefDsc = P06O611_A834TipDefDsc[0] ;
            n834TipDefDsc = P06O611_n834TipDefDsc[0] ;
            h6O60( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9")), 81, Gx_line+2, 111, Gx_line+19, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), 131, Gx_line+0, 351, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void h6O60( boolean bFoot ,
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
      this.aP0[0] = rialbreg.this.A396EmprCod;
      this.aP1[0] = rialbreg.this.A44AlbRecCod;
      this.aP2[0] = rialbreg.this.Gx_out;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22Lit12 = "" ;
      AV23Lit15 = "" ;
      AV24Lit17 = "" ;
      AV12Refer = "" ;
      AV20Lit1 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new byte[1] ;
      AV13AlbRUniEnt = DecimalUtil.ZERO ;
      AV14AlbRUniUti = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P06O62_A396EmprCod = new String[] {""} ;
      P06O62_A44AlbRecCod = new int[1] ;
      P06O62_A56AlbRUni = new String[] {""} ;
      A56AlbRUni = "" ;
      AV15AlbRUni = "" ;
      c2157AlbRecMtr = DecimalUtil.ZERO ;
      c2158AlbRecMtrU = DecimalUtil.ZERO ;
      P06O63_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06O63_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      c2155AlbRecKgm = DecimalUtil.ZERO ;
      c2156AlbRecKgmU = DecimalUtil.ZERO ;
      P06O64_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06O64_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06O65_A396EmprCod = new String[] {""} ;
      P06O65_A44AlbRecCod = new int[1] ;
      P06O65_A5806AlbREnt2 = new String[] {""} ;
      P06O65_A46AlbREnt = new String[] {""} ;
      P06O65_A3613AlbRefDsc = new String[] {""} ;
      P06O65_A407EmprNom = new String[] {""} ;
      P06O65_n407EmprNom = new boolean[] {false} ;
      P06O65_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06O65_A841TrnNom = new String[] {""} ;
      P06O65_n841TrnNom = new boolean[] {false} ;
      P06O65_A56AlbRUni = new String[] {""} ;
      P06O65_A971ProceNom = new String[] {""} ;
      P06O65_n971ProceNom = new boolean[] {false} ;
      P06O65_A279CliNom = new String[] {""} ;
      P06O65_A52AlbRPieEnt = new int[1] ;
      P06O65_A840TrnCod = new short[1] ;
      P06O65_n840TrnCod = new boolean[] {false} ;
      P06O65_A970ProceCod = new short[1] ;
      P06O65_n970ProceCod = new boolean[] {false} ;
      P06O65_A252CliCod = new int[1] ;
      P06O65_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06O65_A55AlbRReo = new String[] {""} ;
      P06O65_A54AlbRPieUti = new int[1] ;
      P06O65_A50AlbRLoc = new String[] {""} ;
      P06O65_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P06O65_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P06O65_A47AlbREst = new byte[1] ;
      P06O65_A45AlbRef = new String[] {""} ;
      P06O65_A1291AlbRDes = new String[] {""} ;
      A5806AlbREnt2 = "" ;
      A46AlbREnt = "" ;
      A3613AlbRefDsc = "" ;
      A407EmprNom = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A841TrnNom = "" ;
      A971ProceNom = "" ;
      A279CliNom = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A55AlbRReo = "" ;
      A50AlbRLoc = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A1291AlbRDes = "" ;
      AV19AlbREnt2 = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      P06O66_A396EmprCod = new String[] {""} ;
      P06O66_A44AlbRecCod = new int[1] ;
      P06O66_A1300AlbRObs = new String[] {""} ;
      P06O66_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      AV8vEntre = "" ;
      P06O67_A396EmprCod = new String[] {""} ;
      P06O67_A44AlbRecCod = new int[1] ;
      P06O67_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06O67_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06O67_A2159AlbRecPie = new String[] {""} ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2159AlbRecPie = "" ;
      AV18Tot_mtse = DecimalUtil.ZERO ;
      AV17Tkgse = DecimalUtil.ZERO ;
      P06O68_A396EmprCod = new String[] {""} ;
      P06O68_A44AlbRecCod = new int[1] ;
      P06O68_A2159AlbRecPie = new String[] {""} ;
      P06O68_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06O68_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06O68_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06O68_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06O68_A2154AlbRecAnh = new short[1] ;
      P06O68_A3731AlbRecIdPz = new String[] {""} ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A3731AlbRecIdPz = "" ;
      P06O69_A396EmprCod = new String[] {""} ;
      P06O69_A5206Nr_albrecc = new int[1] ;
      P06O69_n5206Nr_albrecc = new boolean[] {false} ;
      P06O69_A5198Nr_codigo = new int[1] ;
      P06O69_A5224Nr_barpara = new String[] {""} ;
      P06O69_n5224Nr_barpara = new boolean[] {false} ;
      P06O69_A5223Nr_barreoa = new byte[1] ;
      P06O69_n5223Nr_barreoa = new boolean[] {false} ;
      P06O69_A5222Nr_barcoda = new int[1] ;
      P06O69_n5222Nr_barcoda = new boolean[] {false} ;
      P06O69_A12235Nr_NAlb = new long[1] ;
      P06O69_n12235Nr_NAlb = new boolean[] {false} ;
      P06O69_A5210Nr_barcod = new int[1] ;
      P06O69_n5210Nr_barcod = new boolean[] {false} ;
      P06O69_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P06O69_n5216Nr_fecreg = new boolean[] {false} ;
      A5224Nr_barpara = "" ;
      A5216Nr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      AV25Barcolnom = "" ;
      AV28Kgs = DecimalUtil.ZERO ;
      AV29Mts = DecimalUtil.ZERO ;
      P06O610_A396EmprCod = new String[] {""} ;
      P06O610_A129BarCod = new int[1] ;
      P06O610_A132BarCodReo = new byte[1] ;
      P06O610_A130BarCodPar = new String[] {""} ;
      P06O610_A135BarColNom = new String[] {""} ;
      P06O610_A136BarColNum = new int[1] ;
      P06O610_A30AlbProCod = new long[1] ;
      P06O610_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06O610_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      P06O611_A396EmprCod = new String[] {""} ;
      P06O611_A5198Nr_codigo = new int[1] ;
      P06O611_A834TipDefDsc = new String[] {""} ;
      P06O611_n834TipDefDsc = new boolean[] {false} ;
      P06O611_A833TipDefCod = new short[1] ;
      A834TipDefDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rialbreg__default(),
         new Object[] {
             new Object[] {
            P06O62_A396EmprCod, P06O62_A44AlbRecCod, P06O62_A56AlbRUni
            }
            , new Object[] {
            P06O63_A2157AlbRecMtr, P06O63_A2158AlbRecMtrU
            }
            , new Object[] {
            P06O64_A2155AlbRecKgm, P06O64_A2156AlbRecKgmU
            }
            , new Object[] {
            P06O65_A396EmprCod, P06O65_A44AlbRecCod, P06O65_A5806AlbREnt2, P06O65_A46AlbREnt, P06O65_A3613AlbRefDsc, P06O65_A407EmprNom, P06O65_n407EmprNom, P06O65_A60AlbRUniUti, P06O65_A841TrnNom, P06O65_n841TrnNom,
            P06O65_A56AlbRUni, P06O65_A971ProceNom, P06O65_n971ProceNom, P06O65_A279CliNom, P06O65_A52AlbRPieEnt, P06O65_A840TrnCod, P06O65_n840TrnCod, P06O65_A970ProceCod, P06O65_n970ProceCod, P06O65_A252CliCod,
            P06O65_A58AlbRUniEnt, P06O65_A55AlbRReo, P06O65_A54AlbRPieUti, P06O65_A50AlbRLoc, P06O65_A49AlbRFen, P06O65_A48AlbRFecUlt, P06O65_A47AlbREst, P06O65_A45AlbRef, P06O65_A1291AlbRDes
            }
            , new Object[] {
            P06O66_A396EmprCod, P06O66_A44AlbRecCod, P06O66_A1300AlbRObs, P06O66_A1299AlbRLin
            }
            , new Object[] {
            P06O67_A396EmprCod, P06O67_A44AlbRecCod, P06O67_A2157AlbRecMtr, P06O67_A2155AlbRecKgm, P06O67_A2159AlbRecPie
            }
            , new Object[] {
            P06O68_A396EmprCod, P06O68_A44AlbRecCod, P06O68_A2159AlbRecPie, P06O68_A2158AlbRecMtrU, P06O68_A2157AlbRecMtr, P06O68_A2156AlbRecKgmU, P06O68_A2155AlbRecKgm, P06O68_A2154AlbRecAnh, P06O68_A3731AlbRecIdPz
            }
            , new Object[] {
            P06O69_A396EmprCod, P06O69_A5206Nr_albrecc, P06O69_n5206Nr_albrecc, P06O69_A5198Nr_codigo, P06O69_A5224Nr_barpara, P06O69_n5224Nr_barpara, P06O69_A5223Nr_barreoa, P06O69_n5223Nr_barreoa, P06O69_A5222Nr_barcoda, P06O69_n5222Nr_barcoda,
            P06O69_A12235Nr_NAlb, P06O69_n12235Nr_NAlb, P06O69_A5210Nr_barcod, P06O69_n5210Nr_barcod, P06O69_A5216Nr_fecreg, P06O69_n5216Nr_fecreg
            }
            , new Object[] {
            P06O610_A396EmprCod, P06O610_A129BarCod, P06O610_A132BarCodReo, P06O610_A130BarCodPar, P06O610_A135BarColNom, P06O610_A136BarColNum, P06O610_A30AlbProCod, P06O610_A1261BarAlbKgmE, P06O610_A1263BarAlbMtrE
            }
            , new Object[] {
            P06O611_A396EmprCod, P06O611_A5198Nr_codigo, P06O611_A834TipDefDsc, P06O611_n834TipDefDsc, P06O611_A833TipDefCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV10ReferPza ;
   private byte AV30Termilenio ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A47AlbREst ;
   private byte AV9Observ ;
   private byte A1299AlbRLin ;
   private byte A5223Nr_barreoa ;
   private byte A132BarCodReo ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A2154AlbRecAnh ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A52AlbRPieEnt ;
   private int A252CliCod ;
   private int A54AlbRPieUti ;
   private int Gx_OldLine ;
   private int AV21ALbReccod ;
   private int A5206Nr_albrecc ;
   private int A5198Nr_codigo ;
   private int A5222Nr_barcoda ;
   private int A5210Nr_barcod ;
   private int AV26Barcolnum ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private long A12235Nr_NAlb ;
   private long AV27ALbprocod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV13AlbRUniEnt ;
   private java.math.BigDecimal AV14AlbRUniUti ;
   private java.math.BigDecimal c2157AlbRecMtr ;
   private java.math.BigDecimal c2158AlbRecMtrU ;
   private java.math.BigDecimal c2155AlbRecKgm ;
   private java.math.BigDecimal c2156AlbRecKgmU ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal AV18Tot_mtse ;
   private java.math.BigDecimal AV17Tkgse ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal AV28Kgs ;
   private java.math.BigDecimal AV29Mts ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private String A396EmprCod ;
   private String Gx_out ;
   private String AV22Lit12 ;
   private String AV23Lit15 ;
   private String AV24Lit17 ;
   private String AV12Refer ;
   private String AV20Lit1 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String AV15AlbRUni ;
   private String A5806AlbREnt2 ;
   private String A46AlbREnt ;
   private String A3613AlbRefDsc ;
   private String A407EmprNom ;
   private String A841TrnNom ;
   private String A971ProceNom ;
   private String A279CliNom ;
   private String A55AlbRReo ;
   private String A50AlbRLoc ;
   private String A45AlbRef ;
   private String A1291AlbRDes ;
   private String AV19AlbREnt2 ;
   private String Gx_time ;
   private String A1300AlbRObs ;
   private String AV8vEntre ;
   private String A2159AlbRecPie ;
   private String A3731AlbRecIdPz ;
   private String A5224Nr_barpara ;
   private String AV25Barcolnom ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A834TipDefDsc ;
   private java.util.Date A5216Nr_fecreg ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n971ProceNom ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean returnInSub ;
   private boolean n5206Nr_albrecc ;
   private boolean n5224Nr_barpara ;
   private boolean n5223Nr_barreoa ;
   private boolean n5222Nr_barcoda ;
   private boolean n12235Nr_NAlb ;
   private boolean n5210Nr_barcod ;
   private boolean n5216Nr_fecreg ;
   private boolean n834TipDefDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P06O62_A396EmprCod ;
   private int[] P06O62_A44AlbRecCod ;
   private String[] P06O62_A56AlbRUni ;
   private java.math.BigDecimal[] P06O63_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P06O63_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] P06O64_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P06O64_A2156AlbRecKgmU ;
   private String[] P06O65_A396EmprCod ;
   private int[] P06O65_A44AlbRecCod ;
   private String[] P06O65_A5806AlbREnt2 ;
   private String[] P06O65_A46AlbREnt ;
   private String[] P06O65_A3613AlbRefDsc ;
   private String[] P06O65_A407EmprNom ;
   private boolean[] P06O65_n407EmprNom ;
   private java.math.BigDecimal[] P06O65_A60AlbRUniUti ;
   private String[] P06O65_A841TrnNom ;
   private boolean[] P06O65_n841TrnNom ;
   private String[] P06O65_A56AlbRUni ;
   private String[] P06O65_A971ProceNom ;
   private boolean[] P06O65_n971ProceNom ;
   private String[] P06O65_A279CliNom ;
   private int[] P06O65_A52AlbRPieEnt ;
   private short[] P06O65_A840TrnCod ;
   private boolean[] P06O65_n840TrnCod ;
   private short[] P06O65_A970ProceCod ;
   private boolean[] P06O65_n970ProceCod ;
   private int[] P06O65_A252CliCod ;
   private java.math.BigDecimal[] P06O65_A58AlbRUniEnt ;
   private String[] P06O65_A55AlbRReo ;
   private int[] P06O65_A54AlbRPieUti ;
   private String[] P06O65_A50AlbRLoc ;
   private java.util.Date[] P06O65_A49AlbRFen ;
   private java.util.Date[] P06O65_A48AlbRFecUlt ;
   private byte[] P06O65_A47AlbREst ;
   private String[] P06O65_A45AlbRef ;
   private String[] P06O65_A1291AlbRDes ;
   private String[] P06O66_A396EmprCod ;
   private int[] P06O66_A44AlbRecCod ;
   private String[] P06O66_A1300AlbRObs ;
   private byte[] P06O66_A1299AlbRLin ;
   private String[] P06O67_A396EmprCod ;
   private int[] P06O67_A44AlbRecCod ;
   private java.math.BigDecimal[] P06O67_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P06O67_A2155AlbRecKgm ;
   private String[] P06O67_A2159AlbRecPie ;
   private String[] P06O68_A396EmprCod ;
   private int[] P06O68_A44AlbRecCod ;
   private String[] P06O68_A2159AlbRecPie ;
   private java.math.BigDecimal[] P06O68_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] P06O68_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P06O68_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] P06O68_A2155AlbRecKgm ;
   private short[] P06O68_A2154AlbRecAnh ;
   private String[] P06O68_A3731AlbRecIdPz ;
   private String[] P06O69_A396EmprCod ;
   private int[] P06O69_A5206Nr_albrecc ;
   private boolean[] P06O69_n5206Nr_albrecc ;
   private int[] P06O69_A5198Nr_codigo ;
   private String[] P06O69_A5224Nr_barpara ;
   private boolean[] P06O69_n5224Nr_barpara ;
   private byte[] P06O69_A5223Nr_barreoa ;
   private boolean[] P06O69_n5223Nr_barreoa ;
   private int[] P06O69_A5222Nr_barcoda ;
   private boolean[] P06O69_n5222Nr_barcoda ;
   private long[] P06O69_A12235Nr_NAlb ;
   private boolean[] P06O69_n12235Nr_NAlb ;
   private int[] P06O69_A5210Nr_barcod ;
   private boolean[] P06O69_n5210Nr_barcod ;
   private java.util.Date[] P06O69_A5216Nr_fecreg ;
   private boolean[] P06O69_n5216Nr_fecreg ;
   private String[] P06O610_A396EmprCod ;
   private int[] P06O610_A129BarCod ;
   private byte[] P06O610_A132BarCodReo ;
   private String[] P06O610_A130BarCodPar ;
   private String[] P06O610_A135BarColNom ;
   private int[] P06O610_A136BarColNum ;
   private long[] P06O610_A30AlbProCod ;
   private java.math.BigDecimal[] P06O610_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P06O610_A1263BarAlbMtrE ;
   private String[] P06O611_A396EmprCod ;
   private int[] P06O611_A5198Nr_codigo ;
   private String[] P06O611_A834TipDefDsc ;
   private boolean[] P06O611_n834TipDefDsc ;
   private short[] P06O611_A833TipDefCod ;
}

final  class rialbreg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06O62", "SELECT EmprCod, AlbRecCod, AlbRUni FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06O63", "SELECT SUM(AlbRecMtr), SUM(AlbRecMtrU) FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06O64", "SELECT SUM(AlbRecKgm), SUM(AlbRecKgmU) FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06O65", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbREnt2, T1.AlbREnt, T1.AlbRefDsc, T2.EmprNom, T1.AlbRUniUti, T4.TrnNom, T1.AlbRUni, T5.ProceNom, T3.CliNom, T1.AlbRPieEnt, T1.TrnCod, T1.ProceCod, T1.CliCod, T1.AlbRUniEnt, T1.AlbRReo, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRFen, T1.AlbRFecUlt, T1.AlbREst, T1.AlbRef, T1.AlbRDes FROM ((((TXPALBREC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod AND T5.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06O66", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06O67", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecMtr, AlbRecKgm, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06O68", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlbRecMtrU, AlbRecMtr, AlbRecKgmU, AlbRecKgm, AlbRecAnh, AlbRecIdPz FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06O69", "SELECT EmprCod, Nr_albrecc, Nr_codigo, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_NAlb, Nr_barcod, Nr_fecreg FROM TXPNOTREC WHERE EmprCod = ? and Nr_albrecc = ? ORDER BY EmprCod, Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06O610", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarColNom, T2.BarColNum, T1.AlbProCod, T1.BarAlbKgmE, T1.BarAlbMtrE FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06O611", "SELECT T1.EmprCod, T1.Nr_codigo, T2.TipDefDsc, T1.TipDefCod FROM (TXPNOTRE1 T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.Nr_codigo = ? ORDER BY T1.EmprCod, T1.Nr_codigo, T1.TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 30);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((short[]) buf[15])[0] = rslt.getShort(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[21])[0] = rslt.getString(17, 2);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 10);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(20);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(21);
               ((byte[]) buf[26])[0] = rslt.getByte(22);
               ((String[]) buf[27])[0] = rslt.getString(23, 16);
               ((String[]) buf[28])[0] = rslt.getString(24, 20);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 15);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

