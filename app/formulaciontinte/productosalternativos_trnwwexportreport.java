package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.productosalternativos_trnwwexportreport", "/app.formulaciontinte.productosalternativos_trnwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosalternativos_trnwwexportreport extends GXWebObjectStub
{
   public productosalternativos_trnwwexportreport( )
   {
   }

   public productosalternativos_trnwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosalternativos_trnwwexportreport.class ));
   }

   public productosalternativos_trnwwexportreport( int remoteHandle ,
                                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosalternativos_trnwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosalternativos_trnwwexportreport_impl(context).cleanup();
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

