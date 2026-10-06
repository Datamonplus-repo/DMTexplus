package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.consumomanualww", "/app.stocksquimicos.consumomanualww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consumomanualww extends GXWebObjectStub
{
   public consumomanualww( )
   {
   }

   public consumomanualww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consumomanualww.class ));
   }

   public consumomanualww( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consumomanualww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consumomanualww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Consumo Manual";
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

