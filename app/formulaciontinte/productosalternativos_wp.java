package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.productosalternativos_wp", "/app.formulaciontinte.productosalternativos_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productosalternativos_wp extends GXWebObjectStub
{
   public productosalternativos_wp( )
   {
   }

   public productosalternativos_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productosalternativos_wp.class ));
   }

   public productosalternativos_wp( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productosalternativos_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productosalternativos_wp_impl(context).cleanup();
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

