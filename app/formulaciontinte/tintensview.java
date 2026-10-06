package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tintensview", "/app.formulaciontinte.tintensview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tintensview extends GXWebObjectStub
{
   public tintensview( )
   {
   }

   public tintensview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tintensview.class ));
   }

   public tintensview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tintensview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tintensview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TINTENSView";
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

