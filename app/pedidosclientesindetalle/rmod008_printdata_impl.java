package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rmod008_printdata_impl extends GXWebReport
{
   public rmod008_printdata_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "DataJSon") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV27DataJSon = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV19vPFecGen = localUtil.parseDateParm( httpContext.GetPar( "vPFecGen")) ;
            AV22vUFecGen = localUtil.parseDateParm( httpContext.GetPar( "vUFecGen")) ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
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
         AV23RMOD008_SDT.fromJSonString(AV27DataJSon, null);
         /* Using cursor P09XG2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P09XG2_A407EmprNom[0] ;
            n407EmprNom = P09XG2_n407EmprNom[0] ;
            A396EmprCod = P09XG2_A396EmprCod[0] ;
            AV10NomEmp = A407EmprNom ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( AV23RMOD008_SDT.size() > 0 )
         {
            AV34GXV1 = 1 ;
            while ( AV34GXV1 <= AV23RMOD008_SDT.size() )
            {
               AV24Item = (app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV23RMOD008_SDT.elementAt(-1+AV34GXV1));
               AV14Tot_A_k = AV14Tot_A_k.add((AV24Item.getgxTv_SdtRMOD008_SDT_Item_Saldo_k())) ;
               AV13Tot_a_a = AV13Tot_a_a.add((AV24Item.getgxTv_SdtRMOD008_SDT_Item_Tot_a())) ;
               AV16Tot_a_p = AV16Tot_a_p.add((AV24Item.getgxTv_SdtRMOD008_SDT_Item_Tot_p())) ;
               AV17Tot_a_t = AV17Tot_a_t.add((AV24Item.getgxTv_SdtRMOD008_SDT_Item_Tot_t())) ;
               AV18Tot_l = AV24Item.getgxTv_SdtRMOD008_SDT_Item_Tot_a().add(AV24Item.getgxTv_SdtRMOD008_SDT_Item_Tot_p()).add(AV24Item.getgxTv_SdtRMOD008_SDT_Item_Tot_t()).add(AV24Item.getgxTv_SdtRMOD008_SDT_Item_Saldo_k()) ;
               if ( AV18Tot_l.doubleValue() > 0 )
               {
                  h9XG0( false, 18) ;
                  getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( DecimalUtil.doubleToDec(AV24Item.getgxTv_SdtRMOD008_SDT_Item_Clicod()), "ZZZZZ9"), 27, Gx_line+0, 66, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(AV24Item.getgxTv_SdtRMOD008_SDT_Item_Clinom(), 80, Gx_line+0, 237, Gx_line+15, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV24Item.getgxTv_SdtRMOD008_SDT_Item_Saldo_k(), "ZZZZZZZZ9.99"), 340, Gx_line+0, 413, Gx_line+15, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV24Item.getgxTv_SdtRMOD008_SDT_Item_Tot_p(), "ZZZZZZZZZ9.99"), 460, Gx_line+0, 542, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV24Item.getgxTv_SdtRMOD008_SDT_Item_Tot_t(), "ZZZZZZZZZ9.99"), 587, Gx_line+0, 669, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV24Item.getgxTv_SdtRMOD008_SDT_Item_Tot_a(), "ZZZZZZZZZ9.99"), 733, Gx_line+0, 815, Gx_line+15, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV24Item.getgxTv_SdtRMOD008_SDT_Item_Tot_l(), "ZZZZZZZZZ9.99"), 860, Gx_line+0, 942, Gx_line+15, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               AV34GXV1 = (int)(AV34GXV1+1) ;
            }
            AV18Tot_l = AV13Tot_a_a.add(AV16Tot_a_p).add(AV17Tot_a_t).add(AV14Tot_A_k) ;
            if ( AV18Tot_l.doubleValue() > 0 )
            {
               h9XG0( false, 28) ;
               getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV14Tot_A_k, "ZZZ,ZZZ,ZZ9.99")), 329, Gx_line+14, 418, Gx_line+29, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV16Tot_a_p, "ZZ,ZZZ,ZZ9.99")), 459, Gx_line+14, 541, Gx_line+29, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Tot_a_t, "ZZ,ZZZ,ZZ9.99")), 588, Gx_line+14, 670, Gx_line+29, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV13Tot_a_a, "ZZ,ZZZ,ZZ9.99")), 735, Gx_line+14, 817, Gx_line+29, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Tot_l, "ZZ,ZZZ,ZZ9.99")), 860, Gx_line+14, 942, Gx_line+29, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+28) ;
            }
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h9XG0( true, 0) ;
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

   public void h9XG0( boolean bFoot ,
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
            getPrinter().GxDrawLine(6, Gx_line+88, 1074, Gx_line+88, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 831, Gx_line+4, 878, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 958, Gx_line+44, 997, Gx_line+59, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10NomEmp, "")), 9, Gx_line+1, 260, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 31, Gx_line+68, 73, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Desde", ""), 331, Gx_line+44, 368, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV19vPFecGen, "99/99/99"), 392, Gx_line+44, 439, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "hasta", ""), 475, Gx_line+44, 509, Gx_line+58, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV22vUFecGen, "99/99/99"), 518, Gx_line+44, 565, Gx_line+59, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Almacen", ""), 359, Gx_line+68, 411, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Preparado", ""), 479, Gx_line+68, 541, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tinte", ""), 639, Gx_line+68, 670, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Acabados", ""), 759, Gx_line+68, 817, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 911, Gx_line+68, 942, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Produccion en CURSO", ""), 13, Gx_line+41, 266, Gx_line+61, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(6, Gx_line+68, 1074, Gx_line+68, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 913, Gx_line+4, 997, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Tahoma", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 892, Gx_line+4, 899, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 913, Gx_line+44, 939, Gx_line+58, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+95) ;
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
      AV27DataJSon = "" ;
      AV19vPFecGen = GXutil.nullDate() ;
      AV22vUFecGen = GXutil.nullDate() ;
      AV23RMOD008_SDT = new GXBaseCollection<app.pedidosclientesindetalle.SdtRMOD008_SDT_Item>(app.pedidosclientesindetalle.SdtRMOD008_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P09XG2_A407EmprNom = new String[] {""} ;
      P09XG2_n407EmprNom = new boolean[] {false} ;
      P09XG2_A396EmprCod = new String[] {""} ;
      A407EmprNom = "" ;
      A396EmprCod = "" ;
      AV10NomEmp = "" ;
      AV24Item = new app.pedidosclientesindetalle.SdtRMOD008_SDT_Item(remoteHandle, context);
      AV14Tot_A_k = DecimalUtil.ZERO ;
      AV13Tot_a_a = DecimalUtil.ZERO ;
      AV16Tot_a_p = DecimalUtil.ZERO ;
      AV17Tot_a_t = DecimalUtil.ZERO ;
      AV18Tot_l = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.rmod008_printdata__default(),
         new Object[] {
             new Object[] {
            P09XG2_A407EmprNom, P09XG2_n407EmprNom, P09XG2_A396EmprCod
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

   private short gxcookieaux ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV34GXV1 ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV14Tot_A_k ;
   private java.math.BigDecimal AV13Tot_a_a ;
   private java.math.BigDecimal AV16Tot_a_p ;
   private java.math.BigDecimal AV17Tot_a_t ;
   private java.math.BigDecimal AV18Tot_l ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A396EmprCod ;
   private String AV10NomEmp ;
   private String Gx_time ;
   private java.util.Date AV19vPFecGen ;
   private java.util.Date AV22vUFecGen ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private String AV27DataJSon ;
   private IDataStoreProvider pr_default ;
   private String[] P09XG2_A407EmprNom ;
   private boolean[] P09XG2_n407EmprNom ;
   private String[] P09XG2_A396EmprCod ;
   private GXBaseCollection<app.pedidosclientesindetalle.SdtRMOD008_SDT_Item> AV23RMOD008_SDT ;
   private app.pedidosclientesindetalle.SdtRMOD008_SDT_Item AV24Item ;
}

final  class rmod008_printdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09XG2", "SELECT EmprNom, EmprCod FROM TXPEMPRES ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

