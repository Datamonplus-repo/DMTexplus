package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informealmacentejidocrudo_cliente", "/app.informealmacentejidocrudo_cliente"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informealmacentejidocrudo_cliente extends GXWebObjectStub
{
   public informealmacentejidocrudo_cliente( )
   {
   }

   public informealmacentejidocrudo_cliente( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informealmacentejidocrudo_cliente.class ));
   }

   public informealmacentejidocrudo_cliente( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informealmacentejidocrudo_cliente_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informealmacentejidocrudo_cliente_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Almacen Tejido Crudo (Cliente)";
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

