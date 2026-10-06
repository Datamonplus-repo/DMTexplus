package app.websevices ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.websevices.webwsat", "/app.websevices.webwsat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwsat extends GXWebObjectStub
{
   public webwsat( )
   {
   }

   public webwsat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwsat.class ));
   }

   public webwsat( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwsat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwsat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consumir WS de la AT";
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

