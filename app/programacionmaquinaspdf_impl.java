package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class programacionmaquinaspdf_impl extends GXWebReport
{
   public programacionmaquinaspdf_impl( com.genexus.internet.HttpContext context )
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
      M_bot = 6 ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_int1[0] = AV81Artemalha ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEMH", ""), GXv_int1) ;
         programacionmaquinaspdf_impl.this.AV81Artemalha = GXv_int1[0] ;
         AV124Lit1 = ((AV81Artemalha==1)||(GXutil.strcmp(AV158Op, httpContext.getMessage( "A", ""))==0) ? httpContext.getMessage( "O.S.", "") : httpContext.getMessage( "Enc.", "")) ;
         AV127MaqCodCollection.fromJSonString(AV80WebSession.getValue(httpContext.getMessage( "ProgramacionMaquinas_MaquinasVisibles", "")), null);
         /* Using cursor P08632 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P08632_A407EmprNom[0] ;
            n407EmprNom = P08632_n407EmprNom[0] ;
            AV110EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV164GXV2 = 1 ;
         GXt_objcol_SdtSDTMaquina2 = AV163GXV1 ;
         GXv_objcol_SdtSDTMaquina3[0] = GXt_objcol_SdtSDTMaquina2 ;
         new app.dpmaquina(remoteHandle, context).execute( A396EmprCod, AV127MaqCodCollection, true, GXv_objcol_SdtSDTMaquina3) ;
         GXt_objcol_SdtSDTMaquina2 = GXv_objcol_SdtSDTMaquina3[0] ;
         AV163GXV1 = GXt_objcol_SdtSDTMaquina2 ;
         while ( AV164GXV2 <= AV163GXV1.size() )
         {
            AV79SdtMaquina = (app.SdtSDTMaquina)((app.SdtSDTMaquina)AV163GXV1.elementAt(-1+AV164GXV2));
            AV165GXV3 = 1 ;
            while ( AV165GXV3 <= AV79SdtMaquina.getgxTv_SdtSDTMaquina_Sdthdrspormaquina().size() )
            {
               AV142SDTHdrsporMaquina = (app.SdtSDTHdrsporMaquina)((app.SdtSDTHdrsporMaquina)AV79SdtMaquina.getgxTv_SdtSDTMaquina_Sdthdrspormaquina().elementAt(-1+AV165GXV3));
               if ( AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barfasest() == 1 )
               {
                  h8630( false, 17) ;
                  getPrinter().GxDrawRect(2, Gx_line+0, 777, Gx_line+17, 0, 0, 0, 0, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcolnom(), 50, Gx_line+1, 119, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Clinom(), 125, Gx_line+1, 256, Gx_line+15, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barenccli(), 413, Gx_line+1, 466, Gx_line+15, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barserdsc(), 267, Gx_line+1, 400, Gx_line+15, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barkgs(), "ZZZZZ9.99"), 474, Gx_line+1, 511, Gx_line+15, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Baragrtotkgr(), "ZZZZZ9.99"), 520, Gx_line+1, 557, Gx_line+15, 2, 0, 0, 0) ;
                  getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+14, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+14, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+14, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+14, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+14, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+14, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+14, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+14, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(AV79SdtMaquina.getgxTv_SdtSDTMaquina_Maqcod(), 7, Gx_line+1, 42, Gx_line+15, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+14, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               else
               {
                  h8630( false, 15) ;
                  getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(AV79SdtMaquina.getgxTv_SdtSDTMaquina_Maqcod(), 7, Gx_line+0, 42, Gx_line+14, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcolnom(), 50, Gx_line+0, 119, Gx_line+14, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Clinom(), 125, Gx_line+0, 256, Gx_line+14, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barserdsc(), 267, Gx_line+0, 400, Gx_line+14, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barenccli(), 413, Gx_line+0, 466, Gx_line+14, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barkgs(), "ZZZZZ9.99"), 474, Gx_line+0, 511, Gx_line+14, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Baragrtotkgr(), "ZZZZZ9.99"), 520, Gx_line+0, 557, Gx_line+14, 2, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+15) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               AV154AuxPage = Gx_page ;
               AV155AuxLine = (int)(Gx_line+17) ;
               if ( AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barnotdsc().size() > 0 )
               {
                  AV167GXV4 = 1 ;
                  while ( AV167GXV4 <= AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barnotdsc().size() )
                  {
                     AV95Barnot = (String)AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barnotdsc().elementAt(-1+AV167GXV4) ;
                     if ( AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barfasest() == 1 )
                     {
                        h8630( false, 17) ;
                        getPrinter().GxDrawRect(561, Gx_line+0, 777, Gx_line+17, 0, 0, 0, 0, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+17, 1, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     else
                     {
                        h8630( false, 15) ;
                        getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+15) ;
                     }
                     AV167GXV4 = (int)(AV167GXV4+1) ;
                  }
               }
               else
               {
                  h8630( false, 17) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               if ( AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Baragr().size() > 0 )
               {
                  Gx_line = AV155AuxLine ;
                  Gx_page = AV154AuxPage ;
                  AV168GXV5 = 1 ;
                  while ( AV168GXV5 <= AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Baragr().size() )
                  {
                     AV82BarAgr = (app.SdtSDTHdrsporMaquina_Agr)((app.SdtSDTHdrsporMaquina_Agr)AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Baragr().elementAt(-1+AV168GXV5));
                     if ( AV142SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barfasest() == 1 )
                     {
                        h8630( false, 17) ;
                        getPrinter().GxDrawRect(2, Gx_line+0, 561, Gx_line+17, 0, 0, 0, 0, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                        getPrinter().GxDrawText(AV82BarAgr.getgxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc(), 269, Gx_line+0, 402, Gx_line+14, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(AV82BarAgr.getgxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu(), 413, Gx_line+0, 466, Gx_line+14, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( AV82BarAgr.getgxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr(), "ZZZZZ9.99"), 474, Gx_line+0, 511, Gx_line+14, 2, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     else
                     {
                        h8630( false, 17) ;
                        getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(AV82BarAgr.getgxTv_SdtSDTHdrsporMaquina_Agr_Baragrdsc(), 269, Gx_line+0, 402, Gx_line+14, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(AV82BarAgr.getgxTv_SdtSDTHdrsporMaquina_Agr_Baragrdnu(), 413, Gx_line+0, 466, Gx_line+14, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( AV82BarAgr.getgxTv_SdtSDTHdrsporMaquina_Agr_Kgmagr(), "ZZZZZ9.99"), 474, Gx_line+0, 511, Gx_line+14, 2, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     AV168GXV5 = (int)(AV168GXV5+1) ;
                  }
               }
               AV165GXV3 = (int)(AV165GXV3+1) ;
            }
            AV164GXV2 = (int)(AV164GXV2+1) ;
         }
         h8630( false, 4) ;
         getPrinter().GxDrawLine(44, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+4, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+4, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+4, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+4, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+4, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+4, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+4, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+4, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+4, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+4) ;
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

   public void h8630( boolean bFoot ,
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
               getPrinter().GxDrawLine(44, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+4, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+4) ;
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
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 651, Gx_line+0, 694, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 701, Gx_line+0, 744, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora", ""), 601, Gx_line+0, 644, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 653, Gx_line+23, 685, Gx_line+37, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 702, Gx_line+23, 750, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("/", 694, Gx_line+23, 700, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 601, Gx_line+23, 633, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV110EmprNom, "")), 14, Gx_line+6, 203, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV137NOspMaq), "ZZZ9")), 263, Gx_line+30, 285, Gx_line+44, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV136NomInf, "")), 14, Gx_line+29, 140, Gx_line+45, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+50) ;
            getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maq.", ""), 7, Gx_line+8, 33, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 75, Gx_line+8, 93, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 186, Gx_line+8, 222, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 325, Gx_line+8, 355, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 490, Gx_line+8, 514, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 532, Gx_line+8, 556, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Obs", ""), 676, Gx_line+8, 695, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(2, Gx_line+1, 2, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(121, Gx_line+1, 121, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(263, Gx_line+1, 263, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(407, Gx_line+1, 407, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(470, Gx_line+1, 470, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(516, Gx_line+1, 516, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(561, Gx_line+1, 561, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(44, Gx_line+1, 44, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(776, Gx_line+1, 776, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV124Lit1, "")), 424, Gx_line+8, 453, Gx_line+22, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+29) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      GXv_int1 = new byte[1] ;
      AV124Lit1 = "" ;
      AV158Op = "" ;
      AV127MaqCodCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      AV80WebSession = httpContext.getWebSession();
      scmdbuf = "" ;
      P08632_A396EmprCod = new String[] {""} ;
      P08632_A407EmprNom = new String[] {""} ;
      P08632_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV110EmprNom = "" ;
      AV163GXV1 = new GXBaseCollection<app.SdtSDTMaquina>(app.SdtSDTMaquina.class, "SDTMaquina", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTMaquina2 = new GXBaseCollection<app.SdtSDTMaquina>(app.SdtSDTMaquina.class, "SDTMaquina", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTMaquina3 = new GXBaseCollection[1] ;
      AV79SdtMaquina = new app.SdtSDTMaquina(remoteHandle, context);
      AV142SDTHdrsporMaquina = new app.SdtSDTHdrsporMaquina(remoteHandle, context);
      AV95Barnot = "" ;
      AV82BarAgr = new app.SdtSDTHdrsporMaquina_Agr(remoteHandle, context);
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV136NomInf = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.programacionmaquinaspdf__default(),
         new Object[] {
             new Object[] {
            P08632_A396EmprCod, P08632_A407EmprNom, P08632_n407EmprNom
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

   private byte AV81Artemalha ;
   private byte GXv_int1[] ;
   private short gxcookieaux ;
   private short AV137NOspMaq ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV164GXV2 ;
   private int AV165GXV3 ;
   private int Gx_OldLine ;
   private int AV154AuxPage ;
   private int AV155AuxLine ;
   private int AV167GXV4 ;
   private int AV168GXV5 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV124Lit1 ;
   private String AV158Op ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV110EmprNom ;
   private String AV95Barnot ;
   private String Gx_time ;
   private String AV136NomInf ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private com.genexus.webpanels.WebSession AV80WebSession ;
   private IDataStoreProvider pr_default ;
   private String[] P08632_A396EmprCod ;
   private String[] P08632_A407EmprNom ;
   private boolean[] P08632_n407EmprNom ;
   private GXSimpleCollection<String> AV127MaqCodCollection ;
   private GXBaseCollection<app.SdtSDTMaquina> AV163GXV1 ;
   private GXBaseCollection<app.SdtSDTMaquina> GXt_objcol_SdtSDTMaquina2 ;
   private GXBaseCollection<app.SdtSDTMaquina> GXv_objcol_SdtSDTMaquina3[] ;
   private app.SdtSDTMaquina AV79SdtMaquina ;
   private app.SdtSDTHdrsporMaquina AV142SDTHdrsporMaquina ;
   private app.SdtSDTHdrsporMaquina_Agr AV82BarAgr ;
}

final  class programacionmaquinaspdf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08632", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
      }
   }

}

