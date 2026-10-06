package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.cerrarordendecompra", "/app.cerrarordendecompra"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cerrarordendecompra extends GXWebObjectStub
{
   public cerrarordendecompra( )
   {
   }

   public cerrarordendecompra( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cerrarordendecompra.class ));
   }

   public cerrarordendecompra( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cerrarordendecompra_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cerrarordendecompra_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cerrar Orden de Compra";
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

