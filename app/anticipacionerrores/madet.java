package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.anticipacionerrores.madet", "/app.anticipacionerrores.madet"})
@jakarta.servlet.annotation.MultipartConfig
public final  class madet extends GXWebObjectStub
{
   public madet( )
   {
   }

   public madet( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( madet.class ));
   }

   public madet( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new madet_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new madet_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MADet";
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

