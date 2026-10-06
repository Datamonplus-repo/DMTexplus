package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.male", "/app.ingenieria.male"})
@jakarta.servlet.annotation.MultipartConfig
public final  class male extends GXWebObjectStub
{
   public male( )
   {
   }

   public male( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( male.class ));
   }

   public male( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new male_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new male_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "M Alertas Ingenieria";
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

