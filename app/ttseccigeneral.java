package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttseccigeneral", "/app.ttseccigeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttseccigeneral extends GXWebObjectStub
{
   public ttseccigeneral( )
   {
   }

   public ttseccigeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttseccigeneral.class ));
   }

   public ttseccigeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttseccigeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttseccigeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTSECCIGeneral";
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

