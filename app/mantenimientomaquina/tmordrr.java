package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmordrr", "/app.mantenimientomaquina.tmordrr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordrr extends GXWebObjectStub
{
   public tmordrr( )
   {
   }

   public tmordrr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordrr.class ));
   }

   public tmordrr( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordrr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordrr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Res Repuestos,Orden de trabajo";
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

