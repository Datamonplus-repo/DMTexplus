package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmprevegeneral", "/app.mantenimientomaquina.tmprevegeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmprevegeneral extends GXWebObjectStub
{
   public tmprevegeneral( )
   {
   }

   public tmprevegeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmprevegeneral.class ));
   }

   public tmprevegeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmprevegeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmprevegeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMPreve General";
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

