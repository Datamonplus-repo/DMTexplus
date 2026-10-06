package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informealmacentejidocrudo_cliente_referencia", "/app.informealmacentejidocrudo_cliente_referencia"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informealmacentejidocrudo_cliente_referencia extends GXWebObjectStub
{
   public informealmacentejidocrudo_cliente_referencia( )
   {
   }

   public informealmacentejidocrudo_cliente_referencia( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informealmacentejidocrudo_cliente_referencia.class ));
   }

   public informealmacentejidocrudo_cliente_referencia( int remoteHandle ,
                                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informealmacentejidocrudo_cliente_referencia_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informealmacentejidocrudo_cliente_referencia_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Almacen Tejido Crudo (Cliente/Referencia)";
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

