package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wctablaalbfas", "/app.wctablaalbfas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wctablaalbfas extends GXWebObjectStub
{
   public wctablaalbfas( )
   {
   }

   public wctablaalbfas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wctablaalbfas.class ));
   }

   public wctablaalbfas( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wctablaalbfas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wctablaalbfas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Fases de la HDR";
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

