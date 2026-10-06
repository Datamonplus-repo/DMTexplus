package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbtet", "/app.talbtet"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbtet extends GXWebObjectStub
{
   public talbtet( )
   {
   }

   public talbtet( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbtet.class ));
   }

   public talbtet( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbtet_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbtet_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TROZOS COMBINACION";
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

