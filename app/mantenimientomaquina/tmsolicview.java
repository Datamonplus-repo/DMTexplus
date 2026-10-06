package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmsolicview", "/app.mantenimientomaquina.tmsolicview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmsolicview extends GXWebObjectStub
{
   public tmsolicview( )
   {
   }

   public tmsolicview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmsolicview.class ));
   }

   public tmsolicview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmsolicview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmsolicview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMSolic View";
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

