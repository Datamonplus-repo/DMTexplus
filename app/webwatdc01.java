package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwatdc01", "/app.webwatdc01"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwatdc01 extends GXWebObjectStub
{
   public webwatdc01( )
   {
   }

   public webwatdc01( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwatdc01.class ));
   }

   public webwatdc01( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwatdc01_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwatdc01_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENTRADA MANUAL DEL CODIGO AT";
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

