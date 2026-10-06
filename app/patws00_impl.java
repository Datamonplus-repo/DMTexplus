package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class patws00_impl extends GXWebReport
{
   public patws00_impl( com.genexus.internet.HttpContext context )
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
            AV27Path1 = httpContext.GetPar( "Path1") ;
            AV31Alb = GXutil.lval( httpContext.GetPar( "Alb")) ;
            AV28OkAT = (byte)(GXutil.lval( httpContext.GetPar( "OkAT"))) ;
            AV25ErrM = (byte)(GXutil.lval( httpContext.GetPar( "ErrM"))) ;
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
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
         AV25ErrM = (byte)(0) ;
         GXt_char1 = AV34Station ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         patws00_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Station = GXt_char1 ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = AV36Emprnom ;
         GXv_char4[0] = AV35Usurcod ;
         new app.pbusemp(remoteHandle, context).execute( AV34Station, GXv_char2, GXv_char3, GXv_char4) ;
         patws00_impl.this.A396EmprCod = GXv_char2[0] ;
         patws00_impl.this.AV36Emprnom = GXv_char3[0] ;
         patws00_impl.this.AV35Usurcod = GXv_char4[0] ;
         h42E0( false, 54) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Document Number", ""), 14, Gx_line+14, 123, Gx_line+28, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Guia Nº", ""), 203, Gx_line+14, 250, Gx_line+28, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ErrorMessage", ""), 14, Gx_line+0, 95, Gx_line+14, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(14, Gx_line+27, 1071, Gx_line+27, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "https://servicos.portaldasfinancas.gov.pt/sgdtpf/fileProcessingResult", ""), 650, Gx_line+0, 1065, Gx_line+14, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+54) ;
         AV19readfile.open(AV27Path1);
         if ( AV19readfile.getErrCode() > 0 )
         {
            Gx_msg = httpContext.getMessage( "Error Open Fichero XML -> ", "") + GXutil.trim( AV27Path1) + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "ErrCode= ", "") + GXutil.str( AV19readfile.getErrCode(), 4, 0) + " " + AV19readfile.getErrDescription() + GXutil.chr( (short)(13)) ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            AV19readfile.readType((short)(1), httpContext.getMessage( "SOAP-ENV:Fault", ""));
            AV29success = AV19readfile.readType((short)(1), httpContext.getMessage( "faultcode", "")) ;
            if ( AV29success == 0 )
            {
               AV19readfile.close();
            }
            else
            {
               AV19readfile.close();
               AV19readfile.open(AV27Path1);
               AV19readfile.readType((short)(1), httpContext.getMessage( "SOAP-ENV:Fault", ""));
               AV19readfile.read();
               AV30Verr = 0 ;
               AV24ErrorMsg = " " ;
               while ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "SOAP-ENV:Fault", "")) != 0 )
               {
                  if ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "faultcode", "")) == 0 )
                  {
                     AV20DocumentNumber = AV19readfile.getValue() ;
                     AV30Verr = (int)(GXutil.lval( GXutil.substring( AV20DocumentNumber, 1, 6))) ;
                     AV25ErrM = (byte)(1) ;
                  }
                  if ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "faultstring", "")) == 0 )
                  {
                     AV24ErrorMsg = AV19readfile.getValue() ;
                     AV25ErrM = (byte)(1) ;
                  }
                  AV19readfile.read();
               }
               if ( AV25ErrM == 1 )
               {
                  AV33Inc_obs = httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.str( AV31Alb, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( "faultcode=", "") + GXutil.str( AV30Verr, 6, 0) + " " + httpContext.getMessage( "faultstring=", "") + AV24ErrorMsg + GXutil.newLine( ) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV35Usurcod, AV34Station, AV33Inc_obs, (int)(AV31Alb), (byte)(0), "") ;
                  h42E0( false, 135) ;
                  getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ErrorMsg, "")), 68, Gx_line+0, 798, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30Verr), "ZZZZZ9")), 14, Gx_line+0, 59, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Errmsg2, "")), 68, Gx_line+41, 798, Gx_line+59, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+135) ;
               }
               AV19readfile.close();
            }
         }
         if ( AV25ErrM == 1 )
         {
            httpContext.nUserReturn = (byte)(1) ;
            if ( httpContext.willRedirect( ) )
            {
               httpContext.redirect( httpContext.wjLoc );
               httpContext.wjLoc = "" ;
            }
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV28OkAT = (byte)(0) ;
         AV23ATDocCodeID = " " ;
         AV22LeoGuia = (byte)(0) ;
         AV19readfile.open(AV27Path1);
         if ( AV19readfile.getErrCode() > 0 )
         {
            Gx_msg = httpContext.getMessage( "Error Open Fichero XML -> ", "") + GXutil.trim( AV27Path1) + GXutil.chr( (short)(13)) ;
            Gx_msg += httpContext.getMessage( "ErrCode= ", "") + GXutil.str( AV19readfile.getErrCode(), 4, 0) + " " + AV19readfile.getErrDescription() + GXutil.chr( (short)(13)) ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            AV25ErrM = (byte)(0) ;
            AV33Inc_obs = " " ;
            AV28OkAT = (byte)(0) ;
            AV23ATDocCodeID = " " ;
            AV22LeoGuia = (byte)(0) ;
            AV19readfile.readType((short)(1), httpContext.getMessage( "S:Body", ""));
            AV29success = AV19readfile.readType((short)(1), httpContext.getMessage( "ReturnMessage", "")) ;
            if ( AV29success == 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "No hay ReturnMessage ¡¡¡", ""));
               AV19readfile.close();
            }
            else
            {
               AV19readfile.close();
               AV19readfile.open(AV27Path1);
               AV19readfile.readType((short)(1), httpContext.getMessage( "S:Body", ""));
               AV19readfile.read();
               while ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "S:Body", "")) != 0 )
               {
                  if ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "ReturnCode", "")) == 0 )
                  {
                     AV20DocumentNumber = AV19readfile.getValue() ;
                     AV30Verr = (int)(GXutil.lval( GXutil.substring( AV20DocumentNumber, 1, 6))) ;
                     if ( ( AV30Verr == 0 ) || ( AV30Verr == -100 ) )
                     {
                        AV28OkAT = (byte)(1) ;
                     }
                     else
                     {
                        AV25ErrM = (byte)(1) ;
                     }
                     AV33Inc_obs = httpContext.getMessage( "ReturnCode=", "") + GXutil.str( AV30Verr, 6, 0) ;
                  }
                  if ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "ReturnMessage", "")) == 0 )
                  {
                     AV24ErrorMsg = AV19readfile.getValue() ;
                     if ( ( GXutil.strcmp(AV24ErrorMsg, httpContext.getMessage( "OK", "")) == 0 ) || ( ( AV30Verr == -100 ) ) )
                     {
                        AV28OkAT = (byte)(1) ;
                        AV25ErrM = (byte)(0) ;
                     }
                     else
                     {
                        AV25ErrM = (byte)(1) ;
                     }
                     AV33Inc_obs += httpContext.getMessage( "ReturnMessage=", "") + AV24ErrorMsg ;
                  }
                  if ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "DocumentNumber", "")) == 0 )
                  {
                     AV20DocumentNumber = AV19readfile.getValue() ;
                     AV21Albprocod = (int)(GXutil.lval( GXutil.substring( AV20DocumentNumber, 1, 10))) ;
                     AV22LeoGuia = (byte)(1) ;
                     AV33Inc_obs += httpContext.getMessage( "Confirmacion AT. DocumentNumber= ", "") + GXutil.str( AV21Albprocod, 8, 0) + " " ;
                  }
                  if ( ( AV28OkAT == 1 ) && ( GXutil.strcmp(AV19readfile.getName(), httpContext.getMessage( "ATDocCodeID", "")) == 0 ) )
                  {
                     AV23ATDocCodeID = AV19readfile.getValue() ;
                     h42E0( false, 27) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23ATDocCodeID, "")), 14, Gx_line+0, 161, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21Albprocod), "ZZZZZZZ9")), 203, Gx_line+0, 262, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+27) ;
                     /* Execute user subroutine: 'CALPRD' */
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
                     AV22LeoGuia = (byte)(0) ;
                     AV33Inc_obs += httpContext.getMessage( "ATDocCodeID= ", "") + AV23ATDocCodeID ;
                  }
                  AV19readfile.read();
               }
               AV19readfile.close();
               if ( ( AV28OkAT == 1 ) && ( AV30Verr == -100 ) )
               {
                  AV39Errmsg2 = httpContext.getMessage( "Erro=-100. O sistema não devolve o código AT", "") ;
                  AV33Inc_obs = httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.str( AV31Alb, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( "Erro=-100. O sistema não devolve o código AT", "") + GXutil.newLine( ) + httpContext.getMessage( "ReturnCode=", "") + GXutil.str( AV30Verr, 6, 0) + " " + httpContext.getMessage( "ReturnMessage=", "") + AV24ErrorMsg + GXutil.newLine( ) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV35Usurcod, AV34Station, AV33Inc_obs, (int)(AV31Alb), (byte)(0), "") ;
                  /* Execute user subroutine: 'CALPRD2' */
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
                  h42E0( false, 135) ;
                  getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ErrorMsg, "")), 68, Gx_line+0, 798, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30Verr), "ZZZZZ9")), 14, Gx_line+0, 59, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Errmsg2, "")), 68, Gx_line+41, 798, Gx_line+59, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+135) ;
               }
               if ( AV25ErrM == 1 )
               {
                  AV33Inc_obs = httpContext.getMessage( "Incidencia AT, Documento= ", "") + GXutil.str( AV31Alb, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( "ReturnCode=", "") + GXutil.str( AV30Verr, 6, 0) + " " + httpContext.getMessage( "ReturnMessage=", "") + AV24ErrorMsg + GXutil.newLine( ) ;
                  new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV35Usurcod, AV34Station, AV33Inc_obs, (int)(AV31Alb), (byte)(0), "") ;
                  h42E0( false, 135) ;
                  getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24ErrorMsg, "")), 68, Gx_line+0, 798, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30Verr), "ZZZZZ9")), 14, Gx_line+0, 59, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39Errmsg2, "")), 68, Gx_line+41, 798, Gx_line+59, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+135) ;
               }
            }
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h42E0( true, 0) ;
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
      /* 'CALPRD' Routine */
      returnInSub = false ;
      Gx_msg = httpContext.getMessage( "O documento Nº= ", "") + GXutil.str( AV21Albprocod, 8, 0) + GXutil.chr( (short)(13)) ;
      Gx_msg += httpContext.getMessage( "foi atualizado com o código AT= ", "") + AV23ATDocCodeID + GXutil.chr( (short)(13)) ;
      httpContext.GX_msglist.addItem(Gx_msg);
      /* Using cursor P042E2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV31Alb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P042E2_A30AlbProCod[0] ;
         A5805AlbEnvFtp = P042E2_A5805AlbEnvFtp[0] ;
         A7101AlbLic = P042E2_A7101AlbLic[0] ;
         A10765AlbProAT = P042E2_A10765AlbProAT[0] ;
         A5805AlbEnvFtp = (byte)(3) ;
         A7101AlbLic = AV23ATDocCodeID ;
         A10765AlbProAT = httpContext.getMessage( "A", "") ;
         /* Using cursor P042E3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A5805AlbEnvFtp), A7101AlbLic, A10765AlbProAT, A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV35Usurcod, AV34Station, AV33Inc_obs, (int)(AV31Alb), (byte)(0), "") ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'CALPRD2' Routine */
      returnInSub = false ;
      /* Using cursor P042E4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(AV31Alb)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A30AlbProCod = P042E4_A30AlbProCod[0] ;
         A5805AlbEnvFtp = P042E4_A5805AlbEnvFtp[0] ;
         A7101AlbLic = P042E4_A7101AlbLic[0] ;
         A10765AlbProAT = P042E4_A10765AlbProAT[0] ;
         A5805AlbEnvFtp = (byte)(3) ;
         A7101AlbLic = " " ;
         A10765AlbProAT = httpContext.getMessage( "A", "") ;
         /* Using cursor P042E5 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A5805AlbEnvFtp), A7101AlbLic, A10765AlbProAT, A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV44Pgmname, AV35Usurcod, AV34Station, AV33Inc_obs, (int)(AV31Alb), (byte)(0), "") ;
   }

   public void h42E0( boolean bFoot ,
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", false, true, 56, 14, 70, 118,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 18, 22, 35, 35, 56, 42, 12, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 18, 18, 37, 37, 37, 35, 64, 42, 42, 45, 45, 42, 38, 49, 45, 18, 32, 42, 35, 53, 45, 49, 42, 49, 45, 42, 38, 45, 42, 61, 42, 42, 38, 18, 18, 18, 30, 35, 21, 35, 35, 32, 35, 35, 18, 35, 35, 14, 14, 32, 14, 52, 35, 35, 35, 35, 21, 32, 18, 35, 32, 45, 32, 32, 29, 21, 16, 21, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 35, 35, 34, 35, 16, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 20, 21, 35, 34, 21, 21, 20, 23, 35, 53, 53, 53, 38, 42, 42, 42, 42, 42, 42, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 32, 35, 35, 35, 35, 18, 18, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 38, 35, 35, 35, 35, 32, 35, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      Application.commitDataStores(context, remoteHandle, pr_default, "patws00");
      CloseOpenCursors();
      Application.commitDataStores(context, remoteHandle, pr_default, "patws00");
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
      AV27Path1 = "" ;
      AV34Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV36Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV35Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV19readfile = new com.genexus.xml.XMLReader();
      Gx_msg = "" ;
      AV24ErrorMsg = "" ;
      AV20DocumentNumber = "" ;
      AV33Inc_obs = "" ;
      AV44Pgmname = "" ;
      AV39Errmsg2 = "" ;
      AV23ATDocCodeID = "" ;
      scmdbuf = "" ;
      P042E2_A396EmprCod = new String[] {""} ;
      P042E2_A30AlbProCod = new long[1] ;
      P042E2_A5805AlbEnvFtp = new byte[1] ;
      P042E2_A7101AlbLic = new String[] {""} ;
      P042E2_A10765AlbProAT = new String[] {""} ;
      A7101AlbLic = "" ;
      A10765AlbProAT = "" ;
      P042E4_A396EmprCod = new String[] {""} ;
      P042E4_A30AlbProCod = new long[1] ;
      P042E4_A5805AlbEnvFtp = new byte[1] ;
      P042E4_A7101AlbLic = new String[] {""} ;
      P042E4_A10765AlbProAT = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.patws00__default(),
         new Object[] {
             new Object[] {
            P042E2_A396EmprCod, P042E2_A30AlbProCod, P042E2_A5805AlbEnvFtp, P042E2_A7101AlbLic, P042E2_A10765AlbProAT
            }
            , new Object[] {
            }
            , new Object[] {
            P042E4_A396EmprCod, P042E4_A30AlbProCod, P042E4_A5805AlbEnvFtp, P042E4_A7101AlbLic, P042E4_A10765AlbProAT
            }
            , new Object[] {
            }
         }
      );
      AV44Pgmname = "PATWS00" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV44Pgmname = "PATWS00" ;
      Gx_err = (short)(0) ;
      AV40NomInf = httpContext.getMessage( httpContext.getMessage( "Respuesta AT", ""), "") + httpContext.getMessage( httpContext.getMessage( ".pdf", ""), "") ;
   }

   private byte AV28OkAT ;
   private byte AV25ErrM ;
   private byte AV22LeoGuia ;
   private byte A5805AlbEnvFtp ;
   private short gxcookieaux ;
   private short AV29success ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV30Verr ;
   private int AV21Albprocod ;
   private long AV31Alb ;
   private long A30AlbProCod ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV27Path1 ;
   private String AV34Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV36Emprnom ;
   private String GXv_char3[] ;
   private String AV35Usurcod ;
   private String GXv_char4[] ;
   private String Gx_msg ;
   private String AV24ErrorMsg ;
   private String AV20DocumentNumber ;
   private String AV44Pgmname ;
   private String AV39Errmsg2 ;
   private String AV23ATDocCodeID ;
   private String scmdbuf ;
   private String A7101AlbLic ;
   private String A10765AlbProAT ;
   private String AV40NomInf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private String AV33Inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P042E2_A396EmprCod ;
   private long[] P042E2_A30AlbProCod ;
   private byte[] P042E2_A5805AlbEnvFtp ;
   private String[] P042E2_A7101AlbLic ;
   private String[] P042E2_A10765AlbProAT ;
   private String[] P042E4_A396EmprCod ;
   private long[] P042E4_A30AlbProCod ;
   private byte[] P042E4_A5805AlbEnvFtp ;
   private String[] P042E4_A7101AlbLic ;
   private String[] P042E4_A10765AlbProAT ;
   private com.genexus.xml.XMLReader AV19readfile ;
}

final  class patws00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P042E2", "SELECT EmprCod, AlbProCod, AlbEnvFtp, AlbLic, AlbProAT FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P042E3", "UPDATE TXPCALPRD SET AlbEnvFtp=?, AlbLic=?, AlbProAT=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P042E4", "SELECT EmprCod, AlbProCod, AlbEnvFtp, AlbLic, AlbProAT FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P042E5", "UPDATE TXPCALPRD SET AlbEnvFtp=?, AlbLic=?, AlbProAT=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
      }
   }

}

