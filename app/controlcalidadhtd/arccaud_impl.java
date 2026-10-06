package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class arccaud_impl extends GXWebReport
{
   public arccaud_impl( com.genexus.internet.HttpContext context )
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
            AV9BarIni = (int)(GXutil.lval( httpContext.GetPar( "BarIni"))) ;
            AV8BarFin = (int)(GXutil.lval( httpContext.GetPar( "BarFin"))) ;
            AV24ReoIni = (byte)(GXutil.lval( httpContext.GetPar( "ReoIni"))) ;
            AV23ReoFin = (byte)(GXutil.lval( httpContext.GetPar( "ReoFin"))) ;
            AV22ParIni = httpContext.GetPar( "ParIni") ;
            AV21ParFin = httpContext.GetPar( "ParFin") ;
            AV13CliIni = (int)(GXutil.lval( httpContext.GetPar( "CliIni"))) ;
            AV12CliFin = (int)(GXutil.lval( httpContext.GetPar( "CliFin"))) ;
            AV11CCTIni = (int)(GXutil.lval( httpContext.GetPar( "CCTIni"))) ;
            AV10CCTFin = (int)(GXutil.lval( httpContext.GetPar( "CCTFin"))) ;
            AV15FchIni = localUtil.parseDateParm( httpContext.GetPar( "FchIni")) ;
            AV14FchFin = localUtil.parseDateParm( httpContext.GetPar( "FchFin")) ;
            AV28Det = httpContext.GetPar( "Det") ;
            AV32Real = (byte)(GXutil.lval( httpContext.GetPar( "Real"))) ;
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
         AV31Tot = 0 ;
         /* Using cursor P06MV2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9BarIni), Integer.valueOf(AV9BarIni), Integer.valueOf(AV8BarFin), Integer.valueOf(AV8BarFin), Byte.valueOf(AV24ReoIni), Byte.valueOf(AV24ReoIni), Byte.valueOf(AV23ReoFin), Byte.valueOf(AV23ReoFin), AV22ParIni, AV22ParIni, AV21ParFin, AV21ParFin, Integer.valueOf(AV13CliIni), Integer.valueOf(AV13CliIni), Integer.valueOf(AV12CliFin), Integer.valueOf(AV12CliFin), Integer.valueOf(AV11CCTIni), Integer.valueOf(AV11CCTIni), Integer.valueOf(AV10CCTFin), Integer.valueOf(AV10CCTFin), AV15FchIni, AV15FchIni, AV14FchFin, AV14FchFin});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A457FasCod = P06MV2_A457FasCod[0] ;
            A194BarOrdLin = P06MV2_A194BarOrdLin[0] ;
            A758ProCod = P06MV2_A758ProCod[0] ;
            A130BarCodPar = P06MV2_A130BarCodPar[0] ;
            A132BarCodReo = P06MV2_A132BarCodReo[0] ;
            A129BarCod = P06MV2_A129BarCod[0] ;
            A252CliCod = P06MV2_A252CliCod[0] ;
            n252CliCod = P06MV2_n252CliCod[0] ;
            A4031CCTCod = P06MV2_A4031CCTCod[0] ;
            A759ProDsc = P06MV2_A759ProDsc[0] ;
            A4033CCFch = P06MV2_A4033CCFch[0] ;
            n4033CCFch = P06MV2_n4033CCFch[0] ;
            A4032CCOpeCod = P06MV2_A4032CCOpeCod[0] ;
            n4032CCOpeCod = P06MV2_n4032CCOpeCod[0] ;
            A4036CCTDsc = P06MV2_A4036CCTDsc[0] ;
            A460FasDsc = P06MV2_A460FasDsc[0] ;
            A3281CcObs = P06MV2_A3281CcObs[0] ;
            n3281CcObs = P06MV2_n3281CcObs[0] ;
            A252CliCod = P06MV2_A252CliCod[0] ;
            n252CliCod = P06MV2_n252CliCod[0] ;
            A759ProDsc = P06MV2_A759ProDsc[0] ;
            A457FasCod = P06MV2_A457FasCod[0] ;
            A460FasDsc = P06MV2_A460FasDsc[0] ;
            A4036CCTDsc = P06MV2_A4036CCTDsc[0] ;
            GXt_int1 = AV33Ok ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int4[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            GXv_char6[0] = A758ProCod ;
            GXv_int7[0] = A194BarOrdLin ;
            GXv_int8[0] = A4031CCTCod ;
            GXv_int9[0] = GXt_int1 ;
            new app.controlcalidadhtd.pccend(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_char6, GXv_int7, GXv_int8, GXv_int9) ;
            arccaud_impl.this.A396EmprCod = GXv_char2[0] ;
            arccaud_impl.this.A129BarCod = GXv_int3[0] ;
            arccaud_impl.this.A132BarCodReo = GXv_int4[0] ;
            arccaud_impl.this.A130BarCodPar = GXv_char5[0] ;
            arccaud_impl.this.A758ProCod = GXv_char6[0] ;
            arccaud_impl.this.A194BarOrdLin = GXv_int7[0] ;
            arccaud_impl.this.A4031CCTCod = GXv_int8[0] ;
            arccaud_impl.this.GXt_int1 = GXv_int9[0] ;
            AV33Ok = GXt_int1 ;
            if ( ( ( AV32Real == 1 ) && ( AV33Ok == 1 ) ) || ( ( AV32Real == 2 ) && ( AV33Ok == 0 ) ) || ( AV32Real == 0 ) )
            {
               h6MV0( false, 18) ;
               getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 8, Gx_line+0, 67, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 72, Gx_line+0, 80, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 84, Gx_line+0, 98, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 278, Gx_line+0, 453, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), 508, Gx_line+0, 647, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9")), 652, Gx_line+0, 697, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A4033CCFch, "99/99/99"), 702, Gx_line+0, 757, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 98, Gx_line+0, 273, Gx_line+16, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               if ( GXutil.strcmp(AV28Det, httpContext.getMessage( "S", "")) == 0 )
               {
                  /* Using cursor P06MV3 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(AV13CliIni), Integer.valueOf(AV13CliIni), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(AV12CliFin), Integer.valueOf(AV12CliFin)});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A4035CCVal = P06MV3_A4035CCVal[0] ;
                     A4034CCTLin = P06MV3_A4034CCTLin[0] ;
                     A4043CCTLinDsc = P06MV3_A4043CCTLinDsc[0] ;
                     A4043CCTLinDsc = P06MV3_A4043CCTLinDsc[0] ;
                     GXt_char10 = AV18CCValDsc ;
                     GXv_char6[0] = A396EmprCod ;
                     GXv_int8[0] = A4031CCTCod ;
                     GXv_int7[0] = A4034CCTLin ;
                     GXv_char5[0] = A4035CCVal ;
                     GXv_char2[0] = GXt_char10 ;
                     new app.controlcalidadhtd.pccvaldsc(remoteHandle, context).execute( GXv_char6, GXv_int8, GXv_int7, GXv_char5, GXv_char2) ;
                     arccaud_impl.this.A396EmprCod = GXv_char6[0] ;
                     arccaud_impl.this.A4031CCTCod = GXv_int8[0] ;
                     arccaud_impl.this.A4034CCTLin = GXv_int7[0] ;
                     arccaud_impl.this.A4035CCVal = GXv_char5[0] ;
                     arccaud_impl.this.GXt_char10 = GXv_char2[0] ;
                     AV18CCValDsc = GXt_char10 ;
                     h6MV0( false, 18) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4043CCTLinDsc, "")), 235, Gx_line+0, 424, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18CCValDsc, "")), 464, Gx_line+0, 653, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     pr_default.readNext(1);
                  }
                  pr_default.close(1);
                  AV25Lins = (byte)(GXutil.gxmlines( A3281CcObs, (short)(100))) ;
                  AV26N = (byte)(0) ;
                  while ( AV26N < AV25Lins )
                  {
                     AV26N = (byte)(AV26N+1) ;
                     AV27Txt = GXutil.gxgetmli( A3281CcObs, AV26N, (short)(100)) ;
                     h6MV0( false, 18) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Txt, "")), 32, Gx_line+0, 658, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  h6MV0( false, 4) ;
                  getPrinter().GxDrawLine(0, Gx_line+1, 793, Gx_line+1, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+4) ;
               }
               if ( GXutil.strcmp(AV28Det, httpContext.getMessage( "N", "")) == 0 )
               {
                  h6MV0( false, 4) ;
                  getPrinter().GxDrawLine(0, Gx_line+1, 793, Gx_line+1, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+4) ;
               }
               AV31Tot = (long)(AV31Tot+1) ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         h6MV0( false, 18) ;
         getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31Tot), "ZZZZZZZZZ9")), 544, Gx_line+0, 618, Gx_line+18, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 471, Gx_line+0, 505, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6MV0( true, 0) ;
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

   public void h6MV0( boolean bFoot ,
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
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "TEXPLUS", ""), 21, Gx_line+1, 78, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 620, Gx_line+1, 665, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 721, Gx_line+0, 776, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 620, Gx_line+17, 659, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 675, Gx_line+16, 776, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 620, Gx_line+32, 671, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 675, Gx_line+31, 711, Gx_line+48, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Auditoría Continua", ""), 333, Gx_line+57, 460, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+65, 332, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(460, Gx_line+65, 792, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 717, Gx_line+31, 735, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 739, Gx_line+31, 775, Gx_line+48, 2, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+76) ;
            if ( ! ( (0==AV9BarIni) && (0==AV8BarFin) && (0==AV24ReoIni) && (0==AV23ReoFin) && (GXutil.strcmp("", AV22ParIni)==0) && (GXutil.strcmp("", AV21ParFin)==0) && (0==AV13CliIni) && (0==AV12CliFin) && (0==AV11CCTIni) && (0==AV10CCTFin) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15FchIni)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14FchFin)) && ( AV32Real == 0 ) ) )
            {
               getPrinter().GxDrawLine(0, Gx_line+7, 372, Gx_line+7, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(421, Gx_line+7, 793, Gx_line+7, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Filtros", ""), 376, Gx_line+0, 418, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               if ( AV32Real == 1 )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Realizados", ""), 177, Gx_line+0, 250, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               if ( AV32Real == 2 )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "No Realizados", ""), 177, Gx_line+0, 271, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               if ( ! ( (0==AV9BarIni) && (0==AV8BarFin) && (0==AV24ReoIni) && (0==AV23ReoFin) && (GXutil.strcmp("", AV22ParIni)==0) && (GXutil.strcmp("", AV21ParFin)==0) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "HDR", ""), 177, Gx_line+0, 206, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  if ( ! ( (0==AV9BarIni) && (0==AV24ReoIni) && (GXutil.strcmp("", AV22ParIni)==0) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9BarIni), "ZZZZZZZ9")), 367, Gx_line+0, 426, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24ReoIni), "9")), 433, Gx_line+0, 441, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22ParIni, "")), 444, Gx_line+0, 458, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 320, Gx_line+1, 360, Gx_line+19, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+19) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                  }
                  if ( ! ( (0==AV8BarFin) && (0==AV23ReoFin) && (GXutil.strcmp("", AV21ParFin)==0) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 492, Gx_line+1, 522, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8BarFin), "ZZZZZZZ9")), 527, Gx_line+1, 586, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23ReoFin), "9")), 589, Gx_line+1, 597, Gx_line+19, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21ParFin, "")), 599, Gx_line+1, 606, Gx_line+17, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+19) ;
                  }
                  else
                  {
                     Gx_line = (int)(Gx_line+16) ;
                  }
               }
               if ( ! ( (0==AV13CliIni) && (0==AV12CliFin) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente ", ""), 177, Gx_line+0, 228, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  if ( ! ( (0==AV13CliIni) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 320, Gx_line+0, 360, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13CliIni), "ZZZZZ9")), 381, Gx_line+0, 426, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                  }
                  if ( ! ( (0==AV12CliFin) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 492, Gx_line+0, 522, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12CliFin), "ZZZZZ9")), 542, Gx_line+0, 587, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  else
                  {
                     Gx_line = (int)(Gx_line+16) ;
                  }
               }
               if ( ! ( (0==AV11CCTIni) && (0==AV10CCTFin) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Control de Calidad", ""), 177, Gx_line+0, 300, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  if ( ! ( (0==AV11CCTIni) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 320, Gx_line+0, 360, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11CCTIni), "ZZZZZ9")), 381, Gx_line+0, 426, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                  }
                  if ( ! ( (0==AV10CCTFin) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 492, Gx_line+0, 522, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13CliIni), "ZZZZZ9")), 542, Gx_line+0, 587, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  else
                  {
                     Gx_line = (int)(Gx_line+16) ;
                  }
               }
               if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15FchIni)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14FchFin)) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fecha ", ""), 177, Gx_line+0, 221, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15FchIni)) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 320, Gx_line+0, 360, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( AV15FchIni, "99/99/99"), 371, Gx_line+0, 426, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                  }
                  if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14FchFin)) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 492, Gx_line+0, 522, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( AV14FchFin, "99/99/99"), 531, Gx_line+0, 586, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  else
                  {
                     Gx_line = (int)(Gx_line+16) ;
                  }
               }
               getPrinter().GxDrawLine(0, Gx_line+4, 793, Gx_line+4, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+10) ;
            }
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "HDR", ""), 38, Gx_line+0, 67, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 91, Gx_line+0, 146, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 278, Gx_line+0, 309, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Control", ""), 508, Gx_line+0, 558, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 648, Gx_line+0, 707, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 713, Gx_line+0, 753, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+19, 793, Gx_line+19, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+24) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Tahoma", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Tahoma", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV22ParIni = "" ;
      AV21ParFin = "" ;
      AV15FchIni = GXutil.nullDate() ;
      AV14FchFin = GXutil.nullDate() ;
      AV28Det = "" ;
      scmdbuf = "" ;
      P06MV2_A457FasCod = new String[] {""} ;
      P06MV2_A396EmprCod = new String[] {""} ;
      P06MV2_A194BarOrdLin = new short[1] ;
      P06MV2_A758ProCod = new String[] {""} ;
      P06MV2_A130BarCodPar = new String[] {""} ;
      P06MV2_A132BarCodReo = new byte[1] ;
      P06MV2_A129BarCod = new int[1] ;
      P06MV2_A252CliCod = new int[1] ;
      P06MV2_n252CliCod = new boolean[] {false} ;
      P06MV2_A4031CCTCod = new int[1] ;
      P06MV2_A759ProDsc = new String[] {""} ;
      P06MV2_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      P06MV2_n4033CCFch = new boolean[] {false} ;
      P06MV2_A4032CCOpeCod = new int[1] ;
      P06MV2_n4032CCOpeCod = new boolean[] {false} ;
      P06MV2_A4036CCTDsc = new String[] {""} ;
      P06MV2_A460FasDsc = new String[] {""} ;
      P06MV2_A3281CcObs = new String[] {""} ;
      P06MV2_n3281CcObs = new boolean[] {false} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A759ProDsc = "" ;
      A4033CCFch = GXutil.nullDate() ;
      A4036CCTDsc = "" ;
      A460FasDsc = "" ;
      A3281CcObs = "" ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_int9 = new byte[1] ;
      P06MV3_A396EmprCod = new String[] {""} ;
      P06MV3_A129BarCod = new int[1] ;
      P06MV3_A132BarCodReo = new byte[1] ;
      P06MV3_A130BarCodPar = new String[] {""} ;
      P06MV3_A758ProCod = new String[] {""} ;
      P06MV3_A194BarOrdLin = new short[1] ;
      P06MV3_A4031CCTCod = new int[1] ;
      P06MV3_A4035CCVal = new String[] {""} ;
      P06MV3_A4034CCTLin = new short[1] ;
      P06MV3_A4043CCTLinDsc = new String[] {""} ;
      A4035CCVal = "" ;
      A4043CCTLinDsc = "" ;
      AV18CCValDsc = "" ;
      GXt_char10 = "" ;
      GXv_char6 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int7 = new short[1] ;
      GXv_char5 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV27Txt = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.arccaud__default(),
         new Object[] {
             new Object[] {
            P06MV2_A457FasCod, P06MV2_A396EmprCod, P06MV2_A194BarOrdLin, P06MV2_A758ProCod, P06MV2_A130BarCodPar, P06MV2_A132BarCodReo, P06MV2_A129BarCod, P06MV2_A252CliCod, P06MV2_n252CliCod, P06MV2_A4031CCTCod,
            P06MV2_A759ProDsc, P06MV2_A4033CCFch, P06MV2_n4033CCFch, P06MV2_A4032CCOpeCod, P06MV2_n4032CCOpeCod, P06MV2_A4036CCTDsc, P06MV2_A460FasDsc, P06MV2_A3281CcObs, P06MV2_n3281CcObs
            }
            , new Object[] {
            P06MV3_A396EmprCod, P06MV3_A129BarCod, P06MV3_A132BarCodReo, P06MV3_A130BarCodPar, P06MV3_A758ProCod, P06MV3_A194BarOrdLin, P06MV3_A4031CCTCod, P06MV3_A4035CCVal, P06MV3_A4034CCTLin, P06MV3_A4043CCTLinDsc
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

   private byte AV24ReoIni ;
   private byte AV23ReoFin ;
   private byte AV32Real ;
   private byte A132BarCodReo ;
   private byte AV33Ok ;
   private byte GXt_int1 ;
   private byte GXv_int4[] ;
   private byte GXv_int9[] ;
   private byte AV25Lins ;
   private byte AV26N ;
   private short gxcookieaux ;
   private short A194BarOrdLin ;
   private short A4034CCTLin ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int AV9BarIni ;
   private int AV8BarFin ;
   private int AV13CliIni ;
   private int AV12CliFin ;
   private int AV11CCTIni ;
   private int AV10CCTFin ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A4031CCTCod ;
   private int A4032CCOpeCod ;
   private int GXv_int3[] ;
   private int Gx_OldLine ;
   private int GXv_int8[] ;
   private long AV31Tot ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV22ParIni ;
   private String AV21ParFin ;
   private String AV28Det ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A759ProDsc ;
   private String A4036CCTDsc ;
   private String A460FasDsc ;
   private String A4035CCVal ;
   private String A4043CCTLinDsc ;
   private String AV18CCValDsc ;
   private String GXt_char10 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String AV27Txt ;
   private String Gx_time ;
   private java.util.Date AV15FchIni ;
   private java.util.Date AV14FchFin ;
   private java.util.Date A4033CCFch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n4033CCFch ;
   private boolean n4032CCOpeCod ;
   private boolean n3281CcObs ;
   private String A3281CcObs ;
   private IDataStoreProvider pr_default ;
   private String[] P06MV2_A457FasCod ;
   private String[] P06MV2_A396EmprCod ;
   private short[] P06MV2_A194BarOrdLin ;
   private String[] P06MV2_A758ProCod ;
   private String[] P06MV2_A130BarCodPar ;
   private byte[] P06MV2_A132BarCodReo ;
   private int[] P06MV2_A129BarCod ;
   private int[] P06MV2_A252CliCod ;
   private boolean[] P06MV2_n252CliCod ;
   private int[] P06MV2_A4031CCTCod ;
   private String[] P06MV2_A759ProDsc ;
   private java.util.Date[] P06MV2_A4033CCFch ;
   private boolean[] P06MV2_n4033CCFch ;
   private int[] P06MV2_A4032CCOpeCod ;
   private boolean[] P06MV2_n4032CCOpeCod ;
   private String[] P06MV2_A4036CCTDsc ;
   private String[] P06MV2_A460FasDsc ;
   private String[] P06MV2_A3281CcObs ;
   private boolean[] P06MV2_n3281CcObs ;
   private String[] P06MV3_A396EmprCod ;
   private int[] P06MV3_A129BarCod ;
   private byte[] P06MV3_A132BarCodReo ;
   private String[] P06MV3_A130BarCodPar ;
   private String[] P06MV3_A758ProCod ;
   private short[] P06MV3_A194BarOrdLin ;
   private int[] P06MV3_A4031CCTCod ;
   private String[] P06MV3_A4035CCVal ;
   private short[] P06MV3_A4034CCTLin ;
   private String[] P06MV3_A4043CCTLinDsc ;
}

final  class arccaud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06MV2", "SELECT T4.FasCod, T1.EmprCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.CliCod, T1.CCTCod, T3.ProDsc, T1.CCFch, T1.CCOpeCod, T6.CCTDsc, T5.FasDsc, T1.CcObs FROM (((((TXPCC T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER JOIN TXPBARFAS T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.ProCod = T1.ProCod AND T4.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T5 ON T5.EmprCod = T1.EmprCod AND T5.FasCod = T4.FasCod) INNER JOIN TXPCCDef T6 ON T6.EmprCod = T1.EmprCod AND T6.CCTCod = T1.CCTCod) WHERE (T1.EmprCod = ?) AND (T1.BarCod >= ? or ( (? = 0))) AND (T1.BarCod <= ? or ( (? = 0))) AND (T1.BarCodReo >= ? or ( (? = 0))) AND (T1.BarCodReo <= ? or ( (? = 0))) AND (T1.BarCodPar >= ? or ( (rtrim(?) IS NULL))) AND (T1.BarCodPar <= ? or ( (rtrim(?) IS NULL))) AND (T2.CliCod >= ? or ( (? = 0))) AND (T2.CliCod <= ? or ( (? = 0))) AND (T1.CCTCod >= ? or ( (? = 0))) AND (T1.CCTCod <= ? or ( (? = 0))) AND (T1.CCFch >= ? or ( (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))) AND (T1.CCFch <= ? or ( (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))) ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06MV3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCVal, T1.CCTLin, T2.CCTLinDsc FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ?) AND (? >= ? or ( (? = 0))) AND (? <= ? or ( (? = 0))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 40);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 28);
               ((String[]) buf[17])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setDate(22, (java.util.Date)parms[21]);
               stmt.setDate(23, (java.util.Date)parms[22]);
               stmt.setDate(24, (java.util.Date)parms[23]);
               stmt.setDate(25, (java.util.Date)parms[24]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               stmt.setInt(9, ((Number) parms[9]).intValue());
               stmt.setInt(10, ((Number) parms[10]).intValue());
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[12]).intValue());
               }
               stmt.setInt(12, ((Number) parms[13]).intValue());
               stmt.setInt(13, ((Number) parms[14]).intValue());
               return;
      }
   }

}

