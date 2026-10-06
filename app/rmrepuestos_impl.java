package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rmrepuestos_impl extends GXWebReport
{
   public rmrepuestos_impl( com.genexus.internet.HttpContext context )
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
            AV8MRCod = (int)(GXutil.lval( httpContext.GetPar( "MRCod"))) ;
            AV9MRNom = httpContext.GetPar( "MRNom") ;
            AV15Tipo = httpContext.GetPar( "Tipo") ;
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
      M_top = 1 ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         AV10Lit0 = AV21Pgmdesc ;
         GXt_char1 = AV11Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rmrepuestos_impl.this.GXt_char1 = GXv_char2[0] ;
         AV11Lit1 = GXt_char1 ;
         GXt_char1 = AV12Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rmrepuestos_impl.this.GXt_char1 = GXv_char2[0] ;
         AV12Lit2 = GXt_char1 ;
         GXt_char1 = AV13Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rmrepuestos_impl.this.GXt_char1 = GXv_char2[0] ;
         AV13Lit3 = GXt_char1 ;
         GxHdr3 = true ;
         lV9MRNom = GXutil.padr( GXutil.rtrim( AV9MRNom), 100, "%") ;
         /* Using cursor P07IA2 */
         pr_default.execute(0, new Object[] {A396EmprCod, lV9MRNom, Integer.valueOf(AV8MRCod), Integer.valueOf(AV8MRCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A9492MRCod = P07IA2_A9492MRCod[0] ;
            A9494MRCodExt = P07IA2_A9494MRCodExt[0] ;
            n9494MRCodExt = P07IA2_n9494MRCodExt[0] ;
            A9493MRNom = P07IA2_A9493MRNom[0] ;
            n9493MRNom = P07IA2_n9493MRNom[0] ;
            A9496MRStkRes = P07IA2_A9496MRStkRes[0] ;
            n9496MRStkRes = P07IA2_n9496MRStkRes[0] ;
            A9499MRStkPre = P07IA2_A9499MRStkPre[0] ;
            n9499MRStkPre = P07IA2_n9499MRStkPre[0] ;
            A9497MRStkMin = P07IA2_A9497MRStkMin[0] ;
            n9497MRStkMin = P07IA2_n9497MRStkMin[0] ;
            A9498MRStkCri = P07IA2_A9498MRStkCri[0] ;
            n9498MRStkCri = P07IA2_n9498MRStkCri[0] ;
            A9495MRStkAct = P07IA2_A9495MRStkAct[0] ;
            n9495MRStkAct = P07IA2_n9495MRStkAct[0] ;
            /* Using cursor P07IA3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A795PrvNum = P07IA3_A795PrvNum[0] ;
               A11056MRPrvHab = P07IA3_A11056MRPrvHab[0] ;
               A794PrvNom = P07IA3_A794PrvNom[0] ;
               n794PrvNom = P07IA3_n794PrvNom[0] ;
               A794PrvNom = P07IA3_A794PrvNom[0] ;
               n794PrvNom = P07IA3_n794PrvNom[0] ;
               AV17PrvNom = A794PrvNom ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            h7IA0( false, 36) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9")), 14, Gx_line+0, 73, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9495MRStkAct, "Z,ZZZ,ZZZ9.999")), 567, Gx_line+0, 645, Gx_line+16, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9498MRStkCri, "Z,ZZZ,ZZZ9.999")), 483, Gx_line+0, 561, Gx_line+16, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9497MRStkMin, "Z,ZZZ,ZZZ9.999")), 399, Gx_line+0, 477, Gx_line+16, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9499MRStkPre, "ZZZZZZ9.999")), 734, Gx_line+0, 812, Gx_line+16, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9496MRStkRes, "Z,ZZZ,ZZZ9.999")), 651, Gx_line+0, 729, Gx_line+16, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9493MRNom, "")), 77, Gx_line+0, 393, Gx_line+16, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9494MRCodExt, "")), 77, Gx_line+18, 224, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17PrvNom, "")), 399, Gx_line+18, 619, Gx_line+35, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+36) ;
            AV16Flag = (byte)(0) ;
            GxHdr6 = true ;
            /* Using cursor P07IA4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A9505MRMovTpo = P07IA4_A9505MRMovTpo[0] ;
               A9509MRMovPre = P07IA4_A9509MRMovPre[0] ;
               A9503MRMovOrd = P07IA4_A9503MRMovOrd[0] ;
               A9507MRMovDsc = P07IA4_A9507MRMovDsc[0] ;
               A9508MRMovCnt = P07IA4_A9508MRMovCnt[0] ;
               A9502MRMov = P07IA4_A9502MRMov[0] ;
               A9504MRMovFch = P07IA4_A9504MRMovFch[0] ;
               if ( GXutil.strcmp(AV15Tipo, httpContext.getMessage( "D", "")) == 0 )
               {
                  if ( AV16Flag == 0 )
                  {
                     h7IA0( false, 46) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 392, Gx_line+26, 463, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 107, Gx_line+26, 144, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 253, Gx_line+26, 289, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 343, Gx_line+26, 370, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 659, Gx_line+26, 712, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 774, Gx_line+26, 813, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(734, Gx_line+40, 812, Gx_line+40, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(634, Gx_line+40, 712, Gx_line+40, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(311, Gx_line+40, 369, Gx_line+40, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(231, Gx_line+40, 289, Gx_line+40, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(107, Gx_line+40, 209, Gx_line+40, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(392, Gx_line+40, 611, Gx_line+40, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(14, Gx_line+40, 87, Gx_line+40, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Línea", ""), 51, Gx_line+26, 86, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Movimientos", ""), 361, Gx_line+3, 465, Gx_line+24, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+46) ;
                     AV16Flag = (byte)(1) ;
                  }
                  h7IA0( false, 19) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9502MRMov), "ZZZZZZZZZ9")), 14, Gx_line+0, 88, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9508MRMovCnt, "ZZZ,ZZ9.999")), 632, Gx_line+0, 713, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9507MRMovDsc, "")), 392, Gx_line+0, 612, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A9504MRMovFch, "99/99/99 99:99"), 107, Gx_line+0, 210, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9503MRMovOrd), "ZZZZZZZ9")), 231, Gx_line+0, 289, Gx_line+16, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9509MRMovPre, "ZZ,ZZZ,ZZ9.999")), 734, Gx_line+0, 812, Gx_line+16, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9505MRMovTpo), "ZZZZZZZ9")), 311, Gx_line+0, 370, Gx_line+17, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+19) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            GxHdr6 = false ;
            AV16Flag = (byte)(0) ;
            GxHdr8 = true ;
            /* Using cursor P07IA5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9492MRCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A9510MRRes = P07IA5_A9510MRRes[0] ;
               A9513MRResTpo = P07IA5_A9513MRResTpo[0] ;
               A9511MRResOrd = P07IA5_A9511MRResOrd[0] ;
               A9515MRResDsc = P07IA5_A9515MRResDsc[0] ;
               A9516MRResCnt = P07IA5_A9516MRResCnt[0] ;
               A9512MRResFch = P07IA5_A9512MRResFch[0] ;
               if ( GXutil.strcmp(AV15Tipo, httpContext.getMessage( "D", "")) == 0 )
               {
                  if ( AV16Flag == 0 )
                  {
                     h7IA0( false, 46) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 392, Gx_line+26, 463, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 107, Gx_line+26, 144, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 253, Gx_line+26, 289, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 343, Gx_line+26, 370, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 659, Gx_line+26, 712, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(634, Gx_line+40, 712, Gx_line+40, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(311, Gx_line+40, 369, Gx_line+40, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(231, Gx_line+40, 289, Gx_line+40, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(107, Gx_line+40, 209, Gx_line+40, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(392, Gx_line+40, 611, Gx_line+40, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(14, Gx_line+40, 87, Gx_line+40, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Línea", ""), 51, Gx_line+26, 86, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Reservas", ""), 361, Gx_line+3, 440, Gx_line+24, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+46) ;
                     AV16Flag = (byte)(1) ;
                  }
                  h7IA0( false, 19) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9516MRResCnt, "ZZZ,ZZ9.999")), 632, Gx_line+0, 713, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9515MRResDsc, "")), 392, Gx_line+0, 758, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A9512MRResFch, "99/99/99 99:99"), 107, Gx_line+0, 210, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9511MRResOrd), "ZZZZZZZ9")), 231, Gx_line+0, 290, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9513MRResTpo), "ZZZZZZZ9")), 311, Gx_line+0, 370, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9510MRRes), "ZZZZZZZZZ9")), 14, Gx_line+0, 88, Gx_line+17, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+19) ;
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            GxHdr8 = false ;
            if ( GXutil.strcmp(AV15Tipo, httpContext.getMessage( "D", "")) == 0 )
            {
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7IA0( true, 0) ;
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

   public void h7IA0( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit0, "")), 14, Gx_line+54, 181, Gx_line+74, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit1, "")), 528, Gx_line+15, 592, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 596, Gx_line+15, 647, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Lit2, "")), 650, Gx_line+15, 701, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 704, Gx_line+15, 797, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lit3, "")), 636, Gx_line+56, 712, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 718, Gx_line+56, 745, Gx_line+72, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14NomEmp, "")), 14, Gx_line+14, 234, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18Pgmname, "")), 528, Gx_line+56, 685, Gx_line+73, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+81, 813, Gx_line+81, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 749, Gx_line+56, 756, Gx_line+72, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 760, Gx_line+56, 787, Gx_line+72, 2, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+95) ;
            if ( GxHdr3 )
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Repuesto", ""), 77, Gx_line+0, 134, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Repuesto/Cod Externo", ""), 77, Gx_line+0, 212, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Mínimo", ""), 433, Gx_line+0, 477, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Crítico", ""), 521, Gx_line+0, 562, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Actual", ""), 606, Gx_line+0, 645, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Reservas", ""), 673, Gx_line+0, 729, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 774, Gx_line+0, 813, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(734, Gx_line+14, 812, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(651, Gx_line+14, 729, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(567, Gx_line+14, 645, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(483, Gx_line+14, 561, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(399, Gx_line+14, 477, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(77, Gx_line+14, 296, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+14, 72, Gx_line+14, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Código", ""), 30, Gx_line+0, 72, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(77, Gx_line+14, 393, Gx_line+14, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+26) ;
            }
            if ( GxHdr6 )
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 392, Gx_line+26, 463, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 107, Gx_line+26, 144, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 253, Gx_line+26, 289, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 343, Gx_line+26, 370, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 659, Gx_line+26, 712, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 774, Gx_line+26, 813, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(734, Gx_line+40, 812, Gx_line+40, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(634, Gx_line+40, 712, Gx_line+40, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(311, Gx_line+40, 369, Gx_line+40, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(231, Gx_line+40, 289, Gx_line+40, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(107, Gx_line+40, 209, Gx_line+40, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(392, Gx_line+40, 611, Gx_line+40, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+40, 87, Gx_line+40, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Línea", ""), 51, Gx_line+26, 86, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Movimientos", ""), 361, Gx_line+3, 465, Gx_line+24, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+46) ;
            }
            if ( GxHdr8 )
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 392, Gx_line+26, 463, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 107, Gx_line+26, 144, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 253, Gx_line+26, 289, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 343, Gx_line+26, 370, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 659, Gx_line+26, 712, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(634, Gx_line+40, 712, Gx_line+40, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(311, Gx_line+40, 369, Gx_line+40, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(231, Gx_line+40, 289, Gx_line+40, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(107, Gx_line+40, 209, Gx_line+40, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(392, Gx_line+40, 611, Gx_line+40, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(14, Gx_line+40, 87, Gx_line+40, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Línea", ""), 51, Gx_line+26, 86, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Reservas", ""), 361, Gx_line+3, 440, Gx_line+24, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+46) ;
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
      AV9MRNom = "" ;
      AV15Tipo = "" ;
      AV10Lit0 = "" ;
      AV21Pgmdesc = "" ;
      AV11Lit1 = "" ;
      AV12Lit2 = "" ;
      AV13Lit3 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      lV9MRNom = "" ;
      scmdbuf = "" ;
      P07IA2_A396EmprCod = new String[] {""} ;
      P07IA2_A9492MRCod = new int[1] ;
      P07IA2_A9494MRCodExt = new String[] {""} ;
      P07IA2_n9494MRCodExt = new boolean[] {false} ;
      P07IA2_A9493MRNom = new String[] {""} ;
      P07IA2_n9493MRNom = new boolean[] {false} ;
      P07IA2_A9496MRStkRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07IA2_n9496MRStkRes = new boolean[] {false} ;
      P07IA2_A9499MRStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07IA2_n9499MRStkPre = new boolean[] {false} ;
      P07IA2_A9497MRStkMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07IA2_n9497MRStkMin = new boolean[] {false} ;
      P07IA2_A9498MRStkCri = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07IA2_n9498MRStkCri = new boolean[] {false} ;
      P07IA2_A9495MRStkAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07IA2_n9495MRStkAct = new boolean[] {false} ;
      A9494MRCodExt = "" ;
      A9493MRNom = "" ;
      A9496MRStkRes = DecimalUtil.ZERO ;
      A9499MRStkPre = DecimalUtil.ZERO ;
      A9497MRStkMin = DecimalUtil.ZERO ;
      A9498MRStkCri = DecimalUtil.ZERO ;
      A9495MRStkAct = DecimalUtil.ZERO ;
      P07IA3_A795PrvNum = new int[1] ;
      P07IA3_A396EmprCod = new String[] {""} ;
      P07IA3_A9492MRCod = new int[1] ;
      P07IA3_A11056MRPrvHab = new byte[1] ;
      P07IA3_A794PrvNom = new String[] {""} ;
      P07IA3_n794PrvNom = new boolean[] {false} ;
      A794PrvNom = "" ;
      AV17PrvNom = "" ;
      P07IA4_A396EmprCod = new String[] {""} ;
      P07IA4_A9492MRCod = new int[1] ;
      P07IA4_A9505MRMovTpo = new int[1] ;
      P07IA4_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07IA4_A9503MRMovOrd = new int[1] ;
      P07IA4_A9507MRMovDsc = new String[] {""} ;
      P07IA4_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07IA4_A9502MRMov = new long[1] ;
      P07IA4_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      A9509MRMovPre = DecimalUtil.ZERO ;
      A9507MRMovDsc = "" ;
      A9508MRMovCnt = DecimalUtil.ZERO ;
      A9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      P07IA5_A396EmprCod = new String[] {""} ;
      P07IA5_A9492MRCod = new int[1] ;
      P07IA5_A9510MRRes = new long[1] ;
      P07IA5_A9513MRResTpo = new int[1] ;
      P07IA5_A9511MRResOrd = new int[1] ;
      P07IA5_A9515MRResDsc = new String[] {""} ;
      P07IA5_A9516MRResCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07IA5_A9512MRResFch = new java.util.Date[] {GXutil.nullDate()} ;
      A9515MRResDsc = "" ;
      A9516MRResCnt = DecimalUtil.ZERO ;
      A9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV14NomEmp = "" ;
      AV18Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rmrepuestos__default(),
         new Object[] {
             new Object[] {
            P07IA2_A396EmprCod, P07IA2_A9492MRCod, P07IA2_A9494MRCodExt, P07IA2_n9494MRCodExt, P07IA2_A9493MRNom, P07IA2_n9493MRNom, P07IA2_A9496MRStkRes, P07IA2_n9496MRStkRes, P07IA2_A9499MRStkPre, P07IA2_n9499MRStkPre,
            P07IA2_A9497MRStkMin, P07IA2_n9497MRStkMin, P07IA2_A9498MRStkCri, P07IA2_n9498MRStkCri, P07IA2_A9495MRStkAct, P07IA2_n9495MRStkAct
            }
            , new Object[] {
            P07IA3_A795PrvNum, P07IA3_A396EmprCod, P07IA3_A9492MRCod, P07IA3_A11056MRPrvHab, P07IA3_A794PrvNom, P07IA3_n794PrvNom
            }
            , new Object[] {
            P07IA4_A396EmprCod, P07IA4_A9492MRCod, P07IA4_A9505MRMovTpo, P07IA4_A9509MRMovPre, P07IA4_A9503MRMovOrd, P07IA4_A9507MRMovDsc, P07IA4_A9508MRMovCnt, P07IA4_A9502MRMov, P07IA4_A9504MRMovFch
            }
            , new Object[] {
            P07IA5_A396EmprCod, P07IA5_A9492MRCod, P07IA5_A9510MRRes, P07IA5_A9513MRResTpo, P07IA5_A9511MRResOrd, P07IA5_A9515MRResDsc, P07IA5_A9516MRResCnt, P07IA5_A9512MRResFch
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV21Pgmdesc = httpContext.getMessage( "Repuestos de Mantenimiento", "") ;
      AV18Pgmname = "RMRepuestos" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV21Pgmdesc = httpContext.getMessage( "Repuestos de Mantenimiento", "") ;
      Gx_err = (short)(0) ;
      AV18Pgmname = "RMRepuestos" ;
   }

   private byte A11056MRPrvHab ;
   private byte AV16Flag ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV8MRCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A9492MRCod ;
   private int A795PrvNum ;
   private int Gx_OldLine ;
   private int A9505MRMovTpo ;
   private int A9503MRMovOrd ;
   private int A9513MRResTpo ;
   private int A9511MRResOrd ;
   private long A9502MRMov ;
   private long A9510MRRes ;
   private java.math.BigDecimal A9496MRStkRes ;
   private java.math.BigDecimal A9499MRStkPre ;
   private java.math.BigDecimal A9497MRStkMin ;
   private java.math.BigDecimal A9498MRStkCri ;
   private java.math.BigDecimal A9495MRStkAct ;
   private java.math.BigDecimal A9509MRMovPre ;
   private java.math.BigDecimal A9508MRMovCnt ;
   private java.math.BigDecimal A9516MRResCnt ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV9MRNom ;
   private String AV15Tipo ;
   private String AV10Lit0 ;
   private String AV21Pgmdesc ;
   private String AV11Lit1 ;
   private String AV12Lit2 ;
   private String AV13Lit3 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String lV9MRNom ;
   private String scmdbuf ;
   private String A9494MRCodExt ;
   private String A9493MRNom ;
   private String A794PrvNom ;
   private String AV17PrvNom ;
   private String A9507MRMovDsc ;
   private String A9515MRResDsc ;
   private String Gx_time ;
   private String AV14NomEmp ;
   private String AV18Pgmname ;
   private java.util.Date A9504MRMovFch ;
   private java.util.Date A9512MRResFch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean GxHdr3 ;
   private boolean n9494MRCodExt ;
   private boolean n9493MRNom ;
   private boolean n9496MRStkRes ;
   private boolean n9499MRStkPre ;
   private boolean n9497MRStkMin ;
   private boolean n9498MRStkCri ;
   private boolean n9495MRStkAct ;
   private boolean n794PrvNom ;
   private boolean GxHdr6 ;
   private boolean GxHdr8 ;
   private IDataStoreProvider pr_default ;
   private String[] P07IA2_A396EmprCod ;
   private int[] P07IA2_A9492MRCod ;
   private String[] P07IA2_A9494MRCodExt ;
   private boolean[] P07IA2_n9494MRCodExt ;
   private String[] P07IA2_A9493MRNom ;
   private boolean[] P07IA2_n9493MRNom ;
   private java.math.BigDecimal[] P07IA2_A9496MRStkRes ;
   private boolean[] P07IA2_n9496MRStkRes ;
   private java.math.BigDecimal[] P07IA2_A9499MRStkPre ;
   private boolean[] P07IA2_n9499MRStkPre ;
   private java.math.BigDecimal[] P07IA2_A9497MRStkMin ;
   private boolean[] P07IA2_n9497MRStkMin ;
   private java.math.BigDecimal[] P07IA2_A9498MRStkCri ;
   private boolean[] P07IA2_n9498MRStkCri ;
   private java.math.BigDecimal[] P07IA2_A9495MRStkAct ;
   private boolean[] P07IA2_n9495MRStkAct ;
   private int[] P07IA3_A795PrvNum ;
   private String[] P07IA3_A396EmprCod ;
   private int[] P07IA3_A9492MRCod ;
   private byte[] P07IA3_A11056MRPrvHab ;
   private String[] P07IA3_A794PrvNom ;
   private boolean[] P07IA3_n794PrvNom ;
   private String[] P07IA4_A396EmprCod ;
   private int[] P07IA4_A9492MRCod ;
   private int[] P07IA4_A9505MRMovTpo ;
   private java.math.BigDecimal[] P07IA4_A9509MRMovPre ;
   private int[] P07IA4_A9503MRMovOrd ;
   private String[] P07IA4_A9507MRMovDsc ;
   private java.math.BigDecimal[] P07IA4_A9508MRMovCnt ;
   private long[] P07IA4_A9502MRMov ;
   private java.util.Date[] P07IA4_A9504MRMovFch ;
   private String[] P07IA5_A396EmprCod ;
   private int[] P07IA5_A9492MRCod ;
   private long[] P07IA5_A9510MRRes ;
   private int[] P07IA5_A9513MRResTpo ;
   private int[] P07IA5_A9511MRResOrd ;
   private String[] P07IA5_A9515MRResDsc ;
   private java.math.BigDecimal[] P07IA5_A9516MRResCnt ;
   private java.util.Date[] P07IA5_A9512MRResFch ;
}

final  class rmrepuestos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07IA2", "SELECT EmprCod, MRCod, MRCodExt, MRNom, MRStkRes, MRStkPre, MRStkMin, MRStkCri, MRStkAct FROM TXPMREPUE WHERE (EmprCod = ?) AND (MRNom like ?) AND (MRCod = ? or ? = 0) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07IA3", "SELECT T1.PrvNum, T1.EmprCod, T1.MRCod, T1.MRPrvHab, T2.PrvNom FROM (TXPMRepu1 T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE (T1.EmprCod = ? and T1.MRCod = ?) AND (T1.MRPrvHab = 1) ORDER BY T1.EmprCod, T1.MRCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07IA4", "SELECT EmprCod, MRCod, MRMovTpo, MRMovPre, MRMovOrd, MRMovDsc, MRMovCnt, MRMov, MRMovFch FROM TXPMReMov WHERE (EmprCod = ?) AND (MRCod = ?) ORDER BY MRMovFch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07IA5", "SELECT EmprCod, MRCod, MRRes, MRResTpo, MRResOrd, MRResDsc, MRResCnt, MRResFch FROM TXPMReRes WHERE (EmprCod = ?) AND (MRCod = ?) ORDER BY MRResFch ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 50);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
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
               stmt.setString(2, (String)parms[1], 100);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
      }
   }

}

