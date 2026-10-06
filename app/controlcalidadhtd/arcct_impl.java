package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class arcct_impl extends GXWebReport
{
   public arcct_impl( com.genexus.internet.HttpContext context )
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
            AV11CCTIni = (int)(GXutil.lval( httpContext.GetPar( "CCTIni"))) ;
            AV10CCTFin = (int)(GXutil.lval( httpContext.GetPar( "CCTFin"))) ;
            AV28Det = httpContext.GetPar( "Det") ;
            AV29Tipo = httpContext.GetPar( "Tipo") ;
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
         /* Using cursor P06MZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11CCTIni), Integer.valueOf(AV11CCTIni), Integer.valueOf(AV10CCTFin), Integer.valueOf(AV10CCTFin), AV29Tipo, AV29Tipo});
         while ( (pr_default.getStatus(0) != 101) )
         {
            brk6MZ3 = false ;
            A4031CCTCod = P06MZ2_A4031CCTCod[0] ;
            A4037CCTTpoCtr = P06MZ2_A4037CCTTpoCtr[0] ;
            A4044CCTLinTpoD = P06MZ2_A4044CCTLinTpoD[0] ;
            A4048CCTLinTpoI = P06MZ2_A4048CCTLinTpoI[0] ;
            A4047CCTLinVarW = P06MZ2_A4047CCTLinVarW[0] ;
            A4046CCTLinPict = P06MZ2_A4046CCTLinPict[0] ;
            A4045CCTLinLgoD = P06MZ2_A4045CCTLinLgoD[0] ;
            A4043CCTLinDsc = P06MZ2_A4043CCTLinDsc[0] ;
            A4034CCTLin = P06MZ2_A4034CCTLin[0] ;
            A4042CCTObs = P06MZ2_A4042CCTObs[0] ;
            A4407CCTIniFas = P06MZ2_A4407CCTIniFas[0] ;
            A4040CCTSto = P06MZ2_A4040CCTSto[0] ;
            A4406CCTFinFas = P06MZ2_A4406CCTFinFas[0] ;
            A4036CCTDsc = P06MZ2_A4036CCTDsc[0] ;
            A4041CCTArc = P06MZ2_A4041CCTArc[0] ;
            A4037CCTTpoCtr = P06MZ2_A4037CCTTpoCtr[0] ;
            A4042CCTObs = P06MZ2_A4042CCTObs[0] ;
            A4407CCTIniFas = P06MZ2_A4407CCTIniFas[0] ;
            A4040CCTSto = P06MZ2_A4040CCTSto[0] ;
            A4406CCTFinFas = P06MZ2_A4406CCTFinFas[0] ;
            A4036CCTDsc = P06MZ2_A4036CCTDsc[0] ;
            A4041CCTArc = P06MZ2_A4041CCTArc[0] ;
            h6MZ0( false, 45) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4041CCTArc, "@!")), 296, Gx_line+0, 504, Gx_line+16, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")), 8, Gx_line+0, 53, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), 56, Gx_line+0, 247, Gx_line+16, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4406CCTFinFas, "@!")), 548, Gx_line+0, 562, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4040CCTSto, "@!")), 623, Gx_line+0, 637, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4407CCTIniFas, "@!")), 585, Gx_line+0, 599, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4042CCTObs, "@!")), 657, Gx_line+0, 671, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4037CCTTpoCtr, "")), 704, Gx_line+0, 718, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Variable", ""), 69, Gx_line+21, 125, Gx_line+39, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 294, Gx_line+21, 322, Gx_line+39, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+40, 793, Gx_line+40, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lgo", ""), 378, Gx_line+21, 403, Gx_line+39, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Máscara", ""), 405, Gx_line+21, 463, Gx_line+39, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ingreso", ""), 556, Gx_line+21, 609, Gx_line+39, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Variable Word", ""), 648, Gx_line+21, 745, Gx_line+39, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+45) ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P06MZ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06MZ2_A4031CCTCod[0] == A4031CCTCod ) && ( P06MZ2_A4034CCTLin[0] == A4034CCTLin ) )
            {
               brk6MZ3 = false ;
               A4037CCTTpoCtr = P06MZ2_A4037CCTTpoCtr[0] ;
               A4044CCTLinTpoD = P06MZ2_A4044CCTLinTpoD[0] ;
               A4048CCTLinTpoI = P06MZ2_A4048CCTLinTpoI[0] ;
               A4047CCTLinVarW = P06MZ2_A4047CCTLinVarW[0] ;
               A4046CCTLinPict = P06MZ2_A4046CCTLinPict[0] ;
               A4045CCTLinLgoD = P06MZ2_A4045CCTLinLgoD[0] ;
               A4043CCTLinDsc = P06MZ2_A4043CCTLinDsc[0] ;
               A4037CCTTpoCtr = P06MZ2_A4037CCTTpoCtr[0] ;
               if ( ( A4031CCTCod >= AV11CCTIni ) || (0==AV11CCTIni) )
               {
                  if ( ( A4031CCTCod <= AV10CCTFin ) || (0==AV10CCTFin) )
                  {
                     if ( ( GXutil.strcmp(A4037CCTTpoCtr, AV29Tipo) == 0 ) || (GXutil.strcmp("", AV29Tipo)==0) )
                     {
                        if ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "C", "")) == 0 )
                        {
                           AV34TpoDat = httpContext.getMessage( "Caractér", "") ;
                        }
                        else if ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "F", "")) == 0 )
                        {
                           AV34TpoDat = httpContext.getMessage( "Fecha", "") ;
                        }
                        else if ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "H", "")) == 0 )
                        {
                           AV34TpoDat = httpContext.getMessage( "Hora", "") ;
                        }
                        else if ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "N", "")) == 0 )
                        {
                           AV34TpoDat = httpContext.getMessage( "Numérico", "") ;
                        }
                        else
                        {
                           AV34TpoDat = httpContext.getMessage( "Desconocido", "") ;
                        }
                        if ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "R", "")) == 0 )
                        {
                           AV35TpoIng = httpContext.getMessage( "Rango", "") ;
                        }
                        else if ( GXutil.strcmp(A4048CCTLinTpoI, httpContext.getMessage( "L", "")) == 0 )
                        {
                           AV35TpoIng = httpContext.getMessage( "Lista", "") ;
                        }
                        else
                        {
                           AV35TpoIng = httpContext.getMessage( "Desconocido", "") ;
                        }
                        h6MZ0( false, 22) ;
                        getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4034CCTLin), "ZZZ9")), 35, Gx_line+0, 64, Gx_line+17, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4043CCTLinDsc, "")), 69, Gx_line+0, 291, Gx_line+17, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4045CCTLinLgoD), "ZZ9")), 379, Gx_line+0, 402, Gx_line+18, 2+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4046CCTLinPict, "")), 405, Gx_line+0, 553, Gx_line+17, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TpoDat, "")), 294, Gx_line+0, 376, Gx_line+17, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TpoIng, "")), 556, Gx_line+0, 644, Gx_line+17, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4047CCTLinVarW, "@!")), 648, Gx_line+0, 793, Gx_line+17, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+22) ;
                        /* Using cursor P06MZ3 */
                        pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), A4037CCTTpoCtr, AV29Tipo, AV29Tipo});
                        while ( (pr_default.getStatus(1) != 101) )
                        {
                           A4049CCTValLin = P06MZ3_A4049CCTValLin[0] ;
                           A4050CCTValDsc = P06MZ3_A4050CCTValDsc[0] ;
                           A4051CCTVal = P06MZ3_A4051CCTVal[0] ;
                           h6MZ0( false, 20) ;
                           getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4051CCTVal, "")), 457, Gx_line+0, 708, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4050CCTValDsc, "")), 232, Gx_line+0, 421, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4049CCTValLin), "Z9")), 211, Gx_line+0, 227, Gx_line+18, 2+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+20) ;
                           pr_default.readNext(1);
                        }
                        pr_default.close(1);
                     }
                  }
               }
               brk6MZ3 = true ;
               pr_default.readNext(0);
            }
            h6MZ0( false, 4) ;
            getPrinter().GxDrawLine(0, Gx_line+1, 793, Gx_line+1, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+4) ;
            if ( ! brk6MZ3 )
            {
               brk6MZ3 = true ;
               pr_default.readNext(0);
            }
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6MZ0( true, 0) ;
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

   public void h6MZ0( boolean bFoot ,
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
            getPrinter().GxDrawText(httpContext.getMessage( "Controles de Calidad Tipo", ""), 313, Gx_line+57, 483, Gx_line+75, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+65, 302, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(491, Gx_line+65, 793, Gx_line+65, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fecha:", ""), 621, Gx_line+1, 666, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 722, Gx_line+0, 777, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 621, Gx_line+17, 660, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 676, Gx_line+16, 777, Gx_line+34, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 621, Gx_line+32, 672, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 676, Gx_line+31, 712, Gx_line+48, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 718, Gx_line+31, 736, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 740, Gx_line+31, 776, Gx_line+48, 2, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+76) ;
            if ( ! ( (0==AV11CCTIni) && (0==AV10CCTFin) && (GXutil.strcmp("", AV29Tipo)==0) ) )
            {
               getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Filtros", ""), 376, Gx_line+0, 418, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+7, 373, Gx_line+7, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(420, Gx_line+7, 793, Gx_line+7, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               if ( ! ( (0==AV11CCTIni) && (0==AV10CCTFin) ) )
               {
                  getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Control de Calidad", ""), 147, Gx_line+0, 270, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  if ( ! ( (0==AV11CCTIni) ) )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Inicial", ""), 303, Gx_line+0, 343, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Tahoma", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11CCTIni), "ZZZZZ9")), 355, Gx_line+0, 400, Gx_line+18, 2+256, 0, 0, 0) ;
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
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10CCTFin), "ZZZZZ9")), 532, Gx_line+0, 577, Gx_line+18, 2+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  else
                  {
                     Gx_line = (int)(Gx_line+16) ;
                  }
               }
               if ( ! ( (GXutil.strcmp("", AV29Tipo)==0) ) )
               {
                  if ( GXutil.strcmp(AV29Tipo, httpContext.getMessage( "I", "")) == 0 )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Internos", ""), 147, Gx_line+0, 206, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  else if ( GXutil.strcmp(AV29Tipo, httpContext.getMessage( "E", "")) == 0 )
                  {
                     getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Externos", ""), 147, Gx_line+0, 207, Gx_line+18, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
               }
            }
            getPrinter().GxAttris("Tahoma", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Control", ""), 54, Gx_line+19, 104, Gx_line+37, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Archivo", ""), 304, Gx_line+19, 357, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+38, 793, Gx_line+38, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "FinF ", ""), 543, Gx_line+19, 572, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "IniF", ""), 575, Gx_line+19, 599, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "P.P.", ""), 617, Gx_line+19, 643, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Obs", ""), 652, Gx_line+19, 678, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Int/Ext", ""), 688, Gx_line+19, 738, Gx_line+37, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+44) ;
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
      AV28Det = "" ;
      AV29Tipo = "" ;
      scmdbuf = "" ;
      P06MZ2_A396EmprCod = new String[] {""} ;
      P06MZ2_A4031CCTCod = new int[1] ;
      P06MZ2_A4037CCTTpoCtr = new String[] {""} ;
      P06MZ2_A4044CCTLinTpoD = new String[] {""} ;
      P06MZ2_A4048CCTLinTpoI = new String[] {""} ;
      P06MZ2_A4047CCTLinVarW = new String[] {""} ;
      P06MZ2_A4046CCTLinPict = new String[] {""} ;
      P06MZ2_A4045CCTLinLgoD = new short[1] ;
      P06MZ2_A4043CCTLinDsc = new String[] {""} ;
      P06MZ2_A4034CCTLin = new short[1] ;
      P06MZ2_A4042CCTObs = new String[] {""} ;
      P06MZ2_A4407CCTIniFas = new String[] {""} ;
      P06MZ2_A4040CCTSto = new String[] {""} ;
      P06MZ2_A4406CCTFinFas = new String[] {""} ;
      P06MZ2_A4036CCTDsc = new String[] {""} ;
      P06MZ2_A4041CCTArc = new String[] {""} ;
      A4037CCTTpoCtr = "" ;
      A4044CCTLinTpoD = "" ;
      A4048CCTLinTpoI = "" ;
      A4047CCTLinVarW = "" ;
      A4046CCTLinPict = "" ;
      A4043CCTLinDsc = "" ;
      A4042CCTObs = "" ;
      A4407CCTIniFas = "" ;
      A4040CCTSto = "" ;
      A4406CCTFinFas = "" ;
      A4036CCTDsc = "" ;
      A4041CCTArc = "" ;
      AV34TpoDat = "" ;
      AV35TpoIng = "" ;
      P06MZ3_A396EmprCod = new String[] {""} ;
      P06MZ3_A4031CCTCod = new int[1] ;
      P06MZ3_A4034CCTLin = new short[1] ;
      P06MZ3_A4049CCTValLin = new byte[1] ;
      P06MZ3_A4050CCTValDsc = new String[] {""} ;
      P06MZ3_A4051CCTVal = new String[] {""} ;
      A4050CCTValDsc = "" ;
      A4051CCTVal = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.arcct__default(),
         new Object[] {
             new Object[] {
            P06MZ2_A396EmprCod, P06MZ2_A4031CCTCod, P06MZ2_A4037CCTTpoCtr, P06MZ2_A4044CCTLinTpoD, P06MZ2_A4048CCTLinTpoI, P06MZ2_A4047CCTLinVarW, P06MZ2_A4046CCTLinPict, P06MZ2_A4045CCTLinLgoD, P06MZ2_A4043CCTLinDsc, P06MZ2_A4034CCTLin,
            P06MZ2_A4042CCTObs, P06MZ2_A4407CCTIniFas, P06MZ2_A4040CCTSto, P06MZ2_A4406CCTFinFas, P06MZ2_A4036CCTDsc, P06MZ2_A4041CCTArc
            }
            , new Object[] {
            P06MZ3_A396EmprCod, P06MZ3_A4031CCTCod, P06MZ3_A4034CCTLin, P06MZ3_A4049CCTValLin, P06MZ3_A4050CCTValDsc, P06MZ3_A4051CCTVal
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

   private byte A4049CCTValLin ;
   private short gxcookieaux ;
   private short A4045CCTLinLgoD ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int AV11CCTIni ;
   private int AV10CCTFin ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A4031CCTCod ;
   private int Gx_OldLine ;
   private long AV31Tot ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV28Det ;
   private String AV29Tipo ;
   private String scmdbuf ;
   private String A4037CCTTpoCtr ;
   private String A4044CCTLinTpoD ;
   private String A4048CCTLinTpoI ;
   private String A4047CCTLinVarW ;
   private String A4046CCTLinPict ;
   private String A4043CCTLinDsc ;
   private String A4042CCTObs ;
   private String A4407CCTIniFas ;
   private String A4040CCTSto ;
   private String A4406CCTFinFas ;
   private String A4036CCTDsc ;
   private String A4041CCTArc ;
   private String AV34TpoDat ;
   private String AV35TpoIng ;
   private String A4050CCTValDsc ;
   private String A4051CCTVal ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean brk6MZ3 ;
   private IDataStoreProvider pr_default ;
   private String[] P06MZ2_A396EmprCod ;
   private int[] P06MZ2_A4031CCTCod ;
   private String[] P06MZ2_A4037CCTTpoCtr ;
   private String[] P06MZ2_A4044CCTLinTpoD ;
   private String[] P06MZ2_A4048CCTLinTpoI ;
   private String[] P06MZ2_A4047CCTLinVarW ;
   private String[] P06MZ2_A4046CCTLinPict ;
   private short[] P06MZ2_A4045CCTLinLgoD ;
   private String[] P06MZ2_A4043CCTLinDsc ;
   private short[] P06MZ2_A4034CCTLin ;
   private String[] P06MZ2_A4042CCTObs ;
   private String[] P06MZ2_A4407CCTIniFas ;
   private String[] P06MZ2_A4040CCTSto ;
   private String[] P06MZ2_A4406CCTFinFas ;
   private String[] P06MZ2_A4036CCTDsc ;
   private String[] P06MZ2_A4041CCTArc ;
   private String[] P06MZ3_A396EmprCod ;
   private int[] P06MZ3_A4031CCTCod ;
   private short[] P06MZ3_A4034CCTLin ;
   private byte[] P06MZ3_A4049CCTValLin ;
   private String[] P06MZ3_A4050CCTValDsc ;
   private String[] P06MZ3_A4051CCTVal ;
}

final  class arcct__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06MZ2", "SELECT T1.EmprCod, T1.CCTCod, T2.CCTTpoCtr, T1.CCTLinTpoD, T1.CCTLinTpoI, T1.CCTLinVarW, T1.CCTLinPict, T1.CCTLinLgoD, T1.CCTLinDsc, T1.CCTLin, T2.CCTObs, T2.CCTIniFas, T2.CCTSto, T2.CCTFinFas, T2.CCTDsc, T2.CCTArc FROM (TXPCCDef1 T1 INNER JOIN TXPCCDef T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod) WHERE (T1.EmprCod = ?) AND (T1.CCTCod >= ? or (? = 0)) AND (T1.CCTCod <= ? or (? = 0)) AND (T2.CCTTpoCtr = ? or (rtrim(?) IS NULL)) ORDER BY T1.EmprCod, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06MZ3", "SELECT EmprCod, CCTCod, CCTLin, CCTValLin, CCTValDsc, CCTVal FROM TXPCCDef2 WHERE (EmprCod = ? and CCTCod = ? and CCTLin = ?) AND (? = ? or (rtrim(?) IS NULL)) ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 32);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((String[]) buf[15])[0] = rslt.getString(16, 128);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
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
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

