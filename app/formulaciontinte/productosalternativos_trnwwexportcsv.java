package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.productosalternativos_trnwwexportcsv", "/app.formulaciontinte.productosalternativos_trnwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosalternativos_trnwwexportcsv extends GXWebObjectStub
{
   public productosalternativos_trnwwexportcsv( )
   {
   }

   public productosalternativos_trnwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosalternativos_trnwwexportcsv.class ));
   }

   public productosalternativos_trnwwexportcsv( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosalternativos_trnwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosalternativos_trnwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos Alternativos_TRNWWExport CSV";
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

