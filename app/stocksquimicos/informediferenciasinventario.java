package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.informediferenciasinventario", "/app.stocksquimicos.informediferenciasinventario"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informediferenciasinventario extends GXWebObjectStub
{
   public informediferenciasinventario( )
   {
   }

   public informediferenciasinventario( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informediferenciasinventario.class ));
   }

   public informediferenciasinventario( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informediferenciasinventario_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informediferenciasinventario_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Diferencias Inventario (Recuento)";
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

