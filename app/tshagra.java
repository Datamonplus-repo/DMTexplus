package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tshagra", "/app.tshagra"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tshagra extends GXWebObjectStub
{
   public tshagra( )
   {
   }

   public tshagra( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tshagra.class ));
   }

   public tshagra( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tshagra_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tshagra_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Grabado de Shablones";
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

