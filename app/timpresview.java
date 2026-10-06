package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.timpresview", "/app.timpresview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class timpresview extends GXWebObjectStub
{
   public timpresview( )
   {
   }

   public timpresview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( timpresview.class ));
   }

   public timpresview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new timpresview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new timpresview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TIMPRESView";
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

