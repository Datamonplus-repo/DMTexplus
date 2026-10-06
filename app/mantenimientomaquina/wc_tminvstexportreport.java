package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.wc_tminvstexportreport", "/app.mantenimientomaquina.wc_tminvstexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wc_tminvstexportreport extends GXWebObjectStub
{
   public wc_tminvstexportreport( )
   {
   }

   public wc_tminvstexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wc_tminvstexportreport.class ));
   }

   public wc_tminvstexportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wc_tminvstexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wc_tminvstexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista de Movimientos Inventario de Stock";
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

