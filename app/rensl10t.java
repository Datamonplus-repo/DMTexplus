package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rensl10t extends GXReport
{
   public rensl10t( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rensl10t.class ), "" );
   }

   public rensl10t( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] AV111Tab_opcion )
   {
      rensl10t.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, AV111Tab_opcion, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] AV111Tab_opcion ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, AV111Tab_opcion, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] AV111Tab_opcion ,
                             String[] aP4 )
   {
      rensl10t.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rensl10t.this.AV65Lb_numero = aP1[0];
      this.aP1 = aP1;
      rensl10t.this.AV109Num_opc = aP2[0];
      this.aP2 = aP2;
      rensl10t.this.AV111Tab_opcion = AV111Tab_opcion;
      rensl10t.this.AV122Pp = aP4[0];
      this.aP4 = aP4;
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
         getPrinter().GxSetDocName("HOJA DE OPCIONES DE ENSAYO") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_int1 = AV152Pt ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100001", GXv_int2) ;
         rensl10t.this.GXt_int1 = GXv_int2[0] ;
         AV152Pt = GXt_int1 ;
         GXv_char3[0] = AV48Contdsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS010", ""), GXv_char3) ;
         rensl10t.this.AV48Contdsc = GXv_char3[0] ;
         GXt_int1 = AV157Erfoc ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int2) ;
         rensl10t.this.GXt_int1 = GXv_int2[0] ;
         AV157Erfoc = GXt_int1 ;
         GXt_int1 = AV179Carvema ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
         rensl10t.this.GXt_int1 = GXv_int2[0] ;
         AV179Carvema = GXt_int1 ;
         if ( AV152Pt == 1 )
         {
            AV151Contdsc_i = AV48Contdsc ;
            AV48Contdsc = "" ;
         }
         GXv_int2[0] = AV124Artextil ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int2) ;
         rensl10t.this.AV124Artextil = GXv_int2[0] ;
         GXv_int2[0] = AV178Colorsol ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLORS", ""), GXv_int2) ;
         rensl10t.this.AV178Colorsol = GXv_int2[0] ;
         GXt_char4 = AV19Lit1 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV19Lit1 = GXt_char4 ;
         GXt_char4 = AV20Lit2 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV20Lit2 = GXt_char4 ;
         AV21Lit3 = GXutil.trim( AV19Lit1) + "-" + GXutil.trim( AV20Lit2) ;
         GXt_char4 = AV22Lit4 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT305_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV22Lit4 = GXt_char4 ;
         GXt_char4 = AV23Lit5 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV23Lit5 = GXt_char4 ;
         GXt_char4 = AV24Lit6 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL120_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV24Lit6 = GXt_char4 ;
         if ( GXutil.strcmp(AV24Lit6, httpContext.getMessage( "WCFL120_", "")) == 0 )
         {
            GXt_char4 = AV24Lit6 ;
            GXv_char3[0] = GXt_char4 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char3) ;
            rensl10t.this.GXt_char4 = GXv_char3[0] ;
            AV24Lit6 = GXt_char4 ;
         }
         GXt_char4 = AV25Lit7 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV25Lit7 = GXt_char4 ;
         GXt_char4 = AV26Lit8 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV26Lit8 = GXt_char4 ;
         GXt_char4 = AV27Lit9 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV27Lit9 = GXt_char4 ;
         GXt_char4 = AV28Lit10 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1194_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV28Lit10 = GXt_char4 ;
         GXt_char4 = AV29Lit11 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN236", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV29Lit11 = GXt_char4 ;
         GXt_char4 = AV30Lit12 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1164_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV30Lit12 = GXt_char4 ;
         GXt_char4 = AV31Lit13 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV31Lit13 = GXt_char4 ;
         AV32Lit14 = httpContext.getMessage( "Productos", "") ;
         GXt_char4 = AV33Lit15 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1160_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV33Lit15 = GXt_char4 ;
         GXt_char4 = AV34Lit16 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN176", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV34Lit16 = GXt_char4 ;
         GXt_char4 = AV35Lit17 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN079_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV35Lit17 = GXt_char4 ;
         GXt_char4 = AV36Lit18 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1134_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV36Lit18 = GXt_char4 ;
         GXt_char4 = AV37Lit19 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN237", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV37Lit19 = GXutil.trim( GXt_char4) ;
         GXt_char4 = AV38Lit20 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN037", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV38Lit20 = GXutil.trim( GXt_char4) ;
         AV38Lit20 = GXutil.substring( AV38Lit20, 1, 8) ;
         GXt_char4 = AV39Lit21 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN238", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV39Lit21 = GXutil.trim( GXt_char4) ;
         GXt_char4 = AV41Lit22 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV41Lit22 = GXt_char4 ;
         GXt_char4 = AV42Lit23 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1217_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV42Lit23 = GXt_char4 ;
         GXt_char4 = AV43Lit24 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN208", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         AV43Lit24 = GXt_char4 ;
         GXt_char4 = AV49Lit25 ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1376_", ""), (byte)(99), GXv_char3) ;
         rensl10t.this.GXt_char4 = GXv_char3[0] ;
         GXt_char5 = AV49Lit25 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char6) ;
         rensl10t.this.GXt_char5 = GXv_char6[0] ;
         AV49Lit25 = GXt_char4 + " " + GXt_char5 ;
         AV71Lit26 = httpContext.getMessage( "Nº IDM", "") ;
         GXt_char5 = AV72Lit27 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char6) ;
         rensl10t.this.GXt_char5 = GXv_char6[0] ;
         AV72Lit27 = GXutil.trim( GXt_char5) + " " + httpContext.getMessage( "Ent.", "") ;
         GXt_char5 = AV73Lit28 ;
         GXv_char6[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char6) ;
         rensl10t.this.GXt_char5 = GXv_char6[0] ;
         AV73Lit28 = GXutil.trim( GXt_char5) + " " + httpContext.getMessage( "Mod.", "") ;
         AV180Txt2 = ((AV178Colorsol==0) ? httpContext.getMessage( "DESC ARTICULO", "") : httpContext.getMessage( "ARTICULO", "")) ;
         /* Using cursor P07K22 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07K22_A407EmprNom[0] ;
            n407EmprNom = P07K22_n407EmprNom[0] ;
            AV18EmprNOm = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV110x = (short)(1) ;
         AV113Numero_v = (short)(1) ;
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV114Tab_opcii[GX_I-1] = " " ;
            GX_I = (int)(GX_I+1) ;
         }
         AV50Opcion = (byte)(1) ;
         while ( AV110x <= AV109Num_opc )
         {
            if ( AV113Numero_v > 9 )
            {
               /* Execute user subroutine: 'EMPIEZA' */
               S111 ();
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
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
               AV113Numero_v = (short)(1) ;
               GX_I = 1 ;
               while ( GX_I <= 100 )
               {
                  AV114Tab_opcii[GX_I-1] = " " ;
                  GX_I = (int)(GX_I+1) ;
               }
               AV50Opcion = (byte)(1) ;
            }
            AV112Lb_opcioni = AV111Tab_opcion[AV110x-1] ;
            /* Using cursor P07K23 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV65Lb_numero), AV112Lb_opcioni});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A5555Lb_opcion = P07K23_A5555Lb_opcion[0] ;
               A5532Lb_numero = P07K23_A5532Lb_numero[0] ;
               A6056Lb_pesom = P07K23_A6056Lb_pesom[0] ;
               A6057Lb_volum = P07K23_A6057Lb_volum[0] ;
               A6056Lb_pesom = P07K23_A6056Lb_pesom[0] ;
               A6057Lb_volum = P07K23_A6057Lb_volum[0] ;
               AV62Workstat = GXutil.str( A5532Lb_numero, 8, 0) + A5555Lb_opcion ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A5532Lb_numero ;
               GXv_char3[0] = A5555Lb_opcion ;
               GXv_decimal8[0] = A6056Lb_pesom ;
               GXv_decimal9[0] = A6057Lb_volum ;
               GXv_char10[0] = " " ;
               GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
               GXv_int12[0] = AV103Num_orden ;
               new app.pens035(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char3, GXv_decimal8, GXv_decimal9, GXv_char10, GXv_decimal11, GXv_int12) ;
               rensl10t.this.A396EmprCod = GXv_char6[0] ;
               rensl10t.this.A5532Lb_numero = GXv_int7[0] ;
               rensl10t.this.A5555Lb_opcion = GXv_char3[0] ;
               rensl10t.this.A6056Lb_pesom = GXv_decimal8[0] ;
               rensl10t.this.A6057Lb_volum = GXv_decimal9[0] ;
               rensl10t.this.AV103Num_orden = GXv_int12[0] ;
               AV114Tab_opcii[AV50Opcion-1] = A5555Lb_opcion ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            AV110x = (short)(AV110x+1) ;
            AV113Numero_v = (short)(AV113Numero_v+1) ;
            AV50Opcion = (byte)(AV50Opcion+1) ;
         }
         /* Execute user subroutine: 'EMPIEZA' */
         S111 ();
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
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7K20( true, 0) ;
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
      /* 'EMPIEZA' Routine */
      returnInSub = false ;
      GxHdr5 = true ;
      /* Using cursor P07K24 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV65Lb_numero)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A5548Lb_Obs = P07K24_A5548Lb_Obs[0] ;
         A1514MacProCod = P07K24_A1514MacProCod[0] ;
         n1514MacProCod = P07K24_n1514MacProCod[0] ;
         A5532Lb_numero = P07K24_A5532Lb_numero[0] ;
         A5535Lb_TipArt = P07K24_A5535Lb_TipArt[0] ;
         A5533Lb_ArtCod = P07K24_A5533Lb_ArtCod[0] ;
         A5534Lb_ArtDsc = P07K24_A5534Lb_ArtDsc[0] ;
         A5595Lb_malha = P07K24_A5595Lb_malha[0] ;
         A5570Lb_Tipo = P07K24_A5570Lb_Tipo[0] ;
         A252CliCod = P07K24_A252CliCod[0] ;
         A5700Lb_Talao = P07K24_A5700Lb_Talao[0] ;
         A5541Lb_FechaE = P07K24_A5541Lb_FechaE[0] ;
         A5547Lb_Rb = P07K24_A5547Lb_Rb[0] ;
         A6056Lb_pesom = P07K24_A6056Lb_pesom[0] ;
         A6057Lb_volum = P07K24_A6057Lb_volum[0] ;
         A1515MacProDsc = P07K24_A1515MacProDsc[0] ;
         A7780Lb_Hila = P07K24_A7780Lb_Hila[0] ;
         A5540Lb_Cartaz = P07K24_A5540Lb_Cartaz[0] ;
         A5537Lb_ColNum = P07K24_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P07K24_A5536Lb_ColNom[0] ;
         A279CliNom = P07K24_A279CliNom[0] ;
         A279CliNom = P07K24_A279CliNom[0] ;
         A1515MacProDsc = P07K24_A1515MacProDsc[0] ;
         AV181ArtDsc = ((AV178Colorsol==0) ? A5534Lb_ArtDsc : A5533Lb_ArtCod) ;
         AV129Lb_obs = A5548Lb_Obs ;
         AV125v_desc = " " ;
         AV126Prof = " " ;
         /* Using cursor P07K25 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A5553Lb_ForCod = P07K25_A5553Lb_ForCod[0] ;
            A5551Lb_lineaPq = P07K25_A5551Lb_lineaPq[0] ;
            /* Using cursor P07K26 */
            pr_default.execute(4, new Object[] {A396EmprCod, A5553Lb_ForCod});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A764ProForCod = P07K26_A764ProForCod[0] ;
               A5523ProForTip = P07K26_A5523ProForTip[0] ;
               A766ProForDsc = P07K26_A766ProForDsc[0] ;
               if ( GXutil.strcmp(A5523ProForTip, httpContext.getMessage( "P", "")) == 0 )
               {
                  AV126Prof = A764ProForCod ;
                  AV125v_desc = A766ProForDsc ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(4);
            pr_default.readNext(3);
         }
         pr_default.close(3);
         if ( A5595Lb_malha == 1 )
         {
            AV40Texto_m = httpContext.getMessage( "Cliente", "") ;
         }
         else if ( A5595Lb_malha == 2 )
         {
            AV40Texto_m = httpContext.getMessage( "Producción", "") ;
         }
         else if ( A5595Lb_malha == 3 )
         {
            AV40Texto_m = httpContext.getMessage( "Provisional", "") ;
         }
         else if ( A5595Lb_malha == 4 )
         {
            AV40Texto_m = httpContext.getMessage( "En espera", "") ;
         }
         else
         {
            AV40Texto_m = "" ;
         }
         if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "C", "")) == 0 )
         {
            AV44Texto_e = httpContext.getMessage( "CONTRATIPO", "") ;
         }
         else if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "P", "")) == 0 )
         {
            AV44Texto_e = httpContext.getMessage( "PRODUCCION", "") ;
         }
         else if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "M", "")) == 0 )
         {
            AV44Texto_e = httpContext.getMessage( "MUESTRARIO", "") ;
         }
         else if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "R", "")) == 0 )
         {
            AV44Texto_e = httpContext.getMessage( "REOPERADOS", "") ;
         }
         else
         {
            AV44Texto_e = "" ;
         }
         AV45CliCod = A252CliCod ;
         AV46Lb_artcod = A5533Lb_ArtCod ;
         /* Execute user subroutine: 'ARTICU' */
         S125 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'CARGO' */
         S135 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV8i = (short)(1) ;
         AV63ProForCod = "" ;
         AV66TxtProceso = (byte)(0) ;
         AV94Salto_p = (byte)(0) ;
         AV96LastWork = (byte)(0) ;
         AV97Num_w = (short)(0) ;
         AV105Escordn = (short)(0) ;
         AV98Num_Op = (short)(1) ;
         AV106Num_ctrl = (short)(0) ;
         while ( AV8i <= AV53Lin )
         {
            AV50Opcion = (byte)(AV98Num_Op) ;
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV9Ensayo[GX_I-1] = (byte)(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV57Cantidad[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV55Unidad[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV77Pipetar[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV168Op1 = " " ;
            AV169Op2 = " " ;
            AV170Op3 = " " ;
            AV171Op4 = " " ;
            AV172Op5 = " " ;
            AV173Op6 = " " ;
            AV174Op7 = " " ;
            AV175Op8 = " " ;
            AV176Op9 = " " ;
            AV177Op10 = " " ;
            AV79Ensayo1 = (byte)(0) ;
            AV84Cant1 = DecimalUtil.doubleToDec(0) ;
            AV89Uni1 = " " ;
            AV80Ensayo2 = (byte)(0) ;
            AV85Cant2 = DecimalUtil.doubleToDec(0) ;
            AV93Uni2 = " " ;
            AV81Ensayo3 = (byte)(0) ;
            AV86Cant3 = DecimalUtil.doubleToDec(0) ;
            AV90Uni3 = " " ;
            AV83Ensayo4 = (byte)(0) ;
            AV87Cant4 = DecimalUtil.doubleToDec(0) ;
            AV91Uni4 = " " ;
            AV82Ensayo5 = (byte)(0) ;
            AV88Cant5 = DecimalUtil.doubleToDec(0) ;
            AV92Uni5 = " " ;
            AV102Ensayo6 = (byte)(0) ;
            AV100Cant6 = DecimalUtil.doubleToDec(0) ;
            AV101Uni6 = " " ;
            AV131Ensayo7 = (byte)(0) ;
            AV135Cant7 = DecimalUtil.doubleToDec(0) ;
            AV139Uni7 = " " ;
            AV132Ensayo8 = (byte)(0) ;
            AV136Cant8 = DecimalUtil.doubleToDec(0) ;
            AV140Uni8 = " " ;
            AV133Ensayo9 = (byte)(0) ;
            AV137Cant9 = DecimalUtil.doubleToDec(0) ;
            AV141Uni9 = " " ;
            AV134Ensayo10 = (byte)(0) ;
            AV138Cant10 = DecimalUtil.doubleToDec(0) ;
            AV142Uni10 = " " ;
            AV116Pp1 = DecimalUtil.doubleToDec(0) ;
            AV117Pp2 = DecimalUtil.doubleToDec(0) ;
            AV118Pp3 = DecimalUtil.doubleToDec(0) ;
            AV119Pp4 = DecimalUtil.doubleToDec(0) ;
            AV120Pp5 = DecimalUtil.doubleToDec(0) ;
            AV121Pp6 = DecimalUtil.doubleToDec(0) ;
            AV143Pp7 = DecimalUtil.doubleToDec(0) ;
            AV144Pp8 = DecimalUtil.doubleToDec(0) ;
            AV145Pp9 = DecimalUtil.doubleToDec(0) ;
            AV146Pp10 = DecimalUtil.doubleToDec(0) ;
            AV158EnsCost1 = "" ;
            AV78Num_colum = (short)(1) ;
            while ( AV50Opcion <= 9 )
            {
               if ( AV78Num_colum == 1 )
               {
                  AV79Ensayo1 = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV168Op1 = AV95Tab_op[AV8i-1][AV50Opcion-1] ;
                  AV84Cant1 = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV89Uni1 = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  if ( AV84Cant1.doubleValue() == 0 )
                  {
                     AV89Uni1 = GXutil.space( (short)(2)) ;
                  }
                  AV116Pp1 = AV115Tab_pp[AV8i-1][AV50Opcion-1] ;
                  if ( ( AV157Erfoc == 1 ) || ( AV179Carvema == 1 ) )
                  {
                     AV156Cost95 = AV154Tab_Cost[AV8i-1][AV50Opcion-1] ;
                     AV166OpN = AV79Ensayo1 ;
                     /* Execute user subroutine: 'LETRA' */
                     S145 ();
                     if ( returnInSub )
                     {
                        pr_default.close(2);
                        pr_default.close(2);
                        pr_default.close(2);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        if (true) return;
                     }
                     if ( AV156Cost95.doubleValue() > 0 )
                     {
                        AV158EnsCost1 = AV167OpA + "/" + GXutil.str( AV156Cost95, 9, 5) ;
                     }
                     else
                     {
                        AV158EnsCost1 = AV167OpA ;
                     }
                  }
                  else
                  {
                     AV158EnsCost1 = ((AV79Ensayo1>0) ? GXutil.str( AV79Ensayo1, 2, 0) : " ") ;
                  }
               }
               if ( AV78Num_colum == 2 )
               {
                  AV80Ensayo2 = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV169Op2 = AV95Tab_op[AV8i-1][AV50Opcion-1] ;
                  AV85Cant2 = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV93Uni2 = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  if ( AV85Cant2.doubleValue() == 0 )
                  {
                     AV93Uni2 = GXutil.space( (short)(2)) ;
                  }
                  AV117Pp2 = AV115Tab_pp[AV8i-1][AV50Opcion-1] ;
                  if ( ( AV157Erfoc == 1 ) || ( AV179Carvema == 1 ) )
                  {
                     AV156Cost95 = AV154Tab_Cost[AV8i-1][AV50Opcion-1] ;
                     AV166OpN = AV80Ensayo2 ;
                     /* Execute user subroutine: 'LETRA' */
                     S145 ();
                     if ( returnInSub )
                     {
                        pr_default.close(2);
                        pr_default.close(2);
                        pr_default.close(2);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        if (true) return;
                     }
                     if ( AV156Cost95.doubleValue() > 0 )
                     {
                        AV155EnsCost2 = AV167OpA + "/" + GXutil.str( AV156Cost95, 9, 5) ;
                     }
                     else
                     {
                        AV155EnsCost2 = AV167OpA ;
                     }
                  }
                  else
                  {
                     AV155EnsCost2 = ((AV80Ensayo2>0) ? GXutil.str( AV80Ensayo2, 2, 0) : " ") ;
                  }
               }
               if ( AV78Num_colum == 3 )
               {
                  AV81Ensayo3 = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV170Op3 = AV95Tab_op[AV8i-1][AV50Opcion-1] ;
                  AV86Cant3 = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV90Uni3 = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  if ( AV86Cant3.doubleValue() == 0 )
                  {
                     AV90Uni3 = GXutil.space( (short)(2)) ;
                  }
                  AV118Pp3 = AV115Tab_pp[AV8i-1][AV50Opcion-1] ;
                  if ( ( AV157Erfoc == 1 ) || ( AV179Carvema == 1 ) )
                  {
                     AV156Cost95 = AV154Tab_Cost[AV8i-1][AV50Opcion-1] ;
                     AV166OpN = AV81Ensayo3 ;
                     /* Execute user subroutine: 'LETRA' */
                     S145 ();
                     if ( returnInSub )
                     {
                        pr_default.close(2);
                        pr_default.close(2);
                        pr_default.close(2);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        if (true) return;
                     }
                     if ( AV156Cost95.doubleValue() > 0 )
                     {
                        AV159EnsCost3 = AV167OpA + "/" + GXutil.str( AV156Cost95, 9, 5) ;
                     }
                     else
                     {
                        AV159EnsCost3 = AV167OpA ;
                     }
                  }
                  else
                  {
                     AV159EnsCost3 = ((AV81Ensayo3>0) ? GXutil.str( AV81Ensayo3, 2, 0) : " ") ;
                  }
               }
               if ( AV78Num_colum == 4 )
               {
                  AV83Ensayo4 = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV171Op4 = AV95Tab_op[AV8i-1][AV50Opcion-1] ;
                  AV87Cant4 = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV91Uni4 = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  if ( AV87Cant4.doubleValue() == 0 )
                  {
                     AV91Uni4 = GXutil.space( (short)(2)) ;
                  }
                  AV119Pp4 = AV115Tab_pp[AV8i-1][AV50Opcion-1] ;
                  if ( ( AV157Erfoc == 1 ) || ( AV179Carvema == 1 ) )
                  {
                     AV156Cost95 = AV154Tab_Cost[AV8i-1][AV50Opcion-1] ;
                     AV166OpN = AV83Ensayo4 ;
                     /* Execute user subroutine: 'LETRA' */
                     S145 ();
                     if ( returnInSub )
                     {
                        pr_default.close(2);
                        pr_default.close(2);
                        pr_default.close(2);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        if (true) return;
                     }
                     if ( AV156Cost95.doubleValue() > 0 )
                     {
                        AV160EnsCost4 = AV167OpA + "/" + GXutil.str( AV156Cost95, 9, 5) ;
                     }
                     else
                     {
                        AV160EnsCost4 = AV167OpA ;
                     }
                  }
                  else
                  {
                     AV160EnsCost4 = ((AV83Ensayo4>0) ? GXutil.str( AV83Ensayo4, 2, 0) : " ") ;
                  }
               }
               if ( AV78Num_colum == 5 )
               {
                  if ( AV88Cant5.doubleValue() == 0 )
                  {
                     AV92Uni5 = GXutil.space( (short)(2)) ;
                  }
                  AV82Ensayo5 = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV172Op5 = AV95Tab_op[AV8i-1][AV50Opcion-1] ;
                  AV88Cant5 = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV92Uni5 = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  AV120Pp5 = AV115Tab_pp[AV8i-1][AV50Opcion-1] ;
                  if ( ( AV157Erfoc == 1 ) || ( AV179Carvema == 1 ) )
                  {
                     AV156Cost95 = AV154Tab_Cost[AV8i-1][AV50Opcion-1] ;
                     AV166OpN = AV82Ensayo5 ;
                     /* Execute user subroutine: 'LETRA' */
                     S145 ();
                     if ( returnInSub )
                     {
                        pr_default.close(2);
                        pr_default.close(2);
                        pr_default.close(2);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        if (true) return;
                     }
                     if ( AV156Cost95.doubleValue() > 0 )
                     {
                        AV161EnsCost5 = AV167OpA + "/" + GXutil.str( AV156Cost95, 9, 5) ;
                     }
                     else
                     {
                        AV161EnsCost5 = AV167OpA ;
                     }
                  }
                  else
                  {
                     AV161EnsCost5 = ((AV82Ensayo5>0) ? GXutil.str( AV82Ensayo5, 2, 0) : " ") ;
                  }
               }
               if ( AV78Num_colum == 6 )
               {
                  AV102Ensayo6 = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV173Op6 = AV95Tab_op[AV8i-1][AV50Opcion-1] ;
                  AV100Cant6 = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV101Uni6 = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  AV121Pp6 = AV115Tab_pp[AV8i-1][AV50Opcion-1] ;
                  if ( ( AV157Erfoc == 1 ) || ( AV179Carvema == 1 ) )
                  {
                     AV156Cost95 = AV154Tab_Cost[AV8i-1][AV50Opcion-1] ;
                     AV166OpN = AV102Ensayo6 ;
                     /* Execute user subroutine: 'LETRA' */
                     S145 ();
                     if ( returnInSub )
                     {
                        pr_default.close(2);
                        pr_default.close(2);
                        pr_default.close(2);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        if (true) return;
                     }
                     if ( AV156Cost95.doubleValue() > 0 )
                     {
                        AV162EnsCost6 = AV167OpA + "/" + GXutil.str( AV156Cost95, 9, 5) ;
                     }
                     else
                     {
                        AV162EnsCost6 = AV167OpA ;
                     }
                  }
                  else
                  {
                     AV162EnsCost6 = ((AV102Ensayo6>0) ? GXutil.str( AV102Ensayo6, 2, 0) : " ") ;
                  }
               }
               if ( AV78Num_colum == 7 )
               {
                  AV131Ensayo7 = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV174Op7 = AV95Tab_op[AV8i-1][AV50Opcion-1] ;
                  AV135Cant7 = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV139Uni7 = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  AV143Pp7 = AV115Tab_pp[AV8i-1][AV50Opcion-1] ;
                  if ( ( AV157Erfoc == 1 ) || ( AV179Carvema == 1 ) )
                  {
                     AV156Cost95 = AV154Tab_Cost[AV8i-1][AV50Opcion-1] ;
                     AV166OpN = AV131Ensayo7 ;
                     /* Execute user subroutine: 'LETRA' */
                     S145 ();
                     if ( returnInSub )
                     {
                        pr_default.close(2);
                        pr_default.close(2);
                        pr_default.close(2);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        if (true) return;
                     }
                     if ( AV156Cost95.doubleValue() > 0 )
                     {
                        AV163EnsCost7 = AV167OpA + "/" + GXutil.str( AV156Cost95, 9, 5) ;
                     }
                     else
                     {
                        AV163EnsCost7 = AV167OpA ;
                     }
                  }
                  else
                  {
                     AV163EnsCost7 = ((AV131Ensayo7>0) ? GXutil.str( AV131Ensayo7, 2, 0) : " ") ;
                  }
               }
               if ( AV78Num_colum == 8 )
               {
                  AV132Ensayo8 = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV175Op8 = AV95Tab_op[AV8i-1][AV50Opcion-1] ;
                  AV136Cant8 = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV140Uni8 = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  AV144Pp8 = AV115Tab_pp[AV8i-1][AV50Opcion-1] ;
                  if ( ( AV157Erfoc == 1 ) || ( AV179Carvema == 1 ) )
                  {
                     AV156Cost95 = AV154Tab_Cost[AV8i-1][AV50Opcion-1] ;
                     AV166OpN = AV132Ensayo8 ;
                     /* Execute user subroutine: 'LETRA' */
                     S145 ();
                     if ( returnInSub )
                     {
                        pr_default.close(2);
                        pr_default.close(2);
                        pr_default.close(2);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        if (true) return;
                     }
                     if ( AV156Cost95.doubleValue() > 0 )
                     {
                        AV164EnsCost8 = AV167OpA + "/" + GXutil.str( AV156Cost95, 9, 5) ;
                     }
                     else
                     {
                        AV164EnsCost8 = AV167OpA ;
                     }
                  }
                  else
                  {
                     AV164EnsCost8 = ((AV132Ensayo8>0) ? GXutil.str( AV132Ensayo8, 2, 0) : " ") ;
                  }
               }
               if ( AV78Num_colum == 9 )
               {
                  AV133Ensayo9 = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV176Op9 = AV95Tab_op[AV8i-1][AV50Opcion-1] ;
                  AV137Cant9 = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV141Uni9 = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  AV145Pp9 = AV115Tab_pp[AV8i-1][AV50Opcion-1] ;
                  if ( ( AV157Erfoc == 1 ) || ( AV179Carvema == 1 ) )
                  {
                     AV156Cost95 = AV154Tab_Cost[AV8i-1][AV50Opcion-1] ;
                     AV166OpN = AV133Ensayo9 ;
                     /* Execute user subroutine: 'LETRA' */
                     S145 ();
                     if ( returnInSub )
                     {
                        pr_default.close(2);
                        pr_default.close(2);
                        pr_default.close(2);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        if (true) return;
                     }
                     if ( AV156Cost95.doubleValue() > 0 )
                     {
                        AV165EnsCost9 = AV167OpA + "/" + GXutil.str( AV156Cost95, 9, 5) ;
                     }
                     else
                     {
                        AV165EnsCost9 = AV167OpA ;
                     }
                  }
                  else
                  {
                     AV165EnsCost9 = ((AV133Ensayo9>0) ? GXutil.str( AV133Ensayo9, 2, 0) : " ") ;
                  }
               }
               AV50Opcion = (byte)(AV50Opcion+1) ;
               AV78Num_colum = (short)(AV78Num_colum+1) ;
            }
            if ( GXutil.strcmp(AV63ProForCod, AV69Tab_Pro[AV8i-1]) != 0 )
            {
               AV63ProForCod = AV69Tab_Pro[AV8i-1] ;
               /* Execute user subroutine: 'PROCESO' */
               S155 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(2);
                  pr_default.close(2);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  if (true) return;
               }
               /* Execute user subroutine: 'LINEA_PROCESO' */
               S165 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(2);
                  pr_default.close(2);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  if (true) return;
               }
            }
            if ( AV8i == 1 )
            {
               /* Execute user subroutine: 'CAB_LINEA' */
               S175 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(2);
                  pr_default.close(2);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  if (true) return;
               }
            }
            if ( ( GXutil.strcmp(GXutil.substring( AV58Tab_Prd[AV8i-1], 1, 1), GXutil.substring( AV17PrdNumi, 1, 1)) != 0 ) && ! (GXutil.strcmp("", AV17PrdNumi)==0) )
            {
               h7K20( false, 1) ;
               getPrinter().GxDrawLine(8, Gx_line+0, 1100, Gx_line+0, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+1) ;
            }
            AV54Produc = AV58Tab_Prd[AV8i-1] ;
            AV52PrdDsc = AV59Tab_Prn[AV8i-1] ;
            AV16Orden = AV60Tab_Ord[AV8i-1] ;
            if ( GXutil.strcmp(AV67Tab_Tip[AV8i-1], httpContext.getMessage( "P", "")) == 0 )
            {
               h7K20( false, 22) ;
               getPrinter().GxAttris("Courier New", 8, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Produc, "")), 11, Gx_line+3, 55, Gx_line+19, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52PrdDsc, "")), 60, Gx_line+3, 251, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+0, 6, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(253, Gx_line+0, 253, Gx_line+22, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Cant1, "ZZZ.ZZZZZ")), 257, Gx_line+3, 324, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89Uni1, "")), 325, Gx_line+3, 341, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+21, 1098, Gx_line+21, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(344, Gx_line+0, 344, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV85Cant2, "ZZZ.ZZZZZ")), 349, Gx_line+3, 416, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93Uni2, "")), 419, Gx_line+3, 435, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(438, Gx_line+0, 438, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86Cant3, "ZZZ.ZZZZZ")), 444, Gx_line+3, 511, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Uni3, "")), 514, Gx_line+3, 530, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(534, Gx_line+0, 534, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87Cant4, "ZZZ.ZZZZZ")), 540, Gx_line+3, 607, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91Uni4, "")), 613, Gx_line+3, 629, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(632, Gx_line+0, 632, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88Cant5, "ZZZ.ZZZZZ")), 639, Gx_line+3, 706, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92Uni5, "")), 706, Gx_line+3, 722, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(1097, Gx_line+0, 1097, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV100Cant6, "ZZZ.ZZZZZ")), 729, Gx_line+3, 796, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Uni6, "")), 797, Gx_line+3, 813, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135Cant7, "ZZZ.ZZZZZ")), 821, Gx_line+3, 888, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV139Uni7, "")), 889, Gx_line+3, 905, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV136Cant8, "ZZZ.ZZZZZ")), 914, Gx_line+3, 981, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV140Uni8, "")), 981, Gx_line+3, 997, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(726, Gx_line+0, 726, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(817, Gx_line+0, 817, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(907, Gx_line+0, 907, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV137Cant9, "ZZZ.ZZZZZ")), 1006, Gx_line+3, 1073, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV141Uni9, "")), 1074, Gx_line+3, 1090, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(1002, Gx_line+0, 1002, Gx_line+22, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
            }
            else
            {
               h7K20( false, 22) ;
               getPrinter().GxDrawLine(6, Gx_line+0, 6, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+21, 1098, Gx_line+21, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Produc, "")), 11, Gx_line+3, 55, Gx_line+19, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52PrdDsc, "")), 60, Gx_line+4, 251, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(253, Gx_line+0, 253, Gx_line+22, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Cant1, "ZZZ.ZZZZZ")), 257, Gx_line+4, 324, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89Uni1, "")), 325, Gx_line+4, 341, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(344, Gx_line+0, 344, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV85Cant2, "ZZZ.ZZZZZ")), 349, Gx_line+4, 416, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93Uni2, "")), 419, Gx_line+4, 435, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(438, Gx_line+0, 438, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86Cant3, "ZZZ.ZZZZZ")), 444, Gx_line+4, 511, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Uni3, "")), 514, Gx_line+4, 530, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(534, Gx_line+0, 534, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87Cant4, "ZZZ.ZZZZZ")), 540, Gx_line+4, 607, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91Uni4, "")), 613, Gx_line+4, 629, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(632, Gx_line+0, 632, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88Cant5, "ZZZ.ZZZZZ")), 639, Gx_line+4, 706, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92Uni5, "")), 706, Gx_line+4, 722, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(726, Gx_line+0, 726, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV100Cant6, "ZZZ.ZZZZZ")), 729, Gx_line+4, 796, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Uni6, "")), 797, Gx_line+4, 813, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV135Cant7, "ZZZ.ZZZZZ")), 821, Gx_line+4, 888, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV139Uni7, "")), 889, Gx_line+4, 905, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV136Cant8, "ZZZ.ZZZZZ")), 914, Gx_line+4, 981, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV140Uni8, "")), 981, Gx_line+4, 997, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV137Cant9, "ZZZ.ZZZZZ")), 1006, Gx_line+4, 1073, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV141Uni9, "")), 1074, Gx_line+4, 1090, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(817, Gx_line+0, 817, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(907, Gx_line+0, 907, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1002, Gx_line+0, 1002, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1097, Gx_line+0, 1097, Gx_line+22, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
            }
            AV17PrdNumi = AV54Produc ;
            AV96LastWork = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
            AV8i = (short)(AV8i+1) ;
            AV61LinPag = (byte)(AV61LinPag+1) ;
            if ( AV61LinPag > 20 )
            {
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
               AV66TxtProceso = (byte)(0) ;
               /* Execute user subroutine: 'LINEA_PROCESO' */
               S165 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(2);
                  pr_default.close(2);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  if (true) return;
               }
               /* Execute user subroutine: 'CAB_LINEA' */
               S175 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(2);
                  pr_default.close(2);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      GxHdr5 = false ;
   }

   public void S125( ) throws ProcessInterruptedException
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV47Compo = "" ;
      AV127ArtFacAbs = DecimalUtil.doubleToDec(0) ;
      AV130ArtProcod = " " ;
      AV128Artfabst = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P07K27 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV45CliCod), AV46Lb_artcod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A829TipArtCod = P07K27_A829TipArtCod[0] ;
         A65ArtCod = P07K27_A65ArtCod[0] ;
         A252CliCod = P07K27_A252CliCod[0] ;
         A105ArtTra1 = P07K27_A105ArtTra1[0] ;
         n105ArtTra1 = P07K27_n105ArtTra1[0] ;
         A108ArtTraP1 = P07K27_A108ArtTraP1[0] ;
         n108ArtTraP1 = P07K27_n108ArtTraP1[0] ;
         A106ArtTra2 = P07K27_A106ArtTra2[0] ;
         n106ArtTra2 = P07K27_n106ArtTra2[0] ;
         A109ArtTraP2 = P07K27_A109ArtTraP2[0] ;
         n109ArtTraP2 = P07K27_n109ArtTraP2[0] ;
         A107ArtTra3 = P07K27_A107ArtTra3[0] ;
         n107ArtTra3 = P07K27_n107ArtTra3[0] ;
         A110ArtTraP3 = P07K27_A110ArtTraP3[0] ;
         n110ArtTraP3 = P07K27_n110ArtTraP3[0] ;
         A2791ArtFacAbs = P07K27_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = P07K27_n2791ArtFacAbs[0] ;
         A9801ArtFabsT = P07K27_A9801ArtFabsT[0] ;
         n9801ArtFabsT = P07K27_n9801ArtFabsT[0] ;
         A830TipArtDsc = P07K27_A830TipArtDsc[0] ;
         n830TipArtDsc = P07K27_n830TipArtDsc[0] ;
         A830TipArtDsc = P07K27_A830TipArtDsc[0] ;
         n830TipArtDsc = P07K27_n830TipArtDsc[0] ;
         if ( ! (GXutil.strcmp("", A105ArtTra1)==0) )
         {
            AV47Compo = GXutil.trim( A105ArtTra1) + " " + GXutil.trim( GXutil.str( A108ArtTraP1, 3, 0)) + "% " ;
            if ( ! (GXutil.strcmp("", A106ArtTra2)==0) )
            {
               AV47Compo += GXutil.trim( A106ArtTra2) + " " + GXutil.trim( GXutil.str( A109ArtTraP2, 3, 0)) + "% " ;
            }
            if ( ! (GXutil.strcmp("", A107ArtTra3)==0) )
            {
               AV47Compo += GXutil.trim( A107ArtTra3) + " " + GXutil.trim( GXutil.str( A110ArtTraP3, 3, 0)) + "% " ;
            }
         }
         AV127ArtFacAbs = A2791ArtFacAbs ;
         if ( A9801ArtFabsT.doubleValue() > 0 )
         {
            AV128Artfabst = A9801ArtFabsT ;
         }
         /* Using cursor P07K28 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A4903FasAcab = P07K28_A4903FasAcab[0] ;
            n4903FasAcab = P07K28_n4903FasAcab[0] ;
            A4286FasForMul = P07K28_A4286FasForMul[0] ;
            n4286FasForMul = P07K28_n4286FasForMul[0] ;
            A4898ArtProCod = P07K28_A4898ArtProCod[0] ;
            A4897ArtProLin = P07K28_A4897ArtProLin[0] ;
            A457FasCod = P07K28_A457FasCod[0] ;
            A758ProCod = P07K28_A758ProCod[0] ;
            A4903FasAcab = P07K28_A4903FasAcab[0] ;
            n4903FasAcab = P07K28_n4903FasAcab[0] ;
            A4286FasForMul = P07K28_A4286FasForMul[0] ;
            n4286FasForMul = P07K28_n4286FasForMul[0] ;
            if ( ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A4903FasAcab, httpContext.getMessage( "S", "")) == 0 ) )
            {
               AV130ArtProcod = A4898ArtProCod ;
            }
            pr_default.readNext(6);
         }
         pr_default.close(6);
         AV147TipARtdsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S155( ) throws ProcessInterruptedException
   {
      /* 'PROCESO' Routine */
      returnInSub = false ;
      AV70ProForDsc = "" ;
      /* Using cursor P07K29 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV63ProForCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A764ProForCod = P07K29_A764ProForCod[0] ;
         A766ProForDsc = P07K29_A766ProForDsc[0] ;
         AV70ProForDsc = A766ProForDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S165( ) throws ProcessInterruptedException
   {
      /* 'LINEA_PROCESO' Routine */
      returnInSub = false ;
      AV31Lit13 = "" ;
      if ( AV66TxtProceso == 0 )
      {
         GXt_char5 = AV31Lit13 ;
         GXv_char10[0] = GXt_char5 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(9), GXv_char10) ;
         rensl10t.this.GXt_char5 = GXv_char10[0] ;
         AV31Lit13 = GXt_char5 ;
      }
      AV66TxtProceso = (byte)(1) ;
      h7K20( false, 18) ;
      getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70ProForDsc, "")), 406, Gx_line+2, 563, Gx_line+18, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63ProForCod, "")), 271, Gx_line+2, 335, Gx_line+18, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(6, Gx_line+17, 1098, Gx_line+17, 1, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+18) ;
   }

   public void S175( ) throws ProcessInterruptedException
   {
      /* 'CAB_LINEA' Routine */
      returnInSub = false ;
      if ( AV178Colorsol == 0 )
      {
         h7K20( false, 19) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV158EnsCost1, "")), 274, Gx_line+2, 332, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(253, Gx_line+0, 253, Gx_line+18, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit14, "")), 43, Gx_line+2, 174, Gx_line+18, 1+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(6, Gx_line+0, 6, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(344, Gx_line+0, 344, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(438, Gx_line+0, 438, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(632, Gx_line+0, 632, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(6, Gx_line+0, 1098, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(534, Gx_line+0, 534, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(1097, Gx_line+0, 1097, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(726, Gx_line+0, 726, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(817, Gx_line+0, 817, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(907, Gx_line+0, 907, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(1002, Gx_line+0, 1002, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV155EnsCost2, "")), 363, Gx_line+2, 420, Gx_line+17, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV159EnsCost3, "")), 457, Gx_line+2, 515, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV160EnsCost4, "")), 555, Gx_line+2, 613, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV161EnsCost5, "")), 651, Gx_line+2, 709, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV162EnsCost6, "")), 744, Gx_line+2, 802, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV163EnsCost7, "")), 833, Gx_line+2, 891, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV164EnsCost8, "")), 926, Gx_line+2, 984, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV165EnsCost9, "")), 1022, Gx_line+2, 1080, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(6, Gx_line+17, 1098, Gx_line+17, 2, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+19) ;
      }
      else
      {
         h7K20( false, 19) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV168Op1, "")), 298, Gx_line+2, 309, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(253, Gx_line+0, 253, Gx_line+18, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit14, "")), 44, Gx_line+2, 175, Gx_line+18, 1+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(6, Gx_line+0, 6, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(344, Gx_line+0, 344, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(438, Gx_line+0, 438, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(632, Gx_line+0, 632, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(7, Gx_line+0, 1099, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(534, Gx_line+0, 534, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(1098, Gx_line+0, 1098, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(726, Gx_line+0, 726, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(817, Gx_line+0, 817, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(907, Gx_line+0, 907, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(1002, Gx_line+0, 1002, Gx_line+18, 2, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV169Op2, "")), 386, Gx_line+2, 397, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV170Op3, "")), 481, Gx_line+2, 492, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV171Op4, "")), 579, Gx_line+2, 590, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV172Op5, "")), 675, Gx_line+2, 686, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV173Op6, "")), 768, Gx_line+2, 779, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV174Op7, "")), 857, Gx_line+2, 868, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV175Op8, "")), 950, Gx_line+2, 961, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV176Op9, "")), 1046, Gx_line+2, 1057, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(7, Gx_line+17, 1099, Gx_line+17, 2, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+19) ;
      }
   }

   public void S135( ) throws ProcessInterruptedException
   {
      /* 'CARGO' Routine */
      returnInSub = false ;
      AV50Opcion = (byte)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 100 )
         {
            AV95Tab_op[GX_I-1][GX_J-1] = " " ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV15Tab_cos[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 100 )
         {
            AV10Tab_Opc[GX_I-1][GX_J-1] = (byte)(0) ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV58Tab_Prd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV59Tab_Prn[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 100 )
         {
            AV11Tab_Ctn[GX_I-1][GX_J-1] = DecimalUtil.doubleToDec(0) ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 100 )
         {
            AV76Tab_cant[GX_I-1][GX_J-1] = DecimalUtil.doubleToDec(0) ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV104Tab_orden[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 100 )
         {
            AV115Tab_pp[GX_I-1][GX_J-1] = DecimalUtil.doubleToDec(0) ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 100 )
         {
            AV154Tab_Cost[GX_I-1][GX_J-1] = DecimalUtil.doubleToDec(0) ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      while ( AV50Opcion <= 100 )
      {
         if ( GXutil.strcmp(AV114Tab_opcii[AV50Opcion-1], " ") == 0 )
         {
            if (true) break;
         }
         AV112Lb_opcioni = AV114Tab_opcii[AV50Opcion-1] ;
         /* Using cursor P07K210 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV65Lb_numero), AV112Lb_opcioni});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A5555Lb_opcion = P07K210_A5555Lb_opcion[0] ;
            A5532Lb_numero = P07K210_A5532Lb_numero[0] ;
            A5556Lb_UltLC = P07K210_A5556Lb_UltLC[0] ;
            A5718Lb_numop = P07K210_A5718Lb_numop[0] ;
            A5565Lb_CosteE = P07K210_A5565Lb_CosteE[0] ;
            AV13Lb_opcion = A5555Lb_opcion ;
            AV65Lb_numero = A5532Lb_numero ;
            AV68Lb_numop = A5718Lb_numop ;
            AV153Lb_costee = A5565Lb_CosteE ;
            /* Execute user subroutine: 'ESCMAN' */
            S1812 ();
            if ( returnInSub )
            {
               pr_default.close(8);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            AV50Opcion = (byte)(AV50Opcion+1) ;
            if ( AV50Opcion > 100 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo 100....", ""));
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
      }
   }

   public void S1812( ) throws ProcessInterruptedException
   {
      /* 'ESCMAN' Routine */
      returnInSub = false ;
      AV62Workstat = GXutil.str( AV65Lb_numero, 8, 0) + AV13Lb_opcion ;
      AV123Num_l = (short)(1) ;
      /* Using cursor P07K211 */
      pr_default.execute(9, new Object[] {A396EmprCod, AV62Workstat});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A910Workstat = P07K211_A910Workstat[0] ;
         A719PrdNum = P07K211_A719PrdNum[0] ;
         A897EscMDsc = P07K211_A897EscMDsc[0] ;
         A4709EscMMdlCod = P07K211_A4709EscMMdlCod[0] ;
         A4712EscMFacCon = P07K211_A4712EscMFacCon[0] ;
         A490ForPrdUMe = P07K211_A490ForPrdUMe[0] ;
         A890EscMCan = P07K211_A890EscMCan[0] ;
         A887EscMLin = P07K211_A887EscMLin[0] ;
         A764ProForCod = P07K211_A764ProForCod[0] ;
         A7583EscOrdn = P07K211_A7583EscOrdn[0] ;
         AV53Lin = AV123Num_l ;
         AV58Tab_Prd[AV53Lin-1] = A719PrdNum ;
         AV59Tab_Prn[AV53Lin-1] = A897EscMDsc ;
         AV67Tab_Tip[AV53Lin-1] = A4709EscMMdlCod ;
         AV69Tab_Pro[AV53Lin-1] = A764ProForCod ;
         AV95Tab_op[AV53Lin-1][AV50Opcion-1] = AV13Lb_opcion ;
         AV10Tab_Opc[AV53Lin-1][AV50Opcion-1] = AV68Lb_numop ;
         AV11Tab_Ctn[AV53Lin-1][AV50Opcion-1] = A4712EscMFacCon ;
         AV56Tab_Uni[AV53Lin-1][AV50Opcion-1] = " " ;
         if ( A490ForPrdUMe == 1 )
         {
            AV56Tab_Uni[AV53Lin-1][AV50Opcion-1] = httpContext.getMessage( "Gr", "") ;
         }
         if ( A490ForPrdUMe == 2 )
         {
            AV56Tab_Uni[AV53Lin-1][AV50Opcion-1] = httpContext.getMessage( "Cc", "") ;
         }
         if ( A490ForPrdUMe == 3 )
         {
            AV56Tab_Uni[AV53Lin-1][AV50Opcion-1] = "%" ;
         }
         AV76Tab_cant[AV53Lin-1][AV50Opcion-1] = A4712EscMFacCon ;
         AV60Tab_Ord[AV53Lin-1] = " " ;
         if ( GXutil.strcmp(GXutil.substring( A4709EscMMdlCod, 1, 1), "#") == 0 )
         {
            AV60Tab_Ord[AV53Lin-1] = GXutil.substring( A4709EscMMdlCod, 1, 3) ;
         }
         if ( GXutil.strcmp(AV122Pp, httpContext.getMessage( "S", "")) == 0 )
         {
            AV115Tab_pp[AV53Lin-1][AV50Opcion-1] = A890EscMCan ;
         }
         AV154Tab_Cost[AV53Lin-1][AV50Opcion-1] = AV153Lb_costee ;
         AV123Num_l = (short)(AV123Num_l+1) ;
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S145( ) throws ProcessInterruptedException
   {
      /* 'LETRA' Routine */
      returnInSub = false ;
      AV167OpA = "" ;
      /* Using cursor P07K212 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV65Lb_numero), Byte.valueOf(AV166OpN)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A5532Lb_numero = P07K212_A5532Lb_numero[0] ;
         A5718Lb_numop = P07K212_A5718Lb_numop[0] ;
         A5555Lb_opcion = P07K212_A5555Lb_opcion[0] ;
         AV167OpA = A5555Lb_opcion ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void h7K20( boolean bFoot ,
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
               AV148Nlin = (byte)(GXutil.gxmlines( AV129Lb_obs, (short)(62))) ;
               AV149g = (byte)(1) ;
               GX_I = 1 ;
               while ( GX_I <= 10 )
               {
                  AV150Tab_obs[GX_I-1] = "" ;
                  GX_I = (int)(GX_I+1) ;
               }
               while ( AV149g <= AV148Nlin )
               {
                  if ( AV149g > 10 )
                  {
                     if (true) break;
                  }
                  AV150Tab_obs[AV149g-1] = GXutil.gxgetmli( AV129Lb_obs, AV149g, (short)(62)) ;
                  AV149g = (byte)(AV149g+1) ;
               }
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PH INICIAL", ""), 38, Gx_line+3, 107, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PH FINAL", ""), 38, Gx_line+17, 97, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PH NEUTRALIZADO", ""), 38, Gx_line+30, 161, Gx_line+44, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PH JABONADO", ""), 38, Gx_line+44, 130, Gx_line+58, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(253, Gx_line+2, 253, Gx_line+59, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(344, Gx_line+2, 344, Gx_line+59, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(438, Gx_line+2, 438, Gx_line+59, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(534, Gx_line+2, 534, Gx_line+59, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(632, Gx_line+2, 632, Gx_line+59, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(726, Gx_line+2, 726, Gx_line+59, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+17, 1098, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+2, 6, Gx_line+59, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+30, 1098, Gx_line+30, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+44, 1098, Gx_line+44, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(5, Gx_line+58, 1097, Gx_line+58, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+2, 1098, Gx_line+2, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(817, Gx_line+2, 817, Gx_line+59, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(907, Gx_line+2, 907, Gx_line+59, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1002, Gx_line+2, 1002, Gx_line+59, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1097, Gx_line+2, 1097, Gx_line+59, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV150Tab_obs[1-1], "")), 189, Gx_line+60, 642, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV150Tab_obs[3-1], "")), 189, Gx_line+78, 642, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV150Tab_obs[2-1], "")), 646, Gx_line+60, 1099, Gx_line+77, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV150Tab_obs[4-1], "")), 646, Gx_line+78, 1099, Gx_line+95, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV151Contdsc_i, "")), 5, Gx_line+78, 131, Gx_line+96, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+95) ;
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
            if ( GxHdr5 )
            {
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N ENSAYO", ""), 11, Gx_line+27, 66, Gx_line+42, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 119, Gx_line+26, 178, Gx_line+43, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE", ""), 11, Gx_line+46, 58, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 119, Gx_line+46, 339, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DESC COLOR", ""), 11, Gx_line+65, 84, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5536Lb_ColNom, "")), 119, Gx_line+65, 215, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "COD COLOR", ""), 11, Gx_line+83, 79, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9")), 119, Gx_line+82, 164, Gx_line+99, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV181ArtDsc, "")), 119, Gx_line+119, 310, Gx_line+136, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "SDC", ""), 425, Gx_line+26, 449, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5540Lb_Cartaz, "")), 455, Gx_line+26, 602, Gx_line+43, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TIPO DE ENSAYO", ""), 358, Gx_line+46, 449, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Texto_e, "")), 455, Gx_line+46, 602, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "LOTE/GR/HDR-REOP", ""), 342, Gx_line+66, 449, Gx_line+81, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7780Lb_Hila, "")), 455, Gx_line+65, 602, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PREVIO", ""), 407, Gx_line+101, 449, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CURVA DE TEÑIDO", ""), 11, Gx_line+102, 110, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1515MacProDsc, "")), 119, Gx_line+101, 266, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RECETA ACAB", ""), 692, Gx_line+65, 771, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "VOLUMEN", ""), 393, Gx_line+119, 449, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PESO", ""), 741, Gx_line+26, 771, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RB", ""), 755, Gx_line+46, 771, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6057Lb_volum, "ZZZ9.99")), 455, Gx_line+119, 507, Gx_line+136, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6056Lb_pesom, "ZZZZ9.999")), 779, Gx_line+26, 846, Gx_line+43, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5547Lb_Rb, "ZZZ9.99")), 816, Gx_line+46, 868, Gx_line+63, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ILUMINANTES", ""), 695, Gx_line+82, 771, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ID DATACOLOR", ""), 688, Gx_line+101, 771, Gx_line+116, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "# TASK ID ROBOLAB", ""), 660, Gx_line+119, 770, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("_____________", 786, Gx_line+101, 882, Gx_line+115, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("_____________", 786, Gx_line+120, 882, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FICHA DE FORMULACION DE COLOR", ""), 324, Gx_line+4, 566, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+136, 1099, Gx_line+136, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "LABORATORISTA", ""), 149, Gx_line+138, 244, Gx_line+153, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV126Prof, "")), 455, Gx_line+101, 500, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FECHA ENTRADA", ""), 789, Gx_line+4, 903, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A5541Lb_FechaE, "99/99/99"), 947, Gx_line+4, 1006, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(253, Gx_line+136, 253, Gx_line+169, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(344, Gx_line+136, 344, Gx_line+169, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(438, Gx_line+136, 438, Gx_line+169, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(534, Gx_line+136, 534, Gx_line+169, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(632, Gx_line+136, 632, Gx_line+169, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(726, Gx_line+136, 726, Gx_line+169, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+152, 1099, Gx_line+152, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+169, 1099, Gx_line+169, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+136, 6, Gx_line+169, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5700Lb_Talao, "")), 786, Gx_line+82, 933, Gx_line+99, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV130ArtProcod, "")), 786, Gx_line+65, 845, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(817, Gx_line+136, 817, Gx_line+169, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(907, Gx_line+136, 907, Gx_line+169, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1002, Gx_line+136, 1002, Gx_line+169, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1097, Gx_line+136, 1097, Gx_line+169, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TIEMPO", ""), 200, Gx_line+153, 244, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Contdsc, "")), 11, Gx_line+4, 137, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+3, 1099, Gx_line+22, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(749, Gx_line+3, 749, Gx_line+22, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "COMPOSICION", ""), 368, Gx_line+83, 449, Gx_line+98, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147TipARtdsc, "")), 455, Gx_line+82, 675, Gx_line+99, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(884, Gx_line+23, 1098, Gx_line+136, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PREVIO", ""), 890, Gx_line+24, 948, Gx_line+42, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122Pp, "")), 281, Gx_line+4, 289, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV180Txt2, "")), 11, Gx_line+119, 85, Gx_line+135, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+170) ;
               AV61LinPag = (byte)(0) ;
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
      this.aP0[0] = rensl10t.this.A396EmprCod;
      this.aP1[0] = rensl10t.this.AV65Lb_numero;
      this.aP2[0] = rensl10t.this.AV109Num_opc;
      this.aP4[0] = rensl10t.this.AV122Pp;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV48Contdsc = "" ;
      AV151Contdsc_i = "" ;
      GXv_int2 = new byte[1] ;
      AV19Lit1 = "" ;
      AV20Lit2 = "" ;
      AV21Lit3 = "" ;
      AV22Lit4 = "" ;
      AV23Lit5 = "" ;
      AV24Lit6 = "" ;
      AV25Lit7 = "" ;
      AV26Lit8 = "" ;
      AV27Lit9 = "" ;
      AV28Lit10 = "" ;
      AV29Lit11 = "" ;
      AV30Lit12 = "" ;
      AV31Lit13 = "" ;
      AV32Lit14 = "" ;
      AV33Lit15 = "" ;
      AV34Lit16 = "" ;
      AV35Lit17 = "" ;
      AV36Lit18 = "" ;
      AV37Lit19 = "" ;
      AV38Lit20 = "" ;
      AV39Lit21 = "" ;
      AV41Lit22 = "" ;
      AV42Lit23 = "" ;
      AV43Lit24 = "" ;
      AV49Lit25 = "" ;
      GXt_char4 = "" ;
      AV71Lit26 = "" ;
      AV72Lit27 = "" ;
      AV73Lit28 = "" ;
      AV180Txt2 = "" ;
      scmdbuf = "" ;
      P07K22_A396EmprCod = new String[] {""} ;
      P07K22_A407EmprNom = new String[] {""} ;
      P07K22_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV18EmprNOm = "" ;
      AV114Tab_opcii = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV114Tab_opcii[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV112Lb_opcioni = "" ;
      P07K23_A396EmprCod = new String[] {""} ;
      P07K23_A5555Lb_opcion = new String[] {""} ;
      P07K23_A5532Lb_numero = new int[1] ;
      P07K23_A6056Lb_pesom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07K23_A6057Lb_volum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A5555Lb_opcion = "" ;
      A6056Lb_pesom = DecimalUtil.ZERO ;
      A6057Lb_volum = DecimalUtil.ZERO ;
      AV62Workstat = "" ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int12 = new short[1] ;
      P07K24_A5548Lb_Obs = new String[] {""} ;
      P07K24_A1514MacProCod = new String[] {""} ;
      P07K24_n1514MacProCod = new boolean[] {false} ;
      P07K24_A396EmprCod = new String[] {""} ;
      P07K24_A5532Lb_numero = new int[1] ;
      P07K24_A5535Lb_TipArt = new short[1] ;
      P07K24_A5533Lb_ArtCod = new String[] {""} ;
      P07K24_A5534Lb_ArtDsc = new String[] {""} ;
      P07K24_A5595Lb_malha = new byte[1] ;
      P07K24_A5570Lb_Tipo = new String[] {""} ;
      P07K24_A252CliCod = new int[1] ;
      P07K24_A5700Lb_Talao = new String[] {""} ;
      P07K24_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P07K24_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07K24_A6056Lb_pesom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07K24_A6057Lb_volum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07K24_A1515MacProDsc = new String[] {""} ;
      P07K24_A7780Lb_Hila = new String[] {""} ;
      P07K24_A5540Lb_Cartaz = new String[] {""} ;
      P07K24_A5537Lb_ColNum = new int[1] ;
      P07K24_A5536Lb_ColNom = new String[] {""} ;
      P07K24_A279CliNom = new String[] {""} ;
      A5548Lb_Obs = "" ;
      A1514MacProCod = "" ;
      A5533Lb_ArtCod = "" ;
      A5534Lb_ArtDsc = "" ;
      A5570Lb_Tipo = "" ;
      A5700Lb_Talao = "" ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A1515MacProDsc = "" ;
      A7780Lb_Hila = "" ;
      A5540Lb_Cartaz = "" ;
      A5536Lb_ColNom = "" ;
      A279CliNom = "" ;
      AV181ArtDsc = "" ;
      AV129Lb_obs = "" ;
      AV125v_desc = "" ;
      AV126Prof = "" ;
      P07K25_A396EmprCod = new String[] {""} ;
      P07K25_A5532Lb_numero = new int[1] ;
      P07K25_A5553Lb_ForCod = new String[] {""} ;
      P07K25_A5551Lb_lineaPq = new short[1] ;
      A5553Lb_ForCod = "" ;
      P07K26_A396EmprCod = new String[] {""} ;
      P07K26_A764ProForCod = new String[] {""} ;
      P07K26_A5523ProForTip = new String[] {""} ;
      P07K26_A766ProForDsc = new String[] {""} ;
      A764ProForCod = "" ;
      A5523ProForTip = "" ;
      A766ProForDsc = "" ;
      AV40Texto_m = "" ;
      AV44Texto_e = "" ;
      AV46Lb_artcod = "" ;
      AV63ProForCod = "" ;
      AV9Ensayo = new byte[10] ;
      AV57Cantidad = new java.math.BigDecimal[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV57Cantidad[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV55Unidad = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV55Unidad[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV77Pipetar = new java.math.BigDecimal[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV77Pipetar[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV168Op1 = "" ;
      AV169Op2 = "" ;
      AV170Op3 = "" ;
      AV171Op4 = "" ;
      AV172Op5 = "" ;
      AV173Op6 = "" ;
      AV174Op7 = "" ;
      AV175Op8 = "" ;
      AV176Op9 = "" ;
      AV177Op10 = "" ;
      AV84Cant1 = DecimalUtil.ZERO ;
      AV89Uni1 = "" ;
      AV85Cant2 = DecimalUtil.ZERO ;
      AV93Uni2 = "" ;
      AV86Cant3 = DecimalUtil.ZERO ;
      AV90Uni3 = "" ;
      AV87Cant4 = DecimalUtil.ZERO ;
      AV91Uni4 = "" ;
      AV88Cant5 = DecimalUtil.ZERO ;
      AV92Uni5 = "" ;
      AV100Cant6 = DecimalUtil.ZERO ;
      AV101Uni6 = "" ;
      AV135Cant7 = DecimalUtil.ZERO ;
      AV139Uni7 = "" ;
      AV136Cant8 = DecimalUtil.ZERO ;
      AV140Uni8 = "" ;
      AV137Cant9 = DecimalUtil.ZERO ;
      AV141Uni9 = "" ;
      AV138Cant10 = DecimalUtil.ZERO ;
      AV142Uni10 = "" ;
      AV116Pp1 = DecimalUtil.ZERO ;
      AV117Pp2 = DecimalUtil.ZERO ;
      AV118Pp3 = DecimalUtil.ZERO ;
      AV119Pp4 = DecimalUtil.ZERO ;
      AV120Pp5 = DecimalUtil.ZERO ;
      AV121Pp6 = DecimalUtil.ZERO ;
      AV143Pp7 = DecimalUtil.ZERO ;
      AV144Pp8 = DecimalUtil.ZERO ;
      AV145Pp9 = DecimalUtil.ZERO ;
      AV146Pp10 = DecimalUtil.ZERO ;
      AV158EnsCost1 = "" ;
      AV10Tab_Opc = new byte[100][100] ;
      AV95Tab_op = new String[100][100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 100 )
         {
            AV95Tab_op[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV11Tab_Ctn = new java.math.BigDecimal[100][100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 100 )
         {
            AV11Tab_Ctn[GX_I-1][GX_J-1] = DecimalUtil.ZERO ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV56Tab_Uni = new String[100][100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 100 )
         {
            AV56Tab_Uni[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV115Tab_pp = new java.math.BigDecimal[100][100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 100 )
         {
            AV115Tab_pp[GX_I-1][GX_J-1] = DecimalUtil.ZERO ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV156Cost95 = DecimalUtil.ZERO ;
      AV154Tab_Cost = new java.math.BigDecimal[100][100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 100 )
         {
            AV154Tab_Cost[GX_I-1][GX_J-1] = DecimalUtil.ZERO ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV167OpA = "" ;
      AV155EnsCost2 = "" ;
      AV159EnsCost3 = "" ;
      AV160EnsCost4 = "" ;
      AV161EnsCost5 = "" ;
      AV162EnsCost6 = "" ;
      AV163EnsCost7 = "" ;
      AV164EnsCost8 = "" ;
      AV165EnsCost9 = "" ;
      AV69Tab_Pro = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV69Tab_Pro[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV58Tab_Prd = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV58Tab_Prd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV17PrdNumi = "" ;
      AV54Produc = "" ;
      AV52PrdDsc = "" ;
      AV59Tab_Prn = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV59Tab_Prn[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV16Orden = "" ;
      AV60Tab_Ord = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV60Tab_Ord[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV67Tab_Tip = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV67Tab_Tip[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV47Compo = "" ;
      AV127ArtFacAbs = DecimalUtil.ZERO ;
      AV130ArtProcod = "" ;
      AV128Artfabst = DecimalUtil.ZERO ;
      P07K27_A829TipArtCod = new short[1] ;
      P07K27_A396EmprCod = new String[] {""} ;
      P07K27_A65ArtCod = new String[] {""} ;
      P07K27_A252CliCod = new int[1] ;
      P07K27_A105ArtTra1 = new String[] {""} ;
      P07K27_n105ArtTra1 = new boolean[] {false} ;
      P07K27_A108ArtTraP1 = new short[1] ;
      P07K27_n108ArtTraP1 = new boolean[] {false} ;
      P07K27_A106ArtTra2 = new String[] {""} ;
      P07K27_n106ArtTra2 = new boolean[] {false} ;
      P07K27_A109ArtTraP2 = new short[1] ;
      P07K27_n109ArtTraP2 = new boolean[] {false} ;
      P07K27_A107ArtTra3 = new String[] {""} ;
      P07K27_n107ArtTra3 = new boolean[] {false} ;
      P07K27_A110ArtTraP3 = new short[1] ;
      P07K27_n110ArtTraP3 = new boolean[] {false} ;
      P07K27_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07K27_n2791ArtFacAbs = new boolean[] {false} ;
      P07K27_A9801ArtFabsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07K27_n9801ArtFabsT = new boolean[] {false} ;
      P07K27_A830TipArtDsc = new String[] {""} ;
      P07K27_n830TipArtDsc = new boolean[] {false} ;
      A65ArtCod = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      A9801ArtFabsT = DecimalUtil.ZERO ;
      A830TipArtDsc = "" ;
      P07K28_A396EmprCod = new String[] {""} ;
      P07K28_A252CliCod = new int[1] ;
      P07K28_A65ArtCod = new String[] {""} ;
      P07K28_A4903FasAcab = new String[] {""} ;
      P07K28_n4903FasAcab = new boolean[] {false} ;
      P07K28_A4286FasForMul = new String[] {""} ;
      P07K28_n4286FasForMul = new boolean[] {false} ;
      P07K28_A4898ArtProCod = new String[] {""} ;
      P07K28_A4897ArtProLin = new short[1] ;
      P07K28_A457FasCod = new String[] {""} ;
      P07K28_A758ProCod = new String[] {""} ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A4898ArtProCod = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV147TipARtdsc = "" ;
      AV70ProForDsc = "" ;
      P07K29_A396EmprCod = new String[] {""} ;
      P07K29_A764ProForCod = new String[] {""} ;
      P07K29_A766ProForDsc = new String[] {""} ;
      GXt_char5 = "" ;
      GXv_char10 = new String[1] ;
      AV15Tab_cos = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV15Tab_cos[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV76Tab_cant = new java.math.BigDecimal[100][100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 100 )
         {
            AV76Tab_cant[GX_I-1][GX_J-1] = DecimalUtil.ZERO ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV104Tab_orden = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV104Tab_orden[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P07K210_A396EmprCod = new String[] {""} ;
      P07K210_A5555Lb_opcion = new String[] {""} ;
      P07K210_A5532Lb_numero = new int[1] ;
      P07K210_A5556Lb_UltLC = new short[1] ;
      P07K210_A5718Lb_numop = new byte[1] ;
      P07K210_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      AV13Lb_opcion = "" ;
      AV153Lb_costee = DecimalUtil.ZERO ;
      P07K211_A396EmprCod = new String[] {""} ;
      P07K211_A910Workstat = new String[] {""} ;
      P07K211_A719PrdNum = new String[] {""} ;
      P07K211_A897EscMDsc = new String[] {""} ;
      P07K211_A4709EscMMdlCod = new String[] {""} ;
      P07K211_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07K211_A490ForPrdUMe = new byte[1] ;
      P07K211_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07K211_A887EscMLin = new int[1] ;
      P07K211_A764ProForCod = new String[] {""} ;
      P07K211_A7583EscOrdn = new short[1] ;
      A910Workstat = "" ;
      A719PrdNum = "" ;
      A897EscMDsc = "" ;
      A4709EscMMdlCod = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A890EscMCan = DecimalUtil.ZERO ;
      P07K212_A396EmprCod = new String[] {""} ;
      P07K212_A5532Lb_numero = new int[1] ;
      P07K212_A5718Lb_numop = new byte[1] ;
      P07K212_A5555Lb_opcion = new String[] {""} ;
      AV150Tab_obs = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV150Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rensl10t__default(),
         new Object[] {
             new Object[] {
            P07K22_A396EmprCod, P07K22_A407EmprNom, P07K22_n407EmprNom
            }
            , new Object[] {
            P07K23_A396EmprCod, P07K23_A5555Lb_opcion, P07K23_A5532Lb_numero, P07K23_A6056Lb_pesom, P07K23_A6057Lb_volum
            }
            , new Object[] {
            P07K24_A5548Lb_Obs, P07K24_A1514MacProCod, P07K24_n1514MacProCod, P07K24_A396EmprCod, P07K24_A5532Lb_numero, P07K24_A5535Lb_TipArt, P07K24_A5533Lb_ArtCod, P07K24_A5534Lb_ArtDsc, P07K24_A5595Lb_malha, P07K24_A5570Lb_Tipo,
            P07K24_A252CliCod, P07K24_A5700Lb_Talao, P07K24_A5541Lb_FechaE, P07K24_A5547Lb_Rb, P07K24_A6056Lb_pesom, P07K24_A6057Lb_volum, P07K24_A1515MacProDsc, P07K24_A7780Lb_Hila, P07K24_A5540Lb_Cartaz, P07K24_A5537Lb_ColNum,
            P07K24_A5536Lb_ColNom, P07K24_A279CliNom
            }
            , new Object[] {
            P07K25_A396EmprCod, P07K25_A5532Lb_numero, P07K25_A5553Lb_ForCod, P07K25_A5551Lb_lineaPq
            }
            , new Object[] {
            P07K26_A396EmprCod, P07K26_A764ProForCod, P07K26_A5523ProForTip, P07K26_A766ProForDsc
            }
            , new Object[] {
            P07K27_A829TipArtCod, P07K27_A396EmprCod, P07K27_A65ArtCod, P07K27_A252CliCod, P07K27_A105ArtTra1, P07K27_n105ArtTra1, P07K27_A108ArtTraP1, P07K27_n108ArtTraP1, P07K27_A106ArtTra2, P07K27_n106ArtTra2,
            P07K27_A109ArtTraP2, P07K27_n109ArtTraP2, P07K27_A107ArtTra3, P07K27_n107ArtTra3, P07K27_A110ArtTraP3, P07K27_n110ArtTraP3, P07K27_A2791ArtFacAbs, P07K27_n2791ArtFacAbs, P07K27_A9801ArtFabsT, P07K27_n9801ArtFabsT,
            P07K27_A830TipArtDsc, P07K27_n830TipArtDsc
            }
            , new Object[] {
            P07K28_A396EmprCod, P07K28_A252CliCod, P07K28_A65ArtCod, P07K28_A4903FasAcab, P07K28_n4903FasAcab, P07K28_A4286FasForMul, P07K28_n4286FasForMul, P07K28_A4898ArtProCod, P07K28_A4897ArtProLin, P07K28_A457FasCod,
            P07K28_A758ProCod
            }
            , new Object[] {
            P07K29_A396EmprCod, P07K29_A764ProForCod, P07K29_A766ProForDsc
            }
            , new Object[] {
            P07K210_A396EmprCod, P07K210_A5555Lb_opcion, P07K210_A5532Lb_numero, P07K210_A5556Lb_UltLC, P07K210_A5718Lb_numop, P07K210_A5565Lb_CosteE
            }
            , new Object[] {
            P07K211_A396EmprCod, P07K211_A910Workstat, P07K211_A719PrdNum, P07K211_A897EscMDsc, P07K211_A4709EscMMdlCod, P07K211_A4712EscMFacCon, P07K211_A490ForPrdUMe, P07K211_A890EscMCan, P07K211_A887EscMLin, P07K211_A764ProForCod,
            P07K211_A7583EscOrdn
            }
            , new Object[] {
            P07K212_A396EmprCod, P07K212_A5532Lb_numero, P07K212_A5718Lb_numop, P07K212_A5555Lb_opcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV152Pt ;
   private byte AV157Erfoc ;
   private byte AV179Carvema ;
   private byte GXt_int1 ;
   private byte AV124Artextil ;
   private byte AV178Colorsol ;
   private byte GXv_int2[] ;
   private byte AV50Opcion ;
   private byte A5595Lb_malha ;
   private byte AV66TxtProceso ;
   private byte AV94Salto_p ;
   private byte AV96LastWork ;
   private byte AV9Ensayo[] ;
   private byte AV79Ensayo1 ;
   private byte AV80Ensayo2 ;
   private byte AV81Ensayo3 ;
   private byte AV83Ensayo4 ;
   private byte AV82Ensayo5 ;
   private byte AV102Ensayo6 ;
   private byte AV131Ensayo7 ;
   private byte AV132Ensayo8 ;
   private byte AV133Ensayo9 ;
   private byte AV134Ensayo10 ;
   private byte AV10Tab_Opc[][] ;
   private byte AV166OpN ;
   private byte AV61LinPag ;
   private byte A5718Lb_numop ;
   private byte AV68Lb_numop ;
   private byte A490ForPrdUMe ;
   private byte AV148Nlin ;
   private byte AV149g ;
   private short AV109Num_opc ;
   private short AV110x ;
   private short AV113Numero_v ;
   private short AV103Num_orden ;
   private short GXv_int12[] ;
   private short A5535Lb_TipArt ;
   private short A5551Lb_lineaPq ;
   private short AV8i ;
   private short AV97Num_w ;
   private short AV105Escordn ;
   private short AV98Num_Op ;
   private short AV106Num_ctrl ;
   private short AV53Lin ;
   private short AV78Num_colum ;
   private short A829TipArtCod ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A4897ArtProLin ;
   private short A5556Lb_UltLC ;
   private short AV123Num_l ;
   private short A7583EscOrdn ;
   private short Gx_err ;
   private int AV65Lb_numero ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GX_I ;
   private int Gx_OldLine ;
   private int A5532Lb_numero ;
   private int GXv_int7[] ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private int AV45CliCod ;
   private int GX_J ;
   private int A887EscMLin ;
   private java.math.BigDecimal A6056Lb_pesom ;
   private java.math.BigDecimal A6057Lb_volum ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV57Cantidad[] ;
   private java.math.BigDecimal AV77Pipetar[] ;
   private java.math.BigDecimal AV84Cant1 ;
   private java.math.BigDecimal AV85Cant2 ;
   private java.math.BigDecimal AV86Cant3 ;
   private java.math.BigDecimal AV87Cant4 ;
   private java.math.BigDecimal AV88Cant5 ;
   private java.math.BigDecimal AV100Cant6 ;
   private java.math.BigDecimal AV135Cant7 ;
   private java.math.BigDecimal AV136Cant8 ;
   private java.math.BigDecimal AV137Cant9 ;
   private java.math.BigDecimal AV138Cant10 ;
   private java.math.BigDecimal AV116Pp1 ;
   private java.math.BigDecimal AV117Pp2 ;
   private java.math.BigDecimal AV118Pp3 ;
   private java.math.BigDecimal AV119Pp4 ;
   private java.math.BigDecimal AV120Pp5 ;
   private java.math.BigDecimal AV121Pp6 ;
   private java.math.BigDecimal AV143Pp7 ;
   private java.math.BigDecimal AV144Pp8 ;
   private java.math.BigDecimal AV145Pp9 ;
   private java.math.BigDecimal AV146Pp10 ;
   private java.math.BigDecimal AV11Tab_Ctn[][] ;
   private java.math.BigDecimal AV115Tab_pp[][] ;
   private java.math.BigDecimal AV156Cost95 ;
   private java.math.BigDecimal AV154Tab_Cost[][] ;
   private java.math.BigDecimal AV127ArtFacAbs ;
   private java.math.BigDecimal AV128Artfabst ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal A9801ArtFabsT ;
   private java.math.BigDecimal AV15Tab_cos[] ;
   private java.math.BigDecimal AV76Tab_cant[][] ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private java.math.BigDecimal AV153Lb_costee ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private java.math.BigDecimal A890EscMCan ;
   private String A396EmprCod ;
   private String AV111Tab_opcion[] ;
   private String AV122Pp ;
   private String AV48Contdsc ;
   private String AV151Contdsc_i ;
   private String AV19Lit1 ;
   private String AV20Lit2 ;
   private String AV21Lit3 ;
   private String AV22Lit4 ;
   private String AV23Lit5 ;
   private String AV24Lit6 ;
   private String AV25Lit7 ;
   private String AV26Lit8 ;
   private String AV27Lit9 ;
   private String AV28Lit10 ;
   private String AV29Lit11 ;
   private String AV30Lit12 ;
   private String AV31Lit13 ;
   private String AV32Lit14 ;
   private String AV33Lit15 ;
   private String AV34Lit16 ;
   private String AV35Lit17 ;
   private String AV36Lit18 ;
   private String AV37Lit19 ;
   private String AV38Lit20 ;
   private String AV39Lit21 ;
   private String AV41Lit22 ;
   private String AV42Lit23 ;
   private String AV43Lit24 ;
   private String AV49Lit25 ;
   private String GXt_char4 ;
   private String AV71Lit26 ;
   private String AV72Lit27 ;
   private String AV73Lit28 ;
   private String AV180Txt2 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV18EmprNOm ;
   private String AV114Tab_opcii[] ;
   private String AV112Lb_opcioni ;
   private String A5555Lb_opcion ;
   private String AV62Workstat ;
   private String GXv_char6[] ;
   private String GXv_char3[] ;
   private String A1514MacProCod ;
   private String A5533Lb_ArtCod ;
   private String A5534Lb_ArtDsc ;
   private String A5570Lb_Tipo ;
   private String A5700Lb_Talao ;
   private String A1515MacProDsc ;
   private String A7780Lb_Hila ;
   private String A5540Lb_Cartaz ;
   private String A5536Lb_ColNom ;
   private String A279CliNom ;
   private String AV181ArtDsc ;
   private String AV125v_desc ;
   private String AV126Prof ;
   private String A5553Lb_ForCod ;
   private String A764ProForCod ;
   private String A5523ProForTip ;
   private String A766ProForDsc ;
   private String AV40Texto_m ;
   private String AV44Texto_e ;
   private String AV46Lb_artcod ;
   private String AV63ProForCod ;
   private String AV55Unidad[] ;
   private String AV168Op1 ;
   private String AV169Op2 ;
   private String AV170Op3 ;
   private String AV171Op4 ;
   private String AV172Op5 ;
   private String AV173Op6 ;
   private String AV174Op7 ;
   private String AV175Op8 ;
   private String AV176Op9 ;
   private String AV177Op10 ;
   private String AV89Uni1 ;
   private String AV93Uni2 ;
   private String AV90Uni3 ;
   private String AV91Uni4 ;
   private String AV92Uni5 ;
   private String AV101Uni6 ;
   private String AV139Uni7 ;
   private String AV140Uni8 ;
   private String AV141Uni9 ;
   private String AV142Uni10 ;
   private String AV158EnsCost1 ;
   private String AV95Tab_op[][] ;
   private String AV56Tab_Uni[][] ;
   private String AV167OpA ;
   private String AV155EnsCost2 ;
   private String AV159EnsCost3 ;
   private String AV160EnsCost4 ;
   private String AV161EnsCost5 ;
   private String AV162EnsCost6 ;
   private String AV163EnsCost7 ;
   private String AV164EnsCost8 ;
   private String AV165EnsCost9 ;
   private String AV69Tab_Pro[] ;
   private String AV58Tab_Prd[] ;
   private String AV17PrdNumi ;
   private String AV54Produc ;
   private String AV52PrdDsc ;
   private String AV59Tab_Prn[] ;
   private String AV16Orden ;
   private String AV60Tab_Ord[] ;
   private String AV67Tab_Tip[] ;
   private String AV47Compo ;
   private String AV130ArtProcod ;
   private String A65ArtCod ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A830TipArtDsc ;
   private String A4903FasAcab ;
   private String A4286FasForMul ;
   private String A4898ArtProCod ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV147TipARtdsc ;
   private String AV70ProForDsc ;
   private String GXt_char5 ;
   private String GXv_char10[] ;
   private String AV104Tab_orden[] ;
   private String AV13Lb_opcion ;
   private String A910Workstat ;
   private String A719PrdNum ;
   private String A897EscMDsc ;
   private String A4709EscMMdlCod ;
   private String AV150Tab_obs[] ;
   private java.util.Date A5541Lb_FechaE ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean GxHdr5 ;
   private boolean n1514MacProCod ;
   private boolean n105ArtTra1 ;
   private boolean n108ArtTraP1 ;
   private boolean n106ArtTra2 ;
   private boolean n109ArtTraP2 ;
   private boolean n107ArtTra3 ;
   private boolean n110ArtTraP3 ;
   private boolean n2791ArtFacAbs ;
   private boolean n9801ArtFabsT ;
   private boolean n830TipArtDsc ;
   private boolean n4903FasAcab ;
   private boolean n4286FasForMul ;
   private String A5548Lb_Obs ;
   private String AV129Lb_obs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P07K22_A396EmprCod ;
   private String[] P07K22_A407EmprNom ;
   private boolean[] P07K22_n407EmprNom ;
   private String[] P07K23_A396EmprCod ;
   private String[] P07K23_A5555Lb_opcion ;
   private int[] P07K23_A5532Lb_numero ;
   private java.math.BigDecimal[] P07K23_A6056Lb_pesom ;
   private java.math.BigDecimal[] P07K23_A6057Lb_volum ;
   private String[] P07K24_A5548Lb_Obs ;
   private String[] P07K24_A1514MacProCod ;
   private boolean[] P07K24_n1514MacProCod ;
   private String[] P07K24_A396EmprCod ;
   private int[] P07K24_A5532Lb_numero ;
   private short[] P07K24_A5535Lb_TipArt ;
   private String[] P07K24_A5533Lb_ArtCod ;
   private String[] P07K24_A5534Lb_ArtDsc ;
   private byte[] P07K24_A5595Lb_malha ;
   private String[] P07K24_A5570Lb_Tipo ;
   private int[] P07K24_A252CliCod ;
   private String[] P07K24_A5700Lb_Talao ;
   private java.util.Date[] P07K24_A5541Lb_FechaE ;
   private java.math.BigDecimal[] P07K24_A5547Lb_Rb ;
   private java.math.BigDecimal[] P07K24_A6056Lb_pesom ;
   private java.math.BigDecimal[] P07K24_A6057Lb_volum ;
   private String[] P07K24_A1515MacProDsc ;
   private String[] P07K24_A7780Lb_Hila ;
   private String[] P07K24_A5540Lb_Cartaz ;
   private int[] P07K24_A5537Lb_ColNum ;
   private String[] P07K24_A5536Lb_ColNom ;
   private String[] P07K24_A279CliNom ;
   private String[] P07K25_A396EmprCod ;
   private int[] P07K25_A5532Lb_numero ;
   private String[] P07K25_A5553Lb_ForCod ;
   private short[] P07K25_A5551Lb_lineaPq ;
   private String[] P07K26_A396EmprCod ;
   private String[] P07K26_A764ProForCod ;
   private String[] P07K26_A5523ProForTip ;
   private String[] P07K26_A766ProForDsc ;
   private short[] P07K27_A829TipArtCod ;
   private String[] P07K27_A396EmprCod ;
   private String[] P07K27_A65ArtCod ;
   private int[] P07K27_A252CliCod ;
   private String[] P07K27_A105ArtTra1 ;
   private boolean[] P07K27_n105ArtTra1 ;
   private short[] P07K27_A108ArtTraP1 ;
   private boolean[] P07K27_n108ArtTraP1 ;
   private String[] P07K27_A106ArtTra2 ;
   private boolean[] P07K27_n106ArtTra2 ;
   private short[] P07K27_A109ArtTraP2 ;
   private boolean[] P07K27_n109ArtTraP2 ;
   private String[] P07K27_A107ArtTra3 ;
   private boolean[] P07K27_n107ArtTra3 ;
   private short[] P07K27_A110ArtTraP3 ;
   private boolean[] P07K27_n110ArtTraP3 ;
   private java.math.BigDecimal[] P07K27_A2791ArtFacAbs ;
   private boolean[] P07K27_n2791ArtFacAbs ;
   private java.math.BigDecimal[] P07K27_A9801ArtFabsT ;
   private boolean[] P07K27_n9801ArtFabsT ;
   private String[] P07K27_A830TipArtDsc ;
   private boolean[] P07K27_n830TipArtDsc ;
   private String[] P07K28_A396EmprCod ;
   private int[] P07K28_A252CliCod ;
   private String[] P07K28_A65ArtCod ;
   private String[] P07K28_A4903FasAcab ;
   private boolean[] P07K28_n4903FasAcab ;
   private String[] P07K28_A4286FasForMul ;
   private boolean[] P07K28_n4286FasForMul ;
   private String[] P07K28_A4898ArtProCod ;
   private short[] P07K28_A4897ArtProLin ;
   private String[] P07K28_A457FasCod ;
   private String[] P07K28_A758ProCod ;
   private String[] P07K29_A396EmprCod ;
   private String[] P07K29_A764ProForCod ;
   private String[] P07K29_A766ProForDsc ;
   private String[] P07K210_A396EmprCod ;
   private String[] P07K210_A5555Lb_opcion ;
   private int[] P07K210_A5532Lb_numero ;
   private short[] P07K210_A5556Lb_UltLC ;
   private byte[] P07K210_A5718Lb_numop ;
   private java.math.BigDecimal[] P07K210_A5565Lb_CosteE ;
   private String[] P07K211_A396EmprCod ;
   private String[] P07K211_A910Workstat ;
   private String[] P07K211_A719PrdNum ;
   private String[] P07K211_A897EscMDsc ;
   private String[] P07K211_A4709EscMMdlCod ;
   private java.math.BigDecimal[] P07K211_A4712EscMFacCon ;
   private byte[] P07K211_A490ForPrdUMe ;
   private java.math.BigDecimal[] P07K211_A890EscMCan ;
   private int[] P07K211_A887EscMLin ;
   private String[] P07K211_A764ProForCod ;
   private short[] P07K211_A7583EscOrdn ;
   private String[] P07K212_A396EmprCod ;
   private int[] P07K212_A5532Lb_numero ;
   private byte[] P07K212_A5718Lb_numop ;
   private String[] P07K212_A5555Lb_opcion ;
}

final  class rensl10t__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07K22", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07K23", "SELECT T1.EmprCod, T1.Lb_opcion, T1.Lb_numero, T2.Lb_pesom, T2.Lb_volum FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07K24", "SELECT T1.Lb_Obs, T1.MacProCod, T1.EmprCod, T1.Lb_numero, T1.Lb_TipArt, T1.Lb_ArtCod, T1.Lb_ArtDsc, T1.Lb_malha, T1.Lb_Tipo, T1.CliCod, T1.Lb_Talao, T1.Lb_FechaE, T1.Lb_Rb, T1.Lb_pesom, T1.Lb_volum, T3.MacProDsc, T1.Lb_Hila, T1.Lb_Cartaz, T1.Lb_ColNum, T1.Lb_ColNom, T2.CliNom FROM ((TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPCMACPR T3 ON T3.EmprCod = T1.EmprCod AND T3.MacProCod = T1.MacProCod) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07K25", "SELECT EmprCod, Lb_numero, Lb_ForCod, Lb_lineaPq FROM TXPENS000 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_lineaPq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07K26", "SELECT EmprCod, ProForCod, ProForTip, ProForDsc FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07K27", "SELECT T1.TipArtCod, T1.EmprCod, T1.ArtCod, T1.CliCod, T1.ArtTra1, T1.ArtTraP1, T1.ArtTra2, T1.ArtTraP2, T1.ArtTra3, T1.ArtTraP3, T1.ArtFacAbs, T1.ArtFabsT, T2.TipArtDsc FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07K28", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T2.FasAcab, T2.FasForMul, T1.ArtProCod, T1.ArtProLin, T1.FasCod, T1.ProCod FROM (TXPArtFor T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCod, T1.ArtProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07K29", "SELECT EmprCod, ProForCod, ProForDsc FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07K210", "SELECT EmprCod, Lb_opcion, Lb_numero, Lb_UltLC, Lb_numop, Lb_CosteE FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07K211", "SELECT EmprCod, Workstat, PrdNum, EscMDsc, EscMMdlCod, EscMFacCon, ForPrdUMe, EscMCan, EscMLin, ProForCod, EscOrdn FROM TXPESCMAN WHERE EmprCod = ? and Workstat = ? ORDER BY EmprCod, Workstat, EscOrdn, ProForCod, EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07K212", "SELECT EmprCod, Lb_numero, Lb_numop, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_numop = ? ORDER BY EmprCod, Lb_numero, Lb_numop ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 20);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((String[]) buf[18])[0] = rslt.getString(18, 20);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 13);
               ((String[]) buf[21])[0] = rslt.getString(21, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setString(3, (String)parms[2], 1);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

