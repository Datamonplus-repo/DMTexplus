package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.lotedisponible", "/app.stocksquimicos.lotedisponible"})
@jakarta.servlet.annotation.MultipartConfig
public final  class lotedisponible extends GXWebObjectStub
{
   public lotedisponible( )
   {
   }

   public lotedisponible( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( lotedisponible.class ));
   }

   public lotedisponible( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new lotedisponible_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new lotedisponible_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Lotes Productos Quimicos";
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

