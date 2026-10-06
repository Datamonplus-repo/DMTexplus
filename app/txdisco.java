package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.txdisco", "/app.txdisco"})
@jakarta.servlet.annotation.MultipartConfig
public final  class txdisco extends GXWebObjectStub
{
   public txdisco( )
   {
   }

   public txdisco( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( txdisco.class ));
   }

   public txdisco( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new txdisco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new txdisco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "COMBINACIONES II";
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

