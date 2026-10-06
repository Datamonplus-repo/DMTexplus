package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidosclientesindetalle.consultaalmacentejidoencrudoproduccion_wc", "/app.pedidosclientesindetalle.consultaalmacentejidoencrudoproduccion_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultaalmacentejidoencrudoproduccion_wc extends GXWebObjectStub
{
   public consultaalmacentejidoencrudoproduccion_wc( )
   {
   }

   public consultaalmacentejidoencrudoproduccion_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultaalmacentejidoencrudoproduccion_wc.class ));
   }

   public consultaalmacentejidoencrudoproduccion_wc( int remoteHandle ,
                                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultaalmacentejidoencrudoproduccion_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultaalmacentejidoencrudoproduccion_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nº Recepción utilizada en las siguientes Producciones:";
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

