package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thdstop", "/app.thdstop"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thdstop extends GXWebObjectStub
{
   public thdstop( )
   {
   }

   public thdstop( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thdstop.class ));
   }

   public thdstop( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thdstop_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thdstop_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SUSPENSION HDR";
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

