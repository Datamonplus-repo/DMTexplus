package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttsecciwwexportcsv", "/app.ttsecciwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttsecciwwexportcsv extends GXWebObjectStub
{
   public ttsecciwwexportcsv( )
   {
   }

   public ttsecciwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttsecciwwexportcsv.class ));
   }

   public ttsecciwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttsecciwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttsecciwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTSECCIWWExport CSV";
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

