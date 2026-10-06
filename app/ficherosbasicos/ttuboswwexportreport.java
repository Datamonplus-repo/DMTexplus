package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttuboswwexportreport", "/app.ficherosbasicos.ttuboswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttuboswwexportreport extends GXWebObjectStub
{
   public ttuboswwexportreport( )
   {
   }

   public ttuboswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttuboswwexportreport.class ));
   }

   public ttuboswwexportreport( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttuboswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttuboswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Tubos";
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

