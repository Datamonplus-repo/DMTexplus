package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmmovstgeneral", "/app.mantenimientomaquina.tmmovstgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmmovstgeneral extends GXWebObjectStub
{
   public tmmovstgeneral( )
   {
   }

   public tmmovstgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmmovstgeneral.class ));
   }

   public tmmovstgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmmovstgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmmovstgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMMov St General";
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

