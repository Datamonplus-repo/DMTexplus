package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn07view", "/app.ttrn07view"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn07view extends GXWebObjectStub
{
   public ttrn07view( )
   {
   }

   public ttrn07view( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn07view.class ));
   }

   public ttrn07view( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn07view_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn07view_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTrn07 View";
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

