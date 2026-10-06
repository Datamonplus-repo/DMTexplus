package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwreopiesdt", "/app.webwreopiesdt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwreopiesdt extends GXWebObjectStub
{
   public webwreopiesdt( )
   {
   }

   public webwreopiesdt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwreopiesdt.class ));
   }

   public webwreopiesdt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwreopiesdt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwreopiesdt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Piezas a Reoperar (SDT)";
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

