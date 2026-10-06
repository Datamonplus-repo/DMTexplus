package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdet1view", "/app.talbdet1view"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdet1view extends GXWebObjectStub
{
   public talbdet1view( )
   {
   }

   public talbdet1view( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdet1view.class ));
   }

   public talbdet1view( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdet1view_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdet1view_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALBDET1 View";
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

