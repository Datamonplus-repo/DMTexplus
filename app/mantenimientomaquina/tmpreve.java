package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmpreve", "/app.mantenimientomaquina.tmpreve"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmpreve extends GXWebObjectStub
{
   public tmpreve( )
   {
   }

   public tmpreve( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmpreve.class ));
   }

   public tmpreve( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmpreve_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmpreve_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Preventivo";
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

