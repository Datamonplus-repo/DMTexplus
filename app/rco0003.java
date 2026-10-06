package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rco0003", "/app.rco0003"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rco0003 extends GXWebObjectStub
{
   public rco0003( )
   {
   }

   public rco0003( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rco0003.class ));
   }

   public rco0003( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rco0003_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rco0003_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Compres Mes y Acumulados";
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

