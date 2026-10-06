package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.simulacionformula_1", "/app.formulaciontinte.simulacionformula_1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class simulacionformula_1 extends GXWebObjectStub
{
   public simulacionformula_1( )
   {
   }

   public simulacionformula_1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( simulacionformula_1.class ));
   }

   public simulacionformula_1( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new simulacionformula_1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new simulacionformula_1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Simulacion Formula";
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

