package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttable1general", "/app.ttable1general"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttable1general extends GXWebObjectStub
{
   public ttable1general( )
   {
   }

   public ttable1general( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttable1general.class ));
   }

   public ttable1general( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttable1general_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttable1general_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTABLE1 General";
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

