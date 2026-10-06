package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranwizzard", "/app.albaranwizzard"})
@jakarta.servlet.annotation.MultipartConfig
public final  class albaranwizzard extends GXWebObjectStub
{
   public albaranwizzard( )
   {
   }

   public albaranwizzard( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( albaranwizzard.class ));
   }

   public albaranwizzard( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new albaranwizzard_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new albaranwizzard_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Albaran Wizzard";
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

