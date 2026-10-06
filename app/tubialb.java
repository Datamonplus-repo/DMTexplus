package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tubialb", "/app.tubialb"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tubialb extends GXWebObjectStub
{
   public tubialb( )
   {
   }

   public tubialb( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tubialb.class ));
   }

   public tubialb( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tubialb_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tubialb_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "UBICACIONES EN ENTRADA EMPESAS";
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

