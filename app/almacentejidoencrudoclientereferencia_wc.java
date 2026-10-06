package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacentejidoencrudoclientereferencia_wc", "/app.almacentejidoencrudoclientereferencia_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoencrudoclientereferencia_wc extends GXWebObjectStub
{
   public almacentejidoencrudoclientereferencia_wc( )
   {
   }

   public almacentejidoencrudoclientereferencia_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoencrudoclientereferencia_wc.class ));
   }

   public almacentejidoencrudoclientereferencia_wc( int remoteHandle ,
                                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoencrudoclientereferencia_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoencrudoclientereferencia_wc_impl(context).cleanup();
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

