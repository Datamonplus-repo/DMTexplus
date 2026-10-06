package app.lectoroptico ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.lectoroptico.partesdeproduccionlector_wc", "/app.lectoroptico.partesdeproduccionlector_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class partesdeproduccionlector_wc extends GXWebObjectStub
{
   public partesdeproduccionlector_wc( )
   {
   }

   public partesdeproduccionlector_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( partesdeproduccionlector_wc.class ));
   }

   public partesdeproduccionlector_wc( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new partesdeproduccionlector_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new partesdeproduccionlector_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Detalle Producciones";
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

