package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn12general", "/app.ttrn12general"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn12general extends GXWebObjectStub
{
   public ttrn12general( )
   {
   }

   public ttrn12general( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn12general.class ));
   }

   public ttrn12general( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn12general_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn12general_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTrn12 General";
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

