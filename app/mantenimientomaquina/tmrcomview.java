package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmrcomview", "/app.mantenimientomaquina.tmrcomview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrcomview extends GXWebObjectStub
{
   public tmrcomview( )
   {
   }

   public tmrcomview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrcomview.class ));
   }

   public tmrcomview( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrcomview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrcomview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMRCom View";
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

