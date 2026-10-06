package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.productosnocuaderno_wcexportcsv", "/app.productosnocuaderno_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosnocuaderno_wcexportcsv extends GXWebObjectStub
{
   public productosnocuaderno_wcexportcsv( )
   {
   }

   public productosnocuaderno_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosnocuaderno_wcexportcsv.class ));
   }

   public productosnocuaderno_wcexportcsv( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosnocuaderno_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosnocuaderno_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos NOCuaderno_WCExport CSV";
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

