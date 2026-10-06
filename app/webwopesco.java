package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwopesco", "/app.webwopesco"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwopesco extends GXWebObjectStub
{
   public webwopesco( )
   {
   }

   public webwopesco( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwopesco.class ));
   }

   public webwopesco( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwopesco_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwopesco_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLAVE ESPECIAL -COLORANTE-";
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

