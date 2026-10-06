package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevpie1view", "/app.tdevpie1view"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevpie1view extends GXWebObjectStub
{
   public tdevpie1view( )
   {
   }

   public tdevpie1view( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevpie1view.class ));
   }

   public tdevpie1view( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevpie1view_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevpie1view_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDev Pie1 View";
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

