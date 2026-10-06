package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almacentejidoencrudowp", "/app.almacentejidoencrudowp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almacentejidoencrudowp extends GXWebObjectStub
{
   public almacentejidoencrudowp( )
   {
   }

   public almacentejidoencrudowp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almacentejidoencrudowp.class ));
   }

   public almacentejidoencrudowp( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almacentejidoencrudowp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almacentejidoencrudowp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informes de Almacen Tejido en Crudo";
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

