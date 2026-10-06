package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipcauview", "/app.ficherosbasicos.ttipcauview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipcauview extends GXWebObjectStub
{
   public ttipcauview( )
   {
   }

   public ttipcauview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipcauview.class ));
   }

   public ttipcauview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipcauview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipcauview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPCAUView";
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

