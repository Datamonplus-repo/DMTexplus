package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacentejidoencrudodetalle_wc", "/app.almacentejidoencrudodetalle_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoencrudodetalle_wc extends GXWebObjectStub
{
   public almacentejidoencrudodetalle_wc( )
   {
   }

   public almacentejidoencrudodetalle_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoencrudodetalle_wc.class ));
   }

   public almacentejidoencrudodetalle_wc( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoencrudodetalle_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoencrudodetalle_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejido en crudo (Detalle)";
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

