package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trenfas", "/app.trenfas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trenfas extends GXWebObjectStub
{
   public trenfas( )
   {
   }

   public trenfas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trenfas.class ));
   }

   public trenfas( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trenfas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trenfas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RENUMERACION DE FASES";
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

