package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rem0002", "/app.rem0002"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rem0002 extends GXWebObjectStub
{
   public rem0002( )
   {
   }

   public rem0002( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rem0002.class ));
   }

   public rem0002( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rem0002_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rem0002_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Almacen Totales";
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

