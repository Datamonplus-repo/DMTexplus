package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.productosalternativos_wc1exportreport", "/app.formulaciontinte.productosalternativos_wc1exportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosalternativos_wc1exportreport extends GXWebObjectStub
{
   public productosalternativos_wc1exportreport( )
   {
   }

   public productosalternativos_wc1exportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosalternativos_wc1exportreport.class ));
   }

   public productosalternativos_wc1exportreport( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosalternativos_wc1exportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosalternativos_wc1exportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Productos Alternativos";
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

