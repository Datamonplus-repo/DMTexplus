package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacentejidoencrudoclientereferencia_wp", "/app.almacentejidoencrudoclientereferencia_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoencrudoclientereferencia_wp extends GXWebObjectStub
{
   public almacentejidoencrudoclientereferencia_wp( )
   {
   }

   public almacentejidoencrudoclientereferencia_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoencrudoclientereferencia_wp.class ));
   }

   public almacentejidoencrudoclientereferencia_wp( int remoteHandle ,
                                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoencrudoclientereferencia_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoencrudoclientereferencia_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen Tejido en Crudo (Cliente_Referencia)";
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

