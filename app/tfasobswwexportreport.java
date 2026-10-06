package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfasobswwexportreport", "/app.tfasobswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfasobswwexportreport extends GXWebObjectStub
{
   public tfasobswwexportreport( )
   {
   }

   public tfasobswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfasobswwexportreport.class ));
   }

   public tfasobswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfasobswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfasobswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFASOBSWWExport Report";
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

