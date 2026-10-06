package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.webwsusprd", "/app.formulaciontinte.webwsusprd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwsusprd extends GXWebObjectStub
{
   public webwsusprd( )
   {
   }

   public webwsusprd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwsusprd.class ));
   }

   public webwsusprd( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwsusprd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwsusprd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Sustitucion Producto";
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

