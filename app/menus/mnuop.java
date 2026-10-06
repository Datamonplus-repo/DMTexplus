package app.menus ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.menus.mnuop", "/app.menus.mnuop"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mnuop extends GXWebObjectStub
{
   public mnuop( )
   {
   }

   public mnuop( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mnuop.class ));
   }

   public mnuop( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mnuop_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mnuop_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Opciones del Menu";
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

