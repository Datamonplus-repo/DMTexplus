package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwfatmod", "/app.webwfatmod"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwfatmod extends GXWebObjectStub
{
   public webwfatmod( )
   {
   }

   public webwfatmod( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwfatmod.class ));
   }

   public webwfatmod( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwfatmod_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwfatmod_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Impresion Facturas (Moda 21)";
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

