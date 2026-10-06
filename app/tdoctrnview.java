package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdoctrnview", "/app.tdoctrnview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdoctrnview extends GXWebObjectStub
{
   public tdoctrnview( )
   {
   }

   public tdoctrnview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdoctrnview.class ));
   }

   public tdoctrnview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdoctrnview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdoctrnview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDOCTRNView";
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

