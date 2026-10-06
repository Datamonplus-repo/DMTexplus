package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ppdfinvproductos", "/app.ppdfinvproductos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ppdfinvproductos extends GXWebObjectStub
{
   public ppdfinvproductos( )
   {
   }

   public ppdfinvproductos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ppdfinvproductos.class ));
   }

   public ppdfinvproductos( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ppdfinvproductos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ppdfinvproductos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Inventario Productos";
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

