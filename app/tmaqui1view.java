package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqui1view", "/app.tmaqui1view"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqui1view extends GXWebObjectStub
{
   public tmaqui1view( )
   {
   }

   public tmaqui1view( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqui1view.class ));
   }

   public tmaqui1view( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqui1view_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqui1view_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMAQUI1 View";
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

