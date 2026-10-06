package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdforma", "/app.tdforma"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdforma extends GXWebObjectStub
{
   public tdforma( )
   {
   }

   public tdforma( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdforma.class ));
   }

   public tdforma( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdforma_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdforma_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "COLORANTE Y PASO TABLA ALCALIS";
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

