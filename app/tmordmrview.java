package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordmrview", "/app.tmordmrview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordmrview extends GXWebObjectStub
{
   public tmordmrview( )
   {
   }

   public tmordmrview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordmrview.class ));
   }

   public tmordmrview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordmrview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordmrview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMOrd MRView";
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

