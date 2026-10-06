package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class apcnore1_impl extends GXWebProcedure
{
   public apcnore1_impl( com.genexus.internet.HttpContext context )
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
            AV12Nr_barcod = (int)(GXutil.lval( httpContext.GetPar( "Nr_barcod"))) ;
            AV13Nr_barreo = (byte)(GXutil.lval( httpContext.GetPar( "Nr_barreo"))) ;
            AV14Nr_barpar = httpContext.GetPar( "Nr_barpar") ;
            AV15HisReoTn = (int)(GXutil.lval( httpContext.GetPar( "HisReoTn"))) ;
            AV16ImpCod = httpContext.GetPar( "ImpCod") ;
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
      GXt_int1 = AV8Tinamar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int2) ;
      apcnore1_impl.this.GXt_int1 = GXv_int2[0] ;
      AV8Tinamar = GXt_int1 ;
      GXv_int2[0] = AV9F_endutex ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int2) ;
      apcnore1_impl.this.AV9F_endutex = GXv_int2[0] ;
      GXt_int1 = AV17Erfoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int2) ;
      apcnore1_impl.this.GXt_int1 = GXv_int2[0] ;
      AV17Erfoc = GXt_int1 ;
      GXt_int1 = AV18Carvema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
      apcnore1_impl.this.GXt_int1 = GXv_int2[0] ;
      AV18Carvema = GXt_int1 ;
      GXt_int1 = (byte)(AV24NCSTDPS) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCSTDS", ""), GXv_int2) ;
      apcnore1_impl.this.GXt_int1 = GXv_int2[0] ;
      AV24NCSTDPS = GXt_int1 ;
      GXt_int1 = (byte)(AV25NCSTDPP) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCSTDP", ""), GXv_int2) ;
      apcnore1_impl.this.GXt_int1 = GXv_int2[0] ;
      AV25NCSTDPP = GXt_int1 ;
      GXt_int1 = AV20tintex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int2) ;
      apcnore1_impl.this.GXt_int1 = GXv_int2[0] ;
      AV20tintex = GXt_int1 ;
      GXt_int1 = AV21brochado ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TONALI", ""), GXv_int2) ;
      apcnore1_impl.this.GXt_int1 = GXv_int2[0] ;
      AV21brochado = GXt_int1 ;
      GXt_int1 = AV22etm ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int2) ;
      apcnore1_impl.this.GXt_int1 = GXv_int2[0] ;
      AV22etm = GXt_int1 ;
      GXt_int1 = AV23carvitin ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int2) ;
      apcnore1_impl.this.GXt_int1 = GXv_int2[0] ;
      AV23carvitin = GXt_int1 ;
      if ( AV8Tinamar == 1 )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = AV12Nr_barcod ;
         GXv_int2[0] = (byte)(0) ;
         GXv_char5[0] = AV14Nr_barpar ;
         GXv_int6[0] = AV15HisReoTn ;
         GXv_char7[0] = httpContext.getMessage( "SCR", "") ;
         new app.rnce000(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_int6, GXv_char7) ;
         apcnore1_impl.this.A396EmprCod = GXv_char3[0] ;
         apcnore1_impl.this.AV12Nr_barcod = GXv_int4[0] ;
         apcnore1_impl.this.AV14Nr_barpar = GXv_char5[0] ;
         apcnore1_impl.this.AV15HisReoTn = GXv_int6[0] ;
      }
      else if ( AV21brochado == 1 )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int6[0] = AV15HisReoTn ;
         GXv_char5[0] = httpContext.getMessage( "SCR", "") ;
         new app.rrcbr000(remoteHandle, context).execute( GXv_char7, GXv_int6, GXv_char5) ;
         apcnore1_impl.this.A396EmprCod = GXv_char7[0] ;
         apcnore1_impl.this.AV15HisReoTn = GXv_int6[0] ;
      }
      else if ( AV9F_endutex == 1 )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int6[0] = AV15HisReoTn ;
         GXv_char5[0] = httpContext.getMessage( "SCR", "") ;
         new app.rede000(remoteHandle, context).execute( GXv_char7, GXv_int6, GXv_char5) ;
         apcnore1_impl.this.A396EmprCod = GXv_char7[0] ;
         apcnore1_impl.this.AV15HisReoTn = GXv_int6[0] ;
      }
      else if ( AV17Erfoc == 1 )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int6[0] = AV15HisReoTn ;
         GXv_char5[0] = httpContext.getMessage( "SCR", "") ;
         new app.refe000(remoteHandle, context).execute( GXv_char7, GXv_int6, GXv_char5) ;
         apcnore1_impl.this.A396EmprCod = GXv_char7[0] ;
         apcnore1_impl.this.AV15HisReoTn = GXv_int6[0] ;
      }
      else if ( AV18Carvema == 1 )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int6[0] = AV15HisReoTn ;
         GXv_char5[0] = httpContext.getMessage( "SCR", "") ;
         new app.rcae000(remoteHandle, context).execute( GXv_char7, GXv_int6, GXv_char5) ;
         apcnore1_impl.this.A396EmprCod = GXv_char7[0] ;
         apcnore1_impl.this.AV15HisReoTn = GXv_int6[0] ;
      }
      else if ( AV22etm == 1 )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int6[0] = AV12Nr_barcod ;
         GXv_int2[0] = (byte)(0) ;
         GXv_char5[0] = AV14Nr_barpar ;
         GXv_int4[0] = AV15HisReoTn ;
         GXv_char3[0] = httpContext.getMessage( "SCR", "") ;
         new app.rncetm(remoteHandle, context).execute( GXv_char7, GXv_int6, GXv_int2, GXv_char5, GXv_int4, GXv_char3) ;
         apcnore1_impl.this.A396EmprCod = GXv_char7[0] ;
         apcnore1_impl.this.AV12Nr_barcod = GXv_int6[0] ;
         apcnore1_impl.this.AV14Nr_barpar = GXv_char5[0] ;
         apcnore1_impl.this.AV15HisReoTn = GXv_int4[0] ;
      }
      else if ( AV23carvitin == 1 )
      {
         callWebObject(formatLink("app.rcvrc000", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15HisReoTn,6,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","HisReoTn","Output"}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
      }
      else if ( AV24NCSTDPS == 1 )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int6[0] = AV15HisReoTn ;
         GXv_char5[0] = httpContext.getMessage( "SCR", "") ;
         new app.rncec00(remoteHandle, context).execute( GXv_char7, GXv_int6, GXv_char5) ;
         apcnore1_impl.this.A396EmprCod = GXv_char7[0] ;
         apcnore1_impl.this.AV15HisReoTn = GXv_int6[0] ;
      }
      else if ( AV25NCSTDPP == 1 )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int6[0] = AV12Nr_barcod ;
         GXv_int2[0] = (byte)(0) ;
         GXv_char5[0] = AV14Nr_barpar ;
         GXv_int4[0] = AV15HisReoTn ;
         GXv_char3[0] = httpContext.getMessage( "SCR", "") ;
         new app.rnce00p(remoteHandle, context).execute( GXv_char7, GXv_int6, GXv_int2, GXv_char5, GXv_int4, GXv_char3) ;
         apcnore1_impl.this.A396EmprCod = GXv_char7[0] ;
         apcnore1_impl.this.AV12Nr_barcod = GXv_int6[0] ;
         apcnore1_impl.this.AV14Nr_barpar = GXv_char5[0] ;
         apcnore1_impl.this.AV15HisReoTn = GXv_int4[0] ;
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
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
      AV14Nr_barpar = "" ;
      AV16ImpCod = "" ;
      GXv_char7 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char3 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13Nr_barreo ;
   private byte AV8Tinamar ;
   private byte AV9F_endutex ;
   private byte AV17Erfoc ;
   private byte AV18Carvema ;
   private byte AV20tintex ;
   private byte AV21brochado ;
   private byte AV22etm ;
   private byte AV23carvitin ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short gxcookieaux ;
   private short AV24NCSTDPS ;
   private short AV25NCSTDPP ;
   private short Gx_err ;
   private int AV12Nr_barcod ;
   private int AV15HisReoTn ;
   private int GXv_int6[] ;
   private int GXv_int4[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV14Nr_barpar ;
   private String AV16ImpCod ;
   private String GXv_char7[] ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
}

