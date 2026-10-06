package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rens101_impl extends GXWebReport
{
   public rens101_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 1 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 256, 11909, 17107, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV60Contdsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENS010", ""), GXv_char1) ;
         rens101_impl.this.AV60Contdsc = GXv_char1[0] ;
         GXv_int2[0] = AV62Hilo ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HILO", ""), GXv_int2) ;
         rens101_impl.this.AV62Hilo = GXv_int2[0] ;
         GXt_char3 = AV31Lit1 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV31Lit1 = GXt_char3 ;
         GXt_char3 = AV32Lit2 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV32Lit2 = GXt_char3 ;
         AV33Lit3 = GXutil.trim( AV31Lit1) + "-" + GXutil.trim( AV32Lit2) ;
         GXt_char3 = AV34Lit4 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT305_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV34Lit4 = GXt_char3 ;
         GXt_char3 = AV35Lit5 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV35Lit5 = GXt_char3 ;
         GXt_char3 = AV36Lit6 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WCFL120_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV36Lit6 = GXutil.trim( GXt_char3) ;
         if ( GXutil.strcmp(AV36Lit6, httpContext.getMessage( "WCFL120_", "")) == 0 )
         {
            GXt_char3 = AV36Lit6 ;
            GXv_char1[0] = GXt_char3 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char1) ;
            rens101_impl.this.GXt_char3 = GXv_char1[0] ;
            AV36Lit6 = GXt_char3 ;
         }
         GXt_char3 = AV37Lit7 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV37Lit7 = GXt_char3 ;
         GXt_char3 = AV38Lit8 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV38Lit8 = GXutil.trim( GXt_char3) ;
         GXt_char3 = AV39Lit9 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV39Lit9 = GXutil.trim( GXt_char3) ;
         GXt_char3 = AV40Lit10 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1194_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV40Lit10 = GXt_char3 ;
         GXt_char3 = AV41Lit11 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN236", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV41Lit11 = GXt_char3 ;
         GXt_char3 = AV42Lit12 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1164_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV42Lit12 = GXutil.trim( GXt_char3) ;
         GXt_char3 = AV43Lit13 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1327_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV43Lit13 = GXt_char3 ;
         GXt_char3 = AV44Lit14 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1145_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV44Lit14 = GXt_char3 ;
         GXt_char3 = AV45Lit15 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1160_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV45Lit15 = GXt_char3 ;
         GXt_char3 = AV46Lit16 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN176", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV46Lit16 = GXt_char3 ;
         GXt_char3 = AV47Lit17 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN079_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV47Lit17 = GXt_char3 ;
         GXt_char3 = AV48Lit18 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1134_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV48Lit18 = GXutil.trim( GXt_char3) ;
         GXt_char3 = AV49Lit19 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN237", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV49Lit19 = GXutil.trim( GXt_char3) ;
         GXt_char3 = AV50Lit20 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN037", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV50Lit20 = GXutil.trim( GXt_char3) ;
         AV50Lit20 = GXutil.substring( AV50Lit20, 1, 8) ;
         GXt_char3 = AV51Lit21 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN238", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV51Lit21 = GXutil.trim( GXt_char3) ;
         AV51Lit21 = GXutil.substring( AV51Lit21, 1, 9) ;
         GXt_char3 = AV53Lit22 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV53Lit22 = GXt_char3 ;
         GXt_char3 = AV54Lit23 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1217_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV54Lit23 = GXt_char3 ;
         GXt_char3 = AV55Lit24 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN208", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         AV55Lit24 = GXt_char3 ;
         GXt_char3 = AV61Lit25 ;
         GXv_char1[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1376_", ""), (byte)(99), GXv_char1) ;
         rens101_impl.this.GXt_char3 = GXv_char1[0] ;
         GXt_char4 = AV61Lit25 ;
         GXv_char5[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char5) ;
         rens101_impl.this.GXt_char4 = GXv_char5[0] ;
         AV61Lit25 = GXt_char3 + " " + GXt_char4 ;
         AV63Lit26 = httpContext.getMessage( "Nº IDM", "") ;
         if ( AV62Hilo == 1 )
         {
            GXt_char4 = AV63Lit26 ;
            GXv_char5[0] = GXt_char4 ;
            new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1017_", ""), (byte)(99), GXv_char5) ;
            rens101_impl.this.GXt_char4 = GXv_char5[0] ;
            AV63Lit26 = GXt_char4 ;
         }
         GXt_char4 = AV64Lit27 ;
         GXv_char5[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char5) ;
         rens101_impl.this.GXt_char4 = GXv_char5[0] ;
         AV64Lit27 = GXutil.trim( GXt_char4) + " " + httpContext.getMessage( "Ent.", "") ;
         GXt_char4 = AV65Lit28 ;
         GXv_char5[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT187_", ""), (byte)(99), GXv_char5) ;
         rens101_impl.this.GXt_char4 = GXv_char5[0] ;
         AV65Lit28 = GXutil.trim( GXt_char4) + " " + httpContext.getMessage( "Mod.", "") ;
         GXt_char4 = AV85Lit30 ;
         GXv_char5[0] = GXt_char4 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJVR004_", ""), (byte)(99), GXv_char5) ;
         rens101_impl.this.GXt_char4 = GXv_char5[0] ;
         AV85Lit30 = GXutil.trim( GXt_char4) ;
         /* Using cursor P074G2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P074G2_A407EmprNom[0] ;
            n407EmprNom = P074G2_n407EmprNom[0] ;
            AV30EmprNOm = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV67FlagModa = (byte)(0) ;
         GXv_int2[0] = AV67FlagModa ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
         rens101_impl.this.AV67FlagModa = GXv_int2[0] ;
         GxHdr3 = true ;
         /* Using cursor P074G3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5548Lb_Obs = P074G3_A5548Lb_Obs[0] ;
            A5594Lb_cartazf = P074G3_A5594Lb_cartazf[0] ;
            A6546Lb_Pantone = P074G3_A6546Lb_Pantone[0] ;
            A5539Lb_ColNumC = P074G3_A5539Lb_ColNumC[0] ;
            A6618Lb_PedCod = P074G3_A6618Lb_PedCod[0] ;
            A5595Lb_malha = P074G3_A5595Lb_malha[0] ;
            A5570Lb_Tipo = P074G3_A5570Lb_Tipo[0] ;
            A6653Lb_Tra1 = P074G3_A6653Lb_Tra1[0] ;
            A6654Lb_TraP1 = P074G3_A6654Lb_TraP1[0] ;
            A6655Lb_Tra2 = P074G3_A6655Lb_Tra2[0] ;
            A6656Lb_TraP2 = P074G3_A6656Lb_TraP2[0] ;
            A6657Lb_Tra3 = P074G3_A6657Lb_Tra3[0] ;
            A6658Lb_TraP3 = P074G3_A6658Lb_TraP3[0] ;
            A6842Lb_Tra4 = P074G3_A6842Lb_Tra4[0] ;
            A6843Lb_TraP4 = P074G3_A6843Lb_TraP4[0] ;
            A6844Lb_Tra5 = P074G3_A6844Lb_Tra5[0] ;
            A6845Lb_TraP5 = P074G3_A6845Lb_TraP5[0] ;
            A6846Lb_Tra6 = P074G3_A6846Lb_Tra6[0] ;
            A6847Lb_TraP6 = P074G3_A6847Lb_TraP6[0] ;
            A5545Lb_HoraM = P074G3_A5545Lb_HoraM[0] ;
            A5544Lb_FechaM = P074G3_A5544Lb_FechaM[0] ;
            A5542Lb_HoraE = P074G3_A5542Lb_HoraE[0] ;
            A5541Lb_FechaE = P074G3_A5541Lb_FechaE[0] ;
            A5540Lb_Cartaz = P074G3_A5540Lb_Cartaz[0] ;
            A5538Lb_ColNomC = P074G3_A5538Lb_ColNomC[0] ;
            A5537Lb_ColNum = P074G3_A5537Lb_ColNum[0] ;
            A5536Lb_ColNom = P074G3_A5536Lb_ColNom[0] ;
            A5534Lb_ArtDsc = P074G3_A5534Lb_ArtDsc[0] ;
            A5533Lb_ArtCod = P074G3_A5533Lb_ArtCod[0] ;
            A279CliNom = P074G3_A279CliNom[0] ;
            A252CliCod = P074G3_A252CliCod[0] ;
            A279CliNom = P074G3_A279CliNom[0] ;
            AV70Lb_Cartazd = A5594Lb_cartazf ;
            AV83Lb_Pantone = GXutil.substring( A6546Lb_Pantone, 1, 60) ;
            AV88Lb_colnumc = A5539Lb_ColNumC ;
            AV90Lb_pedcod = GXutil.substring( A6618Lb_PedCod, 1, 45) ;
            if ( A5595Lb_malha == 1 )
            {
               AV52Texto_m = httpContext.getMessage( "Cliente", "") ;
            }
            else if ( A5595Lb_malha == 2 )
            {
               AV52Texto_m = httpContext.getMessage( "Produçao", "") ;
            }
            else if ( A5595Lb_malha == 3 )
            {
               AV52Texto_m = httpContext.getMessage( "Provisoria", "") ;
            }
            else if ( A5595Lb_malha == 4 )
            {
               AV52Texto_m = httpContext.getMessage( "Aguarda", "") ;
            }
            else
            {
               AV52Texto_m = "" ;
            }
            if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "C", "")) == 0 )
            {
               AV56Texto_e = httpContext.getMessage( "Cliente", "") ;
            }
            else if ( GXutil.strcmp(A5570Lb_Tipo, httpContext.getMessage( "P", "")) == 0 )
            {
               AV56Texto_e = httpContext.getMessage( "Produçao", "") ;
            }
            else
            {
               AV56Texto_e = "" ;
            }
            AV57CliCod = A252CliCod ;
            AV58Lb_artcod = A5533Lb_ArtCod ;
            AV59Compo = "" ;
            if ( ! (GXutil.strcmp("", A6653Lb_Tra1)==0) )
            {
               AV59Compo = GXutil.trim( GXutil.str( A6654Lb_TraP1, 3, 0)) + "% " + GXutil.trim( A6653Lb_Tra1) + " " ;
               if ( ! (GXutil.strcmp("", A6655Lb_Tra2)==0) )
               {
                  AV59Compo += GXutil.trim( GXutil.str( A6656Lb_TraP2, 3, 0)) + "% " + GXutil.trim( A6655Lb_Tra2) + " " ;
               }
               if ( ! (GXutil.strcmp("", A6657Lb_Tra3)==0) )
               {
                  AV59Compo += GXutil.trim( GXutil.str( A6658Lb_TraP3, 3, 0)) + "% " + GXutil.trim( A6657Lb_Tra3) + " " ;
               }
               if ( ! (GXutil.strcmp("", A6842Lb_Tra4)==0) )
               {
                  AV59Compo += GXutil.trim( GXutil.str( A6843Lb_TraP4, 3, 0)) + "% " + GXutil.trim( A6842Lb_Tra4) + " " ;
               }
               if ( ! (GXutil.strcmp("", A6844Lb_Tra5)==0) )
               {
                  AV59Compo += GXutil.trim( GXutil.str( A6845Lb_TraP5, 3, 0)) + "% " + GXutil.trim( A6844Lb_Tra5) + " " ;
               }
               if ( ! (GXutil.strcmp("", A6846Lb_Tra6)==0) )
               {
                  AV59Compo += GXutil.trim( GXutil.str( A6847Lb_TraP6, 3, 0)) + "% " + GXutil.trim( A6846Lb_Tra6) + " " ;
               }
            }
            AV8i = (short)(0) ;
            AV8i = (short)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV9Tab_op[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV27Tab_cos[GX_I-1] = DecimalUtil.doubleToDec(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P074G4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A5556Lb_UltLC = P074G4_A5556Lb_UltLC[0] ;
               A5718Lb_numop = P074G4_A5718Lb_numop[0] ;
               A5565Lb_CosteE = P074G4_A5565Lb_CosteE[0] ;
               A5555Lb_opcion = P074G4_A5555Lb_opcion[0] ;
               AV89Lb_numop = GXutil.str( A5718Lb_numop, 2, 0) ;
               if ( GXutil.strcmp(AV89Lb_numop, "00") == 0 )
               {
                  AV89Lb_numop = " " ;
               }
               AV9Tab_op[AV8i-1] = A5555Lb_opcion ;
               AV9Tab_op[AV8i-1] = AV89Lb_numop ;
               AV27Tab_cos[AV8i-1] = A5565Lb_CosteE ;
               AV8i = (short)(AV8i+1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV73NumCol = (short)(0) ;
            AV8i = (short)(0) ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV10Tab_opc[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV11Tab_prc[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV22Tab_prn[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               GX_J = 1 ;
               while ( GX_J <= 9 )
               {
                  AV12Tab_ctc[GX_I-1][GX_J-1] = "" ;
                  GX_J = (int)(GX_J+1) ;
               }
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV75TabPrd[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P074G5 */
            pr_default.execute(3, new Object[] {Integer.valueOf(A5532Lb_numero), A396EmprCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               brk74G6 = false ;
               A490ForPrdUMe = P074G5_A490ForPrdUMe[0] ;
               A719PrdNum = P074G5_A719PrdNum[0] ;
               A718PrdNom = P074G5_A718PrdNom[0] ;
               A5718Lb_numop = P074G5_A5718Lb_numop[0] ;
               A5555Lb_opcion = P074G5_A5555Lb_opcion[0] ;
               A5558LB_CantC = P074G5_A5558LB_CantC[0] ;
               A6544Lb_PTinC = P074G5_A6544Lb_PTinC[0] ;
               A488ForPrdDsc = P074G5_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P074G5_n488ForPrdDsc[0] ;
               A5557Lb_LineaC = P074G5_A5557Lb_LineaC[0] ;
               A488ForPrdDsc = P074G5_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P074G5_n488ForPrdDsc[0] ;
               A718PrdNom = P074G5_A718PrdNom[0] ;
               A5718Lb_numop = P074G5_A5718Lb_numop[0] ;
               AV80Numero = A5532Lb_numero ;
               AV82Lb_PTinC = A6544Lb_PTinC ;
               while ( (pr_default.getStatus(3) != 101) && ( P074G5_A5532Lb_numero[0] == A5532Lb_numero ) && ( P074G5_A6544Lb_PTinC[0] == A6544Lb_PTinC ) )
               {
                  brk74G6 = false ;
                  A490ForPrdUMe = P074G5_A490ForPrdUMe[0] ;
                  A719PrdNum = P074G5_A719PrdNum[0] ;
                  A718PrdNom = P074G5_A718PrdNom[0] ;
                  A5718Lb_numop = P074G5_A5718Lb_numop[0] ;
                  A5555Lb_opcion = P074G5_A5555Lb_opcion[0] ;
                  A5558LB_CantC = P074G5_A5558LB_CantC[0] ;
                  A488ForPrdDsc = P074G5_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P074G5_n488ForPrdDsc[0] ;
                  A5557Lb_LineaC = P074G5_A5557Lb_LineaC[0] ;
                  A488ForPrdDsc = P074G5_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P074G5_n488ForPrdDsc[0] ;
                  A718PrdNom = P074G5_A718PrdNom[0] ;
                  A5718Lb_numop = P074G5_A5718Lb_numop[0] ;
                  if ( GXutil.strcmp(P074G5_A396EmprCod[0], A396EmprCod) == 0 )
                  {
                     AV8i = (short)(AV8i+1) ;
                     AV75TabPrd[AV8i-1] = A488ForPrdDsc ;
                     while ( (pr_default.getStatus(3) != 101) && ( P074G5_A5532Lb_numero[0] == A5532Lb_numero ) && ( P074G5_A6544Lb_PTinC[0] == A6544Lb_PTinC ) && ( P074G5_A5557Lb_LineaC[0] == A5557Lb_LineaC ) )
                     {
                        brk74G6 = false ;
                        A719PrdNum = P074G5_A719PrdNum[0] ;
                        A718PrdNom = P074G5_A718PrdNom[0] ;
                        A5718Lb_numop = P074G5_A5718Lb_numop[0] ;
                        A5555Lb_opcion = P074G5_A5555Lb_opcion[0] ;
                        A5558LB_CantC = P074G5_A5558LB_CantC[0] ;
                        A718PrdNom = P074G5_A718PrdNom[0] ;
                        A5718Lb_numop = P074G5_A5718Lb_numop[0] ;
                        if ( GXutil.strcmp(P074G5_A396EmprCod[0], A396EmprCod) == 0 )
                        {
                           AV11Tab_prc[AV8i-1] = A719PrdNum ;
                           AV22Tab_prn[AV8i-1] = A718PrdNom ;
                           AV89Lb_numop = GXutil.str( A5718Lb_numop, 2, 0) ;
                           if ( GXutil.strcmp(AV89Lb_numop, "00") == 0 )
                           {
                              AV89Lb_numop = " " ;
                           }
                           AV81Opci = A5555Lb_opcion ;
                           AV81Opci = AV89Lb_numop ;
                           /* Execute user subroutine: 'POSICION' */
                           S1313 ();
                           if ( returnInSub )
                           {
                              pr_default.close(3);
                              pr_default.close(3);
                              pr_default.close(3);
                              pr_default.close(3);
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
                           AV10Tab_opc[AV71Opc-1] = A5555Lb_opcion ;
                           AV12Tab_ctc[AV8i-1][AV71Opc-1] = GXutil.str( A5558LB_CantC, 10, 4) ;
                        }
                        brk74G6 = true ;
                        pr_default.readNext(3);
                     }
                     GX_I = 1 ;
                     while ( GX_I <= 100 )
                     {
                        AV13Tab_opp[GX_I-1] = "" ;
                        GX_I = (int)(GX_I+1) ;
                     }
                     GX_I = 1 ;
                     while ( GX_I <= 100 )
                     {
                        AV14Tab_prp[GX_I-1] = "" ;
                        GX_I = (int)(GX_I+1) ;
                     }
                     GX_I = 1 ;
                     while ( GX_I <= 100 )
                     {
                        AV23Tab_prpn[GX_I-1] = "" ;
                        GX_I = (int)(GX_I+1) ;
                     }
                     GX_I = 1 ;
                     while ( GX_I <= 100 )
                     {
                        GX_J = 1 ;
                        while ( GX_J <= 9 )
                        {
                           AV15Tab_ctp[GX_I-1][GX_J-1] = "" ;
                           GX_J = (int)(GX_J+1) ;
                        }
                        GX_I = (int)(GX_I+1) ;
                     }
                     GX_I = 1 ;
                     while ( GX_I <= 100 )
                     {
                        GX_J = 1 ;
                        while ( GX_J <= 9 )
                        {
                           AV76TabPrd2[GX_I-1][GX_J-1] = "" ;
                           GX_J = (int)(GX_J+1) ;
                        }
                        GX_I = (int)(GX_I+1) ;
                     }
                     GX_I = 1 ;
                     while ( GX_I <= 100 )
                     {
                        AV77Tab_Pror[GX_I-1] = (short)(0) ;
                        GX_I = (int)(GX_I+1) ;
                     }
                     AV74NumPr = AV8i ;
                  }
                  if ( ! brk74G6 )
                  {
                     brk74G6 = true ;
                     pr_default.readNext(3);
                  }
               }
               AV73NumCol = AV8i ;
               AV8i = (short)(AV8i+1) ;
               AV22Tab_prn[AV8i-1] = httpContext.getMessage( "S", "") ;
               /* Execute user subroutine: 'PRODUCTOS' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(3);
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
               AV8i = (short)(AV8i+1) ;
               AV22Tab_prn[AV8i-1] = "" ;
               if ( ! brk74G6 )
               {
                  brk74G6 = true ;
                  pr_default.readNext(3);
               }
            }
            pr_default.close(3);
            AV78Total = AV8i ;
            h74G0( false, 3) ;
            getPrinter().GxDrawLine(30, Gx_line+0, 1082, Gx_line+0, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+3) ;
            h74G0( false, 45) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Tab_op[1-1], "")), 373, Gx_line+3, 389, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Tab_cos[1-1], "ZZZZZ.ZZZZZ")), 335, Gx_line+22, 416, Gx_line+39, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Tab_op[2-1], "")), 466, Gx_line+3, 482, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Tab_cos[2-1], "ZZZZZ.ZZZZZ")), 427, Gx_line+22, 508, Gx_line+39, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Tab_op[3-1], "")), 554, Gx_line+3, 570, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Tab_cos[3-1], "ZZZZZ.ZZZZZ")), 521, Gx_line+22, 602, Gx_line+39, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Tab_op[4-1], "")), 649, Gx_line+3, 665, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Tab_cos[4-1], "ZZZZZ.ZZZZZ")), 611, Gx_line+22, 692, Gx_line+39, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Tab_op[5-1], "")), 743, Gx_line+3, 759, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Tab_cos[5-1], "ZZZZZ.ZZZZZ")), 708, Gx_line+22, 789, Gx_line+39, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit14, "")), 36, Gx_line+13, 100, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit15, "")), 118, Gx_line+13, 182, Gx_line+30, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 107, Gx_line+10, 111, Gx_line+26, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit16, "")), 192, Gx_line+22, 256, Gx_line+39, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Lit17, "")), 193, Gx_line+3, 257, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Tab_cos[6-1], "ZZZZZ.ZZZZZ")), 808, Gx_line+22, 889, Gx_line+39, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Tab_op[6-1], "")), 844, Gx_line+3, 860, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(30, Gx_line+0, 30, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(283, Gx_line+0, 283, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(421, Gx_line+0, 421, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(607, Gx_line+0, 607, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(701, Gx_line+0, 701, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(801, Gx_line+0, 801, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1081, Gx_line+0, 1081, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(514, Gx_line+0, 514, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(330, Gx_line+0, 330, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(897, Gx_line+0, 897, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(992, Gx_line+0, 992, Gx_line+42, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Tab_op[7-1], "")), 944, Gx_line+3, 960, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Tab_cos[7-1], "ZZZZZ.ZZZZZ")), 902, Gx_line+22, 983, Gx_line+39, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Tab_op[8-1], "")), 1030, Gx_line+3, 1046, Gx_line+20, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27Tab_cos[8-1], "ZZZZZ.ZZZZZ")), 996, Gx_line+22, 1077, Gx_line+39, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Unid.", ""), 293, Gx_line+13, 323, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(30, Gx_line+42, 1082, Gx_line+42, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+45) ;
            AV29PrdNumi = "" ;
            AV8i = (short)(1) ;
            while ( AV8i <= AV78Total )
            {
               AV29PrdNumi = AV11Tab_prc[AV8i-1] ;
               if ( ( GXutil.strcmp(AV22Tab_prn[AV8i-1], "") == 0 ) && ( AV8i != AV78Total ) )
               {
                  h74G0( false, 16) ;
                  getPrinter().GxDrawRect(30, Gx_line+1, 1082, Gx_line+14, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
               }
               else
               {
                  if ( GXutil.strcmp(AV22Tab_prn[AV8i-1], httpContext.getMessage( "S", "")) == 0 )
                  {
                  }
                  else
                  {
                     if ( ! (GXutil.strcmp("", AV22Tab_prn[AV8i-1])==0) )
                     {
                        if ( ( GXutil.strcmp(GXutil.substring( AV11Tab_prc[AV8i-1], 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( AV11Tab_prc[AV8i-1], 1, 1), "7") <= 0 ) )
                        {
                           h74G0( false, 30) ;
                           getPrinter().GxDrawLine(283, Gx_line+0, 283, Gx_line+28, 1, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][1-1], "")), 335, Gx_line+6, 416, Gx_line+24, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(421, Gx_line+1, 421, Gx_line+29, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][2-1], "")), 427, Gx_line+6, 508, Gx_line+24, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(514, Gx_line+1, 514, Gx_line+29, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][3-1], "")), 519, Gx_line+6, 600, Gx_line+24, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(607, Gx_line+0, 607, Gx_line+28, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][4-1], "")), 614, Gx_line+6, 695, Gx_line+24, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(701, Gx_line+1, 701, Gx_line+29, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][5-1], "")), 711, Gx_line+6, 792, Gx_line+24, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(801, Gx_line+0, 801, Gx_line+28, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][6-1], "")), 811, Gx_line+6, 892, Gx_line+24, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(30, Gx_line+28, 1080, Gx_line+28, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Tab_prn[AV8i-1], "")), 45, Gx_line+0, 236, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(1081, Gx_line+0, 1081, Gx_line+28, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(30, Gx_line+0, 30, Gx_line+28, 1, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TabPrd[AV8i-1], "")), 288, Gx_line+6, 325, Gx_line+24, 1+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(330, Gx_line+0, 330, Gx_line+28, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(897, Gx_line+1, 897, Gx_line+29, 1, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][7-1], "")), 905, Gx_line+6, 986, Gx_line+24, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][8-1], "")), 994, Gx_line+6, 1075, Gx_line+24, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(992, Gx_line+0, 992, Gx_line+28, 1, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Tab_prc[AV8i-1], "")), 45, Gx_line+14, 109, Gx_line+29, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+30) ;
                        }
                        else
                        {
                           if ( GXutil.strcmp(AV11Tab_prc[AV8i-1], httpContext.getMessage( "SEMCOR", "")) == 0 )
                           {
                           }
                           else
                           {
                              AV29PrdNumi = ((GXutil.strcmp(AV29PrdNumi, httpContext.getMessage( "LINHA", ""))==0) ? " " : AV29PrdNumi) ;
                              h74G0( false, 30) ;
                              getPrinter().GxDrawLine(283, Gx_line+0, 283, Gx_line+28, 1, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][1-1], "")), 335, Gx_line+6, 416, Gx_line+24, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawLine(421, Gx_line+1, 421, Gx_line+29, 1, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][2-1], "")), 427, Gx_line+6, 508, Gx_line+24, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawLine(514, Gx_line+1, 514, Gx_line+29, 1, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][3-1], "")), 519, Gx_line+6, 600, Gx_line+24, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawLine(607, Gx_line+0, 607, Gx_line+28, 1, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][4-1], "")), 614, Gx_line+6, 695, Gx_line+24, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawLine(701, Gx_line+1, 701, Gx_line+29, 1, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][5-1], "")), 711, Gx_line+6, 792, Gx_line+24, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawLine(801, Gx_line+0, 801, Gx_line+28, 1, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][6-1], "")), 811, Gx_line+6, 892, Gx_line+24, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawLine(30, Gx_line+28, 1082, Gx_line+28, 1, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Tab_prn[AV8i-1], "")), 89, Gx_line+0, 280, Gx_line+18, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawLine(1081, Gx_line+0, 1081, Gx_line+28, 1, 0, 0, 0, 0) ;
                              getPrinter().GxDrawLine(30, Gx_line+0, 30, Gx_line+28, 1, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TabPrd[AV8i-1], "")), 288, Gx_line+6, 325, Gx_line+24, 1+256, 0, 0, 0) ;
                              getPrinter().GxDrawLine(330, Gx_line+0, 330, Gx_line+28, 1, 0, 0, 0, 0) ;
                              getPrinter().GxDrawLine(897, Gx_line+1, 897, Gx_line+29, 1, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][7-1], "")), 905, Gx_line+6, 986, Gx_line+24, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Tab_ctc[AV8i-1][8-1], "")), 999, Gx_line+6, 1080, Gx_line+24, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawLine(992, Gx_line+0, 992, Gx_line+28, 1, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29PrdNumi, "")), 89, Gx_line+14, 153, Gx_line+29, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+30) ;
                           }
                        }
                     }
                  }
               }
               AV29PrdNumi = AV11Tab_prc[AV8i-1] ;
               AV8i = (short)(AV8i+1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h74G0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV59Compo = "" ;
      /* Using cursor P074G6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV57CliCod), AV58Lb_artcod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A65ArtCod = P074G6_A65ArtCod[0] ;
         A252CliCod = P074G6_A252CliCod[0] ;
         A105ArtTra1 = P074G6_A105ArtTra1[0] ;
         n105ArtTra1 = P074G6_n105ArtTra1[0] ;
         A108ArtTraP1 = P074G6_A108ArtTraP1[0] ;
         n108ArtTraP1 = P074G6_n108ArtTraP1[0] ;
         A106ArtTra2 = P074G6_A106ArtTra2[0] ;
         n106ArtTra2 = P074G6_n106ArtTra2[0] ;
         A109ArtTraP2 = P074G6_A109ArtTraP2[0] ;
         n109ArtTraP2 = P074G6_n109ArtTraP2[0] ;
         A107ArtTra3 = P074G6_A107ArtTra3[0] ;
         n107ArtTra3 = P074G6_n107ArtTra3[0] ;
         A110ArtTraP3 = P074G6_A110ArtTraP3[0] ;
         n110ArtTraP3 = P074G6_n110ArtTraP3[0] ;
         if ( ! (GXutil.strcmp("", A105ArtTra1)==0) )
         {
            AV59Compo = GXutil.trim( GXutil.str( A108ArtTraP1, 3, 0)) + "% " + GXutil.trim( A105ArtTra1) + " " ;
            if ( ! (GXutil.strcmp("", A106ArtTra2)==0) )
            {
               AV59Compo += GXutil.trim( GXutil.str( A109ArtTraP2, 3, 0)) + "% " + GXutil.trim( A106ArtTra2) + " " ;
            }
            if ( ! (GXutil.strcmp("", A107ArtTra3)==0) )
            {
               AV59Compo += GXutil.trim( GXutil.str( A110ArtTraP3, 3, 0)) + "% " + GXutil.trim( A107ArtTra3) + " " ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRODUCTOS' Routine */
      returnInSub = false ;
      /* Using cursor P074G7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Byte.valueOf(AV82Lb_PTinC), Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk74G11 = false ;
         A490ForPrdUMe = P074G7_A490ForPrdUMe[0] ;
         A6545Lb_PTinP = P074G7_A6545Lb_PTinP[0] ;
         A719PrdNum = P074G7_A719PrdNum[0] ;
         A718PrdNom = P074G7_A718PrdNom[0] ;
         A5562Lb_orden = P074G7_A5562Lb_orden[0] ;
         A5718Lb_numop = P074G7_A5718Lb_numop[0] ;
         A5555Lb_opcion = P074G7_A5555Lb_opcion[0] ;
         A5561LB_CantP = P074G7_A5561LB_CantP[0] ;
         A488ForPrdDsc = P074G7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P074G7_n488ForPrdDsc[0] ;
         A5560Lb_LineaPr = P074G7_A5560Lb_LineaPr[0] ;
         A718PrdNom = P074G7_A718PrdNom[0] ;
         A488ForPrdDsc = P074G7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P074G7_n488ForPrdDsc[0] ;
         A5718Lb_numop = P074G7_A5718Lb_numop[0] ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P074G7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P074G7_A6545Lb_PTinP[0] == A6545Lb_PTinP ) )
         {
            brk74G11 = false ;
            A490ForPrdUMe = P074G7_A490ForPrdUMe[0] ;
            A719PrdNum = P074G7_A719PrdNum[0] ;
            A718PrdNom = P074G7_A718PrdNom[0] ;
            A5562Lb_orden = P074G7_A5562Lb_orden[0] ;
            A5718Lb_numop = P074G7_A5718Lb_numop[0] ;
            A5555Lb_opcion = P074G7_A5555Lb_opcion[0] ;
            A5561LB_CantP = P074G7_A5561LB_CantP[0] ;
            A488ForPrdDsc = P074G7_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P074G7_n488ForPrdDsc[0] ;
            A5560Lb_LineaPr = P074G7_A5560Lb_LineaPr[0] ;
            A718PrdNom = P074G7_A718PrdNom[0] ;
            A488ForPrdDsc = P074G7_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P074G7_n488ForPrdDsc[0] ;
            A5718Lb_numop = P074G7_A5718Lb_numop[0] ;
            if ( P074G7_A5532Lb_numero[0] == A5532Lb_numero )
            {
               AV8i = (short)(AV8i+1) ;
               AV75TabPrd[AV8i-1] = A488ForPrdDsc ;
               while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P074G7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P074G7_A6545Lb_PTinP[0] == A6545Lb_PTinP ) && ( P074G7_A5560Lb_LineaPr[0] == A5560Lb_LineaPr ) )
               {
                  brk74G11 = false ;
                  A719PrdNum = P074G7_A719PrdNum[0] ;
                  A718PrdNom = P074G7_A718PrdNom[0] ;
                  A5562Lb_orden = P074G7_A5562Lb_orden[0] ;
                  A5718Lb_numop = P074G7_A5718Lb_numop[0] ;
                  A5555Lb_opcion = P074G7_A5555Lb_opcion[0] ;
                  A5561LB_CantP = P074G7_A5561LB_CantP[0] ;
                  A718PrdNom = P074G7_A718PrdNom[0] ;
                  A5718Lb_numop = P074G7_A5718Lb_numop[0] ;
                  if ( P074G7_A5532Lb_numero[0] == A5532Lb_numero )
                  {
                     AV11Tab_prc[AV8i-1] = A719PrdNum ;
                     AV22Tab_prn[AV8i-1] = A718PrdNom ;
                     AV77Tab_Pror[AV8i-1] = A5562Lb_orden ;
                     AV89Lb_numop = GXutil.str( A5718Lb_numop, 2, 0) ;
                     if ( GXutil.strcmp(AV89Lb_numop, "00") == 0 )
                     {
                        AV89Lb_numop = " " ;
                     }
                     AV81Opci = A5555Lb_opcion ;
                     AV81Opci = AV89Lb_numop ;
                     /* Execute user subroutine: 'POSICION' */
                     S1313 ();
                     if ( returnInSub )
                     {
                        pr_default.close(5);
                        pr_default.close(5);
                        pr_default.close(5);
                        pr_default.close(5);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        if (true) return;
                     }
                     AV72Opp = AV71Opc ;
                     AV12Tab_ctc[AV8i-1][AV72Opp-1] = GXutil.str( A5561LB_CantP, 7, 2) ;
                  }
                  brk74G11 = true ;
                  pr_default.readNext(5);
               }
            }
            if ( ! brk74G11 )
            {
               brk74G11 = true ;
               pr_default.readNext(5);
            }
         }
         if ( ! brk74G11 )
         {
            brk74G11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S1313( ) throws ProcessInterruptedException
   {
      /* 'POSICION' Routine */
      returnInSub = false ;
      AV86FlagPos = (byte)(0) ;
      AV87ContPos = (short)(1) ;
      while ( AV86FlagPos == 0 )
      {
         if ( AV87ContPos > 100 )
         {
            if (true) break;
         }
         if ( GXutil.strcmp(AV9Tab_op[AV87ContPos-1], AV81Opci) == 0 )
         {
            AV71Opc = AV87ContPos ;
            AV86FlagPos = (byte)(1) ;
         }
         AV87ContPos = (short)(AV87ContPos+1) ;
      }
   }

   public void h74G0( boolean bFoot ,
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Contdsc, "")), 30, Gx_line+1, 114, Gx_line+12, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ficha de Registo de Receita", ""), 122, Gx_line+0, 247, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+14) ;
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
               getPrinter().GxDrawRect(29, Gx_line+8, 171, Gx_line+43, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9")), 101, Gx_line+18, 160, Gx_line+36, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 93, Gx_line+49, 138, Gx_line+67, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 144, Gx_line+49, 364, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5533Lb_ArtCod, "")), 93, Gx_line+71, 211, Gx_line+89, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5534Lb_ArtDsc, "")), 216, Gx_line+71, 407, Gx_line+89, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5536Lb_ColNom, "")), 853, Gx_line+48, 989, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5537Lb_ColNum), "ZZZZZ9")), 997, Gx_line+48, 1061, Gx_line+68, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5538Lb_ColNomC, "")), 551, Gx_line+48, 687, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV88Lb_colnumc), "ZZZZZZ")), 698, Gx_line+48, 762, Gx_line+68, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5540Lb_Cartaz, "")), 853, Gx_line+94, 1062, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30EmprNOm, "")), 413, Gx_line+8, 664, Gx_line+29, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit4, "")), 34, Gx_line+18, 98, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Lit5, "")), 34, Gx_line+49, 76, Gx_line+65, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit6, "")), 772, Gx_line+96, 839, Gx_line+112, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit7, "")), 33, Gx_line+71, 75, Gx_line+87, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit8, "")), 786, Gx_line+49, 838, Gx_line+65, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Lit9, "")), 489, Gx_line+49, 533, Gx_line+65, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Compo, "")), 93, Gx_line+95, 422, Gx_line+113, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 82, Gx_line+72, 86, Gx_line+88, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 845, Gx_line+96, 849, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 83, Gx_line+49, 87, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 545, Gx_line+49, 549, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 845, Gx_line+49, 849, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83Lb_Pantone, "")), 551, Gx_line+72, 990, Gx_line+90, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Lb_pedcod, "")), 853, Gx_line+118, 1182, Gx_line+136, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Lit30, "")), 746, Gx_line+118, 839, Gx_line+134, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 845, Gx_line+118, 849, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 524, Gx_line+96, 528, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit18, "")), 450, Gx_line+96, 518, Gx_line+112, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A5541Lb_FechaE, "99/99/99"), 532, Gx_line+97, 591, Gx_line+114, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A5542Lb_HoraE, "99:99"), 673, Gx_line+96, 710, Gx_line+113, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 667, Gx_line+96, 671, Gx_line+112, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit20, "")), 605, Gx_line+96, 662, Gx_line+112, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A5544Lb_FechaM, "99/99/99"), 532, Gx_line+118, 591, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit19, "")), 450, Gx_line+118, 518, Gx_line+134, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 523, Gx_line+118, 527, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A5545Lb_HoraM, "99:99"), 673, Gx_line+118, 710, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit21, "")), 600, Gx_line+118, 663, Gx_line+134, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(":", 667, Gx_line+118, 671, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit12, "")), 31, Gx_line+118, 95, Gx_line+135, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 111, Gx_line+118, 115, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(A5548Lb_Obs, 118, Gx_line+119, 449, Gx_line+185, 0+16, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+189) ;
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
      add_metrics3( ) ;
      add_metrics4( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Calibri", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      A396EmprCod = "" ;
      AV60Contdsc = "" ;
      AV31Lit1 = "" ;
      AV32Lit2 = "" ;
      AV33Lit3 = "" ;
      AV34Lit4 = "" ;
      AV35Lit5 = "" ;
      AV36Lit6 = "" ;
      AV37Lit7 = "" ;
      AV38Lit8 = "" ;
      AV39Lit9 = "" ;
      AV40Lit10 = "" ;
      AV41Lit11 = "" ;
      AV42Lit12 = "" ;
      AV43Lit13 = "" ;
      AV44Lit14 = "" ;
      AV45Lit15 = "" ;
      AV46Lit16 = "" ;
      AV47Lit17 = "" ;
      AV48Lit18 = "" ;
      AV49Lit19 = "" ;
      AV50Lit20 = "" ;
      AV51Lit21 = "" ;
      AV53Lit22 = "" ;
      AV54Lit23 = "" ;
      AV55Lit24 = "" ;
      AV61Lit25 = "" ;
      GXt_char3 = "" ;
      GXv_char1 = new String[1] ;
      AV63Lit26 = "" ;
      AV64Lit27 = "" ;
      AV65Lit28 = "" ;
      AV85Lit30 = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      scmdbuf = "" ;
      P074G2_A396EmprCod = new String[] {""} ;
      P074G2_A407EmprNom = new String[] {""} ;
      P074G2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV30EmprNOm = "" ;
      GXv_int2 = new byte[1] ;
      P074G3_A5548Lb_Obs = new String[] {""} ;
      P074G3_A396EmprCod = new String[] {""} ;
      P074G3_A5532Lb_numero = new int[1] ;
      P074G3_A5594Lb_cartazf = new java.util.Date[] {GXutil.nullDate()} ;
      P074G3_A6546Lb_Pantone = new String[] {""} ;
      P074G3_A5539Lb_ColNumC = new int[1] ;
      P074G3_A6618Lb_PedCod = new String[] {""} ;
      P074G3_A5595Lb_malha = new byte[1] ;
      P074G3_A5570Lb_Tipo = new String[] {""} ;
      P074G3_A6653Lb_Tra1 = new String[] {""} ;
      P074G3_A6654Lb_TraP1 = new short[1] ;
      P074G3_A6655Lb_Tra2 = new String[] {""} ;
      P074G3_A6656Lb_TraP2 = new short[1] ;
      P074G3_A6657Lb_Tra3 = new String[] {""} ;
      P074G3_A6658Lb_TraP3 = new short[1] ;
      P074G3_A6842Lb_Tra4 = new String[] {""} ;
      P074G3_A6843Lb_TraP4 = new short[1] ;
      P074G3_A6844Lb_Tra5 = new String[] {""} ;
      P074G3_A6845Lb_TraP5 = new short[1] ;
      P074G3_A6846Lb_Tra6 = new String[] {""} ;
      P074G3_A6847Lb_TraP6 = new short[1] ;
      P074G3_A5545Lb_HoraM = new java.util.Date[] {GXutil.nullDate()} ;
      P074G3_A5544Lb_FechaM = new java.util.Date[] {GXutil.nullDate()} ;
      P074G3_A5542Lb_HoraE = new java.util.Date[] {GXutil.nullDate()} ;
      P074G3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P074G3_A5540Lb_Cartaz = new String[] {""} ;
      P074G3_A5538Lb_ColNomC = new String[] {""} ;
      P074G3_A5537Lb_ColNum = new int[1] ;
      P074G3_A5536Lb_ColNom = new String[] {""} ;
      P074G3_A5534Lb_ArtDsc = new String[] {""} ;
      P074G3_A5533Lb_ArtCod = new String[] {""} ;
      P074G3_A279CliNom = new String[] {""} ;
      P074G3_A252CliCod = new int[1] ;
      A5548Lb_Obs = "" ;
      A5594Lb_cartazf = GXutil.nullDate() ;
      A6546Lb_Pantone = "" ;
      A6618Lb_PedCod = "" ;
      A5570Lb_Tipo = "" ;
      A6653Lb_Tra1 = "" ;
      A6655Lb_Tra2 = "" ;
      A6657Lb_Tra3 = "" ;
      A6842Lb_Tra4 = "" ;
      A6844Lb_Tra5 = "" ;
      A6846Lb_Tra6 = "" ;
      A5545Lb_HoraM = GXutil.resetTime( GXutil.nullDate() );
      A5544Lb_FechaM = GXutil.nullDate() ;
      A5542Lb_HoraE = GXutil.resetTime( GXutil.nullDate() );
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5540Lb_Cartaz = "" ;
      A5538Lb_ColNomC = "" ;
      A5536Lb_ColNom = "" ;
      A5534Lb_ArtDsc = "" ;
      A5533Lb_ArtCod = "" ;
      A279CliNom = "" ;
      AV70Lb_Cartazd = GXutil.nullDate() ;
      AV83Lb_Pantone = "" ;
      AV90Lb_pedcod = "" ;
      AV52Texto_m = "" ;
      AV56Texto_e = "" ;
      AV58Lb_artcod = "" ;
      AV59Compo = "" ;
      AV9Tab_op = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV9Tab_op[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV27Tab_cos = new java.math.BigDecimal[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV27Tab_cos[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      P074G4_A396EmprCod = new String[] {""} ;
      P074G4_A5532Lb_numero = new int[1] ;
      P074G4_A5556Lb_UltLC = new short[1] ;
      P074G4_A5718Lb_numop = new byte[1] ;
      P074G4_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P074G4_A5555Lb_opcion = new String[] {""} ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      AV89Lb_numop = "" ;
      AV10Tab_opc = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV10Tab_opc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV11Tab_prc = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV11Tab_prc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV22Tab_prn = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV22Tab_prn[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV12Tab_ctc = new String[100][9] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 9 )
         {
            AV12Tab_ctc[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV75TabPrd = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV75TabPrd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P074G5_A490ForPrdUMe = new byte[1] ;
      P074G5_A396EmprCod = new String[] {""} ;
      P074G5_A5532Lb_numero = new int[1] ;
      P074G5_A719PrdNum = new String[] {""} ;
      P074G5_A718PrdNom = new String[] {""} ;
      P074G5_A5718Lb_numop = new byte[1] ;
      P074G5_A5555Lb_opcion = new String[] {""} ;
      P074G5_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P074G5_A6544Lb_PTinC = new byte[1] ;
      P074G5_A488ForPrdDsc = new String[] {""} ;
      P074G5_n488ForPrdDsc = new boolean[] {false} ;
      P074G5_A5557Lb_LineaC = new short[1] ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      AV81Opci = "" ;
      AV13Tab_opp = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV13Tab_opp[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV14Tab_prp = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV14Tab_prp[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV23Tab_prpn = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV23Tab_prpn[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV15Tab_ctp = new String[100][9] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 9 )
         {
            AV15Tab_ctp[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV76TabPrd2 = new String[100][9] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 9 )
         {
            AV76TabPrd2[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV77Tab_Pror = new short[100] ;
      AV29PrdNumi = "" ;
      P074G6_A396EmprCod = new String[] {""} ;
      P074G6_A65ArtCod = new String[] {""} ;
      P074G6_A252CliCod = new int[1] ;
      P074G6_A105ArtTra1 = new String[] {""} ;
      P074G6_n105ArtTra1 = new boolean[] {false} ;
      P074G6_A108ArtTraP1 = new short[1] ;
      P074G6_n108ArtTraP1 = new boolean[] {false} ;
      P074G6_A106ArtTra2 = new String[] {""} ;
      P074G6_n106ArtTra2 = new boolean[] {false} ;
      P074G6_A109ArtTraP2 = new short[1] ;
      P074G6_n109ArtTraP2 = new boolean[] {false} ;
      P074G6_A107ArtTra3 = new String[] {""} ;
      P074G6_n107ArtTra3 = new boolean[] {false} ;
      P074G6_A110ArtTraP3 = new short[1] ;
      P074G6_n110ArtTraP3 = new boolean[] {false} ;
      A65ArtCod = "" ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      P074G7_A490ForPrdUMe = new byte[1] ;
      P074G7_A396EmprCod = new String[] {""} ;
      P074G7_A5532Lb_numero = new int[1] ;
      P074G7_A6545Lb_PTinP = new byte[1] ;
      P074G7_A719PrdNum = new String[] {""} ;
      P074G7_A718PrdNom = new String[] {""} ;
      P074G7_A5562Lb_orden = new short[1] ;
      P074G7_A5718Lb_numop = new byte[1] ;
      P074G7_A5555Lb_opcion = new String[] {""} ;
      P074G7_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P074G7_A488ForPrdDsc = new String[] {""} ;
      P074G7_n488ForPrdDsc = new boolean[] {false} ;
      P074G7_A5560Lb_LineaPr = new short[1] ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.rens101__default(),
         new Object[] {
             new Object[] {
            P074G2_A396EmprCod, P074G2_A407EmprNom, P074G2_n407EmprNom
            }
            , new Object[] {
            P074G3_A5548Lb_Obs, P074G3_A396EmprCod, P074G3_A5532Lb_numero, P074G3_A5594Lb_cartazf, P074G3_A6546Lb_Pantone, P074G3_A5539Lb_ColNumC, P074G3_A6618Lb_PedCod, P074G3_A5595Lb_malha, P074G3_A5570Lb_Tipo, P074G3_A6653Lb_Tra1,
            P074G3_A6654Lb_TraP1, P074G3_A6655Lb_Tra2, P074G3_A6656Lb_TraP2, P074G3_A6657Lb_Tra3, P074G3_A6658Lb_TraP3, P074G3_A6842Lb_Tra4, P074G3_A6843Lb_TraP4, P074G3_A6844Lb_Tra5, P074G3_A6845Lb_TraP5, P074G3_A6846Lb_Tra6,
            P074G3_A6847Lb_TraP6, P074G3_A5545Lb_HoraM, P074G3_A5544Lb_FechaM, P074G3_A5542Lb_HoraE, P074G3_A5541Lb_FechaE, P074G3_A5540Lb_Cartaz, P074G3_A5538Lb_ColNomC, P074G3_A5537Lb_ColNum, P074G3_A5536Lb_ColNom, P074G3_A5534Lb_ArtDsc,
            P074G3_A5533Lb_ArtCod, P074G3_A279CliNom, P074G3_A252CliCod
            }
            , new Object[] {
            P074G4_A396EmprCod, P074G4_A5532Lb_numero, P074G4_A5556Lb_UltLC, P074G4_A5718Lb_numop, P074G4_A5565Lb_CosteE, P074G4_A5555Lb_opcion
            }
            , new Object[] {
            P074G5_A490ForPrdUMe, P074G5_A396EmprCod, P074G5_A5532Lb_numero, P074G5_A719PrdNum, P074G5_A718PrdNom, P074G5_A5718Lb_numop, P074G5_A5555Lb_opcion, P074G5_A5558LB_CantC, P074G5_A6544Lb_PTinC, P074G5_A488ForPrdDsc,
            P074G5_n488ForPrdDsc, P074G5_A5557Lb_LineaC
            }
            , new Object[] {
            P074G6_A396EmprCod, P074G6_A65ArtCod, P074G6_A252CliCod, P074G6_A105ArtTra1, P074G6_n105ArtTra1, P074G6_A108ArtTraP1, P074G6_n108ArtTraP1, P074G6_A106ArtTra2, P074G6_n106ArtTra2, P074G6_A109ArtTraP2,
            P074G6_n109ArtTraP2, P074G6_A107ArtTra3, P074G6_n107ArtTra3, P074G6_A110ArtTraP3, P074G6_n110ArtTraP3
            }
            , new Object[] {
            P074G7_A490ForPrdUMe, P074G7_A396EmprCod, P074G7_A5532Lb_numero, P074G7_A6545Lb_PTinP, P074G7_A719PrdNum, P074G7_A718PrdNom, P074G7_A5562Lb_orden, P074G7_A5718Lb_numop, P074G7_A5555Lb_opcion, P074G7_A5561LB_CantP,
            P074G7_A488ForPrdDsc, P074G7_n488ForPrdDsc, P074G7_A5560Lb_LineaPr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV62Hilo ;
   private byte AV67FlagModa ;
   private byte GXv_int2[] ;
   private byte A5595Lb_malha ;
   private byte A5718Lb_numop ;
   private byte A490ForPrdUMe ;
   private byte A6544Lb_PTinC ;
   private byte AV82Lb_PTinC ;
   private byte A6545Lb_PTinP ;
   private byte AV86FlagPos ;
   private short gxcookieaux ;
   private short A6654Lb_TraP1 ;
   private short A6656Lb_TraP2 ;
   private short A6658Lb_TraP3 ;
   private short A6843Lb_TraP4 ;
   private short A6845Lb_TraP5 ;
   private short A6847Lb_TraP6 ;
   private short AV8i ;
   private short A5556Lb_UltLC ;
   private short AV73NumCol ;
   private short A5557Lb_LineaC ;
   private short AV71Opc ;
   private short AV77Tab_Pror[] ;
   private short AV74NumPr ;
   private short AV78Total ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A5562Lb_orden ;
   private short A5560Lb_LineaPr ;
   private short AV72Opp ;
   private short AV87ContPos ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A5539Lb_ColNumC ;
   private int A5537Lb_ColNum ;
   private int A252CliCod ;
   private int AV88Lb_colnumc ;
   private int AV57CliCod ;
   private int GX_I ;
   private int GX_J ;
   private int AV80Numero ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV27Tab_cos[] ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal A5561LB_CantP ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV60Contdsc ;
   private String AV31Lit1 ;
   private String AV32Lit2 ;
   private String AV33Lit3 ;
   private String AV34Lit4 ;
   private String AV35Lit5 ;
   private String AV36Lit6 ;
   private String AV37Lit7 ;
   private String AV38Lit8 ;
   private String AV39Lit9 ;
   private String AV40Lit10 ;
   private String AV41Lit11 ;
   private String AV42Lit12 ;
   private String AV43Lit13 ;
   private String AV44Lit14 ;
   private String AV45Lit15 ;
   private String AV46Lit16 ;
   private String AV47Lit17 ;
   private String AV48Lit18 ;
   private String AV49Lit19 ;
   private String AV50Lit20 ;
   private String AV51Lit21 ;
   private String AV53Lit22 ;
   private String AV54Lit23 ;
   private String AV55Lit24 ;
   private String AV61Lit25 ;
   private String GXt_char3 ;
   private String GXv_char1[] ;
   private String AV63Lit26 ;
   private String AV64Lit27 ;
   private String AV65Lit28 ;
   private String AV85Lit30 ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV30EmprNOm ;
   private String A6546Lb_Pantone ;
   private String A6618Lb_PedCod ;
   private String A5570Lb_Tipo ;
   private String A6653Lb_Tra1 ;
   private String A6655Lb_Tra2 ;
   private String A6657Lb_Tra3 ;
   private String A6842Lb_Tra4 ;
   private String A6844Lb_Tra5 ;
   private String A6846Lb_Tra6 ;
   private String A5540Lb_Cartaz ;
   private String A5538Lb_ColNomC ;
   private String A5536Lb_ColNom ;
   private String A5534Lb_ArtDsc ;
   private String A5533Lb_ArtCod ;
   private String A279CliNom ;
   private String AV83Lb_Pantone ;
   private String AV90Lb_pedcod ;
   private String AV52Texto_m ;
   private String AV56Texto_e ;
   private String AV58Lb_artcod ;
   private String AV59Compo ;
   private String AV9Tab_op[] ;
   private String A5555Lb_opcion ;
   private String AV89Lb_numop ;
   private String AV10Tab_opc[] ;
   private String AV11Tab_prc[] ;
   private String AV22Tab_prn[] ;
   private String AV12Tab_ctc[][] ;
   private String AV75TabPrd[] ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String AV81Opci ;
   private String AV13Tab_opp[] ;
   private String AV14Tab_prp[] ;
   private String AV23Tab_prpn[] ;
   private String AV15Tab_ctp[][] ;
   private String AV76TabPrd2[][] ;
   private String AV29PrdNumi ;
   private String A65ArtCod ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private java.util.Date A5545Lb_HoraM ;
   private java.util.Date A5542Lb_HoraE ;
   private java.util.Date A5594Lb_cartazf ;
   private java.util.Date A5544Lb_FechaM ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date AV70Lb_Cartazd ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean brk74G6 ;
   private boolean n488ForPrdDsc ;
   private boolean returnInSub ;
   private boolean n105ArtTra1 ;
   private boolean n108ArtTraP1 ;
   private boolean n106ArtTra2 ;
   private boolean n109ArtTraP2 ;
   private boolean n107ArtTra3 ;
   private boolean n110ArtTraP3 ;
   private boolean brk74G11 ;
   private String A5548Lb_Obs ;
   private IDataStoreProvider pr_default ;
   private String[] P074G2_A396EmprCod ;
   private String[] P074G2_A407EmprNom ;
   private boolean[] P074G2_n407EmprNom ;
   private String[] P074G3_A5548Lb_Obs ;
   private String[] P074G3_A396EmprCod ;
   private int[] P074G3_A5532Lb_numero ;
   private java.util.Date[] P074G3_A5594Lb_cartazf ;
   private String[] P074G3_A6546Lb_Pantone ;
   private int[] P074G3_A5539Lb_ColNumC ;
   private String[] P074G3_A6618Lb_PedCod ;
   private byte[] P074G3_A5595Lb_malha ;
   private String[] P074G3_A5570Lb_Tipo ;
   private String[] P074G3_A6653Lb_Tra1 ;
   private short[] P074G3_A6654Lb_TraP1 ;
   private String[] P074G3_A6655Lb_Tra2 ;
   private short[] P074G3_A6656Lb_TraP2 ;
   private String[] P074G3_A6657Lb_Tra3 ;
   private short[] P074G3_A6658Lb_TraP3 ;
   private String[] P074G3_A6842Lb_Tra4 ;
   private short[] P074G3_A6843Lb_TraP4 ;
   private String[] P074G3_A6844Lb_Tra5 ;
   private short[] P074G3_A6845Lb_TraP5 ;
   private String[] P074G3_A6846Lb_Tra6 ;
   private short[] P074G3_A6847Lb_TraP6 ;
   private java.util.Date[] P074G3_A5545Lb_HoraM ;
   private java.util.Date[] P074G3_A5544Lb_FechaM ;
   private java.util.Date[] P074G3_A5542Lb_HoraE ;
   private java.util.Date[] P074G3_A5541Lb_FechaE ;
   private String[] P074G3_A5540Lb_Cartaz ;
   private String[] P074G3_A5538Lb_ColNomC ;
   private int[] P074G3_A5537Lb_ColNum ;
   private String[] P074G3_A5536Lb_ColNom ;
   private String[] P074G3_A5534Lb_ArtDsc ;
   private String[] P074G3_A5533Lb_ArtCod ;
   private String[] P074G3_A279CliNom ;
   private int[] P074G3_A252CliCod ;
   private String[] P074G4_A396EmprCod ;
   private int[] P074G4_A5532Lb_numero ;
   private short[] P074G4_A5556Lb_UltLC ;
   private byte[] P074G4_A5718Lb_numop ;
   private java.math.BigDecimal[] P074G4_A5565Lb_CosteE ;
   private String[] P074G4_A5555Lb_opcion ;
   private byte[] P074G5_A490ForPrdUMe ;
   private String[] P074G5_A396EmprCod ;
   private int[] P074G5_A5532Lb_numero ;
   private String[] P074G5_A719PrdNum ;
   private String[] P074G5_A718PrdNom ;
   private byte[] P074G5_A5718Lb_numop ;
   private String[] P074G5_A5555Lb_opcion ;
   private java.math.BigDecimal[] P074G5_A5558LB_CantC ;
   private byte[] P074G5_A6544Lb_PTinC ;
   private String[] P074G5_A488ForPrdDsc ;
   private boolean[] P074G5_n488ForPrdDsc ;
   private short[] P074G5_A5557Lb_LineaC ;
   private String[] P074G6_A396EmprCod ;
   private String[] P074G6_A65ArtCod ;
   private int[] P074G6_A252CliCod ;
   private String[] P074G6_A105ArtTra1 ;
   private boolean[] P074G6_n105ArtTra1 ;
   private short[] P074G6_A108ArtTraP1 ;
   private boolean[] P074G6_n108ArtTraP1 ;
   private String[] P074G6_A106ArtTra2 ;
   private boolean[] P074G6_n106ArtTra2 ;
   private short[] P074G6_A109ArtTraP2 ;
   private boolean[] P074G6_n109ArtTraP2 ;
   private String[] P074G6_A107ArtTra3 ;
   private boolean[] P074G6_n107ArtTra3 ;
   private short[] P074G6_A110ArtTraP3 ;
   private boolean[] P074G6_n110ArtTraP3 ;
   private byte[] P074G7_A490ForPrdUMe ;
   private String[] P074G7_A396EmprCod ;
   private int[] P074G7_A5532Lb_numero ;
   private byte[] P074G7_A6545Lb_PTinP ;
   private String[] P074G7_A719PrdNum ;
   private String[] P074G7_A718PrdNom ;
   private short[] P074G7_A5562Lb_orden ;
   private byte[] P074G7_A5718Lb_numop ;
   private String[] P074G7_A5555Lb_opcion ;
   private java.math.BigDecimal[] P074G7_A5561LB_CantP ;
   private String[] P074G7_A488ForPrdDsc ;
   private boolean[] P074G7_n488ForPrdDsc ;
   private short[] P074G7_A5560Lb_LineaPr ;
}

final  class rens101__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P074G2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P074G3", "SELECT T1.Lb_Obs, T1.EmprCod, T1.Lb_numero, T1.Lb_cartazf, T1.Lb_Pantone, T1.Lb_ColNumC, T1.Lb_PedCod, T1.Lb_malha, T1.Lb_Tipo, T1.Lb_Tra1, T1.Lb_TraP1, T1.Lb_Tra2, T1.Lb_TraP2, T1.Lb_Tra3, T1.Lb_TraP3, T1.Lb_Tra4, T1.Lb_TraP4, T1.Lb_Tra5, T1.Lb_TraP5, T1.Lb_Tra6, T1.Lb_TraP6, T1.Lb_HoraM, T1.Lb_FechaM, T1.Lb_HoraE, T1.Lb_FechaE, T1.Lb_Cartaz, T1.Lb_ColNomC, T1.Lb_ColNum, T1.Lb_ColNom, T1.Lb_ArtDsc, T1.Lb_ArtCod, T2.CliNom, T1.CliCod FROM (TXPENS001 T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.Lb_numero = ? ORDER BY T1.EmprCod, T1.Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P074G4", "SELECT EmprCod, Lb_numero, Lb_UltLC, Lb_numop, Lb_CosteE, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P074G5", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Lb_numero, T1.PrdNum, T3.PrdNom, T4.Lb_numop, T1.Lb_opcion, T1.LB_CantC, T1.Lb_PTinC, T2.ForPrdDsc, T1.Lb_LineaC FROM (((TXPENS003 T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum) INNER JOIN TXPENS002 T4 ON T4.EmprCod = T1.EmprCod AND T4.Lb_numero = T1.Lb_numero AND T4.Lb_opcion = T1.Lb_opcion) WHERE (T1.Lb_numero = ?) AND (T1.EmprCod = ?) ORDER BY T1.Lb_numero, T1.Lb_PTinC, T1.Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P074G6", "SELECT EmprCod, ArtCod, CliCod, ArtTra1, ArtTraP1, ArtTra2, ArtTraP2, ArtTra3, ArtTraP3 FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P074G7", "SELECT T1.ForPrdUMe, T1.EmprCod, T1.Lb_numero, T1.Lb_PTinP, T1.PrdNum, T2.PrdNom, T1.Lb_orden, T4.Lb_numop, T1.Lb_opcion, T1.LB_CantP, T3.ForPrdDsc, T1.Lb_LineaPr FROM (((TXPENS004 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPENS002 T4 ON T4.EmprCod = T1.EmprCod AND T4.Lb_numero = T1.Lb_numero AND T4.Lb_opcion = T1.Lb_opcion) WHERE (T1.EmprCod = ? and T1.Lb_PTinP = ?) AND (T1.Lb_numero = ?) ORDER BY T1.EmprCod, T1.Lb_PTinP, T1.Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 50);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 4);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 4);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 4);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 4);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 4);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((java.util.Date[]) buf[21])[0] = GXutil.resetDate(rslt.getGXDateTime(22));
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(23);
               ((java.util.Date[]) buf[23])[0] = GXutil.resetDate(rslt.getGXDateTime(24));
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 20);
               ((String[]) buf[26])[0] = rslt.getString(27, 13);
               ((int[]) buf[27])[0] = rslt.getInt(28);
               ((String[]) buf[28])[0] = rslt.getString(29, 13);
               ((String[]) buf[29])[0] = rslt.getString(30, 26);
               ((String[]) buf[30])[0] = rslt.getString(31, 16);
               ((String[]) buf[31])[0] = rslt.getString(32, 30);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(11);
               return;
            case 4 :
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
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[10])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

