package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt000wwexportreport", "/app.ficherosbasicos.tnxt000wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt000wwexportreport extends GXWebObjectStub
{
   public tnxt000wwexportreport( )
   {
   }

   public tnxt000wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt000wwexportreport.class ));
   }

   public tnxt000wwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt000wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt000wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Componentes";
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

