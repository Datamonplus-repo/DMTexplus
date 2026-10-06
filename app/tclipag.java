package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclipag", "/app.tclipag"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclipag extends GXWebObjectStub
{
   public tclipag( )
   {
   }

   public tclipag( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclipag.class ));
   }

   public tclipag( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclipag_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclipag_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DOMICILIOS PAGO CLIENTES";
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

