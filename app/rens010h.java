package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rens010h extends GXReport
{
   public rens010h( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rens010h.class ), "" );
   }

   public rens010h( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      rens010h.this.aP1 = new int[] {0};
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
      rens010h.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rens010h.this.A5532Lb_numero = aP1[0];
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
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("FICHA ENSAYO HIDROCOLOR") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV139Contdsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS010", ""), GXv_char1) ;
         rens010h.this.AV139Contdsc = GXv_char1[0] ;
         GXt_char2 = AV110Lit1 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV110Lit1 = GXt_char2 ;
         GXt_char2 = AV111Lit2 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV111Lit2 = GXt_char2 ;
         AV112Lit3 = GXutil.trim( AV110Lit1) + "-" + GXutil.trim( AV111Lit2) ;
         GXt_char2 = AV113Lit4 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT305_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV113Lit4 = GXt_char2 ;
         GXt_char2 = AV114Lit5 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV114Lit5 = GXt_char2 ;
         GXt_char2 = AV115Lit6 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL120_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV115Lit6 = GXt_char2 ;
         if ( GXutil.strcmp(AV115Lit6, httpContext.getMessage( "WCFL120_", "")) == 0 )
         {
            GXt_char2 = AV115Lit6 ;
            GXv_char1[0] = GXt_char2 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char1) ;
            rens010h.this.GXt_char2 = GXv_char1[0] ;
            AV115Lit6 = GXt_char2 ;
         }
         GXt_char2 = AV116Lit7 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV116Lit7 = GXt_char2 ;
         GXt_char2 = AV117Lit8 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV117Lit8 = GXt_char2 ;
         GXt_char2 = AV118Lit9 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV118Lit9 = GXt_char2 ;
         GXt_char2 = AV119Lit10 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1194_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV119Lit10 = GXt_char2 ;
         GXt_char2 = AV120Lit11 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN236", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV120Lit11 = GXt_char2 ;
         GXt_char2 = AV121Lit12 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1164_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV121Lit12 = GXt_char2 ;
         GXt_char2 = AV122Lit13 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV122Lit13 = GXt_char2 ;
         GXt_char2 = AV123Lit14 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1145_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV123Lit14 = GXt_char2 ;
         GXt_char2 = AV124Lit15 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1160_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV124Lit15 = GXt_char2 ;
         GXt_char2 = AV125Lit16 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN176", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV125Lit16 = GXt_char2 ;
         GXt_char2 = AV126Lit17 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN079_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV126Lit17 = GXt_char2 ;
         GXt_char2 = AV127Lit18 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1134_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV127Lit18 = GXt_char2 ;
         GXt_char2 = AV128Lit19 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN237", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV128Lit19 = GXutil.trim( GXt_char2) ;
         GXt_char2 = AV129Lit20 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN037", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV129Lit20 = GXutil.trim( GXt_char2) ;
         AV129Lit20 = GXutil.substring( AV129Lit20, 1, 8) ;
         GXt_char2 = AV130Lit21 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN238", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV130Lit21 = GXutil.trim( GXt_char2) ;
         AV132Lit22 = httpContext.getMessage( "Albaran", "") ;
         GXt_char2 = AV133Lit23 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1217_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV133Lit23 = GXt_char2 ;
         GXt_char2 = AV134Lit24 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN208", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV134Lit24 = GXt_char2 ;
         AV140Lit25 = httpContext.getMessage( "Empesa", "") ;
         AV142Lit26 = httpContext.getMessage( "Nº IDM", "") ;
         GXt_char2 = AV143Lit27 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV143Lit27 = GXutil.trim( GXt_char2) + " " + httpContext.getMessage( "Ent.", "") ;
         GXt_char2 = AV144Lit28 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char1) ;
         rens010h.this.GXt_char2 = GXv_char1[0] ;
         AV144Lit28 = GXutil.trim( GXt_char2) + " " + httpContext.getMessage( "Mod.", "") ;
         /* Using cursor P07752 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07752_A407EmprNom[0] ;
            n407EmprNom = P07752_n407EmprNom[0] ;
            AV109EmprNOm = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV98t = (short)(1) ;
         AV95j = (short)(1) ;
         AV165Lb_numero = A5532Lb_numero ;
         /* Execute user subroutine: 'CARGO_COSTE' */
         S121 ();
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
         GxHdr3 = true ;
         /* Using cursor P07753 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5548Lb_Obs = P07753_A5548Lb_Obs[0] ;
            A5595Lb_malha = P07753_A5595Lb_malha[0] ;
            A5570Lb_Tipo = P07753_A5570Lb_Tipo[0] ;
            A6546Lb_Pantone = P07753_A6546Lb_Pantone[0] ;
            A5988Lb_nfibras = P07753_A5988Lb_nfibras[0] ;
            A5701Lb_Local = P07753_A5701Lb_Local[0] ;
            A5700Lb_Talao = P07753_A5700Lb_Talao[0] ;
            A5600Lb_IDM = P07753_A5600Lb_IDM[0] ;
            A5611Lb_Temp3 = P07753_A5611Lb_Temp3[0] ;
            A5610Lb_Temp2 = P07753_A5610Lb_Temp2[0] ;
            A5601Lb_Tempt = P07753_A5601Lb_Tempt[0] ;
            A5594Lb_cartazf = P07753_A5594Lb_cartazf[0] ;
            A5545Lb_HoraM = P07753_A5545Lb_HoraM[0] ;
            A5542Lb_HoraE = P07753_A5542Lb_HoraE[0] ;
            A5546Lb_UsuM = P07753_A5546Lb_UsuM[0] ;
            A5544Lb_FechaM = P07753_A5544Lb_FechaM[0] ;
            A5543Lb_Usuario = P07753_A5543Lb_Usuario[0] ;
            A5541Lb_FechaE = P07753_A5541Lb_FechaE[0] ;
            A5547Lb_Rb = P07753_A5547Lb_Rb[0] ;
            A584IntDsc = P07753_A584IntDsc[0] ;
            n584IntDsc = P07753_n584IntDsc[0] ;
            A583IntCod = P07753_A583IntCod[0] ;
            n583IntCod = P07753_n583IntCod[0] ;
            A5540Lb_Cartaz = P07753_A5540Lb_Cartaz[0] ;
            A5539Lb_ColNumC = P07753_A5539Lb_ColNumC[0] ;
            A5538Lb_ColNomC = P07753_A5538Lb_ColNomC[0] ;
            A832TipColDsc = P07753_A832TipColDsc[0] ;
            n832TipColDsc = P07753_n832TipColDsc[0] ;
            A831TipColCod = P07753_A831TipColCod[0] ;
            n831TipColCod = P07753_n831TipColCod[0] ;
            A5537Lb_ColNum = P07753_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = P07753_A5536Lb_ColNom[0] ;
            A5552Lb_TipArtD = P07753_A5552Lb_TipArtD[0] ;
            A5534Lb_ArtDsc = P07753_A5534Lb_ArtDsc[0] ;
            A5533Lb_ArtCod = P07753_A5533Lb_ArtCod[0] ;
            A279CliNom = P07753_A279CliNom[0] ;
            A252CliCod = P07753_A252CliCod[0] ;
            A279CliNom = P07753_A279CliNom[0] ;
            A584IntDsc = P07753_A584IntDsc[0] ;
            n584IntDsc = P07753_n584IntDsc[0] ;
            A832TipColDsc = P07753_A832TipColDsc[0] ;
            n832TipColDsc = P07753_n832TipColDsc[0] ;
            if ( A5595Lb_malha == 1 )
            {
               AV131Texto_m = httpContext.getMessage( "Cliente", "") ;
            }
            else if ( A5595Lb_malha == 2 )
            {
               AV131Texto_m = httpContext.getMessage( "Produccion", "") ;
            }
            else if ( A5595Lb_malha == 3 )
            {
               AV131Texto_m = httpContext.getMessage( "Provisional", "") ;
            }
            else if ( A5595Lb_malha == 4 )
            {
               AV131Texto_m = httpContext.getMessage( "En Espera", "") ;
            }
            else
            {
               AV131Texto_m = "" ;
            }
            if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "C", "")) == 0 )
            {
               AV135Texto_e = httpContext.getMessage( "Cliente", "") ;
            }
            else if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "P", "")) == 0 )
            {
               AV135Texto_e = httpContext.getMessage( "Produccion", "") ;
            }
            else
            {
               AV135Texto_e = "" ;
            }
            AV167Lb_panton1 = "" ;
            AV168Lb_panton2 = "" ;
            AV167Lb_panton1 = GXutil.substring( A6546Lb_Pantone, 1, 50) ;
            AV168Lb_panton2 = GXutil.substring( A6546Lb_Pantone, 51, 100) ;
            AV136CliCod = A252CliCod ;
            AV137Lb_artcod = A5533Lb_ArtCod ;
            /* Execute user subroutine: 'ARTICU' */
            S111 ();
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
            AV182i = (short)(0) ;
            /* Using cursor P07754 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A5551Lb_lineaPq = P07754_A5551Lb_lineaPq[0] ;
               A5553Lb_ForCod = P07754_A5553Lb_ForCod[0] ;
               GXt_char2 = A5554Lb_ForDsc ;
               GXv_char1[0] = A396EmprCod ;
               GXv_char3[0] = A5553Lb_ForCod ;
               GXv_char4[0] = GXt_char2 ;
               new app.ppreqd1(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
               rens010h.this.A396EmprCod = GXv_char1[0] ;
               rens010h.this.A5553Lb_ForCod = GXv_char3[0] ;
               rens010h.this.GXt_char2 = GXv_char4[0] ;
               A5554Lb_ForDsc = GXt_char2 ;
               if ( AV182i == 0 )
               {
                  AV182i = (short)(1) ;
                  h7750( false, 19) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122Lit13, "")), 11, Gx_line+0, 75, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(11, Gx_line+17, 225, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122Lit13, "")), 15, Gx_line+0, 79, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(15, Gx_line+17, 229, Gx_line+17, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+19) ;
               }
               h7750( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5554Lb_ForDsc, "")), 82, Gx_line+0, 229, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5553Lb_ForCod, "")), 11, Gx_line+0, 56, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5553Lb_ForCod, "")), 15, Gx_line+0, 60, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            h7750( false, 52) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Tab_op[7-1], "")), 1030, Gx_line+8, 1044, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV106Tab_cos[7-1], "ZZZZZ.ZZZZZ")), 996, Gx_line+29, 1077, Gx_line+46, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(1095, Gx_line+4, 1095, Gx_line+52, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV174Mas_opcion, "")), 1050, Gx_line+8, 1089, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+4, 1095, Gx_line+4, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+48, 1095, Gx_line+48, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(741, Gx_line+4, 741, Gx_line+52, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(620, Gx_line+4, 620, Gx_line+52, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(499, Gx_line+4, 499, Gx_line+52, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(379, Gx_line+4, 379, Gx_line+52, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(259, Gx_line+4, 259, Gx_line+52, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+4, 6, Gx_line+52, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV106Tab_cos[5-1], "ZZZZZ.ZZZZZ")), 760, Gx_line+29, 841, Gx_line+46, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Tab_op[5-1], "")), 797, Gx_line+8, 811, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV106Tab_cos[4-1], "ZZZZZ.ZZZZZ")), 640, Gx_line+29, 721, Gx_line+46, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Tab_op[4-1], "")), 676, Gx_line+8, 690, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV106Tab_cos[3-1], "ZZZZZ.ZZZZZ")), 519, Gx_line+29, 600, Gx_line+46, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Tab_op[3-1], "")), 555, Gx_line+8, 569, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Tab_op[1-1], "")), 315, Gx_line+8, 329, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 130, Gx_line+19, 134, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124Lit15, "")), 150, Gx_line+19, 214, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123Lit14, "")), 54, Gx_line+19, 118, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV106Tab_cos[2-1], "ZZZZZ.ZZZZZ")), 399, Gx_line+29, 480, Gx_line+46, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Tab_op[2-1], "")), 435, Gx_line+8, 449, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV106Tab_cos[1-1], "ZZZZZ.ZZZZZ")), 280, Gx_line+29, 361, Gx_line+46, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Tab_op[6-1], "")), 915, Gx_line+8, 929, Gx_line+25, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV106Tab_cos[6-1], "ZZZZZ.ZZZZZ")), 878, Gx_line+29, 959, Gx_line+46, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(858, Gx_line+4, 858, Gx_line+52, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(976, Gx_line+4, 976, Gx_line+52, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+52) ;
            AV182i = (short)(1) ;
            AV95j = (short)(1) ;
            AV184Fin = (byte)(0) ;
            while ( AV182i <= AV87NLi )
            {
               AV95j = (short)(1) ;
               while ( AV95j <= 7 )
               {
                  if ( (GXutil.strcmp("", AV90Tab_prd[AV182i-1][AV95j-1])==0) )
                  {
                     AV184Fin = (byte)(1) ;
                     if (true) break;
                  }
                  AV179TLin_prd = AV90Tab_prd[AV182i-1][AV95j-1] ;
                  AV180TLin_dsc = AV101Tab_prn[AV182i-1][AV95j-1] ;
                  AV175TLin_tipo = AV173Tab_tipo[AV182i-1][AV95j-1] ;
                  AV177TLin_cnt[AV95j-1] = CommonUtil.decimalVal( GXutil.str( AV91Tab_cnt[AV182i-1][AV95j-1], 11, 5), ".") ;
                  AV178TLin_uni[AV95j-1] = AV172Tab_uni[AV182i-1][AV95j-1] ;
                  AV95j = (short)(AV95j+1) ;
                  if ( AV95j > 7 )
                  {
                     if (true) break;
                  }
               }
               if ( ( GXutil.strcmp(AV175TLin_tipo, AV176TLin_tipi) != 0 ) && ! (GXutil.strcmp("", AV176TLin_tipi)==0) )
               {
                  h7750( false, 26) ;
                  getPrinter().GxDrawLine(1095, Gx_line+0, 1095, Gx_line+26, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(6, Gx_line+25, 1095, Gx_line+25, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(6, Gx_line+0, 6, Gx_line+26, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(976, Gx_line+0, 976, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(858, Gx_line+0, 858, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(741, Gx_line+0, 741, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(620, Gx_line+0, 620, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(499, Gx_line+0, 499, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(379, Gx_line+0, 379, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(259, Gx_line+0, 259, Gx_line+26, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+26) ;
               }
               h7750( false, 26) ;
               getPrinter().GxDrawLine(1095, Gx_line+0, 1095, Gx_line+26, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+25, 1095, Gx_line+25, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV177TLin_cnt[7-1], "ZZZZZ.ZZZZZ")), 979, Gx_line+5, 1060, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178TLin_uni[7-1], "")), 1064, Gx_line+5, 1093, Gx_line+21, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178TLin_uni[4-1], "")), 709, Gx_line+5, 738, Gx_line+21, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178TLin_uni[3-1], "")), 589, Gx_line+5, 618, Gx_line+21, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV177TLin_cnt[3-1], "ZZZZZ.ZZZZZ")), 502, Gx_line+5, 583, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178TLin_uni[1-1], "")), 348, Gx_line+5, 377, Gx_line+21, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV177TLin_cnt[1-1], "ZZZZZ.ZZZZZ")), 263, Gx_line+5, 343, Gx_line+21, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV180TLin_dsc, "")), 63, Gx_line+5, 254, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV179TLin_prd, "")), 11, Gx_line+5, 56, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV177TLin_cnt[6-1], "ZZZZZ.ZZZZZ")), 861, Gx_line+5, 942, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178TLin_uni[6-1], "")), 946, Gx_line+5, 975, Gx_line+21, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV177TLin_cnt[5-1], "ZZZZZ.ZZZZZ")), 744, Gx_line+5, 825, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178TLin_uni[2-1], "")), 468, Gx_line+6, 497, Gx_line+21, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV177TLin_cnt[2-1], "ZZZZZ.ZZZZZ")), 382, Gx_line+5, 462, Gx_line+21, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(858, Gx_line+0, 858, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(741, Gx_line+0, 741, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(620, Gx_line+0, 620, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(499, Gx_line+0, 499, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(379, Gx_line+0, 379, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(259, Gx_line+0, 259, Gx_line+26, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+0, 6, Gx_line+26, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(976, Gx_line+0, 976, Gx_line+26, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178TLin_uni[5-1], "")), 828, Gx_line+5, 857, Gx_line+21, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV177TLin_cnt[4-1], "ZZZZZ.ZZZZZ")), 623, Gx_line+5, 704, Gx_line+22, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+26) ;
               AV176TLin_tipi = AV175TLin_tipo ;
               AV182i = (short)(AV182i+1) ;
            }
            h7750( false, 1) ;
            getPrinter().GxDrawLine(6, Gx_line+0, 1095, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7750( true, 0) ;
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
      AV138Compo = "" ;
      /* Using cursor P07755 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV136CliCod), AV137Lb_artcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A65ArtCod = P07755_A65ArtCod[0] ;
         A252CliCod = P07755_A252CliCod[0] ;
         A105ArtTra1 = P07755_A105ArtTra1[0] ;
         n105ArtTra1 = P07755_n105ArtTra1[0] ;
         A108ArtTraP1 = P07755_A108ArtTraP1[0] ;
         n108ArtTraP1 = P07755_n108ArtTraP1[0] ;
         A106ArtTra2 = P07755_A106ArtTra2[0] ;
         n106ArtTra2 = P07755_n106ArtTra2[0] ;
         A109ArtTraP2 = P07755_A109ArtTraP2[0] ;
         n109ArtTraP2 = P07755_n109ArtTraP2[0] ;
         A107ArtTra3 = P07755_A107ArtTra3[0] ;
         n107ArtTra3 = P07755_n107ArtTra3[0] ;
         A110ArtTraP3 = P07755_A110ArtTraP3[0] ;
         n110ArtTraP3 = P07755_n110ArtTraP3[0] ;
         if ( ! (GXutil.strcmp("", A105ArtTra1)==0) )
         {
            AV138Compo = GXutil.trim( A105ArtTra1) + " " + GXutil.trim( GXutil.str( A108ArtTraP1, 3, 0)) + "% " ;
            if ( ! (GXutil.strcmp("", A106ArtTra2)==0) )
            {
               AV138Compo += GXutil.trim( A106ArtTra2) + " " + GXutil.trim( GXutil.str( A109ArtTraP2, 3, 0)) + "% " ;
            }
            if ( ! (GXutil.strcmp("", A107ArtTra3)==0) )
            {
               AV138Compo += GXutil.trim( A107ArtTra3) + " " + GXutil.trim( GXutil.str( A110ArtTraP3, 3, 0)) + "% " ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'CARGO_COSTE' Routine */
      returnInSub = false ;
      AV181Nop = (byte)(1) ;
      AV87NLi = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV88Tab_op[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV106Tab_cos[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 10 )
         {
            AV89Tab_opc[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 10 )
         {
            AV90Tab_prd[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 10 )
         {
            AV101Tab_prn[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 10 )
         {
            AV91Tab_cnt[GX_I-1][GX_J-1] = DecimalUtil.doubleToDec(0) ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 10 )
         {
            AV172Tab_uni[GX_I-1][GX_J-1] = " " ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 10 )
         {
            AV173Tab_tipo[GX_I-1][GX_J-1] = " " ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P07756 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV165Lb_numero)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A5555Lb_opcion = P07756_A5555Lb_opcion[0] ;
         A5556Lb_UltLC = P07756_A5556Lb_UltLC[0] ;
         A5565Lb_CosteE = P07756_A5565Lb_CosteE[0] ;
         AV88Tab_op[AV181Nop-1] = A5555Lb_opcion ;
         AV106Tab_cos[AV181Nop-1] = A5565Lb_CosteE ;
         AV87NLi = (short)(1) ;
         /* Using cursor P07757 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A490ForPrdUMe = P07757_A490ForPrdUMe[0] ;
            A719PrdNum = P07757_A719PrdNum[0] ;
            A718PrdNom = P07757_A718PrdNom[0] ;
            A5558LB_CantC = P07757_A5558LB_CantC[0] ;
            A488ForPrdDsc = P07757_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P07757_n488ForPrdDsc[0] ;
            A5557Lb_LineaC = P07757_A5557Lb_LineaC[0] ;
            A718PrdNom = P07757_A718PrdNom[0] ;
            A488ForPrdDsc = P07757_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P07757_n488ForPrdDsc[0] ;
            AV89Tab_opc[AV87NLi-1][AV181Nop-1] = A5555Lb_opcion ;
            AV90Tab_prd[AV87NLi-1][AV181Nop-1] = A719PrdNum ;
            AV101Tab_prn[AV87NLi-1][AV181Nop-1] = A718PrdNom ;
            AV91Tab_cnt[AV87NLi-1][AV181Nop-1] = A5558LB_CantC ;
            AV172Tab_uni[AV87NLi-1][AV181Nop-1] = A488ForPrdDsc ;
            AV173Tab_tipo[AV87NLi-1][AV181Nop-1] = httpContext.getMessage( "C", "") ;
            AV87NLi = (short)(AV87NLi+1) ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         /* Using cursor P07758 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A490ForPrdUMe = P07758_A490ForPrdUMe[0] ;
            A719PrdNum = P07758_A719PrdNum[0] ;
            A718PrdNom = P07758_A718PrdNom[0] ;
            A5561LB_CantP = P07758_A5561LB_CantP[0] ;
            A488ForPrdDsc = P07758_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P07758_n488ForPrdDsc[0] ;
            A5560Lb_LineaPr = P07758_A5560Lb_LineaPr[0] ;
            A718PrdNom = P07758_A718PrdNom[0] ;
            A488ForPrdDsc = P07758_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P07758_n488ForPrdDsc[0] ;
            AV89Tab_opc[AV87NLi-1][AV181Nop-1] = A5555Lb_opcion ;
            AV90Tab_prd[AV87NLi-1][AV181Nop-1] = A719PrdNum ;
            AV101Tab_prn[AV87NLi-1][AV181Nop-1] = A718PrdNom ;
            AV91Tab_cnt[AV87NLi-1][AV181Nop-1] = A5561LB_CantP ;
            AV172Tab_uni[AV87NLi-1][AV181Nop-1] = A488ForPrdDsc ;
            AV173Tab_tipo[AV87NLi-1][AV181Nop-1] = httpContext.getMessage( "P", "") ;
            AV87NLi = (short)(AV87NLi+1) ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         AV181Nop = (byte)(AV181Nop+1) ;
         if ( AV87NLi > 7 )
         {
            AV174Mas_opcion = "..." ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV181Nop = (byte)(AV181Nop-1) ;
      AV87NLi = (short)(AV87NLi-1) ;
   }

   public void h7750( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV139Contdsc, "")), 20, Gx_line+1, 104, Gx_line+12, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+13) ;
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
            if ( GxHdr3 )
            {
               getPrinter().GxDrawRect(6, Gx_line+1, 170, Gx_line+45, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 98, Gx_line+15, 157, Gx_line+33, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 93, Gx_line+54, 138, Gx_line+72, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 144, Gx_line+54, 364, Gx_line+72, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), 101, Gx_line+104, 219, Gx_line+122, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5534Lb_ArtDsc, "")), 232, Gx_line+104, 423, Gx_line+122, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5552Lb_TipArtD, "")), 435, Gx_line+104, 655, Gx_line+122, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(6, Gx_line+49, 1096, Gx_line+143, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5536Lb_ColNom, "")), 77, Gx_line+152, 173, Gx_line+170, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9")), 188, Gx_line+152, 233, Gx_line+170, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 246, Gx_line+152, 262, Gx_line+169, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A832TipColDsc, "")), 272, Gx_line+152, 492, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5538Lb_ColNomC, "")), 77, Gx_line+174, 173, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5539Lb_ColNumC), "ZZZZZ9")), 188, Gx_line+174, 233, Gx_line+192, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5540Lb_Cartaz, "")), 100, Gx_line+77, 247, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")), 99, Gx_line+196, 115, Gx_line+213, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A584IntDsc, "")), 120, Gx_line+196, 340, Gx_line+213, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(6, Gx_line+146, 1096, Gx_line+239, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 439, Gx_line+196, 456, Gx_line+212, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5547Lb_Rb, "ZZZ9.99")), 464, Gx_line+196, 516, Gx_line+213, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5541Lb_FechaE, "99/99/99"), 651, Gx_line+171, 710, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5543Lb_Usuario, "")), 1000, Gx_line+171, 1074, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5544Lb_FechaM, "99/99/99"), 651, Gx_line+199, 710, Gx_line+216, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5546Lb_UsuM, "")), 1000, Gx_line+199, 1074, Gx_line+216, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5542Lb_HoraE, "99:99"), 817, Gx_line+171, 854, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5545Lb_HoraM, "99:99"), 817, Gx_line+199, 854, Gx_line+216, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(A5548Lb_Obs, 15, Gx_line+258, 533, Gx_line+321, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A5594Lb_cartazf, "99/99/99"), 259, Gx_line+77, 318, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5601Lb_Tempt), "ZZZ9")), 138, Gx_line+218, 168, Gx_line+235, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5610Lb_Temp2), "ZZZ9")), 173, Gx_line+218, 203, Gx_line+235, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5611Lb_Temp3), "ZZZ9")), 208, Gx_line+218, 238, Gx_line+235, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5600Lb_IDM), "ZZZZZZZ9")), 791, Gx_line+58, 850, Gx_line+75, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109EmprNOm, "")), 335, Gx_line+13, 586, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112Lit3, "")), 698, Gx_line+28, 824, Gx_line+45, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 843, Gx_line+28, 902, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 911, Gx_line+28, 915, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 927, Gx_line+28, 986, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113Lit4, "")), 11, Gx_line+15, 75, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114Lit5, "")), 14, Gx_line+54, 56, Gx_line+70, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV115Lit6, "")), 14, Gx_line+77, 81, Gx_line+93, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116Lit7, "")), 14, Gx_line+104, 56, Gx_line+120, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117Lit8, "")), 15, Gx_line+152, 67, Gx_line+168, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118Lit9, "")), 15, Gx_line+174, 59, Gx_line+190, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Lit10, "")), 15, Gx_line+196, 85, Gx_line+212, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Lit11, "")), 15, Gx_line+218, 87, Gx_line+234, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Lit12, "")), 15, Gx_line+241, 91, Gx_line+258, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV127Lit18, "")), 565, Gx_line+171, 633, Gx_line+187, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV128Lit19, "")), 565, Gx_line+199, 633, Gx_line+215, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV129Lit20, "")), 749, Gx_line+171, 806, Gx_line+187, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV130Lit21, "")), 749, Gx_line+199, 806, Gx_line+215, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV131Texto_m, "")), 791, Gx_line+85, 938, Gx_line+102, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV132Lit22, "")), 702, Gx_line+110, 773, Gx_line+126, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5700Lb_Talao, "")), 791, Gx_line+110, 938, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV133Lit23, "")), 945, Gx_line+94, 1021, Gx_line+111, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5701Lb_Local, "")), 945, Gx_line+110, 1019, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV134Lit24, "")), 402, Gx_line+54, 506, Gx_line+70, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV135Texto_e, "")), 519, Gx_line+54, 666, Gx_line+71, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV138Compo, "")), 232, Gx_line+123, 452, Gx_line+141, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV140Lit25, "")), 702, Gx_line+85, 773, Gx_line+101, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Fibras", ""), 402, Gx_line+218, 455, Gx_line+234, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5988Lb_nfibras), "Z9")), 478, Gx_line+218, 494, Gx_line+235, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV142Lit26, "")), 702, Gx_line+58, 766, Gx_line+75, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 779, Gx_line+85, 783, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 779, Gx_line+58, 783, Gx_line+74, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 779, Gx_line+110, 783, Gx_line+126, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 510, Gx_line+54, 514, Gx_line+70, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 83, Gx_line+104, 87, Gx_line+120, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 83, Gx_line+77, 87, Gx_line+93, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 83, Gx_line+52, 87, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 91, Gx_line+196, 95, Gx_line+212, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 71, Gx_line+174, 75, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 71, Gx_line+152, 75, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 91, Gx_line+218, 95, Gx_line+234, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 458, Gx_line+196, 462, Gx_line+212, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 457, Gx_line+218, 461, Gx_line+234, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 641, Gx_line+199, 645, Gx_line+215, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 641, Gx_line+171, 645, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 810, Gx_line+199, 814, Gx_line+215, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 810, Gx_line+171, 814, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 993, Gx_line+199, 997, Gx_line+215, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 993, Gx_line+171, 997, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV143Lit27, "")), 900, Gx_line+171, 988, Gx_line+187, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV144Lit28, "")), 900, Gx_line+199, 988, Gx_line+215, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 97, Gx_line+241, 101, Gx_line+257, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pantone :", ""), 565, Gx_line+241, 621, Gx_line+257, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV167Lb_panton1, "")), 632, Gx_line+243, 998, Gx_line+260, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV168Lb_panton2, "")), 632, Gx_line+261, 998, Gx_line+278, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Text", ""), 272, Gx_line+219, 302, Gx_line+236, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(685, Gx_line+50, 685, Gx_line+141, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(536, Gx_line+147, 536, Gx_line+238, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+323) ;
            }
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
      this.aP0[0] = rens010h.this.A396EmprCod;
      this.aP1[0] = rens010h.this.A5532Lb_numero;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV139Contdsc = "" ;
      AV110Lit1 = "" ;
      AV111Lit2 = "" ;
      AV112Lit3 = "" ;
      AV113Lit4 = "" ;
      AV114Lit5 = "" ;
      AV115Lit6 = "" ;
      AV116Lit7 = "" ;
      AV117Lit8 = "" ;
      AV118Lit9 = "" ;
      AV119Lit10 = "" ;
      AV120Lit11 = "" ;
      AV121Lit12 = "" ;
      AV122Lit13 = "" ;
      AV123Lit14 = "" ;
      AV124Lit15 = "" ;
      AV125Lit16 = "" ;
      AV126Lit17 = "" ;
      AV127Lit18 = "" ;
      AV128Lit19 = "" ;
      AV129Lit20 = "" ;
      AV130Lit21 = "" ;
      AV132Lit22 = "" ;
      AV133Lit23 = "" ;
      AV134Lit24 = "" ;
      AV140Lit25 = "" ;
      AV142Lit26 = "" ;
      AV143Lit27 = "" ;
      AV144Lit28 = "" ;
      scmdbuf = "" ;
      P07752_A396EmprCod = new String[] {""} ;
      P07752_A407EmprNom = new String[] {""} ;
      P07752_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV109EmprNOm = "" ;
      P07753_A5548Lb_Obs = new String[] {""} ;
      P07753_A396EmprCod = new String[] {""} ;
      P07753_A5532Lb_numero = new int[1] ;
      P07753_A5595Lb_malha = new byte[1] ;
      P07753_A5570Lb_Tipo = new String[] {""} ;
      P07753_A6546Lb_Pantone = new String[] {""} ;
      P07753_A5988Lb_nfibras = new byte[1] ;
      P07753_A5701Lb_Local = new String[] {""} ;
      P07753_A5700Lb_Talao = new String[] {""} ;
      P07753_A5600Lb_IDM = new int[1] ;
      P07753_A5611Lb_Temp3 = new short[1] ;
      P07753_A5610Lb_Temp2 = new short[1] ;
      P07753_A5601Lb_Tempt = new short[1] ;
      P07753_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P07753_A5545Lb_HoraM = new java.util.Date[] {GXutil.nullDate()} ;
      P07753_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P07753_A5546Lb_UsuM = new String[] {""} ;
      P07753_A5544Lb_FechaM = new java.util.Date[] {GXutil.nullDate()} ;
      P07753_A5543Lb_Usuario = new String[] {""} ;
      P07753_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P07753_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07753_A584IntDsc = new String[] {""} ;
      P07753_n584IntDsc = new boolean[] {false} ;
      P07753_A583IntCod = new byte[1] ;
      P07753_n583IntCod = new boolean[] {false} ;
      P07753_A5540Lb_Cartaz = new String[] {""} ;
      P07753_A5539Lb_ColNumC = new int[1] ;
      P07753_A5538Lb_ColNomC = new String[] {""} ;
      P07753_A832TipColDsc = new String[] {""} ;
      P07753_n832TipColDsc = new boolean[] {false} ;
      P07753_A831TipColCod = new byte[1] ;
      P07753_n831TipColCod = new boolean[] {false} ;
      P07753_A5537Lb_ColNum = new int[1] ;
      P07753_A5536Lb_ColNom = new String[] {""} ;
      P07753_A5552Lb_TipArtD = new String[] {""} ;
      P07753_A5534Lb_ArtDsc = new String[] {""} ;
      P07753_A5533Lb_ArtCod = new String[] {""} ;
      P07753_A279CliNom = new String[] {""} ;
      P07753_A252CliCod = new int[1] ;
      A5548Lb_Obs = "" ;
      A5570Lb_Tipo = "" ;
      A6546Lb_Pantone = "" ;
      A5701Lb_Local = "" ;
      A5700Lb_Talao = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5545Lb_HoraM = GXutil.resetTime( GXutil.nullDate() );
      A5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      A5546Lb_UsuM = "" ;
      A5544Lb_FechaM = GXutil.nullDate() ;
      A5543Lb_Usuario = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A584IntDsc = "" ;
      A5540Lb_Cartaz = "" ;
      A5538Lb_ColNomC = "" ;
      A832TipColDsc = "" ;
      A5536Lb_ColNom = "" ;
      A5552Lb_TipArtD = "" ;
      A5534Lb_ArtDsc = "" ;
      A5533Lb_ArtCod = "" ;
      A279CliNom = "" ;
      AV131Texto_m = "" ;
      AV135Texto_e = "" ;
      AV167Lb_panton1 = "" ;
      AV168Lb_panton2 = "" ;
      AV137Lb_artcod = "" ;
      P07754_A5532Lb_numero = new int[1] ;
      P07754_A5551Lb_lineaPq = new short[1] ;
      P07754_A396EmprCod = new String[] {""} ;
      P07754_A5553Lb_ForCod = new String[] {""} ;
      A5553Lb_ForCod = "" ;
      A5554Lb_ForDsc = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV88Tab_op = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV88Tab_op[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV106Tab_cos = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV106Tab_cos[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV174Mas_opcion = "" ;
      AV90Tab_prd = new String[100][10] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 10 )
         {
            AV90Tab_prd[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV179TLin_prd = "" ;
      AV180TLin_dsc = "" ;
      AV101Tab_prn = new String[100][10] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 10 )
         {
            AV101Tab_prn[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV175TLin_tipo = "" ;
      AV173Tab_tipo = new String[100][10] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 10 )
         {
            AV173Tab_tipo[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV177TLin_cnt = new java.math.BigDecimal[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV177TLin_cnt[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV91Tab_cnt = new java.math.BigDecimal[100][10] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 10 )
         {
            AV91Tab_cnt[GX_I-1][GX_J-1] = DecimalUtil.ZERO ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV178TLin_uni = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV178TLin_uni[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV172Tab_uni = new String[100][10] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 10 )
         {
            AV172Tab_uni[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV176TLin_tipi = "" ;
      AV138Compo = "" ;
      P07755_A396EmprCod = new String[] {""} ;
      P07755_A65ArtCod = new String[] {""} ;
      P07755_A252CliCod = new int[1] ;
      P07755_A105ArtTra1 = new String[] {""} ;
      P07755_n105ArtTra1 = new boolean[] {false} ;
      P07755_A108ArtTraP1 = new short[1] ;
      P07755_n108ArtTraP1 = new boolean[] {false} ;
      P07755_A106ArtTra2 = new String[] {""} ;
      P07755_n106ArtTra2 = new boolean[] {false} ;
      P07755_A109ArtTraP2 = new short[1] ;
      P07755_n109ArtTraP2 = new boolean[] {false} ;
      P07755_A107ArtTra3 = new String[] {""} ;
      P07755_n107ArtTra3 = new boolean[] {false} ;
      P07755_A110ArtTraP3 = new short[1] ;
      P07755_n110ArtTraP3 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      AV89Tab_opc = new String[100][10] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 10 )
         {
            AV89Tab_opc[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      P07756_A396EmprCod = new String[] {""} ;
      P07756_A5532Lb_numero = new int[1] ;
      P07756_A5555Lb_opcion = new String[] {""} ;
      P07756_A5556Lb_UltLC = new short[1] ;
      P07756_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A5555Lb_opcion = "" ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      P07757_A490ForPrdUMe = new byte[1] ;
      P07757_A396EmprCod = new String[] {""} ;
      P07757_A5532Lb_numero = new int[1] ;
      P07757_A5555Lb_opcion = new String[] {""} ;
      P07757_A719PrdNum = new String[] {""} ;
      P07757_A718PrdNom = new String[] {""} ;
      P07757_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07757_A488ForPrdDsc = new String[] {""} ;
      P07757_n488ForPrdDsc = new boolean[] {false} ;
      P07757_A5557Lb_LineaC = new short[1] ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      P07758_A490ForPrdUMe = new byte[1] ;
      P07758_A396EmprCod = new String[] {""} ;
      P07758_A5532Lb_numero = new int[1] ;
      P07758_A5555Lb_opcion = new String[] {""} ;
      P07758_A719PrdNum = new String[] {""} ;
      P07758_A718PrdNom = new String[] {""} ;
      P07758_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07758_A488ForPrdDsc = new String[] {""} ;
      P07758_n488ForPrdDsc = new boolean[] {false} ;
      P07758_A5560Lb_LineaPr = new short[1] ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rens010h__default(),
         new Object[] {
             new Object[] {
            P07752_A396EmprCod, P07752_A407EmprNom, P07752_n407EmprNom
            }
            , new Object[] {
            P07753_A5548Lb_Obs, P07753_A396EmprCod, P07753_A5532Lb_numero, P07753_A5595Lb_malha, P07753_A5570Lb_Tipo, P07753_A6546Lb_Pantone, P07753_A5988Lb_nfibras, P07753_A5701Lb_Local, P07753_A5700Lb_Talao, P07753_A5600Lb_IDM,
            P07753_A5611Lb_Temp3, P07753_A5610Lb_Temp2, P07753_A5601Lb_Tempt, P07753_A5594Lb_cartazf, P07753_A5545Lb_HoraM, P07753_A5542Lb_HoraE, P07753_A5546Lb_UsuM, P07753_A5544Lb_FechaM, P07753_A5543Lb_Usuario, P07753_A5541Lb_FechaE,
            P07753_A5547Lb_Rb, P07753_A584IntDsc, P07753_n584IntDsc, P07753_A583IntCod, P07753_n583IntCod, P07753_A5540Lb_Cartaz, P07753_A5539Lb_ColNumC, P07753_A5538Lb_ColNomC, P07753_A832TipColDsc, P07753_n832TipColDsc,
            P07753_A831TipColCod, P07753_n831TipColCod, P07753_A5537Lb_ColNum, P07753_A5536Lb_ColNom, P07753_A5552Lb_TipArtD, P07753_A5534Lb_ArtDsc, P07753_A5533Lb_ArtCod, P07753_A279CliNom, P07753_A252CliCod
            }
            , new Object[] {
            P07754_A5532Lb_numero, P07754_A5551Lb_lineaPq, P07754_A396EmprCod, P07754_A5553Lb_ForCod
            }
            , new Object[] {
            P07755_A396EmprCod, P07755_A65ArtCod, P07755_A252CliCod, P07755_A105ArtTra1, P07755_n105ArtTra1, P07755_A108ArtTraP1, P07755_n108ArtTraP1, P07755_A106ArtTra2, P07755_n106ArtTra2, P07755_A109ArtTraP2,
            P07755_n109ArtTraP2, P07755_A107ArtTra3, P07755_n107ArtTra3, P07755_A110ArtTraP3, P07755_n110ArtTraP3
            }
            , new Object[] {
            P07756_A396EmprCod, P07756_A5532Lb_numero, P07756_A5555Lb_opcion, P07756_A5556Lb_UltLC, P07756_A5565Lb_CosteE
            }
            , new Object[] {
            P07757_A490ForPrdUMe, P07757_A396EmprCod, P07757_A5532Lb_numero, P07757_A5555Lb_opcion, P07757_A719PrdNum, P07757_A718PrdNom, P07757_A5558LB_CantC, P07757_A488ForPrdDsc, P07757_n488ForPrdDsc, P07757_A5557Lb_LineaC
            }
            , new Object[] {
            P07758_A490ForPrdUMe, P07758_A396EmprCod, P07758_A5532Lb_numero, P07758_A5555Lb_opcion, P07758_A719PrdNum, P07758_A718PrdNom, P07758_A5561LB_CantP, P07758_A488ForPrdDsc, P07758_n488ForPrdDsc, P07758_A5560Lb_LineaPr
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

   private byte A5595Lb_malha ;
   private byte A5988Lb_nfibras ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte AV184Fin ;
   private byte AV181Nop ;
   private byte A490ForPrdUMe ;
   private short AV98t ;
   private short AV95j ;
   private short A5611Lb_Temp3 ;
   private short A5610Lb_Temp2 ;
   private short A5601Lb_Tempt ;
   private short AV182i ;
   private short A5551Lb_lineaPq ;
   private short AV87NLi ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A5556Lb_UltLC ;
   private short A5557Lb_LineaC ;
   private short A5560Lb_LineaPr ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV165Lb_numero ;
   private int A5600Lb_IDM ;
   private int A5539Lb_ColNumC ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private int AV136CliCod ;
   private int Gx_OldLine ;
   private int GX_I ;
   private int GX_J ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV106Tab_cos[] ;
   private java.math.BigDecimal AV177TLin_cnt[] ;
   private java.math.BigDecimal AV91Tab_cnt[][] ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal A5561LB_CantP ;
   private String A396EmprCod ;
   private String AV139Contdsc ;
   private String AV110Lit1 ;
   private String AV111Lit2 ;
   private String AV112Lit3 ;
   private String AV113Lit4 ;
   private String AV114Lit5 ;
   private String AV115Lit6 ;
   private String AV116Lit7 ;
   private String AV117Lit8 ;
   private String AV118Lit9 ;
   private String AV119Lit10 ;
   private String AV120Lit11 ;
   private String AV121Lit12 ;
   private String AV122Lit13 ;
   private String AV123Lit14 ;
   private String AV124Lit15 ;
   private String AV125Lit16 ;
   private String AV126Lit17 ;
   private String AV127Lit18 ;
   private String AV128Lit19 ;
   private String AV129Lit20 ;
   private String AV130Lit21 ;
   private String AV132Lit22 ;
   private String AV133Lit23 ;
   private String AV134Lit24 ;
   private String AV140Lit25 ;
   private String AV142Lit26 ;
   private String AV143Lit27 ;
   private String AV144Lit28 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV109EmprNOm ;
   private String A5570Lb_Tipo ;
   private String A6546Lb_Pantone ;
   private String A5701Lb_Local ;
   private String A5700Lb_Talao ;
   private String A5546Lb_UsuM ;
   private String A5543Lb_Usuario ;
   private String A584IntDsc ;
   private String A5540Lb_Cartaz ;
   private String A5538Lb_ColNomC ;
   private String A832TipColDsc ;
   private String A5536Lb_ColNom ;
   private String A5552Lb_TipArtD ;
   private String A5534Lb_ArtDsc ;
   private String A5533Lb_ArtCod ;
   private String A279CliNom ;
   private String AV131Texto_m ;
   private String AV135Texto_e ;
   private String AV167Lb_panton1 ;
   private String AV168Lb_panton2 ;
   private String AV137Lb_artcod ;
   private String A5553Lb_ForCod ;
   private String A5554Lb_ForDsc ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV88Tab_op[] ;
   private String AV174Mas_opcion ;
   private String AV90Tab_prd[][] ;
   private String AV179TLin_prd ;
   private String AV180TLin_dsc ;
   private String AV101Tab_prn[][] ;
   private String AV175TLin_tipo ;
   private String AV173Tab_tipo[][] ;
   private String AV178TLin_uni[] ;
   private String AV172Tab_uni[][] ;
   private String AV176TLin_tipi ;
   private String AV138Compo ;
   private String A65ArtCod ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String AV89Tab_opc[][] ;
   private String A5555Lb_opcion ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String Gx_time ;
   private java.util.Date A5545Lb_HoraM ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5544Lb_FechaM ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean GxHdr3 ;
   private boolean n584IntDsc ;
   private boolean n583IntCod ;
   private boolean n832TipColDsc ;
   private boolean n831TipColCod ;
   private boolean n105ArtTra1 ;
   private boolean n108ArtTraP1 ;
   private boolean n106ArtTra2 ;
   private boolean n109ArtTraP2 ;
   private boolean n107ArtTra3 ;
   private boolean n110ArtTraP3 ;
   private boolean n488ForPrdDsc ;
   private String A5548Lb_Obs ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P07752_A396EmprCod ;
   private String[] P07752_A407EmprNom ;
   private boolean[] P07752_n407EmprNom ;
   private String[] P07753_A5548Lb_Obs ;
   private String[] P07753_A396EmprCod ;
   private int[] P07753_A5532Lb_numero ;
   private byte[] P07753_A5595Lb_malha ;
   private String[] P07753_A5570Lb_Tipo ;
   private String[] P07753_A6546Lb_Pantone ;
   private byte[] P07753_A5988Lb_nfibras ;
   private String[] P07753_A5701Lb_Local ;
   private String[] P07753_A5700Lb_Talao ;
   private int[] P07753_A5600Lb_IDM ;
   private short[] P07753_A5611Lb_Temp3 ;
   private short[] P07753_A5610Lb_Temp2 ;
   private short[] P07753_A5601Lb_Tempt ;
   private java.util.Date[] P07753_A5594Lb_cartazf ;
   private java.util.Date[] P07753_A5545Lb_HoraM ;
   private java.util.Date[] P07753_A5542Lb_HoraE ;
   private String[] P07753_A5546Lb_UsuM ;
   private java.util.Date[] P07753_A5544Lb_FechaM ;
   private String[] P07753_A5543Lb_Usuario ;
   private java.util.Date[] P07753_A5541Lb_FechaE ;
   private java.math.BigDecimal[] P07753_A5547Lb_Rb ;
   private String[] P07753_A584IntDsc ;
   private boolean[] P07753_n584IntDsc ;
   private byte[] P07753_A583IntCod ;
   private boolean[] P07753_n583IntCod ;
   private String[] P07753_A5540Lb_Cartaz ;
   private int[] P07753_A5539Lb_ColNumC ;
   private String[] P07753_A5538Lb_ColNomC ;
   private String[] P07753_A832TipColDsc ;
   private boolean[] P07753_n832TipColDsc ;
   private byte[] P07753_A831TipColCod ;
   private boolean[] P07753_n831TipColCod ;
   private int[] P07753_A5537Lb_ColNum ;
   private String[] P07753_A5536Lb_ColNom ;
   private String[] P07753_A5552Lb_TipArtD ;
   private String[] P07753_A5534Lb_ArtDsc ;
   private String[] P07753_A5533Lb_ArtCod ;
   private String[] P07753_A279CliNom ;
   private int[] P07753_A252CliCod ;
   private int[] P07754_A5532Lb_numero ;
   private short[] P07754_A5551Lb_lineaPq ;
   private String[] P07754_A396EmprCod ;
   private String[] P07754_A5553Lb_ForCod ;
   private String[] P07755_A396EmprCod ;
   private String[] P07755_A65ArtCod ;
   private int[] P07755_A252CliCod ;
   private String[] P07755_A105ArtTra1 ;
   private boolean[] P07755_n105ArtTra1 ;
   private short[] P07755_A108ArtTraP1 ;
   private boolean[] P07755_n108ArtTraP1 ;
   private String[] P07755_A106ArtTra2 ;
   private boolean[] P07755_n106ArtTra2 ;
   private short[] P07755_A109ArtTraP2 ;
   private boolean[] P07755_n109ArtTraP2 ;
   private String[] P07755_A107ArtTra3 ;
   private boolean[] P07755_n107ArtTra3 ;
   private short[] P07755_A110ArtTraP3 ;
   private boolean[] P07755_n110ArtTraP3 ;
   private String[] P07756_A396EmprCod ;
   private int[] P07756_A5532Lb_numero ;
   private String[] P07756_A5555Lb_opcion ;
   private short[] P07756_A5556Lb_UltLC ;
   private java.math.BigDecimal[] P07756_A5565Lb_CosteE ;
   private byte[] P07757_A490ForPrdUMe ;
   private String[] P07757_A396EmprCod ;
   private int[] P07757_A5532Lb_numero ;
   private String[] P07757_A5555Lb_opcion ;
   private String[] P07757_A719PrdNum ;
   private String[] P07757_A718PrdNom ;
   private java.math.BigDecimal[] P07757_A5558LB_CantC ;
   private String[] P07757_A488ForPrdDsc ;
   private boolean[] P07757_n488ForPrdDsc ;
   private short[] P07757_A5557Lb_LineaC ;
   private byte[] P07758_A490ForPrdUMe ;
   private String[] P07758_A396EmprCod ;
   private int[] P07758_A5532Lb_numero ;
   private String[] P07758_A5555Lb_opcion ;
   private String[] P07758_A719PrdNum ;
   private String[] P07758_A718PrdNom ;
   private java.math.BigDecimal[] P07758_A5561LB_CantP ;
   private String[] P07758_A488ForPrdDsc ;
   private boolean[] P07758_n488ForPrdDsc ;
   private short[] P07758_A5560Lb_LineaPr ;
}

final  class rens010h__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07752", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07753", "SELECT T1.Lb_Obs, T1.EmprCod, T1.Lb_numero, T1.Lb_malha, T1.Lb_Tipo, T1.Lb_Pantone, T1.Lb_nfibras, T1.Lb_Local, T1.Lb_Talao, T1.Lb_IDM, T1.Lb_Temp3, T1.Lb_Temp2, T1.Lb_Tempt, T1.Lb_cartazf, T1.Lb_HoraM, T1.Lb_HoraE, T1.Lb_UsuM, T1.Lb_FechaM, T1.Lb_Usuario, T1.Lb_FechaE, T1.Lb_Rb, T3.IntDsc, T1.IntCod, T1.Lb_Cartaz, T1.Lb_ColNumC, T1.Lb_ColNomC, T4.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_TipArtD, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod FROM (((TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07754", "SELECT Lb_numero, Lb_lineaPq, EmprCod, Lb_ForCod FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07755", "SELECT EmprCod, ArtCod, CliCod, ArtTra1, ArtTraP1, ArtTra2, ArtTraP2, ArtTra3, ArtTraP3 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07756", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_UltLC, Lb_CosteE FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07757", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.PrdNum, T2.PrdNom, T1.LB_CantC, T3.ForPrdDsc, T1.Lb_LineaC FROM ((TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07758", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.PrdNum, T2.PrdNom, T1.LB_CantP, T3.ForPrdDsc, T1.Lb_LineaPr FROM ((TXPENS004 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 100);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[14])[0] = GXutil.resetDate(rslt.getGXDateTime(15));
               ((java.util.Date[]) buf[15])[0] = GXutil.resetDate(rslt.getGXDateTime(16));
               ((String[]) buf[16])[0] = rslt.getString(17, 10);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(20);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[21])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(23);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(24, 20);
               ((int[]) buf[26])[0] = rslt.getInt(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 13);
               ((String[]) buf[28])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((int[]) buf[32])[0] = rslt.getInt(29);
               ((String[]) buf[33])[0] = rslt.getString(30, 13);
               ((String[]) buf[34])[0] = rslt.getString(31, 30);
               ((String[]) buf[35])[0] = rslt.getString(32, 26);
               ((String[]) buf[36])[0] = rslt.getString(33, 16);
               ((String[]) buf[37])[0] = rslt.getString(34, 30);
               ((int[]) buf[38])[0] = rslt.getInt(35);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

