package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.consultadesdelconti", "/app.formulaciontinte.consultadesdelconti"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultadesdelconti extends GXWebObjectStub
{
   public consultadesdelconti( )
   {
   }

   public consultadesdelconti( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultadesdelconti.class ));
   }

   public consultadesdelconti( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultadesdelconti_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultadesdelconti_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " LCONTI";
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

