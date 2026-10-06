package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacentejidoencrudodetalle_wp", "/app.almacentejidoencrudodetalle_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoencrudodetalle_wp extends GXWebObjectStub
{
   public almacentejidoencrudodetalle_wp( )
   {
   }

   public almacentejidoencrudodetalle_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoencrudodetalle_wp.class ));
   }

   public almacentejidoencrudodetalle_wp( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoencrudodetalle_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoencrudodetalle_wp_impl(context).cleanup();
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

