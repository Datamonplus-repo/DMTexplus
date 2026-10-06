package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevpie2view", "/app.tdevpie2view"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevpie2view extends GXWebObjectStub
{
   public tdevpie2view( )
   {
   }

   public tdevpie2view( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevpie2view.class ));
   }

   public tdevpie2view( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevpie2view_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevpie2view_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDev Pie2 View";
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

