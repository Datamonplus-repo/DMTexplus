package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmqddop", "/app.tmqddop"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmqddop extends GXWebObjectStub
{
   public tmqddop( )
   {
   }

   public tmqddop( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmqddop.class ));
   }

   public tmqddop( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmqddop_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmqddop_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CONTROL IN SECCION";
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

