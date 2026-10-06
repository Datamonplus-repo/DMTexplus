package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmordenwwexportreport", "/app.mantenimientomaquina.tmordenwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordenwwexportreport extends GXWebObjectStub
{
   public tmordenwwexportreport( )
   {
   }

   public tmordenwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordenwwexportreport.class ));
   }

   public tmordenwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordenwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordenwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Lista Ordenes de Mantenimiento";
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

