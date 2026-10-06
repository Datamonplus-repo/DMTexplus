package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttsecciview", "/app.ttsecciview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttsecciview extends GXWebObjectStub
{
   public ttsecciview( )
   {
   }

   public ttsecciview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttsecciview.class ));
   }

   public ttsecciview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttsecciview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttsecciview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTSECCIView";
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

