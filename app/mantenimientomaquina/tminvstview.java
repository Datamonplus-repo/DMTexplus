package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tminvstview", "/app.mantenimientomaquina.tminvstview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tminvstview extends GXWebObjectStub
{
   public tminvstview( )
   {
   }

   public tminvstview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tminvstview.class ));
   }

   public tminvstview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tminvstview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tminvstview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMInv St View";
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

