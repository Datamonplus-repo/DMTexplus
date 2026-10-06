package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tturnoswwexportreport", "/app.tturnoswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tturnoswwexportreport extends GXWebObjectStub
{
   public tturnoswwexportreport( )
   {
   }

   public tturnoswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tturnoswwexportreport.class ));
   }

   public tturnoswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tturnoswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tturnoswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Turnos";
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

