package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listadoordenesoperariotarea_wc", "/app.listadoordenesoperariotarea_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadoordenesoperariotarea_wc extends GXWebObjectStub
{
   public listadoordenesoperariotarea_wc( )
   {
   }

   public listadoordenesoperariotarea_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadoordenesoperariotarea_wc.class ));
   }

   public listadoordenesoperariotarea_wc( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadoordenesoperariotarea_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadoordenesoperariotarea_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Ordenes de Mantenimiento";
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

