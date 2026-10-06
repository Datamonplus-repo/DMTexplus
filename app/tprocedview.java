package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprocedview", "/app.tprocedview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprocedview extends GXWebObjectStub
{
   public tprocedview( )
   {
   }

   public tprocedview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprocedview.class ));
   }

   public tprocedview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprocedview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprocedview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPROCEDView";
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

