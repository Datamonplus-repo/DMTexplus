package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tproced", "/app.tproced"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tproced extends GXWebObjectStub
{
   public tproced( )
   {
   }

   public tproced( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tproced.class ));
   }

   public tproced( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tproced_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tproced_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PROCEDENCIAS";
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

