package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.generacionaccesorios", "/app.pedidos.generacionaccesorios"})
@jakarta.servlet.annotation.MultipartConfig
public final  class generacionaccesorios extends GXWebObjectStub
{
   public generacionaccesorios( )
   {
   }

   public generacionaccesorios( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( generacionaccesorios.class ));
   }

   public generacionaccesorios( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new generacionaccesorios_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new generacionaccesorios_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Generacion Accesorios ";
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

