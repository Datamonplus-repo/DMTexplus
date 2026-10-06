package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.produc", "/app.stocksquimicos.produc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class produc extends GXWebObjectStub
{
   public produc( )
   {
   }

   public produc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( produc.class ));
   }

   public produc( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new produc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new produc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Productos Quimicos";
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

