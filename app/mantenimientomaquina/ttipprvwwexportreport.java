package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mantenimientomaquina.ttipprvwwexportreport", "/app.mantenimientomaquina.ttipprvwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipprvwwexportreport extends GXWebObjectStub
{
   public ttipprvwwexportreport( )
   {
   }

   public ttipprvwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipprvwwexportreport.class ));
   }

   public ttipprvwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipprvwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipprvwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPPRVWWExport Report";
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

