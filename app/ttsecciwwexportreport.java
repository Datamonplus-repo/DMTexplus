package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttsecciwwexportreport", "/app.ttsecciwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttsecciwwexportreport extends GXWebObjectStub
{
   public ttsecciwwexportreport( )
   {
   }

   public ttsecciwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttsecciwwexportreport.class ));
   }

   public ttsecciwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttsecciwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttsecciwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTSECCIWWExport Report";
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

