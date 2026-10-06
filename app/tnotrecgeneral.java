package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnotrecgeneral", "/app.tnotrecgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnotrecgeneral extends GXWebObjectStub
{
   public tnotrecgeneral( )
   {
   }

   public tnotrecgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnotrecgeneral.class ));
   }

   public tnotrecgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnotrecgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnotrecgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TNOTRECGeneral";
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

