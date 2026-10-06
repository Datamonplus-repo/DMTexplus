package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpedcli", "/app.tpedcli"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedcli extends GXWebObjectStub
{
   public tpedcli( )
   {
   }

   public tpedcli( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedcli.class ));
   }

   public tpedcli( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedcli_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedcli_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla Pedidos Clientes";
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

