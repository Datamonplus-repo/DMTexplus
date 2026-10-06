package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpillin", "/app.tpillin"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpillin extends GXWebObjectStub
{
   public tpillin( )
   {
   }

   public tpillin( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpillin.class ));
   }

   public tpillin( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpillin_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpillin_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEST DE PILLING";
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

