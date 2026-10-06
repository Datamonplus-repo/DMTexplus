package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wccostesproductosadiciones", "/app.wccostesproductosadiciones"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wccostesproductosadiciones extends GXWebObjectStub
{
   public wccostesproductosadiciones( )
   {
   }

   public wccostesproductosadiciones( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wccostesproductosadiciones.class ));
   }

   public wccostesproductosadiciones( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wccostesproductosadiciones_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wccostesproductosadiciones_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Historico de Recetas (Añadidas)";
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

