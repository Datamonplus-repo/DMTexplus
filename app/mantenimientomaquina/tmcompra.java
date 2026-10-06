package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmcompra", "/app.mantenimientomaquina.tmcompra"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmcompra extends GXWebObjectStub
{
   public tmcompra( )
   {
   }

   public tmcompra( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmcompra.class ));
   }

   public tmcompra( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmcompra_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmcompra_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Compras";
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

