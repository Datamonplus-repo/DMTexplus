package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwopenfas", "/app.webwopenfas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwopenfas extends GXWebObjectStub
{
   public webwopenfas( )
   {
   }

   public webwopenfas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwopenfas.class ));
   }

   public webwopenfas( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwopenfas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwopenfas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Abrir Fase Lector Optico";
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

