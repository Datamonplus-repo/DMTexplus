package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rialbrea extends GXReport
{
   public rialbrea( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rialbrea.class ), "" );
   }

   public rialbrea( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      rialbrea.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      rialbrea.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rialbrea.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Albarán Recepción Artextil") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_int1 = AV9Artextil ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int2) ;
         rialbrea.this.GXt_int1 = GXv_int2[0] ;
         AV9Artextil = GXt_int1 ;
         AV10AlbRUniEnt = DecimalUtil.doubleToDec(0) ;
         AV11AlbRUniUti = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P07EL2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A56AlbRUni = P07EL2_A56AlbRUni[0] ;
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               AV12AlbRUni = httpContext.getMessage( "M", "") ;
               /* Optimized group. */
               /* Using cursor P07EL3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               c2157AlbRecMtr = P07EL3_A2157AlbRecMtr[0] ;
               c2158AlbRecMtrU = P07EL3_A2158AlbRecMtrU[0] ;
               pr_default.close(1);
               AV10AlbRUniEnt = AV10AlbRUniEnt.add(c2157AlbRecMtr) ;
               AV11AlbRUniUti = AV11AlbRUniUti.add(c2158AlbRecMtrU) ;
               /* End optimized group. */
            }
            else
            {
               AV12AlbRUni = httpContext.getMessage( "K", "") ;
               /* Optimized group. */
               /* Using cursor P07EL4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
               c2155AlbRecKgm = P07EL4_A2155AlbRecKgm[0] ;
               c2156AlbRecKgmU = P07EL4_A2156AlbRecKgmU[0] ;
               pr_default.close(2);
               AV10AlbRUniEnt = AV10AlbRUniEnt.add(c2155AlbRecKgm) ;
               AV11AlbRUniUti = AV11AlbRUniUti.add(c2156AlbRecKgmU) ;
               /* End optimized group. */
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07EL5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A407EmprNom = P07EL5_A407EmprNom[0] ;
            n407EmprNom = P07EL5_n407EmprNom[0] ;
            A60AlbRUniUti = P07EL5_A60AlbRUniUti[0] ;
            A841TrnNom = P07EL5_A841TrnNom[0] ;
            n841TrnNom = P07EL5_n841TrnNom[0] ;
            A56AlbRUni = P07EL5_A56AlbRUni[0] ;
            A971ProceNom = P07EL5_A971ProceNom[0] ;
            n971ProceNom = P07EL5_n971ProceNom[0] ;
            A279CliNom = P07EL5_A279CliNom[0] ;
            A52AlbRPieEnt = P07EL5_A52AlbRPieEnt[0] ;
            A840TrnCod = P07EL5_A840TrnCod[0] ;
            n840TrnCod = P07EL5_n840TrnCod[0] ;
            A970ProceCod = P07EL5_A970ProceCod[0] ;
            n970ProceCod = P07EL5_n970ProceCod[0] ;
            A252CliCod = P07EL5_A252CliCod[0] ;
            A58AlbRUniEnt = P07EL5_A58AlbRUniEnt[0] ;
            A55AlbRReo = P07EL5_A55AlbRReo[0] ;
            A54AlbRPieUti = P07EL5_A54AlbRPieUti[0] ;
            A50AlbRLoc = P07EL5_A50AlbRLoc[0] ;
            A49AlbRFen = P07EL5_A49AlbRFen[0] ;
            A48AlbRFecUlt = P07EL5_A48AlbRFecUlt[0] ;
            A47AlbREst = P07EL5_A47AlbREst[0] ;
            A46AlbREnt = P07EL5_A46AlbREnt[0] ;
            A45AlbRef = P07EL5_A45AlbRef[0] ;
            A1291AlbRDes = P07EL5_A1291AlbRDes[0] ;
            A407EmprNom = P07EL5_A407EmprNom[0] ;
            n407EmprNom = P07EL5_n407EmprNom[0] ;
            A279CliNom = P07EL5_A279CliNom[0] ;
            A841TrnNom = P07EL5_A841TrnNom[0] ;
            n841TrnNom = P07EL5_n841TrnNom[0] ;
            A971ProceNom = P07EL5_A971ProceNom[0] ;
            n971ProceNom = P07EL5_n971ProceNom[0] ;
            h7EL0( false, 311) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), 335, Gx_line+173, 482, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 131, Gx_line+64, 190, Gx_line+81, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 131, Gx_line+95, 249, Gx_line+112, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 394, Gx_line+64, 453, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A47AlbREst), "9")), 560, Gx_line+248, 568, Gx_line+265, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A48AlbRFecUlt, "99/99/99"), 466, Gx_line+264, 525, Gx_line+281, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 466, Gx_line+248, 525, Gx_line+265, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 131, Gx_line+173, 205, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")), 396, Gx_line+264, 441, Gx_line+281, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A55AlbRReo, "@!")), 583, Gx_line+173, 599, Gx_line+190, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 156, Gx_line+248, 223, Gx_line+265, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 335, Gx_line+95, 380, Gx_line+112, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9")), 131, Gx_line+146, 161, Gx_line+163, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), 131, Gx_line+126, 161, Gx_line+143, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Destino :", ""), 263, Gx_line+174, 317, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.Recepcion   :", ""), 15, Gx_line+65, 110, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Referencia    :", ""), 15, Gx_line+96, 101, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Albaran Entrega :", ""), 263, Gx_line+65, 367, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 546, Gx_line+217, 588, Gx_line+231, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha  :", ""), 518, Gx_line+65, 568, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Localización  :", ""), 15, Gx_line+174, 102, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PIEZAS", ""), 393, Gx_line+217, 440, Gx_line+231, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 396, Gx_line+248, 441, Gx_line+265, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Reoperado :", ""), 496, Gx_line+174, 570, Gx_line+188, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transportista :", ""), 15, Gx_line+127, 101, Gx_line+141, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente :", ""), 263, Gx_line+96, 313, Gx_line+110, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Procedencia   :", ""), 15, Gx_line+147, 107, Gx_line+161, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Entrado   :", ""), 54, Gx_line+250, 118, Gx_line+264, 0+256, 0, 0, 0) ;
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
            getPrinter().GxDrawText(httpContext.getMessage( "Utilizado :", ""), 54, Gx_line+266, 114, Gx_line+280, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cant.Princ.", ""), 155, Gx_line+217, 222, Gx_line+231, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A56AlbRUni, "@!")), 236, Gx_line+248, 244, Gx_line+265, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 182, Gx_line+126, 402, Gx_line+143, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")), 156, Gx_line+264, 223, Gx_line+281, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA", ""), 466, Gx_line+217, 509, Gx_line+231, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 591, Gx_line+64, 650, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(255, Gx_line+34, 415, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(156, Gx_line+235, 222, Gx_line+235, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(466, Gx_line+235, 524, Gx_line+235, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(393, Gx_line+235, 440, Gx_line+235, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(546, Gx_line+235, 592, Gx_line+235, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(15, Gx_line+202, 667, Gx_line+299, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 7, Gx_line+0, 227, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cant.Secun.", ""), 271, Gx_line+217, 345, Gx_line+231, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12AlbRUni, "@!")), 352, Gx_line+248, 360, Gx_line+265, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV11AlbRUniUti, "ZZZZZ9.99")), 272, Gx_line+264, 339, Gx_line+281, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(272, Gx_line+235, 338, Gx_line+235, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV10AlbRUniEnt, "ZZZZZ9.99")), 272, Gx_line+248, 339, Gx_line+265, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+311) ;
            AV8Observ = (byte)(0) ;
            /* Using cursor P07EL6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A1300AlbRObs = P07EL6_A1300AlbRObs[0] ;
               A1299AlbRLin = P07EL6_A1299AlbRLin[0] ;
               if ( AV8Observ == 0 )
               {
                  h7EL0( false, 16) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observaciones :", ""), 13, Gx_line+0, 110, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 139, Gx_line+0, 578, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
               }
               else
               {
                  h7EL0( false, 16) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 139, Gx_line+0, 578, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
               }
               AV8Observ = (byte)(1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            if ( AV8Observ == 1 )
            {
               h7EL0( false, 11) ;
               getPrinter().GxDrawLine(13, Gx_line+7, 667, Gx_line+7, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+11) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7EL0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7EL0( boolean bFoot ,
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
      this.aP0[0] = rialbrea.this.A396EmprCod;
      this.aP1[0] = rialbrea.this.A44AlbRecCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV10AlbRUniEnt = DecimalUtil.ZERO ;
      AV11AlbRUniUti = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P07EL2_A396EmprCod = new String[] {""} ;
      P07EL2_A44AlbRecCod = new int[1] ;
      P07EL2_A56AlbRUni = new String[] {""} ;
      A56AlbRUni = "" ;
      AV12AlbRUni = "" ;
      c2157AlbRecMtr = DecimalUtil.ZERO ;
      c2158AlbRecMtrU = DecimalUtil.ZERO ;
      P07EL3_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EL3_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      c2155AlbRecKgm = DecimalUtil.ZERO ;
      c2156AlbRecKgmU = DecimalUtil.ZERO ;
      P07EL4_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EL4_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EL5_A396EmprCod = new String[] {""} ;
      P07EL5_A44AlbRecCod = new int[1] ;
      P07EL5_A407EmprNom = new String[] {""} ;
      P07EL5_n407EmprNom = new boolean[] {false} ;
      P07EL5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EL5_A841TrnNom = new String[] {""} ;
      P07EL5_n841TrnNom = new boolean[] {false} ;
      P07EL5_A56AlbRUni = new String[] {""} ;
      P07EL5_A971ProceNom = new String[] {""} ;
      P07EL5_n971ProceNom = new boolean[] {false} ;
      P07EL5_A279CliNom = new String[] {""} ;
      P07EL5_A52AlbRPieEnt = new int[1] ;
      P07EL5_A840TrnCod = new short[1] ;
      P07EL5_n840TrnCod = new boolean[] {false} ;
      P07EL5_A970ProceCod = new short[1] ;
      P07EL5_n970ProceCod = new boolean[] {false} ;
      P07EL5_A252CliCod = new int[1] ;
      P07EL5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EL5_A55AlbRReo = new String[] {""} ;
      P07EL5_A54AlbRPieUti = new int[1] ;
      P07EL5_A50AlbRLoc = new String[] {""} ;
      P07EL5_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P07EL5_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P07EL5_A47AlbREst = new byte[1] ;
      P07EL5_A46AlbREnt = new String[] {""} ;
      P07EL5_A45AlbRef = new String[] {""} ;
      P07EL5_A1291AlbRDes = new String[] {""} ;
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
      A46AlbREnt = "" ;
      A45AlbRef = "" ;
      A1291AlbRDes = "" ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      P07EL6_A396EmprCod = new String[] {""} ;
      P07EL6_A44AlbRecCod = new int[1] ;
      P07EL6_A1300AlbRObs = new String[] {""} ;
      P07EL6_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rialbrea__default(),
         new Object[] {
             new Object[] {
            P07EL2_A396EmprCod, P07EL2_A44AlbRecCod, P07EL2_A56AlbRUni
            }
            , new Object[] {
            P07EL3_A2157AlbRecMtr, P07EL3_A2158AlbRecMtrU
            }
            , new Object[] {
            P07EL4_A2155AlbRecKgm, P07EL4_A2156AlbRecKgmU
            }
            , new Object[] {
            P07EL5_A396EmprCod, P07EL5_A44AlbRecCod, P07EL5_A407EmprNom, P07EL5_n407EmprNom, P07EL5_A60AlbRUniUti, P07EL5_A841TrnNom, P07EL5_n841TrnNom, P07EL5_A56AlbRUni, P07EL5_A971ProceNom, P07EL5_n971ProceNom,
            P07EL5_A279CliNom, P07EL5_A52AlbRPieEnt, P07EL5_A840TrnCod, P07EL5_n840TrnCod, P07EL5_A970ProceCod, P07EL5_n970ProceCod, P07EL5_A252CliCod, P07EL5_A58AlbRUniEnt, P07EL5_A55AlbRReo, P07EL5_A54AlbRPieUti,
            P07EL5_A50AlbRLoc, P07EL5_A49AlbRFen, P07EL5_A48AlbRFecUlt, P07EL5_A47AlbREst, P07EL5_A46AlbREnt, P07EL5_A45AlbRef, P07EL5_A1291AlbRDes
            }
            , new Object[] {
            P07EL6_A396EmprCod, P07EL6_A44AlbRecCod, P07EL6_A1300AlbRObs, P07EL6_A1299AlbRLin
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

   private byte AV9Artextil ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A47AlbREst ;
   private byte AV8Observ ;
   private byte A1299AlbRLin ;
   private short A840TrnCod ;
   private short A970ProceCod ;
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
   private java.math.BigDecimal AV10AlbRUniEnt ;
   private java.math.BigDecimal AV11AlbRUniUti ;
   private java.math.BigDecimal c2157AlbRecMtr ;
   private java.math.BigDecimal c2158AlbRecMtrU ;
   private java.math.BigDecimal c2155AlbRecKgm ;
   private java.math.BigDecimal c2156AlbRecKgmU ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A56AlbRUni ;
   private String AV12AlbRUni ;
   private String A407EmprNom ;
   private String A841TrnNom ;
   private String A971ProceNom ;
   private String A279CliNom ;
   private String A55AlbRReo ;
   private String A50AlbRLoc ;
   private String A46AlbREnt ;
   private String A45AlbRef ;
   private String A1291AlbRDes ;
   private String Gx_time ;
   private String A1300AlbRObs ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n971ProceNom ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P07EL2_A396EmprCod ;
   private int[] P07EL2_A44AlbRecCod ;
   private String[] P07EL2_A56AlbRUni ;
   private java.math.BigDecimal[] P07EL3_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P07EL3_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] P07EL4_A2155AlbRecKgm ;
   private java.math.BigDecimal[] P07EL4_A2156AlbRecKgmU ;
   private String[] P07EL5_A396EmprCod ;
   private int[] P07EL5_A44AlbRecCod ;
   private String[] P07EL5_A407EmprNom ;
   private boolean[] P07EL5_n407EmprNom ;
   private java.math.BigDecimal[] P07EL5_A60AlbRUniUti ;
   private String[] P07EL5_A841TrnNom ;
   private boolean[] P07EL5_n841TrnNom ;
   private String[] P07EL5_A56AlbRUni ;
   private String[] P07EL5_A971ProceNom ;
   private boolean[] P07EL5_n971ProceNom ;
   private String[] P07EL5_A279CliNom ;
   private int[] P07EL5_A52AlbRPieEnt ;
   private short[] P07EL5_A840TrnCod ;
   private boolean[] P07EL5_n840TrnCod ;
   private short[] P07EL5_A970ProceCod ;
   private boolean[] P07EL5_n970ProceCod ;
   private int[] P07EL5_A252CliCod ;
   private java.math.BigDecimal[] P07EL5_A58AlbRUniEnt ;
   private String[] P07EL5_A55AlbRReo ;
   private int[] P07EL5_A54AlbRPieUti ;
   private String[] P07EL5_A50AlbRLoc ;
   private java.util.Date[] P07EL5_A49AlbRFen ;
   private java.util.Date[] P07EL5_A48AlbRFecUlt ;
   private byte[] P07EL5_A47AlbREst ;
   private String[] P07EL5_A46AlbREnt ;
   private String[] P07EL5_A45AlbRef ;
   private String[] P07EL5_A1291AlbRDes ;
   private String[] P07EL6_A396EmprCod ;
   private int[] P07EL6_A44AlbRecCod ;
   private String[] P07EL6_A1300AlbRObs ;
   private byte[] P07EL6_A1299AlbRLin ;
}

final  class rialbrea__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07EL2", "SELECT EmprCod, AlbRecCod, AlbRUni FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07EL3", "SELECT SUM(AlbRecMtr), SUM(AlbRecMtrU) FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EL4", "SELECT SUM(AlbRecKgm), SUM(AlbRecKgmU) FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EL5", "SELECT T1.EmprCod, T1.AlbRecCod, T2.EmprNom, T1.AlbRUniUti, T4.TrnNom, T1.AlbRUni, T5.ProceNom, T3.CliNom, T1.AlbRPieEnt, T1.TrnCod, T1.ProceCod, T1.CliCod, T1.AlbRUniEnt, T1.AlbRReo, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRFen, T1.AlbRFecUlt, T1.AlbREst, T1.AlbREnt, T1.AlbRef, T1.AlbRDes FROM ((((TXPALBREC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod AND T5.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07EL6", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[18])[0] = rslt.getString(14, 2);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((String[]) buf[20])[0] = rslt.getString(16, 10);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(18);
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((String[]) buf[24])[0] = rslt.getString(20, 8);
               ((String[]) buf[25])[0] = rslt.getString(21, 16);
               ((String[]) buf[26])[0] = rslt.getString(22, 20);
               return;
            case 4 :
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
      }
   }

}

