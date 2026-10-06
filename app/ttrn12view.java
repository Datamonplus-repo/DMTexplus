package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn12view", "/app.ttrn12view"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn12view extends GXWebObjectStub
{
   public ttrn12view( )
   {
   }

   public ttrn12view( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn12view.class ));
   }

   public ttrn12view( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn12view_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn12view_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTrn12 View";
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

