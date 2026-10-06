package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tobsfas", "/app.tobsfas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tobsfas extends GXWebObjectStub
{
   public tobsfas( )
   {
   }

   public tobsfas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tobsfas.class ));
   }

   public tobsfas( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tobsfas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tobsfas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Obser de Fase";
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

