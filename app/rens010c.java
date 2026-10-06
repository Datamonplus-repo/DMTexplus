package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rens010c extends GXReport
{
   public rens010c( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rens010c.class ), "" );
   }

   public rens010c( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      rens010c.this.aP2 = new String[] {""};
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
      rens010c.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rens010c.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      rens010c.this.Gx_out = aP2[0];
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("FICHA ENSAYO CARVEMA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV139Contdsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS010", ""), GXv_char1) ;
         rens010c.this.AV139Contdsc = GXv_char1[0] ;
         GXv_int2[0] = AV141Hilo ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HILO", ""), GXv_int2) ;
         rens010c.this.AV141Hilo = GXv_int2[0] ;
         GXv_int2[0] = AV166Hidro ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HIDRO", ""), GXv_int2) ;
         rens010c.this.AV166Hidro = GXv_int2[0] ;
         GXt_char3 = AV110Lit1 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV110Lit1 = GXt_char3 ;
         GXt_char3 = AV111Lit2 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV111Lit2 = GXt_char3 ;
         AV112Lit3 = GXutil.trim( AV110Lit1) + "-" + GXutil.trim( AV111Lit2) ;
         GXt_char3 = AV113Lit4 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT305_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV113Lit4 = GXt_char3 ;
         GXt_char3 = AV114Lit5 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV114Lit5 = GXt_char3 ;
         GXt_char3 = AV115Lit6 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL120_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV115Lit6 = GXt_char3 ;
         if ( GXutil.strcmp(AV115Lit6, httpContext.getMessage( "WCFL120_", "")) == 0 )
         {
            GXt_char3 = AV115Lit6 ;
            GXv_char1[0] = GXt_char3 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char1) ;
            rens010c.this.GXt_char3 = GXv_char1[0] ;
            AV115Lit6 = GXt_char3 ;
         }
         GXt_char3 = AV116Lit7 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV116Lit7 = GXt_char3 ;
         GXt_char3 = AV117Lit8 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV117Lit8 = GXt_char3 ;
         GXt_char3 = AV118Lit9 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV118Lit9 = GXt_char3 ;
         GXt_char3 = AV119Lit10 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1194_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV119Lit10 = GXt_char3 ;
         GXt_char3 = AV120Lit11 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN236", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV120Lit11 = GXt_char3 ;
         GXt_char3 = AV121Lit12 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1164_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV121Lit12 = GXt_char3 ;
         GXt_char3 = AV122Lit13 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV122Lit13 = GXt_char3 ;
         GXt_char3 = AV123Lit14 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1145_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV123Lit14 = GXt_char3 ;
         GXt_char3 = AV124Lit15 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1160_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV124Lit15 = GXt_char3 ;
         GXt_char3 = AV125Lit16 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN176", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV125Lit16 = GXt_char3 ;
         GXt_char3 = AV126Lit17 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN079_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV126Lit17 = GXt_char3 ;
         GXt_char3 = AV127Lit18 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1134_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV127Lit18 = GXt_char3 ;
         GXt_char3 = AV128Lit19 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN237", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV128Lit19 = GXutil.trim( GXt_char3) ;
         GXt_char3 = AV129Lit20 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN037", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV129Lit20 = GXutil.trim( GXt_char3) ;
         AV129Lit20 = GXutil.substring( AV129Lit20, 1, 8) ;
         GXt_char3 = AV130Lit21 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN238", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV130Lit21 = GXutil.trim( GXt_char3) ;
         GXt_char3 = AV132Lit22 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV132Lit22 = GXt_char3 ;
         GXt_char3 = AV133Lit23 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1217_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV133Lit23 = GXt_char3 ;
         GXt_char3 = AV134Lit24 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN208", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         AV134Lit24 = GXt_char3 ;
         GXt_char3 = AV140Lit25 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1376_", ""), (byte)(99), GXv_char1) ;
         rens010c.this.GXt_char3 = GXv_char1[0] ;
         GXt_char4 = AV140Lit25 ;
         GXv_char5[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char5) ;
         rens010c.this.GXt_char4 = GXv_char5[0] ;
         AV140Lit25 = GXt_char3 + " " + GXt_char4 ;
         AV142Lit26 = httpContext.getMessage( "Nº IDM", "") ;
         GXt_char4 = AV177Lit41 ;
         GXv_char5[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT324_", ""), (byte)(99), GXv_char5) ;
         rens010c.this.GXt_char4 = GXv_char5[0] ;
         AV177Lit41 = GXt_char4 ;
         if ( AV141Hilo == 1 )
         {
            GXt_char4 = AV142Lit26 ;
            GXv_char5[0] = GXt_char4 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1017_", ""), (byte)(99), GXv_char5) ;
            rens010c.this.GXt_char4 = GXv_char5[0] ;
            AV142Lit26 = GXt_char4 ;
         }
         GXt_char4 = AV143Lit27 ;
         GXv_char5[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char5) ;
         rens010c.this.GXt_char4 = GXv_char5[0] ;
         AV143Lit27 = GXutil.trim( GXt_char4) + " " + httpContext.getMessage( "Ent.", "") ;
         GXt_char4 = AV144Lit28 ;
         GXv_char5[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char5) ;
         rens010c.this.GXt_char4 = GXv_char5[0] ;
         AV144Lit28 = GXutil.trim( GXt_char4) + " " + httpContext.getMessage( "Mod.", "") ;
         if ( AV166Hidro == 1 )
         {
            AV140Lit25 = httpContext.getMessage( "Empesa", "") ;
            AV132Lit22 = httpContext.getMessage( "Albaran", "") ;
         }
         /* Using cursor P07B02 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07B02_A407EmprNom[0] ;
            n407EmprNom = P07B02_n407EmprNom[0] ;
            AV109EmprNOm = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV170Cortinti = (byte)(0) ;
         GXv_int2[0] = AV170Cortinti ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CORTIN", ""), GXv_int2) ;
         rens010c.this.AV170Cortinti = GXv_int2[0] ;
         AV98t = (short)(1) ;
         AV95j = (short)(1) ;
         AV165Lb_numero = A5532Lb_numero ;
         /* Execute user subroutine: 'CARGO' */
         S131 ();
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
         AV138Compo = "" ;
         GxHdr3 = true ;
         /* Using cursor P07B03 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5548Lb_Obs = P07B03_A5548Lb_Obs[0] ;
            A3316CodSol = P07B03_A3316CodSol[0] ;
            n3316CodSol = P07B03_n3316CodSol[0] ;
            A5098TipDisCod = P07B03_A5098TipDisCod[0] ;
            n5098TipDisCod = P07B03_n5098TipDisCod[0] ;
            A7780Lb_Hila = P07B03_A7780Lb_Hila[0] ;
            A6546Lb_Pantone = P07B03_A6546Lb_Pantone[0] ;
            A6653Lb_Tra1 = P07B03_A6653Lb_Tra1[0] ;
            A6654Lb_TraP1 = P07B03_A6654Lb_TraP1[0] ;
            A6655Lb_Tra2 = P07B03_A6655Lb_Tra2[0] ;
            A6656Lb_TraP2 = P07B03_A6656Lb_TraP2[0] ;
            A6657Lb_Tra3 = P07B03_A6657Lb_Tra3[0] ;
            A6658Lb_TraP3 = P07B03_A6658Lb_TraP3[0] ;
            A5595Lb_malha = P07B03_A5595Lb_malha[0] ;
            A5570Lb_Tipo = P07B03_A5570Lb_Tipo[0] ;
            A1514MacProCod = P07B03_A1514MacProCod[0] ;
            n1514MacProCod = P07B03_n1514MacProCod[0] ;
            A3317DscSol = P07B03_A3317DscSol[0] ;
            n3317DscSol = P07B03_n3317DscSol[0] ;
            A5700Lb_Talao = P07B03_A5700Lb_Talao[0] ;
            A5988Lb_nfibras = P07B03_A5988Lb_nfibras[0] ;
            A5097TipDisDsc = P07B03_A5097TipDisDsc[0] ;
            n5097TipDisDsc = P07B03_n5097TipDisDsc[0] ;
            A5611Lb_Temp3 = P07B03_A5611Lb_Temp3[0] ;
            A5610Lb_Temp2 = P07B03_A5610Lb_Temp2[0] ;
            A5601Lb_Tempt = P07B03_A5601Lb_Tempt[0] ;
            A5594Lb_cartazf = P07B03_A5594Lb_cartazf[0] ;
            A5547Lb_Rb = P07B03_A5547Lb_Rb[0] ;
            A584IntDsc = P07B03_A584IntDsc[0] ;
            n584IntDsc = P07B03_n584IntDsc[0] ;
            A583IntCod = P07B03_A583IntCod[0] ;
            n583IntCod = P07B03_n583IntCod[0] ;
            A5540Lb_Cartaz = P07B03_A5540Lb_Cartaz[0] ;
            A5539Lb_ColNumC = P07B03_A5539Lb_ColNumC[0] ;
            A5538Lb_ColNomC = P07B03_A5538Lb_ColNomC[0] ;
            A832TipColDsc = P07B03_A832TipColDsc[0] ;
            n832TipColDsc = P07B03_n832TipColDsc[0] ;
            A831TipColCod = P07B03_A831TipColCod[0] ;
            n831TipColCod = P07B03_n831TipColCod[0] ;
            A5537Lb_ColNum = P07B03_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = P07B03_A5536Lb_ColNom[0] ;
            A5534Lb_ArtDsc = P07B03_A5534Lb_ArtDsc[0] ;
            A5533Lb_ArtCod = P07B03_A5533Lb_ArtCod[0] ;
            A279CliNom = P07B03_A279CliNom[0] ;
            A252CliCod = P07B03_A252CliCod[0] ;
            A279CliNom = P07B03_A279CliNom[0] ;
            A584IntDsc = P07B03_A584IntDsc[0] ;
            n584IntDsc = P07B03_n584IntDsc[0] ;
            A832TipColDsc = P07B03_A832TipColDsc[0] ;
            n832TipColDsc = P07B03_n832TipColDsc[0] ;
            A3317DscSol = P07B03_A3317DscSol[0] ;
            n3317DscSol = P07B03_n3317DscSol[0] ;
            A5097TipDisDsc = P07B03_A5097TipDisDsc[0] ;
            n5097TipDisDsc = P07B03_n5097TipDisDsc[0] ;
            AV136CliCod = A252CliCod ;
            AV173ForSer = A5533Lb_ArtCod ;
            AV174ForColNom = A5536Lb_ColNom ;
            AV175ForColNum = A5537Lb_ColNum ;
            AV176TipColCod = A831TipColCod ;
            /* Execute user subroutine: 'COLOR' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
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
            AV172ForNomCli3 = ((GXutil.strcmp("", A7780Lb_Hila)==0) ? AV172ForNomCli3 : A7780Lb_Hila) ;
            AV167Lb_pantone = GXutil.substring( A6546Lb_Pantone, 1, 30) ;
            if ( ! (GXutil.strcmp("", A6653Lb_Tra1)==0) )
            {
               AV138Compo = GXutil.trim( A6653Lb_Tra1) + " " + GXutil.trim( GXutil.str( A6654Lb_TraP1, 3, 0)) + "% " ;
               if ( ! (GXutil.strcmp("", A6655Lb_Tra2)==0) )
               {
                  AV138Compo += GXutil.trim( A6655Lb_Tra2) + " " + GXutil.trim( GXutil.str( A6656Lb_TraP2, 3, 0)) + "% " ;
               }
               if ( ! (GXutil.strcmp("", A6657Lb_Tra3)==0) )
               {
                  AV138Compo += GXutil.trim( A6657Lb_Tra3) + " " + GXutil.trim( GXutil.str( A6658Lb_TraP3, 3, 0)) + "% " ;
               }
            }
            if ( A5595Lb_malha == 1 )
            {
               AV131Texto_m = httpContext.getMessage( "Cliente", "") ;
            }
            else if ( A5595Lb_malha == 2 )
            {
               AV131Texto_m = httpContext.getMessage( "Produçao", "") ;
               if ( AV166Hidro == 1 )
               {
                  AV131Texto_m = httpContext.getMessage( "Produccion", "") ;
               }
            }
            else if ( A5595Lb_malha == 3 )
            {
               AV131Texto_m = httpContext.getMessage( "Provisoria", "") ;
               if ( AV166Hidro == 1 )
               {
                  AV131Texto_m = httpContext.getMessage( "Provisional", "") ;
               }
            }
            else if ( A5595Lb_malha == 4 )
            {
               AV131Texto_m = httpContext.getMessage( "Aguarda", "") ;
               if ( AV166Hidro == 1 )
               {
                  AV131Texto_m = httpContext.getMessage( "En Espera", "") ;
               }
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
               AV135Texto_e = httpContext.getMessage( "Produçao", "") ;
               if ( AV166Hidro == 1 )
               {
                  AV135Texto_e = httpContext.getMessage( "Produccion", "") ;
               }
            }
            else
            {
               AV135Texto_e = "" ;
            }
            AV136CliCod = A252CliCod ;
            AV137Lb_artcod = A5533Lb_ArtCod ;
            AV171MacProCod = A1514MacProCod ;
            AV87i = (short)(0) ;
            /* Using cursor P07B04 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A5551Lb_lineaPq = P07B04_A5551Lb_lineaPq[0] ;
               A5553Lb_ForCod = P07B04_A5553Lb_ForCod[0] ;
               GXt_char4 = A5554Lb_ForDsc ;
               GXv_char5[0] = A396EmprCod ;
               GXv_char1[0] = A5553Lb_ForCod ;
               GXv_char6[0] = GXt_char4 ;
               new app.ppreqd1(remoteHandle, context).execute( GXv_char5, GXv_char1, GXv_char6) ;
               rens010c.this.A396EmprCod = GXv_char5[0] ;
               rens010c.this.A5553Lb_ForCod = GXv_char1[0] ;
               rens010c.this.GXt_char4 = GXv_char6[0] ;
               A5554Lb_ForDsc = GXt_char4 ;
               if ( AV87i == 0 )
               {
                  AV87i = (short)(1) ;
                  h7B00( false, 53) ;
                  getPrinter().GxDrawLine(30, Gx_line+48, 244, Gx_line+48, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122Lit13, "")), 30, Gx_line+31, 94, Gx_line+48, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV171MacProCod, "")), 126, Gx_line+3, 171, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Ficha Técnica", ""), 30, Gx_line+5, 112, Gx_line+21, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+53) ;
               }
               h7B00( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5553Lb_ForCod, "")), 34, Gx_line+0, 79, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5554Lb_ForDsc, "")), 84, Gx_line+0, 231, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV87i = (short)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV89Tab_opc[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV90Tab_prc[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV101Tab_prn[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV91Tab_ctc[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P07B05 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A719PrdNum = P07B05_A719PrdNum[0] ;
               A718PrdNom = P07B05_A718PrdNom[0] ;
               A5558LB_CantC = P07B05_A5558LB_CantC[0] ;
               A5557Lb_LineaC = P07B05_A5557Lb_LineaC[0] ;
               A5555Lb_opcion = P07B05_A5555Lb_opcion[0] ;
               A718PrdNom = P07B05_A718PrdNom[0] ;
               if ( AV87i > 100 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV89Tab_opc[AV87i-1] = A5555Lb_opcion ;
               AV90Tab_prc[AV87i-1] = A719PrdNum ;
               AV101Tab_prn[AV87i-1] = A718PrdNom ;
               AV91Tab_ctc[AV87i-1] = A5558LB_CantC ;
               AV87i = (short)(AV87i+1) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV87i = (short)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV92Tab_opp[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV93Tab_prp[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV102Tab_prpn[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV94Tab_ctp[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P07B06 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A719PrdNum = P07B06_A719PrdNum[0] ;
               A718PrdNom = P07B06_A718PrdNom[0] ;
               A5561LB_CantP = P07B06_A5561LB_CantP[0] ;
               A5560Lb_LineaPr = P07B06_A5560Lb_LineaPr[0] ;
               A5555Lb_opcion = P07B06_A5555Lb_opcion[0] ;
               A718PrdNom = P07B06_A718PrdNom[0] ;
               if ( AV87i > 100 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV92Tab_opp[AV87i-1] = A5555Lb_opcion ;
               AV93Tab_prp[AV87i-1] = A719PrdNum ;
               AV102Tab_prpn[AV87i-1] = A718PrdNom ;
               AV94Tab_ctp[AV87i-1] = A5561LB_CantP ;
               AV87i = (short)(AV87i+1) ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            AV98t = (short)(1) ;
            while ( AV95j <= AV150Num_ops )
            {
               AV151Opcion1 = AV88Tab_op[AV98t-1] ;
               AV152Cost_op1 = AV106Tab_cos[AV98t-1] ;
               AV98t = (short)(AV98t+1) ;
               AV153Opcion2 = AV88Tab_op[AV98t-1] ;
               AV159Cost_op2 = AV106Tab_cos[AV98t-1] ;
               AV98t = (short)(AV98t+1) ;
               AV154Opcion3 = AV88Tab_op[AV98t-1] ;
               AV160Cost_op3 = AV106Tab_cos[AV98t-1] ;
               AV98t = (short)(AV98t+1) ;
               AV155Opcion4 = AV88Tab_op[AV98t-1] ;
               AV161Cost_op4 = AV106Tab_cos[AV98t-1] ;
               AV98t = (short)(AV98t+1) ;
               h7B00( false, 52) ;
               getPrinter().GxDrawLine(19, Gx_line+4, 750, Gx_line+4, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(314, Gx_line+10, 452, Gx_line+46, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV151Opcion1, "@!")), 392, Gx_line+13, 400, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV152Cost_op1, "ZZZZZ.ZZZZZ")), 355, Gx_line+29, 436, Gx_line+46, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(20, Gx_line+10, 305, Gx_line+48, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV153Opcion2, "")), 508, Gx_line+13, 516, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV159Cost_op2, "ZZZZZ.ZZZZZ")), 472, Gx_line+29, 553, Gx_line+46, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(468, Gx_line+10, 558, Gx_line+46, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV154Opcion3, "")), 609, Gx_line+13, 617, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV160Cost_op3, "ZZZZZ.ZZZZZ")), 568, Gx_line+29, 649, Gx_line+46, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(564, Gx_line+10, 654, Gx_line+46, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV155Opcion4, "")), 704, Gx_line+13, 712, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV161Cost_op4, "ZZZZZ.ZZZZZ")), 663, Gx_line+29, 744, Gx_line+46, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(658, Gx_line+10, 748, Gx_line+46, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(304, Gx_line+47, 304, Gx_line+52, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(20, Gx_line+47, 20, Gx_line+52, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(314, Gx_line+47, 314, Gx_line+52, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(450, Gx_line+47, 450, Gx_line+52, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(556, Gx_line+47, 556, Gx_line+52, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(468, Gx_line+47, 468, Gx_line+52, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(564, Gx_line+47, 564, Gx_line+52, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(652, Gx_line+47, 652, Gx_line+52, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(658, Gx_line+47, 658, Gx_line+52, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(747, Gx_line+47, 747, Gx_line+52, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123Lit14, "")), 24, Gx_line+22, 77, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124Lit15, "")), 120, Gx_line+22, 173, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 100, Gx_line+21, 104, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV125Lit16, "")), 249, Gx_line+30, 302, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV126Lit17, "")), 249, Gx_line+14, 302, Gx_line+30, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+52) ;
               AV96Lb_opcion = AV151Opcion1 ;
               AV108PrdNumi = "" ;
               /* Using cursor P07B07 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV96Lb_opcion});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A490ForPrdUMe = P07B07_A490ForPrdUMe[0] ;
                  A5555Lb_opcion = P07B07_A5555Lb_opcion[0] ;
                  A719PrdNum = P07B07_A719PrdNum[0] ;
                  A5558LB_CantC = P07B07_A5558LB_CantC[0] ;
                  A488ForPrdDsc = P07B07_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P07B07_n488ForPrdDsc[0] ;
                  A718PrdNom = P07B07_A718PrdNom[0] ;
                  A5557Lb_LineaC = P07B07_A5557Lb_LineaC[0] ;
                  A718PrdNom = P07B07_A718PrdNom[0] ;
                  A488ForPrdDsc = P07B07_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P07B07_n488ForPrdDsc[0] ;
                  if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), GXutil.substring( AV108PrdNumi, 1, 1)) != 0 ) && ! (GXutil.strcmp("", AV108PrdNumi)==0) )
                  {
                     h7B00( false, 26) ;
                     getPrinter().GxDrawLine(20, Gx_line+0, 20, Gx_line+27, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(304, Gx_line+0, 304, Gx_line+27, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(314, Gx_line+0, 314, Gx_line+27, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(450, Gx_line+0, 450, Gx_line+27, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(468, Gx_line+0, 468, Gx_line+27, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(556, Gx_line+0, 556, Gx_line+27, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(564, Gx_line+0, 564, Gx_line+27, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(652, Gx_line+0, 652, Gx_line+27, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(658, Gx_line+0, 658, Gx_line+27, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(747, Gx_line+0, 747, Gx_line+27, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(753, Gx_line+0, 753, Gx_line+27, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(20, Gx_line+25, 305, Gx_line+25, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(314, Gx_line+25, 452, Gx_line+25, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(468, Gx_line+25, 558, Gx_line+25, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(658, Gx_line+25, 748, Gx_line+25, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(564, Gx_line+25, 654, Gx_line+25, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+26) ;
                  }
                  AV147Lb_CntC = GXutil.str( A5558LB_CantC, 11, 5) ;
                  h7B00( false, 27) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 24, Gx_line+5, 69, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 111, Gx_line+5, 302, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147Lb_CntC, "")), 323, Gx_line+5, 404, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 411, Gx_line+6, 448, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(20, Gx_line+0, 20, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(304, Gx_line+0, 304, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(314, Gx_line+0, 314, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(450, Gx_line+0, 450, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(468, Gx_line+0, 468, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(556, Gx_line+0, 556, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(564, Gx_line+0, 564, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(652, Gx_line+0, 652, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(658, Gx_line+0, 658, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(747, Gx_line+0, 747, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(20, Gx_line+26, 305, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(314, Gx_line+26, 452, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(468, Gx_line+26, 558, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(658, Gx_line+26, 748, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(564, Gx_line+26, 654, Gx_line+26, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+27) ;
                  AV108PrdNumi = A719PrdNum ;
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               if ( AV145Control == 1 )
               {
                  h7B00( false, 27) ;
                  getPrinter().GxDrawLine(20, Gx_line+0, 20, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(304, Gx_line+0, 304, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(314, Gx_line+0, 314, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(450, Gx_line+0, 450, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(468, Gx_line+0, 468, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(556, Gx_line+0, 556, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(564, Gx_line+0, 564, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(652, Gx_line+0, 652, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(658, Gx_line+0, 658, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(747, Gx_line+0, 747, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(20, Gx_line+26, 305, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(314, Gx_line+26, 452, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(468, Gx_line+26, 558, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(658, Gx_line+26, 748, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(564, Gx_line+26, 654, Gx_line+26, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+27) ;
               }
               else
               {
                  h7B00( false, 20) ;
                  getPrinter().GxDrawLine(20, Gx_line+19, 305, Gx_line+19, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(316, Gx_line+19, 451, Gx_line+19, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(468, Gx_line+19, 558, Gx_line+19, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(658, Gx_line+19, 748, Gx_line+19, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(564, Gx_line+19, 654, Gx_line+19, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+20) ;
               }
               /* Using cursor P07B08 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV96Lb_opcion});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A490ForPrdUMe = P07B08_A490ForPrdUMe[0] ;
                  A5555Lb_opcion = P07B08_A5555Lb_opcion[0] ;
                  A5562Lb_orden = P07B08_A5562Lb_orden[0] ;
                  A5561LB_CantP = P07B08_A5561LB_CantP[0] ;
                  A488ForPrdDsc = P07B08_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P07B08_n488ForPrdDsc[0] ;
                  A718PrdNom = P07B08_A718PrdNom[0] ;
                  A719PrdNum = P07B08_A719PrdNum[0] ;
                  A5560Lb_LineaPr = P07B08_A5560Lb_LineaPr[0] ;
                  A718PrdNom = P07B08_A718PrdNom[0] ;
                  A488ForPrdDsc = P07B08_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P07B08_n488ForPrdDsc[0] ;
                  AV107Orden = "#" + GXutil.str( A5562Lb_orden, 2, 0) ;
                  AV148Lb_CntPC = GXutil.str( A5561LB_CantP, 11, 5) ;
                  h7B00( false, 27) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 24, Gx_line+5, 69, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 111, Gx_line+5, 302, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV148Lb_CntPC, "")), 320, Gx_line+5, 401, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 411, Gx_line+5, 448, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(20, Gx_line+0, 20, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(304, Gx_line+0, 304, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(314, Gx_line+0, 314, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(450, Gx_line+0, 450, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(468, Gx_line+0, 468, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(556, Gx_line+0, 556, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(564, Gx_line+0, 564, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(652, Gx_line+0, 652, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(658, Gx_line+0, 658, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107Orden, "")), 78, Gx_line+5, 101, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(20, Gx_line+26, 305, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(314, Gx_line+26, 452, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(468, Gx_line+26, 558, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(658, Gx_line+26, 748, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(564, Gx_line+26, 654, Gx_line+26, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(747, Gx_line+0, 747, Gx_line+27, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+27) ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               if ( AV170Cortinti == 1 )
               {
                  /* Using cursor P07B09 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
                  while ( (pr_default.getStatus(7) != 101) )
                  {
                     A5553Lb_ForCod = P07B09_A5553Lb_ForCod[0] ;
                     A5551Lb_lineaPq = P07B09_A5551Lb_lineaPq[0] ;
                     AV168LB_FORCOD = A5553Lb_ForCod ;
                     /* Execute user subroutine: 'LPROFO' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(7);
                        pr_default.close(1);
                        pr_default.close(1);
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
                     pr_default.readNext(7);
                  }
                  pr_default.close(7);
               }
               if ( AV150Num_ops > 0 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
                  /* Execute user subroutine: 'CARGO' */
                  S131 ();
                  if ( returnInSub )
                  {
                     pr_default.close(1);
                     pr_default.close(1);
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
               }
               AV95j = (short)(AV95j+1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7B00( true, 0) ;
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
      /* 'LPROFO' Routine */
      returnInSub = false ;
      /* Using cursor P07B010 */
      pr_default.execute(8, new Object[] {A396EmprCod, AV168LB_FORCOD});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A490ForPrdUMe = P07B010_A490ForPrdUMe[0] ;
         A764ProForCod = P07B010_A764ProForCod[0] ;
         A770ProForPrd = P07B010_A770ProForPrd[0] ;
         A762ProForCan = P07B010_A762ProForCan[0] ;
         A488ForPrdDsc = P07B010_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P07B010_n488ForPrdDsc[0] ;
         A765ProForDes = P07B010_A765ProForDes[0] ;
         A767ProForLin = P07B010_A767ProForLin[0] ;
         A488ForPrdDsc = P07B010_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P07B010_n488ForPrdDsc[0] ;
         if ( GXutil.len( A770ProForPrd) == 6 )
         {
            AV169Proforcan = A762ProForCan ;
            h7B00( false, 27) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A770ProForPrd, "")), 24, Gx_line+5, 69, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A765ProForDes, "")), 111, Gx_line+5, 302, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV169Proforcan, "ZZZZ9.9999")), 320, Gx_line+5, 401, Gx_line+22, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 411, Gx_line+5, 448, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(20, Gx_line+0, 20, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(304, Gx_line+0, 304, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(314, Gx_line+0, 314, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(450, Gx_line+0, 450, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(468, Gx_line+0, 468, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(556, Gx_line+0, 556, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(564, Gx_line+0, 564, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(652, Gx_line+0, 652, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(658, Gx_line+0, 658, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(747, Gx_line+0, 747, Gx_line+27, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(20, Gx_line+26, 305, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(314, Gx_line+26, 452, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(468, Gx_line+26, 558, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(658, Gx_line+26, 748, Gx_line+26, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(564, Gx_line+26, 654, Gx_line+26, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+27) ;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV138Compo = "" ;
      /* Using cursor P07B011 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV136CliCod), AV137Lb_artcod});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A65ArtCod = P07B011_A65ArtCod[0] ;
         A252CliCod = P07B011_A252CliCod[0] ;
         A105ArtTra1 = P07B011_A105ArtTra1[0] ;
         n105ArtTra1 = P07B011_n105ArtTra1[0] ;
         A108ArtTraP1 = P07B011_A108ArtTraP1[0] ;
         n108ArtTraP1 = P07B011_n108ArtTraP1[0] ;
         A106ArtTra2 = P07B011_A106ArtTra2[0] ;
         n106ArtTra2 = P07B011_n106ArtTra2[0] ;
         A109ArtTraP2 = P07B011_A109ArtTraP2[0] ;
         n109ArtTraP2 = P07B011_n109ArtTraP2[0] ;
         A107ArtTra3 = P07B011_A107ArtTra3[0] ;
         n107ArtTra3 = P07B011_n107ArtTra3[0] ;
         A110ArtTraP3 = P07B011_A110ArtTraP3[0] ;
         n110ArtTraP3 = P07B011_n110ArtTraP3[0] ;
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
      pr_default.close(9);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'CARGO' Routine */
      returnInSub = false ;
      /* Using cursor P07B012 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV165Lb_numero)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         AV87i = (short)(1) ;
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
         AV149Num_op = (short)(0) ;
         /* Using cursor P07B013 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A5556Lb_UltLC = P07B013_A5556Lb_UltLC[0] ;
            A5565Lb_CosteE = P07B013_A5565Lb_CosteE[0] ;
            A5555Lb_opcion = P07B013_A5555Lb_opcion[0] ;
            AV88Tab_op[AV87i-1] = A5555Lb_opcion ;
            AV106Tab_cos[AV87i-1] = A5565Lb_CosteE ;
            AV87i = (short)(AV87i+1) ;
            AV149Num_op = (short)(AV149Num_op+1) ;
            pr_default.readNext(11);
         }
         pr_default.close(11);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
      AV150Num_ops = (short)(GXutil.Int( AV149Num_op/ (double) (4))) ;
      if ( AV150Num_ops == 0 )
      {
         AV150Num_ops = (short)(1) ;
      }
      else
      {
         AV150Num_ops = (short)(AV150Num_ops+1) ;
      }
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'COLOR' Routine */
      returnInSub = false ;
      AV172ForNomCli3 = "" ;
      /* Using cursor P07B014 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(AV136CliCod), AV173ForSer, AV174ForColNom, Integer.valueOf(AV175ForColNum), Byte.valueOf(AV176TipColCod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A831TipColCod = P07B014_A831TipColCod[0] ;
         n831TipColCod = P07B014_n831TipColCod[0] ;
         A483ForColNum = P07B014_A483ForColNum[0] ;
         A482ForColNom = P07B014_A482ForColNom[0] ;
         A494ForSer = P07B014_A494ForSer[0] ;
         A252CliCod = P07B014_A252CliCod[0] ;
         A7029ForNomCli3 = P07B014_A7029ForNomCli3[0] ;
         n7029ForNomCli3 = P07B014_n7029ForNomCli3[0] ;
         AV172ForNomCli3 = A7029ForNomCli3 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void h7B00( boolean bFoot ,
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
               getPrinter().GxDrawRect(42, Gx_line+14, 184, Gx_line+49, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 114, Gx_line+23, 173, Gx_line+41, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 128, Gx_line+58, 173, Gx_line+76, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 179, Gx_line+58, 399, Gx_line+76, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), 136, Gx_line+108, 254, Gx_line+126, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5534Lb_ArtDsc, "")), 268, Gx_line+108, 459, Gx_line+126, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(42, Gx_line+53, 726, Gx_line+147, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5536Lb_ColNom, "")), 113, Gx_line+153, 209, Gx_line+171, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9")), 223, Gx_line+153, 268, Gx_line+171, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 281, Gx_line+153, 297, Gx_line+170, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A832TipColDsc, "")), 307, Gx_line+153, 527, Gx_line+170, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5538Lb_ColNomC, "")), 113, Gx_line+175, 209, Gx_line+193, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5539Lb_ColNumC), "ZZZZZ9")), 223, Gx_line+175, 268, Gx_line+193, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5540Lb_Cartaz, "")), 135, Gx_line+81, 282, Gx_line+99, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")), 134, Gx_line+197, 150, Gx_line+214, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A584IntDsc, "")), 155, Gx_line+197, 375, Gx_line+214, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(42, Gx_line+149, 726, Gx_line+259, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 474, Gx_line+197, 491, Gx_line+213, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5547Lb_Rb, "ZZZ9.99")), 499, Gx_line+197, 551, Gx_line+214, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(A5548Lb_Obs, 46, Gx_line+283, 564, Gx_line+346, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A5594Lb_cartazf, "99/99/99"), 295, Gx_line+81, 354, Gx_line+99, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5601Lb_Tempt), "ZZZ9")), 173, Gx_line+219, 203, Gx_line+236, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5610Lb_Temp2), "ZZZ9")), 208, Gx_line+219, 238, Gx_line+236, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5611Lb_Temp3), "ZZZ9")), 244, Gx_line+219, 274, Gx_line+236, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV109EmprNOm, "")), 286, Gx_line+5, 537, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112Lit3, "")), 422, Gx_line+32, 548, Gx_line+49, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 567, Gx_line+32, 626, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 635, Gx_line+32, 639, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 651, Gx_line+32, 710, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113Lit4, "")), 47, Gx_line+23, 111, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV114Lit5, "")), 49, Gx_line+58, 91, Gx_line+74, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV115Lit6, "")), 49, Gx_line+81, 116, Gx_line+97, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV116Lit7, "")), 49, Gx_line+108, 91, Gx_line+124, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV117Lit8, "")), 50, Gx_line+153, 102, Gx_line+169, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118Lit9, "")), 50, Gx_line+175, 94, Gx_line+191, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Lit10, "")), 50, Gx_line+197, 120, Gx_line+213, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Lit11, "")), 50, Gx_line+219, 122, Gx_line+235, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Lit12, "")), 46, Gx_line+265, 122, Gx_line+282, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV134Lit24, "")), 438, Gx_line+58, 542, Gx_line+74, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV135Texto_e, "")), 554, Gx_line+58, 701, Gx_line+75, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV172ForNomCli3, "")), 268, Gx_line+127, 488, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5097TipDisDsc, "")), 191, Gx_line+32, 411, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Fibras", ""), 438, Gx_line+219, 491, Gx_line+235, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5988Lb_nfibras), "Z9")), 514, Gx_line+219, 530, Gx_line+236, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 546, Gx_line+58, 550, Gx_line+74, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 119, Gx_line+108, 123, Gx_line+124, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 119, Gx_line+81, 123, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 119, Gx_line+56, 123, Gx_line+72, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 126, Gx_line+197, 130, Gx_line+213, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 106, Gx_line+175, 110, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 106, Gx_line+153, 110, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 126, Gx_line+219, 130, Gx_line+235, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 494, Gx_line+197, 498, Gx_line+213, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 493, Gx_line+219, 497, Gx_line+235, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 142, Gx_line+265, 146, Gx_line+281, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV150Num_ops), "ZZZ9")), 696, Gx_line+268, 726, Gx_line+285, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV167Lb_pantone, "")), 339, Gx_line+175, 559, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pantone:", ""), 280, Gx_line+175, 333, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV177Lit41, "")), 554, Gx_line+219, 618, Gx_line+236, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 621, Gx_line+219, 625, Gx_line+235, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5700Lb_Talao, "")), 631, Gx_line+219, 778, Gx_line+236, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Trat. Lab.:", ""), 52, Gx_line+240, 110, Gx_line+256, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3317DscSol, "")), 138, Gx_line+240, 358, Gx_line+257, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+350) ;
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
      this.aP0[0] = rens010c.this.A396EmprCod;
      this.aP1[0] = rens010c.this.A5532Lb_numero;
      this.aP2[0] = rens010c.this.Gx_out;
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
      GXt_char3 = "" ;
      AV142Lit26 = "" ;
      AV177Lit41 = "" ;
      AV143Lit27 = "" ;
      AV144Lit28 = "" ;
      scmdbuf = "" ;
      P07B02_A396EmprCod = new String[] {""} ;
      P07B02_A407EmprNom = new String[] {""} ;
      P07B02_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV109EmprNOm = "" ;
      GXv_int2 = new byte[1] ;
      AV138Compo = "" ;
      P07B03_A5548Lb_Obs = new String[] {""} ;
      P07B03_A3316CodSol = new short[1] ;
      P07B03_n3316CodSol = new boolean[] {false} ;
      P07B03_A5098TipDisCod = new String[] {""} ;
      P07B03_n5098TipDisCod = new boolean[] {false} ;
      P07B03_A396EmprCod = new String[] {""} ;
      P07B03_A5532Lb_numero = new int[1] ;
      P07B03_A7780Lb_Hila = new String[] {""} ;
      P07B03_A6546Lb_Pantone = new String[] {""} ;
      P07B03_A6653Lb_Tra1 = new String[] {""} ;
      P07B03_A6654Lb_TraP1 = new short[1] ;
      P07B03_A6655Lb_Tra2 = new String[] {""} ;
      P07B03_A6656Lb_TraP2 = new short[1] ;
      P07B03_A6657Lb_Tra3 = new String[] {""} ;
      P07B03_A6658Lb_TraP3 = new short[1] ;
      P07B03_A5595Lb_malha = new byte[1] ;
      P07B03_A5570Lb_Tipo = new String[] {""} ;
      P07B03_A1514MacProCod = new String[] {""} ;
      P07B03_n1514MacProCod = new boolean[] {false} ;
      P07B03_A3317DscSol = new String[] {""} ;
      P07B03_n3317DscSol = new boolean[] {false} ;
      P07B03_A5700Lb_Talao = new String[] {""} ;
      P07B03_A5988Lb_nfibras = new byte[1] ;
      P07B03_A5097TipDisDsc = new String[] {""} ;
      P07B03_n5097TipDisDsc = new boolean[] {false} ;
      P07B03_A5611Lb_Temp3 = new short[1] ;
      P07B03_A5610Lb_Temp2 = new short[1] ;
      P07B03_A5601Lb_Tempt = new short[1] ;
      P07B03_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P07B03_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07B03_A584IntDsc = new String[] {""} ;
      P07B03_n584IntDsc = new boolean[] {false} ;
      P07B03_A583IntCod = new byte[1] ;
      P07B03_n583IntCod = new boolean[] {false} ;
      P07B03_A5540Lb_Cartaz = new String[] {""} ;
      P07B03_A5539Lb_ColNumC = new int[1] ;
      P07B03_A5538Lb_ColNomC = new String[] {""} ;
      P07B03_A832TipColDsc = new String[] {""} ;
      P07B03_n832TipColDsc = new boolean[] {false} ;
      P07B03_A831TipColCod = new byte[1] ;
      P07B03_n831TipColCod = new boolean[] {false} ;
      P07B03_A5537Lb_ColNum = new int[1] ;
      P07B03_A5536Lb_ColNom = new String[] {""} ;
      P07B03_A5534Lb_ArtDsc = new String[] {""} ;
      P07B03_A5533Lb_ArtCod = new String[] {""} ;
      P07B03_A279CliNom = new String[] {""} ;
      P07B03_A252CliCod = new int[1] ;
      A5548Lb_Obs = "" ;
      A5098TipDisCod = "" ;
      A7780Lb_Hila = "" ;
      A6546Lb_Pantone = "" ;
      A6653Lb_Tra1 = "" ;
      A6655Lb_Tra2 = "" ;
      A6657Lb_Tra3 = "" ;
      A5570Lb_Tipo = "" ;
      A1514MacProCod = "" ;
      A3317DscSol = "" ;
      A5700Lb_Talao = "" ;
      A5097TipDisDsc = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A584IntDsc = "" ;
      A5540Lb_Cartaz = "" ;
      A5538Lb_ColNomC = "" ;
      A832TipColDsc = "" ;
      A5536Lb_ColNom = "" ;
      A5534Lb_ArtDsc = "" ;
      A5533Lb_ArtCod = "" ;
      A279CliNom = "" ;
      AV173ForSer = "" ;
      AV174ForColNom = "" ;
      AV172ForNomCli3 = "" ;
      AV167Lb_pantone = "" ;
      AV131Texto_m = "" ;
      AV135Texto_e = "" ;
      AV137Lb_artcod = "" ;
      AV171MacProCod = "" ;
      P07B04_A5532Lb_numero = new int[1] ;
      P07B04_A5551Lb_lineaPq = new short[1] ;
      P07B04_A396EmprCod = new String[] {""} ;
      P07B04_A5553Lb_ForCod = new String[] {""} ;
      A5553Lb_ForCod = "" ;
      A5554Lb_ForDsc = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_char6 = new String[1] ;
      AV89Tab_opc = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV89Tab_opc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV90Tab_prc = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV90Tab_prc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV101Tab_prn = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV101Tab_prn[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV91Tab_ctc = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV91Tab_ctc[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P07B05_A396EmprCod = new String[] {""} ;
      P07B05_A5532Lb_numero = new int[1] ;
      P07B05_A719PrdNum = new String[] {""} ;
      P07B05_A718PrdNom = new String[] {""} ;
      P07B05_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07B05_A5557Lb_LineaC = new short[1] ;
      P07B05_A5555Lb_opcion = new String[] {""} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      AV92Tab_opp = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV92Tab_opp[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV93Tab_prp = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV93Tab_prp[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV102Tab_prpn = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV102Tab_prpn[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV94Tab_ctp = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV94Tab_ctp[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P07B06_A396EmprCod = new String[] {""} ;
      P07B06_A5532Lb_numero = new int[1] ;
      P07B06_A719PrdNum = new String[] {""} ;
      P07B06_A718PrdNom = new String[] {""} ;
      P07B06_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07B06_A5560Lb_LineaPr = new short[1] ;
      P07B06_A5555Lb_opcion = new String[] {""} ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      AV151Opcion1 = "" ;
      AV88Tab_op = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV88Tab_op[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV152Cost_op1 = DecimalUtil.ZERO ;
      AV106Tab_cos = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV106Tab_cos[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV153Opcion2 = "" ;
      AV159Cost_op2 = DecimalUtil.ZERO ;
      AV154Opcion3 = "" ;
      AV160Cost_op3 = DecimalUtil.ZERO ;
      AV155Opcion4 = "" ;
      AV161Cost_op4 = DecimalUtil.ZERO ;
      AV96Lb_opcion = "" ;
      AV108PrdNumi = "" ;
      P07B07_A490ForPrdUMe = new byte[1] ;
      P07B07_A396EmprCod = new String[] {""} ;
      P07B07_A5532Lb_numero = new int[1] ;
      P07B07_A5555Lb_opcion = new String[] {""} ;
      P07B07_A719PrdNum = new String[] {""} ;
      P07B07_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07B07_A488ForPrdDsc = new String[] {""} ;
      P07B07_n488ForPrdDsc = new boolean[] {false} ;
      P07B07_A718PrdNom = new String[] {""} ;
      P07B07_A5557Lb_LineaC = new short[1] ;
      A488ForPrdDsc = "" ;
      AV147Lb_CntC = "" ;
      P07B08_A490ForPrdUMe = new byte[1] ;
      P07B08_A396EmprCod = new String[] {""} ;
      P07B08_A5532Lb_numero = new int[1] ;
      P07B08_A5555Lb_opcion = new String[] {""} ;
      P07B08_A5562Lb_orden = new short[1] ;
      P07B08_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07B08_A488ForPrdDsc = new String[] {""} ;
      P07B08_n488ForPrdDsc = new boolean[] {false} ;
      P07B08_A718PrdNom = new String[] {""} ;
      P07B08_A719PrdNum = new String[] {""} ;
      P07B08_A5560Lb_LineaPr = new short[1] ;
      AV107Orden = "" ;
      AV148Lb_CntPC = "" ;
      P07B09_A396EmprCod = new String[] {""} ;
      P07B09_A5532Lb_numero = new int[1] ;
      P07B09_A5553Lb_ForCod = new String[] {""} ;
      P07B09_A5551Lb_lineaPq = new short[1] ;
      AV168LB_FORCOD = "" ;
      P07B010_A490ForPrdUMe = new byte[1] ;
      P07B010_A396EmprCod = new String[] {""} ;
      P07B010_A764ProForCod = new String[] {""} ;
      P07B010_A770ProForPrd = new String[] {""} ;
      P07B010_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07B010_A488ForPrdDsc = new String[] {""} ;
      P07B010_n488ForPrdDsc = new boolean[] {false} ;
      P07B010_A765ProForDes = new String[] {""} ;
      P07B010_A767ProForLin = new short[1] ;
      A764ProForCod = "" ;
      A770ProForPrd = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A765ProForDes = "" ;
      AV169Proforcan = DecimalUtil.ZERO ;
      P07B011_A396EmprCod = new String[] {""} ;
      P07B011_A65ArtCod = new String[] {""} ;
      P07B011_A252CliCod = new int[1] ;
      P07B011_A105ArtTra1 = new String[] {""} ;
      P07B011_n105ArtTra1 = new boolean[] {false} ;
      P07B011_A108ArtTraP1 = new short[1] ;
      P07B011_n108ArtTraP1 = new boolean[] {false} ;
      P07B011_A106ArtTra2 = new String[] {""} ;
      P07B011_n106ArtTra2 = new boolean[] {false} ;
      P07B011_A109ArtTraP2 = new short[1] ;
      P07B011_n109ArtTraP2 = new boolean[] {false} ;
      P07B011_A107ArtTra3 = new String[] {""} ;
      P07B011_n107ArtTra3 = new boolean[] {false} ;
      P07B011_A110ArtTraP3 = new short[1] ;
      P07B011_n110ArtTraP3 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      P07B012_A396EmprCod = new String[] {""} ;
      P07B012_A5532Lb_numero = new int[1] ;
      P07B013_A396EmprCod = new String[] {""} ;
      P07B013_A5532Lb_numero = new int[1] ;
      P07B013_A5556Lb_UltLC = new short[1] ;
      P07B013_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07B013_A5555Lb_opcion = new String[] {""} ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      P07B014_A396EmprCod = new String[] {""} ;
      P07B014_A831TipColCod = new byte[1] ;
      P07B014_n831TipColCod = new boolean[] {false} ;
      P07B014_A483ForColNum = new int[1] ;
      P07B014_A482ForColNom = new String[] {""} ;
      P07B014_A494ForSer = new String[] {""} ;
      P07B014_A252CliCod = new int[1] ;
      P07B014_A7029ForNomCli3 = new String[] {""} ;
      P07B014_n7029ForNomCli3 = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A7029ForNomCli3 = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rens010c__default(),
         new Object[] {
             new Object[] {
            P07B02_A396EmprCod, P07B02_A407EmprNom, P07B02_n407EmprNom
            }
            , new Object[] {
            P07B03_A5548Lb_Obs, P07B03_A3316CodSol, P07B03_n3316CodSol, P07B03_A5098TipDisCod, P07B03_n5098TipDisCod, P07B03_A396EmprCod, P07B03_A5532Lb_numero, P07B03_A7780Lb_Hila, P07B03_A6546Lb_Pantone, P07B03_A6653Lb_Tra1,
            P07B03_A6654Lb_TraP1, P07B03_A6655Lb_Tra2, P07B03_A6656Lb_TraP2, P07B03_A6657Lb_Tra3, P07B03_A6658Lb_TraP3, P07B03_A5595Lb_malha, P07B03_A5570Lb_Tipo, P07B03_A1514MacProCod, P07B03_n1514MacProCod, P07B03_A3317DscSol,
            P07B03_n3317DscSol, P07B03_A5700Lb_Talao, P07B03_A5988Lb_nfibras, P07B03_A5097TipDisDsc, P07B03_n5097TipDisDsc, P07B03_A5611Lb_Temp3, P07B03_A5610Lb_Temp2, P07B03_A5601Lb_Tempt, P07B03_A5594Lb_cartazf, P07B03_A5547Lb_Rb,
            P07B03_A584IntDsc, P07B03_n584IntDsc, P07B03_A583IntCod, P07B03_n583IntCod, P07B03_A5540Lb_Cartaz, P07B03_A5539Lb_ColNumC, P07B03_A5538Lb_ColNomC, P07B03_A832TipColDsc, P07B03_n832TipColDsc, P07B03_A831TipColCod,
            P07B03_n831TipColCod, P07B03_A5537Lb_ColNum, P07B03_A5536Lb_ColNom, P07B03_A5534Lb_ArtDsc, P07B03_A5533Lb_ArtCod, P07B03_A279CliNom, P07B03_A252CliCod
            }
            , new Object[] {
            P07B04_A5532Lb_numero, P07B04_A5551Lb_lineaPq, P07B04_A396EmprCod, P07B04_A5553Lb_ForCod
            }
            , new Object[] {
            P07B05_A396EmprCod, P07B05_A5532Lb_numero, P07B05_A719PrdNum, P07B05_A718PrdNom, P07B05_A5558LB_CantC, P07B05_A5557Lb_LineaC, P07B05_A5555Lb_opcion
            }
            , new Object[] {
            P07B06_A396EmprCod, P07B06_A5532Lb_numero, P07B06_A719PrdNum, P07B06_A718PrdNom, P07B06_A5561LB_CantP, P07B06_A5560Lb_LineaPr, P07B06_A5555Lb_opcion
            }
            , new Object[] {
            P07B07_A490ForPrdUMe, P07B07_A396EmprCod, P07B07_A5532Lb_numero, P07B07_A5555Lb_opcion, P07B07_A719PrdNum, P07B07_A5558LB_CantC, P07B07_A488ForPrdDsc, P07B07_n488ForPrdDsc, P07B07_A718PrdNom, P07B07_A5557Lb_LineaC
            }
            , new Object[] {
            P07B08_A490ForPrdUMe, P07B08_A396EmprCod, P07B08_A5532Lb_numero, P07B08_A5555Lb_opcion, P07B08_A5562Lb_orden, P07B08_A5561LB_CantP, P07B08_A488ForPrdDsc, P07B08_n488ForPrdDsc, P07B08_A718PrdNom, P07B08_A719PrdNum,
            P07B08_A5560Lb_LineaPr
            }
            , new Object[] {
            P07B09_A396EmprCod, P07B09_A5532Lb_numero, P07B09_A5553Lb_ForCod, P07B09_A5551Lb_lineaPq
            }
            , new Object[] {
            P07B010_A490ForPrdUMe, P07B010_A396EmprCod, P07B010_A764ProForCod, P07B010_A770ProForPrd, P07B010_A762ProForCan, P07B010_A488ForPrdDsc, P07B010_n488ForPrdDsc, P07B010_A765ProForDes, P07B010_A767ProForLin
            }
            , new Object[] {
            P07B011_A396EmprCod, P07B011_A65ArtCod, P07B011_A252CliCod, P07B011_A105ArtTra1, P07B011_n105ArtTra1, P07B011_A108ArtTraP1, P07B011_n108ArtTraP1, P07B011_A106ArtTra2, P07B011_n106ArtTra2, P07B011_A109ArtTraP2,
            P07B011_n109ArtTraP2, P07B011_A107ArtTra3, P07B011_n107ArtTra3, P07B011_A110ArtTraP3, P07B011_n110ArtTraP3
            }
            , new Object[] {
            P07B012_A396EmprCod, P07B012_A5532Lb_numero
            }
            , new Object[] {
            P07B013_A396EmprCod, P07B013_A5532Lb_numero, P07B013_A5556Lb_UltLC, P07B013_A5565Lb_CosteE, P07B013_A5555Lb_opcion
            }
            , new Object[] {
            P07B014_A396EmprCod, P07B014_A831TipColCod, P07B014_A483ForColNum, P07B014_A482ForColNom, P07B014_A494ForSer, P07B014_A252CliCod, P07B014_A7029ForNomCli3, P07B014_n7029ForNomCli3
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

   private byte AV141Hilo ;
   private byte AV166Hidro ;
   private byte AV170Cortinti ;
   private byte GXv_int2[] ;
   private byte A5595Lb_malha ;
   private byte A5988Lb_nfibras ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte AV176TipColCod ;
   private byte A490ForPrdUMe ;
   private byte AV145Control ;
   private short AV98t ;
   private short AV95j ;
   private short A3316CodSol ;
   private short A6654Lb_TraP1 ;
   private short A6656Lb_TraP2 ;
   private short A6658Lb_TraP3 ;
   private short A5611Lb_Temp3 ;
   private short A5610Lb_Temp2 ;
   private short A5601Lb_Tempt ;
   private short AV87i ;
   private short A5551Lb_lineaPq ;
   private short A5557Lb_LineaC ;
   private short A5560Lb_LineaPr ;
   private short AV150Num_ops ;
   private short A5562Lb_orden ;
   private short A767ProForLin ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short AV149Num_op ;
   private short A5556Lb_UltLC ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV165Lb_numero ;
   private int A5539Lb_ColNumC ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private int AV136CliCod ;
   private int AV175ForColNum ;
   private int Gx_OldLine ;
   private int GX_I ;
   private int A483ForColNum ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV91Tab_ctc[] ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal AV94Tab_ctp[] ;
   private java.math.BigDecimal A5561LB_CantP ;
   private java.math.BigDecimal AV152Cost_op1 ;
   private java.math.BigDecimal AV106Tab_cos[] ;
   private java.math.BigDecimal AV159Cost_op2 ;
   private java.math.BigDecimal AV160Cost_op3 ;
   private java.math.BigDecimal AV161Cost_op4 ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal AV169Proforcan ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private String A396EmprCod ;
   private String Gx_out ;
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
   private String GXt_char3 ;
   private String AV142Lit26 ;
   private String AV177Lit41 ;
   private String AV143Lit27 ;
   private String AV144Lit28 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV109EmprNOm ;
   private String AV138Compo ;
   private String A5098TipDisCod ;
   private String A7780Lb_Hila ;
   private String A6546Lb_Pantone ;
   private String A6653Lb_Tra1 ;
   private String A6655Lb_Tra2 ;
   private String A6657Lb_Tra3 ;
   private String A5570Lb_Tipo ;
   private String A1514MacProCod ;
   private String A3317DscSol ;
   private String A5700Lb_Talao ;
   private String A5097TipDisDsc ;
   private String A584IntDsc ;
   private String A5540Lb_Cartaz ;
   private String A5538Lb_ColNomC ;
   private String A832TipColDsc ;
   private String A5536Lb_ColNom ;
   private String A5534Lb_ArtDsc ;
   private String A5533Lb_ArtCod ;
   private String A279CliNom ;
   private String AV173ForSer ;
   private String AV174ForColNom ;
   private String AV172ForNomCli3 ;
   private String AV167Lb_pantone ;
   private String AV131Texto_m ;
   private String AV135Texto_e ;
   private String AV137Lb_artcod ;
   private String AV171MacProCod ;
   private String A5553Lb_ForCod ;
   private String A5554Lb_ForDsc ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private String GXv_char1[] ;
   private String GXv_char6[] ;
   private String AV89Tab_opc[] ;
   private String AV90Tab_prc[] ;
   private String AV101Tab_prn[] ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A5555Lb_opcion ;
   private String AV92Tab_opp[] ;
   private String AV93Tab_prp[] ;
   private String AV102Tab_prpn[] ;
   private String AV151Opcion1 ;
   private String AV88Tab_op[] ;
   private String AV153Opcion2 ;
   private String AV154Opcion3 ;
   private String AV155Opcion4 ;
   private String AV96Lb_opcion ;
   private String AV108PrdNumi ;
   private String A488ForPrdDsc ;
   private String AV147Lb_CntC ;
   private String AV107Orden ;
   private String AV148Lb_CntPC ;
   private String AV168LB_FORCOD ;
   private String A764ProForCod ;
   private String A770ProForPrd ;
   private String A765ProForDes ;
   private String A65ArtCod ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A7029ForNomCli3 ;
   private String Gx_time ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean GxHdr3 ;
   private boolean n3316CodSol ;
   private boolean n5098TipDisCod ;
   private boolean n1514MacProCod ;
   private boolean n3317DscSol ;
   private boolean n5097TipDisDsc ;
   private boolean n584IntDsc ;
   private boolean n583IntCod ;
   private boolean n832TipColDsc ;
   private boolean n831TipColCod ;
   private boolean n488ForPrdDsc ;
   private boolean n105ArtTra1 ;
   private boolean n108ArtTraP1 ;
   private boolean n106ArtTra2 ;
   private boolean n109ArtTraP2 ;
   private boolean n107ArtTra3 ;
   private boolean n110ArtTraP3 ;
   private boolean n7029ForNomCli3 ;
   private String A5548Lb_Obs ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P07B02_A396EmprCod ;
   private String[] P07B02_A407EmprNom ;
   private boolean[] P07B02_n407EmprNom ;
   private String[] P07B03_A5548Lb_Obs ;
   private short[] P07B03_A3316CodSol ;
   private boolean[] P07B03_n3316CodSol ;
   private String[] P07B03_A5098TipDisCod ;
   private boolean[] P07B03_n5098TipDisCod ;
   private String[] P07B03_A396EmprCod ;
   private int[] P07B03_A5532Lb_numero ;
   private String[] P07B03_A7780Lb_Hila ;
   private String[] P07B03_A6546Lb_Pantone ;
   private String[] P07B03_A6653Lb_Tra1 ;
   private short[] P07B03_A6654Lb_TraP1 ;
   private String[] P07B03_A6655Lb_Tra2 ;
   private short[] P07B03_A6656Lb_TraP2 ;
   private String[] P07B03_A6657Lb_Tra3 ;
   private short[] P07B03_A6658Lb_TraP3 ;
   private byte[] P07B03_A5595Lb_malha ;
   private String[] P07B03_A5570Lb_Tipo ;
   private String[] P07B03_A1514MacProCod ;
   private boolean[] P07B03_n1514MacProCod ;
   private String[] P07B03_A3317DscSol ;
   private boolean[] P07B03_n3317DscSol ;
   private String[] P07B03_A5700Lb_Talao ;
   private byte[] P07B03_A5988Lb_nfibras ;
   private String[] P07B03_A5097TipDisDsc ;
   private boolean[] P07B03_n5097TipDisDsc ;
   private short[] P07B03_A5611Lb_Temp3 ;
   private short[] P07B03_A5610Lb_Temp2 ;
   private short[] P07B03_A5601Lb_Tempt ;
   private java.util.Date[] P07B03_A5594Lb_cartazf ;
   private java.math.BigDecimal[] P07B03_A5547Lb_Rb ;
   private String[] P07B03_A584IntDsc ;
   private boolean[] P07B03_n584IntDsc ;
   private byte[] P07B03_A583IntCod ;
   private boolean[] P07B03_n583IntCod ;
   private String[] P07B03_A5540Lb_Cartaz ;
   private int[] P07B03_A5539Lb_ColNumC ;
   private String[] P07B03_A5538Lb_ColNomC ;
   private String[] P07B03_A832TipColDsc ;
   private boolean[] P07B03_n832TipColDsc ;
   private byte[] P07B03_A831TipColCod ;
   private boolean[] P07B03_n831TipColCod ;
   private int[] P07B03_A5537Lb_ColNum ;
   private String[] P07B03_A5536Lb_ColNom ;
   private String[] P07B03_A5534Lb_ArtDsc ;
   private String[] P07B03_A5533Lb_ArtCod ;
   private String[] P07B03_A279CliNom ;
   private int[] P07B03_A252CliCod ;
   private int[] P07B04_A5532Lb_numero ;
   private short[] P07B04_A5551Lb_lineaPq ;
   private String[] P07B04_A396EmprCod ;
   private String[] P07B04_A5553Lb_ForCod ;
   private String[] P07B05_A396EmprCod ;
   private int[] P07B05_A5532Lb_numero ;
   private String[] P07B05_A719PrdNum ;
   private String[] P07B05_A718PrdNom ;
   private java.math.BigDecimal[] P07B05_A5558LB_CantC ;
   private short[] P07B05_A5557Lb_LineaC ;
   private String[] P07B05_A5555Lb_opcion ;
   private String[] P07B06_A396EmprCod ;
   private int[] P07B06_A5532Lb_numero ;
   private String[] P07B06_A719PrdNum ;
   private String[] P07B06_A718PrdNom ;
   private java.math.BigDecimal[] P07B06_A5561LB_CantP ;
   private short[] P07B06_A5560Lb_LineaPr ;
   private String[] P07B06_A5555Lb_opcion ;
   private byte[] P07B07_A490ForPrdUMe ;
   private String[] P07B07_A396EmprCod ;
   private int[] P07B07_A5532Lb_numero ;
   private String[] P07B07_A5555Lb_opcion ;
   private String[] P07B07_A719PrdNum ;
   private java.math.BigDecimal[] P07B07_A5558LB_CantC ;
   private String[] P07B07_A488ForPrdDsc ;
   private boolean[] P07B07_n488ForPrdDsc ;
   private String[] P07B07_A718PrdNom ;
   private short[] P07B07_A5557Lb_LineaC ;
   private byte[] P07B08_A490ForPrdUMe ;
   private String[] P07B08_A396EmprCod ;
   private int[] P07B08_A5532Lb_numero ;
   private String[] P07B08_A5555Lb_opcion ;
   private short[] P07B08_A5562Lb_orden ;
   private java.math.BigDecimal[] P07B08_A5561LB_CantP ;
   private String[] P07B08_A488ForPrdDsc ;
   private boolean[] P07B08_n488ForPrdDsc ;
   private String[] P07B08_A718PrdNom ;
   private String[] P07B08_A719PrdNum ;
   private short[] P07B08_A5560Lb_LineaPr ;
   private String[] P07B09_A396EmprCod ;
   private int[] P07B09_A5532Lb_numero ;
   private String[] P07B09_A5553Lb_ForCod ;
   private short[] P07B09_A5551Lb_lineaPq ;
   private byte[] P07B010_A490ForPrdUMe ;
   private String[] P07B010_A396EmprCod ;
   private String[] P07B010_A764ProForCod ;
   private String[] P07B010_A770ProForPrd ;
   private java.math.BigDecimal[] P07B010_A762ProForCan ;
   private String[] P07B010_A488ForPrdDsc ;
   private boolean[] P07B010_n488ForPrdDsc ;
   private String[] P07B010_A765ProForDes ;
   private short[] P07B010_A767ProForLin ;
   private String[] P07B011_A396EmprCod ;
   private String[] P07B011_A65ArtCod ;
   private int[] P07B011_A252CliCod ;
   private String[] P07B011_A105ArtTra1 ;
   private boolean[] P07B011_n105ArtTra1 ;
   private short[] P07B011_A108ArtTraP1 ;
   private boolean[] P07B011_n108ArtTraP1 ;
   private String[] P07B011_A106ArtTra2 ;
   private boolean[] P07B011_n106ArtTra2 ;
   private short[] P07B011_A109ArtTraP2 ;
   private boolean[] P07B011_n109ArtTraP2 ;
   private String[] P07B011_A107ArtTra3 ;
   private boolean[] P07B011_n107ArtTra3 ;
   private short[] P07B011_A110ArtTraP3 ;
   private boolean[] P07B011_n110ArtTraP3 ;
   private String[] P07B012_A396EmprCod ;
   private int[] P07B012_A5532Lb_numero ;
   private String[] P07B013_A396EmprCod ;
   private int[] P07B013_A5532Lb_numero ;
   private short[] P07B013_A5556Lb_UltLC ;
   private java.math.BigDecimal[] P07B013_A5565Lb_CosteE ;
   private String[] P07B013_A5555Lb_opcion ;
   private String[] P07B014_A396EmprCod ;
   private byte[] P07B014_A831TipColCod ;
   private boolean[] P07B014_n831TipColCod ;
   private int[] P07B014_A483ForColNum ;
   private String[] P07B014_A482ForColNom ;
   private String[] P07B014_A494ForSer ;
   private int[] P07B014_A252CliCod ;
   private String[] P07B014_A7029ForNomCli3 ;
   private boolean[] P07B014_n7029ForNomCli3 ;
}

final  class rens010c__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07B02", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07B03", "SELECT T1.Lb_Obs, T1.CodSol, T1.TipDisCod, T1.EmprCod, T1.Lb_numero, T1.Lb_Hila, T1.Lb_Pantone, T1.Lb_Tra1, T1.Lb_TraP1, T1.Lb_Tra2, T1.Lb_TraP2, T1.Lb_Tra3, T1.Lb_TraP3, T1.Lb_malha, T1.Lb_Tipo, T1.MacProCod, T5.DscSol, T1.Lb_Talao, T1.Lb_nfibras, T6.TipDisDsc, T1.Lb_Temp3, T1.Lb_Temp2, T1.Lb_Tempt, T1.Lb_cartazf, T1.Lb_Rb, T3.IntDsc, T1.IntCod, T1.Lb_Cartaz, T1.Lb_ColNumC, T1.Lb_ColNomC, T4.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod FROM (((((TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPSOLIDE T5 ON T5.EmprCod = T1.EmprCod AND T5.CodSol = T1.CodSol) LEFT JOIN TXPTIPDIS T6 ON T6.EmprCod = T1.EmprCod AND T6.TipDisCod = T1.TipDisCod) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07B04", "SELECT Lb_numero, Lb_lineaPq, EmprCod, Lb_ForCod FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07B05", "SELECT T1.EmprCod, T1.Lb_numero, T1.PrdNum, T2.PrdNom, T1.LB_CantC, T1.Lb_LineaC, T1.Lb_opcion FROM (TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07B06", "SELECT T1.EmprCod, T1.Lb_numero, T1.PrdNum, T2.PrdNom, T1.LB_CantP, T1.Lb_LineaPr, T1.Lb_opcion FROM (TXPENS004 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07B07", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.PrdNum, T1.LB_CantC, T3.ForPrdDsc, T2.PrdNom, T1.Lb_LineaC FROM ((TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07B08", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_orden, T1.LB_CantP, T3.ForPrdDsc, T2.PrdNom, T1.PrdNum, T1.Lb_LineaPr FROM ((TXPENS004 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07B09", "SELECT EmprCod, Lb_numero, Lb_ForCod, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07B010", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ProForCod, T1.ProForPrd, T1.ProForCan, T2.ForPrdDsc, T1.ProForDes, T1.ProForLin FROM (TXPLPROFO T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ProForCod = ? ORDER BY T1.EmprCod, T1.ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07B011", "SELECT EmprCod, ArtCod, CliCod, ArtTra1, ArtTraP1, ArtTra2, ArtTraP2, ArtTra3, ArtTraP3 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07B012", "SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07B013", "SELECT EmprCod, Lb_numero, Lb_UltLC, Lb_CosteE, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07B014", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNomCli3 FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((String[]) buf[8])[0] = rslt.getString(7, 100);
               ((String[]) buf[9])[0] = rslt.getString(8, 4);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 4);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 4);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               ((String[]) buf[17])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(18, 20);
               ((byte[]) buf[22])[0] = rslt.getByte(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(21);
               ((short[]) buf[26])[0] = rslt.getShort(22);
               ((short[]) buf[27])[0] = rslt.getShort(23);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(24);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(25,2);
               ((String[]) buf[30])[0] = rslt.getString(26, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((byte[]) buf[32])[0] = rslt.getByte(27);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(28, 20);
               ((int[]) buf[35])[0] = rslt.getInt(29);
               ((String[]) buf[36])[0] = rslt.getString(30, 13);
               ((String[]) buf[37])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(32);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(33);
               ((String[]) buf[42])[0] = rslt.getString(34, 13);
               ((String[]) buf[43])[0] = rslt.getString(35, 26);
               ((String[]) buf[44])[0] = rslt.getString(36, 16);
               ((String[]) buf[45])[0] = rslt.getString(37, 30);
               ((int[]) buf[46])[0] = rslt.getInt(38);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 8 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 9 :
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
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
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

