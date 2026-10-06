package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aproper_impl extends GXWebProcedure
{
   public aproper_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "Ent") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV8Ent = gxfirstwebparm ;
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
      AV14StringCollection = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(AV8Ent,httpContext.getMessage( "\\s", ""))) ;
      AV11texto = "" ;
      AV17GXV1 = 1 ;
      while ( AV17GXV1 <= AV14StringCollection.size() )
      {
         AV10word = (String)AV14StringCollection.elementAt(-1+AV17GXV1) ;
         AV13words += GxRegex.Replace(AV10word,httpContext.getMessage( "^\\D", ""),GXutil.upper( GXutil.substring( AV10word, 1, 1))) + " " ;
         AV17GXV1 = (int)(AV17GXV1+1) ;
      }
      AV11texto = AV13words ;
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
      AV8Ent = "" ;
      AV14StringCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      AV11texto = "" ;
      AV10word = "" ;
      AV13words = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int AV17GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV10word ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private String AV8Ent ;
   private String AV11texto ;
   private String AV13words ;
   private GXSimpleCollection<String> AV14StringCollection ;
}

