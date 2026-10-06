package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarter", "/app.tarter"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarter extends GXWebObjectStub
{
   public tarter( )
   {
   }

   public tarter( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarter.class ));
   }

   public tarter( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarter_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarter_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLA ART";
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

