package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pprc121 extends GXReport
{
   public pprc121( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc121.class ), "" );
   }

   public pprc121( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pprc121.this.aP1 = new int[] {0};
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
      pprc121.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc121.this.A5532Lb_numero = aP1[0];
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Informe Gesinlab Opciones") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV61Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV61Lit1 = GXt_char1 ;
         GXt_char1 = AV62Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV62Lit2 = GXt_char1 ;
         AV30Lit3 = GXutil.trim( AV61Lit1) + "-" + GXutil.trim( AV62Lit2) ;
         GXt_char1 = AV31Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT305_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit4 = GXt_char1 ;
         GXt_char1 = AV32Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit5 = GXt_char1 ;
         GXt_char1 = AV33Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL120_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit6 = GXt_char1 ;
         if ( GXutil.strcmp(AV33Lit6, httpContext.getMessage( "WCFL120_", "")) == 0 )
         {
            GXt_char1 = AV33Lit6 ;
            GXv_char2[0] = GXt_char1 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char2) ;
            pprc121.this.GXt_char1 = GXv_char2[0] ;
            AV33Lit6 = GXt_char1 ;
         }
         GXt_char1 = AV34Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit7 = GXt_char1 ;
         GXt_char1 = AV35Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit8 = GXt_char1 ;
         GXt_char1 = AV36Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit9 = GXt_char1 ;
         GXt_char1 = AV37Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1194_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit10 = GXt_char1 ;
         GXt_char1 = AV38Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN236", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit11 = GXt_char1 ;
         GXt_char1 = AV39Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1164_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit12 = GXt_char1 ;
         GXt_char1 = AV56Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit13 = GXt_char1 ;
         GXt_char1 = AV57Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1145_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV57Lit14 = GXt_char1 ;
         GXt_char1 = AV58Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1160_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit15 = GXt_char1 ;
         GXt_char1 = AV59Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN176", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV59Lit16 = GXt_char1 ;
         GXt_char1 = AV60Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN079_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV60Lit17 = GXt_char1 ;
         GXt_char1 = AV40Lit18 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1134_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit18 = GXt_char1 ;
         GXt_char1 = AV41Lit19 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN237", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit19 = GXutil.trim( GXt_char1) ;
         GXt_char1 = AV42Lit20 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN037", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit20 = GXutil.trim( GXt_char1) ;
         AV42Lit20 = GXutil.substring( AV42Lit20, 1, 8) ;
         GXt_char1 = AV43Lit21 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN238", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit21 = GXutil.trim( GXt_char1) ;
         GXt_char1 = AV45Lit22 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit22 = GXt_char1 ;
         GXt_char1 = AV46Lit23 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1217_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit23 = GXt_char1 ;
         GXt_char1 = AV47Lit24 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN208", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit24 = GXt_char1 ;
         GXt_char1 = AV50Lit25 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1376_", ""), (byte)(99), GXv_char2) ;
         pprc121.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV50Lit25 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char4) ;
         pprc121.this.GXt_char3 = GXv_char4[0] ;
         AV50Lit25 = GXt_char1 + " " + GXt_char3 ;
         AV51Lit26 = httpContext.getMessage( "Nº IDM", "") ;
         GXt_char3 = AV52Lit27 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char4) ;
         pprc121.this.GXt_char3 = GXv_char4[0] ;
         AV52Lit27 = GXutil.trim( GXt_char3) + " " + httpContext.getMessage( "Ent.", "") ;
         GXt_char3 = AV53Lit28 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char4) ;
         pprc121.this.GXt_char3 = GXv_char4[0] ;
         AV53Lit28 = GXutil.trim( GXt_char3) + " " + httpContext.getMessage( "Mod.", "") ;
         GXt_int5 = AV85Carvitin ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
         pprc121.this.GXt_int5 = GXv_int6[0] ;
         AV85Carvitin = GXt_int5 ;
         /* Using cursor P05LI2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P05LI2_A407EmprNom[0] ;
            n407EmprNom = P05LI2_n407EmprNom[0] ;
            AV29EmprNOm = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV13Nopciones = (short)(0) ;
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV14Tab_opciones[GX_I-1] = " " ;
            GX_I = (int)(GX_I+1) ;
         }
         AV9i = (short)(1) ;
         /* Using cursor P05LI3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5718Lb_numop = P05LI3_A5718Lb_numop[0] ;
            A5555Lb_opcion = P05LI3_A5555Lb_opcion[0] ;
            AV13Nopciones = (short)(AV13Nopciones+1) ;
            AV14Tab_opciones[AV9i-1] = ((AV85Carvitin==0) ? A5555Lb_opcion : GXutil.str( A5718Lb_numop, 2, 0)) ;
            AV9i = (short)(AV9i+1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV63Op1 = AV14Tab_opciones[1-1] ;
         AV64Op2 = AV14Tab_opciones[2-1] ;
         AV65Op3 = AV14Tab_opciones[3-1] ;
         AV66Op4 = AV14Tab_opciones[4-1] ;
         AV67Op5 = AV14Tab_opciones[5-1] ;
         AV68Op6 = AV14Tab_opciones[6-1] ;
         AV69Op7 = AV14Tab_opciones[7-1] ;
         AV70Op8 = AV14Tab_opciones[8-1] ;
         AV71Op9 = AV14Tab_opciones[9-1] ;
         GxHdr4 = true ;
         /* Using cursor P05LI4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A5548Lb_Obs = P05LI4_A5548Lb_Obs[0] ;
            A5098TipDisCod = P05LI4_A5098TipDisCod[0] ;
            n5098TipDisCod = P05LI4_n5098TipDisCod[0] ;
            A6546Lb_Pantone = P05LI4_A6546Lb_Pantone[0] ;
            A5595Lb_malha = P05LI4_A5595Lb_malha[0] ;
            A5570Lb_Tipo = P05LI4_A5570Lb_Tipo[0] ;
            A6653Lb_Tra1 = P05LI4_A6653Lb_Tra1[0] ;
            A6654Lb_TraP1 = P05LI4_A6654Lb_TraP1[0] ;
            A6655Lb_Tra2 = P05LI4_A6655Lb_Tra2[0] ;
            A6656Lb_TraP2 = P05LI4_A6656Lb_TraP2[0] ;
            A6657Lb_Tra3 = P05LI4_A6657Lb_Tra3[0] ;
            A6658Lb_TraP3 = P05LI4_A6658Lb_TraP3[0] ;
            A5988Lb_nfibras = P05LI4_A5988Lb_nfibras[0] ;
            A5097TipDisDsc = P05LI4_A5097TipDisDsc[0] ;
            n5097TipDisDsc = P05LI4_n5097TipDisDsc[0] ;
            A5611Lb_Temp3 = P05LI4_A5611Lb_Temp3[0] ;
            A5610Lb_Temp2 = P05LI4_A5610Lb_Temp2[0] ;
            A5601Lb_Tempt = P05LI4_A5601Lb_Tempt[0] ;
            A5594Lb_cartazf = P05LI4_A5594Lb_cartazf[0] ;
            A5545Lb_HoraM = P05LI4_A5545Lb_HoraM[0] ;
            A5542Lb_HoraE = P05LI4_A5542Lb_HoraE[0] ;
            A5546Lb_UsuM = P05LI4_A5546Lb_UsuM[0] ;
            A5544Lb_FechaM = P05LI4_A5544Lb_FechaM[0] ;
            A5543Lb_Usuario = P05LI4_A5543Lb_Usuario[0] ;
            A5541Lb_FechaE = P05LI4_A5541Lb_FechaE[0] ;
            A5547Lb_Rb = P05LI4_A5547Lb_Rb[0] ;
            A584IntDsc = P05LI4_A584IntDsc[0] ;
            n584IntDsc = P05LI4_n584IntDsc[0] ;
            A583IntCod = P05LI4_A583IntCod[0] ;
            n583IntCod = P05LI4_n583IntCod[0] ;
            A5540Lb_Cartaz = P05LI4_A5540Lb_Cartaz[0] ;
            A5539Lb_ColNumC = P05LI4_A5539Lb_ColNumC[0] ;
            A5538Lb_ColNomC = P05LI4_A5538Lb_ColNomC[0] ;
            A832TipColDsc = P05LI4_A832TipColDsc[0] ;
            n832TipColDsc = P05LI4_n832TipColDsc[0] ;
            A831TipColCod = P05LI4_A831TipColCod[0] ;
            n831TipColCod = P05LI4_n831TipColCod[0] ;
            A5537Lb_ColNum = P05LI4_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = P05LI4_A5536Lb_ColNom[0] ;
            A5552Lb_TipArtD = P05LI4_A5552Lb_TipArtD[0] ;
            A5534Lb_ArtDsc = P05LI4_A5534Lb_ArtDsc[0] ;
            A5533Lb_ArtCod = P05LI4_A5533Lb_ArtCod[0] ;
            A279CliNom = P05LI4_A279CliNom[0] ;
            A252CliCod = P05LI4_A252CliCod[0] ;
            A279CliNom = P05LI4_A279CliNom[0] ;
            A584IntDsc = P05LI4_A584IntDsc[0] ;
            n584IntDsc = P05LI4_n584IntDsc[0] ;
            A832TipColDsc = P05LI4_A832TipColDsc[0] ;
            n832TipColDsc = P05LI4_n832TipColDsc[0] ;
            A5097TipDisDsc = P05LI4_A5097TipDisDsc[0] ;
            n5097TipDisDsc = P05LI4_n5097TipDisDsc[0] ;
            AV55Lb_pantone = GXutil.substring( A6546Lb_Pantone, 1, 30) ;
            if ( A5595Lb_malha == 1 )
            {
               AV44Texto_m = httpContext.getMessage( "Cliente", "") ;
            }
            else if ( A5595Lb_malha == 2 )
            {
               AV44Texto_m = httpContext.getMessage( "Produçao", "") ;
            }
            else if ( A5595Lb_malha == 3 )
            {
               AV44Texto_m = httpContext.getMessage( "Provisoria", "") ;
            }
            else if ( A5595Lb_malha == 4 )
            {
               AV44Texto_m = httpContext.getMessage( "Aguarda", "") ;
            }
            else
            {
               AV44Texto_m = "" ;
            }
            if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "C", "")) == 0 )
            {
               AV48Texto_e = httpContext.getMessage( "Cliente", "") ;
            }
            else if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "P", "")) == 0 )
            {
               AV48Texto_e = httpContext.getMessage( "Produçao", "") ;
            }
            else
            {
               AV48Texto_e = "" ;
            }
            AV83CliCod = A252CliCod ;
            AV84Lb_artcod = A5533Lb_ArtCod ;
            /* Execute user subroutine: 'ARTICU' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( ! (GXutil.strcmp("", A6653Lb_Tra1)==0) )
            {
               AV49Compo = GXutil.trim( A6653Lb_Tra1) + " " + GXutil.trim( GXutil.str( A6654Lb_TraP1, 3, 0)) + "% " ;
               if ( ! (GXutil.strcmp("", A6655Lb_Tra2)==0) )
               {
                  AV49Compo += GXutil.trim( A6655Lb_Tra2) + " " + GXutil.trim( GXutil.str( A6656Lb_TraP2, 3, 0)) + "% " ;
               }
               if ( ! (GXutil.strcmp("", A6657Lb_Tra3)==0) )
               {
                  AV49Compo += GXutil.trim( A6657Lb_Tra3) + " " + GXutil.trim( GXutil.str( A6658Lb_TraP3, 3, 0)) + "% " ;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         GxHdr4 = false ;
         AV9i = (short)(1) ;
         AV10t = (short)(1) ;
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV8tab_productos[GX_I-1] = "" ;
            GX_I = (int)(GX_I+1) ;
         }
         /* Using cursor P05LI5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A719PrdNum = P05LI5_A719PrdNum[0] ;
            A5557Lb_LineaC = P05LI5_A5557Lb_LineaC[0] ;
            A5555Lb_opcion = P05LI5_A5555Lb_opcion[0] ;
            AV11Prdnum = A719PrdNum ;
            /* Execute user subroutine: 'TABLA1' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P05LI6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A719PrdNum = P05LI6_A719PrdNum[0] ;
            A5560Lb_LineaPr = P05LI6_A5560Lb_LineaPr[0] ;
            A5555Lb_opcion = P05LI6_A5555Lb_opcion[0] ;
            AV11Prdnum = A719PrdNum ;
            /* Execute user subroutine: 'TABLA1' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
         AV9i = (short)(1) ;
         while ( AV9i <= 100 )
         {
            if ( GXutil.strcmp(AV8tab_productos[AV9i-1], " ") == 0 )
            {
               if (true) break;
            }
            AV11Prdnum = AV8tab_productos[AV9i-1] ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV26Tab_cant[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV72Tab_und[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV10t = (short)(1) ;
            AV27ens003 = (byte)(0) ;
            /* Using cursor P05LI7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV11Prdnum});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A490ForPrdUMe = P05LI7_A490ForPrdUMe[0] ;
               A719PrdNum = P05LI7_A719PrdNum[0] ;
               A5558LB_CantC = P05LI7_A5558LB_CantC[0] ;
               A5718Lb_numop = P05LI7_A5718Lb_numop[0] ;
               A488ForPrdDsc = P05LI7_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P05LI7_n488ForPrdDsc[0] ;
               A5557Lb_LineaC = P05LI7_A5557Lb_LineaC[0] ;
               A5555Lb_opcion = P05LI7_A5555Lb_opcion[0] ;
               A488ForPrdDsc = P05LI7_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P05LI7_n488ForPrdDsc[0] ;
               A5718Lb_numop = P05LI7_A5718Lb_numop[0] ;
               AV26Tab_cant[A5718Lb_numop-1] = A5558LB_CantC ;
               AV72Tab_und[A5718Lb_numop-1] = GXutil.substring( A488ForPrdDsc, 1, 3) ;
               AV10t = (short)(AV10t+1) ;
               AV27ens003 = (byte)(1) ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            if ( AV27ens003 == 1 )
            {
               GXt_char3 = AV15Prdnom ;
               GXv_char4[0] = A396EmprCod ;
               GXv_char2[0] = AV11Prdnum ;
               GXv_char7[0] = GXt_char3 ;
               new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char2, GXv_char7) ;
               pprc121.this.A396EmprCod = GXv_char4[0] ;
               pprc121.this.AV11Prdnum = GXv_char2[0] ;
               pprc121.this.GXt_char3 = GXv_char7[0] ;
               AV15Prdnom = GXt_char3 ;
               AV16Cant1 = AV26Tab_cant[1-1] ;
               AV17Cant2 = AV26Tab_cant[2-1] ;
               AV18Cant3 = AV26Tab_cant[3-1] ;
               AV19Cant4 = AV26Tab_cant[4-1] ;
               AV20Cant5 = AV26Tab_cant[5-1] ;
               AV21Cant6 = AV26Tab_cant[6-1] ;
               AV22Cant7 = AV26Tab_cant[7-1] ;
               AV23Cant8 = AV26Tab_cant[8-1] ;
               AV24Cant9 = AV26Tab_cant[9-1] ;
               AV73Und1 = AV72Tab_und[1-1] ;
               AV74Und2 = AV72Tab_und[2-1] ;
               AV75Und3 = AV72Tab_und[3-1] ;
               AV76Und4 = AV72Tab_und[4-1] ;
               AV77Und5 = AV72Tab_und[5-1] ;
               AV78Und6 = AV72Tab_und[6-1] ;
               AV79Und7 = AV72Tab_und[7-1] ;
               AV80Und8 = AV72Tab_und[8-1] ;
               AV81Und9 = AV72Tab_und[9-1] ;
               h5LI0( false, 31) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Prdnum, "")), 22, Gx_line+0, 67, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Prdnom, "")), 74, Gx_line+0, 265, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16Cant1, "ZZZ.ZZZZZ")), 270, Gx_line+0, 337, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Cant2, "ZZZ.ZZZZZ")), 381, Gx_line+0, 448, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cant3, "ZZZ.ZZZZZ")), 489, Gx_line+0, 556, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19Cant4, "ZZZ.ZZZZZ")), 592, Gx_line+0, 659, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20Cant5, "ZZZ.ZZZZZ")), 700, Gx_line+0, 767, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Cant6, "ZZZ.ZZZZZ")), 809, Gx_line+0, 876, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22Cant7, "ZZZ.ZZZZZ")), 908, Gx_line+0, 975, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23Cant8, "ZZZ.ZZZZZ")), 1015, Gx_line+0, 1082, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Und1, "")), 344, Gx_line+0, 367, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Und2, "")), 450, Gx_line+0, 473, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Und3, "")), 557, Gx_line+0, 580, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Und4, "")), 664, Gx_line+0, 687, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Und5, "")), 777, Gx_line+0, 800, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Und6, "")), 882, Gx_line+0, 905, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Und7, "")), 982, Gx_line+0, 1005, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80Und8, "")), 1084, Gx_line+0, 1107, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
            }
            AV28ens004 = (byte)(0) ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV26Tab_cant[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV72Tab_und[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV10t = (short)(1) ;
            /* Using cursor P05LI8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV11Prdnum});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A490ForPrdUMe = P05LI8_A490ForPrdUMe[0] ;
               A719PrdNum = P05LI8_A719PrdNum[0] ;
               A5561LB_CantP = P05LI8_A5561LB_CantP[0] ;
               A5718Lb_numop = P05LI8_A5718Lb_numop[0] ;
               A488ForPrdDsc = P05LI8_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P05LI8_n488ForPrdDsc[0] ;
               A5560Lb_LineaPr = P05LI8_A5560Lb_LineaPr[0] ;
               A5555Lb_opcion = P05LI8_A5555Lb_opcion[0] ;
               A488ForPrdDsc = P05LI8_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P05LI8_n488ForPrdDsc[0] ;
               A5718Lb_numop = P05LI8_A5718Lb_numop[0] ;
               AV26Tab_cant[A5718Lb_numop-1] = A5561LB_CantP ;
               AV72Tab_und[A5718Lb_numop-1] = GXutil.substring( A488ForPrdDsc, 1, 3) ;
               AV10t = (short)(AV10t+1) ;
               AV28ens004 = (byte)(1) ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            if ( AV28ens004 == 1 )
            {
               GXt_char3 = AV15Prdnom ;
               GXv_char7[0] = A396EmprCod ;
               GXv_char4[0] = AV11Prdnum ;
               GXv_char2[0] = GXt_char3 ;
               new app.pprddsc(remoteHandle, context).execute( GXv_char7, GXv_char4, GXv_char2) ;
               pprc121.this.A396EmprCod = GXv_char7[0] ;
               pprc121.this.AV11Prdnum = GXv_char4[0] ;
               pprc121.this.GXt_char3 = GXv_char2[0] ;
               AV15Prdnom = GXt_char3 ;
               AV16Cant1 = AV26Tab_cant[1-1] ;
               AV17Cant2 = AV26Tab_cant[2-1] ;
               AV18Cant3 = AV26Tab_cant[3-1] ;
               AV19Cant4 = AV26Tab_cant[4-1] ;
               AV20Cant5 = AV26Tab_cant[5-1] ;
               AV21Cant6 = AV26Tab_cant[6-1] ;
               AV22Cant7 = AV26Tab_cant[7-1] ;
               AV23Cant8 = AV26Tab_cant[8-1] ;
               AV24Cant9 = AV26Tab_cant[9-1] ;
               AV73Und1 = AV72Tab_und[1-1] ;
               AV74Und2 = AV72Tab_und[2-1] ;
               AV75Und3 = AV72Tab_und[3-1] ;
               AV76Und4 = AV72Tab_und[4-1] ;
               AV77Und5 = AV72Tab_und[5-1] ;
               AV78Und6 = AV72Tab_und[6-1] ;
               AV79Und7 = AV72Tab_und[7-1] ;
               AV80Und8 = AV72Tab_und[8-1] ;
               AV81Und9 = AV72Tab_und[9-1] ;
               h5LI0( false, 31) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Prdnum, "")), 22, Gx_line+0, 67, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Prdnom, "")), 74, Gx_line+0, 265, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16Cant1, "ZZZ.ZZZZZ")), 270, Gx_line+0, 337, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Cant2, "ZZZ.ZZZZZ")), 381, Gx_line+0, 448, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cant3, "ZZZ.ZZZZZ")), 489, Gx_line+0, 556, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19Cant4, "ZZZ.ZZZZZ")), 592, Gx_line+0, 659, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV20Cant5, "ZZZ.ZZZZZ")), 700, Gx_line+0, 767, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV21Cant6, "ZZZ.ZZZZZ")), 809, Gx_line+0, 876, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22Cant7, "ZZZ.ZZZZZ")), 908, Gx_line+0, 975, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV23Cant8, "ZZZ.ZZZZZ")), 1015, Gx_line+0, 1082, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Und1, "")), 344, Gx_line+0, 367, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Und2, "")), 450, Gx_line+0, 473, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Und3, "")), 557, Gx_line+0, 580, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Und4, "")), 664, Gx_line+0, 687, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Und5, "")), 777, Gx_line+0, 800, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Und6, "")), 882, Gx_line+0, 905, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Und7, "")), 982, Gx_line+0, 1005, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80Und8, "")), 1084, Gx_line+0, 1107, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
            }
            AV9i = (short)(AV9i+1) ;
         }
         h5LI0( false, 17) ;
         getPrinter().GxAttris("Arial", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Contdsc, "")), 22, Gx_line+0, 106, Gx_line+11, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5LI0( true, 0) ;
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
      /* 'TABLA1' Routine */
      returnInSub = false ;
      AV12Alta = (byte)(0) ;
      AV9i = (short)(1) ;
      while ( AV9i <= 100 )
      {
         if ( GXutil.strcmp(AV8tab_productos[AV9i-1], " ") == 0 )
         {
            AV12Alta = (byte)(1) ;
            if (true) break;
         }
         if ( GXutil.strcmp(AV11Prdnum, AV8tab_productos[AV9i-1]) == 0 )
         {
            if (true) break;
         }
         AV9i = (short)(AV9i+1) ;
      }
      if ( AV12Alta == 1 )
      {
         AV8tab_productos[AV10t-1] = AV11Prdnum ;
         AV10t = (short)(AV10t+1) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV49Compo = "" ;
      /* Using cursor P05LI9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV83CliCod), AV84Lb_artcod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A65ArtCod = P05LI9_A65ArtCod[0] ;
         A252CliCod = P05LI9_A252CliCod[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void h5LI0( boolean bFoot ,
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
            if ( GxHdr4 )
            {
               getPrinter().GxDrawRect(41, Gx_line+17, 183, Gx_line+52, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 113, Gx_line+26, 172, Gx_line+44, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 127, Gx_line+61, 172, Gx_line+79, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 178, Gx_line+61, 398, Gx_line+79, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), 135, Gx_line+111, 253, Gx_line+129, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5534Lb_ArtDsc, "")), 267, Gx_line+111, 458, Gx_line+129, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5552Lb_TipArtD, "")), 470, Gx_line+111, 690, Gx_line+129, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(41, Gx_line+56, 1055, Gx_line+150, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5536Lb_ColNom, "")), 111, Gx_line+156, 207, Gx_line+174, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9")), 222, Gx_line+156, 267, Gx_line+174, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 280, Gx_line+156, 296, Gx_line+173, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A832TipColDsc, "")), 306, Gx_line+156, 526, Gx_line+173, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5538Lb_ColNomC, "")), 111, Gx_line+178, 207, Gx_line+196, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5539Lb_ColNumC), "ZZZZZ9")), 222, Gx_line+178, 267, Gx_line+196, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5540Lb_Cartaz, "")), 134, Gx_line+84, 281, Gx_line+102, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")), 133, Gx_line+200, 149, Gx_line+217, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A584IntDsc, "")), 154, Gx_line+200, 374, Gx_line+217, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(41, Gx_line+152, 534, Gx_line+243, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 401, Gx_line+203, 418, Gx_line+219, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5547Lb_Rb, "ZZZ9.99")), 423, Gx_line+203, 475, Gx_line+220, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5541Lb_FechaE, "99/99/99"), 646, Gx_line+174, 705, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5543Lb_Usuario, "")), 948, Gx_line+174, 1022, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5544Lb_FechaM, "99/99/99"), 646, Gx_line+202, 705, Gx_line+219, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5546Lb_UsuM, "")), 948, Gx_line+202, 1022, Gx_line+219, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(549, Gx_line+152, 1054, Gx_line+243, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5542Lb_HoraE, "99:99"), 793, Gx_line+174, 830, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5545Lb_HoraM, "99:99"), 793, Gx_line+202, 830, Gx_line+219, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(A5548Lb_Obs, 46, Gx_line+263, 564, Gx_line+326, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A5594Lb_cartazf, "99/99/99"), 294, Gx_line+84, 353, Gx_line+102, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5601Lb_Tempt), "ZZZ9")), 172, Gx_line+222, 202, Gx_line+239, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5610Lb_Temp2), "ZZZ9")), 207, Gx_line+222, 237, Gx_line+239, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5611Lb_Temp3), "ZZZ9")), 243, Gx_line+222, 273, Gx_line+239, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29EmprNOm, "")), 424, Gx_line+10, 675, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit3, "")), 709, Gx_line+35, 835, Gx_line+52, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 854, Gx_line+35, 913, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 923, Gx_line+35, 927, Gx_line+51, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 939, Gx_line+35, 998, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit4, "")), 46, Gx_line+26, 110, Gx_line+43, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit5, "")), 48, Gx_line+61, 90, Gx_line+77, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit6, "")), 48, Gx_line+84, 115, Gx_line+100, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit7, "")), 48, Gx_line+111, 90, Gx_line+127, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit8, "")), 49, Gx_line+156, 101, Gx_line+172, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit9, "")), 49, Gx_line+178, 93, Gx_line+194, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit10, "")), 49, Gx_line+200, 119, Gx_line+216, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit11, "")), 49, Gx_line+222, 121, Gx_line+238, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit12, "")), 46, Gx_line+244, 122, Gx_line+261, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit18, "")), 559, Gx_line+174, 627, Gx_line+190, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit19, "")), 559, Gx_line+202, 627, Gx_line+218, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit20, "")), 725, Gx_line+174, 782, Gx_line+190, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit21, "")), 725, Gx_line+202, 782, Gx_line+218, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit24, "")), 436, Gx_line+61, 540, Gx_line+77, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Texto_e, "")), 553, Gx_line+61, 700, Gx_line+78, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Compo, "")), 267, Gx_line+130, 487, Gx_line+148, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5097TipDisDsc, "")), 189, Gx_line+27, 409, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Fibras", ""), 436, Gx_line+222, 489, Gx_line+238, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5988Lb_nfibras), "Z9")), 513, Gx_line+222, 529, Gx_line+239, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 545, Gx_line+61, 549, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 118, Gx_line+111, 122, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 118, Gx_line+84, 122, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 118, Gx_line+59, 122, Gx_line+75, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 125, Gx_line+200, 129, Gx_line+216, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 105, Gx_line+178, 109, Gx_line+194, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 105, Gx_line+156, 109, Gx_line+172, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 125, Gx_line+222, 129, Gx_line+238, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 492, Gx_line+222, 496, Gx_line+238, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 635, Gx_line+202, 639, Gx_line+218, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 635, Gx_line+174, 639, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 786, Gx_line+202, 790, Gx_line+218, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 786, Gx_line+174, 790, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 941, Gx_line+202, 945, Gx_line+218, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 941, Gx_line+174, 945, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit27, "")), 848, Gx_line+174, 936, Gx_line+190, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit28, "")), 848, Gx_line+202, 936, Gx_line+218, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 142, Gx_line+244, 146, Gx_line+260, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54Num_ops), "ZZZ9")), 1025, Gx_line+246, 1055, Gx_line+263, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PT:", ""), 279, Gx_line+178, 298, Gx_line+194, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lb_pantone, "")), 303, Gx_line+178, 523, Gx_line+195, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+325) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Produto", ""), 22, Gx_line+16, 69, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 73, Gx_line+16, 133, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Op1, "")), 318, Gx_line+16, 326, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Op2, "")), 423, Gx_line+16, 431, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Op3, "")), 531, Gx_line+16, 539, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Op4, "")), 635, Gx_line+16, 643, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Op5, "")), 746, Gx_line+16, 754, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Op6, "")), 851, Gx_line+16, 859, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Op7, "")), 952, Gx_line+16, 960, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Op8, "")), 1056, Gx_line+16, 1064, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(22, Gx_line+31, 66, Gx_line+31, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(74, Gx_line+31, 264, Gx_line+31, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(270, Gx_line+31, 366, Gx_line+31, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(381, Gx_line+31, 472, Gx_line+31, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(489, Gx_line+31, 583, Gx_line+31, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(592, Gx_line+31, 687, Gx_line+31, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(700, Gx_line+31, 800, Gx_line+31, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(809, Gx_line+31, 901, Gx_line+31, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(908, Gx_line+31, 1004, Gx_line+31, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1015, Gx_line+31, 1107, Gx_line+31, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+41) ;
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
      this.aP0[0] = pprc121.this.A396EmprCod;
      this.aP1[0] = pprc121.this.A5532Lb_numero;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV61Lit1 = "" ;
      AV62Lit2 = "" ;
      AV30Lit3 = "" ;
      AV31Lit4 = "" ;
      AV32Lit5 = "" ;
      AV33Lit6 = "" ;
      AV34Lit7 = "" ;
      AV35Lit8 = "" ;
      AV36Lit9 = "" ;
      AV37Lit10 = "" ;
      AV38Lit11 = "" ;
      AV39Lit12 = "" ;
      AV56Lit13 = "" ;
      AV57Lit14 = "" ;
      AV58Lit15 = "" ;
      AV59Lit16 = "" ;
      AV60Lit17 = "" ;
      AV40Lit18 = "" ;
      AV41Lit19 = "" ;
      AV42Lit20 = "" ;
      AV43Lit21 = "" ;
      AV45Lit22 = "" ;
      AV46Lit23 = "" ;
      AV47Lit24 = "" ;
      AV50Lit25 = "" ;
      GXt_char1 = "" ;
      AV51Lit26 = "" ;
      AV52Lit27 = "" ;
      AV53Lit28 = "" ;
      GXv_int6 = new byte[1] ;
      scmdbuf = "" ;
      P05LI2_A396EmprCod = new String[] {""} ;
      P05LI2_A407EmprNom = new String[] {""} ;
      P05LI2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV29EmprNOm = "" ;
      AV14Tab_opciones = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV14Tab_opciones[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05LI3_A396EmprCod = new String[] {""} ;
      P05LI3_A5532Lb_numero = new int[1] ;
      P05LI3_A5718Lb_numop = new byte[1] ;
      P05LI3_A5555Lb_opcion = new String[] {""} ;
      A5555Lb_opcion = "" ;
      AV63Op1 = "" ;
      AV64Op2 = "" ;
      AV65Op3 = "" ;
      AV66Op4 = "" ;
      AV67Op5 = "" ;
      AV68Op6 = "" ;
      AV69Op7 = "" ;
      AV70Op8 = "" ;
      AV71Op9 = "" ;
      P05LI4_A5548Lb_Obs = new String[] {""} ;
      P05LI4_A5098TipDisCod = new String[] {""} ;
      P05LI4_n5098TipDisCod = new boolean[] {false} ;
      P05LI4_A396EmprCod = new String[] {""} ;
      P05LI4_A5532Lb_numero = new int[1] ;
      P05LI4_A6546Lb_Pantone = new String[] {""} ;
      P05LI4_A5595Lb_malha = new byte[1] ;
      P05LI4_A5570Lb_Tipo = new String[] {""} ;
      P05LI4_A6653Lb_Tra1 = new String[] {""} ;
      P05LI4_A6654Lb_TraP1 = new short[1] ;
      P05LI4_A6655Lb_Tra2 = new String[] {""} ;
      P05LI4_A6656Lb_TraP2 = new short[1] ;
      P05LI4_A6657Lb_Tra3 = new String[] {""} ;
      P05LI4_A6658Lb_TraP3 = new short[1] ;
      P05LI4_A5988Lb_nfibras = new byte[1] ;
      P05LI4_A5097TipDisDsc = new String[] {""} ;
      P05LI4_n5097TipDisDsc = new boolean[] {false} ;
      P05LI4_A5611Lb_Temp3 = new short[1] ;
      P05LI4_A5610Lb_Temp2 = new short[1] ;
      P05LI4_A5601Lb_Tempt = new short[1] ;
      P05LI4_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P05LI4_A5545Lb_HoraM = new java.util.Date[] {GXutil.nullDate()} ;
      P05LI4_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P05LI4_A5546Lb_UsuM = new String[] {""} ;
      P05LI4_A5544Lb_FechaM = new java.util.Date[] {GXutil.nullDate()} ;
      P05LI4_A5543Lb_Usuario = new String[] {""} ;
      P05LI4_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P05LI4_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LI4_A584IntDsc = new String[] {""} ;
      P05LI4_n584IntDsc = new boolean[] {false} ;
      P05LI4_A583IntCod = new byte[1] ;
      P05LI4_n583IntCod = new boolean[] {false} ;
      P05LI4_A5540Lb_Cartaz = new String[] {""} ;
      P05LI4_A5539Lb_ColNumC = new int[1] ;
      P05LI4_A5538Lb_ColNomC = new String[] {""} ;
      P05LI4_A832TipColDsc = new String[] {""} ;
      P05LI4_n832TipColDsc = new boolean[] {false} ;
      P05LI4_A831TipColCod = new byte[1] ;
      P05LI4_n831TipColCod = new boolean[] {false} ;
      P05LI4_A5537Lb_ColNum = new int[1] ;
      P05LI4_A5536Lb_ColNom = new String[] {""} ;
      P05LI4_A5552Lb_TipArtD = new String[] {""} ;
      P05LI4_A5534Lb_ArtDsc = new String[] {""} ;
      P05LI4_A5533Lb_ArtCod = new String[] {""} ;
      P05LI4_A279CliNom = new String[] {""} ;
      P05LI4_A252CliCod = new int[1] ;
      A5548Lb_Obs = "" ;
      A5098TipDisCod = "" ;
      A6546Lb_Pantone = "" ;
      A5570Lb_Tipo = "" ;
      A6653Lb_Tra1 = "" ;
      A6655Lb_Tra2 = "" ;
      A6657Lb_Tra3 = "" ;
      A5097TipDisDsc = "" ;
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
      AV55Lb_pantone = "" ;
      AV44Texto_m = "" ;
      AV48Texto_e = "" ;
      AV84Lb_artcod = "" ;
      AV49Compo = "" ;
      AV8tab_productos = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV8tab_productos[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05LI5_A396EmprCod = new String[] {""} ;
      P05LI5_A5532Lb_numero = new int[1] ;
      P05LI5_A719PrdNum = new String[] {""} ;
      P05LI5_A5557Lb_LineaC = new short[1] ;
      P05LI5_A5555Lb_opcion = new String[] {""} ;
      A719PrdNum = "" ;
      AV11Prdnum = "" ;
      P05LI6_A396EmprCod = new String[] {""} ;
      P05LI6_A5532Lb_numero = new int[1] ;
      P05LI6_A719PrdNum = new String[] {""} ;
      P05LI6_A5560Lb_LineaPr = new short[1] ;
      P05LI6_A5555Lb_opcion = new String[] {""} ;
      AV26Tab_cant = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV26Tab_cant[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV72Tab_und = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV72Tab_und[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05LI7_A490ForPrdUMe = new byte[1] ;
      P05LI7_A396EmprCod = new String[] {""} ;
      P05LI7_A5532Lb_numero = new int[1] ;
      P05LI7_A719PrdNum = new String[] {""} ;
      P05LI7_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LI7_A5718Lb_numop = new byte[1] ;
      P05LI7_A488ForPrdDsc = new String[] {""} ;
      P05LI7_n488ForPrdDsc = new boolean[] {false} ;
      P05LI7_A5557Lb_LineaC = new short[1] ;
      P05LI7_A5555Lb_opcion = new String[] {""} ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      AV15Prdnom = "" ;
      AV16Cant1 = DecimalUtil.ZERO ;
      AV17Cant2 = DecimalUtil.ZERO ;
      AV18Cant3 = DecimalUtil.ZERO ;
      AV19Cant4 = DecimalUtil.ZERO ;
      AV20Cant5 = DecimalUtil.ZERO ;
      AV21Cant6 = DecimalUtil.ZERO ;
      AV22Cant7 = DecimalUtil.ZERO ;
      AV23Cant8 = DecimalUtil.ZERO ;
      AV24Cant9 = DecimalUtil.ZERO ;
      AV73Und1 = "" ;
      AV74Und2 = "" ;
      AV75Und3 = "" ;
      AV76Und4 = "" ;
      AV77Und5 = "" ;
      AV78Und6 = "" ;
      AV79Und7 = "" ;
      AV80Und8 = "" ;
      AV81Und9 = "" ;
      P05LI8_A490ForPrdUMe = new byte[1] ;
      P05LI8_A396EmprCod = new String[] {""} ;
      P05LI8_A5532Lb_numero = new int[1] ;
      P05LI8_A719PrdNum = new String[] {""} ;
      P05LI8_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05LI8_A5718Lb_numop = new byte[1] ;
      P05LI8_A488ForPrdDsc = new String[] {""} ;
      P05LI8_n488ForPrdDsc = new boolean[] {false} ;
      P05LI8_A5560Lb_LineaPr = new short[1] ;
      P05LI8_A5555Lb_opcion = new String[] {""} ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      GXt_char3 = "" ;
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV82Contdsc = "" ;
      P05LI9_A396EmprCod = new String[] {""} ;
      P05LI9_A65ArtCod = new String[] {""} ;
      P05LI9_A252CliCod = new int[1] ;
      A65ArtCod = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc121__default(),
         new Object[] {
             new Object[] {
            P05LI2_A396EmprCod, P05LI2_A407EmprNom, P05LI2_n407EmprNom
            }
            , new Object[] {
            P05LI3_A396EmprCod, P05LI3_A5532Lb_numero, P05LI3_A5718Lb_numop, P05LI3_A5555Lb_opcion
            }
            , new Object[] {
            P05LI4_A5548Lb_Obs, P05LI4_A5098TipDisCod, P05LI4_n5098TipDisCod, P05LI4_A396EmprCod, P05LI4_A5532Lb_numero, P05LI4_A6546Lb_Pantone, P05LI4_A5595Lb_malha, P05LI4_A5570Lb_Tipo, P05LI4_A6653Lb_Tra1, P05LI4_A6654Lb_TraP1,
            P05LI4_A6655Lb_Tra2, P05LI4_A6656Lb_TraP2, P05LI4_A6657Lb_Tra3, P05LI4_A6658Lb_TraP3, P05LI4_A5988Lb_nfibras, P05LI4_A5097TipDisDsc, P05LI4_n5097TipDisDsc, P05LI4_A5611Lb_Temp3, P05LI4_A5610Lb_Temp2, P05LI4_A5601Lb_Tempt,
            P05LI4_A5594Lb_cartazf, P05LI4_A5545Lb_HoraM, P05LI4_A5542Lb_HoraE, P05LI4_A5546Lb_UsuM, P05LI4_A5544Lb_FechaM, P05LI4_A5543Lb_Usuario, P05LI4_A5541Lb_FechaE, P05LI4_A5547Lb_Rb, P05LI4_A584IntDsc, P05LI4_n584IntDsc,
            P05LI4_A583IntCod, P05LI4_n583IntCod, P05LI4_A5540Lb_Cartaz, P05LI4_A5539Lb_ColNumC, P05LI4_A5538Lb_ColNomC, P05LI4_A832TipColDsc, P05LI4_n832TipColDsc, P05LI4_A831TipColCod, P05LI4_n831TipColCod, P05LI4_A5537Lb_ColNum,
            P05LI4_A5536Lb_ColNom, P05LI4_A5552Lb_TipArtD, P05LI4_A5534Lb_ArtDsc, P05LI4_A5533Lb_ArtCod, P05LI4_A279CliNom, P05LI4_A252CliCod
            }
            , new Object[] {
            P05LI5_A396EmprCod, P05LI5_A5532Lb_numero, P05LI5_A719PrdNum, P05LI5_A5557Lb_LineaC, P05LI5_A5555Lb_opcion
            }
            , new Object[] {
            P05LI6_A396EmprCod, P05LI6_A5532Lb_numero, P05LI6_A719PrdNum, P05LI6_A5560Lb_LineaPr, P05LI6_A5555Lb_opcion
            }
            , new Object[] {
            P05LI7_A490ForPrdUMe, P05LI7_A396EmprCod, P05LI7_A5532Lb_numero, P05LI7_A719PrdNum, P05LI7_A5558LB_CantC, P05LI7_A5718Lb_numop, P05LI7_A488ForPrdDsc, P05LI7_n488ForPrdDsc, P05LI7_A5557Lb_LineaC, P05LI7_A5555Lb_opcion
            }
            , new Object[] {
            P05LI8_A490ForPrdUMe, P05LI8_A396EmprCod, P05LI8_A5532Lb_numero, P05LI8_A719PrdNum, P05LI8_A5561LB_CantP, P05LI8_A5718Lb_numop, P05LI8_A488ForPrdDsc, P05LI8_n488ForPrdDsc, P05LI8_A5560Lb_LineaPr, P05LI8_A5555Lb_opcion
            }
            , new Object[] {
            P05LI9_A396EmprCod, P05LI9_A65ArtCod, P05LI9_A252CliCod
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

   private byte AV85Carvitin ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A5718Lb_numop ;
   private byte A5595Lb_malha ;
   private byte A5988Lb_nfibras ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte AV27ens003 ;
   private byte A490ForPrdUMe ;
   private byte AV28ens004 ;
   private byte AV12Alta ;
   private short AV13Nopciones ;
   private short AV9i ;
   private short A6654Lb_TraP1 ;
   private short A6656Lb_TraP2 ;
   private short A6658Lb_TraP3 ;
   private short A5611Lb_Temp3 ;
   private short A5610Lb_Temp2 ;
   private short A5601Lb_Tempt ;
   private short AV10t ;
   private short A5557Lb_LineaC ;
   private short A5560Lb_LineaPr ;
   private short AV54Num_ops ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GX_I ;
   private int A5539Lb_ColNumC ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private int AV83CliCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV26Tab_cant[] ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal AV16Cant1 ;
   private java.math.BigDecimal AV17Cant2 ;
   private java.math.BigDecimal AV18Cant3 ;
   private java.math.BigDecimal AV19Cant4 ;
   private java.math.BigDecimal AV20Cant5 ;
   private java.math.BigDecimal AV21Cant6 ;
   private java.math.BigDecimal AV22Cant7 ;
   private java.math.BigDecimal AV23Cant8 ;
   private java.math.BigDecimal AV24Cant9 ;
   private java.math.BigDecimal A5561LB_CantP ;
   private String A396EmprCod ;
   private String AV61Lit1 ;
   private String AV62Lit2 ;
   private String AV30Lit3 ;
   private String AV31Lit4 ;
   private String AV32Lit5 ;
   private String AV33Lit6 ;
   private String AV34Lit7 ;
   private String AV35Lit8 ;
   private String AV36Lit9 ;
   private String AV37Lit10 ;
   private String AV38Lit11 ;
   private String AV39Lit12 ;
   private String AV56Lit13 ;
   private String AV57Lit14 ;
   private String AV58Lit15 ;
   private String AV59Lit16 ;
   private String AV60Lit17 ;
   private String AV40Lit18 ;
   private String AV41Lit19 ;
   private String AV42Lit20 ;
   private String AV43Lit21 ;
   private String AV45Lit22 ;
   private String AV46Lit23 ;
   private String AV47Lit24 ;
   private String AV50Lit25 ;
   private String GXt_char1 ;
   private String AV51Lit26 ;
   private String AV52Lit27 ;
   private String AV53Lit28 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV29EmprNOm ;
   private String AV14Tab_opciones[] ;
   private String A5555Lb_opcion ;
   private String AV63Op1 ;
   private String AV64Op2 ;
   private String AV65Op3 ;
   private String AV66Op4 ;
   private String AV67Op5 ;
   private String AV68Op6 ;
   private String AV69Op7 ;
   private String AV70Op8 ;
   private String AV71Op9 ;
   private String A5098TipDisCod ;
   private String A6546Lb_Pantone ;
   private String A5570Lb_Tipo ;
   private String A6653Lb_Tra1 ;
   private String A6655Lb_Tra2 ;
   private String A6657Lb_Tra3 ;
   private String A5097TipDisDsc ;
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
   private String AV55Lb_pantone ;
   private String AV44Texto_m ;
   private String AV48Texto_e ;
   private String AV84Lb_artcod ;
   private String AV49Compo ;
   private String AV8tab_productos[] ;
   private String A719PrdNum ;
   private String AV11Prdnum ;
   private String AV72Tab_und[] ;
   private String A488ForPrdDsc ;
   private String AV15Prdnom ;
   private String AV73Und1 ;
   private String AV74Und2 ;
   private String AV75Und3 ;
   private String AV76Und4 ;
   private String AV77Und5 ;
   private String AV78Und6 ;
   private String AV79Und7 ;
   private String AV80Und8 ;
   private String AV81Und9 ;
   private String GXt_char3 ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String AV82Contdsc ;
   private String A65ArtCod ;
   private String Gx_time ;
   private java.util.Date A5545Lb_HoraM ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5544Lb_FechaM ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean GxHdr4 ;
   private boolean n5098TipDisCod ;
   private boolean n5097TipDisDsc ;
   private boolean n584IntDsc ;
   private boolean n583IntCod ;
   private boolean n832TipColDsc ;
   private boolean n831TipColCod ;
   private boolean returnInSub ;
   private boolean n488ForPrdDsc ;
   private String A5548Lb_Obs ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P05LI2_A396EmprCod ;
   private String[] P05LI2_A407EmprNom ;
   private boolean[] P05LI2_n407EmprNom ;
   private String[] P05LI3_A396EmprCod ;
   private int[] P05LI3_A5532Lb_numero ;
   private byte[] P05LI3_A5718Lb_numop ;
   private String[] P05LI3_A5555Lb_opcion ;
   private String[] P05LI4_A5548Lb_Obs ;
   private String[] P05LI4_A5098TipDisCod ;
   private boolean[] P05LI4_n5098TipDisCod ;
   private String[] P05LI4_A396EmprCod ;
   private int[] P05LI4_A5532Lb_numero ;
   private String[] P05LI4_A6546Lb_Pantone ;
   private byte[] P05LI4_A5595Lb_malha ;
   private String[] P05LI4_A5570Lb_Tipo ;
   private String[] P05LI4_A6653Lb_Tra1 ;
   private short[] P05LI4_A6654Lb_TraP1 ;
   private String[] P05LI4_A6655Lb_Tra2 ;
   private short[] P05LI4_A6656Lb_TraP2 ;
   private String[] P05LI4_A6657Lb_Tra3 ;
   private short[] P05LI4_A6658Lb_TraP3 ;
   private byte[] P05LI4_A5988Lb_nfibras ;
   private String[] P05LI4_A5097TipDisDsc ;
   private boolean[] P05LI4_n5097TipDisDsc ;
   private short[] P05LI4_A5611Lb_Temp3 ;
   private short[] P05LI4_A5610Lb_Temp2 ;
   private short[] P05LI4_A5601Lb_Tempt ;
   private java.util.Date[] P05LI4_A5594Lb_cartazf ;
   private java.util.Date[] P05LI4_A5545Lb_HoraM ;
   private java.util.Date[] P05LI4_A5542Lb_HoraE ;
   private String[] P05LI4_A5546Lb_UsuM ;
   private java.util.Date[] P05LI4_A5544Lb_FechaM ;
   private String[] P05LI4_A5543Lb_Usuario ;
   private java.util.Date[] P05LI4_A5541Lb_FechaE ;
   private java.math.BigDecimal[] P05LI4_A5547Lb_Rb ;
   private String[] P05LI4_A584IntDsc ;
   private boolean[] P05LI4_n584IntDsc ;
   private byte[] P05LI4_A583IntCod ;
   private boolean[] P05LI4_n583IntCod ;
   private String[] P05LI4_A5540Lb_Cartaz ;
   private int[] P05LI4_A5539Lb_ColNumC ;
   private String[] P05LI4_A5538Lb_ColNomC ;
   private String[] P05LI4_A832TipColDsc ;
   private boolean[] P05LI4_n832TipColDsc ;
   private byte[] P05LI4_A831TipColCod ;
   private boolean[] P05LI4_n831TipColCod ;
   private int[] P05LI4_A5537Lb_ColNum ;
   private String[] P05LI4_A5536Lb_ColNom ;
   private String[] P05LI4_A5552Lb_TipArtD ;
   private String[] P05LI4_A5534Lb_ArtDsc ;
   private String[] P05LI4_A5533Lb_ArtCod ;
   private String[] P05LI4_A279CliNom ;
   private int[] P05LI4_A252CliCod ;
   private String[] P05LI5_A396EmprCod ;
   private int[] P05LI5_A5532Lb_numero ;
   private String[] P05LI5_A719PrdNum ;
   private short[] P05LI5_A5557Lb_LineaC ;
   private String[] P05LI5_A5555Lb_opcion ;
   private String[] P05LI6_A396EmprCod ;
   private int[] P05LI6_A5532Lb_numero ;
   private String[] P05LI6_A719PrdNum ;
   private short[] P05LI6_A5560Lb_LineaPr ;
   private String[] P05LI6_A5555Lb_opcion ;
   private byte[] P05LI7_A490ForPrdUMe ;
   private String[] P05LI7_A396EmprCod ;
   private int[] P05LI7_A5532Lb_numero ;
   private String[] P05LI7_A719PrdNum ;
   private java.math.BigDecimal[] P05LI7_A5558LB_CantC ;
   private byte[] P05LI7_A5718Lb_numop ;
   private String[] P05LI7_A488ForPrdDsc ;
   private boolean[] P05LI7_n488ForPrdDsc ;
   private short[] P05LI7_A5557Lb_LineaC ;
   private String[] P05LI7_A5555Lb_opcion ;
   private byte[] P05LI8_A490ForPrdUMe ;
   private String[] P05LI8_A396EmprCod ;
   private int[] P05LI8_A5532Lb_numero ;
   private String[] P05LI8_A719PrdNum ;
   private java.math.BigDecimal[] P05LI8_A5561LB_CantP ;
   private byte[] P05LI8_A5718Lb_numop ;
   private String[] P05LI8_A488ForPrdDsc ;
   private boolean[] P05LI8_n488ForPrdDsc ;
   private short[] P05LI8_A5560Lb_LineaPr ;
   private String[] P05LI8_A5555Lb_opcion ;
   private String[] P05LI9_A396EmprCod ;
   private String[] P05LI9_A65ArtCod ;
   private int[] P05LI9_A252CliCod ;
}

final  class pprc121__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05LI2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05LI3", "SELECT EmprCod, Lb_numero, Lb_numop, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05LI4", "SELECT T1.Lb_Obs, T1.TipDisCod, T1.EmprCod, T1.Lb_numero, T1.Lb_Pantone, T1.Lb_malha, T1.Lb_Tipo, T1.Lb_Tra1, T1.Lb_TraP1, T1.Lb_Tra2, T1.Lb_TraP2, T1.Lb_Tra3, T1.Lb_TraP3, T1.Lb_nfibras, T5.TipDisDsc, T1.Lb_Temp3, T1.Lb_Temp2, T1.Lb_Tempt, T1.Lb_cartazf, T1.Lb_HoraM, T1.Lb_HoraE, T1.Lb_UsuM, T1.Lb_FechaM, T1.Lb_Usuario, T1.Lb_FechaE, T1.Lb_Rb, T3.IntDsc, T1.IntCod, T1.Lb_Cartaz, T1.Lb_ColNumC, T1.Lb_ColNomC, T4.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_TipArtD, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod FROM ((((TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPDIS T5 ON T5.EmprCod = T1.EmprCod AND T5.TipDisCod = T1.TipDisCod) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05LI5", "SELECT EmprCod, Lb_numero, PrdNum, Lb_LineaC, Lb_opcion FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05LI6", "SELECT EmprCod, Lb_numero, PrdNum, Lb_LineaPr, Lb_opcion FROM TXPENS004 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05LI7", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Lb_numero, T1.PrdNum, T1.LB_CantC, T3.Lb_numop, T2.ForPrdDsc, T1.Lb_LineaC, T1.Lb_opcion FROM ((TXPENS003 T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPENS002 T3 ON T3.EmprCod = T1.EmprCod AND T3.Lb_numero = T1.Lb_numero AND T3.Lb_opcion = T1.Lb_opcion) WHERE (T1.EmprCod = ? and T1.Lb_numero = ?) AND (T1.PrdNum = ?) ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05LI8", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Lb_numero, T1.PrdNum, T1.LB_CantP, T3.Lb_numop, T2.ForPrdDsc, T1.Lb_LineaPr, T1.Lb_opcion FROM ((TXPENS004 T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPENS002 T3 ON T3.EmprCod = T1.EmprCod AND T3.Lb_numero = T1.Lb_numero AND T3.Lb_opcion = T1.Lb_opcion) WHERE (T1.EmprCod = ? and T1.Lb_numero = ?) AND (T1.PrdNum = ?) ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05LI9", "SELECT EmprCod, ArtCod, CliCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 100);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 4);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 4);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 4);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(19);
               ((java.util.Date[]) buf[21])[0] = GXutil.resetDate(rslt.getGXDateTime(20));
               ((java.util.Date[]) buf[22])[0] = GXutil.resetDate(rslt.getGXDateTime(21));
               ((String[]) buf[23])[0] = rslt.getString(22, 10);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(23);
               ((String[]) buf[25])[0] = rslt.getString(24, 10);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(25);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(26,2);
               ((String[]) buf[28])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((byte[]) buf[30])[0] = rslt.getByte(28);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(29, 20);
               ((int[]) buf[33])[0] = rslt.getInt(30);
               ((String[]) buf[34])[0] = rslt.getString(31, 13);
               ((String[]) buf[35])[0] = rslt.getString(32, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(33);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(34);
               ((String[]) buf[40])[0] = rslt.getString(35, 13);
               ((String[]) buf[41])[0] = rslt.getString(36, 30);
               ((String[]) buf[42])[0] = rslt.getString(37, 26);
               ((String[]) buf[43])[0] = rslt.getString(38, 16);
               ((String[]) buf[44])[0] = rslt.getString(39, 30);
               ((int[]) buf[45])[0] = rslt.getInt(40);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

