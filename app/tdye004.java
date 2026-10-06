package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdye004", "/app.tdye004"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdye004 extends GXWebObjectStub
{
   public tdye004( )
   {
   }

   public tdye004( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdye004.class ));
   }

   public tdye004( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdye004_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdye004_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RECIPES";
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

