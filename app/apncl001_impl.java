package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class apncl001_impl extends GXWebProcedure
{
   public apncl001_impl( com.genexus.internet.HttpContext context )
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
            AV11HisReoTn = (int)(GXutil.lval( httpContext.GetPar( "HisReoTn"))) ;
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
      GXv_int1[0] = AV8F_endutex ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int1) ;
      apncl001_impl.this.AV8F_endutex = GXv_int1[0] ;
      GXv_int1[0] = AV9Tinamar ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int1) ;
      apncl001_impl.this.AV9Tinamar = GXv_int1[0] ;
      GXv_int1[0] = AV10Kohler ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KOHLER", ""), GXv_int1) ;
      apncl001_impl.this.AV10Kohler = GXv_int1[0] ;
      GXv_int1[0] = AV12Erfoc ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int1) ;
      apncl001_impl.this.AV12Erfoc = GXv_int1[0] ;
      GXv_int1[0] = AV13Carvema ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int1) ;
      apncl001_impl.this.AV13Carvema = GXv_int1[0] ;
      GXt_int2 = (byte)(AV19NCSTDPS) ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCSTDS", ""), GXv_int1) ;
      apncl001_impl.this.GXt_int2 = GXv_int1[0] ;
      AV19NCSTDPS = GXt_int2 ;
      GXt_int2 = (byte)(AV20NCSTDPP) ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCSTDP", ""), GXv_int1) ;
      apncl001_impl.this.GXt_int2 = GXv_int1[0] ;
      AV20NCSTDPP = GXt_int2 ;
      GXv_int1[0] = AV15Jpf ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JPF", ""), GXv_int1) ;
      apncl001_impl.this.AV15Jpf = GXv_int1[0] ;
      GXt_int2 = AV16brochado ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TONALI", ""), GXv_int1) ;
      apncl001_impl.this.GXt_int2 = GXv_int1[0] ;
      AV16brochado = GXt_int2 ;
      GXt_int2 = AV17acabats ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AC2013", ""), GXv_int1) ;
      apncl001_impl.this.GXt_int2 = GXv_int1[0] ;
      AV17acabats = GXt_int2 ;
      GXt_int2 = AV18carvitin ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int1) ;
      apncl001_impl.this.GXt_int2 = GXv_int1[0] ;
      AV18carvitin = GXt_int2 ;
      if ( AV9Tinamar == 1 )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = AV11HisReoTn ;
         GXv_char5[0] = httpContext.getMessage( "SCR", "") ;
         new app.rnci000(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
         apncl001_impl.this.A396EmprCod = GXv_char3[0] ;
         apncl001_impl.this.AV11HisReoTn = GXv_int4[0] ;
      }
      else if ( AV8F_endutex == 1 )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = AV11HisReoTn ;
         GXv_char3[0] = httpContext.getMessage( "SCR", "") ;
         new app.reni000(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         apncl001_impl.this.A396EmprCod = GXv_char5[0] ;
         apncl001_impl.this.AV11HisReoTn = GXv_int4[0] ;
      }
      else if ( AV12Erfoc == 1 )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = AV11HisReoTn ;
         GXv_char3[0] = httpContext.getMessage( "SCR", "") ;
         new app.refi000(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         apncl001_impl.this.A396EmprCod = GXv_char5[0] ;
         apncl001_impl.this.AV11HisReoTn = GXv_int4[0] ;
      }
      else if ( AV13Carvema == 1 )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = AV11HisReoTn ;
         GXv_char3[0] = httpContext.getMessage( "SCR", "") ;
         new app.rcai000(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         apncl001_impl.this.A396EmprCod = GXv_char5[0] ;
         apncl001_impl.this.AV11HisReoTn = GXv_int4[0] ;
      }
      else if ( AV15Jpf == 1 )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = AV11HisReoTn ;
         GXv_char3[0] = httpContext.getMessage( "SCR", "") ;
         new app.rjpfi00(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         apncl001_impl.this.A396EmprCod = GXv_char5[0] ;
         apncl001_impl.this.AV11HisReoTn = GXv_int4[0] ;
      }
      else if ( AV16brochado == 1 )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = AV11HisReoTn ;
         GXv_char3[0] = httpContext.getMessage( "SCR", "") ;
         new app.rncbr000(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         apncl001_impl.this.A396EmprCod = GXv_char5[0] ;
         apncl001_impl.this.AV11HisReoTn = GXv_int4[0] ;
      }
      else if ( AV17acabats == 1 )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = AV11HisReoTn ;
         GXv_char3[0] = httpContext.getMessage( "SCR", "") ;
         new app.pprc164(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         apncl001_impl.this.A396EmprCod = GXv_char5[0] ;
         apncl001_impl.this.AV11HisReoTn = GXv_int4[0] ;
      }
      else if ( AV18carvitin == 1 )
      {
         callWebObject(formatLink("app.rcvnc000", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11HisReoTn,6,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","HisReoTn","Output"}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
      }
      else if ( AV19NCSTDPS == 1 )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = AV11HisReoTn ;
         GXv_char3[0] = httpContext.getMessage( "SCR", "") ;
         new app.rncic00(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         apncl001_impl.this.A396EmprCod = GXv_char5[0] ;
         apncl001_impl.this.AV11HisReoTn = GXv_int4[0] ;
      }
      else if ( AV20NCSTDPP == 1 )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = AV11HisReoTn ;
         GXv_char3[0] = httpContext.getMessage( "SCR", "") ;
         new app.rstnc000(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         apncl001_impl.this.A396EmprCod = GXv_char5[0] ;
         apncl001_impl.this.AV11HisReoTn = GXv_int4[0] ;
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
      GXv_int1 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char3 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8F_endutex ;
   private byte AV9Tinamar ;
   private byte AV10Kohler ;
   private byte AV12Erfoc ;
   private byte AV13Carvema ;
   private byte AV15Jpf ;
   private byte AV16brochado ;
   private byte AV17acabats ;
   private byte AV18carvitin ;
   private byte GXt_int2 ;
   private byte GXv_int1[] ;
   private short gxcookieaux ;
   private short AV19NCSTDPS ;
   private short AV20NCSTDPP ;
   private short Gx_err ;
   private int AV11HisReoTn ;
   private int GXv_int4[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
}

