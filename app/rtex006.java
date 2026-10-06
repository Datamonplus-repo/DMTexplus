package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rtex006 extends GXReport
{
   public rtex006( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rtex006.class ), "" );
   }

   public rtex006( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      rtex006.this.aP1 = new int[] {0};
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
      rtex006.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rtex006.this.A6850Tex_NPed = aP1[0];
      this.aP1 = aP1;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("INFORME COMERCIAL") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Using cursor P078H2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A252CliCod = P078H2_A252CliCod[0] ;
            n252CliCod = P078H2_n252CliCod[0] ;
            A6851Tex_FecP = P078H2_A6851Tex_FecP[0] ;
            n6851Tex_FecP = P078H2_n6851Tex_FecP[0] ;
            A6852Tex_PedC = P078H2_A6852Tex_PedC[0] ;
            n6852Tex_PedC = P078H2_n6852Tex_PedC[0] ;
            A279CliNom = P078H2_A279CliNom[0] ;
            A7274Tex_subcli = P078H2_A7274Tex_subcli[0] ;
            n7274Tex_subcli = P078H2_n7274Tex_subcli[0] ;
            A7400Tex_FecEnt = P078H2_A7400Tex_FecEnt[0] ;
            n7400Tex_FecEnt = P078H2_n7400Tex_FecEnt[0] ;
            A7398Tex_FecTej = P078H2_A7398Tex_FecTej[0] ;
            n7398Tex_FecTej = P078H2_n7398Tex_FecTej[0] ;
            A7399Tex_FecTen = P078H2_A7399Tex_FecTen[0] ;
            n7399Tex_FecTen = P078H2_n7399Tex_FecTen[0] ;
            A6854Tex_Obs = P078H2_A6854Tex_Obs[0] ;
            n6854Tex_Obs = P078H2_n6854Tex_Obs[0] ;
            A279CliNom = P078H2_A279CliNom[0] ;
            AV12Tex_fecp = A6851Tex_FecP ;
            AV15Tex_pedC = A6852Tex_PedC ;
            AV9CliCod = A252CliCod ;
            AV14CliNom = A279CliNom ;
            AV34TEX_SUBCLI = A7274Tex_subcli ;
            AV42Tex_fecent = A7400Tex_FecEnt ;
            AV40Tex_fectej = A7398Tex_FecTej ;
            AV41Tex_fecten = A7399Tex_FecTen ;
            AV20Nlin = (short)(GXutil.gxmlines( A6854Tex_Obs, (short)(60))) ;
            AV21i = (short)(1) ;
            while ( AV21i <= AV20Nlin )
            {
               AV22Obs_l = GXutil.gxgetmli( A6854Tex_Obs, AV21i, (short)(60)) ;
               h78H0( false, 15) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Obs_l, "")), 41, Gx_line+0, 355, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+15) ;
               AV21i = (short)(AV21i+1) ;
            }
            h78H0( false, 7) ;
            getPrinter().GxDrawLine(41, Gx_line+6, 763, Gx_line+6, 2, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+7) ;
            /* Using cursor P078H3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               brk78H4 = false ;
               A6861Tex_NomCol = P078H3_A6861Tex_NomCol[0] ;
               n6861Tex_NomCol = P078H3_n6861Tex_NomCol[0] ;
               A6862Tex_NumCol = P078H3_A6862Tex_NumCol[0] ;
               n6862Tex_NumCol = P078H3_n6862Tex_NumCol[0] ;
               A6863Tex_TcCol = P078H3_A6863Tex_TcCol[0] ;
               n6863Tex_TcCol = P078H3_n6863Tex_TcCol[0] ;
               A7536Tex_NomCo2 = P078H3_A7536Tex_NomCo2[0] ;
               n7536Tex_NomCo2 = P078H3_n7536Tex_NomCo2[0] ;
               A6991Tex_Unidad = P078H3_A6991Tex_Unidad[0] ;
               n6991Tex_Unidad = P078H3_n6991Tex_Unidad[0] ;
               A6993Tex_MerTn = P078H3_A6993Tex_MerTn[0] ;
               n6993Tex_MerTn = P078H3_n6993Tex_MerTn[0] ;
               A6992Tex_MerTj = P078H3_A6992Tex_MerTj[0] ;
               n6992Tex_MerTj = P078H3_n6992Tex_MerTj[0] ;
               A6858Tex_Kgs = P078H3_A6858Tex_Kgs[0] ;
               n6858Tex_Kgs = P078H3_n6858Tex_Kgs[0] ;
               A6994Tex_Talla = P078H3_A6994Tex_Talla[0] ;
               n6994Tex_Talla = P078H3_n6994Tex_Talla[0] ;
               A6857Tex_Lin = P078H3_A6857Tex_Lin[0] ;
               A6859Tex_artc = P078H3_A6859Tex_artc[0] ;
               n6859Tex_artc = P078H3_n6859Tex_artc[0] ;
               A6995Tex_Maestr = P078H3_A6995Tex_Maestr[0] ;
               n6995Tex_Maestr = P078H3_n6995Tex_Maestr[0] ;
               A7401Tex_TipT = P078H3_A7401Tex_TipT[0] ;
               n7401Tex_TipT = P078H3_n7401Tex_TipT[0] ;
               AV8Tex_artc = A6859Tex_artc ;
               AV9CliCod = A252CliCod ;
               /* Execute user subroutine: 'ARTICU' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  pr_default.close(0);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV47Tex_NPed = A6850Tex_NPed ;
               AV46TEX_TIPT = A7401Tex_TipT ;
               /* Execute user subroutine: 'TEX003' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  pr_default.close(0);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( ( AV36Tex004 == 0 ) || ( GXutil.strcmp(A6994Tex_Talla, httpContext.getMessage( "N", "")) == 0 ) )
               {
                  h78H0( false, 169) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ARTICULO:", ""), 41, Gx_line+14, 111, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6859Tex_artc, "")), 122, Gx_line+14, 206, Gx_line+29, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10ArtDsc, "")), 230, Gx_line+14, 366, Gx_line+29, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11TipArtDsc, "")), 122, Gx_line+33, 279, Gx_line+48, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Item", ""), 41, Gx_line+147, 67, Gx_line+161, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Kgs Bruto", ""), 85, Gx_line+147, 143, Gx_line+161, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Mer TJ", ""), 217, Gx_line+147, 259, Gx_line+161, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Mer TÑ", ""), 274, Gx_line+147, 319, Gx_line+161, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 326, Gx_line+147, 357, Gx_line+161, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 530, Gx_line+147, 576, Gx_line+161, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(41, Gx_line+161, 67, Gx_line+161, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(85, Gx_line+161, 143, Gx_line+161, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(217, Gx_line+161, 259, Gx_line+161, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(274, Gx_line+161, 316, Gx_line+161, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(326, Gx_line+161, 421, Gx_line+161, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(530, Gx_line+161, 576, Gx_line+161, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ANCHO", ""), 560, Gx_line+15, 601, Gx_line+29, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "DENSIDAD", ""), 560, Gx_line+30, 619, Gx_line+44, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RENDIMIENTO", ""), 560, Gx_line+49, 640, Gx_line+63, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "MAQ. TEJIDO", ""), 560, Gx_line+69, 632, Gx_line+83, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16Artcrumin), "ZZZ")), 740, Gx_line+15, 760, Gx_line+30, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17ArtGracru), "ZZZZ")), 733, Gx_line+30, 759, Gx_line+45, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18ArtRen, "ZZZ.ZZ")), 721, Gx_line+49, 760, Gx_line+64, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Mat_maq, "")), 654, Gx_line+69, 759, Gx_line+84, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(542, Gx_line+10, 765, Gx_line+126, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(542, Gx_line+27, 765, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(542, Gx_line+46, 765, Gx_line+46, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(542, Gx_line+66, 765, Gx_line+66, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 151, Gx_line+147, 207, Gx_line+161, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(151, Gx_line+161, 207, Gx_line+161, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText("%", 263, Gx_line+133, 273, Gx_line+147, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(279, Gx_line+141, 319, Gx_line+141, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(217, Gx_line+141, 257, Gx_line+141, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Carta", ""), 589, Gx_line+147, 621, Gx_line+161, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(589, Gx_line+161, 662, Gx_line+161, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 666, Gx_line+147, 703, Gx_line+161, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(666, Gx_line+161, 716, Gx_line+161, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Opcion", ""), 720, Gx_line+147, 763, Gx_line+161, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(720, Gx_line+161, 763, Gx_line+161, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(542, Gx_line+84, 765, Gx_line+84, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ENC. ANCHO", ""), 560, Gx_line+89, 630, Gx_line+103, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43ArtEncAnh), "ZZZ9")), 635, Gx_line+89, 661, Gx_line+104, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "LARGO", ""), 683, Gx_line+89, 723, Gx_line+103, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44ArtEncCom), "ZZZ9")), 728, Gx_line+89, 754, Gx_line+104, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(542, Gx_line+104, 765, Gx_line+104, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "PLEGADO", ""), 560, Gx_line+108, 614, Gx_line+122, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45ArtTipPle, "")), 633, Gx_line+108, 686, Gx_line+123, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Color 2", ""), 430, Gx_line+147, 473, Gx_line+161, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(430, Gx_line+161, 525, Gx_line+161, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+169) ;
               }
               else
               {
                  h78H0( false, 188) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[1-1], "")), 48, Gx_line+130, 99, Gx_line+145, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[2-1], "")), 102, Gx_line+130, 153, Gx_line+145, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[3-1], "")), 157, Gx_line+130, 208, Gx_line+145, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[4-1], "")), 211, Gx_line+130, 262, Gx_line+145, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[5-1], "")), 267, Gx_line+130, 318, Gx_line+145, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[6-1], "")), 322, Gx_line+130, 373, Gx_line+145, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[7-1], "")), 376, Gx_line+130, 427, Gx_line+145, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[8-1], "")), 431, Gx_line+130, 482, Gx_line+145, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[9-1], "")), 485, Gx_line+130, 536, Gx_line+145, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[10-1], "")), 541, Gx_line+130, 592, Gx_line+145, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(40, Gx_line+126, 765, Gx_line+148, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ARTICULO:", ""), 41, Gx_line+16, 111, Gx_line+30, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6859Tex_artc, "")), 124, Gx_line+16, 208, Gx_line+31, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10ArtDsc, "")), 232, Gx_line+16, 368, Gx_line+31, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11TipArtDsc, "")), 124, Gx_line+35, 281, Gx_line+50, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Item", ""), 41, Gx_line+167, 67, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Kgs Bruto", ""), 85, Gx_line+167, 143, Gx_line+181, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Mer TJ", ""), 217, Gx_line+167, 259, Gx_line+181, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Mer TÑ", ""), 274, Gx_line+167, 319, Gx_line+181, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 326, Gx_line+167, 357, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 530, Gx_line+167, 576, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(41, Gx_line+181, 67, Gx_line+181, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(85, Gx_line+181, 143, Gx_line+181, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(217, Gx_line+181, 259, Gx_line+181, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(274, Gx_line+181, 316, Gx_line+181, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(326, Gx_line+181, 421, Gx_line+181, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(530, Gx_line+181, 576, Gx_line+181, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 151, Gx_line+167, 207, Gx_line+181, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(151, Gx_line+181, 207, Gx_line+181, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText("%", 263, Gx_line+155, 273, Gx_line+169, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(279, Gx_line+161, 319, Gx_line+161, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(217, Gx_line+161, 257, Gx_line+161, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Carta", ""), 589, Gx_line+167, 621, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(589, Gx_line+181, 662, Gx_line+181, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 666, Gx_line+167, 703, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(666, Gx_line+181, 716, Gx_line+181, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Opcion", ""), 720, Gx_line+167, 763, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(720, Gx_line+181, 763, Gx_line+181, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ANCHO", ""), 560, Gx_line+9, 601, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "DENSIDAD", ""), 560, Gx_line+25, 619, Gx_line+39, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RENDIMIENTO", ""), 560, Gx_line+44, 640, Gx_line+58, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "MAQ. TEJIDO", ""), 560, Gx_line+64, 632, Gx_line+78, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16Artcrumin), "ZZZ")), 740, Gx_line+9, 760, Gx_line+24, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17ArtGracru), "ZZZZ")), 733, Gx_line+25, 759, Gx_line+40, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18ArtRen, "ZZZ.ZZ")), 721, Gx_line+44, 760, Gx_line+59, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Mat_maq, "")), 654, Gx_line+64, 759, Gx_line+79, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(542, Gx_line+5, 765, Gx_line+121, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(542, Gx_line+22, 765, Gx_line+22, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(542, Gx_line+41, 765, Gx_line+41, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(542, Gx_line+60, 765, Gx_line+60, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(542, Gx_line+79, 765, Gx_line+79, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ENC. ANCHO", ""), 560, Gx_line+83, 630, Gx_line+97, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43ArtEncAnh), "ZZZ9")), 641, Gx_line+83, 667, Gx_line+98, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "LARGO", ""), 689, Gx_line+83, 729, Gx_line+97, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44ArtEncCom), "ZZZ9")), 733, Gx_line+83, 759, Gx_line+98, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(542, Gx_line+99, 765, Gx_line+99, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "PLEGADO", ""), 560, Gx_line+103, 614, Gx_line+117, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45ArtTipPle, "")), 639, Gx_line+103, 692, Gx_line+118, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Color 2", ""), 430, Gx_line+167, 473, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(430, Gx_line+181, 525, Gx_line+181, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[11-1], "")), 595, Gx_line+130, 646, Gx_line+145, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[12-1], "")), 650, Gx_line+130, 701, Gx_line+145, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[13-1], "")), 704, Gx_line+130, 755, Gx_line+145, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(100, Gx_line+126, 100, Gx_line+148, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(154, Gx_line+126, 154, Gx_line+148, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(264, Gx_line+126, 264, Gx_line+148, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(209, Gx_line+126, 209, Gx_line+148, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(319, Gx_line+126, 319, Gx_line+148, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(374, Gx_line+126, 374, Gx_line+148, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(428, Gx_line+126, 428, Gx_line+148, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(483, Gx_line+126, 483, Gx_line+148, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(538, Gx_line+126, 538, Gx_line+148, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(593, Gx_line+126, 593, Gx_line+148, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(648, Gx_line+126, 648, Gx_line+148, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(702, Gx_line+126, 702, Gx_line+148, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+188) ;
               }
               AV13Tot_ks = DecimalUtil.doubleToDec(0) ;
               AV27Tot_un = 0 ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P078H3_A6995Tex_Maestr[0], A6995Tex_Maestr) == 0 ) && ( GXutil.strcmp(P078H3_A6859Tex_artc[0], A6859Tex_artc) == 0 ) )
               {
                  brk78H4 = false ;
                  A6861Tex_NomCol = P078H3_A6861Tex_NomCol[0] ;
                  n6861Tex_NomCol = P078H3_n6861Tex_NomCol[0] ;
                  A6862Tex_NumCol = P078H3_A6862Tex_NumCol[0] ;
                  n6862Tex_NumCol = P078H3_n6862Tex_NumCol[0] ;
                  A6863Tex_TcCol = P078H3_A6863Tex_TcCol[0] ;
                  n6863Tex_TcCol = P078H3_n6863Tex_TcCol[0] ;
                  A7536Tex_NomCo2 = P078H3_A7536Tex_NomCo2[0] ;
                  n7536Tex_NomCo2 = P078H3_n7536Tex_NomCo2[0] ;
                  A6991Tex_Unidad = P078H3_A6991Tex_Unidad[0] ;
                  n6991Tex_Unidad = P078H3_n6991Tex_Unidad[0] ;
                  A6993Tex_MerTn = P078H3_A6993Tex_MerTn[0] ;
                  n6993Tex_MerTn = P078H3_n6993Tex_MerTn[0] ;
                  A6992Tex_MerTj = P078H3_A6992Tex_MerTj[0] ;
                  n6992Tex_MerTj = P078H3_n6992Tex_MerTj[0] ;
                  A6858Tex_Kgs = P078H3_A6858Tex_Kgs[0] ;
                  n6858Tex_Kgs = P078H3_n6858Tex_Kgs[0] ;
                  A6994Tex_Talla = P078H3_A6994Tex_Talla[0] ;
                  n6994Tex_Talla = P078H3_n6994Tex_Talla[0] ;
                  A6857Tex_Lin = P078H3_A6857Tex_Lin[0] ;
                  if ( GXutil.strcmp(P078H3_A396EmprCod[0], A396EmprCod) == 0 )
                  {
                     if ( P078H3_A6850Tex_NPed[0] == A6850Tex_NPed )
                     {
                        AV28Forser = A6859Tex_artc ;
                        AV29ForcolNom = A6861Tex_NomCol ;
                        AV30Forcolnum = A6862Tex_NumCol ;
                        AV31TipColCod = A6863Tex_TcCol ;
                        /* Execute user subroutine: 'CFORMU' */
                        S121 ();
                        if ( returnInSub )
                        {
                           pr_default.close(1);
                           pr_default.close(0);
                           pr_default.close(0);
                           getPrinter().GxEndPage() ;
                           /* Close printer file */
                           getPrinter().GxEndDocument() ;
                           endPrinter();
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                        h78H0( false, 15) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6857Tex_Lin), "ZZZ9")), 41, Gx_line+0, 67, Gx_line+15, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6858Tex_Kgs, "ZZZZZ9.99")), 88, Gx_line+0, 145, Gx_line+15, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6992Tex_MerTj, "ZZ9.99")), 221, Gx_line+0, 260, Gx_line+15, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6993Tex_MerTn, "ZZ9.99")), 274, Gx_line+0, 313, Gx_line+15, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6861Tex_NomCol, "")), 326, Gx_line+0, 395, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6862Tex_NumCol), "ZZZZZ9")), 539, Gx_line+0, 578, Gx_line+15, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6991Tex_Unidad), "ZZZZZ9")), 170, Gx_line+1, 209, Gx_line+16, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Carta, "")), 589, Gx_line+0, 642, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( AV33Forfec, "99/99/99"), 666, Gx_line+0, 715, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35ForOpccli, "")), 730, Gx_line+0, 754, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7536Tex_NomCo2, "")), 430, Gx_line+0, 499, Gx_line+15, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+15) ;
                        AV13Tot_ks = AV13Tot_ks.add(A6858Tex_Kgs) ;
                        AV27Tot_un = (int)(AV27Tot_un+A6991Tex_Unidad) ;
                        if ( GXutil.strcmp(A6994Tex_Talla, httpContext.getMessage( "S", "")) == 0 )
                        {
                           if ( AV36Tex004 == 0 )
                           {
                              GX_I = 1 ;
                              while ( GX_I <= 100 )
                              {
                                 AV23Tab_talla[GX_I-1] = "" ;
                                 GX_I = (int)(GX_I+1) ;
                              }
                           }
                           GX_I = 1 ;
                           while ( GX_I <= 100 )
                           {
                              AV24Tab_un[GX_I-1] = " " ;
                              GX_I = (int)(GX_I+1) ;
                           }
                           AV21i = (short)(1) ;
                           AV25Tex002 = (byte)(0) ;
                           AV26Cab_tallas = (byte)(0) ;
                           if ( AV36Tex004 == 0 )
                           {
                              /* Using cursor P078H4 */
                              pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed), Short.valueOf(A6857Tex_Lin)});
                              while ( (pr_default.getStatus(2) != 101) )
                              {
                                 A6997Tex_Unid = P078H4_A6997Tex_Unid[0] ;
                                 n6997Tex_Unid = P078H4_n6997Tex_Unid[0] ;
                                 A6996Tex_Ntalla = P078H4_A6996Tex_Ntalla[0] ;
                                 AV23Tab_talla[AV21i-1] = A6996Tex_Ntalla ;
                                 AV24Tab_un[AV21i-1] = GXutil.rtrim( GXutil.trim( GXutil.str( A6997Tex_Unid, 4, 0))) ;
                                 AV25Tex002 = (byte)(1) ;
                                 AV21i = (short)(AV21i+1) ;
                                 pr_default.readNext(2);
                              }
                              pr_default.close(2);
                           }
                           else
                           {
                              AV48j = (byte)(1) ;
                              while ( AV48j <= 100 )
                              {
                                 if ( GXutil.strcmp(AV23Tab_talla[AV48j-1], " ") == 0 )
                                 {
                                    AV48j = (byte)(101) ;
                                    if (true) break;
                                 }
                                 AV49Tex_Ntalla = AV23Tab_talla[AV48j-1] ;
                                 /* Using cursor P078H5 */
                                 pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed), Short.valueOf(A6857Tex_Lin), AV49Tex_Ntalla});
                                 while ( (pr_default.getStatus(3) != 101) )
                                 {
                                    A6996Tex_Ntalla = P078H5_A6996Tex_Ntalla[0] ;
                                    A6997Tex_Unid = P078H5_A6997Tex_Unid[0] ;
                                    n6997Tex_Unid = P078H5_n6997Tex_Unid[0] ;
                                    AV24Tab_un[AV21i-1] = GXutil.rtrim( GXutil.trim( GXutil.str( A6997Tex_Unid, 4, 0))) ;
                                    AV25Tex002 = (byte)(1) ;
                                    AV21i = (short)(AV21i+1) ;
                                    /* Exiting from a For First loop. */
                                    if (true) break;
                                 }
                                 pr_default.close(3);
                                 AV48j = (byte)(AV48j+1) ;
                              }
                           }
                        }
                        if ( AV25Tex002 == 1 )
                        {
                           if ( AV36Tex004 == 0 )
                           {
                              if ( AV26Cab_tallas == 0 )
                              {
                                 AV26Cab_tallas = (byte)(1) ;
                                 h78H0( false, 27) ;
                                 getPrinter().GxDrawRect(40, Gx_line+3, 765, Gx_line+25, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[1-1], "")), 48, Gx_line+7, 99, Gx_line+22, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[2-1], "")), 102, Gx_line+7, 153, Gx_line+22, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[3-1], "")), 157, Gx_line+7, 208, Gx_line+22, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[4-1], "")), 211, Gx_line+7, 262, Gx_line+22, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[5-1], "")), 267, Gx_line+7, 318, Gx_line+22, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[6-1], "")), 322, Gx_line+7, 373, Gx_line+22, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[7-1], "")), 376, Gx_line+7, 427, Gx_line+22, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[8-1], "")), 431, Gx_line+7, 482, Gx_line+22, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[9-1], "")), 485, Gx_line+7, 536, Gx_line+22, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[10-1], "")), 541, Gx_line+7, 592, Gx_line+22, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[11-1], "")), 595, Gx_line+7, 646, Gx_line+22, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[12-1], "")), 650, Gx_line+7, 701, Gx_line+22, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[13-1], "")), 704, Gx_line+7, 755, Gx_line+22, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(100, Gx_line+3, 100, Gx_line+25, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(154, Gx_line+3, 154, Gx_line+25, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(264, Gx_line+3, 264, Gx_line+25, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(209, Gx_line+3, 209, Gx_line+25, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(319, Gx_line+3, 319, Gx_line+25, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(374, Gx_line+3, 374, Gx_line+25, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(428, Gx_line+3, 428, Gx_line+25, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(483, Gx_line+3, 483, Gx_line+25, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(538, Gx_line+3, 538, Gx_line+25, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(593, Gx_line+3, 593, Gx_line+25, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(648, Gx_line+3, 648, Gx_line+25, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(702, Gx_line+3, 702, Gx_line+25, 1, 0, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+27) ;
                              }
                           }
                           h78H0( false, 24) ;
                           getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[1-1], "")), 53, Gx_line+4, 100, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[2-1], "")), 107, Gx_line+4, 154, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[3-1], "")), 163, Gx_line+4, 210, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[4-1], "")), 217, Gx_line+4, 264, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[5-1], "")), 272, Gx_line+4, 319, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[6-1], "")), 327, Gx_line+4, 374, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[7-1], "")), 381, Gx_line+4, 428, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[8-1], "")), 436, Gx_line+4, 483, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[9-1], "")), 491, Gx_line+4, 538, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[10-1], "")), 546, Gx_line+4, 593, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawRect(40, Gx_line+0, 765, Gx_line+22, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(100, Gx_line+0, 100, Gx_line+22, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(154, Gx_line+0, 154, Gx_line+22, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(209, Gx_line+0, 209, Gx_line+22, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(264, Gx_line+0, 264, Gx_line+22, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(319, Gx_line+0, 319, Gx_line+22, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(374, Gx_line+0, 374, Gx_line+22, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(428, Gx_line+0, 428, Gx_line+22, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(483, Gx_line+0, 483, Gx_line+22, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(538, Gx_line+0, 538, Gx_line+22, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[11-1], "")), 600, Gx_line+4, 647, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[12-1], "")), 655, Gx_line+4, 702, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[13-1], "")), 709, Gx_line+4, 756, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(593, Gx_line+0, 593, Gx_line+22, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(648, Gx_line+0, 648, Gx_line+22, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(702, Gx_line+0, 702, Gx_line+22, 1, 0, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+24) ;
                        }
                     }
                  }
                  brk78H4 = true ;
                  pr_default.readNext(1);
               }
               if ( ( AV36Tex004 == 1 ) && ( AV25Tex002 == 1 ) )
               {
                  h78H0( false, 81) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[1-1], "")), 47, Gx_line+18, 100, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[2-1], "")), 101, Gx_line+18, 154, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[3-1], "")), 156, Gx_line+18, 209, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[4-1], "")), 210, Gx_line+18, 263, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[5-1], "")), 266, Gx_line+18, 319, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[6-1], "")), 321, Gx_line+18, 374, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[7-1], "")), 375, Gx_line+18, 428, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[8-1], "")), 430, Gx_line+18, 483, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[9-1], "")), 484, Gx_line+18, 537, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[10-1], "")), 540, Gx_line+18, 593, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(40, Gx_line+14, 765, Gx_line+36, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(100, Gx_line+14, 100, Gx_line+36, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(154, Gx_line+14, 154, Gx_line+36, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(209, Gx_line+14, 209, Gx_line+36, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(264, Gx_line+14, 264, Gx_line+36, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(319, Gx_line+14, 319, Gx_line+36, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(374, Gx_line+14, 374, Gx_line+36, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(428, Gx_line+14, 428, Gx_line+36, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(483, Gx_line+14, 483, Gx_line+36, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(538, Gx_line+14, 538, Gx_line+36, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Medidas Alto", ""), 54, Gx_line+0, 131, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[1-1], "")), 47, Gx_line+58, 100, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[2-1], "")), 101, Gx_line+58, 154, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[3-1], "")), 156, Gx_line+58, 209, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[4-1], "")), 210, Gx_line+58, 263, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[5-1], "")), 266, Gx_line+58, 319, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[6-1], "")), 321, Gx_line+58, 374, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[7-1], "")), 375, Gx_line+58, 428, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[8-1], "")), 430, Gx_line+58, 483, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[9-1], "")), 484, Gx_line+58, 537, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[10-1], "")), 540, Gx_line+58, 593, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(40, Gx_line+54, 765, Gx_line+76, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(100, Gx_line+54, 100, Gx_line+76, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(154, Gx_line+54, 154, Gx_line+76, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(209, Gx_line+54, 209, Gx_line+76, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(264, Gx_line+54, 264, Gx_line+76, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(319, Gx_line+54, 319, Gx_line+76, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(374, Gx_line+54, 374, Gx_line+76, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(428, Gx_line+54, 428, Gx_line+76, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(483, Gx_line+54, 483, Gx_line+76, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(538, Gx_line+54, 538, Gx_line+76, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Medidas Ancho", ""), 54, Gx_line+41, 146, Gx_line+55, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[11-1], "")), 594, Gx_line+18, 647, Gx_line+33, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[13-1], "")), 703, Gx_line+17, 756, Gx_line+32, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[12-1], "")), 649, Gx_line+17, 702, Gx_line+32, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(593, Gx_line+14, 593, Gx_line+36, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(648, Gx_line+14, 648, Gx_line+36, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(702, Gx_line+14, 702, Gx_line+36, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(593, Gx_line+53, 593, Gx_line+75, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(648, Gx_line+53, 648, Gx_line+75, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(702, Gx_line+53, 702, Gx_line+75, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[12-1], "")), 594, Gx_line+58, 647, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[13-1], "")), 649, Gx_line+58, 702, Gx_line+73, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[13-1], "")), 703, Gx_line+58, 756, Gx_line+73, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+81) ;
               }
               h78H0( false, 25) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13Tot_ks, "ZZZZZZ9.99")), 81, Gx_line+6, 145, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(41, Gx_line+24, 763, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27Tot_un), "ZZZZZ9")), 170, Gx_line+6, 209, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(41, Gx_line+2, 763, Gx_line+2, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+25) ;
               if ( ! brk78H4 )
               {
                  brk78H4 = true ;
                  pr_default.readNext(1);
               }
            }
            pr_default.close(1);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h78H0( true, 0) ;
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
      /* 'ARTICU' Routine */
      returnInSub = false ;
      /* Using cursor P078H6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV9CliCod), AV8Tex_artc});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A829TipArtCod = P078H6_A829TipArtCod[0] ;
         A65ArtCod = P078H6_A65ArtCod[0] ;
         A252CliCod = P078H6_A252CliCod[0] ;
         n252CliCod = P078H6_n252CliCod[0] ;
         A69ArtDsc = P078H6_A69ArtDsc[0] ;
         n69ArtDsc = P078H6_n69ArtDsc[0] ;
         A830TipArtDsc = P078H6_A830TipArtDsc[0] ;
         n830TipArtDsc = P078H6_n830TipArtDsc[0] ;
         A63ArtAcaMin = P078H6_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P078H6_n63ArtAcaMin[0] ;
         A1903ArtGraAca = P078H6_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P078H6_n1903ArtGraAca[0] ;
         A95ArtRen = P078H6_A95ArtRen[0] ;
         n95ArtRen = P078H6_n95ArtRen[0] ;
         A6953Mat_Maq = P078H6_A6953Mat_Maq[0] ;
         n6953Mat_Maq = P078H6_n6953Mat_Maq[0] ;
         A1230ArtEncAnh = P078H6_A1230ArtEncAnh[0] ;
         n1230ArtEncAnh = P078H6_n1230ArtEncAnh[0] ;
         A1229ArtEncCom = P078H6_A1229ArtEncCom[0] ;
         n1229ArtEncCom = P078H6_n1229ArtEncCom[0] ;
         A101ArtTipPle = P078H6_A101ArtTipPle[0] ;
         n101ArtTipPle = P078H6_n101ArtTipPle[0] ;
         A830TipArtDsc = P078H6_A830TipArtDsc[0] ;
         n830TipArtDsc = P078H6_n830TipArtDsc[0] ;
         AV10ArtDsc = A69ArtDsc ;
         AV11TipArtDsc = A830TipArtDsc ;
         AV16Artcrumin = A63ArtAcaMin ;
         AV17ArtGracru = A1903ArtGraAca ;
         AV18ArtRen = A95ArtRen ;
         AV19Mat_maq = A6953Mat_Maq ;
         AV43ArtEncAnh = A1230ArtEncAnh ;
         AV44ArtEncCom = A1229ArtEncCom ;
         AV45ArtTipPle = A101ArtTipPle ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      AV32Carta = " " ;
      AV33Forfec = GXutil.nullDate() ;
      /* Using cursor P078H7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV9CliCod), AV28Forser, AV29ForcolNom, Integer.valueOf(AV30Forcolnum), Byte.valueOf(AV31TipColCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A831TipColCod = P078H7_A831TipColCod[0] ;
         A483ForColNum = P078H7_A483ForColNum[0] ;
         A482ForColNom = P078H7_A482ForColNom[0] ;
         A494ForSer = P078H7_A494ForSer[0] ;
         A252CliCod = P078H7_A252CliCod[0] ;
         n252CliCod = P078H7_n252CliCod[0] ;
         A995ForTonal = P078H7_A995ForTonal[0] ;
         n995ForTonal = P078H7_n995ForTonal[0] ;
         A485ForFec = P078H7_A485ForFec[0] ;
         n485ForFec = P078H7_n485ForFec[0] ;
         A3560ForOpcCli = P078H7_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P078H7_n3560ForOpcCli[0] ;
         A7537ForOpNum = P078H7_A7537ForOpNum[0] ;
         n7537ForOpNum = P078H7_n7537ForOpNum[0] ;
         AV32Carta = A995ForTonal ;
         AV33Forfec = A485ForFec ;
         AV35ForOpccli = A3560ForOpcCli ;
         if ( A7537ForOpNum > 0 )
         {
            AV35ForOpccli = GXutil.str( A7537ForOpNum, 2, 0) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'TEX003' Routine */
      returnInSub = false ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV23Tab_talla[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV24Tab_un[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV38Tab_alt[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV37Tab_Anc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV21i = (short)(1) ;
      AV36Tex004 = (byte)(0) ;
      AV26Cab_tallas = (byte)(0) ;
      /* Using cursor P078H8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV47Tex_NPed), AV46TEX_TIPT});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A7402Tex_TipArt = P078H8_A7402Tex_TipArt[0] ;
         A7405Tex_TalOP = P078H8_A7405Tex_TalOP[0] ;
         n7405Tex_TalOP = P078H8_n7405Tex_TalOP[0] ;
         A7407Tex_AltOp = P078H8_A7407Tex_AltOp[0] ;
         n7407Tex_AltOp = P078H8_n7407Tex_AltOp[0] ;
         A7406Tex_AncOp = P078H8_A7406Tex_AncOp[0] ;
         n7406Tex_AncOp = P078H8_n7406Tex_AncOp[0] ;
         A7404Tex_LnOP = P078H8_A7404Tex_LnOP[0] ;
         AV23Tab_talla[AV21i-1] = A7405Tex_TalOP ;
         AV38Tab_alt[AV21i-1] = A7407Tex_AltOp ;
         AV37Tab_Anc[AV21i-1] = A7406Tex_AncOp ;
         AV21i = (short)(AV21i+1) ;
         AV36Tex004 = (byte)(1) ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void h78H0( boolean bFoot ,
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
            getPrinter().GxAttris("Microsoft Sans Serif", 16, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ORDEN DE PRODUCCION", ""), 381, Gx_line+47, 670, Gx_line+74, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "ORDEN DE COMPRA:", ""), 41, Gx_line+133, 172, Gx_line+147, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE:", ""), 41, Gx_line+158, 100, Gx_line+172, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9CliCod), "ZZZZZ9")), 108, Gx_line+158, 147, Gx_line+173, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14CliNom, "")), 163, Gx_line+158, 320, Gx_line+173, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OP (CLIENTE):", ""), 41, Gx_line+204, 131, Gx_line+218, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Tex_pedC, "")), 135, Gx_line+204, 657, Gx_line+219, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA:", ""), 542, Gx_line+111, 589, Gx_line+125, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV12Tex_fecp, "99/99/99"), 677, Gx_line+111, 726, Gx_line+126, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OP", ""), 542, Gx_line+139, 561, Gx_line+153, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6850Tex_NPed), "ZZZZZZZ9")), 677, Gx_line+139, 728, Gx_line+154, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(528, Gx_line+98, 746, Gx_line+167, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(528, Gx_line+131, 746, Gx_line+131, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(636, Gx_line+98, 636, Gx_line+167, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(41, Gx_line+269, 763, Gx_line+269, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OBSERVACIONES:", ""), 41, Gx_line+277, 155, Gx_line+291, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 725, Gx_line+279, 764, Gx_line+294, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 681, Gx_line+279, 716, Gx_line+293, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5098TipDisCod, "")), 528, Gx_line+179, 540, Gx_line+194, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5097TipDisDsc, "")), 548, Gx_line+179, 705, Gx_line+194, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "SUBCLIENTE:", ""), 41, Gx_line+181, 126, Gx_line+195, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TEX_SUBCLI, "")), 163, Gx_line+181, 320, Gx_line+196, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "fec294d2-d305-4e79-928d-affaaa59f43b", "", context.getHttpContext().getTheme( )), 41, Gx_line+10, 346, Gx_line+107) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA DE TEJIDO:", ""), 41, Gx_line+227, 160, Gx_line+241, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Tex_fectej, "")), 182, Gx_line+227, 287, Gx_line+242, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA DE TEÑIDO:", ""), 354, Gx_line+227, 476, Gx_line+241, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Tex_fecten, "")), 481, Gx_line+227, 586, Gx_line+242, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA DE ENTREGA:", ""), 41, Gx_line+249, 175, Gx_line+263, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Tex_fecent, "")), 182, Gx_line+249, 287, Gx_line+264, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+295) ;
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
      this.aP0[0] = rtex006.this.A396EmprCod;
      this.aP1[0] = rtex006.this.A6850Tex_NPed;
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
      P078H2_A396EmprCod = new String[] {""} ;
      P078H2_A6850Tex_NPed = new int[1] ;
      P078H2_A252CliCod = new int[1] ;
      P078H2_n252CliCod = new boolean[] {false} ;
      P078H2_A6851Tex_FecP = new java.util.Date[] {GXutil.nullDate()} ;
      P078H2_n6851Tex_FecP = new boolean[] {false} ;
      P078H2_A6852Tex_PedC = new String[] {""} ;
      P078H2_n6852Tex_PedC = new boolean[] {false} ;
      P078H2_A279CliNom = new String[] {""} ;
      P078H2_A7274Tex_subcli = new String[] {""} ;
      P078H2_n7274Tex_subcli = new boolean[] {false} ;
      P078H2_A7400Tex_FecEnt = new String[] {""} ;
      P078H2_n7400Tex_FecEnt = new boolean[] {false} ;
      P078H2_A7398Tex_FecTej = new String[] {""} ;
      P078H2_n7398Tex_FecTej = new boolean[] {false} ;
      P078H2_A7399Tex_FecTen = new String[] {""} ;
      P078H2_n7399Tex_FecTen = new boolean[] {false} ;
      P078H2_A6854Tex_Obs = new String[] {""} ;
      P078H2_n6854Tex_Obs = new boolean[] {false} ;
      A6851Tex_FecP = GXutil.nullDate() ;
      A6852Tex_PedC = "" ;
      A279CliNom = "" ;
      A7274Tex_subcli = "" ;
      A7400Tex_FecEnt = "" ;
      A7398Tex_FecTej = "" ;
      A7399Tex_FecTen = "" ;
      A6854Tex_Obs = "" ;
      AV12Tex_fecp = GXutil.nullDate() ;
      AV15Tex_pedC = "" ;
      AV14CliNom = "" ;
      AV34TEX_SUBCLI = "" ;
      AV42Tex_fecent = "" ;
      AV40Tex_fectej = "" ;
      AV41Tex_fecten = "" ;
      AV22Obs_l = "" ;
      P078H3_A396EmprCod = new String[] {""} ;
      P078H3_A6850Tex_NPed = new int[1] ;
      P078H3_A6861Tex_NomCol = new String[] {""} ;
      P078H3_n6861Tex_NomCol = new boolean[] {false} ;
      P078H3_A6862Tex_NumCol = new int[1] ;
      P078H3_n6862Tex_NumCol = new boolean[] {false} ;
      P078H3_A6863Tex_TcCol = new byte[1] ;
      P078H3_n6863Tex_TcCol = new boolean[] {false} ;
      P078H3_A7536Tex_NomCo2 = new String[] {""} ;
      P078H3_n7536Tex_NomCo2 = new boolean[] {false} ;
      P078H3_A6991Tex_Unidad = new int[1] ;
      P078H3_n6991Tex_Unidad = new boolean[] {false} ;
      P078H3_A6993Tex_MerTn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078H3_n6993Tex_MerTn = new boolean[] {false} ;
      P078H3_A6992Tex_MerTj = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078H3_n6992Tex_MerTj = new boolean[] {false} ;
      P078H3_A6858Tex_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078H3_n6858Tex_Kgs = new boolean[] {false} ;
      P078H3_A6994Tex_Talla = new String[] {""} ;
      P078H3_n6994Tex_Talla = new boolean[] {false} ;
      P078H3_A6857Tex_Lin = new short[1] ;
      P078H3_A6859Tex_artc = new String[] {""} ;
      P078H3_n6859Tex_artc = new boolean[] {false} ;
      P078H3_A6995Tex_Maestr = new String[] {""} ;
      P078H3_n6995Tex_Maestr = new boolean[] {false} ;
      P078H3_A7401Tex_TipT = new String[] {""} ;
      P078H3_n7401Tex_TipT = new boolean[] {false} ;
      A6861Tex_NomCol = "" ;
      A7536Tex_NomCo2 = "" ;
      A6993Tex_MerTn = DecimalUtil.ZERO ;
      A6992Tex_MerTj = DecimalUtil.ZERO ;
      A6858Tex_Kgs = DecimalUtil.ZERO ;
      A6994Tex_Talla = "" ;
      A6859Tex_artc = "" ;
      A6995Tex_Maestr = "" ;
      A7401Tex_TipT = "" ;
      AV8Tex_artc = "" ;
      AV46TEX_TIPT = "" ;
      AV10ArtDsc = "" ;
      AV11TipArtDsc = "" ;
      AV18ArtRen = DecimalUtil.ZERO ;
      AV19Mat_maq = "" ;
      AV45ArtTipPle = "" ;
      AV23Tab_talla = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV23Tab_talla[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV13Tot_ks = DecimalUtil.ZERO ;
      AV28Forser = "" ;
      AV29ForcolNom = "" ;
      AV32Carta = "" ;
      AV33Forfec = GXutil.nullDate() ;
      AV35ForOpccli = "" ;
      AV24Tab_un = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV24Tab_un[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P078H4_A396EmprCod = new String[] {""} ;
      P078H4_A6850Tex_NPed = new int[1] ;
      P078H4_A6857Tex_Lin = new short[1] ;
      P078H4_A6997Tex_Unid = new int[1] ;
      P078H4_n6997Tex_Unid = new boolean[] {false} ;
      P078H4_A6996Tex_Ntalla = new String[] {""} ;
      A6996Tex_Ntalla = "" ;
      AV49Tex_Ntalla = "" ;
      P078H5_A396EmprCod = new String[] {""} ;
      P078H5_A6850Tex_NPed = new int[1] ;
      P078H5_A6857Tex_Lin = new short[1] ;
      P078H5_A6996Tex_Ntalla = new String[] {""} ;
      P078H5_A6997Tex_Unid = new int[1] ;
      P078H5_n6997Tex_Unid = new boolean[] {false} ;
      AV38Tab_alt = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV38Tab_alt[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV37Tab_Anc = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV37Tab_Anc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P078H6_A829TipArtCod = new short[1] ;
      P078H6_A396EmprCod = new String[] {""} ;
      P078H6_A65ArtCod = new String[] {""} ;
      P078H6_A252CliCod = new int[1] ;
      P078H6_n252CliCod = new boolean[] {false} ;
      P078H6_A69ArtDsc = new String[] {""} ;
      P078H6_n69ArtDsc = new boolean[] {false} ;
      P078H6_A830TipArtDsc = new String[] {""} ;
      P078H6_n830TipArtDsc = new boolean[] {false} ;
      P078H6_A63ArtAcaMin = new short[1] ;
      P078H6_n63ArtAcaMin = new boolean[] {false} ;
      P078H6_A1903ArtGraAca = new short[1] ;
      P078H6_n1903ArtGraAca = new boolean[] {false} ;
      P078H6_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P078H6_n95ArtRen = new boolean[] {false} ;
      P078H6_A6953Mat_Maq = new String[] {""} ;
      P078H6_n6953Mat_Maq = new boolean[] {false} ;
      P078H6_A1230ArtEncAnh = new short[1] ;
      P078H6_n1230ArtEncAnh = new boolean[] {false} ;
      P078H6_A1229ArtEncCom = new short[1] ;
      P078H6_n1229ArtEncCom = new boolean[] {false} ;
      P078H6_A101ArtTipPle = new String[] {""} ;
      P078H6_n101ArtTipPle = new boolean[] {false} ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A6953Mat_Maq = "" ;
      A101ArtTipPle = "" ;
      P078H7_A396EmprCod = new String[] {""} ;
      P078H7_A831TipColCod = new byte[1] ;
      P078H7_A483ForColNum = new int[1] ;
      P078H7_A482ForColNom = new String[] {""} ;
      P078H7_A494ForSer = new String[] {""} ;
      P078H7_A252CliCod = new int[1] ;
      P078H7_n252CliCod = new boolean[] {false} ;
      P078H7_A995ForTonal = new String[] {""} ;
      P078H7_n995ForTonal = new boolean[] {false} ;
      P078H7_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P078H7_n485ForFec = new boolean[] {false} ;
      P078H7_A3560ForOpcCli = new String[] {""} ;
      P078H7_n3560ForOpcCli = new boolean[] {false} ;
      P078H7_A7537ForOpNum = new byte[1] ;
      P078H7_n7537ForOpNum = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A995ForTonal = "" ;
      A485ForFec = GXutil.nullDate() ;
      A3560ForOpcCli = "" ;
      P078H8_A396EmprCod = new String[] {""} ;
      P078H8_A7402Tex_TipArt = new String[] {""} ;
      P078H8_A6850Tex_NPed = new int[1] ;
      P078H8_A7405Tex_TalOP = new String[] {""} ;
      P078H8_n7405Tex_TalOP = new boolean[] {false} ;
      P078H8_A7407Tex_AltOp = new String[] {""} ;
      P078H8_n7407Tex_AltOp = new boolean[] {false} ;
      P078H8_A7406Tex_AncOp = new String[] {""} ;
      P078H8_n7406Tex_AncOp = new boolean[] {false} ;
      P078H8_A7404Tex_LnOP = new short[1] ;
      A7402Tex_TipArt = "" ;
      A7405Tex_TalOP = "" ;
      A7407Tex_AltOp = "" ;
      A7406Tex_AncOp = "" ;
      A5098TipDisCod = "" ;
      A5097TipDisDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rtex006__default(),
         new Object[] {
             new Object[] {
            P078H2_A396EmprCod, P078H2_A6850Tex_NPed, P078H2_A252CliCod, P078H2_n252CliCod, P078H2_A6851Tex_FecP, P078H2_n6851Tex_FecP, P078H2_A6852Tex_PedC, P078H2_n6852Tex_PedC, P078H2_A279CliNom, P078H2_A7274Tex_subcli,
            P078H2_n7274Tex_subcli, P078H2_A7400Tex_FecEnt, P078H2_n7400Tex_FecEnt, P078H2_A7398Tex_FecTej, P078H2_n7398Tex_FecTej, P078H2_A7399Tex_FecTen, P078H2_n7399Tex_FecTen, P078H2_A6854Tex_Obs, P078H2_n6854Tex_Obs
            }
            , new Object[] {
            P078H3_A396EmprCod, P078H3_A6850Tex_NPed, P078H3_A6861Tex_NomCol, P078H3_n6861Tex_NomCol, P078H3_A6862Tex_NumCol, P078H3_n6862Tex_NumCol, P078H3_A6863Tex_TcCol, P078H3_n6863Tex_TcCol, P078H3_A7536Tex_NomCo2, P078H3_n7536Tex_NomCo2,
            P078H3_A6991Tex_Unidad, P078H3_n6991Tex_Unidad, P078H3_A6993Tex_MerTn, P078H3_n6993Tex_MerTn, P078H3_A6992Tex_MerTj, P078H3_n6992Tex_MerTj, P078H3_A6858Tex_Kgs, P078H3_n6858Tex_Kgs, P078H3_A6994Tex_Talla, P078H3_n6994Tex_Talla,
            P078H3_A6857Tex_Lin, P078H3_A6859Tex_artc, P078H3_n6859Tex_artc, P078H3_A6995Tex_Maestr, P078H3_n6995Tex_Maestr, P078H3_A7401Tex_TipT, P078H3_n7401Tex_TipT
            }
            , new Object[] {
            P078H4_A396EmprCod, P078H4_A6850Tex_NPed, P078H4_A6857Tex_Lin, P078H4_A6997Tex_Unid, P078H4_n6997Tex_Unid, P078H4_A6996Tex_Ntalla
            }
            , new Object[] {
            P078H5_A396EmprCod, P078H5_A6850Tex_NPed, P078H5_A6857Tex_Lin, P078H5_A6996Tex_Ntalla, P078H5_A6997Tex_Unid, P078H5_n6997Tex_Unid
            }
            , new Object[] {
            P078H6_A829TipArtCod, P078H6_A396EmprCod, P078H6_A65ArtCod, P078H6_A252CliCod, P078H6_A69ArtDsc, P078H6_n69ArtDsc, P078H6_A830TipArtDsc, P078H6_n830TipArtDsc, P078H6_A63ArtAcaMin, P078H6_n63ArtAcaMin,
            P078H6_A1903ArtGraAca, P078H6_n1903ArtGraAca, P078H6_A95ArtRen, P078H6_n95ArtRen, P078H6_A6953Mat_Maq, P078H6_n6953Mat_Maq, P078H6_A1230ArtEncAnh, P078H6_n1230ArtEncAnh, P078H6_A1229ArtEncCom, P078H6_n1229ArtEncCom,
            P078H6_A101ArtTipPle, P078H6_n101ArtTipPle
            }
            , new Object[] {
            P078H7_A396EmprCod, P078H7_A831TipColCod, P078H7_A483ForColNum, P078H7_A482ForColNom, P078H7_A494ForSer, P078H7_A252CliCod, P078H7_A995ForTonal, P078H7_n995ForTonal, P078H7_A485ForFec, P078H7_n485ForFec,
            P078H7_A3560ForOpcCli, P078H7_n3560ForOpcCli, P078H7_A7537ForOpNum, P078H7_n7537ForOpNum
            }
            , new Object[] {
            P078H8_A396EmprCod, P078H8_A7402Tex_TipArt, P078H8_A6850Tex_NPed, P078H8_A7405Tex_TalOP, P078H8_n7405Tex_TalOP, P078H8_A7407Tex_AltOp, P078H8_n7407Tex_AltOp, P078H8_A7406Tex_AncOp, P078H8_n7406Tex_AncOp, P078H8_A7404Tex_LnOP
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A6863Tex_TcCol ;
   private byte AV36Tex004 ;
   private byte AV31TipColCod ;
   private byte AV25Tex002 ;
   private byte AV26Cab_tallas ;
   private byte AV48j ;
   private byte A831TipColCod ;
   private byte A7537ForOpNum ;
   private short AV20Nlin ;
   private short AV21i ;
   private short A6857Tex_Lin ;
   private short AV16Artcrumin ;
   private short AV17ArtGracru ;
   private short AV43ArtEncAnh ;
   private short AV44ArtEncCom ;
   private short A829TipArtCod ;
   private short A63ArtAcaMin ;
   private short A1903ArtGraAca ;
   private short A1230ArtEncAnh ;
   private short A1229ArtEncCom ;
   private short A7404Tex_LnOP ;
   private short Gx_err ;
   private int A6850Tex_NPed ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV9CliCod ;
   private int Gx_OldLine ;
   private int A6862Tex_NumCol ;
   private int A6991Tex_Unidad ;
   private int AV47Tex_NPed ;
   private int AV27Tot_un ;
   private int AV30Forcolnum ;
   private int GX_I ;
   private int A6997Tex_Unid ;
   private int A483ForColNum ;
   private java.math.BigDecimal A6993Tex_MerTn ;
   private java.math.BigDecimal A6992Tex_MerTj ;
   private java.math.BigDecimal A6858Tex_Kgs ;
   private java.math.BigDecimal AV18ArtRen ;
   private java.math.BigDecimal AV13Tot_ks ;
   private java.math.BigDecimal A95ArtRen ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A6852Tex_PedC ;
   private String A279CliNom ;
   private String A7274Tex_subcli ;
   private String A7400Tex_FecEnt ;
   private String A7398Tex_FecTej ;
   private String A7399Tex_FecTen ;
   private String AV15Tex_pedC ;
   private String AV14CliNom ;
   private String AV34TEX_SUBCLI ;
   private String AV42Tex_fecent ;
   private String AV40Tex_fectej ;
   private String AV41Tex_fecten ;
   private String AV22Obs_l ;
   private String A6861Tex_NomCol ;
   private String A7536Tex_NomCo2 ;
   private String A6994Tex_Talla ;
   private String A6859Tex_artc ;
   private String A6995Tex_Maestr ;
   private String A7401Tex_TipT ;
   private String AV8Tex_artc ;
   private String AV46TEX_TIPT ;
   private String AV10ArtDsc ;
   private String AV11TipArtDsc ;
   private String AV19Mat_maq ;
   private String AV45ArtTipPle ;
   private String AV23Tab_talla[] ;
   private String AV28Forser ;
   private String AV29ForcolNom ;
   private String AV32Carta ;
   private String AV35ForOpccli ;
   private String AV24Tab_un[] ;
   private String A6996Tex_Ntalla ;
   private String AV49Tex_Ntalla ;
   private String AV38Tab_alt[] ;
   private String AV37Tab_Anc[] ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A830TipArtDsc ;
   private String A6953Mat_Maq ;
   private String A101ArtTipPle ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A995ForTonal ;
   private String A3560ForOpcCli ;
   private String A7402Tex_TipArt ;
   private String A7405Tex_TalOP ;
   private String A7407Tex_AltOp ;
   private String A7406Tex_AncOp ;
   private String A5098TipDisCod ;
   private String A5097TipDisDsc ;
   private java.util.Date A6851Tex_FecP ;
   private java.util.Date AV12Tex_fecp ;
   private java.util.Date AV33Forfec ;
   private java.util.Date A485ForFec ;
   private boolean n252CliCod ;
   private boolean n6851Tex_FecP ;
   private boolean n6852Tex_PedC ;
   private boolean n7274Tex_subcli ;
   private boolean n7400Tex_FecEnt ;
   private boolean n7398Tex_FecTej ;
   private boolean n7399Tex_FecTen ;
   private boolean n6854Tex_Obs ;
   private boolean brk78H4 ;
   private boolean n6861Tex_NomCol ;
   private boolean n6862Tex_NumCol ;
   private boolean n6863Tex_TcCol ;
   private boolean n7536Tex_NomCo2 ;
   private boolean n6991Tex_Unidad ;
   private boolean n6993Tex_MerTn ;
   private boolean n6992Tex_MerTj ;
   private boolean n6858Tex_Kgs ;
   private boolean n6994Tex_Talla ;
   private boolean n6859Tex_artc ;
   private boolean n6995Tex_Maestr ;
   private boolean n7401Tex_TipT ;
   private boolean returnInSub ;
   private boolean n6997Tex_Unid ;
   private boolean n69ArtDsc ;
   private boolean n830TipArtDsc ;
   private boolean n63ArtAcaMin ;
   private boolean n1903ArtGraAca ;
   private boolean n95ArtRen ;
   private boolean n6953Mat_Maq ;
   private boolean n1230ArtEncAnh ;
   private boolean n1229ArtEncCom ;
   private boolean n101ArtTipPle ;
   private boolean n995ForTonal ;
   private boolean n485ForFec ;
   private boolean n3560ForOpcCli ;
   private boolean n7537ForOpNum ;
   private boolean n7405Tex_TalOP ;
   private boolean n7407Tex_AltOp ;
   private boolean n7406Tex_AncOp ;
   private String A6854Tex_Obs ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P078H2_A396EmprCod ;
   private int[] P078H2_A6850Tex_NPed ;
   private int[] P078H2_A252CliCod ;
   private boolean[] P078H2_n252CliCod ;
   private java.util.Date[] P078H2_A6851Tex_FecP ;
   private boolean[] P078H2_n6851Tex_FecP ;
   private String[] P078H2_A6852Tex_PedC ;
   private boolean[] P078H2_n6852Tex_PedC ;
   private String[] P078H2_A279CliNom ;
   private String[] P078H2_A7274Tex_subcli ;
   private boolean[] P078H2_n7274Tex_subcli ;
   private String[] P078H2_A7400Tex_FecEnt ;
   private boolean[] P078H2_n7400Tex_FecEnt ;
   private String[] P078H2_A7398Tex_FecTej ;
   private boolean[] P078H2_n7398Tex_FecTej ;
   private String[] P078H2_A7399Tex_FecTen ;
   private boolean[] P078H2_n7399Tex_FecTen ;
   private String[] P078H2_A6854Tex_Obs ;
   private boolean[] P078H2_n6854Tex_Obs ;
   private String[] P078H3_A396EmprCod ;
   private int[] P078H3_A6850Tex_NPed ;
   private String[] P078H3_A6861Tex_NomCol ;
   private boolean[] P078H3_n6861Tex_NomCol ;
   private int[] P078H3_A6862Tex_NumCol ;
   private boolean[] P078H3_n6862Tex_NumCol ;
   private byte[] P078H3_A6863Tex_TcCol ;
   private boolean[] P078H3_n6863Tex_TcCol ;
   private String[] P078H3_A7536Tex_NomCo2 ;
   private boolean[] P078H3_n7536Tex_NomCo2 ;
   private int[] P078H3_A6991Tex_Unidad ;
   private boolean[] P078H3_n6991Tex_Unidad ;
   private java.math.BigDecimal[] P078H3_A6993Tex_MerTn ;
   private boolean[] P078H3_n6993Tex_MerTn ;
   private java.math.BigDecimal[] P078H3_A6992Tex_MerTj ;
   private boolean[] P078H3_n6992Tex_MerTj ;
   private java.math.BigDecimal[] P078H3_A6858Tex_Kgs ;
   private boolean[] P078H3_n6858Tex_Kgs ;
   private String[] P078H3_A6994Tex_Talla ;
   private boolean[] P078H3_n6994Tex_Talla ;
   private short[] P078H3_A6857Tex_Lin ;
   private String[] P078H3_A6859Tex_artc ;
   private boolean[] P078H3_n6859Tex_artc ;
   private String[] P078H3_A6995Tex_Maestr ;
   private boolean[] P078H3_n6995Tex_Maestr ;
   private String[] P078H3_A7401Tex_TipT ;
   private boolean[] P078H3_n7401Tex_TipT ;
   private String[] P078H4_A396EmprCod ;
   private int[] P078H4_A6850Tex_NPed ;
   private short[] P078H4_A6857Tex_Lin ;
   private int[] P078H4_A6997Tex_Unid ;
   private boolean[] P078H4_n6997Tex_Unid ;
   private String[] P078H4_A6996Tex_Ntalla ;
   private String[] P078H5_A396EmprCod ;
   private int[] P078H5_A6850Tex_NPed ;
   private short[] P078H5_A6857Tex_Lin ;
   private String[] P078H5_A6996Tex_Ntalla ;
   private int[] P078H5_A6997Tex_Unid ;
   private boolean[] P078H5_n6997Tex_Unid ;
   private short[] P078H6_A829TipArtCod ;
   private String[] P078H6_A396EmprCod ;
   private String[] P078H6_A65ArtCod ;
   private int[] P078H6_A252CliCod ;
   private boolean[] P078H6_n252CliCod ;
   private String[] P078H6_A69ArtDsc ;
   private boolean[] P078H6_n69ArtDsc ;
   private String[] P078H6_A830TipArtDsc ;
   private boolean[] P078H6_n830TipArtDsc ;
   private short[] P078H6_A63ArtAcaMin ;
   private boolean[] P078H6_n63ArtAcaMin ;
   private short[] P078H6_A1903ArtGraAca ;
   private boolean[] P078H6_n1903ArtGraAca ;
   private java.math.BigDecimal[] P078H6_A95ArtRen ;
   private boolean[] P078H6_n95ArtRen ;
   private String[] P078H6_A6953Mat_Maq ;
   private boolean[] P078H6_n6953Mat_Maq ;
   private short[] P078H6_A1230ArtEncAnh ;
   private boolean[] P078H6_n1230ArtEncAnh ;
   private short[] P078H6_A1229ArtEncCom ;
   private boolean[] P078H6_n1229ArtEncCom ;
   private String[] P078H6_A101ArtTipPle ;
   private boolean[] P078H6_n101ArtTipPle ;
   private String[] P078H7_A396EmprCod ;
   private byte[] P078H7_A831TipColCod ;
   private int[] P078H7_A483ForColNum ;
   private String[] P078H7_A482ForColNom ;
   private String[] P078H7_A494ForSer ;
   private int[] P078H7_A252CliCod ;
   private boolean[] P078H7_n252CliCod ;
   private String[] P078H7_A995ForTonal ;
   private boolean[] P078H7_n995ForTonal ;
   private java.util.Date[] P078H7_A485ForFec ;
   private boolean[] P078H7_n485ForFec ;
   private String[] P078H7_A3560ForOpcCli ;
   private boolean[] P078H7_n3560ForOpcCli ;
   private byte[] P078H7_A7537ForOpNum ;
   private boolean[] P078H7_n7537ForOpNum ;
   private String[] P078H8_A396EmprCod ;
   private String[] P078H8_A7402Tex_TipArt ;
   private int[] P078H8_A6850Tex_NPed ;
   private String[] P078H8_A7405Tex_TalOP ;
   private boolean[] P078H8_n7405Tex_TalOP ;
   private String[] P078H8_A7407Tex_AltOp ;
   private boolean[] P078H8_n7407Tex_AltOp ;
   private String[] P078H8_A7406Tex_AncOp ;
   private boolean[] P078H8_n7406Tex_AncOp ;
   private short[] P078H8_A7404Tex_LnOP ;
}

final  class rtex006__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P078H2", "SELECT T1.EmprCod, T1.Tex_NPed, T1.CliCod, T1.Tex_FecP, T1.Tex_PedC, T2.CliNom, T1.Tex_subcli, T1.Tex_FecEnt, T1.Tex_FecTej, T1.Tex_FecTen, T1.Tex_Obs FROM (TXPTEX000 T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.Tex_NPed = ? ORDER BY T1.EmprCod, T1.Tex_NPed ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078H3", "SELECT EmprCod, Tex_NPed, Tex_NomCol, Tex_NumCol, Tex_TcCol, Tex_NomCo2, Tex_Unidad, Tex_MerTn, Tex_MerTj, Tex_Kgs, Tex_Talla, Tex_Lin, Tex_artc, Tex_Maestr, Tex_TipT FROM TXPTEX001 WHERE (EmprCod = ?) AND (Tex_NPed = ?) ORDER BY Tex_Maestr, Tex_artc, Tex_Lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078H4", "SELECT EmprCod, Tex_NPed, Tex_Lin, Tex_Unid, Tex_Ntalla FROM TXPTEX002 WHERE EmprCod = ? and Tex_NPed = ? and Tex_Lin = ? ORDER BY EmprCod, Tex_NPed, Tex_Lin, Tex_Ntalla ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P078H5", "SELECT EmprCod, Tex_NPed, Tex_Lin, Tex_Ntalla, Tex_Unid FROM TXPTEX002 WHERE EmprCod = ? and Tex_NPed = ? and Tex_Lin = ? and Tex_Ntalla = ? ORDER BY EmprCod, Tex_NPed, Tex_Lin, Tex_Ntalla ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078H6", "SELECT T1.TipArtCod, T1.EmprCod, T1.ArtCod, T1.CliCod, T1.ArtDsc, T2.TipArtDsc, T1.ArtAcaMin, T1.ArtGraAca, T1.ArtRen, T1.Mat_Maq, T1.ArtEncAnh, T1.ArtEncCom, T1.ArtTipPle FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078H7", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForTonal, ForFec, ForOpcCli, ForOpNum FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P078H8", "SELECT EmprCod, Tex_TipArt, Tex_NPed, Tex_TalOP, Tex_AltOp, Tex_AncOp, Tex_LnOP FROM TXPTEX003 WHERE EmprCod = ? and Tex_NPed = ? and Tex_TipArt = ? ORDER BY EmprCod, Tex_NPed, Tex_TipArt, Tex_LnOP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((String[]) buf[21])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 4);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 2);
               return;
      }
   }

}

