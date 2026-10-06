package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwbarfas", "/app.webwbarfas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwbarfas extends GXWebObjectStub
{
   public webwbarfas( )
   {
   }

   public webwbarfas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwbarfas.class ));
   }

   public webwbarfas( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwbarfas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwbarfas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento de Fases Hdr";
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

