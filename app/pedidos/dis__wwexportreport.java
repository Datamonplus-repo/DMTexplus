package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.dis__wwexportreport", "/app.pedidos.dis__wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class dis__wwexportreport extends GXWebObjectStub
{
   public dis__wwexportreport( )
   {
   }

   public dis__wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( dis__wwexportreport.class ));
   }

   public dis__wwexportreport( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new dis__wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new dis__wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Dis__WWExport Report";
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

