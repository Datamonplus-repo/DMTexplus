package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rialbretintoriente extends GXReport
{
   public rialbretintoriente( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rialbretintoriente.class ), "" );
   }

   public rialbretintoriente( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      rialbretintoriente.this.aP2 = new String[] {""};
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
      rialbretintoriente.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rialbretintoriente.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      rialbretintoriente.this.Gx_out = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 5 ;
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
         getPrinter().GxSetDocName("IAlb Re Tintoriente") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*5)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV22Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN097", ""), (byte)(99), GXv_char2) ;
         rialbretintoriente.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit12 = GXt_char1 ;
         GXt_char1 = AV23Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rialbretintoriente.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit15 = GXt_char1 ;
         AV23Lit15 = GXutil.trim( AV23Lit15) + httpContext.getMessage( "-Hora", "") ;
         GXt_char1 = AV24Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1229_", ""), (byte)(99), GXv_char2) ;
         rialbretintoriente.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit17 = GXt_char1 ;
         AV24Lit17 = httpContext.getMessage( "Nº ", "") + GXutil.trim( AV24Lit17) ;
         GXt_int3 = AV10ReferPza ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PZAREF", ""), GXv_int4) ;
         rialbretintoriente.this.GXt_int3 = GXv_int4[0] ;
         AV10ReferPza = GXt_int3 ;
         AV12Refer = httpContext.getMessage( "Referencia", "") ;
         GXt_char1 = AV20Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN435_", ""), (byte)(99), GXv_char2) ;
         rialbretintoriente.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit1 = GXt_char1 ;
         GXt_int3 = AV30Termilenio ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TERMIL", ""), GXv_int4) ;
         rialbretintoriente.this.GXt_int3 = GXv_int4[0] ;
         AV30Termilenio = GXt_int3 ;
         AV13AlbRUniEnt = DecimalUtil.doubleToDec(0) ;
         AV14AlbRUniUti = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P07TH2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A56AlbRUni = P07TH2_A56AlbRUni[0] ;
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               AV15AlbRUni = httpContext.getMessage( "M", "") ;
               /* Optimized group. */
               /* Using cursor P07TH3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               c2157AlbRecMtr = P07TH3_A2157AlbRecMtr[0] ;
               c2158AlbRecMtrU = P07TH3_A2158AlbRecMtrU[0] ;
               pr_default.close(1);
               AV13AlbRUniEnt = AV13AlbRUniEnt.add(c2157AlbRecMtr) ;
               AV14AlbRUniUti = AV14AlbRUniUti.add(c2158AlbRecMtrU) ;
               /* End optimized group. */
            }
            else
            {
               AV15AlbRUni = httpContext.getMessage( "K", "") ;
               /* Optimized group. */
               /* Using cursor P07TH4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               c2155AlbRecKgm = P07TH4_A2155AlbRecKgm[0] ;
               c2156AlbRecKgmU = P07TH4_A2156AlbRecKgmU[0] ;
               pr_default.close(2);
               AV13AlbRUniEnt = AV13AlbRUniEnt.add(c2155AlbRecKgm) ;
               AV14AlbRUniUti = AV14AlbRUniUti.add(c2156AlbRecKgmU) ;
               /* End optimized group. */
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07TH5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A5806AlbREnt2 = P07TH5_A5806AlbREnt2[0] ;
            A46AlbREnt = P07TH5_A46AlbREnt[0] ;
            A3613AlbRefDsc = P07TH5_A3613AlbRefDsc[0] ;
            A407EmprNom = P07TH5_A407EmprNom[0] ;
            n407EmprNom = P07TH5_n407EmprNom[0] ;
            A60AlbRUniUti = P07TH5_A60AlbRUniUti[0] ;
            A841TrnNom = P07TH5_A841TrnNom[0] ;
            n841TrnNom = P07TH5_n841TrnNom[0] ;
            A56AlbRUni = P07TH5_A56AlbRUni[0] ;
            A971ProceNom = P07TH5_A971ProceNom[0] ;
            n971ProceNom = P07TH5_n971ProceNom[0] ;
            A279CliNom = P07TH5_A279CliNom[0] ;
            A52AlbRPieEnt = P07TH5_A52AlbRPieEnt[0] ;
            A840TrnCod = P07TH5_A840TrnCod[0] ;
            n840TrnCod = P07TH5_n840TrnCod[0] ;
            A970ProceCod = P07TH5_A970ProceCod[0] ;
            n970ProceCod = P07TH5_n970ProceCod[0] ;
            A252CliCod = P07TH5_A252CliCod[0] ;
            A58AlbRUniEnt = P07TH5_A58AlbRUniEnt[0] ;
            A55AlbRReo = P07TH5_A55AlbRReo[0] ;
            A54AlbRPieUti = P07TH5_A54AlbRPieUti[0] ;
            A50AlbRLoc = P07TH5_A50AlbRLoc[0] ;
            A49AlbRFen = P07TH5_A49AlbRFen[0] ;
            A48AlbRFecUlt = P07TH5_A48AlbRFecUlt[0] ;
            A47AlbREst = P07TH5_A47AlbREst[0] ;
            A45AlbRef = P07TH5_A45AlbRef[0] ;
            A1291AlbRDes = P07TH5_A1291AlbRDes[0] ;
            A407EmprNom = P07TH5_A407EmprNom[0] ;
            n407EmprNom = P07TH5_n407EmprNom[0] ;
            A279CliNom = P07TH5_A279CliNom[0] ;
            A841TrnNom = P07TH5_A841TrnNom[0] ;
            n841TrnNom = P07TH5_n841TrnNom[0] ;
            A971ProceNom = P07TH5_A971ProceNom[0] ;
            n971ProceNom = P07TH5_n971ProceNom[0] ;
            AV19AlbREnt2 = A5806AlbREnt2 ;
            if ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 )
            {
               AV19AlbREnt2 = A46AlbREnt ;
            }
            h7TH0( false, 313) ;
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
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit1, "")), 257, Gx_line+65, 352, Gx_line+80, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 131, Gx_line+110, 322, Gx_line+127, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+313) ;
            AV9Observ = (byte)(0) ;
            /* Using cursor P07TH6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A1300AlbRObs = P07TH6_A1300AlbRObs[0] ;
               A1299AlbRLin = P07TH6_A1299AlbRLin[0] ;
               if ( AV9Observ == 0 )
               {
                  h7TH0( false, 16) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observaciones :", ""), 13, Gx_line+0, 110, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 139, Gx_line+0, 578, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
               }
               else
               {
                  h7TH0( false, 16) ;
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
               h7TH0( false, 11) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+11) ;
            }
            AV8vEntre = httpContext.getMessage( "N", "") ;
            /* Using cursor P07TH7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A2157AlbRecMtr = P07TH7_A2157AlbRecMtr[0] ;
               A2155AlbRecKgm = P07TH7_A2155AlbRecKgm[0] ;
               A2159AlbRecPie = P07TH7_A2159AlbRecPie[0] ;
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
                  h7TH0( false, 27) ;
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
                  h7TH0( false, 46) ;
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
               /* Using cursor P07TH8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A2159AlbRecPie = P07TH8_A2159AlbRecPie[0] ;
                  A2158AlbRecMtrU = P07TH8_A2158AlbRecMtrU[0] ;
                  A2157AlbRecMtr = P07TH8_A2157AlbRecMtr[0] ;
                  A2156AlbRecKgmU = P07TH8_A2156AlbRecKgmU[0] ;
                  A2155AlbRecKgm = P07TH8_A2155AlbRecKgm[0] ;
                  A2154AlbRecAnh = P07TH8_A2154AlbRecAnh[0] ;
                  A3731AlbRecIdPz = P07TH8_A3731AlbRecIdPz[0] ;
                  if ( (0==AV10ReferPza) )
                  {
                     h7TH0( false, 16) ;
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
                     h7TH0( false, 17) ;
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
               h7TH0( false, 27) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Tkgse, "ZZZZZZ9.99")), 219, Gx_line+11, 293, Gx_line+28, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Tot_mtse, "ZZZZZZ9.99")), 474, Gx_line+11, 548, Gx_line+28, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+27) ;
            }
            AV119CliCod = A252CliCod ;
            AV120BarSer = A45AlbRef ;
            /* Using cursor P07TH9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV119CliCod), AV120BarSer});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A65ArtCod = P07TH9_A65ArtCod[0] ;
               A252CliCod = P07TH9_A252CliCod[0] ;
               A8065Art_GrmA = P07TH9_A8065Art_GrmA[0] ;
               n8065Art_GrmA = P07TH9_n8065Art_GrmA[0] ;
               A758ProCod = P07TH9_A758ProCod[0] ;
               AV121Procod = A758ProCod ;
               pr_default.readNext(7);
            }
            pr_default.close(7);
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
            h7TH0( false, 64) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Elaborado____________", ""), 23, Gx_line+16, 171, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recibido______________", ""), 419, Gx_line+11, 574, Gx_line+25, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+64) ;
            AV122Fascod = httpContext.getMessage( "ACPR0054", "") ;
            /* Execute user subroutine: 'BARPAR' */
            S121 ();
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
            h7TH0( false, 203) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117vel4, "")), 648, Gx_line+148, 695, Gx_line+165, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Temperatura por Campo", ""), 252, Gx_line+40, 397, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Camp02, "")), 163, Gx_line+79, 210, Gx_line+96, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Camp03, "")), 216, Gx_line+79, 263, Gx_line+96, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Camp05, "")), 323, Gx_line+79, 370, Gx_line+96, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Camp04, "")), 270, Gx_line+79, 317, Gx_line+96, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Camp06, "")), 377, Gx_line+79, 424, Gx_line+96, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114vel1, "")), 648, Gx_line+79, 695, Gx_line+96, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Velocidad", ""), 642, Gx_line+58, 700, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mallas", ""), 721, Gx_line+58, 761, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 576, Gx_line+58, 615, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("1", 128, Gx_line+58, 136, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("2", 181, Gx_line+58, 189, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("3", 234, Gx_line+58, 242, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("4", 289, Gx_line+58, 297, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("5", 342, Gx_line+58, 350, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("6", 396, Gx_line+58, 404, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Tab_mq[1-1], "")), 11, Gx_line+79, 95, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Tab_mq[2-1], "")), 11, Gx_line+102, 95, Gx_line+119, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Tab_mq[3-1], "")), 11, Gx_line+125, 95, Gx_line+142, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Tab_mq[4-1], "")), 11, Gx_line+148, 95, Gx_line+165, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Tab_mq[5-1], "")), 11, Gx_line+171, 95, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV115vel2, "")), 648, Gx_line+102, 695, Gx_line+119, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116vel3, "")), 648, Gx_line+125, 695, Gx_line+142, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118vel5, "")), 648, Gx_line+171, 695, Gx_line+188, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Camp11, "")), 109, Gx_line+102, 156, Gx_line+119, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Camp12, "")), 163, Gx_line+102, 210, Gx_line+119, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Camp13, "")), 216, Gx_line+102, 263, Gx_line+119, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Camp14, "")), 270, Gx_line+102, 317, Gx_line+119, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Camp15, "")), 323, Gx_line+102, 370, Gx_line+119, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Camp16, "")), 377, Gx_line+102, 424, Gx_line+119, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Camp21, "")), 109, Gx_line+125, 156, Gx_line+142, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Camp22, "")), 163, Gx_line+125, 210, Gx_line+142, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Camp23, "")), 216, Gx_line+125, 263, Gx_line+142, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Camp24, "")), 270, Gx_line+125, 317, Gx_line+142, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Camp25, "")), 323, Gx_line+125, 370, Gx_line+142, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Camp26, "")), 377, Gx_line+125, 424, Gx_line+142, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Camp31, "")), 109, Gx_line+148, 156, Gx_line+165, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Camp32, "")), 163, Gx_line+148, 210, Gx_line+165, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Camp33, "")), 216, Gx_line+148, 263, Gx_line+165, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Camp34, "")), 270, Gx_line+148, 317, Gx_line+165, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80Camp35, "")), 323, Gx_line+148, 370, Gx_line+165, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81Camp36, "")), 377, Gx_line+148, 424, Gx_line+165, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84Camp41, "")), 109, Gx_line+171, 156, Gx_line+188, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Camp42, "")), 163, Gx_line+171, 210, Gx_line+188, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86Camp43, "")), 216, Gx_line+171, 263, Gx_line+188, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87Camp44, "")), 270, Gx_line+171, 317, Gx_line+188, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87Camp44, "")), 323, Gx_line+171, 370, Gx_line+188, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Camp47, "")), 438, Gx_line+171, 485, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99AncC1, "")), 573, Gx_line+79, 620, Gx_line+96, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100AncC2, "")), 573, Gx_line+102, 620, Gx_line+119, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101AncC3, "")), 573, Gx_line+125, 620, Gx_line+142, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102AncC4, "")), 573, Gx_line+148, 620, Gx_line+165, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV103AncC5, "")), 573, Gx_line+171, 620, Gx_line+188, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109PesS1, "")), 717, Gx_line+79, 764, Gx_line+96, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110PesS2, "")), 717, Gx_line+102, 764, Gx_line+119, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111PesS3, "")), 717, Gx_line+125, 764, Gx_line+142, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112PesS4, "")), 717, Gx_line+148, 764, Gx_line+165, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113PesS5, "")), 717, Gx_line+171, 764, Gx_line+188, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Camp01, "")), 109, Gx_line+79, 156, Gx_line+96, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(116, Gx_line+47, 180, Gx_line+47, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(470, Gx_line+47, 563, Gx_line+47, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(116, Gx_line+48, 116, Gx_line+78, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(561, Gx_line+47, 561, Gx_line+77, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Prefijado", ""), 358, Gx_line+5, 412, Gx_line+21, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(11, Gx_line+4, 759, Gx_line+23, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Camp07, "")), 438, Gx_line+79, 485, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("7", 456, Gx_line+58, 464, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Camp08, "")), 496, Gx_line+79, 543, Gx_line+96, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Camp17, "")), 438, Gx_line+102, 485, Gx_line+119, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Camp18, "")), 496, Gx_line+102, 543, Gx_line+119, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Camp27, "")), 438, Gx_line+125, 485, Gx_line+142, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Camp28, "")), 496, Gx_line+125, 543, Gx_line+142, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Camp37, "")), 438, Gx_line+148, 485, Gx_line+165, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83Camp38, "")), 496, Gx_line+148, 543, Gx_line+165, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89Camp46, "")), 377, Gx_line+171, 424, Gx_line+188, 1+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91Camp48, "")), 496, Gx_line+171, 543, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("8", 515, Gx_line+58, 523, Gx_line+74, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+203) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7TH0( true, 0) ;
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
      /* Using cursor P07TH10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV21ALbReccod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A5206Nr_albrecc = P07TH10_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P07TH10_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P07TH10_A5198Nr_codigo[0] ;
         A5224Nr_barpara = P07TH10_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P07TH10_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P07TH10_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P07TH10_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P07TH10_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P07TH10_n5222Nr_barcoda[0] ;
         A12235Nr_NAlb = P07TH10_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P07TH10_n12235Nr_NAlb[0] ;
         A5210Nr_barcod = P07TH10_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P07TH10_n5210Nr_barcod[0] ;
         A5216Nr_fecreg = P07TH10_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P07TH10_n5216Nr_fecreg[0] ;
         AV25Barcolnom = " " ;
         AV26Barcolnum = 0 ;
         AV27ALbprocod = 0 ;
         AV28Kgs = DecimalUtil.doubleToDec(0) ;
         AV29Mts = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P07TH11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n5222Nr_barcoda), Integer.valueOf(A5222Nr_barcoda), Boolean.valueOf(n5223Nr_barreoa), Byte.valueOf(A5223Nr_barreoa), Boolean.valueOf(n5224Nr_barpara), A5224Nr_barpara});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A129BarCod = P07TH11_A129BarCod[0] ;
            A132BarCodReo = P07TH11_A132BarCodReo[0] ;
            A130BarCodPar = P07TH11_A130BarCodPar[0] ;
            A135BarColNom = P07TH11_A135BarColNom[0] ;
            A136BarColNum = P07TH11_A136BarColNum[0] ;
            A30AlbProCod = P07TH11_A30AlbProCod[0] ;
            A1261BarAlbKgmE = P07TH11_A1261BarAlbKgmE[0] ;
            A1263BarAlbMtrE = P07TH11_A1263BarAlbMtrE[0] ;
            A135BarColNom = P07TH11_A135BarColNom[0] ;
            A136BarColNum = P07TH11_A136BarColNum[0] ;
            AV25Barcolnom = A135BarColNom ;
            AV26Barcolnum = A136BarColNum ;
            AV27ALbprocod = A30AlbProCod ;
            AV28Kgs = A1261BarAlbKgmE ;
            AV29Mts = A1263BarAlbMtrE ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         AV27ALbprocod = ((AV30Termilenio==1) ? A12235Nr_NAlb : AV27ALbprocod) ;
         h7TH0( false, 148) ;
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
         /* Using cursor P07TH12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A834TipDefDsc = P07TH12_A834TipDefDsc[0] ;
            n834TipDefDsc = P07TH12_n834TipDefDsc[0] ;
            A833TipDefCod = P07TH12_A833TipDefCod[0] ;
            A834TipDefDsc = P07TH12_A834TipDefDsc[0] ;
            n834TipDefDsc = P07TH12_n834TipDefDsc[0] ;
            h7TH0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9")), 81, Gx_line+2, 111, Gx_line+19, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), 131, Gx_line+0, 351, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            pr_default.readNext(10);
         }
         pr_default.close(10);
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'BARPAR' Routine */
      returnInSub = false ;
      AV52Camp01 = "" ;
      AV53Camp02 = "" ;
      AV54Camp03 = "" ;
      AV55Camp04 = "" ;
      AV56Camp05 = "" ;
      AV57Camp06 = "" ;
      AV58Camp07 = "" ;
      AV59Camp08 = "" ;
      AV60Camp11 = "" ;
      AV61Camp12 = "" ;
      AV62Camp13 = "" ;
      AV63Camp14 = "" ;
      AV64Camp15 = "" ;
      AV65Camp16 = "" ;
      AV66Camp17 = "" ;
      AV67Camp18 = "" ;
      AV68Camp21 = "" ;
      AV69Camp22 = "" ;
      AV70Camp23 = "" ;
      AV71Camp24 = "" ;
      AV72Camp25 = "" ;
      AV73Camp26 = "" ;
      AV74Camp27 = "" ;
      AV75Camp28 = "" ;
      AV76Camp31 = "" ;
      AV77Camp32 = "" ;
      AV78Camp33 = "" ;
      AV79Camp34 = "" ;
      AV80Camp35 = "" ;
      AV81Camp36 = "" ;
      AV82Camp37 = "" ;
      AV83Camp38 = "" ;
      AV84Camp41 = "" ;
      AV85Camp42 = "" ;
      AV86Camp43 = "" ;
      AV87Camp44 = "" ;
      AV88Camp45 = "" ;
      AV89Camp46 = "" ;
      AV90Camp47 = "" ;
      AV91Camp48 = "" ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV44Tab_mq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ACRK09", ""), GXv_char2) ;
      rialbretintoriente.this.GXt_char1 = GXv_char2[0] ;
      AV44Tab_mq[1-1] = GXt_char1 ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ACRK10", ""), GXv_char2) ;
      rialbretintoriente.this.GXt_char1 = GXv_char2[0] ;
      AV44Tab_mq[2-1] = GXt_char1 ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ACRK20", ""), GXv_char2) ;
      rialbretintoriente.this.GXt_char1 = GXv_char2[0] ;
      AV44Tab_mq[3-1] = GXt_char1 ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ACRK30", ""), GXv_char2) ;
      rialbretintoriente.this.GXt_char1 = GXv_char2[0] ;
      AV44Tab_mq[4-1] = GXt_char1 ;
      AV44Tab_mq[5-1] = " " ;
      AV44Tab_mq[6-1] = " " ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV31Tab_campo1[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV32Tab_campo2[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV33Tab_campo3[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV34Tab_campo4[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV35Tab_campo5[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV36Tab_campo6[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV37Tab_campo7[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV38Tab_campo8[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV114vel1 = "" ;
      AV115vel2 = "" ;
      AV116vel3 = "" ;
      AV117vel4 = "" ;
      AV118vel5 = "" ;
      AV99AncC1 = "" ;
      AV100AncC2 = "" ;
      AV101AncC3 = "" ;
      AV102AncC4 = "" ;
      AV103AncC5 = "" ;
      AV104AncS1 = "" ;
      AV105AncS2 = "" ;
      AV106AncS3 = "" ;
      AV107AncS4 = "" ;
      AV108AncS5 = "" ;
      AV109PesS1 = "" ;
      AV110PesS2 = "" ;
      AV111PesS3 = "" ;
      AV112PesS4 = "" ;
      AV113PesS5 = "" ;
      AV93Alimsup1 = "" ;
      AV94Alimsup2 = "" ;
      AV95Alimsup3 = "" ;
      AV96Alimsup4 = "" ;
      AV97Alimsup5 = "" ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         GX_J = 1 ;
         while ( GX_J <= 8 )
         {
            AV45Tab_MqCp[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P07TH13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV119CliCod), AV120BarSer, AV121Procod, AV122Fascod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A1664ParFasCod = P07TH13_A1664ParFasCod[0] ;
         A9836FasCodM = P07TH13_A9836FasCodM[0] ;
         A758ProCod = P07TH13_A758ProCod[0] ;
         A65ArtCod = P07TH13_A65ArtCod[0] ;
         A252CliCod = P07TH13_A252CliCod[0] ;
         A9830MaqCodC = P07TH13_A9830MaqCodC[0] ;
         A9828ParFMVal = P07TH13_A9828ParFMVal[0] ;
         A1665ParFasDsc = P07TH13_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P07TH13_n1665ParFasDsc[0] ;
         A1665ParFasDsc = P07TH13_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P07TH13_n1665ParFasDsc[0] ;
         AV123i = (short)(0) ;
         if ( GXutil.strcmp(A9830MaqCodC, httpContext.getMessage( "ACRK09", "")) == 0 )
         {
            AV123i = (short)(1) ;
            AV114vel1 = (GXutil.like(A1665ParFasDsc,GXutil.padr(httpContext.getMessage( "VELOCIDAD%", ""),254, "%"), ' ') ? A9828ParFMVal : AV114vel1) ;
            AV99AncC1 = (GXutil.like(A1665ParFasDsc,GXutil.padr(httpContext.getMessage( "ANCHO%", ""),254, "%"), ' ') ? A9828ParFMVal : AV99AncC1) ;
            AV109PesS1 = (GXutil.like(A1665ParFasDsc,GXutil.padr(httpContext.getMessage( "MALLAS%", ""),254, "%"), ' ') ? A9828ParFMVal : AV109PesS1) ;
         }
         else if ( GXutil.strcmp(A9830MaqCodC, httpContext.getMessage( "ACRK10", "")) == 0 )
         {
            AV123i = (short)(2) ;
            AV115vel2 = (GXutil.like(A1665ParFasDsc,GXutil.padr(httpContext.getMessage( "VELOCIDAD%", ""),254, "%"), ' ') ? A9828ParFMVal : AV115vel2) ;
            AV100AncC2 = (GXutil.like(A1665ParFasDsc,GXutil.padr(httpContext.getMessage( "ANCHO%", ""),254, "%"), ' ') ? A9828ParFMVal : AV100AncC2) ;
            AV110PesS2 = (GXutil.like(A1665ParFasDsc,GXutil.padr(httpContext.getMessage( "MALLAS%", ""),254, "%"), ' ') ? A9828ParFMVal : AV110PesS2) ;
         }
         else if ( GXutil.strcmp(A9830MaqCodC, httpContext.getMessage( "ACRK20", "")) == 0 )
         {
            AV123i = (short)(3) ;
            AV116vel3 = (GXutil.like(A1665ParFasDsc,GXutil.padr(httpContext.getMessage( "VELOCIDAD%", ""),254, "%"), ' ') ? A9828ParFMVal : AV116vel3) ;
            AV101AncC3 = (GXutil.like(A1665ParFasDsc,GXutil.padr(httpContext.getMessage( "ANCHO%", ""),254, "%"), ' ') ? A9828ParFMVal : AV101AncC3) ;
            AV111PesS3 = (GXutil.like(A1665ParFasDsc,GXutil.padr(httpContext.getMessage( "MALLAS%", ""),254, "%"), ' ') ? A9828ParFMVal : AV111PesS3) ;
         }
         else if ( GXutil.strcmp(A9830MaqCodC, httpContext.getMessage( "ACRK30", "")) == 0 )
         {
            AV123i = (short)(4) ;
            AV117vel4 = (GXutil.like(A1665ParFasDsc,GXutil.padr(httpContext.getMessage( "VELOCIDAD%", ""),254, "%"), ' ') ? A9828ParFMVal : AV117vel4) ;
            AV102AncC4 = (GXutil.like(A1665ParFasDsc,GXutil.padr(httpContext.getMessage( "ANCHO%", ""),254, "%"), ' ') ? A9828ParFMVal : AV102AncC4) ;
            AV112PesS4 = (GXutil.like(A1665ParFasDsc,GXutil.padr(httpContext.getMessage( "MALLAS%", ""),254, "%"), ' ') ? A9828ParFMVal : AV112PesS4) ;
         }
         if ( ( AV123i > 0 ) && GXutil.like( A1665ParFasDsc , GXutil.padr( httpContext.getMessage( "TEMPERATURA%", "") , 254 , "%"),  ' ' ) )
         {
            AV31Tab_campo1[AV123i-1] = A9828ParFMVal ;
            AV32Tab_campo2[AV123i-1] = A9828ParFMVal ;
            AV33Tab_campo3[AV123i-1] = A9828ParFMVal ;
            AV34Tab_campo4[AV123i-1] = A9828ParFMVal ;
            AV35Tab_campo5[AV123i-1] = A9828ParFMVal ;
            AV36Tab_campo6[AV123i-1] = A9828ParFMVal ;
            AV37Tab_campo7[AV123i-1] = A9828ParFMVal ;
            AV38Tab_campo8[AV123i-1] = A9828ParFMVal ;
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
      AV52Camp01 = AV31Tab_campo1[1-1] ;
      AV53Camp02 = AV32Tab_campo2[1-1] ;
      AV54Camp03 = AV33Tab_campo3[1-1] ;
      AV55Camp04 = AV34Tab_campo4[1-1] ;
      AV56Camp05 = AV35Tab_campo5[1-1] ;
      AV57Camp06 = AV36Tab_campo6[1-1] ;
      AV58Camp07 = AV37Tab_campo7[1-1] ;
      AV59Camp08 = AV38Tab_campo8[1-1] ;
      AV60Camp11 = AV31Tab_campo1[2-1] ;
      AV61Camp12 = AV32Tab_campo2[2-1] ;
      AV62Camp13 = AV33Tab_campo3[2-1] ;
      AV63Camp14 = AV34Tab_campo4[2-1] ;
      AV64Camp15 = AV35Tab_campo5[2-1] ;
      AV65Camp16 = AV36Tab_campo6[2-1] ;
      AV66Camp17 = AV37Tab_campo7[2-1] ;
      AV67Camp18 = AV38Tab_campo8[2-1] ;
      AV68Camp21 = AV31Tab_campo1[3-1] ;
      AV69Camp22 = AV32Tab_campo2[3-1] ;
      AV70Camp23 = AV33Tab_campo3[3-1] ;
      AV71Camp24 = AV34Tab_campo4[3-1] ;
      AV72Camp25 = AV35Tab_campo5[3-1] ;
      AV73Camp26 = AV36Tab_campo6[3-1] ;
      AV74Camp27 = AV37Tab_campo7[3-1] ;
      AV75Camp28 = AV38Tab_campo8[3-1] ;
      AV76Camp31 = AV31Tab_campo1[4-1] ;
      AV77Camp32 = AV32Tab_campo2[4-1] ;
      AV78Camp33 = AV33Tab_campo3[4-1] ;
      AV79Camp34 = AV34Tab_campo4[4-1] ;
      AV80Camp35 = AV35Tab_campo5[4-1] ;
      AV81Camp36 = AV36Tab_campo6[4-1] ;
      AV82Camp37 = AV37Tab_campo7[4-1] ;
      AV83Camp38 = AV38Tab_campo8[4-1] ;
      AV84Camp41 = AV31Tab_campo1[5-1] ;
      AV85Camp42 = AV32Tab_campo2[5-1] ;
      AV86Camp43 = AV33Tab_campo3[5-1] ;
      AV87Camp44 = AV34Tab_campo4[5-1] ;
      AV88Camp45 = AV35Tab_campo5[5-1] ;
      AV89Camp46 = AV36Tab_campo6[5-1] ;
      AV90Camp47 = AV37Tab_campo7[5-1] ;
      AV91Camp48 = AV38Tab_campo8[5-1] ;
   }

   public void h7TH0( boolean bFoot ,
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
      this.aP0[0] = rialbretintoriente.this.A396EmprCod;
      this.aP1[0] = rialbretintoriente.this.A44AlbRecCod;
      this.aP2[0] = rialbretintoriente.this.Gx_out;
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
      GXv_int4 = new byte[1] ;
      AV13AlbRUniEnt = DecimalUtil.ZERO ;
      AV14AlbRUniUti = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P07TH2_A396EmprCod = new String[] {""} ;
      P07TH2_A44AlbRecCod = new int[1] ;
      P07TH2_A56AlbRUni = new String[] {""} ;
      A56AlbRUni = "" ;
      AV15AlbRUni = "" ;
      c2157AlbRecMtr = DecimalUtil.ZERO ;
      c2158AlbRecMtrU = DecimalUtil.ZERO ;
      P07TH3_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07TH3_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      c2155AlbRecKgm = DecimalUtil.ZERO ;
      c2156AlbRecKgmU = DecimalUtil.ZERO ;
      P07TH4_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07TH4_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07TH5_A396EmprCod = new String[] {""} ;
      P07TH5_A44AlbRecCod = new int[1] ;
      P07TH5_A5806AlbREnt2 = new String[] {""} ;
      P07TH5_A46AlbREnt = new String[] {""} ;
      P07TH5_A3613AlbRefDsc = new String[] {""} ;
      P07TH5_A407EmprNom = new String[] {""} ;
      P07TH5_n407EmprNom = new boolean[] {false} ;
      P07TH5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07TH5_A841TrnNom = new String[] {""} ;
      P07TH5_n841TrnNom = new boolean[] {false} ;
      P07TH5_A56AlbRUni = new String[] {""} ;
      P07TH5_A971ProceNom = new String[] {""} ;
      P07TH5_n971ProceNom = new boolean[] {false} ;
      P07TH5_A279CliNom = new String[] {""} ;
      P07TH5_A52AlbRPieEnt = new int[1] ;
      P07TH5_A840TrnCod = new short[1] ;
      P07TH5_n840TrnCod = new boolean[] {false} ;
      P07TH5_A970ProceCod = new short[1] ;
      P07TH5_n970ProceCod = new boolean[] {false} ;
      P07TH5_A252CliCod = new int[1] ;
      P07TH5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07TH5_A55AlbRReo = new String[] {""} ;
      P07TH5_A54AlbRPieUti = new int[1] ;
      P07TH5_A50AlbRLoc = new String[] {""} ;
      P07TH5_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P07TH5_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P07TH5_A47AlbREst = new byte[1] ;
      P07TH5_A45AlbRef = new String[] {""} ;
      P07TH5_A1291AlbRDes = new String[] {""} ;
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
      P07TH6_A396EmprCod = new String[] {""} ;
      P07TH6_A44AlbRecCod = new int[1] ;
      P07TH6_A1300AlbRObs = new String[] {""} ;
      P07TH6_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      AV8vEntre = "" ;
      P07TH7_A396EmprCod = new String[] {""} ;
      P07TH7_A44AlbRecCod = new int[1] ;
      P07TH7_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07TH7_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07TH7_A2159AlbRecPie = new String[] {""} ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2159AlbRecPie = "" ;
      AV18Tot_mtse = DecimalUtil.ZERO ;
      AV17Tkgse = DecimalUtil.ZERO ;
      P07TH8_A396EmprCod = new String[] {""} ;
      P07TH8_A44AlbRecCod = new int[1] ;
      P07TH8_A2159AlbRecPie = new String[] {""} ;
      P07TH8_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07TH8_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07TH8_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07TH8_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07TH8_A2154AlbRecAnh = new short[1] ;
      P07TH8_A3731AlbRecIdPz = new String[] {""} ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A3731AlbRecIdPz = "" ;
      AV120BarSer = "" ;
      P07TH9_A396EmprCod = new String[] {""} ;
      P07TH9_A65ArtCod = new String[] {""} ;
      P07TH9_A252CliCod = new int[1] ;
      P07TH9_A8065Art_GrmA = new short[1] ;
      P07TH9_n8065Art_GrmA = new boolean[] {false} ;
      P07TH9_A758ProCod = new String[] {""} ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
      AV121Procod = "" ;
      AV122Fascod = "" ;
      AV117vel4 = "" ;
      AV53Camp02 = "" ;
      AV54Camp03 = "" ;
      AV56Camp05 = "" ;
      AV55Camp04 = "" ;
      AV57Camp06 = "" ;
      AV114vel1 = "" ;
      AV44Tab_mq = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV44Tab_mq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV115vel2 = "" ;
      AV116vel3 = "" ;
      AV118vel5 = "" ;
      AV60Camp11 = "" ;
      AV61Camp12 = "" ;
      AV62Camp13 = "" ;
      AV63Camp14 = "" ;
      AV64Camp15 = "" ;
      AV65Camp16 = "" ;
      AV68Camp21 = "" ;
      AV69Camp22 = "" ;
      AV70Camp23 = "" ;
      AV71Camp24 = "" ;
      AV72Camp25 = "" ;
      AV73Camp26 = "" ;
      AV76Camp31 = "" ;
      AV77Camp32 = "" ;
      AV78Camp33 = "" ;
      AV79Camp34 = "" ;
      AV80Camp35 = "" ;
      AV81Camp36 = "" ;
      AV84Camp41 = "" ;
      AV85Camp42 = "" ;
      AV86Camp43 = "" ;
      AV87Camp44 = "" ;
      AV90Camp47 = "" ;
      AV99AncC1 = "" ;
      AV100AncC2 = "" ;
      AV101AncC3 = "" ;
      AV102AncC4 = "" ;
      AV103AncC5 = "" ;
      AV109PesS1 = "" ;
      AV110PesS2 = "" ;
      AV111PesS3 = "" ;
      AV112PesS4 = "" ;
      AV113PesS5 = "" ;
      AV52Camp01 = "" ;
      AV58Camp07 = "" ;
      AV59Camp08 = "" ;
      AV66Camp17 = "" ;
      AV67Camp18 = "" ;
      AV74Camp27 = "" ;
      AV75Camp28 = "" ;
      AV82Camp37 = "" ;
      AV83Camp38 = "" ;
      AV89Camp46 = "" ;
      AV91Camp48 = "" ;
      P07TH10_A396EmprCod = new String[] {""} ;
      P07TH10_A5206Nr_albrecc = new int[1] ;
      P07TH10_n5206Nr_albrecc = new boolean[] {false} ;
      P07TH10_A5198Nr_codigo = new int[1] ;
      P07TH10_A5224Nr_barpara = new String[] {""} ;
      P07TH10_n5224Nr_barpara = new boolean[] {false} ;
      P07TH10_A5223Nr_barreoa = new byte[1] ;
      P07TH10_n5223Nr_barreoa = new boolean[] {false} ;
      P07TH10_A5222Nr_barcoda = new int[1] ;
      P07TH10_n5222Nr_barcoda = new boolean[] {false} ;
      P07TH10_A12235Nr_NAlb = new long[1] ;
      P07TH10_n12235Nr_NAlb = new boolean[] {false} ;
      P07TH10_A5210Nr_barcod = new int[1] ;
      P07TH10_n5210Nr_barcod = new boolean[] {false} ;
      P07TH10_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P07TH10_n5216Nr_fecreg = new boolean[] {false} ;
      A5224Nr_barpara = "" ;
      A5216Nr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      AV25Barcolnom = "" ;
      AV28Kgs = DecimalUtil.ZERO ;
      AV29Mts = DecimalUtil.ZERO ;
      P07TH11_A396EmprCod = new String[] {""} ;
      P07TH11_A129BarCod = new int[1] ;
      P07TH11_A132BarCodReo = new byte[1] ;
      P07TH11_A130BarCodPar = new String[] {""} ;
      P07TH11_A135BarColNom = new String[] {""} ;
      P07TH11_A136BarColNum = new int[1] ;
      P07TH11_A30AlbProCod = new long[1] ;
      P07TH11_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07TH11_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      P07TH12_A396EmprCod = new String[] {""} ;
      P07TH12_A5198Nr_codigo = new int[1] ;
      P07TH12_A834TipDefDsc = new String[] {""} ;
      P07TH12_n834TipDefDsc = new boolean[] {false} ;
      P07TH12_A833TipDefCod = new short[1] ;
      A834TipDefDsc = "" ;
      AV88Camp45 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV31Tab_campo1 = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV31Tab_campo1[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV32Tab_campo2 = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV32Tab_campo2[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV33Tab_campo3 = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV33Tab_campo3[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV34Tab_campo4 = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV34Tab_campo4[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV35Tab_campo5 = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV35Tab_campo5[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV36Tab_campo6 = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV36Tab_campo6[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV37Tab_campo7 = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV37Tab_campo7[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV38Tab_campo8 = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV38Tab_campo8[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV104AncS1 = "" ;
      AV105AncS2 = "" ;
      AV106AncS3 = "" ;
      AV107AncS4 = "" ;
      AV108AncS5 = "" ;
      AV93Alimsup1 = "" ;
      AV94Alimsup2 = "" ;
      AV95Alimsup3 = "" ;
      AV96Alimsup4 = "" ;
      AV97Alimsup5 = "" ;
      AV45Tab_MqCp = new String[5][8] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         GX_J = 1 ;
         while ( GX_J <= 8 )
         {
            AV45Tab_MqCp[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      P07TH13_A1664ParFasCod = new short[1] ;
      P07TH13_A396EmprCod = new String[] {""} ;
      P07TH13_A9836FasCodM = new String[] {""} ;
      P07TH13_A758ProCod = new String[] {""} ;
      P07TH13_A65ArtCod = new String[] {""} ;
      P07TH13_A252CliCod = new int[1] ;
      P07TH13_A9830MaqCodC = new String[] {""} ;
      P07TH13_A9828ParFMVal = new String[] {""} ;
      P07TH13_A1665ParFasDsc = new String[] {""} ;
      P07TH13_n1665ParFasDsc = new boolean[] {false} ;
      A9836FasCodM = "" ;
      A9830MaqCodC = "" ;
      A9828ParFMVal = "" ;
      A1665ParFasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rialbretintoriente__default(),
         new Object[] {
             new Object[] {
            P07TH2_A396EmprCod, P07TH2_A44AlbRecCod, P07TH2_A56AlbRUni
            }
            , new Object[] {
            P07TH3_A2157AlbRecMtr, P07TH3_A2158AlbRecMtrU
            }
            , new Object[] {
            P07TH4_A2155AlbRecKgm, P07TH4_A2156AlbRecKgmU
            }
            , new Object[] {
            P07TH5_A396EmprCod, P07TH5_A44AlbRecCod, P07TH5_A5806AlbREnt2, P07TH5_A46AlbREnt, P07TH5_A3613AlbRefDsc, P07TH5_A407EmprNom, P07TH5_n407EmprNom, P07TH5_A60AlbRUniUti, P07TH5_A841TrnNom, P07TH5_n841TrnNom,
            P07TH5_A56AlbRUni, P07TH5_A971ProceNom, P07TH5_n971ProceNom, P07TH5_A279CliNom, P07TH5_A52AlbRPieEnt, P07TH5_A840TrnCod, P07TH5_n840TrnCod, P07TH5_A970ProceCod, P07TH5_n970ProceCod, P07TH5_A252CliCod,
            P07TH5_A58AlbRUniEnt, P07TH5_A55AlbRReo, P07TH5_A54AlbRPieUti, P07TH5_A50AlbRLoc, P07TH5_A49AlbRFen, P07TH5_A48AlbRFecUlt, P07TH5_A47AlbREst, P07TH5_A45AlbRef, P07TH5_A1291AlbRDes
            }
            , new Object[] {
            P07TH6_A396EmprCod, P07TH6_A44AlbRecCod, P07TH6_A1300AlbRObs, P07TH6_A1299AlbRLin
            }
            , new Object[] {
            P07TH7_A396EmprCod, P07TH7_A44AlbRecCod, P07TH7_A2157AlbRecMtr, P07TH7_A2155AlbRecKgm, P07TH7_A2159AlbRecPie
            }
            , new Object[] {
            P07TH8_A396EmprCod, P07TH8_A44AlbRecCod, P07TH8_A2159AlbRecPie, P07TH8_A2158AlbRecMtrU, P07TH8_A2157AlbRecMtr, P07TH8_A2156AlbRecKgmU, P07TH8_A2155AlbRecKgm, P07TH8_A2154AlbRecAnh, P07TH8_A3731AlbRecIdPz
            }
            , new Object[] {
            P07TH9_A396EmprCod, P07TH9_A65ArtCod, P07TH9_A252CliCod, P07TH9_A8065Art_GrmA, P07TH9_n8065Art_GrmA, P07TH9_A758ProCod
            }
            , new Object[] {
            P07TH10_A396EmprCod, P07TH10_A5206Nr_albrecc, P07TH10_n5206Nr_albrecc, P07TH10_A5198Nr_codigo, P07TH10_A5224Nr_barpara, P07TH10_n5224Nr_barpara, P07TH10_A5223Nr_barreoa, P07TH10_n5223Nr_barreoa, P07TH10_A5222Nr_barcoda, P07TH10_n5222Nr_barcoda,
            P07TH10_A12235Nr_NAlb, P07TH10_n12235Nr_NAlb, P07TH10_A5210Nr_barcod, P07TH10_n5210Nr_barcod, P07TH10_A5216Nr_fecreg, P07TH10_n5216Nr_fecreg
            }
            , new Object[] {
            P07TH11_A396EmprCod, P07TH11_A129BarCod, P07TH11_A132BarCodReo, P07TH11_A130BarCodPar, P07TH11_A135BarColNom, P07TH11_A136BarColNum, P07TH11_A30AlbProCod, P07TH11_A1261BarAlbKgmE, P07TH11_A1263BarAlbMtrE
            }
            , new Object[] {
            P07TH12_A396EmprCod, P07TH12_A5198Nr_codigo, P07TH12_A834TipDefDsc, P07TH12_n834TipDefDsc, P07TH12_A833TipDefCod
            }
            , new Object[] {
            P07TH13_A1664ParFasCod, P07TH13_A396EmprCod, P07TH13_A9836FasCodM, P07TH13_A758ProCod, P07TH13_A65ArtCod, P07TH13_A252CliCod, P07TH13_A9830MaqCodC, P07TH13_A9828ParFMVal, P07TH13_A1665ParFasDsc, P07TH13_n1665ParFasDsc
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
   private short A8065Art_GrmA ;
   private short A833TipDefCod ;
   private short A1664ParFasCod ;
   private short AV123i ;
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
   private int AV119CliCod ;
   private int AV21ALbReccod ;
   private int A5206Nr_albrecc ;
   private int A5198Nr_codigo ;
   private int A5222Nr_barcoda ;
   private int A5210Nr_barcod ;
   private int AV26Barcolnum ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int GX_I ;
   private int GX_J ;
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
   private String AV120BarSer ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String AV121Procod ;
   private String AV122Fascod ;
   private String AV117vel4 ;
   private String AV53Camp02 ;
   private String AV54Camp03 ;
   private String AV56Camp05 ;
   private String AV55Camp04 ;
   private String AV57Camp06 ;
   private String AV114vel1 ;
   private String AV44Tab_mq[] ;
   private String AV115vel2 ;
   private String AV116vel3 ;
   private String AV118vel5 ;
   private String AV60Camp11 ;
   private String AV61Camp12 ;
   private String AV62Camp13 ;
   private String AV63Camp14 ;
   private String AV64Camp15 ;
   private String AV65Camp16 ;
   private String AV68Camp21 ;
   private String AV69Camp22 ;
   private String AV70Camp23 ;
   private String AV71Camp24 ;
   private String AV72Camp25 ;
   private String AV73Camp26 ;
   private String AV76Camp31 ;
   private String AV77Camp32 ;
   private String AV78Camp33 ;
   private String AV79Camp34 ;
   private String AV80Camp35 ;
   private String AV81Camp36 ;
   private String AV84Camp41 ;
   private String AV85Camp42 ;
   private String AV86Camp43 ;
   private String AV87Camp44 ;
   private String AV90Camp47 ;
   private String AV99AncC1 ;
   private String AV100AncC2 ;
   private String AV101AncC3 ;
   private String AV102AncC4 ;
   private String AV103AncC5 ;
   private String AV109PesS1 ;
   private String AV110PesS2 ;
   private String AV111PesS3 ;
   private String AV112PesS4 ;
   private String AV113PesS5 ;
   private String AV52Camp01 ;
   private String AV58Camp07 ;
   private String AV59Camp08 ;
   private String AV66Camp17 ;
   private String AV67Camp18 ;
   private String AV74Camp27 ;
   private String AV75Camp28 ;
   private String AV82Camp37 ;
   private String AV83Camp38 ;
   private String AV89Camp46 ;
   private String AV91Camp48 ;
   private String A5224Nr_barpara ;
   private String AV25Barcolnom ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A834TipDefDsc ;
   private String AV88Camp45 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV31Tab_campo1[] ;
   private String AV32Tab_campo2[] ;
   private String AV33Tab_campo3[] ;
   private String AV34Tab_campo4[] ;
   private String AV35Tab_campo5[] ;
   private String AV36Tab_campo6[] ;
   private String AV37Tab_campo7[] ;
   private String AV38Tab_campo8[] ;
   private String AV104AncS1 ;
   private String AV105AncS2 ;
   private String AV106AncS3 ;
   private String AV107AncS4 ;
   private String AV108AncS5 ;
   private String AV93Alimsup1 ;
   private String AV94Alimsup2 ;
   private String AV95Alimsup3 ;
   private String AV96Alimsup4 ;
   private String AV97Alimsup5 ;
   private String AV45Tab_MqCp[][] ;
   private String A9836FasCodM ;
   private String A9830MaqCodC ;
   private String A9828ParFMVal ;
   private String A1665ParFasDsc ;
   private java.util.Date A5216Nr_fecreg ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n971ProceNom ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n8065Art_GrmA ;
   private boolean returnInSub ;
   private boolean n5206Nr_albrecc ;
   private boolean n5224Nr_barpara ;
   private boolean n5223Nr_barreoa ;
   private boolean n5222Nr_barcoda ;
   private boolean n12235Nr_NAlb ;
   private boolean n5210Nr_barcod ;
   private boolean n5216Nr_fecreg ;
   private boolean n834TipDefDsc ;
   private boolean n1665ParFasDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P07TH2_A396EmprCod ;
   private int[] P07TH2_A44AlbRecCod ;
   private String[] P07TH2_A56AlbRUni ;
   private java.math.BigDecimal[] P07TH3_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P07TH3_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] P07TH4_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P07TH4_A2156AlbRecKgmU ;
   private String[] P07TH5_A396EmprCod ;
   private int[] P07TH5_A44AlbRecCod ;
   private String[] P07TH5_A5806AlbREnt2 ;
   private String[] P07TH5_A46AlbREnt ;
   private String[] P07TH5_A3613AlbRefDsc ;
   private String[] P07TH5_A407EmprNom ;
   private boolean[] P07TH5_n407EmprNom ;
   private java.math.BigDecimal[] P07TH5_A60AlbRUniUti ;
   private String[] P07TH5_A841TrnNom ;
   private boolean[] P07TH5_n841TrnNom ;
   private String[] P07TH5_A56AlbRUni ;
   private String[] P07TH5_A971ProceNom ;
   private boolean[] P07TH5_n971ProceNom ;
   private String[] P07TH5_A279CliNom ;
   private int[] P07TH5_A52AlbRPieEnt ;
   private short[] P07TH5_A840TrnCod ;
   private boolean[] P07TH5_n840TrnCod ;
   private short[] P07TH5_A970ProceCod ;
   private boolean[] P07TH5_n970ProceCod ;
   private int[] P07TH5_A252CliCod ;
   private java.math.BigDecimal[] P07TH5_A58AlbRUniEnt ;
   private String[] P07TH5_A55AlbRReo ;
   private int[] P07TH5_A54AlbRPieUti ;
   private String[] P07TH5_A50AlbRLoc ;
   private java.util.Date[] P07TH5_A49AlbRFen ;
   private java.util.Date[] P07TH5_A48AlbRFecUlt ;
   private byte[] P07TH5_A47AlbREst ;
   private String[] P07TH5_A45AlbRef ;
   private String[] P07TH5_A1291AlbRDes ;
   private String[] P07TH6_A396EmprCod ;
   private int[] P07TH6_A44AlbRecCod ;
   private String[] P07TH6_A1300AlbRObs ;
   private byte[] P07TH6_A1299AlbRLin ;
   private String[] P07TH7_A396EmprCod ;
   private int[] P07TH7_A44AlbRecCod ;
   private java.math.BigDecimal[] P07TH7_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P07TH7_A2155AlbRecKgm ;
   private String[] P07TH7_A2159AlbRecPie ;
   private String[] P07TH8_A396EmprCod ;
   private int[] P07TH8_A44AlbRecCod ;
   private String[] P07TH8_A2159AlbRecPie ;
   private java.math.BigDecimal[] P07TH8_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] P07TH8_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P07TH8_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] P07TH8_A2155AlbRecKgm ;
   private short[] P07TH8_A2154AlbRecAnh ;
   private String[] P07TH8_A3731AlbRecIdPz ;
   private String[] P07TH9_A396EmprCod ;
   private String[] P07TH9_A65ArtCod ;
   private int[] P07TH9_A252CliCod ;
   private short[] P07TH9_A8065Art_GrmA ;
   private boolean[] P07TH9_n8065Art_GrmA ;
   private String[] P07TH9_A758ProCod ;
   private String[] P07TH10_A396EmprCod ;
   private int[] P07TH10_A5206Nr_albrecc ;
   private boolean[] P07TH10_n5206Nr_albrecc ;
   private int[] P07TH10_A5198Nr_codigo ;
   private String[] P07TH10_A5224Nr_barpara ;
   private boolean[] P07TH10_n5224Nr_barpara ;
   private byte[] P07TH10_A5223Nr_barreoa ;
   private boolean[] P07TH10_n5223Nr_barreoa ;
   private int[] P07TH10_A5222Nr_barcoda ;
   private boolean[] P07TH10_n5222Nr_barcoda ;
   private long[] P07TH10_A12235Nr_NAlb ;
   private boolean[] P07TH10_n12235Nr_NAlb ;
   private int[] P07TH10_A5210Nr_barcod ;
   private boolean[] P07TH10_n5210Nr_barcod ;
   private java.util.Date[] P07TH10_A5216Nr_fecreg ;
   private boolean[] P07TH10_n5216Nr_fecreg ;
   private String[] P07TH11_A396EmprCod ;
   private int[] P07TH11_A129BarCod ;
   private byte[] P07TH11_A132BarCodReo ;
   private String[] P07TH11_A130BarCodPar ;
   private String[] P07TH11_A135BarColNom ;
   private int[] P07TH11_A136BarColNum ;
   private long[] P07TH11_A30AlbProCod ;
   private java.math.BigDecimal[] P07TH11_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P07TH11_A1263BarAlbMtrE ;
   private String[] P07TH12_A396EmprCod ;
   private int[] P07TH12_A5198Nr_codigo ;
   private String[] P07TH12_A834TipDefDsc ;
   private boolean[] P07TH12_n834TipDefDsc ;
   private short[] P07TH12_A833TipDefCod ;
   private short[] P07TH13_A1664ParFasCod ;
   private String[] P07TH13_A396EmprCod ;
   private String[] P07TH13_A9836FasCodM ;
   private String[] P07TH13_A758ProCod ;
   private String[] P07TH13_A65ArtCod ;
   private int[] P07TH13_A252CliCod ;
   private String[] P07TH13_A9830MaqCodC ;
   private String[] P07TH13_A9828ParFMVal ;
   private String[] P07TH13_A1665ParFasDsc ;
   private boolean[] P07TH13_n1665ParFasDsc ;
}

final  class rialbretintoriente__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07TH2", "SELECT EmprCod, AlbRecCod, AlbRUni FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07TH3", "SELECT SUM(AlbRecMtr), SUM(AlbRecMtrU) FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07TH4", "SELECT SUM(AlbRecKgm), SUM(AlbRecKgmU) FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07TH5", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbREnt2, T1.AlbREnt, T1.AlbRefDsc, T2.EmprNom, T1.AlbRUniUti, T4.TrnNom, T1.AlbRUni, T5.ProceNom, T3.CliNom, T1.AlbRPieEnt, T1.TrnCod, T1.ProceCod, T1.CliCod, T1.AlbRUniEnt, T1.AlbRReo, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRFen, T1.AlbRFecUlt, T1.AlbREst, T1.AlbRef, T1.AlbRDes FROM ((((TXPALBREC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod AND T5.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07TH6", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07TH7", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecMtr, AlbRecKgm, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07TH8", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlbRecMtrU, AlbRecMtr, AlbRecKgmU, AlbRecKgm, AlbRecAnh, AlbRecIdPz FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07TH9", "SELECT EmprCod, ArtCod, CliCod, Art_GrmA, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07TH10", "SELECT EmprCod, Nr_albrecc, Nr_codigo, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_NAlb, Nr_barcod, Nr_fecreg FROM TXPNOTREC WHERE EmprCod = ? and Nr_albrecc = ? ORDER BY EmprCod, Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07TH11", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarColNom, T2.BarColNum, T1.AlbProCod, T1.BarAlbKgmE, T1.BarAlbMtrE FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07TH12", "SELECT T1.EmprCod, T1.Nr_codigo, T2.TipDefDsc, T1.TipDefCod FROM (TXPNOTRE1 T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.Nr_codigo = ? ORDER BY T1.EmprCod, T1.Nr_codigo, T1.TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07TH13", "SELECT T1.ParFasCod, T1.EmprCod, T1.FasCodM, T1.ProCod, T1.ArtCod, T1.CliCod, T1.MaqCodC, T1.ParFMVal, T2.ParFasDsc FROM (TXPCAPFM2 T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.ParFasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? and T1.FasCodM = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCodM ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               return;
            case 8 :
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
            case 9 :
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
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
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
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

