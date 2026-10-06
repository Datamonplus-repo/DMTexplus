package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfasprowwexportreport", "/app.tfasprowwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfasprowwexportreport extends GXWebObjectStub
{
   public tfasprowwexportreport( )
   {
   }

   public tfasprowwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfasprowwexportreport.class ));
   }

   public tfasprowwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfasprowwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfasprowwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFASPROWWExport Report";
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

