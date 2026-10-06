package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwreopie", "/app.webwreopie"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwreopie extends GXWebObjectStub
{
   public webwreopie( )
   {
   }

   public webwreopie( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwreopie.class ));
   }

   public webwreopie( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwreopie_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwreopie_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Kilos, Metros, Piezas (detalle)";
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

