package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn07general", "/app.ttrn07general"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn07general extends GXWebObjectStub
{
   public ttrn07general( )
   {
   }

   public ttrn07general( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn07general.class ));
   }

   public ttrn07general( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn07general_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn07general_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTrn07 General";
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

