package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.controlclientes", "/app.pedidosclientesindetalle.controlclientes"})
@jakarta.servlet.annotation.MultipartConfig
public final  class controlclientes extends GXWebObjectStub
{
   public controlclientes( )
   {
   }

   public controlclientes( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( controlclientes.class ));
   }

   public controlclientes( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new controlclientes_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new controlclientes_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Control Clientes";
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

