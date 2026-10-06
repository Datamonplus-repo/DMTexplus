package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webpromptdibujo", "/app.webpromptdibujo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webpromptdibujo extends GXWebObjectStub
{
   public webpromptdibujo( )
   {
   }

   public webpromptdibujo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webpromptdibujo.class ));
   }

   public webpromptdibujo( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpromptdibujo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webpromptdibujo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona LLAMADA TRN DESDE FUERA";
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

