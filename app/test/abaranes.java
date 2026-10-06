package app.test ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.test.abaranes", "/app.test.abaranes"})
@jakarta.servlet.annotation.MultipartConfig
public final  class abaranes extends GXWebObjectStub
{
   public abaranes( )
   {
   }

   public abaranes( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( abaranes.class ));
   }

   public abaranes( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new abaranes_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new abaranes_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Abaranes";
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

