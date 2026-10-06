package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rficteca extends GXReport
{
   public rficteca( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rficteca.class ), "" );
   }

   public rficteca( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      rficteca.this.aP2 = new String[] {""};
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
      rficteca.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rficteca.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      rficteca.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 1 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("FICHA TECNICA ARTICULO") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P07EA2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A69ArtDsc = P07EA2_A69ArtDsc[0] ;
            n69ArtDsc = P07EA2_n69ArtDsc[0] ;
            A4354ArtFecMod = P07EA2_A4354ArtFecMod[0] ;
            n4354ArtFecMod = P07EA2_n4354ArtFecMod[0] ;
            A4353ArtUsrCod = P07EA2_A4353ArtUsrCod[0] ;
            n4353ArtUsrCod = P07EA2_n4353ArtUsrCod[0] ;
            A4454ArtLotKgs = P07EA2_A4454ArtLotKgs[0] ;
            n4454ArtLotKgs = P07EA2_n4454ArtLotKgs[0] ;
            A279CliNom = P07EA2_A279CliNom[0] ;
            A116ArtUrdP3 = P07EA2_A116ArtUrdP3[0] ;
            n116ArtUrdP3 = P07EA2_n116ArtUrdP3[0] ;
            A115ArtUrdP2 = P07EA2_A115ArtUrdP2[0] ;
            n115ArtUrdP2 = P07EA2_n115ArtUrdP2[0] ;
            A114ArtUrdP1 = P07EA2_A114ArtUrdP1[0] ;
            n114ArtUrdP1 = P07EA2_n114ArtUrdP1[0] ;
            A113ArtUrd3 = P07EA2_A113ArtUrd3[0] ;
            n113ArtUrd3 = P07EA2_n113ArtUrd3[0] ;
            A112ArtUrd2 = P07EA2_A112ArtUrd2[0] ;
            n112ArtUrd2 = P07EA2_n112ArtUrd2[0] ;
            A111ArtUrd1 = P07EA2_A111ArtUrd1[0] ;
            n111ArtUrd1 = P07EA2_n111ArtUrd1[0] ;
            A110ArtTraP3 = P07EA2_A110ArtTraP3[0] ;
            n110ArtTraP3 = P07EA2_n110ArtTraP3[0] ;
            A109ArtTraP2 = P07EA2_A109ArtTraP2[0] ;
            n109ArtTraP2 = P07EA2_n109ArtTraP2[0] ;
            A108ArtTraP1 = P07EA2_A108ArtTraP1[0] ;
            n108ArtTraP1 = P07EA2_n108ArtTraP1[0] ;
            A107ArtTra3 = P07EA2_A107ArtTra3[0] ;
            n107ArtTra3 = P07EA2_n107ArtTra3[0] ;
            A106ArtTra2 = P07EA2_A106ArtTra2[0] ;
            n106ArtTra2 = P07EA2_n106ArtTra2[0] ;
            A105ArtTra1 = P07EA2_A105ArtTra1[0] ;
            n105ArtTra1 = P07EA2_n105ArtTra1[0] ;
            A830TipArtDsc = P07EA2_A830TipArtDsc[0] ;
            n830TipArtDsc = P07EA2_n830TipArtDsc[0] ;
            A829TipArtCod = P07EA2_A829TipArtCod[0] ;
            A1148ArtPml = P07EA2_A1148ArtPml[0] ;
            n1148ArtPml = P07EA2_n1148ArtPml[0] ;
            A7415ArtPmlCru = P07EA2_A7415ArtPmlCru[0] ;
            n7415ArtPmlCru = P07EA2_n7415ArtPmlCru[0] ;
            A78ArtGraCru = P07EA2_A78ArtGraCru[0] ;
            n78ArtGraCru = P07EA2_n78ArtGraCru[0] ;
            A68ArtCruMin = P07EA2_A68ArtCruMin[0] ;
            n68ArtCruMin = P07EA2_n68ArtCruMin[0] ;
            A2834ArtPle2 = P07EA2_A2834ArtPle2[0] ;
            n2834ArtPle2 = P07EA2_n2834ArtPle2[0] ;
            A101ArtTipPle = P07EA2_A101ArtTipPle[0] ;
            n101ArtTipPle = P07EA2_n101ArtTipPle[0] ;
            A95ArtRen = P07EA2_A95ArtRen[0] ;
            n95ArtRen = P07EA2_n95ArtRen[0] ;
            A66ArtCorOri = P07EA2_A66ArtCorOri[0] ;
            n66ArtCorOri = P07EA2_n66ArtCorOri[0] ;
            A70ArtEncOri = P07EA2_A70ArtEncOri[0] ;
            n70ArtEncOri = P07EA2_n70ArtEncOri[0] ;
            A1229ArtEncCom = P07EA2_A1229ArtEncCom[0] ;
            n1229ArtEncCom = P07EA2_n1229ArtEncCom[0] ;
            A1230ArtEncAnh = P07EA2_A1230ArtEncAnh[0] ;
            n1230ArtEncAnh = P07EA2_n1230ArtEncAnh[0] ;
            A63ArtAcaMin = P07EA2_A63ArtAcaMin[0] ;
            n63ArtAcaMin = P07EA2_n63ArtAcaMin[0] ;
            A1903ArtGraAca = P07EA2_A1903ArtGraAca[0] ;
            n1903ArtGraAca = P07EA2_n1903ArtGraAca[0] ;
            A6953Mat_Maq = P07EA2_A6953Mat_Maq[0] ;
            n6953Mat_Maq = P07EA2_n6953Mat_Maq[0] ;
            A830TipArtDsc = P07EA2_A830TipArtDsc[0] ;
            n830TipArtDsc = P07EA2_n830TipArtDsc[0] ;
            A279CliNom = P07EA2_A279CliNom[0] ;
            h7EA0( false, 105) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "b9b07101-53c6-4727-a297-130942c259c2", "", context.getHttpContext().getTheme( )), 35, Gx_line+4, 340, Gx_line+101) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FICHA TECNICA DE ARTICULO -", ""), 398, Gx_line+43, 680, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A69ArtDsc, "")), 689, Gx_line+44, 961, Gx_line+64, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+105) ;
            h7EA0( false, 65) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 49, Gx_line+17, 95, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 101, Gx_line+16, 146, Gx_line+33, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 152, Gx_line+16, 372, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo:", ""), 50, Gx_line+43, 100, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A65ArtCod, "")), 103, Gx_line+42, 221, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A69ArtDsc, "")), 228, Gx_line+42, 419, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(35, Gx_line+9, 1057, Gx_line+63, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Version", ""), 797, Gx_line+43, 842, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 889, Gx_line+42, 948, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 956, Gx_line+42, 1015, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Numero Ficha Tecnica:", ""), 797, Gx_line+16, 936, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4454ArtLotKgs, "ZZZZZ9.99")), 949, Gx_line+16, 1016, Gx_line+33, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario:", ""), 494, Gx_line+17, 544, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4353ArtUsrCod, "")), 549, Gx_line+16, 608, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A4354ArtFecMod, "99/99/9999"), 618, Gx_line+16, 692, Gx_line+33, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+65) ;
            h7EA0( false, 283) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, true, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Datos Acabado", ""), 50, Gx_line+19, 142, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Grm2 Acabado:", ""), 50, Gx_line+45, 142, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1903ArtGraAca), "ZZZ9")), 142, Gx_line+44, 172, Gx_line+61, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho Acabado:", ""), 185, Gx_line+45, 284, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A63ArtAcaMin), "ZZ9")), 291, Gx_line+44, 314, Gx_line+61, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Encogimiento Ancho:", ""), 421, Gx_line+45, 547, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Encogimiento Largo:", ""), 619, Gx_line+45, 741, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1230ArtEncAnh), "ZZZ9")), 550, Gx_line+44, 580, Gx_line+61, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1229ArtEncCom), "ZZZ9")), 743, Gx_line+44, 773, Gx_line+61, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Encolar Orillos:", ""), 50, Gx_line+71, 141, Gx_line+85, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Engomar Orillos:", ""), 185, Gx_line+71, 282, Gx_line+85, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A70ArtEncOri, "@!")), 142, Gx_line+70, 150, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A66ArtCorOri, "@!")), 288, Gx_line+70, 296, Gx_line+87, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Rendimiento:", ""), 50, Gx_line+97, 128, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A95ArtRen, "ZZ9.99")), 133, Gx_line+96, 178, Gx_line+113, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Plegado:", ""), 189, Gx_line+97, 272, Gx_line+111, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A101ArtTipPle, "")), 279, Gx_line+96, 353, Gx_line+113, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2834ArtPle2, "")), 358, Gx_line+96, 578, Gx_line+113, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, true, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Datos Crudo", ""), 50, Gx_line+129, 124, Gx_line+143, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Grm2 Crudo:", ""), 50, Gx_line+156, 124, Gx_line+170, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ancho Crudo:", ""), 171, Gx_line+156, 252, Gx_line+170, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A68ArtCruMin), "ZZ9")), 276, Gx_line+155, 299, Gx_line+172, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A78ArtGraCru), "ZZZ9")), 127, Gx_line+155, 157, Gx_line+172, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pml:", ""), 318, Gx_line+156, 344, Gx_line+170, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7415ArtPmlCru), "ZZZ9")), 350, Gx_line+155, 380, Gx_line+172, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pml:", ""), 332, Gx_line+45, 358, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1148ArtPml), "ZZZ9")), 365, Gx_line+44, 395, Gx_line+61, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(35, Gx_line+39, 1073, Gx_line+120, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(35, Gx_line+151, 1073, Gx_line+177, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, true, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Composicion", ""), 50, Gx_line+188, 125, Gx_line+202, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo Articulo:", ""), 50, Gx_line+215, 130, Gx_line+229, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A829TipArtCod), "ZZZ9")), 144, Gx_line+214, 174, Gx_line+231, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A830TipArtDsc, "")), 177, Gx_line+214, 397, Gx_line+231, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A105ArtTra1, "")), 59, Gx_line+239, 89, Gx_line+256, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A106ArtTra2, "")), 150, Gx_line+239, 180, Gx_line+256, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A107ArtTra3, "")), 231, Gx_line+239, 261, Gx_line+256, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A108ArtTraP1), "ZZ9")), 98, Gx_line+239, 121, Gx_line+256, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A109ArtTraP2), "ZZ9")), 184, Gx_line+239, 207, Gx_line+256, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A110ArtTraP3), "ZZ9")), 268, Gx_line+239, 291, Gx_line+256, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 125, Gx_line+240, 135, Gx_line+254, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 209, Gx_line+240, 219, Gx_line+254, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 294, Gx_line+240, 304, Gx_line+254, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A111ArtUrd1, "")), 59, Gx_line+257, 89, Gx_line+274, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A112ArtUrd2, "")), 150, Gx_line+257, 180, Gx_line+274, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A113ArtUrd3, "")), 231, Gx_line+257, 261, Gx_line+274, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A114ArtUrdP1), "ZZ9")), 98, Gx_line+257, 121, Gx_line+274, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A115ArtUrdP2), "ZZ9")), 184, Gx_line+257, 207, Gx_line+274, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A116ArtUrdP3), "ZZ9")), 268, Gx_line+257, 291, Gx_line+274, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("%", 125, Gx_line+258, 135, Gx_line+272, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 209, Gx_line+258, 219, Gx_line+272, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 294, Gx_line+258, 304, Gx_line+272, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(35, Gx_line+206, 1073, Gx_line+279, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+283) ;
            h7EA0( false, 53) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, true, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Datos Tejeduria", ""), 45, Gx_line+6, 140, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Linea", ""), 45, Gx_line+28, 78, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Estructura", ""), 85, Gx_line+28, 146, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Materiales", ""), 239, Gx_line+28, 300, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Trs", ""), 479, Gx_line+28, 499, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 504, Gx_line+28, 535, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 604, Gx_line+28, 665, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 870, Gx_line+28, 897, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("%", 990, Gx_line+28, 1000, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "LM", ""), 1051, Gx_line+28, 1070, Gx_line+42, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(45, Gx_line+46, 78, Gx_line+46, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(85, Gx_line+46, 231, Gx_line+46, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(239, Gx_line+46, 469, Gx_line+46, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(479, Gx_line+46, 499, Gx_line+46, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(504, Gx_line+46, 599, Gx_line+46, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(604, Gx_line+46, 855, Gx_line+46, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(870, Gx_line+46, 967, Gx_line+46, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(973, Gx_line+46, 1017, Gx_line+46, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1033, Gx_line+46, 1069, Gx_line+46, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6953Mat_Maq, "")), 200, Gx_line+4, 347, Gx_line+21, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+53) ;
            /* Using cursor P07EA3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A6963Mat_LM = P07EA3_A6963Mat_LM[0] ;
               n6963Mat_LM = P07EA3_n6963Mat_LM[0] ;
               A6962Mat_Porc = P07EA3_A6962Mat_Porc[0] ;
               n6962Mat_Porc = P07EA3_n6962Mat_Porc[0] ;
               A6961Mat_Lote = P07EA3_A6961Mat_Lote[0] ;
               n6961Mat_Lote = P07EA3_n6961Mat_Lote[0] ;
               A6960Mat_ProvN = P07EA3_A6960Mat_ProvN[0] ;
               n6960Mat_ProvN = P07EA3_n6960Mat_ProvN[0] ;
               A6958Mat_NomCol = P07EA3_A6958Mat_NomCol[0] ;
               n6958Mat_NomCol = P07EA3_n6958Mat_NomCol[0] ;
               A6957Mat_Tors = P07EA3_A6957Mat_Tors[0] ;
               n6957Mat_Tors = P07EA3_n6957Mat_Tors[0] ;
               A6956Mat_Mate = P07EA3_A6956Mat_Mate[0] ;
               n6956Mat_Mate = P07EA3_n6956Mat_Mate[0] ;
               A6955Mat_Estr = P07EA3_A6955Mat_Estr[0] ;
               n6955Mat_Estr = P07EA3_n6955Mat_Estr[0] ;
               A6954Mat_lin = P07EA3_A6954Mat_lin[0] ;
               h7EA0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6954Mat_lin), "ZZZ9")), 45, Gx_line+0, 75, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6955Mat_Estr, "")), 85, Gx_line+1, 232, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6956Mat_Mate, "")), 239, Gx_line+0, 469, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6957Mat_Tors, "")), 482, Gx_line+1, 498, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6958Mat_NomCol, "")), 504, Gx_line+1, 600, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6960Mat_ProvN, "")), 604, Gx_line+0, 855, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6961Mat_Lote, "")), 870, Gx_line+0, 967, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6962Mat_Porc, "ZZ9.99")), 973, Gx_line+0, 1018, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6963Mat_LM, "Z9.99")), 1033, Gx_line+1, 1070, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            h7EA0( false, 44) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, true, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Datos Fase Teñido", ""), 45, Gx_line+8, 157, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Linea", ""), 45, Gx_line+26, 78, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 94, Gx_line+26, 123, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Parametro", ""), 374, Gx_line+26, 434, Gx_line+40, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(374, Gx_line+41, 628, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(165, Gx_line+41, 369, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(94, Gx_line+41, 152, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(45, Gx_line+41, 78, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 639, Gx_line+22, 670, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(639, Gx_line+41, 697, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(709, Gx_line+41, 1092, Gx_line+41, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 708, Gx_line+22, 797, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 165, Gx_line+26, 236, Gx_line+40, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+44) ;
            /* Using cursor P07EA4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A7113ParFasObst = P07EA4_A7113ParFasObst[0] ;
               n7113ParFasObst = P07EA4_n7113ParFasObst[0] ;
               A7112ParFasValt = P07EA4_A7112ParFasValt[0] ;
               n7112ParFasValt = P07EA4_n7112ParFasValt[0] ;
               A1665ParFasDsc = P07EA4_A1665ParFasDsc[0] ;
               n1665ParFasDsc = P07EA4_n1665ParFasDsc[0] ;
               A1664ParFasCod = P07EA4_A1664ParFasCod[0] ;
               A7111FasDsct = P07EA4_A7111FasDsct[0] ;
               A7110FasCodt = P07EA4_A7110FasCodt[0] ;
               n7110FasCodt = P07EA4_n7110FasCodt[0] ;
               A7135Lin_fast = P07EA4_A7135Lin_fast[0] ;
               A1665ParFasDsc = P07EA4_A1665ParFasDsc[0] ;
               n1665ParFasDsc = P07EA4_n1665ParFasDsc[0] ;
               A7110FasCodt = P07EA4_A7110FasCodt[0] ;
               n7110FasCodt = P07EA4_n7110FasCodt[0] ;
               A7111FasDsct = P07EA4_A7111FasDsct[0] ;
               h7EA0( false, 16) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7135Lin_fast), "ZZZ9")), 45, Gx_line+0, 75, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7110FasCodt, "@!")), 94, Gx_line+0, 153, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7111FasDsct, "")), 165, Gx_line+0, 370, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9")), 374, Gx_line+0, 404, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1665ParFasDsc, "")), 415, Gx_line+0, 635, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7112ParFasValt, "")), 639, Gx_line+0, 698, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7113ParFasObst, "")), 709, Gx_line+0, 1092, Gx_line+16, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Eject command */
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(P_lines+1) ;
            /* Using cursor P07EA5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A758ProCod = P07EA5_A758ProCod[0] ;
               A759ProDsc = P07EA5_A759ProDsc[0] ;
               A759ProDsc = P07EA5_A759ProDsc[0] ;
               h7EA0( false, 35) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, true, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Proceso Produccion", ""), 31, Gx_line+0, 151, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 30, Gx_line+19, 59, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 133, Gx_line+19, 204, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(30, Gx_line+32, 123, Gx_line+32, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(133, Gx_line+32, 337, Gx_line+32, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Parametro", ""), 377, Gx_line+20, 437, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(377, Gx_line+32, 620, Gx_line+32, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 641, Gx_line+20, 672, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(641, Gx_line+32, 699, Gx_line+32, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 164, Gx_line+0, 223, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 231, Gx_line+0, 524, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+35) ;
               AV8Si_lineas = (byte)(0) ;
               /* Using cursor P07EA6 */
               pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A774ProNumLin = P07EA6_A774ProNumLin[0] ;
                  A460FasDsc = P07EA6_A460FasDsc[0] ;
                  A457FasCod = P07EA6_A457FasCod[0] ;
                  A460FasDsc = P07EA6_A460FasDsc[0] ;
                  h7EA0( false, 20) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A774ProNumLin), "ZZZ9")), 30, Gx_line+1, 60, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 65, Gx_line+1, 124, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 133, Gx_line+1, 338, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+20) ;
                  AV9Obs_f = (byte)(0) ;
                  AV22GXLvl31 = (byte)(0) ;
                  /* Using cursor P07EA7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, Short.valueOf(A774ProNumLin)});
                  while ( (pr_default.getStatus(5) != 101) )
                  {
                     A6986NumLinPro = P07EA7_A6986NumLinPro[0] ;
                     A8328ParFasObsm = P07EA7_A8328ParFasObsm[0] ;
                     n8328ParFasObsm = P07EA7_n8328ParFasObsm[0] ;
                     A1664ParFasCod = P07EA7_A1664ParFasCod[0] ;
                     A1665ParFasDsc = P07EA7_A1665ParFasDsc[0] ;
                     n1665ParFasDsc = P07EA7_n1665ParFasDsc[0] ;
                     A6989ParFasValp = P07EA7_A6989ParFasValp[0] ;
                     n6989ParFasValp = P07EA7_n6989ParFasValp[0] ;
                     A1665ParFasDsc = P07EA7_A1665ParFasDsc[0] ;
                     n1665ParFasDsc = P07EA7_n1665ParFasDsc[0] ;
                     A8328ParFasObsm = P07EA7_A8328ParFasObsm[0] ;
                     n8328ParFasObsm = P07EA7_n8328ParFasObsm[0] ;
                     AV22GXLvl31 = (byte)(1) ;
                     if ( ( AV9Obs_f == 0 ) && ( GXutil.strcmp(A8328ParFasObsm, " ") != 0 ) )
                     {
                        AV9Obs_f = (byte)(1) ;
                        AV11x = (short)(1) ;
                        AV10Nlin = (short)(GXutil.gxmlines( A8328ParFasObsm, (short)(100))) ;
                        while ( AV11x <= AV10Nlin )
                        {
                           if ( AV11x == 1 )
                           {
                              h7EA0( false, 17) ;
                              getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, true, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
                              getPrinter().GxDrawText(httpContext.getMessage( "Observaciones Fase", ""), 30, Gx_line+1, 151, Gx_line+15, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                           }
                           AV12Obsf = GXutil.gxgetmli( A8328ParFasObsm, AV11x, (short)(100)) ;
                           h7EA0( false, 19) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Obsf, "")), 30, Gx_line+0, 760, Gx_line+17, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+19) ;
                           AV11x = (short)(AV11x+1) ;
                        }
                     }
                     else
                     {
                        /* Noskip command */
                        Gx_line = Gx_OldLine ;
                     }
                     AV8Si_lineas = (byte)(1) ;
                     if ( ( A1664ParFasCod == 7 ) || ( A1664ParFasCod == 20 ) )
                     {
                        h7EA0( false, 20) ;
                        getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9")), 377, Gx_line+1, 407, Gx_line+19, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6989ParFasValp, "")), 641, Gx_line+0, 700, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1665ParFasDsc, "")), 411, Gx_line+1, 631, Gx_line+19, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+20) ;
                     }
                     else
                     {
                        h7EA0( false, 19) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9")), 377, Gx_line+1, 407, Gx_line+18, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6989ParFasValp, "")), 641, Gx_line+0, 700, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1665ParFasDsc, "")), 411, Gx_line+1, 631, Gx_line+18, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+19) ;
                     }
                     pr_default.readNext(5);
                  }
                  pr_default.close(5);
                  if ( AV22GXLvl31 == 0 )
                  {
                     h7EA0( false, 17) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                     AV8Si_lineas = (byte)(1) ;
                  }
                  if ( AV8Si_lineas == 1 )
                  {
                     h7EA0( false, 4) ;
                     getPrinter().GxDrawLine(30, Gx_line+0, 699, Gx_line+0, 2, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+4) ;
                  }
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               pr_default.readNext(3);
            }
            pr_default.close(3);
            h7EA0( false, 88) ;
            getPrinter().GxDrawRect(30, Gx_line+8, 1068, Gx_line+81, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DIRECTOR TECNICO", ""), 80, Gx_line+22, 208, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DESARROLLO TEXTIL", ""), 828, Gx_line+22, 964, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(80, Gx_line+64, 264, Gx_line+64, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(828, Gx_line+64, 1012, Gx_line+64, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+88) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7EA0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h7EA0( boolean bFoot ,
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
      this.aP0[0] = rficteca.this.A396EmprCod;
      this.aP1[0] = rficteca.this.A252CliCod;
      this.aP2[0] = rficteca.this.A65ArtCod;
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
      P07EA2_A396EmprCod = new String[] {""} ;
      P07EA2_A252CliCod = new int[1] ;
      P07EA2_A65ArtCod = new String[] {""} ;
      P07EA2_A69ArtDsc = new String[] {""} ;
      P07EA2_n69ArtDsc = new boolean[] {false} ;
      P07EA2_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P07EA2_n4354ArtFecMod = new boolean[] {false} ;
      P07EA2_A4353ArtUsrCod = new String[] {""} ;
      P07EA2_n4353ArtUsrCod = new boolean[] {false} ;
      P07EA2_A4454ArtLotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EA2_n4454ArtLotKgs = new boolean[] {false} ;
      P07EA2_A279CliNom = new String[] {""} ;
      P07EA2_A116ArtUrdP3 = new short[1] ;
      P07EA2_n116ArtUrdP3 = new boolean[] {false} ;
      P07EA2_A115ArtUrdP2 = new short[1] ;
      P07EA2_n115ArtUrdP2 = new boolean[] {false} ;
      P07EA2_A114ArtUrdP1 = new short[1] ;
      P07EA2_n114ArtUrdP1 = new boolean[] {false} ;
      P07EA2_A113ArtUrd3 = new String[] {""} ;
      P07EA2_n113ArtUrd3 = new boolean[] {false} ;
      P07EA2_A112ArtUrd2 = new String[] {""} ;
      P07EA2_n112ArtUrd2 = new boolean[] {false} ;
      P07EA2_A111ArtUrd1 = new String[] {""} ;
      P07EA2_n111ArtUrd1 = new boolean[] {false} ;
      P07EA2_A110ArtTraP3 = new short[1] ;
      P07EA2_n110ArtTraP3 = new boolean[] {false} ;
      P07EA2_A109ArtTraP2 = new short[1] ;
      P07EA2_n109ArtTraP2 = new boolean[] {false} ;
      P07EA2_A108ArtTraP1 = new short[1] ;
      P07EA2_n108ArtTraP1 = new boolean[] {false} ;
      P07EA2_A107ArtTra3 = new String[] {""} ;
      P07EA2_n107ArtTra3 = new boolean[] {false} ;
      P07EA2_A106ArtTra2 = new String[] {""} ;
      P07EA2_n106ArtTra2 = new boolean[] {false} ;
      P07EA2_A105ArtTra1 = new String[] {""} ;
      P07EA2_n105ArtTra1 = new boolean[] {false} ;
      P07EA2_A830TipArtDsc = new String[] {""} ;
      P07EA2_n830TipArtDsc = new boolean[] {false} ;
      P07EA2_A829TipArtCod = new short[1] ;
      P07EA2_A1148ArtPml = new short[1] ;
      P07EA2_n1148ArtPml = new boolean[] {false} ;
      P07EA2_A7415ArtPmlCru = new short[1] ;
      P07EA2_n7415ArtPmlCru = new boolean[] {false} ;
      P07EA2_A78ArtGraCru = new short[1] ;
      P07EA2_n78ArtGraCru = new boolean[] {false} ;
      P07EA2_A68ArtCruMin = new short[1] ;
      P07EA2_n68ArtCruMin = new boolean[] {false} ;
      P07EA2_A2834ArtPle2 = new String[] {""} ;
      P07EA2_n2834ArtPle2 = new boolean[] {false} ;
      P07EA2_A101ArtTipPle = new String[] {""} ;
      P07EA2_n101ArtTipPle = new boolean[] {false} ;
      P07EA2_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EA2_n95ArtRen = new boolean[] {false} ;
      P07EA2_A66ArtCorOri = new String[] {""} ;
      P07EA2_n66ArtCorOri = new boolean[] {false} ;
      P07EA2_A70ArtEncOri = new String[] {""} ;
      P07EA2_n70ArtEncOri = new boolean[] {false} ;
      P07EA2_A1229ArtEncCom = new short[1] ;
      P07EA2_n1229ArtEncCom = new boolean[] {false} ;
      P07EA2_A1230ArtEncAnh = new short[1] ;
      P07EA2_n1230ArtEncAnh = new boolean[] {false} ;
      P07EA2_A63ArtAcaMin = new short[1] ;
      P07EA2_n63ArtAcaMin = new boolean[] {false} ;
      P07EA2_A1903ArtGraAca = new short[1] ;
      P07EA2_n1903ArtGraAca = new boolean[] {false} ;
      P07EA2_A6953Mat_Maq = new String[] {""} ;
      P07EA2_n6953Mat_Maq = new boolean[] {false} ;
      A69ArtDsc = "" ;
      A4354ArtFecMod = GXutil.nullDate() ;
      A4353ArtUsrCod = "" ;
      A4454ArtLotKgs = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A113ArtUrd3 = "" ;
      A112ArtUrd2 = "" ;
      A111ArtUrd1 = "" ;
      A107ArtTra3 = "" ;
      A106ArtTra2 = "" ;
      A105ArtTra1 = "" ;
      A830TipArtDsc = "" ;
      A2834ArtPle2 = "" ;
      A101ArtTipPle = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A66ArtCorOri = "" ;
      A70ArtEncOri = "" ;
      A6953Mat_Maq = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      P07EA3_A396EmprCod = new String[] {""} ;
      P07EA3_A252CliCod = new int[1] ;
      P07EA3_A65ArtCod = new String[] {""} ;
      P07EA3_A6963Mat_LM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EA3_n6963Mat_LM = new boolean[] {false} ;
      P07EA3_A6962Mat_Porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07EA3_n6962Mat_Porc = new boolean[] {false} ;
      P07EA3_A6961Mat_Lote = new String[] {""} ;
      P07EA3_n6961Mat_Lote = new boolean[] {false} ;
      P07EA3_A6960Mat_ProvN = new String[] {""} ;
      P07EA3_n6960Mat_ProvN = new boolean[] {false} ;
      P07EA3_A6958Mat_NomCol = new String[] {""} ;
      P07EA3_n6958Mat_NomCol = new boolean[] {false} ;
      P07EA3_A6957Mat_Tors = new String[] {""} ;
      P07EA3_n6957Mat_Tors = new boolean[] {false} ;
      P07EA3_A6956Mat_Mate = new String[] {""} ;
      P07EA3_n6956Mat_Mate = new boolean[] {false} ;
      P07EA3_A6955Mat_Estr = new String[] {""} ;
      P07EA3_n6955Mat_Estr = new boolean[] {false} ;
      P07EA3_A6954Mat_lin = new short[1] ;
      A6963Mat_LM = DecimalUtil.ZERO ;
      A6962Mat_Porc = DecimalUtil.ZERO ;
      A6961Mat_Lote = "" ;
      A6960Mat_ProvN = "" ;
      A6958Mat_NomCol = "" ;
      A6957Mat_Tors = "" ;
      A6956Mat_Mate = "" ;
      A6955Mat_Estr = "" ;
      P07EA4_A396EmprCod = new String[] {""} ;
      P07EA4_A252CliCod = new int[1] ;
      P07EA4_A65ArtCod = new String[] {""} ;
      P07EA4_A7113ParFasObst = new String[] {""} ;
      P07EA4_n7113ParFasObst = new boolean[] {false} ;
      P07EA4_A7112ParFasValt = new String[] {""} ;
      P07EA4_n7112ParFasValt = new boolean[] {false} ;
      P07EA4_A1665ParFasDsc = new String[] {""} ;
      P07EA4_n1665ParFasDsc = new boolean[] {false} ;
      P07EA4_A1664ParFasCod = new short[1] ;
      P07EA4_A7111FasDsct = new String[] {""} ;
      P07EA4_A7110FasCodt = new String[] {""} ;
      P07EA4_n7110FasCodt = new boolean[] {false} ;
      P07EA4_A7135Lin_fast = new short[1] ;
      A7113ParFasObst = "" ;
      A7112ParFasValt = "" ;
      A1665ParFasDsc = "" ;
      A7111FasDsct = "" ;
      A7110FasCodt = "" ;
      P07EA5_A396EmprCod = new String[] {""} ;
      P07EA5_A252CliCod = new int[1] ;
      P07EA5_A65ArtCod = new String[] {""} ;
      P07EA5_A758ProCod = new String[] {""} ;
      P07EA5_A759ProDsc = new String[] {""} ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      P07EA6_A396EmprCod = new String[] {""} ;
      P07EA6_A758ProCod = new String[] {""} ;
      P07EA6_A774ProNumLin = new short[1] ;
      P07EA6_A460FasDsc = new String[] {""} ;
      P07EA6_A457FasCod = new String[] {""} ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      P07EA7_A396EmprCod = new String[] {""} ;
      P07EA7_A252CliCod = new int[1] ;
      P07EA7_A65ArtCod = new String[] {""} ;
      P07EA7_A758ProCod = new String[] {""} ;
      P07EA7_A6986NumLinPro = new short[1] ;
      P07EA7_A8328ParFasObsm = new String[] {""} ;
      P07EA7_n8328ParFasObsm = new boolean[] {false} ;
      P07EA7_A1664ParFasCod = new short[1] ;
      P07EA7_A1665ParFasDsc = new String[] {""} ;
      P07EA7_n1665ParFasDsc = new boolean[] {false} ;
      P07EA7_A6989ParFasValp = new String[] {""} ;
      P07EA7_n6989ParFasValp = new boolean[] {false} ;
      A8328ParFasObsm = "" ;
      A6989ParFasValp = "" ;
      AV12Obsf = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rficteca__default(),
         new Object[] {
             new Object[] {
            P07EA2_A396EmprCod, P07EA2_A252CliCod, P07EA2_A65ArtCod, P07EA2_A69ArtDsc, P07EA2_n69ArtDsc, P07EA2_A4354ArtFecMod, P07EA2_n4354ArtFecMod, P07EA2_A4353ArtUsrCod, P07EA2_n4353ArtUsrCod, P07EA2_A4454ArtLotKgs,
            P07EA2_n4454ArtLotKgs, P07EA2_A279CliNom, P07EA2_A116ArtUrdP3, P07EA2_n116ArtUrdP3, P07EA2_A115ArtUrdP2, P07EA2_n115ArtUrdP2, P07EA2_A114ArtUrdP1, P07EA2_n114ArtUrdP1, P07EA2_A113ArtUrd3, P07EA2_n113ArtUrd3,
            P07EA2_A112ArtUrd2, P07EA2_n112ArtUrd2, P07EA2_A111ArtUrd1, P07EA2_n111ArtUrd1, P07EA2_A110ArtTraP3, P07EA2_n110ArtTraP3, P07EA2_A109ArtTraP2, P07EA2_n109ArtTraP2, P07EA2_A108ArtTraP1, P07EA2_n108ArtTraP1,
            P07EA2_A107ArtTra3, P07EA2_n107ArtTra3, P07EA2_A106ArtTra2, P07EA2_n106ArtTra2, P07EA2_A105ArtTra1, P07EA2_n105ArtTra1, P07EA2_A830TipArtDsc, P07EA2_n830TipArtDsc, P07EA2_A829TipArtCod, P07EA2_A1148ArtPml,
            P07EA2_n1148ArtPml, P07EA2_A7415ArtPmlCru, P07EA2_n7415ArtPmlCru, P07EA2_A78ArtGraCru, P07EA2_n78ArtGraCru, P07EA2_A68ArtCruMin, P07EA2_n68ArtCruMin, P07EA2_A2834ArtPle2, P07EA2_n2834ArtPle2, P07EA2_A101ArtTipPle,
            P07EA2_n101ArtTipPle, P07EA2_A95ArtRen, P07EA2_n95ArtRen, P07EA2_A66ArtCorOri, P07EA2_n66ArtCorOri, P07EA2_A70ArtEncOri, P07EA2_n70ArtEncOri, P07EA2_A1229ArtEncCom, P07EA2_n1229ArtEncCom, P07EA2_A1230ArtEncAnh,
            P07EA2_n1230ArtEncAnh, P07EA2_A63ArtAcaMin, P07EA2_n63ArtAcaMin, P07EA2_A1903ArtGraAca, P07EA2_n1903ArtGraAca, P07EA2_A6953Mat_Maq, P07EA2_n6953Mat_Maq
            }
            , new Object[] {
            P07EA3_A396EmprCod, P07EA3_A252CliCod, P07EA3_A65ArtCod, P07EA3_A6963Mat_LM, P07EA3_n6963Mat_LM, P07EA3_A6962Mat_Porc, P07EA3_n6962Mat_Porc, P07EA3_A6961Mat_Lote, P07EA3_n6961Mat_Lote, P07EA3_A6960Mat_ProvN,
            P07EA3_n6960Mat_ProvN, P07EA3_A6958Mat_NomCol, P07EA3_n6958Mat_NomCol, P07EA3_A6957Mat_Tors, P07EA3_n6957Mat_Tors, P07EA3_A6956Mat_Mate, P07EA3_n6956Mat_Mate, P07EA3_A6955Mat_Estr, P07EA3_n6955Mat_Estr, P07EA3_A6954Mat_lin
            }
            , new Object[] {
            P07EA4_A396EmprCod, P07EA4_A252CliCod, P07EA4_A65ArtCod, P07EA4_A7113ParFasObst, P07EA4_n7113ParFasObst, P07EA4_A7112ParFasValt, P07EA4_n7112ParFasValt, P07EA4_A1665ParFasDsc, P07EA4_n1665ParFasDsc, P07EA4_A1664ParFasCod,
            P07EA4_A7111FasDsct, P07EA4_A7110FasCodt, P07EA4_n7110FasCodt, P07EA4_A7135Lin_fast
            }
            , new Object[] {
            P07EA5_A396EmprCod, P07EA5_A252CliCod, P07EA5_A65ArtCod, P07EA5_A758ProCod, P07EA5_A759ProDsc
            }
            , new Object[] {
            P07EA6_A396EmprCod, P07EA6_A758ProCod, P07EA6_A774ProNumLin, P07EA6_A460FasDsc, P07EA6_A457FasCod
            }
            , new Object[] {
            P07EA7_A396EmprCod, P07EA7_A252CliCod, P07EA7_A65ArtCod, P07EA7_A758ProCod, P07EA7_A6986NumLinPro, P07EA7_A8328ParFasObsm, P07EA7_n8328ParFasObsm, P07EA7_A1664ParFasCod, P07EA7_A1665ParFasDsc, P07EA7_n1665ParFasDsc,
            P07EA7_A6989ParFasValp, P07EA7_n6989ParFasValp
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV8Si_lineas ;
   private byte AV9Obs_f ;
   private byte AV22GXLvl31 ;
   private short A116ArtUrdP3 ;
   private short A115ArtUrdP2 ;
   private short A114ArtUrdP1 ;
   private short A110ArtTraP3 ;
   private short A109ArtTraP2 ;
   private short A108ArtTraP1 ;
   private short A829TipArtCod ;
   private short A1148ArtPml ;
   private short A7415ArtPmlCru ;
   private short A78ArtGraCru ;
   private short A68ArtCruMin ;
   private short A1229ArtEncCom ;
   private short A1230ArtEncAnh ;
   private short A63ArtAcaMin ;
   private short A1903ArtGraAca ;
   private short A6954Mat_lin ;
   private short A1664ParFasCod ;
   private short A7135Lin_fast ;
   private short A774ProNumLin ;
   private short A6986NumLinPro ;
   private short AV11x ;
   private short AV10Nlin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A4454ArtLotKgs ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal A6963Mat_LM ;
   private java.math.BigDecimal A6962Mat_Porc ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String scmdbuf ;
   private String A69ArtDsc ;
   private String A4353ArtUsrCod ;
   private String A279CliNom ;
   private String A113ArtUrd3 ;
   private String A112ArtUrd2 ;
   private String A111ArtUrd1 ;
   private String A107ArtTra3 ;
   private String A106ArtTra2 ;
   private String A105ArtTra1 ;
   private String A830TipArtDsc ;
   private String A2834ArtPle2 ;
   private String A101ArtTipPle ;
   private String A66ArtCorOri ;
   private String A70ArtEncOri ;
   private String A6953Mat_Maq ;
   private String Gx_time ;
   private String A6961Mat_Lote ;
   private String A6960Mat_ProvN ;
   private String A6958Mat_NomCol ;
   private String A6957Mat_Tors ;
   private String A6956Mat_Mate ;
   private String A6955Mat_Estr ;
   private String A7113ParFasObst ;
   private String A7112ParFasValt ;
   private String A1665ParFasDsc ;
   private String A7111FasDsct ;
   private String A7110FasCodt ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A6989ParFasValp ;
   private String AV12Obsf ;
   private java.util.Date A4354ArtFecMod ;
   private java.util.Date Gx_date ;
   private boolean n69ArtDsc ;
   private boolean n4354ArtFecMod ;
   private boolean n4353ArtUsrCod ;
   private boolean n4454ArtLotKgs ;
   private boolean n116ArtUrdP3 ;
   private boolean n115ArtUrdP2 ;
   private boolean n114ArtUrdP1 ;
   private boolean n113ArtUrd3 ;
   private boolean n112ArtUrd2 ;
   private boolean n111ArtUrd1 ;
   private boolean n110ArtTraP3 ;
   private boolean n109ArtTraP2 ;
   private boolean n108ArtTraP1 ;
   private boolean n107ArtTra3 ;
   private boolean n106ArtTra2 ;
   private boolean n105ArtTra1 ;
   private boolean n830TipArtDsc ;
   private boolean n1148ArtPml ;
   private boolean n7415ArtPmlCru ;
   private boolean n78ArtGraCru ;
   private boolean n68ArtCruMin ;
   private boolean n2834ArtPle2 ;
   private boolean n101ArtTipPle ;
   private boolean n95ArtRen ;
   private boolean n66ArtCorOri ;
   private boolean n70ArtEncOri ;
   private boolean n1229ArtEncCom ;
   private boolean n1230ArtEncAnh ;
   private boolean n63ArtAcaMin ;
   private boolean n1903ArtGraAca ;
   private boolean n6953Mat_Maq ;
   private boolean n6963Mat_LM ;
   private boolean n6962Mat_Porc ;
   private boolean n6961Mat_Lote ;
   private boolean n6960Mat_ProvN ;
   private boolean n6958Mat_NomCol ;
   private boolean n6957Mat_Tors ;
   private boolean n6956Mat_Mate ;
   private boolean n6955Mat_Estr ;
   private boolean n7113ParFasObst ;
   private boolean n7112ParFasValt ;
   private boolean n1665ParFasDsc ;
   private boolean n7110FasCodt ;
   private boolean n8328ParFasObsm ;
   private boolean n6989ParFasValp ;
   private String A8328ParFasObsm ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P07EA2_A396EmprCod ;
   private int[] P07EA2_A252CliCod ;
   private String[] P07EA2_A65ArtCod ;
   private String[] P07EA2_A69ArtDsc ;
   private boolean[] P07EA2_n69ArtDsc ;
   private java.util.Date[] P07EA2_A4354ArtFecMod ;
   private boolean[] P07EA2_n4354ArtFecMod ;
   private String[] P07EA2_A4353ArtUsrCod ;
   private boolean[] P07EA2_n4353ArtUsrCod ;
   private java.math.BigDecimal[] P07EA2_A4454ArtLotKgs ;
   private boolean[] P07EA2_n4454ArtLotKgs ;
   private String[] P07EA2_A279CliNom ;
   private short[] P07EA2_A116ArtUrdP3 ;
   private boolean[] P07EA2_n116ArtUrdP3 ;
   private short[] P07EA2_A115ArtUrdP2 ;
   private boolean[] P07EA2_n115ArtUrdP2 ;
   private short[] P07EA2_A114ArtUrdP1 ;
   private boolean[] P07EA2_n114ArtUrdP1 ;
   private String[] P07EA2_A113ArtUrd3 ;
   private boolean[] P07EA2_n113ArtUrd3 ;
   private String[] P07EA2_A112ArtUrd2 ;
   private boolean[] P07EA2_n112ArtUrd2 ;
   private String[] P07EA2_A111ArtUrd1 ;
   private boolean[] P07EA2_n111ArtUrd1 ;
   private short[] P07EA2_A110ArtTraP3 ;
   private boolean[] P07EA2_n110ArtTraP3 ;
   private short[] P07EA2_A109ArtTraP2 ;
   private boolean[] P07EA2_n109ArtTraP2 ;
   private short[] P07EA2_A108ArtTraP1 ;
   private boolean[] P07EA2_n108ArtTraP1 ;
   private String[] P07EA2_A107ArtTra3 ;
   private boolean[] P07EA2_n107ArtTra3 ;
   private String[] P07EA2_A106ArtTra2 ;
   private boolean[] P07EA2_n106ArtTra2 ;
   private String[] P07EA2_A105ArtTra1 ;
   private boolean[] P07EA2_n105ArtTra1 ;
   private String[] P07EA2_A830TipArtDsc ;
   private boolean[] P07EA2_n830TipArtDsc ;
   private short[] P07EA2_A829TipArtCod ;
   private short[] P07EA2_A1148ArtPml ;
   private boolean[] P07EA2_n1148ArtPml ;
   private short[] P07EA2_A7415ArtPmlCru ;
   private boolean[] P07EA2_n7415ArtPmlCru ;
   private short[] P07EA2_A78ArtGraCru ;
   private boolean[] P07EA2_n78ArtGraCru ;
   private short[] P07EA2_A68ArtCruMin ;
   private boolean[] P07EA2_n68ArtCruMin ;
   private String[] P07EA2_A2834ArtPle2 ;
   private boolean[] P07EA2_n2834ArtPle2 ;
   private String[] P07EA2_A101ArtTipPle ;
   private boolean[] P07EA2_n101ArtTipPle ;
   private java.math.BigDecimal[] P07EA2_A95ArtRen ;
   private boolean[] P07EA2_n95ArtRen ;
   private String[] P07EA2_A66ArtCorOri ;
   private boolean[] P07EA2_n66ArtCorOri ;
   private String[] P07EA2_A70ArtEncOri ;
   private boolean[] P07EA2_n70ArtEncOri ;
   private short[] P07EA2_A1229ArtEncCom ;
   private boolean[] P07EA2_n1229ArtEncCom ;
   private short[] P07EA2_A1230ArtEncAnh ;
   private boolean[] P07EA2_n1230ArtEncAnh ;
   private short[] P07EA2_A63ArtAcaMin ;
   private boolean[] P07EA2_n63ArtAcaMin ;
   private short[] P07EA2_A1903ArtGraAca ;
   private boolean[] P07EA2_n1903ArtGraAca ;
   private String[] P07EA2_A6953Mat_Maq ;
   private boolean[] P07EA2_n6953Mat_Maq ;
   private String[] P07EA3_A396EmprCod ;
   private int[] P07EA3_A252CliCod ;
   private String[] P07EA3_A65ArtCod ;
   private java.math.BigDecimal[] P07EA3_A6963Mat_LM ;
   private boolean[] P07EA3_n6963Mat_LM ;
   private java.math.BigDecimal[] P07EA3_A6962Mat_Porc ;
   private boolean[] P07EA3_n6962Mat_Porc ;
   private String[] P07EA3_A6961Mat_Lote ;
   private boolean[] P07EA3_n6961Mat_Lote ;
   private String[] P07EA3_A6960Mat_ProvN ;
   private boolean[] P07EA3_n6960Mat_ProvN ;
   private String[] P07EA3_A6958Mat_NomCol ;
   private boolean[] P07EA3_n6958Mat_NomCol ;
   private String[] P07EA3_A6957Mat_Tors ;
   private boolean[] P07EA3_n6957Mat_Tors ;
   private String[] P07EA3_A6956Mat_Mate ;
   private boolean[] P07EA3_n6956Mat_Mate ;
   private String[] P07EA3_A6955Mat_Estr ;
   private boolean[] P07EA3_n6955Mat_Estr ;
   private short[] P07EA3_A6954Mat_lin ;
   private String[] P07EA4_A396EmprCod ;
   private int[] P07EA4_A252CliCod ;
   private String[] P07EA4_A65ArtCod ;
   private String[] P07EA4_A7113ParFasObst ;
   private boolean[] P07EA4_n7113ParFasObst ;
   private String[] P07EA4_A7112ParFasValt ;
   private boolean[] P07EA4_n7112ParFasValt ;
   private String[] P07EA4_A1665ParFasDsc ;
   private boolean[] P07EA4_n1665ParFasDsc ;
   private short[] P07EA4_A1664ParFasCod ;
   private String[] P07EA4_A7111FasDsct ;
   private String[] P07EA4_A7110FasCodt ;
   private boolean[] P07EA4_n7110FasCodt ;
   private short[] P07EA4_A7135Lin_fast ;
   private String[] P07EA5_A396EmprCod ;
   private int[] P07EA5_A252CliCod ;
   private String[] P07EA5_A65ArtCod ;
   private String[] P07EA5_A758ProCod ;
   private String[] P07EA5_A759ProDsc ;
   private String[] P07EA6_A396EmprCod ;
   private String[] P07EA6_A758ProCod ;
   private short[] P07EA6_A774ProNumLin ;
   private String[] P07EA6_A460FasDsc ;
   private String[] P07EA6_A457FasCod ;
   private String[] P07EA7_A396EmprCod ;
   private int[] P07EA7_A252CliCod ;
   private String[] P07EA7_A65ArtCod ;
   private String[] P07EA7_A758ProCod ;
   private short[] P07EA7_A6986NumLinPro ;
   private String[] P07EA7_A8328ParFasObsm ;
   private boolean[] P07EA7_n8328ParFasObsm ;
   private short[] P07EA7_A1664ParFasCod ;
   private String[] P07EA7_A1665ParFasDsc ;
   private boolean[] P07EA7_n1665ParFasDsc ;
   private String[] P07EA7_A6989ParFasValp ;
   private boolean[] P07EA7_n6989ParFasValp ;
}

final  class rficteca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07EA2", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ArtDsc, T1.ArtFecMod, T1.ArtUsrCod, T1.ArtLotKgs, T3.CliNom, T1.ArtUrdP3, T1.ArtUrdP2, T1.ArtUrdP1, T1.ArtUrd3, T1.ArtUrd2, T1.ArtUrd1, T1.ArtTraP3, T1.ArtTraP2, T1.ArtTraP1, T1.ArtTra3, T1.ArtTra2, T1.ArtTra1, T2.TipArtDsc, T1.TipArtCod, T1.ArtPml, T1.ArtPmlCru, T1.ArtGraCru, T1.ArtCruMin, T1.ArtPle2, T1.ArtTipPle, T1.ArtRen, T1.ArtCorOri, T1.ArtEncOri, T1.ArtEncCom, T1.ArtEncAnh, T1.ArtAcaMin, T1.ArtGraAca, T1.Mat_Maq FROM ((TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07EA3", "SELECT EmprCod, CliCod, ArtCod, Mat_LM, Mat_Porc, Mat_Lote, Mat_ProvN, Mat_NomCol, Mat_Tors, Mat_Mate, Mat_Estr, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Mat_lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EA4", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ParFasObst, T1.ParFasValt, T2.ParFasDsc, T1.ParFasCod, T4.FasDsc AS FasDsct, T3.FasCodt AS FasCodt, T1.Lin_fast FROM (((TXPPARTI1 T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.ParFasCod) INNER JOIN TXPPARTIN T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.ArtCod AND T3.Lin_fast = T1.Lin_fast) LEFT JOIN TXPFASPRO T4 ON T4.EmprCod = T1.EmprCod AND T4.FasCod = T3.FasCodt) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.Lin_fast ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EA5", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T2.ProDsc FROM (TXPARTLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EA6", "SELECT T1.EmprCod, T1.ProCod, T1.ProNumLin, T2.FasDsc, T1.FasCod FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod, T1.ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07EA7", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.NumLinPro, T3.ParFasObsm, T1.ParFasCod, T2.ParFasDsc, T1.ParFasValp FROM ((TXPPARAR1 T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.ParFasCod) INNER JOIN TXPPARART T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.ArtCod AND T3.ProCod = T1.ProCod AND T3.NumLinPro = T1.NumLinPro) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? and T1.NumLinPro = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.NumLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 30);
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 4);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 4);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 4);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 4);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(22);
               ((short[]) buf[39])[0] = rslt.getShort(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(24);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(25);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((short[]) buf[45])[0] = rslt.getShort(26);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 10);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(32);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(33);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(34);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(35);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(36, 20);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 28);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

