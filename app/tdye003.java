package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdye003", "/app.tdye003"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdye003 extends GXWebObjectStub
{
   public tdye003( )
   {
   }

   public tdye003( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdye003.class ));
   }

   public tdye003( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdye003_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdye003_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DYELOT_PROCEDURE";
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

