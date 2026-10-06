package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttparos", "/app.ttparos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttparos extends GXWebObjectStub
{
   public ttparos( )
   {
   }

   public ttparos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttparos.class ));
   }

   public ttparos( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttparos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttparos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FICHERO PAROS";
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

