package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.anticipacionerrores.mantww", "/app.anticipacionerrores.mantww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantww extends GXWebObjectStub
{
   public mantww( )
   {
   }

   public mantww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantww.class ));
   }

   public mantww( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " MAnt";
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

