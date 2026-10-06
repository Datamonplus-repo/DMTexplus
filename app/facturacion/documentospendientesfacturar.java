package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.documentospendientesfacturar", "/app.facturacion.documentospendientesfacturar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class documentospendientesfacturar extends GXWebObjectStub
{
   public documentospendientesfacturar( )
   {
   }

   public documentospendientesfacturar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( documentospendientesfacturar.class ));
   }

   public documentospendientesfacturar( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new documentospendientesfacturar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new documentospendientesfacturar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documentos Pendientes Facturar";
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

