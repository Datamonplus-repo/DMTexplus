package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttermingeneral", "/app.ttermingeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttermingeneral extends GXWebObjectStub
{
   public ttermingeneral( )
   {
   }

   public ttermingeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttermingeneral.class ));
   }

   public ttermingeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttermingeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttermingeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTERMINGeneral";
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

