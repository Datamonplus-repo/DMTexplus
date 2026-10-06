package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.tmanufaview", "/app.trabajosexternos.tmanufaview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmanufaview extends GXWebObjectStub
{
   public tmanufaview( )
   {
   }

   public tmanufaview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmanufaview.class ));
   }

   public tmanufaview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmanufaview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmanufaview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMANUFAView";
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

