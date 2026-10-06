package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.productosalternativos_wc1exportcsv", "/app.formulaciontinte.productosalternativos_wc1exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosalternativos_wc1exportcsv extends GXWebObjectStub
{
   public productosalternativos_wc1exportcsv( )
   {
   }

   public productosalternativos_wc1exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosalternativos_wc1exportcsv.class ));
   }

   public productosalternativos_wc1exportcsv( int remoteHandle ,
                                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosalternativos_wc1exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosalternativos_wc1exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos Alternativos_WC1 Export CSV";
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

