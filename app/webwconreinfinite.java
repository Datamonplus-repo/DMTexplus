package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwconreinfinite", "/app.webwconreinfinite"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwconreinfinite extends GXWebObjectStub
{
   public webwconreinfinite( )
   {
   }

   public webwconreinfinite( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwconreinfinite.class ));
   }

   public webwconreinfinite( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwconreinfinite_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwconreinfinite_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Inventario";
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

