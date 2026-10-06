package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.productosalternativos_trnww", "/app.formulaciontinte.productosalternativos_trnww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosalternativos_trnww extends GXWebObjectStub
{
   public productosalternativos_trnww( )
   {
   }

   public productosalternativos_trnww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosalternativos_trnww.class ));
   }

   public productosalternativos_trnww( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosalternativos_trnww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosalternativos_trnww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Productos Alternativos";
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

