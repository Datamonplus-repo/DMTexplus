package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacentejidoencrudodistribucion_wc", "/app.almacentejidoencrudodistribucion_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoencrudodistribucion_wc extends GXWebObjectStub
{
   public almacentejidoencrudodistribucion_wc( )
   {
   }

   public almacentejidoencrudodistribucion_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoencrudodistribucion_wc.class ));
   }

   public almacentejidoencrudodistribucion_wc( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoencrudodistribucion_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoencrudodistribucion_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejido en crudo (Distribucion)";
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

