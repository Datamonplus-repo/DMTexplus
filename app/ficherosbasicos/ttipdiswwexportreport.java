package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipdiswwexportreport", "/app.ficherosbasicos.ttipdiswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipdiswwexportreport extends GXWebObjectStub
{
   public ttipdiswwexportreport( )
   {
   }

   public ttipdiswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipdiswwexportreport.class ));
   }

   public ttipdiswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipdiswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipdiswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Tipo Disposicion";
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

