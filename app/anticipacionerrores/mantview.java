package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.anticipacionerrores.mantview", "/app.anticipacionerrores.mantview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mantview extends GXWebObjectStub
{
   public mantview( )
   {
   }

   public mantview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mantview.class ));
   }

   public mantview( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mantview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mantview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MAnt View";
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

