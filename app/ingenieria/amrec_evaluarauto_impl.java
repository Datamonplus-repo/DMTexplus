package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class amrec_evaluarauto_impl extends GXWebProcedure
{
   public amrec_evaluarauto_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8EmprCod = "001" ;
      AV9ContCod = httpContext.getMessage( "INGSIM", "") ;
      new app.ingenieria.mrec_evaluarcrearcontadorpr(remoteHandle, context).execute( AV8EmprCod, AV9ContCod) ;
      new app.ingenieria.mrec_evaluariniciarpr(remoteHandle, context).execute( AV8EmprCod, AV9ContCod) ;
      GXv_char1[0] = AV11Ip ;
      GXv_char2[0] = AV12IngresaMTkn ;
      new app.ingenieria.mrec_evaluarpr(remoteHandle, context).execute( AV8EmprCod, AV9ContCod, AV10UsurCod, GXv_char1, GXv_char2) ;
      amrec_evaluarauto_impl.this.AV11Ip = GXv_char1[0] ;
      amrec_evaluarauto_impl.this.AV12IngresaMTkn = GXv_char2[0] ;
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
      AV8EmprCod = "" ;
      AV9ContCod = "" ;
      AV10UsurCod = "" ;
      AV11Ip = "" ;
      GXv_char1 = new String[1] ;
      AV12IngresaMTkn = "" ;
      GXv_char2 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV8EmprCod ;
   private String AV9ContCod ;
   private String AV10UsurCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private String AV11Ip ;
   private String AV12IngresaMTkn ;
}

