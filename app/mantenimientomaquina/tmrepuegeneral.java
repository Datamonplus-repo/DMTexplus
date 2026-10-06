package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmrepuegeneral", "/app.mantenimientomaquina.tmrepuegeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrepuegeneral extends GXWebObjectStub
{
   public tmrepuegeneral( )
   {
   }

   public tmrepuegeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrepuegeneral.class ));
   }

   public tmrepuegeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrepuegeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrepuegeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMRepue General";
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

