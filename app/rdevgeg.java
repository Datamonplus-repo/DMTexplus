package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rdevgeg", "/app.rdevgeg"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rdevgeg extends GXWebObjectStub
{
   public rdevgeg( )
   {
   }

   public rdevgeg( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rdevgeg.class ));
   }

   public rdevgeg( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rdevgeg_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rdevgeg_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DEVOLUCION GENERO GRAFICO PZA";
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

