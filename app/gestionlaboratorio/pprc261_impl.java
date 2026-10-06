package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pprc261_impl extends GXWebReport
{
   public pprc261_impl( com.genexus.internet.HttpContext context )
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
         AV17EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV10Lb_rb = CommonUtil.decimalVal( httpContext.GetPar( "Lb_rb"), ".") ;
            AV12Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
            AV13Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
            AV10Lb_rb = CommonUtil.decimalVal( httpContext.GetPar( "Lb_rb"), ".") ;
            AV16Workstat = httpContext.GetPar( "Workstat") ;
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
         Gx_out = "FIL" ;
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
         GXt_int1 = AV14ConversionLbvsKgs ;
         GXv_int2[0] = GXt_int1 ;
         new app.pbuscon(remoteHandle, context).execute( AV17EmprCod, httpContext.getMessage( "LBVSKG", ""), GXv_int2) ;
         pprc261_impl.this.GXt_int1 = GXv_int2[0] ;
         AV14ConversionLbvsKgs = (byte)(GXt_int1) ;
         AV15lbvsKgs = ((AV14ConversionLbvsKgs==0) ? DecimalUtil.doubleToDec(1) : DecimalUtil.doubleToDec(AV14ConversionLbvsKgs/ (double) (10000))) ;
         /* Using cursor P09P02 */
         pr_default.execute(0, new Object[] {AV17EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P09P02_A396EmprCod[0] ;
            A407EmprNom = P09P02_A407EmprNom[0] ;
            n407EmprNom = P09P02_n407EmprNom[0] ;
            AV8EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV9Lastproceso = "" ;
         /* Using cursor P09P03 */
         pr_default.execute(1, new Object[] {AV17EmprCod, AV16Workstat});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A490ForPrdUMe = P09P03_A490ForPrdUMe[0] ;
            A910Workstat = P09P03_A910Workstat[0] ;
            A396EmprCod = P09P03_A396EmprCod[0] ;
            A764ProForCod = P09P03_A764ProForCod[0] ;
            A766ProForDsc = P09P03_A766ProForDsc[0] ;
            A891EscMCos = P09P03_A891EscMCos[0] ;
            A889EscMPrdPre = P09P03_A889EscMPrdPre[0] ;
            A10363EscMCant = P09P03_A10363EscMCant[0] ;
            A488ForPrdDsc = P09P03_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P09P03_n488ForPrdDsc[0] ;
            A4712EscMFacCon = P09P03_A4712EscMFacCon[0] ;
            A718PrdNom = P09P03_A718PrdNom[0] ;
            A719PrdNum = P09P03_A719PrdNum[0] ;
            A887EscMLin = P09P03_A887EscMLin[0] ;
            A488ForPrdDsc = P09P03_A488ForPrdDsc[0] ;
            n488ForPrdDsc = P09P03_n488ForPrdDsc[0] ;
            A766ProForDsc = P09P03_A766ProForDsc[0] ;
            A718PrdNom = P09P03_A718PrdNom[0] ;
            if ( GXutil.strcmp(AV9Lastproceso, A764ProForCod) != 0 )
            {
               h9P00( false, 47) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 88, Gx_line+17, 133, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 139, Gx_line+17, 359, Gx_line+34, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Proceso", ""), 29, Gx_line+17, 81, Gx_line+34, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+47) ;
               h9P00( false, 22) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 29, Gx_line+0, 88, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 95, Gx_line+0, 176, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 335, Gx_line+0, 380, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 459, Gx_line+0, 518, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Precio", ""), 591, Gx_line+0, 636, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Coste", ""), 722, Gx_line+0, 759, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(292, Gx_line+17, 380, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(438, Gx_line+17, 518, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(532, Gx_line+17, 634, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(656, Gx_line+17, 765, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(95, Gx_line+17, 285, Gx_line+17, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(29, Gx_line+17, 87, Gx_line+17, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
            }
            h9P00( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 29, Gx_line+0, 74, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 95, Gx_line+0, 286, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4712EscMFacCon, "ZZZZZ9.99999")), 292, Gx_line+0, 381, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), 386, Gx_line+0, 423, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A10363EscMCant, "ZZZZZZ9.999")), 438, Gx_line+0, 519, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A889EscMPrdPre, "ZZZZZZZ9.999")), 532, Gx_line+0, 635, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A891EscMCos, "ZZZZZZZZ9.99999")), 649, Gx_line+0, 759, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV11Totcost = AV11Totcost.add(A891EscMCos) ;
            AV9Lastproceso = A764ProForCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV11Totcost = ((0==AV14ConversionLbvsKgs) ? AV11Totcost : AV11Totcost.divide(AV15lbvsKgs, 18, java.math.RoundingMode.DOWN)) ;
         h9P00( false, 34) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV11Totcost, "ZZZZZZZZ9.99999")), 649, Gx_line+17, 759, Gx_line+34, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+34) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h9P00( true, 0) ;
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

   public void h9P00( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 707, Gx_line+0, 766, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 642, Gx_line+0, 701, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora", ""), 576, Gx_line+0, 635, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 642, Gx_line+33, 687, Gx_line+50, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 576, Gx_line+33, 621, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{pages}}", ""), 693, Gx_line+33, 760, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8EmprNom, "")), 22, Gx_line+0, 242, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Pgmdesc, "")), 22, Gx_line+33, 242, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+66, 774, Gx_line+66, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 693, Gx_line+75, 709, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV10Lb_rb, "ZZZ9.99")), 715, Gx_line+75, 767, Gx_line+92, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Ensayo:", ""), 44, Gx_line+75, 118, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12Lb_numero), "ZZZZZZZ9")), 124, Gx_line+75, 183, Gx_line+92, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Opcion:", ""), 204, Gx_line+75, 256, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Lb_opcion, "@!")), 263, Gx_line+75, 271, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+100, 774, Gx_line+100, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Workstat, "")), 292, Gx_line+33, 366, Gx_line+50, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+104) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV17EmprCod = "" ;
      AV10Lb_rb = DecimalUtil.ZERO ;
      AV13Lb_opcion = "" ;
      AV16Workstat = "" ;
      GXv_int2 = new int[1] ;
      AV15lbvsKgs = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P09P02_A396EmprCod = new String[] {""} ;
      P09P02_A407EmprNom = new String[] {""} ;
      P09P02_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV8EmprNom = "" ;
      AV9Lastproceso = "" ;
      P09P03_A490ForPrdUMe = new byte[1] ;
      P09P03_A910Workstat = new String[] {""} ;
      P09P03_A396EmprCod = new String[] {""} ;
      P09P03_A764ProForCod = new String[] {""} ;
      P09P03_A766ProForDsc = new String[] {""} ;
      P09P03_A891EscMCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09P03_A889EscMPrdPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09P03_A10363EscMCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09P03_A488ForPrdDsc = new String[] {""} ;
      P09P03_n488ForPrdDsc = new boolean[] {false} ;
      P09P03_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09P03_A718PrdNom = new String[] {""} ;
      P09P03_A719PrdNum = new String[] {""} ;
      P09P03_A887EscMLin = new int[1] ;
      A910Workstat = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A891EscMCos = DecimalUtil.ZERO ;
      A889EscMPrdPre = DecimalUtil.ZERO ;
      A10363EscMCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      AV11Totcost = DecimalUtil.ZERO ;
      Gx_time = "" ;
      Gx_date = GXutil.nullDate() ;
      AV24Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pprc261__default(),
         new Object[] {
             new Object[] {
            P09P02_A396EmprCod, P09P02_A407EmprNom, P09P02_n407EmprNom
            }
            , new Object[] {
            P09P03_A490ForPrdUMe, P09P03_A910Workstat, P09P03_A396EmprCod, P09P03_A764ProForCod, P09P03_A766ProForDsc, P09P03_A891EscMCos, P09P03_A889EscMPrdPre, P09P03_A10363EscMCant, P09P03_A488ForPrdDsc, P09P03_n488ForPrdDsc,
            P09P03_A4712EscMFacCon, P09P03_A718PrdNom, P09P03_A719PrdNum, P09P03_A887EscMLin
            }
         }
      );
      AV24Pgmdesc = httpContext.getMessage( "Lab Dip Detalle Costes", "") ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV24Pgmdesc = httpContext.getMessage( "Lab Dip Detalle Costes", "") ;
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV14ConversionLbvsKgs ;
   private byte A490ForPrdUMe ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV12Lb_numero ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int A887EscMLin ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV10Lb_rb ;
   private java.math.BigDecimal AV15lbvsKgs ;
   private java.math.BigDecimal A891EscMCos ;
   private java.math.BigDecimal A889EscMPrdPre ;
   private java.math.BigDecimal A10363EscMCant ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private java.math.BigDecimal AV11Totcost ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV17EmprCod ;
   private String AV13Lb_opcion ;
   private String AV16Workstat ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV8EmprNom ;
   private String AV9Lastproceso ;
   private String A910Workstat ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A488ForPrdDsc ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String Gx_time ;
   private String AV24Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n488ForPrdDsc ;
   private IDataStoreProvider pr_default ;
   private String[] P09P02_A396EmprCod ;
   private String[] P09P02_A407EmprNom ;
   private boolean[] P09P02_n407EmprNom ;
   private byte[] P09P03_A490ForPrdUMe ;
   private String[] P09P03_A910Workstat ;
   private String[] P09P03_A396EmprCod ;
   private String[] P09P03_A764ProForCod ;
   private String[] P09P03_A766ProForDsc ;
   private java.math.BigDecimal[] P09P03_A891EscMCos ;
   private java.math.BigDecimal[] P09P03_A889EscMPrdPre ;
   private java.math.BigDecimal[] P09P03_A10363EscMCant ;
   private String[] P09P03_A488ForPrdDsc ;
   private boolean[] P09P03_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09P03_A4712EscMFacCon ;
   private String[] P09P03_A718PrdNom ;
   private String[] P09P03_A719PrdNum ;
   private int[] P09P03_A887EscMLin ;
}

final  class pprc261__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09P02", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09P03", "SELECT T1.ForPrdUMe, T1.Workstat, T1.EmprCod, T1.ProForCod, T3.ProForDsc, T1.EscMCos, T1.EscMPrdPre, T1.EscMCant, T2.ForPrdDsc, T1.EscMFacCon, T4.PrdNom, T1.PrdNum, T1.EscMLin FROM (((TXPESCMAN T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPCPROFO T3 ON T3.EmprCod = T1.EmprCod AND T3.ProForCod = T1.ProForCod) INNER JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.Workstat = ? ORDER BY T1.EmprCod, T1.Workstat, T1.EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               ((int[]) buf[13])[0] = rslt.getInt(13);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

