package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.tmacros", "/app.pedidosclientesindetalle.tmacros"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmacros extends GXWebObjectStub
{
   public tmacros( )
   {
   }

   public tmacros( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmacros.class ));
   }

   public tmacros( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmacros_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmacros_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Accesorios";
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

