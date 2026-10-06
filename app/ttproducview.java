package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttproducview", "/app.ttproducview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttproducview extends GXWebObjectStub
{
   public ttproducview( )
   {
   }

   public ttproducview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttproducview.class ));
   }

   public ttproducview( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttproducview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttproducview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTproduc View";
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

