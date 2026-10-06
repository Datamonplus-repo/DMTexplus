package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt002wwexportreport", "/app.ficherosbasicos.tnxt002wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt002wwexportreport extends GXWebObjectStub
{
   public tnxt002wwexportreport( )
   {
   }

   public tnxt002wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt002wwexportreport.class ));
   }

   public tnxt002wwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt002wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt002wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Departamentos";
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

