package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ppmordenes_impl extends GXWebReport
{
   public ppmordenes_impl( com.genexus.internet.HttpContext context )
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
            A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
            AV13Tipo = httpContext.GetPar( "Tipo") ;
            Gx_out = httpContext.GetPar( "Gx_out") ;
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
      M_bot = 0 ;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_int1 = AV25coloretto ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CNT000", ""), GXv_int2) ;
         ppmordenes_impl.this.GXt_int1 = GXv_int2[0] ;
         AV25coloretto = GXt_int1 ;
         GXt_int1 = AV34lecotex ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LECOTE", ""), GXv_int2) ;
         ppmordenes_impl.this.GXt_int1 = GXv_int2[0] ;
         AV34lecotex = GXt_int1 ;
         GXt_int1 = AV38Cotexsur ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COTEXS", ""), GXv_int2) ;
         ppmordenes_impl.this.GXt_int1 = GXv_int2[0] ;
         AV38Cotexsur = GXt_int1 ;
         /* Using cursor P0ARL2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P0ARL2_A407EmprNom[0] ;
            n407EmprNom = P0ARL2_n407EmprNom[0] ;
            AV12NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV8Lit0 = AV47Pgmdesc ;
         GXt_char3 = AV31Lit1 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         ppmordenes_impl.this.GXt_char3 = GXv_char4[0] ;
         AV31Lit1 = GXt_char3 ;
         GXt_char3 = AV10Lit2 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char4) ;
         ppmordenes_impl.this.GXt_char3 = GXv_char4[0] ;
         AV10Lit2 = GXt_char3 ;
         GXt_char3 = AV11Lit3 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char4) ;
         ppmordenes_impl.this.GXt_char3 = GXv_char4[0] ;
         AV11Lit3 = GXt_char3 ;
         GXt_char3 = AV9Lit4 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "TEXTO_", ""), (byte)(99), GXv_char4) ;
         ppmordenes_impl.this.GXt_char3 = GXv_char4[0] ;
         AV9Lit4 = GXt_char3 ;
         AV26Lit10 = ((AV25coloretto==1) ? httpContext.getMessage( "Stock", "") : httpContext.getMessage( "Precio", "")) ;
         AV27Lit11 = ((AV25coloretto==1) ? httpContext.getMessage( "Stock", "") : httpContext.getMessage( "Precio", "")) ;
         GxHdr3 = true ;
         /* Using cursor P0ARL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A14271PMTipoID = P0ARL3_A14271PMTipoID[0] ;
            A9445OMEst = P0ARL3_A9445OMEst[0] ;
            A9429PMCod = P0ARL3_A9429PMCod[0] ;
            n9429PMCod = P0ARL3_n9429PMCod[0] ;
            A9426OMMaqCod = P0ARL3_A9426OMMaqCod[0] ;
            A14272PMTipoDsc = P0ARL3_A14272PMTipoDsc[0] ;
            A9473PMDsc = P0ARL3_A9473PMDsc[0] ;
            n9473PMDsc = P0ARL3_n9473PMDsc[0] ;
            A9428SMCod = P0ARL3_A9428SMCod[0] ;
            n9428SMCod = P0ARL3_n9428SMCod[0] ;
            A9437OMUsuCre = P0ARL3_A9437OMUsuCre[0] ;
            A9427OMMaqDsc = P0ARL3_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = P0ARL3_n9427OMMaqDsc[0] ;
            A9438OMFchPre = P0ARL3_A9438OMFchPre[0] ;
            A9436OMFchCre = P0ARL3_A9436OMFchCre[0] ;
            A9433OMTxt = P0ARL3_A9433OMTxt[0] ;
            A9464OMNot = P0ARL3_A9464OMNot[0] ;
            A9427OMMaqDsc = P0ARL3_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = P0ARL3_n9427OMMaqDsc[0] ;
            A14271PMTipoID = P0ARL3_A14271PMTipoID[0] ;
            A9473PMDsc = P0ARL3_A9473PMDsc[0] ;
            n9473PMDsc = P0ARL3_n9473PMDsc[0] ;
            A14272PMTipoDsc = P0ARL3_A14272PMTipoDsc[0] ;
            if ( GXutil.strcmp(AV13Tipo, httpContext.getMessage( "D", "")) == 0 )
            {
               AV16OMEstDsc = ((GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", ""))==0) ? httpContext.getMessage( "Pendiente", "") : httpContext.getMessage( "Realizado", "")) ;
            }
            AV40tipoorden = ((A9429PMCod>0) ? httpContext.getMessage( "Preventivo", "") : httpContext.getMessage( "Correctivo", "")) ;
            AV23OMMaqCod = A9426OMMaqCod ;
            hARL0( false, 39) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")), 96, Gx_line+0, 155, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9436OMFchCre, "99/99/99 99:99"), 541, Gx_line+0, 644, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9438OMFchPre, "99/99/99"), 707, Gx_line+0, 766, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), 225, Gx_line+0, 270, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), 272, Gx_line+0, 390, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!")), 474, Gx_line+0, 533, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9")), 258, Gx_line+20, 317, Gx_line+37, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9428SMCod), "ZZZZZZZ9")), 96, Gx_line+20, 155, Gx_line+37, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 15, Gx_line+1, 51, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 170, Gx_line+1, 221, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Creado", ""), 396, Gx_line+1, 439, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Solicitud", ""), 15, Gx_line+21, 67, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Programación", ""), 170, Gx_line+21, 251, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Previsto", ""), 650, Gx_line+1, 699, Gx_line+15, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9473PMDsc, "")), 321, Gx_line+20, 541, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14272PMTipoDsc, "")), 576, Gx_line+20, 796, Gx_line+37, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+39) ;
            if ( GXutil.strcmp(A9433OMTxt, " ") != 0 )
            {
               hARL0( false, 31) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9433OMTxt, "")), 81, Gx_line+0, 771, Gx_line+27, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit4, "")), 14, Gx_line+0, 78, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
            }
            hARL0( false, 17) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tareas", ""), 14, Gx_line+2, 56, Gx_line+16, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            /* Noskip command */
            Gx_line = Gx_OldLine ;
            AV53GXLvl40 = (byte)(0) ;
            /* Using cursor P0ARL4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A9430TMCod = P0ARL4_A9430TMCod[0] ;
               A9431TMDsc = P0ARL4_A9431TMDsc[0] ;
               n9431TMDsc = P0ARL4_n9431TMDsc[0] ;
               A9432TMTxt = P0ARL4_A9432TMTxt[0] ;
               n9432TMTxt = P0ARL4_n9432TMTxt[0] ;
               A9431TMDsc = P0ARL4_A9431TMDsc[0] ;
               n9431TMDsc = P0ARL4_n9431TMDsc[0] ;
               A9432TMTxt = P0ARL4_A9432TMTxt[0] ;
               n9432TMTxt = P0ARL4_n9432TMTxt[0] ;
               AV53GXLvl40 = (byte)(1) ;
               hARL0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9430TMCod), "ZZZZZZZ9")), 95, Gx_line+0, 154, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9431TMDsc, "")), 169, Gx_line+0, 389, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV41Tmcod = A9430TMCod ;
               if ( ( AV34lecotex == 1 ) || ( AV38Cotexsur == 1 ) )
               {
                  AV32Numerodelineas = (short)(GXutil.gxmlines( A9432TMTxt, (short)(74))) ;
                  AV21i = (short)(1) ;
                  while ( AV21i <= AV32Numerodelineas )
                  {
                     AV33linea = GXutil.gxgetmli( A9432TMTxt, AV21i, (short)(74)) ;
                     hARL0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33linea, "")), 169, Gx_line+0, 710, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                     AV21i = (short)(AV21i+1) ;
                  }
               }
               AV24Piezas = 0 ;
               /* Using cursor P0ARL5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9430TMCod)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A12638TMOMMPieCo = P0ARL5_A12638TMOMMPieCo[0] ;
                  A12637TMOMMSEqCo = P0ARL5_A12637TMOMMSEqCo[0] ;
                  A12636TMOMMEquCo = P0ARL5_A12636TMOMMEquCo[0] ;
                  if ( AV24Piezas == 0 )
                  {
                     hARL0( false, 17) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 95, Gx_line+0, 135, Gx_line+14, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                     AV24Piezas = 1 ;
                  }
                  GXv_char4[0] = A396EmprCod ;
                  GXv_char5[0] = AV23OMMaqCod ;
                  GXv_char6[0] = A12636TMOMMEquCo ;
                  GXv_char7[0] = A12637TMOMMSEqCo ;
                  GXv_char8[0] = A12638TMOMMPieCo ;
                  GXv_char9[0] = AV22MaqPieDsc ;
                  new app.pmaqpiedsc(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6, GXv_char7, GXv_char8, GXv_char9) ;
                  ppmordenes_impl.this.A396EmprCod = GXv_char4[0] ;
                  ppmordenes_impl.this.AV23OMMaqCod = GXv_char5[0] ;
                  ppmordenes_impl.this.A12636TMOMMEquCo = GXv_char6[0] ;
                  ppmordenes_impl.this.A12637TMOMMSEqCo = GXv_char7[0] ;
                  ppmordenes_impl.this.A12638TMOMMPieCo = GXv_char8[0] ;
                  ppmordenes_impl.this.AV22MaqPieDsc = GXv_char9[0] ;
                  hARL0( false, 21) ;
                  getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12638TMOMMPieCo, "")), 170, Gx_line+1, 244, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22MaqPieDsc, "")), 247, Gx_line+1, 548, Gx_line+17, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+21) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV53GXLvl40 == 0 )
            {
               Gx_line = (int)(Gx_line+16) ;
            }
            hARL0( false, 17) ;
            getPrinter().GxDrawLine(14, Gx_line+7, 813, Gx_line+7, 2, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            if ( GXutil.strcmp(AV13Tipo, httpContext.getMessage( "D", "")) == 0 )
            {
               AV19n = (short)(GXutil.gxmlines( A9433OMTxt, (short)(80))) ;
               if ( AV19n > 0 )
               {
                  hARL0( false, 17) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Texto", ""), 14, Gx_line+0, 48, Gx_line+14, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               AV21i = (short)(1) ;
               while ( AV21i <= AV19n )
               {
                  AV20t = GXutil.gxgetmli( A9433OMTxt, AV21i, (short)(80)) ;
                  hARL0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20t, "")), 143, Gx_line+0, 727, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV21i = (short)(AV21i+1) ;
               }
               if ( AV19n > 0 )
               {
                  hARL0( false, 17) ;
                  getPrinter().GxDrawLine(14, Gx_line+7, 813, Gx_line+7, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               AV19n = (short)(GXutil.gxmlines( A9464OMNot, (short)(80))) ;
               if ( AV19n > 0 )
               {
                  hARL0( false, 17) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Notas", ""), 14, Gx_line+0, 49, Gx_line+14, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               AV21i = (short)(1) ;
               while ( AV21i <= AV19n )
               {
                  AV20t = GXutil.gxgetmli( A9464OMNot, AV21i, (short)(80)) ;
                  hARL0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20t, "")), 143, Gx_line+0, 727, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV21i = (short)(AV21i+1) ;
               }
               if ( AV19n > 0 )
               {
                  hARL0( false, 17) ;
                  getPrinter().GxDrawLine(14, Gx_line+7, 813, Gx_line+7, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
            }
            AV17Flag = (byte)(0) ;
            AV35totcoste = DecimalUtil.ZERO ;
            GxHdr7 = true ;
            /* Using cursor P0ARL6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A9449OMRTpo = P0ARL6_A9449OMRTpo[0] ;
               A9446OMRepCod = P0ARL6_A9446OMRepCod[0] ;
               A9447OMRepNom = P0ARL6_A9447OMRepNom[0] ;
               n9447OMRepNom = P0ARL6_n9447OMRepNom[0] ;
               A9453OMRCPre = P0ARL6_A9453OMRCPre[0] ;
               A9452OMRCCnt = P0ARL6_A9452OMRCCnt[0] ;
               A9451OMRRPre = P0ARL6_A9451OMRRPre[0] ;
               A9450OMRRCnt = P0ARL6_A9450OMRRCnt[0] ;
               A9447OMRepNom = P0ARL6_A9447OMRepNom[0] ;
               n9447OMRepNom = P0ARL6_n9447OMRepNom[0] ;
               if ( GXutil.strcmp(AV13Tipo, httpContext.getMessage( "D", "")) == 0 )
               {
                  if ( ( ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "R", "")) == 0 ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "C", "")) == 0 ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) )
                  {
                     A9471OMRRCos = A9450OMRRCnt.multiply(A9451OMRRPre) ;
                     A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
                     AV28Mrcod = A9446OMRepCod ;
                     /* Execute user subroutine: 'MREPUESTOS' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(4);
                        pr_default.close(4);
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
                     AV30OMRRpre = ((AV25coloretto==0) ? A9453OMRCPre : AV29MrStkAct) ;
                     AV36cantidad = A9452OMRCCnt ;
                     if ( (0==AV25coloretto) )
                     {
                        AV30OMRRpre = ((GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "R", ""))==0) ? A9451OMRRPre : A9453OMRCPre) ;
                        AV36cantidad = ((GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "R", ""))==0) ? A9450OMRRCnt : A9452OMRCCnt) ;
                     }
                     if ( AV17Flag == 0 )
                     {
                        hARL0( false, 19) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 443, Gx_line+0, 496, Gx_line+14, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 143, Gx_line+0, 200, Gx_line+14, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Costo", ""), 717, Gx_line+0, 751, Gx_line+14, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(143, Gx_line+15, 362, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(394, Gx_line+15, 496, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(52, Gx_line+15, 110, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(531, Gx_line+15, 633, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(664, Gx_line+15, 752, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit11, "")), 571, Gx_line+0, 635, Gx_line+15, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+19) ;
                        AV17Flag = (byte)(1) ;
                     }
                     if ( GXutil.strcmp(A9449OMRTpo, httpContext.getMessage( "R", "")) == 0 )
                     {
                        hARL0( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9446OMRepCod), "ZZZZZZZ9")), 52, Gx_line+0, 111, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9447OMRepNom, "")), 143, Gx_line+0, 387, Gx_line+16, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9471OMRRCos, "ZZZZZZZ9.999")), 664, Gx_line+0, 753, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30OMRRpre, "ZZ,ZZZ,ZZ9.999")), 528, Gx_line+0, 631, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36cantidad, "ZZ,ZZZ,ZZ9.999")), 394, Gx_line+0, 497, Gx_line+17, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     else
                     {
                        hARL0( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9446OMRepCod), "ZZZZZZZ9")), 52, Gx_line+0, 111, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36cantidad, "ZZ,ZZZ,ZZ9.999")), 394, Gx_line+0, 497, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9454OMRCCos, "ZZZZZZZ9.999")), 664, Gx_line+0, 753, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30OMRRpre, "ZZ,ZZZ,ZZ9.999")), 528, Gx_line+0, 631, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9447OMRepNom, "")), 143, Gx_line+0, 387, Gx_line+16, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     AV35totcoste = AV35totcoste.add(((AV30OMRRpre.multiply(AV36cantidad)))) ;
                  }
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            GxHdr7 = false ;
            if ( AV17Flag == 1 )
            {
               hARL0( false, 21) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35totcoste, "ZZZZZZZ9.999")), 664, Gx_line+2, 753, Gx_line+20, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+21) ;
               hARL0( false, 17) ;
               getPrinter().GxDrawLine(14, Gx_line+7, 813, Gx_line+7, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            AV17Flag = (byte)(0) ;
            GxHdr9 = true ;
            /* Using cursor P0ARL7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A9458OMMTpo = P0ARL7_A9458OMMTpo[0] ;
               A9456OMOpeNom = P0ARL7_A9456OMOpeNom[0] ;
               n9456OMOpeNom = P0ARL7_n9456OMOpeNom[0] ;
               A9455OMOpeCod = P0ARL7_A9455OMOpeCod[0] ;
               A9462OMMCPre = P0ARL7_A9462OMMCPre[0] ;
               A9461OMMCCnt = P0ARL7_A9461OMMCCnt[0] ;
               A9460OMMRPre = P0ARL7_A9460OMMRPre[0] ;
               A9459OMMRCnt = P0ARL7_A9459OMMRCnt[0] ;
               A9456OMOpeNom = P0ARL7_A9456OMOpeNom[0] ;
               n9456OMOpeNom = P0ARL7_n9456OMOpeNom[0] ;
               if ( GXutil.strcmp(AV13Tipo, httpContext.getMessage( "D", "")) == 0 )
               {
                  if ( ( ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "R", "")) == 0 ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "C", "")) == 0 ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) )
                  {
                     A9472OMMRCos = A9459OMMRCnt.multiply(A9460OMMRPre) ;
                     A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
                     if ( AV17Flag == 0 )
                     {
                        hARL0( false, 17) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 444, Gx_line+0, 497, Gx_line+14, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 593, Gx_line+0, 632, Gx_line+14, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Costo", ""), 718, Gx_line+0, 752, Gx_line+14, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(144, Gx_line+13, 363, Gx_line+13, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(395, Gx_line+13, 497, Gx_line+13, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(53, Gx_line+13, 111, Gx_line+13, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(529, Gx_line+13, 631, Gx_line+13, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(665, Gx_line+13, 753, Gx_line+13, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Tecnico", ""), 144, Gx_line+0, 193, Gx_line+14, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                        AV17Flag = (byte)(1) ;
                     }
                     if ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "R", "")) == 0 )
                     {
                        hARL0( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9455OMOpeCod), "ZZZZZ9")), 68, Gx_line+0, 113, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9459OMMRCnt, "ZZ,ZZZ,ZZ9.999")), 394, Gx_line+0, 497, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9472OMMRCos, "ZZZZZZZ9.999")), 664, Gx_line+0, 753, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9460OMMRPre, "ZZ,ZZZ,ZZ9.999")), 528, Gx_line+0, 631, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9456OMOpeNom, "")), 143, Gx_line+0, 363, Gx_line+17, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     else
                     {
                        hARL0( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9455OMOpeCod), "ZZZZZ9")), 68, Gx_line+0, 113, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9461OMMCCnt, "ZZ,ZZZ,ZZ9.999")), 394, Gx_line+0, 497, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9463OMMCCos, "ZZZZZZZ9.999")), 664, Gx_line+0, 753, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9462OMMCPre, "ZZ,ZZZ,ZZ9.999")), 528, Gx_line+0, 631, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9456OMOpeNom, "")), 143, Gx_line+0, 363, Gx_line+17, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                  }
               }
               pr_default.readNext(5);
            }
            pr_default.close(5);
            GxHdr9 = false ;
            if ( AV17Flag == 1 )
            {
               hARL0( false, 17) ;
               getPrinter().GxDrawLine(14, Gx_line+7, 813, Gx_line+7, 2, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               if ( AV25coloretto == 1 )
               {
                  hARL0( false, 54) ;
                  getPrinter().GxDrawLine(54, Gx_line+27, 150, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(190, Gx_line+27, 286, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Realizado", ""), 73, Gx_line+31, 132, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entregado", ""), 204, Gx_line+31, 265, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(501, Gx_line+27, 597, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(636, Gx_line+27, 732, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 532, Gx_line+31, 565, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 675, Gx_line+31, 694, Gx_line+45, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+54) ;
               }
            }
            else
            {
               if ( AV25coloretto == 1 )
               {
                  hARL0( false, 54) ;
                  getPrinter().GxDrawLine(54, Gx_line+27, 150, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(190, Gx_line+27, 286, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Realizado", ""), 73, Gx_line+31, 132, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entregado", ""), 204, Gx_line+31, 265, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(501, Gx_line+27, 597, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(636, Gx_line+27, 732, Gx_line+27, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Inicio", ""), 532, Gx_line+31, 565, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fin", ""), 675, Gx_line+31, 694, Gx_line+45, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+54) ;
               }
            }
            if ( GXutil.strcmp(AV13Tipo, httpContext.getMessage( "D", "")) == 0 )
            {
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hARL0( true, 0) ;
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
      /* 'MREPUESTOS' Routine */
      returnInSub = false ;
      AV29MrStkAct = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0ARL8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV28Mrcod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A9492MRCod = P0ARL8_A9492MRCod[0] ;
         A9495MRStkAct = P0ARL8_A9495MRStkAct[0] ;
         n9495MRStkAct = P0ARL8_n9495MRStkAct[0] ;
         AV29MrStkAct = A9495MRStkAct ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void hARL0( boolean bFoot ,
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
            if ( GxHdr3 )
            {
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8Lit0, "")), 14, Gx_line+50, 181, Gx_line+70, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit1, "")), 528, Gx_line+10, 592, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 596, Gx_line+10, 647, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit2, "")), 650, Gx_line+10, 701, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 704, Gx_line+10, 797, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit3, "")), 636, Gx_line+52, 712, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 718, Gx_line+52, 745, Gx_line+68, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12NomEmp, "")), 14, Gx_line+9, 234, Gx_line+29, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Pgmname, "")), 450, Gx_line+50, 576, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+77, 813, Gx_line+77, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 749, Gx_line+52, 756, Gx_line+68, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 760, Gx_line+52, 787, Gx_line+68, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 18, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16OMEstDsc, "")), 293, Gx_line+40, 409, Gx_line+71, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 18, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40tipoorden, "")), 293, Gx_line+3, 466, Gx_line+34, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+82) ;
            }
            if ( GxHdr7 )
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 443, Gx_line+0, 496, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Costo", ""), 717, Gx_line+0, 751, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(143, Gx_line+14, 362, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(394, Gx_line+14, 496, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(52, Gx_line+14, 110, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(528, Gx_line+14, 630, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(664, Gx_line+14, 752, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 143, Gx_line+0, 200, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit10, "")), 568, Gx_line+0, 632, Gx_line+15, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
            }
            if ( GxHdr9 )
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 444, Gx_line+0, 497, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 593, Gx_line+0, 632, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Costo", ""), 718, Gx_line+0, 752, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(144, Gx_line+13, 363, Gx_line+13, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(395, Gx_line+13, 497, Gx_line+13, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(53, Gx_line+13, 111, Gx_line+13, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(529, Gx_line+13, 631, Gx_line+13, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(665, Gx_line+13, 753, Gx_line+13, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tecnico", ""), 144, Gx_line+0, 193, Gx_line+14, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
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
      add_metrics5( ) ;
      add_metrics6( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", false, true, 56, 14, 70, 118,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 18, 22, 35, 35, 56, 42, 12, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 18, 18, 37, 37, 37, 35, 64, 42, 42, 45, 45, 42, 38, 49, 45, 18, 32, 42, 35, 53, 45, 49, 42, 49, 45, 42, 38, 45, 42, 61, 42, 42, 38, 18, 18, 18, 30, 35, 21, 35, 35, 32, 35, 35, 18, 35, 35, 14, 14, 32, 14, 52, 35, 35, 35, 35, 21, 32, 18, 35, 32, 45, 32, 32, 29, 21, 16, 21, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 35, 35, 34, 35, 16, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 20, 21, 35, 34, 21, 21, 20, 23, 35, 53, 53, 53, 38, 42, 42, 42, 42, 42, 42, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 32, 35, 35, 35, 35, 18, 18, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 38, 35, 35, 35, 35, 32, 35, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics6( )
   {
      getPrinter().setMetrics("Calibri", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV13Tipo = "" ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P0ARL2_A396EmprCod = new String[] {""} ;
      P0ARL2_A407EmprNom = new String[] {""} ;
      P0ARL2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV12NomEmp = "" ;
      AV8Lit0 = "" ;
      AV47Pgmdesc = "" ;
      AV31Lit1 = "" ;
      AV10Lit2 = "" ;
      AV11Lit3 = "" ;
      AV9Lit4 = "" ;
      GXt_char3 = "" ;
      AV26Lit10 = "" ;
      AV27Lit11 = "" ;
      P0ARL3_A14271PMTipoID = new short[1] ;
      P0ARL3_A396EmprCod = new String[] {""} ;
      P0ARL3_A9425OMCod = new int[1] ;
      P0ARL3_A9445OMEst = new String[] {""} ;
      P0ARL3_A9429PMCod = new int[1] ;
      P0ARL3_n9429PMCod = new boolean[] {false} ;
      P0ARL3_A9426OMMaqCod = new String[] {""} ;
      P0ARL3_A14272PMTipoDsc = new String[] {""} ;
      P0ARL3_A9473PMDsc = new String[] {""} ;
      P0ARL3_n9473PMDsc = new boolean[] {false} ;
      P0ARL3_A9428SMCod = new int[1] ;
      P0ARL3_n9428SMCod = new boolean[] {false} ;
      P0ARL3_A9437OMUsuCre = new String[] {""} ;
      P0ARL3_A9427OMMaqDsc = new String[] {""} ;
      P0ARL3_n9427OMMaqDsc = new boolean[] {false} ;
      P0ARL3_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P0ARL3_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P0ARL3_A9433OMTxt = new String[] {""} ;
      P0ARL3_A9464OMNot = new String[] {""} ;
      A9445OMEst = "" ;
      A9426OMMaqCod = "" ;
      A14272PMTipoDsc = "" ;
      A9473PMDsc = "" ;
      A9437OMUsuCre = "" ;
      A9427OMMaqDsc = "" ;
      A9438OMFchPre = GXutil.nullDate() ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9433OMTxt = "" ;
      A9464OMNot = "" ;
      AV16OMEstDsc = "" ;
      AV40tipoorden = "" ;
      AV23OMMaqCod = "" ;
      P0ARL4_A396EmprCod = new String[] {""} ;
      P0ARL4_A9425OMCod = new int[1] ;
      P0ARL4_A9430TMCod = new int[1] ;
      P0ARL4_A9431TMDsc = new String[] {""} ;
      P0ARL4_n9431TMDsc = new boolean[] {false} ;
      P0ARL4_A9432TMTxt = new String[] {""} ;
      P0ARL4_n9432TMTxt = new boolean[] {false} ;
      A9431TMDsc = "" ;
      A9432TMTxt = "" ;
      AV33linea = "" ;
      P0ARL5_A396EmprCod = new String[] {""} ;
      P0ARL5_A9425OMCod = new int[1] ;
      P0ARL5_A9430TMCod = new int[1] ;
      P0ARL5_A12638TMOMMPieCo = new String[] {""} ;
      P0ARL5_A12637TMOMMSEqCo = new String[] {""} ;
      P0ARL5_A12636TMOMMEquCo = new String[] {""} ;
      A12638TMOMMPieCo = "" ;
      A12637TMOMMSEqCo = "" ;
      A12636TMOMMEquCo = "" ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      AV22MaqPieDsc = "" ;
      GXv_char9 = new String[1] ;
      AV20t = "" ;
      AV35totcoste = DecimalUtil.ZERO ;
      P0ARL6_A396EmprCod = new String[] {""} ;
      P0ARL6_A9425OMCod = new int[1] ;
      P0ARL6_A9449OMRTpo = new String[] {""} ;
      P0ARL6_A9446OMRepCod = new int[1] ;
      P0ARL6_A9447OMRepNom = new String[] {""} ;
      P0ARL6_n9447OMRepNom = new boolean[] {false} ;
      P0ARL6_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ARL6_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ARL6_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ARL6_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9449OMRTpo = "" ;
      A9447OMRepNom = "" ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9471OMRRCos = DecimalUtil.ZERO ;
      A9454OMRCCos = DecimalUtil.ZERO ;
      AV30OMRRpre = DecimalUtil.ZERO ;
      AV29MrStkAct = DecimalUtil.ZERO ;
      AV36cantidad = DecimalUtil.ZERO ;
      P0ARL7_A396EmprCod = new String[] {""} ;
      P0ARL7_A9425OMCod = new int[1] ;
      P0ARL7_A9458OMMTpo = new String[] {""} ;
      P0ARL7_A9456OMOpeNom = new String[] {""} ;
      P0ARL7_n9456OMOpeNom = new boolean[] {false} ;
      P0ARL7_A9455OMOpeCod = new int[1] ;
      P0ARL7_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ARL7_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ARL7_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ARL7_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A9458OMMTpo = "" ;
      A9456OMOpeNom = "" ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      A9460OMMRPre = DecimalUtil.ZERO ;
      A9459OMMRCnt = DecimalUtil.ZERO ;
      A9472OMMRCos = DecimalUtil.ZERO ;
      A9463OMMCCos = DecimalUtil.ZERO ;
      P0ARL8_A396EmprCod = new String[] {""} ;
      P0ARL8_A9492MRCod = new int[1] ;
      P0ARL8_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ARL8_n9495MRStkAct = new boolean[] {false} ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV52Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.ppmordenes__default(),
         new Object[] {
             new Object[] {
            P0ARL2_A396EmprCod, P0ARL2_A407EmprNom, P0ARL2_n407EmprNom
            }
            , new Object[] {
            P0ARL3_A14271PMTipoID, P0ARL3_A396EmprCod, P0ARL3_A9425OMCod, P0ARL3_A9445OMEst, P0ARL3_A9429PMCod, P0ARL3_n9429PMCod, P0ARL3_A9426OMMaqCod, P0ARL3_A14272PMTipoDsc, P0ARL3_A9473PMDsc, P0ARL3_n9473PMDsc,
            P0ARL3_A9428SMCod, P0ARL3_n9428SMCod, P0ARL3_A9437OMUsuCre, P0ARL3_A9427OMMaqDsc, P0ARL3_n9427OMMaqDsc, P0ARL3_A9438OMFchPre, P0ARL3_A9436OMFchCre, P0ARL3_A9433OMTxt, P0ARL3_A9464OMNot
            }
            , new Object[] {
            P0ARL4_A396EmprCod, P0ARL4_A9425OMCod, P0ARL4_A9430TMCod, P0ARL4_A9431TMDsc, P0ARL4_n9431TMDsc, P0ARL4_A9432TMTxt, P0ARL4_n9432TMTxt
            }
            , new Object[] {
            P0ARL5_A396EmprCod, P0ARL5_A9425OMCod, P0ARL5_A9430TMCod, P0ARL5_A12638TMOMMPieCo, P0ARL5_A12637TMOMMSEqCo, P0ARL5_A12636TMOMMEquCo
            }
            , new Object[] {
            P0ARL6_A396EmprCod, P0ARL6_A9425OMCod, P0ARL6_A9449OMRTpo, P0ARL6_A9446OMRepCod, P0ARL6_A9447OMRepNom, P0ARL6_n9447OMRepNom, P0ARL6_A9453OMRCPre, P0ARL6_A9452OMRCCnt, P0ARL6_A9451OMRRPre, P0ARL6_A9450OMRRCnt
            }
            , new Object[] {
            P0ARL7_A396EmprCod, P0ARL7_A9425OMCod, P0ARL7_A9458OMMTpo, P0ARL7_A9456OMOpeNom, P0ARL7_n9456OMOpeNom, P0ARL7_A9455OMOpeCod, P0ARL7_A9462OMMCPre, P0ARL7_A9461OMMCCnt, P0ARL7_A9460OMMRPre, P0ARL7_A9459OMMRCnt
            }
            , new Object[] {
            P0ARL8_A396EmprCod, P0ARL8_A9492MRCod, P0ARL8_A9495MRStkAct, P0ARL8_n9495MRStkAct
            }
         }
      );
      AV52Pgmname = "MantenimientoMaquina.PpMOrdenes" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV47Pgmdesc = httpContext.getMessage( "Informe Orden", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV52Pgmname = "MantenimientoMaquina.PpMOrdenes" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV47Pgmdesc = httpContext.getMessage( "Informe Orden", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV25coloretto ;
   private byte AV34lecotex ;
   private byte AV38Cotexsur ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV53GXLvl40 ;
   private byte AV17Flag ;
   private short gxcookieaux ;
   private short A14271PMTipoID ;
   private short AV32Numerodelineas ;
   private short AV21i ;
   private short AV19n ;
   private short Gx_err ;
   private int A9425OMCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A9429PMCod ;
   private int A9428SMCod ;
   private int Gx_OldLine ;
   private int A9430TMCod ;
   private int AV41Tmcod ;
   private int AV24Piezas ;
   private int A9446OMRepCod ;
   private int AV28Mrcod ;
   private int A9455OMOpeCod ;
   private int A9492MRCod ;
   private java.math.BigDecimal AV35totcoste ;
   private java.math.BigDecimal A9453OMRCPre ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9451OMRRPre ;
   private java.math.BigDecimal A9450OMRRCnt ;
   private java.math.BigDecimal A9471OMRRCos ;
   private java.math.BigDecimal A9454OMRCCos ;
   private java.math.BigDecimal AV30OMRRpre ;
   private java.math.BigDecimal AV29MrStkAct ;
   private java.math.BigDecimal AV36cantidad ;
   private java.math.BigDecimal A9462OMMCPre ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private java.math.BigDecimal A9460OMMRPre ;
   private java.math.BigDecimal A9459OMMRCnt ;
   private java.math.BigDecimal A9472OMMRCos ;
   private java.math.BigDecimal A9463OMMCCos ;
   private java.math.BigDecimal A9495MRStkAct ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV13Tipo ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV12NomEmp ;
   private String AV8Lit0 ;
   private String AV47Pgmdesc ;
   private String AV31Lit1 ;
   private String AV10Lit2 ;
   private String AV11Lit3 ;
   private String AV9Lit4 ;
   private String GXt_char3 ;
   private String AV26Lit10 ;
   private String AV27Lit11 ;
   private String A9445OMEst ;
   private String A9426OMMaqCod ;
   private String A14272PMTipoDsc ;
   private String A9473PMDsc ;
   private String A9437OMUsuCre ;
   private String A9427OMMaqDsc ;
   private String AV16OMEstDsc ;
   private String AV40tipoorden ;
   private String AV23OMMaqCod ;
   private String A9431TMDsc ;
   private String AV33linea ;
   private String A12638TMOMMPieCo ;
   private String A12637TMOMMSEqCo ;
   private String A12636TMOMMEquCo ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String AV22MaqPieDsc ;
   private String GXv_char9[] ;
   private String AV20t ;
   private String A9449OMRTpo ;
   private String A9447OMRepNom ;
   private String A9458OMMTpo ;
   private String A9456OMOpeNom ;
   private String Gx_time ;
   private String AV52Pgmname ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A9438OMFchPre ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean n9429PMCod ;
   private boolean n9473PMDsc ;
   private boolean n9428SMCod ;
   private boolean n9427OMMaqDsc ;
   private boolean n9431TMDsc ;
   private boolean n9432TMTxt ;
   private boolean GxHdr7 ;
   private boolean n9447OMRepNom ;
   private boolean returnInSub ;
   private boolean GxHdr9 ;
   private boolean n9456OMOpeNom ;
   private boolean n9495MRStkAct ;
   private String A9433OMTxt ;
   private String A9464OMNot ;
   private String A9432TMTxt ;
   private IDataStoreProvider pr_default ;
   private String[] P0ARL2_A396EmprCod ;
   private String[] P0ARL2_A407EmprNom ;
   private boolean[] P0ARL2_n407EmprNom ;
   private short[] P0ARL3_A14271PMTipoID ;
   private String[] P0ARL3_A396EmprCod ;
   private int[] P0ARL3_A9425OMCod ;
   private String[] P0ARL3_A9445OMEst ;
   private int[] P0ARL3_A9429PMCod ;
   private boolean[] P0ARL3_n9429PMCod ;
   private String[] P0ARL3_A9426OMMaqCod ;
   private String[] P0ARL3_A14272PMTipoDsc ;
   private String[] P0ARL3_A9473PMDsc ;
   private boolean[] P0ARL3_n9473PMDsc ;
   private int[] P0ARL3_A9428SMCod ;
   private boolean[] P0ARL3_n9428SMCod ;
   private String[] P0ARL3_A9437OMUsuCre ;
   private String[] P0ARL3_A9427OMMaqDsc ;
   private boolean[] P0ARL3_n9427OMMaqDsc ;
   private java.util.Date[] P0ARL3_A9438OMFchPre ;
   private java.util.Date[] P0ARL3_A9436OMFchCre ;
   private String[] P0ARL3_A9433OMTxt ;
   private String[] P0ARL3_A9464OMNot ;
   private String[] P0ARL4_A396EmprCod ;
   private int[] P0ARL4_A9425OMCod ;
   private int[] P0ARL4_A9430TMCod ;
   private String[] P0ARL4_A9431TMDsc ;
   private boolean[] P0ARL4_n9431TMDsc ;
   private String[] P0ARL4_A9432TMTxt ;
   private boolean[] P0ARL4_n9432TMTxt ;
   private String[] P0ARL5_A396EmprCod ;
   private int[] P0ARL5_A9425OMCod ;
   private int[] P0ARL5_A9430TMCod ;
   private String[] P0ARL5_A12638TMOMMPieCo ;
   private String[] P0ARL5_A12637TMOMMSEqCo ;
   private String[] P0ARL5_A12636TMOMMEquCo ;
   private String[] P0ARL6_A396EmprCod ;
   private int[] P0ARL6_A9425OMCod ;
   private String[] P0ARL6_A9449OMRTpo ;
   private int[] P0ARL6_A9446OMRepCod ;
   private String[] P0ARL6_A9447OMRepNom ;
   private boolean[] P0ARL6_n9447OMRepNom ;
   private java.math.BigDecimal[] P0ARL6_A9453OMRCPre ;
   private java.math.BigDecimal[] P0ARL6_A9452OMRCCnt ;
   private java.math.BigDecimal[] P0ARL6_A9451OMRRPre ;
   private java.math.BigDecimal[] P0ARL6_A9450OMRRCnt ;
   private String[] P0ARL7_A396EmprCod ;
   private int[] P0ARL7_A9425OMCod ;
   private String[] P0ARL7_A9458OMMTpo ;
   private String[] P0ARL7_A9456OMOpeNom ;
   private boolean[] P0ARL7_n9456OMOpeNom ;
   private int[] P0ARL7_A9455OMOpeCod ;
   private java.math.BigDecimal[] P0ARL7_A9462OMMCPre ;
   private java.math.BigDecimal[] P0ARL7_A9461OMMCCnt ;
   private java.math.BigDecimal[] P0ARL7_A9460OMMRPre ;
   private java.math.BigDecimal[] P0ARL7_A9459OMMRCnt ;
   private String[] P0ARL8_A396EmprCod ;
   private int[] P0ARL8_A9492MRCod ;
   private java.math.BigDecimal[] P0ARL8_A9495MRStkAct ;
   private boolean[] P0ARL8_n9495MRStkAct ;
}

final  class ppmordenes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ARL2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ARL3", "SELECT T3.PMTipoID, T1.EmprCod, T1.OMCod, T1.OMEst, T1.PMCod, T1.OMMaqCod AS OMMaqCod, T4.PMTipoDsc, T3.PMDsc, T1.SMCod, T1.OMUsuCre, T2.MaqDsc AS OMMaqDsc, T1.OMFchPre, T1.OMFchCre, T1.OMTxt, T1.OMNot FROM (((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T3 ON T3.EmprCod = T1.EmprCod AND T3.PMCod = T1.PMCod) LEFT JOIN TXPTIPPRV T4 ON T4.EmprCod = T1.EmprCod AND T4.PMTipoID = T3.PMTipoID) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ARL4", "SELECT T1.EmprCod, T1.OMCod, T1.TMCod, T2.TMDsc, T2.TMTxt FROM (TXPMOrde2 T1 INNER JOIN TXPMTAREA T2 ON T2.EmprCod = T1.EmprCod AND T2.TMCod = T1.TMCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ARL5", "SELECT EmprCod, OMCod, TMCod, TMOMMPieCo, TMOMMSEqCo, TMOMMEquCo FROM TXPMOrdeI WHERE EmprCod = ? and OMCod = ? and TMCod = ? ORDER BY EmprCod, OMCod, TMCod, TMOMMEquCo, TMOMMSEqCo, TMOMMPieCo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ARL6", "SELECT T1.EmprCod, T1.OMCod, T1.OMRTpo, T1.OMRepCod AS OMRepCod, T2.MRNom AS OMRepNom, T1.OMRCPre, T1.OMRCCnt, T1.OMRRPre, T1.OMRRCnt FROM (TXPMOrRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.OMRepCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ARL7", "SELECT T1.EmprCod, T1.OMCod, T1.OMMTpo, T2.OpeNom AS OMOpeNom, T1.OMOpeCod AS OMOpeCod, T1.OMMCPre, T1.OMMCCnt, T1.OMMRPre, T1.OMMRCnt FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod) WHERE T1.EmprCod = ? and T1.OMCod = ? ORDER BY T1.EmprCod, T1.OMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ARL8", "SELECT EmprCod, MRCod, MRStkAct FROM TXPMREPUE WHERE EmprCod = ? and MRCod = ? ORDER BY EmprCod, MRCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 8);
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(13);
               ((String[]) buf[17])[0] = rslt.getVarchar(14);
               ((String[]) buf[18])[0] = rslt.getVarchar(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

