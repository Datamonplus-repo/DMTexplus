package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.capfm_pparametroswc", "/app.ingenieria.capfm_pparametroswc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class capfm_pparametroswc extends GXWebObjectStub
{
   public capfm_pparametroswc( )
   {
   }

   public capfm_pparametroswc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( capfm_pparametroswc.class ));
   }

   public capfm_pparametroswc( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new capfm_pparametroswc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new capfm_pparametroswc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CAPFM_PParametros WC";
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

}

