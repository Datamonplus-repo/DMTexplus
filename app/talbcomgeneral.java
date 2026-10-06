package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbcomgeneral", "/app.talbcomgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbcomgeneral extends GXWebObjectStub
{
   public talbcomgeneral( )
   {
   }

   public talbcomgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbcomgeneral.class ));
   }

   public talbcomgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbcomgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbcomgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALBCOMGeneral";
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

