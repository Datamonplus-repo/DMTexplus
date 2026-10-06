package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.productoalternativo_1", "/app.formulaciontinte.productoalternativo_1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class productoalternativo_1 extends GXWebObjectStub
{
   public productoalternativo_1( )
   {
   }

   public productoalternativo_1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( productoalternativo_1.class ));
   }

   public productoalternativo_1( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new productoalternativo_1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new productoalternativo_1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Producto Alternativo (insert)";
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

