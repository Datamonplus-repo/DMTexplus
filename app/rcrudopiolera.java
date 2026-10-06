package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rcrudopiolera extends GXReport
{
   public rcrudopiolera( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rcrudopiolera.class ), "" );
   }

   public rcrudopiolera( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      rcrudopiolera.this.aP2 = new String[] {""};
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
      rcrudopiolera.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rcrudopiolera.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      rcrudopiolera.this.Gx_out = aP2[0];
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
         getPrinter().GxSetDocName("CRUDOPiolera") ;
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
         rcrudopiolera.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit12 = GXt_char1 ;
         GXt_char1 = AV23Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rcrudopiolera.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit15 = GXt_char1 ;
         AV23Lit15 = GXutil.trim( AV23Lit15) + httpContext.getMessage( "-Hora", "") ;
         GXt_char1 = AV24Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1229_", ""), (byte)(99), GXv_char2) ;
         rcrudopiolera.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit17 = GXt_char1 ;
         AV24Lit17 = httpContext.getMessage( "Nº ", "") + GXutil.trim( AV24Lit17) ;
         GXt_int3 = AV10ReferPza ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PZAREF", ""), GXv_int4) ;
         rcrudopiolera.this.GXt_int3 = GXv_int4[0] ;
         AV10ReferPza = GXt_int3 ;
         AV12Refer = httpContext.getMessage( "Referencia", "") ;
         GXt_char1 = AV20Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN435_", ""), (byte)(99), GXv_char2) ;
         rcrudopiolera.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit1 = GXt_char1 ;
         GXt_char1 = AV31FecPiolera ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char5[0] = httpContext.getMessage( "PIOLER", "") ;
         GXv_char6[0] = GXt_char1 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char5, GXv_char6) ;
         rcrudopiolera.this.A396EmprCod = GXv_char2[0] ;
         rcrudopiolera.this.GXt_char1 = GXv_char6[0] ;
         AV31FecPiolera = GXt_char1 ;
         AV13AlbRUniEnt = DecimalUtil.doubleToDec(0) ;
         AV14AlbRUniUti = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P07T22 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A56AlbRUni = P07T22_A56AlbRUni[0] ;
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               AV15AlbRUni = httpContext.getMessage( "M", "") ;
               /* Optimized group. */
               /* Using cursor P07T23 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               c2157AlbRecMtr = P07T23_A2157AlbRecMtr[0] ;
               c2158AlbRecMtrU = P07T23_A2158AlbRecMtrU[0] ;
               pr_default.close(1);
               AV13AlbRUniEnt = AV13AlbRUniEnt.add(c2157AlbRecMtr) ;
               AV14AlbRUniUti = AV14AlbRUniUti.add(c2158AlbRecMtrU) ;
               /* End optimized group. */
            }
            else
            {
               AV15AlbRUni = httpContext.getMessage( "K", "") ;
               /* Optimized group. */
               /* Using cursor P07T24 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               c2155AlbRecKgm = P07T24_A2155AlbRecKgm[0] ;
               c2156AlbRecKgmU = P07T24_A2156AlbRecKgmU[0] ;
               pr_default.close(2);
               AV13AlbRUniEnt = AV13AlbRUniEnt.add(c2155AlbRecKgm) ;
               AV14AlbRUniUti = AV14AlbRUniUti.add(c2156AlbRecKgmU) ;
               /* End optimized group. */
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07T25 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A5806AlbREnt2 = P07T25_A5806AlbREnt2[0] ;
            A46AlbREnt = P07T25_A46AlbREnt[0] ;
            A3613AlbRefDsc = P07T25_A3613AlbRefDsc[0] ;
            A60AlbRUniUti = P07T25_A60AlbRUniUti[0] ;
            A841TrnNom = P07T25_A841TrnNom[0] ;
            n841TrnNom = P07T25_n841TrnNom[0] ;
            A56AlbRUni = P07T25_A56AlbRUni[0] ;
            A971ProceNom = P07T25_A971ProceNom[0] ;
            n971ProceNom = P07T25_n971ProceNom[0] ;
            A279CliNom = P07T25_A279CliNom[0] ;
            A52AlbRPieEnt = P07T25_A52AlbRPieEnt[0] ;
            A840TrnCod = P07T25_A840TrnCod[0] ;
            n840TrnCod = P07T25_n840TrnCod[0] ;
            A970ProceCod = P07T25_A970ProceCod[0] ;
            n970ProceCod = P07T25_n970ProceCod[0] ;
            A252CliCod = P07T25_A252CliCod[0] ;
            A58AlbRUniEnt = P07T25_A58AlbRUniEnt[0] ;
            A55AlbRReo = P07T25_A55AlbRReo[0] ;
            A54AlbRPieUti = P07T25_A54AlbRPieUti[0] ;
            A50AlbRLoc = P07T25_A50AlbRLoc[0] ;
            A49AlbRFen = P07T25_A49AlbRFen[0] ;
            A48AlbRFecUlt = P07T25_A48AlbRFecUlt[0] ;
            A47AlbREst = P07T25_A47AlbREst[0] ;
            A45AlbRef = P07T25_A45AlbRef[0] ;
            A1291AlbRDes = P07T25_A1291AlbRDes[0] ;
            A279CliNom = P07T25_A279CliNom[0] ;
            A841TrnNom = P07T25_A841TrnNom[0] ;
            n841TrnNom = P07T25_n841TrnNom[0] ;
            A971ProceNom = P07T25_A971ProceNom[0] ;
            n971ProceNom = P07T25_n971ProceNom[0] ;
            AV19AlbREnt2 = A5806AlbREnt2 ;
            if ( GXutil.strcmp(A5806AlbREnt2, " ") == 0 )
            {
               AV19AlbREnt2 = A46AlbREnt ;
            }
            h7T20( false, 141) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "d8cbdd29-f1e4-48b9-806a-d2305f7dbc67", "", context.getHttpContext().getTheme( )), 57, Gx_line+30, 259, Gx_line+118) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Sistema de Gestión de la Calidad SCG 9001:2015", ""), 270, Gx_line+32, 656, Gx_line+52, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "REG TIN 001", ""), 413, Gx_line+59, 514, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ENTRADA DE CRUDO", ""), 374, Gx_line+85, 551, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(51, Gx_line+19, 783, Gx_line+128, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(660, Gx_line+19, 660, Gx_line+128, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Version V1", ""), 691, Gx_line+66, 762, Gx_line+83, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(265, Gx_line+19, 265, Gx_line+128, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31FecPiolera, "")), 695, Gx_line+88, 759, Gx_line+106, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+141) ;
            h7T20( false, 313) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), 386, Gx_line+173, 533, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 182, Gx_line+64, 241, Gx_line+81, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 182, Gx_line+95, 300, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19AlbREnt2, "")), 131, Gx_line+16, 361, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A47AlbREst), "9")), 534, Gx_line+250, 542, Gx_line+267, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A48AlbRFecUlt, "99/99/99"), 440, Gx_line+266, 499, Gx_line+283, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 440, Gx_line+250, 499, Gx_line+267, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 182, Gx_line+173, 256, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")), 370, Gx_line+266, 415, Gx_line+283, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A55AlbRReo, "@!")), 634, Gx_line+173, 650, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 255, Gx_line+250, 322, Gx_line+267, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 386, Gx_line+95, 431, Gx_line+112, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9")), 182, Gx_line+146, 212, Gx_line+163, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), 182, Gx_line+126, 212, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Destino :", ""), 314, Gx_line+174, 368, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.Recepcion   :", ""), 66, Gx_line+65, 161, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Referencia    :", ""), 66, Gx_line+96, 152, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 520, Gx_line+219, 562, Gx_line+233, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha  :", ""), 569, Gx_line+65, 619, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Localización  :", ""), 66, Gx_line+174, 153, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PIEZAS", ""), 367, Gx_line+219, 414, Gx_line+233, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 370, Gx_line+250, 415, Gx_line+267, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Reoperado :", ""), 547, Gx_line+174, 621, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transportista :", ""), 66, Gx_line+127, 152, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente :", ""), 314, Gx_line+96, 364, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Procedencia   :", ""), 66, Gx_line+147, 158, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Entrado   :", ""), 153, Gx_line+252, 217, Gx_line+266, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 452, Gx_line+95, 672, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 634, Gx_line+16, 693, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 634, Gx_line+0, 693, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha : ", ""), 569, Gx_line+0, 619, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora  :", ""), 569, Gx_line+16, 611, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A971ProceNom, "")), 233, Gx_line+146, 453, Gx_line+163, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Utilizado :", ""), 153, Gx_line+268, 213, Gx_line+282, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CANTIDAD", ""), 254, Gx_line+219, 321, Gx_line+233, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A56AlbRUni, "@!")), 335, Gx_line+250, 343, Gx_line+267, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 233, Gx_line+126, 453, Gx_line+143, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")), 255, Gx_line+266, 322, Gx_line+283, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA", ""), 440, Gx_line+219, 483, Gx_line+233, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 642, Gx_line+64, 701, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(255, Gx_line+238, 321, Gx_line+238, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(440, Gx_line+238, 498, Gx_line+238, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(367, Gx_line+238, 414, Gx_line+238, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(520, Gx_line+238, 566, Gx_line+238, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(66, Gx_line+202, 718, Gx_line+300, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 182, Gx_line+110, 373, Gx_line+127, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LOTE:", ""), 66, Gx_line+16, 130, Gx_line+39, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+313) ;
            AV9Observ = (byte)(0) ;
            /* Using cursor P07T26 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A1300AlbRObs = P07T26_A1300AlbRObs[0] ;
               A1299AlbRLin = P07T26_A1299AlbRLin[0] ;
               if ( AV9Observ == 0 )
               {
                  h7T20( false, 16) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observaciones :", ""), 64, Gx_line+0, 161, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 190, Gx_line+0, 629, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
               }
               else
               {
                  h7T20( false, 16) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 190, Gx_line+0, 629, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
               }
               AV9Observ = (byte)(1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            if ( AV9Observ == 1 )
            {
               h7T20( false, 11) ;
               getPrinter().GxDrawLine(64, Gx_line+7, 718, Gx_line+7, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+11) ;
            }
            AV8vEntre = httpContext.getMessage( "N", "") ;
            /* Using cursor P07T27 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A2157AlbRecMtr = P07T27_A2157AlbRecMtr[0] ;
               A2155AlbRecKgm = P07T27_A2155AlbRecKgm[0] ;
               A2159AlbRecPie = P07T27_A2159AlbRecPie[0] ;
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
                  h7T20( false, 35) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "PIEZA", ""), 73, Gx_line+13, 112, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 160, Gx_line+0, 199, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 284, Gx_line+13, 337, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Utilizados", ""), 372, Gx_line+13, 430, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "KILOS:", ""), 226, Gx_line+13, 269, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "METROS:", ""), 474, Gx_line+13, 533, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 540, Gx_line+13, 593, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Utilizados", ""), 620, Gx_line+13, 678, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(63, Gx_line+31, 717, Gx_line+31, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "(cms)", ""), 164, Gx_line+13, 196, Gx_line+27, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+35) ;
               }
               else
               {
                  h7T20( false, 46) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "PIEZA", ""), 72, Gx_line+23, 111, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Ancho", ""), 159, Gx_line+15, 198, Gx_line+29, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 230, Gx_line+23, 283, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Utilizados", ""), 311, Gx_line+23, 369, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "K I L OS ", ""), 274, Gx_line+0, 329, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "M E T R O S", ""), 424, Gx_line+0, 500, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 398, Gx_line+23, 451, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Utilizados", ""), 477, Gx_line+23, 535, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(63, Gx_line+43, 717, Gx_line+43, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(389, Gx_line+14, 536, Gx_line+14, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(223, Gx_line+14, 370, Gx_line+14, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Refer, "")), 560, Gx_line+23, 636, Gx_line+38, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "cms", ""), 165, Gx_line+23, 189, Gx_line+37, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+46) ;
               }
               AV18Tot_mtse = DecimalUtil.doubleToDec(0) ;
               AV17Tkgse = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P07T28 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A2159AlbRecPie = P07T28_A2159AlbRecPie[0] ;
                  A2158AlbRecMtrU = P07T28_A2158AlbRecMtrU[0] ;
                  A2157AlbRecMtr = P07T28_A2157AlbRecMtr[0] ;
                  A2156AlbRecKgmU = P07T28_A2156AlbRecKgmU[0] ;
                  A2155AlbRecKgm = P07T28_A2155AlbRecKgm[0] ;
                  A2154AlbRecAnh = P07T28_A2154AlbRecAnh[0] ;
                  A3731AlbRecIdPz = P07T28_A3731AlbRecIdPz[0] ;
                  if ( (0==AV10ReferPza) )
                  {
                     h7T20( false, 16) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2154AlbRecAnh), "ZZ9")), 168, Gx_line+0, 191, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99")), 277, Gx_line+0, 344, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99")), 379, Gx_line+0, 446, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99")), 532, Gx_line+0, 599, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99")), 627, Gx_line+0, 694, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2159AlbRecPie, "")), 73, Gx_line+0, 140, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+16) ;
                  }
                  else
                  {
                     h7T20( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2154AlbRecAnh), "ZZ9")), 168, Gx_line+0, 191, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99")), 218, Gx_line+0, 285, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99")), 304, Gx_line+0, 371, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99")), 385, Gx_line+0, 452, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99")), 470, Gx_line+0, 537, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2159AlbRecPie, "")), 72, Gx_line+0, 139, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3731AlbRecIdPz, "")), 563, Gx_line+1, 673, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  AV17Tkgse = AV17Tkgse.add(A2155AlbRecKgm) ;
                  AV18Tot_mtse = AV18Tot_mtse.add(A2157AlbRecMtr) ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               h7T20( false, 27) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Tkgse, "ZZZZZZ9.99")), 270, Gx_line+11, 344, Gx_line+28, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Tot_mtse, "ZZZZZZ9.99")), 525, Gx_line+11, 599, Gx_line+28, 2+256, 0, 0, 0) ;
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
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            h7T20( false, 34) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Elaborado____________", ""), 74, Gx_line+16, 222, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Recibido______________", ""), 470, Gx_line+11, 625, Gx_line+25, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+34) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7T20( true, 0) ;
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
      /* Using cursor P07T29 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV21ALbReccod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A5206Nr_albrecc = P07T29_A5206Nr_albrecc[0] ;
         n5206Nr_albrecc = P07T29_n5206Nr_albrecc[0] ;
         A5198Nr_codigo = P07T29_A5198Nr_codigo[0] ;
         A5224Nr_barpara = P07T29_A5224Nr_barpara[0] ;
         n5224Nr_barpara = P07T29_n5224Nr_barpara[0] ;
         A5223Nr_barreoa = P07T29_A5223Nr_barreoa[0] ;
         n5223Nr_barreoa = P07T29_n5223Nr_barreoa[0] ;
         A5222Nr_barcoda = P07T29_A5222Nr_barcoda[0] ;
         n5222Nr_barcoda = P07T29_n5222Nr_barcoda[0] ;
         A12235Nr_NAlb = P07T29_A12235Nr_NAlb[0] ;
         n12235Nr_NAlb = P07T29_n12235Nr_NAlb[0] ;
         A5210Nr_barcod = P07T29_A5210Nr_barcod[0] ;
         n5210Nr_barcod = P07T29_n5210Nr_barcod[0] ;
         A5216Nr_fecreg = P07T29_A5216Nr_fecreg[0] ;
         n5216Nr_fecreg = P07T29_n5216Nr_fecreg[0] ;
         AV25Barcolnom = " " ;
         AV26Barcolnum = 0 ;
         AV27ALbprocod = 0 ;
         AV28Kgs = DecimalUtil.doubleToDec(0) ;
         AV29Mts = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P07T210 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n5222Nr_barcoda), Integer.valueOf(A5222Nr_barcoda), Boolean.valueOf(n5223Nr_barreoa), Byte.valueOf(A5223Nr_barreoa), Boolean.valueOf(n5224Nr_barpara), A5224Nr_barpara});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A129BarCod = P07T210_A129BarCod[0] ;
            A132BarCodReo = P07T210_A132BarCodReo[0] ;
            A130BarCodPar = P07T210_A130BarCodPar[0] ;
            A135BarColNom = P07T210_A135BarColNom[0] ;
            A136BarColNum = P07T210_A136BarColNum[0] ;
            A30AlbProCod = P07T210_A30AlbProCod[0] ;
            A1261BarAlbKgmE = P07T210_A1261BarAlbKgmE[0] ;
            A1263BarAlbMtrE = P07T210_A1263BarAlbMtrE[0] ;
            A135BarColNom = P07T210_A135BarColNom[0] ;
            A136BarColNum = P07T210_A136BarColNum[0] ;
            AV25Barcolnom = A135BarColNom ;
            AV26Barcolnum = A136BarColNum ;
            AV27ALbprocod = A30AlbProCod ;
            AV28Kgs = A1261BarAlbKgmE ;
            AV29Mts = A1263BarAlbMtrE ;
            pr_default.readNext(8);
         }
         pr_default.close(8);
         AV27ALbprocod = ((AV30Termilenio==1) ? A12235Nr_NAlb : AV27ALbprocod) ;
         h7T20( false, 148) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( A5216Nr_fecreg, "99/99/99 99:99:99"), 215, Gx_line+48, 340, Gx_line+65, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5222Nr_barcoda), "ZZZZZZZ9")), 214, Gx_line+16, 273, Gx_line+33, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5224Nr_barpara, "")), 294, Gx_line+16, 302, Gx_line+33, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5223Nr_barreoa), "9")), 279, Gx_line+16, 287, Gx_line+33, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit12, "")), 82, Gx_line+16, 208, Gx_line+33, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit15, "")), 83, Gx_line+49, 209, Gx_line+66, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit17, "")), 83, Gx_line+66, 209, Gx_line+83, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5210Nr_barcod), "ZZZZZZZ9")), 215, Gx_line+65, 274, Gx_line+82, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5223Nr_barreoa), "9")), 280, Gx_line+65, 288, Gx_line+82, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5224Nr_barpara, "")), 295, Gx_line+65, 303, Gx_line+82, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo", ""), 131, Gx_line+125, 173, Gx_line+139, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 181, Gx_line+125, 252, Gx_line+139, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(131, Gx_line+142, 173, Gx_line+142, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(181, Gx_line+142, 400, Gx_line+142, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(66, Gx_line+4, 718, Gx_line+126, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Reclamacion:", ""), 547, Gx_line+16, 642, Gx_line+30, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5198Nr_codigo), "ZZZZZZZ9")), 653, Gx_line+15, 712, Gx_line+32, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Remito:", ""), 546, Gx_line+47, 605, Gx_line+61, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27ALbprocod), "ZZZZZZZZZ9")), 611, Gx_line+47, 685, Gx_line+64, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawRect(534, Gx_line+31, 717, Gx_line+126, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28Kgs, "ZZZZZ9.99")), 619, Gx_line+75, 686, Gx_line+92, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29Mts, "ZZZZZ9.99")), 619, Gx_line+91, 686, Gx_line+108, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kilos:", ""), 572, Gx_line+75, 605, Gx_line+89, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Metros:", ""), 560, Gx_line+91, 605, Gx_line+105, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Barcolnom, "")), 216, Gx_line+31, 312, Gx_line+48, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26Barcolnum), "ZZZZZ9")), 316, Gx_line+31, 361, Gx_line+48, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color:", ""), 83, Gx_line+32, 118, Gx_line+46, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+148) ;
         /* Using cursor P07T211 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A5198Nr_codigo)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A834TipDefDsc = P07T211_A834TipDefDsc[0] ;
            n834TipDefDsc = P07T211_n834TipDefDsc[0] ;
            A833TipDefCod = P07T211_A833TipDefCod[0] ;
            A834TipDefDsc = P07T211_A834TipDefDsc[0] ;
            n834TipDefDsc = P07T211_n834TipDefDsc[0] ;
            h7T20( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9")), 132, Gx_line+2, 162, Gx_line+19, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A834TipDefDsc, "")), 182, Gx_line+0, 402, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void h7T20( boolean bFoot ,
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
      this.aP0[0] = rcrudopiolera.this.A396EmprCod;
      this.aP1[0] = rcrudopiolera.this.A44AlbRecCod;
      this.aP2[0] = rcrudopiolera.this.Gx_out;
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
      GXv_int4 = new byte[1] ;
      AV12Refer = "" ;
      AV20Lit1 = "" ;
      AV31FecPiolera = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      AV13AlbRUniEnt = DecimalUtil.ZERO ;
      AV14AlbRUniUti = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P07T22_A396EmprCod = new String[] {""} ;
      P07T22_A44AlbRecCod = new int[1] ;
      P07T22_A56AlbRUni = new String[] {""} ;
      A56AlbRUni = "" ;
      AV15AlbRUni = "" ;
      c2157AlbRecMtr = DecimalUtil.ZERO ;
      c2158AlbRecMtrU = DecimalUtil.ZERO ;
      P07T23_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07T23_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      c2155AlbRecKgm = DecimalUtil.ZERO ;
      c2156AlbRecKgmU = DecimalUtil.ZERO ;
      P07T24_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07T24_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07T25_A396EmprCod = new String[] {""} ;
      P07T25_A44AlbRecCod = new int[1] ;
      P07T25_A5806AlbREnt2 = new String[] {""} ;
      P07T25_A46AlbREnt = new String[] {""} ;
      P07T25_A3613AlbRefDsc = new String[] {""} ;
      P07T25_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07T25_A841TrnNom = new String[] {""} ;
      P07T25_n841TrnNom = new boolean[] {false} ;
      P07T25_A56AlbRUni = new String[] {""} ;
      P07T25_A971ProceNom = new String[] {""} ;
      P07T25_n971ProceNom = new boolean[] {false} ;
      P07T25_A279CliNom = new String[] {""} ;
      P07T25_A52AlbRPieEnt = new int[1] ;
      P07T25_A840TrnCod = new short[1] ;
      P07T25_n840TrnCod = new boolean[] {false} ;
      P07T25_A970ProceCod = new short[1] ;
      P07T25_n970ProceCod = new boolean[] {false} ;
      P07T25_A252CliCod = new int[1] ;
      P07T25_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07T25_A55AlbRReo = new String[] {""} ;
      P07T25_A54AlbRPieUti = new int[1] ;
      P07T25_A50AlbRLoc = new String[] {""} ;
      P07T25_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P07T25_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P07T25_A47AlbREst = new byte[1] ;
      P07T25_A45AlbRef = new String[] {""} ;
      P07T25_A1291AlbRDes = new String[] {""} ;
      A5806AlbREnt2 = "" ;
      A46AlbREnt = "" ;
      A3613AlbRefDsc = "" ;
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
      P07T26_A396EmprCod = new String[] {""} ;
      P07T26_A44AlbRecCod = new int[1] ;
      P07T26_A1300AlbRObs = new String[] {""} ;
      P07T26_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      AV8vEntre = "" ;
      P07T27_A396EmprCod = new String[] {""} ;
      P07T27_A44AlbRecCod = new int[1] ;
      P07T27_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07T27_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07T27_A2159AlbRecPie = new String[] {""} ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2159AlbRecPie = "" ;
      AV18Tot_mtse = DecimalUtil.ZERO ;
      AV17Tkgse = DecimalUtil.ZERO ;
      P07T28_A396EmprCod = new String[] {""} ;
      P07T28_A44AlbRecCod = new int[1] ;
      P07T28_A2159AlbRecPie = new String[] {""} ;
      P07T28_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07T28_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07T28_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07T28_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07T28_A2154AlbRecAnh = new short[1] ;
      P07T28_A3731AlbRecIdPz = new String[] {""} ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A3731AlbRecIdPz = "" ;
      P07T29_A396EmprCod = new String[] {""} ;
      P07T29_A5206Nr_albrecc = new int[1] ;
      P07T29_n5206Nr_albrecc = new boolean[] {false} ;
      P07T29_A5198Nr_codigo = new int[1] ;
      P07T29_A5224Nr_barpara = new String[] {""} ;
      P07T29_n5224Nr_barpara = new boolean[] {false} ;
      P07T29_A5223Nr_barreoa = new byte[1] ;
      P07T29_n5223Nr_barreoa = new boolean[] {false} ;
      P07T29_A5222Nr_barcoda = new int[1] ;
      P07T29_n5222Nr_barcoda = new boolean[] {false} ;
      P07T29_A12235Nr_NAlb = new long[1] ;
      P07T29_n12235Nr_NAlb = new boolean[] {false} ;
      P07T29_A5210Nr_barcod = new int[1] ;
      P07T29_n5210Nr_barcod = new boolean[] {false} ;
      P07T29_A5216Nr_fecreg = new java.util.Date[] {GXutil.nullDate()} ;
      P07T29_n5216Nr_fecreg = new boolean[] {false} ;
      A5224Nr_barpara = "" ;
      A5216Nr_fecreg = GXutil.resetTime( GXutil.nullDate() );
      AV25Barcolnom = "" ;
      AV28Kgs = DecimalUtil.ZERO ;
      AV29Mts = DecimalUtil.ZERO ;
      P07T210_A396EmprCod = new String[] {""} ;
      P07T210_A129BarCod = new int[1] ;
      P07T210_A132BarCodReo = new byte[1] ;
      P07T210_A130BarCodPar = new String[] {""} ;
      P07T210_A135BarColNom = new String[] {""} ;
      P07T210_A136BarColNum = new int[1] ;
      P07T210_A30AlbProCod = new long[1] ;
      P07T210_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07T210_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      P07T211_A396EmprCod = new String[] {""} ;
      P07T211_A5198Nr_codigo = new int[1] ;
      P07T211_A834TipDefDsc = new String[] {""} ;
      P07T211_n834TipDefDsc = new boolean[] {false} ;
      P07T211_A833TipDefCod = new short[1] ;
      A834TipDefDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rcrudopiolera__default(),
         new Object[] {
             new Object[] {
            P07T22_A396EmprCod, P07T22_A44AlbRecCod, P07T22_A56AlbRUni
            }
            , new Object[] {
            P07T23_A2157AlbRecMtr, P07T23_A2158AlbRecMtrU
            }
            , new Object[] {
            P07T24_A2155AlbRecKgm, P07T24_A2156AlbRecKgmU
            }
            , new Object[] {
            P07T25_A396EmprCod, P07T25_A44AlbRecCod, P07T25_A5806AlbREnt2, P07T25_A46AlbREnt, P07T25_A3613AlbRefDsc, P07T25_A60AlbRUniUti, P07T25_A841TrnNom, P07T25_n841TrnNom, P07T25_A56AlbRUni, P07T25_A971ProceNom,
            P07T25_n971ProceNom, P07T25_A279CliNom, P07T25_A52AlbRPieEnt, P07T25_A840TrnCod, P07T25_n840TrnCod, P07T25_A970ProceCod, P07T25_n970ProceCod, P07T25_A252CliCod, P07T25_A58AlbRUniEnt, P07T25_A55AlbRReo,
            P07T25_A54AlbRPieUti, P07T25_A50AlbRLoc, P07T25_A49AlbRFen, P07T25_A48AlbRFecUlt, P07T25_A47AlbREst, P07T25_A45AlbRef, P07T25_A1291AlbRDes
            }
            , new Object[] {
            P07T26_A396EmprCod, P07T26_A44AlbRecCod, P07T26_A1300AlbRObs, P07T26_A1299AlbRLin
            }
            , new Object[] {
            P07T27_A396EmprCod, P07T27_A44AlbRecCod, P07T27_A2157AlbRecMtr, P07T27_A2155AlbRecKgm, P07T27_A2159AlbRecPie
            }
            , new Object[] {
            P07T28_A396EmprCod, P07T28_A44AlbRecCod, P07T28_A2159AlbRecPie, P07T28_A2158AlbRecMtrU, P07T28_A2157AlbRecMtr, P07T28_A2156AlbRecKgmU, P07T28_A2155AlbRecKgm, P07T28_A2154AlbRecAnh, P07T28_A3731AlbRecIdPz
            }
            , new Object[] {
            P07T29_A396EmprCod, P07T29_A5206Nr_albrecc, P07T29_n5206Nr_albrecc, P07T29_A5198Nr_codigo, P07T29_A5224Nr_barpara, P07T29_n5224Nr_barpara, P07T29_A5223Nr_barreoa, P07T29_n5223Nr_barreoa, P07T29_A5222Nr_barcoda, P07T29_n5222Nr_barcoda,
            P07T29_A12235Nr_NAlb, P07T29_n12235Nr_NAlb, P07T29_A5210Nr_barcod, P07T29_n5210Nr_barcod, P07T29_A5216Nr_fecreg, P07T29_n5216Nr_fecreg
            }
            , new Object[] {
            P07T210_A396EmprCod, P07T210_A129BarCod, P07T210_A132BarCodReo, P07T210_A130BarCodPar, P07T210_A135BarColNom, P07T210_A136BarColNum, P07T210_A30AlbProCod, P07T210_A1261BarAlbKgmE, P07T210_A1263BarAlbMtrE
            }
            , new Object[] {
            P07T211_A396EmprCod, P07T211_A5198Nr_codigo, P07T211_A834TipDefDsc, P07T211_n834TipDefDsc, P07T211_A833TipDefCod
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
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A47AlbREst ;
   private byte AV9Observ ;
   private byte A1299AlbRLin ;
   private byte A5223Nr_barreoa ;
   private byte A132BarCodReo ;
   private byte AV30Termilenio ;
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
   private String AV31FecPiolera ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String AV15AlbRUni ;
   private String A5806AlbREnt2 ;
   private String A46AlbREnt ;
   private String A3613AlbRefDsc ;
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
   private String[] P07T22_A396EmprCod ;
   private int[] P07T22_A44AlbRecCod ;
   private String[] P07T22_A56AlbRUni ;
   private java.math.BigDecimal[] P07T23_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P07T23_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] P07T24_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P07T24_A2156AlbRecKgmU ;
   private String[] P07T25_A396EmprCod ;
   private int[] P07T25_A44AlbRecCod ;
   private String[] P07T25_A5806AlbREnt2 ;
   private String[] P07T25_A46AlbREnt ;
   private String[] P07T25_A3613AlbRefDsc ;
   private java.math.BigDecimal[] P07T25_A60AlbRUniUti ;
   private String[] P07T25_A841TrnNom ;
   private boolean[] P07T25_n841TrnNom ;
   private String[] P07T25_A56AlbRUni ;
   private String[] P07T25_A971ProceNom ;
   private boolean[] P07T25_n971ProceNom ;
   private String[] P07T25_A279CliNom ;
   private int[] P07T25_A52AlbRPieEnt ;
   private short[] P07T25_A840TrnCod ;
   private boolean[] P07T25_n840TrnCod ;
   private short[] P07T25_A970ProceCod ;
   private boolean[] P07T25_n970ProceCod ;
   private int[] P07T25_A252CliCod ;
   private java.math.BigDecimal[] P07T25_A58AlbRUniEnt ;
   private String[] P07T25_A55AlbRReo ;
   private int[] P07T25_A54AlbRPieUti ;
   private String[] P07T25_A50AlbRLoc ;
   private java.util.Date[] P07T25_A49AlbRFen ;
   private java.util.Date[] P07T25_A48AlbRFecUlt ;
   private byte[] P07T25_A47AlbREst ;
   private String[] P07T25_A45AlbRef ;
   private String[] P07T25_A1291AlbRDes ;
   private String[] P07T26_A396EmprCod ;
   private int[] P07T26_A44AlbRecCod ;
   private String[] P07T26_A1300AlbRObs ;
   private byte[] P07T26_A1299AlbRLin ;
   private String[] P07T27_A396EmprCod ;
   private int[] P07T27_A44AlbRecCod ;
   private java.math.BigDecimal[] P07T27_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P07T27_A2155AlbRecKgm ;
   private String[] P07T27_A2159AlbRecPie ;
   private String[] P07T28_A396EmprCod ;
   private int[] P07T28_A44AlbRecCod ;
   private String[] P07T28_A2159AlbRecPie ;
   private java.math.BigDecimal[] P07T28_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] P07T28_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P07T28_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] P07T28_A2155AlbRecKgm ;
   private short[] P07T28_A2154AlbRecAnh ;
   private String[] P07T28_A3731AlbRecIdPz ;
   private String[] P07T29_A396EmprCod ;
   private int[] P07T29_A5206Nr_albrecc ;
   private boolean[] P07T29_n5206Nr_albrecc ;
   private int[] P07T29_A5198Nr_codigo ;
   private String[] P07T29_A5224Nr_barpara ;
   private boolean[] P07T29_n5224Nr_barpara ;
   private byte[] P07T29_A5223Nr_barreoa ;
   private boolean[] P07T29_n5223Nr_barreoa ;
   private int[] P07T29_A5222Nr_barcoda ;
   private boolean[] P07T29_n5222Nr_barcoda ;
   private long[] P07T29_A12235Nr_NAlb ;
   private boolean[] P07T29_n12235Nr_NAlb ;
   private int[] P07T29_A5210Nr_barcod ;
   private boolean[] P07T29_n5210Nr_barcod ;
   private java.util.Date[] P07T29_A5216Nr_fecreg ;
   private boolean[] P07T29_n5216Nr_fecreg ;
   private String[] P07T210_A396EmprCod ;
   private int[] P07T210_A129BarCod ;
   private byte[] P07T210_A132BarCodReo ;
   private String[] P07T210_A130BarCodPar ;
   private String[] P07T210_A135BarColNom ;
   private int[] P07T210_A136BarColNum ;
   private long[] P07T210_A30AlbProCod ;
   private java.math.BigDecimal[] P07T210_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P07T210_A1263BarAlbMtrE ;
   private String[] P07T211_A396EmprCod ;
   private int[] P07T211_A5198Nr_codigo ;
   private String[] P07T211_A834TipDefDsc ;
   private boolean[] P07T211_n834TipDefDsc ;
   private short[] P07T211_A833TipDefCod ;
}

final  class rcrudopiolera__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07T22", "SELECT EmprCod, AlbRecCod, AlbRUni FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07T23", "SELECT SUM(AlbRecMtr), SUM(AlbRecMtrU) FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07T24", "SELECT SUM(AlbRecKgm), SUM(AlbRecKgmU) FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07T25", "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbREnt2, T1.AlbREnt, T1.AlbRefDsc, T1.AlbRUniUti, T3.TrnNom, T1.AlbRUni, T4.ProceNom, T2.CliNom, T1.AlbRPieEnt, T1.TrnCod, T1.ProceCod, T1.CliCod, T1.AlbRUniEnt, T1.AlbRReo, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRFen, T1.AlbRFecUlt, T1.AlbREst, T1.AlbRef, T1.AlbRDes FROM (((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07T26", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07T27", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecMtr, AlbRecKgm, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07T28", "SELECT EmprCod, AlbRecCod, AlbRecPie, AlbRecMtrU, AlbRecMtr, AlbRecKgmU, AlbRecKgm, AlbRecAnh, AlbRecIdPz FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07T29", "SELECT EmprCod, Nr_albrecc, Nr_codigo, Nr_barpara, Nr_barreoa, Nr_barcoda, Nr_NAlb, Nr_barcod, Nr_fecreg FROM TXPNOTREC WHERE EmprCod = ? and Nr_albrecc = ? ORDER BY EmprCod, Nr_albrecc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07T210", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarColNom, T2.BarColNum, T1.AlbProCod, T1.BarAlbKgmE, T1.BarAlbMtrE FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07T211", "SELECT T1.EmprCod, T1.Nr_codigo, T2.TipDefDsc, T1.TipDefCod FROM (TXPNOTRE1 T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.Nr_codigo = ? ORDER BY T1.EmprCod, T1.Nr_codigo, T1.TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[19])[0] = rslt.getString(16, 2);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 10);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(19);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(20);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((String[]) buf[25])[0] = rslt.getString(22, 16);
               ((String[]) buf[26])[0] = rslt.getString(23, 20);
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

