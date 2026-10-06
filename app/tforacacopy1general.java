package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tforacacopy1general", "/app.tforacacopy1general"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforacacopy1general extends GXWebObjectStub
{
   public tforacacopy1general( )
   {
   }

   public tforacacopy1general( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforacacopy1general.class ));
   }

   public tforacacopy1general( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforacacopy1general_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforacacopy1general_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFORACACopy1 General";
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

