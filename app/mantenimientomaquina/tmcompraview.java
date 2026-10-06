package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmcompraview", "/app.mantenimientomaquina.tmcompraview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmcompraview extends GXWebObjectStub
{
   public tmcompraview( )
   {
   }

   public tmcompraview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmcompraview.class ));
   }

   public tmcompraview( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmcompraview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmcompraview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMCompra View";
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

