package app.ponteway ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ponteway.ogguiaimportview", "/app.ponteway.ogguiaimportview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ogguiaimportview extends GXWebObjectStub
{
   public ogguiaimportview( )
   {
   }

   public ogguiaimportview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ogguiaimportview.class ));
   }

   public ogguiaimportview( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ogguiaimportview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ogguiaimportview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Detalles Importacion PontWay";
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

