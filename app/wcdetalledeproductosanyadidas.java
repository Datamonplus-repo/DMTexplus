package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcdetalledeproductosanyadidas", "/app.wcdetalledeproductosanyadidas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcdetalledeproductosanyadidas extends GXWebObjectStub
{
   public wcdetalledeproductosanyadidas( )
   {
   }

   public wcdetalledeproductosanyadidas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcdetalledeproductosanyadidas.class ));
   }

   public wcdetalledeproductosanyadidas( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcdetalledeproductosanyadidas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcdetalledeproductosanyadidas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Historico Recetas (añadidas)";
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

