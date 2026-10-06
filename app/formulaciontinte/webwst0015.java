package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.webwst0015", "/app.formulaciontinte.webwst0015"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwst0015 extends GXWebObjectStub
{
   public webwst0015( )
   {
   }

   public webwst0015( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwst0015.class ));
   }

   public webwst0015( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwst0015_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwst0015_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informacion Producto";
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

