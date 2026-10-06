package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tintfacview", "/app.formulaciontinte.tintfacview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tintfacview extends GXWebObjectStub
{
   public tintfacview( )
   {
   }

   public tintfacview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tintfacview.class ));
   }

   public tintfacview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tintfacview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tintfacview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TINTFACView";
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

