package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmsolicgeneral", "/app.mantenimientomaquina.tmsolicgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmsolicgeneral extends GXWebObjectStub
{
   public tmsolicgeneral( )
   {
   }

   public tmsolicgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmsolicgeneral.class ));
   }

   public tmsolicgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmsolicgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmsolicgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMSolic General";
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

