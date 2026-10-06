package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmmovstview", "/app.mantenimientomaquina.tmmovstview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmmovstview extends GXWebObjectStub
{
   public tmmovstview( )
   {
   }

   public tmmovstview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmmovstview.class ));
   }

   public tmmovstview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmmovstview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmmovstview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMMov St View";
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

