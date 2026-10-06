package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdye005", "/app.tdye005"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdye005 extends GXWebObjectStub
{
   public tdye005( )
   {
   }

   public tdye005( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdye005.class ));
   }

   public tdye005( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdye005_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdye005_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ProductConsumption";
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

