package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tturnosgeneral", "/app.tturnosgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tturnosgeneral extends GXWebObjectStub
{
   public tturnosgeneral( )
   {
   }

   public tturnosgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tturnosgeneral.class ));
   }

   public tturnosgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tturnosgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tturnosgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTURNOSGeneral";
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

