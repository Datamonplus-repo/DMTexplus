package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdetgeneral", "/app.talbdetgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdetgeneral extends GXWebObjectStub
{
   public talbdetgeneral( )
   {
   }

   public talbdetgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdetgeneral.class ));
   }

   public talbdetgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdetgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdetgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALBDETGeneral";
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

