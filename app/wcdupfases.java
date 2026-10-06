package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcdupfases", "/app.wcdupfases"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcdupfases extends GXWebObjectStub
{
   public wcdupfases( )
   {
   }

   public wcdupfases( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcdupfases.class ));
   }

   public wcdupfases( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcdupfases_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcdupfases_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla MAQFAS";
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

