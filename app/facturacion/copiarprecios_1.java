package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.copiarprecios_1", "/app.facturacion.copiarprecios_1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class copiarprecios_1 extends GXWebObjectStub
{
   public copiarprecios_1( )
   {
   }

   public copiarprecios_1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( copiarprecios_1.class ));
   }

   public copiarprecios_1( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new copiarprecios_1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new copiarprecios_1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Copia de Precios";
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

