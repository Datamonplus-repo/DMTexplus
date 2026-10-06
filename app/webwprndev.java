package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwprndev", "/app.webwprndev"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwprndev extends GXWebObjectStub
{
   public webwprndev( )
   {
   }

   public webwprndev( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwprndev.class ));
   }

   public webwprndev( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwprndev_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwprndev_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Impresion Devoluciones";
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

