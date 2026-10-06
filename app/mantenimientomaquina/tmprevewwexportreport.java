package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.tmprevewwexportreport", "/app.mantenimientomaquina.tmprevewwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmprevewwexportreport extends GXWebObjectStub
{
   public tmprevewwexportreport( )
   {
   }

   public tmprevewwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmprevewwexportreport.class ));
   }

   public tmprevewwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmprevewwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmprevewwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Preventivo";
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

