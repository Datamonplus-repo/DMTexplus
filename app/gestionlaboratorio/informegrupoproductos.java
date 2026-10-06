package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.informegrupoproductos", "/app.gestionlaboratorio.informegrupoproductos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informegrupoproductos extends GXWebObjectStub
{
   public informegrupoproductos( )
   {
   }

   public informegrupoproductos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informegrupoproductos.class ));
   }

   public informegrupoproductos( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informegrupoproductos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informegrupoproductos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Grupo Productos";
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

