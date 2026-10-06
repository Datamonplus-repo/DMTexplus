package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.productosalternativos_trn", "/app.formulaciontinte.productosalternativos_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosalternativos_trn extends GXWebObjectStub
{
   public productosalternativos_trn( )
   {
   }

   public productosalternativos_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosalternativos_trn.class ));
   }

   public productosalternativos_trn( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosalternativos_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosalternativos_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos Alternativos";
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

