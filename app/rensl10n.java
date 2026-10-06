package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rensl10n extends GXReport
{
   public rensl10n( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rensl10n.class ), "" );
   }

   public rensl10n( int remoteHandle ,
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
      rensl10n.this.aP4 = new String[] {""};
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
      rensl10n.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rensl10n.this.AV65Lb_numero = aP1[0];
      this.aP1 = aP1;
      rensl10n.this.AV109Num_opc = aP2[0];
      this.aP2 = aP2;
      rensl10n.this.AV111Tab_opcion = AV111Tab_opcion;
      rensl10n.this.AV122Pp = aP4[0];
      this.aP4 = aP4;
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("IMPRESION DE n OPCIONES") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV48Contdsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS010", ""), GXv_char1) ;
         rensl10n.this.AV48Contdsc = GXv_char1[0] ;
         GXv_int2[0] = AV124Artextil ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int2) ;
         rensl10n.this.AV124Artextil = GXv_int2[0] ;
         GXv_int2[0] = AV125Tintex ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int2) ;
         rensl10n.this.AV125Tintex = GXv_int2[0] ;
         GXt_char3 = AV19Lit1 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV19Lit1 = GXt_char3 ;
         GXt_char3 = AV20Lit2 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV20Lit2 = GXt_char3 ;
         AV21Lit3 = GXutil.trim( AV19Lit1) + "-" + GXutil.trim( AV20Lit2) ;
         GXt_char3 = AV22Lit4 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT305_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV22Lit4 = GXt_char3 ;
         GXt_char3 = AV23Lit5 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV23Lit5 = GXt_char3 ;
         GXt_char3 = AV24Lit6 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL120_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV24Lit6 = GXt_char3 ;
         if ( GXutil.strcmp(AV24Lit6, httpContext.getMessage( "WCFL120_", "")) == 0 )
         {
            GXt_char3 = AV24Lit6 ;
            GXv_char1[0] = GXt_char3 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char1) ;
            rensl10n.this.GXt_char3 = GXv_char1[0] ;
            AV24Lit6 = GXt_char3 ;
         }
         GXt_char3 = AV25Lit7 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV25Lit7 = GXt_char3 ;
         GXt_char3 = AV26Lit8 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV26Lit8 = GXt_char3 ;
         GXt_char3 = AV27Lit9 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV27Lit9 = GXt_char3 ;
         GXt_char3 = AV28Lit10 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1194_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV28Lit10 = GXt_char3 ;
         GXt_char3 = AV29Lit11 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN236", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV29Lit11 = GXt_char3 ;
         GXt_char3 = AV30Lit12 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1164_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV30Lit12 = GXt_char3 ;
         GXt_char3 = AV31Lit13 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV31Lit13 = GXt_char3 ;
         AV32Lit14 = httpContext.getMessage( "Productos", "") ;
         GXt_char3 = AV33Lit15 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1160_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV33Lit15 = GXt_char3 ;
         GXt_char3 = AV34Lit16 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN176", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV34Lit16 = GXt_char3 ;
         GXt_char3 = AV35Lit17 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN079_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV35Lit17 = GXt_char3 ;
         GXt_char3 = AV36Lit18 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1134_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV36Lit18 = GXt_char3 ;
         GXt_char3 = AV37Lit19 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN237", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV37Lit19 = GXutil.trim( GXt_char3) ;
         GXt_char3 = AV38Lit20 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN037", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV38Lit20 = GXutil.trim( GXt_char3) ;
         AV38Lit20 = GXutil.substring( AV38Lit20, 1, 8) ;
         GXt_char3 = AV39Lit21 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN238", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV39Lit21 = GXutil.trim( GXt_char3) ;
         GXt_char3 = AV41Lit22 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV41Lit22 = GXt_char3 ;
         GXt_char3 = AV42Lit23 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1217_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV42Lit23 = GXt_char3 ;
         GXt_char3 = AV43Lit24 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN208", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         AV43Lit24 = GXt_char3 ;
         GXt_char3 = AV49Lit25 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1376_", ""), (byte)(99), GXv_char1) ;
         rensl10n.this.GXt_char3 = GXv_char1[0] ;
         GXt_char4 = AV49Lit25 ;
         GXv_char5[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char5) ;
         rensl10n.this.GXt_char4 = GXv_char5[0] ;
         AV49Lit25 = GXt_char3 + " " + GXt_char4 ;
         AV71Lit26 = httpContext.getMessage( "Nº IDM", "") ;
         GXt_char4 = AV72Lit27 ;
         GXv_char5[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char5) ;
         rensl10n.this.GXt_char4 = GXv_char5[0] ;
         AV72Lit27 = GXutil.trim( GXt_char4) + " " + httpContext.getMessage( "Ent.", "") ;
         GXt_char4 = AV73Lit28 ;
         GXv_char5[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char5) ;
         rensl10n.this.GXt_char4 = GXv_char5[0] ;
         AV73Lit28 = GXutil.trim( GXt_char4) + " " + httpContext.getMessage( "Mod.", "") ;
         /* Using cursor P07D62 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07D62_A407EmprNom[0] ;
            n407EmprNom = P07D62_n407EmprNom[0] ;
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
            if ( AV113Numero_v > 5 )
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
            /* Using cursor P07D63 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV65Lb_numero), AV112Lb_opcioni});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A5555Lb_opcion = P07D63_A5555Lb_opcion[0] ;
               A5532Lb_numero = P07D63_A5532Lb_numero[0] ;
               A6056Lb_pesom = P07D63_A6056Lb_pesom[0] ;
               A6057Lb_volum = P07D63_A6057Lb_volum[0] ;
               A6056Lb_pesom = P07D63_A6056Lb_pesom[0] ;
               A6057Lb_volum = P07D63_A6057Lb_volum[0] ;
               AV62Workstat = GXutil.str( A5532Lb_numero, 8, 0) + A5555Lb_opcion ;
               GXv_char5[0] = A396EmprCod ;
               GXv_int6[0] = A5532Lb_numero ;
               GXv_char1[0] = A5555Lb_opcion ;
               GXv_decimal7[0] = A6056Lb_pesom ;
               GXv_decimal8[0] = A6057Lb_volum ;
               GXv_char9[0] = " " ;
               GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
               GXv_int11[0] = AV103Num_orden ;
               new app.pens035(remoteHandle, context).execute( GXv_char5, GXv_int6, GXv_char1, GXv_decimal7, GXv_decimal8, GXv_char9, GXv_decimal10, GXv_int11) ;
               rensl10n.this.A396EmprCod = GXv_char5[0] ;
               rensl10n.this.A5532Lb_numero = GXv_int6[0] ;
               rensl10n.this.A5555Lb_opcion = GXv_char1[0] ;
               rensl10n.this.A6056Lb_pesom = GXv_decimal7[0] ;
               rensl10n.this.A6057Lb_volum = GXv_decimal8[0] ;
               rensl10n.this.AV103Num_orden = GXv_int11[0] ;
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
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7D60( true, 0) ;
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
      GxHdr4 = true ;
      /* Using cursor P07D64 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV65Lb_numero)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A5548Lb_Obs = P07D64_A5548Lb_Obs[0] ;
         A5098TipDisCod = P07D64_A5098TipDisCod[0] ;
         n5098TipDisCod = P07D64_n5098TipDisCod[0] ;
         A5532Lb_numero = P07D64_A5532Lb_numero[0] ;
         A5535Lb_TipArt = P07D64_A5535Lb_TipArt[0] ;
         A5595Lb_malha = P07D64_A5595Lb_malha[0] ;
         A5570Lb_Tipo = P07D64_A5570Lb_Tipo[0] ;
         A5988Lb_nfibras = P07D64_A5988Lb_nfibras[0] ;
         A5097TipDisDsc = P07D64_A5097TipDisDsc[0] ;
         n5097TipDisDsc = P07D64_n5097TipDisDsc[0] ;
         A5611Lb_Temp3 = P07D64_A5611Lb_Temp3[0] ;
         A5610Lb_Temp2 = P07D64_A5610Lb_Temp2[0] ;
         A5601Lb_Tempt = P07D64_A5601Lb_Tempt[0] ;
         A5594Lb_cartazf = P07D64_A5594Lb_cartazf[0] ;
         A5545Lb_HoraM = P07D64_A5545Lb_HoraM[0] ;
         A5542Lb_HoraE = P07D64_A5542Lb_HoraE[0] ;
         A5546Lb_UsuM = P07D64_A5546Lb_UsuM[0] ;
         A5544Lb_FechaM = P07D64_A5544Lb_FechaM[0] ;
         A5543Lb_Usuario = P07D64_A5543Lb_Usuario[0] ;
         A5541Lb_FechaE = P07D64_A5541Lb_FechaE[0] ;
         A5547Lb_Rb = P07D64_A5547Lb_Rb[0] ;
         A584IntDsc = P07D64_A584IntDsc[0] ;
         n584IntDsc = P07D64_n584IntDsc[0] ;
         A583IntCod = P07D64_A583IntCod[0] ;
         n583IntCod = P07D64_n583IntCod[0] ;
         A5540Lb_Cartaz = P07D64_A5540Lb_Cartaz[0] ;
         A5539Lb_ColNumC = P07D64_A5539Lb_ColNumC[0] ;
         A5538Lb_ColNomC = P07D64_A5538Lb_ColNomC[0] ;
         A832TipColDsc = P07D64_A832TipColDsc[0] ;
         n832TipColDsc = P07D64_n832TipColDsc[0] ;
         A831TipColCod = P07D64_A831TipColCod[0] ;
         n831TipColCod = P07D64_n831TipColCod[0] ;
         A5537Lb_ColNum = P07D64_A5537Lb_ColNum[0] ;
         A5536Lb_ColNom = P07D64_A5536Lb_ColNom[0] ;
         A5552Lb_TipArtD = P07D64_A5552Lb_TipArtD[0] ;
         A5534Lb_ArtDsc = P07D64_A5534Lb_ArtDsc[0] ;
         A5533Lb_ArtCod = P07D64_A5533Lb_ArtCod[0] ;
         A279CliNom = P07D64_A279CliNom[0] ;
         A252CliCod = P07D64_A252CliCod[0] ;
         A279CliNom = P07D64_A279CliNom[0] ;
         A584IntDsc = P07D64_A584IntDsc[0] ;
         n584IntDsc = P07D64_n584IntDsc[0] ;
         A832TipColDsc = P07D64_A832TipColDsc[0] ;
         n832TipColDsc = P07D64_n832TipColDsc[0] ;
         A5097TipDisDsc = P07D64_A5097TipDisDsc[0] ;
         n5097TipDisDsc = P07D64_n5097TipDisDsc[0] ;
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
         S124 ();
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
            if (true) return;
         }
         /* Execute user subroutine: 'CARGO' */
         S134 ();
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
            AV116Pp1 = DecimalUtil.doubleToDec(0) ;
            AV117Pp2 = DecimalUtil.doubleToDec(0) ;
            AV118Pp3 = DecimalUtil.doubleToDec(0) ;
            AV119Pp4 = DecimalUtil.doubleToDec(0) ;
            AV120Pp5 = DecimalUtil.doubleToDec(0) ;
            AV121Pp6 = DecimalUtil.doubleToDec(0) ;
            AV78Num_colum = (short)(1) ;
            while ( AV50Opcion <= 5 )
            {
               if ( AV78Num_colum == 1 )
               {
                  AV79Ensayo1 = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV84Cant1 = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV89Uni1 = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  if ( AV84Cant1.doubleValue() == 0 )
                  {
                     AV89Uni1 = GXutil.space( (short)(2)) ;
                  }
                  AV116Pp1 = AV115Tab_pp[AV8i-1][AV50Opcion-1] ;
               }
               if ( AV78Num_colum == 2 )
               {
                  AV80Ensayo2 = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV85Cant2 = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV93Uni2 = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  if ( AV85Cant2.doubleValue() == 0 )
                  {
                     AV93Uni2 = GXutil.space( (short)(2)) ;
                  }
                  AV117Pp2 = AV115Tab_pp[AV8i-1][AV50Opcion-1] ;
               }
               if ( AV78Num_colum == 3 )
               {
                  AV81Ensayo3 = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV86Cant3 = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV90Uni3 = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  if ( AV86Cant3.doubleValue() == 0 )
                  {
                     AV90Uni3 = GXutil.space( (short)(2)) ;
                  }
                  AV118Pp3 = AV115Tab_pp[AV8i-1][AV50Opcion-1] ;
               }
               if ( AV78Num_colum == 4 )
               {
                  AV83Ensayo4 = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV87Cant4 = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV91Uni4 = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  if ( AV87Cant4.doubleValue() == 0 )
                  {
                     AV91Uni4 = GXutil.space( (short)(2)) ;
                  }
                  AV119Pp4 = AV115Tab_pp[AV8i-1][AV50Opcion-1] ;
               }
               if ( AV78Num_colum == 5 )
               {
                  if ( AV88Cant5.doubleValue() == 0 )
                  {
                     AV92Uni5 = GXutil.space( (short)(2)) ;
                  }
                  AV82Ensayo5 = AV10Tab_Opc[AV8i-1][AV50Opcion-1] ;
                  AV88Cant5 = AV11Tab_Ctn[AV8i-1][AV50Opcion-1] ;
                  AV92Uni5 = AV56Tab_Uni[AV8i-1][AV50Opcion-1] ;
                  AV120Pp5 = AV115Tab_pp[AV8i-1][AV50Opcion-1] ;
               }
               AV50Opcion = (byte)(AV50Opcion+1) ;
               AV78Num_colum = (short)(AV78Num_colum+1) ;
               if ( ( AV124Artextil == 1 ) && ( 1 == 0 ) )
               {
                  AV84Cant1 = DecimalUtil.doubleToDec(0) ;
                  AV89Uni1 = " " ;
                  AV85Cant2 = DecimalUtil.doubleToDec(0) ;
                  AV93Uni2 = " " ;
                  AV86Cant3 = DecimalUtil.doubleToDec(0) ;
                  AV90Uni3 = " " ;
                  AV87Cant4 = DecimalUtil.doubleToDec(0) ;
                  AV91Uni4 = " " ;
                  AV88Cant5 = DecimalUtil.doubleToDec(0) ;
                  AV92Uni5 = " " ;
               }
            }
            if ( GXutil.strcmp(AV63ProForCod, AV69Tab_Pro[AV8i-1]) != 0 )
            {
               AV63ProForCod = AV69Tab_Pro[AV8i-1] ;
               /* Execute user subroutine: 'PROCESO' */
               S144 ();
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
                  if (true) return;
               }
               /* Execute user subroutine: 'LINEA_PROCESO' */
               S154 ();
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
                  if (true) return;
               }
            }
            if ( AV8i == 1 )
            {
               /* Execute user subroutine: 'CAB_LINEA' */
               S164 ();
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
                  if (true) return;
               }
            }
            if ( ( GXutil.strcmp(GXutil.substring( AV58Tab_Prd[AV8i-1], 1, 1), GXutil.substring( AV17PrdNumi, 1, 1)) != 0 ) && ! (GXutil.strcmp("", AV17PrdNumi)==0) )
            {
               h7D60( false, 1) ;
               getPrinter().GxDrawLine(6, Gx_line+0, 1101, Gx_line+0, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+1) ;
            }
            AV54Produc = AV58Tab_Prd[AV8i-1] ;
            AV52PrdDsc = AV59Tab_Prn[AV8i-1] ;
            AV16Orden = AV60Tab_Ord[AV8i-1] ;
            if ( GXutil.strcmp(AV67Tab_Tip[AV8i-1], httpContext.getMessage( "P", "")) == 0 )
            {
               h7D60( false, 24) ;
               getPrinter().GxAttris("Courier New", 8, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Produc, "")), 11, Gx_line+4, 55, Gx_line+20, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52PrdDsc, "")), 60, Gx_line+4, 251, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+0, 6, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(253, Gx_line+0, 253, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Cant1, "ZZZ.ZZZZZ")), 257, Gx_line+4, 324, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89Uni1, "")), 325, Gx_line+4, 341, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+23, 1101, Gx_line+23, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(421, Gx_line+0, 421, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(346, Gx_line+0, 346, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV85Cant2, "ZZZ.ZZZZZ")), 428, Gx_line+4, 495, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93Uni2, "")), 498, Gx_line+4, 514, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(517, Gx_line+0, 517, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(591, Gx_line+0, 591, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86Cant3, "ZZZ.ZZZZZ")), 596, Gx_line+4, 663, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Uni3, "")), 666, Gx_line+4, 682, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(685, Gx_line+0, 685, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(764, Gx_line+0, 764, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87Cant4, "ZZZ.ZZZZZ")), 768, Gx_line+4, 835, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91Uni4, "")), 841, Gx_line+4, 857, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(859, Gx_line+0, 859, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(935, Gx_line+0, 935, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88Cant5, "ZZZ.ZZZZZ")), 940, Gx_line+4, 1007, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92Uni5, "")), 1007, Gx_line+4, 1023, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(1027, Gx_line+0, 1027, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1101, Gx_line+0, 1101, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV116Pp1, "ZZZ.ZZZZZ")), 350, Gx_line+4, 417, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV117Pp2, "ZZZ.ZZZZZ")), 520, Gx_line+4, 587, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV118Pp3, "ZZZ.ZZZZZ")), 691, Gx_line+4, 758, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV119Pp4, "ZZZ.ZZZZZ")), 863, Gx_line+4, 930, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV120Pp5, "ZZZ.ZZZZZ")), 1032, Gx_line+4, 1099, Gx_line+21, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+24) ;
            }
            else
            {
               h7D60( false, 24) ;
               getPrinter().GxDrawLine(6, Gx_line+0, 6, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+23, 1101, Gx_line+23, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Produc, "")), 11, Gx_line+4, 55, Gx_line+20, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52PrdDsc, "")), 60, Gx_line+4, 251, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(253, Gx_line+0, 253, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV84Cant1, "ZZZ.ZZZZZ")), 257, Gx_line+4, 324, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89Uni1, "")), 325, Gx_line+4, 341, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(421, Gx_line+0, 421, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(346, Gx_line+0, 346, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV85Cant2, "ZZZ.ZZZZZ")), 428, Gx_line+4, 495, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93Uni2, "")), 498, Gx_line+4, 514, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(517, Gx_line+0, 517, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(591, Gx_line+0, 591, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86Cant3, "ZZZ.ZZZZZ")), 595, Gx_line+4, 662, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Uni3, "")), 666, Gx_line+4, 682, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(685, Gx_line+0, 685, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(764, Gx_line+0, 764, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87Cant4, "ZZZ.ZZZZZ")), 771, Gx_line+4, 838, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91Uni4, "")), 841, Gx_line+4, 857, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(859, Gx_line+0, 859, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(935, Gx_line+0, 935, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88Cant5, "ZZZ.ZZZZZ")), 940, Gx_line+4, 1007, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92Uni5, "")), 1007, Gx_line+4, 1023, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(1027, Gx_line+0, 1027, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(1101, Gx_line+0, 1101, Gx_line+24, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV116Pp1, "ZZZ.ZZZZZ")), 350, Gx_line+4, 417, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV117Pp2, "ZZZ.ZZZZZ")), 520, Gx_line+4, 587, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV118Pp3, "ZZZ.ZZZZZ")), 691, Gx_line+4, 758, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV119Pp4, "ZZZ.ZZZZZ")), 863, Gx_line+4, 930, Gx_line+20, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV120Pp5, "ZZZ.ZZZZZ")), 1032, Gx_line+4, 1099, Gx_line+20, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+24) ;
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
               S154 ();
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
                  if (true) return;
               }
               /* Execute user subroutine: 'CAB_LINEA' */
               S164 ();
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
                  if (true) return;
               }
            }
         }
         h7D60( false, 2) ;
         getPrinter().GxDrawLine(6, Gx_line+0, 1101, Gx_line+0, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+2) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      GxHdr4 = false ;
      h7D60( false, 1) ;
      getPrinter().GxDrawLine(6, Gx_line+0, 1101, Gx_line+0, 1, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+1) ;
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'ESCMAN' Routine */
      returnInSub = false ;
      AV62Workstat = GXutil.str( AV65Lb_numero, 8, 0) + AV13Lb_opcion ;
      AV123Num_l = (short)(1) ;
      if ( AV124Artextil == 1 )
      {
         /* Using cursor P07D65 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV62Workstat});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A910Workstat = P07D65_A910Workstat[0] ;
            A897EscMDsc = P07D65_A897EscMDsc[0] ;
            A4709EscMMdlCod = P07D65_A4709EscMMdlCod[0] ;
            A4712EscMFacCon = P07D65_A4712EscMFacCon[0] ;
            A490ForPrdUMe = P07D65_A490ForPrdUMe[0] ;
            A890EscMCan = P07D65_A890EscMCan[0] ;
            A719PrdNum = P07D65_A719PrdNum[0] ;
            A764ProForCod = P07D65_A764ProForCod[0] ;
            A7583EscOrdn = P07D65_A7583EscOrdn[0] ;
            A887EscMLin = P07D65_A887EscMLin[0] ;
            AV53Lin = AV123Num_l ;
            AV58Tab_Prd[AV53Lin-1] = A719PrdNum ;
            AV59Tab_Prn[AV53Lin-1] = A897EscMDsc ;
            AV67Tab_Tip[AV53Lin-1] = A4709EscMMdlCod ;
            AV69Tab_Pro[AV53Lin-1] = A764ProForCod ;
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
            AV123Num_l = (short)(AV123Num_l+1) ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
      else
      {
         /* Using cursor P07D66 */
         pr_default.execute(4, new Object[] {A396EmprCod, AV62Workstat});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A910Workstat = P07D66_A910Workstat[0] ;
            A719PrdNum = P07D66_A719PrdNum[0] ;
            A897EscMDsc = P07D66_A897EscMDsc[0] ;
            A4709EscMMdlCod = P07D66_A4709EscMMdlCod[0] ;
            A4712EscMFacCon = P07D66_A4712EscMFacCon[0] ;
            A490ForPrdUMe = P07D66_A490ForPrdUMe[0] ;
            A890EscMCan = P07D66_A890EscMCan[0] ;
            A887EscMLin = P07D66_A887EscMLin[0] ;
            A764ProForCod = P07D66_A764ProForCod[0] ;
            A7583EscOrdn = P07D66_A7583EscOrdn[0] ;
            AV53Lin = AV123Num_l ;
            AV58Tab_Prd[AV53Lin-1] = A719PrdNum ;
            AV59Tab_Prn[AV53Lin-1] = A897EscMDsc ;
            AV67Tab_Tip[AV53Lin-1] = A4709EscMMdlCod ;
            AV69Tab_Pro[AV53Lin-1] = A764ProForCod ;
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
            AV123Num_l = (short)(AV123Num_l+1) ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
   }

   public void S124( ) throws ProcessInterruptedException
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV47Compo = "" ;
      /* Using cursor P07D67 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV45CliCod), AV46Lb_artcod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A65ArtCod = P07D67_A65ArtCod[0] ;
         A252CliCod = P07D67_A252CliCod[0] ;
         A105ArtTra1 = P07D67_A105ArtTra1[0] ;
         n105ArtTra1 = P07D67_n105ArtTra1[0] ;
         A108ArtTraP1 = P07D67_A108ArtTraP1[0] ;
         n108ArtTraP1 = P07D67_n108ArtTraP1[0] ;
         A106ArtTra2 = P07D67_A106ArtTra2[0] ;
         n106ArtTra2 = P07D67_n106ArtTra2[0] ;
         A109ArtTraP2 = P07D67_A109ArtTraP2[0] ;
         n109ArtTraP2 = P07D67_n109ArtTraP2[0] ;
         A107ArtTra3 = P07D67_A107ArtTra3[0] ;
         n107ArtTra3 = P07D67_n107ArtTra3[0] ;
         A110ArtTraP3 = P07D67_A110ArtTraP3[0] ;
         n110ArtTraP3 = P07D67_n110ArtTraP3[0] ;
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
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S144( ) throws ProcessInterruptedException
   {
      /* 'PROCESO' Routine */
      returnInSub = false ;
      AV70ProForDsc = "" ;
      /* Using cursor P07D68 */
      pr_default.execute(6, new Object[] {A396EmprCod, AV63ProForCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A764ProForCod = P07D68_A764ProForCod[0] ;
         A766ProForDsc = P07D68_A766ProForDsc[0] ;
         AV70ProForDsc = A766ProForDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S154( ) throws ProcessInterruptedException
   {
      /* 'LINEA_PROCESO' Routine */
      returnInSub = false ;
      AV31Lit13 = "" ;
      if ( AV66TxtProceso == 0 )
      {
         GXt_char4 = AV31Lit13 ;
         GXv_char9[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(9), GXv_char9) ;
         rensl10n.this.GXt_char4 = GXv_char9[0] ;
         AV31Lit13 = GXt_char4 ;
      }
      AV66TxtProceso = (byte)(1) ;
      h7D60( false, 20) ;
      getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70ProForDsc, "")), 406, Gx_line+1, 595, Gx_line+18, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63ProForCod, "")), 271, Gx_line+1, 347, Gx_line+18, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(6, Gx_line+19, 1101, Gx_line+19, 1, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+20) ;
   }

   public void S164( ) throws ProcessInterruptedException
   {
      /* 'CAB_LINEA' Routine */
      returnInSub = false ;
      h7D60( false, 46) ;
      getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV82Ensayo5), "ZZ")), 1021, Gx_line+1, 1037, Gx_line+19, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV79Ensayo1), "ZZ")), 340, Gx_line+5, 356, Gx_line+23, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV80Ensayo2), "ZZ")), 514, Gx_line+5, 530, Gx_line+23, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV81Ensayo3), "ZZ")), 679, Gx_line+5, 695, Gx_line+23, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV83Ensayo4), "ZZ")), 853, Gx_line+5, 869, Gx_line+23, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(253, Gx_line+0, 253, Gx_line+46, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit14, "")), 43, Gx_line+6, 178, Gx_line+22, 1, 0, 0, 0) ;
      getPrinter().GxDrawLine(6, Gx_line+0, 6, Gx_line+46, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(421, Gx_line+0, 421, Gx_line+46, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(591, Gx_line+0, 591, Gx_line+46, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(935, Gx_line+0, 935, Gx_line+46, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(6, Gx_line+26, 1101, Gx_line+26, 2, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(6, Gx_line+0, 1101, Gx_line+0, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(764, Gx_line+0, 764, Gx_line+46, 2, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 284, Gx_line+29, 323, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "ml", ""), 376, Gx_line+29, 390, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(346, Gx_line+26, 346, Gx_line+46, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 455, Gx_line+29, 494, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "ml", ""), 546, Gx_line+29, 560, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(517, Gx_line+26, 517, Gx_line+46, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 622, Gx_line+29, 661, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(685, Gx_line+26, 685, Gx_line+46, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "ml", ""), 717, Gx_line+29, 731, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 798, Gx_line+29, 837, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(859, Gx_line+26, 859, Gx_line+46, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "ml", ""), 889, Gx_line+29, 903, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 967, Gx_line+30, 1006, Gx_line+44, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(1027, Gx_line+26, 1027, Gx_line+46, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "ml", ""), 1058, Gx_line+29, 1072, Gx_line+43, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(1101, Gx_line+0, 1101, Gx_line+46, 2, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+46) ;
   }

   public void S134( ) throws ProcessInterruptedException
   {
      /* 'CARGO' Routine */
      returnInSub = false ;
      AV50Opcion = (byte)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV95Tab_op[GX_I-1] = " " ;
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
      while ( AV50Opcion <= 100 )
      {
         if ( GXutil.strcmp(AV114Tab_opcii[AV50Opcion-1], " ") == 0 )
         {
            if (true) break;
         }
         AV112Lb_opcioni = AV114Tab_opcii[AV50Opcion-1] ;
         /* Using cursor P07D69 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV65Lb_numero), AV112Lb_opcioni});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A5555Lb_opcion = P07D69_A5555Lb_opcion[0] ;
            A5532Lb_numero = P07D69_A5532Lb_numero[0] ;
            A5556Lb_UltLC = P07D69_A5556Lb_UltLC[0] ;
            A5718Lb_numop = P07D69_A5718Lb_numop[0] ;
            AV13Lb_opcion = A5555Lb_opcion ;
            AV65Lb_numero = A5532Lb_numero ;
            AV68Lb_numop = A5718Lb_numop ;
            /* Execute user subroutine: 'ESCMAN' */
            S171 ();
            if ( returnInSub )
            {
               pr_default.close(7);
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
         pr_default.close(7);
      }
   }

   public void h7D60( boolean bFoot ,
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
               getPrinter().GxDrawRect(34, Gx_line+6, 176, Gx_line+41, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 106, Gx_line+16, 165, Gx_line+34, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 121, Gx_line+51, 166, Gx_line+69, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 172, Gx_line+51, 392, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), 129, Gx_line+101, 247, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5534Lb_ArtDsc, "")), 260, Gx_line+101, 451, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5552Lb_TipArtD, "")), 464, Gx_line+101, 684, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(34, Gx_line+46, 1048, Gx_line+122, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5536Lb_ColNom, "")), 105, Gx_line+130, 201, Gx_line+148, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9")), 216, Gx_line+130, 261, Gx_line+148, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 274, Gx_line+130, 290, Gx_line+147, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A832TipColDsc, "")), 300, Gx_line+130, 520, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5538Lb_ColNomC, "")), 105, Gx_line+152, 201, Gx_line+170, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5539Lb_ColNumC), "ZZZZZ9")), 216, Gx_line+152, 261, Gx_line+170, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5540Lb_Cartaz, "")), 128, Gx_line+74, 275, Gx_line+92, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9")), 127, Gx_line+174, 143, Gx_line+191, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A584IntDsc, "")), 148, Gx_line+174, 368, Gx_line+191, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(34, Gx_line+126, 527, Gx_line+217, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 430, Gx_line+174, 447, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A5547Lb_Rb, "ZZZ9.99")), 470, Gx_line+174, 522, Gx_line+191, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5541Lb_FechaE, "99/99/99"), 640, Gx_line+148, 699, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5543Lb_Usuario, "")), 942, Gx_line+148, 1016, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5544Lb_FechaM, "99/99/99"), 640, Gx_line+176, 699, Gx_line+193, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5546Lb_UsuM, "")), 942, Gx_line+176, 1016, Gx_line+193, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(543, Gx_line+126, 1048, Gx_line+217, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5542Lb_HoraE, "99:99"), 786, Gx_line+148, 823, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5545Lb_HoraM, "99:99"), 786, Gx_line+176, 823, Gx_line+193, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(A5548Lb_Obs, 40, Gx_line+236, 1050, Gx_line+279, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A5594Lb_cartazf, "99/99/99"), 288, Gx_line+74, 347, Gx_line+92, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5601Lb_Tempt), "ZZZ9")), 166, Gx_line+196, 196, Gx_line+213, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5610Lb_Temp2), "ZZZ9")), 201, Gx_line+196, 231, Gx_line+213, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5611Lb_Temp3), "ZZZ9")), 236, Gx_line+196, 266, Gx_line+213, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18EmprNOm, "")), 418, Gx_line+0, 669, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit3, "")), 703, Gx_line+25, 829, Gx_line+42, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 848, Gx_line+25, 907, Gx_line+42, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 917, Gx_line+25, 921, Gx_line+41, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 932, Gx_line+25, 991, Gx_line+42, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit4, "")), 40, Gx_line+16, 104, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit5, "")), 42, Gx_line+51, 84, Gx_line+67, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit6, "")), 42, Gx_line+74, 109, Gx_line+90, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit7, "")), 42, Gx_line+101, 84, Gx_line+117, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit8, "")), 43, Gx_line+130, 95, Gx_line+146, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit9, "")), 43, Gx_line+152, 87, Gx_line+168, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit10, "")), 43, Gx_line+174, 113, Gx_line+190, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit11, "")), 43, Gx_line+196, 115, Gx_line+212, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit12, "")), 40, Gx_line+218, 116, Gx_line+235, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit18, "")), 553, Gx_line+148, 621, Gx_line+164, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit19, "")), 553, Gx_line+176, 621, Gx_line+192, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit20, "")), 719, Gx_line+148, 776, Gx_line+164, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit21, "")), 719, Gx_line+176, 776, Gx_line+192, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit24, "")), 430, Gx_line+51, 534, Gx_line+67, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Texto_e, "")), 547, Gx_line+51, 694, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Compo, "")), 691, Gx_line+101, 911, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5097TipDisDsc, "")), 182, Gx_line+17, 402, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Fibras", ""), 430, Gx_line+196, 483, Gx_line+212, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5988Lb_nfibras), "Z9")), 506, Gx_line+196, 522, Gx_line+213, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 539, Gx_line+51, 543, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 111, Gx_line+101, 115, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 111, Gx_line+74, 115, Gx_line+90, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 111, Gx_line+49, 115, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 119, Gx_line+174, 123, Gx_line+190, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 99, Gx_line+152, 103, Gx_line+168, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 99, Gx_line+130, 103, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 119, Gx_line+196, 123, Gx_line+212, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 452, Gx_line+173, 456, Gx_line+189, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 485, Gx_line+196, 489, Gx_line+212, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 629, Gx_line+176, 633, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 629, Gx_line+148, 633, Gx_line+164, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 780, Gx_line+176, 784, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 780, Gx_line+148, 784, Gx_line+164, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 934, Gx_line+176, 938, Gx_line+192, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 934, Gx_line+148, 938, Gx_line+164, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit27, "")), 842, Gx_line+148, 930, Gx_line+164, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Lit28, "")), 842, Gx_line+176, 930, Gx_line+192, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 119, Gx_line+218, 123, Gx_line+234, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV74Num_ops), "ZZZ9")), 1019, Gx_line+218, 1049, Gx_line+235, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+283) ;
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
      this.aP0[0] = rensl10n.this.A396EmprCod;
      this.aP1[0] = rensl10n.this.AV65Lb_numero;
      this.aP2[0] = rensl10n.this.AV109Num_opc;
      this.aP4[0] = rensl10n.this.AV122Pp;
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
      GXt_char3 = "" ;
      AV71Lit26 = "" ;
      AV72Lit27 = "" ;
      AV73Lit28 = "" ;
      scmdbuf = "" ;
      P07D62_A396EmprCod = new String[] {""} ;
      P07D62_A407EmprNom = new String[] {""} ;
      P07D62_n407EmprNom = new boolean[] {false} ;
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
      P07D63_A396EmprCod = new String[] {""} ;
      P07D63_A5555Lb_opcion = new String[] {""} ;
      P07D63_A5532Lb_numero = new int[1] ;
      P07D63_A6056Lb_pesom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07D63_A6057Lb_volum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A5555Lb_opcion = "" ;
      A6056Lb_pesom = DecimalUtil.ZERO ;
      A6057Lb_volum = DecimalUtil.ZERO ;
      AV62Workstat = "" ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int11 = new short[1] ;
      P07D64_A5548Lb_Obs = new String[] {""} ;
      P07D64_A5098TipDisCod = new String[] {""} ;
      P07D64_n5098TipDisCod = new boolean[] {false} ;
      P07D64_A396EmprCod = new String[] {""} ;
      P07D64_A5532Lb_numero = new int[1] ;
      P07D64_A5535Lb_TipArt = new short[1] ;
      P07D64_A5595Lb_malha = new byte[1] ;
      P07D64_A5570Lb_Tipo = new String[] {""} ;
      P07D64_A5988Lb_nfibras = new byte[1] ;
      P07D64_A5097TipDisDsc = new String[] {""} ;
      P07D64_n5097TipDisDsc = new boolean[] {false} ;
      P07D64_A5611Lb_Temp3 = new short[1] ;
      P07D64_A5610Lb_Temp2 = new short[1] ;
      P07D64_A5601Lb_Tempt = new short[1] ;
      P07D64_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P07D64_A5545Lb_HoraM = new java.util.Date[] {GXutil.nullDate()} ;
      P07D64_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P07D64_A5546Lb_UsuM = new String[] {""} ;
      P07D64_A5544Lb_FechaM = new java.util.Date[] {GXutil.nullDate()} ;
      P07D64_A5543Lb_Usuario = new String[] {""} ;
      P07D64_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P07D64_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07D64_A584IntDsc = new String[] {""} ;
      P07D64_n584IntDsc = new boolean[] {false} ;
      P07D64_A583IntCod = new byte[1] ;
      P07D64_n583IntCod = new boolean[] {false} ;
      P07D64_A5540Lb_Cartaz = new String[] {""} ;
      P07D64_A5539Lb_ColNumC = new int[1] ;
      P07D64_A5538Lb_ColNomC = new String[] {""} ;
      P07D64_A832TipColDsc = new String[] {""} ;
      P07D64_n832TipColDsc = new boolean[] {false} ;
      P07D64_A831TipColCod = new byte[1] ;
      P07D64_n831TipColCod = new boolean[] {false} ;
      P07D64_A5537Lb_ColNum = new int[1] ;
      P07D64_A5536Lb_ColNom = new String[] {""} ;
      P07D64_A5552Lb_TipArtD = new String[] {""} ;
      P07D64_A5534Lb_ArtDsc = new String[] {""} ;
      P07D64_A5533Lb_ArtCod = new String[] {""} ;
      P07D64_A279CliNom = new String[] {""} ;
      P07D64_A252CliCod = new int[1] ;
      A5548Lb_Obs = "" ;
      A5098TipDisCod = "" ;
      A5570Lb_Tipo = "" ;
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
      AV116Pp1 = DecimalUtil.ZERO ;
      AV117Pp2 = DecimalUtil.ZERO ;
      AV118Pp3 = DecimalUtil.ZERO ;
      AV119Pp4 = DecimalUtil.ZERO ;
      AV120Pp5 = DecimalUtil.ZERO ;
      AV121Pp6 = DecimalUtil.ZERO ;
      AV10Tab_Opc = new byte[100][100] ;
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
      AV13Lb_opcion = "" ;
      P07D65_A396EmprCod = new String[] {""} ;
      P07D65_A910Workstat = new String[] {""} ;
      P07D65_A897EscMDsc = new String[] {""} ;
      P07D65_A4709EscMMdlCod = new String[] {""} ;
      P07D65_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07D65_A490ForPrdUMe = new byte[1] ;
      P07D65_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07D65_A719PrdNum = new String[] {""} ;
      P07D65_A764ProForCod = new String[] {""} ;
      P07D65_A7583EscOrdn = new short[1] ;
      P07D65_A887EscMLin = new int[1] ;
      A910Workstat = "" ;
      A897EscMDsc = "" ;
      A4709EscMMdlCod = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A890EscMCan = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A764ProForCod = "" ;
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
      P07D66_A396EmprCod = new String[] {""} ;
      P07D66_A910Workstat = new String[] {""} ;
      P07D66_A719PrdNum = new String[] {""} ;
      P07D66_A897EscMDsc = new String[] {""} ;
      P07D66_A4709EscMMdlCod = new String[] {""} ;
      P07D66_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07D66_A490ForPrdUMe = new byte[1] ;
      P07D66_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07D66_A887EscMLin = new int[1] ;
      P07D66_A764ProForCod = new String[] {""} ;
      P07D66_A7583EscOrdn = new short[1] ;
      AV47Compo = "" ;
      P07D67_A396EmprCod = new String[] {""} ;
      P07D67_A65ArtCod = new String[] {""} ;
      P07D67_A252CliCod = new int[1] ;
      P07D67_A105ArtTra1 = new String[] {""} ;
      P07D67_n105ArtTra1 = new boolean[] {false} ;
      P07D67_A108ArtTraP1 = new short[1] ;
      P07D67_n108ArtTraP1 = new boolean[] {false} ;
      P07D67_A106ArtTra2 = new String[] {""} ;
      P07D67_n106ArtTra2 = new boolean[] {false} ;
      P07D67_A109ArtTraP2 = new short[1] ;
      P07D67_n109ArtTraP2 = new boolean[] {false} ;
      P07D67_A107ArtTra3 = new String[] {""} ;
      P07D67_n107ArtTra3 = new boolean[] {false} ;
      P07D67_A110ArtTraP3 = new short[1] ;
      P07D67_n110ArtTraP3 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      AV70ProForDsc = "" ;
      P07D68_A396EmprCod = new String[] {""} ;
      P07D68_A764ProForCod = new String[] {""} ;
      P07D68_A766ProForDsc = new String[] {""} ;
      A766ProForDsc = "" ;
      GXt_char4 = "" ;
      GXv_char9 = new String[1] ;
      AV95Tab_op = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV95Tab_op[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV15Tab_cos = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV15Tab_cos[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV104Tab_orden = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV104Tab_orden[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P07D69_A396EmprCod = new String[] {""} ;
      P07D69_A5555Lb_opcion = new String[] {""} ;
      P07D69_A5532Lb_numero = new int[1] ;
      P07D69_A5556Lb_UltLC = new short[1] ;
      P07D69_A5718Lb_numop = new byte[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rensl10n__default(),
         new Object[] {
             new Object[] {
            P07D62_A396EmprCod, P07D62_A407EmprNom, P07D62_n407EmprNom
            }
            , new Object[] {
            P07D63_A396EmprCod, P07D63_A5555Lb_opcion, P07D63_A5532Lb_numero, P07D63_A6056Lb_pesom, P07D63_A6057Lb_volum
            }
            , new Object[] {
            P07D64_A5548Lb_Obs, P07D64_A5098TipDisCod, P07D64_n5098TipDisCod, P07D64_A396EmprCod, P07D64_A5532Lb_numero, P07D64_A5535Lb_TipArt, P07D64_A5595Lb_malha, P07D64_A5570Lb_Tipo, P07D64_A5988Lb_nfibras, P07D64_A5097TipDisDsc,
            P07D64_n5097TipDisDsc, P07D64_A5611Lb_Temp3, P07D64_A5610Lb_Temp2, P07D64_A5601Lb_Tempt, P07D64_A5594Lb_cartazf, P07D64_A5545Lb_HoraM, P07D64_A5542Lb_HoraE, P07D64_A5546Lb_UsuM, P07D64_A5544Lb_FechaM, P07D64_A5543Lb_Usuario,
            P07D64_A5541Lb_FechaE, P07D64_A5547Lb_Rb, P07D64_A584IntDsc, P07D64_n584IntDsc, P07D64_A583IntCod, P07D64_n583IntCod, P07D64_A5540Lb_Cartaz, P07D64_A5539Lb_ColNumC, P07D64_A5538Lb_ColNomC, P07D64_A832TipColDsc,
            P07D64_n832TipColDsc, P07D64_A831TipColCod, P07D64_n831TipColCod, P07D64_A5537Lb_ColNum, P07D64_A5536Lb_ColNom, P07D64_A5552Lb_TipArtD, P07D64_A5534Lb_ArtDsc, P07D64_A5533Lb_ArtCod, P07D64_A279CliNom, P07D64_A252CliCod
            }
            , new Object[] {
            P07D65_A396EmprCod, P07D65_A910Workstat, P07D65_A897EscMDsc, P07D65_A4709EscMMdlCod, P07D65_A4712EscMFacCon, P07D65_A490ForPrdUMe, P07D65_A890EscMCan, P07D65_A719PrdNum, P07D65_A764ProForCod, P07D65_A7583EscOrdn,
            P07D65_A887EscMLin
            }
            , new Object[] {
            P07D66_A396EmprCod, P07D66_A910Workstat, P07D66_A719PrdNum, P07D66_A897EscMDsc, P07D66_A4709EscMMdlCod, P07D66_A4712EscMFacCon, P07D66_A490ForPrdUMe, P07D66_A890EscMCan, P07D66_A887EscMLin, P07D66_A764ProForCod,
            P07D66_A7583EscOrdn
            }
            , new Object[] {
            P07D67_A396EmprCod, P07D67_A65ArtCod, P07D67_A252CliCod, P07D67_A105ArtTra1, P07D67_n105ArtTra1, P07D67_A108ArtTraP1, P07D67_n108ArtTraP1, P07D67_A106ArtTra2, P07D67_n106ArtTra2, P07D67_A109ArtTraP2,
            P07D67_n109ArtTraP2, P07D67_A107ArtTra3, P07D67_n107ArtTra3, P07D67_A110ArtTraP3, P07D67_n110ArtTraP3
            }
            , new Object[] {
            P07D68_A396EmprCod, P07D68_A764ProForCod, P07D68_A766ProForDsc
            }
            , new Object[] {
            P07D69_A396EmprCod, P07D69_A5555Lb_opcion, P07D69_A5532Lb_numero, P07D69_A5556Lb_UltLC, P07D69_A5718Lb_numop
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

   private byte AV124Artextil ;
   private byte AV125Tintex ;
   private byte GXv_int2[] ;
   private byte AV50Opcion ;
   private byte A5595Lb_malha ;
   private byte A5988Lb_nfibras ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
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
   private byte AV10Tab_Opc[][] ;
   private byte AV61LinPag ;
   private byte A490ForPrdUMe ;
   private byte AV68Lb_numop ;
   private byte A5718Lb_numop ;
   private short AV109Num_opc ;
   private short AV110x ;
   private short AV113Numero_v ;
   private short AV103Num_orden ;
   private short GXv_int11[] ;
   private short A5535Lb_TipArt ;
   private short A5611Lb_Temp3 ;
   private short A5610Lb_Temp2 ;
   private short A5601Lb_Tempt ;
   private short AV8i ;
   private short AV97Num_w ;
   private short AV105Escordn ;
   private short AV98Num_Op ;
   private short AV106Num_ctrl ;
   private short AV53Lin ;
   private short AV78Num_colum ;
   private short AV123Num_l ;
   private short A7583EscOrdn ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A5556Lb_UltLC ;
   private short AV74Num_ops ;
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
   private int GXv_int6[] ;
   private int A5539Lb_ColNumC ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private int AV45CliCod ;
   private int A887EscMLin ;
   private int GX_J ;
   private java.math.BigDecimal A6056Lb_pesom ;
   private java.math.BigDecimal A6057Lb_volum ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal AV57Cantidad[] ;
   private java.math.BigDecimal AV77Pipetar[] ;
   private java.math.BigDecimal AV84Cant1 ;
   private java.math.BigDecimal AV85Cant2 ;
   private java.math.BigDecimal AV86Cant3 ;
   private java.math.BigDecimal AV87Cant4 ;
   private java.math.BigDecimal AV88Cant5 ;
   private java.math.BigDecimal AV100Cant6 ;
   private java.math.BigDecimal AV116Pp1 ;
   private java.math.BigDecimal AV117Pp2 ;
   private java.math.BigDecimal AV118Pp3 ;
   private java.math.BigDecimal AV119Pp4 ;
   private java.math.BigDecimal AV120Pp5 ;
   private java.math.BigDecimal AV121Pp6 ;
   private java.math.BigDecimal AV11Tab_Ctn[][] ;
   private java.math.BigDecimal AV115Tab_pp[][] ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private java.math.BigDecimal A890EscMCan ;
   private java.math.BigDecimal AV76Tab_cant[][] ;
   private java.math.BigDecimal AV15Tab_cos[] ;
   private String A396EmprCod ;
   private String AV111Tab_opcion[] ;
   private String AV122Pp ;
   private String AV48Contdsc ;
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
   private String GXt_char3 ;
   private String AV71Lit26 ;
   private String AV72Lit27 ;
   private String AV73Lit28 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV18EmprNOm ;
   private String AV114Tab_opcii[] ;
   private String AV112Lb_opcioni ;
   private String A5555Lb_opcion ;
   private String AV62Workstat ;
   private String GXv_char5[] ;
   private String GXv_char1[] ;
   private String A5098TipDisCod ;
   private String A5570Lb_Tipo ;
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
   private String AV40Texto_m ;
   private String AV44Texto_e ;
   private String AV46Lb_artcod ;
   private String AV63ProForCod ;
   private String AV55Unidad[] ;
   private String AV89Uni1 ;
   private String AV93Uni2 ;
   private String AV90Uni3 ;
   private String AV91Uni4 ;
   private String AV92Uni5 ;
   private String AV101Uni6 ;
   private String AV56Tab_Uni[][] ;
   private String AV69Tab_Pro[] ;
   private String AV58Tab_Prd[] ;
   private String AV17PrdNumi ;
   private String AV54Produc ;
   private String AV52PrdDsc ;
   private String AV59Tab_Prn[] ;
   private String AV16Orden ;
   private String AV60Tab_Ord[] ;
   private String AV67Tab_Tip[] ;
   private String AV13Lb_opcion ;
   private String A910Workstat ;
   private String A897EscMDsc ;
   private String A4709EscMMdlCod ;
   private String A719PrdNum ;
   private String A764ProForCod ;
   private String AV47Compo ;
   private String A65ArtCod ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String AV70ProForDsc ;
   private String A766ProForDsc ;
   private String GXt_char4 ;
   private String GXv_char9[] ;
   private String AV95Tab_op[] ;
   private String AV104Tab_orden[] ;
   private String Gx_time ;
   private java.util.Date A5545Lb_HoraM ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5544Lb_FechaM ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date Gx_date ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean GxHdr4 ;
   private boolean n5098TipDisCod ;
   private boolean n5097TipDisDsc ;
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
   private String A5548Lb_Obs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P07D62_A396EmprCod ;
   private String[] P07D62_A407EmprNom ;
   private boolean[] P07D62_n407EmprNom ;
   private String[] P07D63_A396EmprCod ;
   private String[] P07D63_A5555Lb_opcion ;
   private int[] P07D63_A5532Lb_numero ;
   private java.math.BigDecimal[] P07D63_A6056Lb_pesom ;
   private java.math.BigDecimal[] P07D63_A6057Lb_volum ;
   private String[] P07D64_A5548Lb_Obs ;
   private String[] P07D64_A5098TipDisCod ;
   private boolean[] P07D64_n5098TipDisCod ;
   private String[] P07D64_A396EmprCod ;
   private int[] P07D64_A5532Lb_numero ;
   private short[] P07D64_A5535Lb_TipArt ;
   private byte[] P07D64_A5595Lb_malha ;
   private String[] P07D64_A5570Lb_Tipo ;
   private byte[] P07D64_A5988Lb_nfibras ;
   private String[] P07D64_A5097TipDisDsc ;
   private boolean[] P07D64_n5097TipDisDsc ;
   private short[] P07D64_A5611Lb_Temp3 ;
   private short[] P07D64_A5610Lb_Temp2 ;
   private short[] P07D64_A5601Lb_Tempt ;
   private java.util.Date[] P07D64_A5594Lb_cartazf ;
   private java.util.Date[] P07D64_A5545Lb_HoraM ;
   private java.util.Date[] P07D64_A5542Lb_HoraE ;
   private String[] P07D64_A5546Lb_UsuM ;
   private java.util.Date[] P07D64_A5544Lb_FechaM ;
   private String[] P07D64_A5543Lb_Usuario ;
   private java.util.Date[] P07D64_A5541Lb_FechaE ;
   private java.math.BigDecimal[] P07D64_A5547Lb_Rb ;
   private String[] P07D64_A584IntDsc ;
   private boolean[] P07D64_n584IntDsc ;
   private byte[] P07D64_A583IntCod ;
   private boolean[] P07D64_n583IntCod ;
   private String[] P07D64_A5540Lb_Cartaz ;
   private int[] P07D64_A5539Lb_ColNumC ;
   private String[] P07D64_A5538Lb_ColNomC ;
   private String[] P07D64_A832TipColDsc ;
   private boolean[] P07D64_n832TipColDsc ;
   private byte[] P07D64_A831TipColCod ;
   private boolean[] P07D64_n831TipColCod ;
   private int[] P07D64_A5537Lb_ColNum ;
   private String[] P07D64_A5536Lb_ColNom ;
   private String[] P07D64_A5552Lb_TipArtD ;
   private String[] P07D64_A5534Lb_ArtDsc ;
   private String[] P07D64_A5533Lb_ArtCod ;
   private String[] P07D64_A279CliNom ;
   private int[] P07D64_A252CliCod ;
   private String[] P07D65_A396EmprCod ;
   private String[] P07D65_A910Workstat ;
   private String[] P07D65_A897EscMDsc ;
   private String[] P07D65_A4709EscMMdlCod ;
   private java.math.BigDecimal[] P07D65_A4712EscMFacCon ;
   private byte[] P07D65_A490ForPrdUMe ;
   private java.math.BigDecimal[] P07D65_A890EscMCan ;
   private String[] P07D65_A719PrdNum ;
   private String[] P07D65_A764ProForCod ;
   private short[] P07D65_A7583EscOrdn ;
   private int[] P07D65_A887EscMLin ;
   private String[] P07D66_A396EmprCod ;
   private String[] P07D66_A910Workstat ;
   private String[] P07D66_A719PrdNum ;
   private String[] P07D66_A897EscMDsc ;
   private String[] P07D66_A4709EscMMdlCod ;
   private java.math.BigDecimal[] P07D66_A4712EscMFacCon ;
   private byte[] P07D66_A490ForPrdUMe ;
   private java.math.BigDecimal[] P07D66_A890EscMCan ;
   private int[] P07D66_A887EscMLin ;
   private String[] P07D66_A764ProForCod ;
   private short[] P07D66_A7583EscOrdn ;
   private String[] P07D67_A396EmprCod ;
   private String[] P07D67_A65ArtCod ;
   private int[] P07D67_A252CliCod ;
   private String[] P07D67_A105ArtTra1 ;
   private boolean[] P07D67_n105ArtTra1 ;
   private short[] P07D67_A108ArtTraP1 ;
   private boolean[] P07D67_n108ArtTraP1 ;
   private String[] P07D67_A106ArtTra2 ;
   private boolean[] P07D67_n106ArtTra2 ;
   private short[] P07D67_A109ArtTraP2 ;
   private boolean[] P07D67_n109ArtTraP2 ;
   private String[] P07D67_A107ArtTra3 ;
   private boolean[] P07D67_n107ArtTra3 ;
   private short[] P07D67_A110ArtTraP3 ;
   private boolean[] P07D67_n110ArtTraP3 ;
   private String[] P07D68_A396EmprCod ;
   private String[] P07D68_A764ProForCod ;
   private String[] P07D68_A766ProForDsc ;
   private String[] P07D69_A396EmprCod ;
   private String[] P07D69_A5555Lb_opcion ;
   private int[] P07D69_A5532Lb_numero ;
   private short[] P07D69_A5556Lb_UltLC ;
   private byte[] P07D69_A5718Lb_numop ;
}

final  class rensl10n__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07D62", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07D63", "SELECT T1.EmprCod, T1.Lb_opcion, T1.Lb_numero, T2.Lb_pesom, T2.Lb_volum FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero = T1.Lb_numero) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07D64", "SELECT T1.Lb_Obs, T1.TipDisCod, T1.EmprCod, T1.Lb_numero, T1.Lb_TipArt, T1.Lb_malha, T1.Lb_Tipo, T1.Lb_nfibras, T5.TipDisDsc, T1.Lb_Temp3, T1.Lb_Temp2, T1.Lb_Tempt, T1.Lb_cartazf, T1.Lb_HoraM, T1.Lb_HoraE, T1.Lb_UsuM, T1.Lb_FechaM, T1.Lb_Usuario, T1.Lb_FechaE, T1.Lb_Rb, T3.IntDsc, T1.IntCod, T1.Lb_Cartaz, T1.Lb_ColNumC, T1.Lb_ColNomC, T4.TipColDsc, T1.TipColCod, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_TipArtD, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod FROM ((((TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPDIS T5 ON T5.EmprCod = T1.EmprCod AND T5.TipDisCod = T1.TipDisCod) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07D65", "SELECT EmprCod, Workstat, EscMDsc, EscMMdlCod, EscMFacCon, ForPrdUMe, EscMCan, PrdNum, ProForCod, EscOrdn, EscMLin FROM TXPESCMAN WHERE EmprCod = ? and Workstat = ? ORDER BY EmprCod, Workstat, EscOrdn, ProForCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07D66", "SELECT EmprCod, Workstat, PrdNum, EscMDsc, EscMMdlCod, EscMFacCon, ForPrdUMe, EscMCan, EscMLin, ProForCod, EscOrdn FROM TXPESCMAN WHERE EmprCod = ? and Workstat = ? ORDER BY EmprCod, Workstat, EscOrdn, ProForCod, EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07D67", "SELECT EmprCod, ArtCod, CliCod, ArtTra1, ArtTraP1, ArtTra2, ArtTraP2, ArtTra3, ArtTraP3 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07D68", "SELECT EmprCod, ProForCod, ProForDsc FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07D69", "SELECT EmprCod, Lb_opcion, Lb_numero, Lb_UltLC, Lb_numop FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[15])[0] = GXutil.resetDate(rslt.getGXDateTime(14));
               ((java.util.Date[]) buf[16])[0] = GXutil.resetDate(rslt.getGXDateTime(15));
               ((String[]) buf[17])[0] = rslt.getString(16, 10);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 10);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(19);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[22])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(22);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 20);
               ((int[]) buf[27])[0] = rslt.getInt(24);
               ((String[]) buf[28])[0] = rslt.getString(25, 13);
               ((String[]) buf[29])[0] = rslt.getString(26, 30);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(27);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((int[]) buf[33])[0] = rslt.getInt(28);
               ((String[]) buf[34])[0] = rslt.getString(29, 13);
               ((String[]) buf[35])[0] = rslt.getString(30, 30);
               ((String[]) buf[36])[0] = rslt.getString(31, 26);
               ((String[]) buf[37])[0] = rslt.getString(32, 16);
               ((String[]) buf[38])[0] = rslt.getString(33, 30);
               ((int[]) buf[39])[0] = rslt.getInt(34);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 4 :
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
            case 5 :
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
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

