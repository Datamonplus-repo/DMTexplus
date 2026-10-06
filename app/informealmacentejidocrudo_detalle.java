package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informealmacentejidocrudo_detalle", "/app.informealmacentejidocrudo_detalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informealmacentejidocrudo_detalle extends GXWebObjectStub
{
   public informealmacentejidocrudo_detalle( )
   {
   }

   public informealmacentejidocrudo_detalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informealmacentejidocrudo_detalle.class ));
   }

   public informealmacentejidocrudo_detalle( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informealmacentejidocrudo_detalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informealmacentejidocrudo_detalle_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Almacen Tejido Crudo (Detalle)";
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

