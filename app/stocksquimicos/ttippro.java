package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttippro", "/app.stocksquimicos.ttippro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttippro extends GXWebObjectStub
{
   public ttippro( )
   {
   }

   public ttippro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttippro.class ));
   }

   public ttippro( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttippro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttippro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Subfamilia Producto Quimico";
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

