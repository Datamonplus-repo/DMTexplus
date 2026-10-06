package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wccomprasmesqeryviewer", "/app.wccomprasmesqeryviewer"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wccomprasmesqeryviewer extends GXWebObjectStub
{
   public wccomprasmesqeryviewer( )
   {
   }

   public wccomprasmesqeryviewer( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wccomprasmesqeryviewer.class ));
   }

   public wccomprasmesqeryviewer( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wccomprasmesqeryviewer_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wccomprasmesqeryviewer_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCCompras Mes Qeryviewer";
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

