package app.lectoroptico ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.lectoroptico.partesdeproduccionlector_wcexportcsv", "/app.lectoroptico.partesdeproduccionlector_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class partesdeproduccionlector_wcexportcsv extends GXWebObjectStub
{
   public partesdeproduccionlector_wcexportcsv( )
   {
   }

   public partesdeproduccionlector_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( partesdeproduccionlector_wcexportcsv.class ));
   }

   public partesdeproduccionlector_wcexportcsv( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new partesdeproduccionlector_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new partesdeproduccionlector_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Partesde Produccion Lector_WCExport CSV";
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

