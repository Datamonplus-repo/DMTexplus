package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdye002", "/app.tdye002"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdye002 extends GXWebObjectStub
{
   public tdye002( )
   {
   }

   public tdye002( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdye002.class ));
   }

   public tdye002( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdye002_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdye002_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DYELOT_RECIPE";
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

