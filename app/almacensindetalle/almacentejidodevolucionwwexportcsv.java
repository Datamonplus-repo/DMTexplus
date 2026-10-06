package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacensindetalle.almacentejidodevolucionwwexportcsv", "/app.almacensindetalle.almacentejidodevolucionwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidodevolucionwwexportcsv extends GXWebObjectStub
{
   public almacentejidodevolucionwwexportcsv( )
   {
   }

   public almacentejidodevolucionwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidodevolucionwwexportcsv.class ));
   }

   public almacentejidodevolucionwwexportcsv( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidodevolucionwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidodevolucionwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejido Devolucion WWExport CSV";
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

