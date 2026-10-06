package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rccreateo_impl extends GXWebReport
{
   public rccreateo_impl( com.genexus.internet.HttpContext context )
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
            AV17NivIni = httpContext.GetPar( "NivIni") ;
            AV16NivFin = httpContext.GetPar( "NivFin") ;
            AV28Det = httpContext.GetPar( "Det") ;
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
         /* Using cursor P06MY2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9BarIni), Integer.valueOf(AV9BarIni), Integer.valueOf(AV8BarFin), Integer.valueOf(AV8BarFin), Byte.valueOf(AV24ReoIni), Byte.valueOf(AV24ReoIni), Byte.valueOf(AV23ReoFin), Byte.valueOf(AV23ReoFin), AV22ParIni, AV22ParIni, AV21ParFin, AV21ParFin, Integer.valueOf(AV11CCTIni), Integer.valueOf(AV11CCTIni), Integer.valueOf(AV10CCTFin), Integer.valueOf(AV10CCTFin), AV15FchIni, AV15FchIni, AV14FchFin, AV14FchFin, Integer.valueOf(AV13CliIni), Integer.valueOf(AV13CliIni), Integer.valueOf(AV12CliFin), Integer.valueOf(AV12CliFin)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A194BarOrdLin = P06MY2_A194BarOrdLin[0] ;
            A758ProCod = P06MY2_A758ProCod[0] ;
            A130BarCodPar = P06MY2_A130BarCodPar[0] ;
            A132BarCodReo = P06MY2_A132BarCodReo[0] ;
            A129BarCod = P06MY2_A129BarCod[0] ;
            A4031CCTCod = P06MY2_A4031CCTCod[0] ;
            A136BarColNum = P06MY2_A136BarColNum[0] ;
            A135BarColNom = P06MY2_A135BarColNom[0] ;
            A212BarSer = P06MY2_A212BarSer[0] ;
            A252CliCod = P06MY2_A252CliCod[0] ;
            n252CliCod = P06MY2_n252CliCod[0] ;
            A4033CCFch = P06MY2_A4033CCFch[0] ;
            n4033CCFch = P06MY2_n4033CCFch[0] ;
            A4032CCOpeCod = P06MY2_A4032CCOpeCod[0] ;
            n4032CCOpeCod = P06MY2_n4032CCOpeCod[0] ;
            A4036CCTDsc = P06MY2_A4036CCTDsc[0] ;
            A457FasCod = P06MY2_A457FasCod[0] ;
            A136BarColNum = P06MY2_A136BarColNum[0] ;
            A135BarColNom = P06MY2_A135BarColNom[0] ;
            A212BarSer = P06MY2_A212BarSer[0] ;
            A252CliCod = P06MY2_A252CliCod[0] ;
            n252CliCod = P06MY2_n252CliCod[0] ;
            A457FasCod = P06MY2_A457FasCod[0] ;
            A4036CCTDsc = P06MY2_A4036CCTDsc[0] ;
            h6MY0( false, 39) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), 8, Gx_line+0, 66, Gx_line+17, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), 74, Gx_line+0, 81, Gx_line+17, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A130BarCodPar, "")), 89, Gx_line+0, 102, Gx_line+17, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 108, Gx_line+0, 208, Gx_line+17, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 216, Gx_line+0, 316, Gx_line+17, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")), 323, Gx_line+0, 367, Gx_line+17, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), 374, Gx_line+0, 513, Gx_line+17, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4032CCOpeCod), "ZZZZZ9")), 520, Gx_line+0, 564, Gx_line+17, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A4033CCFch, "99/99/99"), 571, Gx_line+0, 625, Gx_line+17, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Variable", ""), 91, Gx_line+18, 147, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Real", ""), 318, Gx_line+18, 348, Gx_line+36, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Teórico", ""), 544, Gx_line+18, 594, Gx_line+36, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+36, 793, Gx_line+36, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+39) ;
            /* Using cursor P06MY3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), AV17NivIni, AV17NivIni, AV16NivFin, AV16NivFin, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(AV13CliIni), Integer.valueOf(AV13CliIni), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(AV12CliFin), Integer.valueOf(AV12CliFin)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A4035CCVal = P06MY3_A4035CCVal[0] ;
               A4043CCTLinDsc = P06MY3_A4043CCTLinDsc[0] ;
               A4034CCTLin = P06MY3_A4034CCTLin[0] ;
               A4043CCTLinDsc = P06MY3_A4043CCTLinDsc[0] ;
               GXt_char1 = AV32CCsVal ;
               GXv_char2[0] = GXt_char1 ;
               new app.controlcalidadhtd.pccstdval(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A4031CCTCod, A4034CCTLin, GXv_char2) ;
               rccreateo_impl.this.GXt_char1 = GXv_char2[0] ;
               AV32CCsVal = GXt_char1 ;
               GXt_char1 = AV18CCValDsc ;
               GXv_char2[0] = A396EmprCod ;
               GXv_int3[0] = A4031CCTCod ;
               GXv_int4[0] = A4034CCTLin ;
               GXv_char5[0] = A4035CCVal ;
               GXv_char6[0] = GXt_char1 ;
               new app.controlcalidadhtd.pccvaldsc(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_char6) ;
               rccreateo_impl.this.A396EmprCod = GXv_char2[0] ;
               rccreateo_impl.this.A4031CCTCod = GXv_int3[0] ;
               rccreateo_impl.this.A4034CCTLin = GXv_int4[0] ;
               rccreateo_impl.this.A4035CCVal = GXv_char5[0] ;
               rccreateo_impl.this.GXt_char1 = GXv_char6[0] ;
               AV18CCValDsc = GXt_char1 ;
               GXt_char1 = AV33CCvalCtr ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int3[0] = A4031CCTCod ;
               GXv_int4[0] = A4034CCTLin ;
               GXv_char5[0] = GXt_char1 ;
               new app.controlcalidadhtd.pccvalctr(remoteHandle, context).execute( GXv_char6, GXv_int3, GXv_int4, GXv_char5) ;
               rccreateo_impl.this.A396EmprCod = GXv_char6[0] ;
               rccreateo_impl.this.A4031CCTCod = GXv_int3[0] ;
               rccreateo_impl.this.A4034CCTLin = GXv_int4[0] ;
               rccreateo_impl.this.GXt_char1 = GXv_char5[0] ;
               AV33CCvalCtr = GXt_char1 ;
               GXt_char1 = AV31CCSValDsc ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int3[0] = A4031CCTCod ;
               GXv_int4[0] = A4034CCTLin ;
               GXv_char5[0] = AV33CCvalCtr ;
               GXv_char2[0] = GXt_char1 ;
               new app.controlcalidadhtd.pccvaldsc(remoteHandle, context).execute( GXv_char6, GXv_int3, GXv_int4, GXv_char5, GXv_char2) ;
               rccreateo_impl.this.A396EmprCod = GXv_char6[0] ;
               rccreateo_impl.this.A4031CCTCod = GXv_int3[0] ;
               rccreateo_impl.this.A4034CCTLin = GXv_int4[0] ;
               rccreateo_impl.this.AV33CCvalCtr = GXv_char5[0] ;
               rccreateo_impl.this.GXt_char1 = GXv_char2[0] ;
               AV31CCSValDsc = GXt_char1 ;
               h6MY0( false, 18) ;
               getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4043CCTLinDsc, "")), 91, Gx_line+0, 280, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18CCValDsc, "")), 318, Gx_line+0, 506, Gx_line+17, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33CCvalCtr, "")), 544, Gx_line+0, 733, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            h6MY0( false, 13) ;
            getPrinter().GxDrawLine(0, Gx_line+5, 793, Gx_line+5, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+13) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6MY0( true, 0) ;
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

   public void h6MY0( boolean bFoot ,
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
            getPrinter().GxDrawText(httpContext.getMessage( "Comprobación Real/Teórica", ""), 304, Gx_line+57, 490, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+65, 299, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(494, Gx_line+65, 793, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 638, Gx_line+1, 683, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 739, Gx_line+0, 794, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 638, Gx_line+17, 677, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 693, Gx_line+16, 794, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 638, Gx_line+32, 689, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 693, Gx_line+31, 729, Gx_line+48, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 734, Gx_line+31, 752, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 756, Gx_line+31, 792, Gx_line+48, 2, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+76) ;
            if ( ! ( (0==AV9BarIni) && (0==AV8BarFin) && (0==AV24ReoIni) && (0==AV23ReoFin) && (GXutil.strcmp("", AV22ParIni)==0) && (GXutil.strcmp("", AV21ParFin)==0) && (0==AV13CliIni) && (0==AV12CliFin) && (0==AV11CCTIni) && (0==AV10CCTFin) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15FchIni)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14FchFin)) && (GXutil.strcmp("", AV17NivIni)==0) && (GXutil.strcmp("", AV16NivFin)==0) ) )
            {
               getPrinter().GxDrawLine(0, Gx_line+7, 372, Gx_line+7, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(421, Gx_line+7, 793, Gx_line+7, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Filtros", ""), 378, Gx_line+0, 420, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               if ( ! ( (0==AV9BarIni) && (0==AV8BarFin) && (0==AV24ReoIni) && (0==AV23ReoFin) && (GXutil.strcmp("", AV22ParIni)==0) && (GXutil.strcmp("", AV21ParFin)==0) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "HDR", ""), 96, Gx_line+0, 125, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  if ( ! ( (0==AV9BarIni) && (0==AV24ReoIni) && (GXutil.strcmp("", AV22ParIni)==0) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9BarIni), "ZZZZZZZ9")), 288, Gx_line+0, 346, Gx_line+17, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24ReoIni), "9")), 350, Gx_line+0, 357, Gx_line+17, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22ParIni, "")), 361, Gx_line+0, 368, Gx_line+17, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 231, Gx_line+0, 271, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                  }
                  if ( ! ( (0==AV8BarFin) && (0==AV23ReoFin) && (GXutil.strcmp("", AV21ParFin)==0) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 502, Gx_line+0, 532, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8BarFin), "ZZZZZZZ9")), 549, Gx_line+0, 608, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23ReoFin), "9")), 611, Gx_line+0, 618, Gx_line+17, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21ParFin, "")), 622, Gx_line+0, 629, Gx_line+17, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  else
                  {
                     Gx_line = (int)(Gx_line+16) ;
                  }
               }
               if ( ! ( (0==AV13CliIni) && (0==AV12CliFin) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 96, Gx_line+0, 143, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  if ( ! ( (0==AV13CliIni) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13CliIni), "ZZZZZ9")), 302, Gx_line+0, 346, Gx_line+17, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 231, Gx_line+0, 271, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                  }
                  if ( ! ( (0==AV12CliFin) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 502, Gx_line+0, 532, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12CliFin), "ZZZZZ9")), 564, Gx_line+0, 608, Gx_line+17, 0, 0, 0, 0) ;
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
                  getPrinter().GxDrawText(httpContext.getMessage( "Control de Calidad", ""), 96, Gx_line+0, 219, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  if ( ! ( (0==AV11CCTIni) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 231, Gx_line+1, 271, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11CCTIni), "ZZZZZ9")), 302, Gx_line+1, 346, Gx_line+18, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+19) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                  }
                  if ( ! ( (0==AV10CCTFin) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 502, Gx_line+0, 532, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13CliIni), "ZZZZZ9")), 564, Gx_line+0, 608, Gx_line+17, 0, 0, 0, 0) ;
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
                  getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 96, Gx_line+0, 136, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV15FchIni)) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( AV15FchIni, "99/99/99"), 292, Gx_line+0, 346, Gx_line+17, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 231, Gx_line+0, 271, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                  }
                  if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14FchFin)) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 502, Gx_line+0, 532, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( AV14FchFin, "99/99/99"), 553, Gx_line+0, 607, Gx_line+17, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  else
                  {
                     Gx_line = (int)(Gx_line+16) ;
                  }
               }
               if ( ! ( (GXutil.strcmp("", AV17NivIni)==0) && (GXutil.strcmp("", AV16NivFin)==0) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Solo Controles Internos.", ""), 96, Gx_line+1, 261, Gx_line+19, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+19) ;
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nivel", ""), 96, Gx_line+0, 128, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  if ( ! ( (GXutil.strcmp("", AV17NivIni)==0) ) )
                  {
                     GXt_char1 = AV19ValIniDsc ;
                     GXv_char6[0] = AV17NivIni ;
                     GXv_char5[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccivaldsc(remoteHandle, context).execute( GXv_char6, GXv_char5) ;
                     rccreateo_impl.this.AV17NivIni = GXv_char6[0] ;
                     rccreateo_impl.this.GXt_char1 = GXv_char5[0] ;
                     AV19ValIniDsc = GXt_char1 ;
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 231, Gx_line+0, 271, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19ValIniDsc, "")), 292, Gx_line+0, 480, Gx_line+17, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                     /* Noskip command */
                     Gx_line = Gx_OldLine ;
                  }
                  if ( ! ( (GXutil.strcmp("", AV16NivFin)==0) ) )
                  {
                     GXt_char1 = AV20ValFinDsc ;
                     GXv_char6[0] = AV16NivFin ;
                     GXv_char5[0] = GXt_char1 ;
                     new app.controlcalidadhtd.pccivaldsc(remoteHandle, context).execute( GXv_char6, GXv_char5) ;
                     rccreateo_impl.this.AV16NivFin = GXv_char6[0] ;
                     rccreateo_impl.this.GXt_char1 = GXv_char5[0] ;
                     AV20ValFinDsc = GXt_char1 ;
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Final", ""), 502, Gx_line+0, 532, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20ValFinDsc, "")), 553, Gx_line+0, 741, Gx_line+17, 0, 0, 0, 0) ;
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
            getPrinter().GxDrawText(httpContext.getMessage( "HDR", ""), 39, Gx_line+0, 68, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 108, Gx_line+0, 163, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 216, Gx_line+0, 247, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Control", ""), 374, Gx_line+0, 424, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Operario", ""), 505, Gx_line+0, 564, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 571, Gx_line+0, 611, Gx_line+18, 0+256, 0, 0, 0) ;
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
      AV17NivIni = "" ;
      AV16NivFin = "" ;
      AV28Det = "" ;
      scmdbuf = "" ;
      P06MY2_A396EmprCod = new String[] {""} ;
      P06MY2_A194BarOrdLin = new short[1] ;
      P06MY2_A758ProCod = new String[] {""} ;
      P06MY2_A130BarCodPar = new String[] {""} ;
      P06MY2_A132BarCodReo = new byte[1] ;
      P06MY2_A129BarCod = new int[1] ;
      P06MY2_A4031CCTCod = new int[1] ;
      P06MY2_A136BarColNum = new int[1] ;
      P06MY2_A135BarColNom = new String[] {""} ;
      P06MY2_A212BarSer = new String[] {""} ;
      P06MY2_A252CliCod = new int[1] ;
      P06MY2_n252CliCod = new boolean[] {false} ;
      P06MY2_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      P06MY2_n4033CCFch = new boolean[] {false} ;
      P06MY2_A4032CCOpeCod = new int[1] ;
      P06MY2_n4032CCOpeCod = new boolean[] {false} ;
      P06MY2_A4036CCTDsc = new String[] {""} ;
      P06MY2_A457FasCod = new String[] {""} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A4033CCFch = GXutil.nullDate() ;
      A4036CCTDsc = "" ;
      A457FasCod = "" ;
      P06MY3_A396EmprCod = new String[] {""} ;
      P06MY3_A129BarCod = new int[1] ;
      P06MY3_A132BarCodReo = new byte[1] ;
      P06MY3_A130BarCodPar = new String[] {""} ;
      P06MY3_A758ProCod = new String[] {""} ;
      P06MY3_A194BarOrdLin = new short[1] ;
      P06MY3_A4031CCTCod = new int[1] ;
      P06MY3_A4035CCVal = new String[] {""} ;
      P06MY3_A4043CCTLinDsc = new String[] {""} ;
      P06MY3_A4034CCTLin = new short[1] ;
      A4035CCVal = "" ;
      A4043CCTLinDsc = "" ;
      AV32CCsVal = "" ;
      AV18CCValDsc = "" ;
      AV33CCvalCtr = "" ;
      AV31CCSValDsc = "" ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new short[1] ;
      GXv_char2 = new String[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV19ValIniDsc = "" ;
      AV20ValFinDsc = "" ;
      GXt_char1 = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.rccreateo__default(),
         new Object[] {
             new Object[] {
            P06MY2_A396EmprCod, P06MY2_A194BarOrdLin, P06MY2_A758ProCod, P06MY2_A130BarCodPar, P06MY2_A132BarCodReo, P06MY2_A129BarCod, P06MY2_A4031CCTCod, P06MY2_A136BarColNum, P06MY2_A135BarColNom, P06MY2_A212BarSer,
            P06MY2_A252CliCod, P06MY2_n252CliCod, P06MY2_A4033CCFch, P06MY2_n4033CCFch, P06MY2_A4032CCOpeCod, P06MY2_n4032CCOpeCod, P06MY2_A4036CCTDsc, P06MY2_A457FasCod
            }
            , new Object[] {
            P06MY3_A396EmprCod, P06MY3_A129BarCod, P06MY3_A132BarCodReo, P06MY3_A130BarCodPar, P06MY3_A758ProCod, P06MY3_A194BarOrdLin, P06MY3_A4031CCTCod, P06MY3_A4035CCVal, P06MY3_A4043CCTLinDsc, P06MY3_A4034CCTLin
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
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A194BarOrdLin ;
   private short A4034CCTLin ;
   private short GXv_int4[] ;
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
   private int A4031CCTCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A4032CCOpeCod ;
   private int Gx_OldLine ;
   private int GXv_int3[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV22ParIni ;
   private String AV21ParFin ;
   private String AV17NivIni ;
   private String AV16NivFin ;
   private String AV28Det ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A4036CCTDsc ;
   private String A457FasCod ;
   private String A4035CCVal ;
   private String A4043CCTLinDsc ;
   private String AV32CCsVal ;
   private String AV18CCValDsc ;
   private String AV33CCvalCtr ;
   private String AV31CCSValDsc ;
   private String GXv_char2[] ;
   private String Gx_time ;
   private String AV19ValIniDsc ;
   private String AV20ValFinDsc ;
   private String GXt_char1 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private java.util.Date AV15FchIni ;
   private java.util.Date AV14FchFin ;
   private java.util.Date A4033CCFch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n4033CCFch ;
   private boolean n4032CCOpeCod ;
   private IDataStoreProvider pr_default ;
   private String[] P06MY2_A396EmprCod ;
   private short[] P06MY2_A194BarOrdLin ;
   private String[] P06MY2_A758ProCod ;
   private String[] P06MY2_A130BarCodPar ;
   private byte[] P06MY2_A132BarCodReo ;
   private int[] P06MY2_A129BarCod ;
   private int[] P06MY2_A4031CCTCod ;
   private int[] P06MY2_A136BarColNum ;
   private String[] P06MY2_A135BarColNom ;
   private String[] P06MY2_A212BarSer ;
   private int[] P06MY2_A252CliCod ;
   private boolean[] P06MY2_n252CliCod ;
   private java.util.Date[] P06MY2_A4033CCFch ;
   private boolean[] P06MY2_n4033CCFch ;
   private int[] P06MY2_A4032CCOpeCod ;
   private boolean[] P06MY2_n4032CCOpeCod ;
   private String[] P06MY2_A4036CCTDsc ;
   private String[] P06MY2_A457FasCod ;
   private String[] P06MY3_A396EmprCod ;
   private int[] P06MY3_A129BarCod ;
   private byte[] P06MY3_A132BarCodReo ;
   private String[] P06MY3_A130BarCodPar ;
   private String[] P06MY3_A758ProCod ;
   private short[] P06MY3_A194BarOrdLin ;
   private int[] P06MY3_A4031CCTCod ;
   private String[] P06MY3_A4035CCVal ;
   private String[] P06MY3_A4043CCTLinDsc ;
   private short[] P06MY3_A4034CCTLin ;
}

final  class rccreateo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06MY2", "SELECT T1.EmprCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CCTCod, T2.BarColNum, T2.BarColNom, T2.BarSer, T2.CliCod, T1.CCFch, T1.CCOpeCod, T4.CCTDsc, T3.FasCod FROM (((TXPCC T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPBARFAS T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.ProCod = T1.ProCod AND T3.BarOrdLin = T1.BarOrdLin) INNER JOIN TXPCCDef T4 ON T4.EmprCod = T1.EmprCod AND T4.CCTCod = T1.CCTCod) WHERE (T1.EmprCod = ?) AND (T1.BarCod >= ? or ( (? = 0))) AND (T1.BarCod <= ? or ( (? = 0))) AND (T1.BarCodReo >= ? or ( (? = 0))) AND (T1.BarCodReo <= ? or ( (? = 0))) AND (T1.BarCodPar >= ? or ( (rtrim(?) IS NULL))) AND (T1.BarCodPar <= ? or ( (rtrim(?) IS NULL))) AND (T1.CCTCod >= ? or ( (? = 0))) AND (T1.CCTCod <= ? or ( (? = 0))) AND (T1.CCFch >= ? or ( (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))) AND (T1.CCFch <= ? or ( (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))) AND (T2.CliCod >= ? or ( (? = 0))) AND (T2.CliCod <= ? or ( (? = 0))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06MY3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCVal, T2.CCTLinDsc, T1.CCTLin FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ?) AND (RTRIM(LTRIM(T1.CCVal)) >= ? or ( (rtrim(?) IS NULL))) AND (RTRIM(LTRIM(T1.CCVal)) <= ? or ( (rtrim(?) IS NULL))) AND (? >= ? or ( (? = 0))) AND (? <= ? or ( (? = 0))) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
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
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((short[]) buf[9])[0] = rslt.getShort(10);
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
               stmt.setDate(18, (java.util.Date)parms[17]);
               stmt.setDate(19, (java.util.Date)parms[18]);
               stmt.setDate(20, (java.util.Date)parms[19]);
               stmt.setDate(21, (java.util.Date)parms[20]);
               stmt.setInt(22, ((Number) parms[21]).intValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setInt(25, ((Number) parms[24]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[12]).intValue());
               }
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setInt(14, ((Number) parms[14]).intValue());
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[16]).intValue());
               }
               stmt.setInt(16, ((Number) parms[17]).intValue());
               stmt.setInt(17, ((Number) parms[18]).intValue());
               return;
      }
   }

}

