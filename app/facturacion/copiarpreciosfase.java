package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.copiarpreciosfase", "/app.facturacion.copiarpreciosfase"})
@jakarta.servlet.annotation.MultipartConfig
public final  class copiarpreciosfase extends GXWebObjectStub
{
   public copiarpreciosfase( )
   {
   }

   public copiarpreciosfase( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( copiarpreciosfase.class ));
   }

   public copiarpreciosfase( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new copiarpreciosfase_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new copiarpreciosfase_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Copiar Precios Fase";
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

