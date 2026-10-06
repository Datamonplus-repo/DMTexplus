package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.productosalternativos_trnview", "/app.formulaciontinte.productosalternativos_trnview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosalternativos_trnview extends GXWebObjectStub
{
   public productosalternativos_trnview( )
   {
   }

   public productosalternativos_trnview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosalternativos_trnview.class ));
   }

   public productosalternativos_trnview( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosalternativos_trnview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosalternativos_trnview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos Alternativos_TRNView";
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

