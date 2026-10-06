package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnxt003", "/app.tnxt003"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt003 extends GXWebObjectStub
{
   public tnxt003( )
   {
   }

   public tnxt003( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt003.class ));
   }

   public tnxt003( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt003_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt003_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla Resultados Embellishment";
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

