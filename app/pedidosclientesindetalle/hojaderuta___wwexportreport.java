package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.hojaderuta___wwexportreport", "/app.pedidosclientesindetalle.hojaderuta___wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class hojaderuta___wwexportreport extends GXWebObjectStub
{
   public hojaderuta___wwexportreport( )
   {
   }

   public hojaderuta___wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( hojaderuta___wwexportreport.class ));
   }

   public hojaderuta___wwexportreport( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new hojaderuta___wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new hojaderuta___wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Hojade Ruta___WWExport Report";
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

