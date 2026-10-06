package app.datamon ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.datamon.apget_sessionvalue", "/app.datamon.apget_sessionvalue"})
@jakarta.servlet.annotation.MultipartConfig
public final  class apget_sessionvalue extends GXWebObjectStub
{
   public apget_sessionvalue( )
   {
   }

   public apget_sessionvalue( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( apget_sessionvalue.class ));
   }

   public apget_sessionvalue( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new apget_sessionvalue_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new apget_sessionvalue_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "pget_Session Value";
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

