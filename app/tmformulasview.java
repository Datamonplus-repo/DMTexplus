package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmformulasview", "/app.tmformulasview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmformulasview extends GXWebObjectStub
{
   public tmformulasview( )
   {
   }

   public tmformulasview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmformulasview.class ));
   }

   public tmformulasview( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmformulasview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmformulasview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMFormulas View";
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

