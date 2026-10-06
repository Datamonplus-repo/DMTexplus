package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.tprequiww", "/app.gestionlaboratorio.tprequiww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprequiww extends GXWebObjectStub
{
   public tprequiww( )
   {
   }

   public tprequiww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprequiww.class ));
   }

   public tprequiww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprequiww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprequiww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos Preparacion";
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

