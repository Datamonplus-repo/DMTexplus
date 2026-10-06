package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.trevendgeneral", "/app.ficherosbasicos.trevendgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trevendgeneral extends GXWebObjectStub
{
   public trevendgeneral( )
   {
   }

   public trevendgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trevendgeneral.class ));
   }

   public trevendgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trevendgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trevendgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TREVENDGeneral";
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

