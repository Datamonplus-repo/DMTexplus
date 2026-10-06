package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfortxt", "/app.tfortxt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfortxt extends GXWebObjectStub
{
   public tfortxt( )
   {
   }

   public tfortxt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfortxt.class ));
   }

   public tfortxt( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfortxt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfortxt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "COMENTARIOS FORMULA";
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

