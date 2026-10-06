package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rtex006i extends GXReport
{
   public rtex006i( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rtex006i.class ), "" );
   }

   public rtex006i( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      rtex006i.this.aP1 = new int[] {0};
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
      rtex006i.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rtex006i.this.A6850Tex_NPed = aP1[0];
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("INFORME COMERCIAL II") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A6850Tex_NPed ;
         new app.pimpop(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
         rtex006i.this.A396EmprCod = GXv_char1[0] ;
         rtex006i.this.A6850Tex_NPed = GXv_int2[0] ;
         /* Using cursor P07CU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A252CliCod = P07CU2_A252CliCod[0] ;
            n252CliCod = P07CU2_n252CliCod[0] ;
            A6851Tex_FecP = P07CU2_A6851Tex_FecP[0] ;
            n6851Tex_FecP = P07CU2_n6851Tex_FecP[0] ;
            A6852Tex_PedC = P07CU2_A6852Tex_PedC[0] ;
            n6852Tex_PedC = P07CU2_n6852Tex_PedC[0] ;
            A279CliNom = P07CU2_A279CliNom[0] ;
            A7274Tex_subcli = P07CU2_A7274Tex_subcli[0] ;
            n7274Tex_subcli = P07CU2_n7274Tex_subcli[0] ;
            A7400Tex_FecEnt = P07CU2_A7400Tex_FecEnt[0] ;
            n7400Tex_FecEnt = P07CU2_n7400Tex_FecEnt[0] ;
            A7398Tex_FecTej = P07CU2_A7398Tex_FecTej[0] ;
            n7398Tex_FecTej = P07CU2_n7398Tex_FecTej[0] ;
            A7399Tex_FecTen = P07CU2_A7399Tex_FecTen[0] ;
            n7399Tex_FecTen = P07CU2_n7399Tex_FecTen[0] ;
            A6854Tex_Obs = P07CU2_A6854Tex_Obs[0] ;
            n6854Tex_Obs = P07CU2_n6854Tex_Obs[0] ;
            A279CliNom = P07CU2_A279CliNom[0] ;
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
               h7CU0( false, 15) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Obs_l, "")), 41, Gx_line+0, 355, Gx_line+15, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+15) ;
               AV21i = (short)(AV21i+1) ;
            }
            h7CU0( false, 7) ;
            getPrinter().GxDrawLine(33, Gx_line+6, 1078, Gx_line+6, 2, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+7) ;
            AV13Tot_ks = DecimalUtil.doubleToDec(0) ;
            AV27Tot_un = 0 ;
            AV50Artcod = " " ;
            AV57Tex_talla = httpContext.getMessage( "N", "") ;
            GX_I = 1 ;
            while ( GX_I <= 1000 )
            {
               AV52Tab_sumu[GX_I-1] = (short)(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV53Sum_ut = (short)(0) ;
            /* Using cursor P07CU3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A7401Tex_TipT = P07CU3_A7401Tex_TipT[0] ;
               n7401Tex_TipT = P07CU3_n7401Tex_TipT[0] ;
               A6861Tex_NomCol = P07CU3_A6861Tex_NomCol[0] ;
               n6861Tex_NomCol = P07CU3_n6861Tex_NomCol[0] ;
               A6862Tex_NumCol = P07CU3_A6862Tex_NumCol[0] ;
               n6862Tex_NumCol = P07CU3_n6862Tex_NumCol[0] ;
               A6863Tex_TcCol = P07CU3_A6863Tex_TcCol[0] ;
               n6863Tex_TcCol = P07CU3_n6863Tex_TcCol[0] ;
               A6994Tex_Talla = P07CU3_A6994Tex_Talla[0] ;
               n6994Tex_Talla = P07CU3_n6994Tex_Talla[0] ;
               A8161Tex_KgsNt = P07CU3_A8161Tex_KgsNt[0] ;
               n8161Tex_KgsNt = P07CU3_n8161Tex_KgsNt[0] ;
               A7536Tex_NomCo2 = P07CU3_A7536Tex_NomCo2[0] ;
               n7536Tex_NomCo2 = P07CU3_n7536Tex_NomCo2[0] ;
               A6991Tex_Unidad = P07CU3_A6991Tex_Unidad[0] ;
               n6991Tex_Unidad = P07CU3_n6991Tex_Unidad[0] ;
               A6993Tex_MerTn = P07CU3_A6993Tex_MerTn[0] ;
               n6993Tex_MerTn = P07CU3_n6993Tex_MerTn[0] ;
               A6992Tex_MerTj = P07CU3_A6992Tex_MerTj[0] ;
               n6992Tex_MerTj = P07CU3_n6992Tex_MerTj[0] ;
               A6858Tex_Kgs = P07CU3_A6858Tex_Kgs[0] ;
               n6858Tex_Kgs = P07CU3_n6858Tex_Kgs[0] ;
               A6857Tex_Lin = P07CU3_A6857Tex_Lin[0] ;
               A6859Tex_artc = P07CU3_A6859Tex_artc[0] ;
               n6859Tex_artc = P07CU3_n6859Tex_artc[0] ;
               if ( ( GXutil.strcmp(AV50Artcod, A6859Tex_artc) != 0 ) && ( GXutil.strcmp(AV50Artcod, " ") != 0 ) )
               {
                  if ( GXutil.strcmp(AV57Tex_talla, httpContext.getMessage( "S", "")) == 0 )
                  {
                     /* Execute user subroutine: 'TOTALTALLAS' */
                     S141 ();
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
                  }
                  /* Execute user subroutine: 'TOTAL' */
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
               }
               AV8Tex_artc = A6859Tex_artc ;
               AV9CliCod = A252CliCod ;
               /* Execute user subroutine: 'ARTICU' */
               S151 ();
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
               AV28Forser = A6859Tex_artc ;
               AV29ForcolNom = A6861Tex_NomCol ;
               AV30Forcolnum = A6862Tex_NumCol ;
               AV31TipColCod = A6863Tex_TcCol ;
               /* Execute user subroutine: 'CFORMU' */
               S161 ();
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
               if ( GXutil.strcmp(A6994Tex_Talla, httpContext.getMessage( "N", "")) == 0 )
               {
                  if ( GXutil.strcmp(A6859Tex_artc, AV50Artcod) != 0 )
                  {
                     h7CU0( false, 108) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "ARTICULO:", ""), 41, Gx_line+14, 111, Gx_line+28, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6859Tex_artc, "")), 122, Gx_line+14, 206, Gx_line+29, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10ArtDsc, "")), 230, Gx_line+14, 366, Gx_line+29, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11TipArtDsc, "")), 122, Gx_line+33, 279, Gx_line+48, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Item", ""), 41, Gx_line+90, 67, Gx_line+104, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Kgs Bruto", ""), 85, Gx_line+90, 143, Gx_line+104, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Mer TJ", ""), 298, Gx_line+90, 340, Gx_line+104, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Mer TÑ", ""), 355, Gx_line+90, 400, Gx_line+104, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 407, Gx_line+90, 438, Gx_line+104, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 611, Gx_line+90, 657, Gx_line+104, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(41, Gx_line+104, 67, Gx_line+104, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(85, Gx_line+104, 143, Gx_line+104, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(298, Gx_line+104, 340, Gx_line+104, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(355, Gx_line+104, 397, Gx_line+104, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(407, Gx_line+104, 502, Gx_line+104, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(611, Gx_line+104, 657, Gx_line+104, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "ANCHO", ""), 560, Gx_line+15, 601, Gx_line+29, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "DENSIDAD", ""), 560, Gx_line+30, 619, Gx_line+44, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "RENDIMIENTO", ""), 560, Gx_line+49, 640, Gx_line+63, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "MAQ. TEJIDO", ""), 782, Gx_line+15, 854, Gx_line+29, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16Artcrumin), "ZZZ")), 740, Gx_line+15, 760, Gx_line+30, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17ArtGracru), "ZZZZ")), 733, Gx_line+30, 759, Gx_line+45, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18ArtRen, "ZZZ.ZZ")), 721, Gx_line+49, 760, Gx_line+64, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Mat_maq, "")), 876, Gx_line+15, 981, Gx_line+30, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawRect(542, Gx_line+10, 765, Gx_line+66, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(542, Gx_line+27, 765, Gx_line+27, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(542, Gx_line+46, 765, Gx_line+46, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 232, Gx_line+90, 288, Gx_line+104, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(232, Gx_line+104, 288, Gx_line+104, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText("%", 344, Gx_line+76, 354, Gx_line+90, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(360, Gx_line+83, 400, Gx_line+83, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(298, Gx_line+83, 338, Gx_line+83, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Carta", ""), 670, Gx_line+90, 702, Gx_line+104, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(670, Gx_line+104, 743, Gx_line+104, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 747, Gx_line+90, 784, Gx_line+104, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(747, Gx_line+104, 797, Gx_line+104, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Opcion", ""), 801, Gx_line+90, 844, Gx_line+104, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(801, Gx_line+104, 844, Gx_line+104, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(763, Gx_line+27, 990, Gx_line+27, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "ENC. ANCHO", ""), 782, Gx_line+30, 852, Gx_line+44, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43ArtEncAnh), "ZZZ9")), 857, Gx_line+30, 883, Gx_line+45, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "LARGO", ""), 905, Gx_line+30, 945, Gx_line+44, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44ArtEncCom), "ZZZ9")), 950, Gx_line+30, 976, Gx_line+45, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(763, Gx_line+46, 990, Gx_line+46, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "PLEGADO", ""), 782, Gx_line+49, 836, Gx_line+63, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45ArtTipPle, "")), 855, Gx_line+49, 908, Gx_line+64, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Color 2", ""), 511, Gx_line+90, 554, Gx_line+104, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(511, Gx_line+104, 606, Gx_line+104, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(764, Gx_line+10, 990, Gx_line+66, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Kgs Netos", ""), 159, Gx_line+90, 220, Gx_line+104, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(159, Gx_line+104, 220, Gx_line+104, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+108) ;
                  }
                  h7CU0( false, 15) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6857Tex_Lin), "ZZZ9")), 41, Gx_line+0, 67, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6858Tex_Kgs, "ZZZZZ9.99")), 88, Gx_line+0, 145, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6992Tex_MerTj, "ZZ9.99")), 302, Gx_line+0, 341, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6993Tex_MerTn, "ZZ9.99")), 363, Gx_line+0, 402, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6861Tex_NomCol, "")), 407, Gx_line+0, 476, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6862Tex_NumCol), "ZZZZZ9")), 611, Gx_line+0, 650, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6991Tex_Unidad), "ZZZZZ9")), 251, Gx_line+0, 290, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Carta, "")), 670, Gx_line+0, 723, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV33Forfec, "99/99/99"), 747, Gx_line+0, 796, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35ForOpccli, "")), 811, Gx_line+0, 835, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7536Tex_NomCo2, "")), 511, Gx_line+0, 580, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A8161Tex_KgsNt, "ZZZZZ9.99")), 165, Gx_line+0, 222, Gx_line+15, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+15) ;
                  AV13Tot_ks = AV13Tot_ks.add(A6858Tex_Kgs) ;
                  AV27Tot_un = (int)(AV27Tot_un+A6991Tex_Unidad) ;
               }
               if ( GXutil.strcmp(A6994Tex_Talla, httpContext.getMessage( "S", "")) == 0 )
               {
                  if ( GXutil.strcmp(A6859Tex_artc, AV50Artcod) != 0 )
                  {
                     h7CU0( false, 77) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "ARTICULO:", ""), 47, Gx_line+13, 117, Gx_line+27, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6859Tex_artc, "")), 122, Gx_line+13, 206, Gx_line+28, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10ArtDsc, "")), 230, Gx_line+13, 366, Gx_line+28, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11TipArtDsc, "")), 122, Gx_line+32, 279, Gx_line+47, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("%", 263, Gx_line+64, 273, Gx_line+78, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(279, Gx_line+72, 319, Gx_line+72, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(217, Gx_line+72, 257, Gx_line+72, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "ANCHO", ""), 561, Gx_line+13, 602, Gx_line+27, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "DENSIDAD", ""), 561, Gx_line+28, 620, Gx_line+42, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "RENDIMIENTO", ""), 561, Gx_line+47, 641, Gx_line+61, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "MAQ. TEJIDO", ""), 783, Gx_line+13, 855, Gx_line+27, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16Artcrumin), "ZZZ")), 741, Gx_line+13, 761, Gx_line+28, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17ArtGracru), "ZZZZ")), 734, Gx_line+28, 760, Gx_line+43, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18ArtRen, "ZZZ.ZZ")), 722, Gx_line+47, 761, Gx_line+62, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19Mat_maq, "")), 877, Gx_line+13, 982, Gx_line+28, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawRect(543, Gx_line+8, 766, Gx_line+64, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(543, Gx_line+25, 766, Gx_line+25, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(543, Gx_line+44, 766, Gx_line+44, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(764, Gx_line+25, 991, Gx_line+25, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "ENC. ANCHO", ""), 783, Gx_line+28, 853, Gx_line+42, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43ArtEncAnh), "ZZZ9")), 858, Gx_line+28, 884, Gx_line+43, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "LARGO", ""), 906, Gx_line+28, 946, Gx_line+42, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44ArtEncCom), "ZZZ9")), 951, Gx_line+28, 977, Gx_line+43, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(764, Gx_line+44, 991, Gx_line+44, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "PLEGADO", ""), 783, Gx_line+47, 837, Gx_line+61, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45ArtTipPle, "")), 856, Gx_line+47, 909, Gx_line+62, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawRect(765, Gx_line+8, 991, Gx_line+64, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+77) ;
                  }
                  AV54Aux_nped = A6850Tex_NPed ;
                  AV55AUX_LIN = A6857Tex_Lin ;
                  AV58TEX_NOMCOL = A6861Tex_NomCol ;
                  AV59TEX_NUMCOL = A6862Tex_NumCol ;
                  AV60Tex_kgs = A6858Tex_Kgs ;
                  if ( ( GXutil.strcmp(AV50Artcod, A6859Tex_artc) == 0 ) || ( GXutil.strcmp(AV50Artcod, " ") == 0 ) )
                  {
                     if ( GXutil.strcmp(AV50Artcod, " ") == 0 )
                     {
                        AV56Cambio_art = (byte)(1) ;
                     }
                     else
                     {
                        AV56Cambio_art = (byte)(0) ;
                     }
                     /* Execute user subroutine: 'TALLAS' */
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
                  }
                  else
                  {
                     AV56Cambio_art = (byte)(1) ;
                     /* Execute user subroutine: 'TALLAS' */
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
                  }
                  AV13Tot_ks = AV13Tot_ks.add(A6858Tex_Kgs) ;
                  AV27Tot_un = (int)(AV27Tot_un+A6991Tex_Unidad) ;
                  AV57Tex_talla = A6994Tex_Talla ;
               }
               AV50Artcod = A6859Tex_artc ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( GXutil.strcmp(AV57Tex_talla, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Execute user subroutine: 'TOTALTALLAS' */
            S141 ();
            if ( returnInSub )
            {
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Execute user subroutine: 'TOTAL' */
         S111 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7CU0( true, 0) ;
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
      /* 'TOTAL' Routine */
      returnInSub = false ;
      h7CU0( false, 34) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13Tot_ks, "ZZZZZZ9.99")), 81, Gx_line+14, 145, Gx_line+29, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(33, Gx_line+31, 1078, Gx_line+31, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27Tot_un), "ZZZZZ9")), 170, Gx_line+14, 209, Gx_line+29, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(33, Gx_line+9, 1078, Gx_line+9, 2, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+34) ;
      AV13Tot_ks = DecimalUtil.doubleToDec(0) ;
      AV27Tot_un = 0 ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'TALLAS' Routine */
      returnInSub = false ;
      AV21i = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV24Tab_un[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV23Tab_talla[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV38Tab_alt[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV37Tab_Anc[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      AV51Sum_u = (short)(0) ;
      /* Using cursor P07CU4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV54Aux_nped), Short.valueOf(AV55AUX_LIN)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A7832Aux_LIN = P07CU4_A7832Aux_LIN[0] ;
         A7831Aux_NPED = P07CU4_A7831Aux_NPED[0] ;
         A7839Aux_UNID = P07CU4_A7839Aux_UNID[0] ;
         n7839Aux_UNID = P07CU4_n7839Aux_UNID[0] ;
         A7841Aux_ALT = P07CU4_A7841Aux_ALT[0] ;
         n7841Aux_ALT = P07CU4_n7841Aux_ALT[0] ;
         A7840Aux_ANC = P07CU4_A7840Aux_ANC[0] ;
         n7840Aux_ANC = P07CU4_n7840Aux_ANC[0] ;
         A7838Aux_TALLA = P07CU4_A7838Aux_TALLA[0] ;
         AV23Tab_talla[AV21i-1] = A7838Aux_TALLA ;
         AV24Tab_un[AV21i-1] = GXutil.rtrim( GXutil.trim( GXutil.str( A7839Aux_UNID, 4, 0))) ;
         AV38Tab_alt[AV21i-1] = A7841Aux_ALT ;
         AV37Tab_Anc[AV21i-1] = A7840Aux_ANC ;
         AV53Sum_ut = (short)(AV53Sum_ut+A7839Aux_UNID) ;
         AV51Sum_u = (short)(AV51Sum_u+A7839Aux_UNID) ;
         AV52Tab_sumu[AV21i-1] = (short)(AV52Tab_sumu[AV21i-1]+A7839Aux_UNID) ;
         AV21i = (short)(AV21i+1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Execute user subroutine: 'IMPTALLAS' */
      S131 ();
      if (returnInSub) return;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'IMPTALLAS' Routine */
      returnInSub = false ;
      if ( AV56Cambio_art == 1 )
      {
         h7CU0( false, 45) ;
         getPrinter().GxDrawLine(479, Gx_line+21, 479, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawRect(33, Gx_line+21, 1078, Gx_line+43, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(520, Gx_line+21, 520, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(561, Gx_line+21, 561, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(604, Gx_line+21, 604, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(860, Gx_line+21, 860, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(819, Gx_line+21, 819, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(775, Gx_line+21, 775, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(734, Gx_line+21, 734, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(691, Gx_line+21, 691, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(649, Gx_line+21, 649, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(904, Gx_line+21, 904, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(945, Gx_line+21, 945, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(989, Gx_line+21, 989, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(1029, Gx_line+21, 1029, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ITEM", ""), 39, Gx_line+25, 69, Gx_line+40, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[1-1], "")), 485, Gx_line+25, 515, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[2-1], "")), 527, Gx_line+25, 557, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[3-1], "")), 570, Gx_line+25, 600, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[4-1], "")), 613, Gx_line+25, 643, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[5-1], "")), 655, Gx_line+25, 685, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[6-1], "")), 699, Gx_line+25, 729, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[7-1], "")), 742, Gx_line+25, 772, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[8-1], "")), 782, Gx_line+25, 812, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[9-1], "")), 825, Gx_line+25, 855, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[10-1], "")), 869, Gx_line+25, 899, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[11-1], "")), 910, Gx_line+25, 940, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[12-1], "")), 953, Gx_line+25, 983, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Tab_talla[13-1], "")), 996, Gx_line+25, 1026, Gx_line+41, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "TOTAL", ""), 1034, Gx_line+25, 1071, Gx_line+40, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Kgs Bruto", ""), 78, Gx_line+25, 145, Gx_line+40, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 157, Gx_line+25, 194, Gx_line+40, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 265, Gx_line+25, 310, Gx_line+40, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(316, Gx_line+21, 316, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(258, Gx_line+21, 258, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(151, Gx_line+21, 151, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(72, Gx_line+21, 72, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Carta", ""), 323, Gx_line+25, 360, Gx_line+40, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Año", ""), 409, Gx_line+25, 432, Gx_line+40, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Op", ""), 448, Gx_line+25, 464, Gx_line+40, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(402, Gx_line+21, 402, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(439, Gx_line+21, 439, Gx_line+43, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 1, 128, 128, 128) ;
         getPrinter().GxDrawText(httpContext.getMessage( "13 Tallas......", ""), 658, Gx_line+2, 738, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(479, Gx_line+8, 646, Gx_line+8, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(755, Gx_line+8, 1030, Gx_line+8, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+45) ;
      }
      h7CU0( false, 26) ;
      getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV55AUX_LIN), "ZZZ9")), 39, Gx_line+6, 69, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[1-1], "")), 485, Gx_line+6, 515, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[2-1], "")), 527, Gx_line+6, 557, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[3-1], "")), 570, Gx_line+6, 600, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[4-1], "")), 613, Gx_line+6, 643, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[5-1], "")), 655, Gx_line+6, 685, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[6-1], "")), 699, Gx_line+6, 729, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[7-1], "")), 742, Gx_line+6, 772, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[8-1], "")), 782, Gx_line+6, 812, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[9-1], "")), 825, Gx_line+6, 855, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[10-1], "")), 869, Gx_line+6, 899, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(479, Gx_line+2, 479, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawRect(33, Gx_line+2, 1078, Gx_line+24, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(520, Gx_line+2, 520, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(561, Gx_line+2, 561, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(604, Gx_line+2, 604, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(860, Gx_line+2, 860, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(819, Gx_line+2, 819, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(775, Gx_line+2, 775, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(734, Gx_line+2, 734, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(691, Gx_line+2, 691, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(649, Gx_line+2, 649, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[11-1], "")), 910, Gx_line+6, 940, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[12-1], "")), 953, Gx_line+6, 983, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Tab_un[13-1], "")), 996, Gx_line+6, 1026, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(904, Gx_line+2, 904, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(945, Gx_line+2, 945, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(989, Gx_line+2, 989, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(1029, Gx_line+3, 1029, Gx_line+25, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV51Sum_u), "ZZZZ")), 1042, Gx_line+6, 1072, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV60Tex_kgs, "ZZZZZ9.99")), 78, Gx_line+6, 145, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TEX_NOMCOL, "")), 157, Gx_line+6, 253, Gx_line+22, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV59TEX_NUMCOL), "ZZZZZ9")), 265, Gx_line+6, 310, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(72, Gx_line+2, 72, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(151, Gx_line+2, 151, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(258, Gx_line+2, 258, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(316, Gx_line+2, 316, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Carta, "")), 321, Gx_line+6, 395, Gx_line+22, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61Anyo), "ZZZ9")), 406, Gx_line+6, 436, Gx_line+22, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35ForOpccli, "")), 448, Gx_line+6, 464, Gx_line+22, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(402, Gx_line+2, 402, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(439, Gx_line+2, 439, Gx_line+24, 1, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+26) ;
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'TOTALTALLAS' Routine */
      returnInSub = false ;
      h7CU0( false, 72) ;
      getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52Tab_sumu[1-1]), "ZZZZ")), 485, Gx_line+55, 515, Gx_line+71, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52Tab_sumu[2-1]), "ZZZZ")), 527, Gx_line+55, 557, Gx_line+71, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52Tab_sumu[4-1]), "ZZZZ")), 613, Gx_line+55, 643, Gx_line+71, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52Tab_sumu[3-1]), "ZZZZ")), 570, Gx_line+55, 600, Gx_line+71, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52Tab_sumu[8-1]), "ZZZZ")), 782, Gx_line+55, 812, Gx_line+71, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52Tab_sumu[7-1]), "ZZZZ")), 742, Gx_line+55, 772, Gx_line+71, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52Tab_sumu[6-1]), "ZZZZ")), 699, Gx_line+55, 729, Gx_line+71, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52Tab_sumu[5-1]), "ZZZZ")), 655, Gx_line+55, 685, Gx_line+71, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52Tab_sumu[12-1]), "ZZZZ")), 953, Gx_line+55, 983, Gx_line+71, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52Tab_sumu[11-1]), "ZZZZ")), 910, Gx_line+55, 940, Gx_line+71, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52Tab_sumu[10-1]), "ZZZZ")), 869, Gx_line+55, 899, Gx_line+71, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52Tab_sumu[9-1]), "ZZZZ")), 825, Gx_line+55, 855, Gx_line+71, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52Tab_sumu[13-1]), "ZZZZ")), 996, Gx_line+55, 1026, Gx_line+71, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53Sum_ut), "ZZZ9")), 1044, Gx_line+55, 1074, Gx_line+71, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "TOTAL", ""), 47, Gx_line+55, 84, Gx_line+70, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(479, Gx_line+25, 479, Gx_line+49, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawRect(33, Gx_line+25, 1078, Gx_line+49, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(479, Gx_line+2, 479, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawRect(33, Gx_line+2, 1078, Gx_line+24, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Ancho Acabado (Pulgadas)", ""), 43, Gx_line+6, 219, Gx_line+21, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[1-1], "")), 486, Gx_line+6, 513, Gx_line+20, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Altura Acabada (Pulgadas)", ""), 43, Gx_line+29, 226, Gx_line+44, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[2-1], "")), 528, Gx_line+6, 555, Gx_line+20, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[3-1], "")), 570, Gx_line+6, 597, Gx_line+20, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[4-1], "")), 614, Gx_line+6, 641, Gx_line+20, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[5-1], "")), 657, Gx_line+6, 684, Gx_line+20, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[6-1], "")), 700, Gx_line+6, 727, Gx_line+20, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[7-1], "")), 742, Gx_line+6, 769, Gx_line+20, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[8-1], "")), 784, Gx_line+6, 811, Gx_line+20, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[9-1], "")), 827, Gx_line+6, 854, Gx_line+20, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[10-1], "")), 870, Gx_line+6, 897, Gx_line+20, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[11-1], "")), 911, Gx_line+6, 938, Gx_line+20, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[12-1], "")), 954, Gx_line+6, 981, Gx_line+20, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Tab_Anc[13-1], "")), 996, Gx_line+6, 1023, Gx_line+20, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(520, Gx_line+2, 520, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(561, Gx_line+2, 561, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(604, Gx_line+2, 604, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(649, Gx_line+2, 649, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(691, Gx_line+2, 691, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(734, Gx_line+2, 734, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(775, Gx_line+2, 775, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(819, Gx_line+2, 819, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(860, Gx_line+2, 860, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(904, Gx_line+2, 904, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(945, Gx_line+2, 945, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(989, Gx_line+2, 989, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(1029, Gx_line+2, 1029, Gx_line+24, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[1-1], "")), 486, Gx_line+30, 513, Gx_line+44, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[2-1], "")), 528, Gx_line+30, 555, Gx_line+44, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[3-1], "")), 570, Gx_line+30, 597, Gx_line+44, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[4-1], "")), 614, Gx_line+30, 641, Gx_line+44, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[5-1], "")), 657, Gx_line+30, 684, Gx_line+44, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[6-1], "")), 700, Gx_line+30, 727, Gx_line+44, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[7-1], "")), 742, Gx_line+30, 769, Gx_line+44, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[8-1], "")), 784, Gx_line+30, 811, Gx_line+44, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[9-1], "")), 827, Gx_line+30, 854, Gx_line+44, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[10-1], "")), 870, Gx_line+30, 897, Gx_line+44, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[11-1], "")), 911, Gx_line+30, 938, Gx_line+44, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[12-1], "")), 954, Gx_line+29, 981, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Tab_alt[13-1], "")), 996, Gx_line+30, 1023, Gx_line+44, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(520, Gx_line+26, 520, Gx_line+48, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(561, Gx_line+26, 561, Gx_line+48, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(604, Gx_line+26, 604, Gx_line+48, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(649, Gx_line+26, 649, Gx_line+48, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(691, Gx_line+26, 691, Gx_line+48, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(734, Gx_line+26, 734, Gx_line+48, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(775, Gx_line+26, 775, Gx_line+48, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(819, Gx_line+26, 819, Gx_line+48, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(860, Gx_line+26, 860, Gx_line+48, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(904, Gx_line+26, 904, Gx_line+48, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(945, Gx_line+26, 945, Gx_line+48, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(989, Gx_line+26, 989, Gx_line+48, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(1029, Gx_line+26, 1029, Gx_line+48, 1, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+72) ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV52Tab_sumu[GX_I-1] = (short)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV53Sum_ut = (short)(0) ;
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      /* Using cursor P07CU5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV9CliCod), AV8Tex_artc});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A829TipArtCod = P07CU5_A829TipArtCod[0] ;
         A65ArtCod = P07CU5_A65ArtCod[0] ;
         A252CliCod = P07CU5_A252CliCod[0] ;
         n252CliCod = P07CU5_n252CliCod[0] ;
         A69ArtDsc = P07CU5_A69ArtDsc[0] ;
         n69ArtDsc = P07CU5_n69ArtDsc[0] ;
         A830TipArtDsc = P07CU5_A830TipArtDsc[0] ;
         n830TipArtDsc = P07CU5_n830TipArtDsc[0] ;
         A63ArtAcaMin = P07CU5_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P07CU5_n63ArtAcaMin[0] ;
         A1903ArtGraAca = P07CU5_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P07CU5_n1903ArtGraAca[0] ;
         A95ArtRen = P07CU5_A95ArtRen[0] ;
         n95ArtRen = P07CU5_n95ArtRen[0] ;
         A6953Mat_Maq = P07CU5_A6953Mat_Maq[0] ;
         n6953Mat_Maq = P07CU5_n6953Mat_Maq[0] ;
         A1230ArtEncAnh = P07CU5_A1230ArtEncAnh[0] ;
         n1230ArtEncAnh = P07CU5_n1230ArtEncAnh[0] ;
         A1229ArtEncCom = P07CU5_A1229ArtEncCom[0] ;
         n1229ArtEncCom = P07CU5_n1229ArtEncCom[0] ;
         A101ArtTipPle = P07CU5_A101ArtTipPle[0] ;
         n101ArtTipPle = P07CU5_n101ArtTipPle[0] ;
         A830TipArtDsc = P07CU5_A830TipArtDsc[0] ;
         n830TipArtDsc = P07CU5_n830TipArtDsc[0] ;
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
      pr_default.close(3);
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      AV32Carta = " " ;
      AV33Forfec = GXutil.nullDate() ;
      /* Using cursor P07CU6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV9CliCod), AV28Forser, AV29ForcolNom, Integer.valueOf(AV30Forcolnum), Byte.valueOf(AV31TipColCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A831TipColCod = P07CU6_A831TipColCod[0] ;
         A483ForColNum = P07CU6_A483ForColNum[0] ;
         A482ForColNom = P07CU6_A482ForColNom[0] ;
         A494ForSer = P07CU6_A494ForSer[0] ;
         A252CliCod = P07CU6_A252CliCod[0] ;
         n252CliCod = P07CU6_n252CliCod[0] ;
         A995ForTonal = P07CU6_A995ForTonal[0] ;
         n995ForTonal = P07CU6_n995ForTonal[0] ;
         A485ForFec = P07CU6_A485ForFec[0] ;
         n485ForFec = P07CU6_n485ForFec[0] ;
         A3560ForOpcCli = P07CU6_A3560ForOpcCli[0] ;
         n3560ForOpcCli = P07CU6_n3560ForOpcCli[0] ;
         A7537ForOpNum = P07CU6_A7537ForOpNum[0] ;
         n7537ForOpNum = P07CU6_n7537ForOpNum[0] ;
         AV32Carta = A995ForTonal ;
         AV33Forfec = A485ForFec ;
         AV61Anyo = (short)(GXutil.year( AV33Forfec)) ;
         AV35ForOpccli = A3560ForOpcCli ;
         if ( A7537ForOpNum > 0 )
         {
            AV35ForOpccli = GXutil.trim( GXutil.str( A7537ForOpNum, 2, 0)) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void h7CU0( boolean bFoot ,
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
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA:", ""), 883, Gx_line+119, 930, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV12Tex_fecp, "99/99/99"), 995, Gx_line+119, 1044, Gx_line+134, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OP", ""), 883, Gx_line+146, 902, Gx_line+160, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6850Tex_NPed), "ZZZZZZZ9")), 995, Gx_line+146, 1046, Gx_line+161, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(860, Gx_line+105, 1078, Gx_line+174, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(860, Gx_line+139, 1078, Gx_line+139, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(954, Gx_line+105, 954, Gx_line+174, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(33, Gx_line+249, 1078, Gx_line+249, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OBSERVACIONES:", ""), 41, Gx_line+253, 155, Gx_line+267, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 1042, Gx_line+253, 1081, Gx_line+268, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 998, Gx_line+253, 1033, Gx_line+267, 0+256, 0, 0, 0) ;
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
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA DE TEÑIDO:", ""), 468, Gx_line+227, 590, Gx_line+241, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Tex_fecten, "")), 595, Gx_line+227, 700, Gx_line+242, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FECHA DE ENTREGA:", ""), 829, Gx_line+227, 963, Gx_line+241, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Tex_fecent, "")), 974, Gx_line+227, 1079, Gx_line+242, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+272) ;
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
      this.aP0[0] = rtex006i.this.A396EmprCod;
      this.aP1[0] = rtex006i.this.A6850Tex_NPed;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      scmdbuf = "" ;
      P07CU2_A396EmprCod = new String[] {""} ;
      P07CU2_A6850Tex_NPed = new int[1] ;
      P07CU2_A252CliCod = new int[1] ;
      P07CU2_n252CliCod = new boolean[] {false} ;
      P07CU2_A6851Tex_FecP = new java.util.Date[] {GXutil.nullDate()} ;
      P07CU2_n6851Tex_FecP = new boolean[] {false} ;
      P07CU2_A6852Tex_PedC = new String[] {""} ;
      P07CU2_n6852Tex_PedC = new boolean[] {false} ;
      P07CU2_A279CliNom = new String[] {""} ;
      P07CU2_A7274Tex_subcli = new String[] {""} ;
      P07CU2_n7274Tex_subcli = new boolean[] {false} ;
      P07CU2_A7400Tex_FecEnt = new String[] {""} ;
      P07CU2_n7400Tex_FecEnt = new boolean[] {false} ;
      P07CU2_A7398Tex_FecTej = new String[] {""} ;
      P07CU2_n7398Tex_FecTej = new boolean[] {false} ;
      P07CU2_A7399Tex_FecTen = new String[] {""} ;
      P07CU2_n7399Tex_FecTen = new boolean[] {false} ;
      P07CU2_A6854Tex_Obs = new String[] {""} ;
      P07CU2_n6854Tex_Obs = new boolean[] {false} ;
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
      AV13Tot_ks = DecimalUtil.ZERO ;
      AV50Artcod = "" ;
      AV57Tex_talla = "" ;
      AV52Tab_sumu = new short[1000] ;
      P07CU3_A396EmprCod = new String[] {""} ;
      P07CU3_A6850Tex_NPed = new int[1] ;
      P07CU3_A7401Tex_TipT = new String[] {""} ;
      P07CU3_n7401Tex_TipT = new boolean[] {false} ;
      P07CU3_A6861Tex_NomCol = new String[] {""} ;
      P07CU3_n6861Tex_NomCol = new boolean[] {false} ;
      P07CU3_A6862Tex_NumCol = new int[1] ;
      P07CU3_n6862Tex_NumCol = new boolean[] {false} ;
      P07CU3_A6863Tex_TcCol = new byte[1] ;
      P07CU3_n6863Tex_TcCol = new boolean[] {false} ;
      P07CU3_A6994Tex_Talla = new String[] {""} ;
      P07CU3_n6994Tex_Talla = new boolean[] {false} ;
      P07CU3_A8161Tex_KgsNt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07CU3_n8161Tex_KgsNt = new boolean[] {false} ;
      P07CU3_A7536Tex_NomCo2 = new String[] {""} ;
      P07CU3_n7536Tex_NomCo2 = new boolean[] {false} ;
      P07CU3_A6991Tex_Unidad = new int[1] ;
      P07CU3_n6991Tex_Unidad = new boolean[] {false} ;
      P07CU3_A6993Tex_MerTn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07CU3_n6993Tex_MerTn = new boolean[] {false} ;
      P07CU3_A6992Tex_MerTj = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07CU3_n6992Tex_MerTj = new boolean[] {false} ;
      P07CU3_A6858Tex_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07CU3_n6858Tex_Kgs = new boolean[] {false} ;
      P07CU3_A6857Tex_Lin = new short[1] ;
      P07CU3_A6859Tex_artc = new String[] {""} ;
      P07CU3_n6859Tex_artc = new boolean[] {false} ;
      A7401Tex_TipT = "" ;
      A6861Tex_NomCol = "" ;
      A6994Tex_Talla = "" ;
      A8161Tex_KgsNt = DecimalUtil.ZERO ;
      A7536Tex_NomCo2 = "" ;
      A6993Tex_MerTn = DecimalUtil.ZERO ;
      A6992Tex_MerTj = DecimalUtil.ZERO ;
      A6858Tex_Kgs = DecimalUtil.ZERO ;
      A6859Tex_artc = "" ;
      AV8Tex_artc = "" ;
      AV46TEX_TIPT = "" ;
      AV28Forser = "" ;
      AV29ForcolNom = "" ;
      AV10ArtDsc = "" ;
      AV11TipArtDsc = "" ;
      AV18ArtRen = DecimalUtil.ZERO ;
      AV19Mat_maq = "" ;
      AV45ArtTipPle = "" ;
      AV32Carta = "" ;
      AV33Forfec = GXutil.nullDate() ;
      AV35ForOpccli = "" ;
      AV58TEX_NOMCOL = "" ;
      AV60Tex_kgs = DecimalUtil.ZERO ;
      AV24Tab_un = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV24Tab_un[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV23Tab_talla = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV23Tab_talla[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
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
      P07CU4_A396EmprCod = new String[] {""} ;
      P07CU4_A7832Aux_LIN = new short[1] ;
      P07CU4_A7831Aux_NPED = new int[1] ;
      P07CU4_A7839Aux_UNID = new int[1] ;
      P07CU4_n7839Aux_UNID = new boolean[] {false} ;
      P07CU4_A7841Aux_ALT = new String[] {""} ;
      P07CU4_n7841Aux_ALT = new boolean[] {false} ;
      P07CU4_A7840Aux_ANC = new String[] {""} ;
      P07CU4_n7840Aux_ANC = new boolean[] {false} ;
      P07CU4_A7838Aux_TALLA = new String[] {""} ;
      A7841Aux_ALT = "" ;
      A7840Aux_ANC = "" ;
      A7838Aux_TALLA = "" ;
      P07CU5_A829TipArtCod = new short[1] ;
      P07CU5_A396EmprCod = new String[] {""} ;
      P07CU5_A65ArtCod = new String[] {""} ;
      P07CU5_A252CliCod = new int[1] ;
      P07CU5_n252CliCod = new boolean[] {false} ;
      P07CU5_A69ArtDsc = new String[] {""} ;
      P07CU5_n69ArtDsc = new boolean[] {false} ;
      P07CU5_A830TipArtDsc = new String[] {""} ;
      P07CU5_n830TipArtDsc = new boolean[] {false} ;
      P07CU5_A63ArtAcaMin = new short[1] ;
      P07CU5_n63ArtAcaMin = new boolean[] {false} ;
      P07CU5_A1903ArtGraAca = new short[1] ;
      P07CU5_n1903ArtGraAca = new boolean[] {false} ;
      P07CU5_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07CU5_n95ArtRen = new boolean[] {false} ;
      P07CU5_A6953Mat_Maq = new String[] {""} ;
      P07CU5_n6953Mat_Maq = new boolean[] {false} ;
      P07CU5_A1230ArtEncAnh = new short[1] ;
      P07CU5_n1230ArtEncAnh = new boolean[] {false} ;
      P07CU5_A1229ArtEncCom = new short[1] ;
      P07CU5_n1229ArtEncCom = new boolean[] {false} ;
      P07CU5_A101ArtTipPle = new String[] {""} ;
      P07CU5_n101ArtTipPle = new boolean[] {false} ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A6953Mat_Maq = "" ;
      A101ArtTipPle = "" ;
      P07CU6_A396EmprCod = new String[] {""} ;
      P07CU6_A831TipColCod = new byte[1] ;
      P07CU6_A483ForColNum = new int[1] ;
      P07CU6_A482ForColNom = new String[] {""} ;
      P07CU6_A494ForSer = new String[] {""} ;
      P07CU6_A252CliCod = new int[1] ;
      P07CU6_n252CliCod = new boolean[] {false} ;
      P07CU6_A995ForTonal = new String[] {""} ;
      P07CU6_n995ForTonal = new boolean[] {false} ;
      P07CU6_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07CU6_n485ForFec = new boolean[] {false} ;
      P07CU6_A3560ForOpcCli = new String[] {""} ;
      P07CU6_n3560ForOpcCli = new boolean[] {false} ;
      P07CU6_A7537ForOpNum = new byte[1] ;
      P07CU6_n7537ForOpNum = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A995ForTonal = "" ;
      A485ForFec = GXutil.nullDate() ;
      A3560ForOpcCli = "" ;
      A5098TipDisCod = "" ;
      A5097TipDisDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rtex006i__default(),
         new Object[] {
             new Object[] {
            P07CU2_A396EmprCod, P07CU2_A6850Tex_NPed, P07CU2_A252CliCod, P07CU2_n252CliCod, P07CU2_A6851Tex_FecP, P07CU2_n6851Tex_FecP, P07CU2_A6852Tex_PedC, P07CU2_n6852Tex_PedC, P07CU2_A279CliNom, P07CU2_A7274Tex_subcli,
            P07CU2_n7274Tex_subcli, P07CU2_A7400Tex_FecEnt, P07CU2_n7400Tex_FecEnt, P07CU2_A7398Tex_FecTej, P07CU2_n7398Tex_FecTej, P07CU2_A7399Tex_FecTen, P07CU2_n7399Tex_FecTen, P07CU2_A6854Tex_Obs, P07CU2_n6854Tex_Obs
            }
            , new Object[] {
            P07CU3_A396EmprCod, P07CU3_A6850Tex_NPed, P07CU3_A7401Tex_TipT, P07CU3_n7401Tex_TipT, P07CU3_A6861Tex_NomCol, P07CU3_n6861Tex_NomCol, P07CU3_A6862Tex_NumCol, P07CU3_n6862Tex_NumCol, P07CU3_A6863Tex_TcCol, P07CU3_n6863Tex_TcCol,
            P07CU3_A6994Tex_Talla, P07CU3_n6994Tex_Talla, P07CU3_A8161Tex_KgsNt, P07CU3_n8161Tex_KgsNt, P07CU3_A7536Tex_NomCo2, P07CU3_n7536Tex_NomCo2, P07CU3_A6991Tex_Unidad, P07CU3_n6991Tex_Unidad, P07CU3_A6993Tex_MerTn, P07CU3_n6993Tex_MerTn,
            P07CU3_A6992Tex_MerTj, P07CU3_n6992Tex_MerTj, P07CU3_A6858Tex_Kgs, P07CU3_n6858Tex_Kgs, P07CU3_A6857Tex_Lin, P07CU3_A6859Tex_artc, P07CU3_n6859Tex_artc
            }
            , new Object[] {
            P07CU4_A396EmprCod, P07CU4_A7832Aux_LIN, P07CU4_A7831Aux_NPED, P07CU4_A7839Aux_UNID, P07CU4_n7839Aux_UNID, P07CU4_A7841Aux_ALT, P07CU4_n7841Aux_ALT, P07CU4_A7840Aux_ANC, P07CU4_n7840Aux_ANC, P07CU4_A7838Aux_TALLA
            }
            , new Object[] {
            P07CU5_A829TipArtCod, P07CU5_A396EmprCod, P07CU5_A65ArtCod, P07CU5_A252CliCod, P07CU5_A69ArtDsc, P07CU5_n69ArtDsc, P07CU5_A830TipArtDsc, P07CU5_n830TipArtDsc, P07CU5_A63ArtAcaMin, P07CU5_n63ArtAcaMin,
            P07CU5_A1903ArtGraAca, P07CU5_n1903ArtGraAca, P07CU5_A95ArtRen, P07CU5_n95ArtRen, P07CU5_A6953Mat_Maq, P07CU5_n6953Mat_Maq, P07CU5_A1230ArtEncAnh, P07CU5_n1230ArtEncAnh, P07CU5_A1229ArtEncCom, P07CU5_n1229ArtEncCom,
            P07CU5_A101ArtTipPle, P07CU5_n101ArtTipPle
            }
            , new Object[] {
            P07CU6_A396EmprCod, P07CU6_A831TipColCod, P07CU6_A483ForColNum, P07CU6_A482ForColNom, P07CU6_A494ForSer, P07CU6_A252CliCod, P07CU6_A995ForTonal, P07CU6_n995ForTonal, P07CU6_A485ForFec, P07CU6_n485ForFec,
            P07CU6_A3560ForOpcCli, P07CU6_n3560ForOpcCli, P07CU6_A7537ForOpNum, P07CU6_n7537ForOpNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A6863Tex_TcCol ;
   private byte AV31TipColCod ;
   private byte AV56Cambio_art ;
   private byte A831TipColCod ;
   private byte A7537ForOpNum ;
   private short AV20Nlin ;
   private short AV21i ;
   private short AV52Tab_sumu[] ;
   private short AV53Sum_ut ;
   private short A6857Tex_Lin ;
   private short AV16Artcrumin ;
   private short AV17ArtGracru ;
   private short AV43ArtEncAnh ;
   private short AV44ArtEncCom ;
   private short AV55AUX_LIN ;
   private short AV51Sum_u ;
   private short A7832Aux_LIN ;
   private short AV61Anyo ;
   private short A829TipArtCod ;
   private short A63ArtAcaMin ;
   private short A1903ArtGraAca ;
   private short A1230ArtEncAnh ;
   private short A1229ArtEncCom ;
   private short Gx_err ;
   private int A6850Tex_NPed ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GXv_int2[] ;
   private int A252CliCod ;
   private int AV9CliCod ;
   private int Gx_OldLine ;
   private int AV27Tot_un ;
   private int GX_I ;
   private int A6862Tex_NumCol ;
   private int A6991Tex_Unidad ;
   private int AV47Tex_NPed ;
   private int AV30Forcolnum ;
   private int AV54Aux_nped ;
   private int AV59TEX_NUMCOL ;
   private int A7831Aux_NPED ;
   private int A7839Aux_UNID ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV13Tot_ks ;
   private java.math.BigDecimal A8161Tex_KgsNt ;
   private java.math.BigDecimal A6993Tex_MerTn ;
   private java.math.BigDecimal A6992Tex_MerTj ;
   private java.math.BigDecimal A6858Tex_Kgs ;
   private java.math.BigDecimal AV18ArtRen ;
   private java.math.BigDecimal AV60Tex_kgs ;
   private java.math.BigDecimal A95ArtRen ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
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
   private String AV50Artcod ;
   private String AV57Tex_talla ;
   private String A7401Tex_TipT ;
   private String A6861Tex_NomCol ;
   private String A6994Tex_Talla ;
   private String A7536Tex_NomCo2 ;
   private String A6859Tex_artc ;
   private String AV8Tex_artc ;
   private String AV46TEX_TIPT ;
   private String AV28Forser ;
   private String AV29ForcolNom ;
   private String AV10ArtDsc ;
   private String AV11TipArtDsc ;
   private String AV19Mat_maq ;
   private String AV45ArtTipPle ;
   private String AV32Carta ;
   private String AV35ForOpccli ;
   private String AV58TEX_NOMCOL ;
   private String AV24Tab_un[] ;
   private String AV23Tab_talla[] ;
   private String AV38Tab_alt[] ;
   private String AV37Tab_Anc[] ;
   private String A7841Aux_ALT ;
   private String A7840Aux_ANC ;
   private String A7838Aux_TALLA ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A830TipArtDsc ;
   private String A6953Mat_Maq ;
   private String A101ArtTipPle ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A995ForTonal ;
   private String A3560ForOpcCli ;
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
   private boolean n7401Tex_TipT ;
   private boolean n6861Tex_NomCol ;
   private boolean n6862Tex_NumCol ;
   private boolean n6863Tex_TcCol ;
   private boolean n6994Tex_Talla ;
   private boolean n8161Tex_KgsNt ;
   private boolean n7536Tex_NomCo2 ;
   private boolean n6991Tex_Unidad ;
   private boolean n6993Tex_MerTn ;
   private boolean n6992Tex_MerTj ;
   private boolean n6858Tex_Kgs ;
   private boolean n6859Tex_artc ;
   private boolean returnInSub ;
   private boolean n7839Aux_UNID ;
   private boolean n7841Aux_ALT ;
   private boolean n7840Aux_ANC ;
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
   private String A6854Tex_Obs ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P07CU2_A396EmprCod ;
   private int[] P07CU2_A6850Tex_NPed ;
   private int[] P07CU2_A252CliCod ;
   private boolean[] P07CU2_n252CliCod ;
   private java.util.Date[] P07CU2_A6851Tex_FecP ;
   private boolean[] P07CU2_n6851Tex_FecP ;
   private String[] P07CU2_A6852Tex_PedC ;
   private boolean[] P07CU2_n6852Tex_PedC ;
   private String[] P07CU2_A279CliNom ;
   private String[] P07CU2_A7274Tex_subcli ;
   private boolean[] P07CU2_n7274Tex_subcli ;
   private String[] P07CU2_A7400Tex_FecEnt ;
   private boolean[] P07CU2_n7400Tex_FecEnt ;
   private String[] P07CU2_A7398Tex_FecTej ;
   private boolean[] P07CU2_n7398Tex_FecTej ;
   private String[] P07CU2_A7399Tex_FecTen ;
   private boolean[] P07CU2_n7399Tex_FecTen ;
   private String[] P07CU2_A6854Tex_Obs ;
   private boolean[] P07CU2_n6854Tex_Obs ;
   private String[] P07CU3_A396EmprCod ;
   private int[] P07CU3_A6850Tex_NPed ;
   private String[] P07CU3_A7401Tex_TipT ;
   private boolean[] P07CU3_n7401Tex_TipT ;
   private String[] P07CU3_A6861Tex_NomCol ;
   private boolean[] P07CU3_n6861Tex_NomCol ;
   private int[] P07CU3_A6862Tex_NumCol ;
   private boolean[] P07CU3_n6862Tex_NumCol ;
   private byte[] P07CU3_A6863Tex_TcCol ;
   private boolean[] P07CU3_n6863Tex_TcCol ;
   private String[] P07CU3_A6994Tex_Talla ;
   private boolean[] P07CU3_n6994Tex_Talla ;
   private java.math.BigDecimal[] P07CU3_A8161Tex_KgsNt ;
   private boolean[] P07CU3_n8161Tex_KgsNt ;
   private String[] P07CU3_A7536Tex_NomCo2 ;
   private boolean[] P07CU3_n7536Tex_NomCo2 ;
   private int[] P07CU3_A6991Tex_Unidad ;
   private boolean[] P07CU3_n6991Tex_Unidad ;
   private java.math.BigDecimal[] P07CU3_A6993Tex_MerTn ;
   private boolean[] P07CU3_n6993Tex_MerTn ;
   private java.math.BigDecimal[] P07CU3_A6992Tex_MerTj ;
   private boolean[] P07CU3_n6992Tex_MerTj ;
   private java.math.BigDecimal[] P07CU3_A6858Tex_Kgs ;
   private boolean[] P07CU3_n6858Tex_Kgs ;
   private short[] P07CU3_A6857Tex_Lin ;
   private String[] P07CU3_A6859Tex_artc ;
   private boolean[] P07CU3_n6859Tex_artc ;
   private String[] P07CU4_A396EmprCod ;
   private short[] P07CU4_A7832Aux_LIN ;
   private int[] P07CU4_A7831Aux_NPED ;
   private int[] P07CU4_A7839Aux_UNID ;
   private boolean[] P07CU4_n7839Aux_UNID ;
   private String[] P07CU4_A7841Aux_ALT ;
   private boolean[] P07CU4_n7841Aux_ALT ;
   private String[] P07CU4_A7840Aux_ANC ;
   private boolean[] P07CU4_n7840Aux_ANC ;
   private String[] P07CU4_A7838Aux_TALLA ;
   private short[] P07CU5_A829TipArtCod ;
   private String[] P07CU5_A396EmprCod ;
   private String[] P07CU5_A65ArtCod ;
   private int[] P07CU5_A252CliCod ;
   private boolean[] P07CU5_n252CliCod ;
   private String[] P07CU5_A69ArtDsc ;
   private boolean[] P07CU5_n69ArtDsc ;
   private String[] P07CU5_A830TipArtDsc ;
   private boolean[] P07CU5_n830TipArtDsc ;
   private short[] P07CU5_A63ArtAcaMin ;
   private boolean[] P07CU5_n63ArtAcaMin ;
   private short[] P07CU5_A1903ArtGraAca ;
   private boolean[] P07CU5_n1903ArtGraAca ;
   private java.math.BigDecimal[] P07CU5_A95ArtRen ;
   private boolean[] P07CU5_n95ArtRen ;
   private String[] P07CU5_A6953Mat_Maq ;
   private boolean[] P07CU5_n6953Mat_Maq ;
   private short[] P07CU5_A1230ArtEncAnh ;
   private boolean[] P07CU5_n1230ArtEncAnh ;
   private short[] P07CU5_A1229ArtEncCom ;
   private boolean[] P07CU5_n1229ArtEncCom ;
   private String[] P07CU5_A101ArtTipPle ;
   private boolean[] P07CU5_n101ArtTipPle ;
   private String[] P07CU6_A396EmprCod ;
   private byte[] P07CU6_A831TipColCod ;
   private int[] P07CU6_A483ForColNum ;
   private String[] P07CU6_A482ForColNom ;
   private String[] P07CU6_A494ForSer ;
   private int[] P07CU6_A252CliCod ;
   private boolean[] P07CU6_n252CliCod ;
   private String[] P07CU6_A995ForTonal ;
   private boolean[] P07CU6_n995ForTonal ;
   private java.util.Date[] P07CU6_A485ForFec ;
   private boolean[] P07CU6_n485ForFec ;
   private String[] P07CU6_A3560ForOpcCli ;
   private boolean[] P07CU6_n3560ForOpcCli ;
   private byte[] P07CU6_A7537ForOpNum ;
   private boolean[] P07CU6_n7537ForOpNum ;
}

final  class rtex006i__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07CU2", "SELECT T1.EmprCod, T1.Tex_NPed, T1.CliCod, T1.Tex_FecP, T1.Tex_PedC, T2.CliNom, T1.Tex_subcli, T1.Tex_FecEnt, T1.Tex_FecTej, T1.Tex_FecTen, T1.Tex_Obs FROM (TXPTEX000 T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.Tex_NPed = ? ORDER BY T1.EmprCod, T1.Tex_NPed ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07CU3", "SELECT EmprCod, Tex_NPed, Tex_TipT, Tex_NomCol, Tex_NumCol, Tex_TcCol, Tex_Talla, Tex_KgsNt, Tex_NomCo2, Tex_Unidad, Tex_MerTn, Tex_MerTj, Tex_Kgs, Tex_Lin, Tex_artc FROM TXPTEX001 WHERE (EmprCod = ?) AND (Tex_NPed = ?) ORDER BY EmprCod, Tex_artc, Tex_Lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07CU4", "SELECT EmprCod, Aux_LIN, Aux_NPED, Aux_UNID, Aux_ALT, Aux_ANC, Aux_TALLA FROM TXPIMPOP WHERE EmprCod = ? and Aux_NPED = ? and Aux_LIN = ? ORDER BY EmprCod, Aux_NPED, Aux_LIN, Aux_TALLA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07CU5", "SELECT T1.TipArtCod, T1.EmprCod, T1.ArtCod, T1.CliCod, T1.ArtDsc, T2.TipArtDsc, T1.ArtAcaMin, T1.ArtGraAca, T1.ArtRen, T1.Mat_Maq, T1.ArtEncAnh, T1.ArtEncCom, T1.ArtTipPle FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07CU6", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForTonal, ForFec, ForOpcCli, ForOpNum FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(14);
               ((String[]) buf[25])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 4);
               return;
            case 3 :
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
            case 4 :
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

