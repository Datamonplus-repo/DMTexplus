package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfasproview", "/app.tfasproview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfasproview extends GXWebObjectStub
{
   public tfasproview( )
   {
   }

   public tfasproview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfasproview.class ));
   }

   public tfasproview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfasproview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfasproview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFASPROView";
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

