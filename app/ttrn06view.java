package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn06view", "/app.ttrn06view"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn06view extends GXWebObjectStub
{
   public ttrn06view( )
   {
   }

   public ttrn06view( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn06view.class ));
   }

   public ttrn06view( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn06view_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn06view_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTrn06 View";
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

