package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttr0400view", "/app.ficherosbasicos.ttr0400view"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttr0400view extends GXWebObjectStub
{
   public ttr0400view( )
   {
   }

   public ttr0400view( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttr0400view.class ));
   }

   public ttr0400view( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttr0400view_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttr0400view_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTR0400 View";
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

