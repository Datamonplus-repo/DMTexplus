package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pctrosc_impl extends GXWebReport
{
   public pctrosc_impl( com.genexus.internet.HttpContext context )
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
            AV27TablaHdrs_SDTJson = httpContext.GetPar( "TablaHdrs_SDTJson") ;
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
         h2NC0( false, 28) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ordem de Serviço Criada", ""), 15, Gx_line+4, 163, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ordem de Serviço em Produçao", ""), 454, Gx_line+4, 641, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(15, Gx_line+24, 165, Gx_line+24, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(454, Gx_line+21, 642, Gx_line+21, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 179, Gx_line+4, 200, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(179, Gx_line+24, 340, Gx_line+24, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+28) ;
         AV25TablaHdrs_SDT.fromJSonString(AV27TablaHdrs_SDTJson, null);
         AV9i = (short)(1) ;
         AV32GXV1 = 1 ;
         while ( AV32GXV1 <= AV25TablaHdrs_SDT.size() )
         {
            AV24TabladeHdrs_SDTItem = (app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem)((app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem)AV25TablaHdrs_SDT.elementAt(-1+AV32GXV1));
            AV10Barcod = AV24TabladeHdrs_SDTItem.getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod() ;
            AV11Barcodreo = AV24TabladeHdrs_SDTItem.getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo() ;
            AV12Barcodpar = AV24TabladeHdrs_SDTItem.getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar() ;
            AV9i = (short)(AV9i+1) ;
            /* Using cursor P02NC2 */
            pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10Barcod), Byte.valueOf(AV11Barcodreo), AV12Barcodpar});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A130BarCodPar = P02NC2_A130BarCodPar[0] ;
               A132BarCodReo = P02NC2_A132BarCodReo[0] ;
               A129BarCod = P02NC2_A129BarCod[0] ;
               A135BarColNom = P02NC2_A135BarColNom[0] ;
               A136BarColNum = P02NC2_A136BarColNum[0] ;
               A218BarTipCol = P02NC2_A218BarTipCol[0] ;
               AV13Barcolnom = A135BarColNom ;
               AV14Barcolnum = A136BarColNum ;
               AV15Bartipcol = A218BarTipCol ;
               AV28TablaHdrs_SDTJson2 = "" ;
               GXv_char1[0] = A396EmprCod ;
               GXv_char2[0] = AV13Barcolnom ;
               GXv_int3[0] = AV14Barcolnum ;
               GXv_int4[0] = AV15Bartipcol ;
               GXv_char5[0] = AV28TablaHdrs_SDTJson2 ;
               GXv_int6[0] = AV17Ok_hdrs ;
               new app.pbuscolm(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_int6) ;
               pctrosc_impl.this.A396EmprCod = GXv_char1[0] ;
               pctrosc_impl.this.AV13Barcolnom = GXv_char2[0] ;
               pctrosc_impl.this.AV14Barcolnum = GXv_int3[0] ;
               pctrosc_impl.this.AV15Bartipcol = GXv_int4[0] ;
               pctrosc_impl.this.AV28TablaHdrs_SDTJson2 = GXv_char5[0] ;
               pctrosc_impl.this.AV17Ok_hdrs = GXv_int6[0] ;
               AV26TablaHdrs_SDT2.fromJSonString(AV28TablaHdrs_SDTJson2, null);
               if ( AV17Ok_hdrs == 1 )
               {
                  h2NC0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")), 15, Gx_line+1, 74, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11Barcodreo), "9")), 100, Gx_line+0, 108, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Barcodpar, "")), 120, Gx_line+0, 128, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Barcolnom, "")), 179, Gx_line+1, 275, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14Barcolnum), "ZZZZZ9")), 286, Gx_line+0, 331, Gx_line+17, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
                  AV34GXV2 = 1 ;
                  while ( AV34GXV2 <= AV26TablaHdrs_SDT2.size() )
                  {
                     AV29TabladeHdrs_SDTItem2 = (app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem)((app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem)AV26TablaHdrs_SDT2.elementAt(-1+AV34GXV2));
                     AV18Barcodp = AV29TabladeHdrs_SDTItem2.getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod() ;
                     AV20Barcodreop = AV29TabladeHdrs_SDTItem2.getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo() ;
                     AV21Barcodparp = AV29TabladeHdrs_SDTItem2.getgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar() ;
                     if ( ( AV10Barcod == AV18Barcodp ) && ( AV11Barcodreo == AV20Barcodreop ) && ( GXutil.strcmp(AV12Barcodpar, AV21Barcodparp) == 0 ) )
                     {
                     }
                     else
                     {
                        h2NC0( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18Barcodp), "ZZZZZZZ9")), 454, Gx_line+1, 513, Gx_line+18, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Barcodparp, "")), 529, Gx_line+1, 537, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20Barcodreop), "9")), 517, Gx_line+1, 525, Gx_line+18, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22BarMaqCod, "")), 598, Gx_line+1, 643, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23BarAgrest, "@!")), 560, Gx_line+0, 568, Gx_line+17, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     AV34GXV2 = (int)(AV34GXV2+1) ;
                  }
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            AV9i = (short)(AV9i+1) ;
            AV32GXV1 = (int)(AV32GXV1+1) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h2NC0( true, 0) ;
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

   public void h2NC0( boolean bFoot ,
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
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
      AV27TablaHdrs_SDTJson = "" ;
      AV25TablaHdrs_SDT = new GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem>(app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem.class, "TabladeHdrs_SDTItem", "TexplusNET", remoteHandle);
      AV24TabladeHdrs_SDTItem = new app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem(remoteHandle, context);
      AV12Barcodpar = "" ;
      scmdbuf = "" ;
      P02NC2_A396EmprCod = new String[] {""} ;
      P02NC2_A130BarCodPar = new String[] {""} ;
      P02NC2_A132BarCodReo = new byte[1] ;
      P02NC2_A129BarCod = new int[1] ;
      P02NC2_A135BarColNom = new String[] {""} ;
      P02NC2_A136BarColNum = new int[1] ;
      P02NC2_A218BarTipCol = new byte[1] ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      AV13Barcolnom = "" ;
      AV28TablaHdrs_SDTJson2 = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new byte[1] ;
      AV26TablaHdrs_SDT2 = new GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem>(app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem.class, "TabladeHdrs_SDTItem", "TexplusNET", remoteHandle);
      AV29TabladeHdrs_SDTItem2 = new app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem(remoteHandle, context);
      AV21Barcodparp = "" ;
      AV22BarMaqCod = "" ;
      AV23BarAgrest = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrosc__default(),
         new Object[] {
             new Object[] {
            P02NC2_A396EmprCod, P02NC2_A130BarCodPar, P02NC2_A132BarCodReo, P02NC2_A129BarCod, P02NC2_A135BarColNom, P02NC2_A136BarColNum, P02NC2_A218BarTipCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV11Barcodreo ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV15Bartipcol ;
   private byte GXv_int4[] ;
   private byte AV17Ok_hdrs ;
   private byte GXv_int6[] ;
   private byte AV20Barcodreop ;
   private short gxcookieaux ;
   private short AV9i ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV32GXV1 ;
   private int AV10Barcod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV14Barcolnum ;
   private int GXv_int3[] ;
   private int AV34GXV2 ;
   private int AV18Barcodp ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV12Barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String AV13Barcolnom ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String AV21Barcodparp ;
   private String AV22BarMaqCod ;
   private String AV23BarAgrest ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private String AV27TablaHdrs_SDTJson ;
   private String AV28TablaHdrs_SDTJson2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02NC2_A396EmprCod ;
   private String[] P02NC2_A130BarCodPar ;
   private byte[] P02NC2_A132BarCodReo ;
   private int[] P02NC2_A129BarCod ;
   private String[] P02NC2_A135BarColNom ;
   private int[] P02NC2_A136BarColNum ;
   private byte[] P02NC2_A218BarTipCol ;
   private GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem> AV25TablaHdrs_SDT ;
   private GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem> AV26TablaHdrs_SDT2 ;
   private app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem AV24TabladeHdrs_SDTItem ;
   private app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem AV29TabladeHdrs_SDTItem2 ;
}

final  class pctrosc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02NC2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

