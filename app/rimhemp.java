package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rimhemp extends GXReport
{
   public rimhemp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rimhemp.class ), "" );
   }

   public rimhemp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      rimhemp.this.aP1 = new int[] {0};
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
      rimhemp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rimhemp.this.A44AlbRecCod = aP1[0];
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
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Impresion Mov.Histor.Empesas") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P06TV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06TV2_A407EmprNom[0] ;
            n407EmprNom = P06TV2_n407EmprNom[0] ;
            A841TrnNom = P06TV2_A841TrnNom[0] ;
            n841TrnNom = P06TV2_n841TrnNom[0] ;
            A56AlbRUni = P06TV2_A56AlbRUni[0] ;
            A971ProceNom = P06TV2_A971ProceNom[0] ;
            n971ProceNom = P06TV2_n971ProceNom[0] ;
            A279CliNom = P06TV2_A279CliNom[0] ;
            A840TrnCod = P06TV2_A840TrnCod[0] ;
            n840TrnCod = P06TV2_n840TrnCod[0] ;
            A970ProceCod = P06TV2_A970ProceCod[0] ;
            n970ProceCod = P06TV2_n970ProceCod[0] ;
            A252CliCod = P06TV2_A252CliCod[0] ;
            A55AlbRReo = P06TV2_A55AlbRReo[0] ;
            A50AlbRLoc = P06TV2_A50AlbRLoc[0] ;
            A49AlbRFen = P06TV2_A49AlbRFen[0] ;
            A48AlbRFecUlt = P06TV2_A48AlbRFecUlt[0] ;
            A47AlbREst = P06TV2_A47AlbREst[0] ;
            A46AlbREnt = P06TV2_A46AlbREnt[0] ;
            A45AlbRef = P06TV2_A45AlbRef[0] ;
            A1291AlbRDes = P06TV2_A1291AlbRDes[0] ;
            A54AlbRPieUti = P06TV2_A54AlbRPieUti[0] ;
            A52AlbRPieEnt = P06TV2_A52AlbRPieEnt[0] ;
            A60AlbRUniUti = P06TV2_A60AlbRUniUti[0] ;
            A58AlbRUniEnt = P06TV2_A58AlbRUniEnt[0] ;
            A407EmprNom = P06TV2_A407EmprNom[0] ;
            n407EmprNom = P06TV2_n407EmprNom[0] ;
            A279CliNom = P06TV2_A279CliNom[0] ;
            A841TrnNom = P06TV2_A841TrnNom[0] ;
            n841TrnNom = P06TV2_n841TrnNom[0] ;
            A971ProceNom = P06TV2_A971ProceNom[0] ;
            n971ProceNom = P06TV2_n971ProceNom[0] ;
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
            {
               A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            }
            else
            {
               if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               }
            }
            A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            h6TV0( false, 324) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), 335, Gx_line+161, 482, Gx_line+178, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 131, Gx_line+64, 190, Gx_line+81, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 131, Gx_line+90, 249, Gx_line+107, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 394, Gx_line+64, 453, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A47AlbREst), "9")), 513, Gx_line+215, 521, Gx_line+232, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A48AlbRFecUlt, "99/99/99"), 418, Gx_line+230, 477, Gx_line+247, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 418, Gx_line+215, 477, Gx_line+232, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 131, Gx_line+161, 205, Gx_line+178, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")), 348, Gx_line+230, 393, Gx_line+247, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A55AlbRReo, "@!")), 583, Gx_line+161, 599, Gx_line+178, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 233, Gx_line+215, 300, Gx_line+232, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 335, Gx_line+90, 380, Gx_line+107, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9")), 131, Gx_line+134, 161, Gx_line+151, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), 131, Gx_line+115, 161, Gx_line+132, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Destino :", ""), 263, Gx_line+163, 317, Gx_line+177, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N.Recepcion   :", ""), 15, Gx_line+65, 110, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Referencia    :", ""), 15, Gx_line+91, 101, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Albaran Entrega :", ""), 263, Gx_line+65, 367, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 498, Gx_line+190, 540, Gx_line+204, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha  :", ""), 518, Gx_line+65, 568, Gx_line+79, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Localización  :", ""), 15, Gx_line+163, 102, Gx_line+177, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PIEZAS", ""), 345, Gx_line+190, 392, Gx_line+204, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 348, Gx_line+215, 393, Gx_line+232, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Reoperado :", ""), 496, Gx_line+163, 570, Gx_line+177, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transportista :", ""), 15, Gx_line+116, 101, Gx_line+130, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente :", ""), 263, Gx_line+91, 313, Gx_line+105, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Procedencia   :", ""), 15, Gx_line+135, 107, Gx_line+149, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Entrado   :", ""), 131, Gx_line+217, 195, Gx_line+231, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 401, Gx_line+90, 621, Gx_line+107, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 583, Gx_line+16, 642, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 583, Gx_line+0, 642, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha : ", ""), 518, Gx_line+0, 568, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora  :", ""), 518, Gx_line+16, 560, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "MOVIMIENTOS ALBARAN DE RECEPCION", ""), 228, Gx_line+22, 483, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A971ProceNom, "")), 182, Gx_line+134, 402, Gx_line+151, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Utilizado :", ""), 131, Gx_line+232, 191, Gx_line+246, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CANTIDAD", ""), 232, Gx_line+190, 299, Gx_line+204, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A56AlbRUni, "@!")), 314, Gx_line+215, 322, Gx_line+232, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 182, Gx_line+115, 402, Gx_line+132, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")), 233, Gx_line+230, 300, Gx_line+247, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA", ""), 418, Gx_line+190, 461, Gx_line+204, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 591, Gx_line+64, 650, Gx_line+81, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A407EmprNom, "")), 7, Gx_line+0, 227, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(228, Gx_line+40, 483, Gx_line+40, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(233, Gx_line+208, 299, Gx_line+208, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(418, Gx_line+208, 476, Gx_line+208, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+208, 392, Gx_line+208, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(498, Gx_line+208, 544, Gx_line+208, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(14, Gx_line+183, 743, Gx_line+275, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9")), 348, Gx_line+252, 393, Gx_line+269, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A57AlbRUniDis, "ZZZZZ9.99")), 233, Gx_line+252, 300, Gx_line+269, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(233, Gx_line+249, 299, Gx_line+249, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(345, Gx_line+249, 392, Gx_line+249, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("#", 20, Gx_line+301, 29, Gx_line+315, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "T.", ""), 42, Gx_line+301, 56, Gx_line+315, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Disposicion", ""), 65, Gx_line+301, 134, Gx_line+315, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Albarán    /", ""), 65, Gx_line+289, 134, Gx_line+303, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Movimiento", ""), 145, Gx_line+303, 213, Gx_line+317, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 160, Gx_line+289, 197, Gx_line+303, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 258, Gx_line+303, 287, Gx_line+317, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kilos", ""), 451, Gx_line+303, 480, Gx_line+317, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 320, Gx_line+303, 361, Gx_line+317, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 511, Gx_line+303, 552, Gx_line+317, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pzas", ""), 367, Gx_line+303, 396, Gx_line+317, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pzas", ""), 561, Gx_line+303, 590, Gx_line+317, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Entrado", ""), 285, Gx_line+289, 332, Gx_line+303, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Utilizado", ""), 474, Gx_line+289, 526, Gx_line+303, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(415, Gx_line+295, 461, Gx_line+295, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(545, Gx_line+295, 591, Gx_line+295, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(222, Gx_line+295, 268, Gx_line+295, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(350, Gx_line+295, 396, Gx_line+295, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Movimiento", ""), 608, Gx_line+303, 676, Gx_line+317, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(608, Gx_line+319, 754, Gx_line+319, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(561, Gx_line+319, 590, Gx_line+319, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(145, Gx_line+319, 213, Gx_line+319, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(222, Gx_line+319, 288, Gx_line+319, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(295, Gx_line+319, 361, Gx_line+319, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(367, Gx_line+319, 396, Gx_line+319, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(415, Gx_line+319, 481, Gx_line+319, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(486, Gx_line+319, 552, Gx_line+319, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(65, Gx_line+319, 134, Gx_line+319, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(42, Gx_line+319, 57, Gx_line+319, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+319, 36, Gx_line+319, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+324) ;
            AV9Observ = (byte)(0) ;
            /* Using cursor P06TV3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A2173HisEmpSd = P06TV3_A2173HisEmpSd[0] ;
               n2173HisEmpSd = P06TV3_n2173HisEmpSd[0] ;
               A2172HisEmpPu = P06TV3_A2172HisEmpPu[0] ;
               n2172HisEmpPu = P06TV3_n2172HisEmpPu[0] ;
               A2171HisEmpPe = P06TV3_A2171HisEmpPe[0] ;
               n2171HisEmpPe = P06TV3_n2171HisEmpPe[0] ;
               A2169HisEmpMu = P06TV3_A2169HisEmpMu[0] ;
               n2169HisEmpMu = P06TV3_n2169HisEmpMu[0] ;
               A2168HisEmpMe = P06TV3_A2168HisEmpMe[0] ;
               n2168HisEmpMe = P06TV3_n2168HisEmpMe[0] ;
               A2164HisEmpKu = P06TV3_A2164HisEmpKu[0] ;
               n2164HisEmpKu = P06TV3_n2164HisEmpKu[0] ;
               A2163HisEmpKe = P06TV3_A2163HisEmpKe[0] ;
               n2163HisEmpKe = P06TV3_n2163HisEmpKe[0] ;
               A2161HisEmpFMov = P06TV3_A2161HisEmpFMov[0] ;
               n2161HisEmpFMov = P06TV3_n2161HisEmpFMov[0] ;
               A2160HisEmpAlbD = P06TV3_A2160HisEmpAlbD[0] ;
               n2160HisEmpAlbD = P06TV3_n2160HisEmpAlbD[0] ;
               A2166HisEmpLTip = P06TV3_A2166HisEmpLTip[0] ;
               n2166HisEmpLTip = P06TV3_n2166HisEmpLTip[0] ;
               A2165HisEmpLin = P06TV3_A2165HisEmpLin[0] ;
               h6TV0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2165HisEmpLin), "ZZ9")), 14, Gx_line+0, 37, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2166HisEmpLTip, "@!")), 42, Gx_line+1, 50, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2160HisEmpAlbD), "ZZZZZZZZZ9")), 65, Gx_line+1, 139, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A2161HisEmpFMov, "99/99/99"), 150, Gx_line+1, 209, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2163HisEmpKe, "ZZZZZ9.99")), 222, Gx_line+1, 289, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2164HisEmpKu, "ZZZZZ9.99")), 415, Gx_line+1, 482, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2168HisEmpMe, "ZZZZZ9.99")), 295, Gx_line+0, 362, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2169HisEmpMu, "ZZZZZ9.99")), 486, Gx_line+1, 553, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2171HisEmpPe), "ZZZ9")), 367, Gx_line+1, 397, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2172HisEmpPu), "ZZZ9")), 561, Gx_line+1, 591, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2173HisEmpSd, "")), 608, Gx_line+1, 755, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Using cursor P06TV4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1300AlbRObs = P06TV4_A1300AlbRObs[0] ;
               A1299AlbRLin = P06TV4_A1299AlbRLin[0] ;
               if ( AV9Observ == 0 )
               {
                  h6TV0( false, 16) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observaciones :", ""), 13, Gx_line+0, 110, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 139, Gx_line+0, 578, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
               }
               else
               {
                  h6TV0( false, 16) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1300AlbRObs, "")), 139, Gx_line+0, 578, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
               }
               AV9Observ = (byte)(1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV9Observ == 1 )
            {
               h6TV0( false, 11) ;
               getPrinter().GxDrawLine(13, Gx_line+7, 667, Gx_line+7, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+11) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6TV0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h6TV0( boolean bFoot ,
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
      this.aP0[0] = rimhemp.this.A396EmprCod;
      this.aP1[0] = rimhemp.this.A44AlbRecCod;
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
      P06TV2_A396EmprCod = new String[] {""} ;
      P06TV2_A44AlbRecCod = new int[1] ;
      P06TV2_A407EmprNom = new String[] {""} ;
      P06TV2_n407EmprNom = new boolean[] {false} ;
      P06TV2_A841TrnNom = new String[] {""} ;
      P06TV2_n841TrnNom = new boolean[] {false} ;
      P06TV2_A56AlbRUni = new String[] {""} ;
      P06TV2_A971ProceNom = new String[] {""} ;
      P06TV2_n971ProceNom = new boolean[] {false} ;
      P06TV2_A279CliNom = new String[] {""} ;
      P06TV2_A840TrnCod = new short[1] ;
      P06TV2_n840TrnCod = new boolean[] {false} ;
      P06TV2_A970ProceCod = new short[1] ;
      P06TV2_n970ProceCod = new boolean[] {false} ;
      P06TV2_A252CliCod = new int[1] ;
      P06TV2_A55AlbRReo = new String[] {""} ;
      P06TV2_A50AlbRLoc = new String[] {""} ;
      P06TV2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P06TV2_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      P06TV2_A47AlbREst = new byte[1] ;
      P06TV2_A46AlbREnt = new String[] {""} ;
      P06TV2_A45AlbRef = new String[] {""} ;
      P06TV2_A1291AlbRDes = new String[] {""} ;
      P06TV2_A54AlbRPieUti = new int[1] ;
      P06TV2_A52AlbRPieEnt = new int[1] ;
      P06TV2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TV2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A407EmprNom = "" ;
      A841TrnNom = "" ;
      A56AlbRUni = "" ;
      A971ProceNom = "" ;
      A279CliNom = "" ;
      A55AlbRReo = "" ;
      A50AlbRLoc = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      A46AlbREnt = "" ;
      A45AlbRef = "" ;
      A1291AlbRDes = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      P06TV3_A396EmprCod = new String[] {""} ;
      P06TV3_A44AlbRecCod = new int[1] ;
      P06TV3_A2173HisEmpSd = new String[] {""} ;
      P06TV3_n2173HisEmpSd = new boolean[] {false} ;
      P06TV3_A2172HisEmpPu = new short[1] ;
      P06TV3_n2172HisEmpPu = new boolean[] {false} ;
      P06TV3_A2171HisEmpPe = new short[1] ;
      P06TV3_n2171HisEmpPe = new boolean[] {false} ;
      P06TV3_A2169HisEmpMu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TV3_n2169HisEmpMu = new boolean[] {false} ;
      P06TV3_A2168HisEmpMe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TV3_n2168HisEmpMe = new boolean[] {false} ;
      P06TV3_A2164HisEmpKu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TV3_n2164HisEmpKu = new boolean[] {false} ;
      P06TV3_A2163HisEmpKe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06TV3_n2163HisEmpKe = new boolean[] {false} ;
      P06TV3_A2161HisEmpFMov = new java.util.Date[] {GXutil.nullDate()} ;
      P06TV3_n2161HisEmpFMov = new boolean[] {false} ;
      P06TV3_A2160HisEmpAlbD = new long[1] ;
      P06TV3_n2160HisEmpAlbD = new boolean[] {false} ;
      P06TV3_A2166HisEmpLTip = new String[] {""} ;
      P06TV3_n2166HisEmpLTip = new boolean[] {false} ;
      P06TV3_A2165HisEmpLin = new short[1] ;
      A2173HisEmpSd = "" ;
      A2169HisEmpMu = DecimalUtil.ZERO ;
      A2168HisEmpMe = DecimalUtil.ZERO ;
      A2164HisEmpKu = DecimalUtil.ZERO ;
      A2163HisEmpKe = DecimalUtil.ZERO ;
      A2161HisEmpFMov = GXutil.nullDate() ;
      A2166HisEmpLTip = "" ;
      P06TV4_A396EmprCod = new String[] {""} ;
      P06TV4_A44AlbRecCod = new int[1] ;
      P06TV4_A1300AlbRObs = new String[] {""} ;
      P06TV4_A1299AlbRLin = new byte[1] ;
      A1300AlbRObs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rimhemp__default(),
         new Object[] {
             new Object[] {
            P06TV2_A396EmprCod, P06TV2_A44AlbRecCod, P06TV2_A407EmprNom, P06TV2_n407EmprNom, P06TV2_A841TrnNom, P06TV2_n841TrnNom, P06TV2_A56AlbRUni, P06TV2_A971ProceNom, P06TV2_n971ProceNom, P06TV2_A279CliNom,
            P06TV2_A840TrnCod, P06TV2_n840TrnCod, P06TV2_A970ProceCod, P06TV2_n970ProceCod, P06TV2_A252CliCod, P06TV2_A55AlbRReo, P06TV2_A50AlbRLoc, P06TV2_A49AlbRFen, P06TV2_A48AlbRFecUlt, P06TV2_A47AlbREst,
            P06TV2_A46AlbREnt, P06TV2_A45AlbRef, P06TV2_A1291AlbRDes, P06TV2_A54AlbRPieUti, P06TV2_A52AlbRPieEnt, P06TV2_A60AlbRUniUti, P06TV2_A58AlbRUniEnt
            }
            , new Object[] {
            P06TV3_A396EmprCod, P06TV3_A44AlbRecCod, P06TV3_A2173HisEmpSd, P06TV3_n2173HisEmpSd, P06TV3_A2172HisEmpPu, P06TV3_n2172HisEmpPu, P06TV3_A2171HisEmpPe, P06TV3_n2171HisEmpPe, P06TV3_A2169HisEmpMu, P06TV3_n2169HisEmpMu,
            P06TV3_A2168HisEmpMe, P06TV3_n2168HisEmpMe, P06TV3_A2164HisEmpKu, P06TV3_n2164HisEmpKu, P06TV3_A2163HisEmpKe, P06TV3_n2163HisEmpKe, P06TV3_A2161HisEmpFMov, P06TV3_n2161HisEmpFMov, P06TV3_A2160HisEmpAlbD, P06TV3_n2160HisEmpAlbD,
            P06TV3_A2166HisEmpLTip, P06TV3_n2166HisEmpLTip, P06TV3_A2165HisEmpLin
            }
            , new Object[] {
            P06TV4_A396EmprCod, P06TV4_A44AlbRecCod, P06TV4_A1300AlbRObs, P06TV4_A1299AlbRLin
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

   private byte A47AlbREst ;
   private byte AV9Observ ;
   private byte A1299AlbRLin ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A2172HisEmpPu ;
   private short A2171HisEmpPe ;
   private short A2165HisEmpLin ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private int Gx_OldLine ;
   private long A2160HisEmpAlbD ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A2169HisEmpMu ;
   private java.math.BigDecimal A2168HisEmpMe ;
   private java.math.BigDecimal A2164HisEmpKu ;
   private java.math.BigDecimal A2163HisEmpKe ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A841TrnNom ;
   private String A56AlbRUni ;
   private String A971ProceNom ;
   private String A279CliNom ;
   private String A55AlbRReo ;
   private String A50AlbRLoc ;
   private String A46AlbREnt ;
   private String A45AlbRef ;
   private String A1291AlbRDes ;
   private String Gx_time ;
   private String A2173HisEmpSd ;
   private String A2166HisEmpLTip ;
   private String A1300AlbRObs ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date Gx_date ;
   private java.util.Date A2161HisEmpFMov ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n971ProceNom ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n2173HisEmpSd ;
   private boolean n2172HisEmpPu ;
   private boolean n2171HisEmpPe ;
   private boolean n2169HisEmpMu ;
   private boolean n2168HisEmpMe ;
   private boolean n2164HisEmpKu ;
   private boolean n2163HisEmpKe ;
   private boolean n2161HisEmpFMov ;
   private boolean n2160HisEmpAlbD ;
   private boolean n2166HisEmpLTip ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P06TV2_A396EmprCod ;
   private int[] P06TV2_A44AlbRecCod ;
   private String[] P06TV2_A407EmprNom ;
   private boolean[] P06TV2_n407EmprNom ;
   private String[] P06TV2_A841TrnNom ;
   private boolean[] P06TV2_n841TrnNom ;
   private String[] P06TV2_A56AlbRUni ;
   private String[] P06TV2_A971ProceNom ;
   private boolean[] P06TV2_n971ProceNom ;
   private String[] P06TV2_A279CliNom ;
   private short[] P06TV2_A840TrnCod ;
   private boolean[] P06TV2_n840TrnCod ;
   private short[] P06TV2_A970ProceCod ;
   private boolean[] P06TV2_n970ProceCod ;
   private int[] P06TV2_A252CliCod ;
   private String[] P06TV2_A55AlbRReo ;
   private String[] P06TV2_A50AlbRLoc ;
   private java.util.Date[] P06TV2_A49AlbRFen ;
   private java.util.Date[] P06TV2_A48AlbRFecUlt ;
   private byte[] P06TV2_A47AlbREst ;
   private String[] P06TV2_A46AlbREnt ;
   private String[] P06TV2_A45AlbRef ;
   private String[] P06TV2_A1291AlbRDes ;
   private int[] P06TV2_A54AlbRPieUti ;
   private int[] P06TV2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P06TV2_A60AlbRUniUti ;
   private java.math.BigDecimal[] P06TV2_A58AlbRUniEnt ;
   private String[] P06TV3_A396EmprCod ;
   private int[] P06TV3_A44AlbRecCod ;
   private String[] P06TV3_A2173HisEmpSd ;
   private boolean[] P06TV3_n2173HisEmpSd ;
   private short[] P06TV3_A2172HisEmpPu ;
   private boolean[] P06TV3_n2172HisEmpPu ;
   private short[] P06TV3_A2171HisEmpPe ;
   private boolean[] P06TV3_n2171HisEmpPe ;
   private java.math.BigDecimal[] P06TV3_A2169HisEmpMu ;
   private boolean[] P06TV3_n2169HisEmpMu ;
   private java.math.BigDecimal[] P06TV3_A2168HisEmpMe ;
   private boolean[] P06TV3_n2168HisEmpMe ;
   private java.math.BigDecimal[] P06TV3_A2164HisEmpKu ;
   private boolean[] P06TV3_n2164HisEmpKu ;
   private java.math.BigDecimal[] P06TV3_A2163HisEmpKe ;
   private boolean[] P06TV3_n2163HisEmpKe ;
   private java.util.Date[] P06TV3_A2161HisEmpFMov ;
   private boolean[] P06TV3_n2161HisEmpFMov ;
   private long[] P06TV3_A2160HisEmpAlbD ;
   private boolean[] P06TV3_n2160HisEmpAlbD ;
   private String[] P06TV3_A2166HisEmpLTip ;
   private boolean[] P06TV3_n2166HisEmpLTip ;
   private short[] P06TV3_A2165HisEmpLin ;
   private String[] P06TV4_A396EmprCod ;
   private int[] P06TV4_A44AlbRecCod ;
   private String[] P06TV4_A1300AlbRObs ;
   private byte[] P06TV4_A1299AlbRLin ;
}

final  class rimhemp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06TV2", "SELECT T1.EmprCod, T1.AlbRecCod, T2.EmprNom, T4.TrnNom, T1.AlbRUni, T5.ProceNom, T3.CliNom, T1.TrnCod, T1.ProceCod, T1.CliCod, T1.AlbRReo, T1.AlbRLoc, T1.AlbRFen, T1.AlbRFecUlt, T1.AlbREst, T1.AlbREnt, T1.AlbRef, T1.AlbRDes, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt FROM ((((TXPALBREC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod AND T5.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06TV3", "SELECT EmprCod, AlbRecCod, HisEmpSd, HisEmpPu, HisEmpPe, HisEmpMu, HisEmpMe, HisEmpKu, HisEmpKe, HisEmpFMov, HisEmpAlbD, HisEmpLTip, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06TV4", "SELECT EmprCod, AlbRecCod, AlbRObs, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 2);
               ((String[]) buf[16])[0] = rslt.getString(12, 10);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(14);
               ((byte[]) buf[19])[0] = rslt.getByte(15);
               ((String[]) buf[20])[0] = rslt.getString(16, 8);
               ((String[]) buf[21])[0] = rslt.getString(17, 16);
               ((String[]) buf[22])[0] = rslt.getString(18, 20);
               ((int[]) buf[23])[0] = rslt.getInt(19);
               ((int[]) buf[24])[0] = rslt.getInt(20);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(13);
               return;
            case 2 :
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
      }
   }

}

