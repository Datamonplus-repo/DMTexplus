package app.comprasquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasquimicos.webwmodpra", "/app.comprasquimicos.webwmodpra"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwmodpra extends GXWebObjectStub
{
   public webwmodpra( )
   {
   }

   public webwmodpra( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwmodpra.class ));
   }

   public webwmodpra( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwmodpra_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwmodpra_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Modificacion Precios Automatica";
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

