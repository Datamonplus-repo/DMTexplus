package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqui1general", "/app.tmaqui1general"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqui1general extends GXWebObjectStub
{
   public tmaqui1general( )
   {
   }

   public tmaqui1general( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqui1general.class ));
   }

   public tmaqui1general( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqui1general_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqui1general_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMAQUI1 General";
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

