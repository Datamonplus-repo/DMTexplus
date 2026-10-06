package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.wcrepuestomovimientosexportreport", "/app.mantenimientomaquina.wcrepuestomovimientosexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcrepuestomovimientosexportreport extends GXWebObjectStub
{
   public wcrepuestomovimientosexportreport( )
   {
   }

   public wcrepuestomovimientosexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcrepuestomovimientosexportreport.class ));
   }

   public wcrepuestomovimientosexportreport( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcrepuestomovimientosexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcrepuestomovimientosexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista Movimientos Repuestos";
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

