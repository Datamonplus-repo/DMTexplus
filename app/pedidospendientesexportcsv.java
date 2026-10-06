package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidospendientesexportcsv", "/app.pedidospendientesexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pedidospendientesexportcsv extends GXWebObjectStub
{
   public pedidospendientesexportcsv( )
   {
   }

   public pedidospendientesexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pedidospendientesexportcsv.class ));
   }

   public pedidospendientesexportcsv( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pedidospendientesexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pedidospendientesexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pedidos Pendientes Export CSV";
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

