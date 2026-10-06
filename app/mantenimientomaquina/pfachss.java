package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.pfachss", "/app.mantenimientomaquina.pfachss"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pfachss extends GXWebObjectStub
{
   public pfachss( )
   {
   }

   public pfachss( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pfachss.class ));
   }

   public pfachss( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pfachss_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pfachss_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consumos x Mes y Maquina";
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

