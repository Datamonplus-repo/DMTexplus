package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.productosnocuaderno_wcexportreport", "/app.productosnocuaderno_wcexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosnocuaderno_wcexportreport extends GXWebObjectStub
{
   public productosnocuaderno_wcexportreport( )
   {
   }

   public productosnocuaderno_wcexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosnocuaderno_wcexportreport.class ));
   }

   public productosnocuaderno_wcexportreport( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosnocuaderno_wcexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosnocuaderno_wcexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos NOCuaderno_WCExport Report";
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

