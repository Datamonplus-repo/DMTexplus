package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprepedview", "/app.tprepedview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprepedview extends GXWebObjectStub
{
   public tprepedview( )
   {
   }

   public tprepedview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprepedview.class ));
   }

   public tprepedview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprepedview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprepedview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPREPEDView";
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

