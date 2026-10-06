package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.terfrac", "/app.terfrac"})
@jakarta.servlet.annotation.MultipartConfig
public final  class terfrac extends GXWebObjectStub
{
   public terfrac( )
   {
   }

   public terfrac( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( terfrac.class ));
   }

   public terfrac( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new terfrac_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new terfrac_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLA FRACCIONADO ER";
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

