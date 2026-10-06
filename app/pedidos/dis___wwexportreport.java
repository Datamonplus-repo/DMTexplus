package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.dis___wwexportreport", "/app.pedidos.dis___wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class dis___wwexportreport extends GXWebObjectStub
{
   public dis___wwexportreport( )
   {
   }

   public dis___wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( dis___wwexportreport.class ));
   }

   public dis___wwexportreport( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new dis___wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new dis___wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Dis___WWExport Report";
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

