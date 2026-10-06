package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.dis___wwexportcsv", "/app.pedidos.dis___wwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class dis___wwexportcsv extends GXWebObjectStub
{
   public dis___wwexportcsv( )
   {
   }

   public dis___wwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( dis___wwexportcsv.class ));
   }

   public dis___wwexportcsv( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new dis___wwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new dis___wwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Dis___WWExport CSV";
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

